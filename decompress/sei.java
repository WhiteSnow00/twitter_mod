import java.util.Iterator;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.PhoneStateListener;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Looper;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sei
{
    public static sei e;
    public final Handler a;
    public final CopyOnWriteArrayList<WeakReference<a>> b;
    public final Object c;
    public int d;
    
    public sei(final Context context) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList<WeakReference<a>>();
        this.c = new Object();
        this.d = 0;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new b(), intentFilter);
    }
    
    public static void a(final sei sei, final int d) {
        Object o = sei.c;
        synchronized (o) {
            if (sei.d == d) {
                monitorexit(o);
            }
            else {
                sei.d = d;
                monitorexit(o);
                o = sei.b.iterator();
                while (((Iterator)o).hasNext()) {
                    final WeakReference weakReference = (WeakReference)((Iterator)o).next();
                    final a a = (a)weakReference.get();
                    if (a != null) {
                        a.a(d);
                    }
                    else {
                        sei.b.remove(weakReference);
                    }
                }
            }
        }
    }
    
    public interface a
    {
        void a(final int p0);
    }
    
    public final class b extends BroadcastReceiver
    {
        public final sei a;
        
        public b(final sei a) {
            this.a = a;
        }
        
        public final void onReceive(final Context p0, final Intent p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "connectivity"
            //     3: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
            //     6: checkcast       Landroid/net/ConnectivityManager;
            //     9: astore_2       
            //    10: iconst_4       
            //    11: istore_3       
            //    12: aload_2        
            //    13: ifnonnull       19
            //    16: goto            232
            //    19: aload_2        
            //    20: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
            //    23: astore_2       
            //    24: aload_2        
            //    25: ifnull          227
            //    28: aload_2        
            //    29: invokevirtual   android/net/NetworkInfo.isConnected:()Z
            //    32: ifne            38
            //    35: goto            227
            //    38: aload_2        
            //    39: invokevirtual   android/net/NetworkInfo.getType:()I
            //    42: istore          4
            //    44: iload           4
            //    46: ifeq            93
            //    49: iload           4
            //    51: iconst_1       
            //    52: if_icmpeq       212
            //    55: iload           4
            //    57: iconst_4       
            //    58: if_icmpeq       93
            //    61: iload           4
            //    63: iconst_5       
            //    64: if_icmpeq       93
            //    67: iload           4
            //    69: bipush          6
            //    71: if_icmpeq       217
            //    74: iload           4
            //    76: bipush          9
            //    78: if_icmpeq       87
            //    81: bipush          8
            //    83: istore_3       
            //    84: goto            234
            //    87: bipush          7
            //    89: istore_3       
            //    90: goto            234
            //    93: aload_2        
            //    94: invokevirtual   android/net/NetworkInfo.getSubtype:()I
            //    97: tableswitch {
            //                2: 222
            //                3: 222
            //                4: 234
            //                5: 234
            //                6: 234
            //                7: 234
            //                8: 234
            //                9: 234
            //               10: 234
            //               11: 234
            //               12: 234
            //               13: 234
            //               14: 217
            //               15: 234
            //               16: 234
            //               17: 192
            //               18: 234
            //               19: 212
            //               20: 192
            //               21: 198
            //          default: 192
            //        }
            //   192: bipush          6
            //   194: istore_3       
            //   195: goto            234
            //   198: getstatic       rnw.a:I
            //   201: bipush          29
            //   203: if_icmplt       232
            //   206: bipush          9
            //   208: istore_3       
            //   209: goto            234
            //   212: iconst_2       
            //   213: istore_3       
            //   214: goto            234
            //   217: iconst_5       
            //   218: istore_3       
            //   219: goto            234
            //   222: iconst_3       
            //   223: istore_3       
            //   224: goto            234
            //   227: iconst_1       
            //   228: istore_3       
            //   229: goto            234
            //   232: iconst_0       
            //   233: istore_3       
            //   234: getstatic       rnw.a:I
            //   237: istore          4
            //   239: iload           4
            //   241: bipush          29
            //   243: if_icmplt       308
            //   246: iload_3        
            //   247: iconst_5       
            //   248: if_icmpne       308
            //   251: aload_1        
            //   252: ldc             "phone"
            //   254: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
            //   257: checkcast       Landroid/telephony/TelephonyManager;
            //   260: astore_2       
            //   261: aload_2        
            //   262: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
            //   265: pop            
            //   266: new             Lsei$c;
            //   269: astore_1       
            //   270: aload_1        
            //   271: aload_0        
            //   272: getfield        sei$b.a:Lsei;
            //   275: invokespecial   sei$c.<init>:(Lsei;)V
            //   278: iload           4
            //   280: bipush          31
            //   282: if_icmpge       294
            //   285: aload_2        
            //   286: aload_1        
            //   287: iconst_1       
            //   288: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   291: goto            301
            //   294: aload_2        
            //   295: aload_1        
            //   296: ldc             1048576
            //   298: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   301: aload_2        
            //   302: aload_1        
            //   303: iconst_0       
            //   304: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   307: return         
            //   308: aload_0        
            //   309: getfield        sei$b.a:Lsei;
            //   312: iload_3        
            //   313: invokestatic    sei.a:(Lsei;I)V
            //   316: return         
            //   317: astore_2       
            //   318: goto            232
            //   321: astore_1       
            //   322: goto            308
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                         
            //  -----  -----  -----  -----  -----------------------------
            //  19     24     317    321    Ljava/lang/SecurityException;
            //  251    278    321    325    Ljava/lang/RuntimeException;
            //  285    291    321    325    Ljava/lang/RuntimeException;
            //  294    301    321    325    Ljava/lang/RuntimeException;
            //  301    307    321    325    Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0294:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    
    public final class c extends PhoneStateListener
    {
        public final sei a;
        
        public c(final sei a) {
            this.a = a;
        }
        
        public final void onDisplayInfoChanged(final TelephonyDisplayInfo telephonyDisplayInfo) {
            final int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            final boolean b = overrideNetworkType == 3 || overrideNetworkType == 4;
            final sei a = this.a;
            int n;
            if (b) {
                n = 10;
            }
            else {
                n = 5;
            }
            sei.a(a, n);
        }
        
        public final void onServiceStateChanged(final ServiceState serviceState) {
            String string;
            if (serviceState == null) {
                string = "";
            }
            else {
                string = serviceState.toString();
            }
            final boolean b = string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED");
            final sei a = this.a;
            int n;
            if (b) {
                n = 10;
            }
            else {
                n = 5;
            }
            sei.a(a, n);
        }
    }
}
