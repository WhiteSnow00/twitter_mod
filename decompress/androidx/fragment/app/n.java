// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

public class n
{
    public static final l7q<ClassLoader, l7q<String, Class<?>>> a;
    
    static {
        a = new l7q();
    }
    
    public static Class<?> b(final ClassLoader classLoader, final String s) throws ClassNotFoundException {
        final l7q<ClassLoader, l7q<String, Class<?>>> a = n.a;
        l7q l7q;
        if ((l7q = (l7q)a.getOrDefault((Object)classLoader, (Object)null)) == null) {
            l7q = new l7q();
            a.put((Object)classLoader, (Object)l7q);
        }
        Class<?> forName;
        if ((forName = (Class)l7q.getOrDefault((Object)s, (Object)null)) == null) {
            forName = Class.forName(s, false, classLoader);
            l7q.put((Object)s, (Object)forName);
        }
        return forName;
    }
    
    public static Class<? extends Fragment> c(final ClassLoader classLoader, final String s) {
        try {
            return (Class<? extends Fragment>)b(classLoader, s);
        }
        catch (final ClassCastException ex) {
            throw new Fragment.InstantiationException(zi.y("Unable to instantiate fragment ", s, ": make sure class is a valid subclass of Fragment"), ex);
        }
        catch (final ClassNotFoundException ex2) {
            throw new Fragment.InstantiationException(zi.y("Unable to instantiate fragment ", s, ": make sure class name exists"), ex2);
        }
    }
    
    public Fragment a(final ClassLoader classLoader, final String s) {
        throw null;
    }
}
