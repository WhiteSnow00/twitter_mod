import android.text.Spannable;
import android.text.Editable;
import com.twitter.app.fleets.page.thread.compose.overlay.FleetTypefacesEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w3b extends mq1
{
    public final FleetTypefacesEditText F0;
    
    public w3b(final FleetTypefacesEditText f0) {
        this.F0 = f0;
    }
    
    public final void afterTextChanged(final Editable editable) {
        e0e.f((Object)editable, "s");
        ((Spannable)editable).setSpan((Object)this.F0.getTextHelper().b, 0, ((CharSequence)editable).length(), 17);
    }
}
