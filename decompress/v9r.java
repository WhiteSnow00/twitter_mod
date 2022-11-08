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

public final class v9r extends el8
{
    public static final v9r.v9r$a Companion;
    public final ydj D0;
    public final LinearLayout E0;
    
    static {
        Companion = new v9r.v9r$a();
    }
    
    public v9r(View viewById, final ydj d0) {
        zzd.f((Object)d0, "ocfRichTextProcessorHelper");
        super(viewById);
        this.D0 = d0;
        viewById = viewById.findViewById(2131428424);
        zzd.e((Object)viewById, "contentView.findViewById(R.id.container)");
        this.E0 = (LinearLayout)viewById;
    }
    
    public final v9r l0(final int id, final u9r$c u9r$c, final xdj xdj) {
        final LinearLayout e0 = this.E0;
        final View viewById = ((View)e0).findViewById(id);
        if (viewById != null) {
            ((ViewGroup)e0).removeView(viewById);
        }
        if (xdj != null) {
            final Context context = ((View)this.E0).getContext();
            Objects.requireNonNull(v9r.Companion);
            final int ordinal = ((Enum)u9r$c).ordinal();
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
            ((ViewGroup)this.E0).addView((View)typefacesTextView);
            this.D0.a((TextView)typefacesTextView, (xwm)xdj);
        }
        return this;
    }
}
