// 
// Decompiled by Procyon v0.6.0
// 

public final class ho3 implements f00
{
    public final long a;
    public final i73 b;
    
    public ho3(final long a, final i73 b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        return null;
    }
    
    public final boolean b() {
        return jba.b((tlm)this);
    }
    
    public final boolean c() {
        return jba.e((tlm)this);
    }
    
    public final nso d() {
        return nso.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ho3)) {
            return false;
        }
        final ho3 ho3 = (ho3)o;
        return this.a == ho3.a && e0e.a((Object)this.b, (Object)ho3.b);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.b.hashCode() + (int)(a ^ a >>> 32) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final i73 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("CesAnalyticsLog(timestamp=");
        sb.append(a);
        sb.append(", data=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
