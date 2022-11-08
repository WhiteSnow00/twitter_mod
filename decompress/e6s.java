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

public final class e6s implements d6s
{
    public final Set<w6s> a;
    public final c7s b;
    public final Comparator<w6s> c;
    public final List<i7s> d;
    public final hlr<List<i7s>> e;
    public final Map<x6s, i7s> f;
    public List<i7s> g;
    
    public e6s(final Set<w6s> a, final c7s b) {
        zzd.f((Object)a, "defaultItems");
        zzd.f((Object)b, "tabCustomizationPrefs");
        this.a = a;
        this.b = b;
        final e6s$a c = new e6s$a();
        this.c = c;
        this.d = new ArrayList();
        this.e = new zml();
        this.f = new LinkedHashMap();
        final TreeSet set = new TreeSet((Comparator)c);
        or4.j2((Iterable)a, (Collection)set);
        final List m2 = or4.m2((Iterable)set);
        final ArrayList g = new ArrayList<i7s>(kr4.h1((Iterable)m2, 10));
        for (final w6s w6s : m2) {
            zzd.e((Object)w6s, "item");
            final x6s a2 = w6s.a;
            final x6s d0 = x6s.D0;
            i7s i7s;
            if (a2 == d0) {
                i7s = new i7s(w6s.a(w6s), true, false);
                this.f.put(d0, i7s);
                this.d.add(i7s);
            }
            else if (this.f.containsKey(a2)) {
                i7s = new i7s(w6s.a(w6s), true, true);
                this.f.put(w6s.a, i7s);
                this.d.add(i7s);
            }
            else {
                i7s = new i7s(w6s.a(w6s), false, true);
                this.d.add(i7s);
            }
            g.add(i7s);
        }
        this.g = g;
    }
    
    @Override
    public final void a() {
        final LinkedHashMap f = this.f;
        final ArrayList list = new ArrayList<x6s>(f.size());
        final Iterator iterator = f.entrySet().iterator();
        while (iterator.hasNext()) {
            list.add(((Map.Entry<x6s, V>)iterator.next()).getKey());
        }
        this.b.c(or4.M1((Iterable)list, (CharSequence)null, (CharSequence)null, (CharSequence)null, (rtb)null, 63));
        this.b.d();
    }
    
    @Override
    public final void b(final i7s i7s) {
        final w6s a = i7s.a;
        final x6s a2 = a.a;
        final int e = a.e;
        if (e < this.d.size() && i7s.c) {
            if (i7s.b) {
                this.f.put(a2, i7s);
            }
            else {
                this.f.remove(a2);
            }
            this.d.set(e, i7s.a(i7s, false, 7));
            this.e.onNext((Object)or4.m2((Iterable)this.d));
        }
    }
    
    @Override
    public final List<i7s> c() {
        final List k1 = gkr.K1((CharSequence)this.b.b(), new String[] { "," });
        final ArrayList list = new ArrayList();
        final Iterator iterator = k1.iterator();
        while (iterator.hasNext()) {
            final x6s value = x6s.valueOf(gkr.W1((CharSequence)iterator.next()).toString());
            if (value != null) {
                list.add(value);
            }
        }
        final ArrayList g = this.g;
        final ArrayList g2 = new ArrayList<i7s>(kr4.h1((Iterable)g, 10));
        for (final i7s i7s : g) {
            final Iterator iterator3 = list.iterator();
            i7s i7s2;
            while (true) {
                i7s2 = i7s;
                if (!iterator3.hasNext()) {
                    break;
                }
                final x6s x6s = (x6s)iterator3.next();
                final w6s a = i7s.a;
                if (a.a == x6s && x6s != x6s.D0) {
                    i7s2 = new i7s(w6s.a(a), true, true);
                    this.f.put(i7s.a.a, i7s);
                    this.d.set(i7s.a.e, i7s2);
                    break;
                }
                this.e.onNext((Object)or4.m2((Iterable)this.d));
            }
            g2.add(i7s2);
        }
        this.g = g2;
        return this.d;
    }
    
    @Override
    public final Map<x6s, i7s> d() {
        return this.f;
    }
    
    @Override
    public final b5j<List<i7s>> e() {
        return (b5j<List<i7s>>)this.e;
    }
    
    @Override
    public final void f(final List<i7s> list) {
        zzd.f((Object)list, "values");
        this.d.clear();
        this.d.addAll(list);
    }
}
