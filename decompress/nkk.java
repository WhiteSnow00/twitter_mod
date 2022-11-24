// 
// Decompiled by Procyon v0.6.0
// 

public final class nkk implements oy9
{
    public final vi3 a;
    public final ri3 b;
    public final lk3 c;
    public final gkk d;
    
    public nkk(final vi3 a, final ri3 b, final lk3 c, final gkk d) {
        e0e.f((Object)a, "cardActionHelper");
        e0e.f((Object)b, "cardActionHandler");
        e0e.f((Object)c, "cardLogger");
        e0e.f((Object)d, "playableCloseHandler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        this.d.a();
    }
    
    @Override
    public final void b(final oq2.c c, final mba mba) {
        final oba g0 = oba.G0;
        e0e.f((Object)c, "destination");
        e0e.f((Object)mba, "sourceComponent");
        if (c instanceof oq2$c$a) {
            final oq2$c$a oq2$c$a = (oq2$c$a)c;
            final String b = oq2$c$a.b;
            final String a = c.a();
            final String d = oq2$c$a.d;
            e0e.f((Object)d, "appId");
            this.a.g(b, a, d);
            final int h = this.b.h(d);
            int c2 = 2;
            if (h != 2) {
                c2 = 1;
            }
            final lk3 c3 = this.c;
            final jxv jxv = new jxv(g0, mba, nba.I0, -1);
            final lxv.a a2 = new lxv.a();
            a2.c = c2;
            c3.o(jxv, (lxv)a2.e());
        }
        else if (c instanceof oq2$c$c) {
            this.a.f(c.a(), c.a());
            this.c.o(new jxv(g0, mba, nba.G0, -1), (lxv)new lxv.a().e());
        }
    }
}
