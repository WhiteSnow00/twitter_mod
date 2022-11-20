import android.text.TextWatcher;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lks extends fmd<kks>
{
    public final TextView D0;
    
    public lks(final TextView d0) {
        czd.g((Object)d0, "view");
        this.D0 = d0;
    }
    
    public final Object d() {
        final TextView d0 = this.D0;
        final CharSequence text = d0.getText();
        czd.b((Object)text, "view.text");
        return new kks(d0, text, 0, 0, 0);
    }
    
    public final void e(final ccj<? super kks> ccj) {
        czd.g((Object)ccj, "observer");
        final lks.lks$a lks$a = new lks.lks$a(this.D0, (ccj)ccj);
        ccj.onSubscribe((t19)lks$a);
        this.D0.addTextChangedListener((TextWatcher)lks$a);
    }
}
