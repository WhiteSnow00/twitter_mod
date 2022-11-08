import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtg extends w5w implements oy, of3
{
    public static final alp<dtg> o1;
    public static final alp<pug> p1;
    public final long M0;
    public final long N0;
    public final long O0;
    public final ebh P0;
    public final String Q0;
    public final moj R0;
    public final dtg$c S0;
    public final ncq T0;
    public final h2h U0;
    public final List<s0h> V0;
    public final List<umu> W0;
    public final cxw X0;
    public final String Y0;
    public final boolean Z0;
    public final String a1;
    public final boolean b1;
    public final String c1;
    public final ezg d1;
    public final i0h e1;
    public final List<rr4> f1;
    public final boolean g1;
    public final fwg h1;
    public final pbc i1;
    public final frg j1;
    public final List<r6d> k1;
    public final boolean l1;
    public Set<jhp> m1;
    public final zhh n1;
    
    static {
        dtg.o1 = new dtg.dtg$b();
        dtg.p1 = pug.E0;
    }
    
    public dtg(final a a) {
        super((w5w$a)a);
        this.M0 = a.g;
        this.N0 = a.h;
        final String j = a.j;
        final String h0 = super.H0;
        String q0 = j;
        if (j == null) {
            q0 = h0;
        }
        this.Q0 = q0;
        this.R0 = a.k;
        this.O0 = a.i;
        this.S0 = a.l;
        this.T0 = a.m;
        this.W0 = ijf.x((List)a.n);
        this.V0 = ijf.x((List)a.p);
        this.U0 = a.o;
        this.X0 = a.q;
        final String r = a.r;
        final String s = "";
        String y0;
        if ((y0 = r) == null) {
            y0 = "";
        }
        this.Y0 = y0;
        this.Z0 = a.s;
        String t;
        if ((t = a.t) == null) {
            t = "";
        }
        this.a1 = t;
        this.P0 = a.u;
        this.b1 = a.v;
        String w = a.w;
        if (w == null) {
            w = s;
        }
        this.c1 = w;
        this.d1 = a.x;
        this.e1 = a.y;
        Object f1;
        if ((f1 = a.z) == null) {
            f1 = v2a.C0;
        }
        this.f1 = (List<rr4>)f1;
        this.g1 = a.A;
        this.h1 = a.B;
        this.i1 = a.C;
        this.j1 = a.D;
        this.k1 = a.E;
        this.l1 = a.F;
        Object m1;
        if ((m1 = a.G) == null) {
            m1 = f3a.C0;
        }
        this.m1 = (Set<jhp>)m1;
        this.n1 = a.H;
    }
    
    public final String b() {
        return this.c1;
    }
    
    public final Set<jhp> e() {
        return this.m1;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof dtg && this.m((dtg)o));
    }
    
    public final d7a.a g() {
        return (d7a.a)new a(this);
    }
    
    public final int hashCode() {
        return w4j.g((Object)this.M0, (Object)super.hashCode());
    }
    
    public final w5w$a j() {
        return new a(this);
    }
    
    public final boolean m(final dtg dtg) {
        return this == dtg || (this.i((w5w)dtg) && this.M0 == dtg.M0);
    }
    
    public static final class a extends w5w$a<dtg, a>
    {
        public boolean A;
        public fwg B;
        public pbc C;
        public frg D;
        public List<r6d> E;
        public boolean F;
        public Set<jhp> G;
        public zhh H;
        public long g;
        public long h;
        public long i;
        public String j;
        public moj k;
        public dtg$c l;
        public ncq m;
        public List<umu> n;
        public h2h o;
        public List<s0h> p;
        public cxw q;
        public String r;
        public boolean s;
        public String t;
        public ebh u;
        public boolean v;
        public String w;
        public ezg x;
        public i0h y;
        public List<rr4> z;
        
        public a() {
            this.k = moj.e;
            this.l = dtg$c.D0;
            this.m = ncq.c;
            this.s = false;
            this.A = false;
            this.F = false;
            this.G = null;
        }
        
        public a(final dtg dtg) {
            super((w5w)dtg);
            this.k = moj.e;
            this.l = dtg$c.D0;
            final ncq c = ncq.c;
            this.g = dtg.M0;
            this.h = dtg.N0;
            this.i = dtg.O0;
            this.j = dtg.Q0;
            this.k = dtg.R0;
            this.l = dtg.S0;
            this.m = dtg.T0;
            this.n = dtg.W0;
            this.o = dtg.U0;
            this.p = dtg.V0;
            this.q = dtg.X0;
            this.r = dtg.Y0;
            this.s = dtg.Z0;
            this.t = dtg.a1;
            this.u = dtg.P0;
            this.v = dtg.b1;
            this.w = dtg.c1;
            this.x = dtg.d1;
            this.y = dtg.e1;
            this.z = dtg.f1;
            this.A = dtg.g1;
            this.B = dtg.h1;
            this.C = dtg.i1;
            this.D = dtg.j1;
            this.E = dtg.k1;
            this.F = dtg.l1;
            this.G = dtg.m1;
            this.H = dtg.n1;
        }
        
        public final Object i() {
            return new dtg(this);
        }
        
        public final a p(moj e) {
            if (e == null) {
                e = moj.e;
            }
            this.k = e;
            return this;
        }
        
        public final a q(final hfv hfv) {
            ebh a;
            if (hfv != null) {
                a = ebh.a(hfv);
            }
            else {
                a = null;
            }
            this.u = a;
            return this;
        }
    }
}
