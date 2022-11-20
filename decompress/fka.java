import java.util.Objects;
import com.twitter.android.explore.locations.ExploreLocationsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fka extends ste implements qsb<uja, fzv>
{
    public final ExploreLocationsViewModel D0;
    
    public fka(final ExploreLocationsViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final uja uja = (uja)o;
        final ExploreLocationsViewModel d0 = this.D0;
        czd.e((Object)uja, "newLocation");
        Objects.requireNonNull(d0);
        d0.H0.c(d0.E0.a().firstElement().i((psb)new qo((qsb)new qka(uja, d0), 0)).r((oj)new ii4((Object)d0, 1), (lj6)new sma((qsb)new rka(d0), 3)));
        return fzv.a;
    }
}
