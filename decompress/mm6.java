import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mm6
{
    public final Map<String, Object> a;
    public final List<String> b;
    
    public mm6() {
        this.a = new HashMap();
        this.b = new ArrayList();
    }
    
    public static mm6 b(final mm6 mm6, final long n) {
        mm6.a("exo_len", n);
        return mm6;
    }
    
    public final mm6 a(final String s, final Object o) {
        final HashMap a = this.a;
        Objects.requireNonNull(o);
        a.put(s, o);
        this.b.remove(s);
        return this;
    }
}
