import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fry implements b5j<u3z>
{
    public static final fry a;
    
    static {
        final z000 f0 = z000.F0;
        a = new fry();
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
        ehk.g(czz3, hashMap3, czz3, hashMap3);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final u3z u3z = (u3z)o;
        final c5j c5j = (c5j)o2;
        throw null;
    }
}
