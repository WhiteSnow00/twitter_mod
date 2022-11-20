import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qpp extends ste implements qsb<xpp, fzv>
{
    public final opp D0;
    
    public qpp(final opp d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xpp xpp = (xpp)o;
        czd.f((Object)xpp, "$this$distinct");
        final opp d0 = this.D0;
        if (xpp.c) {
            ((View)d0.I0).setVisibility(0);
        }
        else {
            ((View)d0.I0).setVisibility(8);
        }
        return fzv.a;
    }
}
