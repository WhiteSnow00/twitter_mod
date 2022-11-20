import java.util.LinkedHashMap;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hu1 extends ste implements qsb<b3e<Object>, fzv>
{
    public final ku1 D0;
    
    public hu1(final ku1 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b3e b3e = (b3e)o;
        if (b3e instanceof b3e$a) {
            final rv1 b = this.D0.b;
            final View heldView = ((b3e$a)b3e).a.getHeldView();
            czd.e((Object)heldView, "event.viewHolder.heldView");
            final lca<f7x> k = b.k(heldView);
            final LinkedHashMap d = this.D0.d;
            final m4s a = hq1.a;
            d.put(k, System.currentTimeMillis());
        }
        else if (b3e instanceof b3e$d) {
            final rv1 b2 = this.D0.b;
            final View heldView2 = ((b3e$d)b3e).a.getHeldView();
            czd.e((Object)heldView2, "event.viewHolder.heldView");
            final lca<f7x> i = b2.k(heldView2);
            final Long n = this.D0.d.get(i);
            if (n != null) {
                final long longValue = n.longValue();
                final m4s a2 = hq1.a;
                ((yaa)i).e((Object)new ned(longValue, System.currentTimeMillis()));
            }
            this.D0.d.remove(i);
        }
        else if (b3e instanceof b3e$c) {
            final rv1 b3 = this.D0.b;
            final b3e$c b3e$c = (b3e$c)b3e;
            final View heldView3 = b3e$c.a.getHeldView();
            czd.e((Object)heldView3, "event.viewHolder.heldView");
            b3.d(heldView3, (View)b3e$c.b);
        }
        return fzv.a;
    }
}
