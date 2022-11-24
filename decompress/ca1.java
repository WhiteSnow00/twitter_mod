// 
// Decompiled by Procyon v0.6.0
// 

public final class ca1 extends o17$c
{
    public final String a;
    public final String b;
    
    public ca1(final String a, final String b) {
        this.a = a;
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
        if (o instanceof o17$c) {
            final o17$c o17$c = (o17$c)o;
            if (!this.a.equals(o17$c.a()) || !this.b.equals(o17$c.b())) {
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
        final StringBuilder f = ehk.f("CustomAttribute{key=");
        f.append(this.a);
        f.append(", value=");
        return m51.y(f, this.b, "}");
    }
}
