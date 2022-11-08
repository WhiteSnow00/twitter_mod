import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djn extends gue implements rtb<pjn, oyv>
{
    public final /* synthetic */ ajn C0;
    
    public djn(final ajn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pjn pjn = (pjn)o;
        zzd.f((Object)pjn, "$this$distinct");
        final Object value = this.C0.I0.getValue();
        zzd.e(value, "<get-verifiedIconView>(...)");
        final AppCompatImageView appCompatImageView = (AppCompatImageView)value;
        int visibility;
        if (pjn.g) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)appCompatImageView).setVisibility(visibility);
        return oyv.a;
    }
}
