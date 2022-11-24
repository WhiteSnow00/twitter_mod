import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bf implements qoa
{
    public final cf a;
    public final gxj b;
    public boolean c;
    
    static {
        final i71 m0 = i71.M0;
    }
    
    public bf() {
        this.a = new cf((String)null);
        this.b = new gxj(2786);
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        final int b = roa.b(this.b.a, 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.b.D(0);
        this.b.C(b);
        if (!this.c) {
            this.a.f(0L, 4);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }
    
    public final boolean b(final roa roa) throws IOException {
        final gxj gxj = new gxj(10);
        int n = 0;
        while (true) {
            ((vh8)roa).c(gxj.a, 0, 10, false);
            gxj.D(0);
            if (gxj.v() != 4801587) {
                break;
            }
            gxj.E(3);
            final int s = gxj.s();
            n += s + 10;
            ((vh8)roa).l(s, false);
        }
        final vh8 vh8 = (vh8)roa;
        vh8.f = 0;
        vh8.l(n, false);
        int n2 = n;
        while (true) {
            int n3 = 0;
            while (true) {
                vh8.c(gxj.a, 0, 6, false);
                gxj.D(0);
                if (gxj.y() != 2935) {
                    vh8.f = 0;
                    if (++n2 - n >= 8192) {
                        return false;
                    }
                    vh8.l(n2, false);
                    break;
                }
                else {
                    final int n4 = n3 + 1;
                    if (n4 >= 4) {
                        return true;
                    }
                    final byte[] a = gxj.a;
                    int a2;
                    if (a.length < 6) {
                        a2 = -1;
                    }
                    else if ((a[5] & 0xF8) >> 3 > 10) {
                        a2 = (((a[2] & 0x7) << 8 | (a[3] & 0xFF)) + 1) * 2;
                    }
                    else {
                        a2 = df.a((a[4] & 0xC0) >> 6, a[4] & 0x3F);
                    }
                    if (a2 == -1) {
                        return false;
                    }
                    vh8.l(a2 - 6, false);
                    n3 = n4;
                }
            }
        }
    }
    
    public final void c(final long n, final long n2) {
        this.c = false;
        this.a.c();
    }
    
    public final void i(final voa voa) {
        this.a.d(voa, new kbu$d(0, 1));
        voa.p();
        voa.l((qcp)new qcp.b(-9223372036854775807L));
    }
    
    public final void release() {
    }
}
