import java.util.HashMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9h implements rf1
{
    public final b9h.b9h$a a;
    public final y47 b;
    public final Map<String, f1u> c;
    
    public b9h(final Context context, final y47 b) {
        final b9h.b9h$a a = new b9h.b9h$a(context);
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final f1u a(final String s) {
        synchronized (this) {
            if (this.c.containsKey(s)) {
                return this.c.get(s);
            }
            final qf1 a = this.a.a(s);
            if (a == null) {
                return null;
            }
            final y47 b = this.b;
            final f1u create = a.create(new sa1(b.a, b.b, b.c, s));
            this.c.put(s, create);
            return create;
        }
    }
}
