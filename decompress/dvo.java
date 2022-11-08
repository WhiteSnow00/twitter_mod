import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvo extends gue implements rtb<fvo, oyv>
{
    public final /* synthetic */ yuo C0;
    
    public dvo(final yuo c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fvo fvo = (fvo)o;
        zzd.f((Object)fvo, "$this$distinct");
        ((TextView)this.C0.K0).setText((CharSequence)fvo.b);
        ((TextView)this.C0.L0).setText((CharSequence)fvo.c);
        final yuo c0 = this.C0;
        final TypefacesTextView l0 = c0.L0;
        int textColor;
        if (fvo.d) {
            textColor = c0.R0;
        }
        else {
            textColor = c0.Q0;
        }
        ((TextView)l0).setTextColor(textColor);
        return oyv.a;
    }
}
