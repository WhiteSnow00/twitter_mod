// 
// Decompiled by Procyon v0.6.0
// 

public final class q8l implements mwv
{
    public final cgv b;
    public final String c;
    public final fr8 d;
    public final faa e;
    
    public q8l(final cgv b, final String c, final fr8 d) {
        final faa p3 = faa.P0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = p3;
    }
    
    public final fr8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q8l)) {
            return false;
        }
        final q8l q8l = (q8l)o;
        return czd.a((Object)this.b, (Object)q8l.b) && czd.a((Object)this.c, (Object)q8l.c) && czd.a((Object)this.d, (Object)q8l.d) && this.e == q8l.e;
    }
    
    public final faa getName() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final String c = this.c;
        int hashCode2 = 0;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final fr8 d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return this.e.hashCode() + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final cgv b = this.b;
        final String c = this.c;
        final fr8 d = this.d;
        final faa e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfileComponent(twitterUser=");
        sb.append(b);
        sb.append(", socialContext=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", name=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends mwv$a<q8l, a>
    {
        public cgv b;
        public String c;
        
        public a() {
            super((fr8)null, 1, (rf8)null);
            this.b = null;
            this.c = null;
        }
        
        public a(final cgv cgv, final String s, final int n, final rf8 rf8) {
            super((fr8)null, 1, (rf8)null);
            this.b = null;
            this.c = null;
        }
        
        public final Object i() {
            final cgv b = this.b;
            czd.c((Object)b);
            return new q8l(b, this.c, super.a);
        }
        
        public final boolean l() {
            return this.b != null;
        }
    }
    
    public static final class b extends zr2<q8l, a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final q8l q8l = (q8l)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)q8l, "profileComponent");
            wlp.A((Object)q8l.d, (rlp)fr8.a);
            wlp.A((Object)q8l.b, (rlp)cgv.N1);
            wlp.E(q8l.c);
        }
        
        public final n4j g() {
            return (n4j)new a(null, null, 3, null);
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) {
            final a a = (a)n4j;
            czd.f((Object)vlp, "input");
            czd.f((Object)a, "builder");
            a.a = (fr8)((y4j)fr8.a).a(vlp);
            final Object z = vlp.z((rlp)cgv.N1);
            czd.e(z, "input.readNotNullObject(TwitterUser.SERIALIZER)");
            a.b = (cgv)z;
            a.c = vlp.G();
        }
    }
}
