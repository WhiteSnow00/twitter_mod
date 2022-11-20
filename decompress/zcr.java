import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zcr extends ste implements qsb<ldr, fzv>
{
    public final ocr D0;
    
    public zcr(final ocr d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ldr ldr = (ldr)o;
        czd.f((Object)ldr, "$this$distinct");
        if (ldr.m) {
            ((View)this.D0.O0).setVisibility(0);
            ((View)this.D0.O0).animate();
        }
        else {
            ((View)this.D0.O0).setVisibility(8);
        }
        return fzv.a;
    }
}
