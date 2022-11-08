// 
// Decompiled by Procyon v0.6.0
// 

public final class w9p
{
    public final String a;
    public final String b;
    public final y9i c;
    
    public w9p(final String a, final String b, final y9i c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w9p)) {
            return false;
        }
        final w9p w9p = (w9p)o;
        return zzd.a((Object)this.a, (Object)w9p.a) && zzd.a((Object)this.b, (Object)w9p.b) && zzd.a((Object)this.c, (Object)w9p.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final y9i c = this.c;
        final StringBuilder y = mb0.y("SearchableItem(title=", a, ", synonymsRegexString=", b, ", navItem=");
        y.append(c);
        y.append(")");
        return y.toString();
    }
}
