// 
// Decompiled by Procyon v0.6.0
// 

public final class udi
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    
    public udi(final boolean a, final boolean b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof udi)) {
            return false;
        }
        final udi udi = (udi)o;
        return this.a == udi.a && this.b == udi.b && this.c == udi.c && this.d == udi.d;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final int d = this.d ? 1 : 0;
        if (d == 0) {
            n = d;
        }
        return ((n2 * 31 + b) * 31 + c) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("NetworkState(isConnected=");
        j.append(this.a);
        j.append(", isValidated=");
        j.append(this.b);
        j.append(", isMetered=");
        j.append(this.c);
        j.append(", isNotRoaming=");
        return zc.H(j, this.d, ')');
    }
}
