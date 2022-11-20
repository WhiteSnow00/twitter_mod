// 
// Decompiled by Procyon v0.6.0
// 

public final class eam extends ste implements qsb<Class<?>, Class<?>>
{
    public static final eam D0;
    
    static {
        D0 = new eam();
    }
    
    public eam() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Class clazz = (Class)o;
        czd.f((Object)clazz, "it");
        return clazz.getSuperclass();
    }
}
