import java.util.Objects;
import com.twitter.android.explore.locations.ExploreLocationsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eka extends ste implements qsb<String, fzv>
{
    public final ExploreLocationsViewModel D0;
    
    public eka(final ExploreLocationsViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String s = (String)o;
        final ExploreLocationsViewModel d0 = this.D0;
        czd.e((Object)s, "prefix");
        Objects.requireNonNull(d0);
        final w19 h0 = d0.H0;
        final jka d2 = d0.D0;
        final String y = v68.y(d0.F0);
        Objects.requireNonNull(d2);
        czd.f((Object)y, "lang");
        h0.c(((kog)new spg((ppg)d2.a.i(s), (ppg)d2.b.E((qsb)gka.D0).o((qsb)new hka(s)).n((p4s)d2.a).V1((Object)new kka$a(y, s)).l((psb)new tl4((qsb)ika.D0, 15)))).o((lj6)new ebk((qsb)new pka(d0, s), 4)));
        return fzv.a;
    }
}
