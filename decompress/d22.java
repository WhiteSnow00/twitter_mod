import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d22 implements txm<qgv, vxm>
{
    public final Resources F0;
    public final ajh G0;
    
    public d22(final Resources f0, final ajh g0) {
        e0e.f((Object)f0, "resources");
        e0e.f((Object)g0, "modelReader");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final awj R(final uxm uxm) {
        final vxm vxm = (vxm)uxm;
        e0e.f((Object)vxm, "<this>");
        final ajh g0 = this.G0;
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).t(ttl.c("user_id"), new Object[] { vxm.b });
        final qgv a = (qgv)g0.d((Class)cmw.class, (zsl)((z4j)zsl$a).e(), (Class)qgv.class);
        final vxm$a vxm$a = new vxm$a();
        vxm$a.b = vxm.b;
        vxm$a.a = a;
        return new awj(((z4j)vxm$a).e(), (Object)a);
    }
    
    public final String m(final Object o) {
        final String string = this.F0.getString(2131957249, new Object[] { ((qgv)o).M0 });
        e0e.e((Object)string, "resources.getString(\n   \u2026      data.username\n    )");
        return string;
    }
    
    public final dqv t(final Object o) {
        final qgv qgv = (qgv)o;
        return dqv.J0;
    }
    
    public final String w(final Object o) {
        return null;
    }
}
