import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.cards.view.SpacesCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqq extends pue implements stb<uqq, uqq>
{
    public final z21 F0;
    public final y21 G0;
    public final String H0;
    public final Long I0;
    public final SpacesCardViewModel J0;
    public final em2 K0;
    public final boolean L0;
    public final Long M0;
    public final Long N0;
    public final NarrowcastSpaceType O0;
    
    public aqq(final z21 f0, final y21 g0, final String h0, final Long i0, final SpacesCardViewModel j0, final em2 k0, final boolean l0, final Long m0, final Long n0, final NarrowcastSpaceType o0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "$this$setState");
        return new uqq$c(this.F0.b, this.G0, this.H0, this.I0, this.J0.U0, this.K0, this.L0, this.M0, this.N0, this.O0);
    }
}
