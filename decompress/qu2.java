import com.twitter.profilemodules.model.business.CountryIso;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qu2
{
    public final String a;
    public final String b;
    public final CountryIso c;
    
    public qu2(final String a, final String b, final CountryIso c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qu2)) {
            return false;
        }
        final qu2 qu2 = (qu2)o;
        return czd.a((Object)this.a, (Object)qu2.a) && czd.a((Object)this.b, (Object)qu2.b) && czd.a((Object)this.c, (Object)qu2.c);
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
        final CountryIso c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final CountryIso c = this.c;
        final StringBuilder q = tqf.q("BusinessContactPhoneInput(countryCode=", a, ", phoneNumber=", b, ", countryIso=");
        q.append(c);
        q.append(")");
        return q.toString();
    }
}
