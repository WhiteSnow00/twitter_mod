// 
// Decompiled by Procyon v0.6.0
// 

public final class gx4 implements zwv
{
    public final qgv b;
    public final Integer c;
    public final ls8 d;
    public final mba e;
    
    public gx4(final qgv b, final Integer c, final ls8 d) {
        final mba n0 = mba.N0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = n0;
    }
    
    public final ls8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gx4)) {
            return false;
        }
        final gx4 gx4 = (gx4)o;
        return e0e.a((Object)this.b, (Object)gx4.b) && e0e.a((Object)this.c, (Object)gx4.c) && e0e.a((Object)this.d, (Object)gx4.d) && this.e == gx4.e;
    }
    
    public final mba getName() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final qgv b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final ls8 d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return this.e.hashCode() + ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final qgv b = this.b;
        final Integer c = this.c;
        final ls8 d = this.d;
        final mba e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommerceShopComponent(merchantTwitterUser=");
        sb.append(b);
        sb.append(", productCount=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", name=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends zwv$a<gx4, a>
    {
        public qgv b;
        public Integer c;
        
        public a() {
            this(null, null, 3, null);
        }
        
        public a(final qgv qgv, final Integer n, final int n2, final wg8 wg8) {
            super((ls8)null, 1, (wg8)null);
            this.b = null;
            this.c = null;
        }
        
        public final Object i() {
            return new gx4(this.b, this.c, super.a);
        }
    }
}
