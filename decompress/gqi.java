// 
// Decompiled by Procyon v0.6.0
// 

public final class gqi
{
    public final ivi a;
    public final exs b;
    public final grq c;
    public final mbi<?> d;
    
    public gqi(final ivi a, final exs b, final grq c, final mbi<?> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final yzs yzs) {
        final qzo j = yzs.j;
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
        this.b.h(s, s2, "navigate", (szo)vpv.a(j));
    }
}
