import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n39 implements mto
{
    public final ptb<vzv> a;
    public final mto b;
    
    public n39(final mto b, final ptb<vzv> a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final Object o) {
        e0e.f(o, "value");
        return this.b.a(o);
    }
    
    @Override
    public final a b(final String s, final ptb<?> ptb) {
        e0e.f((Object)s, "key");
        return this.b.b(s, ptb);
    }
    
    @Override
    public final Map<String, List<Object>> e() {
        return this.b.e();
    }
    
    @Override
    public final Object f(final String s) {
        e0e.f((Object)s, "key");
        return this.b.f(s);
    }
}
