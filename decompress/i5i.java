import android.widget.TextView;
import com.google.android.material.bottomsheet.a;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.view.View$OnClickListener;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i5i extends c92
{
    public static final int T0 = 0;
    public final View S0;
    
    public i5i(final Context context, final int text, final ccj<o2i> ccj) {
        czd.f((Object)context, "context");
        super(context);
        final View inflate = ((Dialog)this).getLayoutInflater().inflate(2131624978, (ViewGroup)null, false);
        czd.e((Object)inflate, "layoutInflater.inflate(R\u2026ottom_sheet, null, false)");
        ((a)this).setContentView(this.S0 = inflate);
        ((a)this).l().H = true;
        final TypefacesTextView typefacesTextView = ((ck0)this).findViewById(2131430338);
        if (typefacesTextView != null) {
            ((View)typefacesTextView).setOnClickListener((View$OnClickListener)new vtf(this, 18));
        }
        final TypefacesTextView typefacesTextView2 = ((ck0)this).findViewById(2131430337);
        if (typefacesTextView2 != null && text != 0) {
            ((TextView)typefacesTextView2).setText(text);
        }
        if (ccj != null) {
            ((Dialog)this).setOnDismissListener((DialogInterface$OnDismissListener)new aem((Object)ccj, 1));
        }
    }
}
