import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8p implements oap
{
    public final m9p a;
    
    public a8p(final m9p a) {
        e0e.f((Object)a, "suggestionCache");
        this.a = a;
    }
    
    public final List<x9p> a(final String s, final ptl ptl) {
        e0e.f((Object)s, "untrimmedQuery");
        return (List<x9p>)h3a.F0;
    }
    
    public final List<x9p> b(final String s, final String s2, final ptl ptl) {
        e0e.f((Object)s, "untrimmedQuery");
        e0e.f((Object)s2, "trimmedQuery");
        final ArrayList list = new ArrayList();
        final LinkedHashSet set = new LinkedHashSet();
        final ogv a = this.a.a(s2);
        if (a != null) {
            final List d = a.d;
            e0e.e((Object)d, "tas.channels");
            final b3m a2 = b3m.a;
            final ArrayList list2 = new ArrayList();
            for (final ngv ngv : d) {
                final vfv e = ngv.e;
                e0e.c((Object)e);
                final qgv d2 = ngv.d;
                e0e.c((Object)d2);
                final ptl ptl2 = new ptl(e.b, 0);
                if (!set.contains(ptl2)) {
                    set.add(ptl2);
                    final vfv e2 = ngv.e;
                    e0e.c((Object)e2);
                    final vfv e3 = ngv.e;
                    e0e.c((Object)e3);
                    final String b = e3.b;
                    final vfv e4 = ngv.e;
                    e0e.c((Object)e4);
                    list2.add(new yq3(e2, s, b, e4.a, d2));
                }
            }
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
        }
        return list;
    }
}
