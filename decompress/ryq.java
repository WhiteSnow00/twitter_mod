import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ryq extends ste implements qsb<hwq, fzv>
{
    public final hzq D0;
    
    public ryq(final hzq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hwq hwq = (hwq)o;
        czd.f((Object)hwq, "$this$distinct");
        final s21 h = hwq.h;
        if (h != null) {
            final hzq d0 = this.D0;
            final Integer q = hwq.q;
            d0.g.H(h.e());
            ((TextView)d0.i).setText((CharSequence)h.c());
            final AppCompatImageView h2 = d0.h;
            int visibility;
            if (h.h()) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)h2).setVisibility(visibility);
            if (q != null) {
                d0.f.setBackgroundTintList(ColorStateList.valueOf((int)q));
            }
        }
        return fzv.a;
    }
}
