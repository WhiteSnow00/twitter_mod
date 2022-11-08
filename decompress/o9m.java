// 
// Decompiled by Procyon v0.6.0
// 

public final class o9m extends gue implements rtb<Class<?>, gjp<? extends Class<?>>>
{
    public static final o9m C0;
    
    static {
        C0 = new o9m();
    }
    
    public o9m() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Class clazz = (Class)o;
        zzd.f((Object)clazz, "it");
        final gjp b0 = pjp.B0((Object[])new Class[] { clazz });
        final Class[] interfaces = clazz.getInterfaces();
        zzd.e((Object)interfaces, "it.interfaces");
        return tjp.Q0(b0, tjp.K0(jt0.x0((Object[])interfaces), (rtb)n9m.C0));
    }
}
