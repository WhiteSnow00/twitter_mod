import android.util.Log;
import android.content.Context;
import java.util.ArrayDeque;
import android.content.Intent;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ump
{
    public static ump e;
    public String a;
    public Boolean b;
    public Boolean c;
    public final Queue<Intent> d;
    
    public ump() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new ArrayDeque();
    }
    
    public static ump a() {
        synchronized (ump.class) {
            if (ump.e == null) {
                ump.e = new ump();
            }
            return ump.e;
        }
    }
    
    public final boolean b(final Context context) {
        if (this.c == null) {
            this.c = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c;
    }
    
    public final boolean c(final Context context) {
        if (this.b == null) {
            this.b = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }
}
