import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.ui.widget.BadgeView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjb implements q7x$a
{
    public static final fjb G0;
    public static final fjb H0;
    public static final fjb I0;
    public static final fjb J0;
    public final int F0;
    
    static {
        G0 = new fjb(0);
        H0 = new fjb(1);
        I0 = new fjb(2);
        J0 = new fjb(3);
    }
    
    public fjb(final int f0) {
        this.F0 = f0;
    }
    
    public final q7x a(final View view) {
        switch (this.F0) {
            default: {
                e0e.f((Object)view, "view");
                return (q7x)new wmu(view);
            }
            case 2: {
                return (q7x)new pmu(view);
            }
            case 1: {
                return (q7x)new nh1((BadgeView)view);
            }
            case 0: {
                final TypefacesTextView typefacesTextView = (TypefacesTextView)view;
                e0e.f((Object)typefacesTextView, "toggle");
                return (q7x)new gjb(typefacesTextView);
            }
        }
    }
}
