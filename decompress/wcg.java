import java.lang.reflect.Field;
import android.support.v4.media.session.MediaSessionCompat$c;
import android.media.session.MediaSession$Callback;
import android.util.Log;
import android.os.Handler;
import org.json.JSONObject;
import java.util.Iterator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.media.session.MediaSessionCompat$g;
import android.support.v4.media.session.MediaSessionCompat;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import android.content.Context;
import com.google.android.exoplayer2.source.p;

// 
// Decompiled by Procyon v0.6.0
// 

public class wcg implements p, wqy
{
    public Object C0 = qya.b("com.crashlytics.settings.json");
    
    public wcg(final int n) {
        if (n != 8) {
            this.C0 = new phy();
            return;
        }
        this.C0 = new rsd(-1);
    }
    
    public wcg(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        final String packageName = context.getPackageName();
        int n;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 201326592;
        }
        else {
            n = 134217728;
        }
        PendingIntent activity = null;
        Label_0061: {
            if (packageManager != null) {
                final Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage != null) {
                    activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, n);
                    break Label_0061;
                }
            }
            activity = null;
        }
        final MediaSessionCompat c0 = new MediaSessionCompat(context);
        c0.a.a.setSessionActivity(activity);
        c0.a.a.setActive(true);
        final Iterator iterator = c0.b.iterator();
        while (iterator.hasNext()) {
            ((MediaSessionCompat$g)iterator.next()).a();
        }
        this.C0 = c0;
    }
    
    public final long b() {
        final p[] array = (p[])this.C0;
        final int length = array.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long b = array[i].b();
            long min = n;
            if (b != Long.MIN_VALUE) {
                min = Math.min(n, b);
            }
            ++i;
            n = min;
        }
        long n2 = n;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MIN_VALUE;
        }
        return n2;
    }
    
    public final boolean c() {
        final p[] array = (p[])this.C0;
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].c()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean d(final long n) {
        boolean b = false;
        int i;
        boolean b5;
        do {
            final long b2 = this.b();
            if (b2 == Long.MIN_VALUE) {
                return b;
            }
            final p[] array = (p[])this.C0;
            final int length = array.length;
            int j = 0;
            i = 0;
            while (j < length) {
                final p p = array[j];
                final long b3 = p.b();
                final boolean b4 = b3 != Long.MIN_VALUE && b3 <= n;
                int n2 = 0;
                Label_0118: {
                    if (b3 != b2) {
                        n2 = i;
                        if (!b4) {
                            break Label_0118;
                        }
                    }
                    n2 = (i | (p.d(n) ? 1 : 0));
                }
                ++j;
                i = n2;
            }
            b5 = (b |= (i != 0));
        } while (i != 0);
        b = b5;
        return b;
    }
    
    public final long e() {
        final p[] array = (p[])this.C0;
        final int length = array.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long e = array[i].e();
            long min = n;
            if (e != Long.MIN_VALUE) {
                min = Math.min(n, e);
            }
            ++i;
            n = min;
        }
        long n2 = n;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MIN_VALUE;
        }
        return n2;
    }
    
    public final void f(final long n) {
        final p[] array = (p[])this.C0;
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].f(n);
        }
    }
    
    public final void i(final String s, final String s2, final int n) {
        ((rsd)this.C0).a(s, s2, n);
    }
    
    public final void m(final String s, final int n) {
        this.n(p5w.b, s, n);
    }
    
    public final void n(final Iterable iterable, final String s, final int n) {
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((rsd)this.C0).a((String)iterator.next(), s, n);
        }
    }
    
    public final void o() {
        ((phy)this.C0).a.z((Object)null);
    }
    
    public final JSONObject q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: iconst_3       
        //     3: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //     6: istore_1       
        //     7: iconst_0       
        //     8: istore_2       
        //     9: iload_1        
        //    10: ifeq            18
        //    13: iconst_1       
        //    14: istore_3       
        //    15: goto            20
        //    18: iconst_0       
        //    19: istore_3       
        //    20: aconst_null    
        //    21: astore          4
        //    23: aconst_null    
        //    24: astore          5
        //    26: aconst_null    
        //    27: astore          6
        //    29: iload_3        
        //    30: ifeq            42
        //    33: ldc             "FirebaseCrashlytics"
        //    35: ldc             "Checking for cached settings..."
        //    37: aconst_null    
        //    38: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    41: pop            
        //    42: aload_0        
        //    43: getfield        wcg.C0:Ljava/lang/Object;
        //    46: checkcast       Ljava/io/File;
        //    49: astore          7
        //    51: aload           7
        //    53: invokevirtual   java/io/File.exists:()Z
        //    56: ifeq            118
        //    59: new             Ljava/io/FileInputStream;
        //    62: astore          6
        //    64: aload           6
        //    66: aload           7
        //    68: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    71: aload           6
        //    73: astore          5
        //    75: aload           6
        //    77: invokestatic    wx4.n:(Ljava/io/InputStream;)Ljava/lang/String;
        //    80: astore          8
        //    82: aload           6
        //    84: astore          5
        //    86: new             Lorg/json/JSONObject;
        //    89: astore          7
        //    91: aload           6
        //    93: astore          5
        //    95: aload           7
        //    97: aload           8
        //    99: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   102: aload           6
        //   104: astore          5
        //   106: aload           7
        //   108: astore          6
        //   110: goto            155
        //   113: astore          7
        //   115: goto            175
        //   118: iload_2        
        //   119: istore_3       
        //   120: ldc             "FirebaseCrashlytics"
        //   122: iconst_2       
        //   123: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   126: ifeq            131
        //   129: iconst_1       
        //   130: istore_3       
        //   131: iload_3        
        //   132: ifeq            144
        //   135: ldc             "FirebaseCrashlytics"
        //   137: ldc             "Settings file does not exist."
        //   139: aconst_null    
        //   140: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   143: pop            
        //   144: aconst_null    
        //   145: astore          7
        //   147: aload           6
        //   149: astore          5
        //   151: aload           7
        //   153: astore          6
        //   155: aload           5
        //   157: ldc             "Error while closing settings cache file."
        //   159: invokestatic    wx4.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   162: goto            200
        //   165: astore          6
        //   167: goto            205
        //   170: astore          7
        //   172: aconst_null    
        //   173: astore          6
        //   175: aload           6
        //   177: astore          5
        //   179: ldc             "FirebaseCrashlytics"
        //   181: ldc             "Failed to fetch cached settings"
        //   183: aload           7
        //   185: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   188: pop            
        //   189: aload           6
        //   191: ldc             "Error while closing settings cache file."
        //   193: invokestatic    wx4.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   196: aload           4
        //   198: astore          6
        //   200: aload           6
        //   202: areturn        
        //   203: astore          6
        //   205: aload           5
        //   207: ldc             "Error while closing settings cache file."
        //   209: invokestatic    wx4.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   212: aload           6
        //   214: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  42     71     170    175    Ljava/lang/Exception;
        //  42     71     165    170    Any
        //  75     82     113    118    Ljava/lang/Exception;
        //  75     82     203    205    Any
        //  86     91     113    118    Ljava/lang/Exception;
        //  86     91     203    205    Any
        //  95     102    113    118    Ljava/lang/Exception;
        //  95     102    203    205    Any
        //  120    129    170    175    Ljava/lang/Exception;
        //  120    129    165    170    Any
        //  135    144    170    175    Ljava/lang/Exception;
        //  135    144    165    170    Any
        //  179    189    203    205    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public final void s() {
        final MediaSessionCompat$c a = ((MediaSessionCompat)this.C0).a;
        a.e = true;
        a.f.kill();
        if (Build$VERSION.SDK_INT == 27) {
            try {
                final Field declaredField = a.a.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                final Handler handler = (Handler)declaredField.get(a.a);
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object)null);
                }
            }
            catch (final Exception ex) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", (Throwable)ex);
            }
        }
        a.a.setCallback((MediaSession$Callback)null);
        a.a.release();
    }
}
