import java.util.Map;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qam
{
    public a<String, Pattern> a;
    
    public qam(final int n) {
        this.a = new a<String, Pattern>(n);
    }
    
    public final Pattern a(final String s) {
        Object o = this.a;
        synchronized (o) {
            final V value = ((LinkedHashMap<K, V>)((a)o).a).get(s);
            monitorexit(o);
            if ((o = value) == null) {
                o = Pattern.compile(s);
                final a<String, Pattern> a = this.a;
                synchronized (a) {
                    a.a.put((K)s, (V)o);
                }
            }
            return (Pattern)o;
        }
    }
    
    public static final class a<K, V>
    {
        public LinkedHashMap<K, V> a;
        public int b;
        
        public a(final int b) {
            this.b = b;
            this.a = new LinkedHashMap<K, V>(this, b * 4 / 3 + 1) {
                public final a D0;
                
                public final boolean removeEldestEntry(final Map.Entry<K, V> entry) {
                    return this.size() > this.D0.b;
                }
            };
        }
    }
}
