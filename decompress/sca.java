import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sca
{
    public static a a() {
        final ab1$b ab1$b = new ab1$b();
        ab1$b.f = new HashMap();
        return (a)ab1$b;
    }
    
    public final String b(String s) {
        if ((s = this.c().get(s)) == null) {
            s = "";
        }
        return s;
    }
    
    public abstract Map<String, String> c();
    
    public abstract Integer d();
    
    public abstract p4a e();
    
    public abstract long f();
    
    public final int g(String s) {
        s = this.c().get(s);
        int intValue;
        if (s == null) {
            intValue = 0;
        }
        else {
            intValue = Integer.valueOf(s);
        }
        return intValue;
    }
    
    public abstract String h();
    
    public abstract long i();
    
    public final a j() {
        final ab1$b ab1$b = new ab1$b();
        ab1$b.f(this.h());
        ab1$b.b = this.d();
        ab1$b.h(this.e());
        ab1$b.e(this.f());
        ab1$b.g(this.i());
        ab1$b.f = new HashMap(this.c());
        return (a)ab1$b;
    }
    
    public abstract static class a
    {
        public final a a(final String s, final int n) {
            this.d().put(s, String.valueOf(n));
            return this;
        }
        
        public final a b(final String s, final String s2) {
            this.d().put(s, s2);
            return this;
        }
        
        public abstract sca c();
        
        public abstract Map<String, String> d();
        
        public abstract a e(final long p0);
        
        public abstract a f(final String p0);
        
        public abstract a g(final long p0);
    }
}
