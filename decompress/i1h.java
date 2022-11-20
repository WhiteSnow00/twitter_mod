import com.twitter.media.ui.fresco.FrescoMediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i1h extends ste implements ftb<dtg, FrescoMediaImageView, fzv>
{
    public final iyu D0;
    public final bo6 E0;
    
    public i1h(final iyu d0, final bo6 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final dtg dtg = (dtg)o;
        final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)o2;
        czd.f((Object)dtg, "mediaEntity");
        czd.f((Object)frescoMediaImageView, "imageView");
        if (wug.v(dtg)) {
            this.D0.A(this.E0);
        }
        else {
            this.D0.a(this.E0, dtg, frescoMediaImageView);
        }
        return fzv.a;
    }
}
