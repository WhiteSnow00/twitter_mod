import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class by2 extends ste implements qsb<kz2, fzv>
{
    public final gx2 D0;
    
    public by2(final gx2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final kz2 kz2 = (kz2)o;
        czd.f((Object)kz2, "$this$distinct");
        this.D0.g1.setChecked(kz2.j);
        final TextView h1 = this.D0.h1;
        czd.e((Object)h1, "displayMapTextview");
        final gx2 d0 = this.D0;
        int n;
        if (kz2.j) {
            n = 2131953878;
        }
        else {
            n = 2131953133;
        }
        final String a = d0.a(n);
        final CharSequence text = h1.getText();
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)text);
        sb.append(" ");
        sb.append(a);
        ((View)h1).setContentDescription((CharSequence)sb.toString());
        return fzv.a;
    }
}
