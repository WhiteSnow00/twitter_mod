// 
// Decompiled by Procyon v0.6.0
// 

public final class y9a
{
    public final ll3 a;
    public final Iterable<ll3> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mma<ll3> g;
    public final int h;
    
    public y9a(final ll3 a, final Iterable<? extends ll3> b, final boolean c, final boolean d, final boolean e, final boolean f) {
        czd.f((Object)a, "current");
        czd.f((Object)b, "items");
        this.a = a;
        this.b = (Iterable<ll3>)b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        mma j;
        if (b instanceof mma) {
            j = (mma)b;
        }
        else {
            j = i5e.j((Iterable)b);
            czd.e((Object)j, "{\n            IterableUt\u2026Extended(items)\n        }");
        }
        this.g = (mma<ll3>)j;
        this.h = j.i1((xtk)new orf((Object)this, 1));
    }
}
