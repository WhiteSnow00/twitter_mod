import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfp
{
    public final qgp a;
    public final fvh<hfp> b;
    public stb<? super hfp, vzv> c;
    public ucc d;
    public oi4 e;
    public nks f;
    public qfb g;
    public final wwj h;
    public kgj i;
    public bwe j;
    public final wwj k;
    public final wwj l;
    public final wwj m;
    public final wwj n;
    public final wwj o;
    public final wwj p;
    
    public zfp(final qgp a) {
        e0e.f((Object)a, "selectionRegistrar");
        this.a = a;
        this.b = (wwj)zzz.W((Object)null);
        this.c = (stb<? super hfp, vzv>)zfp$h.F0;
        this.g = new qfb();
        this.h = (wwj)zzz.W((Object)Boolean.FALSE);
        Objects.requireNonNull(kgj.Companion);
        final long b = kgj.b;
        this.k = (wwj)zzz.W((Object)new kgj(b));
        this.l = (wwj)zzz.W((Object)new kgj(b));
        this.m = (wwj)zzz.W((Object)null);
        this.n = (wwj)zzz.W((Object)null);
        this.o = (wwj)zzz.W((Object)null);
        this.p = (wwj)zzz.W((Object)null);
        a.e = (stb<? super Long, vzv>)new zfp$a(this);
        a.f = (kub<? super bwe, ? super kgj, ? super jfp, vzv>)new zfp$b(this);
        a.g = (stb<? super Long, vzv>)new zfp$c(this);
        a.h = (oub<? super bwe, ? super kgj, ? super kgj, ? super Boolean, ? super jfp, Boolean>)new zfp$d(this);
        a.i = (ptb<vzv>)new zfp$e(this);
        a.j = (stb<? super Long, vzv>)new zfp$f(this);
        a.k = (stb<? super Long, vzv>)new zfp$g(this);
    }
    
    public static final void a(final zfp zfp, final kgj value) {
        ((cjq<kgj>)zfp.p).setValue(value);
    }
    
    public static final void b(final zfp zfp, final long n) {
        ((cjq<kgj>)zfp.l).setValue(new kgj(n));
    }
    
    public static final void c(final zfp zfp, final bcc value) {
        ((cjq<bcc>)zfp.o).setValue(value);
    }
    
    public final kgj d(final bwe bwe, final long n) {
        final bwe j = this.j;
        if (j != null && j.j()) {
            return new kgj(this.k().v(bwe, n));
        }
        return null;
    }
    
    public final void e() {
        final List<xep> l = this.a.l(this.k());
        final hfp h = this.h();
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
                final xep xep = (xep)list.get(n);
                if (xep.f() == h.a.c || xep.f() == h.b.c || xc2 != null) {
                    xc0 xc3 = xep.e();
                    Label_0377: {
                        if (xep.f() == h.a.c || xep.f() == h.b.c) {
                            if (xep.f() == h.a.c) {
                                final long f = xep.f();
                                final hfp$a b = h.b;
                                if (f == b.c) {
                                    if (h.c) {
                                        xc3 = xc3.d(b.b, h.a.b);
                                        break Label_0377;
                                    }
                                    xc3 = xc3.d(h.a.b, b.b);
                                    break Label_0377;
                                }
                            }
                            final long f2 = xep.f();
                            final hfp$a a = h.a;
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
                    if (xep.f() == h.b.c) {
                        xc0 = xc3;
                        if (!h.c) {
                            break;
                        }
                    }
                    xc2 = xc3;
                    if (xep.f() == h.a.c) {
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
            final oi4 e = this.e;
            if (e != null) {
                e.f(xc0);
            }
        }
    }
    
    public final xep f(final hfp$a hfp$a) {
        e0e.f((Object)hfp$a, "anchor");
        return this.a.c.get(hfp$a.c);
    }
    
    public final boolean g() {
        return ((cjq<Boolean>)this.h).getValue();
    }
    
    public final hfp h() {
        return ((cjq<hfp>)this.b).getValue();
    }
    
    public final void i() {
        if (this.g()) {
            final nks f = this.f;
            int c;
            if (f != null) {
                c = f.c();
            }
            else {
                c = 0;
            }
            if (c == 1) {
                final nks f2 = this.f;
                if (f2 != null) {
                    f2.a();
                }
            }
        }
    }
    
    public final void j() {
        ((cjq<m3a>)this.a.l).setValue(m3a.F0);
        this.i();
        if (this.h() != null) {
            this.c.invoke((Object)null);
            final ucc d = this.d;
            if (d != null) {
                Objects.requireNonNull(vcc.Companion);
                d.a(9);
            }
        }
    }
    
    public final bwe k() {
        final bwe j = this.j;
        if (j == null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j.j()) {
            return j;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void l(final kgj value) {
        ((cjq<kgj>)this.n).setValue(value);
    }
    
    public final void m(final kgj value) {
        ((cjq<kgj>)this.m).setValue(value);
    }
    
    public final void n() {
        if (this.g() && this.h() != null) {
            final nks f = this.f;
            if (f != null) {
                final hfp h = this.h();
                p6m p6m = null;
                Label_0421: {
                    if (h == null) {
                        Objects.requireNonNull(p6m.Companion);
                        p6m = p6m.e;
                    }
                    else {
                        final xep f2 = this.f(h.a);
                        final xep f3 = this.f(h.b);
                        if (f2 != null) {
                            final bwe c = f2.c();
                            if (c != null) {
                                if (f3 != null) {
                                    final bwe c2 = f3.c();
                                    if (c2 != null) {
                                        final bwe j = this.j;
                                        if (j != null && j.j()) {
                                            final long v = j.v(c, f2.b(h, true));
                                            final long v2 = j.v(c2, f3.b(h, false));
                                            final long l0 = j.l0(v);
                                            final long l2 = j.l0(v2);
                                            final float min = Math.min(kgj.d(l0), kgj.d(l2));
                                            final float max = Math.max(kgj.d(l0), kgj.d(l2));
                                            final float min2 = Math.min(kgj.e(j.l0(j.v(c, kqe.e(0.0f, f2.a(h.a.b).b)))), kgj.e(j.l0(j.v(c2, kqe.e(0.0f, f3.a(h.b.b).b)))));
                                            final float max2 = Math.max(kgj.e(l0), kgj.e(l2));
                                            final float a = tfp.a;
                                            p6m = new p6m(min, min2, max, max2 + (float)(tfp.b * 4.0));
                                            break Label_0421;
                                        }
                                        Objects.requireNonNull(p6m.Companion);
                                        p6m = p6m.e;
                                        break Label_0421;
                                    }
                                }
                                Objects.requireNonNull(p6m.Companion);
                                p6m = p6m.e;
                                break Label_0421;
                            }
                        }
                        Objects.requireNonNull(p6m.Companion);
                        p6m = p6m.e;
                    }
                }
                f.b(p6m, (ptb)new zfp$i(this), (ptb)null, (ptb)null, (ptb)null);
            }
        }
    }
    
    public final void o() {
        final hfp h = this.h();
        final bwe j = this.j;
        final kgj kgj = null;
        xep f = null;
        Label_0046: {
            if (h != null) {
                final hfp$a a = h.a;
                if (a != null) {
                    f = this.f(a);
                    break Label_0046;
                }
            }
            f = null;
        }
        xep f2 = null;
        Label_0077: {
            if (h != null) {
                final hfp$a b = h.b;
                if (b != null) {
                    f2 = this.f(b);
                    break Label_0077;
                }
            }
            f2 = null;
        }
        bwe c;
        if (f != null) {
            c = f.c();
        }
        else {
            c = null;
        }
        bwe c2;
        if (f2 != null) {
            c2 = f2.c();
        }
        else {
            c2 = null;
        }
        if (h != null && j != null && j.j() && c != null && c2 != null) {
            final long v = j.v(c, f.b(h, true));
            final long v2 = j.v(c2, f2.b(h, false));
            final p6m d = hgp.d(j);
            kgj kgj2;
            if (hgp.b(d, v)) {
                kgj2 = new kgj(v);
            }
            else {
                kgj2 = null;
            }
            this.m(kgj2);
            kgj kgj3 = kgj;
            if (hgp.b(d, v2)) {
                kgj3 = new kgj(v2);
            }
            this.l(kgj3);
            return;
        }
        this.m(null);
        this.l(null);
    }
    
    public final boolean p(final long n, final long n2, final kgj kgj, final boolean b, final jfp jfp) {
        e0e.f((Object)jfp, "adjustment");
        bcc value;
        if (b) {
            value = bcc.G0;
        }
        else {
            value = bcc.H0;
        }
        ((cjq<bcc>)this.o).setValue(value);
        kgj value2;
        if (b) {
            value2 = new kgj(n);
        }
        else {
            value2 = new kgj(n2);
        }
        ((cjq<kgj>)this.p).setValue(value2);
        final LinkedHashMap value3 = new LinkedHashMap();
        final ArrayList list = (ArrayList)this.a.l(this.k());
        final int size = list.size();
        hfp c = null;
        int i = 0;
        boolean b2 = false;
        while (i < size) {
            final xep xep = (xep)list.get(i);
            final awj d = xep.d(n, n2, kgj, b, this.k(), jfp, (hfp)this.a.c().get(xep.f()));
            final hfp hfp = (hfp)d.F0;
            final boolean booleanValue = (boolean)d.G0;
            b2 = (b2 || booleanValue);
            if (hfp != null) {
                value3.put(xep.f(), hfp);
            }
            c = hgp.c(c, hfp);
            ++i;
        }
        if (!e0e.a((Object)c, (Object)this.h())) {
            final ucc d2 = this.d;
            if (d2 != null) {
                Objects.requireNonNull(vcc.Companion);
                d2.a(9);
            }
            ((cjq<LinkedHashMap>)this.a.l).setValue(value3);
            this.c.invoke((Object)c);
        }
        return b2;
    }
    
    public final boolean q(final kgj kgj, final kgj kgj2, final boolean b, final jfp jfp) {
        e0e.f((Object)jfp, "adjustment");
        if (kgj == null) {
            return false;
        }
        final hfp h = this.h();
        if (h != null) {
            long n;
            if (b) {
                n = h.b.c;
            }
            else {
                n = h.a.c;
            }
            final xep xep = this.a.c.get(n);
            kgj d;
            if (xep == null) {
                d = null;
            }
            else {
                final bwe c = xep.c();
                e0e.c((Object)c);
                d = this.d(c, tfp.a(xep.b(h, b ^ true)));
            }
            if (d != null) {
                long n2 = d.a;
                long a;
                if (b) {
                    a = kgj.a;
                }
                else {
                    a = n2;
                }
                if (!b) {
                    n2 = kgj.a;
                }
                return this.p(a, n2, kgj2, b, jfp);
            }
        }
        return false;
    }
    
    public final void r() {
        if (this.g()) {
            final nks f = this.f;
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
