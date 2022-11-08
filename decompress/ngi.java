// 
// Decompiled by Procyon v0.6.0
// 

public final class ngi
{
    public final String a;
    public final String b;
    public final String c;
    
    public ngi(final String a, final String b, final String c) {
        zzd.f((Object)a, "title");
        zzd.f((Object)b, "description");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ngi)) {
            return false;
        }
        final ngi ngi = (ngi)o;
        return zzd.a((Object)this.a, (Object)ngi.a) && zzd.a((Object)this.b, (Object)ngi.b) && zzd.a((Object)this.c, (Object)ngi.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public final String toString() {
        return hi.I(mb0.y("NewsletterInfo(title=", this.a, ", description=", this.b, ", author="), this.c, ")");
    }
}
