import java.util.Objects;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjy extends wyz
{
    public final File a;
    public final String b;
    
    public gjy(final File a, final String b) {
        this.a = a;
        Objects.requireNonNull(b, "Null splitId");
        this.b = b;
    }
    
    public final File a() {
        return this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof wyz) {
            final wyz wyz = (wyz)o;
            if (this.a.equals(wyz.a()) && this.b.equals(wyz.b())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(value.length() + 35 + b.length());
        jba.s(sb, "SplitFileInfo{splitFile=", value, ", splitId=", b);
        sb.append("}");
        return sb.toString();
    }
}
