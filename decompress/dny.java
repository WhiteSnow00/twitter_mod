import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dny extends byz
{
    public final Integer b = b;
    public final Map<String, Integer> c = c;
    
    public final Integer a() {
        return this.b;
    }
    
    public final Map<String, Integer> b() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof byz) {
            final byz byz = (byz)o;
            final Integer b = this.b;
            if (b == null) {
                if (byz.a() != null) {
                    return false;
                }
            }
            else if (!b.equals(byz.a())) {
                return false;
            }
            if (this.c.equals(byz.b())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final Integer b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ this.c.hashCode();
    }
    
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(value.length() + 81 + value2.length());
        mag.m(sb, "LocalTestingConfig{defaultSplitInstallErrorCode=", value, ", splitInstallErrorCodeByModule=", value2);
        sb.append("}");
        return sb.toString();
    }
}
