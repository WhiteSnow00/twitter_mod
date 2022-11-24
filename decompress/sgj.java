import java.io.IOException;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sgj
{
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final gxj g;
    
    public sgj() {
        this.f = new int[255];
        this.g = new gxj(255);
    }
    
    public final boolean a(final roa roa, final boolean b) throws IOException {
        this.b();
        this.g.A(27);
        final boolean r0 = xd.R0(roa, this.g.a, 27, b);
        int i = 0;
        if (!r0 || this.g.u() != 1332176723L) {
            return false;
        }
        if (this.g.t() != 0) {
            if (b) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        else {
            this.a = this.g.t();
            this.b = this.g.h();
            this.g.j();
            this.g.j();
            this.g.j();
            final int t = this.g.t();
            this.c = t;
            this.d = t + 27;
            this.g.A(t);
            if (!xd.R0(roa, this.g.a, this.c, b)) {
                return false;
            }
            while (i < this.c) {
                this.f[i] = this.g.t();
                this.e += this.f[i];
                ++i;
            }
            return true;
        }
    }
    
    public final void b() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }
    
    public final boolean c(final roa roa, final long n) throws IOException {
        omi.m(roa.getPosition() == roa.h());
        this.g.A(4);
        long n2;
        while (true) {
            n2 = lcmp(n, -1L);
            if ((n2 != 0 && roa.getPosition() + 4L >= n) || !xd.R0(roa, this.g.a, 4, true)) {
                break;
            }
            this.g.D(0);
            if (this.g.u() == 1332176723L) {
                roa.e();
                return true;
            }
            roa.k(1);
        }
        while ((n2 == 0 || roa.getPosition() < n) && roa.o() != -1) {}
        return false;
    }
}
