import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypw extends ra<fow>
{
    public ypw(final fow fow) {
        e0e.f((Object)fow, "root");
        super((Object)fow);
    }
    
    public final void a() {
        final a9c k = this.k((fow)super.a);
        k.e(0, k.c.size());
    }
    
    public final void c(final int n, int n2, final int n3) {
        final a9c k = this.k((fow)super.c);
        int i = 0;
        final int n4 = 0;
        if (n > n2) {
            for (int j = n4; j < n3; ++j) {
                final fow fow = k.c.get(n);
                k.c.remove(n);
                k.c.add(n2, fow);
                ++n2;
            }
        }
        else {
            while (i < n3) {
                final fow fow2 = k.c.get(n);
                k.c.remove(n);
                k.c.add(n2 - 1, fow2);
                ++i;
            }
        }
        ((fow)k).c();
    }
    
    public final void d(final int n, final int n2) {
        this.k((fow)super.c).e(n, n2);
    }
    
    public final void e(final int n, final Object o) {
        final fow fow = (fow)o;
        e0e.f((Object)fow, "instance");
        final a9c k = this.k((fow)super.c);
        Objects.requireNonNull(k);
        if (n < k.c.size()) {
            k.c.set(n, fow);
        }
        else {
            k.c.add(fow);
        }
        fow.d(k.h);
        ((fow)k).c();
    }
    
    public final void g(final int n, final Object o) {
        e0e.f((Object)o, "instance");
    }
    
    public final a9c k(final fow fow) {
        if (fow instanceof a9c) {
            return (a9c)fow;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }
}
