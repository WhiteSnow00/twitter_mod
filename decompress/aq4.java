import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.app.collabs.search.CollaboratorsSearchViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aq4 extends pue implements stb<cq4, vzv>
{
    public final String F0;
    public final CollaboratorsSearchViewModel G0;
    
    public aq4(final String f0, final CollaboratorsSearchViewModel g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cq4 cq4 = (cq4)o;
        e0e.f((Object)cq4, "state");
        if (!e0e.a((Object)this.F0, (Object)cq4.a)) {
            final CollaboratorsSearchViewModel g0 = this.G0;
            final vp4 vp4 = new vp4(this.F0);
            final ape[] t0 = CollaboratorsSearchViewModel.T0;
            ((MviViewModel)g0).Q((stb)vp4);
            if (slr.k1((CharSequence)this.F0) ^ true) {
                final CollaboratorsSearchViewModel g2 = this.G0;
                ((MviViewModel)g2).B((t5j)g2.Q0.u(this.F0), (stb)new yp4(this.G0, this.F0));
            }
            else {
                ((MviViewModel)this.G0).Q((stb)zp4.F0);
            }
        }
        return vzv.a;
    }
}
