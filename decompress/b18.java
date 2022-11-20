import com.google.android.material.tabs.TabLayout$g;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b18 extends ste implements qsb<g18, fzv>
{
    public final x08 D0;
    
    public b18(final x08 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final g18 g18 = (g18)o;
        czd.f((Object)g18, "$this$distinct");
        final TabLayout$g l = this.D0.L0.l(this.D0.F0.P0.indexOf(g18.b));
        if (l != null) {
            l.b();
        }
        return fzv.a;
    }
}
