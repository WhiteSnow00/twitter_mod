// 
// Decompiled by Procyon v0.6.0
// 

public final class toz implements gpz
{
    public final gpz[] a;
    
    public toz(final gpz... a) {
        this.a = a;
    }
    
    public final fpz a(final Class clazz) {
        final gpz[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final gpz gpz = a[i];
            if (gpz.b(clazz)) {
                return gpz.a(clazz);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(clazz.getName()));
    }
    
    public final boolean b(final Class clazz) {
        final gpz[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
