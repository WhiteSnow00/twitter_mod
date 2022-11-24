import com.twitter.communities.tab.list.CommunitiesNavigationListViewModel;
import com.twitter.dm.composer.quickshare.ShareViaDMViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqf implements hw1
{
    public final int F0;
    public final hub G0;
    
    public hqf(final hub g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object b(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                final hub g0 = this.G0;
                e0e.f((Object)g0, "$tmp0");
                return g0.invoke(o, o2);
            }
            case 5: {
                final hub g2 = this.G0;
                e0e.f((Object)g2, "$tmp0");
                return g2.invoke(o, o2);
            }
            case 4: {
                final hub g3 = this.G0;
                e0e.f((Object)g3, "$tmp0");
                return g3.invoke(o, o2);
            }
            case 3: {
                final hub g4 = this.G0;
                final ape[] u0 = ShareViaDMViewModel.U0;
                e0e.f((Object)g4, "$tmp0");
                return g4.invoke(o, o2);
            }
            case 2: {
                final hub g5 = this.G0;
                final int r0 = CommunitiesNavigationListViewModel.R0;
                e0e.f((Object)g5, "$tmp0");
                return g5.invoke(o, o2);
            }
            case 1: {
                final hub g6 = this.G0;
                final ix7$g companion = ix7.Companion;
                e0e.f((Object)g6, "$tmp0");
                return g6.invoke(o, o2);
            }
            case 0: {
                final hub g7 = this.G0;
                final p61 p2 = (p61)o;
                e0e.f((Object)g7, "$tmp0");
                return g7.invoke((Object)p2, o2);
            }
        }
    }
}
