// 
// Decompiled by Procyon v0.6.0
// 

public final class fp6
{
    public static final a Companion;
    public final long a;
    public final ydi b;
    public final pwl c;
    
    static {
        Companion = new a();
    }
    
    public fp6(final long a, final ydi b, final pwl c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fp6)) {
            return false;
        }
        final fp6 fp6 = (fp6)o;
        return this.a == fp6.a && this.b == fp6.b && this.c == fp6.c;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.c.hashCode() + (this.b.hashCode() + (int)(a ^ a >>> 32) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final ydi b = this.b;
        final pwl c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ControlTowerClientDetails(timeZoneOffsetMinutes=");
        sb.append(a);
        sb.append(", networkStatus=");
        sb.append(b);
        sb.append(", radioStatus=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
