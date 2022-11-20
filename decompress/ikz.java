import java.util.Iterator;
import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikz
{
    public final Map<String, Map<String, String>> a;
    
    public ikz(final Map a) {
        this.a = a;
    }
    
    public final Map<String, Set<String>> a(final Collection<String> collection) {
        final HashMap hashMap = new HashMap();
        for (final String s : this.a.keySet()) {
            Set<Object> set;
            if (!this.a.containsKey(s)) {
                set = Collections.emptySet();
            }
            else {
                final HashSet<Object> set2 = new HashSet<Object>();
                for (final Map.Entry<Object, V> entry : this.a.get(s).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        set2.add(entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet((Set<?>)set2);
            }
            hashMap.put(s, set);
        }
        return hashMap;
    }
}
