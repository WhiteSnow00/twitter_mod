// 
// Decompiled by Procyon v0.6.0
// 

public final class c87 implements l43
{
    public final c87.c87$a b;
    public final l43$e c;
    public final l43$d d;
    public final l43$b e;
    public final boolean f;
    public final ls8 g;
    
    public c87(final c87.c87$a b, final l43$e c, final l43$d d, final l43$b e, final boolean f, final ls8 g) {
        e0e.f((Object)b, "action");
        e0e.f((Object)c, "style");
        e0e.f((Object)d, "iconType");
        e0e.f((Object)e, "type");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final ls8 a() {
        return this.g;
    }
    
    public final l43$e b() {
        return this.c;
    }
    
    public final l43$d c() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c87)) {
            return false;
        }
        final c87 c87 = (c87)o;
        return this.b == c87.b && this.c == c87.c && this.d == c87.d && this.e == c87.e && this.f == c87.f && e0e.a((Object)this.g, (Object)c87.g);
    }
    
    public final l43$b getType() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.e.hashCode();
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final ls8 g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        return ((hashCode4 + (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31) * 31 + f) * 31 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final c87.c87$a b = this.b;
        final l43$e c = this.c;
        final l43$d d = this.d;
        final l43$b e = this.e;
        final boolean f = this.f;
        final ls8 g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("CtaButtonComponentItem(action=");
        sb.append(b);
        sb.append(", style=");
        sb.append(c);
        sb.append(", iconType=");
        sb.append(d);
        sb.append(", type=");
        sb.append(e);
        sb.append(", useDominantColor=");
        sb.append(f);
        sb.append(", destination=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
}
