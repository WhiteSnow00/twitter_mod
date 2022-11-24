// 
// Decompiled by Procyon v0.6.0
// 

public final class u8l implements zwv
{
    public final String b;
    public final float c;
    public final ls8 d;
    public final mba e;
    
    public u8l(final String b, final float c, final ls8 d) {
        final mba a1 = mba.a1;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = a1;
    }
    
    public final ls8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u8l)) {
            return false;
        }
        final u8l u8l = (u8l)o;
        return e0e.a((Object)this.b, (Object)u8l.b) && Float.compare(this.c, u8l.c) == 0 && e0e.a((Object)this.d, (Object)u8l.d) && this.e == u8l.e;
    }
    
    public final mba getName() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final int g = dn.g(this.c, this.b.hashCode() * 31, 31);
        final ls8 d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return this.e.hashCode() + (g + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final float c = this.c;
        final ls8 d = this.d;
        final mba e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfileBannerComponent(bannerUrl=");
        sb.append(b);
        sb.append(", aspectRatio=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", name=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
