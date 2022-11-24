import android.text.TextWatcher;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tks extends gnd<sks>
{
    public final TextView F0;
    
    public tks(final TextView f0) {
        e0e.g((Object)f0, "view");
        this.F0 = f0;
    }
    
    @Override
    public final Object d() {
        final TextView f0 = this.F0;
        return new sks(f0, f0.getEditableText());
    }
    
    @Override
    public final void e(final ocj<? super sks> ocj) {
        e0e.g((Object)ocj, "observer");
        final tks.tks$a tks$a = new tks.tks$a(this.F0, (ocj)ocj);
        ocj.onSubscribe((b39)tks$a);
        this.F0.addTextChangedListener((TextWatcher)tks$a);
    }
}
