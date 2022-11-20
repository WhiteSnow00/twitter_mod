import java.util.Iterator;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vmi extends dni
{
    public final opk b;
    public final suh<gpk> c;
    public final Map<gpk, hpk> d;
    public zmi e;
    public apk f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    public vmi(final opk b) {
        czd.f((Object)b, "pointerInputNode");
        this.b = b;
        this.c = (suh<gpk>)new suh((Object[])new gpk[16]);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }
    
    @Override
    public final boolean a(final Map<gpk, hpk> map, final eve eve, final qxd qxd, final boolean b) {
        czd.f((Object)map, "changes");
        czd.f((Object)eve, "parentCoordinates");
        final boolean a = super.a(map, eve, qxd, b);
        if (!uoz.H(this.b)) {
            return true;
        }
        final opk b2 = this.b;
        czd.f((Object)b2, "<this>");
        this.e = wd.x((yl8)b2, 16);
        final Iterator<Map.Entry<gpk, hpk>> iterator = map.entrySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final Map.Entry<gpk, V> entry = iterator.next();
            final long a2 = entry.getKey().a;
            final hpk hpk = (hpk)entry.getValue();
            if (!this.c.i((Object)new gpk(a2))) {
                continue;
            }
            final ArrayList<jkc> list = new ArrayList<jkc>();
            for (List b3 = hpk.b(); i < b3.size(); ++i) {
                final jkc jkc = b3.get(i);
                final long a3 = jkc.a;
                final zmi e = this.e;
                czd.c((Object)e);
                list.add(new jkc(a3, e.v(eve, jkc.b)));
            }
            final LinkedHashMap d = this.d;
            final gpk gpk = new gpk(a2);
            final zmi e2 = this.e;
            czd.c((Object)e2);
            final long v = e2.v(eve, hpk.f);
            final zmi e3 = this.e;
            czd.c((Object)e3);
            final hpk hpk2 = new hpk(hpk.a, hpk.b, e3.v(eve, hpk.c), hpk.d, hpk.c(), hpk.e, v, hpk.g, hpk.h, (List)list, hpk.i);
            hpk2.l = hpk.l;
            d.put(gpk, hpk2);
        }
        if (this.d.isEmpty()) {
            this.c.h();
            super.a.h();
            return true;
        }
        for (int n = this.c.F0 - 1; -1 < n; --n) {
            if (!map.containsKey(new gpk(((gpk)this.c.D0[n]).a))) {
                this.c.p(n);
            }
        }
        final List m0 = mq4.M0((Iterable)this.d.values());
        final apk f = new apk(m0, qxd);
        while (true) {
            for (int size = m0.size(), j = 0; j < size; ++j) {
                final Object value = m0.get(j);
                if (qxd.a(((hpk)value).a)) {
                    final hpk hpk3 = (hpk)value;
                    Label_0878: {
                        if (hpk3 != null) {
                            if (!b) {
                                this.h = false;
                            }
                            else if (!this.h && (hpk3.d || hpk3.g)) {
                                final zmi e4 = this.e;
                                czd.c((Object)e4);
                                this.h = (gmw.D(hpk3, ((wgk)e4).F0) ^ true);
                            }
                            final boolean h = this.h;
                            final boolean g = this.g;
                            final int n2 = 5;
                            Label_0779: {
                                if (h != g) {
                                    final int d2 = f.d;
                                    Objects.requireNonNull(cpk.Companion);
                                    if (d2 != 3) {
                                        final int d3 = f.d;
                                        if (d3 != 4 && d3 != 5) {
                                            break Label_0779;
                                        }
                                    }
                                    int d4 = n2;
                                    if (this.h) {
                                        d4 = 4;
                                    }
                                    f.d = d4;
                                    break Label_0878;
                                }
                            }
                            final int d5 = f.d;
                            Objects.requireNonNull(cpk.Companion);
                            if (d5 == 4 && this.g && !this.i) {
                                f.d = 3;
                            }
                            else if (f.d == 5 && this.h && hpk3.d) {
                                f.d = 3;
                            }
                        }
                    }
                    boolean b5 = false;
                    Label_1053: {
                        if (!a) {
                            final int d6 = f.d;
                            Objects.requireNonNull(cpk.Companion);
                            if (d6 == 3) {
                                final apk f2 = this.f;
                                boolean b4 = false;
                                Label_1036: {
                                    Label_1033: {
                                        if (f2 != null) {
                                            if (f2.a.size() == f.a.size()) {
                                                for (int size2 = f.a.size(), k = 0; k < size2; ++k) {
                                                    if (!wfj.b(((hpk)f2.a.get(k)).c, ((hpk)f.a.get(k)).c)) {
                                                        break Label_1033;
                                                    }
                                                }
                                                b4 = false;
                                                break Label_1036;
                                            }
                                        }
                                    }
                                    b4 = true;
                                }
                                if (!b4) {
                                    b5 = false;
                                    break Label_1053;
                                }
                            }
                        }
                        b5 = true;
                    }
                    this.f = f;
                    return b5;
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    @Override
    public final void b(final qxd qxd) {
        super.b(qxd);
        final apk f = this.f;
        if (f == null) {
            return;
        }
        this.g = this.h;
        final List a = f.a;
        final int size = a.size();
        boolean i = false;
        int n = 0;
        while (true) {
            final boolean b = true;
            if (n >= size) {
                break;
            }
            final hpk hpk = a.get(n);
            int n2 = 0;
            Label_0106: {
                if (!hpk.d) {
                    n2 = (b ? 1 : 0);
                    if (!qxd.a(hpk.a)) {
                        break Label_0106;
                    }
                    if (!this.h) {
                        n2 = (b ? 1 : 0);
                        break Label_0106;
                    }
                }
                n2 = 0;
            }
            if (n2 != 0) {
                this.c.n((Object)new gpk(hpk.a));
            }
            ++n;
        }
        this.h = false;
        final int d = f.d;
        Objects.requireNonNull(cpk.Companion);
        if (d == 5) {
            i = true;
        }
        this.i = i;
    }
    
    @Override
    public final void c() {
        final suh<vmi> a = (suh<vmi>)super.a;
        final int f0 = a.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = a.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((vmi)d0[n]).c();
            } while (++n < f0);
        }
        this.b.n();
    }
    
    @Override
    public final boolean d(final qxd qxd) {
        final boolean empty = this.d.isEmpty();
        boolean b = false;
        int n = 0;
        if (!empty) {
            if (uoz.H(this.b)) {
                final apk f = this.f;
                czd.c((Object)f);
                final zmi e = this.e;
                czd.c((Object)e);
                this.b.a(f, bpk.F0, ((wgk)e).F0);
                if (uoz.H(this.b)) {
                    final suh<vmi> a = (suh<vmi>)super.a;
                    final int f2 = a.F0;
                    if (f2 > 0) {
                        final Object[] d0 = a.D0;
                        czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((vmi)d0[n]).d(qxd);
                        } while (++n < f2);
                    }
                }
                b = true;
            }
        }
        this.b(qxd);
        this.d.clear();
        this.e = null;
        return b;
    }
    
    @Override
    public final boolean e(final Map<gpk, hpk> map, final eve eve, final qxd qxd, final boolean b) {
        czd.f((Object)map, "changes");
        czd.f((Object)eve, "parentCoordinates");
        final boolean empty = this.d.isEmpty();
        final boolean b2 = false;
        int n = 0;
        boolean b3;
        if (empty) {
            b3 = b2;
        }
        else if (!uoz.H(this.b)) {
            b3 = b2;
        }
        else {
            final apk f = this.f;
            czd.c((Object)f);
            final zmi e = this.e;
            czd.c((Object)e);
            final long f2 = ((wgk)e).F0;
            this.b.a(f, bpk.D0, f2);
            if (uoz.H(this.b)) {
                final suh<vmi> a = (suh<vmi>)super.a;
                final int f3 = a.F0;
                if (f3 > 0) {
                    final Object[] d0 = a.D0;
                    czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        final vmi vmi = (vmi)d0[n];
                        final LinkedHashMap d2 = this.d;
                        final zmi e2 = this.e;
                        czd.c((Object)e2);
                        vmi.e(d2, (eve)e2, qxd, b);
                    } while (++n < f3);
                }
            }
            if (uoz.H(this.b)) {
                this.b.a(f, bpk.E0, f2);
            }
            b3 = true;
        }
        return b3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Node(pointerInputFilter=");
        j.append(this.b);
        j.append(", children=");
        j.append(super.a);
        j.append(", pointerIds=");
        j.append(this.c);
        j.append(')');
        return j.toString();
    }
}
