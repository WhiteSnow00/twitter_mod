// 
// Decompiled by Procyon v0.6.0
// 

public final class su
{
    public static final zr2<su, su.su$b> g;
    public final long a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    
    static {
        su.g = new su.su$a();
    }
    
    public su(final su.su$b su$b) {
        this.a = su$b.a;
        this.b = su$b.b;
        this.c = su$b.c;
        this.d = su$b.d;
        this.e = su$b.e;
        this.f = su$b.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof su)) {
                return b2;
            }
            final su su = (su)o;
            final boolean b3 = this == su || (su != null && this.a == su.a && c5j.a((Object)this.b, (Object)su.b) && this.c == su.c && this.d == su.d && this.e == su.e && this.f == su.f);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return (((oqf.l(this.b, c5j.d(this.a) * 31, 31) + this.c) * 31 + (this.d ? 1 : 0)) * 31 + (this.e ? 1 : 0)) * 31 + (this.f ? 1 : 0);
    }
}
