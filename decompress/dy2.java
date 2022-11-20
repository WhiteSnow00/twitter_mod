import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dy2 extends ste implements qsb<kz2, fzv>
{
    public final gx2 D0;
    
    public dy2(final gx2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final kz2 kz2 = (kz2)o;
        czd.f((Object)kz2, "$this$distinct");
        final View f1 = this.D0.f1;
        czd.e((Object)f1, "displayMapRow");
        int visibility;
        if (kz2.k) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f1.setVisibility(visibility);
        return fzv.a;
    }
}
