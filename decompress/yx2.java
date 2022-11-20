import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yx2 extends ste implements qsb<kz2, fzv>
{
    public final gx2 D0;
    
    public yx2(final gx2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final kz2 kz2 = (kz2)o;
        czd.f((Object)kz2, "$this$distinct");
        final View d1 = this.D0.d1;
        czd.e((Object)d1, "previewView");
        int visibility;
        if (kz2.i) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        d1.setVisibility(visibility);
        return fzv.a;
    }
}
