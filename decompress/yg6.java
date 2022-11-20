import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;
import android.content.ServiceConnection;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yg6
{
    public static final Object b;
    public static volatile yg6 c;
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> a;
    
    static {
        b = new Object();
    }
    
    public yg6() {
        this.a = (ConcurrentHashMap<ServiceConnection, ServiceConnection>)new ConcurrentHashMap();
    }
    
    public static yg6 b() {
        if (yg6.c == null) {
            synchronized (yg6.b) {
                if (yg6.c == null) {
                    yg6.c = new yg6();
                }
            }
        }
        final yg6 c = yg6.c;
        eli.q(c);
        return c;
    }
    
    public static final boolean e(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        if (Build$VERSION.SDK_INT >= 29 && executor != null) {
            return context.bindService(intent, n, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, n);
    }
    
    public final boolean a(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        return this.d(context, context.getClass().getName(), intent, serviceConnection, n, null);
    }
    
    public final void c(final Context p0, final ServiceConnection p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Ljtz;
        //     4: iconst_1       
        //     5: ixor           
        //     6: ifeq            59
        //     9: aload_0        
        //    10: getfield        yg6.a:Lj$/util/concurrent/ConcurrentHashMap;
        //    13: aload_2        
        //    14: invokevirtual   j$/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //    17: ifeq            59
        //    20: aload_0        
        //    21: getfield        yg6.a:Lj$/util/concurrent/ConcurrentHashMap;
        //    24: aload_2        
        //    25: invokevirtual   j$/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    28: checkcast       Landroid/content/ServiceConnection;
        //    31: astore_3       
        //    32: aload_1        
        //    33: aload_3        
        //    34: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    37: aload_0        
        //    38: getfield        yg6.a:Lj$/util/concurrent/ConcurrentHashMap;
        //    41: aload_2        
        //    42: invokevirtual   j$/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    45: pop            
        //    46: return         
        //    47: astore_1       
        //    48: aload_0        
        //    49: getfield        yg6.a:Lj$/util/concurrent/ConcurrentHashMap;
        //    52: aload_2        
        //    53: invokevirtual   j$/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    56: pop            
        //    57: aload_1        
        //    58: athrow         
        //    59: aload_1        
        //    60: aload_2        
        //    61: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    64: return         
        //    65: astore_1       
        //    66: goto            37
        //    69: astore_1       
        //    70: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     32     47     59     Any
        //  32     37     65     69     Ljava/lang/IllegalArgumentException;
        //  32     37     65     69     Ljava/lang/IllegalStateException;
        //  32     37     65     69     Ljava/util/NoSuchElementException;
        //  32     37     47     59     Any
        //  59     64     69     73     Ljava/lang/IllegalArgumentException;
        //  59     64     69     73     Ljava/lang/IllegalStateException;
        //  59     64     69     73     Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    public final boolean d(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        final ComponentName component = intent.getComponent();
        if (component != null) {
            final String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((dux.a(context).a(packageName, 0).flags & 0x200000) != 0x0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {}
        }
        if (serviceConnection instanceof jtz ^ true) {
            final ServiceConnection serviceConnection2 = (ServiceConnection)this.a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, s, intent.getAction()));
            }
            try {
                final boolean b = e(context, intent, serviceConnection, n, executor);
                if (b) {
                    return b;
                }
                return false;
            }
            finally {
                this.a.remove((Object)serviceConnection, (Object)serviceConnection);
            }
        }
        return e(context, intent, serviceConnection, n, executor);
    }
}
