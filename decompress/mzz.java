import java.util.Objects;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mzz
{
    public static final noy a;
    
    static {
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>());
        Objects.requireNonNull(unmodifiableMap, "Null splitInstallErrorCodeByModule");
        a = new noy(null, unmodifiableMap);
    }
    
    public abstract Integer a();
    
    public abstract Map<String, Integer> b();
}
