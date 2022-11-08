// 
// Decompiled by Procyon v0.6.0
// 

public final class e3s extends omm
{
    public final /* synthetic */ int D0;
    
    public final ksc c(final Object o) {
        switch (this.D0) {
            default: {
                final qjw qjw = (qjw)o;
                zzd.f((Object)qjw, "args");
                return (ksc)new pjw(qjw.a, qjw.b, qjw.c);
            }
            case 0: {
                final v2s v2s = (v2s)o;
                zzd.f((Object)v2s, "args");
                return (ksc)new d3s(v2s.a, v2s.b);
            }
        }
    }
    
    public final Object d(final ksc ksc) {
        switch (this.D0) {
            default: {
                final pjw pjw = (pjw)ksc;
                zzd.f((Object)pjw, "request");
                final tsc t = ((ksc)pjw).T();
                zzd.e((Object)t, "request.result");
                vrm vrm;
                if (zi8.H(((ksc)pjw).T())) {
                    final Object g = t.g;
                    zzd.c(g);
                    vrm = vrm.e(g);
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
            case 0: {
                final d3s d3s = (d3s)ksc;
                zzd.f((Object)d3s, "request");
                final tsc t2 = ((ksc)d3s).T();
                zzd.e((Object)t2, "request.result");
                vrm vrm2;
                if (zi8.H(((ksc)d3s).T())) {
                    final Object g2 = t2.g;
                    zzd.c(g2);
                    vrm2 = vrm.e(g2);
                }
                else {
                    pav pav2;
                    if ((pav2 = (pav)t2.h) == null) {
                        pav2 = new pav(new mav[] { new mav(t2.c) });
                    }
                    vrm2 = vrm.a((Object)pav2);
                }
                return vrm2;
            }
        }
    }
}
