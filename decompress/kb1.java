import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kb1 extends qaf
{
    public final String a;
    public final String b;
    
    public kb1(final String a, final String b) {
        Objects.requireNonNull(a, "Null libraryName");
        this.a = a;
        Objects.requireNonNull(b, "Null version");
        this.b = b;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof qaf) {
            final qaf qaf = (qaf)o;
            if (!this.a.equals(qaf.a()) || !this.b.equals(qaf.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("LibraryVersion{libraryName=");
        f.append(this.a);
        f.append(", version=");
        return m51.y(f, this.b, "}");
    }
}
