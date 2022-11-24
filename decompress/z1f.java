import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z1f implements frg
{
    public final int a;
    public final int b;
    public final v0f c;
    public final boolean d;
    public final ex$b e;
    public final ex$c f;
    public final boolean g;
    public final int h;
    public final int i;
    public final n1f j;
    public final long k;
    
    public z1f(final int a, final int b, final v0f c, final boolean d, final ex$b e, final ex$c f, final boolean g, final int h, final int i, final n1f j, final long k) {
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
    }
    
    public final t2f a(final int n, final Object o, final List<? extends khk> list) {
        e0e.f(o, "key");
        e0e.f((Object)list, "placeables");
        int b;
        if (n == this.a - 1) {
            b = 0;
        }
        else {
            b = this.b;
        }
        return new t2f(n, (List)list, this.d, this.e, this.f, ((b0e)this.c).getLayoutDirection(), this.g, this.h, this.i, this.j, b, this.k, o, (wg8)null);
    }
}
