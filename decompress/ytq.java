import android.view.View;
import android.content.Context;
import androidx.cardview.widget.CardView;
import android.graphics.drawable.Drawable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytq extends ste implements qsb<luq, fzv>
{
    public final vtq D0;
    
    public ytq(final vtq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final luq luq = (luq)o;
        czd.f((Object)luq, "$this$distinct");
        final vtq d0 = this.D0;
        final CardView h0 = d0.H0;
        final ctq a = ctq.a;
        final wbr f = luq.f;
        final Context context = d0.D0.getContext();
        czd.e((Object)context, "rootView.context");
        ((View)h0).setBackground((Drawable)a.a(context, f, (Map)ctq.h.getValue(), Integer.valueOf(2131167246)));
        return fzv.a;
    }
}
