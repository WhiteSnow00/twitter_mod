// 
// Decompiled by Procyon v0.6.0
// 

public final class zi9
{
    public static final a Companion;
    public final o3s<jj9> a;
    
    static {
        Companion = new a();
    }
    
    public zi9(final jj9 jj9, final stb<? super jj9, Boolean> stb) {
        e0e.f((Object)jj9, "initialValue");
        e0e.f((Object)stb, "confirmStateChange");
        this.a = (o3s<jj9>)new o3s((Object)jj9, (ac0)hi9.c, (stb)stb);
    }
    
    public final Object a(final mp6<? super vzv> mp6) {
        Object o = this.a.c((Object)jj9.F0, (ac0)hi9.c, (mp6)mp6);
        final jz6 f0 = jz6.F0;
        if (o != f0) {
            o = vzv.a;
        }
        if (o == f0) {
            return o;
        }
        return vzv.a;
    }
    
    public static final class a
    {
    }
}
