import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqy implements b5j<m2z>
{
    public static final pqy a;
    
    static {
        final z000 f0 = z000.F0;
        a = new pqy();
        final czz czz = new czz(1, f0);
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)czz).annotationType(), czz);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final czz czz2 = new czz(2, f0);
        final HashMap hashMap2 = new HashMap();
        ehk.g(czz2, hashMap2, czz2, hashMap2);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final m2z m2z = (m2z)o;
        final c5j c5j = (c5j)o2;
        throw null;
    }
}
