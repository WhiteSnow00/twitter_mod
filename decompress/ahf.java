// 
// Decompiled by Procyon v0.6.0
// 

public final class ahf implements zgf
{
    public static final ahf.ahf$a Companion;
    public final kba a;
    public final dda b;
    public final dda c;
    public String d;
    
    static {
        Companion = new ahf.ahf$a();
    }
    
    public ahf(final qda qda) {
        final iba a = iba.Companion.a(qda, "link_module");
        this.a = (kba)a;
        final dda.a companion = dda.Companion;
        this.b = companion.b(a, "card", "impression");
        this.c = companion.b(a, "card", "click");
    }
    
    public final void a(final String d) {
        this.d = d;
    }
    
    public final void b() {
        final fg4 fg4 = new fg4(this.c);
        ((o1p)fg4).C = this.d;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public final void c() {
        final fg4 fg4 = new fg4(this.b);
        ((o1p)fg4).C = this.d;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
}
