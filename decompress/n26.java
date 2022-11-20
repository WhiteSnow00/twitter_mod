import java.util.HashSet;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;
import com.google.firebase.components.InvalidRegistrarException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n26 extends db implements k26
{
    public final Map<n06<?>, eml<?>> E0;
    public final Map<Class<?>, eml<?>> F0;
    public final Map<Class<?>, m2f<?>> G0;
    public final List<eml<l26>> H0;
    public final v9a I0;
    public final AtomicReference<Boolean> J0;
    
    public n26(Executor executor, Iterable list, Collection iterator, final n26$a n26$a) {
        this.E0 = new HashMap();
        this.F0 = new HashMap();
        this.G0 = new HashMap();
        this.J0 = new AtomicReference<Boolean>();
        final v9a i0 = new v9a(executor);
        this.I0 = i0;
        executor = (Executor)new ArrayList();
        ((ArrayList<n06>)executor).add(n06.d((Object)i0, (Class)v9a.class, new Class[] { xmr.class, qnl.class }));
        ((ArrayList<n06>)executor).add(n06.d((Object)this, (Class)k26.class, new Class[0]));
        for (final n06 n06 : iterator) {
            if (n06 != null) {
                ((ArrayList<n06>)executor).add(n06);
            }
        }
        final ArrayList<eml> h0 = new ArrayList<eml>();
        final Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            h0.add((eml)iterator3.next());
        }
        this.H0 = h0;
        list = new ArrayList();
        synchronized (this) {
            iterator = h0.iterator();
            while (iterator.hasNext()) {
                final eml eml = iterator.next();
                try {
                    final l26 l26 = (l26)eml.get();
                    if (l26 == null) {
                        continue;
                    }
                    ((ArrayList<Object>)executor).addAll(l26.getComponents());
                    iterator.remove();
                }
                catch (final InvalidRegistrarException ex) {
                    iterator.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", (Throwable)ex);
                }
            }
            if (this.E0.isEmpty()) {
                kd7.a((List)executor);
            }
            else {
                final ArrayList list2 = new ArrayList(this.E0.keySet());
                list2.addAll((Collection)executor);
                kd7.a((List)list2);
            }
            for (final n06 n7 : executor) {
                this.E0.put(n7, new owe((eml)new xza((Object)this, (Object)n7, 1)));
            }
            list.addAll(this.w0((List<n06<?>>)executor));
            list.addAll(this.x0());
            this.v0();
            monitorexit(this);
            final Iterator iterator5 = list.iterator();
            while (iterator5.hasNext()) {
                ((Runnable)iterator5.next()).run();
            }
            final Boolean b = this.J0.get();
            if (b != null) {
                this.t0(this.E0, b);
            }
        }
    }
    
    public final <T> eml<T> I(final Class<T> clazz) {
        synchronized (this) {
            return this.F0.get(clazz);
        }
    }
    
    public final <T> sk8<T> j0(final Class<T> clazz) {
        final eml<T> i = this.I(clazz);
        if (i == null) {
            return (sk8<T>)new coj((sk8$a)z61.K0, (eml)boj.a);
        }
        if (i instanceof coj) {
            return (sk8<T>)i;
        }
        return (sk8<T>)new coj((sk8$a)null, (eml)i);
    }
    
    public final <T> eml<Set<T>> n(final Class<T> clazz) {
        synchronized (this) {
            final m2f m2f = this.G0.get(clazz);
            if (m2f != null) {
                return (eml<Set<T>>)m2f;
            }
            return (eml<Set<T>>)m26.a;
        }
    }
    
    public final void t0(final Map<n06<?>, eml<?>> map, final boolean b) {
        for (final Map.Entry<n06, V> entry : map.entrySet()) {
            final n06 n06 = entry.getKey();
            final eml eml = (eml)entry.getValue();
            final int c = n06.c;
            final int n7 = 0;
            if (c != 1) {
                int n8 = n7;
                if (c == 2) {
                    n8 = 1;
                }
                if (n8 == 0 || !b) {
                    continue;
                }
            }
            eml.get();
        }
        final v9a i0 = this.I0;
        monitorenter(i0);
        Label_0145: {
            try {
                final ArrayDeque b2 = i0.b;
                if (b2 != null) {
                    i0.b = null;
                    break Label_0145;
                }
                break Label_0145;
            }
            finally {
                monitorexit(i0);
                final ArrayDeque b2 = null;
                break Label_0145;
                while (true) {
                    while (true) {
                        final Iterator iterator2;
                        iftrue(Label_0326:)(!iterator2.hasNext());
                        Block_11: {
                            break Block_11;
                            iterator2 = b2.iterator();
                            continue;
                        }
                        final l9a l9a = (l9a)iterator2.next();
                        Objects.requireNonNull(l9a);
                        synchronized (i0) {
                            final ArrayDeque b3 = i0.b;
                            if (b3 != null) {
                                b3.add(l9a);
                                continue;
                            }
                            monitorexit(i0);
                            synchronized (i0) {
                                final Map map2 = i0.a.get(null);
                                Set<Map.Entry<K, Executor>> set;
                                if (map2 == null) {
                                    set = Collections.emptySet();
                                }
                                else {
                                    set = map2.entrySet();
                                }
                                monitorexit(i0);
                                for (final Map.Entry<K, Executor> entry2 : set) {
                                    entry2.getValue().execute((Runnable)new prm((Object)entry2, (Object)l9a, 7));
                                }
                            }
                        }
                        break;
                    }
                    return;
                    monitorexit(i0);
                    iftrue(Label_0326:)(b2 == null);
                    continue;
                }
                Label_0326:;
            }
        }
    }
    
    public final void u0(final boolean b) {
        if (!this.J0.compareAndSet(null, b)) {
            return;
        }
        synchronized (this) {
            final HashMap<n06<?>, eml<?>> hashMap = new HashMap<n06<?>, eml<?>>(this.E0);
            monitorexit(this);
            this.t0(hashMap, b);
        }
    }
    
    public final void v0() {
        for (final n06 n06 : this.E0.keySet()) {
            for (final oo8 oo8 : n06.b) {
                if (oo8.a() && !this.G0.containsKey(oo8.a)) {
                    this.G0.put(oo8.a, new m2f((Collection)Collections.emptySet()));
                }
                else {
                    if (this.F0.containsKey(oo8.a)) {
                        continue;
                    }
                    if (oo8.b == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", n06, oo8.a));
                    }
                    if (oo8.a()) {
                        continue;
                    }
                    this.F0.put(oo8.a, new coj((sk8$a)z61.K0, (eml)boj.a));
                }
            }
        }
    }
    
    public final List<Runnable> w0(final List<n06<?>> list) {
        final ArrayList list2 = new ArrayList();
        for (final n06 n06 : list) {
            if (!n06.c()) {
                continue;
            }
            final eml eml = this.E0.get(n06);
            for (final Class clazz : n06.a) {
                if (!this.F0.containsKey(clazz)) {
                    this.F0.put(clazz, eml);
                }
                else {
                    list2.add(new f01((Object)this.F0.get(clazz), (Object)eml, 1));
                }
            }
        }
        return list2;
    }
    
    public final List<Runnable> x0() {
        final ArrayList list = new ArrayList();
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<n06, V> entry : this.E0.entrySet()) {
            final n06 n06 = entry.getKey();
            if (n06.c()) {
                continue;
            }
            final eml eml = (eml)entry.getValue();
            for (final Class clazz : n06.a) {
                if (!hashMap.containsKey(clazz)) {
                    hashMap.put(clazz, new HashSet());
                }
                ((Set<eml>)hashMap.get(clazz)).add(eml);
            }
        }
        for (final Map.Entry<Object, V> entry2 : hashMap.entrySet()) {
            if (!this.G0.containsKey(entry2.getKey())) {
                this.G0.put(entry2.getKey(), new m2f((Collection)entry2.getValue()));
            }
            else {
                final m2f m2f = this.G0.get(entry2.getKey());
                final Iterator iterator4 = ((Set)entry2.getValue()).iterator();
                while (iterator4.hasNext()) {
                    list.add(new g01((Object)m2f, (Object)iterator4.next(), 2));
                }
            }
        }
        return list;
    }
}
