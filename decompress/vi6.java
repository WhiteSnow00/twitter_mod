import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vi6 implements o4j<Object>
{
    public final nbu D0;
    public final Class E0;
    
    public vi6(Class forName) {
        this.E0 = forName;
        Object d0;
        try {
            forName = Class.forName("sun.misc.Unsafe");
            final Field declaredField = forName.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            d0 = new j1w(forName.getMethod("allocateInstance", Class.class), declaredField.get(null));
        }
        catch (final Exception ex) {
            try {
                final Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = (int)declaredMethod.invoke(null, Object.class);
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                d0 = new k1w(declaredMethod2, intValue);
            }
            catch (final Exception ex2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    d0 = new l1w(declaredMethod3);
                }
                catch (final Exception ex3) {
                    d0 = new m1w();
                }
            }
        }
        this.D0 = (nbu)d0;
    }
    
    @Override
    public final Object g() {
        try {
            return this.D0.l(this.E0);
        }
        catch (final Exception ex) {
            final StringBuilder j = fu8.j("Unable to create instance of ");
            j.append(this.E0);
            j.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(j.toString(), ex);
        }
    }
}
