// 
// Decompiled by Procyon v0.6.0
// 

public final class z5q extends lsr
{
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String j;
    public final String k;
    public final kcj l;
    public final kcj m;
    public final kcj n;
    public final kcj o;
    public final ea8 p;
    public final xdj q;
    public final xdj r;
    public final xrv s;
    public final xrv t;
    public final xrv u;
    public final xrv v;
    public final xrv w;
    public final xrv x;
    public final xrv y;
    public final boolean z;
    
    public z5q(final a a) {
        super((lsr$a)a);
        final String k = a.k;
        final String s = "";
        String j = k;
        if (k == null) {
            j = "";
        }
        this.j = j;
        String l;
        if ((l = a.l) == null) {
            l = "";
        }
        this.k = l;
        final kcj m = a.m;
        Object b = x1j.b;
        Object i;
        if ((i = m) == null) {
            i = b;
        }
        this.l = (kcj)i;
        Object n;
        if ((n = a.n) == null) {
            n = b;
        }
        this.m = (kcj)n;
        Object o;
        if ((o = a.o) == null) {
            o = b;
        }
        this.n = (kcj)o;
        final kcj p = a.p;
        if (p != null) {
            b = p;
        }
        this.o = (kcj)b;
        final ea8 q = a.q;
        pf8.r(q);
        this.p = q;
        final xdj r = a.r;
        xdj k2 = xdj.K0;
        xdj q2 = r;
        if (r == null) {
            q2 = k2;
        }
        this.q = q2;
        final xdj s2 = a.s;
        if (s2 != null) {
            k2 = s2;
        }
        this.r = k2;
        final xrv t = a.t;
        pf8.r(t);
        this.s = t;
        final xrv u = a.u;
        pf8.r(u);
        this.t = u;
        final xrv v = a.v;
        pf8.r(v);
        this.u = v;
        final xrv w = a.w;
        pf8.r(w);
        this.v = w;
        final xrv x = a.x;
        pf8.r(x);
        this.w = x;
        final xrv y = a.y;
        pf8.r(y);
        this.x = y;
        final xrv z = a.z;
        pf8.r(z);
        this.y = z;
        final Boolean value = a.A;
        pf8.r(value);
        this.z = value;
        String b2;
        if ((b2 = a.B) == null) {
            b2 = "";
        }
        this.A = b2;
        String c;
        if ((c = a.C) == null) {
            c = "";
        }
        this.B = c;
        String d;
        if ((d = a.D) == null) {
            d = "";
        }
        this.C = d;
        String e = a.E;
        if (e == null) {
            e = s;
        }
        this.D = e;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new y5q(s, this);
    }
    
    public static final class a extends lsr$a<z5q, a>
    {
        public boolean A;
        public String B;
        public String C;
        public String D;
        public String E;
        public String k;
        public String l;
        public kcj m;
        public kcj n;
        public kcj o;
        public kcj p;
        public ea8 q;
        public xdj r;
        public xdj s;
        public xrv t;
        public xrv u;
        public xrv v;
        public xrv w;
        public xrv x;
        public xrv y;
        public xrv z;
        
        public final Object i() {
            return new z5q(this);
        }
    }
}
