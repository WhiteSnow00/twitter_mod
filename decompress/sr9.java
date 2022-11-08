// 
// Decompiled by Procyon v0.6.0
// 

public final class sr9 extends omm<tr9, vrm<b52, pav>, rr9>
{
    public sr9() {
        super((psc)null, 1, (hg8)null);
    }
    
    public final ksc c(final Object o) {
        final tr9 tr9 = (tr9)o;
        zzd.f((Object)tr9, "args");
        return (ksc)new rr9(tr9.a, tr9.b, tr9.c);
    }
    
    public final Object d(final ksc ksc) {
        final rr9 rr9 = (rr9)ksc;
        zzd.f((Object)rr9, "request");
        final tsc t = ((ksc)rr9).T();
        zzd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            if (g != null) {
                return vrm.e(g);
            }
        }
        pav pav;
        if ((pav = (pav)t.h) == null) {
            pav = new pav(new mav[] { new mav(t.c) });
        }
        return vrm.a((Object)pav);
    }
}
