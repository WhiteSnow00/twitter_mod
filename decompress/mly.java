import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mly implements p4j<igy>
{
    public static final mly a;
    
    static {
        final zzz d0 = zzz.D0;
        a = new mly();
        final dyz dyz = new dyz(1, d0);
        final HashMap hashMap = new HashMap();
        hashMap.put(dyz.annotationType(), dyz);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final dyz dyz2 = new dyz(2, d0);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(dyz2.annotationType(), dyz2);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap2));
        final dyz dyz3 = new dyz(3, d0);
        final HashMap hashMap3 = new HashMap();
        jg9.w(dyz3, hashMap3, dyz3, hashMap3);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final igy igy = (igy)o;
        final q4j q4j = (q4j)o2;
        throw null;
    }
}
