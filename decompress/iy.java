import com.twitter.media.ui.image.AspectRatioFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iy extends ste implements qsb<oy, fzv>
{
    public final fy D0;
    
    public iy(final fy d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oy oy = (oy)o;
        czd.f((Object)oy, "$this$distinct");
        ((AspectRatioFrameLayout)this.D0.G0).setAspectRatio(oy.f);
        this.D0.G0.C(oy.e);
        return fzv.a;
    }
}
