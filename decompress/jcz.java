// 
// Decompiled by Procyon v0.6.0
// 

public final class jcz extends ocz
{
    public final String a = a;
    public final boolean b = b;
    public final int c = c;
    
    public final int a() {
        return this.c;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final boolean c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ocz) {
            final ocz ocz = (ocz)o;
            if (this.a.equals(ocz.b()) && this.b == ocz.c() && this.c == ocz.a()) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ this.c;
    }
    
    public final String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder(a.length() + 84);
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(a);
        sb.append(", enableFirelog=");
        sb.append(b);
        sb.append(", firelogEventType=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
