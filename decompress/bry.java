import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bry implements b5j<q3z>
{
    public static final bry a;
    
    static {
        final z000 f0 = z000.F0;
        a = new bry();
        final czz czz = new czz(1, f0);
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)czz).annotationType(), czz);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final czz czz2 = new czz(2, f0);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(((Annotation)czz2).annotationType(), czz2);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap2));
        final czz czz3 = new czz(3, f0);
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(((Annotation)czz3).annotationType(), czz3);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap3));
        final czz czz4 = new czz(4, f0);
        final HashMap hashMap4 = new HashMap();
        hashMap4.put(((Annotation)czz4).annotationType(), czz4);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap4));
        final czz czz5 = new czz(5, f0);
        final HashMap hashMap5 = new HashMap();
        ehk.g(czz5, hashMap5, czz5, hashMap5);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final q3z q3z = (q3z)o;
        final c5j c5j = (c5j)o2;
        throw null;
    }
}
