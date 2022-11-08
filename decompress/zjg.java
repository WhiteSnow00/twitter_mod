import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class zjg<K, V> implements Entry<K, V>, coe
{
    public final K C0;
    public final V D0;
    
    public zjg(final K c0, final V d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        Map.Entry<Object, V> entry;
        if (o instanceof Entry) {
            entry = (Map.Entry<Object, V>)o;
        }
        else {
            entry = null;
        }
        boolean b2;
        final boolean b = b2 = false;
        if (entry != null) {
            b2 = b;
            if (zzd.a(entry.getKey(), (Object)this.C0)) {
                b2 = b;
                if (zzd.a((Object)entry.getValue(), this.getValue())) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public final K getKey() {
        return this.C0;
    }
    
    @Override
    public V getValue() {
        return this.D0;
    }
    
    @Override
    public final int hashCode() {
        final K c0 = this.C0;
        int hashCode = 0;
        int hashCode2;
        if (c0 != null) {
            hashCode2 = c0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object value = this.getValue();
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public V setValue(final V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.C0);
        sb.append('=');
        sb.append(this.getValue());
        return sb.toString();
    }
}
