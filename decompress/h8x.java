import java.util.LinkedHashSet;
import java.util.HashMap;
import java.io.Closeable;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class h8x
{
    public final Map<String, Object> a;
    public final Set<Closeable> b;
    
    public h8x() {
        this.a = new HashMap();
        this.b = new LinkedHashSet();
    }
    
    public void a() {
    }
}
