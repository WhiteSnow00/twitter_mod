// 
// Decompiled by Procyon v0.6.0
// 

public final class ely extends hv0
{
    public final String a;
    public final String b;
    
    public ely(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        return this.b;
    }
    
    public final int b() {
        return 0;
    }
    
    public final String c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hv0) {
            final hv0 hv0 = (hv0)o;
            if (hv0.b() == 0) {
                final String a = this.a;
                if (a == null) {
                    if (hv0.c() != null) {
                        return false;
                    }
                }
                else if (!a.equals(hv0.c())) {
                    return false;
                }
                final String b = this.b;
                if (b == null) {
                    if (hv0.a() != null) {
                        return false;
                    }
                }
                else if (!b.equals(hv0.a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xD5009D89) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 68 + String.valueOf(b).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(a);
        return ta0.z(sb, ", assetsPath=", b, "}");
    }
}
