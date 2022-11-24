import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s4z implements b5j<wez>
{
    public static final s4z a;
    
    static {
        final vry f0 = vry.F0;
        a = new s4z();
        final cry cry = new cry(1, f0);
        final HashMap hashMap = new HashMap();
        hashMap.put(cry.annotationType(), cry);
        Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(hashMap));
        final cry cry2 = new cry(2, f0);
        final HashMap hashMap2 = new HashMap();
        awg.i(cry2, hashMap2, cry2, hashMap2);
    }
    
    public final /* bridge */ void a(final Object o, final Object o2) throws IOException {
        final wez wez = (wez)o;
        final c5j c5j = (c5j)o2;
        throw null;
    }
}
