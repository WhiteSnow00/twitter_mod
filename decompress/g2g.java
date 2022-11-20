import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g2g extends a3e<mkc$d, g2g.g2g$a>
{
    public final lkc d;
    
    public g2g(final lkc d) {
        czd.f((Object)d, "listEventDispatcher");
        super((Class)mkc$d.class);
        this.d = d;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final g2g.g2g$a g2g$a = (g2g.g2g$a)v7x;
        final mkc$d mkc$d = (mkc$d)o;
        czd.f((Object)g2g$a, "viewHolder");
        czd.f((Object)mkc$d, "item");
        g2g$a.X0.setOnClickListener((View$OnClickListener)new e1p((Object)this, (Object)mkc$d, 14));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131625517, viewGroup, false);
        czd.e((Object)e, "it");
        return (v7x)new g2g.g2g$a(e);
    }
}
