import com.twitter.android.explore.locations.ExploreLocationsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qka extends ste implements qsb<xka, rz5>
{
    public final uja D0;
    public final ExploreLocationsViewModel E0;
    
    public qka(final uja d0, final ExploreLocationsViewModel e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xka xka = (xka)o;
        czd.f((Object)xka, "exploreSettings");
        final xka$a a = xka.a();
        final uja d0 = this.D0;
        a.b = d0.b;
        a.c = d0.a;
        return this.E0.E0.b((xka)((n4j)a).e());
    }
}
