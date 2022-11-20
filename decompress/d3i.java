import com.google.android.material.tabs.TabLayout$c;
import com.google.android.material.tabs.c$b;
import com.google.android.material.tabs.c;
import androidx.viewpager2.widget.ViewPager2$g;
import androidx.viewpager2.widget.b;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d3i extends ste implements qsb<e3i, fzv>
{
    public final b3i D0;
    
    public d3i(final b3i d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final e3i e3i = (e3i)o;
        czd.f((Object)e3i, "$this$distinctType");
        if (e3i instanceof e3i$c) {
            final b3i d0 = this.D0;
            d0.N0.setVisibility(8);
            d0.L0.setVisibility(0);
            d0.M0.setVisibility(8);
            d0.K0.setAdapter((RecyclerView$e)d0.D0);
            d0.K0.setPageTransformer((ViewPager2$g)new b(d0.G0.getResources().getDimensionPixelSize(2131166805)));
            new c(d0.J0, d0.K0, (c$b)new q2((Object)d0, 7)).a();
            d0.J0.a((TabLayout$c)new c3i());
        }
        else if (e3i instanceof e3i$a) {
            final b3i d2 = this.D0;
            d2.L0.setVisibility(8);
            d2.N0.setVisibility(8);
            d2.M0.setVisibility(0);
        }
        else if (e3i instanceof e3i$b) {
            this.D0.N0.setVisibility(0);
        }
        return fzv.a;
    }
}
