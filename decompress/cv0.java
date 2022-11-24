import android.util.Log;
import java.util.Objects;
import android.system.ErrnoException;
import java.nio.ByteBuffer;
import android.os.SharedMemory;
import android.annotation.TargetApi;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(27)
public final class cv0 implements n4h, Closeable
{
    public SharedMemory F0;
    public ByteBuffer G0;
    public final long H0;
    
    public cv0(final int n) {
        xd.D(n > 0);
        try {
            final SharedMemory create = SharedMemory.create("AshmemMemoryChunk", n);
            this.F0 = create;
            this.G0 = create.mapReadWrite();
            this.H0 = System.identityHashCode(this);
        }
        catch (final ErrnoException ex) {
            throw new RuntimeException("Fail to create AshmemMemory", (Throwable)ex);
        }
    }
    
    @Override
    public final int C(final int n, final byte[] array, final int n2, int k) {
        synchronized (this) {
            Objects.requireNonNull(array);
            xd.M(!this.isClosed());
            k = iuk.k(n, k, this.getSize());
            iuk.s(n, array.length, n2, k, this.getSize());
            this.G0.position(n);
            this.G0.get(array, n2, k);
            return k;
        }
    }
    
    @Override
    public final ByteBuffer D() {
        return this.G0;
    }
    
    @Override
    public final byte O(final int n) {
        synchronized (this) {
            final boolean closed = this.isClosed();
            final boolean b = true;
            xd.M(!closed);
            xd.D(n >= 0);
            xd.D(n < this.getSize() && b);
            return this.G0.get(n);
        }
    }
    
    @Override
    public final long U() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
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
            k = iuk.k(n, k, this.getSize());
            iuk.s(n, array.length, n2, k, this.getSize());
            this.G0.position(n);
            this.G0.put(array, n2, k);
            return k;
        }
    }
    
    public final void a(final n4h n4h, final int n) {
        if (n4h instanceof cv0) {
            xd.M(this.isClosed() ^ true);
            xd.M(n4h.isClosed() ^ true);
            iuk.s(0, n4h.getSize(), 0, n, this.getSize());
            this.G0.position(0);
            n4h.D().position(0);
            final byte[] array = new byte[n];
            this.G0.get(array, 0, n);
            n4h.D().put(array, 0, n);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.isClosed()) {
                SharedMemory.unmap(this.G0);
                this.F0.close();
                this.G0 = null;
                this.F0 = null;
            }
        }
    }
    
    @Override
    public final int getSize() {
        xd.M(this.isClosed() ^ true);
        return this.F0.getSize();
    }
    
    @Override
    public final void i0(final n4h n4h, final int n) {
        Objects.requireNonNull(n4h);
        if (n4h.W() == this.H0) {
            final StringBuilder f = ehk.f("Copying from AshmemMemoryChunk ");
            f.append(Long.toHexString(this.H0));
            f.append(" to AshmemMemoryChunk ");
            f.append(Long.toHexString(n4h.W()));
            f.append(" which are the same ");
            Log.w("AshmemMemoryChunk", f.toString());
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
            return this.G0 == null || this.F0 == null;
        }
    }
}
