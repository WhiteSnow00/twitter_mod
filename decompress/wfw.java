// 
// Decompiled by Procyon v0.6.0
// 

public final class wfw implements psl<wfw.wfw$b>
{
    public static final wfw.wfw$a Companion;
    
    static {
        Companion = new wfw.wfw$a();
    }
    
    public final void a(final ale ale, final fa7 fa7) {
        czd.f((Object)fa7, "customScalarAdapters");
    }
    
    public final String b() {
        return "RE4g_LtLB1A9uStldgZzfw";
    }
    
    public final xq<wfw.wfw$b> c() {
        return (xq<wfw.wfw$b>)ar.c((xq)xfw.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && czd.a((Object)v9m.a((Class)o.getClass()), (Object)v9m.a((Class)wfw.class));
    }
    
    @Override
    public final int hashCode() {
        return v9m.a((Class)wfw.class).hashCode();
    }
    
    public final String name() {
        return "UserPhoneState";
    }
}
