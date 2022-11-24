import androidx.appcompat.widget.AppCompatTextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j5o extends pue implements stb<z5o, vzv>
{
    public final i5o F0;
    
    public j5o(final i5o f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final z5o z5o = (z5o)o;
        e0e.f((Object)z5o, "$this$distinct");
        final TypefacesTextView p = this.F0.P0;
        int backgroundResource;
        if (e0e.a((Object)z5o.g, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE)) {
            backgroundResource = 2131233239;
        }
        else {
            backgroundResource = 2131233241;
        }
        ((AppCompatTextView)p).setBackgroundResource(backgroundResource);
        return vzv.a;
    }
}
