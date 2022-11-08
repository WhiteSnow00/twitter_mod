import java.util.HashMap;
import android.os.BaseBundle;
import com.twitter.ui.view.GroupedRowView;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class mts extends acv<nws> implements qf6$a, gnf$b, vxs
{
    public final aws b1;
    public final dsb c1;
    public int d1;
    public final qrs e1;
    public final l4e<nws> f1;
    public final udf<nws> g1;
    public final rpd h1;
    public final exs i1;
    public final adx j1;
    public c4e<nws> k1;
    public ulh l1;
    public ksc$a<kmm<?, ?>> m1;
    public boolean n1;
    public vdk o1;
    public final uc p1;
    public boolean q1;
    public boolean r1;
    
    public mts(final ybv p0, final aws p1, final qrs p2, final zh7<vo6> p3, final udf<nws> p4, final dsb p5, final rpd p6, final zoi<nws> p7, final Context p8, final uc p9, final exs p10, final g0t p11, final x3e<nws> p12, final pca<bo> p13, final adx p14, final jev p15) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   acv.<init>:(Lybv;)V
        //     5: aload_0        
        //     6: aload_2        
        //     7: putfield        mts.b1:Laws;
        //    10: aload_0        
        //    11: aload_3        
        //    12: putfield        mts.e1:Lqrs;
        //    15: aload_0        
        //    16: aload           5
        //    18: putfield        mts.g1:Ludf;
        //    21: aload_0        
        //    22: aload           6
        //    24: putfield        mts.c1:Ldsb;
        //    27: aload_0        
        //    28: aload           15
        //    30: putfield        acv.Y0:Ljev;
        //    33: aload_0        
        //    34: aload           7
        //    36: putfield        mts.h1:Lrpd;
        //    39: aload_1        
        //    40: getfield        ybv.q:Landroid/os/Bundle;
        //    43: astore_2       
        //    44: aload_2        
        //    45: ifnull          56
        //    48: aload           7
        //    50: aload_2        
        //    51: invokeinterface rpd.a:(Landroid/os/Bundle;)V
        //    56: aload_0        
        //    57: aload           8
        //    59: putfield        mts.f1:Lzoi;
        //    62: aload_0        
        //    63: aload           9
        //    65: putfield        mts.p1:Luc;
        //    68: aload_0        
        //    69: aload           10
        //    71: putfield        mts.i1:Lexs;
        //    74: aload_0        
        //    75: aload           14
        //    77: putfield        mts.j1:Ladx;
        //    80: aload           13
        //    82: invokeinterface pca.v0:()Lb5j;
        //    87: new             Ljp3;
        //    90: dup            
        //    91: aload           4
        //    93: bipush          6
        //    95: invokespecial   jp3.<init>:(Ljava/lang/Object;I)V
        //    98: invokestatic    f.i:(Lb5j;Lu93;)Lb5j;
        //   101: pop            
        //   102: aload_1        
        //   103: getfield        ybv.a:Lz7x;
        //   106: invokeinterface z7x.b:()Lb5j;
        //   111: new             Lpcs;
        //   114: dup            
        //   115: aload_0        
        //   116: bipush          16
        //   118: invokespecial   pcs.<init>:(Ljava/lang/Object;I)V
        //   121: invokevirtual   b5j.subscribe:(Lfk6;)Lj29;
        //   124: pop            
        //   125: aload_1        
        //   126: getfield        ybv.q:Landroid/os/Bundle;
        //   129: astore_1       
        //   130: aload_3        
        //   131: getfield        qrs.c:Ljava/lang/String;
        //   134: astore_2       
        //   135: aload_0        
        //   136: aload_3        
        //   137: invokevirtual   qrs.n:()I
        //   140: putfield        mts.d1:I
        //   143: aload_1        
        //   144: ifnull          199
        //   147: aload_0        
        //   148: aload_1        
        //   149: ldc             "scribed_ref_event"
        //   151: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   154: putfield        mts.n1:Z
        //   157: aload_0        
        //   158: aload_1        
        //   159: ldc             "is_bottom_timeline_out_of_content"
        //   161: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   164: putfield        mts.q1:Z
        //   167: aload_0        
        //   168: aload_1        
        //   169: ldc             "is_top_timeline_out_of_content"
        //   171: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   174: putfield        mts.r1:Z
        //   177: aload_1        
        //   178: ldc             "timeline_title"
        //   180: invokevirtual   android/os/Bundle.getCharSequence:(Ljava/lang/String;)Ljava/lang/CharSequence;
        //   183: astore_1       
        //   184: aload_1        
        //   185: ifnull          199
        //   188: aload_0        
        //   189: getfield        acv.T0:Lz9i;
        //   192: aload_1        
        //   193: invokeinterface z9i.setTitle:(Ljava/lang/CharSequence;)Z
        //   198: pop            
        //   199: aload_0        
        //   200: new             Lmts$a;
        //   203: dup            
        //   204: aload_0        
        //   205: invokespecial   mts$a.<init>:(Lmts;)V
        //   208: putfield        mts.m1:Lmts$a;
        //   211: aload_0        
        //   212: getfield        acv.X0:Llcv;
        //   215: astore_1       
        //   216: aload_1        
        //   217: getfield        lcv.H0:Lk6m;
        //   220: aload_0        
        //   221: invokevirtual   k6m.c:(Lgnf$b;)V
        //   224: aload_1        
        //   225: getfield        lcv.H0:Lk6m;
        //   228: new             Llts;
        //   231: dup            
        //   232: aload_0        
        //   233: invokespecial   lts.<init>:(Lmts;)V
        //   236: invokevirtual   k6m.c:(Lgnf$b;)V
        //   239: aload_0        
        //   240: new             Lulh;
        //   243: dup            
        //   244: invokestatic    kwe.b:()Lgew;
        //   247: aload_0        
        //   248: invokevirtual   mts.h1:()Ljava/lang/String;
        //   251: aload_0        
        //   252: invokevirtual   mts.i1:()Ljava/lang/String;
        //   255: invokestatic    zca.a:(Ljava/lang/String;Ljava/lang/String;)Lada;
        //   258: invokespecial   ulh.<init>:(Lgew;Lada;)V
        //   261: putfield        mts.l1:Lulh;
        //   264: aload_0        
        //   265: getfield        acv.G0:Lnkf;
        //   268: new             Lkg1;
        //   271: dup            
        //   272: aload_0        
        //   273: bipush          6
        //   275: invokespecial   kg1.<init>:(Ljava/lang/Object;I)V
        //   278: invokeinterface nkf.u1:(Lu93;)V
        //   283: aload_0        
        //   284: getfield        acv.G0:Lnkf;
        //   287: new             Lwr2;
        //   290: dup            
        //   291: aload_0        
        //   292: bipush          9
        //   294: invokespecial   wr2.<init>:(Ljava/lang/Object;I)V
        //   297: invokeinterface nkf.c1:(Lu93;)V
        //   302: aload           14
        //   304: aload_0        
        //   305: getfield        acv.X0:Llcv;
        //   308: getfield        lcv.H0:Lk6m;
        //   311: invokevirtual   adx.d:(Lk6m;)V
        //   314: aload_1        
        //   315: getfield        lcv.Q0:Lzml;
        //   318: ldc             Lhm6;.class
        //   320: invokevirtual   b5j.ofType:(Ljava/lang/Class;)Lb5j;
        //   323: new             Ldgk;
        //   326: dup            
        //   327: aload_0        
        //   328: bipush          6
        //   330: invokespecial   dgk.<init>:(Ljava/lang/Object;I)V
        //   333: invokestatic    f.i:(Lb5j;Lu93;)Lb5j;
        //   336: pop            
        //   337: aload_0        
        //   338: invokevirtual   acv.B0:()Z
        //   341: ifne            664
        //   344: aload_0        
        //   345: getfield        acv.X0:Llcv;
        //   348: astore_2       
        //   349: aload_2        
        //   350: getfield        lcv.H0:Lk6m;
        //   353: astore_1       
        //   354: new             Ll71;
        //   357: dup            
        //   358: aload_2        
        //   359: bipush          21
        //   361: invokespecial   l71.<init>:(Ljava/lang/Object;I)V
        //   364: astore_2       
        //   365: aload_0        
        //   366: invokevirtual   acv.c:()Ljn6;
        //   369: invokeinterface jn6.getView:()Landroid/view/View;
        //   374: ldc_w           2131430573
        //   377: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   380: astore_3       
        //   381: new             Lvdk;
        //   384: dup            
        //   385: new             Lydk;
        //   388: dup            
        //   389: aload_1        
        //   390: aload_2        
        //   391: aload_3        
        //   392: invokespecial   ydk.<init>:(Lgnf;Lydk$a;Landroid/view/View;)V
        //   395: invokespecial   vdk.<init>:(Lydk;)V
        //   398: astore_2       
        //   399: aload_0        
        //   400: aload_2        
        //   401: putfield        mts.o1:Lvdk;
        //   404: aload_2        
        //   405: getfield        vdk.b:Ly4e;
        //   408: ifnull          432
        //   411: aload_1        
        //   412: aload_2        
        //   413: getfield        vdk.d:Lvdk$a;
        //   416: invokevirtual   k6m.a:(Lgnf$b;)V
        //   419: aload_2        
        //   420: getfield        vdk.b:Ly4e;
        //   423: aload_2        
        //   424: getfield        vdk.e:Lvdk$b;
        //   427: invokeinterface y4e.e:(Lg4e;)V
        //   432: aload_2        
        //   433: aload           8
        //   435: putfield        vdk.b:Ly4e;
        //   438: aload_2        
        //   439: iconst_1       
        //   440: putfield        vdk.c:Z
        //   443: aload_3        
        //   444: ifnonnull       450
        //   447: goto            519
        //   450: aload_1        
        //   451: getfield        k6m.b:Landroidx/recyclerview/widget/RecyclerView;
        //   454: astore          4
        //   456: aload_3        
        //   457: instanceof      Lcom/twitter/ui/list/PinnedHeaderListViewContainer;
        //   460: ifeq            653
        //   463: aload_3        
        //   464: checkcast       Lcom/twitter/ui/list/PinnedHeaderListViewContainer;
        //   467: astore          5
        //   469: aload           5
        //   471: aload           11
        //   473: invokevirtual   com/twitter/ui/list/PinnedHeaderListViewContainer.setAdapter:(Ludk;)V
        //   476: aload           5
        //   478: aload           4
        //   480: invokevirtual   com/twitter/ui/list/PinnedHeaderListViewContainer.setListView:(Landroid/view/ViewGroup;)V
        //   483: aload           4
        //   485: ldc_w           2131430575
        //   488: aload           5
        //   490: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //   493: aload_3        
        //   494: ldc_w           2131430574
        //   497: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   500: astore_3       
        //   501: aload_3        
        //   502: invokestatic    pf8.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //   505: pop            
        //   506: aload_3        
        //   507: getstatic       xdk.C0:Lxdk;
        //   510: invokevirtual   android/view/View.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
        //   513: aload           11
        //   515: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   518: pop            
        //   519: aload_1        
        //   520: aload_2        
        //   521: getfield        vdk.d:Lvdk$a;
        //   524: invokevirtual   k6m.c:(Lgnf$b;)V
        //   527: aload_2        
        //   528: getfield        vdk.b:Ly4e;
        //   531: aload_2        
        //   532: getfield        vdk.e:Lvdk$b;
        //   535: invokeinterface y4e.b:(Lg4e;)V
        //   540: new             Lc4e;
        //   543: dup            
        //   544: aload           8
        //   546: aload           12
        //   548: aload_0        
        //   549: getfield        acv.O0:Libm;
        //   552: invokespecial   c4e.<init>:(Ly4e;Lx3e;Libm;)V
        //   555: astore_1       
        //   556: aload_1        
        //   557: getfield        c4e.G0:Lz3e;
        //   560: getfield        z3e.b:Lqca;
        //   563: astore_2       
        //   564: aload_2        
        //   565: ldc_w           "<this>"
        //   568: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   571: aload_2        
        //   572: getfield        qca.C0:Lhlr;
        //   575: ldc_w           Lw3e$c;.class
        //   578: invokevirtual   b5j.ofType:(Ljava/lang/Class;)Lb5j;
        //   581: astore_2       
        //   582: aload_2        
        //   583: ldc_w           "ofType(E::class.java)"
        //   586: invokestatic    zzd.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   589: aload_2        
        //   590: getstatic       jts.b:Ljts;
        //   593: invokestatic    f.i:(Lb5j;Lu93;)Lb5j;
        //   596: pop            
        //   597: aload_1        
        //   598: getfield        c4e.G0:Lz3e;
        //   601: getfield        z3e.b:Lqca;
        //   604: invokestatic    tdy.A0:(Lpca;)Lb5j;
        //   607: new             Lngc;
        //   610: dup            
        //   611: aload_0        
        //   612: bipush          9
        //   614: invokespecial   ngc.<init>:(Ljava/lang/Object;I)V
        //   617: invokestatic    f.i:(Lb5j;Lu93;)Lb5j;
        //   620: pop            
        //   621: aload_1        
        //   622: getfield        c4e.G0:Lz3e;
        //   625: getfield        z3e.b:Lqca;
        //   628: invokestatic    tdy.z0:(Lpca;)Lb5j;
        //   631: new             Llg1;
        //   634: dup            
        //   635: aload_0        
        //   636: bipush          6
        //   638: invokespecial   lg1.<init>:(Ljava/lang/Object;I)V
        //   641: invokestatic    f.i:(Lb5j;Lu93;)Lb5j;
        //   644: pop            
        //   645: aload_0        
        //   646: aload_1        
        //   647: putfield        mts.k1:Lc4e;
        //   650: goto            664
        //   653: new             Ljava/lang/IllegalStateException;
        //   656: dup            
        //   657: ldc_w           "Expecting PinnedHeaderListViewContainer as parent of listview!"
        //   660: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   663: athrow         
        //   664: aload_0        
        //   665: getfield        mts.k1:Lc4e;
        //   668: astore_1       
        //   669: aload_1        
        //   670: invokestatic    pf8.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //   673: pop            
        //   674: aload_0        
        //   675: aload_1        
        //   676: invokevirtual   mts.q1:(Lc4e;)V
        //   679: aload_0        
        //   680: getfield        acv.X0:Llcv;
        //   683: astore_1       
        //   684: aload_0        
        //   685: getfield        mts.k1:Lc4e;
        //   688: astore_2       
        //   689: aload           8
        //   691: invokestatic    pf8.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //   694: pop            
        //   695: aload_1        
        //   696: aload_2        
        //   697: aload           8
        //   699: invokevirtual   lcv.Z1:(Landroidx/recyclerview/widget/RecyclerView$e;Ll4e;)V
        //   702: aload           9
        //   704: ifnull          731
        //   707: aload_0        
        //   708: getfield        acv.X0:Llcv;
        //   711: astore_1       
        //   712: new             Lkts;
        //   715: dup            
        //   716: aload_0        
        //   717: aload_1        
        //   718: invokespecial   kts.<init>:(Lmts;Llcv;)V
        //   721: astore_2       
        //   722: aload_1        
        //   723: getfield        lcv.M0:Liuh$a;
        //   726: aload_2        
        //   727: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   730: pop            
        //   731: aload_0        
        //   732: invokevirtual   mts.o1:()V
        //   735: return         
        //    Signature:
        //  (Lybv;Laws;Lqrs;Lzh7<Lvo6;>;Ludf<Lnws;>;Ldsb;Lrpd;Lzoi<Lnws;>;Landroid/content/Context;Luc;Lexs;Lg0t;Lx3e<Lnws;>;Lpca<Lbo;>;Ladx;Ljev;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 16
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public void A1(final int n) {
        Objects.requireNonNull(super.X0);
        p88.f().b(n, 1);
    }
    
    @Override
    public void J0() {
        this.d1(4);
    }
    
    @Override
    public void K0() {
        this.d1(3);
    }
    
    public final long L() {
        final wts wts = new wts(aav.J2(super.F0));
        final aws b1 = this.b1;
        ij1.f();
        final String j = wts.j(b1);
        final Map k = wts.k();
        long longValue;
        if (!k.containsKey(j)) {
            longValue = 0L;
        }
        else {
            longValue = k.get(j);
        }
        return longValue;
    }
    
    @Deprecated
    @Override
    public void L0() {
        super.L0();
    }
    
    @Override
    public void M0() {
        super.M0();
        if (super.E0.getId() > 0L && this.F0() && this.m1()) {
            this.d1(3);
        }
        psc.c().e((ksc$a)this.m1);
        this.g1.c((ViewGroup)super.X0.H0.b);
    }
    
    @Deprecated
    public final void O(final int n) {
    }
    
    @Override
    public void O0(final i4e<nws> i4e) {
        this.h1.d();
        super.O0(i4e);
        final ba9 n0 = super.N0;
        final boolean m1 = this.m1();
        final boolean e = ((v4f)n0.D0).e();
        int e2 = 0;
        if (e) {
            if (m1) {
                e2 = e2;
                if (((v4f)n0.D0).c()) {
                    ((y81)n0.E0).V();
                    e2 = 1;
                }
            }
            else {
                e2 = (n0.e(false) ? 1 : 0);
            }
        }
        if (e2 == 0) {
            this.r1();
        }
    }
    
    @Override
    public void Q0(final Bundle bundle) {
        super.Q0(bundle);
        bundle.putBoolean("scribed_ref_event", this.n1);
        this.h1.c(bundle);
        if (super.T0.f() != null) {
            bundle.putCharSequence("timeline_title", super.T0.f().getTitle());
        }
        bundle.putBoolean("is_bottom_timeline_out_of_content", this.q1);
        bundle.putBoolean("is_top_timeline_out_of_content", this.r1);
    }
    
    @Override
    public void S0() {
        this.w1(super.F0);
        this.i1.e();
        psc.c().g((ksc$a)this.m1);
        this.g1.b();
        super.S0();
    }
    
    @Override
    public void T0() {
        this.d1(2);
    }
    
    @Deprecated
    public final void W(final gnf gnf) {
    }
    
    public final boolean Z() {
        return this.r1;
    }
    
    @Deprecated
    public final void d0(final gnf gnf) {
    }
    
    public final void d1(final int n) {
        ((pba)super.G0).e((Object)new hkf(n));
    }
    
    public long e1() {
        final qrs g1 = this.g1();
        final long h = dta.b().h("timeline_auto_refresh_on_foreground_timeout_millis", 60000L);
        final long long1 = ((BaseBundle)((zl1)g1).a).getLong("arg_auto_refresh_timeout_millis", 0L);
        long n;
        if (long1 != 0L) {
            n = Math.max(0L, long1);
        }
        else {
            n = Math.max(0L, h);
        }
        return n;
    }
    
    @Deprecated
    public final void f(final gnf gnf) {
    }
    
    public final boolean f0() {
        return this.B0() && this.m1();
    }
    
    public int f1() {
        return 2131959216;
    }
    
    public qrs g1() {
        return this.e1;
    }
    
    public final boolean h() {
        return this.q1;
    }
    
    public final String h1() {
        return this.g1().j();
    }
    
    @Override
    public boolean i0() {
        return this instanceof pb5;
    }
    
    public final String i1() {
        return this.g1().l();
    }
    
    public final i4e<nws> j1() {
        i4e<Object> i4e;
        if (this.B0() && this.v0().c()) {
            i4e = this.v0().f();
            final int a = w4j.a;
        }
        else {
            i4e = i4e.j();
        }
        return (i4e<nws>)i4e;
    }
    
    public void k1(final tsc tsc, int f1) {
        if (tsc.c == 401) {
            f1 = 2131959229;
        }
        else if (!tsc.a.getBoolean("cancelled_no_messaging_required")) {
            f1 = this.f1();
        }
        else {
            f1 = 0;
        }
        if (f1 != 0) {
            this.A1(f1);
            super.X0.O0.I0 = true;
            this.v1("request_error");
        }
    }
    
    public final boolean l1() {
        final long l = this.L();
        final long e1 = this.e1();
        final t3s a = mq1.a;
        return e1 + l < System.currentTimeMillis();
    }
    
    public boolean m1() {
        final boolean b0 = this.B0();
        boolean b2 = false;
        if (b0) {
            if (this.v0().c()) {
                b2 = b2;
                if (!this.v0().f().isEmpty()) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    @Deprecated
    public final void n(final gnf gnf) {
        if (this.B0() && ((y4e)this.v0()).a() > 0) {
            final int m = this.g1().m();
            this.y1(this.j1().getSize() >= m, m);
        }
    }
    
    @Override
    public v4f o0() {
        return (v4f)new b();
    }
    
    public void o1() {
    }
    
    @Deprecated
    public void p(final gnf gnf) {
    }
    
    public void p1(final gkf$a gkf$a) {
        super.X0.e2();
        super.X0.O0.I0 = true;
    }
    
    public void q1(final c4e<nws> c4e) {
    }
    
    public void r1() {
        final zf4.a a = new zf4.a(super.F0);
        a.o(this.h1(), this.i1(), null, null, "load_finished");
        final zf4 zf4 = (zf4)a.e();
        zf4.a = cro.d;
        final int a2 = w4j.a;
        saw.b((okm)zf4);
    }
    
    public void s1(final View view, final nws nws, final int n) {
        if (nws != null) {
            this.g1.e(view, (Object)nws);
        }
        final vdk o1 = this.o1;
        if (o1 != null && o1.c && ((lcv)((l71)o1.a.b).D0).E1().a()) {
            o1.a(((lcv)((l71)o1.a.b).D0).E1().c);
            o1.c = false;
        }
        if (nws != null) {
            this.i1.j(nws);
        }
        if (this.l1 != null && nws != null) {
            final amh b = nws.b;
            if (b != null) {
                this.x1(b, n);
            }
        }
    }
    
    @Deprecated
    public void t(final gnf gnf, final int n, final int n2, final int n3, final boolean b) {
    }
    
    public void t1() {
        if (this.B0()) {
            final l4e<nws> v0 = this.v0();
            final int a = w4j.a;
            ((zoi)v0).g();
        }
    }
    
    public final void u1() {
        final wts wts = new wts(aav.J2(super.F0));
        final aws b1 = this.b1;
        final t3s a = mq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        ij1.f();
        wts.k().put(wts.j(b1), currentTimeMillis);
    }
    
    public void v1(final String s) {
        saw.b((okm)new zf4(super.F0, nca.g(this.h1(), this.i1(), s, "", "set")));
        final z8a z8a = new z8a();
        ((HashMap<String, String>)z8a.a).put("timeline_error_component", s);
        z8a.b = new IllegalStateException("Timeline entered an Error state");
        e9a.c(z8a);
    }
    
    @Deprecated
    public void w(final gnf gnf, final int n) {
    }
    
    public void w1(final UserIdentifier userIdentifier) {
        final udf<nws> g1 = this.g1;
        final t3s a = mq1.a;
        g1.d(userIdentifier, System.currentTimeMillis());
    }
    
    public void x1(final amh amh, int a) {
        final ulh l1 = this.l1;
        Objects.requireNonNull(l1);
        if (amh.b != null && ((gzm)l1).i((Object)amh.c)) {
            final String b = ((tca)l1.E0).b();
            final String d = l1.E0.d();
            final qzo b2 = amh.b;
            final zf4 zf4 = new zf4(new String[] { b, d, b2.f, b2.g, "impression" });
            zf4.i((szo)vpv.a(amh.b));
            zf4.y = a;
            a = w4j.a;
            saw.b((okm)zf4);
        }
    }
    
    @Deprecated
    public void y1(final boolean b, final int n) {
    }
    
    public void z1(final nws nws, final View view) {
        final g5t g5t = (g5t)zew.a().c((Class)g5t.class);
        nws nws2 = nws;
        if (nws instanceof crv) {
            final atu l = ((crv)nws).l;
            nws2 = nws;
            if (l != null) {
                final long g = l.k.G();
                nws2 = nws;
                if (g5t.r7().contains(g)) {
                    nws2 = (nws)l;
                }
            }
        }
        final nus c = nws2.c();
        if (view instanceof GroupedRowView) {
            final int a = w4j.a;
            ajy.J((GroupedRowView)view, c.m, c.n);
        }
    }
    
    public final class a implements ksc$a<kmm<?, ?>>
    {
        public final void b(final cw0 cw0) {
            final kmm kmm = (kmm)cw0;
            if (kmm instanceof p47) {
                final mts c0 = mts.this;
                final p47 p = (p47)kmm;
                if (c0.B0() && !((ksc)p).T().b) {
                    final l4e<nws> v0 = c0.v0();
                    final int a = w4j.a;
                    ((zoi)v0).g();
                }
            }
            else if (kmm instanceof ys8) {
                final mts c2 = mts.this;
                final ys8 ys8 = (ys8)kmm;
                Objects.requireNonNull(c2);
            }
        }
    }
    
    public final class b extends acv.a
    {
        @Override
        public final boolean c() {
            return mts.this.l1();
        }
        
        @Override
        public final boolean d() {
            return mts.this.g1().q() && mts.this.l1();
        }
    }
}
