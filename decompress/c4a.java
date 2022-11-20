// 
// Decompiled by Procyon v0.6.0
// 

public final class c4a extends zr2<vju, vju$a>
{
    public static final c4a c;
    
    static {
        c = new c4a();
    }
    
    public c4a() {
        super(0);
    }
    
    public final void f(final wlp wlp, final Object o) {
        final vju vju = (vju)o;
        czd.f((Object)wlp, "output");
        czd.f((Object)vju, "metrics");
        final Integer a = vju.a;
        final lw6$i b = lw6.b;
        ((wow)b).c(wlp, (Object)a);
        final int a2 = c5j.a;
        ((wow)b).c(wlp, (Object)vju.b);
        ((wow)b).c(wlp, (Object)vju.c);
        ((wow)b).c(wlp, (Object)vju.d);
    }
    
    public final n4j g() {
        return (n4j)new vju$a((Integer)null, (Integer)null, (Integer)null, (Integer)null, 15, (rf8)null);
    }
    
    public final void h(final vlp vlp, final n4j n4j, final int n) {
        final vju$a vju$a = (vju$a)n4j;
        czd.f((Object)vlp, "input");
        czd.f((Object)vju$a, "builder");
        final lw6$i b = lw6.b;
        vju$a.a = (Integer)((wow)b).a(vlp);
        vju$a.b = (Integer)((wow)b).a(vlp);
        vju$a.c = (Integer)((wow)b).a(vlp);
        vju$a.d = (Integer)((wow)b).a(vlp);
    }
}
