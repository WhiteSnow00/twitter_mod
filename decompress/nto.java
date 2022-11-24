import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nto implements mto
{
    public final stb<Object, Boolean> a;
    public final Map<String, List<Object>> b;
    public final Map<String, List<ptb<Object>>> c;
    
    public nto(final Map<String, ? extends List<?>> map, final stb<Object, Boolean> a) {
        e0e.f((Object)a, "canBeSaved");
        this.a = a;
        Map c0;
        if (map != null) {
            c0 = mlg.c0((Map)map);
        }
        else {
            c0 = new LinkedHashMap();
        }
        this.b = (LinkedHashMap)c0;
        this.c = new LinkedHashMap();
    }
    
    @Override
    public final boolean a(final Object o) {
        e0e.f(o, "value");
        return (boolean)this.a.invoke(o);
    }
    
    @Override
    public final a b(final String s, final ptb<?> ptb) {
        e0e.f((Object)s, "key");
        if (slr.k1((CharSequence)s) ^ true) {
            final LinkedHashMap c = this.c;
            Object value;
            if ((value = c.get(s)) == null) {
                value = new ArrayList<ptb<?>>();
                c.put(s, value);
            }
            ((List<ptb<?>>)value).add(ptb);
            return new a(this, s, ptb) {
                public final nto a;
                public final String b;
                public final ptb<Object> c;
                
                @Override
                public final void b() {
                    final List list = (List)this.a.c.remove(this.b);
                    if (list != null) {
                        list.remove(this.c);
                    }
                    if (list != null && (list.isEmpty() ^ true)) {
                        this.a.c.put(this.b, list);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
    
    @Override
    public final Map<String, List<Object>> e() {
        final Map c0 = mlg.c0((Map)this.b);
        for (final Map.Entry<String, V> entry : this.c.entrySet()) {
            final String s = entry.getKey();
            final List list = (List)entry.getValue();
            final int size = list.size();
            int i = 0;
            if (size == 1) {
                final Object invoke = list.get(0).invoke();
                if (invoke == null) {
                    continue;
                }
                if (!this.a(invoke)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c0.put(s, shw.p(new Object[] { invoke }));
            }
            else {
                final int size2 = list.size();
                final ArrayList list2 = new ArrayList<Object>(size2);
                while (i < size2) {
                    final Object invoke2 = list.get(i).invoke();
                    if (invoke2 != null && !this.a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    list2.add(invoke2);
                    ++i;
                }
                c0.put(s, list2);
            }
        }
        return c0;
    }
    
    @Override
    public final Object f(final String s) {
        e0e.f((Object)s, "key");
        final List list = (List)this.b.remove(s);
        Object value;
        if (list != null && (list.isEmpty() ^ true)) {
            if (list.size() > 1) {
                this.b.put(s, list.subList(1, list.size()));
            }
            value = list.get(0);
        }
        else {
            value = null;
        }
        return value;
    }
}
