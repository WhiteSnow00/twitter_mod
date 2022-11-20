import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tbm
{
    public final sog<anm<?, ?>, anm<?, ?>> a;
    public final Map<fas, nnl<anm<?, ?>>> b;
    
    public tbm(final sog<anm<?, ?>, anm<?, ?>> a) {
        czd.f((Object)a, "dataSource");
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public final nnl<anm<?, ?>> a(final String s) {
        final LinkedHashMap b = this.b;
        final fas fas = new fas(s);
        Object value;
        if ((value = b.get(fas)) == null) {
            value = new nnl();
            b.put(fas, value);
        }
        return (nnl<anm<?, ?>>)value;
    }
}
