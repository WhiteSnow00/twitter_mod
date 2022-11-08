// 
// Decompiled by Procyon v0.6.0
// 

public final class hn0
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    public hn0(final String a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final int length = a.length();
        final int n = 0;
        if (2 <= length && length < 4) {
            if (b != null) {
                int n2 = n;
                if (b.length() == 2) {
                    n2 = 1;
                }
                if (n2 == 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hn0)) {
            return false;
        }
        final hn0 hn0 = (hn0)o;
        return zzd.a((Object)this.a, (Object)hn0.a) && zzd.a((Object)this.b, (Object)hn0.b) && zzd.a((Object)this.c, (Object)hn0.c) && zzd.a((Object)this.d, (Object)hn0.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return hi.J(mb0.y("AppLocale(languageCode=", this.a, ", countryCode=", this.b, ", scriptCode="), this.c, ", variantCode=", this.d, ")");
    }
}
