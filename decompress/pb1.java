// 
// Decompiled by Procyon v0.6.0
// 

public final class pb1 extends lci
{
    public final lci$b a;
    public final lci$a b;
    
    public pb1(final lci$b a, final lci$a b) {
        this.a = a;
        this.b = b;
    }
    
    public final lci$a a() {
        return this.b;
    }
    
    public final lci$b b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof lci) {
            final lci lci = (lci)o;
            final lci$b a = this.a;
            if (a == null) {
                if (lci.b() != null) {
                    return false;
                }
            }
            else if (!a.equals(lci.b())) {
                return false;
            }
            final lci$a b2 = this.b;
            if (b2 == null) {
                if (lci.a() == null) {
                    return b;
                }
            }
            else if (b2.equals(lci.a())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final lci$b a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final lci$a b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("NetworkConnectionInfo{networkType=");
        g.append(this.a);
        g.append(", mobileSubtype=");
        g.append(this.b);
        g.append("}");
        return g.toString();
    }
}
