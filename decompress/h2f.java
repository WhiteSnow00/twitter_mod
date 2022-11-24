import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h2f implements l1f
{
    public final int a;
    public final int b;
    public final Object c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final List<g2f> i;
    public final n1f j;
    public final long k;
    public final boolean l;
    
    public h2f(int a, int e, final Object c, final int d, final int e2, final int f, final int g, final boolean h, final List i, final n1f j, final long k, final wg8 wg8) {
        this.a = a;
        this.b = e;
        this.c = c;
        this.d = d;
        this.e = e2;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        e = this.e();
        final boolean b = false;
        a = 0;
        boolean l;
        while (true) {
            l = b;
            if (a >= e) {
                break;
            }
            if (this.b(a) != null) {
                l = true;
                break;
            }
            ++a;
        }
        this.l = l;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final w0b<hud> b(final int n) {
        final Object c = this.i.get(n).c;
        w0b w0b;
        if (c instanceof w0b) {
            w0b = (w0b)c;
        }
        else {
            w0b = null;
        }
        return (w0b<hud>)w0b;
    }
    
    public final int c(int n) {
        final khk b = this.i.get(n).b;
        if (this.h) {
            n = b.G0;
        }
        else {
            n = b.F0;
        }
        return n;
    }
    
    public final long d(final int n) {
        return this.i.get(n).a;
    }
    
    public final int e() {
        return this.i.size();
    }
    
    public final void f(final khk$a khk$a) {
        e0e.f((Object)khk$a, "scope");
        final int e = this.e();
        h2f h2f = this;
        for (int i = 0; i < e; ++i) {
            final khk b = h2f.i.get(i).b;
            final int f = h2f.f;
            int n;
            if (h2f.h) {
                n = b.G0;
            }
            else {
                n = b.F0;
            }
            final int n2 = f - n;
            final int g = h2f.g;
            long n3;
            if (h2f.b(i) != null) {
                final n1f j = h2f.j;
                final Object c = h2f.c;
                n3 = h2f.d(i);
                Objects.requireNonNull(j);
                e0e.f(c, "key");
                final a5e a5e = j.c.get(c);
                Label_0373: {
                    if (a5e != null) {
                        final mhk mhk = a5e.b.get(i);
                        final long a = ((hud)mhk.b.f()).a;
                        final long a2 = a5e.a;
                        final long k = mqb.k(a2, hud.c(a), (int)(a >> 32) + (int)(a2 >> 32));
                        final long c2 = mhk.c;
                        final long a3 = a5e.a;
                        final long l = mqb.k(a3, hud.c(c2), (int)(c2 >> 32) + (int)(a3 >> 32));
                        n3 = k;
                        if (((cjq<Object>)mhk.d).getValue()) {
                            if (j.c(l) >= n2 || j.c(k) >= n2) {
                                n3 = k;
                                if (j.c(l) <= g) {
                                    break Label_0373;
                                }
                                n3 = k;
                                if (j.c(k) <= g) {
                                    break Label_0373;
                                }
                            }
                            ma7.D(j.a, (yy6)null, 0, (hub)new m1f(mhk, (mp6)null), 3);
                            n3 = k;
                        }
                    }
                }
                h2f = this;
            }
            else {
                n3 = h2f.d(i);
            }
            if (h2f.h) {
                final long m = h2f.k;
                final hud$a companion = hud.Companion;
                khk$a.m(khk$a, b, mqb.k(m, hud.c(n3), (int)(n3 >> 32) + (int)(m >> 32)), 0.0f, (stb)null, 6, (Object)null);
            }
            else {
                final long k2 = h2f.k;
                final hud$a companion2 = hud.Companion;
                khk$a.j(khk$a, b, mqb.k(k2, hud.c(n3), (int)(n3 >> 32) + (int)(k2 >> 32)), 0.0f, (stb)null, 6, (Object)null);
            }
        }
    }
    
    public final int getIndex() {
        return this.b;
    }
    
    public final Object getKey() {
        return this.c;
    }
    
    public final int getSize() {
        return this.d;
    }
}
