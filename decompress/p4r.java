// 
// Decompiled by Procyon v0.6.0
// 

public final class p4r implements prd
{
    public static final p4r.p4r$a g;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    
    static {
        g = new p4r.p4r$a();
    }
    
    public p4r(final String b, final String c, final String d, final String e, final String f) {
        mo0.z(b, "provider", c, "idToken", d, "state");
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
        if (!(o instanceof p4r)) {
            return false;
        }
        final p4r p4r = (p4r)o;
        return zzd.a((Object)this.b, (Object)p4r.b) && zzd.a((Object)this.c, (Object)p4r.c) && zzd.a((Object)this.d, (Object)p4r.d) && zzd.a((Object)this.e, (Object)p4r.e) && zzd.a((Object)this.f, (Object)p4r.f);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.d, l7k.a(this.c, this.b.hashCode() * 31, 31), 31);
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
        return (a + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final StringBuilder y = mb0.y("SsoInputData(provider=", b, ", idToken=", c, ", state=");
        mag.m(y, d, ", authCode=", e, ", scopes=");
        return hi.I(y, f, ")");
    }
}
