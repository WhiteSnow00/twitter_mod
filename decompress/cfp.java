import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfp
{
    public final tfp a;
    public final puh<kep> b;
    public qsb<? super kep, fzv> c;
    public sbc d;
    public jh4 e;
    public vjs f;
    public peb g;
    public final hwj h;
    public wfj i;
    public eve j;
    public final hwj k;
    public final hwj l;
    public final hwj m;
    public final hwj n;
    public final hwj o;
    public final hwj p;
    
    public cfp(final tfp a) {
        czd.f((Object)a, "selectionRegistrar");
        this.a = a;
        this.b = (hwj)blz.Q(null);
        this.c = (qsb<? super kep, fzv>)cfp$h.D0;
        this.g = new peb();
        this.h = (hwj)blz.Q(Boolean.FALSE);
        Objects.requireNonNull(wfj.Companion);
        final long b = wfj.b;
        this.k = (hwj)blz.Q(new wfj(b));
        this.l = (hwj)blz.Q(new wfj(b));
        this.m = (hwj)blz.Q(null);
        this.n = (hwj)blz.Q(null);
        this.o = (hwj)blz.Q(null);
        this.p = (hwj)blz.Q(null);
        a.e = (qsb)new cfp$a(this);
        a.f = (itb)new cfp$b(this);
        a.g = (qsb)new cfp$c(this);
        a.h = (mtb)new cfp$d(this);
        a.i = (nsb)new cfp$e(this);
        a.j = (qsb)new qsb<Long, fzv>(this) {
            public final cfp D0;
            
            public final Object invoke(final Object o) {
                if (this.D0.a.c().containsKey(((Number)o).longValue())) {
                    this.D0.j();
                    this.D0.b.setValue((Object)null);
                }
                return fzv.a;
            }
        };
        a.k = (qsb)new qsb<Long, fzv>(this) {
            public final cfp D0;
            
            public final Object invoke(final Object o) {
                final long longValue = ((Number)o).longValue();
                final kep h = this.D0.h();
                final boolean b = false;
                boolean b2 = false;
                Label_0049: {
                    if (h != null) {
                        final kep$a a = h.a;
                        if (a != null && longValue == a.c) {
                            b2 = true;
                            break Label_0049;
                        }
                    }
                    b2 = false;
                }
                if (!b2) {
                    final kep h2 = this.D0.h();
                    int n = b ? 1 : 0;
                    if (h2 != null) {
                        final kep$a b3 = h2.b;
                        n = (b ? 1 : 0);
                        if (b3 != null) {
                            n = (b ? 1 : 0);
                            if (longValue == b3.c) {
                                n = 1;
                            }
                        }
                    }
                    if (n == 0) {
                        return fzv.a;
                    }
                }
                this.D0.m(null);
                this.D0.l(null);
                return fzv.a;
            }
        };
    }
    
    public static final void a(final cfp cfp, final wfj value) {
        cfp.p.setValue((Object)value);
    }
    
    public static final void b(final cfp cfp, final long n) {
        cfp.l.setValue((Object)new wfj(n));
    }
    
    public static final void c(final cfp cfp, final zac value) {
        cfp.o.setValue((Object)value);
    }
    
    public final wfj d(final eve eve, final long n) {
        final eve j = this.j;
        if (j != null && j.j()) {
            return new wfj(this.k().v(eve, n));
        }
        return null;
    }
    
    public final void e() {
        final List l = this.a.l(this.k());
        final kep h = this.h();
        xc0 xc0 = null;
        xc0 xc2 = null;
        if (h != null) {
            final ArrayList list = (ArrayList)l;
            final int size = list.size();
            int n = 0;
            while (true) {
                xc0 = xc2;
                if (n >= size) {
                    break;
                }
                final aep aep = (aep)list.get(n);
                if (aep.f() == h.a.c || aep.f() == h.b.c || xc2 != null) {
                    xc0 xc3 = aep.e();
                    Label_0377: {
                        if (aep.f() == h.a.c || aep.f() == h.b.c) {
                            if (aep.f() == h.a.c) {
                                final long f = aep.f();
                                final kep$a b = h.b;
                                if (f == b.c) {
                                    if (h.c) {
                                        xc3 = xc3.d(b.b, h.a.b);
                                        break Label_0377;
                                    }
                                    xc3 = xc3.d(h.a.b, b.b);
                                    break Label_0377;
                                }
                            }
                            final long f2 = aep.f();
                            final kep$a a = h.a;
                            if (f2 == a.c) {
                                if (h.c) {
                                    xc3 = xc3.d(0, a.b);
                                }
                                else {
                                    xc3 = xc3.d(a.b, xc3.length());
                                }
                            }
                            else if (h.c) {
                                xc3 = xc3.d(h.b.b, xc3.length());
                            }
                            else {
                                xc3 = xc3.d(0, h.b.b);
                            }
                        }
                    }
                    if (xc2 != null) {
                        xc3 = xc2.c(xc3);
                    }
                    if (aep.f() == h.b.c) {
                        xc0 = xc3;
                        if (!h.c) {
                            break;
                        }
                    }
                    xc2 = xc3;
                    if (aep.f() == h.a.c) {
                        xc2 = xc3;
                        if (h.c) {
                            xc0 = xc3;
                            break;
                        }
                    }
                }
                ++n;
            }
        }
        if (xc0 != null) {
            final jh4 e = this.e;
            if (e != null) {
                e.f(xc0);
            }
        }
    }
    
    public final aep f(final kep$a kep$a) {
        czd.f((Object)kep$a, "anchor");
        return this.a.c.get(kep$a.c);
    }
    
    public final boolean g() {
        return (boolean)this.h.getValue();
    }
    
    public final kep h() {
        return (kep)this.b.getValue();
    }
    
    public final void i() {
        if (this.g()) {
            final vjs f = this.f;
            int c;
            if (f != null) {
                c = f.c();
            }
            else {
                c = 0;
            }
            if (c == 1) {
                final vjs f2 = this.f;
                if (f2 != null) {
                    f2.a();
                }
            }
        }
    }
    
    public final void j() {
        this.a.l.setValue((Object)k2a.D0);
        this.i();
        if (this.h() != null) {
            this.c.invoke((Object)null);
            final sbc d = this.d;
            if (d != null) {
                Objects.requireNonNull(tbc.Companion);
                d.a(9);
            }
        }
    }
    
    public final eve k() {
        final eve j = this.j;
        if (j == null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j.j()) {
            return j;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void l(final wfj value) {
        this.n.setValue((Object)value);
    }
    
    public final void m(final wfj value) {
        this.m.setValue((Object)value);
    }
    
    public final void n() {
        if (this.g() && this.h() != null) {
            final vjs f = this.f;
            if (f != null) {
                final kep h = this.h();
                c6m c6m = null;
                Label_0422: {
                    if (h == null) {
                        Objects.requireNonNull(c6m.Companion);
                        c6m = c6m.e;
                    }
                    else {
                        final aep f2 = this.f(h.a);
                        final aep f3 = this.f(h.b);
                        if (f2 != null) {
                            final eve c = f2.c();
                            if (c != null) {
                                if (f3 != null) {
                                    final eve c2 = f3.c();
                                    if (c2 != null) {
                                        final eve j = this.j;
                                        if (j != null && j.j()) {
                                            final long v = j.v(c, f2.b(h, true));
                                            final long v2 = j.v(c2, f3.b(h, false));
                                            final long l0 = j.l0(v);
                                            final long l2 = j.l0(v2);
                                            final float min = Math.min(wfj.d(l0), wfj.d(l2));
                                            final float max = Math.max(wfj.d(l0), wfj.d(l2));
                                            final float min2 = Math.min(wfj.e(j.l0(j.v(c, wj1.a(0.0f, f2.a(h.a.b).b)))), wfj.e(j.l0(j.v(c2, wj1.a(0.0f, f3.a(h.b.b).b)))));
                                            final float max2 = Math.max(wfj.e(l0), wfj.e(l2));
                                            final float a = wep.a;
                                            c6m = new c6m(min, min2, max, max2 + (float)(wep.b * 4.0));
                                            break Label_0422;
                                        }
                                        Objects.requireNonNull(c6m.Companion);
                                        c6m = c6m.e;
                                        break Label_0422;
                                    }
                                }
                                Objects.requireNonNull(c6m.Companion);
                                c6m = c6m.e;
                                break Label_0422;
                            }
                        }
                        Objects.requireNonNull(c6m.Companion);
                        c6m = c6m.e;
                    }
                }
                f.b(c6m, (nsb)new nsb<fzv>(this) {
                    public final cfp D0;
                    
                    public final Object invoke() {
                        this.D0.e();
                        this.D0.j();
                        return fzv.a;
                    }
                }, (nsb)null, (nsb)null, (nsb)null);
            }
        }
    }
    
    public final void o() {
        final kep h = this.h();
        final eve j = this.j;
        final wfj wfj = null;
        aep f = null;
        Label_0046: {
            if (h != null) {
                final kep$a a = h.a;
                if (a != null) {
                    f = this.f(a);
                    break Label_0046;
                }
            }
            f = null;
        }
        aep f2 = null;
        Label_0077: {
            if (h != null) {
                final kep$a b = h.b;
                if (b != null) {
                    f2 = this.f(b);
                    break Label_0077;
                }
            }
            f2 = null;
        }
        eve c;
        if (f != null) {
            c = f.c();
        }
        else {
            c = null;
        }
        eve c2;
        if (f2 != null) {
            c2 = f2.c();
        }
        else {
            c2 = null;
        }
        if (h != null && j != null && j.j() && c != null && c2 != null) {
            final long v = j.v(c, f.b(h, true));
            final long v2 = j.v(c2, f2.b(h, false));
            final c6m d = kfp.d(j);
            wfj wfj2;
            if (kfp.b(d, v)) {
                wfj2 = new wfj(v);
            }
            else {
                wfj2 = null;
            }
            this.m(wfj2);
            wfj wfj3 = wfj;
            if (kfp.b(d, v2)) {
                wfj3 = new wfj(v2);
            }
            this.l(wfj3);
            return;
        }
        this.m(null);
        this.l(null);
    }
    
    public final boolean p(final long n, final long n2, final wfj wfj, final boolean b, final mep mep) {
        czd.f((Object)mep, "adjustment");
        zac value;
        if (b) {
            value = zac.E0;
        }
        else {
            value = zac.F0;
        }
        this.o.setValue((Object)value);
        wfj value2;
        if (b) {
            value2 = new wfj(n);
        }
        else {
            value2 = new wfj(n2);
        }
        this.p.setValue((Object)value2);
        final LinkedHashMap value3 = new LinkedHashMap();
        final ArrayList list = (ArrayList)this.a.l(this.k());
        final int size = list.size();
        kep c = null;
        int i = 0;
        boolean b2 = false;
        while (i < size) {
            final aep aep = (aep)list.get(i);
            final lvj d = aep.d(n, n2, wfj, b, this.k(), mep, (kep)this.a.c().get(aep.f()));
            final kep kep = (kep)d.D0;
            final boolean booleanValue = (boolean)d.E0;
            b2 = (b2 || booleanValue);
            if (kep != null) {
                value3.put(aep.f(), kep);
            }
            c = kfp.c(c, kep);
            ++i;
        }
        if (!czd.a((Object)c, (Object)this.h())) {
            final sbc d2 = this.d;
            if (d2 != null) {
                Objects.requireNonNull(tbc.Companion);
                d2.a(9);
            }
            this.a.l.setValue((Object)value3);
            this.c.invoke((Object)c);
        }
        return b2;
    }
    
    public final boolean q(final wfj wfj, final wfj wfj2, final boolean b, final mep mep) {
        czd.f((Object)mep, "adjustment");
        if (wfj == null) {
            return false;
        }
        final kep h = this.h();
        if (h != null) {
            long n;
            if (b) {
                n = h.b.c;
            }
            else {
                n = h.a.c;
            }
            final aep aep = this.a.c.get(n);
            wfj d;
            if (aep == null) {
                d = null;
            }
            else {
                final eve c = aep.c();
                czd.c((Object)c);
                d = this.d(c, wep.a(aep.b(h, b ^ true)));
            }
            if (d != null) {
                long n2 = d.a;
                long a;
                if (b) {
                    a = wfj.a;
                }
                else {
                    a = n2;
                }
                if (!b) {
                    n2 = wfj.a;
                }
                return this.p(a, n2, wfj2, b, mep);
            }
        }
        return false;
    }
    
    public final void r() {
        if (this.g()) {
            final vjs f = this.f;
            int c;
            if (f != null) {
                c = f.c();
            }
            else {
                c = 0;
            }
            if (c == 1) {
                this.n();
            }
        }
    }
}
