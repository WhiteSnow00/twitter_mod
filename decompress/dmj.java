// 
// Decompiled by Procyon v0.6.0
// 

public final class dmj extends bur
{
    public final dtv j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    
    public dmj(final dmj.dmj$a dmj$a) {
        super((bur$a)dmj$a);
        final dtv l = dmj$a.l;
        if (l == null) {
            e0e.m("successLink");
            throw null;
        }
        this.j = l;
        final String k = dmj$a.k;
        if (k != null) {
            this.k = k;
            this.l = dmj$a.m;
            this.m = dmj$a.n;
            this.n = dmj$a.o;
            this.o = dmj$a.p;
            return;
        }
        e0e.m("state");
        throw null;
    }
    
    public final qtr b(final String s) {
        e0e.f((Object)s, "subtaskId");
        return new amj(s, this);
    }
}
