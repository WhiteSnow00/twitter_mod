// 
// Decompiled by Procyon v0.6.0
// 

public final class i1d implements u4t
{
    public static final i1d.i1d$b H0;
    public final jwd D0;
    public final int E0;
    public final oxm F0;
    public final oxm G0;
    
    static {
        H0 = new i1d.i1d$b();
    }
    
    public i1d(final a a) {
        this.D0 = a.a;
        this.E0 = a.b;
        this.F0 = a.c;
        this.G0 = a.d;
    }
    
    public final a a() {
        final a a = new a();
        a.a = this.D0;
        a.b = this.E0;
        a.c = this.F0;
        a.d = this.G0;
        return a;
    }
    
    public static final class a extends n4j<i1d>
    {
        public jwd a;
        public int b;
        public oxm c;
        public oxm d;
        
        public a() {
            this.b = 1;
        }
        
        public final Object i() {
            return new i1d(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
}
