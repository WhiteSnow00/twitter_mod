import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.twitter.ui.viewpager.ViewPagerOffscreenPageLimitManager;
import com.google.android.material.tabs.TabLayout$d;
import android.content.res.Resources;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.p;
import com.twitter.ui.view.RtlViewPager;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ko9
{
    public final FrameLayout a;
    public final ViewGroup b;
    public final RtlViewPager c;
    public final p d;
    public final nj8 e;
    public final TabLayout f;
    
    public ko9(final Resources resources, final ViewGroup b, final FrameLayout a, final RtlViewPager c, final TabLayout f, final nj8 nj8, final TabLayout$d tabLayout$d, final ViewPagerOffscreenPageLimitManager viewPagerOffscreenPageLimitManager, final p d) {
        this.b = b;
        this.a = a;
        this.e = nj8;
        this.c = c;
        this.d = d;
        c.setAdapter((cuj)nj8);
        ((ViewPager)c).setPageMargin(resources.getDimensionPixelSize(2131165719));
        ((ViewPager)c).setPageMarginDrawable(2131231191);
        (this.f = f).setupWithViewPager((ViewPager)c);
        f.setTabMode(0);
        f.a((TabLayout.c)tabLayout$d);
        viewPagerOffscreenPageLimitManager.a(f, (ViewPager)c);
    }
    
    public final void a() {
        ((View)this.c).setVisibility(8);
    }
    
    public final void b() {
        ((View)this.a).setVisibility(8);
    }
    
    public final void c() {
        ((View)this.b).setVisibility(8);
    }
}
