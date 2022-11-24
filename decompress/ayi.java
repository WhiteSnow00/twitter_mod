// 
// Decompiled by Procyon v0.6.0
// 

public final class ayi extends bur
{
    public static final ayi.ayi$b Companion;
    public static final nmp<ayi> q;
    public final pej j;
    public final dtv k;
    public final dtv l;
    public final dtv m;
    public final dtv n;
    public final zjl o;
    public final int p;
    
    static {
        Companion = new ayi.ayi$b();
        ayi.q = new ayi.ayi$c();
    }
    
    public ayi(final ayi.ayi$a ayi$a) {
        super((bur$a)ayi$a);
        this.j = ayi$a.k;
        final dtv l = ayi$a.l;
        e0e.c((Object)l);
        this.k = l;
        final dtv m = ayi$a.m;
        e0e.c((Object)m);
        this.l = m;
        this.m = ayi$a.n;
        this.n = ayi$a.o;
        this.o = ayi$a.p;
        this.p = ayi$a.q;
    }
    
    public final qtr b(final String s) {
        e0e.f((Object)s, "subtaskId");
        return (qtr)new zxi(s, this);
    }
}
