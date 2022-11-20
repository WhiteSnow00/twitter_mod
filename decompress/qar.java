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

public final class qar extends nk8
{
    public static final a Companion;
    public final dej E0;
    public final LinearLayout F0;
    
    static {
        Companion = new a();
    }
    
    public qar(View viewById, final dej e0) {
        czd.f((Object)e0, "ocfRichTextProcessorHelper");
        super(viewById);
        this.E0 = e0;
        viewById = viewById.findViewById(2131428424);
        czd.e((Object)viewById, "contentView.findViewById(R.id.container)");
        this.F0 = (LinearLayout)viewById;
    }
    
    public final qar l0(final int id, final par$c par$c, final cej cej) {
        final LinearLayout f0 = this.F0;
        final View viewById = ((View)f0).findViewById(id);
        if (viewById != null) {
            ((ViewGroup)f0).removeView(viewById);
        }
        if (cej != null) {
            final Context context = ((View)this.F0).getContext();
            Objects.requireNonNull(qar.Companion);
            final int ordinal = ((Enum)par$c).ordinal();
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
            ((ViewGroup)this.F0).addView((View)typefacesTextView);
            this.E0.a((TextView)typefacesTextView, (oxm)cej);
        }
        return this;
    }
    
    public static final class a
    {
    }
}
