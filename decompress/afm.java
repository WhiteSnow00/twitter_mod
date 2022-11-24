// 
// Decompiled by Procyon v0.6.0
// 

public final class afm extends tnm<bfm, btm<kni, zbv>, zem>
{
    public afm() {
        super(null, 1, null);
    }
    
    @Override
    public final osc c(final Object o) {
        final bfm bfm = (bfm)o;
        e0e.f((Object)bfm, "args");
        return (osc)new zem(bfm.a, bfm.b, bfm.c);
    }
    
    @Override
    public final Object d(final osc osc) {
        final zem zem = (zem)osc;
        e0e.f((Object)zem, "request");
        final xsc t = ((osc)zem).T();
        e0e.e((Object)t, "request.result");
        btm btm;
        if (t.b) {
            btm = btm.e((Object)kni.a);
        }
        else {
            zbv zbv;
            if ((zbv = (zbv)t.h) == null) {
                zbv = new zbv(new wbv[] { new wbv(t.c) });
            }
            btm = btm.a((Object)zbv);
        }
        return btm;
    }
}
