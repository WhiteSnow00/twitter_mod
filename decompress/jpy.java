import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpy implements j4j<z0z>
{
    public static final jpy a;
    
    static {
        final ozz c0 = ozz.C0;
        a = new jpy();
        final rxz rxz = new rxz(1, c0);
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)rxz).annotationType(), rxz);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final rxz rxz2 = new rxz(2, c0);
        final HashMap hashMap2 = new HashMap();
        sbl.m(rxz2, hashMap2, rxz2, hashMap2);
    }
}
