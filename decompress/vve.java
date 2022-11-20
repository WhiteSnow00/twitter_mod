import java.util.Objects;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vve implements ncm, arj, q66, zqj$b
{
    public static final vve.vve$d Companion;
    public static final vve$c p1;
    public static final nsb<vve> q1;
    public static final vve$b r1;
    public static final Comparator<vve> s1;
    public final boolean D0;
    public final int E0;
    public int F0;
    public final mt6 G0;
    public suh<vve> H0;
    public boolean I0;
    public vve J0;
    public zqj K0;
    public int L0;
    public boolean M0;
    public final suh<vve> N0;
    public boolean O0;
    public fqg P0;
    public final izd Q0;
    public lo8 R0;
    public mcg S0;
    public fve T0;
    public t6x U0;
    public boolean V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public boolean d1;
    public final wmi e1;
    public final bwe f1;
    public float g1;
    public hwe h1;
    public zmi i1;
    public boolean j1;
    public okh k1;
    public qsb<? super zqj, fzv> l1;
    public qsb<? super zqj, fzv> m1;
    public boolean n1;
    public boolean o1;
    
    static {
        Companion = new vve.vve$d();
        p1 = new e() {
            public final gqg b(final iqg iqg, final List list, final long n) {
                czd.f((Object)iqg, "$this$measure");
                czd.f((Object)list, "measurables");
                throw new IllegalStateException("Undefined measure and it is required".toString());
            }
        };
        vve.q1 = vve$a.D0;
        r1 = new t6x() {
            public final long a() {
                return 300L;
            }
            
            public final void b() {
            }
            
            public final long c() {
                return 400L;
            }
            
            public final long d() {
                Objects.requireNonNull(p89.Companion);
                return p89.b;
            }
            
            public final float e() {
                return 16.0f;
            }
        };
        vve.s1 = uve.E0;
    }
    
    public vve() {
        this(false, 0, 3, null);
    }
    
    public vve(final boolean d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
        this.G0 = new mt6(new suh((Object[])new vve[16]), (nsb)new vve$g(this));
        this.N0 = (suh<vve>)new suh((Object[])new vve[16]);
        this.O0 = true;
        this.P0 = (fqg)vve.p1;
        this.Q0 = new izd(this);
        this.R0 = rp9.s();
        this.T0 = fve.D0;
        this.U0 = (t6x)vve.r1;
        this.W0 = Integer.MAX_VALUE;
        this.X0 = Integer.MAX_VALUE;
        this.Z0 = 3;
        this.a1 = 3;
        this.b1 = 3;
        this.c1 = 3;
        this.e1 = new wmi(this);
        this.f1 = new bwe(this);
        this.j1 = true;
        this.k1 = (okh)okh.Companion;
    }
    
    public vve(boolean b, int addAndGet, final int n, final rf8 rf8) {
        addAndGet = 0;
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            Objects.requireNonNull(sgp.Companion);
            addAndGet = sgp.F0.addAndGet(1);
        }
        this(b, addAndGet);
    }
    
    public static boolean S(final vve vve) {
        final bwe$b k = vve.f1.k;
        pi6 pi6;
        if (k.H0) {
            pi6 = new pi6(((wgk)k).G0);
        }
        else {
            pi6 = null;
        }
        return vve.R(pi6);
    }
    
    public final void A(long d1, final pkc<opk> pkc, final boolean b, final boolean b2) {
        czd.f((Object)pkc, "hitTestResult");
        d1 = this.e1.c.d1(d1);
        final zmi c = this.e1.c;
        Objects.requireNonNull(zmi.Companion);
        c.k1((zmi$f)zmi.f1, d1, (pkc)pkc, b, b2);
    }
    
    public final void B(long d1, final pkc<tgp> pkc, final boolean b, final boolean b2) {
        czd.f((Object)pkc, "hitSemanticsEntities");
        d1 = this.e1.c.d1(d1);
        final zmi c = this.e1.c;
        Objects.requireNonNull(zmi.Companion);
        c.k1((zmi$f)zmi.g1, d1, (pkc)pkc, true, b);
    }
    
    public final void C(int n, final vve vve) {
        czd.f((Object)vve, "instance");
        final vve j0 = vve.J0;
        final int n2 = 0;
        final boolean b = j0 == null;
        Object l0 = null;
        final String s = null;
        if (!b) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(vve);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(this.n(0));
            sb.append(" Other tree: ");
            final vve j2 = vve.J0;
            String n3 = s;
            if (j2 != null) {
                n3 = j2.n(0);
            }
            sb.append(n3);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (vve.K0 == null) {
            vve.J0 = this;
            final mt6 g0 = this.G0;
            ((suh)g0.D0).a(n, (Object)vve);
            ((nsb)g0.E0).invoke();
            this.Q();
            if (vve.D0) {
                if (!(this.D0 ^ true)) {
                    throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
                }
                ++this.F0;
            }
            this.G();
            final zmi c = vve.e1.c;
            if (this.D0) {
                final vve j3 = this.J0;
                if (j3 != null) {
                    l0 = j3.e1.b;
                }
            }
            else {
                l0 = this.e1.b;
            }
            c.L0 = (zmi)l0;
            if (vve.D0) {
                final suh suh = (suh)vve.G0.D0;
                final int f0 = suh.F0;
                if (f0 > 0) {
                    final Object[] d0 = suh.D0;
                    czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    n = n2;
                    do {
                        ((vve)d0[n]).e1.c.L0 = (zmi)this.e1.b;
                    } while (++n < f0);
                }
            }
            final zqj k0 = this.K0;
            if (k0 != null) {
                vve.i(k0);
            }
            if (vve.f1.j > 0) {
                final bwe f2 = this.f1;
                f2.e(f2.j + 1);
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(vve);
        sb2.append(" because it already has an owner. This tree: ");
        sb2.append(this.n(0));
        sb2.append(" Other tree: ");
        sb2.append(vve.n(0));
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    public final void D() {
        if (this.j1) {
            final wmi e1 = this.e1;
            Object i1 = e1.b;
            final zmi l0 = e1.c.L0;
            this.i1 = null;
            while (!czd.a(i1, (Object)l0)) {
                xqj a1;
                if (i1 != null) {
                    a1 = ((zmi)i1).a1;
                }
                else {
                    a1 = null;
                }
                if (a1 != null) {
                    this.i1 = (zmi)i1;
                    break;
                }
                if (i1 != null) {
                    i1 = ((zmi)i1).L0;
                }
                else {
                    i1 = null;
                }
            }
        }
        final zmi i2 = this.i1;
        if (i2 != null && i2.a1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (i2 != null) {
            i2.m1();
        }
        else {
            final vve x = this.x();
            if (x != null) {
                x.D();
            }
        }
    }
    
    public final void E() {
        final wmi e1 = this.e1;
        sve sve;
        for (zmi zmi = e1.c; zmi != e1.b; zmi = ((zmi)sve).K0) {
            czd.d((Object)zmi, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            sve = (sve)zmi;
            final xqj a1 = ((zmi)sve).a1;
            if (a1 != null) {
                a1.invalidate();
            }
        }
        final xqj a2 = ((zmi)this.e1.b).a1;
        if (a2 != null) {
            a2.invalidate();
        }
    }
    
    public final void F() {
        if (this.S0 != null) {
            this.X(false);
        }
        else {
            this.Z(false);
        }
    }
    
    public final void G() {
        if (this.F0 > 0) {
            this.I0 = true;
        }
        if (this.D0) {
            final vve x = this.x();
            if (x != null) {
                x.I0 = true;
            }
        }
    }
    
    public final boolean H() {
        return this.K0 != null;
    }
    
    public final Boolean I() {
        final bwe$a l = this.f1.l;
        Boolean value;
        if (l != null) {
            value = l.L0;
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final boolean J(final pi6 pi6) {
        boolean o0;
        if (pi6 != null && this.S0 != null) {
            final bwe$a l = this.f1.l;
            czd.c((Object)l);
            o0 = l.O0(pi6.a);
        }
        else {
            o0 = false;
        }
        return o0;
    }
    
    public final void K() {
        if (this.b1 == 3) {
            this.l();
        }
        final bwe$a l = this.f1.l;
        czd.c((Object)l);
        if (l.I0) {
            l.G0(l.K0, 0.0f, (qsb)null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void L() {
        this.f1.c = true;
    }
    
    public final void M() {
        final boolean v0 = this.V0;
        this.V0 = true;
        if (!v0) {
            final bwe f1 = this.f1;
            if (f1.c) {
                this.Z(true);
            }
            else if (f1.f) {
                this.X(true);
            }
        }
        final wmi e1 = this.e1;
        for (zmi zmi = e1.c; !czd.a((Object)zmi, (Object)((zmi)e1.b).K0) && zmi != null; zmi = zmi.K0) {
            if (zmi.Z0) {
                zmi.m1();
            }
        }
        final suh<vve> z = this.z();
        final int f2 = z.F0;
        if (f2 > 0) {
            int n = 0;
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final vve vve = (vve)d0[n];
                if (vve.W0 != Integer.MAX_VALUE) {
                    vve.M();
                    this.a0(vve);
                }
            } while (++n < f2);
        }
    }
    
    public final void N() {
        if (this.V0) {
            int n = 0;
            this.V0 = false;
            final suh<vve> z = this.z();
            final int f0 = z.F0;
            if (f0 > 0) {
                final Object[] d0 = z.D0;
                czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((vve)d0[n]).N();
                } while (++n < f0);
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
            final mt6 g0 = this.G0;
            final Object p3 = ((suh)g0.D0).p(n4);
            ((nsb)g0.E0).invoke();
            final vve vve = (vve)p3;
            final mt6 g2 = this.G0;
            ((suh)g2.D0).a(n5, (Object)vve);
            ((nsb)g2.E0).invoke();
        }
        this.Q();
        this.G();
        this.F();
    }
    
    public final void P(final vve vve) {
        if (vve.f1.j > 0) {
            final bwe f1 = this.f1;
            f1.e(f1.j - 1);
        }
        if (this.K0 != null) {
            vve.o();
        }
        vve.J0 = null;
        vve.e1.c.L0 = null;
        if (vve.D0) {
            --this.F0;
            final suh suh = (suh)vve.G0.D0;
            final int f2 = suh.F0;
            if (f2 > 0) {
                int n = 0;
                final Object[] d0 = suh.D0;
                czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((vve)d0[n]).e1.c.L0 = null;
                } while (++n < f2);
            }
        }
        this.G();
        this.Q();
    }
    
    public final void Q() {
        if (this.D0) {
            final vve x = this.x();
            if (x != null) {
                x.Q();
            }
        }
        else {
            this.O0 = true;
        }
    }
    
    public final boolean R(final pi6 pi6) {
        boolean o0;
        if (pi6 != null) {
            if (this.b1 == 3) {
                this.j();
            }
            o0 = this.f1.k.O0(pi6.a);
        }
        else {
            o0 = false;
        }
        return o0;
    }
    
    public final void T() {
        for (int n = ((suh)this.G0.D0).F0 - 1; -1 < n; --n) {
            this.P((vve)((suh)this.G0.D0).D0[n]);
        }
        final mt6 g0 = this.G0;
        ((suh)g0.D0).h();
        ((nsb)g0.E0).invoke();
    }
    
    public final void U(final int n, int n2) {
        if (n2 >= 0) {
            n2 = n2 + n - 1;
            if (n <= n2) {
                while (true) {
                    final mt6 g0 = this.G0;
                    final Object p2 = ((suh)g0.D0).p(n2);
                    ((nsb)g0.E0).invoke();
                    this.P((vve)p2);
                    if (n2 == n) {
                        break;
                    }
                    --n2;
                }
            }
            return;
        }
        throw new IllegalArgumentException(ze.G("count (", n2, ") must be greater than 0").toString());
    }
    
    public final void V() {
        if (this.b1 == 3) {
            this.l();
        }
        try {
            this.o1 = true;
            final bwe$b k = this.f1.k;
            if (k.I0) {
                k.N0(k.K0, k.M0, k.L0);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        finally {
            this.o1 = false;
        }
    }
    
    public final void W(final boolean b) {
        if (!this.D0) {
            final zqj k0 = this.K0;
            if (k0 != null) {
                k0.o(this, true, b);
            }
        }
    }
    
    public final void X(final boolean b) {
        if (this.S0 == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
        final zqj k0 = this.K0;
        if (k0 == null) {
            return;
        }
        if (!this.M0 && !this.D0) {
            k0.u(this, true, b);
            final bwe$a l = this.f1.l;
            czd.c((Object)l);
            vve x = l.R0.a.x();
            final int b2 = l.R0.a.b1;
            if (x != null && b2 != 3) {
                while (x.b1 == b2) {
                    final vve x2 = x.x();
                    if (x2 == null) {
                        break;
                    }
                    x = x2;
                }
                final int e = ib0.E(b2);
                if (e != 0) {
                    if (e != 1) {
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
        if (!this.D0) {
            final zqj k0 = this.K0;
            if (k0 != null) {
                final int a = yqj.a;
                k0.o(this, false, b);
            }
        }
    }
    
    public final void Z(final boolean b) {
        if (!this.M0 && !this.D0) {
            final zqj k0 = this.K0;
            if (k0 == null) {
                return;
            }
            final int a = yqj.a;
            k0.u(this, false, b);
            final bwe$b i = this.f1.k;
            vve x = i.R0.a.x();
            final int b2 = i.R0.a.b1;
            if (x != null && b2 != 3) {
                while (x.b1 == b2) {
                    final vve x2 = x.x();
                    if (x2 == null) {
                        break;
                    }
                    x = x2;
                }
                final int e = ib0.E(b2);
                if (e != 0) {
                    if (e != 1) {
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
    
    public final void a(final lo8 r0) {
        czd.f((Object)r0, "value");
        if (!czd.a((Object)this.R0, (Object)r0)) {
            this.R0 = r0;
            this.F();
            final vve x = this.x();
            if (x != null) {
                x.D();
            }
            this.E();
        }
    }
    
    public final void a0(final vve vve) {
        czd.f((Object)vve, "it");
        if (vve$f.a[ib0.E(vve.f1.b)] == 1) {
            final bwe f1 = vve.f1;
            if (f1.c) {
                vve.Z(true);
            }
            else if (f1.d) {
                vve.Y(true);
            }
            else if (f1.f) {
                vve.X(true);
            }
            else if (f1.g) {
                vve.W(true);
            }
            return;
        }
        final StringBuilder j = fu8.j("Unexpected state ");
        j.append(caa.k(vve.f1.b));
        throw new IllegalStateException(j.toString());
    }
    
    public final void b(final fve t0) {
        czd.f((Object)t0, "value");
        if (this.T0 != t0) {
            this.T0 = t0;
            this.F();
            final vve x = this.x();
            if (x != null) {
                x.D();
            }
            this.E();
        }
    }
    
    public final void b0() {
        final suh<vve> z = this.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final vve vve = (vve)d0[n];
                if ((vve.b1 = vve.c1) != 3) {
                    vve.b0();
                }
            } while (++n < f0);
        }
    }
    
    public final void c() {
        final lqd b = this.e1.b;
        final boolean q = gmw.q(128);
        Object o;
        if (q) {
            o = b.h1;
        }
        else if ((o = ((okh$c)b.h1).G0) == null) {
            return;
        }
        final zmi$e companion = zmi.Companion;
        for (okh$c okh$c = ((zmi)b).h1(q); okh$c != null && (okh$c.F0 & 0x80) != 0x0; okh$c = okh$c.H0) {
            if ((okh$c.E0 & 0x80) != 0x0 && okh$c instanceof ave) {
                ((ave)okh$c).q((eve)this.e1.b);
            }
            if (okh$c == o) {
                break;
            }
        }
    }
    
    public final boolean c0() {
        final okh$c e = this.e1.e;
        final int f0 = e.F0;
        final boolean b = (0x4 & f0) != 0x0;
        okh$c h0 = e;
        if (b) {
            final boolean b2 = (f0 & 0x2) != 0x0;
            h0 = e;
            if (!b2) {
                return true;
            }
        }
        while (h0 != null) {
            if ((h0.E0 & 0x2) != 0x0 && h0 instanceof rve && wd.x((yl8)h0, 2).a1 != null) {
                return false;
            }
            if ((h0.E0 & 0x4) != 0x0) {
                return true;
            }
            h0 = h0.H0;
        }
        return true;
    }
    
    public final void d(final fqg fqg) {
        czd.f((Object)fqg, "value");
        if (!czd.a((Object)this.P0, (Object)fqg)) {
            this.P0 = fqg;
            final izd q0 = this.Q0;
            Objects.requireNonNull(q0);
            q0.b.setValue((Object)fqg);
            this.F();
        }
    }
    
    public final void d0() {
        if (this.F0 > 0 && this.I0) {
            int n = 0;
            this.I0 = false;
            suh h0;
            if ((h0 = this.H0) == null) {
                h0 = new suh((Object[])new vve[16]);
                this.H0 = (suh<vve>)h0;
            }
            h0.h();
            final suh suh = (suh)this.G0.D0;
            final int f0 = suh.F0;
            if (f0 > 0) {
                final Object[] d0 = suh.D0;
                czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    final vve vve = (vve)d0[n];
                    if (vve.D0) {
                        h0.e(h0.F0, (suh)vve.z());
                    }
                    else {
                        h0.b((Object)vve);
                    }
                } while (++n < f0);
            }
            final bwe f2 = this.f1;
            f2.k.Q0 = true;
            final bwe$a l = f2.l;
            if (l != null) {
                l.P0 = true;
            }
        }
    }
    
    public final void f(okh k1) {
        czd.f((Object)k1, "value");
        if (czd.a((Object)k1, (Object)this.k1)) {
            return;
        }
        final boolean d0 = this.D0;
        final int n = 1;
        if (d0 && this.k1 != okh.Companion) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.k1 = k1;
        final boolean c0 = this.c0();
        final wmi e1 = this.e1;
        final zmi c2 = e1.c;
        final okh$c e2 = e1.e;
        final okh$c a = xmi.a;
        if (e2 == a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        e2.G0 = a;
        a.H0 = e2;
        e1.e = a;
        suh f;
        if ((f = e1.f) == null) {
            f = new suh((Object[])new okh$b[16]);
        }
        suh g;
        if ((g = e1.g) == null) {
            g = new suh((Object[])new okh$b[16]);
        }
        final suh suh = new suh((Object[])new okh[g.F0]);
        suh.b((Object)k1);
        while (suh.m()) {
            k1 = (okh)suh.p(suh.F0 - 1);
            if (k1 instanceof tr4) {
                final tr4 tr4 = (tr4)k1;
                suh.b((Object)tr4.E0);
                suh.b((Object)tr4.D0);
            }
            else if (k1 instanceof okh$b) {
                g.b((Object)k1);
            }
            else {
                k1.H((qsb)new ymi((suh<okh$b>)g));
            }
        }
        int i = g.F0;
        final int f2 = f.F0;
        int n3 = 0;
        boolean b = false;
        Label_0613: {
            if (i == f2) {
                okh$c okh$c = ((okh$c)e1.d).G0;
                int n2 = f2 - 1;
                n3 = 0;
                int f3 = 0;
                int n4;
                okh$c h0;
                while (true) {
                    n4 = n2;
                    h0 = okh$c;
                    if (okh$c == null) {
                        break;
                    }
                    n4 = n2;
                    h0 = okh$c;
                    if (n2 < 0) {
                        break;
                    }
                    final okh$b okh$b = (okh$b)f.D0[n2];
                    final okh$b okh$b2 = (okh$b)g.D0[n2];
                    final int a2 = xmi.a(okh$b, okh$b2);
                    if (a2 == 0) {
                        n4 = n2 + 1;
                        h0 = okh$c.H0;
                        break;
                    }
                    if (a2 == 1) {
                        final okh$c d2 = e1.d(okh$b, okh$b2, okh$c);
                        if (n3 == 0 && okh$c == d2) {
                            n3 = 0;
                        }
                        else {
                            n3 = 1;
                        }
                        okh$c = d2;
                    }
                    --n2;
                    f3 |= okh$c.E0;
                    okh$c.F0 = f3;
                    okh$c = okh$c.G0;
                }
                if (n4 <= 0) {
                    b = false;
                    break Label_0613;
                }
                if (h0 == null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                e1.c(f, n4, g, n4, h0);
            }
            else if (f2 == 0) {
                --i;
                Object o = e1.d;
                int f4 = 0;
                while (i >= 0) {
                    o = e1.b((okh$b)g.D0[i], (okh$c)o);
                    f4 |= ((okh$c)o).E0;
                    ((okh$c)o).F0 = f4;
                    --i;
                }
            }
            else {
                e1.c(f, f2, g, i, (okh$c)e1.d);
            }
            b = true;
            n3 = 1;
        }
        e1.f = g;
        f.h();
        e1.g = f;
        final okh$c e3 = e1.e;
        final okh$c a3 = xmi.a;
        if (e3 != a3) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object e4;
        if ((e4 = a3.H0) == null) {
            e4 = e1.d;
        }
        e1.e = (okh$c)e4;
        final zmi zmi = null;
        ((okh$c)e4).G0 = null;
        a3.H0 = null;
        if (e4 != a3) {
            if (b) {
                Object b2 = e1.b;
                for (okh$c okh$c2 = ((okh$c)e1.d).G0; okh$c2 != null; okh$c2 = okh$c2.G0) {
                    if ((okh$c2.E0 & 0x2) != 0x0 && okh$c2 instanceof rve) {
                        Object o2;
                        if (okh$c2.J0) {
                            final zmi i2 = okh$c2.I0;
                            czd.d((Object)i2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                            final sve sve = (sve)i2;
                            final rve h2 = sve.h1;
                            sve.h1 = (rve)okh$c2;
                            o2 = sve;
                            if (h2 != okh$c2) {
                                sve.p1();
                                o2 = sve;
                            }
                        }
                        else {
                            o2 = new sve(e1.a, (rve)okh$c2);
                            okh$c2.I0 = (zmi)o2;
                        }
                        ((zmi)b2).L0 = (zmi)o2;
                        ((zmi)o2).K0 = (zmi)b2;
                        b2 = o2;
                    }
                    else {
                        okh$c2.I0 = (zmi)b2;
                    }
                }
                final vve x = e1.a.x();
                Object b3 = zmi;
                if (x != null) {
                    b3 = x.e1.b;
                }
                ((zmi)b2).L0 = (zmi)b3;
                e1.c = (zmi)b2;
            }
            if (n3 != 0 && e1.a.H()) {
                e1.a();
            }
            final wmi e5 = this.e1;
            for (zmi zmi2 = e5.c; !czd.a((Object)zmi2, (Object)((zmi)e5.b).K0) && zmi2 != null; zmi2 = zmi2.K0) {
                final xqj a4 = zmi2.a1;
                if (a4 != null) {
                    a4.invalidate();
                }
                zmi2.z1(this.S0);
            }
            final bwe f5 = this.f1;
            final bwe$b j = f5.k;
            final boolean a5 = czd.a(j.N0, j.R0.a().m());
            j.N0 = j.R0.a().m();
            if (a5 ^ true) {
                final vve x2 = f5.a.x();
                if (x2 != null) {
                    x2.Z(false);
                }
            }
            final bwe$a l = f5.l;
            int n5 = 0;
            Label_1199: {
                if (l != null) {
                    final Object q0 = l.Q0;
                    final icg s0 = l.R0.a().S0;
                    czd.c((Object)s0);
                    final boolean a6 = czd.a(q0, s0.m());
                    final icg s2 = l.R0.a().S0;
                    czd.c((Object)s2);
                    l.Q0 = s2.m();
                    if (a6 ^ true) {
                        n5 = n;
                        break Label_1199;
                    }
                }
                n5 = 0;
            }
            if (n5 != 0) {
                if (f5.b(f5.a)) {
                    final vve x3 = f5.a.x();
                    if (x3 != null) {
                        x3.Z(false);
                    }
                }
                else {
                    final vve x4 = f5.a.x();
                    if (x4 != null) {
                        x4.X(false);
                    }
                }
            }
            if (c0 || this.c0()) {
                final vve x5 = this.x();
                if (x5 != null) {
                    x5.D();
                }
            }
            if (czd.a((Object)c2, (Object)this.e1.b)) {
                final wmi e6 = this.e1;
                if (czd.a((Object)e6.c, (Object)e6.b)) {
                    return;
                }
            }
            this.F();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void g(final t6x u0) {
        czd.f((Object)u0, "<set-?>");
        this.U0 = u0;
    }
    
    public final void h() {
        this.Z(false);
        final bwe$b k = this.f1.k;
        pi6 pi6;
        if (k.H0) {
            pi6 = new pi6(((wgk)k).G0);
        }
        else {
            pi6 = null;
        }
        if (pi6 != null) {
            final zqj k2 = this.K0;
            if (k2 != null) {
                k2.q(this, pi6.a);
            }
        }
        else {
            final zqj k3 = this.K0;
            if (k3 != null) {
                yqj.a(k3, false, 1, (Object)null);
            }
        }
    }
    
    public final void i(zqj k0) {
        czd.f((Object)k0, "owner");
        final zqj k2 = this.K0;
        final int n = 0;
        if (k2 != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot attach ");
            sb.append(this);
            sb.append(" as it already is attached.  Tree: ");
            sb.append(this.n(0));
            throw new IllegalStateException(sb.toString().toString());
        }
        final vve j0 = this.J0;
        bwe$a l = null;
        final String s = null;
        if (j0 != null && !czd.a((Object)j0.K0, (Object)k0)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Attaching to a different owner(");
            sb2.append(k0);
            sb2.append(") than the parent's owner(");
            final vve x = this.x();
            if (x != null) {
                k0 = x.K0;
            }
            else {
                k0 = null;
            }
            sb2.append(k0);
            sb2.append("). This tree: ");
            sb2.append(this.n(0));
            sb2.append(" Parent tree: ");
            final vve j2 = this.J0;
            String n2 = s;
            if (j2 != null) {
                n2 = j2.n(0);
            }
            sb2.append(n2);
            throw new IllegalStateException(sb2.toString().toString());
        }
        final vve x2 = this.x();
        if (x2 == null) {
            this.V0 = true;
        }
        this.K0 = k0;
        int l2;
        if (x2 != null) {
            l2 = x2.L0;
        }
        else {
            l2 = -1;
        }
        this.L0 = l2 + 1;
        if (rp9.e0(this) != null) {
            k0.x();
        }
        k0.g(this);
        mcg s2;
        if (x2 == null || (s2 = x2.S0) == null) {
            s2 = null;
        }
        if (!czd.a((Object)s2, (Object)this.S0)) {
            this.S0 = s2;
            final bwe f1 = this.f1;
            Objects.requireNonNull(f1);
            if (s2 != null) {
                l = new bwe$a(f1, s2);
            }
            f1.l = l;
            final wmi e1 = this.e1;
            for (zmi zmi = e1.c; !czd.a((Object)zmi, (Object)((zmi)e1.b).K0) && zmi != null; zmi = zmi.K0) {
                zmi.z1(s2);
            }
        }
        this.e1.a();
        final suh suh = (suh)this.G0.D0;
        final int f2 = suh.F0;
        if (f2 > 0) {
            final Object[] d0 = suh.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n3 = n;
            do {
                ((vve)d0[n3]).i(k0);
            } while (++n3 < f2);
        }
        this.F();
        if (x2 != null) {
            x2.F();
        }
        final wmi e2 = this.e1;
        for (zmi zmi2 = e2.c; !czd.a((Object)zmi2, (Object)((zmi)e2.b).K0) && zmi2 != null; zmi2 = zmi2.K0) {
            zmi2.o1(zmi2.N0);
        }
        final qsb<? super zqj, fzv> l3 = this.l1;
        if (l3 != null) {
            l3.invoke((Object)k0);
        }
    }
    
    public final boolean isValid() {
        return this.H();
    }
    
    public final void j() {
        this.c1 = this.b1;
        this.b1 = 3;
        final suh<vve> z = this.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final vve vve = (vve)d0[n];
                if (vve.b1 != 3) {
                    vve.j();
                }
            } while (++n < f0);
        }
    }
    
    public final void l() {
        this.c1 = this.b1;
        this.b1 = 3;
        final suh<vve> z = this.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final vve vve = (vve)d0[n];
                if (vve.b1 == 2) {
                    vve.l();
                }
            } while (++n < f0);
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
        final suh<vve> z = this.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n2 = 0;
            do {
                sb.append(((vve)d0[n2]).n(n + 1));
            } while (++n2 < f0);
        }
        final String string = sb.toString();
        czd.e((Object)string, "tree.toString()");
        String substring = string;
        if (n == 0) {
            substring = string.substring(0, string.length() - 1);
            czd.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        return substring;
    }
    
    public final void o() {
        final zqj k0 = this.K0;
        String n = null;
        if (k0 == null) {
            final StringBuilder j = fu8.j("Cannot detach node that is already detached!  Tree: ");
            final vve x = this.x();
            if (x != null) {
                n = x.n(0);
            }
            j.append(n);
            throw new IllegalStateException(j.toString().toString());
        }
        final vve x2 = this.x();
        if (x2 != null) {
            x2.D();
            x2.F();
            this.Z0 = 3;
        }
        final bwe f1 = this.f1;
        final wve o0 = f1.k.O0;
        ((kx)o0).b = true;
        ((kx)o0).c = false;
        ((kx)o0).e = false;
        ((kx)o0).d = false;
        ((kx)o0).f = false;
        ((kx)o0).g = false;
        ((kx)o0).h = null;
        final bwe$a l = f1.l;
        if (l != null) {
            final gcg n2 = l.N0;
            if (n2 != null) {
                ((kx)n2).b = true;
                ((kx)n2).c = false;
                ((kx)n2).e = false;
                ((kx)n2).d = false;
                ((kx)n2).f = false;
                ((kx)n2).g = false;
                ((kx)n2).h = null;
            }
        }
        final qsb<? super zqj, fzv> m1 = this.m1;
        if (m1 != null) {
            m1.invoke((Object)k0);
        }
        final wmi e1 = this.e1;
        for (zmi zmi = e1.c; !czd.a((Object)zmi, (Object)((zmi)e1.b).K0) && zmi != null; zmi = zmi.K0) {
            zmi.o1(zmi.N0);
            final vve x3 = zmi.J0.x();
            if (x3 != null) {
                x3.D();
            }
        }
        if (rp9.e0(this) != null) {
            k0.x();
        }
        for (Object o2 = this.e1.d; o2 != null; o2 = ((okh$c)o2).G0) {
            if (((okh$c)o2).J0) {
                ((okh$c)o2).s();
            }
        }
        k0.n(this);
        this.K0 = null;
        this.L0 = 0;
        final suh suh = (suh)this.G0.D0;
        final int f2 = suh.F0;
        if (f2 > 0) {
            final Object[] d0 = suh.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n3 = 0;
            do {
                ((vve)d0[n3]).o();
            } while (++n3 < f2);
        }
        this.W0 = Integer.MAX_VALUE;
        this.X0 = Integer.MAX_VALUE;
        this.V0 = false;
    }
    
    public final void p(final ag3 ag3) {
        czd.f((Object)ag3, "canvas");
        this.e1.c.Z0(ag3);
    }
    
    public final List<cqg> q() {
        final bwe$a l = this.f1.l;
        czd.c((Object)l);
        l.R0.a.s();
        List list;
        if (!l.P0) {
            list = l.O0.g();
        }
        else {
            rp9.A(l.R0.a, l.O0, (qsb)yve.D0);
            l.P0 = false;
            list = l.O0.g();
        }
        return list;
    }
    
    public final List<cqg> r() {
        final bwe$b k = this.f1.k;
        k.R0.a.d0();
        List list;
        if (!k.Q0) {
            list = k.P0.g();
        }
        else {
            rp9.A(k.R0.a, k.P0, (qsb)cwe.D0);
            k.Q0 = false;
            list = k.P0.g();
        }
        return list;
    }
    
    public final List<vve> s() {
        return this.z().g();
    }
    
    public final List<vve> t() {
        return ((suh)this.G0.D0).g();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(wj1.u((Object)this));
        sb.append(" children: ");
        sb.append(this.s().size());
        sb.append(" measurePolicy: ");
        sb.append(this.P0);
        return sb.toString();
    }
    
    public final vve x() {
        final vve j0 = this.J0;
        boolean b = true;
        if (j0 == null || !j0.D0) {
            b = false;
        }
        vve x = j0;
        if (b) {
            if (j0 != null) {
                x = j0.x();
            }
            else {
                x = null;
            }
        }
        return x;
    }
    
    public final suh<vve> y() {
        if (this.O0) {
            this.N0.h();
            final suh<vve> n0 = this.N0;
            n0.e(n0.F0, (suh)this.z());
            this.N0.s((Comparator)vve.s1);
            this.O0 = false;
        }
        return this.N0;
    }
    
    public final suh<vve> z() {
        this.d0();
        suh h0;
        if (this.F0 == 0) {
            h0 = (suh)this.G0.D0;
        }
        else {
            h0 = this.H0;
            czd.c((Object)h0);
        }
        return (suh<vve>)h0;
    }
    
    public abstract static class e implements fqg
    {
        public final String a;
        
        public e(final String a) {
            czd.f((Object)a, "error");
            this.a = a;
        }
        
        public final int a(final zyd zyd, final List list, final int n) {
            czd.f((Object)zyd, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
        
        public final int c(final zyd zyd, final List list, final int n) {
            czd.f((Object)zyd, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
        
        public final int d(final zyd zyd, final List list, final int n) {
            czd.f((Object)zyd, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
        
        public final int e(final zyd zyd, final List list, final int n) {
            czd.f((Object)zyd, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
    }
}
