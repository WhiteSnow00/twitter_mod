// 
// Decompiled by Procyon v0.6.0
// 

public final class vkf implements jtb
{
    public final int a;
    public final Object b;
    
    public vkf(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object apply(Object cast) {
        switch (this.a) {
            default: {
                return ((egg)this.b).a((wfg)cast);
            }
            case 1: {
                final Class clazz = (Class)this.b;
                if (clazz.isInstance(cast)) {
                    cast = clazz.cast(cast);
                }
                else {
                    cast = null;
                }
                return cast;
            }
            case 0: {
                return gih.c((tge)cast, (Class)this.b, false);
            }
        }
    }
}
