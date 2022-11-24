import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eze implements eye
{
    public final long a;
    public final long b;
    public final int c;
    public final Object d;
    public final int e;
    public final int f;
    public final long g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final List<dze> m;
    public final hye n;
    public final long o;
    public final boolean p;
    
    public eze(final long a, final long b, int c, final Object d, int f, final int f2, final long g, final int h, final int i, final int j, final int k, final boolean l, final List m, final hye n, final long o, final wg8 wg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = f;
        this.f = f2;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        f = this.f();
        final boolean b2 = false;
        c = 0;
        boolean p16;
        while (true) {
            p16 = b2;
            if (c >= f) {
                break;
            }
            if (this.c(c) != null) {
                p16 = true;
                break;
            }
            ++c;
        }
        this.p = p16;
    }
    
    public final int a() {
        return this.e;
    }
    
    public final int b() {
        return this.f;
    }
    
    public final w0b<hud> c(final int n) {
        final Object b = this.m.get(n).b;
        w0b w0b;
        if (b instanceof w0b) {
            w0b = (w0b)b;
        }
        else {
            w0b = null;
        }
        return (w0b<hud>)w0b;
    }
    
    public final int d(int n) {
        final khk a = this.m.get(n).a;
        if (this.l) {
            n = a.G0;
        }
        else {
            n = a.F0;
        }
        return n;
    }
    
    public final int e() {
        final int i = this.i;
        int b;
        if (this.l) {
            b = nud.b(this.g);
        }
        else {
            b = (int)(this.g >> 32);
        }
        return i + b;
    }
    
    public final int f() {
        return this.m.size();
    }
    
    public final int getIndex() {
        return this.c;
    }
}
