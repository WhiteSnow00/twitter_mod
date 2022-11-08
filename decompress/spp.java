import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spp extends gue implements rtb<upp, oyv>
{
    public final /* synthetic */ qpp C0;
    
    public spp(final qpp c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final upp upp = (upp)o;
        zzd.f((Object)upp, "$this$distinct");
        if (!zzd.a((Object)String.valueOf(((AppCompatEditText)this.C0.C0).getText()), (Object)upp.a)) {
            ((TextView)this.C0.C0).setText((CharSequence)upp.a);
            ((EditText)this.C0.C0).setSelection(Math.max(upp.a.length(), 0));
        }
        if (zzd.a((Object)upp.a, (Object)"")) {
            ((View)this.C0.D0).setVisibility(8);
        }
        else {
            ((View)this.C0.D0).setVisibility(0);
        }
        return oyv.a;
    }
}
