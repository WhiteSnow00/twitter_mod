import com.twitter.media.ui.image.c;
import com.twitter.media.ui.fresco.FrescoMediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdr extends ste implements qsb<ldr, fzv>
{
    public final ocr D0;
    
    public kdr(final ocr d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ldr ldr = (ldr)o;
        czd.f((Object)ldr, "$this$distinct");
        final FrescoMediaImageView y0 = this.D0.Y0;
        ((c)y0).p(y7d.d(ldr.d, edq.c, (k6w)null));
        y0.setRoundingStrategy(ijg.a(12.0f, 12.0f, 12.0f, 12.0f));
        return fzv.a;
    }
}
