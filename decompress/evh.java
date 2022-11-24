import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Collection;
import java.util.Map;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class evh extends piq
{
    public final stb<Object, vzv> e;
    public final stb<Object, vzv> f;
    public Set<ear> g;
    public siq h;
    public int[] i;
    public int j;
    public boolean k;
    
    public evh(final int n, final siq siq, final stb<Object, vzv> e, final stb<Object, vzv> f) {
        e0e.f((Object)siq, "invalid");
        super(n, siq);
        this.e = e;
        this.f = f;
        Objects.requireNonNull(siq.Companion);
        this.h = siq.J0;
        this.i = new int[0];
        this.j = 1;
    }
    
    public final void A() {
        final boolean k = this.k;
        boolean b = false;
        if (!k || super.d >= 0) {
            b = true;
        }
        if (b) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
    }
    
    @Override
    public final void b() {
        uiq.d = uiq.d.g(this.d()).e(this.h);
    }
    
    @Override
    public void c() {
        if (!super.c) {
            super.c();
            this.k(this);
        }
    }
    
    @Override
    public final stb<Object, vzv> f() {
        return this.e;
    }
    
    @Override
    public boolean g() {
        return false;
    }
    
    @Override
    public final stb<Object, vzv> h() {
        return this.f;
    }
    
    @Override
    public void j(final piq piq) {
        e0e.f((Object)piq, "snapshot");
        ++this.j;
    }
    
    @Override
    public void k(final piq piq) {
        e0e.f((Object)piq, "snapshot");
        final int j = this.j;
        if (j > 0) {
            final int i = j - 1;
            this.j = i;
            if (i == 0 && !this.k) {
                final Set<ear> v = this.v();
                if (v != null) {
                    if (!(true ^ this.k)) {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                    this.y(null);
                    final int d = this.d();
                    final Iterator<ear> iterator = v.iterator();
                    while (iterator.hasNext()) {
                        for (gar gar = iterator.next().k(); gar != null; gar = gar.b) {
                            final int a = gar.a;
                            if (a == d || rr4.u1((Iterable)this.h, (Object)a)) {
                                gar.a = 0;
                            }
                        }
                    }
                }
                this.a();
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public void l() {
        if (!this.k) {
            if (!super.c) {
                this.t();
            }
        }
    }
    
    @Override
    public void m(final ear ear) {
        e0e.f((Object)ear, "state");
        Set<ear> v;
        if ((v = this.v()) == null) {
            v = new HashSet<ear>();
            this.y(v);
        }
        v.add(ear);
    }
    
    @Override
    public final void o() {
        for (int length = this.i.length, i = 0; i < length; ++i) {
            uiq.s(this.i[i]);
        }
        this.n();
    }
    
    @Override
    public piq s(final stb<Object, vzv> stb) {
        if (super.c ^ true) {
            this.A();
            final int d = this.d();
            this.x(this.d());
            synchronized (uiq.c) {
                final int e = uiq.e;
                uiq.e = e + 1;
                uiq.d = uiq.d.k(e);
                final ici ici = new ici(e, uiq.e(this.e(), d + 1, e), (stb)stb, (piq)this);
                monitorexit(uiq.c);
                if (!this.k && !super.c) {
                    final int d2 = this.d();
                    synchronized (uiq.c) {
                        final int e2 = uiq.e;
                        uiq.e = e2 + 1;
                        this.q(e2);
                        uiq.d = uiq.d.k(this.d());
                        monitorexit(uiq.c);
                        this.r(uiq.e(this.e(), d2 + 1, this.d()));
                    }
                }
                return (piq)ici;
            }
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }
    
    public final void t() {
        this.x(this.d());
        if (!this.k && !super.c) {
            final int d = this.d();
            synchronized (uiq.c) {
                final int e = uiq.e;
                uiq.e = e + 1;
                this.q(e);
                uiq.d = uiq.d.k(this.d());
                monitorexit(uiq.c);
                this.r(uiq.e(this.e(), d + 1, this.d()));
            }
        }
    }
    
    public qiq u() {
        final Set<ear> v = this.v();
        Map c;
        if (v != null) {
            final AtomicReference i = uiq.i;
            final Object value = i.get();
            e0e.e(value, "currentGlobalSnapshot.get()");
            c = uiq.c((evh)value, this, uiq.d.g(((piq)i.get()).b));
        }
        else {
            c = null;
        }
        Object c2 = uiq.c;
        synchronized (c2) {
            uiq.d((piq)this);
            awj awj;
            if (v != null && v.size() != 0) {
                final d5c d5c = uiq.i.get();
                final qiq w = this.w(uiq.e, c, uiq.d.g(((piq)d5c).b));
                if (!e0e.a((Object)w, (Object)qiq.b.a)) {
                    return w;
                }
                this.b();
                final uiq$a a = uiq.a;
                uiq.t((piq)d5c, (stb)uiq.a);
                final Set<ear> g = ((evh)d5c).g;
                this.y(null);
                ((evh)d5c).g = null;
                awj = new awj((Object)rr4.l2((Collection)uiq.g), (Object)g);
            }
            else {
                this.b();
                final d5c d5c2 = uiq.i.get();
                e0e.e((Object)d5c2, "previousGlobalSnapshot");
                final uiq$a a2 = uiq.a;
                uiq.t((piq)d5c2, (stb)uiq.a);
                final Set<ear> g2 = ((evh)d5c2).g;
                if (g2 != null && (g2.isEmpty() ^ true)) {
                    awj = new awj((Object)rr4.l2((Collection)uiq.g), (Object)g2);
                }
                else {
                    awj = new awj((Object)h3a.F0, (Object)null);
                }
            }
            monitorexit(c2);
            c2 = awj.F0;
            final Set set = (Set)awj.G0;
            this.k = true;
            final int n = 0;
            if (set != null && (set.isEmpty() ^ true)) {
                for (int size = ((List)c2).size(), j = 0; j < size; ++j) {
                    ((hub)((List)c2).get(j)).invoke((Object)set, (Object)this);
                }
            }
            if (v != null && (v.isEmpty() ^ true)) {
                for (int size2 = ((List)c2).size(), k = 0; k < size2; ++k) {
                    ((hub)((List)c2).get(k)).invoke((Object)v, (Object)this);
                }
            }
            synchronized (uiq.c) {
                for (int length = this.i.length, l = n; l < length; ++l) {
                    uiq.s(this.i[l]);
                }
                this.n();
                return (qiq)qiq.b.a;
            }
        }
    }
    
    public Set<ear> v() {
        return this.g;
    }
    
    public final qiq w(int i, final Map<gar, ? extends gar> map, final siq siq) {
        e0e.f((Object)siq, "invalidSnapshots");
        final siq j = this.e().k(this.d()).j(this.h);
        final Set<ear> v = this.v();
        e0e.c((Object)v);
        final Iterator<ear> iterator = v.iterator();
        List list = null;
        Collection collection = null;
        while (iterator.hasNext()) {
            final ear ear = iterator.next();
            final gar k = ear.k();
            final gar q = uiq.q(k, i, siq);
            if (q == null) {
                continue;
            }
            final gar q2 = uiq.q(k, this.d(), j);
            if (q2 == null) {
                continue;
            }
            if (e0e.a((Object)q, (Object)q2)) {
                continue;
            }
            final gar q3 = uiq.q(k, this.d(), this.e());
            if (q3 == null) {
                uiq.p();
                throw null;
            }
            gar n;
            if (map == null || (n = map.get(q)) == null) {
                n = ear.n(q2, q, q3);
            }
            if (n == null) {
                return new qiq.a(this);
            }
            if (e0e.a((Object)n, (Object)q3)) {
                continue;
            }
            if (e0e.a((Object)n, (Object)q)) {
                List list2;
                if ((list2 = list) == null) {
                    list2 = new ArrayList();
                }
                list2.add(new awj((Object)ear, (Object)q.b()));
                List<ear> list3;
                if ((list3 = (List<ear>)collection) == null) {
                    list3 = new ArrayList<ear>();
                }
                list3.add(ear);
                list = list2;
                collection = list3;
            }
            else {
                List list4;
                if ((list4 = list) == null) {
                    list4 = new ArrayList();
                }
                awj awj;
                if (!e0e.a((Object)n, (Object)q2)) {
                    awj = new awj((Object)ear, (Object)n);
                }
                else {
                    awj = new awj((Object)ear, (Object)q2.b());
                }
                list4.add(awj);
                list = list4;
            }
        }
        if (list != null) {
            this.t();
            i = 0;
            while (i < list.size()) {
                final awj awj2 = (awj)list.get(i);
                final ear ear2 = (ear)awj2.F0;
                final gar gar = (gar)awj2.G0;
                gar.a = this.d();
                synchronized (uiq.c) {
                    gar.b = ear2.k();
                    ear2.g(gar);
                    monitorexit(uiq.c);
                    ++i;
                    continue;
                }
                break;
            }
        }
        if (collection != null) {
            v.removeAll(collection);
        }
        return (qiq)qiq.b.a;
    }
    
    public final void x(final int n) {
        synchronized (uiq.c) {
            this.h = this.h.k(n);
        }
    }
    
    public void y(final Set<ear> g) {
        this.g = g;
    }
    
    public evh z(final stb<Object, vzv> stb, final stb<Object, vzv> stb2) {
        if (super.c ^ true) {
            this.A();
            this.x(this.d());
            synchronized (uiq.c) {
                final int e = uiq.e;
                uiq.e = e + 1;
                uiq.d = uiq.d.k(e);
                final siq e2 = this.e();
                this.r(e2.k(e));
                final hci hci = new hci(e, uiq.e(e2, this.d() + 1, e), uiq.k((stb)stb, (stb)this.e, true), uiq.b((stb)stb2, (stb)this.f), this);
                monitorexit(uiq.c);
                if (!this.k && !super.c) {
                    final int d = this.d();
                    synchronized (uiq.c) {
                        final int e3 = uiq.e;
                        uiq.e = e3 + 1;
                        this.q(e3);
                        uiq.d = uiq.d.k(this.d());
                        monitorexit(uiq.c);
                        this.r(uiq.e(this.e(), d + 1, this.d()));
                    }
                }
                return (evh)hci;
            }
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }
}
