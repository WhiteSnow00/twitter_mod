import java.util.Iterator;
import java.util.Collection;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7s implements q7s
{
    public final Set<j8s> a;
    public final p8s b;
    public final Comparator<j8s> c;
    public final List<v8s> d;
    public final xmr<List<v8s>> e;
    public final Map<k8s, v8s> f;
    public List<v8s> g;
    
    public r7s(final Set<j8s> a, final p8s b) {
        e0e.f((Object)a, "defaultItems");
        e0e.f((Object)b, "tabCustomizationPrefs");
        this.a = a;
        this.b = b;
        final Comparator c = new Comparator() {
            @Override
            public final int compare(final T t, final T t2) {
                return tqb.r(((j8s)t).e, ((j8s)t2).e);
            }
        };
        this.c = c;
        this.d = new ArrayList();
        this.e = new znl();
        this.f = new LinkedHashMap();
        final TreeSet set = new TreeSet(c);
        rr4.f2((Iterable)a, (Collection)set);
        final List i2 = rr4.i2((Iterable)set);
        final ArrayList g = new ArrayList<v8s>(nr4.d1((Iterable)i2, 10));
        for (final j8s j8s : i2) {
            e0e.e((Object)j8s, "item");
            final k8s a2 = j8s.a;
            final k8s g2 = k8s.G0;
            v8s v8s;
            if (a2 == g2) {
                v8s = new v8s(j8s.a(j8s), true, false);
                this.f.put(g2, v8s);
                this.d.add(v8s);
            }
            else if (this.f.containsKey(a2)) {
                v8s = new v8s(j8s.a(j8s), true, true);
                this.f.put(j8s.a, v8s);
                this.d.add(v8s);
            }
            else {
                v8s = new v8s(j8s.a(j8s), false, true);
                this.d.add(v8s);
            }
            g.add(v8s);
        }
        this.g = g;
    }
    
    public final void a() {
        final LinkedHashMap f = this.f;
        final ArrayList list = new ArrayList<k8s>(f.size());
        final Iterator iterator = f.entrySet().iterator();
        while (iterator.hasNext()) {
            list.add(((Map.Entry<k8s, V>)iterator.next()).getKey());
        }
        this.b.c(rr4.I1((Iterable)list, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)null, 63));
        this.b.d();
    }
    
    public final void b(final v8s v8s) {
        final j8s a = v8s.a;
        final k8s a2 = a.a;
        final int e = a.e;
        if (e < this.d.size() && v8s.c) {
            if (v8s.b) {
                this.f.put(a2, v8s);
            }
            else {
                this.f.remove(a2);
            }
            this.d.set(e, v8s.a(v8s, false, 7));
            this.e.onNext((Object)rr4.i2((Iterable)this.d));
        }
    }
    
    public final List<v8s> c() {
        final List n1 = wlr.N1((CharSequence)this.b.b(), new String[] { "," });
        final ArrayList list = new ArrayList();
        final Iterator iterator = n1.iterator();
        while (iterator.hasNext()) {
            final k8s value = k8s.valueOf(wlr.Z1((CharSequence)iterator.next()).toString());
            if (value != null) {
                list.add(value);
            }
        }
        final ArrayList g = this.g;
        final ArrayList g2 = new ArrayList<v8s>(nr4.d1((Iterable)g, 10));
        for (final v8s v8s : g) {
            final Iterator iterator3 = list.iterator();
            v8s v8s2;
            while (true) {
                v8s2 = v8s;
                if (!iterator3.hasNext()) {
                    break;
                }
                final k8s k8s = (k8s)iterator3.next();
                final j8s a = v8s.a;
                if (a.a == k8s && k8s != k8s.G0) {
                    v8s2 = new v8s(j8s.a(a), true, true);
                    this.f.put(v8s.a.a, v8s);
                    this.d.set(v8s.a.e, v8s2);
                    break;
                }
                this.e.onNext((Object)rr4.i2((Iterable)this.d));
            }
            g2.add(v8s2);
        }
        this.g = g2;
        return this.d;
    }
    
    public final Map<k8s, v8s> d() {
        return this.f;
    }
    
    public final t5j<List<v8s>> e() {
        return (t5j<List<v8s>>)this.e;
    }
    
    public final void f(final List<v8s> list) {
        e0e.f((Object)list, "values");
        this.d.clear();
        this.d.addAll(list);
    }
}
