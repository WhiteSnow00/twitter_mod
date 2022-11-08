// 
// Decompiled by Procyon v0.6.0
// 

public final class w91 extends ig4
{
    public final ig4$a a;
    public final i20 b;
    
    public w91(final ig4$a a, final i20 b) {
        this.a = a;
        this.b = b;
    }
    
    public final i20 a() {
        return this.b;
    }
    
    public final ig4$a b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ig4) {
            final ig4 ig4 = (ig4)o;
            final ig4$a a = this.a;
            if (a == null) {
                if (ig4.b() != null) {
                    return false;
                }
            }
            else if (!a.equals(ig4.b())) {
                return false;
            }
            final i20 b2 = this.b;
            if (b2 == null) {
                if (ig4.a() == null) {
                    return b;
                }
            }
            else if (b2.equals(ig4.a())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final ig4$a a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final i20 b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("ClientInfo{clientType=");
        g.append(this.a);
        g.append(", androidClientInfo=");
        g.append(this.b);
        g.append("}");
        return g.toString();
    }
}
