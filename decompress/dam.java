// 
// Decompiled by Procyon v0.6.0
// 

public final class dam extends ste implements qsb<Class<?>, xjp<? extends Class<?>>>
{
    public static final dam D0;
    
    static {
        D0 = new dam();
    }
    
    public dam() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Class clazz = (Class)o;
        czd.f((Object)clazz, "it");
        final xjp f0 = gkp.f0((Object[])new Class[] { clazz });
        final Class[] interfaces = clazz.getInterfaces();
        czd.e((Object)interfaces, "it.interfaces");
        return kkp.u0(f0, kkp.o0(ct0.I0((Object[])interfaces), (qsb)cam.D0));
    }
}
