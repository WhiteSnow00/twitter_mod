// 
// Decompiled by Procyon v0.6.0
// 

public final class yr extends omm<zr, vrm<pmi, pav>, xr>
{
    public yr() {
        super((psc)null, 1, (hg8)null);
    }
    
    public final ksc c(final Object o) {
        final zr zr = (zr)o;
        zzd.f((Object)zr, "args");
        return (ksc)new xr(zr.a, zr.b, zr.c);
    }
    
    public final Object d(final ksc ksc) {
        final xr xr = (xr)ksc;
        zzd.f((Object)xr, "request");
        final tsc t = ((ksc)xr).T();
        zzd.e((Object)t, "request.result");
        vrm vrm;
        if (t.b) {
            vrm = vrm.e((Object)pmi.a);
        }
        else {
            pav pav;
            if ((pav = (pav)t.h) == null) {
                pav = new pav(new mav[] { new mav(t.c) });
            }
            vrm = vrm.a((Object)pav);
        }
        return vrm;
    }
}
