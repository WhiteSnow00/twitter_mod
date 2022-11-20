import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oez
{
    public final Map<String, Map<String, String>> a;
    
    public oez() {
        this.a = new HashMap();
    }
    
    public final oez a(final String s, final String s2, final String s3) {
        if (!this.a.containsKey(s2)) {
            this.a.put(s2, new HashMap<String, HashMap>());
        }
        this.a.get(s2).put(s, s3);
        return this;
    }
    
    public final ikz b() {
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<String, V> entry : this.a.entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)entry.getValue())));
        }
        return new ikz(Collections.unmodifiableMap((Map<?, ?>)hashMap));
    }
}
