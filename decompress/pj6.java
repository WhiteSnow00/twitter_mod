import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pj6 implements i4j<Object>
{
    public final uau C0;
    public final /* synthetic */ Class D0;
    
    public pj6(Class forName) {
        this.D0 = forName;
        Object c0;
        try {
            forName = Class.forName("sun.misc.Unsafe");
            final Field declaredField = forName.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            c0 = new u0w(forName.getMethod("allocateInstance", Class.class), declaredField.get(null));
        }
        catch (final Exception ex) {
            try {
                final Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = (int)declaredMethod.invoke(null, Object.class);
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                c0 = new v0w(declaredMethod2, intValue);
            }
            catch (final Exception ex2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c0 = new w0w(declaredMethod3);
                }
                catch (final Exception ex3) {
                    c0 = new x0w();
                }
            }
        }
        this.C0 = (uau)c0;
    }
    
    @Override
    public final Object O() {
        try {
            return this.C0.m(this.D0);
        }
        catch (final Exception ex) {
            final StringBuilder g = w48.g("Unable to create instance of ");
            g.append(this.D0);
            g.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(g.toString(), ex);
        }
    }
}
