import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import java.util.Map;
import com.twitter.ui.view.RtlViewPager;
import com.google.android.material.tabs.TabLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v4p implements h7f
{
    public final View C0;
    public final TabLayout D0;
    public final RtlViewPager E0;
    public final Map<String, v6p> F0;
    
    public v4p(final Resources resources, final LayoutInflater layoutInflater, final Map<String, v6p> f0, final t4p t4p) {
        final boolean b = false;
        final View inflate = layoutInflater.inflate(2131625623, (ViewGroup)null, false);
        this.C0 = inflate;
        this.F0 = f0;
        final v6p v6p = f0.get(t4p.q);
        final TabLayout d0 = (TabLayout)inflate.findViewById(2131431256);
        this.D0 = d0;
        final RtlViewPager e0 = (RtlViewPager)inflate.findViewById(2131430501);
        this.E0 = e0;
        final ViewGroup viewGroup = (ViewGroup)inflate.findViewById(2131432111);
        ((ViewPager)e0).setPageMargin(resources.getDimensionPixelSize(2131165912));
        ((ViewPager)e0).setPageMarginDrawable(2131231191);
        d0.setupWithViewPager((ViewPager)e0);
        d0.setTabMode(0);
        int n = b ? 1 : 0;
        if (v6p != null) {
            n = (b ? 1 : 0);
            if (v6p.c) {
                n = 1;
            }
        }
        if (n != 0) {
            d0.setTabGravity(1);
        }
    }
    
    public final View getView() {
        return this.C0;
    }
}
