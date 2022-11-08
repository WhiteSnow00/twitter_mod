// 
// Decompiled by Procyon v0.6.0
// 

package androidx.versionedparcelable;

import java.lang.reflect.InvocationTargetException;
import android.os.Parcelable;
import java.lang.reflect.Method;

public abstract class VersionedParcel
{
    public final at0<String, Method> a;
    public final at0<String, Method> b;
    public final at0<String, Class> c;
    
    public VersionedParcel(final at0<String, Method> a, final at0<String, Method> b, final at0<String, Class> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abstract void a();
    
    public abstract VersionedParcel b();
    
    public final Class c(final Class<? extends xrw> clazz) throws ClassNotFoundException {
        Class<?> forName;
        if ((forName = (Class)((l7q)this.c).getOrDefault((Object)clazz.getName(), (Object)null)) == null) {
            forName = Class.forName(String.format("%s.%sParcelizer", clazz.getPackage().getName(), clazz.getSimpleName()), false, clazz.getClassLoader());
            ((l7q)this.c).put((Object)clazz.getName(), (Object)forName);
        }
        return forName;
    }
    
    public final Method d(final String s) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method declaredMethod;
        if ((declaredMethod = (Method)((l7q)this.a).getOrDefault((Object)s, (Object)null)) == null) {
            System.currentTimeMillis();
            declaredMethod = Class.forName(s, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            ((l7q)this.a).put((Object)s, (Object)declaredMethod);
        }
        return declaredMethod;
    }
    
    public final Method e(final Class clazz) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method declaredMethod;
        if ((declaredMethod = (Method)((l7q)this.b).getOrDefault((Object)clazz.getName(), (Object)null)) == null) {
            final Class c = this.c(clazz);
            System.currentTimeMillis();
            declaredMethod = c.getDeclaredMethod("write", clazz, VersionedParcel.class);
            ((l7q)this.b).put((Object)clazz.getName(), (Object)declaredMethod);
        }
        return declaredMethod;
    }
    
    public abstract boolean f();
    
    public abstract byte[] g();
    
    public abstract CharSequence h();
    
    public abstract boolean i(final int p0);
    
    public abstract int j();
    
    public final int k(final int n, final int n2) {
        if (!this.i(n2)) {
            return n;
        }
        return this.j();
    }
    
    public abstract <T extends Parcelable> T l();
    
    public final <T extends Parcelable> T m(final T t, final int n) {
        if (!this.i(n)) {
            return t;
        }
        return this.l();
    }
    
    public abstract String n();
    
    public final <T extends xrw> T o() {
        final String n = this.n();
        if (n == null) {
            return null;
        }
        final VersionedParcel b = this.b();
        try {
            return (T)this.d(n).invoke(null, b);
        }
        catch (final ClassNotFoundException ex) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", ex);
        }
        catch (final NoSuchMethodException ex2) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", ex2);
        }
        catch (final InvocationTargetException ex3) {
            if (ex3.getCause() instanceof RuntimeException) {
                throw (RuntimeException)ex3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", ex3);
        }
        catch (final IllegalAccessException ex4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ex4);
        }
    }
    
    public abstract void p(final int p0);
    
    public abstract void q(final boolean p0);
    
    public abstract void r(final byte[] p0);
    
    public abstract void s(final CharSequence p0);
    
    public abstract void t(final int p0);
    
    public final void u(final int n, final int n2) {
        this.p(n2);
        this.t(n);
    }
    
    public abstract void v(final Parcelable p0);
    
    public final void w(final Parcelable parcelable, final int n) {
        this.p(n);
        this.v(parcelable);
    }
    
    public abstract void x(final String p0);
    
    public final void y(final xrw ex) {
        if (ex == null) {
            this.x(null);
            return;
        }
        try {
            this.x(this.c((Class<? extends xrw>)ex.getClass()).getName());
            final VersionedParcel b = this.b();
            try {
                this.e(ex.getClass()).invoke(null, ex, b);
                b.a();
            }
            catch (final ClassNotFoundException ex) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", ex);
            }
            catch (final NoSuchMethodException ex) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", ex);
            }
            catch (final InvocationTargetException ex) {
                if (((InvocationTargetException)ex).getCause() instanceof RuntimeException) {
                    throw (RuntimeException)((InvocationTargetException)ex).getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", ex);
            }
            catch (final IllegalAccessException ex) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ex);
            }
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), ex2);
        }
    }
    
    public static class ParcelException extends RuntimeException
    {
    }
}
