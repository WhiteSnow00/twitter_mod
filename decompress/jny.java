import java.io.IOException;
import java.util.Arrays;
import java.io.InputStream;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jny extends FilterInputStream
{
    public final qwy F0;
    public byte[] G0;
    public long H0;
    public boolean I0;
    public boolean J0;
    
    public jny(final InputStream inputStream) {
        super(inputStream);
        this.F0 = new qwy();
        this.G0 = new byte[4096];
        this.I0 = false;
        this.J0 = false;
    }
    
    public final v1z a() throws IOException {
        if (this.H0 > 0L) {
            byte[] g0;
            do {
                g0 = this.G0;
            } while (this.read(g0, 0, g0.length) != -1);
        }
        if (this.I0 || this.J0) {
            return (v1z)new mmy((String)null, -1L, -1, false, false, (byte[])null);
        }
        if (!this.c(30)) {
            this.I0 = true;
            return this.F0.b();
        }
        final v1z b = this.F0.b();
        final mmy mmy = (mmy)b;
        if (mmy.e) {
            this.J0 = true;
            return b;
        }
        if (mmy.b == 4294967295L) {
            throw new vqy("Files bigger than 4GiB are not supported.");
        }
        final int n = this.F0.f - 30;
        final long n2 = n;
        int length = this.G0.length;
        if (n2 > length) {
            int n3;
            do {
                n3 = (length += length);
            } while (n3 < n2);
            this.G0 = Arrays.copyOf(this.G0, n3);
        }
        if (!this.c(n)) {
            this.I0 = true;
            return this.F0.b();
        }
        final v1z b2 = this.F0.b();
        this.H0 = ((mmy)b2).b;
        return b2;
    }
    
    public final int b(final byte[] array, final int n, final int n2) throws IOException {
        return Math.max(0, super.read(array, n, n2));
    }
    
    public final boolean c(final int n) throws IOException {
        final int b = this.b(this.G0, 0, n);
        if (b != n) {
            final int n2 = n - b;
            if (this.b(this.G0, b, n2) != n2) {
                this.F0.a(this.G0, 0, b);
                return false;
            }
        }
        this.F0.a(this.G0, 0, n);
        return true;
    }
    
    @Override
    public final int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int n, int b) throws IOException {
        final long h0 = this.H0;
        if (h0 > 0L && !this.I0) {
            b = this.b(array, n, (int)Math.min(h0, b));
            this.H0 -= b;
            if ((n = b) == 0) {
                this.I0 = true;
                n = 0;
            }
            return n;
        }
        return -1;
    }
}
