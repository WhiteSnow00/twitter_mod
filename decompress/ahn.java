import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahn extends gue implements rtb<Map<Long, ? extends hfv>, ubq<? extends x21>>
{
    public final /* synthetic */ x21 C0;
    
    public ahn(final x21 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Map map = (Map)o;
        zzd.f((Object)map, "twitterUsers");
        final List a = this.C0.a;
        final ArrayList list = new ArrayList<w21>(kr4.h1((Iterable)a, 10));
        final Iterator iterator = a.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            Object o2 = null;
            if (!hasNext) {
                break;
            }
            final w21 w21 = (w21)iterator.next();
            final hfv e = w21.e();
            if (e != null && (o2 = map.get(e.C0)) == null) {
                o2 = e;
            }
            list.add(w21.a(w21, (rhw)o2));
        }
        final List b = this.C0.b;
        final ArrayList list2 = new ArrayList<w21>(kr4.h1((Iterable)b, 10));
        for (final w21 w22 : b) {
            hfv e2 = w22.e();
            if (e2 != null) {
                final hfv hfv = map.get(e2.C0);
                if (hfv != null) {
                    e2 = hfv;
                }
            }
            else {
                e2 = null;
            }
            list2.add(w21.a(w22, (rhw)e2));
        }
        return n9q.v((Object)x21.a(this.C0, (List)list, (List)list2, (List)null, 12));
    }
}
