// 
// Decompiled by Procyon v0.6.0
// 

public final class uvl
{
    public static final a Companion;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    
    static {
        Companion = new a();
    }
    
    public uvl(final String a, final String b, final String c, final String d, final String e, final long f) {
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
        if (!(o instanceof uvl)) {
            return false;
        }
        final uvl uvl = (uvl)o;
        return e0e.a((Object)this.a, (Object)uvl.a) && e0e.a((Object)this.b, (Object)uvl.b) && e0e.a((Object)this.c, (Object)uvl.c) && e0e.a((Object)this.d, (Object)uvl.d) && e0e.a((Object)this.e, (Object)uvl.e) && this.f == uvl.f;
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
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        final long f = this.f;
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31 + (int)(f ^ f >>> 32);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final long f = this.f;
        final StringBuilder k = l58.k("QuoteTweetPushDetails(authorName=", a, ", authorHandle=", b, ", text=");
        jba.s(k, c, ", authorAvatarUrl=", d, ", imageUrl=");
        k.append(e);
        k.append(", createdAt=");
        k.append(f);
        k.append(")");
        return k.toString();
    }
    
    public static final class a
    {
    }
}
