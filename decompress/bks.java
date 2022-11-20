import android.text.TextWatcher;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bks extends fmd<aks>
{
    public final TextView D0;
    
    public bks(final TextView d0) {
        czd.g((Object)d0, "view");
        this.D0 = d0;
    }
    
    public final Object d() {
        final TextView d0 = this.D0;
        return new aks(d0, d0.getEditableText());
    }
    
    public final void e(final ccj<? super aks> ccj) {
        czd.g((Object)ccj, "observer");
        final bks.bks$a bks$a = new bks.bks$a(this.D0, (ccj)ccj);
        ccj.onSubscribe((t19)bks$a);
        this.D0.addTextChangedListener((TextWatcher)bks$a);
    }
}
