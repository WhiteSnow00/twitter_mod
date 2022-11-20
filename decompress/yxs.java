import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yxs
{
    public static List<gfv> a(final Context context, final cxs cxs) {
        if (cxs instanceof vtu) {
            final bo6 k = ((vtu)cxs).k;
            String s;
            if (k.m0()) {
                s = "focal";
            }
            else if (k.i0()) {
                s = "ancestor";
            }
            else {
                s = null;
            }
            return ze4.k(context, k, s);
        }
        if (cxs instanceof rss) {
            return i5e.k((Iterable)new j4e((Iterable)((rss)cxs).k, (Object)new xxs((Object)context, 0), 1));
        }
        if (cxs.f() == null) {
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            return (List<gfv>)e0;
        }
        final gfv gfv = new gfv();
        gfv.R0 = cxs.f();
        return fq4.C((Object[])new gfv[] { gfv });
    }
}
