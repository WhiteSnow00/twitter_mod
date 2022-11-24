// 
// Decompiled by Procyon v0.6.0
// 

public final class fij
{
    public static final a Companion;
    public final String a;
    public final double b;
    public final int c;
    public final long d;
    public final ee0 e;
    
    static {
        Companion = new a();
    }
    
    public fij(final String a, final double b, final int c, final long d, final ee0 e) {
        e0e.f((Object)a, "name");
        e0e.f((Object)e, "anomalyState");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fij)) {
            return false;
        }
        final fij fij = (fij)o;
        return e0e.a((Object)this.a, (Object)fij.a) && Double.compare(this.b, fij.b) == 0 && this.c == fij.c && this.d == fij.d && this.e == fij.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long doubleToLongBits = Double.doubleToLongBits(this.b);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final int c = this.c;
        final long d = this.d;
        return this.e.hashCode() + (((hashCode * 31 + n) * 31 + c) * 31 + (int)(d ^ d >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final double b = this.b;
        final int c = this.c;
        final long d = this.d;
        final ee0 e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnDeviceMetric(name=");
        sb.append(a);
        sb.append(", value=");
        sb.append(b);
        sb.append(", version=");
        sb.append(c);
        sb.append(", creationTime=");
        sb.append(d);
        sb.append(", anomalyState=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
