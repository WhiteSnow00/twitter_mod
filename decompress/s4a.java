// 
// Decompiled by Procyon v0.6.0
// 

public final class s4a extends js2<ziu, ziu$a>
{
    public static final s4a c;
    
    static {
        c = new s4a();
    }
    
    public s4a() {
        super(0);
    }
    
    public final void f(final flp flp, final Object o) {
        final ziu ziu = (ziu)o;
        zzd.f((Object)flp, "output");
        zzd.f((Object)ziu, "metrics");
        final Integer a = ziu.a;
        final hx6$i b = hx6.b;
        ((bow)b).c(flp, (Object)a);
        final int a2 = w4j.a;
        ((bow)b).c(flp, (Object)ziu.b);
        ((bow)b).c(flp, (Object)ziu.c);
        ((bow)b).c(flp, (Object)ziu.d);
    }
    
    public final h4j g() {
        return (h4j)new ziu$a((Integer)null, (Integer)null, (Integer)null, (Integer)null, 15, (hg8)null);
    }
    
    public final void h(final elp elp, final h4j h4j, final int n) {
        final ziu$a ziu$a = (ziu$a)h4j;
        zzd.f((Object)elp, "input");
        zzd.f((Object)ziu$a, "builder");
        final hx6$i b = hx6.b;
        ziu$a.a = (Integer)((bow)b).a(elp);
        ziu$a.b = (Integer)((bow)b).a(elp);
        ziu$a.c = (Integer)((bow)b).a(elp);
        ziu$a.d = (Integer)((bow)b).a(elp);
    }
}
