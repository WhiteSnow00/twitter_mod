import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqq extends ste implements qsb<vrq, fzv>
{
    public final zpq D0;
    
    public pqq(final zpq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vrq vrq = (vrq)o;
        czd.f((Object)vrq, "$this$distinct");
        final TypefacesTextView n0 = this.D0.N0;
        int importantForAccessibility;
        if (vrq.f) {
            importantForAccessibility = 2;
        }
        else {
            importantForAccessibility = 1;
        }
        ((View)n0).setImportantForAccessibility(importantForAccessibility);
        return fzv.a;
    }
}
