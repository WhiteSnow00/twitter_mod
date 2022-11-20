import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View$OnClickListener;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import android.text.util.Linkify;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdr extends ste implements qsb<ldr, fzv>
{
    public final ocr D0;
    
    public gdr(final ocr d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ldr ldr = (ldr)o;
        czd.f((Object)ldr, "$this$distinct");
        final TypefacesTextView u0 = this.D0.U0;
        ((TextView)u0).setText((CharSequence)String.valueOf(t60.a(ldr.b)));
        Linkify.addLinks((TextView)u0, 3);
        f0r.c((TextView)u0);
        final ocr d0 = this.D0;
        if (((TextView)d0.U0).getLineCount() > 10) {
            ((TextView)d0.U0).setEllipsize(TextUtils$TruncateAt.END);
            ((TextView)d0.U0).setMaxLines(10);
            ((View)d0.V0).setVisibility(0);
            ((View)d0.V0).setOnClickListener((View$OnClickListener)new epf((Object)d0, 27));
        }
        else {
            ((View)d0.V0).setVisibility(8);
        }
        return fzv.a;
    }
}
