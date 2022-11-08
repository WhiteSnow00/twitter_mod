import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0c extends ifk
{
    public final Map<String, String> e;
    
    public p0c(final p0c.p0c$a p0c$a) {
        super((ifk$a)p0c$a);
        this.e = p0c$a.c;
    }
    
    public final String a(final String s) {
        return this.e.get(s);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Generic event - ");
        for (final Map.Entry<Object, V> entry : this.e.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":'");
            sb.append(entry.getValue());
            sb.append("' ");
        }
        return sb.toString();
    }
}
