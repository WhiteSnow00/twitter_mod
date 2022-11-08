import android.text.Spannable;
import android.text.Editable;
import com.twitter.app.fleets.page.thread.compose.overlay.FleetTypefacesEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4b extends lq1
{
    public final /* synthetic */ FleetTypefacesEditText C0;
    
    public a4b(final FleetTypefacesEditText c0) {
        this.C0 = c0;
    }
    
    public final void afterTextChanged(final Editable editable) {
        zzd.f((Object)editable, "s");
        ((Spannable)editable).setSpan((Object)this.C0.getTextHelper().b, 0, ((CharSequence)editable).length(), 17);
    }
}
