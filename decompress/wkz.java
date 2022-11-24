// 
// Decompiled by Procyon v0.6.0
// 

public final class wkz implements gpz
{
    public static final wkz a;
    
    static {
        a = new wkz();
    }
    
    public final fpz a(final Class clazz) {
        if (bmz.class.isAssignableFrom(clazz)) {
            try {
                return (fpz)bmz.l((Class)clazz.asSubclass(bmz.class)).r(3);
            }
            catch (final Exception ex) {
                throw new RuntimeException("Unable to get message info for ".concat(clazz.getName()), ex);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(clazz.getName()));
    }
    
    public final boolean b(final Class clazz) {
        return bmz.class.isAssignableFrom(clazz);
    }
}
