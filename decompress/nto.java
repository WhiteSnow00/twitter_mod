import android.os.BaseBundle;
import androidx.lifecycle.c;
import androidx.savedstate.Recreator$b;
import android.os.Bundle;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RestrictedApi" })
public final class nto
{
    private static final b Companion;
    public final kpo<String, c> a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public Recreator$b e;
    public boolean f;
    
    static {
        Companion = new b();
    }
    
    public nto() {
        this.a = new kpo<String, c>();
        this.f = true;
    }
    
    public final Bundle a(final String s) {
        czd.f((Object)s, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        final Bundle c = this.c;
        if (c != null) {
            Bundle bundle;
            if (c != null) {
                bundle = c.getBundle(s);
            }
            else {
                bundle = null;
            }
            final Bundle c2 = this.c;
            if (c2 != null) {
                c2.remove(s);
            }
            final Bundle c3 = this.c;
            int n = 0;
            if (c3 != null) {
                n = n;
                if (!((BaseBundle)c3).isEmpty()) {
                    n = 1;
                }
            }
            if (n == 0) {
                this.c = null;
            }
            return bundle;
        }
        return null;
    }
    
    public final void b(final String s, final c c) {
        czd.f((Object)c, "provider");
        if (this.a.j(s, c) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }
    
    public final void c(final Class<? extends a> clazz) {
        if (this.f) {
            Recreator$b e;
            if ((e = this.e) == null) {
                e = new Recreator$b(this);
            }
            this.e = e;
            try {
                androidx.lifecycle.c.class.getDeclaredConstructor((Class<?>[])new Class[0]);
                final Recreator$b e2 = this.e;
                if (e2 != null) {
                    e2.a.add(androidx.lifecycle.c.class.getName());
                }
                return;
            }
            catch (final NoSuchMethodException ex) {
                final StringBuilder j = fu8.j("Class ");
                j.append(androidx.lifecycle.c.class.getSimpleName());
                j.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(j.toString(), ex);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
    
    public interface a
    {
        void a(final pto p0);
    }
    
    public static final class b
    {
    }
    
    public interface c
    {
        Bundle a();
    }
}
