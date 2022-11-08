import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epw extends yow
{
    public final String a;
    public final List<rzj> b;
    public final int c;
    public final oq2 d;
    public final float e;
    public final oq2 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    
    public epw(final String a, final List b, final int c, final oq2 d, final float e, final oq2 f, final float g, final float h, final int i, final int j, final float k, final float l, final float m, final float n, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && zzd.a((Object)g9m.a((Class)epw.class), (Object)g9m.a((Class)o.getClass()))) {
            final epw epw = (epw)o;
            return zzd.a((Object)this.a, (Object)epw.a) && zzd.a((Object)this.d, (Object)epw.d) && this.e == epw.e && zzd.a((Object)this.f, (Object)epw.f) && this.g == epw.g && this.h == epw.h && this.i == epw.i && this.j == epw.j && this.k == epw.k && this.l == epw.l && this.m == epw.m && this.n == epw.n && this.c == epw.c && zzd.a((Object)this.b, (Object)epw.b);
        }
        return false;
    }
    
    public final int hashCode() {
        final int m = hy8.m((List)this.b, this.a.hashCode() * 31, 31);
        final oq2 d = this.d;
        final int n = 0;
        int hashCode;
        if (d != null) {
            hashCode = d.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int h = c0.h(this.e, (m + hashCode) * 31, 31);
        final oq2 f = this.f;
        int hashCode2 = n;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        return c0.h(this.n, c0.h(this.m, c0.h(this.l, c0.h(this.k, ((c0.h(this.h, c0.h(this.g, (h + hashCode2) * 31, 31), 31) + this.i) * 31 + this.j) * 31, 31), 31), 31), 31) + this.c;
    }
}
