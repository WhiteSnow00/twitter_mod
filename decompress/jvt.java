import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvt
{
    public static long a;
    public static Method b;
    
    public static boolean a() {
        if (Build$VERSION.SDK_INT >= 29) {
            return kvt.a();
        }
        final boolean b = false;
        boolean booleanValue;
        try {
            if (jvt.b == null) {
                jvt.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                jvt.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            booleanValue = (boolean)jvt.b.invoke(null, jvt.a);
        }
        catch (final Exception ex) {
            if (ex instanceof InvocationTargetException) {
                final Throwable cause = ex.getCause();
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException)cause;
                }
                throw new RuntimeException(cause);
            }
            else {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", (Throwable)ex);
                booleanValue = b;
            }
        }
        return booleanValue;
    }
}
