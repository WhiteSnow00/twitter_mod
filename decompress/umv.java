import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.GenericDeclaration;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class umv extends anv
{
    public static final Class<?> b;
    public static final Constructor<?> c;
    public static final Method d;
    public static final Method e;
    
    static {
        Constructor<?> c2 = null;
        Class<?> forName = null;
        GenericDeclaration d2 = null;
        GenericDeclaration method = null;
        Label_0111: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                final Constructor<?> constructor = forName.getConstructor((Class<?>[])new Class[0]);
                d2 = Integer.TYPE;
                d2 = forName.getMethod("addFontWeightStyle", ByteBuffer.class, (Class)d2, List.class, (Class)d2, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass());
                c2 = constructor;
                break Label_0111;
            }
            catch (final NoSuchMethodException d2) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi24Impl", ((Class)d2).getClass().getName(), (Throwable)d2);
            forName = null;
            method = (d2 = null);
        }
        c = c2;
        b = forName;
        d = (Method)d2;
        e = (Method)method;
    }
    
    public static boolean g(final Object o, final ByteBuffer byteBuffer, final int n, final int n2, final boolean b) {
        try {
            return (boolean)umv.d.invoke(o, byteBuffer, n, null, n2, b);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public static Typeface h(final Object o) {
        try {
            final Object instance = Array.newInstance(umv.b, 1);
            Array.set(instance, 0, o);
            return (Typeface)umv.e.invoke(null, instance);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final Typeface a(final Context context, jlb$c jlb$c, final Resources resources, int i) {
        Object instance;
        try {
            instance = umv.c.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final jlb.d[] a = jlb$c.a;
        final int length = a.length;
        i = 0;
        while (i < length) {
            final jlb.d d = a[i];
            final int f = d.f;
            final File d2 = bnv.d(context);
            Label_0097: {
                if (d2 == null) {
                    break Label_0097;
                }
                try {
                    if (!bnv.b(d2, resources, f)) {
                        d2.delete();
                        jlb$c = null;
                    }
                    else {
                        try {
                            final FileInputStream fileInputStream = new FileInputStream(d2);
                            try {
                                final FileChannel channel = fileInputStream.getChannel();
                                channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            }
                            finally {
                                try {
                                    fileInputStream.close();
                                }
                                finally {
                                    final Throwable t;
                                    ((Throwable)jlb$c).addSuppressed(t);
                                }
                            }
                        }
                        catch (final IOException ex2) {
                            jlb$c = null;
                        }
                        d2.delete();
                    }
                    if (jlb$c == null) {
                        return null;
                    }
                    if (!g(instance, (ByteBuffer)jlb$c, d.e, d.b, d.c)) {
                        return null;
                    }
                    ++i;
                    continue;
                }
                finally {
                    d2.delete();
                }
            }
            break;
        }
        return h(instance);
    }
    
    public final Typeface b(final Context context, final slb[] array, final int n) {
        int i = 0;
        Object instance;
        try {
            instance = umv.c.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final z8q z8q = new z8q();
        while (i < array.length) {
            final slb slb = array[i];
            final Uri a = slb.a;
            ByteBuffer e;
            if ((e = (ByteBuffer)z8q.getOrDefault((Object)a, (Object)null)) == null) {
                e = bnv.e(context, a);
                z8q.put((Object)a, (Object)e);
            }
            if (e == null) {
                return null;
            }
            if (!g(instance, e, slb.b, slb.c, slb.d)) {
                return null;
            }
            ++i;
        }
        final Typeface h = h(instance);
        if (h == null) {
            return null;
        }
        return Typeface.create(h, n);
    }
}
