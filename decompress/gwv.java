import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwv implements mwv<lea>
{
    public final long F0;
    public final String G0;
    public final int H0;
    public final c9t I0;
    public final String J0;
    public final long K0;
    public final String L0;
    public final hpj M0;
    public final o5t N0;
    public final hwv O0;
    public final vg1 P0;
    public final jwv Q0;
    public final fym R0;
    public final List<q9c> S0;
    public final pyo T0;
    
    public gwv(final a a) {
        this.F0 = a.a;
        final String b = a.b;
        vmw.g((Object)b);
        this.G0 = b;
        this.H0 = a.c;
        final c9t d = a.d;
        vmw.g((Object)d);
        this.I0 = d;
        this.J0 = a.e;
        this.K0 = a.f;
        this.L0 = a.g;
        this.M0 = a.h;
        this.N0 = a.i;
        this.Q0 = a.l;
        this.O0 = a.j;
        this.P0 = a.k;
        this.R0 = a.m;
        this.S0 = ojf.x((List)a.n);
        this.T0 = a.o;
    }
    
    public final lea a(final y4c y4c, final lsm lsm) {
        final long k0 = this.K0;
        final jnt jnt = null;
        qgv f;
        if (k0 != 0L) {
            f = y4c.f(String.valueOf(k0));
        }
        else {
            f = null;
        }
        a61 a;
        if (f != null) {
            a = a61.a(f);
        }
        else {
            a = null;
        }
        final hwv o0 = this.O0;
        rea a2;
        if (o0 != null) {
            a2 = o0.a(y4c);
        }
        else {
            a2 = null;
        }
        final o5t n0 = this.N0;
        jnt p2 = jnt;
        if (n0 instanceof bmt) {
            final int a3 = o5j.a;
            final bmt bmt = (bmt)n0;
            final jnt.b f2 = jnt.f;
            final lxd e = y4c.e(bmt.F0);
            p2 = jnt;
            if (e != null) {
                final jnt.a a4 = new jnt.a();
                a4.a = e.a;
                a4.c = e.c;
                a4.d = e.e;
                a4.e = bmt.G0;
                p2 = (jnt)a4.e();
            }
        }
        final lea$a lea$a = new lea$a();
        lea$a.a = this.F0;
        lea$a.b = this.G0;
        lea$a.c = this.H0;
        lea$a.e = this.J0;
        lea$a.f = a;
        lea$a.g = this.L0;
        lea$a.d = this.I0;
        lea$a.i = this.N0;
        lea$a.h = this.M0;
        lea$a.j = (sjl)mwv$a.a((mwv)this.Q0, y4c, lsm);
        lea$a.k = a2;
        lea$a.l = this.P0;
        lea$a.m = this.R0;
        lea$a.n = this.S0;
        lea$a.o = this.T0;
        lea$a.p = p2;
        return (lea)((z4j)lea$a).e();
    }
    
    public final /* bridge */ Object b(final y4c y4c, final lsm lsm) {
        return this.a(y4c, lsm);
    }
    
    public static final class a extends z4j<gwv>
    {
        public long a;
        public String b;
        public int c;
        public c9t d;
        public String e;
        public long f;
        public String g;
        public hpj h;
        public o5t i;
        public hwv j;
        public vg1 k;
        public jwv l;
        public fym m;
        public List<q9c> n;
        public pyo o;
        
        public final Object i() {
            return new gwv(this);
        }
        
        public final boolean k() {
            return this.a != 0L && this.b != null && this.d != null && this.c != 0;
        }
    }
}
