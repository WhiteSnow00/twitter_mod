import android.view.View;
import android.content.Context;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "LogConditional" })
public final class ob8
{
    public static String a() {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder f = ehk.f(".(");
        f.append(stackTraceElement.getFileName());
        f.append(":");
        f.append(stackTraceElement.getLineNumber());
        f.append(") ");
        f.append(stackTraceElement.getMethodName());
        f.append("()");
        return f.toString();
    }
    
    public static String b() {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder f = ehk.f(".(");
        f.append(stackTraceElement.getFileName());
        f.append(":");
        f.append(stackTraceElement.getLineNumber());
        f.append(")");
        return f.toString();
    }
    
    public static String c(final Context context, final int n) {
        if (n == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(n);
        }
        catch (final Exception ex) {
            return rk0.B("?", n);
        }
    }
    
    public static String d(final View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        }
        catch (final Exception ex) {
            return "UNKNOWN";
        }
    }
    
    public static String e(final trh trh, final int n) {
        String resourceEntryName;
        if (n == -1) {
            resourceEntryName = "UNDEFINED";
        }
        else {
            resourceEntryName = ((View)trh).getContext().getResources().getResourceEntryName(n);
        }
        return resourceEntryName;
    }
}
