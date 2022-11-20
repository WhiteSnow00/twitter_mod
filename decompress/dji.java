import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dji extends ste implements qsb<nji, fzv>
{
    public final xii D0;
    
    public dji(final xii d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nji nji = (nji)o;
        czd.f((Object)nji, "$this$distinct");
        final TextView o2 = this.D0.O0;
        czd.e((Object)o2, "errorMessage");
        int visibility;
        if (nji.k) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)o2).setVisibility(visibility);
        return fzv.a;
    }
}
