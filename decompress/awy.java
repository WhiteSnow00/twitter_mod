import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awy implements p4j<d9z>
{
    public static final awy a;
    
    static {
        final zzz d0 = zzz.D0;
        a = new awy();
        final dyz dyz = new dyz(1, d0);
        final HashMap hashMap = new HashMap();
        hashMap.put(dyz.annotationType(), dyz);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final dyz dyz2 = new dyz(2, d0);
        final HashMap hashMap2 = new HashMap();
        jg9.w(dyz2, hashMap2, dyz2, hashMap2);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final d9z d9z = (d9z)o;
        final q4j q4j = (q4j)o2;
        throw null;
    }
}
