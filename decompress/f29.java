import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f29 implements sso
{
    public final nsb<fzv> a;
    public final sso b;
    
    public f29(final sso b, final nsb<fzv> a) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final Object o) {
        czd.f(o, "value");
        return this.b.a(o);
    }
    
    public final sso$a b(final String s, final nsb<?> nsb) {
        czd.f((Object)s, "key");
        return this.b.b(s, (nsb)nsb);
    }
    
    public final Map<String, List<Object>> e() {
        return this.b.e();
    }
    
    public final Object f(final String s) {
        czd.f((Object)s, "key");
        return this.b.f(s);
    }
}
