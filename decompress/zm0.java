import android.os.BaseBundle;
import java.util.List;
import android.os.Trace;
import java.util.Iterator;
import androidx.startup.StartupException;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zm0
{
    public static volatile zm0 d;
    public static final Object e;
    public final Map<Class<?>, Object> a;
    public final Set<Class<? extends jnd<?>>> b;
    public final Context c;
    
    static {
        e = new Object();
    }
    
    public zm0(final Context context) {
        this.c = context.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }
    
    public static zm0 c(final Context context) {
        if (zm0.d == null) {
            synchronized (zm0.e) {
                if (zm0.d == null) {
                    zm0.d = new zm0(context);
                }
            }
        }
        return zm0.d;
    }
    
    public final void a(final Bundle bundle) {
        final String string = this.c.getString(2131951962);
        if (bundle != null) {
            try {
                final HashSet<Class<?>> set = new HashSet<Class<?>>();
                for (final String s : ((BaseBundle)bundle).keySet()) {
                    if (string.equals(((BaseBundle)bundle).getString(s, (String)null))) {
                        final Class<?> forName = Class.forName(s);
                        if (!jnd.class.isAssignableFrom(forName)) {
                            continue;
                        }
                        this.b.add(forName);
                    }
                }
                final Iterator iterator2 = this.b.iterator();
                while (iterator2.hasNext()) {
                    this.b((Class<? extends jnd<?>>)iterator2.next(), set);
                }
            }
            catch (final ClassNotFoundException ex) {
                throw new StartupException((Throwable)ex);
            }
        }
    }
    
    public final <T> T b(final Class<? extends jnd<?>> clazz, final Set<Class<?>> set) {
        Label_0013: {
            if (!awt.a()) {
                break Label_0013;
            }
            try {
                Trace.beginSection(clazz.getSimpleName());
                if (!set.contains(clazz)) {
                    if (!this.a.containsKey(clazz)) {
                        set.add(clazz);
                        try {
                            final jnd jnd = (jnd)clazz.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                            final List b = jnd.b();
                            if (!b.isEmpty()) {
                                for (final Class clazz2 : b) {
                                    if (!this.a.containsKey(clazz2)) {
                                        this.b(clazz2, set);
                                    }
                                }
                            }
                            final Object a = jnd.a(this.c);
                            set.remove(clazz);
                            this.a.put(clazz, a);
                            final Throwable value;
                            return (T)value;
                        }
                        finally {
                            final Throwable value;
                            throw new StartupException(value);
                        }
                    }
                    final Throwable value = this.a.get(clazz);
                    return (T)value;
                }
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", clazz.getName()));
            }
            finally {
                Trace.endSection();
            }
        }
    }
}
