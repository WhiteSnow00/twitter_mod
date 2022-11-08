// 
// Decompiled by Procyon v0.6.0
// 

public final class g77
{
    public static final alp<g77> f;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ncq e;
    
    static {
        g77.f = new g77.g77$b();
    }
    
    public g77(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && g77.class == o.getClass()) {
            final g77 g77 = (g77)o;
            if (this.a != g77.a || this.b != g77.b || this.c != g77.c || this.d != g77.d || !w4j.a((Object)this.e, (Object)g77.e)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.j((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e);
    }
    
    public static final class a extends h4j<g77>
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public ncq e;
        
        public a() {
            this.e = ncq.c;
        }
        
        public final Object i() {
            return new g77(this);
        }
    }
}
