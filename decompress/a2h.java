import com.twitter.media.ui.fresco.FrescoMediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a2h extends pue implements hub<wtg, FrescoMediaImageView, vzv>
{
    public final tyu F0;
    public final hp6 G0;
    
    public a2h(final tyu f0, final hp6 g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final wtg wtg = (wtg)o;
        final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)o2;
        e0e.f((Object)wtg, "mediaEntity");
        e0e.f((Object)frescoMediaImageView, "imageView");
        if (qvg.v(wtg)) {
            this.F0.A(this.G0);
        }
        else {
            this.F0.a(this.G0, wtg, frescoMediaImageView);
        }
        return vzv.a;
    }
}
