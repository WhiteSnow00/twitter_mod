import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ef implements qoa
{
    public final ff a;
    public final gxj b;
    public boolean c;
    
    static {
        final lpo n0 = lpo.N0;
    }
    
    public ef() {
        this.a = new ff((String)null);
        this.b = new gxj(16384);
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        final int b = roa.b(this.b.a, 0, 16384);
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
                final byte[] a = gxj.a;
                final int n4 = 7;
                vh8.c(a, 0, 7, false);
                gxj.D(0);
                final int y = gxj.y();
                if (y != 44096 && y != 44097) {
                    vh8.f = 0;
                    if (++n2 - n >= 8192) {
                        return false;
                    }
                    vh8.l(n2, false);
                    break;
                }
                else {
                    final int n5 = n3 + 1;
                    if (n5 >= 4) {
                        return true;
                    }
                    final byte[] a2 = gxj.a;
                    int n6;
                    if (a2.length < 7) {
                        n6 = -1;
                    }
                    else {
                        final int n7 = (a2[2] & 0xFF) << 8 | (a2[3] & 0xFF);
                        int n9;
                        int n10;
                        if (n7 == 65535) {
                            final int n8 = (a2[4] & 0xFF) << 16 | (a2[5] & 0xFF) << 8 | (a2[6] & 0xFF);
                            n9 = n4;
                            n10 = n8;
                        }
                        else {
                            final int n11 = 4;
                            n10 = n7;
                            n9 = n11;
                        }
                        int n12 = n9;
                        if (y == 44097) {
                            n12 = n9 + 2;
                        }
                        n6 = n10 + n12;
                    }
                    if (n6 == -1) {
                        return false;
                    }
                    vh8.l(n6 - 7, false);
                    n3 = n5;
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
