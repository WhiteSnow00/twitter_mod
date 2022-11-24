import android.view.ViewGroup;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView;
import com.twitter.ui.widget.TextContentView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xha implements q7x$a
{
    public static final xha G0;
    public static final xha H0;
    public static final xha I0;
    public static final xha J0;
    public final int F0;
    
    static {
        G0 = new xha(0);
        H0 = new xha(1);
        I0 = new xha(2);
        J0 = new xha(3);
    }
    
    public xha(final int f0) {
        this.F0 = f0;
    }
    
    public final q7x a(final View view) {
        switch (this.F0) {
            default: {
                return (q7x)new rfs((TextContentView)view);
            }
            case 2: {
                final HorizonInlineCalloutView horizonInlineCalloutView = (HorizonInlineCalloutView)view;
                e0e.f((Object)horizonInlineCalloutView, "nuxView");
                return (q7x)new bzu(horizonInlineCalloutView);
            }
            case 1: {
                return (q7x)new nz((ViewGroup)view);
            }
            case 0: {
                e0e.f((Object)view, "view");
                return (q7x)new yha(view);
            }
        }
    }
}
