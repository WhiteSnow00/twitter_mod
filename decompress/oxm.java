// 
// Decompiled by Procyon v0.6.0
// 

public final class oxm implements xes
{
    public static final alp<oxm> E0;
    public final long C0;
    public final String D0;
    
    static {
        oxm.E0 = new oxm.oxm$b();
    }
    
    public oxm(final a a) {
        this.C0 = a.a;
        final String b = a.b;
        pf8.r(b);
        this.D0 = b;
    }
    
    public static final class a extends h4j<oxm>
    {
        public long a;
        public String b;
        
        public a() {
            this.a = -1L;
        }
        
        public final Object i() {
            return new oxm(this);
        }
        
        public final boolean l() {
            return this.a != -1L && this.b != null;
        }
    }
}
