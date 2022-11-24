// 
// Decompiled by Procyon v0.6.0
// 

public final class w6g extends bur
{
    public static final b Companion;
    public static final nmp<w6g> p;
    public final pej j;
    public final dtv k;
    public final dtv l;
    public final dtv m;
    public final dtv n;
    public final int o;
    
    static {
        Companion = new b();
        w6g.p = new w6g.w6g$c();
    }
    
    public w6g(final w6g.w6g$a w6g$a) {
        super((bur$a)w6g$a);
        this.j = w6g$a.k;
        final dtv l = w6g$a.l;
        e0e.c((Object)l);
        this.k = l;
        final dtv m = w6g$a.m;
        e0e.c((Object)m);
        this.l = m;
        this.m = w6g$a.n;
        this.n = w6g$a.o;
        this.o = w6g$a.p;
    }
    
    public final qtr b(final String s) {
        e0e.f((Object)s, "subtaskId");
        return (qtr)new v6g(s, this);
    }
    
    public static final class b
    {
    }
}
