import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tic extends b4e<kk.a, uic>
{
    public final LayoutInflater d;
    public final qej e;
    
    public tic(final LayoutInflater d, final qej e) {
        e0e.f((Object)d, "layoutInflater");
        e0e.f((Object)e, "richTextProcessor");
        super((Class)kk.a.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final uic uic = (uic)n8x;
        final kk.a a = (kk.a)o;
        e0e.f((Object)uic, "viewHolder");
        e0e.f((Object)a, "item");
        this.e.b(uic.Z0, (fym)a.b);
        this.e.b(uic.a1, (fym)a.c);
        ((RecyclerView$c0)uic).F0.post((Runnable)new vi1((Object)this, (Object)uic, (Object)a, 2));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131625039, viewGroup, false);
        e0e.e((Object)inflate, "layoutInflater.inflate(R\u2026st_header, parent, false)");
        return (n8x)new uic(inflate);
    }
}
