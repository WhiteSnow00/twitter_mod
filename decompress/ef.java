import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ef implements joa
{
    public final ff a;
    public final mwj b;
    public boolean c;
    
    static {
        final cc3 m0 = cc3.M0;
    }
    
    public ef() {
        this.a = new ff((String)null);
        this.b = new mwj(16384);
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        final int b = koa.b(this.b.a, 0, 16384);
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
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        final mwj mwj = new mwj(10);
        int n = 0;
        while (true) {
            ((gh8)koa).c(mwj.a, 0, 10, false);
            mwj.D(0);
            if (mwj.v() != 4801587) {
                break;
            }
            mwj.E(3);
            final int s = mwj.s();
            n += s + 10;
            ((gh8)koa).l(s, false);
        }
        final gh8 gh8 = (gh8)koa;
        gh8.f = 0;
        gh8.l(n, false);
        int n2 = n;
        while (true) {
            int n3 = 0;
            while (true) {
                final byte[] a = mwj.a;
                final int n4 = 7;
                gh8.c(a, 0, 7, false);
                mwj.D(0);
                final int y = mwj.y();
                if (y != 44096 && y != 44097) {
                    gh8.f = 0;
                    if (++n2 - n >= 8192) {
                        return false;
                    }
                    gh8.l(n2, false);
                    break;
                }
                else {
                    final int n5 = n3 + 1;
                    if (n5 >= 4) {
                        return true;
                    }
                    final byte[] a2 = mwj.a;
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
                    gh8.l(n6 - 7, false);
                    n3 = n5;
                }
            }
        }
    }
    
    @Override
    public final void c(final long n, final long n2) {
        this.c = false;
        this.a.c();
    }
    
    @Override
    public final void i(final ooa ooa) {
        this.a.d(ooa, new bau$d(0, 1));
        ooa.q();
        ooa.n((ebp)new ebp.b(-9223372036854775807L));
    }
    
    @Override
    public final void release() {
    }
}
