import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fg3
{
    public static Method a;
    public static Method b;
    public static boolean c;
    
    @SuppressLint({ "SoonBlockedPrivateApi" })
    public static void a(final Canvas ex, final boolean b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            if (b) {
                ((Canvas)ex).enableZ();
                goto Label_0152;
            }
            ((Canvas)ex).disableZ();
            goto Label_0152;
        }
        else {
            if (sdk_INT == 28) {
                goto Label_0153;
            }
            Label_0086: {
                if (fg3.c) {
                    break Label_0086;
                }
                try {
                    (fg3.a = Canvas.class.getDeclaredMethod("insertReorderBarrier", (Class<?>[])new Class[0])).setAccessible(true);
                    (fg3.b = Canvas.class.getDeclaredMethod("insertInorderBarrier", (Class<?>[])new Class[0])).setAccessible(true);
                    fg3.c = true;
                    if (!b) {
                        goto Label_0115;
                    }
                    try {
                        final Method a = fg3.a;
                        if (a != null) {
                            a.invoke(ex, new Object[0]);
                            goto Label_0115;
                        }
                        goto Label_0115;
                    }
                    catch (final InvocationTargetException ex) {}
                    catch (final IllegalAccessException ex) {}
                }
                catch (final NoSuchMethodException ex2) {}
            }
        }
    }
}
