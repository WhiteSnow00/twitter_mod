import android.os.IBinder;
import android.content.ComponentName;
import android.os.DeadObjectException;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkz implements ServiceConnection, a, b
{
    public volatile boolean C0;
    public volatile r0z D0;
    public final /* synthetic */ skz E0;
    
    public pkz(final skz e0) {
        this.E0 = e0;
    }
    
    public final void b() {
        xd.p("MeasurementServiceConnection.onConnected");
        monitorenter(this);
        try {
            try {
                xd.t((Object)this.D0);
                ((abz)this.E0).C0.a().q((Runnable)new t2y((Object)this, (Object)((fm1<szy>)this.D0).D(), 5, (w48)null));
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
        catch (final DeadObjectException | IllegalStateException ex) {}
    }
    
    public final void onServiceConnected(final ComponentName p0, final IBinder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    xd.p:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_2        
        //     8: ifnonnull       41
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        pkz.C0:Z
        //    16: aload_0        
        //    17: getfield        pkz.E0:Lskz;
        //    20: getfield        abz.C0:Ly7z;
        //    23: invokevirtual   y7z.b:()Lb2z;
        //    26: getfield        b2z.H0:Lx0z;
        //    29: ldc             "Service connected with null binder"
        //    31: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //    34: aload_0        
        //    35: monitorexit    
        //    36: return         
        //    37: astore_1       
        //    38: goto            223
        //    41: aload_2        
        //    42: invokeinterface android/os/IBinder.getInterfaceDescriptor:()Ljava/lang/String;
        //    47: astore_1       
        //    48: ldc             "com.google.android.gms.measurement.internal.IMeasurementService"
        //    50: aload_1        
        //    51: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    54: ifeq            111
        //    57: aload_2        
        //    58: ldc             "com.google.android.gms.measurement.internal.IMeasurementService"
        //    60: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    65: astore_1       
        //    66: aload_1        
        //    67: instanceof      Lszy;
        //    70: ifeq            81
        //    73: aload_1        
        //    74: checkcast       Lszy;
        //    77: astore_1       
        //    78: goto            90
        //    81: new             Ljzy;
        //    84: dup            
        //    85: aload_2        
        //    86: invokespecial   jzy.<init>:(Landroid/os/IBinder;)V
        //    89: astore_1       
        //    90: aload_0        
        //    91: getfield        pkz.E0:Lskz;
        //    94: getfield        abz.C0:Ly7z;
        //    97: invokevirtual   y7z.b:()Lb2z;
        //   100: getfield        b2z.P0:Lx0z;
        //   103: ldc             "Bound to IMeasurementService interface"
        //   105: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //   108: goto            156
        //   111: aload_0        
        //   112: getfield        pkz.E0:Lskz;
        //   115: getfield        abz.C0:Ly7z;
        //   118: invokevirtual   y7z.b:()Lb2z;
        //   121: getfield        b2z.H0:Lx0z;
        //   124: ldc             "Got binder with a wrong descriptor"
        //   126: aload_1        
        //   127: invokevirtual   x0z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   130: aconst_null    
        //   131: astore_1       
        //   132: goto            156
        //   135: astore_1       
        //   136: aconst_null    
        //   137: astore_1       
        //   138: aload_0        
        //   139: getfield        pkz.E0:Lskz;
        //   142: getfield        abz.C0:Ly7z;
        //   145: invokevirtual   y7z.b:()Lb2z;
        //   148: getfield        b2z.H0:Lx0z;
        //   151: ldc             "Service connect failed to get IMeasurementService"
        //   153: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //   156: aload_1        
        //   157: ifnonnull       192
        //   160: aload_0        
        //   161: iconst_0       
        //   162: putfield        pkz.C0:Z
        //   165: invokestatic    sh6.b:()Lsh6;
        //   168: astore_2       
        //   169: aload_0        
        //   170: getfield        pkz.E0:Lskz;
        //   173: astore_1       
        //   174: aload_2        
        //   175: aload_1        
        //   176: getfield        abz.C0:Ly7z;
        //   179: getfield        y7z.C0:Landroid/content/Context;
        //   182: aload_1        
        //   183: getfield        skz.E0:Lpkz;
        //   186: invokevirtual   sh6.c:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //   189: goto            220
        //   192: aload_0        
        //   193: getfield        pkz.E0:Lskz;
        //   196: getfield        abz.C0:Ly7z;
        //   199: invokevirtual   y7z.a:()Lo7z;
        //   202: astore_2       
        //   203: new             Ltzz;
        //   206: astore_3       
        //   207: aload_3        
        //   208: aload_0        
        //   209: aload_1        
        //   210: iconst_4       
        //   211: aconst_null    
        //   212: invokespecial   tzz.<init>:(Ljava/lang/Object;Ljava/lang/Object;ILw48;)V
        //   215: aload_2        
        //   216: aload_3        
        //   217: invokevirtual   o7z.q:(Ljava/lang/Runnable;)V
        //   220: aload_0        
        //   221: monitorexit    
        //   222: return         
        //   223: aload_0        
        //   224: monitorexit    
        //   225: aload_1        
        //   226: athrow         
        //   227: astore_2       
        //   228: goto            138
        //   231: astore_1       
        //   232: goto            220
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     36     37     227    Any
        //  41     78     135    138    Landroid/os/RemoteException;
        //  41     78     37     227    Any
        //  81     90     135    138    Landroid/os/RemoteException;
        //  81     90     37     227    Any
        //  90     108    227    231    Landroid/os/RemoteException;
        //  90     108    37     227    Any
        //  111    130    135    138    Landroid/os/RemoteException;
        //  111    130    37     227    Any
        //  138    156    37     227    Any
        //  160    165    37     227    Any
        //  165    189    231    235    Ljava/lang/IllegalArgumentException;
        //  165    189    37     227    Any
        //  192    220    37     227    Any
        //  220    222    37     227    Any
        //  223    225    37     227    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        xd.p("MeasurementServiceConnection.onServiceDisconnected");
        ((abz)this.E0).C0.b().O0.a("Service disconnected");
        ((abz)this.E0).C0.a().q((Runnable)new p2y((Object)this, (Object)componentName, 2, (w48)null));
    }
    
    public final void s(final ph6 ph6) {
        xd.p("MeasurementServiceConnection.onConnectionFailed");
        b2z k0 = ((abz)this.E0).C0.K0;
        if (k0 == null || !((dbz)k0).m()) {
            k0 = null;
        }
        if (k0 != null) {
            k0.K0.b("Service connection failed", (Object)ph6);
        }
        synchronized (this) {
            this.C0 = false;
            this.D0 = null;
            monitorexit(this);
            ((abz)this.E0).C0.a().q(new maz(this, 1));
        }
    }
    
    public final void x(final int n) {
        xd.p("MeasurementServiceConnection.onConnectionSuspended");
        ((abz)this.E0).C0.b().O0.a("Service connection suspended");
        ((abz)this.E0).C0.a().q((Runnable)new b6z((Object)this, 3));
    }
}
