import java.util.WeakHashMap;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcx
{
    public static Method a;
    
    static {
        try {
            if (!(rcx.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                rcx.a.setAccessible(true);
            }
        }
        catch (final NoSuchMethodException ex) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
    
    public static void a(final View view, final Rect rect, final Rect rect2) {
        final Method a = rcx.a;
        if (a != null) {
            try {
                a.invoke(view, rect, rect2);
            }
            catch (final Exception ex) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)ex);
            }
        }
    }
    
    public static boolean b(final View view) {
        final WeakHashMap a = j6x.a;
        final int d = j6x$e.d(view);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        return b;
    }
}
