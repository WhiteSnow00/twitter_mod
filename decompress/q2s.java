import android.content.DialogInterface$OnCancelListener;
import androidx.appcompat.app.e;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.ViewGroup;
import android.content.DialogInterface$OnClickListener;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$c0;
import androidx.recyclerview.widget.q$d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q2s extends q$d
{
    public final j4e<yig> d;
    public final ajg e;
    public boolean f;
    
    public q2s(final j4e<yig> d, final ajg e) {
        e0e.f((Object)d, "adapter");
        e0e.f((Object)e, "actionDispatcher");
        this.d = d;
        this.e = e;
    }
    
    public static final void o(final q2s q2s, final RecyclerView$c0 recyclerView$c0) {
        ((RecyclerView$e)q2s.d).g(recyclerView$c0.L());
        final View n = q2s.n(recyclerView$c0);
        final Object tag = n.getTag(2131429698);
        if (tag instanceof Float) {
            final float floatValue = (float)tag;
            final WeakHashMap a = b7x.a;
            b7x$i.s(n, floatValue);
        }
        n.setTag(2131429698, (Object)null);
        n.setTranslationX(0.0f);
        n.setTranslationY(0.0f);
    }
    
    public final void a(final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0) {
        e0e.f((Object)recyclerView, "recyclerView");
        e0e.f((Object)recyclerView$c0, "viewHolder");
        final View n = this.n(recyclerView$c0);
        final Object tag = n.getTag(2131429698);
        if (tag instanceof Float) {
            final float floatValue = (float)tag;
            final WeakHashMap a = b7x.a;
            b7x$i.s(n, floatValue);
        }
        n.setTag(2131429698, (Object)null);
        n.setTranslationX(0.0f);
        n.setTranslationY(0.0f);
    }
    
    public final int e(final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0) {
        e0e.f((Object)recyclerView, "recyclerView");
        e0e.f((Object)recyclerView$c0, "viewHolder");
        final boolean f = this.f;
        final boolean b = false;
        int h;
        if (!f) {
            h = (b ? 1 : 0);
        }
        else {
            final yig yig = (yig)this.d.I0.getItem(recyclerView$c0.L());
            h = (b ? 1 : 0);
            if (yig instanceof yig$c) {
                final yig$c yig$c = (yig$c)yig;
                h = (b ? 1 : 0);
                if (yig$c.b.getUserStatus() == ojo.J0) {
                    h = (b ? 1 : 0);
                    if (!yig$c.e) {
                        h = q$d.h(0, 4);
                    }
                }
            }
        }
        return h;
    }
    
    public final void i(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0, final float translationX, final float translationY, final boolean b) {
        e0e.f((Object)canvas, "c");
        e0e.f((Object)recyclerView, "recyclerView");
        e0e.f((Object)recyclerView$c0, "viewHolder");
        final View n = this.n(recyclerView$c0);
        if (b && n.getTag(2131429698) == null) {
            final WeakHashMap a = b7x.a;
            final float i = b7x$i.i(n);
            final int childCount = ((ViewGroup)recyclerView).getChildCount();
            float n2 = 0.0f;
            float n3;
            for (int j = 0; j < childCount; ++j, n2 = n3) {
                final View child = ((ViewGroup)recyclerView).getChildAt(j);
                if (child == n) {
                    n3 = n2;
                }
                else {
                    final WeakHashMap a2 = b7x.a;
                    final float k = b7x$i.i(child);
                    n3 = n2;
                    if (k > n2) {
                        n3 = k;
                    }
                }
            }
            b7x$i.s(n, n2 + 1.0f);
            n.setTag(2131429698, (Object)i);
        }
        n.setTranslationX(translationX);
        n.setTranslationY(translationY);
    }
    
    public final void j(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0) {
        e0e.f((Object)canvas, "c");
        e0e.f((Object)recyclerView, "recyclerView");
        if (recyclerView$c0 != null) {
            this.n(recyclerView$c0);
        }
    }
    
    public final boolean k(final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0, final RecyclerView$c0 recyclerView$c2) {
        e0e.f((Object)recyclerView, "recyclerView");
        e0e.f((Object)recyclerView$c0, "viewHolder");
        return false;
    }
    
    public final void l(final RecyclerView$c0 recyclerView$c0, final int n) {
        if (recyclerView$c0 != null) {
            this.n(recyclerView$c0);
        }
    }
    
    public final void m(final RecyclerView$c0 recyclerView$c0) {
        e0e.f((Object)recyclerView$c0, "viewHolder");
        final Object item = this.d.I0.getItem(recyclerView$c0.L());
        yig$c yig$c;
        if (item instanceof yig$c) {
            yig$c = (yig$c)item;
        }
        else {
            yig$c = null;
        }
        if (yig$c != null) {
            final jng jng = new jng(recyclerView$c0.F0.getContext(), 0);
            jng.s(2131958421);
            ((e.a)jng).a.g = recyclerView$c0.F0.getContext().getString(2131958420, new Object[] { yig$c.b.getUsername() });
            final jng n = jng.p(2131958416, (DialogInterface$OnClickListener)new so1((Object)this, (Object)yig$c, 2)).n(2131952374, (DialogInterface$OnClickListener)new p2s((Object)this, (Object)recyclerView$c0, 0));
            ((e.a)n).a.o = (DialogInterface$OnCancelListener)new fyf((Object)this, (Object)recyclerView$c0, 1);
            ((e.a)n).k();
        }
    }
    
    public final View n(final RecyclerView$c0 recyclerView$c0) {
        final View f0 = recyclerView$c0.F0;
        e0e.d((Object)f0, "null cannot be cast to non-null type android.view.ViewGroup");
        return (View)glp.A0(j8x.b((ViewGroup)f0));
    }
}
