import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a3i extends gue implements rtb<b3i, oyv>
{
    public final /* synthetic */ y2i C0;
    
    public a3i(final y2i c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b3i b3i = (b3i)o;
        zzd.f((Object)b3i, "$this$distinctType");
        if (b3i instanceof b3i$c) {
            final y2i c0 = this.C0;
            c0.M0.setVisibility(8);
            c0.K0.setVisibility(0);
            c0.L0.setVisibility(8);
            c0.J0.setAdapter((RecyclerView$e)c0.C0);
            c0.J0.setPageTransformer((ViewPager2.g)new b(c0.F0.getResources().getDimensionPixelSize(2131166805)));
            new c(c0.I0, c0.J0, (c.b)new yga((Object)c0, 23)).a();
            c0.I0.a((TabLayout.c)new z2i());
        }
        else if (b3i instanceof b3i$a) {
            final y2i c2 = this.C0;
            c2.K0.setVisibility(8);
            c2.M0.setVisibility(8);
            c2.L0.setVisibility(0);
        }
        else if (b3i instanceof b3i$b) {
            this.C0.M0.setVisibility(0);
        }
        return oyv.a;
    }
}
