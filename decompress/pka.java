import com.twitter.android.explore.locations.ExploreLocationsViewModel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pka extends ste implements qsb<List<? extends uja>, fzv>
{
    public final ExploreLocationsViewModel D0;
    public final String E0;
    
    public pka(final ExploreLocationsViewModel d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        final mv1 g0 = this.D0.G0;
        final String e0 = this.E0;
        czd.e((Object)list, "locations");
        g0.onNext((Object)new ska(e0, list, false, false, false, 28));
        return fzv.a;
    }
}
