import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7c implements r9
{
    public final String a;
    public final Map<String, Object> b;
    public final h8c c;
    
    public p7c(final a a) {
        final String a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        this.b = (Map)((z4j)a.b).e();
        this.c = a.c;
    }
    
    public static final class a extends z4j<p7c>
    {
        public String a;
        public final kkg<String, Object> b;
        public h8c c;
        
        public a() {
            this.b = (kkg$a)kkg.t();
        }
        
        public final Object i() {
            return new p7c(this);
        }
        
        public final boolean k() {
            return flr.g((CharSequence)this.a);
        }
        
        public final a o(final String s, final Object o) {
            ((kkg)this.b).w((Object)s, o);
            return this;
        }
    }
}
