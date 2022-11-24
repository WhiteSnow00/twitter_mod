// 
// Decompiled by Procyon v0.6.0
// 

public final class n8c implements s5d
{
    public final long F0;
    public final String G0;
    public final String H0;
    public final qgv I0;
    public final boolean J0;
    public final int K0;
    public final int L0;
    public final boolean M0;
    public final boolean N0;
    public final Boolean O0;
    public final zh1 P0;
    public final zh1 Q0;
    
    public n8c(final a a) {
        this.F0 = a.a;
        final String b = a.b;
        vmw.g((Object)b);
        this.G0 = b;
        this.H0 = a.c;
        this.J0 = a.d;
        final qgv e = a.e;
        vmw.g((Object)e);
        this.I0 = e;
        this.K0 = a.f;
        this.L0 = a.g;
        this.M0 = a.h;
        this.N0 = a.i;
        this.O0 = a.j;
        this.P0 = a.k;
        this.Q0 = a.l;
    }
    
    public final gdv a() {
        final gdv$a gdv$a = new gdv$a();
        gdv$a.f = this.F0;
        final String g0 = this.G0;
        gdv$a.k = g0;
        gdv$a.l = g0;
        gdv$a.m = this.H0;
        gdv$a.c = this.J0;
        gdv$a.d = this.K0;
        gdv$a.e = this.L0;
        final qgv i0 = this.I0;
        gdv$a.h = i0.F0;
        gdv$a.o(i0);
        gdv$a.a = this.M0;
        gdv$a.b = this.N0;
        gdv$a.i = this.O0;
        gdv$a.r = this.P0;
        gdv$a.s = this.Q0;
        return (gdv)((z4j)gdv$a).e();
    }
    
    public final long getId() {
        return this.F0;
    }
    
    public static final class a extends z4j<n8c>
    {
        public long a;
        public String b;
        public String c;
        public boolean d;
        public qgv e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public Boolean j;
        public zh1 k;
        public zh1 l;
        
        public a() {
            this.a = -1L;
        }
        
        public final Object i() {
            return new n8c(this);
        }
        
        public final boolean k() {
            return this.a != -1L && flr.g((CharSequence)this.b) && this.e != null;
        }
    }
}
