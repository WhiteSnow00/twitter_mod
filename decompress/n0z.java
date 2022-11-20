import java.util.Objects;
import java.math.BigInteger;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0z extends x1z
{
    public String F0;
    public String G0;
    public int H0;
    public String I0;
    public long J0;
    public final long K0;
    public List L0;
    public String M0;
    public int N0;
    public String O0;
    public String P0;
    public String Q0;
    public long R0;
    public String S0;
    
    public n0z(final n8z n8z, final long k0) {
        super(n8z);
        this.R0 = 0L;
        this.S0 = null;
        this.K0 = k0;
    }
    
    public final boolean j() {
        return true;
    }
    
    @EnsuresNonNull({ "appId", "appStore", "appName", "gmpAppId", "gaAppId" })
    public final void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pbz.D0:Ln8z;
        //     4: getfield        n8z.D0:Landroid/content/Context;
        //     7: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    10: astore          10
        //    12: aload_0        
        //    13: getfield        pbz.D0:Ln8z;
        //    16: getfield        n8z.D0:Landroid/content/Context;
        //    19: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    22: astore          9
        //    24: ldc             "unknown"
        //    26: astore          5
        //    28: ldc             "Unknown"
        //    30: astore          4
        //    32: ldc             -2147483648
        //    34: istore_2       
        //    35: ldc             ""
        //    37: astore          8
        //    39: aload           9
        //    41: ifnonnull       77
        //    44: aload_0        
        //    45: getfield        pbz.D0:Ln8z;
        //    48: invokevirtual   n8z.b:()Lq2z;
        //    51: getfield        q2z.I0:Ln1z;
        //    54: ldc             "PackageManager is null, app identity information might be inaccurate. appId"
        //    56: aload           10
        //    58: invokestatic    q2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //    61: invokevirtual   n1z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //    64: aload           5
        //    66: astore          7
        //    68: aload           4
        //    70: astore          5
        //    72: iload_2        
        //    73: istore_1       
        //    74: goto            284
        //    77: aload           9
        //    79: aload           10
        //    81: invokevirtual   android/content/pm/PackageManager.getInstallerPackageName:(Ljava/lang/String;)Ljava/lang/String;
        //    84: astore_3       
        //    85: aload_3        
        //    86: astore          5
        //    88: goto            112
        //    91: astore_3       
        //    92: aload_0        
        //    93: getfield        pbz.D0:Ln8z;
        //    96: invokevirtual   n8z.b:()Lq2z;
        //    99: getfield        q2z.I0:Ln1z;
        //   102: ldc             "Error retrieving app installer package name. appId"
        //   104: aload           10
        //   106: invokestatic    q2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   109: invokevirtual   n1z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   112: aload           5
        //   114: ifnonnull       123
        //   117: ldc             "manual_install"
        //   119: astore_3       
        //   120: goto            139
        //   123: aload           5
        //   125: astore_3       
        //   126: ldc             "com.android.vending"
        //   128: aload           5
        //   130: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   133: ifeq            139
        //   136: ldc             ""
        //   138: astore_3       
        //   139: aload           9
        //   141: aload_0        
        //   142: getfield        pbz.D0:Ln8z;
        //   145: getfield        n8z.D0:Landroid/content/Context;
        //   148: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   151: iconst_0       
        //   152: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   155: astore          11
        //   157: aload_3        
        //   158: astore          7
        //   160: aload           4
        //   162: astore          5
        //   164: iload_2        
        //   165: istore_1       
        //   166: aload           11
        //   168: ifnull          284
        //   171: aload           9
        //   173: aload           11
        //   175: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   178: invokevirtual   android/content/pm/PackageManager.getApplicationLabel:(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
        //   181: astore          5
        //   183: aload           5
        //   185: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   188: ifne            203
        //   191: aload           5
        //   193: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   198: astore          5
        //   200: goto            207
        //   203: ldc             "Unknown"
        //   205: astore          5
        //   207: aload           11
        //   209: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //   212: astore          6
        //   214: aload           6
        //   216: astore          4
        //   218: aload           11
        //   220: getfield        android/content/pm/PackageInfo.versionCode:I
        //   223: istore_1       
        //   224: aload_3        
        //   225: astore          7
        //   227: aload           6
        //   229: astore          5
        //   231: goto            284
        //   234: astore          6
        //   236: aload           5
        //   238: astore          6
        //   240: aload           4
        //   242: astore          5
        //   244: goto            257
        //   247: astore          5
        //   249: ldc             "Unknown"
        //   251: astore          5
        //   253: aload           4
        //   255: astore          6
        //   257: aload_0        
        //   258: getfield        pbz.D0:Ln8z;
        //   261: invokevirtual   n8z.b:()Lq2z;
        //   264: getfield        q2z.I0:Ln1z;
        //   267: ldc             "Error retrieving package info. appId, appName"
        //   269: aload           10
        //   271: invokestatic    q2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   274: aload           6
        //   276: invokevirtual   n1z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   279: iload_2        
        //   280: istore_1       
        //   281: aload_3        
        //   282: astore          7
        //   284: aload_0        
        //   285: aload           10
        //   287: putfield        n0z.F0:Ljava/lang/String;
        //   290: aload_0        
        //   291: aload           7
        //   293: putfield        n0z.I0:Ljava/lang/String;
        //   296: aload_0        
        //   297: aload           5
        //   299: putfield        n0z.G0:Ljava/lang/String;
        //   302: aload_0        
        //   303: iload_1        
        //   304: putfield        n0z.H0:I
        //   307: aload_0        
        //   308: lconst_0       
        //   309: putfield        n0z.J0:J
        //   312: aload_0        
        //   313: getfield        pbz.D0:Ln8z;
        //   316: getfield        n8z.E0:Ljava/lang/String;
        //   319: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   322: ifne            345
        //   325: ldc             "am"
        //   327: aload_0        
        //   328: getfield        pbz.D0:Ln8z;
        //   331: getfield        n8z.F0:Ljava/lang/String;
        //   334: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   337: ifeq            345
        //   340: iconst_1       
        //   341: istore_1       
        //   342: goto            347
        //   345: iconst_0       
        //   346: istore_1       
        //   347: aload_0        
        //   348: getfield        pbz.D0:Ln8z;
        //   351: invokevirtual   n8z.n:()I
        //   354: istore_2       
        //   355: iload_2        
        //   356: tableswitch {
        //                0: 541
        //                1: 523
        //                2: 505
        //                3: 487
        //                4: 469
        //                5: 451
        //                6: 433
        //                7: 415
        //          default: 404
        //        }
        //   404: aload_0        
        //   405: getfield        pbz.D0:Ln8z;
        //   408: invokevirtual   n8z.b:()Lq2z;
        //   411: astore_3       
        //   412: goto            559
        //   415: aload_0        
        //   416: getfield        pbz.D0:Ln8z;
        //   419: invokevirtual   n8z.b:()Lq2z;
        //   422: getfield        q2z.O0:Ln1z;
        //   425: ldc             "App measurement disabled via the global data collection setting"
        //   427: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   430: goto            568
        //   433: aload_0        
        //   434: getfield        pbz.D0:Ln8z;
        //   437: invokevirtual   n8z.b:()Lq2z;
        //   440: getfield        q2z.N0:Ln1z;
        //   443: ldc             "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
        //   445: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   448: goto            568
        //   451: aload_0        
        //   452: getfield        pbz.D0:Ln8z;
        //   455: invokevirtual   n8z.b:()Lq2z;
        //   458: getfield        q2z.Q0:Ln1z;
        //   461: ldc             "App measurement disabled via the init parameters"
        //   463: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   466: goto            568
        //   469: aload_0        
        //   470: getfield        pbz.D0:Ln8z;
        //   473: invokevirtual   n8z.b:()Lq2z;
        //   476: getfield        q2z.O0:Ln1z;
        //   479: ldc             "App measurement disabled via the manifest"
        //   481: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   484: goto            568
        //   487: aload_0        
        //   488: getfield        pbz.D0:Ln8z;
        //   491: invokevirtual   n8z.b:()Lq2z;
        //   494: getfield        q2z.O0:Ln1z;
        //   497: ldc             "App measurement disabled by setAnalyticsCollectionEnabled(false)"
        //   499: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   502: goto            568
        //   505: aload_0        
        //   506: getfield        pbz.D0:Ln8z;
        //   509: invokevirtual   n8z.b:()Lq2z;
        //   512: getfield        q2z.Q0:Ln1z;
        //   515: ldc             "App measurement deactivated via the init parameters"
        //   517: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   520: goto            568
        //   523: aload_0        
        //   524: getfield        pbz.D0:Ln8z;
        //   527: invokevirtual   n8z.b:()Lq2z;
        //   530: getfield        q2z.O0:Ln1z;
        //   533: ldc             "App measurement deactivated via the manifest"
        //   535: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   538: goto            568
        //   541: aload_0        
        //   542: getfield        pbz.D0:Ln8z;
        //   545: invokevirtual   n8z.b:()Lq2z;
        //   548: getfield        q2z.Q0:Ln1z;
        //   551: ldc             "App measurement collection enabled"
        //   553: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   556: goto            568
        //   559: aload_3        
        //   560: getfield        q2z.O0:Ln1z;
        //   563: ldc             "App measurement disabled due to denied storage consent"
        //   565: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   568: aload_0        
        //   569: ldc             ""
        //   571: putfield        n0z.O0:Ljava/lang/String;
        //   574: aload_0        
        //   575: ldc             ""
        //   577: putfield        n0z.P0:Ljava/lang/String;
        //   580: aload_0        
        //   581: getfield        pbz.D0:Ln8z;
        //   584: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   587: pop            
        //   588: iload_1        
        //   589: ifeq            603
        //   592: aload_0        
        //   593: aload_0        
        //   594: getfield        pbz.D0:Ln8z;
        //   597: getfield        n8z.E0:Ljava/lang/String;
        //   600: putfield        n0z.P0:Ljava/lang/String;
        //   603: aconst_null    
        //   604: astore          5
        //   606: aload_0        
        //   607: getfield        pbz.D0:Ln8z;
        //   610: astore_3       
        //   611: aload_3        
        //   612: getfield        n8z.D0:Landroid/content/Context;
        //   615: aload_3        
        //   616: getfield        n8z.V0:Ljava/lang/String;
        //   619: invokestatic    wd.G:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   622: astore          4
        //   624: aload           8
        //   626: astore_3       
        //   627: iconst_1       
        //   628: aload           4
        //   630: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   633: if_icmpeq       639
        //   636: aload           4
        //   638: astore_3       
        //   639: aload_0        
        //   640: aload_3        
        //   641: putfield        n0z.O0:Ljava/lang/String;
        //   644: aload           4
        //   646: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   649: ifne            732
        //   652: aload_0        
        //   653: getfield        pbz.D0:Ln8z;
        //   656: astore_3       
        //   657: aload_3        
        //   658: getfield        n8z.D0:Landroid/content/Context;
        //   661: astore          6
        //   663: aload_3        
        //   664: getfield        n8z.V0:Ljava/lang/String;
        //   667: astore_3       
        //   668: aload           6
        //   670: invokestatic    eli.q:(Ljava/lang/Object;)Ljava/lang/Object;
        //   673: pop            
        //   674: aload           6
        //   676: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   679: astore          4
        //   681: aload_3        
        //   682: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   685: ifne            691
        //   688: goto            697
        //   691: aload           6
        //   693: invokestatic    k7z.a:(Landroid/content/Context;)Ljava/lang/String;
        //   696: astore_3       
        //   697: aload           4
        //   699: ldc             "admob_app_id"
        //   701: ldc             "string"
        //   703: aload_3        
        //   704: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   707: istore_1       
        //   708: iload_1        
        //   709: ifne            715
        //   712: goto            725
        //   715: aload           4
        //   717: iload_1        
        //   718: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   721: astore_3       
        //   722: goto            727
        //   725: aconst_null    
        //   726: astore_3       
        //   727: aload_0        
        //   728: aload_3        
        //   729: putfield        n0z.P0:Ljava/lang/String;
        //   732: iload_2        
        //   733: ifne            812
        //   736: aload_0        
        //   737: getfield        pbz.D0:Ln8z;
        //   740: invokevirtual   n8z.b:()Lq2z;
        //   743: getfield        q2z.Q0:Ln1z;
        //   746: astore          6
        //   748: aload_0        
        //   749: getfield        n0z.F0:Ljava/lang/String;
        //   752: astore          4
        //   754: aload_0        
        //   755: getfield        n0z.O0:Ljava/lang/String;
        //   758: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   761: ifeq            772
        //   764: aload_0        
        //   765: getfield        n0z.P0:Ljava/lang/String;
        //   768: astore_3       
        //   769: goto            777
        //   772: aload_0        
        //   773: getfield        n0z.O0:Ljava/lang/String;
        //   776: astore_3       
        //   777: aload           6
        //   779: ldc             "App measurement enabled for app package, google app id"
        //   781: aload           4
        //   783: aload_3        
        //   784: invokevirtual   n1z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   787: goto            812
        //   790: astore_3       
        //   791: aload_0        
        //   792: getfield        pbz.D0:Ln8z;
        //   795: invokevirtual   n8z.b:()Lq2z;
        //   798: getfield        q2z.I0:Ln1z;
        //   801: ldc             "Fetching Google App Id failed with exception. appId"
        //   803: aload           10
        //   805: invokestatic    q2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   808: aload_3        
        //   809: invokevirtual   n1z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   812: aload_0        
        //   813: aconst_null    
        //   814: putfield        n0z.L0:Ljava/util/List;
        //   817: aload_0        
        //   818: getfield        pbz.D0:Ln8z;
        //   821: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   824: pop            
        //   825: aload_0        
        //   826: getfield        pbz.D0:Ln8z;
        //   829: getfield        n8z.J0:Lzby;
        //   832: astore          6
        //   834: aload           6
        //   836: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   839: pop            
        //   840: ldc_w           "analytics.safelisted_events"
        //   843: invokestatic    eli.n:(Ljava/lang/String;)Ljava/lang/String;
        //   846: pop            
        //   847: aload           6
        //   849: invokevirtual   zby.r:()Landroid/os/Bundle;
        //   852: astore_3       
        //   853: aload_3        
        //   854: ifnonnull       877
        //   857: aload           6
        //   859: getfield        pbz.D0:Ln8z;
        //   862: invokevirtual   n8z.b:()Lq2z;
        //   865: getfield        q2z.I0:Ln1z;
        //   868: ldc_w           "Failed to load metadata: Metadata bundle is null"
        //   871: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   874: goto            887
        //   877: aload_3        
        //   878: ldc_w           "analytics.safelisted_events"
        //   881: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   884: ifne            893
        //   887: aconst_null    
        //   888: astore          4
        //   890: goto            905
        //   893: aload_3        
        //   894: ldc_w           "analytics.safelisted_events"
        //   897: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;)I
        //   900: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   903: astore          4
        //   905: aload           5
        //   907: astore_3       
        //   908: aload           4
        //   910: ifnull          973
        //   913: aload           6
        //   915: getfield        pbz.D0:Ln8z;
        //   918: getfield        n8z.D0:Landroid/content/Context;
        //   921: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   924: aload           4
        //   926: invokevirtual   java/lang/Integer.intValue:()I
        //   929: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   932: astore_3       
        //   933: aload_3        
        //   934: ifnonnull       943
        //   937: aload           5
        //   939: astore_3       
        //   940: goto            973
        //   943: aload_3        
        //   944: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   947: astore_3       
        //   948: goto            973
        //   951: astore_3       
        //   952: aload           6
        //   954: getfield        pbz.D0:Ln8z;
        //   957: invokevirtual   n8z.b:()Lq2z;
        //   960: getfield        q2z.I0:Ln1z;
        //   963: ldc_w           "Failed to load string array from metadata: resource not found"
        //   966: aload_3        
        //   967: invokevirtual   n1z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   970: aload           5
        //   972: astore_3       
        //   973: aload_3        
        //   974: ifnonnull       980
        //   977: goto            1059
        //   980: aload_3        
        //   981: invokeinterface java/util/List.isEmpty:()Z
        //   986: ifeq            1008
        //   989: aload_0        
        //   990: getfield        pbz.D0:Ln8z;
        //   993: invokevirtual   n8z.b:()Lq2z;
        //   996: getfield        q2z.N0:Ln1z;
        //   999: ldc_w           "Safelisted event list is empty. Ignoring"
        //  1002: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //  1005: goto            1064
        //  1008: aload_3        
        //  1009: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1014: astore          4
        //  1016: aload           4
        //  1018: invokeinterface java/util/Iterator.hasNext:()Z
        //  1023: ifeq            1059
        //  1026: aload           4
        //  1028: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1033: checkcast       Ljava/lang/String;
        //  1036: astore          5
        //  1038: aload_0        
        //  1039: getfield        pbz.D0:Ln8z;
        //  1042: invokevirtual   n8z.B:()Llpz;
        //  1045: ldc_w           "safelisted event"
        //  1048: aload           5
        //  1050: invokevirtual   lpz.P:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1053: ifne            1016
        //  1056: goto            1064
        //  1059: aload_0        
        //  1060: aload_3        
        //  1061: putfield        n0z.L0:Ljava/util/List;
        //  1064: aload           9
        //  1066: ifnull          1084
        //  1069: aload_0        
        //  1070: aload_0        
        //  1071: getfield        pbz.D0:Ln8z;
        //  1074: getfield        n8z.D0:Landroid/content/Context;
        //  1077: invokestatic    psd.b:(Landroid/content/Context;)Z
        //  1080: putfield        n0z.N0:I
        //  1083: return         
        //  1084: aload_0        
        //  1085: iconst_0       
        //  1086: putfield        n0z.N0:I
        //  1089: return         
        //  1090: astore_3       
        //  1091: goto            725
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  77     85     91     112    Ljava/lang/IllegalArgumentException;
        //  139    157    247    257    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  171    200    247    257    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  207    214    234    247    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  218    224    234    247    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  606    624    790    812    Ljava/lang/IllegalStateException;
        //  627    636    790    812    Ljava/lang/IllegalStateException;
        //  639    688    790    812    Ljava/lang/IllegalStateException;
        //  691    697    790    812    Ljava/lang/IllegalStateException;
        //  697    708    790    812    Ljava/lang/IllegalStateException;
        //  715    722    1090   1094   Landroid/content/res/Resources$NotFoundException;
        //  715    722    790    812    Ljava/lang/IllegalStateException;
        //  727    732    790    812    Ljava/lang/IllegalStateException;
        //  736    769    790    812    Ljava/lang/IllegalStateException;
        //  772    777    790    812    Ljava/lang/IllegalStateException;
        //  777    787    790    812    Ljava/lang/IllegalStateException;
        //  913    933    951    973    Landroid/content/res/Resources$NotFoundException;
        //  943    948    951    973    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0715:
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
    
    public final String l() {
        this.h();
        eli.q(this.F0);
        return this.F0;
    }
    
    public final String m() {
        xtz.E0.b().a();
        if (((pbz)this).D0.J0.t(null, uzy.j0)) {
            ((axy)this).g();
        }
        this.h();
        eli.q(this.O0);
        return this.O0;
    }
    
    public final void n() {
        ((axy)this).g();
        String format;
        if (!((pbz)this).D0.u().o().f(gcy.F0)) {
            ((pbz)this).D0.b().P0.a("Analytics Storage consent is not granted");
            format = null;
        }
        else {
            final byte[] array = new byte[16];
            ((pbz)this).D0.B().s().nextBytes(array);
            format = String.format(Locale.US, "%032x", new BigInteger(1, array));
        }
        final n1z p0 = ((pbz)this).D0.b().P0;
        String s;
        if (format == null) {
            s = "null";
        }
        else {
            s = "not null";
        }
        p0.a(String.format("Resetting session stitching token to %s", s));
        this.Q0 = format;
        Objects.requireNonNull(((pbz)this).D0.Q0);
        this.R0 = System.currentTimeMillis();
    }
}
