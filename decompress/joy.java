import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joy implements j4j<e0z>
{
    public static final joy a;
    
    static {
        final ozz c0 = ozz.C0;
        a = new joy();
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
        sbl.m(rxz3, hashMap3, rxz3, hashMap3);
    }
}
