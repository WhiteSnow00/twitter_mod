import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n16
{
    public static final b Companion;
    public List<? extends fqp> a;
    public List<? extends fqp> b;
    public List<? extends fqp> c;
    public List<? extends fqp> d;
    public List<? extends fqp> e;
    
    static {
        Companion = new b();
    }
    
    public n16(final n16$a n16$a) {
        this.a = n16$a.a;
        this.b = n16$a.b;
        final List c = n16$a.c;
        this.c = c;
        this.d = c;
        this.e = n16$a.e;
    }
    
    public static final class b
    {
    }
    
    public static final class c extends s4j<n16>
    {
        public static final c b;
        
        static {
            b = new c();
        }
        
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final n16$a n16$a = new n16$a();
            final jx6 e = fqp.e;
            n16$a.a = (List)((s4j)new xq4$a((alp)e)).a(elp);
            n16$a.b = (List)((s4j)new xq4$a((alp)e)).a(elp);
            n16$a.c = (List)((s4j)new xq4$a((alp)e)).a(elp);
            n16$a.d = (List)((s4j)new xq4$a((alp)e)).a(elp);
            n16$a.e = (List)((s4j)new xq4$a((alp)e)).a(elp);
            return ((h4j)n16$a).e();
        }
        
        public final void f(final flp flp, final Object o) {
            final n16 n16 = (n16)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)n16, "componentCollection");
            final List<? extends fqp> a = n16.a;
            final jx6 e = fqp.e;
            t4a.m(e, flp, (List)a);
            final int a2 = w4j.a;
            t4a.m(e, flp, (List)n16.b);
            t4a.m(e, flp, (List)n16.c);
            t4a.m(e, flp, (List)n16.d);
            t4a.m(e, flp, (List)n16.e);
        }
    }
}
