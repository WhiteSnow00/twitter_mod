import java.util.Objects;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v8y
{
    public Integer a;
    public Map<String, Integer> b;
    
    public final byz a() {
        final Map<String, Integer> b = this.b;
        if (b != null) {
            final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)b);
            Objects.requireNonNull(unmodifiableMap, "Null splitInstallErrorCodeByModule");
            this.b = (Map<String, Integer>)unmodifiableMap;
            return new dny(this.a, unmodifiableMap);
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
