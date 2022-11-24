// 
// Decompiled by Procyon v0.6.0
// 

public final class hbp
{
    public final String a;
    public final String b;
    public final sai c;
    
    public hbp(final String a, final String b, final sai c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hbp)) {
            return false;
        }
        final hbp hbp = (hbp)o;
        return e0e.a((Object)this.a, (Object)hbp.a) && e0e.a((Object)this.b, (Object)hbp.b) && e0e.a((Object)this.c, (Object)hbp.c);
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
        final sai c = this.c;
        final StringBuilder k = l58.k("SearchableItem(title=", a, ", synonymsRegexString=", b, ", navItem=");
        k.append(c);
        k.append(")");
        return k.toString();
    }
}
