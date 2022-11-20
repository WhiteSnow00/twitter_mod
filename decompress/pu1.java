import java.util.Iterator;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pu1
{
    public final l7x a;
    public final k7x b;
    public final xbm c;
    
    public pu1(final pm6 pm6, final l7x a, final k7x b, final wm6 wm6, final xbm c) {
        czd.f((Object)a, "bceRegistrar");
        czd.f((Object)b, "eventSourceFactory");
        czd.f((Object)wm6, "contentViewBceMetadata");
        czd.f((Object)c, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        if (pm6 != null) {
            final View view = pm6.getView();
            if (view != null) {
                if (wm6 instanceof wm6.b) {
                    this.a((lca<f7x>)b.c(view), ((wm6.b)wm6).a);
                }
                else if (wm6 instanceof wm6.a) {
                    final List<ou1> a2 = ((wm6.a)wm6).a;
                    Object c2 = b.c(view);
                    final Iterator iterator = mq4.z0((Iterable)a2).iterator();
                    while (iterator.hasNext()) {
                        this.a((lca<f7x>)c2, (ou1)iterator.next());
                        final sbm sbm = new sbm(this.c);
                        this.a.i((lca)c2, sbm.D0);
                        c2 = sbm;
                    }
                }
            }
        }
    }
    
    public final void a(final lca<f7x> lca, final ou1 ou1) {
        this.a.a((lca)lca, (y00)new yse(ou1.a, (String)null, 2, (rf8)null));
        this.a.a((lca)lca, (y00)new nmp(ou1.b));
    }
}
