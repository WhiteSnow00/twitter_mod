// 
// Decompiled by Procyon v0.6.0
// 

public final class kqi
{
    public final jvi a;
    public final vxs b;
    public final asq c;
    public final obi<?> d;
    
    public kqi(final jvi a, final vxs b, final asq c, final obi<?> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final o0t o0t) {
        final h0p j = ((cxs)o0t).j;
        if (j == null) {
            return;
        }
        final String g = j.g;
        String s = "";
        String s2;
        if ((s2 = g) == null) {
            s2 = "";
        }
        final String f = j.f;
        if (f != null) {
            s = f;
        }
        this.b.h(s, s2, "navigate", (j0p)rqv.a(j));
    }
}
