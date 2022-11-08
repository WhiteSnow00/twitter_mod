import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.content.Intent;
import androidx.room.MultiInstanceInvalidationService;
import com.openback.db.message.MessageDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7h
{
    public z7h a;
    public final MessageDatabase b;
    public long c;
    public final qlj d;
    
    public f7h(final qlj d) {
        this.d = d;
        final gcn$a a = pzm.a(d.i, (Class)MessageDatabase.class, "openback_messages");
        Intent i;
        if (a.b != null) {
            i = new Intent(a.c, (Class)MultiInstanceInvalidationService.class);
        }
        else {
            i = null;
        }
        a.i = i;
        a.c();
        this.b = (MessageDatabase)a.b();
        final mvk f = d.f;
        String s = "{}";
        final String b = f.b("message_stats", "{}");
        if (b != null) {
            s = b;
        }
        this.a = (z7h)asy.r0(s, (Class)z7h.class);
        long long1 = 0L;
        while (true) {
            try {
                long1 = f.a.getLong("message_sensors", 0L);
                this.c = long1;
                uud.a(d.i, long1 >> 32);
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final void a(final mjr p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        f7h.d:Lqlj;
        //     4: getfield        qlj.a:Lhnp;
        //     7: astore_2       
        //     8: ldc             "Checking messages..."
        //    10: invokestatic    ck1.q:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: getfield        f7h.d:Lqlj;
        //    17: getfield        qlj.i:Landroid/content/Context;
        //    20: ldc             "message_check"
        //    22: aconst_null    
        //    23: aconst_null    
        //    24: aconst_null    
        //    25: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //    28: aload_0        
        //    29: getfield        f7h.a:Lz7h;
        //    32: invokestatic    java/lang/System.currentTimeMillis:()J
        //    35: putfield        z7h.lastMessageChecked:J
        //    38: new             Ljava/util/ArrayList;
        //    41: dup            
        //    42: aload_0        
        //    43: getfield        f7h.b:Lcom/openback/db/message/MessageDatabase;
        //    46: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lo6h;
        //    49: invokeinterface o6h.a:()Ljava/util/List;
        //    54: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //    57: astore_3       
        //    58: aload_3        
        //    59: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    62: ifeq            71
        //    65: ldc             " \u2716\ufe0e No messages to check"
        //    67: invokestatic    ck1.q:(Ljava/lang/String;)V
        //    70: return         
        //    71: aload_0        
        //    72: getfield        f7h.d:Lqlj;
        //    75: getfield        qlj.a:Lhnp;
        //    78: astore          4
        //    80: invokestatic    java/lang/System.currentTimeMillis:()J
        //    83: lstore          5
        //    85: aload_0        
        //    86: getfield        f7h.a:Lz7h;
        //    89: getfield        z7h.yearStartTime:J
        //    92: lstore          7
        //    94: getstatic       java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
        //    97: astore          9
        //    99: lload           5
        //   101: lload           7
        //   103: lsub           
        //   104: aload           9
        //   106: ldc2_w          365
        //   109: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   112: lcmp           
        //   113: ifle            135
        //   116: aload_0        
        //   117: getfield        f7h.a:Lz7h;
        //   120: astore          10
        //   122: aload           10
        //   124: lload           5
        //   126: putfield        z7h.yearStartTime:J
        //   129: aload           10
        //   131: lconst_0       
        //   132: putfield        z7h.currentYearCount:J
        //   135: lload           5
        //   137: aload_0        
        //   138: getfield        f7h.a:Lz7h;
        //   141: getfield        z7h.monthStartTime:J
        //   144: lsub           
        //   145: aload           9
        //   147: ldc2_w          30
        //   150: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   153: lcmp           
        //   154: ifle            176
        //   157: aload_0        
        //   158: getfield        f7h.a:Lz7h;
        //   161: astore          10
        //   163: aload           10
        //   165: lload           5
        //   167: putfield        z7h.monthStartTime:J
        //   170: aload           10
        //   172: lconst_0       
        //   173: putfield        z7h.currentMonthCount:J
        //   176: lload           5
        //   178: aload_0        
        //   179: getfield        f7h.a:Lz7h;
        //   182: getfield        z7h.weekStartTime:J
        //   185: lsub           
        //   186: aload           9
        //   188: ldc2_w          7
        //   191: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   194: lcmp           
        //   195: ifle            217
        //   198: aload_0        
        //   199: getfield        f7h.a:Lz7h;
        //   202: astore          10
        //   204: aload           10
        //   206: lload           5
        //   208: putfield        z7h.weekStartTime:J
        //   211: aload           10
        //   213: lconst_0       
        //   214: putfield        z7h.currentWeekCount:J
        //   217: lload           5
        //   219: aload_0        
        //   220: getfield        f7h.a:Lz7h;
        //   223: getfield        z7h.dayStartTime:J
        //   226: lsub           
        //   227: aload           9
        //   229: lconst_1       
        //   230: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   233: lcmp           
        //   234: ifle            256
        //   237: aload_0        
        //   238: getfield        f7h.a:Lz7h;
        //   241: astore          9
        //   243: aload           9
        //   245: lload           5
        //   247: putfield        z7h.dayStartTime:J
        //   250: aload           9
        //   252: lconst_0       
        //   253: putfield        z7h.currentDayCount:J
        //   256: lload           5
        //   258: aload_0        
        //   259: getfield        f7h.a:Lz7h;
        //   262: getfield        z7h.hourStartTime:J
        //   265: lsub           
        //   266: getstatic       java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
        //   269: lconst_1       
        //   270: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   273: lcmp           
        //   274: ifle            296
        //   277: aload_0        
        //   278: getfield        f7h.a:Lz7h;
        //   281: astore          9
        //   283: aload           9
        //   285: lload           5
        //   287: putfield        z7h.hourStartTime:J
        //   290: aload           9
        //   292: lconst_0       
        //   293: putfield        z7h.currentHourCount:J
        //   296: aload_0        
        //   297: invokevirtual   f7h.c:()V
        //   300: aload           4
        //   302: getfield        hnp.limits:Lhnp$a;
        //   305: astore          4
        //   307: aload           4
        //   309: getfield        hnp$a.yearly:J
        //   312: lstore          5
        //   314: lload           5
        //   316: lconst_0       
        //   317: lcmp           
        //   318: ifle            357
        //   321: aload_0        
        //   322: getfield        f7h.a:Lz7h;
        //   325: getfield        z7h.currentYearCount:J
        //   328: lload           5
        //   330: lcmp           
        //   331: iflt            357
        //   334: ldc             " \u2716\ufe0e Did exceed maximum per year"
        //   336: invokestatic    ck1.r:(Ljava/lang/String;)V
        //   339: aload_0        
        //   340: getfield        f7h.d:Lqlj;
        //   343: getfield        qlj.i:Landroid/content/Context;
        //   346: ldc             "global_max_year"
        //   348: aconst_null    
        //   349: aconst_null    
        //   350: aconst_null    
        //   351: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //   354: goto            552
        //   357: aload           4
        //   359: getfield        hnp$a.monthly:J
        //   362: lstore          5
        //   364: lload           5
        //   366: lconst_0       
        //   367: lcmp           
        //   368: istore          11
        //   370: iload           11
        //   372: ifle            411
        //   375: aload_0        
        //   376: getfield        f7h.a:Lz7h;
        //   379: getfield        z7h.currentMonthCount:J
        //   382: lload           5
        //   384: lcmp           
        //   385: iflt            411
        //   388: ldc             " \u2716\ufe0e Did exceed maximum per month"
        //   390: invokestatic    ck1.r:(Ljava/lang/String;)V
        //   393: aload_0        
        //   394: getfield        f7h.d:Lqlj;
        //   397: getfield        qlj.i:Landroid/content/Context;
        //   400: ldc             "global_max_month"
        //   402: aconst_null    
        //   403: aconst_null    
        //   404: aconst_null    
        //   405: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //   408: goto            552
        //   411: iload           11
        //   413: ifle            455
        //   416: aload_0        
        //   417: getfield        f7h.a:Lz7h;
        //   420: getfield        z7h.currentWeekCount:J
        //   423: aload           4
        //   425: getfield        hnp$a.weekly:J
        //   428: lcmp           
        //   429: iflt            455
        //   432: ldc             " \u2716\ufe0e Did exceed maximum per week"
        //   434: invokestatic    ck1.r:(Ljava/lang/String;)V
        //   437: aload_0        
        //   438: getfield        f7h.d:Lqlj;
        //   441: getfield        qlj.i:Landroid/content/Context;
        //   444: ldc             "global_max_week"
        //   446: aconst_null    
        //   447: aconst_null    
        //   448: aconst_null    
        //   449: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //   452: goto            552
        //   455: aload           4
        //   457: getfield        hnp$a.daily:J
        //   460: lstore          5
        //   462: lload           5
        //   464: lconst_0       
        //   465: lcmp           
        //   466: ifle            505
        //   469: aload_0        
        //   470: getfield        f7h.a:Lz7h;
        //   473: getfield        z7h.currentDayCount:J
        //   476: lload           5
        //   478: lcmp           
        //   479: iflt            505
        //   482: ldc             " \u2716\ufe0e Did exceed maximum per day"
        //   484: invokestatic    ck1.r:(Ljava/lang/String;)V
        //   487: aload_0        
        //   488: getfield        f7h.d:Lqlj;
        //   491: getfield        qlj.i:Landroid/content/Context;
        //   494: ldc             "global_max_day"
        //   496: aconst_null    
        //   497: aconst_null    
        //   498: aconst_null    
        //   499: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //   502: goto            552
        //   505: aload           4
        //   507: getfield        hnp$a.hourly:J
        //   510: lstore          5
        //   512: lload           5
        //   514: lconst_0       
        //   515: lcmp           
        //   516: ifle            558
        //   519: aload_0        
        //   520: getfield        f7h.a:Lz7h;
        //   523: getfield        z7h.currentHourCount:J
        //   526: lload           5
        //   528: lcmp           
        //   529: iflt            558
        //   532: ldc             " \u2716\ufe0e Did exceed maximum per hour"
        //   534: invokestatic    ck1.r:(Ljava/lang/String;)V
        //   537: aload_0        
        //   538: getfield        f7h.d:Lqlj;
        //   541: getfield        qlj.i:Landroid/content/Context;
        //   544: ldc             "global_max_hour"
        //   546: aconst_null    
        //   547: aconst_null    
        //   548: aconst_null    
        //   549: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //   552: iconst_1       
        //   553: istore          11
        //   555: goto            561
        //   558: iconst_0       
        //   559: istore          11
        //   561: aload_0        
        //   562: getfield        f7h.d:Lqlj;
        //   565: getfield        qlj.a:Lhnp;
        //   568: astore          4
        //   570: invokestatic    java/lang/System.currentTimeMillis:()J
        //   573: aload_0        
        //   574: getfield        f7h.a:Lz7h;
        //   577: getfield        z7h.lastMessageDisplayed:J
        //   580: lsub           
        //   581: aload           4
        //   583: getfield        hnp.limits:Lhnp$a;
        //   586: getfield        hnp$a.triggerInterval:J
        //   589: lcmp           
        //   590: ifle            599
        //   593: iconst_1       
        //   594: istore          12
        //   596: goto            602
        //   599: iconst_0       
        //   600: istore          12
        //   602: aload_2        
        //   603: getfield        hnp.nightTime:Lhnp$b;
        //   606: getfield        hnp$b.enabled:Z
        //   609: ifeq            836
        //   612: aload_0        
        //   613: getfield        f7h.d:Lqlj;
        //   616: getfield        qlj.a:Lhnp;
        //   619: astore_2       
        //   620: aload_2        
        //   621: getfield        hnp.nightTime:Lhnp$b;
        //   624: getfield        hnp$b.start:Ljava/lang/String;
        //   627: ldc_w           ":"
        //   630: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   633: astore          4
        //   635: aload           4
        //   637: iconst_0       
        //   638: aaload         
        //   639: astore          9
        //   641: aload           9
        //   643: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   646: istore          13
        //   648: goto            656
        //   651: astore          9
        //   653: iconst_0       
        //   654: istore          13
        //   656: aload           4
        //   658: iconst_1       
        //   659: aaload         
        //   660: astore          4
        //   662: aload           4
        //   664: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   667: istore          14
        //   669: goto            677
        //   672: astore          4
        //   674: iconst_0       
        //   675: istore          14
        //   677: iload           13
        //   679: bipush          60
        //   681: imul           
        //   682: iload           14
        //   684: iadd           
        //   685: istore          15
        //   687: aload_2        
        //   688: getfield        hnp.nightTime:Lhnp$b;
        //   691: getfield        hnp$b.end:Ljava/lang/String;
        //   694: ldc_w           ":"
        //   697: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   700: astore_2       
        //   701: aload_2        
        //   702: iconst_0       
        //   703: aaload         
        //   704: astore          4
        //   706: aload           4
        //   708: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   711: istore          13
        //   713: goto            721
        //   716: astore          4
        //   718: iconst_0       
        //   719: istore          13
        //   721: aload_2        
        //   722: iconst_1       
        //   723: aaload         
        //   724: astore_2       
        //   725: aload_2        
        //   726: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   729: istore          14
        //   731: goto            738
        //   734: astore_2       
        //   735: iconst_0       
        //   736: istore          14
        //   738: iload           13
        //   740: bipush          60
        //   742: imul           
        //   743: iload           14
        //   745: iadd           
        //   746: istore          13
        //   748: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //   751: astore_2       
        //   752: aload_2        
        //   753: bipush          11
        //   755: invokevirtual   java/util/Calendar.get:(I)I
        //   758: istore          16
        //   760: aload_2        
        //   761: bipush          12
        //   763: invokevirtual   java/util/Calendar.get:(I)I
        //   766: istore          14
        //   768: iload           16
        //   770: bipush          60
        //   772: imul           
        //   773: iload           14
        //   775: iadd           
        //   776: istore          14
        //   778: iload           15
        //   780: iload           13
        //   782: if_icmple       802
        //   785: iload           14
        //   787: iload           15
        //   789: if_icmpge       816
        //   792: iload           14
        //   794: iload           13
        //   796: if_icmpge       822
        //   799: goto            816
        //   802: iload           14
        //   804: iload           15
        //   806: if_icmplt       822
        //   809: iload           14
        //   811: iload           13
        //   813: if_icmpgt       822
        //   816: iconst_1       
        //   817: istore          13
        //   819: goto            825
        //   822: iconst_0       
        //   823: istore          13
        //   825: iload           13
        //   827: ifeq            836
        //   830: iconst_1       
        //   831: istore          13
        //   833: goto            839
        //   836: iconst_0       
        //   837: istore          13
        //   839: aload_3        
        //   840: invokevirtual   java/util/ArrayList.listIterator:()Ljava/util/ListIterator;
        //   843: astore_2       
        //   844: aload_2        
        //   845: invokeinterface java/util/Iterator.hasNext:()Z
        //   850: ifeq            1681
        //   853: aload_2        
        //   854: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   859: checkcast       Lq7h;
        //   862: astore          4
        //   864: ldc_w           "Checking message "
        //   867: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   870: astore          9
        //   872: aload           9
        //   874: aload           4
        //   876: getfield        q7h.b:Ljava/lang/String;
        //   879: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   882: pop            
        //   883: aload           9
        //   885: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   888: invokestatic    ck1.p:(Ljava/lang/String;)V
        //   891: iload           11
        //   893: ifeq            925
        //   896: aload           4
        //   898: getfield        q7h.c:Ls5h;
        //   901: getfield        s5h.limits:Ls5h$c;
        //   904: getfield        s5h$c.ignoreGlobalLimits:Z
        //   907: ifne            925
        //   910: ldc_w           " \u2716\ufe0e [Global limits] Exceeded maximum number of messages displayed"
        //   913: invokestatic    ck1.q:(Ljava/lang/String;)V
        //   916: aload_2        
        //   917: invokeinterface java/util/Iterator.remove:()V
        //   922: goto            990
        //   925: iload           12
        //   927: ifne            959
        //   930: aload           4
        //   932: getfield        q7h.c:Ls5h;
        //   935: getfield        s5h.limits:Ls5h$c;
        //   938: getfield        s5h$c.ignoreGlobalLimits:Z
        //   941: ifne            959
        //   944: ldc_w           " \u2716\ufe0e [Global limits] Minimum time between triggered messages not respected"
        //   947: invokestatic    ck1.q:(Ljava/lang/String;)V
        //   950: aload_2        
        //   951: invokeinterface java/util/Iterator.remove:()V
        //   956: goto            990
        //   959: iload           13
        //   961: ifeq            993
        //   964: aload           4
        //   966: getfield        q7h.c:Ls5h;
        //   969: getfield        s5h.limits:Ls5h$c;
        //   972: getfield        s5h$c.ignoreNightTime:Z
        //   975: ifne            993
        //   978: ldc_w           " \u2716\ufe0e [Global limits] Night time is enabled and it appears to be night"
        //   981: invokestatic    ck1.q:(Ljava/lang/String;)V
        //   984: aload_2        
        //   985: invokeinterface java/util/Iterator.remove:()V
        //   990: goto            1678
        //   993: aload_1        
        //   994: invokevirtual   mjr.e:()J
        //   997: lstore          17
        //   999: aload           4
        //  1001: getfield        q7h.l:J
        //  1004: lstore          5
        //  1006: aload           4
        //  1008: getfield        q7h.c:Ls5h;
        //  1011: getfield        s5h.limits:Ls5h$c;
        //  1014: astore          9
        //  1016: aload           9
        //  1018: getfield        s5h$c.displays:J
        //  1021: lstore          7
        //  1023: lload           5
        //  1025: lload           7
        //  1027: lcmp           
        //  1028: iflt            1067
        //  1031: lload           7
        //  1033: lconst_0       
        //  1034: lcmp           
        //  1035: ifle            1067
        //  1038: ldc_w           " \u2716\ufe0e Message has reached its max display count"
        //  1041: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1044: aload_0        
        //  1045: getfield        f7h.d:Lqlj;
        //  1048: getfield        qlj.i:Landroid/content/Context;
        //  1051: ldc_w           "message_max_display"
        //  1054: aload           4
        //  1056: getfield        q7h.c:Ls5h;
        //  1059: aconst_null    
        //  1060: aconst_null    
        //  1061: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1064: goto            1168
        //  1067: lload           17
        //  1069: aload           4
        //  1071: getfield        q7h.q:J
        //  1074: lsub           
        //  1075: aload           9
        //  1077: getfield        s5h$c.displayInterval:J
        //  1080: lcmp           
        //  1081: ifge            1113
        //  1084: ldc_w           " \u2716\ufe0e Message delay after display is too short"
        //  1087: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1090: aload_0        
        //  1091: getfield        f7h.d:Lqlj;
        //  1094: getfield        qlj.i:Landroid/content/Context;
        //  1097: ldc_w           "message_interval_display"
        //  1100: aload           4
        //  1102: getfield        q7h.c:Ls5h;
        //  1105: aconst_null    
        //  1106: aconst_null    
        //  1107: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1110: goto            1168
        //  1113: aload           4
        //  1115: getfield        q7h.k:J
        //  1118: lstore          5
        //  1120: aload           9
        //  1122: getfield        s5h$c.clicks:J
        //  1125: lstore          7
        //  1127: lload           5
        //  1129: lload           7
        //  1131: lcmp           
        //  1132: iflt            1171
        //  1135: lload           7
        //  1137: lconst_0       
        //  1138: lcmp           
        //  1139: ifle            1171
        //  1142: ldc_w           " \u2716\ufe0e Message has reached its max click count"
        //  1145: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1148: aload_0        
        //  1149: getfield        f7h.d:Lqlj;
        //  1152: getfield        qlj.i:Landroid/content/Context;
        //  1155: ldc_w           "message_max_click"
        //  1158: aload           4
        //  1160: getfield        q7h.c:Ls5h;
        //  1163: aconst_null    
        //  1164: aconst_null    
        //  1165: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1168: goto            1441
        //  1171: lload           17
        //  1173: aload           4
        //  1175: getfield        q7h.p:J
        //  1178: lsub           
        //  1179: lstore          7
        //  1181: lload           7
        //  1183: aload           9
        //  1185: getfield        s5h$c.clickInterval:J
        //  1188: lcmp           
        //  1189: ifge            1221
        //  1192: ldc_w           " \u2716\ufe0e Message delay after click is too short"
        //  1195: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1198: aload_0        
        //  1199: getfield        f7h.d:Lqlj;
        //  1202: getfield        qlj.i:Landroid/content/Context;
        //  1205: ldc_w           "message_interval_click"
        //  1208: aload           4
        //  1210: getfield        q7h.c:Ls5h;
        //  1213: aconst_null    
        //  1214: aconst_null    
        //  1215: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1218: goto            1441
        //  1221: aload           4
        //  1223: getfield        q7h.m:J
        //  1226: lstore          19
        //  1228: aload           9
        //  1230: getfield        s5h$c.dismisses:J
        //  1233: lstore          21
        //  1235: lload           19
        //  1237: lload           21
        //  1239: lcmp           
        //  1240: iflt            1279
        //  1243: lload           21
        //  1245: lconst_0       
        //  1246: lcmp           
        //  1247: ifle            1279
        //  1250: ldc_w           " \u2716\ufe0e Message has reached its max dismiss count"
        //  1253: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1256: aload_0        
        //  1257: getfield        f7h.d:Lqlj;
        //  1260: getfield        qlj.i:Landroid/content/Context;
        //  1263: ldc_w           "message_max_dismiss"
        //  1266: aload           4
        //  1268: getfield        q7h.c:Ls5h;
        //  1271: aconst_null    
        //  1272: aconst_null    
        //  1273: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1276: goto            1441
        //  1279: lload           17
        //  1281: aload           4
        //  1283: getfield        q7h.r:J
        //  1286: lsub           
        //  1287: lstore          17
        //  1289: lload           17
        //  1291: aload           9
        //  1293: getfield        s5h$c.dismissInterval:J
        //  1296: lcmp           
        //  1297: ifge            1329
        //  1300: ldc_w           " \u2716\ufe0e Message delay after dismiss is too short"
        //  1303: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1306: aload_0        
        //  1307: getfield        f7h.d:Lqlj;
        //  1310: getfield        qlj.i:Landroid/content/Context;
        //  1313: ldc_w           "message_interval_dismiss"
        //  1316: aload           4
        //  1318: getfield        q7h.c:Ls5h;
        //  1321: aconst_null    
        //  1322: aconst_null    
        //  1323: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1326: goto            1441
        //  1329: aload           9
        //  1331: getfield        s5h$c.interactions:J
        //  1334: lstore          21
        //  1336: lload           5
        //  1338: lload           19
        //  1340: ladd           
        //  1341: lload           21
        //  1343: lcmp           
        //  1344: iflt            1383
        //  1347: lload           21
        //  1349: lconst_0       
        //  1350: lcmp           
        //  1351: ifle            1383
        //  1354: ldc_w           " \u2716\ufe0e Message has reached its max interaction count"
        //  1357: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1360: aload_0        
        //  1361: getfield        f7h.d:Lqlj;
        //  1364: getfield        qlj.i:Landroid/content/Context;
        //  1367: ldc_w           "message_max_interaction"
        //  1370: aload           4
        //  1372: getfield        q7h.c:Ls5h;
        //  1375: aconst_null    
        //  1376: aconst_null    
        //  1377: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1380: goto            1441
        //  1383: aload           9
        //  1385: getfield        s5h$c.interactionInterval:J
        //  1388: lstore          5
        //  1390: lload           7
        //  1392: lload           5
        //  1394: lcmp           
        //  1395: iflt            1415
        //  1398: lload           17
        //  1400: lload           5
        //  1402: lcmp           
        //  1403: ifge            1409
        //  1406: goto            1415
        //  1409: iconst_0       
        //  1410: istore          14
        //  1412: goto            1444
        //  1415: ldc_w           " \u2716\ufe0e Message delay after interaction is too short"
        //  1418: invokestatic    ck1.r:(Ljava/lang/String;)V
        //  1421: aload_0        
        //  1422: getfield        f7h.d:Lqlj;
        //  1425: getfield        qlj.i:Landroid/content/Context;
        //  1428: ldc_w           "message_interval_interaction"
        //  1431: aload           4
        //  1433: getfield        q7h.c:Ls5h;
        //  1436: aconst_null    
        //  1437: aconst_null    
        //  1438: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1441: iconst_1       
        //  1442: istore          14
        //  1444: iload           14
        //  1446: ifeq            1458
        //  1449: aload_2        
        //  1450: invokeinterface java/util/Iterator.remove:()V
        //  1455: goto            1678
        //  1458: aload           4
        //  1460: getfield        q7h.i:Z
        //  1463: ifeq            1481
        //  1466: ldc_w           " \u2716\ufe0e Waiting for display response"
        //  1469: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1472: aload_2        
        //  1473: invokeinterface java/util/Iterator.remove:()V
        //  1478: goto            1678
        //  1481: aload           4
        //  1483: getfield        q7h.c:Ls5h;
        //  1486: astore          9
        //  1488: aload           9
        //  1490: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1493: pop            
        //  1494: aload           9
        //  1496: aload_1        
        //  1497: invokevirtual   s5h.a:(Lmjr;)Z
        //  1500: ifne            1506
        //  1503: goto            1550
        //  1506: aload           9
        //  1508: invokevirtual   s5h.c:()Ljava/util/List;
        //  1511: checkcast       Ljava/util/ArrayList;
        //  1514: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1517: astore          9
        //  1519: aload           9
        //  1521: invokeinterface java/util/Iterator.hasNext:()Z
        //  1526: ifeq            1556
        //  1529: aload           9
        //  1531: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1536: checkcast       Lwp1;
        //  1539: aload_1        
        //  1540: invokevirtual   wp1.b:(Lmjr;)Z
        //  1543: istore          23
        //  1545: iload           23
        //  1547: ifne            1519
        //  1550: iconst_0       
        //  1551: istore          14
        //  1553: goto            1559
        //  1556: iconst_1       
        //  1557: istore          14
        //  1559: iload           14
        //  1561: ifne            1579
        //  1564: ldc_w           " \u2716\ufe0e Signals not matching"
        //  1567: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1570: aload_2        
        //  1571: invokeinterface java/util/Iterator.remove:()V
        //  1576: goto            1678
        //  1579: aload_0        
        //  1580: getfield        f7h.d:Lqlj;
        //  1583: getfield        qlj.i:Landroid/content/Context;
        //  1586: aload           4
        //  1588: getfield        q7h.u:I
        //  1591: aload           4
        //  1593: getfield        q7h.v:Ljava/lang/String;
        //  1596: invokestatic    nvi.a:(Landroid/content/Context;ILjava/lang/String;)Z
        //  1599: ifeq            1617
        //  1602: ldc_w           " \u2716\ufe0e Notification already active"
        //  1605: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1608: aload_2        
        //  1609: invokeinterface java/util/Iterator.remove:()V
        //  1614: goto            1678
        //  1617: aload           4
        //  1619: getfield        q7h.h:J
        //  1622: lconst_0       
        //  1623: lcmp           
        //  1624: ifle            1642
        //  1627: ldc_w           " \u2716\ufe0e Message already scheduled"
        //  1630: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1633: aload_2        
        //  1634: invokeinterface java/util/Iterator.remove:()V
        //  1639: goto            1678
        //  1642: ldc_w           " \u2714\ufe0e Message "
        //  1645: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1648: astore          9
        //  1650: aload           9
        //  1652: aload           4
        //  1654: getfield        q7h.b:Ljava/lang/String;
        //  1657: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1660: pop            
        //  1661: aload           9
        //  1663: ldc_w           " matches current device signals"
        //  1666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1669: pop            
        //  1670: aload           9
        //  1672: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1675: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1678: goto            844
        //  1681: aload_3        
        //  1682: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1685: ifne            2101
        //  1688: ldc_w           "Number of messages matching: "
        //  1691: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1694: astore_2       
        //  1695: aload_2        
        //  1696: aload_3        
        //  1697: invokevirtual   java/util/ArrayList.size:()I
        //  1700: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1703: pop            
        //  1704: aload_2        
        //  1705: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1708: invokestatic    ck1.q:(Ljava/lang/String;)V
        //  1711: aload_3        
        //  1712: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1715: astore_3       
        //  1716: aload_3        
        //  1717: invokeinterface java/util/Iterator.hasNext:()Z
        //  1722: ifeq            2129
        //  1725: aload_3        
        //  1726: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1731: checkcast       Lq7h;
        //  1734: astore          4
        //  1736: aload           4
        //  1738: getfield        q7h.c:Ls5h;
        //  1741: getfield        s5h.delayAfterTrigger:J
        //  1744: lconst_0       
        //  1745: lcmp           
        //  1746: ifle            1841
        //  1749: ldc_w           "Message "
        //  1752: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1755: astore_2       
        //  1756: aload_2        
        //  1757: aload           4
        //  1759: getfield        q7h.b:Ljava/lang/String;
        //  1762: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1765: pop            
        //  1766: aload_2        
        //  1767: ldc_w           " scheduled"
        //  1770: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1773: pop            
        //  1774: aload_2        
        //  1775: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1778: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1781: aload           4
        //  1783: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1786: aload           4
        //  1788: getfield        q7h.c:Ls5h;
        //  1791: getfield        s5h.delayAfterTrigger:J
        //  1794: ladd           
        //  1795: putfield        q7h.h:J
        //  1798: aload_0        
        //  1799: getfield        f7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1802: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lo6h;
        //  1805: aload           4
        //  1807: invokeinterface o6h.i:(Lq7h;)V
        //  1812: aload_0        
        //  1813: getfield        f7h.d:Lqlj;
        //  1816: getfield        qlj.i:Landroid/content/Context;
        //  1819: ldc_w           "message_scheduled"
        //  1822: aload           4
        //  1824: getfield        q7h.c:Ls5h;
        //  1827: aload_1        
        //  1828: getfield        mjr.C0:Ljava/lang/Object;
        //  1831: checkcast       Lqu8;
        //  1834: aconst_null    
        //  1835: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1838: goto            1993
        //  1841: ldc_w           "Message "
        //  1844: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1847: astore_2       
        //  1848: aload_2        
        //  1849: aload           4
        //  1851: getfield        q7h.b:Ljava/lang/String;
        //  1854: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1857: pop            
        //  1858: aload_2        
        //  1859: ldc_w           " triggered"
        //  1862: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1865: pop            
        //  1866: aload_2        
        //  1867: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1870: invokestatic    ck1.p:(Ljava/lang/String;)V
        //  1873: aload           4
        //  1875: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1878: putfield        q7h.e:J
        //  1881: aload           4
        //  1883: lconst_0       
        //  1884: putfield        q7h.h:J
        //  1887: aload           4
        //  1889: aload           4
        //  1891: getfield        q7h.n:J
        //  1894: lconst_1       
        //  1895: ladd           
        //  1896: putfield        q7h.n:J
        //  1899: aload           4
        //  1901: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1904: putfield        q7h.s:J
        //  1907: aload           4
        //  1909: iconst_1       
        //  1910: putfield        q7h.i:Z
        //  1913: aload           4
        //  1915: iconst_0       
        //  1916: putfield        q7h.u:I
        //  1919: aload           4
        //  1921: aconst_null    
        //  1922: putfield        q7h.v:Ljava/lang/String;
        //  1925: aload           4
        //  1927: aload           4
        //  1929: getfield        q7h.c:Ls5h;
        //  1932: invokevirtual   s5h.b:()J
        //  1935: putfield        q7h.f:J
        //  1938: aload_0        
        //  1939: getfield        f7h.b:Lcom/openback/db/message/MessageDatabase;
        //  1942: invokevirtual   com/openback/db/message/MessageDatabase.s:()Lo6h;
        //  1945: aload           4
        //  1947: invokeinterface o6h.i:(Lq7h;)V
        //  1952: aload_0        
        //  1953: getfield        f7h.d:Lqlj;
        //  1956: getfield        qlj.i:Landroid/content/Context;
        //  1959: aload           4
        //  1961: getfield        q7h.c:Ls5h;
        //  1964: invokestatic    slj.e:(Landroid/content/Context;Ls5h;)V
        //  1967: aload_0        
        //  1968: getfield        f7h.d:Lqlj;
        //  1971: getfield        qlj.i:Landroid/content/Context;
        //  1974: ldc_w           "message_triggered"
        //  1977: aload           4
        //  1979: getfield        q7h.c:Ls5h;
        //  1982: aload_1        
        //  1983: getfield        mjr.C0:Ljava/lang/Object;
        //  1986: checkcast       Lqu8;
        //  1989: aconst_null    
        //  1990: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  1993: aload_0        
        //  1994: getfield        f7h.d:Lqlj;
        //  1997: getfield        qlj.c:Lvb8;
        //  2000: astore_2       
        //  2001: aload           4
        //  2003: getfield        q7h.c:Ls5h;
        //  2006: astore          4
        //  2008: aload_2        
        //  2009: getfield        vb8.b:Z
        //  2012: ifne            2018
        //  2015: goto            1716
        //  2018: aload           4
        //  2020: invokevirtual   s5h.c:()Ljava/util/List;
        //  2023: checkcast       Ljava/util/ArrayList;
        //  2026: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2029: astore          4
        //  2031: aload           4
        //  2033: invokeinterface java/util/Iterator.hasNext:()Z
        //  2038: ifeq            1716
        //  2041: aload           4
        //  2043: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2048: checkcast       Lwp1;
        //  2051: astore          10
        //  2053: aload_2        
        //  2054: aload           10
        //  2056: invokevirtual   wp1.d:()I
        //  2059: invokevirtual   vb8.c:(I)Lp6q;
        //  2062: astore          9
        //  2064: aload           9
        //  2066: aload           10
        //  2068: aload           9
        //  2070: getfield        p6q.d:Ljava/lang/String;
        //  2073: invokevirtual   wp1.a:(Ljava/lang/String;)Ljava/lang/String;
        //  2076: putfield        p6q.d:Ljava/lang/String;
        //  2079: aload_2        
        //  2080: getfield        vb8.a:Lcom/openback/db/decisions/DecisionsDatabase;
        //  2083: invokevirtual   com/openback/db/decisions/DecisionsDatabase.s:()Ln6q;
        //  2086: aload           9
        //  2088: invokeinterface n6q.c:(Lp6q;)V
        //  2093: goto            2031
        //  2096: astore          9
        //  2098: goto            2031
        //  2101: ldc_w           "No messages match current device signals"
        //  2104: invokestatic    ck1.q:(Ljava/lang/String;)V
        //  2107: aload_0        
        //  2108: getfield        f7h.d:Lqlj;
        //  2111: getfield        qlj.i:Landroid/content/Context;
        //  2114: ldc_w           "message_none_triggered"
        //  2117: aconst_null    
        //  2118: aload_1        
        //  2119: getfield        mjr.C0:Ljava/lang/Object;
        //  2122: checkcast       Lqu8;
        //  2125: aconst_null    
        //  2126: invokestatic    bp7.z:(Landroid/content/Context;Ljava/lang/String;Ls5h;Lqu8;Ljava/lang/String;)V
        //  2129: return         
        //  2130: astore_2       
        //  2131: goto            822
        //  2134: astore          9
        //  2136: goto            1556
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  620    635    2130   2134   Ljava/lang/Exception;
        //  641    648    651    656    Ljava/lang/Exception;
        //  662    669    672    677    Ljava/lang/Exception;
        //  687    701    2130   2134   Ljava/lang/Exception;
        //  706    713    716    721    Ljava/lang/Exception;
        //  725    731    734    738    Ljava/lang/Exception;
        //  748    768    2130   2134   Ljava/lang/Exception;
        //  1494   1503   2134   2139   Ljava/lang/Exception;
        //  1506   1519   2134   2139   Ljava/lang/Exception;
        //  1519   1545   2134   2139   Ljava/lang/Exception;
        //  2053   2093   2096   2101   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1506:
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
    
    public final void b(final Iterable<s5h> iterable) {
        final ArrayList list = new ArrayList();
        for (final s5h c : iterable) {
            q7h f;
            if ((f = this.b.s().f(c.messageId)) == null) {
                f = new q7h(c.messageId);
                f.d = System.currentTimeMillis();
            }
            if (c.limits == null) {
                c.limits = new s5h$c();
            }
            if (c.signals == null) {
                c.signals = new s5h$d();
            }
            f.c = c;
            f.e = System.currentTimeMillis();
            f.f = c.b();
            final s5h$d signals = c.signals;
            long n;
            if (signals.unlock != null) {
                n = 8589934592L;
            }
            else {
                n = 0L;
            }
            long n2 = n;
            if (signals.airplane != null) {
                n2 = (n | 0x400000000L);
            }
            long n3 = 0L;
            Label_0218: {
                if (signals.batteryChargingStatus == null) {
                    n3 = n2;
                    if (signals.batteryChargingType == null) {
                        break Label_0218;
                    }
                }
                n3 = (n2 | 0x800000000L);
            }
            long n4 = n3;
            if (signals.wifi != null) {
                n4 = (n3 | 0x1000000000L);
            }
            long n5 = n4;
            if (signals.dataConnection != null) {
                n5 = (n4 | 0x2000000000L);
            }
            long n6 = n5;
            if (signals.headphones != null) {
                n6 = (n5 | 0x4000000000L);
            }
            long g = n6;
            if (signals.orientationDisplay != null) {
                g = (n6 | 0x8000000000L);
            }
            f.g = g;
            list.add(f);
        }
        this.b.s().k((List)list);
    }
    
    public final void c() {
        this.d.f.f("message_stats", new Gson().h((Object)this.a));
    }
    
    public final void d() {
        final List l = this.b.s().l();
        this.c = 0L;
        final Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            this.c |= (long)iterator.next();
        }
        this.d.f.e(this.c);
        uud.a(this.d.i, this.c >> 32);
        this.a.lastMessageChecked = 0L;
        this.d.a(new ws4("messages_check"));
    }
}
