// 
// Decompiled by Procyon v0.6.0
// 

public final class knd implements gax$a
{
    public final aax<?>[] a;
    
    public knd(final aax<?>... a) {
        e0e.f((Object)a, "initializers");
        this.a = a;
    }
    
    public final t9x a(final Class clazz) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
    
    public final <T extends t9x> T b(final Class<T> clazz, final f67 f67) {
        final aax<?>[] a = this.a;
        final int length = a.length;
        int i = 0;
        t9x t9x = null;
        while (i < length) {
            final aax<?> aax = a[i];
            if (e0e.a((Object)aax.a, (Object)clazz)) {
                final Object invoke = aax.b.invoke((Object)f67);
                if (invoke instanceof t9x) {
                    t9x = (T)invoke;
                }
                else {
                    t9x = null;
                }
            }
            ++i;
        }
        if (t9x != null) {
            return (T)t9x;
        }
        final StringBuilder f68 = ehk.f("No initializer set for given class ");
        f68.append(clazz.getName());
        throw new IllegalArgumentException(f68.toString());
    }
}
