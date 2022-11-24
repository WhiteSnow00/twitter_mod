// 
// Decompiled by Procyon v0.6.0
// 

public final class h4p implements a5p
{
    public static final h4p.h4p$c Companion;
    public static final ouo<h4p, ?> f;
    public final wwj a;
    public final juh b;
    public fvh<Integer> c;
    public float d;
    public final qk8 e;
    
    static {
        Companion = new h4p.h4p$c();
        h4p.f = (puo.puo$c)puo.a((hub<? super quo, ? super Object, ?>)h4p$a.F0, (stb<? super Object, ?>)h4p$b.F0);
    }
    
    public h4p(final int n) {
        final jmr a = jmr.a;
        this.a = (wwj)zzz.V((Object)n, (djq)a);
        this.b = new juh();
        this.c = (wwj)zzz.V((Object)Integer.MAX_VALUE, (djq)a);
        this.e = new qk8((stb<? super Float, Float>)new h4p$d(this));
    }
    
    public final boolean a() {
        return this.e.a();
    }
    
    public final float b(final float n) {
        return this.e.b(n);
    }
    
    public final Object c(final jvh jvh, final hub<? super g4p, ? super mp6<? super vzv>, ?> hub, final mp6<? super vzv> mp6) {
        final Object c = this.e.c(jvh, hub, mp6);
        if (c == jz6.F0) {
            return c;
        }
        return vzv.a;
    }
    
    public final int d() {
        return ((cjq<Number>)this.a).getValue().intValue();
    }
}
