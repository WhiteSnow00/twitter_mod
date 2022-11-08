import android.os.ParcelFileDescriptor;
import android.content.res.AssetManager;
import java.lang.reflect.Array;
import android.net.Uri;
import android.content.ContentResolver;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.io.IOException;
import android.graphics.Typeface$Builder;
import android.os.CancellationSignal;
import android.graphics.fonts.FontVariationAxis;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public class nlv extends jlv
{
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    
    public nlv() {
        final Class clazz = null;
        Class<?> forName = null;
        Constructor<?> constructor = null;
        Method o = null;
        Method p = null;
        Method method = null;
        Method method2 = null;
        Object q = null;
        Label_0132: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = forName.getConstructor((Class<?>[])new Class[0]);
                o = this.o(forName);
                p = this.p(forName);
                method = forName.getMethod("freeze", (Class[])new Class[0]);
                method2 = forName.getMethod("abortCreation", (Class[])new Class[0]);
                q = this.q(forName);
                break Label_0132;
            }
            catch (final NoSuchMethodException method2) {}
            catch (final ClassNotFoundException ex) {}
            final StringBuilder g = w48.g("Unable to collect necessary methods for class ");
            g.append(((Constructor<?>)method2).getClass().getName());
            Log.e("TypefaceCompatApi26Impl", g.toString(), (Throwable)method2);
            q = (method2 = null);
            final Method method3 = o = method2;
            p = (method = o);
            constructor = (Constructor<?>)method3;
            forName = clazz;
        }
        this.g = forName;
        this.h = constructor;
        this.i = o;
        this.j = p;
        this.k = method;
        this.l = method2;
        this.m = (Method)q;
    }
    
    private Object n() {
        try {
            return this.h.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    @Override
    public final Typeface a(final Context context, final klb$c klb$c, final Resources resources, int i) {
        if (!this.m()) {
            return super.a(context, klb$c, resources, i);
        }
        final Object n = this.n();
        if (n == null) {
            return null;
        }
        final klb$d[] a = klb$c.a;
        int length;
        klb$d klb$d;
        for (length = a.length, i = 0; i < length; ++i) {
            klb$d = a[i];
            if (!this.j(context, n, klb$d.a, klb$d.e, klb$d.b, klb$d.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(klb$d.d))) {
                this.i(n);
                return null;
            }
        }
        if (!this.l(n)) {
            return null;
        }
        return this.k(n);
    }
    
    @Override
    public final Typeface b(Context context, final tlb[] array, final int n) {
        if (array.length < 1) {
            return null;
        }
        if (!this.m()) {
            final tlb f = this.f(array, n);
            final ContentResolver contentResolver = context.getContentResolver();
            try {
                context = (Context)contentResolver.openFileDescriptor(f.a, "r", (CancellationSignal)null);
                if (context == null) {
                    if (context != null) {
                        ((ParcelFileDescriptor)context).close();
                    }
                    return null;
                }
                try {
                    final Typeface build = new Typeface$Builder(((ParcelFileDescriptor)context).getFileDescriptor()).setWeight(f.c).setItalic(f.d).build();
                    ((ParcelFileDescriptor)context).close();
                    return build;
                }
                finally {
                    try {
                        ((ParcelFileDescriptor)context).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)(Object)array).addSuppressed(t);
                    }
                }
            }
            catch (final IOException ex) {
                return null;
            }
        }
        final HashMap hashMap = new HashMap();
        for (final tlb tlb : array) {
            if (tlb.e == 0) {
                final Uri a = tlb.a;
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, rlv.e(context, a));
                }
            }
        }
        context = (Context)Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final Object n2 = this.n();
        if (n2 == null) {
            return null;
        }
        final int length2 = array.length;
        int j = 0;
        boolean b = false;
        while (j < length2) {
            final tlb tlb2 = array[j];
            final ByteBuffer byteBuffer = ((Map<K, ByteBuffer>)context).get(tlb2.a);
            if (byteBuffer != null) {
                final int b2 = tlb2.b;
                final int c = tlb2.c;
                final int d = tlb2.d ? 1 : 0;
                boolean booleanValue;
                try {
                    booleanValue = (boolean)this.j.invoke(n2, byteBuffer, b2, null, c, d);
                }
                catch (final IllegalAccessException | InvocationTargetException ex2) {
                    booleanValue = false;
                }
                if (!booleanValue) {
                    this.i(n2);
                    return null;
                }
                b = true;
            }
            ++j;
        }
        if (!b) {
            this.i(n2);
            return null;
        }
        if (!this.l(n2)) {
            return null;
        }
        final Typeface k = this.k(n2);
        if (k == null) {
            return null;
        }
        return Typeface.create(k, n);
    }
    
    public final Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.m()) {
            return super.d(context, resources, n, s, n2);
        }
        final Object n3 = this.n();
        if (n3 == null) {
            return null;
        }
        if (!this.j(context, n3, s, 0, -1, -1, null)) {
            this.i(n3);
            return null;
        }
        if (!this.l(n3)) {
            return null;
        }
        return this.k(n3);
    }
    
    public final void i(final Object o) {
        try {
            this.l.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {}
    }
    
    public final boolean j(final Context context, final Object o, final String s, final int n, final int n2, final int n3, final FontVariationAxis[] array) {
        try {
            return (boolean)this.i.invoke(o, context.getAssets(), s, 0, Boolean.FALSE, n, n2, n3, array);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public Typeface k(final Object o) {
        try {
            final Object instance = Array.newInstance(this.g, 1);
            Array.set(instance, 0, o);
            return (Typeface)this.m.invoke(null, instance, -1, -1);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final boolean l(final Object o) {
        try {
            return (boolean)this.k.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public final boolean m() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }
    
    public final Method o(final Class<?> clazz) throws NoSuchMethodException {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromAssetManager", AssetManager.class, String.class, type, Boolean.TYPE, type, type, type, FontVariationAxis[].class);
    }
    
    public final Method p(final Class<?> clazz) throws NoSuchMethodException {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromBuffer", ByteBuffer.class, type, FontVariationAxis[].class, type, type);
    }
    
    public Method q(final Class<?> clazz) throws NoSuchMethodException {
        final Class<?> class1 = Array.newInstance(clazz, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
