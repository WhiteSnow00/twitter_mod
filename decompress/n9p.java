import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9p implements m9p
{
    public final Map<String, ogv> a;
    
    public n9p() {
        this.a = new ConcurrentHashMap();
    }
    
    public final ogv a(final String s) {
        e0e.f((Object)s, "query");
        return (ogv)this.a.get((Object)eg8.K0(s));
    }
    
    public final void b(final String s, final ogv ogv) {
        e0e.f((Object)s, "query");
        e0e.f((Object)ogv, "results");
        this.a.put((Object)eg8.K0(s), (Object)ogv);
    }
    
    public final void clear() {
        this.a.clear();
    }
}
