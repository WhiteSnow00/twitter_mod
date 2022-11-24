import android.content.Context;
import com.openback.receiver.OpenBackReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zud
{
    public static OpenBackReceiver a;
    public static boolean b;
    
    public static void a(final Context p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          26
        //     5: if_icmpge       9
        //     8: return         
        //     9: lload_1        
        //    10: ldc2_w          2
        //    13: lor            
        //    14: lstore_1       
        //    15: getstatic       zud.a:Lcom/openback/receiver/OpenBackReceiver;
        //    18: ifnonnull       31
        //    21: new             Lcom/openback/receiver/OpenBackReceiver;
        //    24: dup            
        //    25: invokespecial   com/openback/receiver/OpenBackReceiver.<init>:()V
        //    28: putstatic       zud.a:Lcom/openback/receiver/OpenBackReceiver;
        //    31: getstatic       zud.b:Z
        //    34: ifeq            48
        //    37: aload_0        
        //    38: getstatic       zud.a:Lcom/openback/receiver/OpenBackReceiver;
        //    41: invokevirtual   android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    44: iconst_0       
        //    45: putstatic       zud.b:Z
        //    48: new             Landroid/content/IntentFilter;
        //    51: astore_3       
        //    52: aload_3        
        //    53: invokespecial   android/content/IntentFilter.<init>:()V
        //    56: lconst_1       
        //    57: lload_1        
        //    58: land           
        //    59: lconst_0       
        //    60: lcmp           
        //    61: ifeq            88
        //    64: aload_3        
        //    65: ldc             "android.intent.action.PACKAGE_REPLACED"
        //    67: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //    70: aload_3        
        //    71: ldc             "android.intent.action.PACKAGE_ADDED"
        //    73: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //    76: aload_3        
        //    77: ldc             "android.intent.action.PACKAGE_REMOVED"
        //    79: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //    82: aload_3        
        //    83: ldc             "android.intent.action.PACKAGE_CHANGED"
        //    85: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //    88: ldc2_w          2
        //    91: lload_1        
        //    92: land           
        //    93: lconst_0       
        //    94: lcmp           
        //    95: ifeq            104
        //    98: aload_3        
        //    99: ldc             "android.intent.action.USER_PRESENT"
        //   101: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   104: ldc2_w          4
        //   107: lload_1        
        //   108: land           
        //   109: lconst_0       
        //   110: lcmp           
        //   111: ifeq            120
        //   114: aload_3        
        //   115: ldc             "android.intent.action.AIRPLANE_MODE"
        //   117: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   120: ldc2_w          8
        //   123: lload_1        
        //   124: land           
        //   125: lconst_0       
        //   126: lcmp           
        //   127: ifeq            142
        //   130: aload_3        
        //   131: ldc             "android.intent.action.ACTION_POWER_CONNECTED"
        //   133: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   136: aload_3        
        //   137: ldc             "android.intent.action.ACTION_POWER_DISCONNECTED"
        //   139: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   142: ldc2_w          16
        //   145: lload_1        
        //   146: land           
        //   147: lconst_0       
        //   148: lcmp           
        //   149: ifeq            158
        //   152: aload_3        
        //   153: ldc             "android.net.wifi.WIFI_STATE_CHANGED"
        //   155: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   158: ldc2_w          32
        //   161: lload_1        
        //   162: land           
        //   163: lconst_0       
        //   164: lcmp           
        //   165: ifeq            174
        //   168: aload_3        
        //   169: ldc             "android.net.conn.CONNECTIVITY_CHANGE"
        //   171: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   174: ldc2_w          128
        //   177: lload_1        
        //   178: land           
        //   179: lconst_0       
        //   180: lcmp           
        //   181: ifeq            190
        //   184: aload_3        
        //   185: ldc             "android.intent.action.CONFIGURATION_CHANGED"
        //   187: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   190: lload_1        
        //   191: ldc2_w          64
        //   194: land           
        //   195: lconst_0       
        //   196: lcmp           
        //   197: ifeq            221
        //   200: aload_3        
        //   201: ldc             "android.intent.action.HEADSET_PLUG"
        //   203: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   206: aload_0        
        //   207: ldc             "android.permission.BLUETOOTH"
        //   209: invokestatic    qo6.a:(Landroid/content/Context;Ljava/lang/String;)I
        //   212: ifne            221
        //   215: aload_3        
        //   216: ldc             "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
        //   218: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   221: aload_3        
        //   222: invokevirtual   android/content/IntentFilter.countActions:()I
        //   225: ifle            241
        //   228: aload_0        
        //   229: getstatic       zud.a:Lcom/openback/receiver/OpenBackReceiver;
        //   232: aload_3        
        //   233: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   236: pop            
        //   237: iconst_1       
        //   238: putstatic       zud.b:Z
        //   241: return         
        //   242: astore_3       
        //   243: goto            48
        //   246: astore_0       
        //   247: goto            241
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     48     242    246    Ljava/lang/Exception;
        //  48     56     246    250    Ljava/lang/Exception;
        //  64     88     246    250    Ljava/lang/Exception;
        //  98     104    246    250    Ljava/lang/Exception;
        //  114    120    246    250    Ljava/lang/Exception;
        //  130    142    246    250    Ljava/lang/Exception;
        //  152    158    246    250    Ljava/lang/Exception;
        //  168    174    246    250    Ljava/lang/Exception;
        //  184    190    246    250    Ljava/lang/Exception;
        //  200    221    246    250    Ljava/lang/Exception;
        //  221    241    246    250    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
}
