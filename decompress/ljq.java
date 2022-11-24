import java.util.Objects;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljq<K, V> implements Map<K, V>, ear, noe
{
    public a F0;
    public final Set<Entry<K, V>> G0;
    public final Set<K> H0;
    public final Collection<V> I0;
    
    public ljq() {
        this.F0 = new a(amz.y());
        this.G0 = new xiq(this);
        this.H0 = new yiq(this);
        this.I0 = new ajq(this);
    }
    
    public final int a() {
        return this.c().d;
    }
    
    public final a<K, V> c() {
        final a f0 = this.F0;
        e0e.d((Object)f0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a)uiq.r((gar)f0, (ear)this);
    }
    
    @Override
    public final void clear() {
        final a f0 = this.F0;
        e0e.d((Object)f0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        final a a = (a)uiq.h((gar)f0);
        final dak y = amz.y();
        if (y != a.c) {
            final Object a2 = mjq.a;
            synchronized (mjq.a) {
                final a f2 = this.F0;
                e0e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final uiq$a a3 = uiq.a;
                synchronized (uiq.c) {
                    Objects.requireNonNull(piq.Companion);
                    final piq j = uiq.j();
                    final a a4 = (a)uiq.u((gar)f2, (ear)this, j);
                    a4.c = y;
                    ++a4.d;
                    monitorexit(uiq.c);
                    uiq.n(j, (ear)this);
                }
            }
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.c().c.containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.c().c.containsValue(o);
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        return (Set<Entry<K, V>>)this.G0;
    }
    
    public final void g(final gar gar) {
        this.F0 = (a)gar;
    }
    
    @Override
    public final V get(final Object o) {
        return this.c().c.get(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.c().c.isEmpty();
    }
    
    public final gar k() {
        return this.F0;
    }
    
    @Override
    public final Set<K> keySet() {
        return (Set<K>)this.H0;
    }
    
    public final gar n(final gar gar, final gar gar2, final gar gar3) {
        return null;
    }
    
    @Override
    public final V put(final K k, final V v) {
        while (true) {
            final Object a = mjq.a;
            synchronized (mjq.a) {
                final a f0 = this.F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final a a2 = (a)uiq.h((gar)f0);
                final dak<K, ? extends V> c = a2.c;
                final int d = a2.d;
                monitorexit(mjq.a);
                e0e.c((Object)c);
                final dak.dak$a<K, ? extends V> l = c.l();
                final V put = ((Map<K, V>)l).put(k, v);
                final dak b = ((dak$a)l).b();
                if (!e0e.a((Object)b, (Object)c)) {
                    synchronized (mjq.a) {
                        final a f2 = this.F0;
                        e0e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        final uiq$a a3 = uiq.a;
                        synchronized (uiq.c) {
                            Objects.requireNonNull(piq.Companion);
                            final piq j = uiq.j();
                            final a a4 = (a)uiq.u((gar)f2, (ear)this, j);
                            final int d2 = a4.d;
                            boolean b2 = true;
                            if (d2 == d) {
                                a4.c(b);
                                ++a4.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(uiq.c);
                            uiq.n(j, (ear)this);
                            monitorexit(mjq.a);
                            if (b2) {
                                return put;
                            }
                            continue;
                        }
                    }
                }
                return put;
            }
        }
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        e0e.f((Object)map, "from");
        while (true) {
            final Object a = mjq.a;
            synchronized (mjq.a) {
                final a f0 = this.F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final a a2 = (a)uiq.h((gar)f0);
                final dak<K, ? extends V> c = a2.c;
                final int d = a2.d;
                monitorexit(mjq.a);
                e0e.c((Object)c);
                final dak.dak$a<K, ? extends V> l = c.l();
                ((Map)l).putAll(map);
                final dak b = ((dak$a)l).b();
                if (!e0e.a((Object)b, (Object)c)) {
                    monitorenter(mjq.a);
                    try {
                        final a f2 = this.F0;
                        e0e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        final uiq$a a3 = uiq.a;
                        synchronized (uiq.c) {
                            Objects.requireNonNull(piq.Companion);
                            final piq j = uiq.j();
                            final a a4 = (a)uiq.u((gar)f2, (ear)this, j);
                            final int d2 = a4.d;
                            boolean b2 = true;
                            if (d2 == d) {
                                a4.c(b);
                                ++a4.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(uiq.c);
                            uiq.n(j, (ear)this);
                            monitorexit(mjq.a);
                            if (b2) {
                                return;
                            }
                            continue;
                        }
                    }
                    finally {}
                }
            }
        }
    }
    
    @Override
    public final V remove(final Object o) {
        while (true) {
            final Object a = mjq.a;
            synchronized (mjq.a) {
                final a f0 = this.F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final a a2 = (a)uiq.h((gar)f0);
                final dak<K, ? extends V> c = a2.c;
                final int d = a2.d;
                monitorexit(mjq.a);
                e0e.c((Object)c);
                final dak.dak$a<K, ? extends V> l = c.l();
                final V remove = (V)((Map<K, ? extends V>)l).remove(o);
                final dak b = ((dak$a)l).b();
                if (!e0e.a((Object)b, (Object)c)) {
                    synchronized (mjq.a) {
                        final a f2 = this.F0;
                        e0e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        final uiq$a a3 = uiq.a;
                        synchronized (uiq.c) {
                            Objects.requireNonNull(piq.Companion);
                            final piq j = uiq.j();
                            final a a4 = (a)uiq.u((gar)f2, (ear)this, j);
                            final int d2 = a4.d;
                            boolean b2 = true;
                            if (d2 == d) {
                                a4.c(b);
                                ++a4.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(uiq.c);
                            uiq.n(j, (ear)this);
                            monitorexit(mjq.a);
                            if (b2) {
                                return (V)remove;
                            }
                            continue;
                        }
                    }
                }
                return (V)remove;
            }
        }
    }
    
    @Override
    public final int size() {
        return this.c().c.size();
    }
    
    @Override
    public final Collection<V> values() {
        return (Collection<V>)this.I0;
    }
    
    public static final class a<K, V> extends gar
    {
        public dak<K, ? extends V> c;
        public int d;
        
        public a(final dak<K, ? extends V> c) {
            e0e.f((Object)c, "map");
            this.c = c;
        }
        
        public final void a(final gar gar) {
            e0e.f((Object)gar, "value");
            final a a = (a)gar;
            final Object a2 = mjq.a;
            synchronized (mjq.a) {
                this.c = a.c;
                this.d = a.d;
            }
        }
        
        public final gar b() {
            return new a<Object, Object>(this.c);
        }
        
        public final void c(final dak<K, ? extends V> c) {
            e0e.f((Object)c, "<set-?>");
            this.c = c;
        }
    }
}
