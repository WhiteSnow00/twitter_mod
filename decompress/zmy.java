import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import android.annotation.TargetApi;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(24)
public final class zmy
{
    public static final Method a;
    public static final Method b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Method method = null;
        Method declaredMethod = null;
        Label_0069: {
            if (sdk_INT >= 24) {
                try {
                    declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
                    break Label_0069;
                }
                catch (final NoSuchMethodException ex) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                    }
                }
            }
            declaredMethod = null;
        }
        a = declaredMethod;
        Method declaredMethod2 = method;
        if (Build$VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", (Class<?>[])new Class[0]);
            }
            catch (final NoSuchMethodException ex2) {
                declaredMethod2 = method;
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                    declaredMethod2 = method;
                }
            }
        }
        b = declaredMethod2;
    }
    
    public static int a(Context ex, final JobInfo jobInfo) {
        final JobScheduler jobScheduler = (JobScheduler)((Context)ex).getSystemService("jobscheduler");
        Objects.requireNonNull(jobScheduler);
        if (zmy.a != null && ((Context)ex).checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            ex = (InvocationTargetException)zmy.b;
            final int n = 0;
            int intValue = 0;
            Label_0097: {
                Label_0095: {
                    if (ex != null) {
                        try {
                            ex = (InvocationTargetException)((Method)ex).invoke(UserHandle.class, new Object[0]);
                            if (ex != null) {
                                intValue = (int)ex;
                                break Label_0097;
                            }
                            break Label_0095;
                        }
                        catch (final InvocationTargetException ex) {}
                        catch (final IllegalAccessException ex2) {}
                        if (Log.isLoggable("JobSchedulerCompat", 6)) {
                            Log.e("JobSchedulerCompat", "myUserId invocation illegal", (Throwable)ex);
                        }
                    }
                }
                intValue = 0;
            }
            ex = (InvocationTargetException)zmy.a;
            if (ex != null) {
                try {
                    ex = (InvocationTargetException)((Method)ex).invoke(jobScheduler, jobInfo, "com.google.android.gms", intValue, "UploadAlarm");
                    int n2 = n;
                    if (ex != null) {
                        n2 = (int)ex;
                        return n2;
                    }
                    return n2;
                }
                catch (final InvocationTargetException ex) {}
                catch (final IllegalAccessException ex3) {}
                Log.e("UploadAlarm", "error calling scheduleAsPackage", (Throwable)ex);
            }
            return jobScheduler.schedule(jobInfo);
        }
        return jobScheduler.schedule(jobInfo);
    }
}
