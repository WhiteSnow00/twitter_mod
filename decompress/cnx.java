import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.webkit.WebView;
import android.os.Build$VERSION;
import java.lang.reflect.InvocationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnx
{
    public static InvocationHandler a() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        Label_0050: {
            if (Build$VERSION.SDK_INT >= 28) {
                final ClassLoader classLoader = WebView.getWebViewClassLoader();
                break Label_0050;
            }
            try {
                final Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class<?>[])new Class[0]);
                declaredMethod.setAccessible(true);
                final ClassLoader classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
                return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
            }
            catch (final IllegalAccessException ex) {
                throw new RuntimeException(ex);
            }
            catch (final InvocationTargetException ex2) {
                throw new RuntimeException(ex2);
            }
            catch (final NoSuchMethodException ex3) {
                throw new RuntimeException(ex3);
            }
        }
    }
    
    public static final class a
    {
        public static final s5r a;
        
        static {
            a = new s5r(b.a.getWebkitToCompatConverter(), 2);
        }
    }
    
    public static final class b
    {
        public static final gnx a;
        
        static {
            try {
                final Object o = new v4j(wa2.e((Class)WebViewProviderFactoryBoundaryInterface.class, cnx.a()));
                goto Label_0043;
            }
            catch (final NoSuchMethodException ex) {
                throw new RuntimeException(ex);
            }
            catch (final ClassNotFoundException ex2) {
                final Object o = new omy();
            }
            catch (final InvocationTargetException ex3) {
                throw new RuntimeException(ex3);
            }
            catch (final IllegalAccessException ex4) {
                throw new RuntimeException(ex4);
            }
        }
    }
}
