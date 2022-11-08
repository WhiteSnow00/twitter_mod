// 
// Decompiled by Procyon v0.6.0
// 

public final class dn9
{
    public final qm9 a;
    public final sm9 b;
    public final wm9 c;
    
    public dn9(final qm9 a, final sm9 b, final wm9 c) {
        zzd.f((Object)a, "displayLocation");
        zzd.f((Object)c, "dynamicAdInfo");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dn9)) {
            return false;
        }
        final dn9 dn9 = (dn9)o;
        return zzd.a((Object)this.a, (Object)dn9.a) && zzd.a((Object)this.b, (Object)dn9.b) && zzd.a((Object)this.c, (Object)dn9.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final qm9 a = this.a;
        final sm9 b = this.b;
        final wm9 c = this.c;
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
