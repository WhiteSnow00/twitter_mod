import java.util.List;
import java.util.Objects;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class swe implements zcm, prj, w76, orj$b
{
    public static final swe.swe$d Companion;
    public static final swe$c r1;
    public static final ptb<swe> s1;
    public static final swe$b t1;
    public static final Comparator<swe> u1;
    public final boolean F0;
    public final int G0;
    public int H0;
    public final hni I0;
    public ivh<swe> J0;
    public boolean K0;
    public swe L0;
    public orj M0;
    public int N0;
    public boolean O0;
    public final ivh<swe> P0;
    public boolean Q0;
    public zqg R0;
    public final k0e S0;
    public rp8 T0;
    public gdg U0;
    public cwe V0;
    public l7x W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public boolean f1;
    public final nni g1;
    public final ywe h1;
    public float i1;
    public exe j1;
    public qni k1;
    public boolean l1;
    public dlh m1;
    public stb<? super orj, vzv> n1;
    public stb<? super orj, vzv> o1;
    public boolean p1;
    public boolean q1;
    
    static {
        Companion = new swe.swe$d();
        r1 = new swe$c();
        swe.s1 = swe$a.F0;
        t1 = new l7x() {
            public final long a() {
                return 300L;
            }
            
            public final void b() {
            }
            
            public final long c() {
                return 400L;
            }
            
            public final long d() {
                Objects.requireNonNull(v99.Companion);
                return v99.b;
            }
            
            public final float e() {
                return 16.0f;
            }
        };
        swe.u1 = rwe.G0;
    }
    
    public swe() {
        this(false, 0, 3, null);
    }
    
    public swe(final boolean f0, final int g0) {
        this.F0 = f0;
        this.G0 = g0;
        this.I0 = new hni(new ivh((Object[])new swe[16]), (ptb)new swe$g(this));
        this.P0 = (ivh<swe>)new ivh((Object[])new swe[16]);
        this.Q0 = true;
        this.R0 = (zqg)swe.r1;
        this.S0 = new k0e(this);
        this.T0 = kqe.c();
        this.V0 = cwe.F0;
        this.W0 = (l7x)swe.t1;
        this.Y0 = Integer.MAX_VALUE;
        this.Z0 = Integer.MAX_VALUE;
        this.b1 = 3;
        this.c1 = 3;
        this.d1 = 3;
        this.e1 = 3;
        this.g1 = new nni(this);
        this.h1 = new ywe(this);
        this.l1 = true;
        this.m1 = (dlh)dlh.Companion;
    }
    
    public swe(boolean b, int addAndGet, final int n, final wg8 wg8) {
        addAndGet = 0;
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            Objects.requireNonNull(php.Companion);
            addAndGet = php.H0.addAndGet(1);
        }
        this(b, addAndGet);
    }
    
    public static boolean S(final swe swe) {
        final ywe$b k = swe.h1.k;
        vj6 vj6;
        if (k.J0) {
            vj6 = new vj6(((khk)k).I0);
        }
        else {
            vj6 = null;
        }
        return swe.R(vj6);
    }
    
    public final void A(long d1, final plc<aqk> plc, final boolean b, final boolean b2) {
        e0e.f((Object)plc, "hitTestResult");
        d1 = this.g1.c.d1(d1);
        final qni c = this.g1.c;
        Objects.requireNonNull(qni.Companion);
        c.k1((qni$f)qni.h1, d1, (plc)plc, b, b2);
    }
    
    public final void B(long d1, final plc<qhp> plc, final boolean b, final boolean b2) {
        e0e.f((Object)plc, "hitSemanticsEntities");
        d1 = this.g1.c.d1(d1);
        final qni c = this.g1.c;
        Objects.requireNonNull(qni.Companion);
        c.k1((qni$f)qni.i1, d1, (plc)plc, true, b);
    }
    
    public final void C(int n, final swe swe) {
        e0e.f((Object)swe, "instance");
        final swe l0 = swe.L0;
        final int n2 = 0;
        final boolean b = l0 == null;
        Object n3 = null;
        final String s = null;
        if (!b) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(swe);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(this.n(0));
            sb.append(" Other tree: ");
            final swe l2 = swe.L0;
            String n4 = s;
            if (l2 != null) {
                n4 = l2.n(0);
            }
            sb.append(n4);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (swe.M0 == null) {
            swe.L0 = this;
            final hni i0 = this.I0;
            ((ivh)i0.F0).a(n, (Object)swe);
            ((ptb)i0.G0).invoke();
            this.Q();
            if (swe.F0) {
                if (!(this.F0 ^ true)) {
                    throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
                }
                ++this.H0;
            }
            this.G();
            final qni c = swe.g1.c;
            if (this.F0) {
                final swe l3 = this.L0;
                if (l3 != null) {
                    n3 = l3.g1.b;
                }
            }
            else {
                n3 = this.g1.b;
            }
            c.N0 = (qni)n3;
            if (swe.F0) {
                final ivh ivh = (ivh)swe.I0.F0;
                final int h0 = ivh.H0;
                if (h0 > 0) {
                    final Object[] f0 = ivh.F0;
                    e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    n = n2;
                    do {
                        ((swe)f0[n]).g1.c.N0 = (qni)this.g1.b;
                    } while (++n < h0);
                }
            }
            final orj m0 = this.M0;
            if (m0 != null) {
                swe.i(m0);
            }
            if (swe.h1.j > 0) {
                final ywe h2 = this.h1;
                h2.e(h2.j + 1);
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(swe);
        sb2.append(" because it already has an owner. This tree: ");
        sb2.append(this.n(0));
        sb2.append(" Other tree: ");
        sb2.append(swe.n(0));
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    public final void D() {
        if (this.l1) {
            final nni g1 = this.g1;
            Object k1 = g1.b;
            final qni n0 = g1.c.N0;
            this.k1 = null;
            while (!e0e.a(k1, (Object)n0)) {
                mrj c1;
                if (k1 != null) {
                    c1 = ((qni)k1).c1;
                }
                else {
                    c1 = null;
                }
                if (c1 != null) {
                    this.k1 = (qni)k1;
                    break;
                }
                if (k1 != null) {
                    k1 = ((qni)k1).N0;
                }
                else {
                    k1 = null;
                }
            }
        }
        final qni k2 = this.k1;
        if (k2 != null && k2.c1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (k2 != null) {
            k2.m1();
        }
        else {
            final swe x = this.x();
            if (x != null) {
                x.D();
            }
        }
    }
    
    public final void E() {
        final nni g1 = this.g1;
        pwe pwe;
        for (qni qni = g1.c; qni != g1.b; qni = ((qni)pwe).M0) {
            e0e.d((Object)qni, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            pwe = (pwe)qni;
            final mrj c1 = ((qni)pwe).c1;
            if (c1 != null) {
                c1.invalidate();
            }
        }
        final mrj c2 = ((qni)this.g1.b).c1;
        if (c2 != null) {
            c2.invalidate();
        }
    }
    
    public final void F() {
        if (this.U0 != null) {
            this.X(false);
        }
        else {
            this.Z(false);
        }
    }
    
    public final void G() {
        if (this.H0 > 0) {
            this.K0 = true;
        }
        if (this.F0) {
            final swe x = this.x();
            if (x != null) {
                x.K0 = true;
            }
        }
    }
    
    public final boolean H() {
        return this.M0 != null;
    }
    
    public final Boolean I() {
        final ywe$a l = this.h1.l;
        Boolean value;
        if (l != null) {
            value = l.N0;
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final boolean J(final vj6 vj6) {
        boolean o0;
        if (vj6 != null && this.U0 != null) {
            final ywe$a l = this.h1.l;
            e0e.c((Object)l);
            o0 = l.O0(vj6.a);
        }
        else {
            o0 = false;
        }
        return o0;
    }
    
    public final void K() {
        if (this.d1 == 3) {
            this.l();
        }
        final ywe$a l = this.h1.l;
        e0e.c((Object)l);
        if (l.K0) {
            l.G0(l.M0, 0.0f, (stb)null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void L() {
        this.h1.c = true;
    }
    
    public final void M() {
        final boolean x0 = this.X0;
        this.X0 = true;
        if (!x0) {
            final ywe h1 = this.h1;
            if (h1.c) {
                this.Z(true);
            }
            else if (h1.f) {
                this.X(true);
            }
        }
        final nni g1 = this.g1;
        for (qni qni = g1.c; !e0e.a((Object)qni, (Object)((qni)g1.b).M0) && qni != null; qni = qni.M0) {
            if (qni.b1) {
                qni.m1();
            }
        }
        final ivh<swe> z = this.z();
        final int h2 = z.H0;
        if (h2 > 0) {
            int n = 0;
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final swe swe = (swe)f0[n];
                if (swe.Y0 != Integer.MAX_VALUE) {
                    swe.M();
                    this.a0(swe);
                }
            } while (++n < h2);
        }
    }
    
    public final void N() {
        if (this.X0) {
            int n = 0;
            this.X0 = false;
            final ivh<swe> z = this.z();
            final int h0 = z.H0;
            if (h0 > 0) {
                final Object[] f0 = z.F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((swe)f0[n]).N();
                } while (++n < h0);
            }
        }
    }
    
    public final void O(final int n, final int n2, final int n3) {
        if (n == n2) {
            return;
        }
        for (int i = 0; i < n3; ++i) {
            int n4;
            if (n > n2) {
                n4 = n + i;
            }
            else {
                n4 = n;
            }
            int n5;
            if (n > n2) {
                n5 = n2 + i;
            }
            else {
                n5 = n2 + n3 - 2;
            }
            final hni i2 = this.I0;
            final Object p3 = ((ivh)i2.F0).p(n4);
            ((ptb)i2.G0).invoke();
            final swe swe = (swe)p3;
            final hni i3 = this.I0;
            ((ivh)i3.F0).a(n5, (Object)swe);
            ((ptb)i3.G0).invoke();
        }
        this.Q();
        this.G();
        this.F();
    }
    
    public final void P(final swe swe) {
        if (swe.h1.j > 0) {
            final ywe h1 = this.h1;
            h1.e(h1.j - 1);
        }
        if (this.M0 != null) {
            swe.o();
        }
        swe.L0 = null;
        swe.g1.c.N0 = null;
        if (swe.F0) {
            --this.H0;
            final ivh ivh = (ivh)swe.I0.F0;
            final int h2 = ivh.H0;
            if (h2 > 0) {
                int n = 0;
                final Object[] f0 = ivh.F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((swe)f0[n]).g1.c.N0 = null;
                } while (++n < h2);
            }
        }
        this.G();
        this.Q();
    }
    
    public final void Q() {
        if (this.F0) {
            final swe x = this.x();
            if (x != null) {
                x.Q();
            }
        }
        else {
            this.Q0 = true;
        }
    }
    
    public final boolean R(final vj6 vj6) {
        boolean o0;
        if (vj6 != null) {
            if (this.d1 == 3) {
                this.j();
            }
            o0 = this.h1.k.O0(vj6.a);
        }
        else {
            o0 = false;
        }
        return o0;
    }
    
    public final void T() {
        for (int n = ((ivh)this.I0.F0).H0 - 1; -1 < n; --n) {
            this.P((swe)((ivh)this.I0.F0).F0[n]);
        }
        final hni i0 = this.I0;
        ((ivh)i0.F0).h();
        ((ptb)i0.G0).invoke();
    }
    
    public final void U(final int n, int n2) {
        if (n2 >= 0) {
            n2 = n2 + n - 1;
            if (n <= n2) {
                while (true) {
                    final hni i0 = this.I0;
                    final Object p2 = ((ivh)i0.F0).p(n2);
                    ((ptb)i0.G0).invoke();
                    this.P((swe)p2);
                    if (n2 == n) {
                        break;
                    }
                    --n2;
                }
            }
            return;
        }
        throw new IllegalArgumentException(ffe.m("count (", n2, ") must be greater than 0").toString());
    }
    
    public final void V() {
        if (this.d1 == 3) {
            this.l();
        }
        try {
            this.q1 = true;
            final ywe$b k = this.h1.k;
            if (k.K0) {
                k.N0(k.M0, k.O0, k.N0);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        finally {
            this.q1 = false;
        }
    }
    
    public final void W(final boolean b) {
        if (!this.F0) {
            final orj m0 = this.M0;
            if (m0 != null) {
                m0.o(this, true, b);
            }
        }
    }
    
    public final void X(final boolean b) {
        if (this.U0 == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
        final orj m0 = this.M0;
        if (m0 == null) {
            return;
        }
        if (!this.O0 && !this.F0) {
            m0.u(this, true, b);
            final ywe$a l = this.h1.l;
            e0e.c((Object)l);
            swe x = l.T0.a.x();
            final int d1 = l.T0.a.d1;
            if (x != null && d1 != 3) {
                while (x.d1 == d1) {
                    final swe x2 = x.x();
                    if (x2 == null) {
                        break;
                    }
                    x = x2;
                }
                final int g = lb0.G(d1);
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    }
                    x.W(b);
                }
                else {
                    x.X(b);
                }
            }
        }
    }
    
    public final void Y(final boolean b) {
        if (!this.F0) {
            final orj m0 = this.M0;
            if (m0 != null) {
                final int a = nrj.a;
                m0.o(this, false, b);
            }
        }
    }
    
    public final void Z(final boolean b) {
        if (!this.O0 && !this.F0) {
            final orj m0 = this.M0;
            if (m0 == null) {
                return;
            }
            final int a = nrj.a;
            m0.u(this, false, b);
            final ywe$b k = this.h1.k;
            swe x = k.T0.a.x();
            final int d1 = k.T0.a.d1;
            if (x != null && d1 != 3) {
                while (x.d1 == d1) {
                    final swe x2 = x.x();
                    if (x2 == null) {
                        break;
                    }
                    x = x2;
                }
                final int g = lb0.G(d1);
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    }
                    x.Y(b);
                }
                else {
                    x.Z(b);
                }
            }
        }
    }
    
    public final void a(final rp8 t0) {
        e0e.f((Object)t0, "value");
        if (!e0e.a((Object)this.T0, (Object)t0)) {
            this.T0 = t0;
            this.F();
            final swe x = this.x();
            if (x != null) {
                x.D();
            }
            this.E();
        }
    }
    
    public final void a0(final swe swe) {
        e0e.f((Object)swe, "it");
        if (swe$f.a[lb0.G(swe.h1.b)] == 1) {
            final ywe h1 = swe.h1;
            if (h1.c) {
                swe.Z(true);
            }
            else if (h1.d) {
                swe.Y(true);
            }
            else if (h1.f) {
                swe.X(true);
            }
            else if (h1.g) {
                swe.W(true);
            }
            return;
        }
        final StringBuilder f = ehk.f("Unexpected state ");
        f.append(qa3.D(swe.h1.b));
        throw new IllegalStateException(f.toString());
    }
    
    public final void b(final cwe v0) {
        e0e.f((Object)v0, "value");
        if (this.V0 != v0) {
            this.V0 = v0;
            this.F();
            final swe x = this.x();
            if (x != null) {
                x.D();
            }
            this.E();
        }
    }
    
    public final void b0() {
        final ivh<swe> z = this.z();
        final int h0 = z.H0;
        if (h0 > 0) {
            int n = 0;
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final swe swe = (swe)f0[n];
                if ((swe.d1 = swe.e1) != 3) {
                    swe.b0();
                }
            } while (++n < h0);
        }
    }
    
    public final void c() {
        final nrd b = this.g1.b;
        final boolean n = w9y.n(128);
        Object o;
        if (n) {
            o = b.j1;
        }
        else if ((o = b.j1.I0) == null) {
            return;
        }
        final qni$e companion = qni.Companion;
        for (Object o2 = ((qni)b).h1(n); o2 != null && (((dlh.c)o2).H0 & 0x80) != 0x0; o2 = ((dlh.c)o2).J0) {
            if ((((dlh.c)o2).G0 & 0x80) != 0x0 && o2 instanceof xve) {
                ((xve)o2).q((bwe)this.g1.b);
            }
            if (o2 == o) {
                break;
            }
        }
    }
    
    public final boolean c0() {
        final dlh.c e = this.g1.e;
        final int h0 = e.H0;
        final boolean b = (0x4 & h0) != 0x0;
        Object j0 = e;
        if (b) {
            final boolean b2 = (h0 & 0x2) != 0x0;
            j0 = e;
            if (!b2) {
                return true;
            }
        }
        while (j0 != null) {
            if ((((dlh.c)j0).G0 & 0x2) != 0x0 && j0 instanceof owe && kqe.l0((en8)j0, 2).c1 != null) {
                return false;
            }
            if ((((dlh.c)j0).G0 & 0x4) != 0x0) {
                return true;
            }
            j0 = ((dlh.c)j0).J0;
        }
        return true;
    }
    
    public final void d(final zqg zqg) {
        e0e.f((Object)zqg, "value");
        if (!e0e.a((Object)this.R0, (Object)zqg)) {
            this.R0 = zqg;
            final k0e s0 = this.S0;
            Objects.requireNonNull(s0);
            ((cjq<zqg>)s0.b).setValue(zqg);
            this.F();
        }
    }
    
    public final void d0() {
        if (this.H0 > 0 && this.K0) {
            int n = 0;
            this.K0 = false;
            ivh j0;
            if ((j0 = this.J0) == null) {
                j0 = new ivh((Object[])new swe[16]);
                this.J0 = (ivh<swe>)j0;
            }
            j0.h();
            final ivh ivh = (ivh)this.I0.F0;
            final int h0 = ivh.H0;
            if (h0 > 0) {
                final Object[] f0 = ivh.F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    final swe swe = (swe)f0[n];
                    if (swe.F0) {
                        j0.e(j0.H0, (ivh)swe.z());
                    }
                    else {
                        j0.b((Object)swe);
                    }
                } while (++n < h0);
            }
            final ywe h2 = this.h1;
            h2.k.S0 = true;
            final ywe$a l = h2.l;
            if (l != null) {
                l.R0 = true;
            }
        }
    }
    
    public final void f(dlh m1) {
        e0e.f((Object)m1, "value");
        if (e0e.a((Object)m1, (Object)this.m1)) {
            return;
        }
        final boolean f0 = this.F0;
        final int n = 1;
        if (f0 && this.m1 != dlh.Companion) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.m1 = m1;
        final boolean c0 = this.c0();
        final nni g1 = this.g1;
        final qni c2 = g1.c;
        final dlh.c e = g1.e;
        final dlh.c a = oni.a;
        if (e == a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        e.I0 = (dlh.c)a;
        a.J0 = e;
        g1.e = a;
        ivh f2;
        if ((f2 = g1.f) == null) {
            f2 = new ivh((Object[])new dlh.b[16]);
        }
        ivh g2;
        if ((g2 = g1.g) == null) {
            g2 = new ivh((Object[])new dlh.b[16]);
        }
        final ivh ivh = new ivh((Object[])new dlh[g2.H0]);
        ivh.b((Object)m1);
        while (ivh.m()) {
            m1 = (dlh)ivh.p(ivh.H0 - 1);
            if (m1 instanceof zs4) {
                final zs4 zs4 = (zs4)m1;
                ivh.b((Object)zs4.G0);
                ivh.b((Object)zs4.F0);
            }
            else if (m1 instanceof dlh.b) {
                g2.b((Object)m1);
            }
            else {
                m1.H((stb)new pni(g2));
            }
        }
        int i = g2.H0;
        final int h0 = f2.H0;
        int n3 = 0;
        boolean b3 = false;
        Label_0613: {
            if (i == h0) {
                Object o = g1.d.I0;
                int n2 = h0 - 1;
                n3 = 0;
                int h2 = 0;
                int n4;
                Object j0;
                while (true) {
                    n4 = n2;
                    j0 = o;
                    if (o == null) {
                        break;
                    }
                    n4 = n2;
                    j0 = o;
                    if (n2 < 0) {
                        break;
                    }
                    final dlh.b b = (dlh.b)f2.F0[n2];
                    final dlh.b b2 = (dlh.b)g2.F0[n2];
                    final int a2 = oni.a(b, b2);
                    if (a2 == 0) {
                        n4 = n2 + 1;
                        j0 = ((dlh.c)o).J0;
                        break;
                    }
                    if (a2 == 1) {
                        final dlh.c d = g1.d(b, b2, (dlh.c)o);
                        if (n3 == 0 && o == d) {
                            n3 = 0;
                        }
                        else {
                            n3 = 1;
                        }
                        o = d;
                    }
                    --n2;
                    h2 |= ((dlh.c)o).G0;
                    ((dlh.c)o).H0 = h2;
                    o = ((dlh.c)o).I0;
                }
                if (n4 <= 0) {
                    b3 = false;
                    break Label_0613;
                }
                if (j0 == null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                g1.c(f2, n4, g2, n4, (dlh.c)j0);
            }
            else if (h0 == 0) {
                --i;
                dlh.c c3 = g1.d;
                int h3 = 0;
                while (i >= 0) {
                    c3 = g1.b((dlh.b)g2.F0[i], c3);
                    h3 |= c3.G0;
                    c3.H0 = h3;
                    --i;
                }
            }
            else {
                g1.c(f2, h0, g2, i, (dlh.c)g1.d);
            }
            b3 = true;
            n3 = 1;
        }
        g1.f = g2;
        f2.h();
        g1.g = f2;
        final dlh.c e2 = g1.e;
        final dlh.c a3 = oni.a;
        if (e2 != a3) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object e3;
        if ((e3 = a3.J0) == null) {
            e3 = g1.d;
        }
        g1.e = (dlh.c)e3;
        final qni qni = null;
        ((dlh.c)e3).I0 = null;
        a3.J0 = null;
        if (e3 != a3) {
            if (b3) {
                Object b4 = g1.b;
                for (dlh.c c4 = g1.d.I0; c4 != null; c4 = c4.I0) {
                    if ((c4.G0 & 0x2) != 0x0 && c4 instanceof owe) {
                        Object o2;
                        if (c4.L0) {
                            final qni k0 = c4.K0;
                            e0e.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                            final pwe pwe = (pwe)k0;
                            final owe j2 = pwe.j1;
                            pwe.j1 = (owe)c4;
                            o2 = pwe;
                            if (j2 != c4) {
                                pwe.p1();
                                o2 = pwe;
                            }
                        }
                        else {
                            o2 = new pwe(g1.a, (owe)c4);
                            c4.K0 = (qni)o2;
                        }
                        ((qni)b4).N0 = (qni)o2;
                        ((qni)o2).M0 = (qni)b4;
                        b4 = o2;
                    }
                    else {
                        c4.K0 = (qni)b4;
                    }
                }
                final swe x = g1.a.x();
                Object b5 = qni;
                if (x != null) {
                    b5 = x.g1.b;
                }
                ((qni)b4).N0 = (qni)b5;
                g1.c = (qni)b4;
            }
            if (n3 != 0 && g1.a.H()) {
                g1.a();
            }
            final nni g3 = this.g1;
            for (qni qni2 = g3.c; !e0e.a((Object)qni2, (Object)((qni)g3.b).M0) && qni2 != null; qni2 = qni2.M0) {
                final mrj c5 = qni2.c1;
                if (c5 != null) {
                    c5.invalidate();
                }
                qni2.z1(this.U0);
            }
            final ywe h4 = this.h1;
            final ywe$b l = h4.k;
            final boolean a4 = e0e.a(l.P0, l.T0.a().m());
            l.P0 = l.T0.a().m();
            if (a4 ^ true) {
                final swe x2 = h4.a.x();
                if (x2 != null) {
                    x2.Z(false);
                }
            }
            final ywe$a l2 = h4.l;
            int n5 = 0;
            Label_1199: {
                if (l2 != null) {
                    final Object s0 = l2.S0;
                    final cdg u0 = l2.T0.a().U0;
                    e0e.c((Object)u0);
                    final boolean a5 = e0e.a(s0, u0.m());
                    final cdg u2 = l2.T0.a().U0;
                    e0e.c((Object)u2);
                    l2.S0 = u2.m();
                    if (a5 ^ true) {
                        n5 = n;
                        break Label_1199;
                    }
                }
                n5 = 0;
            }
            if (n5 != 0) {
                if (h4.b(h4.a)) {
                    final swe x3 = h4.a.x();
                    if (x3 != null) {
                        x3.Z(false);
                    }
                }
                else {
                    final swe x4 = h4.a.x();
                    if (x4 != null) {
                        x4.X(false);
                    }
                }
            }
            if (c0 || this.c0()) {
                final swe x5 = this.x();
                if (x5 != null) {
                    x5.D();
                }
            }
            if (e0e.a((Object)c2, (Object)this.g1.b)) {
                final nni g4 = this.g1;
                if (e0e.a((Object)g4.c, (Object)g4.b)) {
                    return;
                }
            }
            this.F();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void g(final l7x w0) {
        e0e.f((Object)w0, "<set-?>");
        this.W0 = w0;
    }
    
    public final void h() {
        this.Z(false);
        final ywe$b k = this.h1.k;
        vj6 vj6;
        if (k.J0) {
            vj6 = new vj6(((khk)k).I0);
        }
        else {
            vj6 = null;
        }
        if (vj6 != null) {
            final orj m0 = this.M0;
            if (m0 != null) {
                m0.q(this, vj6.a);
            }
        }
        else {
            final orj m2 = this.M0;
            if (m2 != null) {
                nrj.a(m2, false, 1, (Object)null);
            }
        }
    }
    
    public final void i(orj m0) {
        e0e.f((Object)m0, "owner");
        final orj m2 = this.M0;
        final int n = 0;
        if (m2 != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot attach ");
            sb.append(this);
            sb.append(" as it already is attached.  Tree: ");
            sb.append(this.n(0));
            throw new IllegalStateException(sb.toString().toString());
        }
        final swe l0 = this.L0;
        ywe$a i = null;
        final String s = null;
        if (l0 != null && !e0e.a((Object)l0.M0, (Object)m0)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Attaching to a different owner(");
            sb2.append(m0);
            sb2.append(") than the parent's owner(");
            final swe x = this.x();
            if (x != null) {
                m0 = x.M0;
            }
            else {
                m0 = null;
            }
            sb2.append(m0);
            sb2.append("). This tree: ");
            sb2.append(this.n(0));
            sb2.append(" Parent tree: ");
            final swe l2 = this.L0;
            String n2 = s;
            if (l2 != null) {
                n2 = l2.n(0);
            }
            sb2.append(n2);
            throw new IllegalStateException(sb2.toString().toString());
        }
        final swe x2 = this.x();
        if (x2 == null) {
            this.X0 = true;
        }
        this.M0 = m0;
        int n3;
        if (x2 != null) {
            n3 = x2.N0;
        }
        else {
            n3 = -1;
        }
        this.N0 = n3 + 1;
        if (kqe.O(this) != null) {
            m0.x();
        }
        m0.f(this);
        gdg u0;
        if (x2 == null || (u0 = x2.U0) == null) {
            u0 = null;
        }
        if (!e0e.a((Object)u0, (Object)this.U0)) {
            this.U0 = u0;
            final ywe h1 = this.h1;
            Objects.requireNonNull(h1);
            if (u0 != null) {
                i = new ywe$a(h1, u0);
            }
            h1.l = i;
            final nni g1 = this.g1;
            for (qni qni = g1.c; !e0e.a((Object)qni, (Object)((qni)g1.b).M0) && qni != null; qni = qni.M0) {
                qni.z1(u0);
            }
        }
        this.g1.a();
        final ivh ivh = (ivh)this.I0.F0;
        final int h2 = ivh.H0;
        if (h2 > 0) {
            final Object[] f0 = ivh.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n4 = n;
            do {
                ((swe)f0[n4]).i(m0);
            } while (++n4 < h2);
        }
        this.F();
        if (x2 != null) {
            x2.F();
        }
        final nni g2 = this.g1;
        for (qni qni2 = g2.c; !e0e.a((Object)qni2, (Object)((qni)g2.b).M0) && qni2 != null; qni2 = qni2.M0) {
            qni2.o1(qni2.P0);
        }
        final stb<? super orj, vzv> n5 = this.n1;
        if (n5 != null) {
            n5.invoke((Object)m0);
        }
    }
    
    public final boolean isValid() {
        return this.H();
    }
    
    public final void j() {
        this.e1 = this.d1;
        this.d1 = 3;
        final ivh<swe> z = this.z();
        final int h0 = z.H0;
        if (h0 > 0) {
            int n = 0;
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final swe swe = (swe)f0[n];
                if (swe.d1 != 3) {
                    swe.j();
                }
            } while (++n < h0);
        }
    }
    
    public final void l() {
        this.e1 = this.d1;
        this.d1 = 3;
        final ivh<swe> z = this.z();
        final int h0 = z.H0;
        if (h0 > 0) {
            int n = 0;
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final swe swe = (swe)f0[n];
                if (swe.d1 == 2) {
                    swe.l();
                }
            } while (++n < h0);
        }
    }
    
    public final String n(final int n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(this.toString());
        sb.append('\n');
        final ivh<swe> z = this.z();
        final int h0 = z.H0;
        if (h0 > 0) {
            final Object[] f0 = z.F0;
            e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n2 = 0;
            do {
                sb.append(((swe)f0[n2]).n(n + 1));
            } while (++n2 < h0);
        }
        final String string = sb.toString();
        e0e.e((Object)string, "tree.toString()");
        String substring = string;
        if (n == 0) {
            substring = string.substring(0, string.length() - 1);
            e0e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        return substring;
    }
    
    public final void o() {
        final orj m0 = this.M0;
        String n = null;
        if (m0 == null) {
            final StringBuilder f = ehk.f("Cannot detach node that is already detached!  Tree: ");
            final swe x = this.x();
            if (x != null) {
                n = x.n(0);
            }
            f.append(n);
            throw new IllegalStateException(f.toString().toString());
        }
        final swe x2 = this.x();
        if (x2 != null) {
            x2.D();
            x2.F();
            this.b1 = 3;
        }
        final ywe h1 = this.h1;
        final twe q0 = h1.k.Q0;
        q0.b = true;
        q0.c = false;
        q0.e = false;
        q0.d = false;
        q0.f = false;
        q0.g = false;
        q0.h = null;
        final ywe$a l = h1.l;
        if (l != null) {
            final adg p0 = l.P0;
            if (p0 != null) {
                ((lx)p0).b = true;
                ((lx)p0).c = false;
                ((lx)p0).e = false;
                ((lx)p0).d = false;
                ((lx)p0).f = false;
                ((lx)p0).g = false;
                ((lx)p0).h = null;
            }
        }
        final stb<? super orj, vzv> o1 = this.o1;
        if (o1 != null) {
            o1.invoke((Object)m0);
        }
        final nni g1 = this.g1;
        for (qni qni = g1.c; !e0e.a((Object)qni, (Object)((qni)g1.b).M0) && qni != null; qni = qni.M0) {
            qni.o1(qni.P0);
            final swe x3 = qni.L0.x();
            if (x3 != null) {
                x3.D();
            }
        }
        if (kqe.O(this) != null) {
            m0.x();
        }
        for (Object o2 = this.g1.d; o2 != null; o2 = ((dlh.c)o2).I0) {
            if (((dlh.c)o2).L0) {
                ((dlh.c)o2).s();
            }
        }
        m0.n(this);
        this.M0 = null;
        this.N0 = 0;
        final ivh ivh = (ivh)this.I0.F0;
        final int h2 = ivh.H0;
        if (h2 > 0) {
            final Object[] f2 = ivh.F0;
            e0e.d((Object)f2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n2 = 0;
            do {
                ((swe)f2[n2]).o();
            } while (++n2 < h2);
        }
        this.Y0 = Integer.MAX_VALUE;
        this.Z0 = Integer.MAX_VALUE;
        this.X0 = false;
    }
    
    public final void p(final ah3 ah3) {
        e0e.f((Object)ah3, "canvas");
        this.g1.c.Z0(ah3);
    }
    
    public final List<wqg> q() {
        final ywe$a l = this.h1.l;
        e0e.c((Object)l);
        l.T0.a.s();
        List list;
        if (!l.R0) {
            list = l.Q0.g();
        }
        else {
            kqe.u(l.T0.a, l.Q0, (stb)vwe.F0);
            l.R0 = false;
            list = l.Q0.g();
        }
        return list;
    }
    
    public final List<wqg> r() {
        final ywe$b k = this.h1.k;
        k.T0.a.d0();
        List list;
        if (!k.S0) {
            list = k.R0.g();
        }
        else {
            kqe.u(k.T0.a, k.R0, (stb)zwe.F0);
            k.S0 = false;
            list = k.R0.g();
        }
        return list;
    }
    
    public final List<swe> s() {
        return this.z().g();
    }
    
    public final List<swe> t() {
        return ((ivh)this.I0.F0).g();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(kqe.q0(this));
        sb.append(" children: ");
        sb.append(this.s().size());
        sb.append(" measurePolicy: ");
        sb.append(this.R0);
        return sb.toString();
    }
    
    public final swe x() {
        final swe l0 = this.L0;
        boolean b = true;
        if (l0 == null || !l0.F0) {
            b = false;
        }
        swe x = l0;
        if (b) {
            if (l0 != null) {
                x = l0.x();
            }
            else {
                x = null;
            }
        }
        return x;
    }
    
    public final ivh<swe> y() {
        if (this.Q0) {
            this.P0.h();
            final ivh<swe> p0 = this.P0;
            p0.e(p0.H0, (ivh)this.z());
            this.P0.s((Comparator)swe.u1);
            this.Q0 = false;
        }
        return this.P0;
    }
    
    public final ivh<swe> z() {
        this.d0();
        ivh j0;
        if (this.H0 == 0) {
            j0 = (ivh)this.I0.F0;
        }
        else {
            j0 = this.J0;
            e0e.c((Object)j0);
        }
        return (ivh<swe>)j0;
    }
    
    public abstract static class e implements zqg
    {
        public final String a;
        
        public e(final String a) {
            e0e.f((Object)a, "error");
            this.a = a;
        }
        
        @Override
        public final int a(final b0e b0e, final List list, final int n) {
            e0e.f((Object)b0e, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
        
        @Override
        public final int c(final b0e b0e, final List list, final int n) {
            e0e.f((Object)b0e, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
        
        @Override
        public final int d(final b0e b0e, final List list, final int n) {
            e0e.f((Object)b0e, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
        
        @Override
        public final int e(final b0e b0e, final List list, final int n) {
            e0e.f((Object)b0e, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
    }
}
