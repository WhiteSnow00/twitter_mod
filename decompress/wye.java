import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wye implements erg
{
    public final v0f a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final hye f;
    public final long g;
    
    public wye(final v0f a, final boolean b, final boolean c, final int d, final int e, final hye f, final long g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final s2f a(final int n, final Object o, final int n2, final int n3, final List<? extends khk> list) {
        e0e.f(o, "key");
        e0e.f((Object)list, "placeables");
        return new s2f(n, o, this.b, n2, n3, this.c, ((b0e)this.a).getLayoutDirection(), this.d, this.e, (List)list, this.f, this.g, (wg8)null);
    }
}
