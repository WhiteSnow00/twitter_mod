import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4z implements b5j<mez>
{
    public static final g4z a;
    
    static {
        final vry f0 = vry.F0;
        a = new g4z();
        final cry cry = new cry(1, f0);
        final HashMap hashMap = new HashMap();
        hashMap.put(cry.annotationType(), cry);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final cry cry2 = new cry(2, f0);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(cry2.annotationType(), cry2);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap2));
        final cry cry3 = new cry(3, f0);
        final HashMap hashMap3 = new HashMap();
        awg.i(cry3, hashMap3, cry3, hashMap3);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final mez mez = (mez)o;
        final c5j c5j = (c5j)o2;
        throw null;
    }
}
