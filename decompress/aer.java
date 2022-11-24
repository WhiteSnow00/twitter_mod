import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aer extends pue implements stb<her, vzv>
{
    public final kdr F0;
    
    public aer(final kdr f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final her her = (her)o;
        e0e.f((Object)her, "$this$distinct");
        final TypefacesTextView z0 = this.F0.Z0;
        final StringBuilder sb = new StringBuilder();
        sb.append(her.k);
        sb.append(" \u2022 ");
        sb.append(her.a);
        ((TextView)z0).setText((CharSequence)sb.toString());
        return vzv.a;
    }
}
