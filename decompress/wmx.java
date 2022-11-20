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

public class wmx extends vbv
{
    public static final wmx.wmx$c Companion;
    public final jto X0;
    public final m6f Y0;
    public final sds Z0;
    public boolean a1;
    public String b1;
    public String c1;
    public String d1;
    public WebView e1;
    public View f1;
    
    static {
        Companion = new wmx.wmx$c();
    }
    
    public wmx(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xbm xbm, final jto x0, final Bundle bundle, final m6f y0, final sds z0, final t8p t8p) {
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)resources, "resources");
        czd.f((Object)kas, "requestRepositoryFactory");
        czd.f((Object)pwe, "navManagerLazy");
        czd.f((Object)jn, "activityFinisher");
        czd.f((Object)hag, "loginController");
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)userIdentifier, "currentUser");
        czd.f((Object)xbv, "twitterFragmentActivityOptions");
        czd.f((Object)pwe2, "fabPresenter");
        czd.f((Object)f6g, "locationProducer");
        czd.f((Object)v8p, "searchSuggestionController");
        czd.f((Object)vam, "registrableHeadsetPlugReceiver");
        czd.f((Object)obi, "navigator");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)x0, "savedStateHandler");
        czd.f((Object)y0, "legacyUriNavigator");
        czd.f((Object)z0, "telephonyUtil");
        czd.f((Object)t8p, "searchSuggestionCache");
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = x0;
        this.Y0 = y0;
        this.Z0 = z0;
        final boolean b = true;
        this.a1 = true;
        final Uri data = intent.getData();
        czd.c((Object)data);
        final Bundle extras = intent.getExtras();
        final View viewById = ((gml$a$b)((u9)this).c()).E0.findViewById(2131432649);
        czd.e((Object)viewById, "contentView.view.findViewById(R.id.webview)");
        final WebView e1 = (WebView)viewById;
        this.e1 = e1;
        final WebSettings settings = e1.getSettings();
        czd.e((Object)settings, "webView.settings");
        settings.setSaveFormData(false);
        boolean javaScriptEnabled = b;
        if (extras != null) {
            javaScriptEnabled = (!extras.getBoolean("set_disable_javascript") && b);
        }
        settings.setJavaScriptEnabled(javaScriptEnabled);
        settings.setAllowFileAccess(false);
        this.e1.setWebViewClient((WebViewClient)new wmx$a(this, resources));
        this.b1 = data.toString();
        if (bundle == null) {
            final h5j k = r8x.k();
            final w19 w19 = new w19();
            w19.c(k.subscribe((lj6)new f$s4((qsb)new qsb<tmi, fzv>(w19, this) {
                public final w19 D0;
                public final wmx E0;
                
                public final Object invoke(final Object o) {
                    final tmi tmi = (tmi)o;
                    final hai g4 = ((u9)this.E0).G4();
                    if (g4 != null) {
                        g4.setVisibility(8);
                    }
                    this.D0.a();
                    return fzv.a;
                }
            })));
            this.a1 = false;
            this.W4(data);
        }
        this.c1 = intent.getStringExtra("file_uri");
        this.d1 = intent.getStringExtra("mime_type");
        x0.a((mso)new wmx$b(this));
        final View inflate = layoutInflater.inflate(2131624825, (ViewGroup)null);
        czd.e((Object)inflate, "layoutInflater.inflate(R\u2026nu_open_in_browser, null)");
        (this.f1 = inflate).setOnClickListener((View$OnClickListener)new fpf(this, 7));
    }
    
    @SuppressLint({ "AlwaysShowAction" })
    public boolean N2(final hai hai, final Menu menu) {
        czd.f((Object)hai, "navComponent");
        czd.f((Object)menu, "menu");
        super.N2(hai, menu);
        if (this.b1 != null) {
            final MenuItem add = menu.add((CharSequence)null);
            add.setVisible(true);
            add.setEnabled(true);
            add.setActionView(this.f1);
            add.setShowAsAction(2);
        }
        return true;
    }
    
    public final void Q4() {
        super.Q4();
        final hai g4 = ((u9)this).G4();
        czd.c((Object)g4);
        int visibility;
        if (!this.a1) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        g4.setVisibility(visibility);
    }
    
    public final void W4(final Uri uri) {
        final WebView e1 = this.e1;
        final String string = uri.toString();
        final URI e2 = ar1.e(uri.toString());
        Object d0;
        if (e2 == null) {
            d0 = kdd.D0;
            final int a = c5j.a;
        }
        else {
            final qjg t = qjg.t();
            t.w((Object)"X-Twitter-Active-User", (Object)"yes");
            final Locale locale = ((u9)this).M0.getConfiguration().locale;
            czd.e((Object)locale, "resources.configuration.locale");
            t.w((Object)"Accept-Language", (Object)v68.y(locale));
            ((jw6)mfw.a().c((Class)jw6.class)).b3().a(e2, ((u9)this).K0, (xqc.a)new qqd(t, 12));
            d0 = ((n4j)t).e();
        }
        e1.loadUrl(string, (Map)d0);
    }
    
    public final void X4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        wmx.c1:Ljava/lang/String;
        //     4: ifnull          411
        //     7: aload_0        
        //     8: getfield        wmx.d1:Ljava/lang/String;
        //    11: ifnull          411
        //    14: getstatic       wmx.Companion:Lwmx$c;
        //    17: astore          5
        //    19: aload_0        
        //    20: getfield        u9.E0:Lcnb;
        //    23: astore_3       
        //    24: aload_3        
        //    25: ldc_w           "activity"
        //    28: invokestatic    czd.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: aload_0        
        //    32: getfield        wmx.c1:Ljava/lang/String;
        //    35: astore_2       
        //    36: aload_2        
        //    37: invokestatic    czd.c:(Ljava/lang/Object;)V
        //    40: aload_0        
        //    41: getfield        wmx.d1:Ljava/lang/String;
        //    44: astore          4
        //    46: aload           5
        //    48: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    51: pop            
        //    52: new             Ljava/io/File;
        //    55: dup            
        //    56: aload_3        
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
        //    88: aload_2        
        //    89: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    92: astore          5
        //    94: new             Ljava/io/BufferedInputStream;
        //    97: astore          6
        //    99: aload           6
        //   101: aload_3        
        //   102: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   105: aload_2        
        //   106: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   109: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   112: new             Ljava/io/FileOutputStream;
        //   115: astore          7
        //   117: aload           7
        //   119: aload           5
        //   121: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   124: sipush          1024
        //   127: newarray        B
        //   129: astore_2       
        //   130: aload           6
        //   132: aload_2        
        //   133: invokevirtual   java/io/InputStream.read:([B)I
        //   136: istore_1       
        //   137: iload_1        
        //   138: ifle            152
        //   141: aload           7
        //   143: aload_2        
        //   144: iconst_0       
        //   145: iload_1        
        //   146: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   149: goto            130
        //   152: new             Landroid/content/Intent;
        //   155: astore_2       
        //   156: aload_2        
        //   157: ldc_w           "android.intent.action.VIEW"
        //   160: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   163: aload_2        
        //   164: ldc_w           335544320
        //   167: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   170: astore_2       
        //   171: aload_2        
        //   172: invokestatic    czd.c:(Ljava/lang/Object;)V
        //   175: aload_2        
        //   176: aload_3        
        //   177: getstatic       com/twitter/database/legacy/provider/TwitterInternalFileProvider.H0:Ljava/lang/String;
        //   180: aload           5
        //   182: invokestatic    hxa.b:(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
        //   185: aload           4
        //   187: invokevirtual   android/content/Intent.setDataAndType:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
        //   190: pop            
        //   191: aload_2        
        //   192: iconst_1       
        //   193: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   196: ldc_w           "{\n                      \u2026                        }"
        //   199: invokestatic    czd.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   202: goto            230
        //   205: astore          5
        //   207: goto            248
        //   210: astore_3       
        //   211: new             Ljava/lang/Throwable;
        //   214: astore          4
        //   216: aload           4
        //   218: ldc_w           "Unable to find cached copy of file for sharing"
        //   221: aload_3        
        //   222: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   225: aload           4
        //   227: invokestatic    m8a.d:(Ljava/lang/Throwable;)V
        //   230: aload_2        
        //   231: astore          4
        //   233: aload_2        
        //   234: astore_3       
        //   235: aload           7
        //   237: aconst_null    
        //   238: invokestatic    wiy.v:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   241: goto            318
        //   244: astore          5
        //   246: aconst_null    
        //   247: astore_2       
        //   248: aload           5
        //   250: athrow         
        //   251: astore          8
        //   253: aload_2        
        //   254: astore          4
        //   256: aload_2        
        //   257: astore_3       
        //   258: aload           7
        //   260: aload           5
        //   262: invokestatic    wiy.v:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   265: aload_2        
        //   266: astore          4
        //   268: aload_2        
        //   269: astore_3       
        //   270: aload           8
        //   272: athrow         
        //   273: astore          5
        //   275: aload           4
        //   277: astore_2       
        //   278: goto            292
        //   281: astore          4
        //   283: aconst_null    
        //   284: astore_2       
        //   285: goto            337
        //   288: astore          5
        //   290: aconst_null    
        //   291: astore_2       
        //   292: aload_2        
        //   293: astore_3       
        //   294: new             Ljava/lang/Throwable;
        //   297: astore          4
        //   299: aload_2        
        //   300: astore_3       
        //   301: aload           4
        //   303: ldc_w           "IOException outputting file"
        //   306: aload           5
        //   308: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   311: aload_2        
        //   312: astore_3       
        //   313: aload           4
        //   315: invokestatic    m8a.d:(Ljava/lang/Throwable;)V
        //   318: aload_2        
        //   319: astore_3       
        //   320: aload           6
        //   322: aconst_null    
        //   323: invokestatic    wiy.v:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   326: goto            375
        //   329: astore_2       
        //   330: goto            359
        //   333: astore          4
        //   335: aload_3        
        //   336: astore_2       
        //   337: aload           4
        //   339: athrow         
        //   340: astore          5
        //   342: aload_2        
        //   343: astore_3       
        //   344: aload           6
        //   346: aload           4
        //   348: invokestatic    wiy.v:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   351: aload_2        
        //   352: astore_3       
        //   353: aload           5
        //   355: athrow         
        //   356: astore_2       
        //   357: aconst_null    
        //   358: astore_3       
        //   359: new             Ljava/lang/Throwable;
        //   362: dup            
        //   363: ldc_w           "IOException reading file"
        //   366: aload_2        
        //   367: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   370: invokestatic    m8a.d:(Ljava/lang/Throwable;)V
        //   373: aload_3        
        //   374: astore_2       
        //   375: aload_2        
        //   376: ifnull          411
        //   379: aload_0        
        //   380: getfield        u9.E0:Lcnb;
        //   383: astore_3       
        //   384: getstatic       kn6.a:Ljava/lang/Object;
        //   387: astore          4
        //   389: aload_3        
        //   390: aload_2        
        //   391: aconst_null    
        //   392: invokestatic    kn6$a.b:(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
        //   395: return         
        //   396: astore_2       
        //   397: new             Ljava/lang/Throwable;
        //   400: dup            
        //   401: ldc_w           "Couldn't find external browser to handle intent"
        //   404: aload_2        
        //   405: invokespecial   java/lang/Throwable.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   408: invokestatic    m8a.d:(Ljava/lang/Throwable;)V
        //   411: aload_0        
        //   412: getfield        wmx.b1:Ljava/lang/String;
        //   415: ifnull          452
        //   418: aload_0        
        //   419: getfield        wmx.Y0:Lm6f;
        //   422: astore          4
        //   424: aload_0        
        //   425: getfield        u9.E0:Lcnb;
        //   428: astore_2       
        //   429: aload_2        
        //   430: ldc_w           "activity"
        //   433: invokestatic    czd.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   436: aload_0        
        //   437: getfield        wmx.b1:Ljava/lang/String;
        //   440: astore_3       
        //   441: aload_3        
        //   442: invokestatic    czd.c:(Ljava/lang/Object;)V
        //   445: aload           4
        //   447: aload_2        
        //   448: aload_3        
        //   449: invokevirtual   m6f.e:(Landroid/content/Context;Ljava/lang/String;)V
        //   452: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  94     112    356    359    Ljava/io/IOException;
        //  112    124    288    292    Ljava/io/IOException;
        //  112    124    281    288    Any
        //  124    130    244    248    Any
        //  130    137    244    248    Any
        //  141    149    244    248    Any
        //  152    171    244    248    Any
        //  171    202    210    230    Ljava/lang/IllegalArgumentException;
        //  171    202    205    210    Any
        //  211    230    205    210    Any
        //  235    241    273    281    Ljava/io/IOException;
        //  235    241    333    337    Any
        //  248    251    251    273    Any
        //  258    265    273    281    Ljava/io/IOException;
        //  258    265    333    337    Any
        //  270    273    273    281    Ljava/io/IOException;
        //  270    273    333    337    Any
        //  294    299    333    337    Any
        //  301    311    333    337    Any
        //  313    318    333    337    Any
        //  320    326    329    333    Ljava/io/IOException;
        //  337    340    340    356    Any
        //  344    351    329    333    Ljava/io/IOException;
        //  353    356    329    333    Ljava/io/IOException;
        //  379    395    396    411    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0248:
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
