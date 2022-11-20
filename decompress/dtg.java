import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtg extends h6w implements py, xe3
{
    public static final rlp<dtg> p1;
    public static final rlp<pug> q1;
    public final long N0;
    public final long O0;
    public final long P0;
    public final gbh Q0;
    public final String R0;
    public final soj S0;
    public final c T0;
    public final edq U0;
    public final i2h V0;
    public final List<u0h> W0;
    public final List<onu> X0;
    public final vxw Y0;
    public final String Z0;
    public final boolean a1;
    public final String b1;
    public final boolean c1;
    public final String d1;
    public final fzg e1;
    public final k0h f1;
    public final List<pq4> g1;
    public final boolean h1;
    public final fwg i1;
    public final pac j1;
    public final frg k1;
    public final List<v5d> l1;
    public final boolean m1;
    public Set<aip> n1;
    public final eih o1;
    
    static {
        dtg.p1 = new dtg.dtg$b();
        dtg.q1 = pug.F0;
    }
    
    public dtg(final a a) {
        super((h6w.a)a);
        this.N0 = a.g;
        this.O0 = a.h;
        final String j = a.j;
        final String i0 = super.I0;
        String r0 = j;
        if (j == null) {
            r0 = i0;
        }
        this.R0 = r0;
        this.S0 = a.k;
        this.P0 = a.i;
        this.T0 = a.l;
        this.U0 = a.m;
        this.X0 = rif.x((List)a.n);
        this.W0 = rif.x((List)a.p);
        this.V0 = a.o;
        this.Y0 = a.q;
        final String r2 = a.r;
        final String s = "";
        String z0;
        if ((z0 = r2) == null) {
            z0 = "";
        }
        this.Z0 = z0;
        this.a1 = a.s;
        String t;
        if ((t = a.t) == null) {
            t = "";
        }
        this.b1 = t;
        this.Q0 = a.u;
        this.c1 = a.v;
        String w = a.w;
        if (w == null) {
            w = s;
        }
        this.d1 = w;
        this.e1 = a.x;
        this.f1 = a.y;
        Object g1;
        if ((g1 = a.z) == null) {
            g1 = f2a.D0;
        }
        this.g1 = (List<pq4>)g1;
        this.h1 = a.A;
        this.i1 = a.B;
        this.j1 = a.C;
        this.k1 = a.D;
        this.l1 = a.E;
        this.m1 = a.F;
        Object n1;
        if ((n1 = a.G) == null) {
            n1 = p2a.D0;
        }
        this.n1 = (Set<aip>)n1;
        this.o1 = a.H;
    }
    
    public final String b() {
        return this.d1;
    }
    
    public final Set<aip> e() {
        return this.n1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof dtg && this.m((dtg)o));
    }
    
    public final m6a$a g() {
        return new a(this);
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.N0, (Object)super.hashCode());
    }
    
    @Override
    public final h6w.a j() {
        return new a(this);
    }
    
    public final boolean m(final dtg dtg) {
        return this == dtg || (this.i(dtg) && this.N0 == dtg.N0);
    }
    
    public static final class a extends h6w.a<dtg, a>
    {
        public boolean A;
        public fwg B;
        public pac C;
        public frg D;
        public List<v5d> E;
        public boolean F;
        public Set<aip> G;
        public eih H;
        public long g;
        public long h;
        public long i;
        public String j;
        public soj k;
        public c l;
        public edq m;
        public List<onu> n;
        public i2h o;
        public List<u0h> p;
        public vxw q;
        public String r;
        public boolean s;
        public String t;
        public gbh u;
        public boolean v;
        public String w;
        public fzg x;
        public k0h y;
        public List<pq4> z;
        
        public a() {
            this.k = soj.e;
            this.l = c.E0;
            this.m = edq.c;
            this.s = false;
            this.A = false;
            this.F = false;
            this.G = null;
        }
        
        public a(final dtg dtg) {
            super(dtg);
            this.k = soj.e;
            this.l = c.E0;
            final edq c = edq.c;
            this.g = dtg.N0;
            this.h = dtg.O0;
            this.i = dtg.P0;
            this.j = dtg.R0;
            this.k = dtg.S0;
            this.l = dtg.T0;
            this.m = dtg.U0;
            this.n = dtg.X0;
            this.o = dtg.V0;
            this.p = dtg.W0;
            this.q = dtg.Y0;
            this.r = dtg.Z0;
            this.s = dtg.a1;
            this.t = dtg.b1;
            this.u = dtg.Q0;
            this.v = dtg.c1;
            this.w = dtg.d1;
            this.x = dtg.e1;
            this.y = dtg.f1;
            this.z = dtg.g1;
            this.A = dtg.h1;
            this.B = dtg.i1;
            this.C = dtg.j1;
            this.D = dtg.k1;
            this.E = dtg.l1;
            this.F = dtg.m1;
            this.G = dtg.n1;
            this.H = dtg.o1;
        }
        
        public final Object i() {
            return new dtg(this);
        }
        
        public final a p(soj e) {
            if (e == null) {
                e = soj.e;
            }
            this.k = e;
            return this;
        }
        
        public final a q(final cgv cgv) {
            gbh a;
            if (cgv != null) {
                a = gbh.a(cgv);
            }
            else {
                a = null;
            }
            this.u = a;
            return this;
        }
    }
    
    public enum c
    {
        E0(0), 
        F0(1), 
        G0(2), 
        H0(3), 
        I0(4);
        
        public static final c[] J0;
        public static final c[] K0;
        public final int D0;
        
        static {
            J0 = values();
        }
        
        public c(final int d0) {
            this.D0 = d0;
        }
    }
}
