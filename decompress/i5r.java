// 
// Decompiled by Procyon v0.6.0
// 

public final class i5r implements tqd
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
    
    public i5r(final String b, final String c, final String d, final String e, final String f) {
        caa.h(b, "provider", c, "idToken", d, "state");
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
        if (!(o instanceof i5r)) {
            return false;
        }
        final i5r i5r = (i5r)o;
        return czd.a((Object)this.b, (Object)i5r.b) && czd.a((Object)this.c, (Object)i5r.c) && czd.a((Object)this.d, (Object)i5r.d) && czd.a((Object)this.e, (Object)i5r.e) && czd.a((Object)this.f, (Object)i5r.f);
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.d, hmg.f(this.c, this.b.hashCode() * 31, 31), 31);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final String f2 = this.f;
        if (f2 != null) {
            hashCode = f2.hashCode();
        }
        return (f + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final StringBuilder q = tqf.q("SsoInputData(provider=", b, ", idToken=", c, ", state=");
        nb0.z(q, d, ", authCode=", e, ", scopes=");
        return ed.B(q, f, ")");
    }
    
    public static final class a extends y4j<i5r>
    {
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            final String a = vlp.A();
            czd.e((Object)a, "readNotNullString()");
            final String a2 = vlp.A();
            czd.e((Object)a2, "readNotNullString()");
            final String a3 = vlp.A();
            czd.e((Object)a3, "readNotNullString()");
            return new i5r(a, a2, a3, vlp.G(), vlp.G());
        }
        
        public final void f(final wlp wlp, final Object o) {
            final i5r i5r = (i5r)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)i5r, "inputData");
            wlp.E(i5r.b).E(i5r.c).E(i5r.d).E(i5r.e).E(i5r.f);
        }
    }
}
