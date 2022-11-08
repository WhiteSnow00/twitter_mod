import com.twitter.android.explore.locations.ExploreLocationsViewModel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ola extends gue implements rtb<List<? extends tka>, oyv>
{
    public final /* synthetic */ ExploreLocationsViewModel C0;
    public final /* synthetic */ String D0;
    
    public ola(final ExploreLocationsViewModel c0, final String d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        final rv1<rla> f0 = this.C0.F0;
        final String d0 = this.D0;
        zzd.e((Object)list, "locations");
        f0.onNext((Object)new rla(d0, list, false, false, false, 28));
        return oyv.a;
    }
}
