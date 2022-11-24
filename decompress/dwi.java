// 
// Decompiled by Procyon v0.6.0
// 

public final class dwi
{
    public static final b Companion;
    public static final nmp<dwi> g;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    
    static {
        Companion = new b();
        dwi.g = c.c;
    }
    
    public dwi(final dwi$a dwi$a) {
        e0e.f((Object)dwi$a, "builder");
        final long a = dwi$a.a;
        final String b = dwi$a.b;
        final String c = dwi$a.c;
        final String d = dwi$a.d;
        final boolean e = dwi$a.e;
        final boolean f = dwi$a.f;
        e0e.f((Object)b, "screenName");
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
        if (!(o instanceof dwi)) {
            return false;
        }
        final dwi dwi = (dwi)o;
        return this.a == dwi.a && e0e.a((Object)this.b, (Object)dwi.b) && e0e.a((Object)this.c, (Object)dwi.c) && e0e.a((Object)this.d, (Object)dwi.d) && this.e == dwi.e && this.f == dwi.f;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int d = brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d2 = this.d;
        if (d2 != null) {
            hashCode = d2.hashCode();
        }
        final int e = this.e ? 1 : 0;
        int n = 1;
        int n2 = e;
        if (e != 0) {
            n2 = 1;
        }
        final int f = this.f ? 1 : 0;
        if (f == 0) {
            n = f;
        }
        return (((d + hashCode2) * 31 + hashCode) * 31 + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final StringBuilder b2 = snp.b("NotificationUser(id=", a, ", screenName=", b);
        jba.s(b2, ", fullName=", c, ", avatarUrl=", d);
        snp.d(b2, ", isProtected=", e, ", following=", f);
        b2.append(")");
        return b2.toString();
    }
    
    public static final class b
    {
    }
    
    public static final class c extends ss2<dwi, dwi$a>
    {
        public static final c c;
        
        static {
            c = new c();
        }
        
        public c() {
            super(0);
        }
        
        public final void f(final smp smp, final Object o) {
            final dwi dwi = (dwi)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)dwi, "entry");
            smp.A(dwi.a).G(dwi.b).G(dwi.c).G(dwi.d).t(dwi.e).t(dwi.f);
        }
        
        public final z4j g() {
            return (z4j)new dwi$a();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) {
            final dwi$a dwi$a = (dwi$a)z4j;
            e0e.f((Object)rmp, "input");
            e0e.f((Object)dwi$a, "builder");
            dwi$a.a = rmp.A();
            final String c = rmp.C();
            e0e.e((Object)c, "input.readNotNullString()");
            dwi$a.b = c;
            dwi$a.c = rmp.I();
            dwi$a.d = rmp.I();
            dwi$a.e = rmp.u();
            dwi$a.f = rmp.u();
        }
    }
}
