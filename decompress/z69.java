// 
// Decompiled by Procyon v0.6.0
// 

public final class z69 implements jd1
{
    public final s59 C0;
    public final boolean D0;
    
    public z69(final s59 c0) {
        this.C0 = c0;
        this.D0 = dta.c().b("android_growth_performance_holdback_perf_ignore_autoplay_feature_check", true);
    }
    
    public final boolean a() {
        if (this.D0) {
            return hr4.e((Iterable)((i69)this.C0.b.get()).a(), (otk)y69.d).isEmpty();
        }
        final hlv b = dta.b();
        boolean b2 = true;
        if (!b.b("vod_docking_autoplay_enabled", true)) {
            b2 = (hr4.e((Iterable)((i69)this.C0.b.get()).a(), (otk)vpd.e).isEmpty() && b2);
        }
        return b2;
    }
    
    public final void destroy() {
    }
}
