import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import android.view.View;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhh
{
    public static ynj<zgh> a(final RecyclerView recyclerView, final h0 h0) {
        final RecyclerView$m layoutManager = recyclerView.getLayoutManager();
        jee.l((Object)layoutManager);
        final View e = h0.e(layoutManager);
        if (e != null) {
            final int i = pcx.i((View)recyclerView);
            if (i >= e.getLeft() && i <= e.getRight()) {
                final int o = recyclerView.O(e);
                final RecyclerView$e adapter = recyclerView.getAdapter();
                jee.l((Object)adapter);
                final int a = c5j.a;
                return (ynj<zgh>)ynj.b((Object)((u6m)adapter).C().m(o));
            }
        }
        final ynj b = ynj.b;
        final int a2 = c5j.a;
        return (ynj<zgh>)b;
    }
}
