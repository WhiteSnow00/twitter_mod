import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class qkg implements Entry, koe
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public qkg(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int f0 = this.F0;
        final boolean b = false;
        final boolean b2 = false;
        Map.Entry<Object, V> entry = null;
        final Map.Entry<Object, V> entry2 = null;
        switch (f0) {
            default: {
                if (o instanceof Entry) {
                    entry = (Map.Entry<Object, V>)o;
                }
                boolean b3;
                if (entry == null) {
                    b3 = b;
                }
                else {
                    b3 = b;
                    if (e0e.a(entry.getKey(), this.getKey())) {
                        b3 = b;
                        if (e0e.a((Object)entry.getValue(), this.getValue())) {
                            b3 = true;
                        }
                    }
                }
                return b3;
            }
            case 0: {
                Map.Entry<Object, V> entry3 = entry2;
                if (o instanceof Entry) {
                    entry3 = (Map.Entry<Object, V>)o;
                }
                boolean b4 = b2;
                if (entry3 != null) {
                    b4 = b2;
                    if (e0e.a(entry3.getKey(), this.getKey())) {
                        b4 = b2;
                        if (e0e.a((Object)entry3.getValue(), this.getValue())) {
                            b4 = true;
                        }
                    }
                }
                return b4;
            }
        }
    }
    
    @Override
    public final Object getKey() {
        switch (this.F0) {
            default: {
                return this.G0;
            }
            case 0: {
                return this.G0;
            }
        }
    }
    
    @Override
    public Object getValue() {
        switch (this.F0) {
            default: {
                return this.H0;
            }
            case 0: {
                return this.H0;
            }
        }
    }
    
    @Override
    public final int hashCode() {
        final int f0 = this.F0;
        final int n = 0;
        int hashCode = 0;
        switch (f0) {
            default: {
                final Object key = this.getKey();
                int hashCode2;
                if (key == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = key.hashCode();
                }
                final Object value = this.getValue();
                int hashCode3;
                if (value == null) {
                    hashCode3 = n;
                }
                else {
                    hashCode3 = value.hashCode();
                }
                return hashCode2 ^ hashCode3;
            }
            case 0: {
                final Object key2 = this.getKey();
                int hashCode4;
                if (key2 != null) {
                    hashCode4 = key2.hashCode();
                }
                else {
                    hashCode4 = 0;
                }
                final Object value2 = this.getValue();
                if (value2 != null) {
                    hashCode = value2.hashCode();
                }
                return hashCode4 ^ hashCode;
            }
        }
    }
    
    @Override
    public Object setValue(final Object o) {
        switch (this.F0) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.F0) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.getKey());
                sb.append('=');
                sb.append(this.getValue());
                return sb.toString();
            }
            case 0: {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.getKey());
                sb2.append('=');
                sb2.append(this.getValue());
                return sb2.toString();
            }
        }
    }
}
