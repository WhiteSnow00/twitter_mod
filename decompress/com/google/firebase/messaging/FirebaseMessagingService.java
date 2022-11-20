// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends f4a
{
    public static final Queue<String> J0;
    
    static {
        FirebaseMessagingService.J0 = new ArrayDeque(10);
    }
    
    @Override
    public final Intent b(final Intent intent) {
        return ump.a().d.poll();
    }
    
    @Override
    public final void c(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //     4: astore          6
        //     6: ldc             "com.google.android.c2dm.intent.RECEIVE"
        //     8: aload           6
        //    10: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    13: ifne            83
        //    16: ldc             "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
        //    18: aload           6
        //    20: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    23: ifeq            29
        //    26: goto            83
        //    29: ldc             "com.google.firebase.messaging.NEW_TOKEN"
        //    31: aload           6
        //    33: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    36: ifeq            52
        //    39: aload_0        
        //    40: aload_1        
        //    41: ldc             "token"
        //    43: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    46: invokevirtual   com/google/firebase/messaging/FirebaseMessagingService.f:(Ljava/lang/String;)V
        //    49: goto            1510
        //    52: ldc             "Unknown intent action: "
        //    54: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: astore          6
        //    59: aload           6
        //    61: aload_1        
        //    62: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: pop            
        //    69: ldc             "FirebaseMessaging"
        //    71: aload           6
        //    73: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    76: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    79: pop            
        //    80: goto            1510
        //    83: aload_1        
        //    84: ldc             "google.message_id"
        //    86: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    89: astore          6
        //    91: aload           6
        //    93: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    96: ifeq            102
        //    99: goto            191
        //   102: getstatic       com/google/firebase/messaging/FirebaseMessagingService.J0:Ljava/util/ArrayDeque;
        //   105: astore          7
        //   107: aload           7
        //   109: aload           6
        //   111: invokevirtual   java/util/ArrayDeque.contains:(Ljava/lang/Object;)Z
        //   114: ifeq            167
        //   117: ldc             "FirebaseMessaging"
        //   119: iconst_3       
        //   120: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   123: ifeq            162
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: astore          7
        //   135: aload           7
        //   137: ldc             "Received duplicate message: "
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: pop            
        //   143: aload           7
        //   145: aload           6
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: pop            
        //   151: ldc             "FirebaseMessaging"
        //   153: aload           7
        //   155: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   158: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   161: pop            
        //   162: iconst_1       
        //   163: istore_2       
        //   164: goto            193
        //   167: aload           7
        //   169: invokevirtual   java/util/ArrayDeque.size:()I
        //   172: bipush          10
        //   174: if_icmplt       183
        //   177: aload           7
        //   179: invokevirtual   java/util/ArrayDeque.remove:()Ljava/lang/Object;
        //   182: pop            
        //   183: aload           7
        //   185: aload           6
        //   187: invokevirtual   java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
        //   190: pop            
        //   191: iconst_0       
        //   192: istore_2       
        //   193: iload_2        
        //   194: ifne            1510
        //   197: aload_1        
        //   198: ldc             "message_type"
        //   200: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   203: astore          7
        //   205: aload           7
        //   207: astore          6
        //   209: aload           7
        //   211: ifnonnull       218
        //   214: ldc             "gcm"
        //   216: astore          6
        //   218: iconst_m1      
        //   219: istore_2       
        //   220: aload           6
        //   222: invokevirtual   java/lang/String.hashCode:()I
        //   225: lookupswitch {
        //          -2062414158: 325
        //           102161: 307
        //          814694033: 289
        //          814800675: 271
        //          default: 268
        //        }
        //   268: goto            340
        //   271: aload           6
        //   273: ldc             "send_event"
        //   275: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   278: ifne            284
        //   281: goto            340
        //   284: iconst_3       
        //   285: istore_2       
        //   286: goto            340
        //   289: aload           6
        //   291: ldc             "send_error"
        //   293: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   296: ifne            302
        //   299: goto            340
        //   302: iconst_2       
        //   303: istore_2       
        //   304: goto            340
        //   307: aload           6
        //   309: ldc             "gcm"
        //   311: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   314: ifne            320
        //   317: goto            340
        //   320: iconst_1       
        //   321: istore_2       
        //   322: goto            340
        //   325: aload           6
        //   327: ldc             "deleted_messages"
        //   329: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   332: ifne            338
        //   335: goto            340
        //   338: iconst_0       
        //   339: istore_2       
        //   340: iload_2        
        //   341: ifeq            1506
        //   344: iload_2        
        //   345: iconst_1       
        //   346: if_icmpeq       437
        //   349: iload_2        
        //   350: iconst_2       
        //   351: if_icmpeq       404
        //   354: iload_2        
        //   355: iconst_3       
        //   356: if_icmpeq       394
        //   359: new             Ljava/lang/StringBuilder;
        //   362: dup            
        //   363: invokespecial   java/lang/StringBuilder.<init>:()V
        //   366: astore_1       
        //   367: aload_1        
        //   368: ldc             "Received message with unknown type: "
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: pop            
        //   374: aload_1        
        //   375: aload           6
        //   377: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   380: pop            
        //   381: ldc             "FirebaseMessaging"
        //   383: aload_1        
        //   384: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   387: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   390: pop            
        //   391: goto            1510
        //   394: aload_1        
        //   395: ldc             "google.message_id"
        //   397: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   400: pop            
        //   401: goto            1510
        //   404: aload_1        
        //   405: ldc             "google.message_id"
        //   407: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   410: ifnonnull       420
        //   413: aload_1        
        //   414: ldc             "message_id"
        //   416: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   419: pop            
        //   420: new             Lcom/google/firebase/messaging/SendException;
        //   423: dup            
        //   424: aload_1        
        //   425: ldc             "error"
        //   427: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   430: invokespecial   com/google/firebase/messaging/SendException.<init>:(Ljava/lang/String;)V
        //   433: pop            
        //   434: goto            1510
        //   437: aload_1        
        //   438: invokestatic    q8h.b:(Landroid/content/Intent;)Z
        //   441: ifeq            453
        //   444: ldc             "_nr"
        //   446: aload_1        
        //   447: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   450: invokestatic    q8h.a:(Ljava/lang/String;Landroid/os/Bundle;)V
        //   453: ldc             "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
        //   455: aload_1        
        //   456: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   459: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   462: ifeq            468
        //   465: goto            604
        //   468: invokestatic    yza.c:()Lyza;
        //   471: pop            
        //   472: invokestatic    yza.c:()Lyza;
        //   475: astore          6
        //   477: aload           6
        //   479: invokevirtual   yza.a:()V
        //   482: aload           6
        //   484: getfield        yza.a:Landroid/content/Context;
        //   487: astore          6
        //   489: aload           6
        //   491: ldc             "com.google.firebase.messaging"
        //   493: iconst_0       
        //   494: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   497: astore          7
        //   499: aload           7
        //   501: ldc             "export_to_big_query"
        //   503: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //   508: ifeq            525
        //   511: aload           7
        //   513: ldc             "export_to_big_query"
        //   515: iconst_0       
        //   516: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   521: istore_3       
        //   522: goto            606
        //   525: aload           6
        //   527: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   530: astore          7
        //   532: aload           7
        //   534: ifnull          604
        //   537: aload           7
        //   539: aload           6
        //   541: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   544: sipush          128
        //   547: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   550: astore          6
        //   552: aload           6
        //   554: ifnull          604
        //   557: aload           6
        //   559: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   562: astore          7
        //   564: aload           7
        //   566: ifnull          604
        //   569: aload           7
        //   571: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //   573: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   576: ifeq            604
        //   579: aload           6
        //   581: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   584: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //   586: iconst_0       
        //   587: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   590: istore_3       
        //   591: goto            606
        //   594: astore          6
        //   596: ldc             "FirebaseMessaging"
        //   598: ldc             "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
        //   600: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   603: pop            
        //   604: iconst_0       
        //   605: istore_3       
        //   606: iload_3        
        //   607: ifeq            1353
        //   610: getstatic       r8h$a.F0:Lr8h$a;
        //   613: astore          15
        //   615: getstatic       com/google/firebase/messaging/FirebaseMessaging.p:Lh1u;
        //   618: astore          14
        //   620: aload           14
        //   622: ifnonnull       636
        //   625: ldc             "FirebaseMessaging"
        //   627: ldc             "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
        //   629: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   632: pop            
        //   633: goto            1353
        //   636: aload_1        
        //   637: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   640: astore          6
        //   642: aload           6
        //   644: astore          8
        //   646: aload           6
        //   648: ifnonnull       656
        //   651: getstatic       android/os/Bundle.EMPTY:Landroid/os/Bundle;
        //   654: astore          8
        //   656: aload           8
        //   658: ldc             "google.ttl"
        //   660: invokevirtual   android/os/BaseBundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   663: astore          6
        //   665: aload           6
        //   667: instanceof      Ljava/lang/Integer;
        //   670: ifeq            685
        //   673: aload           6
        //   675: checkcast       Ljava/lang/Integer;
        //   678: invokevirtual   java/lang/Integer.intValue:()I
        //   681: istore_2       
        //   682: goto            702
        //   685: aload           6
        //   687: instanceof      Ljava/lang/String;
        //   690: ifeq            744
        //   693: aload           6
        //   695: checkcast       Ljava/lang/String;
        //   698: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   701: istore_2       
        //   702: goto            746
        //   705: astore          7
        //   707: new             Ljava/lang/StringBuilder;
        //   710: dup            
        //   711: invokespecial   java/lang/StringBuilder.<init>:()V
        //   714: astore          7
        //   716: aload           7
        //   718: ldc_w           "Invalid TTL: "
        //   721: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   724: pop            
        //   725: aload           7
        //   727: aload           6
        //   729: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   732: pop            
        //   733: ldc             "FirebaseMessaging"
        //   735: aload           7
        //   737: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   740: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   743: pop            
        //   744: iconst_0       
        //   745: istore_2       
        //   746: aload           8
        //   748: ldc_w           "google.to"
        //   751: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   754: astore          7
        //   756: aload           7
        //   758: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   761: ifne            767
        //   764: goto            802
        //   767: invokestatic    yza.c:()Lyza;
        //   770: astore          6
        //   772: getstatic       e0b.m:Ljava/lang/Object;
        //   775: astore          7
        //   777: aload           6
        //   779: ldc_w           Lf0b;.class
        //   782: invokevirtual   yza.b:(Ljava/lang/Class;)Ljava/lang/Object;
        //   785: checkcast       Le0b;
        //   788: invokevirtual   e0b.getId:()Lubs;
        //   791: invokestatic    ucs.a:(Lubs;)Ljava/lang/Object;
        //   794: checkcast       Ljava/lang/String;
        //   797: astore          7
        //   799: goto            764
        //   802: invokestatic    yza.c:()Lyza;
        //   805: astore          6
        //   807: aload           6
        //   809: invokevirtual   yza.a:()V
        //   812: aload           6
        //   814: getfield        yza.a:Landroid/content/Context;
        //   817: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   820: astore          17
        //   822: getstatic       r8h$c.F0:Lr8h$c;
        //   825: astore          16
        //   827: aload           8
        //   829: invokestatic    uti.f:(Landroid/os/Bundle;)Z
        //   832: ifeq            843
        //   835: getstatic       r8h$b.G0:Lr8h$b;
        //   838: astore          9
        //   840: goto            848
        //   843: getstatic       r8h$b.F0:Lr8h$b;
        //   846: astore          9
        //   848: aload           8
        //   850: ldc             "google.message_id"
        //   852: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   855: astore          10
        //   857: aload           10
        //   859: astore          6
        //   861: aload           10
        //   863: ifnonnull       875
        //   866: aload           8
        //   868: ldc             "message_id"
        //   870: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   873: astore          6
        //   875: aload           6
        //   877: ifnull          887
        //   880: aload           6
        //   882: astore          10
        //   884: goto            892
        //   887: ldc_w           ""
        //   890: astore          10
        //   892: aload           8
        //   894: ldc_w           "from"
        //   897: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   900: astore          6
        //   902: aload           6
        //   904: ifnull          921
        //   907: aload           6
        //   909: ldc_w           "/topics/"
        //   912: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   915: ifeq            921
        //   918: goto            924
        //   921: aconst_null    
        //   922: astore          6
        //   924: aload           6
        //   926: ifnull          932
        //   929: goto            937
        //   932: ldc_w           ""
        //   935: astore          6
        //   937: aload           8
        //   939: ldc_w           "collapse_key"
        //   942: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   945: astore          11
        //   947: aload           11
        //   949: ifnull          955
        //   952: goto            960
        //   955: ldc_w           ""
        //   958: astore          11
        //   960: aload           8
        //   962: ldc_w           "google.c.a.m_l"
        //   965: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   968: astore          12
        //   970: aload           12
        //   972: ifnull          978
        //   975: goto            983
        //   978: ldc_w           ""
        //   981: astore          12
        //   983: aload           8
        //   985: ldc_w           "google.c.a.c_l"
        //   988: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   991: astore          13
        //   993: aload           13
        //   995: ifnull          1001
        //   998: goto            1006
        //  1001: ldc_w           ""
        //  1004: astore          13
        //  1006: aload           8
        //  1008: ldc_w           "google.c.sender.id"
        //  1011: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //  1014: ifeq            1046
        //  1017: aload           8
        //  1019: ldc_w           "google.c.sender.id"
        //  1022: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1025: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1028: lstore          4
        //  1030: goto            1209
        //  1033: astore          8
        //  1035: ldc             "FirebaseMessaging"
        //  1037: ldc_w           "error parsing project number"
        //  1040: aload           8
        //  1042: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1045: pop            
        //  1046: invokestatic    yza.c:()Lyza;
        //  1049: astore          8
        //  1051: aload           8
        //  1053: invokevirtual   yza.a:()V
        //  1056: aload           8
        //  1058: getfield        yza.c:Lk0b;
        //  1061: getfield        k0b.e:Ljava/lang/String;
        //  1064: astore          18
        //  1066: aload           18
        //  1068: ifnull          1094
        //  1071: aload           18
        //  1073: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1076: lstore          4
        //  1078: goto            1209
        //  1081: astore          18
        //  1083: ldc             "FirebaseMessaging"
        //  1085: ldc_w           "error parsing sender ID"
        //  1088: aload           18
        //  1090: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1093: pop            
        //  1094: aload           8
        //  1096: invokevirtual   yza.a:()V
        //  1099: aload           8
        //  1101: getfield        yza.c:Lk0b;
        //  1104: getfield        k0b.b:Ljava/lang/String;
        //  1107: astore          8
        //  1109: aload           8
        //  1111: ldc_w           "1:"
        //  1114: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1117: ifne            1146
        //  1120: aload           8
        //  1122: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1125: lstore          4
        //  1127: goto            1209
        //  1130: astore          8
        //  1132: ldc             "FirebaseMessaging"
        //  1134: ldc_w           "error parsing app ID"
        //  1137: aload           8
        //  1139: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1142: pop            
        //  1143: goto            1206
        //  1146: aload           8
        //  1148: ldc_w           ":"
        //  1151: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //  1154: astore          8
        //  1156: aload           8
        //  1158: arraylength    
        //  1159: iconst_2       
        //  1160: if_icmpge       1166
        //  1163: goto            1206
        //  1166: aload           8
        //  1168: iconst_1       
        //  1169: aaload         
        //  1170: astore          8
        //  1172: aload           8
        //  1174: invokevirtual   java/lang/String.isEmpty:()Z
        //  1177: ifeq            1183
        //  1180: goto            1206
        //  1183: aload           8
        //  1185: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1188: lstore          4
        //  1190: goto            1209
        //  1193: astore          8
        //  1195: ldc             "FirebaseMessaging"
        //  1197: ldc_w           "error parsing app ID"
        //  1200: aload           8
        //  1202: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1205: pop            
        //  1206: lconst_0       
        //  1207: lstore          4
        //  1209: lload           4
        //  1211: lconst_0       
        //  1212: lcmp           
        //  1213: ifle            1219
        //  1216: goto            1222
        //  1219: lconst_0       
        //  1220: lstore          4
        //  1222: new             Lr8h;
        //  1225: dup            
        //  1226: lload           4
        //  1228: aload           10
        //  1230: aload           7
        //  1232: aload           9
        //  1234: aload           16
        //  1236: aload           17
        //  1238: aload           11
        //  1240: iload_2        
        //  1241: aload           6
        //  1243: aload           15
        //  1245: aload           12
        //  1247: aload           13
        //  1249: invokespecial   r8h.<init>:(JLjava/lang/String;Ljava/lang/String;Lr8h$b;Lr8h$c;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lr8h$a;Ljava/lang/String;Ljava/lang/String;)V
        //  1252: astore          6
        //  1254: new             Lt3a;
        //  1257: astore          7
        //  1259: aload           7
        //  1261: ldc_w           "proto"
        //  1264: invokespecial   t3a.<init>:(Ljava/lang/String;)V
        //  1267: aload           14
        //  1269: ldc_w           "FCM_CLIENT_EVENT_LOGGING"
        //  1272: aload           7
        //  1274: getstatic       mt8.M0:Lmt8;
        //  1277: invokeinterface h1u.a:(Ljava/lang/String;Lt3a;Ldzt;)Le1u;
        //  1282: astore          8
        //  1284: new             Ls8h;
        //  1287: astore          7
        //  1289: aload           7
        //  1291: aload           6
        //  1293: invokespecial   s8h.<init>:(Lr8h;)V
        //  1296: new             Lva1;
        //  1299: astore          6
        //  1301: aload           6
        //  1303: aload           7
        //  1305: getstatic       izk.D0:Lizk;
        //  1308: invokespecial   va1.<init>:(Ljava/lang/Object;Lizk;)V
        //  1311: aload           8
        //  1313: aload           6
        //  1315: invokeinterface e1u.a:(Lp9a;)V
        //  1320: goto            1353
        //  1323: astore          6
        //  1325: ldc             "FirebaseMessaging"
        //  1327: ldc_w           "Failed to send big query analytics payload."
        //  1330: aload           6
        //  1332: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1335: pop            
        //  1336: goto            1353
        //  1339: astore_1       
        //  1340: goto            1344
        //  1343: astore_1       
        //  1344: new             Ljava/lang/RuntimeException;
        //  1347: dup            
        //  1348: aload_1        
        //  1349: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //  1352: athrow         
        //  1353: aload_1        
        //  1354: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //  1357: astore          7
        //  1359: aload           7
        //  1361: astore          6
        //  1363: aload           7
        //  1365: ifnonnull       1377
        //  1368: new             Landroid/os/Bundle;
        //  1371: dup            
        //  1372: invokespecial   android/os/Bundle.<init>:()V
        //  1375: astore          6
        //  1377: aload           6
        //  1379: ldc_w           "androidx.content.wakelockid"
        //  1382: invokevirtual   android/os/Bundle.remove:(Ljava/lang/String;)V
        //  1385: aload           6
        //  1387: invokestatic    uti.f:(Landroid/os/Bundle;)Z
        //  1390: ifeq            1490
        //  1393: new             Luti;
        //  1396: dup            
        //  1397: aload           6
        //  1399: invokespecial   uti.<init>:(Landroid/os/Bundle;)V
        //  1402: astore          8
        //  1404: new             Lo6i;
        //  1407: dup            
        //  1408: ldc_w           "Firebase-Messaging-Network-Io"
        //  1411: invokespecial   o6i.<init>:(Ljava/lang/String;)V
        //  1414: invokestatic    java/util/concurrent/Executors.newSingleThreadExecutor:(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
        //  1417: astore          7
        //  1419: new             Ln19;
        //  1422: dup            
        //  1423: aload_0        
        //  1424: aload           8
        //  1426: aload           7
        //  1428: invokespecial   n19.<init>:(Landroid/content/Context;Luti;Ljava/util/concurrent/ExecutorService;)V
        //  1431: astore          8
        //  1433: aload           8
        //  1435: invokevirtual   n19.a:()Z
        //  1438: istore_3       
        //  1439: iload_3        
        //  1440: ifeq            1453
        //  1443: aload           7
        //  1445: invokeinterface java/util/concurrent/ExecutorService.shutdown:()V
        //  1450: goto            1510
        //  1453: aload           7
        //  1455: invokeinterface java/util/concurrent/ExecutorService.shutdown:()V
        //  1460: aload_1        
        //  1461: invokestatic    q8h.b:(Landroid/content/Intent;)Z
        //  1464: ifeq            1490
        //  1467: ldc_w           "_nf"
        //  1470: aload_1        
        //  1471: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //  1474: invokestatic    q8h.a:(Ljava/lang/String;Landroid/os/Bundle;)V
        //  1477: goto            1490
        //  1480: astore_1       
        //  1481: aload           7
        //  1483: invokeinterface java/util/concurrent/ExecutorService.shutdown:()V
        //  1488: aload_1        
        //  1489: athrow         
        //  1490: aload_0        
        //  1491: new             Lrdm;
        //  1494: dup            
        //  1495: aload           6
        //  1497: invokespecial   rdm.<init>:(Landroid/os/Bundle;)V
        //  1500: invokevirtual   com/google/firebase/messaging/FirebaseMessagingService.e:(Lrdm;)V
        //  1503: goto            1510
        //  1506: aload_0        
        //  1507: invokevirtual   com/google/firebase/messaging/FirebaseMessagingService.d:()V
        //  1510: return         
        //  1511: astore          6
        //  1513: goto            604
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  468    472    594    604    Ljava/lang/IllegalStateException;
        //  525    532    1511   1516   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  537    552    1511   1516   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  557    564    1511   1516   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  569    591    1511   1516   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  693    702    705    744    Ljava/lang/NumberFormatException;
        //  767    799    1343   1344   Ljava/util/concurrent/ExecutionException;
        //  767    799    1339   1343   Ljava/lang/InterruptedException;
        //  1017   1030   1033   1046   Ljava/lang/NumberFormatException;
        //  1071   1078   1081   1094   Ljava/lang/NumberFormatException;
        //  1120   1127   1130   1146   Ljava/lang/NumberFormatException;
        //  1183   1190   1193   1206   Ljava/lang/NumberFormatException;
        //  1254   1320   1323   1339   Ljava/lang/RuntimeException;
        //  1433   1439   1480   1490   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0525:
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
    
    public void d() {
    }
    
    public void e(final rdm rdm) {
    }
    
    public void f(final String s) {
    }
}
