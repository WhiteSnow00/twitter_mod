// 
// Decompiled by Procyon v0.6.0
// 

public final class wiz extends jjz
{
    public final String a;
    public final boolean b;
    public final int c;
    
    public wiz(final String a, final boolean b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a() {
        return this.c;
    }
    
    @Override
    public final String b() {
        return this.a;
    }
    
    @Override
    public final boolean c() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jjz) {
            final jjz jjz = (jjz)o;
            if (this.a.equals(jjz.b()) && this.b == jjz.c() && this.c == jjz.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
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
    
    @Override
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
