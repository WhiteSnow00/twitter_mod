// 
// Decompiled by Procyon v0.6.0
// 

public final class kdv implements zwv
{
    public final qgv b;
    public final String c;
    public final int d;
    public final int e;
    public final ls8 f;
    public final mba g;
    
    public kdv(final qgv b, final String c, final int d, final int e, final ls8 f) {
        final mba s0 = mba.S0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = s0;
    }
    
    public final ls8 a() {
        return this.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kdv)) {
            return false;
        }
        final kdv kdv = (kdv)o;
        return e0e.a((Object)this.b, (Object)kdv.b) && e0e.a((Object)this.c, (Object)kdv.c) && this.d == kdv.d && this.e == kdv.e && e0e.a((Object)this.f, (Object)kdv.f) && this.g == kdv.g;
    }
    
    public final mba getName() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.c, this.b.hashCode() * 31, 31);
        final int d2 = this.d;
        final int e = this.e;
        final ls8 f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return this.g.hashCode() + (((d + d2) * 31 + e) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final qgv b = this.b;
        final String c = this.c;
        final int d = this.d;
        final int e = this.e;
        final ls8 f = this.f;
        final mba g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("TwitterListDetailsComponent(twitterUser=");
        sb.append(b);
        sb.append(", content=");
        sb.append(c);
        sb.append(", subscriberCount=");
        ffe.p(sb, d, ", memberCount=", e, ", destination=");
        sb.append(f);
        sb.append(", name=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends zwv$a<kdv, a>
    {
        public qgv b;
        public String c;
        public int d;
        public int e;
        
        public a() {
            this(null, null, 0, 0, 15, null);
        }
        
        public a(final qgv qgv, final String s, final int n, final int n2, final int n3, final wg8 wg8) {
            super((ls8)null, 1, (wg8)null);
            this.b = null;
            this.c = null;
            this.d = 0;
            this.e = 0;
        }
        
        public final Object i() {
            final qgv b = this.b;
            e0e.c((Object)b);
            final String c = this.c;
            e0e.c((Object)c);
            return new kdv(b, c, this.d, this.e, super.a);
        }
        
        public final boolean k() {
            return this.b != null && this.c != null;
        }
    }
}
