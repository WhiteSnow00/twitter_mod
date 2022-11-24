// 
// Decompiled by Procyon v0.6.0
// 

public final class tys implements rsj
{
    public static final nmp<tys> c;
    public final String a;
    public final rss b;
    
    static {
        tys.c = new tys.tys$b();
    }
    
    public tys(final a a) {
        final String a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        this.b = a.b;
    }
    
    public final rss a() {
        return this.b;
    }
    
    public static final class a extends z4j<tys>
    {
        public String a;
        public rss b;
        
        public final Object i() {
            return new tys(this);
        }
        
        public final boolean k() {
            return this.a != null;
        }
    }
}
