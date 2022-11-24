import com.twitter.media.ui.image.c;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.nft.subsystem.model.NFTCollection;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$q;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k1i extends b4e<j1i, n1i>
{
    public final znl<x1i> d;
    public final d4e<o4i> e;
    public final List<String> f;
    
    public k1i(final Context context, final znl<x1i> d, final d4e<o4i> e) {
        e0e.f((Object)context, "context");
        e0e.f((Object)d, "seeMoreClickSubject");
        e0e.f((Object)e, "itemBinderDirectory");
        super((Class)j1i.class);
        this.d = d;
        this.e = e;
        context.getResources().getDimensionPixelSize(2131167445);
        final List g = ita.b().g("creator_unsupported_nft_file_extensions");
        e0e.e((Object)g, "getCurrent()\n           \u2026UPPORTED_FILE_EXTENSIONS)");
        this.f = g;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final n1i n1i = (n1i)n8x;
        final j1i j1i = (j1i)o;
        e0e.f((Object)n1i, "viewHolder");
        e0e.f((Object)j1i, "item");
        final fj8 fj8 = new fj8();
        final j4e adapter = new j4e((f5e)fj8, (d4e)this.e, kcm);
        final RecyclerView c1 = n1i.c1;
        if (((View)c1).getTag() == null) {
            ((View)c1).setTag((Object)vzv.a);
            c1.i((RecyclerView$q)new l1i(c1));
        }
        n1i.c1.setNestedScrollingEnabled(false);
        final RecyclerView c2 = n1i.c1;
        n1i.getHeldView().getContext();
        c2.setLayoutManager((RecyclerView$m)new LinearLayoutManager(0));
        n1i.c1.setHasFixedSize(true);
        n1i.c1.setAdapter((RecyclerView$e)adapter);
        ((TextView)n1i.Z0).setText((CharSequence)j1i.a);
        ((c)n1i.b1).p(z8d.g(j1i.b));
        final List c3 = j1i.c;
        if (c3 != null) {
            final ArrayList list = new ArrayList<o4i>(nr4.d1((Iterable)c3, 10));
            for (final u4i u4i : c3) {
                final a5i b = u4i.b;
                final String a = b.a;
                final NFTCollection h = b.h;
                String name;
                if (h != null) {
                    name = h.getName();
                }
                else {
                    name = null;
                }
                list.add(new o4i(a, name, u4i.b.d, u4i.a, u4i.c, 2, o4i.Companion.a(u4i, (List)this.f)));
            }
            fj8.d((p4e)new zkf((Iterable)list));
        }
        ((View)n1i.a1).setOnClickListener((View$OnClickListener)new a2p((Object)this, (Object)j1i, 12));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131624962, viewGroup, false);
        e0e.e((Object)x, "view");
        return (n8x)new n1i(x);
    }
}
