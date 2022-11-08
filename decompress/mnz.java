import java.util.Objects;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnz extends LinkedHashMap
{
    public static final mnz D0;
    public boolean C0;
    
    static {
        (D0 = new mnz()).C0 = false;
    }
    
    public mnz() {
        this.C0 = true;
    }
    
    public mnz(final Map map) {
        super(map);
        this.C0 = true;
    }
    
    public static int a(final Object o) {
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            final Charset a = glz.a;
            final int length = array.length;
            int i = 0;
            int n = length;
            while (i < length) {
                n = n * 31 + array[i];
                ++i;
            }
            int n2;
            if ((n2 = n) == 0) {
                n2 = 1;
            }
            return n2;
        }
        return o.hashCode();
    }
    
    public final void c() {
        if (this.C0) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void clear() {
        this.c();
        super.clear();
    }
    
    @Override
    public final Set entrySet() {
        Object o;
        if (this.isEmpty()) {
            o = Collections.emptySet();
        }
        else {
            o = super.entrySet();
        }
        return (Set)o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Map) {
            final Map map = (Map)o;
            if (this != map) {
                if (this.size() != map.size()) {
                    return false;
                }
                for (final Map.Entry<Object, V> entry : this.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    final V value = entry.getValue();
                    final Object value2 = map.get(entry.getKey());
                    boolean b;
                    if (value instanceof byte[] && value2 instanceof byte[]) {
                        b = Arrays.equals((byte[])(Object)value, (byte[])value2);
                    }
                    else {
                        b = value.equals(value2);
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
            n += (a(entry.getValue()) ^ a(entry.getKey()));
        }
        return n;
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        this.c();
        final Charset a = glz.a;
        Objects.requireNonNull(o);
        Objects.requireNonNull(o2);
        return super.put(o, o2);
    }
    
    @Override
    public final void putAll(final Map map) {
        this.c();
        for (final Object next : map.keySet()) {
            final Charset a = glz.a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }
    
    @Override
    public final Object remove(final Object o) {
        this.c();
        return super.remove(o);
    }
}
