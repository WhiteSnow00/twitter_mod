// 
// Decompiled by Procyon v0.6.0
// 

public final class jjz implements tnz
{
    public static final jjz a;
    
    static {
        a = new jjz();
    }
    
    @Override
    public final snz a(final Class clazz) {
        if (okz.class.isAssignableFrom(clazz)) {
            try {
                return (snz)okz.l(clazz.asSubclass(okz.class)).r(3);
            }
            catch (final Exception ex) {
                throw new RuntimeException("Unable to get message info for ".concat(clazz.getName()), ex);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(clazz.getName()));
    }
    
    @Override
    public final boolean b(final Class clazz) {
        return okz.class.isAssignableFrom(clazz);
    }
}
