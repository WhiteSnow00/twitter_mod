import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omq
{
    public static final Map<String, Class<?>> a;
    
    static {
        final kkg t = kkg.t();
        t.w((Object)"events", (Object)mda.class);
        t.w((Object)"topics", (Object)a3m.class);
        t.w((Object)"users", (Object)ljw.class);
        t.w((Object)"channels", (Object)yq3.class);
        a = (Map)((z4j)t).e();
    }
    
    public static final List<x9p> a(final List<x9p> list, final List<String> list2, final x9p x9p) {
        if (kr4.t((Collection)list2)) {
            return list;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0e.c((Object)list2);
        final Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            linkedHashMap.put(omq.a.get(iterator.next()), ojf.H());
        }
        final ojf h = ojf.H();
        for (final x9p x9p2 : list) {
            if (linkedHashMap.containsKey(x9p2.getClass())) {
                final Object value = linkedHashMap.get(x9p2.getClass());
                e0e.c(value);
                ((ojf)value).p((Object)x9p2);
            }
            else {
                h.p((Object)x9p2);
            }
        }
        final ojf h2 = ojf.H();
        if (x9p != null) {
            h2.p((Object)x9p);
            final b3m a = b3m.a;
            h2.p((Object)b3m.b);
        }
        final Iterator iterator3 = linkedHashMap.entrySet().iterator();
        while (iterator3.hasNext()) {
            h2.q((Iterable)((Map.Entry<K, ojf>)iterator3.next()).getValue());
        }
        h2.q((Iterable)h);
        return (List)((z4j)h2).e();
    }
}
