import android.os.Looper;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import android.content.pm.Signature;
import java.security.MessageDigest;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Pair;
import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import android.content.ComponentName;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmz extends v2z
{
    public final cmz H0;
    public g1z I0;
    public volatile Boolean J0;
    public final ujz K0;
    public final onz L0;
    public final ArrayList M0;
    public final bkz N0;
    
    public fmz(final m9z m9z) {
        super(m9z);
        this.M0 = new ArrayList();
        this.L0 = new onz((ri4)m9z.S0);
        this.H0 = new cmz(this);
        this.K0 = new ujz(this, (vcz)m9z);
        this.N0 = new bkz(this, (vcz)m9z);
    }
    
    public static void x(final fmz fmz, final ComponentName componentName) {
        ((wxy)fmz).g();
        if (fmz.I0 != null) {
            fmz.I0 = null;
            ((ocz)fmz).F0.b().S0.b("Disconnected from device MeasurementService", (Object)componentName);
            ((wxy)fmz).g();
            fmz.y();
        }
    }
    
    public final void A(final AtomicReference atomicReference) {
        ((wxy)this).g();
        this.h();
        this.t((Runnable)new hjz(this, atomicReference, this.q(false)));
    }
    
    public final boolean j() {
        return false;
    }
    
    public final void k(final g1z p0, final sd p1, final sxz p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   wxy.g:()V
        //     4: aload_0        
        //     5: invokevirtual   v2z.h:()V
        //     8: aload_0        
        //     9: invokevirtual   fmz.u:()V
        //    12: aload_0        
        //    13: getfield        ocz.F0:Lm9z;
        //    16: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    19: pop            
        //    20: bipush          100
        //    22: istore          5
        //    24: iconst_0       
        //    25: istore          4
        //    27: iload           4
        //    29: sipush          1001
        //    32: if_icmpge       1912
        //    35: iload           5
        //    37: bipush          100
        //    39: if_icmpne       1912
        //    42: new             Ljava/util/ArrayList;
        //    45: dup            
        //    46: invokespecial   java/util/ArrayList.<init>:()V
        //    49: astore          24
        //    51: aload_0        
        //    52: getfield        ocz.F0:Lm9z;
        //    55: invokevirtual   m9z.s:()Lu1z;
        //    58: astore          25
        //    60: ldc             "rowid"
        //    62: astore          14
        //    64: ldc             "Error reading entries from local database"
        //    66: astore          22
        //    68: aload           25
        //    70: invokevirtual   wxy.g:()V
        //    73: aload           25
        //    75: getfield        u1z.I0:Z
        //    78: ifeq            84
        //    81: goto            142
        //    84: new             Ljava/util/ArrayList;
        //    87: dup            
        //    88: invokespecial   java/util/ArrayList.<init>:()V
        //    91: astore          23
        //    93: aload           25
        //    95: getfield        ocz.F0:Lm9z;
        //    98: getfield        m9z.F0:Landroid/content/Context;
        //   101: ldc             "google_app_measurement_local.db"
        //   103: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //   106: invokevirtual   java/io/File.exists:()Z
        //   109: ifeq            1652
        //   112: iconst_5       
        //   113: istore          6
        //   115: iconst_0       
        //   116: istore          8
        //   118: iload           8
        //   120: iconst_5       
        //   121: if_icmpge       1625
        //   124: aload           25
        //   126: invokevirtual   u1z.k:()Landroid/database/sqlite/SQLiteDatabase;
        //   129: astore          15
        //   131: aload           15
        //   133: ifnonnull       145
        //   136: aload           25
        //   138: iconst_1       
        //   139: putfield        u1z.I0:Z
        //   142: goto            1642
        //   145: aload           15
        //   147: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   150: aload           15
        //   152: ldc             "messages"
        //   154: iconst_1       
        //   155: anewarray       Ljava/lang/String;
        //   158: dup            
        //   159: iconst_0       
        //   160: aload           14
        //   162: aastore        
        //   163: ldc             "type=?"
        //   165: iconst_1       
        //   166: anewarray       Ljava/lang/String;
        //   169: dup            
        //   170: iconst_0       
        //   171: ldc             "3"
        //   173: aastore        
        //   174: aconst_null    
        //   175: aconst_null    
        //   176: ldc             "rowid desc"
        //   178: ldc             "1"
        //   180: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   183: astore          17
        //   185: aload           17
        //   187: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   192: istore          13
        //   194: ldc2_w          -1
        //   197: lstore          11
        //   199: iload           13
        //   201: ifeq            224
        //   204: aload           17
        //   206: iconst_0       
        //   207: invokeinterface android/database/Cursor.getLong:(I)J
        //   212: lstore          9
        //   214: aload           17
        //   216: invokeinterface android/database/Cursor.close:()V
        //   221: goto            236
        //   224: aload           17
        //   226: invokeinterface android/database/Cursor.close:()V
        //   231: ldc2_w          -1
        //   234: lstore          9
        //   236: lload           9
        //   238: ldc2_w          -1
        //   241: lcmp           
        //   242: ifeq            266
        //   245: ldc             "rowid<?"
        //   247: astore          16
        //   249: iconst_1       
        //   250: anewarray       Ljava/lang/String;
        //   253: dup            
        //   254: iconst_0       
        //   255: lload           9
        //   257: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   260: aastore        
        //   261: astore          17
        //   263: goto            272
        //   266: aconst_null    
        //   267: astore          16
        //   269: aconst_null    
        //   270: astore          17
        //   272: bipush          100
        //   274: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   277: astore          18
        //   279: aload           15
        //   281: ldc             "messages"
        //   283: iconst_3       
        //   284: anewarray       Ljava/lang/String;
        //   287: dup            
        //   288: iconst_0       
        //   289: aload           14
        //   291: aastore        
        //   292: dup            
        //   293: iconst_1       
        //   294: ldc             "type"
        //   296: aastore        
        //   297: dup            
        //   298: iconst_2       
        //   299: ldc             "entry"
        //   301: aastore        
        //   302: aload           16
        //   304: aload           17
        //   306: aconst_null    
        //   307: aconst_null    
        //   308: ldc             "rowid asc"
        //   310: aload           18
        //   312: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   315: astore          18
        //   317: lload           11
        //   319: lstore          9
        //   321: aload           15
        //   323: astore          16
        //   325: aload           18
        //   327: astore          17
        //   329: aload           18
        //   331: invokeinterface android/database/Cursor.moveToNext:()Z
        //   336: ifeq            940
        //   339: aload           15
        //   341: astore          16
        //   343: aload           18
        //   345: astore          17
        //   347: aload           18
        //   349: iconst_0       
        //   350: invokeinterface android/database/Cursor.getLong:(I)J
        //   355: lstore          9
        //   357: aload           15
        //   359: astore          16
        //   361: aload           18
        //   363: astore          17
        //   365: aload           18
        //   367: iconst_1       
        //   368: invokeinterface android/database/Cursor.getInt:(I)I
        //   373: istore          5
        //   375: aload           15
        //   377: astore          16
        //   379: aload           18
        //   381: astore          17
        //   383: aload           18
        //   385: iconst_2       
        //   386: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   391: astore          19
        //   393: iload           5
        //   395: ifne            553
        //   398: aload           15
        //   400: astore          16
        //   402: aload           18
        //   404: astore          17
        //   406: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   409: astore          20
        //   411: aload           19
        //   413: arraylength    
        //   414: istore          5
        //   416: aload           20
        //   418: aload           19
        //   420: iconst_0       
        //   421: iload           5
        //   423: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   426: aload           20
        //   428: iconst_0       
        //   429: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   432: getstatic       rhy.CREATOR:Landroid/os/Parcelable$Creator;
        //   435: aload           20
        //   437: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   442: checkcast       Lrhy;
        //   445: astore          19
        //   447: aload           15
        //   449: astore          16
        //   451: aload           18
        //   453: astore          17
        //   455: aload           20
        //   457: invokevirtual   android/os/Parcel.recycle:()V
        //   460: aload           19
        //   462: ifnull          922
        //   465: aload           15
        //   467: astore          16
        //   469: aload           18
        //   471: astore          17
        //   473: aload           23
        //   475: aload           19
        //   477: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   480: pop            
        //   481: goto            922
        //   484: astore          19
        //   486: goto            529
        //   489: astore          19
        //   491: goto            529
        //   494: astore          16
        //   496: aload           25
        //   498: getfield        ocz.F0:Lm9z;
        //   501: invokevirtual   m9z.b:()Lo3z;
        //   504: getfield        o3z.K0:Ll2z;
        //   507: ldc_w           "Failed to load event from local database"
        //   510: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //   513: aload           15
        //   515: astore          16
        //   517: aload           18
        //   519: astore          17
        //   521: aload           20
        //   523: invokevirtual   android/os/Parcel.recycle:()V
        //   526: goto            922
        //   529: aload           15
        //   531: astore          16
        //   533: aload           18
        //   535: astore          17
        //   537: aload           20
        //   539: invokevirtual   android/os/Parcel.recycle:()V
        //   542: aload           15
        //   544: astore          16
        //   546: aload           18
        //   548: astore          17
        //   550: aload           19
        //   552: athrow         
        //   553: iload           5
        //   555: iconst_1       
        //   556: if_icmpne       708
        //   559: aload           15
        //   561: astore          16
        //   563: aload           18
        //   565: astore          17
        //   567: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   570: astore          20
        //   572: aload           20
        //   574: aload           19
        //   576: iconst_0       
        //   577: aload           19
        //   579: arraylength    
        //   580: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   583: aload           20
        //   585: iconst_0       
        //   586: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   589: getstatic       xpz.CREATOR:Landroid/os/Parcelable$Creator;
        //   592: aload           20
        //   594: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   599: checkcast       Lxpz;
        //   602: astore          19
        //   604: aload           15
        //   606: astore          16
        //   608: aload           18
        //   610: astore          17
        //   612: aload           20
        //   614: invokevirtual   android/os/Parcel.recycle:()V
        //   617: goto            660
        //   620: astore          19
        //   622: goto            684
        //   625: astore          16
        //   627: aload           25
        //   629: getfield        ocz.F0:Lm9z;
        //   632: invokevirtual   m9z.b:()Lo3z;
        //   635: getfield        o3z.K0:Ll2z;
        //   638: ldc_w           "Failed to load user property from local database"
        //   641: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //   644: aload           15
        //   646: astore          16
        //   648: aload           18
        //   650: astore          17
        //   652: aload           20
        //   654: invokevirtual   android/os/Parcel.recycle:()V
        //   657: aconst_null    
        //   658: astore          19
        //   660: aload           19
        //   662: ifnull          922
        //   665: aload           15
        //   667: astore          16
        //   669: aload           18
        //   671: astore          17
        //   673: aload           23
        //   675: aload           19
        //   677: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   680: pop            
        //   681: goto            922
        //   684: aload           15
        //   686: astore          16
        //   688: aload           18
        //   690: astore          17
        //   692: aload           20
        //   694: invokevirtual   android/os/Parcel.recycle:()V
        //   697: aload           15
        //   699: astore          16
        //   701: aload           18
        //   703: astore          17
        //   705: aload           19
        //   707: athrow         
        //   708: iload           5
        //   710: iconst_2       
        //   711: if_icmpne       863
        //   714: aload           15
        //   716: astore          16
        //   718: aload           18
        //   720: astore          17
        //   722: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   725: astore          20
        //   727: aload           20
        //   729: aload           19
        //   731: iconst_0       
        //   732: aload           19
        //   734: arraylength    
        //   735: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   738: aload           20
        //   740: iconst_0       
        //   741: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   744: getstatic       kby.CREATOR:Landroid/os/Parcelable$Creator;
        //   747: aload           20
        //   749: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   754: checkcast       Lkby;
        //   757: astore          19
        //   759: aload           15
        //   761: astore          16
        //   763: aload           18
        //   765: astore          17
        //   767: aload           20
        //   769: invokevirtual   android/os/Parcel.recycle:()V
        //   772: goto            815
        //   775: astore          19
        //   777: goto            839
        //   780: astore          16
        //   782: aload           25
        //   784: getfield        ocz.F0:Lm9z;
        //   787: invokevirtual   m9z.b:()Lo3z;
        //   790: getfield        o3z.K0:Ll2z;
        //   793: ldc_w           "Failed to load conditional user property from local database"
        //   796: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //   799: aload           15
        //   801: astore          16
        //   803: aload           18
        //   805: astore          17
        //   807: aload           20
        //   809: invokevirtual   android/os/Parcel.recycle:()V
        //   812: aconst_null    
        //   813: astore          19
        //   815: aload           19
        //   817: ifnull          922
        //   820: aload           15
        //   822: astore          16
        //   824: aload           18
        //   826: astore          17
        //   828: aload           23
        //   830: aload           19
        //   832: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   835: pop            
        //   836: goto            922
        //   839: aload           15
        //   841: astore          16
        //   843: aload           18
        //   845: astore          17
        //   847: aload           20
        //   849: invokevirtual   android/os/Parcel.recycle:()V
        //   852: aload           15
        //   854: astore          16
        //   856: aload           18
        //   858: astore          17
        //   860: aload           19
        //   862: athrow         
        //   863: iload           5
        //   865: iconst_3       
        //   866: if_icmpne       897
        //   869: aload           15
        //   871: astore          16
        //   873: aload           18
        //   875: astore          17
        //   877: aload           25
        //   879: getfield        ocz.F0:Lm9z;
        //   882: invokevirtual   m9z.b:()Lo3z;
        //   885: getfield        o3z.N0:Ll2z;
        //   888: ldc_w           "Skipping app launch break"
        //   891: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //   894: goto            922
        //   897: aload           15
        //   899: astore          16
        //   901: aload           18
        //   903: astore          17
        //   905: aload           25
        //   907: getfield        ocz.F0:Lm9z;
        //   910: invokevirtual   m9z.b:()Lo3z;
        //   913: getfield        o3z.K0:Ll2z;
        //   916: ldc_w           "Unknown record type in local database"
        //   919: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //   922: goto            321
        //   925: astore          16
        //   927: goto            1092
        //   930: astore          16
        //   932: goto            1139
        //   935: astore          16
        //   937: goto            1109
        //   940: iload           4
        //   942: istore          5
        //   944: aload           14
        //   946: astore          19
        //   948: aload           15
        //   950: astore          16
        //   952: aload           18
        //   954: astore          17
        //   956: lload           9
        //   958: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   961: astore          20
        //   963: aload           15
        //   965: astore          16
        //   967: aload           18
        //   969: astore          17
        //   971: aload           15
        //   973: ldc             "messages"
        //   975: ldc_w           "rowid <= ?"
        //   978: iconst_1       
        //   979: anewarray       Ljava/lang/String;
        //   982: dup            
        //   983: iconst_0       
        //   984: aload           20
        //   986: aastore        
        //   987: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   990: aload           23
        //   992: invokevirtual   java/util/ArrayList.size:()I
        //   995: if_icmpge       1023
        //   998: aload           15
        //  1000: astore          16
        //  1002: aload           18
        //  1004: astore          17
        //  1006: aload           25
        //  1008: getfield        ocz.F0:Lm9z;
        //  1011: invokevirtual   m9z.b:()Lo3z;
        //  1014: getfield        o3z.K0:Ll2z;
        //  1017: ldc_w           "Fewer entries removed from local database than expected"
        //  1020: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //  1023: aload           15
        //  1025: astore          16
        //  1027: aload           18
        //  1029: astore          17
        //  1031: aload           15
        //  1033: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //  1036: aload           15
        //  1038: astore          16
        //  1040: aload           18
        //  1042: astore          17
        //  1044: aload           15
        //  1046: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1049: aload           18
        //  1051: invokeinterface android/database/Cursor.close:()V
        //  1056: aload           15
        //  1058: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1061: goto            1656
        //  1064: astore          21
        //  1066: aload           15
        //  1068: astore          20
        //  1070: aload           19
        //  1072: astore          14
        //  1074: goto            1280
        //  1077: astore          14
        //  1079: aload           18
        //  1081: astore          16
        //  1083: aload           19
        //  1085: astore          18
        //  1087: goto            1236
        //  1090: astore          16
        //  1092: aload           16
        //  1094: astore          21
        //  1096: aload           15
        //  1098: astore          20
        //  1100: iload           4
        //  1102: istore          5
        //  1104: goto            1280
        //  1107: astore          16
        //  1109: aload           14
        //  1111: astore          17
        //  1113: aload           16
        //  1115: astore          14
        //  1117: aload           18
        //  1119: astore          16
        //  1121: aload           17
        //  1123: astore          18
        //  1125: iload           4
        //  1127: istore          5
        //  1129: goto            1236
        //  1132: astore          16
        //  1134: goto            1092
        //  1137: astore          16
        //  1139: aload           18
        //  1141: astore          16
        //  1143: iload           4
        //  1145: istore          5
        //  1147: goto            1208
        //  1150: astore          16
        //  1152: goto            1109
        //  1155: astore          16
        //  1157: goto            1165
        //  1160: astore          16
        //  1162: aconst_null    
        //  1163: astore          17
        //  1165: aload           17
        //  1167: ifnull          1177
        //  1170: aload           17
        //  1172: invokeinterface android/database/Cursor.close:()V
        //  1177: aload           16
        //  1179: athrow         
        //  1180: astore          16
        //  1182: goto            1265
        //  1185: astore          17
        //  1187: goto            1221
        //  1190: astore_1       
        //  1191: goto            1255
        //  1194: astore          16
        //  1196: goto            1265
        //  1199: astore          16
        //  1201: aconst_null    
        //  1202: astore          16
        //  1204: iload           4
        //  1206: istore          5
        //  1208: aload           15
        //  1210: astore          18
        //  1212: aload           16
        //  1214: astore          15
        //  1216: goto            1410
        //  1219: astore          17
        //  1221: aconst_null    
        //  1222: astore          16
        //  1224: iload           4
        //  1226: istore          5
        //  1228: aload           14
        //  1230: astore          18
        //  1232: aload           17
        //  1234: astore          14
        //  1236: aload           14
        //  1238: astore          19
        //  1240: aload           15
        //  1242: astore          14
        //  1244: aload           16
        //  1246: astore          15
        //  1248: goto            1491
        //  1251: astore_1       
        //  1252: aconst_null    
        //  1253: astore          15
        //  1255: aconst_null    
        //  1256: astore_2       
        //  1257: goto            1603
        //  1260: astore          16
        //  1262: aconst_null    
        //  1263: astore          15
        //  1265: aconst_null    
        //  1266: astore          18
        //  1268: iload           4
        //  1270: istore          5
        //  1272: aload           15
        //  1274: astore          20
        //  1276: aload           16
        //  1278: astore          21
        //  1280: aload           20
        //  1282: ifnull          1314
        //  1285: aload           20
        //  1287: astore          16
        //  1289: aload           18
        //  1291: astore          17
        //  1293: aload           20
        //  1295: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //  1298: ifeq            1314
        //  1301: aload           20
        //  1303: astore          16
        //  1305: aload           18
        //  1307: astore          17
        //  1309: aload           20
        //  1311: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1314: aload           20
        //  1316: astore          16
        //  1318: aload           18
        //  1320: astore          17
        //  1322: aload           25
        //  1324: getfield        ocz.F0:Lm9z;
        //  1327: invokevirtual   m9z.b:()Lo3z;
        //  1330: getfield        o3z.K0:Ll2z;
        //  1333: aload           22
        //  1335: aload           21
        //  1337: invokevirtual   l2z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1340: aload           20
        //  1342: astore          16
        //  1344: aload           18
        //  1346: astore          17
        //  1348: aload           25
        //  1350: iconst_1       
        //  1351: putfield        u1z.I0:Z
        //  1354: aload           18
        //  1356: ifnull          1366
        //  1359: aload           18
        //  1361: invokeinterface android/database/Cursor.close:()V
        //  1366: iload           6
        //  1368: istore          7
        //  1370: aload           14
        //  1372: astore          15
        //  1374: iload           5
        //  1376: istore          4
        //  1378: aload           20
        //  1380: ifnull          1581
        //  1383: aload           20
        //  1385: astore          18
        //  1387: aload           14
        //  1389: astore          15
        //  1391: iload           5
        //  1393: istore          4
        //  1395: goto            1572
        //  1398: astore          15
        //  1400: aconst_null    
        //  1401: astore          18
        //  1403: aconst_null    
        //  1404: astore          15
        //  1406: iload           4
        //  1408: istore          5
        //  1410: iload           6
        //  1412: i2l            
        //  1413: lstore          9
        //  1415: aload           18
        //  1417: astore          16
        //  1419: aload           15
        //  1421: astore          17
        //  1423: lload           9
        //  1425: invokestatic    android/os/SystemClock.sleep:(J)V
        //  1428: iinc            6, 20
        //  1431: aload           15
        //  1433: ifnull          1443
        //  1436: aload           15
        //  1438: invokeinterface android/database/Cursor.close:()V
        //  1443: iload           6
        //  1445: istore          7
        //  1447: aload           14
        //  1449: astore          15
        //  1451: iload           5
        //  1453: istore          4
        //  1455: aload           18
        //  1457: ifnull          1581
        //  1460: aload           14
        //  1462: astore          15
        //  1464: iload           5
        //  1466: istore          4
        //  1468: goto            1572
        //  1471: astore          19
        //  1473: aconst_null    
        //  1474: astore          16
        //  1476: aconst_null    
        //  1477: astore          15
        //  1479: iload           4
        //  1481: istore          5
        //  1483: aload           14
        //  1485: astore          18
        //  1487: aload           16
        //  1489: astore          14
        //  1491: aload           14
        //  1493: astore          16
        //  1495: aload           15
        //  1497: astore          17
        //  1499: aload           25
        //  1501: getfield        ocz.F0:Lm9z;
        //  1504: invokevirtual   m9z.b:()Lo3z;
        //  1507: getfield        o3z.K0:Ll2z;
        //  1510: aload           22
        //  1512: aload           19
        //  1514: invokevirtual   l2z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1517: aload           14
        //  1519: astore          16
        //  1521: aload           15
        //  1523: astore          17
        //  1525: aload           25
        //  1527: iconst_1       
        //  1528: putfield        u1z.I0:Z
        //  1531: aload           15
        //  1533: ifnull          1543
        //  1536: aload           15
        //  1538: invokeinterface android/database/Cursor.close:()V
        //  1543: iload           6
        //  1545: istore          7
        //  1547: aload           18
        //  1549: astore          15
        //  1551: iload           5
        //  1553: istore          4
        //  1555: aload           14
        //  1557: ifnull          1581
        //  1560: iload           5
        //  1562: istore          4
        //  1564: aload           18
        //  1566: astore          15
        //  1568: aload           14
        //  1570: astore          18
        //  1572: aload           18
        //  1574: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1577: iload           6
        //  1579: istore          7
        //  1581: iinc            8, 1
        //  1584: aload           15
        //  1586: astore          14
        //  1588: iload           7
        //  1590: istore          6
        //  1592: goto            118
        //  1595: astore_1       
        //  1596: aload           17
        //  1598: astore_2       
        //  1599: aload           16
        //  1601: astore          15
        //  1603: aload_2        
        //  1604: ifnull          1613
        //  1607: aload_2        
        //  1608: invokeinterface android/database/Cursor.close:()V
        //  1613: aload           15
        //  1615: ifnull          1623
        //  1618: aload           15
        //  1620: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1623: aload_1        
        //  1624: athrow         
        //  1625: aload           25
        //  1627: getfield        ocz.F0:Lm9z;
        //  1630: invokevirtual   m9z.b:()Lo3z;
        //  1633: getfield        o3z.N0:Ll2z;
        //  1636: ldc_w           "Failed to read events from database in reasonable time"
        //  1639: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //  1642: aconst_null    
        //  1643: astore          14
        //  1645: iload           4
        //  1647: istore          5
        //  1649: goto            1660
        //  1652: iload           4
        //  1654: istore          5
        //  1656: aload           23
        //  1658: astore          14
        //  1660: aload           14
        //  1662: ifnull          1685
        //  1665: aload           24
        //  1667: aload           14
        //  1669: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  1672: pop            
        //  1673: aload           14
        //  1675: invokeinterface java/util/List.size:()I
        //  1680: istore          4
        //  1682: goto            1688
        //  1685: iconst_0       
        //  1686: istore          4
        //  1688: aload_2        
        //  1689: ifnull          1706
        //  1692: iload           4
        //  1694: bipush          100
        //  1696: if_icmpge       1706
        //  1699: aload           24
        //  1701: aload_2        
        //  1702: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1705: pop            
        //  1706: aload           24
        //  1708: invokevirtual   java/util/ArrayList.size:()I
        //  1711: istore          7
        //  1713: iconst_0       
        //  1714: istore          6
        //  1716: iload           6
        //  1718: iload           7
        //  1720: if_icmpge       1895
        //  1723: aload           24
        //  1725: iload           6
        //  1727: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1730: checkcast       Lsd;
        //  1733: astore          14
        //  1735: aload           14
        //  1737: instanceof      Lrhy;
        //  1740: ifeq            1781
        //  1743: aload_1        
        //  1744: aload           14
        //  1746: checkcast       Lrhy;
        //  1749: aload_3        
        //  1750: invokeinterface g1z.R0:(Lrhy;Lsxz;)V
        //  1755: goto            1889
        //  1758: astore          14
        //  1760: aload_0        
        //  1761: getfield        ocz.F0:Lm9z;
        //  1764: invokevirtual   m9z.b:()Lo3z;
        //  1767: getfield        o3z.K0:Ll2z;
        //  1770: ldc_w           "Failed to send event to the service"
        //  1773: aload           14
        //  1775: invokevirtual   l2z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1778: goto            1889
        //  1781: aload           14
        //  1783: instanceof      Lxpz;
        //  1786: ifeq            1827
        //  1789: aload_1        
        //  1790: aload           14
        //  1792: checkcast       Lxpz;
        //  1795: aload_3        
        //  1796: invokeinterface g1z.a0:(Lxpz;Lsxz;)V
        //  1801: goto            1889
        //  1804: astore          14
        //  1806: aload_0        
        //  1807: getfield        ocz.F0:Lm9z;
        //  1810: invokevirtual   m9z.b:()Lo3z;
        //  1813: getfield        o3z.K0:Ll2z;
        //  1816: ldc_w           "Failed to send user property to the service"
        //  1819: aload           14
        //  1821: invokevirtual   l2z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1824: goto            1889
        //  1827: aload           14
        //  1829: instanceof      Lkby;
        //  1832: ifeq            1873
        //  1835: aload_1        
        //  1836: aload           14
        //  1838: checkcast       Lkby;
        //  1841: aload_3        
        //  1842: invokeinterface g1z.k1:(Lkby;Lsxz;)V
        //  1847: goto            1889
        //  1850: astore          14
        //  1852: aload_0        
        //  1853: getfield        ocz.F0:Lm9z;
        //  1856: invokevirtual   m9z.b:()Lo3z;
        //  1859: getfield        o3z.K0:Ll2z;
        //  1862: ldc_w           "Failed to send conditional user property to the service"
        //  1865: aload           14
        //  1867: invokevirtual   l2z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1870: goto            1889
        //  1873: aload_0        
        //  1874: getfield        ocz.F0:Lm9z;
        //  1877: invokevirtual   m9z.b:()Lo3z;
        //  1880: getfield        o3z.K0:Ll2z;
        //  1883: ldc_w           "Discarding data. Unrecognized parcel type."
        //  1886: invokevirtual   l2z.a:(Ljava/lang/String;)V
        //  1889: iinc            6, 1
        //  1892: goto            1716
        //  1895: iload           5
        //  1897: iconst_1       
        //  1898: iadd           
        //  1899: istore          6
        //  1901: iload           4
        //  1903: istore          5
        //  1905: iload           6
        //  1907: istore          4
        //  1909: goto            27
        //  1912: return         
        //  1913: astore          16
        //  1915: goto            496
        //  1918: astore          16
        //  1920: goto            1139
        //  1923: astore          14
        //  1925: aload           18
        //  1927: astore          16
        //  1929: aload           19
        //  1931: astore          14
        //  1933: goto            1208
        //  1936: astore          16
        //  1938: goto            1201
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                                               
        //  -----  -----  -----  -----  -----------------------------------------------------------------------------------
        //  124    131    1471   1491   Landroid/database/sqlite/SQLiteFullException;
        //  124    131    1398   1410   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  124    131    1260   1265   Landroid/database/sqlite/SQLiteException;
        //  124    131    1251   1255   Any
        //  136    142    1219   1221   Landroid/database/sqlite/SQLiteFullException;
        //  136    142    1199   1201   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  136    142    1194   1199   Landroid/database/sqlite/SQLiteException;
        //  136    142    1190   1194   Any
        //  145    150    1219   1221   Landroid/database/sqlite/SQLiteFullException;
        //  145    150    1199   1201   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  145    150    1194   1199   Landroid/database/sqlite/SQLiteException;
        //  145    150    1190   1194   Any
        //  150    185    1160   1165   Any
        //  185    194    1155   1160   Any
        //  204    214    1155   1160   Any
        //  214    221    1219   1221   Landroid/database/sqlite/SQLiteFullException;
        //  214    221    1199   1201   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  214    221    1194   1199   Landroid/database/sqlite/SQLiteException;
        //  214    221    1190   1194   Any
        //  224    231    1219   1221   Landroid/database/sqlite/SQLiteFullException;
        //  224    231    1199   1201   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  224    231    1194   1199   Landroid/database/sqlite/SQLiteException;
        //  224    231    1190   1194   Any
        //  249    263    1219   1221   Landroid/database/sqlite/SQLiteFullException;
        //  249    263    1199   1201   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  249    263    1194   1199   Landroid/database/sqlite/SQLiteException;
        //  249    263    1190   1194   Any
        //  272    317    1219   1221   Landroid/database/sqlite/SQLiteFullException;
        //  272    317    1199   1201   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  272    317    1194   1199   Landroid/database/sqlite/SQLiteException;
        //  272    317    1190   1194   Any
        //  329    339    1150   1155   Landroid/database/sqlite/SQLiteFullException;
        //  329    339    1137   1139   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  329    339    1132   1137   Landroid/database/sqlite/SQLiteException;
        //  329    339    1595   1603   Any
        //  347    357    1150   1155   Landroid/database/sqlite/SQLiteFullException;
        //  347    357    1137   1139   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  347    357    1132   1137   Landroid/database/sqlite/SQLiteException;
        //  347    357    1595   1603   Any
        //  365    375    1150   1155   Landroid/database/sqlite/SQLiteFullException;
        //  365    375    1137   1139   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  365    375    1132   1137   Landroid/database/sqlite/SQLiteException;
        //  365    375    1595   1603   Any
        //  383    393    935    940    Landroid/database/sqlite/SQLiteFullException;
        //  383    393    930    935    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  383    393    925    930    Landroid/database/sqlite/SQLiteException;
        //  383    393    1595   1603   Any
        //  406    411    935    940    Landroid/database/sqlite/SQLiteFullException;
        //  406    411    930    935    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  406    411    925    930    Landroid/database/sqlite/SQLiteException;
        //  406    411    1595   1603   Any
        //  411    416    494    496    Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  411    416    489    494    Any
        //  416    447    1913   1918   Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  416    447    484    489    Any
        //  455    460    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  455    460    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  455    460    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  455    460    1595   1603   Any
        //  473    481    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  473    481    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  473    481    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  473    481    1595   1603   Any
        //  496    513    484    489    Any
        //  521    526    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  521    526    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  521    526    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  521    526    1595   1603   Any
        //  537    542    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  537    542    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  537    542    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  537    542    1595   1603   Any
        //  550    553    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  550    553    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  550    553    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  550    553    1595   1603   Any
        //  567    572    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  567    572    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  567    572    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  567    572    1595   1603   Any
        //  572    604    625    660    Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  572    604    620    708    Any
        //  612    617    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  612    617    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  612    617    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  612    617    1595   1603   Any
        //  627    644    620    708    Any
        //  652    657    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  652    657    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  652    657    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  652    657    1595   1603   Any
        //  673    681    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  673    681    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  673    681    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  673    681    1595   1603   Any
        //  692    697    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  692    697    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  692    697    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  692    697    1595   1603   Any
        //  705    708    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  705    708    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  705    708    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  705    708    1595   1603   Any
        //  722    727    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  722    727    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  722    727    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  722    727    1595   1603   Any
        //  727    759    780    815    Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  727    759    775    863    Any
        //  767    772    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  767    772    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  767    772    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  767    772    1595   1603   Any
        //  782    799    775    863    Any
        //  807    812    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  807    812    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  807    812    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  807    812    1595   1603   Any
        //  828    836    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  828    836    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  828    836    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  828    836    1595   1603   Any
        //  847    852    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  847    852    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  847    852    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  847    852    1595   1603   Any
        //  860    863    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  860    863    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  860    863    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  860    863    1595   1603   Any
        //  877    894    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  877    894    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  877    894    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  877    894    1595   1603   Any
        //  905    922    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  905    922    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  905    922    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  905    922    1595   1603   Any
        //  956    963    1107   1109   Landroid/database/sqlite/SQLiteFullException;
        //  956    963    1918   1923   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  956    963    1090   1092   Landroid/database/sqlite/SQLiteException;
        //  956    963    1595   1603   Any
        //  971    998    1077   1090   Landroid/database/sqlite/SQLiteFullException;
        //  971    998    1923   1936   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  971    998    1064   1077   Landroid/database/sqlite/SQLiteException;
        //  971    998    1595   1603   Any
        //  1006   1023   1077   1090   Landroid/database/sqlite/SQLiteFullException;
        //  1006   1023   1923   1936   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1006   1023   1064   1077   Landroid/database/sqlite/SQLiteException;
        //  1006   1023   1595   1603   Any
        //  1031   1036   1077   1090   Landroid/database/sqlite/SQLiteFullException;
        //  1031   1036   1923   1936   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1031   1036   1064   1077   Landroid/database/sqlite/SQLiteException;
        //  1031   1036   1595   1603   Any
        //  1044   1049   1077   1090   Landroid/database/sqlite/SQLiteFullException;
        //  1044   1049   1923   1936   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1044   1049   1064   1077   Landroid/database/sqlite/SQLiteException;
        //  1044   1049   1595   1603   Any
        //  1170   1177   1185   1190   Landroid/database/sqlite/SQLiteFullException;
        //  1170   1177   1936   1941   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1170   1177   1180   1185   Landroid/database/sqlite/SQLiteException;
        //  1170   1177   1190   1194   Any
        //  1177   1180   1185   1190   Landroid/database/sqlite/SQLiteFullException;
        //  1177   1180   1936   1941   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1177   1180   1180   1185   Landroid/database/sqlite/SQLiteException;
        //  1177   1180   1190   1194   Any
        //  1293   1301   1595   1603   Any
        //  1309   1314   1595   1603   Any
        //  1322   1340   1595   1603   Any
        //  1348   1354   1595   1603   Any
        //  1423   1428   1595   1603   Any
        //  1499   1517   1595   1603   Any
        //  1525   1531   1595   1603   Any
        //  1743   1755   1758   1781   Landroid/os/RemoteException;
        //  1789   1801   1804   1827   Landroid/os/RemoteException;
        //  1835   1847   1850   1873   Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 877, Size: 877
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
    
    public final void l(final kby kby) {
        ((wxy)this).g();
        this.h();
        Objects.requireNonNull(((ocz)this).F0);
        final u1z s = ((ocz)this).F0.s();
        final byte[] a0 = ((ocz)s).F0.B().a0((Parcelable)kby);
        boolean n;
        if (a0.length > 131072) {
            ((ocz)s).F0.b().L0.a("Conditional user property too long for local database. Sending directly to service");
            n = false;
        }
        else {
            n = s.n(2, a0);
        }
        this.t((Runnable)new mkz(this, this.q(true), n, new kby(kby)));
    }
    
    public final void m(final Bundle bundle) {
        ((wxy)this).g();
        this.h();
        this.t(new w5z(this, this.q(false), bundle, 1));
    }
    
    public final boolean n() {
        ((wxy)this).g();
        this.h();
        return this.I0 != null;
    }
    
    public final boolean o() {
        ((wxy)this).g();
        this.h();
        return !this.p() || ((ocz)this).F0.B().l0() >= (int)s0z.i0.a(null);
    }
    
    public final boolean p() {
        ((wxy)this).g();
        this.h();
        if (this.J0 == null) {
            ((wxy)this).g();
            this.h();
            final s5z u = ((ocz)this).F0.u();
            u.g();
            final boolean contains = u.n().contains("use_service");
            final boolean b = false;
            boolean b2 = false;
            Boolean value;
            if (!contains) {
                value = null;
            }
            else {
                value = u.n().getBoolean("use_service", false);
            }
            boolean b3 = true;
            final boolean b4 = true;
            final boolean b5 = true;
            if (value != null && value) {
                b2 = b4;
            }
            else {
                Objects.requireNonNull(((ocz)this).F0);
                final l1z r = ((ocz)this).F0.r();
                ((v2z)r).h();
                Label_0407: {
                    Label_0145: {
                        if (r.P0 != 1) {
                            ((ocz)this).F0.b().S0.a("Checking service availability");
                            final kqz b6 = ((ocz)this).F0.B();
                            Objects.requireNonNull(b6);
                            final int c = s5c.b.c(b6.F0.F0, 12451000);
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        if (c != 3) {
                                            if (c != 9) {
                                                if (c == 18) {
                                                    ((ocz)this).F0.b().N0.a("Service updating");
                                                    break Label_0145;
                                                }
                                                ((ocz)this).F0.b().N0.b("Unexpected service status", (Object)c);
                                            }
                                            else {
                                                ((ocz)this).F0.b().N0.a("Service invalid");
                                            }
                                        }
                                        else {
                                            ((ocz)this).F0.b().N0.a("Service disabled");
                                        }
                                    }
                                    else {
                                        ((ocz)this).F0.b().R0.a("Service container out of date");
                                        if (((ocz)this).F0.B().l0() < 17443) {
                                            b2 = b;
                                            break Label_0407;
                                        }
                                        b2 = (value == null && b5);
                                    }
                                    b3 = false;
                                    break Label_0407;
                                }
                                ((ocz)this).F0.b().S0.a("Service missing");
                                b2 = b;
                                break Label_0407;
                            }
                            else {
                                ((ocz)this).F0.b().S0.a("Service available");
                            }
                        }
                    }
                    b2 = true;
                }
                if (!b2 && ((ocz)this).F0.L0.z()) {
                    ((ocz)this).F0.b().K0.a("No way to upload. Consider using the full version of Analytics");
                }
                else if (b3) {
                    final s5z u2 = ((ocz)this).F0.u();
                    u2.g();
                    final SharedPreferences$Editor edit = u2.n().edit();
                    edit.putBoolean("use_service", b2);
                    edit.apply();
                }
            }
            this.J0 = b2;
        }
        return this.J0;
    }
    
    public final sxz q(final boolean b) {
        Objects.requireNonNull(((ocz)this).F0);
        Object o = ((ocz)this).F0.r();
        final String s = null;
        String h = null;
        Label_0316: {
            if (b) {
                final o3z b2 = ((ocz)this).F0.b();
                if (((ocz)b2).F0.u().I0 != null) {
                    final k5z i0 = ((ocz)b2).F0.u().I0;
                    i0.e.g();
                    i0.e.g();
                    final long long1 = i0.e.n().getLong(i0.a, 0L);
                    long abs;
                    if (long1 == 0L) {
                        i0.a();
                        abs = 0L;
                    }
                    else {
                        Objects.requireNonNull(i0.e.F0.S0);
                        abs = Math.abs(long1 - System.currentTimeMillis());
                    }
                    final long d = i0.d;
                    Pair b3 = null;
                    Label_0270: {
                        if (abs >= d) {
                            if (abs > d + d) {
                                i0.a();
                            }
                            else {
                                final String string = i0.e.n().getString(i0.c, (String)null);
                                final long long2 = i0.e.n().getLong(i0.b, 0L);
                                i0.a();
                                if (string != null && long2 > 0L) {
                                    b3 = new Pair((Object)string, (Object)long2);
                                    break Label_0270;
                                }
                                b3 = s5z.b1;
                                break Label_0270;
                            }
                        }
                        b3 = null;
                    }
                    if (b3 != null) {
                        if (b3 != s5z.b1) {
                            h = c0e.h(String.valueOf(b3.second), ":", (String)b3.first);
                            break Label_0316;
                        }
                    }
                }
            }
            h = null;
        }
        ((wxy)o).g();
        final String l = ((l1z)o).l();
        final String m = ((l1z)o).m();
        ((v2z)o).h();
        final String i2 = ((l1z)o).I0;
        ((v2z)o).h();
        final long n = ((l1z)o).J0;
        ((v2z)o).h();
        iuk.C((Object)((l1z)o).K0);
        final String k0 = ((l1z)o).K0;
        ((ocz)o).F0.L0.p();
        ((v2z)o).h();
        ((wxy)o).g();
        long l2 = ((l1z)o).L0;
        if (l2 == 0L) {
            final kqz b4 = ((ocz)o).F0.B();
            final Context f0 = ((ocz)o).F0.F0;
            final String packageName = f0.getPackageName();
            b4.g();
            iuk.z(packageName);
            final PackageManager packageManager = f0.getPackageManager();
            final MessageDigest r = kqz.r();
            l2 = -1L;
            Label_0614: {
                if (r == null) {
                    b4.F0.b().K0.a("Could not get MD5 instance");
                }
                else {
                    if (packageManager != null) {
                        try {
                            if (!b4.U(f0, packageName)) {
                                final Signature[] signatures = wux.a(f0).b(b4.F0.F0.getPackageName(), 64).signatures;
                                if (signatures != null && signatures.length > 0) {
                                    l2 = kqz.m0(r.digest(signatures[0].toByteArray()));
                                    break Label_0614;
                                }
                                b4.F0.b().N0.a("Could not get signatures");
                                break Label_0614;
                            }
                        }
                        catch (final PackageManager$NameNotFoundException ex) {
                            b4.F0.b().K0.b("Package name not found", (Object)ex);
                        }
                    }
                    l2 = 0L;
                }
            }
            ((l1z)o).L0 = l2;
        }
        final boolean h2 = ((ocz)o).F0.h();
        final boolean t0 = ((ocz)o).F0.u().T0;
        ((wxy)o).g();
        Label_0750: {
            if (!((ocz)o).F0.h()) {
                final String s2 = s;
                break Label_0750;
            }
            exz.G0.b().a();
            if (((ocz)o).F0.L0.t((String)null, s0z.c0)) {
                ((ocz)o).F0.b().S0.a("Disabled IID for tests.");
                final String s2 = s;
                break Label_0750;
            }
            while (true) {
                try {
                    final Class<?> loadClass = ((ocz)o).F0.F0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    String s2;
                    if (loadClass == null) {
                        s2 = s;
                    }
                    else {
                        try {
                            final Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, ((ocz)o).F0.F0);
                            if (invoke != null) {
                                try {
                                    s2 = (String)loadClass.getDeclaredMethod("getFirebaseInstanceId", (Class[])new Class[0]).invoke(invoke, new Object[0]);
                                }
                                catch (final Exception ex2) {
                                    ((ocz)o).F0.b().P0.a("Failed to retrieve Firebase Instance Id");
                                }
                            }
                        }
                        catch (final Exception ex3) {
                            ((ocz)o).F0.b().O0.a("Failed to obtain Firebase Analytics instance");
                        }
                        s2 = null;
                    }
                    final m9z f2 = ((ocz)o).F0;
                    final long a = f2.u().J0.a();
                    long n2;
                    if (a == 0L) {
                        n2 = f2.l1;
                    }
                    else {
                        n2 = Math.min(f2.l1, a);
                    }
                    ((v2z)o).h();
                    final int p = ((l1z)o).P0;
                    final Boolean s3 = ((ocz)o).F0.L0.s("google_analytics_adid_collection_enabled");
                    final boolean b5 = s3 == null || s3;
                    final s5z u = ((ocz)o).F0.u();
                    u.g();
                    final boolean boolean1 = u.n().getBoolean("deferred_analytics_collection", false);
                    ((v2z)o).h();
                    final String r2 = ((l1z)o).R0;
                    final Boolean s4 = ((ocz)o).F0.L0.s("google_analytics_default_allow_ad_personalization_signals");
                    Boolean value;
                    if (s4 == null) {
                        value = null;
                    }
                    else {
                        value = (s4 ^ true);
                    }
                    final long m2 = ((l1z)o).M0;
                    final List n3 = ((l1z)o).N0;
                    final String e = ((ocz)o).F0.u().o().e();
                    if (((l1z)o).O0 == null) {
                        if (((ocz)o).F0.L0.t((String)null, s0z.J0)) {
                            ((l1z)o).O0 = ((ocz)o).F0.B().p();
                        }
                        else {
                            ((l1z)o).O0 = "";
                        }
                    }
                    final String o2 = ((l1z)o).O0;
                    ywz.c();
                    if (((ocz)o).F0.L0.t((String)null, s0z.E0)) {
                        ((wxy)o).g();
                        if (((l1z)o).T0 != 0L) {
                            Objects.requireNonNull(((ocz)o).F0.S0);
                            final long currentTimeMillis = System.currentTimeMillis();
                            final long t2 = ((l1z)o).T0;
                            if (((l1z)o).S0 != null && currentTimeMillis - t2 > 86400000L && ((l1z)o).U0 == null) {
                                ((l1z)o).n();
                            }
                        }
                        if (((l1z)o).S0 == null) {
                            ((l1z)o).n();
                        }
                        o = ((l1z)o).S0;
                    }
                    else {
                        o = null;
                    }
                    return new sxz(l, m, i2, n, k0, 64000L, l2, h, h2, t0 ^ true, s2, 0L, n2, p, b5, boolean1, r2, value, m2, n3, e, o2, (String)o);
                }
                catch (final ClassNotFoundException ex4) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void r() {
        ((wxy)this).g();
        ((ocz)this).F0.b().S0.b("Processing queued up service tasks", (Object)this.M0.size());
        for (final Runnable runnable : this.M0) {
            try {
                runnable.run();
            }
            catch (final RuntimeException ex) {
                ((ocz)this).F0.b().K0.b("Task exception while flushing queue", (Object)ex);
            }
        }
        this.M0.clear();
        this.N0.a();
    }
    
    public final void s() {
        ((wxy)this).g();
        final onz l0 = this.L0;
        Objects.requireNonNull((r1n)l0.a);
        l0.b = SystemClock.elapsedRealtime();
        final ujz k0 = this.K0;
        Objects.requireNonNull(((ocz)this).F0);
        k0.c((long)s0z.K.a(null));
    }
    
    public final void t(final Runnable runnable) throws IllegalStateException {
        ((wxy)this).g();
        if (this.n()) {
            runnable.run();
            return;
        }
        final int size = this.M0.size();
        Objects.requireNonNull(((ocz)this).F0);
        if (size >= 1000L) {
            ((ocz)this).F0.b().K0.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.M0.add(runnable);
        this.N0.c(60000L);
        this.y();
    }
    
    public final void u() {
        Objects.requireNonNull(((ocz)this).F0);
    }
    
    public final Boolean v() {
        return this.J0;
    }
    
    public final void y() {
        ((wxy)this).g();
        this.h();
        if (this.n()) {
            return;
        }
        if (!this.p()) {
            if (!((ocz)this).F0.L0.z()) {
                Objects.requireNonNull(((ocz)this).F0);
                final List queryIntentServices = ((ocz)this).F0.F0.getPackageManager().queryIntentServices(new Intent().setClassName(((ocz)this).F0.F0, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    final Intent intent = new Intent("com.google.android.gms.measurement.START");
                    final m9z f0 = ((ocz)this).F0;
                    final Context f2 = f0.F0;
                    Objects.requireNonNull(f0);
                    intent.setComponent(new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementService"));
                    final cmz h0 = this.H0;
                    ((wxy)h0.H0).g();
                    final Context f3 = ((ocz)h0.H0).F0.F0;
                    final ei6 b = ei6.b();
                    synchronized (h0) {
                        if (h0.F0) {
                            ((ocz)h0.H0).F0.b().S0.a("Connection attempt already in progress");
                            monitorexit(h0);
                        }
                        else {
                            ((ocz)h0.H0).F0.b().S0.a("Using local app measurement service");
                            h0.F0 = true;
                            b.a(f3, intent, (ServiceConnection)h0.H0.H0, 129);
                        }
                        return;
                    }
                }
                ((ocz)this).F0.b().K0.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
            return;
        }
        final cmz h2 = this.H0;
        ((wxy)h2.H0).g();
        final Context f4 = ((ocz)h2.H0).F0.F0;
        synchronized (h2) {
            if (h2.F0) {
                ((ocz)h2.H0).F0.b().S0.a("Connection attempt already in progress");
                monitorexit(h2);
            }
            else if (h2.G0 != null && (((gm1)h2.G0).g() || ((gm1)h2.G0).b())) {
                ((ocz)h2.H0).F0.b().S0.a("Already awaiting connection attempt");
                monitorexit(h2);
            }
            else {
                h2.G0 = new f2z(f4, Looper.getMainLooper(), (gm1$a)h2, (gm1$b)h2);
                ((ocz)h2.H0).F0.b().S0.a("Connecting to remote service");
                h2.F0 = true;
                iuk.C((Object)h2.G0);
                ((gm1)h2.G0).v();
            }
        }
    }
    
    public final void z() {
        ((wxy)this).g();
        this.h();
        final cmz h0 = this.H0;
        if (h0.G0 != null && (((gm1)h0.G0).b() || ((gm1)h0.G0).g())) {
            ((gm1)h0.G0).o();
        }
        h0.G0 = null;
        while (true) {
            try {
                ei6.b().c(((ocz)this).F0.F0, (ServiceConnection)this.H0);
                this.I0 = null;
            }
            catch (final IllegalStateException | IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
}
