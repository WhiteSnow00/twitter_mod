import java.util.Locale;
import java.net.URI;
import java.util.Map;
import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.Menu;
import android.webkit.WebSettings;
import android.net.Uri;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

public class nnx extends kcv
{
    public static final nnx.nnx$c Companion;
    public final duo Z0;
    public final k7f a1;
    public final kes b1;
    public boolean c1;
    public String d1;
    public String e1;
    public String f1;
    public WebView g1;
    public View h1;
    
    static {
        Companion = new nnx.nnx$c();
    }
    
    public nnx(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final kcm kcm, final duo z0, final Bundle bundle, final k7f a1, final kes b1, final m9p m9p) {
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)resources, "resources");
        e0e.f((Object)cbs, "requestRepositoryFactory");
        e0e.f((Object)mxe, "navManagerLazy");
        e0e.f((Object)nn, "activityFinisher");
        e0e.f((Object)cbg, "loginController");
        e0e.f((Object)layoutInflater, "layoutInflater");
        e0e.f((Object)userIdentifier, "currentUser");
        e0e.f((Object)mcv, "twitterFragmentActivityOptions");
        e0e.f((Object)mxe2, "fabPresenter");
        e0e.f((Object)a7g, "locationProducer");
        e0e.f((Object)o9p, "searchSuggestionController");
        e0e.f((Object)ibm, "registrableHeadsetPlugReceiver");
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)z0, "savedStateHandler");
        e0e.f((Object)a1, "legacyUriNavigator");
        e0e.f((Object)b1, "telephonyUtil");
        e0e.f((Object)m9p, "searchSuggestionCache");
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = z0;
        this.a1 = a1;
        this.b1 = b1;
        final boolean b2 = true;
        this.c1 = true;
        final Uri data = intent.getData();
        e0e.c((Object)data);
        final Bundle extras = intent.getExtras();
        final View viewById = ((sml$a$b)this.c()).G0.findViewById(2131432650);
        e0e.e((Object)viewById, "contentView.view.findViewById(R.id.webview)");
        final WebView g1 = (WebView)viewById;
        this.g1 = g1;
        final WebSettings settings = g1.getSettings();
        e0e.e((Object)settings, "webView.settings");
        settings.setSaveFormData(false);
        boolean javaScriptEnabled = b2;
        if (extras != null) {
            javaScriptEnabled = (!extras.getBoolean("set_disable_javascript") && b2);
        }
        settings.setJavaScriptEnabled(javaScriptEnabled);
        settings.setAllowFileAccess(false);
        this.g1.setWebViewClient((WebViewClient)new nnx$a(this, resources));
        this.d1 = data.toString();
        if (bundle == null) {
            final t5j l = k9x.l();
            final e39 e39 = new e39();
            e39.c(l.subscribe((rk6)new f$s4((stb)new stb<kni, vzv>(e39, this) {
                public final e39 F0;
                public final nnx G0;
                
                public final Object invoke(final Object o) {
                    final kni kni = (kni)o;
                    final zai g4 = this.G0.G4();
                    if (g4 != null) {
                        g4.setVisibility(8);
                    }
                    this.F0.a();
                    return vzv.a;
                }
            })));
            this.c1 = false;
            this.W4(data);
        }
        this.e1 = intent.getStringExtra("file_uri");
        this.f1 = intent.getStringExtra("mime_type");
        z0.a((gto<?>)new nnx$b(this));
        final View inflate = layoutInflater.inflate(2131624825, (ViewGroup)null);
        e0e.e((Object)inflate, "layoutInflater.inflate(R\u2026nu_open_in_browser, null)");
        (this.h1 = inflate).setOnClickListener((View$OnClickListener)new g2p((Object)this, 7));
    }
    
    @SuppressLint({ "AlwaysShowAction" })
    @Override
    public boolean N2(final zai zai, final Menu menu) {
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        super.N2(zai, menu);
        if (this.d1 != null) {
            final MenuItem add = menu.add((CharSequence)null);
            add.setVisible(true);
            add.setEnabled(true);
            add.setActionView(this.h1);
            add.setShowAsAction(2);
        }
        return true;
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        final zai g4 = this.G4();
        e0e.c((Object)g4);
        int visibility;
        if (!this.c1) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        g4.setVisibility(visibility);
    }
    
    public final void W4(final Uri uri) {
        final WebView g1 = this.g1;
        final String string = uri.toString();
        final URI e = hr1.e(uri.toString());
        Object f0;
        if (e == null) {
            f0 = ked.F0;
            final int a = o5j.a;
        }
        else {
            final kkg t = kkg.t();
            t.w((Object)"X-Twitter-Active-User", (Object)"yes");
            final Locale locale = super.O0.getConfiguration().locale;
            e0e.e((Object)locale, "resources.configuration.locale");
            t.w((Object)"Accept-Language", (Object)o9a.u(locale));
            ((px6)cgw.a().c((Class)px6.class)).b3().a(e, super.M0, (xrc$a)new l71((Object)t, 20));
            f0 = ((z4j)t).e();
        }
        g1.loadUrl(string, (Map)f0);
    }
    
    public final void X4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        nnx.e1:Ljava/lang/String;
        //     4: ifnull          411
        //     7: aload_0        
        //     8: getfield        nnx.f1:Ljava/lang/String;
        //    11: ifnull          411
        //    14: getstatic       nnx.Companion:Lnnx$c;
        //    17: astore          5
        //    19: aload_0        
        //    20: getfield        u9.G0:Ldob;
        //    23: astore_2       
        //    24: aload_2        
        //    25: ldc_w           "activity"
        //    28: invokestatic    e0e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: aload_0        
        //    32: getfield        nnx.e1:Ljava/lang/String;
        //    35: astore_3       
        //    36: aload_3        
        //    37: invokestatic    e0e.c:(Ljava/lang/Object;)V
        //    40: aload_0        
        //    41: getfield        nnx.f1:Ljava/lang/String;
        //    44: astore          4
        //    46: aload           5
        //    48: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    51: pop            
        //    52: new             Ljava/io/File;
        //    55: dup            
        //    56: aload_2        
        //    57: invokevirtual   android/content/Context.getCacheDir:()Ljava/io/File;
        //    60: ldc_w           "shared"
        //    63: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    66: astore          5
        //    68: aload           5
        //    70: invokevirtual   java/io/File.isDirectory:()Z
        //    73: ifne            82
        //    76: aload           5
        //    78: invokevirtual   java/io/File.mkdirs:()Z
        //    81: pop            
        //    82: new             Ljava/io/File;
        //    85: dup            
        //    86: aload           5
        //    88: aload_3        
        //    89: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    92: astore          5
        //    94: new             Ljava/io/BufferedInputStream;
        //    97: astore          6
        //    99: aload           6
        //   101: aload_2        
        //   102: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   105: aload_3        
        //   106: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   109: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   112: new             Ljava/io/FileOutputStream;
        //   115: astore          7
        //   117: aload           7
        //   119: aload           5
        //   121: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   124: sipush          1024
        //   127: newarray        B
        //   129: astore_3       
        //   130: aload           6
        //   132: aload_3        
        //   133: invokevirtual   java/io/InputStream.read:([B)I
        //   136: istore_1       
        //   137: iload_1        
        //   138: ifle            152
        //   141: aload           7
        //   143: aload_3        
        //   144: iconst_0       
        //   145: iload_1        
        //   146: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   149: goto            130
        //   152: new             Landroid/content/Intent;
        //   155: astore_3       
        //   156: aload_3        
        //   157: ldc_w           "android.intent.action.VIEW"
        //   160: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   163: aload_3        
        //   164: ldc_w           335544320
        //   167: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   170: astore_3       
        //   171: aload_3        
        //   172: invokestatic    e0e.c:(Ljava/lang/Object;)V
        //   175: aload_3        
        //   176: aload_2        
        //   177: getstatic       com/twitter/database/legacy/provider/TwitterInternalFileProvider.J0:Ljava/lang/String;
        //   180: aload           5
        //   182: invokestatic    lya.b:(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
        //   185: aload           4
        //   187: invokevirtual   android/content/Intent.setDataAndType:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
        //   190: pop            
        //   191: aload_3        
        //   192: iconst_1       
        //   193: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   196: ldc_w           "{\n                      \u2026                        }"
        //   199: invokestatic    e0e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   202: goto            229
        //   205: astore          5
        //   207: goto            247
        //   210: astore          4
        //   212: new             Ljava/lang/Throwable;
        //   215: astore_2       
        //   216: aload_2        
        //   217: ldc_w           "Unable to find cached copy of file for sharing"
        //   220: aload           4
        //   222: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   225: aload_2        
        //   226: invokestatic    r9a.d:(Ljava/lang/Throwable;)V
        //   229: aload_3        
        //   230: astore          4
        //   232: aload_3        
        //   233: astore_2       
        //   234: aload           7
        //   236: aconst_null    
        //   237: invokestatic    ma7.n:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   240: goto            317
        //   243: astore          5
        //   245: aconst_null    
        //   246: astore_3       
        //   247: aload           5
        //   249: athrow         
        //   250: astore          8
        //   252: aload_3        
        //   253: astore          4
        //   255: aload_3        
        //   256: astore_2       
        //   257: aload           7
        //   259: aload           5
        //   261: invokestatic    ma7.n:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   264: aload_3        
        //   265: astore          4
        //   267: aload_3        
        //   268: astore_2       
        //   269: aload           8
        //   271: athrow         
        //   272: astore          5
        //   274: aload           4
        //   276: astore_3       
        //   277: goto            291
        //   280: astore          4
        //   282: aconst_null    
        //   283: astore_3       
        //   284: goto            338
        //   287: astore          5
        //   289: aconst_null    
        //   290: astore_3       
        //   291: aload_3        
        //   292: astore_2       
        //   293: new             Ljava/lang/Throwable;
        //   296: astore          4
        //   298: aload_3        
        //   299: astore_2       
        //   300: aload           4
        //   302: ldc_w           "IOException outputting file"
        //   305: aload           5
        //   307: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   310: aload_3        
        //   311: astore_2       
        //   312: aload           4
        //   314: invokestatic    r9a.d:(Ljava/lang/Throwable;)V
        //   317: aload_3        
        //   318: astore_2       
        //   319: aload           6
        //   321: aconst_null    
        //   322: invokestatic    ma7.n:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   325: aload_3        
        //   326: astore_2       
        //   327: goto            374
        //   330: astore_3       
        //   331: goto            360
        //   334: astore          4
        //   336: aload_2        
        //   337: astore_3       
        //   338: aload           4
        //   340: athrow         
        //   341: astore          5
        //   343: aload_3        
        //   344: astore_2       
        //   345: aload           6
        //   347: aload           4
        //   349: invokestatic    ma7.n:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   352: aload_3        
        //   353: astore_2       
        //   354: aload           5
        //   356: athrow         
        //   357: astore_3       
        //   358: aconst_null    
        //   359: astore_2       
        //   360: new             Ljava/lang/Throwable;
        //   363: dup            
        //   364: ldc_w           "IOException reading file"
        //   367: aload_3        
        //   368: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   371: invokestatic    r9a.d:(Ljava/lang/Throwable;)V
        //   374: aload_2        
        //   375: ifnull          411
        //   378: aload_0        
        //   379: getfield        u9.G0:Ldob;
        //   382: astore          4
        //   384: getstatic       qo6.a:Ljava/lang/Object;
        //   387: astore_3       
        //   388: aload           4
        //   390: aload_2        
        //   391: aconst_null    
        //   392: invokestatic    qo6$a.b:(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
        //   395: return         
        //   396: astore_2       
        //   397: new             Ljava/lang/Throwable;
        //   400: dup            
        //   401: ldc_w           "Couldn't find external browser to handle intent"
        //   404: aload_2        
        //   405: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   408: invokestatic    r9a.d:(Ljava/lang/Throwable;)V
        //   411: aload_0        
        //   412: getfield        nnx.d1:Ljava/lang/String;
        //   415: ifnull          453
        //   418: aload_0        
        //   419: getfield        nnx.a1:Lk7f;
        //   422: astore_2       
        //   423: aload_0        
        //   424: getfield        u9.G0:Ldob;
        //   427: astore_3       
        //   428: aload_3        
        //   429: ldc_w           "activity"
        //   432: invokestatic    e0e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   435: aload_0        
        //   436: getfield        nnx.d1:Ljava/lang/String;
        //   439: astore          4
        //   441: aload           4
        //   443: invokestatic    e0e.c:(Ljava/lang/Object;)V
        //   446: aload_2        
        //   447: aload_3        
        //   448: aload           4
        //   450: invokevirtual   k7f.e:(Landroid/content/Context;Ljava/lang/String;)V
        //   453: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  94     112    357    360    Ljava/io/IOException;
        //  112    124    287    291    Ljava/io/IOException;
        //  112    124    280    287    Any
        //  124    130    243    247    Any
        //  130    137    243    247    Any
        //  141    149    243    247    Any
        //  152    171    243    247    Any
        //  171    202    210    229    Ljava/lang/IllegalArgumentException;
        //  171    202    205    210    Any
        //  212    229    205    210    Any
        //  234    240    272    280    Ljava/io/IOException;
        //  234    240    334    338    Any
        //  247    250    250    272    Any
        //  257    264    272    280    Ljava/io/IOException;
        //  257    264    334    338    Any
        //  269    272    272    280    Ljava/io/IOException;
        //  269    272    334    338    Any
        //  293    298    334    338    Any
        //  300    310    334    338    Any
        //  312    317    334    338    Any
        //  319    325    330    334    Ljava/io/IOException;
        //  338    341    341    357    Any
        //  345    352    330    334    Ljava/io/IOException;
        //  354    357    330    334    Ljava/io/IOException;
        //  378    395    396    411    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0247:
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
