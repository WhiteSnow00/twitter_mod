// 
// Decompiled by Procyon v0.6.0
// 

public final class jk8 implements w2s
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    
    public jk8(final long a, final long b, final long c, final long d, final long e, final long f, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final q7r<pr4> a(final boolean b, final boolean b2, final m76 m76, final int n) {
        m76.x(-66424183);
        final ea6$b a = ea6.a;
        long n2;
        if (b) {
            if (b2) {
                n2 = this.a;
            }
            else {
                n2 = this.c;
            }
        }
        else if (b2) {
            n2 = this.e;
        }
        else {
            n2 = this.g;
        }
        final q7r v = nkz.v((Object)new pr4(n2), m76);
        m76.O();
        return (q7r<pr4>)v;
    }
    
    public final q7r<pr4> b(final boolean b, final boolean b2, final m76 m76, final int n) {
        m76.x(-1176343362);
        final ea6$b a = ea6.a;
        long n2;
        if (b) {
            if (b2) {
                n2 = this.b;
            }
            else {
                n2 = this.d;
            }
        }
        else if (b2) {
            n2 = this.f;
        }
        else {
            n2 = this.h;
        }
        final q7r v = nkz.v((Object)new pr4(n2), m76);
        m76.O();
        return (q7r<pr4>)v;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && zzd.a((Object)g9m.a((Class)jk8.class), (Object)g9m.a((Class)o.getClass()))) {
            final jk8 jk8 = (jk8)o;
            return pr4.c(this.a, jk8.a) && pr4.c(this.b, jk8.b) && pr4.c(this.c, jk8.c) && pr4.c(this.d, jk8.d) && pr4.c(this.e, jk8.e) && pr4.c(this.f, jk8.f) && pr4.c(this.g, jk8.g) && pr4.c(this.h, jk8.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return pr4.i(this.h) + xa0.d(this.g, xa0.d(this.f, xa0.d(this.e, xa0.d(this.d, xa0.d(this.c, xa0.d(this.b, pr4.i(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
