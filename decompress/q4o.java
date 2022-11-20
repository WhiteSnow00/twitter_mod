import androidx.appcompat.widget.AppCompatTextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4o extends ste implements qsb<g5o, fzv>
{
    public final p4o D0;
    
    public q4o(final p4o d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final g5o g5o = (g5o)o;
        czd.f((Object)g5o, "$this$distinct");
        final TypefacesTextView n0 = this.D0.N0;
        int backgroundResource;
        if (czd.a((Object)g5o.g, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE)) {
            backgroundResource = 2131233239;
        }
        else {
            backgroundResource = 2131233241;
        }
        ((AppCompatTextView)n0).setBackgroundResource(backgroundResource);
        return fzv.a;
    }
}
