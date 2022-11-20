import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class umf
{
    public final Set<tmf<?>> a;
    
    public umf() {
        this.a = Collections.newSetFromMap(new WeakHashMap<tmf<?>, Boolean>());
    }
}
