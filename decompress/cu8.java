// 
// Decompiled by Procyon v0.6.0
// 

public final class cu8 implements zwv
{
    public static final cu8.cu8$b Companion;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final ls8 f;
    public final mba g;
    
    static {
        Companion = new cu8.cu8$b();
    }
    
    public cu8(final String b, final String c, final boolean d, final boolean e, final ls8 f) {
        final mba j0 = mba.J0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = j0;
    }
    
    public final ls8 a() {
        return this.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cu8)) {
            return false;
        }
        final cu8 cu8 = (cu8)o;
        return e0e.a((Object)this.b, (Object)cu8.b) && e0e.a((Object)this.c, (Object)cu8.c) && this.d == cu8.d && this.e == cu8.e && e0e.a((Object)this.f, (Object)cu8.f) && this.g == cu8.g;
    }
    
    public final mba getName() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.c, this.b.hashCode() * 31, 31);
        final int d2 = this.d ? 1 : 0;
        int n = 1;
        int n2 = d2;
        if (d2 != 0) {
            n2 = 1;
        }
        final int e = this.e ? 1 : 0;
        if (e == 0) {
            n = e;
        }
        final ls8 f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return this.g.hashCode() + (((d + n2) * 31 + n) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final ls8 f = this.f;
        final mba g = this.g;
        final StringBuilder k = l58.k("DetailsComponent(title=", b, ", subtitle=", c, ", showsAdFreeLabel=");
        l58.l(k, d, ", useDominantColor=", e, ", destination=");
        k.append(f);
        k.append(", name=");
        k.append(g);
        k.append(")");
        return k.toString();
    }
}
