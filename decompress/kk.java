import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kk extends o9<gk$b>
{
    public final ck e;
    
    public kk(final ck e, final dej dej) {
        czd.f((Object)e, "actionListActionDispatcher");
        czd.f((Object)dej, "richTextProcessor");
        super((Class)gk$b.class, dej);
        this.e = e;
    }
    
    public final /* bridge */ void k(final v7x v7x, final Object o, final xbm xbm) {
        this.o((o9$c)v7x, (gk$b)o, xbm);
    }
    
    public final /* bridge */ void n(final o9$c o9$c, final gk gk, final xbm xbm) {
        this.o(o9$c, (gk$b)gk, xbm);
    }
    
    public final void o(final o9$c o9$c, final gk$b gk$b, final xbm xbm) {
        czd.f((Object)o9$c, "viewHolder");
        czd.f((Object)gk$b, "item");
        super.n(o9$c, (gk)gk$b, xbm);
        ((View)o9$c.a1).setVisibility(0);
        ((View)o9$c.a1).setClickable(false);
        ((RecyclerView$c0)o9$c).D0.setOnClickListener((View$OnClickListener)new mgk((Object)this, (Object)gk$b, 14));
    }
}
