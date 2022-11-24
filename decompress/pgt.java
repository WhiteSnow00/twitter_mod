import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgt implements txm<gdv, cym>
{
    public final Resources F0;
    public final ajh G0;
    
    public pgt(final Resources f0, final ajh g0) {
        e0e.f((Object)f0, "resources");
        e0e.f((Object)g0, "modelReader");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final awj R(final uxm uxm) {
        final cym cym = (cym)uxm;
        e0e.f((Object)cym, "<this>");
        final ajh g0 = this.G0;
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).t(ttl.c("lists_ev_id"), new Object[] { cym.b });
        final gdv b = (gdv)g0.d((Class)nof.class, (zsl)((z4j)zsl$a).e(), (Class)gdv.class);
        final cym.a a = new cym.a();
        a.a = cym.b;
        a.b = b;
        return new awj(a.e(), (Object)b);
    }
    
    public final String m(final Object o) {
        final gdv gdv = (gdv)o;
        int n;
        if (gdv.G0) {
            n = 2131957259;
        }
        else {
            n = 2131957252;
        }
        final String string = this.F0.getString(n, new Object[] { gdv.P0 });
        e0e.e((Object)string, "resources.getString(id, list.listName)");
        return string;
    }
    
    public final dqv t(final Object o) {
        dqv dqv;
        if (((gdv)o).G0) {
            dqv = dqv.K0;
        }
        else {
            dqv = dqv.L0;
        }
        return dqv;
    }
    
    public final String w(final Object o) {
        final gdv gdv = (gdv)o;
        final Resources f0 = this.F0;
        int n;
        if (gdv.G0) {
            n = 2131957260;
        }
        else {
            n = 2131957253;
        }
        final String string = f0.getString(n, new Object[] { gdv.P0 });
        e0e.e((Object)string, "resources.getString(\n   \u2026  list.listName\n        )");
        return string;
    }
}
