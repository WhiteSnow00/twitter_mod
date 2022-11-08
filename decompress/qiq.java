// 
// Decompiled by Procyon v0.6.0
// 

public final class qiq
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public qiq(final String a, final String b, final String c, final boolean d) {
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
        if (!(o instanceof qiq)) {
            return false;
        }
        final qiq qiq = (qiq)o;
        return zzd.a((Object)this.a, (Object)qiq.a) && zzd.a((Object)this.b, (Object)qiq.b) && zzd.a((Object)this.c, (Object)qiq.c) && this.d == qiq.d;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31 + d;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final boolean d = this.d;
        final StringBuilder y = mb0.y("SocialProof(label=", a, ", icon=", b, ", url=");
        y.append(c);
        y.append(", rounded=");
        y.append(d);
        y.append(")");
        return y.toString();
    }
}
