import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rk extends bur
{
    public final List<ik> j;
    public final rk.rk$c k;
    
    public rk(final rk.rk$a rk$a) {
        e0e.f((Object)rk$a, "builder");
        super((bur$a)rk$a);
        final List k = rk$a.k;
        if (k != null) {
            this.j = k;
            this.k = rk$a.l;
            return;
        }
        e0e.m("actionListItems");
        throw null;
    }
    
    public final qtr b(final String s) {
        e0e.f((Object)s, "subtaskId");
        return (qtr)new qk(s, this);
    }
}
