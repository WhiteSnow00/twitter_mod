import android.view.View;
import android.widget.TextView;
import com.twitter.ui.widget.TwitterEditText;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpn extends ste implements qsb<wpn, fzv>
{
    public final ipn D0;
    
    public jpn(final ipn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wpn wpn = (wpn)o;
        czd.f((Object)wpn, "$this$distinct");
        final ipn d0 = this.D0;
        final TypefacesTextView k0 = d0.K0;
        final Context context = d0.D0.getContext();
        final int ordinal = ((Enum)wpn.b).ordinal();
        int n;
        if (ordinal != 1) {
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
        }
        else {
            n = 2131958473;
        }
        ((TextView)k0).setText((CharSequence)context.getString(n));
        final ipn d2 = this.D0;
        final TypefacesTextView o2 = d2.O0;
        final Context context2 = d2.D0.getContext();
        final int ordinal2 = ((Enum)wpn.b).ordinal();
        int n2;
        if (ordinal2 != 0 && ordinal2 != 1) {
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    if (ordinal2 != 4) {
                        if (ordinal2 != 5) {
                            n2 = 2131955563;
                        }
                        else {
                            n2 = 2131958925;
                        }
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
        ((TextView)o2).setText((CharSequence)context2.getString(n2));
        final TypefacesTextView p = this.D0.P0;
        final gpn b = wpn.b;
        final gpn g0 = gpn.G0;
        final int n3 = 8;
        int visibility;
        if (b != g0 && b != gpn.H0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)p).setVisibility(visibility);
        final ipn d3 = this.D0;
        final TwitterEditText m0 = d3.M0;
        final Context context3 = d3.D0.getContext();
        int n4;
        if (jpn.jpn$a.a[((Enum)wpn.b).ordinal()] == 2) {
            n4 = 2131958312;
        }
        else {
            n4 = 2131954472;
        }
        ((TextView)m0).setHint((CharSequence)context3.getString(n4));
        final TypefacesTextView n5 = this.D0.N0;
        final int ordinal3 = ((Enum)wpn.b).ordinal();
        int visibility2;
        if (ordinal3 != 2 && ordinal3 != 3) {
            visibility2 = n3;
        }
        else {
            visibility2 = 0;
        }
        ((View)n5).setVisibility(visibility2);
        final TypefacesTextView n6 = this.D0.N0;
        final int ordinal4 = ((Enum)wpn.b).ordinal();
        CharSequence text;
        if (ordinal4 != 2) {
            if (ordinal4 != 3) {
                text = null;
            }
            else {
                final Integer d4 = wpn.d;
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
        ((TextView)n6).setText(text);
        return fzv.a;
    }
}
