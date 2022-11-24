import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yss
{
    public final bx a;
    public final xw b;
    public final long c;
    public final long d;
    public final long e;
    public final zss f;
    public final vss g;
    public final List<String> h;
    public final fym i;
    
    public yss(final bx a, final xw b, final long c, final long d, final long e, final List<String> list, final fym i, final zss zss, final vss vss) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        Object f0 = list;
        if (list == null) {
            f0 = h3a.F0;
        }
        this.h = (List<String>)f0;
        this.i = i;
        final zss e2 = zss.e;
        zss f2;
        if ((f2 = zss) == null) {
            f2 = e2;
        }
        this.f = f2;
        final vss e3 = vss.e;
        vss g;
        if ((g = vss) == null) {
            g = e3;
        }
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof yss)) {
                return b2;
            }
            final yss yss = (yss)o;
            boolean b3 = false;
            Label_0224: {
                Label_0222: {
                    if (this != yss) {
                        if (yss != null && o5j.a((Object)this.a, (Object)yss.a) && o5j.a((Object)this.b, (Object)yss.b) && this.c == yss.c && this.d == yss.d && this.e == yss.e && this.h.equals(yss.h) && this.i.F0.equals(yss.i.F0) && this.g.a(yss.g)) {
                            final zss f = this.f;
                            final zw a = f.a;
                            final zss f2 = yss.f;
                            if (a == f2.a && f.b == f2.b && f.c.equals(f2.c)) {
                                break Label_0222;
                            }
                        }
                        b3 = false;
                        break Label_0224;
                    }
                }
                b3 = true;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() + (o5j.f((Object)this.i) + (o5j.q((List)this.h) + a88.k(this.e, a88.k(this.d, a88.k(this.c, (o5j.f((Object)this.b) + o5j.f((Object)this.a) * 31) * 31, 31), 31), 31)) * 31) * 31) * 31;
    }
}
