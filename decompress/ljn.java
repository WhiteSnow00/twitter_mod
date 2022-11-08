import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljn extends gue implements rtb<pjn, oyv>
{
    public final /* synthetic */ ajn C0;
    
    public ljn(final ajn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object value) {
        final pjn pjn = (pjn)value;
        zzd.f((Object)pjn, "$this$distinct");
        value = this.C0.G0.getValue();
        zzd.e(value, "<get-descriptionView>(...)");
        ((TextView)value).setText((CharSequence)pjn.c);
        return oyv.a;
    }
}
