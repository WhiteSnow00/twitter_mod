import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v13 extends b4e<w13.a, x13>
{
    public final LayoutInflater d;
    public final r13 e;
    
    public v13(final LayoutInflater d, final r13 e) {
        e0e.f((Object)d, "layoutInflater");
        e0e.f((Object)e, "listSelectionActionDispatcher");
        super((Class)w13.a.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final x13 x13 = (x13)n8x;
        final w13.a a = (w13.a)o;
        e0e.f((Object)x13, "viewHolder");
        e0e.f((Object)a, "item");
        x13.Z0.setText((CharSequence)a.a);
        x13.a1.setOnClickListener((View$OnClickListener)new bb8((Object)this, (Object)a, 5));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624145, viewGroup, false);
        e0e.e((Object)inflate, "layoutInflater.inflate(\n\u2026      false\n            )");
        return (n8x)new x13(inflate);
    }
}
