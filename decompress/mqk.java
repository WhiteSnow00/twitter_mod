import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqk extends InputStream
{
    public final PooledByteBuffer C0;
    public int D0;
    public int E0;
    
    public mqk(final PooledByteBuffer c0) {
        ri4.j(Boolean.valueOf(c0.isClosed() ^ true));
        this.C0 = c0;
        this.D0 = 0;
        this.E0 = 0;
    }
    
    @Override
    public final int available() {
        return this.C0.size() - this.D0;
    }
    
    @Override
    public final void mark(final int n) {
        this.E0 = this.D0;
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() {
        if (this.available() <= 0) {
            return -1;
        }
        return this.C0.O(this.D0++) & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array) {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, final int n, int min) {
        if (n < 0 || min < 0 || n + min > array.length) {
            final StringBuilder g = w48.g("length=");
            k1b.j(g, array.length, "; regionStart=", n, "; regionLength=");
            g.append(min);
            throw new ArrayIndexOutOfBoundsException(g.toString());
        }
        final int available = this.available();
        if (available <= 0) {
            return -1;
        }
        if (min <= 0) {
            return 0;
        }
        min = Math.min(available, min);
        this.C0.C(this.D0, array, n, min);
        this.D0 += min;
        return min;
    }
    
    @Override
    public final void reset() {
        this.D0 = this.E0;
    }
    
    @Override
    public final long skip(final long n) {
        ri4.j(Boolean.valueOf(n >= 0L));
        final int min = Math.min((int)n, this.available());
        this.D0 += min;
        return min;
    }
}
