import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v2g extends v3e<mlc$d, v2g.v2g$a>
{
    public final llc d;
    
    public v2g(final llc d) {
        zzd.f((Object)d, "listEventDispatcher");
        super((Class)mlc$d.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final v2g.v2g$a v2g$a = (v2g.v2g$a)c7x;
        final mlc$d mlc$d = (mlc$d)o;
        zzd.f((Object)v2g$a, "viewHolder");
        zzd.f((Object)mlc$d, "item");
        v2g$a.W0.setOnClickListener((View$OnClickListener)new ibg(this, mlc$d, 16));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View v = lf.v(viewGroup, "parent", 2131625515, viewGroup, false);
        zzd.e((Object)v, "it");
        return (c7x)new v2g.v2g$a(v);
    }
}
