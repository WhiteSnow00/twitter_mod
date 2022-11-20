// 
// Decompiled by Procyon v0.6.0
// 

public final class s91 extends jf4
{
    public final jf4$a a;
    public final h20 b;
    
    public s91(final jf4$a a, final h20 b) {
        this.a = a;
        this.b = b;
    }
    
    public final h20 a() {
        return this.b;
    }
    
    public final jf4$a b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof jf4) {
            final jf4 jf4 = (jf4)o;
            final jf4$a a = this.a;
            if (a == null) {
                if (jf4.b() != null) {
                    return false;
                }
            }
            else if (!a.equals(jf4.b())) {
                return false;
            }
            final h20 b2 = this.b;
            if (b2 == null) {
                if (jf4.a() == null) {
                    return b;
                }
            }
            else if (b2.equals(jf4.a())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final jf4$a a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final h20 b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("ClientInfo{clientType=");
        j.append(this.a);
        j.append(", androidClientInfo=");
        j.append(this.b);
        j.append("}");
        return j.toString();
    }
}
