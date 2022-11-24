import android.util.Log;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kr2 implements n4h, Closeable
{
    public ByteBuffer F0;
    public final int G0;
    public final long H0;
    
    public kr2(final int g0) {
        this.F0 = ByteBuffer.allocateDirect(g0);
        this.G0 = g0;
        this.H0 = System.identityHashCode(this);
    }
    
    @Override
    public final int C(final int n, final byte[] array, final int n2, int k) {
        synchronized (this) {
            Objects.requireNonNull(array);
            xd.M(!this.isClosed());
            k = iuk.k(n, k, this.G0);
            iuk.s(n, array.length, n2, k, this.G0);
            this.F0.position(n);
            this.F0.get(array, n2, k);
            return k;
        }
    }
    
    @Override
    public final ByteBuffer D() {
        synchronized (this) {
            return this.F0;
        }
    }
    
    @Override
    public final byte O(final int n) {
        synchronized (this) {
            final boolean closed = this.isClosed();
            final boolean b = true;
            xd.M(!closed);
            xd.D(n >= 0);
            xd.D(n < this.G0 && b);
            return this.F0.get(n);
        }
    }
    
    @Override
    public final long U() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }
    
    @Override
    public final long W() {
        return this.H0;
    }
    
    @Override
    public final int Z(final int n, final byte[] array, final int n2, int k) {
        synchronized (this) {
            Objects.requireNonNull(array);
            xd.M(!this.isClosed());
            k = iuk.k(n, k, this.G0);
            iuk.s(n, array.length, n2, k, this.G0);
            this.F0.position(n);
            this.F0.put(array, n2, k);
            return k;
        }
    }
    
    public final void a(final n4h n4h, final int n) {
        if (n4h instanceof kr2) {
            xd.M(this.isClosed() ^ true);
            xd.M(n4h.isClosed() ^ true);
            iuk.s(0, n4h.getSize(), 0, n, this.G0);
            this.F0.position(0);
            n4h.D().position(0);
            final byte[] array = new byte[n];
            this.F0.get(array, 0, n);
            n4h.D().put(array, 0, n);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.F0 = null;
        }
    }
    
    @Override
    public final int getSize() {
        return this.G0;
    }
    
    @Override
    public final void i0(final n4h n4h, final int n) {
        Objects.requireNonNull(n4h);
        if (n4h.W() == this.H0) {
            final StringBuilder f = ehk.f("Copying from BufferMemoryChunk ");
            f.append(Long.toHexString(this.H0));
            f.append(" to BufferMemoryChunk ");
            f.append(Long.toHexString(n4h.W()));
            f.append(" which are the same ");
            Log.w("BufferMemoryChunk", f.toString());
            xd.D(Boolean.FALSE);
        }
        if (n4h.W() < this.H0) {
            synchronized (n4h) {
                synchronized (this) {
                    this.a(n4h, n);
                    return;
                }
            }
        }
        synchronized (this) {
            synchronized (n4h) {
                this.a(n4h, n);
            }
        }
    }
    
    @Override
    public final boolean isClosed() {
        synchronized (this) {
            return this.F0 == null;
        }
    }
}
