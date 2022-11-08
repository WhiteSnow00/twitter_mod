import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k8v implements j8v
{
    public final xau a;
    
    public k8v(final xau a) {
        zzd.f((Object)a, "twPreferences");
        this.a = a;
    }
    
    public final b5j<Boolean> a() {
        final b5j distinctUntilChanged = this.a.a().filter((ptk)new wj4((rtb)k8v$a.C0, 14)).map((qtb)new adr((rtb)k8v$b.C0, 11)).startWith((Object)this.a.h("subscriptions", (Set)f3a.C0).contains("feature/twitter_blue")).distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "twPreferences.observe()\n\u2026 ).distinctUntilChanged()");
        return (b5j<Boolean>)distinctUntilChanged;
    }
}
