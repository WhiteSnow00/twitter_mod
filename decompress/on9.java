// 
// Decompiled by Procyon v0.6.0
// 

public final class on9
{
    public final bn9 a;
    public final dn9 b;
    public final hn9 c;
    
    public on9(final bn9 a, final dn9 b, final hn9 c) {
        e0e.f((Object)a, "displayLocation");
        e0e.f((Object)c, "dynamicAdInfo");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof on9)) {
            return false;
        }
        final on9 on9 = (on9)o;
        return e0e.a((Object)this.a, (Object)on9.a) && e0e.a((Object)this.b, (Object)on9.b) && e0e.a((Object)this.c, (Object)on9.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final bn9 a = this.a;
        final dn9 b = this.b;
        final hn9 c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("DynamicAdMappingInfo(displayLocation=");
        sb.append(a);
        sb.append(", dynamicAdId=");
        sb.append(b);
        sb.append(", dynamicAdInfo=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
