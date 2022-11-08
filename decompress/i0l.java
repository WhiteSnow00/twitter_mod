import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Method;
import java.io.Serializable;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.os.Build$VERSION;
import androidx.work.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i0l
{
    public static final String a;
    
    static {
        final String g = y9g.g("ProcessUtils");
        zzd.e((Object)g, "tagWithPrefix(\"ProcessUtils\")");
        a = g;
    }
    
    public static final boolean a(final Context context, final a a) {
        zzd.f((Object)context, "context");
        zzd.f((Object)a, "configuration");
        Serializable s = null;
        if (Build$VERSION.SDK_INT >= 28) {
            s = me0.a.a();
        }
        else {
            final Throwable t = null;
            try {
                final Method declaredMethod = Class.forName("android.app.ActivityThread", false, brx.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class<?>[])new Class[0]);
                declaredMethod.setAccessible(true);
                final Object invoke = declaredMethod.invoke(null, new Object[0]);
                zzd.c(invoke);
                if (invoke instanceof String) {
                    final String s2 = (String)invoke;
                    return zzd.a((Object)s, (Object)context.getApplicationInfo().processName);
                }
            }
            finally {
                y9g.e().b(i0l.a, "Unable to check ActivityThread for processName", (Throwable)s);
            }
            final int myPid = Process.myPid();
            final Object systemService = context.getSystemService("activity");
            zzd.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            final List runningAppProcesses = ((ActivityManager)systemService).getRunningAppProcesses();
            s = t;
            if (runningAppProcesses != null) {
                while (true) {
                    for (final Object next : runningAppProcesses) {
                        if (((ActivityManager$RunningAppProcessInfo)next).pid == myPid) {
                            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = (ActivityManager$RunningAppProcessInfo)next;
                            s = t;
                            if (activityManager$RunningAppProcessInfo != null) {
                                s = activityManager$RunningAppProcessInfo.processName;
                                return zzd.a((Object)s, (Object)context.getApplicationInfo().processName);
                            }
                            return zzd.a((Object)s, (Object)context.getApplicationInfo().processName);
                        }
                    }
                    Object next = null;
                    continue;
                }
            }
        }
        return zzd.a((Object)s, (Object)context.getApplicationInfo().processName);
    }
}
