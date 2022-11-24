// 
// Decompiled by Procyon v0.6.0
// 

public final class h6r implements vrd
{
    public static final a g;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    
    static {
        g = new a();
    }
    
    public h6r(final String b, final String c, final String d, final String e, final String f) {
        jba.r(b, "provider", c, "idToken", d, "state");
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
        if (!(o instanceof h6r)) {
            return false;
        }
        final h6r h6r = (h6r)o;
        return e0e.a((Object)this.b, (Object)h6r.b) && e0e.a((Object)this.c, (Object)h6r.c) && e0e.a((Object)this.d, (Object)h6r.d) && e0e.a((Object)this.e, (Object)h6r.e) && e0e.a((Object)this.f, (Object)h6r.f);
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.d, brg.d(this.c, this.b.hashCode() * 31, 31), 31);
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
        return (d + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final StringBuilder k = l58.k("SsoInputData(provider=", b, ", idToken=", c, ", state=");
        jba.s(k, d, ", authCode=", e, ", scopes=");
        return m51.y(k, f, ")");
    }
    
    public static final class a extends k5j<h6r>
    {
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final String c = rmp.C();
            e0e.e((Object)c, "readNotNullString()");
            final String c2 = rmp.C();
            e0e.e((Object)c2, "readNotNullString()");
            final String c3 = rmp.C();
            e0e.e((Object)c3, "readNotNullString()");
            return new h6r(c, c2, c3, rmp.I(), rmp.I());
        }
        
        public final void f(final smp smp, final Object o) {
            final h6r h6r = (h6r)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)h6r, "inputData");
            smp.G(h6r.b).G(h6r.c).G(h6r.d).G(h6r.e).G(h6r.f);
        }
    }
}
