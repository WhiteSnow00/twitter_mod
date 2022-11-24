import java.util.Map;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dir extends LinkedHashMap<Long, Boolean>
{
    public final int F0;
    
    public dir() {
        this.F0 = 140;
    }
    
    public final boolean removeEldestEntry(final Map.Entry<Long, Boolean> entry) {
        return this.size() > this.F0;
    }
}
