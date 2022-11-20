import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zag implements Callable
{
    public final int D0;
    public final Object E0;
    
    public zag(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Object call() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        zag.D0:I
        //     4: istore_1       
        //     5: aconst_null    
        //     6: astore          8
        //     8: aconst_null    
        //     9: astore          7
        //    11: iload_1        
        //    12: tableswitch {
        //                0: 602
        //                1: 579
        //                2: 316
        //                3: 303
        //                4: 290
        //                5: 97
        //                6: 59
        //          default: 56
        //        }
        //    56: goto            1044
        //    59: aload_0        
        //    60: getfield        zag.E0:Ljava/lang/Object;
        //    63: checkcast       Lydr;
        //    66: astore          7
        //    68: aload           7
        //    70: ldc             "this$0"
        //    72: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    75: aload           7
        //    77: getfield        ydr.P0:Lnnl;
        //    80: astore          7
        //    82: getstatic       fzv.a:Lfzv;
        //    85: astore          8
        //    87: aload           7
        //    89: aload           8
        //    91: invokevirtual   nnl.onNext:(Ljava/lang/Object;)V
        //    94: aload           8
        //    96: areturn        
        //    97: aload_0        
        //    98: getfield        zag.E0:Ljava/lang/Object;
        //   101: checkcast       Lh2c;
        //   104: astore          9
        //   106: aload           9
        //   108: getfield        h2c.Y1:Lcom/twitter/util/user/UserIdentifier;
        //   111: invokestatic    e8w.a:(Lcom/twitter/util/user/UserIdentifier;)Le8w;
        //   114: astore          8
        //   116: aload           9
        //   118: invokevirtual   androidx/fragment/app/Fragment.N0:()Landroid/content/Context;
        //   121: ldc             2131954173
        //   123: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   126: astore          9
        //   128: aload           8
        //   130: getfield        e8w.d:Ly99;
        //   133: invokevirtual   np1.T:()Ltwo;
        //   136: ldc             Ld8w;.class
        //   138: invokeinterface two.f:(Ljava/lang/Class;)Lulq;
        //   143: checkcast       Ld8w;
        //   146: invokeinterface ulq.c:()Lamq;
        //   151: astore          11
        //   153: new             Losl$a;
        //   156: dup            
        //   157: invokespecial   osl$a.<init>:()V
        //   160: astore          10
        //   162: aload           10
        //   164: ldc             "gif_usage_count"
        //   166: aload           8
        //   168: getfield        e8w.a:I
        //   171: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   174: invokestatic    itl.e:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   177: invokevirtual   fp1$a.s:(Ljava/lang/String;)Lfp1$a;
        //   180: pop            
        //   181: aload           10
        //   183: ldc             "gif_usage_count DESC, time_stamp DESC"
        //   185: invokevirtual   fp1$a.r:(Ljava/lang/String;)Lfp1$a;
        //   188: pop            
        //   189: aload           11
        //   191: aload           10
        //   193: invokevirtual   n4j.e:()Ljava/lang/Object;
        //   196: checkcast       Losl;
        //   199: invokeinterface amq.e:(Losl;)Ly0m;
        //   204: astore          8
        //   206: aload           8
        //   208: invokevirtual   y0m.moveToFirst:()Z
        //   211: ifeq            252
        //   214: new             Lkmb;
        //   217: dup            
        //   218: aload           9
        //   220: ldc             "frequently_used"
        //   222: aload           8
        //   224: invokevirtual   y0m.a:()Ljava/lang/Object;
        //   227: checkcast       Ld8w$a;
        //   230: invokeinterface d8w$a.a:()[B
        //   235: getstatic       nmb.i:Lnmb$a;
        //   238: invokestatic    klp.a:([BLrlp;)Ljava/lang/Object;
        //   241: checkcast       Lnmb;
        //   244: getfield        nmb.f:Landroid/util/SparseArray;
        //   247: invokespecial   kmb.<init>:(Ljava/lang/String;Ljava/lang/String;Landroid/util/SparseArray;)V
        //   250: astore          7
        //   252: aload           8
        //   254: invokevirtual   y0m.close:()V
        //   257: aload           7
        //   259: invokestatic    ynj.b:(Ljava/lang/Object;)Lynj;
        //   262: areturn        
        //   263: astore          7
        //   265: aload           8
        //   267: ifnull          287
        //   270: aload           8
        //   272: invokevirtual   y0m.close:()V
        //   275: goto            287
        //   278: astore          8
        //   280: aload           7
        //   282: aload           8
        //   284: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   287: aload           7
        //   289: athrow         
        //   290: aload_0        
        //   291: getfield        zag.E0:Ljava/lang/Object;
        //   294: checkcast       Lenv;
        //   297: ldc             2131296262
        //   299: invokevirtual   env.c:(I)Landroid/graphics/Typeface;
        //   302: areturn        
        //   303: aload_0        
        //   304: getfield        zag.E0:Ljava/lang/Object;
        //   307: checkcast       Lmq;
        //   310: invokeinterface mq.get:()Llq;
        //   315: areturn        
        //   316: aload_0        
        //   317: getfield        zag.E0:Ljava/lang/Object;
        //   320: checkcast       Ljava/lang/String;
        //   323: astore          7
        //   325: getstatic       jq0.a:I
        //   328: istore_1       
        //   329: iconst_0       
        //   330: istore          6
        //   332: iconst_0       
        //   333: istore          4
        //   335: iload           6
        //   337: istore          5
        //   339: new             Ljava/lang/StringBuilder;
        //   342: astore          8
        //   344: iload           6
        //   346: istore          5
        //   348: aload           8
        //   350: invokespecial   java/lang/StringBuilder.<init>:()V
        //   353: iload           6
        //   355: istore          5
        //   357: aload           8
        //   359: ldc             "Checking url "
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: pop            
        //   365: iload           6
        //   367: istore          5
        //   369: aload           8
        //   371: aload           7
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: pop            
        //   377: iload           6
        //   379: istore          5
        //   381: ldc             "jq0"
        //   383: aload           8
        //   385: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   388: invokestatic    s9g.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   391: iload           6
        //   393: istore          5
        //   395: new             Ljava/net/URL;
        //   398: astore          8
        //   400: iload           6
        //   402: istore          5
        //   404: aload           8
        //   406: aload           7
        //   408: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   411: iload           6
        //   413: istore          5
        //   415: aload           8
        //   417: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //   420: checkcast       Ljava/net/HttpURLConnection;
        //   423: astore          7
        //   425: aload           7
        //   427: iconst_0       
        //   428: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //   431: aload           7
        //   433: sipush          500
        //   436: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   439: new             Ljava/lang/StringBuilder;
        //   442: astore          8
        //   444: aload           8
        //   446: invokespecial   java/lang/StringBuilder.<init>:()V
        //   449: aload           8
        //   451: ldc_w           "Connection timeout set to "
        //   454: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   457: pop            
        //   458: aload           8
        //   460: aload           7
        //   462: invokevirtual   java/net/URLConnection.getConnectTimeout:()I
        //   465: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   468: pop            
        //   469: ldc             "jq0"
        //   471: aload           8
        //   473: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   476: invokestatic    s9g.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   479: aload           7
        //   481: invokevirtual   java/net/URLConnection.connect:()V
        //   484: aload           7
        //   486: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   489: istore_1       
        //   490: new             Ljava/lang/StringBuilder;
        //   493: astore          8
        //   495: aload           8
        //   497: invokespecial   java/lang/StringBuilder.<init>:()V
        //   500: aload           8
        //   502: ldc_w           "Resource is "
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: pop            
        //   509: aload           8
        //   511: iload_1        
        //   512: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   515: pop            
        //   516: ldc             "jq0"
        //   518: aload           8
        //   520: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   523: invokestatic    s9g.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   526: iload_1        
        //   527: sipush          301
        //   530: if_icmpeq       540
        //   533: iload_1        
        //   534: sipush          302
        //   537: if_icmpne       543
        //   540: iconst_1       
        //   541: istore          4
        //   543: iload           4
        //   545: istore          5
        //   547: aload           7
        //   549: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   552: goto            573
        //   555: astore          8
        //   557: iload           6
        //   559: istore          5
        //   561: aload           7
        //   563: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   566: iload           6
        //   568: istore          5
        //   570: aload           8
        //   572: athrow         
        //   573: iload           4
        //   575: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   578: areturn        
        //   579: aload_0        
        //   580: getfield        zag.E0:Ljava/lang/Object;
        //   583: checkcast       Lack;
        //   586: astore          7
        //   588: aload           7
        //   590: ldc_w           "$phoneNumberReader"
        //   593: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   596: aload           7
        //   598: invokevirtual   ack.a:()Lrt8;
        //   601: areturn        
        //   602: aload_0        
        //   603: getfield        zag.E0:Ljava/lang/Object;
        //   606: checkcast       Lebg;
        //   609: astore          7
        //   611: aload           7
        //   613: getfield        ebg.I0:Lcom/twitter/util/user/UserIdentifier;
        //   616: astore          11
        //   618: aload           7
        //   620: getfield        ebg.D0:Ljava/lang/String;
        //   623: astore          9
        //   625: aload           7
        //   627: getfield        ebg.E0:Ljava/lang/String;
        //   630: astore          7
        //   632: getstatic       sag.a:I
        //   635: istore_1       
        //   636: aload           11
        //   638: ldc_w           "login_verification"
        //   641: invokestatic    pbu.e:(Lcom/twitter/util/user/UserIdentifier;Ljava/lang/String;)Lqbu;
        //   644: ldc_w           "lv_private_key"
        //   647: ldc_w           ""
        //   650: invokeinterface qbu.j:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   655: astore          10
        //   657: aload           11
        //   659: invokestatic    dbg.a:(Lcom/twitter/util/user/UserIdentifier;)Ljava/lang/String;
        //   662: astore          12
        //   664: aload           10
        //   666: invokestatic    ikr.g:(Ljava/lang/CharSequence;)Z
        //   669: ifeq            1001
        //   672: aload           12
        //   674: invokestatic    ikr.g:(Ljava/lang/CharSequence;)Z
        //   677: ifeq            1001
        //   680: aload           7
        //   682: invokestatic    ikr.g:(Ljava/lang/CharSequence;)Z
        //   685: ifeq            1001
        //   688: aload           10
        //   690: invokestatic    oi1.a:(Ljava/lang/String;)[B
        //   693: astore          11
        //   695: aload           12
        //   697: invokestatic    oi1.a:(Ljava/lang/String;)[B
        //   700: astore          10
        //   702: aload           7
        //   704: invokestatic    oi1.a:(Ljava/lang/String;)[B
        //   707: astore          7
        //   709: new             Ljava/security/spec/X509EncodedKeySpec;
        //   712: dup            
        //   713: aload           10
        //   715: invokespecial   java/security/spec/X509EncodedKeySpec.<init>:([B)V
        //   718: astore          10
        //   720: new             Ljava/security/spec/PKCS8EncodedKeySpec;
        //   723: dup            
        //   724: aload           11
        //   726: invokespecial   java/security/spec/PKCS8EncodedKeySpec.<init>:([B)V
        //   729: astore          11
        //   731: ldc_w           "RSA"
        //   734: ldc_w           "SC"
        //   737: invokestatic    java/security/KeyFactory.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;
        //   740: astore          12
        //   742: aload           12
        //   744: aload           11
        //   746: invokevirtual   java/security/KeyFactory.generatePrivate:(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
        //   749: astore          11
        //   751: aload           12
        //   753: aload           10
        //   755: invokevirtual   java/security/KeyFactory.generatePublic:(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
        //   758: pop            
        //   759: ldc_w           "SHA1WithRSA"
        //   762: ldc_w           "SC"
        //   765: invokestatic    java/security/Signature.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;
        //   768: astore          10
        //   770: aload           10
        //   772: aload           11
        //   774: invokevirtual   java/security/Signature.initSign:(Ljava/security/PrivateKey;)V
        //   777: aload           10
        //   779: aload           7
        //   781: invokevirtual   java/security/Signature.update:([B)V
        //   784: aload           10
        //   786: invokevirtual   java/security/Signature.sign:()[B
        //   789: astore          7
        //   791: goto            1004
        //   794: astore          7
        //   796: ldc_w           "Security exception while singing challenge: "
        //   799: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   802: astore          10
        //   804: aload           10
        //   806: aload           7
        //   808: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   811: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   814: pop            
        //   815: ldc_w           "LoginVerification"
        //   818: aload           10
        //   820: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   823: invokestatic    s9g.k:(Ljava/lang/String;Ljava/lang/String;)V
        //   826: goto            1001
        //   829: astore          10
        //   831: ldc_w           "Invalid key exception while initializing signature: "
        //   834: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   837: astore          7
        //   839: aload           7
        //   841: aload           10
        //   843: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   846: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   849: pop            
        //   850: ldc_w           "LoginVerification"
        //   853: aload           7
        //   855: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   858: invokestatic    s9g.k:(Ljava/lang/String;Ljava/lang/String;)V
        //   861: goto            1001
        //   864: astore          10
        //   866: ldc_w           "No such algorithm for Signature (SHA1WithRSA): "
        //   869: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   872: astore          7
        //   874: aload           7
        //   876: aload           10
        //   878: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   881: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   884: pop            
        //   885: ldc_w           "LoginVerification"
        //   888: aload           7
        //   890: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   893: invokestatic    s9g.k:(Ljava/lang/String;Ljava/lang/String;)V
        //   896: goto            1001
        //   899: astore          10
        //   901: ldc_w           "No such provider for Signature (SC): "
        //   904: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   907: astore          7
        //   909: aload           7
        //   911: aload           10
        //   913: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   916: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   919: pop            
        //   920: ldc_w           "LoginVerification"
        //   923: aload           7
        //   925: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   928: invokestatic    s9g.k:(Ljava/lang/String;Ljava/lang/String;)V
        //   931: goto            1001
        //   934: astore          7
        //   936: ldc_w           "No such algorithm for KeyFactory (RSA): "
        //   939: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   942: astore          10
        //   944: aload           10
        //   946: aload           7
        //   948: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   951: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   954: pop            
        //   955: ldc_w           "LoginVerification"
        //   958: aload           10
        //   960: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   963: invokestatic    s9g.k:(Ljava/lang/String;Ljava/lang/String;)V
        //   966: goto            1001
        //   969: astore          7
        //   971: ldc_w           "No such provider for KeyFactory (SC): "
        //   974: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   977: astore          10
        //   979: aload           10
        //   981: aload           7
        //   983: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   986: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   989: pop            
        //   990: ldc_w           "LoginVerification"
        //   993: aload           10
        //   995: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   998: invokestatic    s9g.k:(Ljava/lang/String;Ljava/lang/String;)V
        //  1001: aconst_null    
        //  1002: astore          7
        //  1004: aload           7
        //  1006: ifnull          1025
        //  1009: new             Lvag;
        //  1012: dup            
        //  1013: aload           9
        //  1015: aload           7
        //  1017: invokestatic    oi1.c:([B)Ljava/lang/String;
        //  1020: invokespecial   vag.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //  1023: astore          8
        //  1025: aload           8
        //  1027: ifnull          1033
        //  1030: aload           8
        //  1032: areturn        
        //  1033: new             Ljava/lang/RuntimeException;
        //  1036: dup            
        //  1037: ldc_w           "Failed to compute LoginVerification answer"
        //  1040: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1043: athrow         
        //  1044: aload_0        
        //  1045: getfield        zag.E0:Ljava/lang/Object;
        //  1048: checkcast       Lsct;
        //  1051: astore          9
        //  1053: aload           9
        //  1055: ldc             "this$0"
        //  1057: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1060: invokestatic    vav.o2:()Lvav;
        //  1063: astore          8
        //  1065: getstatic       com/twitter/util/user/UserIdentifier.Companion:Lcom/twitter/util/user/UserIdentifier$Companion;
        //  1068: astore          7
        //  1070: aload           8
        //  1072: aload           7
        //  1074: invokevirtual   com/twitter/util/user/UserIdentifier$Companion.c:()Lcom/twitter/util/user/UserIdentifier;
        //  1077: invokevirtual   com/twitter/util/user/UserIdentifier.getId:()J
        //  1080: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1083: invokestatic    s9i.r:(Ljava/lang/Object;)Ljava/util/List;
        //  1086: invokevirtual   vav.a:(Ljava/util/List;)Ljava/util/Map;
        //  1089: astore          8
        //  1091: aload           7
        //  1093: invokevirtual   com/twitter/util/user/UserIdentifier$Companion.c:()Lcom/twitter/util/user/UserIdentifier;
        //  1096: invokevirtual   com/twitter/util/user/UserIdentifier.getId:()J
        //  1099: lstore_2       
        //  1100: aload           8
        //  1102: checkcast       Ljava/util/HashMap;
        //  1105: lload_2        
        //  1106: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1109: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1112: checkcast       Lcgv;
        //  1115: astore          8
        //  1117: aload           8
        //  1119: astore          7
        //  1121: aload           8
        //  1123: ifnonnull       1165
        //  1126: aload           9
        //  1128: getfield        sct.a:Lyhw;
        //  1131: aload           9
        //  1133: getfield        sct.b:Lcom/twitter/util/user/UserIdentifier;
        //  1136: invokevirtual   enm.R:(Ljava/lang/Object;)Leaq;
        //  1139: invokevirtual   eaq.e:()Ljava/lang/Object;
        //  1142: checkcast       Lynj;
        //  1145: invokevirtual   ynj.c:()Ljava/lang/Object;
        //  1148: astore          7
        //  1150: aload           7
        //  1152: ldc_w           "userRemoteSource.querySi\u2026fier).blockingGet().get()"
        //  1155: invokestatic    czd.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1158: aload           7
        //  1160: checkcast       Lcgv;
        //  1163: astore          7
        //  1165: aload           7
        //  1167: areturn        
        //  1168: astore          7
        //  1170: iload           5
        //  1172: istore          4
        //  1174: goto            573
        //  1177: astore          7
        //  1179: goto            1001
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  206    252    263    290    Any
        //  270    275    278    287    Any
        //  339    344    1168   1177   Ljava/lang/NullPointerException;
        //  348    353    1168   1177   Ljava/lang/NullPointerException;
        //  357    365    1168   1177   Ljava/lang/NullPointerException;
        //  369    377    1168   1177   Ljava/lang/NullPointerException;
        //  381    391    1168   1177   Ljava/lang/NullPointerException;
        //  395    400    1168   1177   Ljava/lang/NullPointerException;
        //  404    411    1168   1177   Ljava/lang/NullPointerException;
        //  415    425    1168   1177   Ljava/lang/NullPointerException;
        //  425    526    555    573    Any
        //  547    552    1168   1177   Ljava/lang/NullPointerException;
        //  561    566    1168   1177   Ljava/lang/NullPointerException;
        //  570    573    1168   1177   Ljava/lang/NullPointerException;
        //  731    742    969    1001   Ljava/security/NoSuchProviderException;
        //  731    742    934    969    Ljava/security/NoSuchAlgorithmException;
        //  742    759    1177   1182   Ljava/security/spec/InvalidKeySpecException;
        //  759    770    899    934    Ljava/security/NoSuchProviderException;
        //  759    770    864    899    Ljava/security/NoSuchAlgorithmException;
        //  770    777    829    864    Ljava/security/InvalidKeyException;
        //  777    791    794    829    Ljava/security/SignatureException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1001:
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
