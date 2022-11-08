// 
// Decompiled by Procyon v0.6.0
// 

public final class k8c implements n5d
{
    public final long C0;
    public final String D0;
    public final String E0;
    public final hfv F0;
    public final boolean G0;
    public final int H0;
    public final int I0;
    public final boolean J0;
    public final boolean K0;
    public final Boolean L0;
    public final ci1 M0;
    public final ci1 N0;
    
    public k8c(final a a) {
        this.C0 = a.a;
        final String b = a.b;
        pf8.r(b);
        this.D0 = b;
        this.E0 = a.c;
        this.G0 = a.d;
        final hfv e = a.e;
        pf8.r(e);
        this.F0 = e;
        this.H0 = a.f;
        this.I0 = a.g;
        this.J0 = a.h;
        this.K0 = a.i;
        this.L0 = a.j;
        this.M0 = a.k;
        this.N0 = a.l;
    }
    
    public final xbv a() {
        final xbv$a xbv$a = new xbv$a();
        xbv$a.f = this.C0;
        final String d0 = this.D0;
        xbv$a.k = d0;
        xbv$a.l = d0;
        xbv$a.m = this.E0;
        xbv$a.c = this.G0;
        xbv$a.d = this.H0;
        xbv$a.e = this.I0;
        final hfv f0 = this.F0;
        xbv$a.h = f0.C0;
        xbv$a.o(f0);
        xbv$a.a = this.J0;
        xbv$a.b = this.K0;
        xbv$a.i = this.L0;
        xbv$a.r = this.M0;
        xbv$a.s = this.N0;
        return (xbv)((h4j)xbv$a).e();
    }
    
    @Override
    public final long getId() {
        return this.C0;
    }
    
    public static final class a extends h4j<k8c>
    {
        public long a;
        public String b;
        public String c;
        public boolean d;
        public hfv e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public Boolean j;
        public ci1 k;
        public ci1 l;
        
        public a() {
            this.a = -1L;
        }
        
        public final Object i() {
            return new k8c(this);
        }
        
        public final boolean l() {
            return this.a != -1L && pjr.g((CharSequence)this.b) && this.e != null;
        }
    }
}
