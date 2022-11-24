import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bk6 implements a5j<Object>
{
    public final dcu F0;
    public final Class G0;
    
    public bk6(Class forName) {
        this.G0 = forName;
        Object f0;
        try {
            forName = Class.forName("sun.misc.Unsafe");
            final Field declaredField = forName.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            f0 = new y1w(forName.getMethod("allocateInstance", Class.class), declaredField.get(null));
        }
        catch (final Exception ex) {
            try {
                final Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = (int)declaredMethod.invoke(null, Object.class);
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                f0 = new z1w(declaredMethod2, intValue);
            }
            catch (final Exception ex2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    f0 = new a2w(declaredMethod3);
                }
                catch (final Exception ex3) {
                    f0 = new b2w();
                }
            }
        }
        this.F0 = (dcu)f0;
    }
    
    public final Object l() {
        try {
            return this.F0.n(this.G0);
        }
        catch (final Exception ex) {
            final StringBuilder f = ehk.f("Unable to create instance of ");
            f.append(this.G0);
            f.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(f.toString(), ex);
        }
    }
}
