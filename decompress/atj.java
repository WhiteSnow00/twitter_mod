import androidx.viewpager2.widget.ViewPager2$e;
import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atj extends fmd<Integer>
{
    public final ViewPager2 D0;
    
    public atj(final ViewPager2 d0) {
        this.D0 = d0;
    }
    
    public final Object d() {
        return this.D0.getCurrentItem();
    }
    
    public final void e(final ccj<? super Integer> ccj) {
        czd.g((Object)ccj, "observer");
        final atj.atj$a atj$a = new atj.atj$a(this.D0, (ccj)ccj);
        ccj.onSubscribe((t19)atj$a.a);
        this.D0.b((ViewPager2$e)atj$a);
    }
}
