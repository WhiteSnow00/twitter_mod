import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wd
{
    public final Map<String, fpp> b;
    
    public wd(final a a) {
        final Object e = ((z4j)a.a).e();
        final int a2 = o5j.a;
        this.b = (Map<String, fpp>)e;
    }
    
    public abstract static class a<SP extends wd, B extends z4j<SP>> extends z4j<SP>
    {
        public kkg<String, fpp> a;
        
        public a() {
            this.a = (kkg$a)kkg.t();
        }
        
        public final B o(final Map<String, fpp> map) {
            this.a = (kkg$a)kkg.u((Map)map);
            final int a = o5j.a;
            return (B)this;
        }
    }
}
