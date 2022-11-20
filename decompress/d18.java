import android.view.View;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d18 extends ste implements qsb<g18, fzv>
{
    public final x08 D0;
    
    public d18(final x08 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final g18 g18 = (g18)o;
        czd.f((Object)g18, "$this$distinct");
        final ViewPager2 k0 = this.D0.K0;
        final boolean c = g18.c;
        final int n = 0;
        int visibility;
        if (c ^ true) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)k0).setVisibility(visibility);
        final TabLayout l0 = this.D0.L0;
        czd.e((Object)l0, "tabLayout");
        int visibility2 = n;
        if (g18.c ^ true) {
            visibility2 = 8;
        }
        ((View)l0).setVisibility(visibility2);
        x08.a(this.D0, g18);
        return fzv.a;
    }
}
