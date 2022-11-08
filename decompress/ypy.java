import java.io.InputStream;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypy extends y5s
{
    public final y5s C0;
    public final long D0;
    public final long E0;
    
    public ypy(final y5s c0, long k, final long n) {
        this.C0 = c0;
        k = this.k(k);
        this.D0 = k;
        this.E0 = this.k(k + n);
    }
    
    public final void close() throws IOException {
    }
    
    public final long i() {
        return this.E0 - this.D0;
    }
    
    public final InputStream j(long k, long i) throws IOException {
        k = this.k(this.D0);
        i = this.k(i + k);
        return this.C0.j(k, i - k);
    }
    
    public final long k(final long n) {
        if (n < 0L) {
            return 0L;
        }
        long i = n;
        if (n > this.C0.i()) {
            i = this.C0.i();
        }
        return i;
    }
}
