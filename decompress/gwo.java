import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwo extends b4e<eth$a, gwo.gwo$a>
{
    public gwo() {
        super((Class)eth$a.class);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final gwo.gwo$a gwo$a = (gwo.gwo$a)n8x;
        final eth$a eth$a = (eth$a)o;
        e0e.f((Object)gwo$a, "viewHolder");
        e0e.f((Object)eth$a, "item");
        ((TextView)gwo$a.Z0).setText((CharSequence)eth$a.a);
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131624887, viewGroup, false);
        e0e.e((Object)x, "it");
        return (n8x)new gwo.gwo$a(x);
    }
}
