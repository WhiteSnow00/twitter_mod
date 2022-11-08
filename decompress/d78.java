import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class d78
{
    public static final alp<d78> b;
    public final Map<String, Object> a;
    
    static {
        d78.b = new d78.d78$a();
    }
    
    public d78() {
        final ged$b c0 = ged.C0;
        final int a = w4j.a;
        this((Map<String, Object>)c0);
    }
    
    public d78(final Map<String, Object> a) {
        this.a = a;
    }
    
    public static d78 b(final Map<String, az1> map) {
        final sjg t = sjg.t();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final Object a = ((az1)entry.getValue()).a;
            if (a instanceof akw) {
                t.w((Object)s, (Object)((akw)a).a);
            }
            else if (a instanceof v7d) {
                t.w((Object)s, (Object)a);
            }
            else {
                t.w((Object)s, a);
            }
        }
        return new d78((Map<String, Object>)((h4j)t).e());
    }
    
    public final boolean a(final String s) {
        return this.a.containsKey(s);
    }
    
    public final Object c(final String s) {
        return this.a.get(s);
    }
    
    public final <T> T d(final String s, final Class<T> clazz) {
        return clazz.cast(this.a.get(s));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d78 && w4j.a((Object)this.a, (Object)((d78)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
