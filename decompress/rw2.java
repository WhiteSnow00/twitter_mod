import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rw2 extends b4e<hw2$f, sw2>
{
    public final LayoutInflater d;
    public final rv2 e;
    
    public rw2(final LayoutInflater d, final rv2 e) {
        e0e.f((Object)d, "layoutInflater");
        e0e.f((Object)e, "dispatcher");
        super((Class)hw2$f.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final sw2 sw2 = (sw2)n8x;
        final hw2$f hw2$f = (hw2$f)o;
        e0e.f((Object)sw2, "viewHolder");
        e0e.f((Object)hw2$f, "item");
        sw2.Z0.setText((CharSequence)d4j.C(hw2$f.a));
        sw2.a1.setOnClickListener((View$OnClickListener)new d1x((Object)this, 18));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624139, viewGroup, false);
        e0e.e((Object)inflate, "layoutInflater.inflate(\n\u2026      false\n            )");
        return (n8x)new sw2(inflate);
    }
}
