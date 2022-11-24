import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class noy extends mzz
{
    public final Integer b;
    public final Map<String, Integer> c;
    
    public noy(final Integer b, final Map c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Integer a() {
        return this.b;
    }
    
    @Override
    public final Map<String, Integer> b() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzz) {
            final mzz mzz = (mzz)o;
            final Integer b = this.b;
            if (b == null) {
                if (mzz.a() != null) {
                    return false;
                }
            }
            else if (!b.equals(mzz.a())) {
                return false;
            }
            if (this.c.equals(mzz.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
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
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(value.length() + 81 + value2.length());
        jba.s(sb, "LocalTestingConfig{defaultSplitInstallErrorCode=", value, ", splitInstallErrorCodeByModule=", value2);
        sb.append("}");
        return sb.toString();
    }
}
