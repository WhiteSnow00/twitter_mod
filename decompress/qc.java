import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qc<K, V> implements Entry<K, V>
{
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof Entry;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final Entry entry = (Entry)o;
            b3 = b2;
            if (af8.o(this.getKey(), entry.getKey())) {
                b3 = b2;
                if (af8.o(this.getValue(), entry.getValue())) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public abstract K getKey();
    
    @Override
    public abstract V getValue();
    
    @Override
    public int hashCode() {
        final Object key = this.getKey();
        final Object value = this.getValue();
        int hashCode = 0;
        int hashCode2;
        if (key == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = key.hashCode();
        }
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.getKey());
        final String value2 = String.valueOf(this.getValue());
        final StringBuilder sb = new StringBuilder(value2.length() + (value.length() + 1));
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        return sb.toString();
    }
}
