import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qjn extends ste implements qsb<ckn, fzv>
{
    public final njn D0;
    
    public qjn(final njn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ckn ckn = (ckn)o;
        czd.f((Object)ckn, "$this$distinct");
        final Object value = this.D0.J0.getValue();
        czd.e(value, "<get-verifiedIconView>(...)");
        final AppCompatImageView appCompatImageView = (AppCompatImageView)value;
        int visibility;
        if (ckn.g) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)appCompatImageView).setVisibility(visibility);
        return fzv.a;
    }
}
