import java.util.HashMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z8h implements vf1
{
    public final z8h.z8h$a a;
    public final u57 b;
    public final Map<String, p0u> c;
    
    public z8h(final Context context, final u57 b) {
        final z8h.z8h$a a = new z8h.z8h$a(context);
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final p0u a(final String s) {
        synchronized (this) {
            if (this.c.containsKey(s)) {
                return this.c.get(s);
            }
            final uf1 a = this.a.a(s);
            if (a == null) {
                return null;
            }
            final u57 b = this.b;
            final p0u create = a.create((t57)new wa1(b.a, b.b, b.c, s));
            this.c.put(s, create);
            return create;
        }
    }
}
