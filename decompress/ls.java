import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum ls
{
    F0;
    
    public static final Map<String, ls> G0;
    public static final ls[] H0;
    
    static {
        ls.G0 = new HashMap();
        for (final ls ls : values()) {
            ls.G0.put(onw.a(ls.toString()), ls);
        }
    }
}
