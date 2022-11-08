// 
// Decompiled by Procyon v0.6.0
// 

public final class hp9
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    
    public hp9(final String a, final String b, final String c, final long d, final String e, final String f) {
        zzd.f((Object)a, "title");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hp9)) {
            return false;
        }
        final hp9 hp9 = (hp9)o;
        return zzd.a((Object)this.a, (Object)hp9.a) && zzd.a((Object)this.b, (Object)hp9.b) && zzd.a((Object)this.c, (Object)hp9.c) && this.d == hp9.d && zzd.a((Object)this.e, (Object)hp9.e) && zzd.a((Object)this.f, (Object)hp9.f);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31);
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final String f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return ((a + n) * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final long d = this.d;
        final String e = this.e;
        final String f = this.f;
        final StringBuilder y = mb0.y("EadPromotedLog(title=", a, ", impressionId=", b, ", cardType=");
        y.append(c);
        y.append(", timeStamp=");
        y.append(d);
        mag.m(y, ", unifiedCardEvent=", e, ", engagementMetadata=", f);
        y.append(")");
        return y.toString();
    }
}
