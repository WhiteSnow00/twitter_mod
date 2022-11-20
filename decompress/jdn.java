import android.view.View;
import android.widget.TextView;
import com.twitter.ui.widget.TwitterEditText;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdn extends ste implements qsb<vdn, fzv>
{
    public final gdn D0;
    
    public jdn(final gdn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vdn vdn = (vdn)o;
        czd.f((Object)vdn, "$this$distinct");
        final gdn d0 = this.D0;
        final TypefacesTextView m0 = d0.M0;
        final Context context = d0.D0.getContext();
        final int ordinal = ((Enum)vdn.b).ordinal();
        int n;
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    n = 2131957275;
                }
                else {
                    n = 2131957319;
                }
            }
            else {
                n = 2131958311;
            }
        }
        else {
            n = 2131957276;
        }
        ((TextView)m0).setText((CharSequence)context.getString(n));
        final gdn d2 = this.D0;
        final TypefacesTextView r0 = d2.R0;
        final Context context2 = d2.D0.getContext();
        final int ordinal2 = ((Enum)vdn.b).ordinal();
        int n2;
        if (ordinal2 != 0 && ordinal2 != 1) {
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    if (ordinal2 != 4) {
                        n2 = 2131955563;
                    }
                    else {
                        n2 = 2131958926;
                    }
                }
                else {
                    n2 = 2131958923;
                }
            }
            else {
                n2 = 2131958922;
            }
        }
        else {
            n2 = 2131958924;
        }
        ((TextView)r0).setText((CharSequence)context2.getString(n2));
        final TypefacesTextView s0 = this.D0.S0;
        final gpn b = vdn.b;
        final boolean b2 = b != gpn.G0 && b != gpn.H0;
        final int n3 = 8;
        int visibility;
        if (b2) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)s0).setVisibility(visibility);
        final gdn d3 = this.D0;
        final TwitterEditText p = d3.P0;
        final Context context3 = d3.D0.getContext();
        int n4;
        if (jdn.jdn$a.a[((Enum)vdn.b).ordinal()] == 1) {
            n4 = 2131958312;
        }
        else {
            n4 = 2131954472;
        }
        ((TextView)p).setHint((CharSequence)context3.getString(n4));
        final TypefacesTextView q0 = this.D0.Q0;
        final int ordinal3 = ((Enum)vdn.b).ordinal();
        int visibility2;
        if (ordinal3 != 2 && ordinal3 != 3) {
            visibility2 = n3;
        }
        else {
            visibility2 = 0;
        }
        ((View)q0).setVisibility(visibility2);
        final TypefacesTextView q2 = this.D0.Q0;
        final int ordinal4 = ((Enum)vdn.b).ordinal();
        CharSequence text;
        if (ordinal4 != 2) {
            if (ordinal4 != 3) {
                text = null;
            }
            else {
                final Integer d4 = vdn.d;
                int intValue;
                if (d4 != null) {
                    intValue = d4;
                }
                else {
                    intValue = 0;
                }
                text = this.D0.D0.getResources().getQuantityString(2131820591, intValue, new Object[] { intValue });
            }
        }
        else {
            text = this.D0.D0.getResources().getText(2131954476);
        }
        ((TextView)q2).setText(text);
        return fzv.a;
    }
}
