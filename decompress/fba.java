// 
// Decompiled by Procyon v0.6.0
// 

public final class fba
{
    public final mm3 a;
    public final Iterable<mm3> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final tna<mm3> g;
    public final int h;
    
    public fba(final mm3 a, final Iterable<? extends mm3> b, final boolean c, final boolean d, final boolean e, final boolean f) {
        e0e.f((Object)a, "current");
        e0e.f((Object)b, "items");
        this.a = a;
        this.b = (Iterable<mm3>)b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        tna j;
        if (b instanceof tna) {
            j = (tna)b;
        }
        else {
            j = k6e.j((Iterable)b);
            e0e.e((Object)j, "{\n            IterableUt\u2026Extended(items)\n        }");
        }
        this.g = (tna<mm3>)j;
        this.h = j.j1((nuk)new eba((Object)this, 0));
    }
}
