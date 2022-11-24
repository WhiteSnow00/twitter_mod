import com.airbnb.deeplinkdispatch.DeepLinkResult;
import com.airbnb.deeplinkdispatch.DeepLinkMatchResult;
import android.content.Intent;
import android.app.Activity;
import com.airbnb.deeplinkdispatch.ValidationUtilsKt;
import java.util.HashMap;
import java.util.Map;
import com.airbnb.deeplinkdispatch.BaseRegistry;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wk1
{
    public final List<? extends BaseRegistry> a;
    public final Map<byte[], byte[]> b;
    
    public wk1(final List<? extends BaseRegistry> a) {
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements((List)(this.a = a), (Map)(this.b = new HashMap()));
    }
    
    public final DeepLinkResult a(final Activity p0, final Intent p1, final DeepLinkMatchResult p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "activity == null"
        //     3: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     6: pop            
        //     7: aload_2        
        //     8: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    11: astore          9
        //    13: aconst_null    
        //    14: astore          5
        //    16: aload           9
        //    18: ifnonnull       43
        //    21: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //    24: dup            
        //    25: iconst_0       
        //    26: aconst_null    
        //    27: ldc             "No Uri in given activity's intent."
        //    29: aload_3        
        //    30: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //    33: dup            
        //    34: aconst_null    
        //    35: aconst_null    
        //    36: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //    39: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //    42: areturn        
        //    43: aload           9
        //    45: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    48: astore          8
        //    50: aload_3        
        //    51: ifnonnull       76
        //    54: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //    57: dup            
        //    58: iconst_0       
        //    59: aconst_null    
        //    60: ldc             "DeepLinkEntry cannot be null"
        //    62: aconst_null    
        //    63: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //    66: dup            
        //    67: aconst_null    
        //    68: aconst_null    
        //    69: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //    72: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //    75: areturn        
        //    76: aload           8
        //    78: invokestatic    com/airbnb/deeplinkdispatch/DeepLinkUri.parse:(Ljava/lang/String;)Lcom/airbnb/deeplinkdispatch/DeepLinkUri;
        //    81: astore          10
        //    83: new             Ljava/util/HashMap;
        //    86: dup            
        //    87: aload_3        
        //    88: aload           10
        //    90: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getParameters:(Lcom/airbnb/deeplinkdispatch/DeepLinkUri;)Ljava/util/Map;
        //    93: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //    96: astore          6
        //    98: aload           10
        //   100: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkUri.queryParameterNames:()Ljava/util/Set;
        //   103: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   108: astore          11
        //   110: aload           11
        //   112: invokeinterface java/util/Iterator.hasNext:()Z
        //   117: ifeq            227
        //   120: aload           11
        //   122: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   127: checkcast       Ljava/lang/String;
        //   130: astore          4
        //   132: aload           10
        //   134: aload           4
        //   136: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkUri.queryParameterValues:(Ljava/lang/String;)Ljava/util/List;
        //   139: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   144: astore          13
        //   146: aload           13
        //   148: invokeinterface java/util/Iterator.hasNext:()Z
        //   153: ifeq            110
        //   156: aload           13
        //   158: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   163: checkcast       Ljava/lang/String;
        //   166: astore          7
        //   168: aload           6
        //   170: aload           4
        //   172: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   175: ifeq            214
        //   178: new             Ljava/lang/StringBuilder;
        //   181: dup            
        //   182: invokespecial   java/lang/StringBuilder.<init>:()V
        //   185: astore          12
        //   187: aload           12
        //   189: ldc             "Duplicate parameter name in path and query param: "
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: pop            
        //   195: aload           12
        //   197: aload           4
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: pop            
        //   203: ldc             "DeepLinkDelegate"
        //   205: aload           12
        //   207: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   210: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   213: pop            
        //   214: aload           6
        //   216: aload           4
        //   218: aload           7
        //   220: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   223: pop            
        //   224: goto            146
        //   227: aload           6
        //   229: ldc             "deep_link_uri"
        //   231: aload           9
        //   233: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   236: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   239: pop            
        //   240: aload_2        
        //   241: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   244: ifnull          263
        //   247: new             Landroid/os/Bundle;
        //   250: dup            
        //   251: aload_2        
        //   252: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   255: invokespecial   android/os/Bundle.<init>:(Landroid/os/Bundle;)V
        //   258: astore          4
        //   260: goto            272
        //   263: new             Landroid/os/Bundle;
        //   266: dup            
        //   267: invokespecial   android/os/Bundle.<init>:()V
        //   270: astore          4
        //   272: aload           6
        //   274: invokevirtual   java/util/HashMap.entrySet:()Ljava/util/Set;
        //   277: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   282: astore          6
        //   284: aload           6
        //   286: invokeinterface java/util/Iterator.hasNext:()Z
        //   291: ifeq            334
        //   294: aload           6
        //   296: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   301: checkcast       Ljava/util/Map$Entry;
        //   304: astore          7
        //   306: aload           4
        //   308: aload           7
        //   310: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   315: checkcast       Ljava/lang/String;
        //   318: aload           7
        //   320: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   325: checkcast       Ljava/lang/String;
        //   328: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   331: goto            284
        //   334: aload_3        
        //   335: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //   338: astore          12
        //   340: aload           12
        //   342: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getActivityClass:()Ljava/lang/Class;
        //   345: astore          11
        //   347: aload           12
        //   349: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   352: ifnonnull       379
        //   355: new             Landroid/content/Intent;
        //   358: astore          6
        //   360: aload           6
        //   362: aload_1        
        //   363: aload           11
        //   365: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   368: aload           5
        //   370: astore          4
        //   372: aload           6
        //   374: astore          5
        //   376: goto            947
        //   379: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //   382: astore          10
        //   384: new             Ljava/lang/StringBuilder;
        //   387: astore          5
        //   389: aload           5
        //   391: invokespecial   java/lang/StringBuilder.<init>:()V
        //   394: aload           5
        //   396: ldc             "Could not deep link to method: "
        //   398: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   401: pop            
        //   402: aload           5
        //   404: aload           12
        //   406: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   409: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   412: pop            
        //   413: aload           5
        //   415: ldc             " intents length == 0"
        //   417: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   420: pop            
        //   421: aload           5
        //   423: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   426: astore          6
        //   428: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   431: astore          5
        //   433: aload           5
        //   435: aconst_null    
        //   436: aconst_null    
        //   437: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //   440: aload           10
        //   442: iconst_0       
        //   443: aload           8
        //   445: aload           6
        //   447: aload_3        
        //   448: aload           5
        //   450: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //   453: aload           12
        //   455: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   458: astore          5
        //   460: aload           11
        //   462: aload           5
        //   464: iconst_1       
        //   465: anewarray       Ljava/lang/Class;
        //   468: dup            
        //   469: iconst_0       
        //   470: ldc             Landroid/content/Context;.class
        //   472: aastore        
        //   473: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   476: astore          5
        //   478: aload           5
        //   480: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   483: ldc             Ljds;.class
        //   485: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   488: ifeq            567
        //   491: aload           5
        //   493: aload           11
        //   495: iconst_1       
        //   496: anewarray       Ljava/lang/Object;
        //   499: dup            
        //   500: iconst_0       
        //   501: aload_1        
        //   502: aastore        
        //   503: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   506: checkcast       Ljds;
        //   509: astore          6
        //   511: aload           6
        //   513: astore          5
        //   515: aload           6
        //   517: invokevirtual   jds.k:()I
        //   520: ifne            526
        //   523: aload           10
        //   525: areturn        
        //   526: aload           6
        //   528: astore          5
        //   530: aload           6
        //   532: aload           6
        //   534: invokevirtual   jds.k:()I
        //   537: iconst_1       
        //   538: isub           
        //   539: invokevirtual   jds.j:(I)Landroid/content/Intent;
        //   542: astore          7
        //   544: aload           6
        //   546: astore          5
        //   548: aload           7
        //   550: astore          4
        //   552: aload           4
        //   554: astore          6
        //   556: aload           5
        //   558: astore          4
        //   560: aload           6
        //   562: astore          5
        //   564: goto            947
        //   567: aload           5
        //   569: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   572: ldc             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;.class
        //   574: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   577: ifeq            691
        //   580: aload           5
        //   582: aload           11
        //   584: iconst_1       
        //   585: anewarray       Ljava/lang/Object;
        //   588: dup            
        //   589: iconst_0       
        //   590: aload_1        
        //   591: aastore        
        //   592: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   595: checkcast       Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   598: astore          5
        //   600: aload           5
        //   602: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Ljds;
        //   605: ifnull          659
        //   608: aload           5
        //   610: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Ljds;
        //   613: astore          6
        //   615: aload           6
        //   617: astore          5
        //   619: aload           6
        //   621: invokevirtual   jds.k:()I
        //   624: ifne            630
        //   627: aload           10
        //   629: areturn        
        //   630: aload           6
        //   632: astore          5
        //   634: aload           6
        //   636: aload           6
        //   638: invokevirtual   jds.k:()I
        //   641: iconst_1       
        //   642: isub           
        //   643: invokevirtual   jds.j:(I)Landroid/content/Intent;
        //   646: astore          7
        //   648: aload           7
        //   650: astore          4
        //   652: aload           6
        //   654: astore          5
        //   656: goto            552
        //   659: aload           5
        //   661: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   664: ifnull          681
        //   667: aload           5
        //   669: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   672: astore          5
        //   674: aload           5
        //   676: astore          4
        //   678: goto            684
        //   681: aconst_null    
        //   682: astore          4
        //   684: aload           4
        //   686: astore          5
        //   688: goto            711
        //   691: aload           5
        //   693: aload           11
        //   695: iconst_1       
        //   696: anewarray       Ljava/lang/Object;
        //   699: dup            
        //   700: iconst_0       
        //   701: aload_1        
        //   702: aastore        
        //   703: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   706: checkcast       Landroid/content/Intent;
        //   709: astore          5
        //   711: aconst_null    
        //   712: astore          4
        //   714: goto            947
        //   717: astore          5
        //   719: aconst_null    
        //   720: astore          5
        //   722: aload           11
        //   724: aload           12
        //   726: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   729: iconst_2       
        //   730: anewarray       Ljava/lang/Class;
        //   733: dup            
        //   734: iconst_0       
        //   735: ldc             Landroid/content/Context;.class
        //   737: aastore        
        //   738: dup            
        //   739: iconst_1       
        //   740: ldc             Landroid/os/Bundle;.class
        //   742: aastore        
        //   743: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   746: astore          6
        //   748: aload           6
        //   750: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   753: ldc             Ljds;.class
        //   755: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   758: ifeq            814
        //   761: aload           6
        //   763: aload           11
        //   765: iconst_2       
        //   766: anewarray       Ljava/lang/Object;
        //   769: dup            
        //   770: iconst_0       
        //   771: aload_1        
        //   772: aastore        
        //   773: dup            
        //   774: iconst_1       
        //   775: aload           4
        //   777: aastore        
        //   778: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   781: checkcast       Ljds;
        //   784: astore          4
        //   786: aload           4
        //   788: invokevirtual   jds.k:()I
        //   791: ifne            797
        //   794: aload           10
        //   796: areturn        
        //   797: aload           4
        //   799: aload           4
        //   801: invokevirtual   jds.k:()I
        //   804: iconst_1       
        //   805: isub           
        //   806: invokevirtual   jds.j:(I)Landroid/content/Intent;
        //   809: astore          5
        //   811: goto            947
        //   814: aload           6
        //   816: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   819: ldc             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;.class
        //   821: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   824: ifeq            919
        //   827: aload           6
        //   829: aload           11
        //   831: iconst_2       
        //   832: anewarray       Ljava/lang/Object;
        //   835: dup            
        //   836: iconst_0       
        //   837: aload_1        
        //   838: aastore        
        //   839: dup            
        //   840: iconst_1       
        //   841: aload           4
        //   843: aastore        
        //   844: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   847: checkcast       Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   850: astore          4
        //   852: aload           4
        //   854: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Ljds;
        //   857: ifnull          895
        //   860: aload           4
        //   862: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Ljds;
        //   865: astore          4
        //   867: aload           4
        //   869: invokevirtual   jds.k:()I
        //   872: ifne            878
        //   875: aload           10
        //   877: areturn        
        //   878: aload           4
        //   880: aload           4
        //   882: invokevirtual   jds.k:()I
        //   885: iconst_1       
        //   886: isub           
        //   887: invokevirtual   jds.j:(I)Landroid/content/Intent;
        //   890: astore          5
        //   892: goto            947
        //   895: aload           4
        //   897: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   900: ifnull          913
        //   903: aload           4
        //   905: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   908: astore          4
        //   910: goto            552
        //   913: aconst_null    
        //   914: astore          4
        //   916: goto            552
        //   919: aload           6
        //   921: aload           11
        //   923: iconst_2       
        //   924: anewarray       Ljava/lang/Object;
        //   927: dup            
        //   928: iconst_0       
        //   929: aload_1        
        //   930: aastore        
        //   931: dup            
        //   932: iconst_1       
        //   933: aload           4
        //   935: aastore        
        //   936: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   939: checkcast       Landroid/content/Intent;
        //   942: astore          4
        //   944: goto            552
        //   947: aload           5
        //   949: ifnonnull       979
        //   952: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   955: astore_1       
        //   956: aload_1        
        //   957: aload           5
        //   959: aload           4
        //   961: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //   964: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //   967: dup            
        //   968: iconst_0       
        //   969: aload           8
        //   971: ldc             "Destination Intent is null!"
        //   973: aload_3        
        //   974: aload_1        
        //   975: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //   978: areturn        
        //   979: aload           5
        //   981: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   984: ifnonnull       997
        //   987: aload           5
        //   989: aload_2        
        //   990: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   993: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   996: pop            
        //   997: aload           5
        //   999: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1002: ifnonnull       1015
        //  1005: aload           5
        //  1007: aload_2        
        //  1008: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1011: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  1014: pop            
        //  1015: aload           5
        //  1017: ldc             "is_deep_link_flag"
        //  1019: iconst_1       
        //  1020: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1023: pop            
        //  1024: aload_1        
        //  1025: invokestatic    kn.e:(Landroid/app/Activity;)Landroid/net/Uri;
        //  1028: astore_2       
        //  1029: aload_2        
        //  1030: ifnull          1045
        //  1033: aload           5
        //  1035: ldc             "android.intent.extra.REFERRER"
        //  1037: aload_2        
        //  1038: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1041: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1044: pop            
        //  1045: aload           5
        //  1047: ldc             "deep_link_uri"
        //  1049: aload           9
        //  1051: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1054: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1057: pop            
        //  1058: aload_1        
        //  1059: invokevirtual   android/app/Activity.getCallingActivity:()Landroid/content/ComponentName;
        //  1062: ifnull          1074
        //  1065: aload           5
        //  1067: ldc_w           33554432
        //  1070: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //  1073: pop            
        //  1074: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1077: astore_1       
        //  1078: aload_1        
        //  1079: aload           5
        //  1081: aload           4
        //  1083: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //  1086: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1089: dup            
        //  1090: iconst_1       
        //  1091: aload           8
        //  1093: ldc_w           ""
        //  1096: aload_3        
        //  1097: aload_1        
        //  1098: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1101: astore_1       
        //  1102: aload_1        
        //  1103: areturn        
        //  1104: astore_1       
        //  1105: ldc             "Could not deep link to method: "
        //  1107: invokestatic    ehk.f:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1110: astore_1       
        //  1111: aload_1        
        //  1112: aload_3        
        //  1113: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //  1116: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //  1119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1122: pop            
        //  1123: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1126: dup            
        //  1127: iconst_0       
        //  1128: aload           8
        //  1130: aload_1        
        //  1131: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1134: aload_3        
        //  1135: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1138: dup            
        //  1139: aconst_null    
        //  1140: aconst_null    
        //  1141: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //  1144: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1147: areturn        
        //  1148: astore_1       
        //  1149: ldc             "Could not deep link to method: "
        //  1151: invokestatic    ehk.f:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1154: astore_1       
        //  1155: aload_1        
        //  1156: aload_3        
        //  1157: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //  1160: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //  1163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1166: pop            
        //  1167: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1170: dup            
        //  1171: iconst_0       
        //  1172: aload           8
        //  1174: aload_1        
        //  1175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1178: aload_3        
        //  1179: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1182: dup            
        //  1183: aconst_null    
        //  1184: aconst_null    
        //  1185: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //  1188: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1191: areturn        
        //  1192: astore_1       
        //  1193: ldc_w           "Deep link to non-existent method: "
        //  1196: invokestatic    ehk.f:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1199: astore_1       
        //  1200: aload_1        
        //  1201: aload_3        
        //  1202: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //  1205: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //  1208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1211: pop            
        //  1212: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1215: dup            
        //  1216: iconst_0       
        //  1217: aload           8
        //  1219: aload_1        
        //  1220: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1223: aload_3        
        //  1224: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1227: dup            
        //  1228: aconst_null    
        //  1229: aconst_null    
        //  1230: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Ljds;)V
        //  1233: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1236: areturn        
        //  1237: astore          5
        //  1239: goto            719
        //  1242: astore          6
        //  1244: goto            722
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  334    368    1192   1237   Ljava/lang/NoSuchMethodException;
        //  334    368    1148   1192   Ljava/lang/IllegalAccessException;
        //  334    368    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  379    453    1192   1237   Ljava/lang/NoSuchMethodException;
        //  379    453    1148   1192   Ljava/lang/IllegalAccessException;
        //  379    453    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  453    460    717    719    Ljava/lang/NoSuchMethodException;
        //  453    460    1148   1192   Ljava/lang/IllegalAccessException;
        //  453    460    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  460    511    1237   1242   Ljava/lang/NoSuchMethodException;
        //  460    511    1148   1192   Ljava/lang/IllegalAccessException;
        //  460    511    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  515    523    1242   1247   Ljava/lang/NoSuchMethodException;
        //  515    523    1148   1192   Ljava/lang/IllegalAccessException;
        //  515    523    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  530    544    1242   1247   Ljava/lang/NoSuchMethodException;
        //  530    544    1148   1192   Ljava/lang/IllegalAccessException;
        //  530    544    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  567    615    1237   1242   Ljava/lang/NoSuchMethodException;
        //  567    615    1148   1192   Ljava/lang/IllegalAccessException;
        //  567    615    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  619    627    1242   1247   Ljava/lang/NoSuchMethodException;
        //  619    627    1148   1192   Ljava/lang/IllegalAccessException;
        //  619    627    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  634    648    1242   1247   Ljava/lang/NoSuchMethodException;
        //  634    648    1148   1192   Ljava/lang/IllegalAccessException;
        //  634    648    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  659    674    1237   1242   Ljava/lang/NoSuchMethodException;
        //  659    674    1148   1192   Ljava/lang/IllegalAccessException;
        //  659    674    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  691    711    1237   1242   Ljava/lang/NoSuchMethodException;
        //  691    711    1148   1192   Ljava/lang/IllegalAccessException;
        //  691    711    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  722    794    1192   1237   Ljava/lang/NoSuchMethodException;
        //  722    794    1148   1192   Ljava/lang/IllegalAccessException;
        //  722    794    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  797    811    1192   1237   Ljava/lang/NoSuchMethodException;
        //  797    811    1148   1192   Ljava/lang/IllegalAccessException;
        //  797    811    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  814    875    1192   1237   Ljava/lang/NoSuchMethodException;
        //  814    875    1148   1192   Ljava/lang/IllegalAccessException;
        //  814    875    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  878    892    1192   1237   Ljava/lang/NoSuchMethodException;
        //  878    892    1148   1192   Ljava/lang/IllegalAccessException;
        //  878    892    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  895    910    1192   1237   Ljava/lang/NoSuchMethodException;
        //  895    910    1148   1192   Ljava/lang/IllegalAccessException;
        //  895    910    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  919    944    1192   1237   Ljava/lang/NoSuchMethodException;
        //  919    944    1148   1192   Ljava/lang/IllegalAccessException;
        //  919    944    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  952    979    1192   1237   Ljava/lang/NoSuchMethodException;
        //  952    979    1148   1192   Ljava/lang/IllegalAccessException;
        //  952    979    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  979    997    1192   1237   Ljava/lang/NoSuchMethodException;
        //  979    997    1148   1192   Ljava/lang/IllegalAccessException;
        //  979    997    1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  997    1015   1192   1237   Ljava/lang/NoSuchMethodException;
        //  997    1015   1148   1192   Ljava/lang/IllegalAccessException;
        //  997    1015   1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  1015   1029   1192   1237   Ljava/lang/NoSuchMethodException;
        //  1015   1029   1148   1192   Ljava/lang/IllegalAccessException;
        //  1015   1029   1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  1033   1045   1192   1237   Ljava/lang/NoSuchMethodException;
        //  1033   1045   1148   1192   Ljava/lang/IllegalAccessException;
        //  1033   1045   1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  1045   1074   1192   1237   Ljava/lang/NoSuchMethodException;
        //  1045   1074   1148   1192   Ljava/lang/IllegalAccessException;
        //  1045   1074   1104   1148   Ljava/lang/reflect/InvocationTargetException;
        //  1074   1102   1192   1237   Ljava/lang/NoSuchMethodException;
        //  1074   1102   1148   1192   Ljava/lang/IllegalAccessException;
        //  1074   1102   1104   1148   Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 595, Size: 595
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
}
