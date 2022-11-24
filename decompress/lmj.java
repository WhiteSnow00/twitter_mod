import com.openback.receiver.OpenBackReceiver;
import android.util.Log;
import android.content.ComponentName;
import com.openback.service.OpenBackService;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmj
{
    public static volatile lmj n;
    public uop a;
    public fw b;
    public jc8 c;
    public y7h d;
    public udi e;
    public lwk f;
    public clr g;
    public uaf h;
    public final Context i;
    public boolean j;
    public boolean k;
    public boolean l;
    public volatile boolean m;
    
    public lmj(Context applicationContext) {
        this.j = false;
        this.k = true;
        this.l = true;
        applicationContext = applicationContext.getApplicationContext();
        this.i = applicationContext;
        this.h = new uaf(applicationContext);
        this.m = false;
    }
    
    public static lmj b() {
        if (lmj.n != null) {
            return lmj.n;
        }
        throw new IllegalStateException("[OpenBack] OpenBack is not initialized in this process. Call OpenBack.initialize(context) first.");
    }
    
    public static void d(final Context context) {
        if (lmj.n == null) {
            synchronized (lmj.class) {
                if (lmj.n == null) {
                    lmj.n = new lmj(context);
                }
            }
        }
    }
    
    public final void a(final at4 at4) {
        final Intent intent = new Intent("com.openback.action.COMMAND");
        intent.putExtra("com.openback.extra.COMMAND", (Parcelable)at4);
        OpenBackService.e(this.i, intent);
    }
    
    public final void c(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        lmj.m:Z
        //     4: ifne            11
        //     7: aload_0        
        //     8: invokevirtual   lmj.e:()V
        //    11: aload_1        
        //    12: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    15: astore          11
        //    17: aload           11
        //    19: ifnonnull       25
        //    22: goto            969
        //    25: aload           11
        //    27: invokevirtual   java/lang/String.hashCode:()I
        //    30: istore_2       
        //    31: iload_2        
        //    32: ldc             -1417835046
        //    34: if_icmpeq       88
        //    37: iload_2        
        //    38: ldc             -905063602
        //    40: if_icmpeq       70
        //    43: iload_2        
        //    44: ldc             798292259
        //    46: if_icmpeq       52
        //    49: goto            98
        //    52: aload           11
        //    54: ldc             "android.intent.action.BOOT_COMPLETED"
        //    56: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    59: ifne            65
        //    62: goto            98
        //    65: iconst_2       
        //    66: istore_2       
        //    67: goto            105
        //    70: aload           11
        //    72: ldc             "android.intent.action.LOCKED_BOOT_COMPLETED"
        //    74: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    77: ifne            83
        //    80: goto            98
        //    83: iconst_1       
        //    84: istore_2       
        //    85: goto            105
        //    88: aload           11
        //    90: ldc             "com.htc.intent.action.QUICKBOOT_POWERON"
        //    92: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    95: ifne            103
        //    98: iconst_m1      
        //    99: istore_2       
        //   100: goto            105
        //   103: iconst_0       
        //   104: istore_2       
        //   105: iload_2        
        //   106: ifeq            122
        //   109: iload_2        
        //   110: iconst_1       
        //   111: if_icmpeq       122
        //   114: iload_2        
        //   115: iconst_2       
        //   116: if_icmpeq       122
        //   119: goto            152
        //   122: aload_0        
        //   123: getfield        lmj.h:Luaf;
        //   126: astore          12
        //   128: aload           12
        //   130: getfield        uaf.L0:Lvaf;
        //   133: astore          13
        //   135: aload           13
        //   137: aload           13
        //   139: getfield        vaf.bootCount:J
        //   142: lconst_1       
        //   143: ladd           
        //   144: putfield        vaf.bootCount:J
        //   147: aload           12
        //   149: invokevirtual   uaf.b:()V
        //   152: aload_0        
        //   153: getfield        lmj.j:Z
        //   156: ifne            162
        //   159: goto            969
        //   162: aload           11
        //   164: invokevirtual   java/lang/String.hashCode:()I
        //   167: lookupswitch {
        //          -1980154005: 614
        //          -1886648615: 596
        //          -1875733435: 578
        //          -1676458352: 560
        //          -1172645946: 542
        //          -1076576821: 524
        //          -810471698: 505
        //          172491798: 486
        //          267468725: 467
        //          490310653: 448
        //          525384130: 429
        //          823795052: 410
        //          938092858: 391
        //          1019184907: 372
        //          1123270207: 353
        //          1544582882: 334
        //          1737074039: 315
        //          default: 312
        //        }
        //   312: goto            632
        //   315: aload           11
        //   317: ldc             "android.intent.action.MY_PACKAGE_REPLACED"
        //   319: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   322: ifne            328
        //   325: goto            632
        //   328: bipush          16
        //   330: istore_2       
        //   331: goto            634
        //   334: aload           11
        //   336: ldc             "android.intent.action.PACKAGE_ADDED"
        //   338: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   341: ifne            347
        //   344: goto            632
        //   347: bipush          15
        //   349: istore_2       
        //   350: goto            634
        //   353: aload           11
        //   355: ldc             "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
        //   357: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   360: ifne            366
        //   363: goto            632
        //   366: bipush          14
        //   368: istore_2       
        //   369: goto            634
        //   372: aload           11
        //   374: ldc             "android.intent.action.ACTION_POWER_CONNECTED"
        //   376: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   379: ifne            385
        //   382: goto            632
        //   385: bipush          13
        //   387: istore_2       
        //   388: goto            634
        //   391: aload           11
        //   393: ldc             "com.openback.action.MESSAGE_ALARM_CHECK"
        //   395: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   398: ifne            404
        //   401: goto            632
        //   404: bipush          12
        //   406: istore_2       
        //   407: goto            634
        //   410: aload           11
        //   412: ldc             "android.intent.action.USER_PRESENT"
        //   414: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   417: ifne            423
        //   420: goto            632
        //   423: bipush          11
        //   425: istore_2       
        //   426: goto            634
        //   429: aload           11
        //   431: ldc             "android.intent.action.PACKAGE_REMOVED"
        //   433: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   436: ifne            442
        //   439: goto            632
        //   442: bipush          10
        //   444: istore_2       
        //   445: goto            634
        //   448: aload           11
        //   450: ldc             "android.intent.action.BATTERY_LOW"
        //   452: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   455: ifne            461
        //   458: goto            632
        //   461: bipush          9
        //   463: istore_2       
        //   464: goto            634
        //   467: aload           11
        //   469: ldc             "android.intent.action.PACKAGE_DATA_CLEARED"
        //   471: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   474: ifne            480
        //   477: goto            632
        //   480: bipush          8
        //   482: istore_2       
        //   483: goto            634
        //   486: aload           11
        //   488: ldc             "android.intent.action.PACKAGE_CHANGED"
        //   490: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   493: ifne            499
        //   496: goto            632
        //   499: bipush          7
        //   501: istore_2       
        //   502: goto            634
        //   505: aload           11
        //   507: ldc             "android.intent.action.PACKAGE_REPLACED"
        //   509: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   512: ifne            518
        //   515: goto            632
        //   518: bipush          6
        //   520: istore_2       
        //   521: goto            634
        //   524: aload           11
        //   526: ldc             "android.intent.action.AIRPLANE_MODE"
        //   528: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   531: ifne            537
        //   534: goto            632
        //   537: iconst_5       
        //   538: istore_2       
        //   539: goto            634
        //   542: aload           11
        //   544: ldc             "android.net.conn.CONNECTIVITY_CHANGE"
        //   546: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   549: ifne            555
        //   552: goto            632
        //   555: iconst_4       
        //   556: istore_2       
        //   557: goto            634
        //   560: aload           11
        //   562: ldc             "android.intent.action.HEADSET_PLUG"
        //   564: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   567: ifne            573
        //   570: goto            632
        //   573: iconst_3       
        //   574: istore_2       
        //   575: goto            634
        //   578: aload           11
        //   580: ldc             "android.net.wifi.WIFI_STATE_CHANGED"
        //   582: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   585: ifne            591
        //   588: goto            632
        //   591: iconst_2       
        //   592: istore_2       
        //   593: goto            634
        //   596: aload           11
        //   598: ldc             "android.intent.action.ACTION_POWER_DISCONNECTED"
        //   600: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   603: ifne            609
        //   606: goto            632
        //   609: iconst_1       
        //   610: istore_2       
        //   611: goto            634
        //   614: aload           11
        //   616: ldc             "android.intent.action.BATTERY_OKAY"
        //   618: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   621: ifne            627
        //   624: goto            632
        //   627: iconst_0       
        //   628: istore_2       
        //   629: goto            634
        //   632: iconst_m1      
        //   633: istore_2       
        //   634: iload_2        
        //   635: tableswitch {
        //                0: 953
        //                1: 953
        //                2: 927
        //                3: 953
        //                4: 927
        //                5: 953
        //                6: 953
        //                7: 953
        //                8: 953
        //                9: 953
        //               10: 953
        //               11: 823
        //               12: 953
        //               13: 719
        //               14: 953
        //               15: 953
        //               16: 953
        //          default: 716
        //        }
        //   716: goto            969
        //   719: aload_0        
        //   720: getfield        lmj.c:Ljc8;
        //   723: astore          13
        //   725: aload           13
        //   727: getfield        jc8.b:Z
        //   730: ifne            736
        //   733: goto            804
        //   736: invokestatic    java/lang/System.currentTimeMillis:()J
        //   739: invokestatic    d4j.w:(J)I
        //   742: istore_2       
        //   743: iload_2        
        //   744: ifeq            804
        //   747: aload           13
        //   749: iload_2        
        //   750: invokevirtual   jc8.d:(I)Llrs;
        //   753: astore          12
        //   755: aload           12
        //   757: getfield        lrs.f:Ljava/lang/String;
        //   760: invokestatic    jc8.g:(Ljava/lang/String;)[J
        //   763: astore          11
        //   765: invokestatic    jc8.b:()I
        //   768: istore_2       
        //   769: aload           11
        //   771: iload_2        
        //   772: aload           11
        //   774: iload_2        
        //   775: laload         
        //   776: lconst_1       
        //   777: ladd           
        //   778: lastore        
        //   779: aload           12
        //   781: aload           11
        //   783: invokestatic    vq9.r:(Ljava/lang/Object;)Ljava/lang/String;
        //   786: putfield        lrs.f:Ljava/lang/String;
        //   789: aload           13
        //   791: getfield        jc8.a:Lcom/openback/db/decisions/DecisionsDatabase;
        //   794: invokevirtual   com/openback/db/decisions/DecisionsDatabase.t:()Lbrs;
        //   797: aload           12
        //   799: invokeinterface brs.a:(Llrs;)V
        //   804: aload_1        
        //   805: ldc             "com.openback.extra.COMMAND"
        //   807: new             Lat4;
        //   810: dup            
        //   811: ldc             "messages_check"
        //   813: invokespecial   at4.<init>:(Ljava/lang/String;)V
        //   816: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   819: pop            
        //   820: goto            969
        //   823: aload_0        
        //   824: getfield        lmj.c:Ljc8;
        //   827: astore          12
        //   829: aload           12
        //   831: getfield        jc8.b:Z
        //   834: ifne            840
        //   837: goto            908
        //   840: invokestatic    java/lang/System.currentTimeMillis:()J
        //   843: invokestatic    d4j.w:(J)I
        //   846: istore_2       
        //   847: iload_2        
        //   848: ifeq            908
        //   851: aload           12
        //   853: iload_2        
        //   854: invokevirtual   jc8.d:(I)Llrs;
        //   857: astore          11
        //   859: aload           11
        //   861: getfield        lrs.d:Ljava/lang/String;
        //   864: invokestatic    jc8.g:(Ljava/lang/String;)[J
        //   867: astore          13
        //   869: invokestatic    jc8.b:()I
        //   872: istore_2       
        //   873: aload           13
        //   875: iload_2        
        //   876: aload           13
        //   878: iload_2        
        //   879: laload         
        //   880: lconst_1       
        //   881: ladd           
        //   882: lastore        
        //   883: aload           11
        //   885: aload           13
        //   887: invokestatic    vq9.r:(Ljava/lang/Object;)Ljava/lang/String;
        //   890: putfield        lrs.d:Ljava/lang/String;
        //   893: aload           12
        //   895: getfield        jc8.a:Lcom/openback/db/decisions/DecisionsDatabase;
        //   898: invokevirtual   com/openback/db/decisions/DecisionsDatabase.t:()Lbrs;
        //   901: aload           11
        //   903: invokeinterface brs.a:(Llrs;)V
        //   908: aload_1        
        //   909: ldc             "com.openback.extra.COMMAND"
        //   911: new             Lat4;
        //   914: dup            
        //   915: ldc             "messages_check"
        //   917: invokespecial   at4.<init>:(Ljava/lang/String;)V
        //   920: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   923: pop            
        //   924: goto            969
        //   927: aload_0        
        //   928: getfield        lmj.e:Ludi;
        //   931: invokevirtual   udi.a:()V
        //   934: aload_1        
        //   935: ldc             "com.openback.extra.COMMAND"
        //   937: new             Lat4;
        //   940: dup            
        //   941: ldc             "messages_check"
        //   943: invokespecial   at4.<init>:(Ljava/lang/String;)V
        //   946: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   949: pop            
        //   950: goto            969
        //   953: aload_1        
        //   954: ldc             "com.openback.extra.COMMAND"
        //   956: new             Lat4;
        //   959: dup            
        //   960: ldc             "messages_check"
        //   962: invokespecial   at4.<init>:(Ljava/lang/String;)V
        //   965: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   968: pop            
        //   969: aload_1        
        //   970: ldc             "com.openback.extra.COMMAND"
        //   972: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //   975: ifeq            991
        //   978: aload_1        
        //   979: ldc             "com.openback.extra.COMMAND"
        //   981: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   984: checkcast       Lat4;
        //   987: astore_1       
        //   988: goto            993
        //   991: aconst_null    
        //   992: astore_1       
        //   993: aload_1        
        //   994: astore          11
        //   996: aload_1        
        //   997: ifnonnull       1011
        //  1000: new             Lat4;
        //  1003: dup            
        //  1004: ldc             "openback_noop"
        //  1006: invokespecial   at4.<init>:(Ljava/lang/String;)V
        //  1009: astore          11
        //  1011: aload           11
        //  1013: getfield        at4.cmd:Ljava/lang/String;
        //  1016: astore_1       
        //  1017: aload_1        
        //  1018: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1021: pop            
        //  1022: aload_1        
        //  1023: invokevirtual   java/lang/String.hashCode:()I
        //  1026: istore_2       
        //  1027: iload_2        
        //  1028: ldc             -840564400
        //  1030: if_icmpeq       1082
        //  1033: iload_2        
        //  1034: ldc             -289059391
        //  1036: if_icmpeq       1065
        //  1039: iload_2        
        //  1040: ldc             -287705900
        //  1042: if_icmpeq       1048
        //  1045: goto            1091
        //  1048: aload_1        
        //  1049: ldc             "openback_start"
        //  1051: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1054: ifne            1060
        //  1057: goto            1091
        //  1060: iconst_2       
        //  1061: istore_2       
        //  1062: goto            1098
        //  1065: aload_1        
        //  1066: ldc             "openback_reset"
        //  1068: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1071: ifne            1077
        //  1074: goto            1091
        //  1077: iconst_1       
        //  1078: istore_2       
        //  1079: goto            1098
        //  1082: aload_1        
        //  1083: ldc             "openback_stop"
        //  1085: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1088: ifne            1096
        //  1091: iconst_m1      
        //  1092: istore_2       
        //  1093: goto            1098
        //  1096: iconst_0       
        //  1097: istore_2       
        //  1098: iload_2        
        //  1099: ifeq            1294
        //  1102: iload_2        
        //  1103: iconst_1       
        //  1104: if_icmpeq       1122
        //  1107: iload_2        
        //  1108: iconst_2       
        //  1109: if_icmpeq       1115
        //  1112: goto            1344
        //  1115: aload_0        
        //  1116: invokevirtual   lmj.f:()V
        //  1119: goto            1344
        //  1122: aload_0        
        //  1123: getfield        lmj.m:Z
        //  1126: ifne            1133
        //  1129: aload_0        
        //  1130: invokevirtual   lmj.e:()V
        //  1133: aload_0        
        //  1134: getfield        lmj.a:Luop;
        //  1137: ifnonnull       1151
        //  1140: aload_0        
        //  1141: new             Luop;
        //  1144: dup            
        //  1145: invokespecial   uop.<init>:()V
        //  1148: putfield        lmj.a:Luop;
        //  1151: aload_0        
        //  1152: getfield        lmj.f:Llwk;
        //  1155: astore          13
        //  1157: aload_0        
        //  1158: getfield        lmj.a:Luop;
        //  1161: astore_1       
        //  1162: aload           13
        //  1164: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1167: pop            
        //  1168: aload_1        
        //  1169: ifnonnull       1184
        //  1172: aload           13
        //  1174: ldc_w           "OpenBackSettings"
        //  1177: aconst_null    
        //  1178: invokevirtual   lwk.f:(Ljava/lang/String;Ljava/lang/String;)V
        //  1181: goto            1208
        //  1184: new             Lcom/google/gson/Gson;
        //  1187: astore          12
        //  1189: aload           12
        //  1191: invokespecial   com/google/gson/Gson.<init>:()V
        //  1194: aload           13
        //  1196: ldc_w           "OpenBackSettings"
        //  1199: aload           12
        //  1201: aload_1        
        //  1202: invokevirtual   com/google/gson/Gson.h:(Ljava/lang/Object;)Ljava/lang/String;
        //  1205: invokevirtual   lwk.f:(Ljava/lang/String;Ljava/lang/String;)V
        //  1208: aload_0        
        //  1209: getfield        lmj.d:Ly7h;
        //  1212: astore_1       
        //  1213: aload_1        
        //  1214: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1217: pop            
        //  1218: aload_1        
        //  1219: new             Ls8h;
        //  1222: dup            
        //  1223: invokespecial   s8h.<init>:()V
        //  1226: putfield        y7h.a:Ls8h;
        //  1229: aload_1        
        //  1230: invokevirtual   y7h.c:()V
        //  1233: aload_1        
        //  1234: lconst_0       
        //  1235: putfield        y7h.c:J
        //  1238: aload_1        
        //  1239: getfield        y7h.d:Llmj;
        //  1242: getfield        lmj.f:Llwk;
        //  1245: lconst_0       
        //  1246: invokevirtual   lwk.e:(J)V
        //  1249: aload_1        
        //  1250: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1253: invokevirtual   ldn.d:()V
        //  1256: aload_0        
        //  1257: getfield        lmj.c:Ljc8;
        //  1260: getfield        jc8.a:Lcom/openback/db/decisions/DecisionsDatabase;
        //  1263: invokevirtual   ldn.d:()V
        //  1266: aload_0        
        //  1267: getfield        lmj.h:Luaf;
        //  1270: astore_1       
        //  1271: aload_1        
        //  1272: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1275: pop            
        //  1276: aload_1        
        //  1277: new             Lvaf;
        //  1280: dup            
        //  1281: invokespecial   vaf.<init>:()V
        //  1284: putfield        uaf.L0:Lvaf;
        //  1287: aload_1        
        //  1288: invokevirtual   uaf.b:()V
        //  1291: goto            1344
        //  1294: aload_0        
        //  1295: getfield        lmj.j:Z
        //  1298: ifne            1310
        //  1301: ldc_w           "OpenBack is already stopped"
        //  1304: invokestatic    lp7.h0:(Ljava/lang/String;)V
        //  1307: goto            1344
        //  1310: ldc_w           "Stopping OpenBack"
        //  1313: invokestatic    lp7.h0:(Ljava/lang/String;)V
        //  1316: aload_0        
        //  1317: iconst_0       
        //  1318: putfield        lmj.j:Z
        //  1321: aload_0        
        //  1322: getfield        lmj.f:Llwk;
        //  1325: iconst_0       
        //  1326: invokevirtual   lwk.d:(Z)V
        //  1329: aload_0        
        //  1330: getfield        lmj.i:Landroid/content/Context;
        //  1333: iconst_0       
        //  1334: invokestatic    com/openback/receiver/OpenBackReceiver.a:(Landroid/content/Context;Z)V
        //  1337: aload_0        
        //  1338: getfield        lmj.b:Lfw;
        //  1341: invokevirtual   fw.a:()V
        //  1344: aload_0        
        //  1345: getfield        lmj.j:Z
        //  1348: ifne            1354
        //  1351: goto            4060
        //  1354: aload_0        
        //  1355: getfield        lmj.d:Ly7h;
        //  1358: astore_1       
        //  1359: aload_1        
        //  1360: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1363: pop            
        //  1364: aload_1        
        //  1365: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1368: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  1371: invokeinterface h7h.h:()Ljava/util/List;
        //  1376: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1381: astore          12
        //  1383: aload           12
        //  1385: invokeinterface java/util/Iterator.hasNext:()Z
        //  1390: ifeq            1553
        //  1393: aload           12
        //  1395: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1400: checkcast       Lj8h;
        //  1403: astore          13
        //  1405: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1408: bipush          23
        //  1410: if_icmplt       1383
        //  1413: aload_1        
        //  1414: getfield        y7h.d:Llmj;
        //  1417: getfield        lmj.i:Landroid/content/Context;
        //  1420: aload           13
        //  1422: getfield        j8h.u:I
        //  1425: aload           13
        //  1427: getfield        j8h.v:Ljava/lang/String;
        //  1430: invokestatic    gwi.a:(Landroid/content/Context;ILjava/lang/String;)Z
        //  1433: ifne            1383
        //  1436: aload           13
        //  1438: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1441: putfield        j8h.e:J
        //  1444: aload           13
        //  1446: lconst_0       
        //  1447: putfield        j8h.h:J
        //  1450: aload           13
        //  1452: iconst_0       
        //  1453: putfield        j8h.i:Z
        //  1456: aload           13
        //  1458: aload           13
        //  1460: getfield        j8h.m:J
        //  1463: lconst_1       
        //  1464: ladd           
        //  1465: putfield        j8h.m:J
        //  1468: aload           13
        //  1470: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1473: putfield        j8h.r:J
        //  1476: aload           13
        //  1478: iconst_0       
        //  1479: putfield        j8h.u:I
        //  1482: aload           13
        //  1484: aconst_null    
        //  1485: putfield        j8h.v:Ljava/lang/String;
        //  1488: aload           13
        //  1490: aload           13
        //  1492: getfield        j8h.c:Lk6h;
        //  1495: invokevirtual   k6h.b:()J
        //  1498: putfield        j8h.f:J
        //  1501: aload_1        
        //  1502: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1505: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  1508: aload           13
        //  1510: invokeinterface h7h.i:(Lj8h;)V
        //  1515: aload_1        
        //  1516: getfield        y7h.d:Llmj;
        //  1519: getfield        lmj.c:Ljc8;
        //  1522: aload           13
        //  1524: getfield        j8h.c:Lk6h;
        //  1527: invokevirtual   jc8.f:(Lk6h;)V
        //  1530: aload_1        
        //  1531: getfield        y7h.d:Llmj;
        //  1534: getfield        lmj.i:Landroid/content/Context;
        //  1537: ldc_w           "message_dimissed"
        //  1540: aconst_null    
        //  1541: aconst_null    
        //  1542: aload           13
        //  1544: getfield        j8h.b:Ljava/lang/String;
        //  1547: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  1550: goto            1383
        //  1553: aload_0        
        //  1554: getfield        lmj.d:Ly7h;
        //  1557: astore          13
        //  1559: aload           13
        //  1561: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1564: pop            
        //  1565: aload           13
        //  1567: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1570: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  1573: invokeinterface h7h.a:()Ljava/util/List;
        //  1578: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1583: astore          12
        //  1585: aload           12
        //  1587: invokeinterface java/util/Iterator.hasNext:()Z
        //  1592: ifeq            1930
        //  1595: aload           12
        //  1597: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1602: checkcast       Lj8h;
        //  1605: astore_1       
        //  1606: aload_1        
        //  1607: getfield        j8h.f:J
        //  1610: lstore_3       
        //  1611: lload_3        
        //  1612: lconst_0       
        //  1613: lcmp           
        //  1614: ifle            1927
        //  1617: lload_3        
        //  1618: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1621: lcmp           
        //  1622: ifgt            1927
        //  1625: aload_1        
        //  1626: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1629: putfield        j8h.e:J
        //  1632: aload_1        
        //  1633: lconst_0       
        //  1634: putfield        j8h.h:J
        //  1637: aload_1        
        //  1638: iconst_0       
        //  1639: putfield        j8h.i:Z
        //  1642: aload_1        
        //  1643: iconst_0       
        //  1644: putfield        j8h.u:I
        //  1647: aload_1        
        //  1648: aconst_null    
        //  1649: putfield        j8h.v:Ljava/lang/String;
        //  1652: aload_1        
        //  1653: getfield        j8h.c:Lk6h;
        //  1656: invokevirtual   k6h.b:()J
        //  1659: lstore_3       
        //  1660: aload_1        
        //  1661: lload_3        
        //  1662: putfield        j8h.f:J
        //  1665: lload_3        
        //  1666: lconst_0       
        //  1667: lcmp           
        //  1668: ifle            1684
        //  1671: lload_3        
        //  1672: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1675: lcmp           
        //  1676: ifgt            1684
        //  1679: aload_1        
        //  1680: iconst_1       
        //  1681: putfield        j8h.j:Z
        //  1684: aload_1        
        //  1685: getfield        j8h.c:Lk6h;
        //  1688: astore          14
        //  1690: aload           14
        //  1692: getfield        k6h.expiration:Lk6h$b;
        //  1695: astore          15
        //  1697: aload           15
        //  1699: ifnull          1827
        //  1702: aload           15
        //  1704: getfield        k6h$b.fallback:Z
        //  1707: ifeq            1827
        //  1710: aload_1        
        //  1711: iconst_1       
        //  1712: putfield        j8h.i:Z
        //  1715: aload_1        
        //  1716: aload_1        
        //  1717: getfield        j8h.n:J
        //  1720: lconst_1       
        //  1721: ladd           
        //  1722: putfield        j8h.n:J
        //  1725: aload_1        
        //  1726: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1729: putfield        j8h.s:J
        //  1732: aload           13
        //  1734: getfield        y7h.d:Llmj;
        //  1737: getfield        lmj.i:Landroid/content/Context;
        //  1740: astore          16
        //  1742: aload_1        
        //  1743: getfield        j8h.c:Lk6h;
        //  1746: astore          14
        //  1748: getstatic       nmj.M0:I
        //  1751: istore_2       
        //  1752: new             Landroid/content/Intent;
        //  1755: astore          15
        //  1757: aload           15
        //  1759: invokespecial   android/content/Intent.<init>:()V
        //  1762: aload           15
        //  1764: ldc_w           "com.openback.intent.action.MESSAGE_EVENT"
        //  1767: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  1770: pop            
        //  1771: aload           15
        //  1773: ldc_w           "com.openback.intent.extra.MESSAGE_EVENT_TYPE"
        //  1776: ldc_w           "MessageFallback"
        //  1779: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1782: pop            
        //  1783: aload           15
        //  1785: ldc_w           "com.openback.intent.extra.MESSAGE_EVENT_MESSAGE"
        //  1788: aload           14
        //  1790: invokevirtual   k6h.d:()Ljava/lang/String;
        //  1793: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1796: pop            
        //  1797: aload           16
        //  1799: aload           15
        //  1801: invokestatic    nmj.f:(Landroid/content/Context;Landroid/content/Intent;)V
        //  1804: aload           13
        //  1806: getfield        y7h.d:Llmj;
        //  1809: getfield        lmj.i:Landroid/content/Context;
        //  1812: ldc_w           "message_fallback"
        //  1815: aconst_null    
        //  1816: aconst_null    
        //  1817: aload_1        
        //  1818: getfield        j8h.b:Ljava/lang/String;
        //  1821: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  1824: goto            1913
        //  1827: aload           13
        //  1829: getfield        y7h.d:Llmj;
        //  1832: getfield        lmj.i:Landroid/content/Context;
        //  1835: astore          16
        //  1837: getstatic       nmj.M0:I
        //  1840: istore_2       
        //  1841: new             Landroid/content/Intent;
        //  1844: astore          15
        //  1846: aload           15
        //  1848: invokespecial   android/content/Intent.<init>:()V
        //  1851: aload           15
        //  1853: ldc_w           "com.openback.intent.action.MESSAGE_EVENT"
        //  1856: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  1859: pop            
        //  1860: aload           15
        //  1862: ldc_w           "com.openback.intent.extra.MESSAGE_EVENT_TYPE"
        //  1865: ldc_w           "MessageExpired"
        //  1868: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1871: pop            
        //  1872: aload           15
        //  1874: ldc_w           "com.openback.intent.extra.MESSAGE_EVENT_MESSAGE"
        //  1877: aload           14
        //  1879: invokevirtual   k6h.d:()Ljava/lang/String;
        //  1882: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1885: pop            
        //  1886: aload           16
        //  1888: aload           15
        //  1890: invokestatic    nmj.f:(Landroid/content/Context;Landroid/content/Intent;)V
        //  1893: aload           13
        //  1895: getfield        y7h.d:Llmj;
        //  1898: getfield        lmj.i:Landroid/content/Context;
        //  1901: ldc_w           "message_expired"
        //  1904: aconst_null    
        //  1905: aconst_null    
        //  1906: aload_1        
        //  1907: getfield        j8h.b:Ljava/lang/String;
        //  1910: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  1913: aload           13
        //  1915: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1918: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  1921: aload_1        
        //  1922: invokeinterface h7h.i:(Lj8h;)V
        //  1927: goto            1585
        //  1930: aload_0        
        //  1931: getfield        lmj.d:Ly7h;
        //  1934: astore          12
        //  1936: aload           12
        //  1938: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1941: pop            
        //  1942: aload           12
        //  1944: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1947: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  1950: invokeinterface h7h.d:()Ljava/util/List;
        //  1955: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1960: astore          13
        //  1962: aload           13
        //  1964: invokeinterface java/util/Iterator.hasNext:()Z
        //  1969: ifeq            2113
        //  1972: aload           13
        //  1974: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1979: checkcast       Lj8h;
        //  1982: astore_1       
        //  1983: aload_1        
        //  1984: getfield        j8h.h:J
        //  1987: lstore_3       
        //  1988: lload_3        
        //  1989: lconst_0       
        //  1990: lcmp           
        //  1991: ifle            1962
        //  1994: lload_3        
        //  1995: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1998: lcmp           
        //  1999: ifgt            1962
        //  2002: aload_1        
        //  2003: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2006: putfield        j8h.e:J
        //  2009: aload_1        
        //  2010: lconst_0       
        //  2011: putfield        j8h.h:J
        //  2014: aload_1        
        //  2015: aload_1        
        //  2016: getfield        j8h.n:J
        //  2019: lconst_1       
        //  2020: ladd           
        //  2021: putfield        j8h.n:J
        //  2024: aload_1        
        //  2025: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2028: putfield        j8h.s:J
        //  2031: aload_1        
        //  2032: iconst_1       
        //  2033: putfield        j8h.i:Z
        //  2036: aload_1        
        //  2037: iconst_0       
        //  2038: putfield        j8h.u:I
        //  2041: aload_1        
        //  2042: aconst_null    
        //  2043: putfield        j8h.v:Ljava/lang/String;
        //  2046: aload_1        
        //  2047: aload_1        
        //  2048: getfield        j8h.c:Lk6h;
        //  2051: invokevirtual   k6h.b:()J
        //  2054: putfield        j8h.f:J
        //  2057: aload           12
        //  2059: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  2062: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  2065: aload_1        
        //  2066: invokeinterface h7h.i:(Lj8h;)V
        //  2071: aload           12
        //  2073: getfield        y7h.d:Llmj;
        //  2076: getfield        lmj.i:Landroid/content/Context;
        //  2079: aload_1        
        //  2080: getfield        j8h.c:Lk6h;
        //  2083: invokestatic    nmj.e:(Landroid/content/Context;Lk6h;)V
        //  2086: aload           12
        //  2088: getfield        y7h.d:Llmj;
        //  2091: getfield        lmj.i:Landroid/content/Context;
        //  2094: ldc_w           "message_triggered"
        //  2097: aload_1        
        //  2098: getfield        j8h.c:Lk6h;
        //  2101: aconst_null    
        //  2102: aconst_null    
        //  2103: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  2106: goto            1962
        //  2109: astore_1       
        //  2110: goto            2113
        //  2113: aload           11
        //  2115: getfield        at4.cmd:Ljava/lang/String;
        //  2118: astore_1       
        //  2119: aload_1        
        //  2120: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2123: pop            
        //  2124: aload_1        
        //  2125: invokevirtual   java/lang/String.hashCode:()I
        //  2128: lookupswitch {
        //          -1389642389: 2415
        //          -1268243666: 2397
        //          -1093236182: 2379
        //          -341557265: 2361
        //          54220321: 2343
        //          305013361: 2325
        //          393140905: 2306
        //          550333594: 2287
        //          990519381: 2269
        //          1068246743: 2250
        //          1399842748: 2231
        //          default: 2228
        //        }
        //  2228: goto            2433
        //  2231: aload_1        
        //  2232: ldc_w           "messages_usage_clear"
        //  2235: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2238: ifne            2244
        //  2241: goto            2433
        //  2244: bipush          10
        //  2246: istore_2       
        //  2247: goto            2435
        //  2250: aload_1        
        //  2251: ldc_w           "messages_remove"
        //  2254: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2257: ifne            2263
        //  2260: goto            2433
        //  2263: bipush          9
        //  2265: istore_2       
        //  2266: goto            2435
        //  2269: aload_1        
        //  2270: ldc             "messages_check"
        //  2272: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2275: ifne            2281
        //  2278: goto            2433
        //  2281: bipush          8
        //  2283: istore_2       
        //  2284: goto            2435
        //  2287: aload_1        
        //  2288: ldc_w           "message_ignored"
        //  2291: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2294: ifne            2300
        //  2297: goto            2433
        //  2300: bipush          7
        //  2302: istore_2       
        //  2303: goto            2435
        //  2306: aload_1        
        //  2307: ldc_w           "message_displayed"
        //  2310: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2313: ifne            2319
        //  2316: goto            2433
        //  2319: bipush          6
        //  2321: istore_2       
        //  2322: goto            2435
        //  2325: aload_1        
        //  2326: ldc_w           "message_dismissed"
        //  2329: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2332: ifne            2338
        //  2335: goto            2433
        //  2338: iconst_5       
        //  2339: istore_2       
        //  2340: goto            2435
        //  2343: aload_1        
        //  2344: ldc_w           "app_foreground"
        //  2347: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2350: ifne            2356
        //  2353: goto            2433
        //  2356: iconst_4       
        //  2357: istore_2       
        //  2358: goto            2435
        //  2361: aload_1        
        //  2362: ldc_w           "message_clicked"
        //  2365: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2368: ifne            2374
        //  2371: goto            2433
        //  2374: iconst_3       
        //  2375: istore_2       
        //  2376: goto            2435
        //  2379: aload_1        
        //  2380: ldc_w           "messages_clear_count"
        //  2383: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2386: ifne            2392
        //  2389: goto            2433
        //  2392: iconst_2       
        //  2393: istore_2       
        //  2394: goto            2435
        //  2397: aload_1        
        //  2398: ldc_w           "messages_add"
        //  2401: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2404: ifne            2410
        //  2407: goto            2433
        //  2410: iconst_1       
        //  2411: istore_2       
        //  2412: goto            2435
        //  2415: aload_1        
        //  2416: ldc_w           "messages_remove_not"
        //  2419: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2422: ifne            2428
        //  2425: goto            2433
        //  2428: iconst_0       
        //  2429: istore_2       
        //  2430: goto            2435
        //  2433: iconst_m1      
        //  2434: istore_2       
        //  2435: iload_2        
        //  2436: tableswitch {
        //                0: 3756
        //                1: 3633
        //                2: 3583
        //                3: 3423
        //                4: 3335
        //                5: 3175
        //                6: 2861
        //                7: 2719
        //                8: 2651
        //                9: 2527
        //               10: 2499
        //          default: 2496
        //        }
        //  2496: goto            3904
        //  2499: aload_0        
        //  2500: getfield        lmj.d:Ly7h;
        //  2503: astore_1       
        //  2504: aload_1        
        //  2505: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2508: pop            
        //  2509: aload_1        
        //  2510: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  2513: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  2516: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2519: invokeinterface h7h.j:(J)V
        //  2524: goto            3904
        //  2527: aload           11
        //  2529: getfield        at4.params:Ljava/lang/String;
        //  2532: astore          11
        //  2534: aload           11
        //  2536: ifnull          3904
        //  2539: aload_0        
        //  2540: getfield        lmj.d:Ly7h;
        //  2543: astore_1       
        //  2544: aload_1        
        //  2545: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2548: pop            
        //  2549: new             Lcom/google/gson/Gson;
        //  2552: astore          12
        //  2554: aload           12
        //  2556: invokespecial   com/google/gson/Gson.<init>:()V
        //  2559: new             Lw7h;
        //  2562: astore          13
        //  2564: aload           13
        //  2566: invokespecial   w7h.<init>:()V
        //  2569: aload           12
        //  2571: aload           11
        //  2573: aload           13
        //  2575: getfield        nlv.type:Ljava/lang/reflect/Type;
        //  2578: invokevirtual   com/google/gson/Gson.d:(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
        //  2581: checkcast       Ljava/util/List;
        //  2584: astore          11
        //  2586: aload_1        
        //  2587: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  2590: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  2593: aload           11
        //  2595: invokeinterface h7h.b:(Ljava/util/List;)V
        //  2600: aload           11
        //  2602: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2607: astore          12
        //  2609: aload           12
        //  2611: invokeinterface java/util/Iterator.hasNext:()Z
        //  2616: ifeq            3904
        //  2619: aload           12
        //  2621: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2626: checkcast       Ljava/lang/String;
        //  2629: astore          11
        //  2631: aload_1        
        //  2632: getfield        y7h.d:Llmj;
        //  2635: getfield        lmj.i:Landroid/content/Context;
        //  2638: ldc_w           "message_removed"
        //  2641: aconst_null    
        //  2642: aconst_null    
        //  2643: aload           11
        //  2645: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  2648: goto            2609
        //  2651: aload_0        
        //  2652: getfield        lmj.d:Ly7h;
        //  2655: astore          12
        //  2657: aload           12
        //  2659: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2662: pop            
        //  2663: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2666: aload           12
        //  2668: getfield        y7h.a:Ls8h;
        //  2671: getfield        s8h.lastMessageChecked:J
        //  2674: lsub           
        //  2675: ldc2_w          1000
        //  2678: lcmp           
        //  2679: ifge            2685
        //  2682: goto            3904
        //  2685: aload           12
        //  2687: getfield        y7h.d:Llmj;
        //  2690: getfield        lmj.g:Lclr;
        //  2693: astore          11
        //  2695: new             Lgv8;
        //  2698: astore_1       
        //  2699: aload_1        
        //  2700: invokespecial   gv8.<init>:()V
        //  2703: aload           11
        //  2705: aload_1        
        //  2706: putfield        clr.F0:Ljava/lang/Object;
        //  2709: aload           12
        //  2711: aload           11
        //  2713: invokevirtual   y7h.a:(Lclr;)V
        //  2716: goto            3904
        //  2719: aload           11
        //  2721: getfield        at4.params:Ljava/lang/String;
        //  2724: astore          11
        //  2726: aload           11
        //  2728: ifnull          3904
        //  2731: aload_0        
        //  2732: getfield        lmj.d:Ly7h;
        //  2735: astore_1       
        //  2736: aload_1        
        //  2737: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2740: pop            
        //  2741: aload_1        
        //  2742: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  2745: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  2748: aload           11
        //  2750: invokeinterface h7h.f:(Ljava/lang/String;)Lj8h;
        //  2755: astore          12
        //  2757: aload           12
        //  2759: ifnull          3904
        //  2762: aload           12
        //  2764: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2767: putfield        j8h.e:J
        //  2770: aload           12
        //  2772: lconst_0       
        //  2773: putfield        j8h.h:J
        //  2776: aload           12
        //  2778: iconst_0       
        //  2779: putfield        j8h.i:Z
        //  2782: aload           12
        //  2784: aload           12
        //  2786: getfield        j8h.o:J
        //  2789: lconst_1       
        //  2790: ladd           
        //  2791: putfield        j8h.o:J
        //  2794: aload           12
        //  2796: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2799: putfield        j8h.t:J
        //  2802: aload           12
        //  2804: iconst_0       
        //  2805: putfield        j8h.u:I
        //  2808: aload           12
        //  2810: aconst_null    
        //  2811: putfield        j8h.v:Ljava/lang/String;
        //  2814: aload           12
        //  2816: aload           12
        //  2818: getfield        j8h.c:Lk6h;
        //  2821: invokevirtual   k6h.b:()J
        //  2824: putfield        j8h.f:J
        //  2827: aload_1        
        //  2828: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  2831: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  2834: aload           12
        //  2836: invokeinterface h7h.i:(Lj8h;)V
        //  2841: aload_1        
        //  2842: getfield        y7h.d:Llmj;
        //  2845: getfield        lmj.i:Landroid/content/Context;
        //  2848: ldc_w           "message_ignored"
        //  2851: aconst_null    
        //  2852: aconst_null    
        //  2853: aload           11
        //  2855: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  2858: goto            3904
        //  2861: aload           11
        //  2863: getfield        at4.params:Ljava/lang/String;
        //  2866: astore          11
        //  2868: aload           11
        //  2870: ifnull          3904
        //  2873: aload_0        
        //  2874: getfield        lmj.d:Ly7h;
        //  2877: astore_1       
        //  2878: aload_1        
        //  2879: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2882: pop            
        //  2883: new             Lcom/google/gson/Gson;
        //  2886: astore          12
        //  2888: aload           12
        //  2890: invokespecial   com/google/gson/Gson.<init>:()V
        //  2893: aload           12
        //  2895: aload           11
        //  2897: ldc_w           Lx29;.class
        //  2900: invokevirtual   com/google/gson/Gson.c:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //  2903: checkcast       Lx29;
        //  2906: astore          11
        //  2908: aload_1        
        //  2909: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  2912: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  2915: aload           11
        //  2917: getfield        x29.messageId:Ljava/lang/String;
        //  2920: invokeinterface h7h.f:(Ljava/lang/String;)Lj8h;
        //  2925: astore          12
        //  2927: aload           12
        //  2929: ifnull          3904
        //  2932: aload_1        
        //  2933: getfield        y7h.a:Ls8h;
        //  2936: astore          13
        //  2938: aload           13
        //  2940: aload           13
        //  2942: getfield        s8h.currentHourCount:J
        //  2945: lconst_1       
        //  2946: ladd           
        //  2947: putfield        s8h.currentHourCount:J
        //  2950: aload           13
        //  2952: aload           13
        //  2954: getfield        s8h.currentDayCount:J
        //  2957: lconst_1       
        //  2958: ladd           
        //  2959: putfield        s8h.currentDayCount:J
        //  2962: aload           13
        //  2964: aload           13
        //  2966: getfield        s8h.currentWeekCount:J
        //  2969: lconst_1       
        //  2970: ladd           
        //  2971: putfield        s8h.currentWeekCount:J
        //  2974: aload           13
        //  2976: aload           13
        //  2978: getfield        s8h.currentMonthCount:J
        //  2981: lconst_1       
        //  2982: ladd           
        //  2983: putfield        s8h.currentMonthCount:J
        //  2986: aload           13
        //  2988: aload           13
        //  2990: getfield        s8h.currentYearCount:J
        //  2993: lconst_1       
        //  2994: ladd           
        //  2995: putfield        s8h.currentYearCount:J
        //  2998: aload           13
        //  3000: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3003: putfield        s8h.lastMessageDisplayed:J
        //  3006: aload_1        
        //  3007: invokevirtual   y7h.c:()V
        //  3010: aload           12
        //  3012: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3015: putfield        j8h.e:J
        //  3018: aload           12
        //  3020: lconst_0       
        //  3021: putfield        j8h.h:J
        //  3024: aload           12
        //  3026: iconst_0       
        //  3027: putfield        j8h.i:Z
        //  3030: aload           12
        //  3032: aload           12
        //  3034: getfield        j8h.l:J
        //  3037: lconst_1       
        //  3038: ladd           
        //  3039: putfield        j8h.l:J
        //  3042: aload           12
        //  3044: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3047: putfield        j8h.q:J
        //  3050: aload           12
        //  3052: aload           11
        //  3054: getfield        x29.notificationId:I
        //  3057: putfield        j8h.u:I
        //  3060: aload           12
        //  3062: aload           11
        //  3064: getfield        x29.notificationTag:Ljava/lang/String;
        //  3067: putfield        j8h.v:Ljava/lang/String;
        //  3070: aload           12
        //  3072: getfield        j8h.c:Lk6h;
        //  3075: getfield        k6h.expiration:Lk6h$b;
        //  3078: astore          13
        //  3080: aload           13
        //  3082: ifnull          3138
        //  3085: aload           13
        //  3087: getfield        k6h$b.afterDisplay:J
        //  3090: lconst_0       
        //  3091: lcmp           
        //  3092: ifle            3138
        //  3095: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3098: aload           12
        //  3100: getfield        j8h.c:Lk6h;
        //  3103: getfield        k6h.expiration:Lk6h$b;
        //  3106: getfield        k6h$b.afterDisplay:J
        //  3109: ladd           
        //  3110: lstore_3       
        //  3111: aload           12
        //  3113: getfield        j8h.f:J
        //  3116: lstore          5
        //  3118: lload           5
        //  3120: lconst_0       
        //  3121: lcmp           
        //  3122: ifeq            3132
        //  3125: lload_3        
        //  3126: lload           5
        //  3128: lcmp           
        //  3129: ifge            3138
        //  3132: aload           12
        //  3134: lload_3        
        //  3135: putfield        j8h.f:J
        //  3138: aload_1        
        //  3139: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3142: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3145: aload           12
        //  3147: invokeinterface h7h.i:(Lj8h;)V
        //  3152: aload_1        
        //  3153: getfield        y7h.d:Llmj;
        //  3156: getfield        lmj.i:Landroid/content/Context;
        //  3159: ldc_w           "message_displayed"
        //  3162: aconst_null    
        //  3163: aconst_null    
        //  3164: aload           11
        //  3166: getfield        x29.messageId:Ljava/lang/String;
        //  3169: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  3172: goto            3904
        //  3175: aload           11
        //  3177: getfield        at4.params:Ljava/lang/String;
        //  3180: astore          11
        //  3182: aload           11
        //  3184: ifnull          3904
        //  3187: aload_0        
        //  3188: getfield        lmj.d:Ly7h;
        //  3191: astore_1       
        //  3192: aload_1        
        //  3193: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3196: pop            
        //  3197: aload_1        
        //  3198: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3201: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3204: aload           11
        //  3206: invokeinterface h7h.f:(Ljava/lang/String;)Lj8h;
        //  3211: astore          11
        //  3213: aload           11
        //  3215: ifnull          3904
        //  3218: aload           11
        //  3220: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3223: putfield        j8h.e:J
        //  3226: aload           11
        //  3228: lconst_0       
        //  3229: putfield        j8h.h:J
        //  3232: aload           11
        //  3234: iconst_0       
        //  3235: putfield        j8h.i:Z
        //  3238: aload           11
        //  3240: aload           11
        //  3242: getfield        j8h.m:J
        //  3245: lconst_1       
        //  3246: ladd           
        //  3247: putfield        j8h.m:J
        //  3250: aload           11
        //  3252: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3255: putfield        j8h.r:J
        //  3258: aload           11
        //  3260: iconst_0       
        //  3261: putfield        j8h.u:I
        //  3264: aload           11
        //  3266: aconst_null    
        //  3267: putfield        j8h.v:Ljava/lang/String;
        //  3270: aload           11
        //  3272: aload           11
        //  3274: getfield        j8h.c:Lk6h;
        //  3277: invokevirtual   k6h.b:()J
        //  3280: putfield        j8h.f:J
        //  3283: aload_1        
        //  3284: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3287: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3290: aload           11
        //  3292: invokeinterface h7h.i:(Lj8h;)V
        //  3297: aload_1        
        //  3298: getfield        y7h.d:Llmj;
        //  3301: getfield        lmj.c:Ljc8;
        //  3304: aload           11
        //  3306: getfield        j8h.c:Lk6h;
        //  3309: invokevirtual   jc8.f:(Lk6h;)V
        //  3312: aload_1        
        //  3313: getfield        y7h.d:Llmj;
        //  3316: getfield        lmj.i:Landroid/content/Context;
        //  3319: ldc_w           "message_dimissed"
        //  3322: aconst_null    
        //  3323: aconst_null    
        //  3324: aload           11
        //  3326: getfield        j8h.b:Ljava/lang/String;
        //  3329: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  3332: goto            3904
        //  3335: aload_0        
        //  3336: getfield        lmj.c:Ljc8;
        //  3339: astore_1       
        //  3340: aload_1        
        //  3341: getfield        jc8.b:Z
        //  3344: ifne            3350
        //  3347: goto            3904
        //  3350: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3353: invokestatic    d4j.w:(J)I
        //  3356: istore_2       
        //  3357: iload_2        
        //  3358: ifeq            3904
        //  3361: aload_1        
        //  3362: iload_2        
        //  3363: invokevirtual   jc8.d:(I)Llrs;
        //  3366: astore          12
        //  3368: aload           12
        //  3370: getfield        lrs.e:Ljava/lang/String;
        //  3373: invokestatic    jc8.g:(Ljava/lang/String;)[J
        //  3376: astore          11
        //  3378: invokestatic    jc8.b:()I
        //  3381: istore_2       
        //  3382: aload           11
        //  3384: iload_2        
        //  3385: aload           11
        //  3387: iload_2        
        //  3388: laload         
        //  3389: lconst_1       
        //  3390: ladd           
        //  3391: lastore        
        //  3392: aload           12
        //  3394: aload           11
        //  3396: invokestatic    vq9.r:(Ljava/lang/Object;)Ljava/lang/String;
        //  3399: putfield        lrs.e:Ljava/lang/String;
        //  3402: aload_1        
        //  3403: getfield        jc8.a:Lcom/openback/db/decisions/DecisionsDatabase;
        //  3406: invokevirtual   com/openback/db/decisions/DecisionsDatabase.t:()Lbrs;
        //  3409: aload           12
        //  3411: invokeinterface brs.a:(Llrs;)V
        //  3416: goto            3904
        //  3419: astore_1       
        //  3420: goto            3904
        //  3423: aload           11
        //  3425: getfield        at4.params:Ljava/lang/String;
        //  3428: astore          11
        //  3430: aload           11
        //  3432: ifnull          3904
        //  3435: aload_0        
        //  3436: getfield        lmj.d:Ly7h;
        //  3439: astore_1       
        //  3440: aload_1        
        //  3441: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3444: pop            
        //  3445: aload_1        
        //  3446: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3449: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3452: aload           11
        //  3454: invokeinterface h7h.f:(Ljava/lang/String;)Lj8h;
        //  3459: astore          11
        //  3461: aload           11
        //  3463: ifnull          3904
        //  3466: aload           11
        //  3468: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3471: putfield        j8h.e:J
        //  3474: aload           11
        //  3476: lconst_0       
        //  3477: putfield        j8h.h:J
        //  3480: aload           11
        //  3482: aload           11
        //  3484: getfield        j8h.k:J
        //  3487: lconst_1       
        //  3488: ladd           
        //  3489: putfield        j8h.k:J
        //  3492: aload           11
        //  3494: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3497: putfield        j8h.p:J
        //  3500: aload           11
        //  3502: iconst_0       
        //  3503: putfield        j8h.i:Z
        //  3506: aload           11
        //  3508: iconst_0       
        //  3509: putfield        j8h.u:I
        //  3512: aload           11
        //  3514: aconst_null    
        //  3515: putfield        j8h.v:Ljava/lang/String;
        //  3518: aload           11
        //  3520: aload           11
        //  3522: getfield        j8h.c:Lk6h;
        //  3525: invokevirtual   k6h.b:()J
        //  3528: putfield        j8h.f:J
        //  3531: aload_1        
        //  3532: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3535: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3538: aload           11
        //  3540: invokeinterface h7h.i:(Lj8h;)V
        //  3545: aload_1        
        //  3546: getfield        y7h.d:Llmj;
        //  3549: getfield        lmj.c:Ljc8;
        //  3552: aload           11
        //  3554: getfield        j8h.c:Lk6h;
        //  3557: invokevirtual   jc8.e:(Lk6h;)V
        //  3560: aload_1        
        //  3561: getfield        y7h.d:Llmj;
        //  3564: getfield        lmj.i:Landroid/content/Context;
        //  3567: ldc_w           "message_clicked"
        //  3570: aconst_null    
        //  3571: aconst_null    
        //  3572: aload           11
        //  3574: getfield        j8h.b:Ljava/lang/String;
        //  3577: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  3580: goto            3904
        //  3583: aload_0        
        //  3584: getfield        lmj.d:Ly7h;
        //  3587: astore          11
        //  3589: aload           11
        //  3591: getfield        y7h.a:Ls8h;
        //  3594: astore_1       
        //  3595: aload_1        
        //  3596: lconst_0       
        //  3597: putfield        s8h.currentYearCount:J
        //  3600: aload_1        
        //  3601: lconst_0       
        //  3602: putfield        s8h.currentMonthCount:J
        //  3605: aload_1        
        //  3606: lconst_0       
        //  3607: putfield        s8h.currentWeekCount:J
        //  3610: aload_1        
        //  3611: lconst_0       
        //  3612: putfield        s8h.currentDayCount:J
        //  3615: aload_1        
        //  3616: lconst_0       
        //  3617: putfield        s8h.currentHourCount:J
        //  3620: aload_1        
        //  3621: lconst_0       
        //  3622: putfield        s8h.lastMessageDisplayed:J
        //  3625: aload           11
        //  3627: invokevirtual   y7h.c:()V
        //  3630: goto            3904
        //  3633: aload           11
        //  3635: getfield        at4.params:Ljava/lang/String;
        //  3638: astore          13
        //  3640: aload           13
        //  3642: ifnull          3904
        //  3645: aload_0        
        //  3646: getfield        lmj.d:Ly7h;
        //  3649: astore_1       
        //  3650: aload_1        
        //  3651: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3654: pop            
        //  3655: new             Lcom/google/gson/Gson;
        //  3658: astore          11
        //  3660: aload           11
        //  3662: invokespecial   com/google/gson/Gson.<init>:()V
        //  3665: new             Lv7h;
        //  3668: astore          12
        //  3670: aload           12
        //  3672: invokespecial   v7h.<init>:()V
        //  3675: aload           11
        //  3677: aload           13
        //  3679: aload           12
        //  3681: getfield        nlv.type:Ljava/lang/reflect/Type;
        //  3684: invokevirtual   com/google/gson/Gson.d:(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
        //  3687: checkcast       Ljava/lang/Iterable;
        //  3690: astore          11
        //  3692: aload           11
        //  3694: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  3699: astore          12
        //  3701: aload           12
        //  3703: invokeinterface java/util/Iterator.hasNext:()Z
        //  3708: ifeq            3743
        //  3711: aload           12
        //  3713: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3718: checkcast       Lk6h;
        //  3721: astore          13
        //  3723: aload_1        
        //  3724: getfield        y7h.d:Llmj;
        //  3727: getfield        lmj.i:Landroid/content/Context;
        //  3730: ldc_w           "message_added"
        //  3733: aload           13
        //  3735: aconst_null    
        //  3736: aconst_null    
        //  3737: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  3740: goto            3701
        //  3743: aload_1        
        //  3744: aload           11
        //  3746: invokevirtual   y7h.b:(Ljava/lang/Iterable;)V
        //  3749: aload_1        
        //  3750: invokevirtual   y7h.d:()V
        //  3753: goto            3904
        //  3756: aload           11
        //  3758: getfield        at4.params:Ljava/lang/String;
        //  3761: astore          11
        //  3763: aload           11
        //  3765: ifnull          3904
        //  3768: aload_0        
        //  3769: getfield        lmj.d:Ly7h;
        //  3772: astore_1       
        //  3773: aload_1        
        //  3774: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3777: pop            
        //  3778: new             Lcom/google/gson/Gson;
        //  3781: astore          12
        //  3783: aload           12
        //  3785: invokespecial   com/google/gson/Gson.<init>:()V
        //  3788: new             Lx7h;
        //  3791: astore          13
        //  3793: aload           13
        //  3795: invokespecial   x7h.<init>:()V
        //  3798: aload           12
        //  3800: aload           11
        //  3802: aload           13
        //  3804: getfield        nlv.type:Ljava/lang/reflect/Type;
        //  3807: invokevirtual   com/google/gson/Gson.d:(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
        //  3810: checkcast       Ljava/util/List;
        //  3813: astore          11
        //  3815: aload_1        
        //  3816: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3819: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3822: invokeinterface h7h.e:()Ljava/util/List;
        //  3827: astore          12
        //  3829: aload           12
        //  3831: aload           11
        //  3833: invokeinterface java/util/List.removeAll:(Ljava/util/Collection;)Z
        //  3838: pop            
        //  3839: aload_1        
        //  3840: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3843: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3846: aload           12
        //  3848: invokeinterface h7h.b:(Ljava/util/List;)V
        //  3853: aload           12
        //  3855: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3860: astore          11
        //  3862: aload           11
        //  3864: invokeinterface java/util/Iterator.hasNext:()Z
        //  3869: ifeq            3904
        //  3872: aload           11
        //  3874: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3879: checkcast       Ljava/lang/String;
        //  3882: astore          12
        //  3884: aload_1        
        //  3885: getfield        y7h.d:Llmj;
        //  3888: getfield        lmj.i:Landroid/content/Context;
        //  3891: ldc_w           "message_removed"
        //  3894: aconst_null    
        //  3895: aconst_null    
        //  3896: aload           12
        //  3898: invokestatic    yru.x:(Landroid/content/Context;Ljava/lang/String;Lk6h;Lgv8;Ljava/lang/String;)V
        //  3901: goto            3862
        //  3904: aload_0        
        //  3905: getfield        lmj.d:Ly7h;
        //  3908: astore_1       
        //  3909: aload_1        
        //  3910: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3913: pop            
        //  3914: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3917: lstore          9
        //  3919: getstatic       java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
        //  3922: astore          11
        //  3924: aload           11
        //  3926: aload_1        
        //  3927: getfield        y7h.d:Llmj;
        //  3930: getfield        lmj.a:Luop;
        //  3933: getfield        uop.checkInterval:J
        //  3936: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //  3939: lload           9
        //  3941: ladd           
        //  3942: lstore          5
        //  3944: aload_1        
        //  3945: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3948: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3951: invokeinterface h7h.g:()J
        //  3956: lstore          7
        //  3958: lload           5
        //  3960: lstore_3       
        //  3961: lload           7
        //  3963: lconst_0       
        //  3964: lcmp           
        //  3965: ifle            3982
        //  3968: lload           5
        //  3970: lstore_3       
        //  3971: lload           7
        //  3973: lload           5
        //  3975: lcmp           
        //  3976: ifge            3982
        //  3979: lload           7
        //  3981: lstore_3       
        //  3982: aload_1        
        //  3983: getfield        y7h.b:Lcom/openback/db/message/MessageDatabase;
        //  3986: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lh7h;
        //  3989: invokeinterface h7h.c:()J
        //  3994: lstore          7
        //  3996: lload_3        
        //  3997: lstore          5
        //  3999: lload           7
        //  4001: lconst_0       
        //  4002: lcmp           
        //  4003: ifle            4020
        //  4006: lload_3        
        //  4007: lstore          5
        //  4009: lload           7
        //  4011: lload_3        
        //  4012: lcmp           
        //  4013: ifge            4020
        //  4016: lload           7
        //  4018: lstore          5
        //  4020: lload           5
        //  4022: lload           9
        //  4024: lcmp           
        //  4025: ifle            4031
        //  4028: goto            4051
        //  4031: aload           11
        //  4033: aload_1        
        //  4034: getfield        y7h.d:Llmj;
        //  4037: getfield        lmj.a:Luop;
        //  4040: getfield        uop.checkInterval:J
        //  4043: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //  4046: lload           9
        //  4048: ladd           
        //  4049: lstore          5
        //  4051: aload_0        
        //  4052: getfield        lmj.b:Lfw;
        //  4055: lload           5
        //  4057: invokevirtual   fw.b:(J)V
        //  4060: return         
        //  4061: astore          11
        //  4063: goto            804
        //  4066: astore          11
        //  4068: goto            908
        //  4071: astore_1       
        //  4072: goto            1208
        //  4075: astore_1       
        //  4076: goto            1553
        //  4079: astore_1       
        //  4080: goto            1930
        //  4083: astore_1       
        //  4084: goto            2113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  736    743    4061   4066   Ljava/lang/Exception;
        //  747    769    4061   4066   Ljava/lang/Exception;
        //  779    804    4061   4066   Ljava/lang/Exception;
        //  840    847    4066   4071   Ljava/lang/Exception;
        //  851    873    4066   4071   Ljava/lang/Exception;
        //  883    908    4066   4071   Ljava/lang/Exception;
        //  1172   1181   4071   4075   Ljava/lang/Exception;
        //  1184   1208   4071   4075   Ljava/lang/Exception;
        //  1364   1383   4075   4079   Ljava/lang/Exception;
        //  1383   1550   4075   4079   Ljava/lang/Exception;
        //  1565   1585   4079   4083   Ljava/lang/Exception;
        //  1585   1611   4079   4083   Ljava/lang/Exception;
        //  1617   1665   4079   4083   Ljava/lang/Exception;
        //  1671   1684   4079   4083   Ljava/lang/Exception;
        //  1684   1697   4079   4083   Ljava/lang/Exception;
        //  1702   1824   4079   4083   Ljava/lang/Exception;
        //  1827   1913   4079   4083   Ljava/lang/Exception;
        //  1913   1927   4079   4083   Ljava/lang/Exception;
        //  1942   1962   4083   4087   Ljava/lang/Exception;
        //  1962   1988   4083   4087   Ljava/lang/Exception;
        //  1994   2031   4083   4087   Ljava/lang/Exception;
        //  2031   2106   2109   2113   Ljava/lang/Exception;
        //  2509   2524   3419   3423   Ljava/lang/Exception;
        //  2549   2609   3419   3423   Ljava/lang/Exception;
        //  2609   2648   3419   3423   Ljava/lang/Exception;
        //  2685   2716   3419   3423   Ljava/lang/Exception;
        //  2741   2757   3419   3423   Ljava/lang/Exception;
        //  2762   2858   3419   3423   Ljava/lang/Exception;
        //  2883   2927   3419   3423   Ljava/lang/Exception;
        //  2932   3080   3419   3423   Ljava/lang/Exception;
        //  3085   3118   3419   3423   Ljava/lang/Exception;
        //  3132   3138   3419   3423   Ljava/lang/Exception;
        //  3138   3172   3419   3423   Ljava/lang/Exception;
        //  3197   3213   3419   3423   Ljava/lang/Exception;
        //  3218   3332   3419   3423   Ljava/lang/Exception;
        //  3350   3357   3419   3423   Ljava/lang/Exception;
        //  3361   3382   3419   3423   Ljava/lang/Exception;
        //  3392   3416   3419   3423   Ljava/lang/Exception;
        //  3445   3461   3419   3423   Ljava/lang/Exception;
        //  3466   3580   3419   3423   Ljava/lang/Exception;
        //  3655   3701   3419   3423   Ljava/lang/Exception;
        //  3701   3740   3419   3423   Ljava/lang/Exception;
        //  3743   3753   3419   3423   Ljava/lang/Exception;
        //  3778   3862   3419   3423   Ljava/lang/Exception;
        //  3862   3901   3419   3423   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1657, Size: 1657
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
    
    public final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        lmj.m:Z
        //     6: istore          4
        //     8: iload           4
        //    10: ifeq            16
        //    13: aload_0        
        //    14: monitorexit    
        //    15: return         
        //    16: invokestatic    java/lang/System.currentTimeMillis:()J
        //    19: pop2           
        //    20: new             Llwk;
        //    23: astore          5
        //    25: aload           5
        //    27: aload_0        
        //    28: getfield        lmj.i:Landroid/content/Context;
        //    31: invokespecial   lwk.<init>:(Landroid/content/Context;)V
        //    34: aload_0        
        //    35: aload           5
        //    37: putfield        lmj.f:Llwk;
        //    40: aconst_null    
        //    41: astore          7
        //    43: aload           5
        //    45: ldc_w           "OpenBackSettings"
        //    48: ldc_w           "{}"
        //    51: invokevirtual   lwk.b:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    54: astore          5
        //    56: aload           5
        //    58: ifnull          86
        //    61: new             Lcom/google/gson/Gson;
        //    64: astore          6
        //    66: aload           6
        //    68: invokespecial   com/google/gson/Gson.<init>:()V
        //    71: aload           6
        //    73: aload           5
        //    75: ldc_w           Luop;.class
        //    78: invokevirtual   com/google/gson/Gson.c:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //    81: astore          5
        //    83: goto            89
        //    86: aconst_null    
        //    87: astore          5
        //    89: aload           5
        //    91: astore          6
        //    93: aload           5
        //    95: ifnonnull       114
        //    98: ldc_w           Luop;.class
        //   101: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //   104: astore          6
        //   106: goto            114
        //   109: astore          5
        //   111: aconst_null    
        //   112: astore          6
        //   114: aload_0        
        //   115: aload           6
        //   117: checkcast       Luop;
        //   120: putfield        lmj.a:Luop;
        //   123: new             Lfw;
        //   126: astore          5
        //   128: aload           5
        //   130: aload_0        
        //   131: getfield        lmj.i:Landroid/content/Context;
        //   134: invokespecial   fw.<init>:(Landroid/content/Context;)V
        //   137: aload_0        
        //   138: aload           5
        //   140: putfield        lmj.b:Lfw;
        //   143: new             Ludi;
        //   146: astore          5
        //   148: aload           5
        //   150: aload_0        
        //   151: getfield        lmj.i:Landroid/content/Context;
        //   154: invokespecial   udi.<init>:(Landroid/content/Context;)V
        //   157: aload_0        
        //   158: aload           5
        //   160: putfield        lmj.e:Ludi;
        //   163: new             Lclr;
        //   166: astore          5
        //   168: aload           5
        //   170: aload_0        
        //   171: invokespecial   clr.<init>:(Llmj;)V
        //   174: aload_0        
        //   175: aload           5
        //   177: putfield        lmj.g:Lclr;
        //   180: new             Ly7h;
        //   183: astore          5
        //   185: aload           5
        //   187: aload_0        
        //   188: invokespecial   y7h.<init>:(Llmj;)V
        //   191: aload_0        
        //   192: aload           5
        //   194: putfield        lmj.d:Ly7h;
        //   197: new             Ljc8;
        //   200: astore          5
        //   202: aload           5
        //   204: aload_0        
        //   205: invokespecial   jc8.<init>:(Llmj;)V
        //   208: aload_0        
        //   209: aload           5
        //   211: putfield        lmj.c:Ljc8;
        //   214: aload_0        
        //   215: getfield        lmj.h:Luaf;
        //   218: aload_0        
        //   219: invokevirtual   uaf.a:(Llmj;)V
        //   222: aload_0        
        //   223: getfield        lmj.f:Llwk;
        //   226: ldc_w           "SdkVersion"
        //   229: ldc_w           "1.0.1"
        //   232: invokevirtual   lwk.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   235: aload_0        
        //   236: getfield        lmj.i:Landroid/content/Context;
        //   239: astore          5
        //   241: aload           5
        //   243: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   246: aload           5
        //   248: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   251: sipush          128
        //   254: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   257: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   260: astore          5
        //   262: aload_0        
        //   263: getfield        lmj.f:Llwk;
        //   266: ldc_w           "AutoStart"
        //   269: invokevirtual   lwk.c:(Ljava/lang/String;)Z
        //   272: ifeq            293
        //   275: aload_0        
        //   276: aload_0        
        //   277: getfield        lmj.f:Llwk;
        //   280: ldc_w           "AutoStart"
        //   283: iconst_1       
        //   284: invokevirtual   lwk.a:(Ljava/lang/String;Z)Z
        //   287: putfield        lmj.k:Z
        //   290: goto            322
        //   293: aload           5
        //   295: ifnull          322
        //   298: aload           5
        //   300: ldc_w           "com.openback.AUTO_START"
        //   303: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   306: ifeq            322
        //   309: aload_0        
        //   310: aload           5
        //   312: ldc_w           "com.openback.AUTO_START"
        //   315: iconst_1       
        //   316: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   319: putfield        lmj.k:Z
        //   322: aload           5
        //   324: ifnull          587
        //   327: aload           5
        //   329: ldc_w           "com.openback.LOG_LEVEL"
        //   332: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   335: ifeq            587
        //   338: aload           5
        //   340: ldc_w           "com.openback.LOG_LEVEL"
        //   343: ldc_w           "ERROR"
        //   346: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   349: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   352: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   355: astore          6
        //   357: aload           6
        //   359: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   362: pop            
        //   363: iconst_m1      
        //   364: istore_1       
        //   365: aload           6
        //   367: invokevirtual   java/lang/String.hashCode:()I
        //   370: istore_3       
        //   371: iconst_4       
        //   372: istore_2       
        //   373: iload_3        
        //   374: lookupswitch {
        //          2251950: 503
        //          2402104: 484
        //          2656902: 465
        //          64921139: 446
        //          1069090146: 427
        //          default: 424
        //        }
        //   424: goto            519
        //   427: aload           6
        //   429: ldc_w           "VERBOSE"
        //   432: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   435: ifne            441
        //   438: goto            519
        //   441: iconst_4       
        //   442: istore_1       
        //   443: goto            519
        //   446: aload           6
        //   448: ldc_w           "DEBUG"
        //   451: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   454: ifne            460
        //   457: goto            519
        //   460: iconst_3       
        //   461: istore_1       
        //   462: goto            519
        //   465: aload           6
        //   467: ldc_w           "WARN"
        //   470: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   473: ifne            479
        //   476: goto            519
        //   479: iconst_2       
        //   480: istore_1       
        //   481: goto            519
        //   484: aload           6
        //   486: ldc_w           "NONE"
        //   489: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   492: ifne            498
        //   495: goto            519
        //   498: iconst_1       
        //   499: istore_1       
        //   500: goto            519
        //   503: aload           6
        //   505: ldc_w           "INFO"
        //   508: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   511: ifne            517
        //   514: goto            519
        //   517: iconst_0       
        //   518: istore_1       
        //   519: iload_1        
        //   520: tableswitch {
        //                0: 581
        //                1: 576
        //                2: 571
        //                3: 566
        //                4: 561
        //          default: 556
        //        }
        //   556: iload_2        
        //   557: istore_1       
        //   558: goto            583
        //   561: iconst_0       
        //   562: istore_1       
        //   563: goto            583
        //   566: iconst_1       
        //   567: istore_1       
        //   568: goto            583
        //   571: iconst_3       
        //   572: istore_1       
        //   573: goto            583
        //   576: iconst_5       
        //   577: istore_1       
        //   578: goto            583
        //   581: iconst_2       
        //   582: istore_1       
        //   583: iload_1        
        //   584: putstatic       lp7.J0:I
        //   587: aload           5
        //   589: ifnull          615
        //   592: aload           5
        //   594: ldc_w           "com.openback.INTERNAL_LOG"
        //   597: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   600: ifeq            615
        //   603: aload           5
        //   605: ldc_w           "com.openback.INTERNAL_LOG"
        //   608: iconst_0       
        //   609: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   612: putstatic       yru.G0:Z
        //   615: aload_0        
        //   616: getfield        lmj.f:Llwk;
        //   619: ldc_w           "DDModelProcessing"
        //   622: invokevirtual   lwk.c:(Ljava/lang/String;)Z
        //   625: ifeq            646
        //   628: aload_0        
        //   629: aload_0        
        //   630: getfield        lmj.f:Llwk;
        //   633: ldc_w           "DDModelProcessing"
        //   636: iconst_1       
        //   637: invokevirtual   lwk.a:(Ljava/lang/String;Z)Z
        //   640: putfield        lmj.l:Z
        //   643: goto            675
        //   646: aload           5
        //   648: ifnull          675
        //   651: aload           5
        //   653: ldc_w           "com.openback.DEVICE_DECISIONS_MODEL_PROCESSING"
        //   656: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   659: ifeq            675
        //   662: aload_0        
        //   663: aload           5
        //   665: ldc_w           "com.openback.DEVICE_DECISIONS_MODEL_PROCESSING"
        //   668: iconst_1       
        //   669: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   672: putfield        lmj.l:Z
        //   675: aload_0        
        //   676: getfield        lmj.c:Ljc8;
        //   679: astore          5
        //   681: aload_0        
        //   682: getfield        lmj.l:Z
        //   685: istore          4
        //   687: aload           5
        //   689: getfield        jc8.b:Z
        //   692: iload           4
        //   694: if_icmpeq       717
        //   697: aload           5
        //   699: iload           4
        //   701: putfield        jc8.b:Z
        //   704: iload           4
        //   706: ifne            717
        //   709: aload           5
        //   711: getfield        jc8.a:Lcom/openback/db/decisions/DecisionsDatabase;
        //   714: invokevirtual   ldn.d:()V
        //   717: aload_0        
        //   718: getfield        lmj.f:Llwk;
        //   721: ldc_w           "Started"
        //   724: invokevirtual   lwk.c:(Ljava/lang/String;)Z
        //   727: ifne            737
        //   730: aload_0        
        //   731: getfield        lmj.k:Z
        //   734: ifne            751
        //   737: aload_0        
        //   738: getfield        lmj.f:Llwk;
        //   741: ldc_w           "Started"
        //   744: iconst_0       
        //   745: invokevirtual   lwk.a:(Ljava/lang/String;Z)Z
        //   748: ifeq            755
        //   751: aload_0        
        //   752: invokevirtual   lmj.f:()V
        //   755: aload_0        
        //   756: iconst_1       
        //   757: putfield        lmj.m:Z
        //   760: aload_0        
        //   761: monitorexit    
        //   762: return         
        //   763: astore          5
        //   765: aload_0        
        //   766: monitorexit    
        //   767: aload           5
        //   769: athrow         
        //   770: astore          5
        //   772: aload           7
        //   774: astore          5
        //   776: goto            262
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      8      763    770    Any
        //  16     40     763    770    Any
        //  43     56     109    114    Ljava/lang/Exception;
        //  43     56     763    770    Any
        //  61     83     109    114    Ljava/lang/Exception;
        //  61     83     763    770    Any
        //  98     106    109    114    Ljava/lang/Exception;
        //  98     106    763    770    Any
        //  114    241    763    770    Any
        //  241    262    770    779    Ljava/lang/Exception;
        //  241    262    763    770    Any
        //  262    290    763    770    Any
        //  298    322    763    770    Any
        //  327    363    763    770    Any
        //  583    587    763    770    Any
        //  592    615    763    770    Any
        //  615    643    763    770    Any
        //  651    675    763    770    Any
        //  675    704    763    770    Any
        //  709    717    763    770    Any
        //  717    737    763    770    Any
        //  737    751    763    770    Any
        //  751    755    763    770    Any
        //  755    760    763    770    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0262:
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
    
    public final void f() {
        if (this.j) {
            lp7.h0("OpenBack is already running");
            return;
        }
        final Context i = this.i;
        final int n = 0;
        boolean b;
        try {
            i.getPackageManager().getServiceInfo(new ComponentName(i, (Class)OpenBackService.class), 128);
            b = true;
        }
        catch (final Exception ex) {
            b = false;
        }
        if (!b) {
            if (lp7.J0 <= 4) {
                Log.e("OpenBack", "OpenBackService missing from manifest or incorrectly set up");
            }
            return;
        }
        OpenBackReceiver.a(this.i, true);
        final Context j = this.i;
        int n2;
        try {
            j.getPackageManager().getReceiverInfo(new ComponentName(j, (Class)OpenBackReceiver.class), 128);
            n2 = 1;
        }
        catch (final Exception ex2) {
            n2 = n;
        }
        if (n2 == 0) {
            if (lp7.J0 <= 4) {
                Log.e("OpenBack", "OpenBackReceiver missing from manifest or incorrectly set up");
            }
            return;
        }
        this.j = true;
        this.f.d(true);
        final StringBuilder sb = new StringBuilder();
        sb.append("Starting OpenBack ");
        String s;
        if (this.k) {
            s = "(autostart)";
        }
        else {
            s = "(manual)";
        }
        sb.append(s);
        lp7.h0(sb.toString());
        this.a(new at4("messages_check", "START"));
    }
}
