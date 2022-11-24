// 
// Decompiled by Procyon v0.6.0
// 

public final class x4q extends bur
{
    public final u4q j;
    public final String k;
    public final pej l;
    
    public x4q(final x4q.x4q$a x4q$a) {
        e0e.f((Object)x4q$a, "builder");
        super((bur$a)x4q$a);
        final u4q k = x4q$a.k;
        if (k == null) {
            e0e.m("style");
            throw null;
        }
        this.j = k;
        final String l = x4q$a.l;
        if (l != null) {
            this.k = l;
            this.l = x4q$a.m;
            return;
        }
        e0e.m("code");
        throw null;
    }
    
    public final qtr<?> b(final String s) {
        e0e.f((Object)s, "subtaskId");
        return (qtr<?>)new w4q(s, this);
    }
}
