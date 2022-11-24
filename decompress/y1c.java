// 
// Decompiled by Procyon v0.6.0
// 

public final class y1c
{
    public static final nmp<y1c> e;
    public static final y1c f;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final v1c d;
    
    static {
        y1c.e = new y1c.y1c$a();
        f = new y1c();
    }
    
    public y1c() {
        this.d = null;
        this.a = false;
        this.c = false;
        this.b = false;
    }
    
    public y1c(final efv efv, final jw6 jw6, final String s, final boolean b, final boolean b2, final boolean b3) {
        this(new v1c(efv, jw6, s), b, b2, b3);
    }
    
    public y1c(final v1c d, final boolean a, final boolean c, final boolean b) {
        if (c && !a) {
            throw new IllegalArgumentException("All geotags from draft must be explicit");
        }
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final efv a() {
        final v1c d = this.d;
        if (d != null) {
            return d.a;
        }
        throw new IllegalStateException("Cannot getPlace when there is no geotag");
    }
    
    public final boolean b() {
        return this.c() && this.a;
    }
    
    public final boolean c() {
        return this.d != null;
    }
    
    public final boolean d() {
        return this.c() && this.b;
    }
    
    public final y1c e(final boolean b) {
        final v1c d = this.d;
        if (d == null) {
            throw new IllegalStateException("Cannot change a null geotag's precision");
        }
        if (this.b == b) {
            return this;
        }
        return new y1c(d.a, d.b, d.c, this.a, this.c, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && y1c.class == o.getClass()) {
            final y1c y1c = (y1c)o;
            return this.a == y1c.a && this.b == y1c.b && this.c == y1c.c && o5j.a((Object)this.d, (Object)y1c.d);
        }
        return false;
    }
    
    public final v1c f() {
        final v1c d = this.d;
        if (d == null || this.c) {
            return null;
        }
        if (this.b) {
            return new v1c(d.a, d.b, d.c);
        }
        return new v1c(d.a, null, d.c);
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.d) + (((this.a ? 1 : 0) * 31 + (this.b ? 1 : 0)) * 31 + (this.c ? 1 : 0)) * 31;
    }
}
