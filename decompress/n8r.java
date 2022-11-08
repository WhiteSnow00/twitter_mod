import android.os.BaseBundle;
import android.os.Bundle;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class n8r<T> implements Parcelable
{
    private static final n8r EMPTY;
    private String mKey;
    
    static {
        EMPTY = (n8r)new n8r.n8r$a();
    }
    
    public static String createKey(final Object o) {
        return o.getClass().toString();
    }
    
    public static <T> n8r<T> empty() {
        final n8r empty = n8r.EMPTY;
        final int a = w4j.a;
        return empty;
    }
    
    private static <T> Class<? super T> findAutoSaveClass(final Class<T> clazz) {
        for (Class<? super T> superclass = clazz; superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.isAnnotationPresent((Class<? extends Annotation>)a91.class)) {
                return superclass;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The class does not use @AutoSaveState: ");
        sb.append(clazz);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static <T> bra<T, n8r<T>> from(final Class<T> clazz) {
        final Class<? super T> autoSaveClass = findAutoSaveClass(clazz);
        final rv0 p = jgw.p0((Class)autoSaveClass);
        final String l0 = tjp.L0((gjp)rv0.f(p), (CharSequence)"_", 62);
        final StringBuilder sb = new StringBuilder();
        sb.append(l0);
        sb.append("$SavedState");
        final String string = sb.toString();
        zzd.f((Object)string, "name");
        final String s = (String)rv0.e(p, string, null).F0.getValue();
        final Class a0 = rp2.A0(s);
        if (a0 != null) {
            try {
                return (bra<T, n8r<T>>)new xax((Object)a0.getConstructor(autoSaveClass), 4);
            }
            catch (final Exception ex) {
                throw new IllegalStateException("The state saver doesn't have a constructor taking an object", ex);
            }
        }
        throw new IllegalStateException(l7k.c("Generated state saver class can't be found: ", s));
    }
    
    public static <T> bra<T, n8r<T>> from(final T t) {
        final Class<?> class1 = t.getClass();
        final int a = w4j.a;
        return from((Class<T>)class1);
    }
    
    public static <T> void restoreFromBundle(final T t, final Bundle bundle) {
        restoreFromBundle(t, bundle, createKey(t));
    }
    
    public static <T> void restoreFromBundle(final T t, final Bundle bundle, final String s) {
        if (bundle == null) {
            return;
        }
        final n8r n8r = (n8r)bundle.getParcelable(s);
        if (n8r != null) {
            n8r.restoreState(t);
        }
    }
    
    public String getKey() {
        return this.mKey;
    }
    
    public abstract void restoreState(final T p0);
    
    public void saveToBundle(final Bundle bundle) {
        final String key = this.getKey();
        if (key == null) {
            throw new IllegalStateException("key must not be null");
        }
        if (!((BaseBundle)bundle).containsKey(key)) {
            this.saveToBundle(bundle, key);
            return;
        }
        throw new IllegalStateException("key cannot be used twice");
    }
    
    public void saveToBundle(final Bundle bundle, final String s) {
        bundle.putParcelable(s, (Parcelable)this);
    }
    
    public void setKey(final String mKey) {
        this.mKey = mKey;
    }
}
