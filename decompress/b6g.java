// 
// Decompiled by Procyon v0.6.0
// 

public final class b6g extends dtr
{
    public static final b6g.b6g$b Companion;
    public static final rlp<b6g> p;
    public final cej j;
    public final ssv k;
    public final ssv l;
    public final ssv m;
    public final ssv n;
    public final int o;
    
    static {
        Companion = new b6g.b6g$b();
        b6g.p = new b6g.b6g$c();
    }
    
    public b6g(final b6g.b6g$a b6g$a) {
        super((dtr$a)b6g$a);
        this.j = b6g$a.k;
        final ssv l = b6g$a.l;
        czd.c((Object)l);
        this.k = l;
        final ssv m = b6g$a.m;
        czd.c((Object)m);
        this.l = m;
        this.m = b6g$a.n;
        this.n = b6g$a.o;
        this.o = b6g$a.p;
    }
    
    public final ssr b(final String s) {
        czd.f((Object)s, "subtaskId");
        return (ssr)new a6g(s, this);
    }
}
