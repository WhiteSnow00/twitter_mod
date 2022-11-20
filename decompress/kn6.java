import android.view.WindowManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.app.WallpaperManager;
import android.os.Vibrator;
import android.hardware.usb.UsbManager;
import android.app.UiModeManager;
import android.view.textservice.TextServicesManager;
import android.telephony.TelephonyManager;
import android.os.storage.StorageManager;
import android.hardware.SensorManager;
import android.app.SearchManager;
import android.os.PowerManager;
import android.app.NotificationManager;
import android.nfc.NfcManager;
import android.location.LocationManager;
import android.view.LayoutInflater;
import android.app.KeyguardManager;
import android.view.inputmethod.InputMethodManager;
import android.os.DropBoxManager;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.net.ConnectivityManager;
import android.content.ClipboardManager;
import android.media.AudioManager;
import android.app.AlarmManager;
import android.app.ActivityManager;
import android.accounts.AccountManager;
import android.view.accessibility.AccessibilityManager;
import android.net.nsd.NsdManager;
import android.media.MediaRouter;
import android.hardware.input.InputManager;
import android.os.UserManager;
import android.hardware.display.DisplayManager;
import android.bluetooth.BluetoothManager;
import android.print.PrintManager;
import android.hardware.ConsumerIrManager;
import android.view.accessibility.CaptioningManager;
import android.app.AppOpsManager;
import android.media.tv.TvInputManager;
import android.telecom.TelecomManager;
import android.content.RestrictionsManager;
import android.media.session.MediaSessionManager;
import android.media.projection.MediaProjectionManager;
import android.content.pm.LauncherApps;
import android.app.job.JobScheduler;
import android.hardware.camera2.CameraManager;
import android.os.BatteryManager;
import android.appwidget.AppWidgetManager;
import android.app.usage.UsageStatsManager;
import android.telephony.SubscriptionManager;
import java.util.HashMap;
import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import java.io.File;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.Process;
import java.util.Objects;
import android.content.Context;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "PrivateConstructorForUtilityClass" })
public class kn6
{
    public static final Object a;
    public static final Object b;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static int a(final Context context, final String s) {
        Objects.requireNonNull(s, "permission must be non-null");
        return context.checkPermission(s, Process.myPid(), Process.myUid());
    }
    
    public static int b(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return d.a(context, n);
        }
        return context.getResources().getColor(n);
    }
    
    public static <T> T c(final Context context, final Class<T> clazz) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            return d.b(context, clazz);
        }
        String c;
        if (sdk_INT >= 23) {
            c = d.c(context, clazz);
        }
        else {
            c = g.a.get(clazz);
        }
        Object systemService;
        if (c != null) {
            systemService = context.getSystemService(c);
        }
        else {
            systemService = null;
        }
        return (T)systemService;
    }
    
    public static void d(final Context context, final Intent intent) {
        if (Build$VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        }
        else {
            context.startService(intent);
        }
    }
    
    public static final class a
    {
        public static void a(final Context context, final Intent[] array, final Bundle bundle) {
            context.startActivities(array, bundle);
        }
        
        public static void b(final Context context, final Intent intent, final Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }
    
    public static final class b
    {
        public static File[] a(final Context context) {
            return context.getExternalCacheDirs();
        }
        
        public static File[] b(final Context context, final String s) {
            return context.getExternalFilesDirs(s);
        }
        
        public static File[] c(final Context context) {
            return context.getObbDirs();
        }
    }
    
    public static final class c
    {
        public static File a(final Context context) {
            return context.getCodeCacheDir();
        }
        
        public static Drawable b(final Context context, final int n) {
            return context.getDrawable(n);
        }
        
        public static File c(final Context context) {
            return context.getNoBackupFilesDir();
        }
    }
    
    public static final class d
    {
        public static int a(final Context context, final int n) {
            return context.getColor(n);
        }
        
        public static <T> T b(final Context context, final Class<T> clazz) {
            return (T)context.getSystemService((Class)clazz);
        }
        
        public static String c(final Context context, final Class<?> clazz) {
            return context.getSystemServiceName((Class)clazz);
        }
    }
    
    public static final class e
    {
        public static Context a(final Context context) {
            return context.createDeviceProtectedStorageContext();
        }
        
        public static File b(final Context context) {
            return context.getDataDir();
        }
        
        public static boolean c(final Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
    
    public static final class f
    {
        public static ComponentName a(final Context context, final Intent intent) {
            return context.startForegroundService(intent);
        }
    }
    
    public static final class g
    {
        public static final HashMap<Class<?>, String> a;
        
        static {
            final HashMap<Class<?>, String> hashMap = a = new HashMap<Class<?>, String>();
            if (Build$VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }
}
