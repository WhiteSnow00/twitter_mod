import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mry
{
    public final Map<String, Double> a;
    
    public mry() {
        this.a = new HashMap();
    }
    
    public final void a(final String s) {
        synchronized (this) {
            this.a.put(s, 0.0);
        }
    }
}
