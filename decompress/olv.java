import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olv extends nlv
{
    @Override
    public final Typeface k(Object ex) {
        try {
            final Object instance = Array.newInstance(super.g, 1);
            Array.set(instance, 0, ex);
            ex = (InvocationTargetException)super.m.invoke(null, instance, "sans-serif", -1, -1);
            return (Typeface)ex;
        }
        catch (final InvocationTargetException ex) {}
        catch (final IllegalAccessException ex2) {}
        throw new RuntimeException(ex);
    }
    
    @Override
    public final Method q(final Class<?> clazz) throws NoSuchMethodException {
        final Class<?> class1 = Array.newInstance(clazz, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, String.class, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
