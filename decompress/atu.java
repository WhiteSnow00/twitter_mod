// 
// Decompiled by Procyon v0.6.0
// 

public final class atu implements ny9<zsu>
{
    public final igt F0;
    public final cra<qgv, gjl, pi> G0;
    public final gra<pi, ri> H0;
    
    public atu(final igt f0, final cra<qgv, gjl, pi> g0, final gra<pi, ri> h0) {
        e0e.f((Object)f0, "toaster");
        e0e.f((Object)g0, "repositoryFactory");
        e0e.f((Object)h0, "settingsFactory");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void a(final zsu zsu) {
        e0e.f((Object)zsu, "effect");
        if (zsu instanceof zsu$b) {
            this.F0.c(2131959484, 1);
        }
        else if (zsu instanceof zsu$a) {
            final cra<qgv, gjl, pi> g0 = this.G0;
            final zsu$a zsu$a = (zsu$a)zsu;
            final Object a = g0.a((Object)zsu$a.a, ((z4j)new gjl$a()).e());
            e0e.e(a, "repositoryFactory.create\u2026ontent.Builder().build())");
            final Object a2 = this.H0.a((Object)a);
            e0e.e(a2, "settingsFactory.create(repository)");
            ((ri)a2).a(ou8.a(zsu$a.b), zsu$a.a, zsu$a.b);
        }
    }
    
    public final /* bridge */ void r(final Object o) {
        this.a((zsu)o);
    }
}
