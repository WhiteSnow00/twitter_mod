import java.util.concurrent.TimeUnit;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.Build$VERSION;
import android.util.Log;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtt implements Runnable
{
    public static final Object H0;
    public static Boolean I0;
    public static Boolean J0;
    public final Context C0;
    public final y8h D0;
    public final PowerManager$WakeLock E0;
    public final itt F0;
    public final long G0;
    
    static {
        H0 = new Object();
    }
    
    public jtt(final itt f0, final Context c0, final y8h d0, final long g0) {
        this.F0 = f0;
        this.C0 = c0;
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = ((PowerManager)c0.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
    
    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
    
    public static boolean b(final Context context) {
        synchronized (jtt.H0) {
            final Boolean j0 = jtt.J0;
            boolean b;
            if (j0 == null) {
                b = c(context, "android.permission.ACCESS_NETWORK_STATE", j0);
            }
            else {
                b = j0;
            }
            return jtt.J0 = b;
        }
    }
    
    public static boolean c(final Context context, final String s, final Boolean b) {
        if (b != null) {
            return b;
        }
        final boolean b2 = context.checkCallingOrSelfPermission(s) == 0;
        if (!b2 && Log.isLoggable("FirebaseMessaging", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Missing Permission: ");
            sb.append(s);
            sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            Log.d("FirebaseMessaging", sb.toString());
        }
        return b2;
    }
    
    public static boolean d(final Context context) {
        synchronized (jtt.H0) {
            final Boolean i0 = jtt.I0;
            boolean b;
            if (i0 == null) {
                b = c(context, "android.permission.WAKE_LOCK", i0);
            }
            else {
                b = i0;
            }
            return jtt.I0 = b;
        }
    }
    
    public final boolean e() {
        synchronized (this) {
            final ConnectivityManager connectivityManager = (ConnectivityManager)this.C0.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo;
            if (connectivityManager != null) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            else {
                activeNetworkInfo = null;
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
    }
    
    @SuppressLint({ "Wakelock" })
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jtt.C0:Landroid/content/Context;
        //     4: invokestatic    jtt.d:(Landroid/content/Context;)Z
        //     7: ifeq            20
        //    10: aload_0        
        //    11: getfield        jtt.E0:Landroid/os/PowerManager$WakeLock;
        //    14: getstatic       ui6.a:J
        //    17: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    20: aload_0        
        //    21: getfield        jtt.F0:Litt;
        //    24: iconst_1       
        //    25: invokevirtual   itt.e:(Z)V
        //    28: aload_0        
        //    29: getfield        jtt.D0:Ly8h;
        //    32: invokevirtual   y8h.d:()Z
        //    35: ifne            76
        //    38: aload_0        
        //    39: getfield        jtt.F0:Litt;
        //    42: iconst_0       
        //    43: invokevirtual   itt.e:(Z)V
        //    46: aload_0        
        //    47: getfield        jtt.C0:Landroid/content/Context;
        //    50: invokestatic    jtt.d:(Landroid/content/Context;)Z
        //    53: ifeq            75
        //    56: aload_0        
        //    57: getfield        jtt.E0:Landroid/os/PowerManager$WakeLock;
        //    60: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    63: goto            75
        //    66: astore_1       
        //    67: ldc             "FirebaseMessaging"
        //    69: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //    71: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    74: pop            
        //    75: return         
        //    76: aload_0        
        //    77: getfield        jtt.C0:Landroid/content/Context;
        //    80: invokestatic    jtt.b:(Landroid/content/Context;)Z
        //    83: ifeq            137
        //    86: aload_0        
        //    87: invokevirtual   jtt.e:()Z
        //    90: ifne            137
        //    93: new             Ljtt$a;
        //    96: astore_1       
        //    97: aload_1        
        //    98: aload_0        
        //    99: aload_0        
        //   100: invokespecial   jtt$a.<init>:(Ljtt;Ljtt;)V
        //   103: aload_1        
        //   104: invokevirtual   jtt$a.a:()V
        //   107: aload_0        
        //   108: getfield        jtt.C0:Landroid/content/Context;
        //   111: invokestatic    jtt.d:(Landroid/content/Context;)Z
        //   114: ifeq            136
        //   117: aload_0        
        //   118: getfield        jtt.E0:Landroid/os/PowerManager$WakeLock;
        //   121: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   124: goto            136
        //   127: astore_1       
        //   128: ldc             "FirebaseMessaging"
        //   130: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   132: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   135: pop            
        //   136: return         
        //   137: aload_0        
        //   138: getfield        jtt.F0:Litt;
        //   141: invokevirtual   itt.f:()Z
        //   144: ifeq            158
        //   147: aload_0        
        //   148: getfield        jtt.F0:Litt;
        //   151: iconst_0       
        //   152: invokevirtual   itt.e:(Z)V
        //   155: goto            169
        //   158: aload_0        
        //   159: getfield        jtt.F0:Litt;
        //   162: aload_0        
        //   163: getfield        jtt.G0:J
        //   166: invokevirtual   itt.g:(J)V
        //   169: aload_0        
        //   170: getfield        jtt.C0:Landroid/content/Context;
        //   173: invokestatic    jtt.d:(Landroid/content/Context;)Z
        //   176: ifeq            265
        //   179: aload_0        
        //   180: getfield        jtt.E0:Landroid/os/PowerManager$WakeLock;
        //   183: astore_1       
        //   184: goto            249
        //   187: astore_2       
        //   188: goto            266
        //   191: astore_1       
        //   192: new             Ljava/lang/StringBuilder;
        //   195: astore_2       
        //   196: aload_2        
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: aload_2        
        //   201: ldc             "Failed to sync topics. Won't retry sync. "
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: pop            
        //   207: aload_2        
        //   208: aload_1        
        //   209: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: pop            
        //   216: ldc             "FirebaseMessaging"
        //   218: aload_2        
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   225: pop            
        //   226: aload_0        
        //   227: getfield        jtt.F0:Litt;
        //   230: iconst_0       
        //   231: invokevirtual   itt.e:(Z)V
        //   234: aload_0        
        //   235: getfield        jtt.C0:Landroid/content/Context;
        //   238: invokestatic    jtt.d:(Landroid/content/Context;)Z
        //   241: ifeq            265
        //   244: aload_0        
        //   245: getfield        jtt.E0:Landroid/os/PowerManager$WakeLock;
        //   248: astore_1       
        //   249: aload_1        
        //   250: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   253: goto            265
        //   256: astore_1       
        //   257: ldc             "FirebaseMessaging"
        //   259: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   261: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   264: pop            
        //   265: return         
        //   266: aload_0        
        //   267: getfield        jtt.C0:Landroid/content/Context;
        //   270: invokestatic    jtt.d:(Landroid/content/Context;)Z
        //   273: ifeq            295
        //   276: aload_0        
        //   277: getfield        jtt.E0:Landroid/os/PowerManager$WakeLock;
        //   280: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   283: goto            295
        //   286: astore_1       
        //   287: ldc             "FirebaseMessaging"
        //   289: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   291: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   294: pop            
        //   295: aload_2        
        //   296: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     46     191    249    Ljava/io/IOException;
        //  20     46     187    297    Any
        //  56     63     66     75     Ljava/lang/RuntimeException;
        //  76     107    191    249    Ljava/io/IOException;
        //  76     107    187    297    Any
        //  117    124    127    136    Ljava/lang/RuntimeException;
        //  137    155    191    249    Ljava/io/IOException;
        //  137    155    187    297    Any
        //  158    169    191    249    Ljava/io/IOException;
        //  158    169    187    297    Any
        //  179    184    256    265    Ljava/lang/RuntimeException;
        //  192    234    187    297    Any
        //  244    249    256    265    Ljava/lang/RuntimeException;
        //  249    253    256    265    Ljava/lang/RuntimeException;
        //  276    283    286    295    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final class a extends BroadcastReceiver
    {
        public jtt a;
        
        public a(final jtt a) {
            this.a = a;
        }
        
        public final void a() {
            if (jtt.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            jtt.this.C0.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public final void onReceive(final Context context, final Intent intent) {
            synchronized (this) {
                final jtt a = this.a;
                if (a == null) {
                    return;
                }
                if (!a.e()) {
                    return;
                }
                if (jtt.a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                final jtt a2 = this.a;
                a2.F0.f.schedule(a2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver((BroadcastReceiver)this);
                this.a = null;
            }
        }
    }
}
