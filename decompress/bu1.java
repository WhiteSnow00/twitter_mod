import android.view.ViewParent;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bu1 implements au1
{
    public final wca<f7x, y00> a;
    public final oca<View, f7x> b;
    public final g9h<y00> c;
    public final xbm d;
    
    public bu1(final wca<f7x, y00> a, final oca<View, f7x> b, final g9h<y00> c, final xbm d) {
        czd.f((Object)a, "eventSourceRegistrar");
        czd.f((Object)b, "eventSourceFactory");
        czd.f((Object)c, "metadataFetcher");
        czd.f((Object)d, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void c(final View view, final zt1 zt1) {
        Object b = this.b.b((Object)view);
        for (final qu1 qu1 : zt1.a) {
            final sbm sbm = new sbm(this.d);
            final Iterator iterator2 = qu1.a.iterator();
            while (iterator2.hasNext()) {
                this.a.g((lca)sbm, (qca)iterator2.next());
            }
            this.a.i((lca)b, sbm.D0);
            b = sbm;
        }
    }
    
    @Override
    public final zt1 e(View view) {
        czd.f((Object)view, "view");
        final ArrayList list = new ArrayList();
        lca a;
        while (true) {
            a = null;
            if (view == null) {
                break;
            }
            if (this.b.a((Object)view) != null) {
                a = this.b.a((Object)view);
                break;
            }
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View)parent;
            }
            else {
                view = null;
            }
        }
        if (a != null) {
            list.add(new qu1(this.c.b(a.getId())));
            final Iterator iterator = this.c.c(a.getId()).iterator();
            while (iterator.hasNext()) {
                list.add(new qu1((Set)iterator.next()));
            }
        }
        return new zt1((List)list);
    }
}
