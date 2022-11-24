import android.view.ViewGroup;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.ContextThemeWrapper;
import java.util.Objects;
import android.view.View;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obr extends sl8
{
    public static final obr.obr$a Companion;
    public final qej G0;
    public final LinearLayout H0;
    
    static {
        Companion = new obr.obr$a();
    }
    
    public obr(View viewById, final qej g0) {
        e0e.f((Object)g0, "ocfRichTextProcessorHelper");
        super(viewById);
        this.G0 = g0;
        viewById = viewById.findViewById(2131428424);
        e0e.e((Object)viewById, "contentView.findViewById(R.id.container)");
        this.H0 = (LinearLayout)viewById;
    }
    
    public final obr l0(final int id, final nbr$c nbr$c, final pej pej) {
        final LinearLayout h0 = this.H0;
        final View viewById = ((View)h0).findViewById(id);
        if (viewById != null) {
            ((ViewGroup)h0).removeView(viewById);
        }
        if (pej != null) {
            final Context context = ((View)this.H0).getContext();
            Objects.requireNonNull(obr.Companion);
            final int ordinal = ((Enum)nbr$c).ordinal();
            int n;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            n = 0;
                        }
                        else {
                            n = 2132018363;
                        }
                    }
                    else {
                        n = 2132018366;
                    }
                }
                else {
                    n = 2132018364;
                }
            }
            else {
                n = 2132018365;
            }
            final TypefacesTextView typefacesTextView = new TypefacesTextView((Context)new ContextThemeWrapper(context, n), (AttributeSet)null);
            ((View)typefacesTextView).setId(id);
            ((ViewGroup)this.H0).addView((View)typefacesTextView);
            this.G0.a((TextView)typefacesTextView, (fym)pej);
        }
        return this;
    }
}
