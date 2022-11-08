// 
// Decompiled by Procyon v0.6.0
// 

public final class bac extends kmm<lac, pav>
{
    public final y2j V0;
    public lac W0;
    
    public bac(final y2j v0) {
        this.V0 = v0;
        ((cw0)this).f();
    }
    
    public final tsc<lac, pav> b() {
        final f9g c = f9g.c((Class)lac.class);
        final qrc.a a = new qrc.a();
        a.n("/1.1/guest/activate.json", "/");
        final int a2 = w4j.a;
        final yrc b0 = this.b0((CharSequence)a.k().a(qbv.a()), (nyd)null);
        b0.h = xrc$b.F0;
        b0.j = (hsc)c;
        final xrc e = b0.e();
        final String a3 = this.V0.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Bearer ");
        sb.append(a3);
        e.E("Authorization", sb.toString());
        e.d();
        if (e.z()) {
            this.W0 = (lac)((wsc)c).C0;
        }
        return (tsc<lac, pav>)tsc.a(e, (wsc)c);
    }
    
    public final String l() {
        return qbv.a().b;
    }
}
