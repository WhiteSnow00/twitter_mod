import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum ks
{
    D0;
    
    public static final Map<String, ks> E0;
    public static final ks[] F0;
    
    static {
        ks.E0 = new HashMap();
        for (final ks ks : values()) {
            ks.E0.put(zmw.a(ks.toString()), ks);
        }
    }
}
