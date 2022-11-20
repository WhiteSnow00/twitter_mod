// 
// Decompiled by Procyon v0.6.0
// 

package androidx.savedstate;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.lifecycle.d$b;
import kotlin.Metadata;
import androidx.lifecycle.e;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005" }, d2 = { "Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/e;", "Companion", "a", "b", "savedstate_release" }, k = 1, mv = { 1, 6, 0 })
public final class Recreator implements e
{
    public static final a Companion;
    public final pto D0;
    
    static {
        Companion = new a();
    }
    
    public Recreator(final pto d0) {
        czd.f((Object)d0, "owner");
        this.D0 = d0;
    }
    
    public final void f(xaf ex, d$b subclass) {
        if (subclass != d$b.ON_CREATE) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        ((xaf)ex).b().c((waf)this);
        final Bundle a = this.D0.A().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final Iterator iterator = stringArrayList.iterator();
            while (iterator.hasNext()) {
                ex = (NoSuchMethodException)iterator.next();
                try {
                    subclass = (Exception)Class.forName((String)ex, false, Recreator.class.getClassLoader()).asSubclass(nto.a.class);
                    czd.e((Object)subclass, "{\n                Class.\u2026class.java)\n            }");
                    try {
                        final Constructor<Object> declaredConstructor = ((Class<Object>)subclass).getDeclaredConstructor((Class<?>[])new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            final Object instance = declaredConstructor.newInstance(new Object[0]);
                            czd.e(instance, "{\n                constr\u2026wInstance()\n            }");
                            ((nto.a)instance).a(this.D0);
                        }
                        catch (final Exception subclass) {
                            throw new RuntimeException(hmg.h("Failed to instantiate ", (String)ex), subclass);
                        }
                    }
                    catch (final NoSuchMethodException ex) {
                        final StringBuilder j = fu8.j("Class ");
                        j.append(((Class)subclass).getSimpleName());
                        j.append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(j.toString(), ex);
                    }
                }
                catch (final ClassNotFoundException ex2) {
                    throw new RuntimeException(da8.j("Class ", (String)ex, " wasn't found"), ex2);
                }
                break;
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
    
    public static final class a
    {
    }
}
