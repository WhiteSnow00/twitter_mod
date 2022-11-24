// 
// Decompiled by Procyon v0.6.0
// 

public final class wcj
{
    public final dtv a;
    public final rkp b;
    public final String c;
    public final int d;
    public final t53 e;
    public final zdj f;
    
    public wcj(final a a) {
        e0e.f((Object)a, "builder");
        final dtv a2 = a.a;
        e0e.c((Object)a2);
        this.a = a2;
        this.b = a.b;
        String c;
        if ((c = a.f) == null) {
            final dtv a3 = a.a;
            if (a3 != null) {
                c = a3.c;
            }
            else {
                c = null;
            }
        }
        this.c = c;
        this.d = a.c;
        this.e = a.d;
        this.f = a.e;
    }
    
    public static final class a extends z4j<wcj>
    {
        public dtv a;
        public rkp b;
        public int c;
        public t53 d;
        public zdj e;
        public String f;
        
        public a() {
            this.d = t53.H0;
            this.e = zdj.H0;
        }
        
        public final Object i() {
            return new wcj(this);
        }
        
        public final boolean k() {
            return this.a != null;
        }
        
        public final a o(final dtv a) {
            e0e.f((Object)a, "navigationLink");
            this.a = a;
            return this;
        }
        
        public final a p(final t53 d) {
            e0e.f((Object)d, "size");
            this.d = d;
            return this;
        }
    }
}
