import android.content.DialogInterface$OnCancelListener;
import androidx.appcompat.app.e$a;
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

public final class d1s extends q$d
{
    public final c4e<hig> d;
    public final jig e;
    public boolean f;
    
    public d1s(final c4e<hig> d, final jig e) {
        zzd.f((Object)d, "adapter");
        zzd.f((Object)e, "actionDispatcher");
        this.d = d;
        this.e = e;
    }
    
    public static final void o(final d1s d1s, final RecyclerView$c0 recyclerView$c0) {
        ((RecyclerView$e)d1s.d).g(recyclerView$c0.L());
        final View n = d1s.n(recyclerView$c0);
        final Object tag = n.getTag(2131429697);
        if (tag instanceof Float) {
            final float floatValue = (float)tag;
            final WeakHashMap a = p5x.a;
            p5x$i.s(n, floatValue);
        }
        n.setTag(2131429697, (Object)null);
        n.setTranslationX(0.0f);
        n.setTranslationY(0.0f);
    }
    
    public final void a(final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0) {
        zzd.f((Object)recyclerView, "recyclerView");
        zzd.f((Object)recyclerView$c0, "viewHolder");
        final View n = this.n(recyclerView$c0);
        final Object tag = n.getTag(2131429697);
        if (tag instanceof Float) {
            final float floatValue = (float)tag;
            final WeakHashMap a = p5x.a;
            p5x$i.s(n, floatValue);
        }
        n.setTag(2131429697, (Object)null);
        n.setTranslationX(0.0f);
        n.setTranslationY(0.0f);
    }
    
    public final int e(final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0) {
        zzd.f((Object)recyclerView, "recyclerView");
        zzd.f((Object)recyclerView$c0, "viewHolder");
        final boolean f = this.f;
        final boolean b = false;
        int h;
        if (!f) {
            h = (b ? 1 : 0);
        }
        else {
            final hig hig = (hig)this.d.F0.getItem(recyclerView$c0.L());
            h = (b ? 1 : 0);
            if (hig instanceof hig$c) {
                final hig$c hig$c = (hig$c)hig;
                h = (b ? 1 : 0);
                if (hig$c.b.getUserStatus() == hio.G0) {
                    h = (b ? 1 : 0);
                    if (!hig$c.e) {
                        h = q$d.h(0, 4);
                    }
                }
            }
        }
        return h;
    }
    
    public final void i(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0, final float translationX, final float translationY, final boolean b) {
        zzd.f((Object)canvas, "c");
        zzd.f((Object)recyclerView, "recyclerView");
        zzd.f((Object)recyclerView$c0, "viewHolder");
        final View n = this.n(recyclerView$c0);
        if (b && n.getTag(2131429697) == null) {
            final WeakHashMap a = p5x.a;
            final float i = p5x$i.i(n);
            final int childCount = ((ViewGroup)recyclerView).getChildCount();
            float n2 = 0.0f;
            float n3;
            for (int j = 0; j < childCount; ++j, n2 = n3) {
                final View child = ((ViewGroup)recyclerView).getChildAt(j);
                if (child == n) {
                    n3 = n2;
                }
                else {
                    final WeakHashMap a2 = p5x.a;
                    final float k = p5x$i.i(child);
                    n3 = n2;
                    if (k > n2) {
                        n3 = k;
                    }
                }
            }
            p5x$i.s(n, n2 + 1.0f);
            n.setTag(2131429697, (Object)i);
        }
        n.setTranslationX(translationX);
        n.setTranslationY(translationY);
    }
    
    public final void j(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0) {
        zzd.f((Object)canvas, "c");
        zzd.f((Object)recyclerView, "recyclerView");
        if (recyclerView$c0 != null) {
            this.n(recyclerView$c0);
        }
    }
    
    public final boolean k(final RecyclerView recyclerView, final RecyclerView$c0 recyclerView$c0, final RecyclerView$c0 recyclerView$c2) {
        zzd.f((Object)recyclerView, "recyclerView");
        zzd.f((Object)recyclerView$c0, "viewHolder");
        return false;
    }
    
    public final void l(final RecyclerView$c0 recyclerView$c0, final int n) {
        if (recyclerView$c0 != null) {
            this.n(recyclerView$c0);
        }
    }
    
    public final void m(final RecyclerView$c0 recyclerView$c0) {
        zzd.f((Object)recyclerView$c0, "viewHolder");
        final Object item = this.d.F0.getItem(recyclerView$c0.L());
        hig$c hig$c;
        if (item instanceof hig$c) {
            hig$c = (hig$c)item;
        }
        else {
            hig$c = null;
        }
        if (hig$c != null) {
            final qmg qmg = new qmg(recyclerView$c0.C0.getContext(), 0);
            qmg.s(2131958421);
            ((e$a)qmg).a.g = recyclerView$c0.C0.getContext().getString(2131958420, new Object[] { hig$c.b.getUsername() });
            final qmg n = qmg.p(2131958416, (DialogInterface$OnClickListener)new tel((Object)this, (Object)hig$c, 2)).n(2131952375, (DialogInterface$OnClickListener)new gv(this, recyclerView$c0, 1));
            ((e$a)n).a.o = (DialogInterface$OnCancelListener)new c1s(this, recyclerView$c0);
            ((e$a)n).k();
        }
    }
    
    public final View n(final RecyclerView$c0 recyclerView$c0) {
        final View c0 = recyclerView$c0.C0;
        zzd.d((Object)c0, "null cannot be cast to non-null type android.view.ViewGroup");
        return (View)tjp.M0(y6x.b((ViewGroup)c0));
    }
}
