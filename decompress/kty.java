import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kty implements j4j<l5z>
{
    public static final kty a;
    
    static {
        final ozz c0 = ozz.C0;
        a = new kty();
        final rxz rxz = new rxz(1, c0);
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)rxz).annotationType(), rxz);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final rxz rxz2 = new rxz(2, c0);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(((Annotation)rxz2).annotationType(), rxz2);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap2));
        final rxz rxz3 = new rxz(3, c0);
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(((Annotation)rxz3).annotationType(), rxz3);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap3));
        final rxz rxz4 = new rxz(4, c0);
        final HashMap hashMap4 = new HashMap();
        sbl.m(rxz4, hashMap4, rxz4, hashMap4);
    }
}
