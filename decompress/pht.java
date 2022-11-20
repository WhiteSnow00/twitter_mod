import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pht extends a3e<w0r$d, pht.pht$a>
{
    public pht() {
        super((Class)w0r$d.class);
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final pht.pht$a pht$a = (pht.pht$a)v7x;
        final w0r$d w0r$d = (w0r$d)o;
        czd.f((Object)pht$a, "viewHolder");
        czd.f((Object)w0r$d, "item");
        ((TextView)pht$a.X0).setText(w0r$d.a);
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131624413, viewGroup, false);
        czd.e((Object)e, "it");
        return (v7x)new pht.pht$a(e);
    }
}
