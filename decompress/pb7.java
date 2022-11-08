import android.os.BaseBundle;
import java.util.Map;
import android.app.Activity;
import android.content.ServiceConnection;
import android.text.TextUtils;
import android.content.Intent;
import android.content.ComponentName;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;
import java.net.URI;
import java.util.Objects;
import android.content.Context;
import com.twitter.network.navigation.cct.CustomTabsScribeEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pb7 implements dca<CustomTabsScribeEvent>
{
    public pb7.pb7$c C0;
    public boolean D0;
    public mb7 E0;
    public final Context F0;
    public final zau G0;
    public final d5c H0;
    public final vb7 I0;
    public final xcs J0;
    public final mci K0;
    public final nb7 L0;
    public lb7 M0;
    public boolean N0;
    public boolean O0;
    
    public pb7(final Context f0, final zau g0, final d5c h0, final vb7 i0, final xcs j0, final mci k0, final nb7 l0, final er0 er0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        if (this.h()) {
            er0.B().observeOn(yvo.c()).subscribe((fk6)new tua(this, 12));
        }
    }
    
    public static pb7 e() {
        final int a = qb7.a;
        Objects.requireNonNull(rb7.Companion);
        return ((rb7)((v4j)jr0.Companion.a()).B((Class)rb7.class)).L0();
    }
    
    public final void a(final mb7 mb7, final URI uri) {
        final Bundle bundle = new Bundle();
        final mdv e = v53.d().e(UserIdentifier.getCurrent());
        if (e != null) {
            ((BaseBundle)bundle).putString("Authorization", i3j.N().O(e, xrc$b.E0, uri, (src)null, 0L));
        }
        mb7.a.putExtra("com.android.browser.headers", bundle);
    }
    
    public final void b() {
        synchronized (this) {
            this.O0 = false;
            this.M0 = null;
            this.N0 = false;
            this.C0 = null;
            this.D0 = false;
            cag.a("CustomTabs", "CustomTabsManager cleared");
        }
    }
    
    public final void c() {
        synchronized (this) {
            final String c = this.I0.c();
            if (!c.equals("chrome_not_available") && !this.f()) {
                cag.a("CustomTabs", "Custom Tabs connection not established. Will create...");
                final long b = this.G0.b();
                this.b();
                final ub7 ub7 = new ub7() {
                    public final void onServiceDisconnected(final ComponentName componentName) {
                        pb7.this.b();
                        cag.a("CustomTabs", "Service disconnected");
                    }
                };
                boolean bindService;
                try {
                    final Context f0 = this.F0;
                    final Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty((CharSequence)c)) {
                        intent.setPackage(c);
                    }
                    bindService = f0.bindService(intent, (ServiceConnection)ub7, 33);
                    this.O0 = true;
                }
                catch (final Exception ex) {
                    cag.b("CustomTabs", "Binding to Custom Tabs service caused exception", (Throwable)ex);
                    bindService = false;
                }
                if (!bindService) {
                    cag.a("CustomTabs", "Service binding failed");
                    this.b();
                }
            }
            else {
                cag.a("CustomTabs", "Connection abandoned. Already connected.");
            }
        }
    }
    
    public final wb7 d(final String p0, final qp2 p1, final Activity p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   pb7.f:()Z
        //     4: ifeq            310
        //     7: new             Lpb7$b;
        //    10: dup            
        //    11: aload_0        
        //    12: aload_1        
        //    13: aload_0        
        //    14: getfield        pb7.F0:Landroid/content/Context;
        //    17: aload_0        
        //    18: aload_2        
        //    19: aload_3        
        //    20: invokespecial   pb7$b.<init>:(Lpb7;Ljava/lang/String;Landroid/content/Context;Lpb7;Lqp2;Landroid/app/Activity;)V
        //    23: astore          4
        //    25: aload_0        
        //    26: getfield        pb7.M0:Llb7;
        //    29: astore_3       
        //    30: aload_3        
        //    31: ifnull          96
        //    34: aload_0        
        //    35: getfield        pb7.I0:Lvb7;
        //    38: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    41: pop            
        //    42: new             Lkb7;
        //    45: astore          5
        //    47: aload           5
        //    49: aload           4
        //    51: invokespecial   kb7.<init>:(Lzi8;)V
        //    54: aload_3        
        //    55: getfield        lb7.a:Lr2d;
        //    58: aload           5
        //    60: invokeinterface r2d.X:(Lq2d;)Z
        //    65: istore          6
        //    67: iload           6
        //    69: ifne            75
        //    72: goto            96
        //    75: new             Lwb7;
        //    78: dup            
        //    79: aload_3        
        //    80: getfield        lb7.a:Lr2d;
        //    83: aload           5
        //    85: aload_3        
        //    86: getfield        lb7.b:Landroid/content/ComponentName;
        //    89: invokespecial   wb7.<init>:(Lr2d;Lq2d;Landroid/content/ComponentName;)V
        //    92: astore_3       
        //    93: goto            98
        //    96: aconst_null    
        //    97: astore_3       
        //    98: aload_3        
        //    99: ifnonnull       214
        //   102: new             Ljava/util/HashMap;
        //   105: astore_3       
        //   106: aload_3        
        //   107: invokespecial   java/util/HashMap.<init>:()V
        //   110: aload_3        
        //   111: ldc_w           "url"
        //   114: aload_1        
        //   115: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   118: pop            
        //   119: aload_0        
        //   120: getfield        pb7.I0:Lvb7;
        //   123: astore_1       
        //   124: aload_1        
        //   125: invokevirtual   vb7.c:()Ljava/lang/String;
        //   128: ldc             "chrome_not_available"
        //   130: invokestatic    zzd.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   133: istore          6
        //   135: iload           6
        //   137: ifne            170
        //   140: aload_1        
        //   141: getfield        vb7.a:Landroid/content/Context;
        //   144: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   147: aload_1        
        //   148: getfield        vb7.a:Landroid/content/Context;
        //   151: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   154: iconst_0       
        //   155: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   158: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //   161: astore_1       
        //   162: goto            172
        //   165: astore_1       
        //   166: aload_1        
        //   167: invokestatic    e9a.d:(Ljava/lang/Throwable;)V
        //   170: aconst_null    
        //   171: astore_1       
        //   172: aload_3        
        //   173: ldc_w           "chrome_version"
        //   176: aload_1        
        //   177: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   180: pop            
        //   181: new             Lcom/twitter/network/navigation/cct/CustomTabsScribeEvent;
        //   184: astore_1       
        //   185: aload_1        
        //   186: ldc_w           "chrome::::error"
        //   189: aload_3        
        //   190: aload_0        
        //   191: getfield        pb7.F0:Landroid/content/Context;
        //   194: aload_2        
        //   195: invokespecial   com/twitter/network/navigation/cct/CustomTabsScribeEvent.<init>:(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Lqp2;)V
        //   198: aload_0        
        //   199: aload_1        
        //   200: invokevirtual   pb7.onEvent:(Lcom/twitter/network/navigation/cct/CustomTabsScribeEvent;)V
        //   203: ldc             "CustomTabs"
        //   205: ldc_w           "Failed to create a session with the client..."
        //   208: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   211: goto            310
        //   214: aload_3        
        //   215: areturn        
        //   216: astore_1       
        //   217: aload_2        
        //   218: ifnull          236
        //   221: aload_2        
        //   222: invokeinterface qp2.O2:()Z
        //   227: ifeq            236
        //   230: iconst_1       
        //   231: istore          7
        //   233: goto            239
        //   236: iconst_0       
        //   237: istore          7
        //   239: getstatic       java/util/Locale.ENGLISH:Ljava/util/Locale;
        //   242: astore_3       
        //   243: iload           7
        //   245: ifeq            255
        //   248: ldc_w           "promoted"
        //   251: astore_1       
        //   252: goto            259
        //   255: ldc_w           "organic"
        //   258: astore_1       
        //   259: aload_3        
        //   260: ldc_w           "cct:::%s:session_init_fail"
        //   263: iconst_1       
        //   264: anewarray       Ljava/lang/Object;
        //   267: dup            
        //   268: iconst_0       
        //   269: aload_1        
        //   270: aastore        
        //   271: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   274: astore_1       
        //   275: getstatic       ged.C0:Lged$b;
        //   278: astore_3       
        //   279: getstatic       w4j.a:I
        //   282: istore          7
        //   284: aload_0        
        //   285: new             Lcom/twitter/network/navigation/cct/CustomTabsScribeEvent;
        //   288: dup            
        //   289: aload_1        
        //   290: aload_3        
        //   291: aload_0        
        //   292: getfield        pb7.F0:Landroid/content/Context;
        //   295: aload_2        
        //   296: invokespecial   com/twitter/network/navigation/cct/CustomTabsScribeEvent.<init>:(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Lqp2;)V
        //   299: invokevirtual   pb7.onEvent:(Lcom/twitter/network/navigation/cct/CustomTabsScribeEvent;)V
        //   302: ldc             "CustomTabs"
        //   304: ldc_w           "SecurityException when attempting to create a CCT session..."
        //   307: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   310: aconst_null    
        //   311: areturn        
        //   312: astore_3       
        //   313: goto            96
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  25     30     216    310    Ljava/lang/SecurityException;
        //  34     54     216    310    Ljava/lang/SecurityException;
        //  54     67     312    316    Landroid/os/RemoteException;
        //  54     67     216    310    Ljava/lang/SecurityException;
        //  75     93     216    310    Ljava/lang/SecurityException;
        //  102    135    216    310    Ljava/lang/SecurityException;
        //  140    162    165    170    Ljava/lang/Exception;
        //  166    170    216    310    Ljava/lang/SecurityException;
        //  172    211    216    310    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
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
    
    public final boolean f() {
        return this.N0 && this.M0 != null;
    }
    
    public final boolean g(final String s) {
        synchronized (this) {
            final pb7.pb7$c c0 = this.C0;
            return c0 != null && c0.b.equals(s);
        }
    }
    
    public final boolean h() {
        final hlv b = dta.b();
        boolean b2 = true;
        if (!b.b("chrome_custom_tabs_android_enabled", true) || !this.H0.b()) {
            b2 = false;
        }
        return b2;
    }
    
    public final void i(final Activity activity, final String s, final qp2 qp2) {
        synchronized (this) {
            this.j(activity, s, qp2, false, true, null);
        }
    }
    
    public final void j(final Activity p0, final String p1, final qp2 p2, final boolean p3, final boolean p4, final String p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_2        
        //     3: astore          7
        //     5: iload           4
        //     7: ifeq            57
        //    10: ldc_w           "https://twitter.com/account/authenticate_web_view"
        //    13: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    16: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //    19: astore          7
        //    21: aload           7
        //    23: ldc_w           "redirect_url"
        //    26: aload_2        
        //    27: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    30: pop            
        //    31: aload           6
        //    33: invokestatic    pjr.g:(Ljava/lang/CharSequence;)Z
        //    36: ifeq            50
        //    39: aload           7
        //    41: ldc_w           "flowname"
        //    44: aload           6
        //    46: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    49: pop            
        //    50: aload           7
        //    52: invokevirtual   android/net/Uri$Builder.toString:()Ljava/lang/String;
        //    55: astore          7
        //    57: aload_0        
        //    58: aload           7
        //    60: invokevirtual   pb7.g:(Ljava/lang/String;)Z
        //    63: ifeq            126
        //    66: aload_0        
        //    67: getfield        pb7.C0:Lpb7$c;
        //    70: astore_2       
        //    71: aload_2        
        //    72: invokestatic    pf8.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //    75: pop            
        //    76: aload_2        
        //    77: getfield        pb7$c.a:Lwb7;
        //    80: astore_2       
        //    81: new             Ljava/lang/StringBuilder;
        //    84: astore          6
        //    86: aload           6
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: aload           6
        //    93: ldc_w           "Using warmed session for "
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: pop            
        //   100: aload           6
        //   102: aload_0        
        //   103: getfield        pb7.C0:Lpb7$c;
        //   106: getfield        pb7$c.b:Ljava/lang/String;
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: ldc             "CustomTabs"
        //   115: aload           6
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   123: goto            158
        //   126: aload_0        
        //   127: aload           7
        //   129: aload_3        
        //   130: aload_1        
        //   131: invokevirtual   pb7.d:(Ljava/lang/String;Lqp2;Landroid/app/Activity;)Lwb7;
        //   134: astore_2       
        //   135: aload_2        
        //   136: ifnull          150
        //   139: ldc             "CustomTabs"
        //   141: ldc_w           "Using new unwarmed new session"
        //   144: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   147: goto            158
        //   150: ldc             "CustomTabs"
        //   152: ldc_w           "New session creation failed. Open URL without session."
        //   155: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   158: new             Lmb7$a;
        //   161: astore          6
        //   163: aload           6
        //   165: aload_2        
        //   166: invokespecial   mb7$a.<init>:(Lwb7;)V
        //   169: aload_3        
        //   170: ifnull          183
        //   173: aload_3        
        //   174: invokeinterface qp2.t1:()Lc0p;
        //   179: astore_3       
        //   180: goto            185
        //   183: aconst_null    
        //   184: astore_3       
        //   185: aload_0        
        //   186: getfield        pb7.L0:Lnb7;
        //   189: aload           6
        //   191: aload_1        
        //   192: aload           7
        //   194: aload_3        
        //   195: iload           5
        //   197: invokeinterface nb7.a:(Lmb7$a;Landroid/app/Activity;Ljava/lang/String;Lc0p;Z)Lmb7;
        //   202: astore_3       
        //   203: iload           4
        //   205: ifeq            229
        //   208: aload_0        
        //   209: aload_3        
        //   210: aload           7
        //   212: invokestatic    java/net/URI.create:(Ljava/lang/String;)Ljava/net/URI;
        //   215: invokevirtual   pb7.a:(Lmb7;Ljava/net/URI;)V
        //   218: aload_3        
        //   219: getfield        mb7.a:Landroid/content/Intent;
        //   222: ldc_w           1073741824
        //   225: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   228: pop            
        //   229: aload_0        
        //   230: aload_0        
        //   231: aload           7
        //   233: invokevirtual   pb7.g:(Ljava/lang/String;)Z
        //   236: putfield        pb7.D0:Z
        //   239: iload           4
        //   241: ifeq            284
        //   244: aload_0        
        //   245: aload_3        
        //   246: putfield        pb7.E0:Lmb7;
        //   249: aload           7
        //   251: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   254: astore_1       
        //   255: aload_2        
        //   256: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   259: pop            
        //   260: aload_2        
        //   261: getfield        wb7.b:Ljava/lang/Object;
        //   264: checkcast       Lr2d;
        //   267: aload_2        
        //   268: getfield        wb7.c:Ljava/lang/Object;
        //   271: checkcast       Lq2d;
        //   274: aload_1        
        //   275: invokeinterface r2d.f0:(Lq2d;Landroid/net/Uri;)Z
        //   280: pop            
        //   281: goto            320
        //   284: aload           7
        //   286: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   289: astore_2       
        //   290: aload_3        
        //   291: getfield        mb7.a:Landroid/content/Intent;
        //   294: aload_2        
        //   295: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   298: pop            
        //   299: aload_3        
        //   300: getfield        mb7.a:Landroid/content/Intent;
        //   303: astore_2       
        //   304: aload_3        
        //   305: getfield        mb7.b:Landroid/os/Bundle;
        //   308: astore_3       
        //   309: getstatic       eo6.a:Ljava/lang/Object;
        //   312: astore          6
        //   314: aload_1        
        //   315: aload_2        
        //   316: aload_3        
        //   317: invokestatic    eo6$a.b:(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
        //   320: aload_0        
        //   321: getfield        pb7.D0:Z
        //   324: ifeq            361
        //   327: aload_0        
        //   328: monitorenter   
        //   329: aload_0        
        //   330: aconst_null    
        //   331: putfield        pb7.C0:Lpb7$c;
        //   334: aload_0        
        //   335: monitorexit    
        //   336: ldc             "CustomTabs"
        //   338: ldc_w           "Warmed URL used"
        //   341: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   344: goto            361
        //   347: astore_1       
        //   348: aload_0        
        //   349: monitorexit    
        //   350: aload_1        
        //   351: athrow         
        //   352: astore_1       
        //   353: goto            364
        //   356: astore_1       
        //   357: aload_1        
        //   358: invokestatic    e9a.d:(Ljava/lang/Throwable;)V
        //   361: aload_0        
        //   362: monitorexit    
        //   363: return         
        //   364: aload_0        
        //   365: monitorexit    
        //   366: aload_1        
        //   367: athrow         
        //   368: astore_1       
        //   369: goto            320
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  10     50     352    356    Any
        //  50     57     352    356    Any
        //  57     123    356    361    Ljava/lang/Exception;
        //  57     123    352    356    Any
        //  126    135    356    361    Ljava/lang/Exception;
        //  126    135    352    356    Any
        //  139    147    356    361    Ljava/lang/Exception;
        //  139    147    352    356    Any
        //  150    158    356    361    Ljava/lang/Exception;
        //  150    158    352    356    Any
        //  158    169    356    361    Ljava/lang/Exception;
        //  158    169    352    356    Any
        //  173    180    356    361    Ljava/lang/Exception;
        //  173    180    352    356    Any
        //  185    203    356    361    Ljava/lang/Exception;
        //  185    203    352    356    Any
        //  208    229    356    361    Ljava/lang/Exception;
        //  208    229    352    356    Any
        //  229    239    356    361    Ljava/lang/Exception;
        //  229    239    352    356    Any
        //  244    260    356    361    Ljava/lang/Exception;
        //  244    260    352    356    Any
        //  260    281    368    372    Landroid/os/RemoteException;
        //  260    281    356    361    Ljava/lang/Exception;
        //  260    281    352    356    Any
        //  284    320    356    361    Ljava/lang/Exception;
        //  284    320    352    356    Any
        //  320    329    356    361    Ljava/lang/Exception;
        //  320    329    352    356    Any
        //  329    334    347    352    Any
        //  334    344    356    361    Ljava/lang/Exception;
        //  334    344    352    356    Any
        //  348    352    356    361    Ljava/lang/Exception;
        //  348    352    352    356    Any
        //  357    361    352    356    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 186, Size: 186
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
    
    public final boolean k() {
        final hlv b = dta.b();
        boolean b2 = true;
        if (!b.b("chrome_custom_tabs_android_enabled", true) || !(this.I0.c().equals("chrome_not_available") ^ true) || !this.H0.b()) {
            b2 = false;
        }
        return b2;
    }
    
    public void onEvent(final CustomTabsScribeEvent customTabsScribeEvent) {
        final Map b = customTabsScribeEvent.b;
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { customTabsScribeEvent.a });
        final qp2 d = customTabsScribeEvent.d;
        if (d != null) {
            if (b.containsKey("url")) {
                zf4.q = b.get("url");
                final int a = w4j.a;
            }
            b.put("is_promoted", Boolean.toString(d.O2()));
            wvz.c(zf4, customTabsScribeEvent.c, d.t1(), (String)null);
            if (d.O2() && d.e() != null) {
                if (b.containsKey("dwell_time")) {
                    final long longValue = Long.valueOf(b.get("dwell_time"));
                    final mil a2 = mil.a();
                    for (Object o = dq2.D0; o != null && ((dq2)o).b() * 1000L <= longValue; o = ((dq2)o).e()) {
                        a2.b((kil)((h4j)kil.e(((dq2)o).C0, d.e())).e());
                    }
                    final String a3 = d.e().a;
                    final int e1 = d.E1();
                    if (a3 != null && e1 != -1) {
                        final zf4 zf5 = new zf4(nca.g("cct", "", "", "", "time_spent"));
                        zf5.j = longValue;
                        final int a4 = w4j.a;
                        zf5.c = a3;
                        zf5.s((long)e1);
                        saw.b((okm)zf5);
                    }
                }
                if (b.containsKey("close_webview")) {
                    mil.a().b((kil)((h4j)kil.e(jil.L1, d.e())).e());
                }
            }
        }
        zf4.c = pjr.t(b);
        final int a5 = w4j.a;
        saw.b((okm)zf4);
    }
}
