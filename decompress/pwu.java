// 
// Decompiled by Procyon v0.6.0
// 

public final class pwu implements pml<owu>
{
    public final zb7 F0;
    public final pml<owu> G0;
    
    public pwu(final zb7 f0, final pml<owu> g0) {
        e0e.f((Object)f0, "customTabsManager");
        e0e.f((Object)g0, "preconnecterProvider");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final owu a() {
        owu owu;
        if (this.F0.k() && ita.b().b("wcl_cct_timeline_promoted_url_preconnect_enabled", false)) {
            owu = (owu)this.G0.get();
        }
        else {
            owu = null;
        }
        return owu;
    }
    
    public final /* bridge */ Object get() {
        return this.a();
    }
}
