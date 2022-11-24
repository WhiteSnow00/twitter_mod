import com.twitter.ui.widget.TintableImageButton;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import com.twitter.ui.widget.TextContentView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ct9 implements q7x$a
{
    public static final ct9 G0;
    public static final ct9 H0;
    public static final ct9 I0;
    public static final ct9 J0;
    public static final ct9 K0;
    public static final ct9 L0;
    public static final ct9 M0;
    public final int F0;
    
    static {
        G0 = new ct9(0);
        H0 = new ct9(1);
        I0 = new ct9(2);
        J0 = new ct9(3);
        K0 = new ct9(4);
        L0 = new ct9(5);
        M0 = new ct9(6);
    }
    
    public ct9(final int f0) {
        this.F0 = f0;
    }
    
    public final q7x a(final View view) {
        switch (this.F0) {
            default: {
                final ct9 a = huu.a;
                e0e.f((Object)view, "view");
                guu guu;
                if (view instanceof TextView) {
                    guu = (guu)hs.M0.a(view);
                }
                else {
                    if (!(view instanceof TextContentView)) {
                        throw new IllegalArgumentException(mqb.l("No corresponding delegate found for view: ", view.getClass().getCanonicalName()));
                    }
                    guu = (guu)xdb.J0.a(view);
                }
                return (q7x)guu;
            }
            case 5: {
                final ViewGroup viewGroup = (ViewGroup)view;
                e0e.f((Object)viewGroup, "container");
                return (q7x)new jdb(viewGroup);
            }
            case 4: {
                final LinearLayout linearLayout = (LinearLayout)view;
                e0e.f((Object)linearLayout, "pivotViewContainer");
                return (q7x)new wvl(linearLayout);
            }
            case 3: {
                final TintableImageButton tintableImageButton = (TintableImageButton)view;
                e0e.f((Object)tintableImageButton, "tintableImageButton");
                return (q7x)new zjh(tintableImageButton);
            }
            case 2: {
                return (q7x)new vqd((LinearLayout)view);
            }
            case 1: {
                return (q7x)new qmu(view);
            }
            case 0: {
                final ViewGroup viewGroup2 = (ViewGroup)view;
                e0e.f((Object)viewGroup2, "view");
                return (q7x)new dt9(viewGroup2);
            }
        }
    }
}
