import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ro8 extends i1v<pmi>
{
    public static final ro8.ro8$a Companion;
    public static final tba o1;
    public final Context i1;
    public final long j1;
    public final long k1;
    public final boolean l1;
    public final aav m1;
    public final String n1;
    
    static {
        Companion = new ro8.ro8$a();
        o1 = (tba)sba.Companion.b("app", "twitter_service", "retweet", "delete");
    }
    
    public ro8(final Context context, final UserIdentifier userIdentifier, final long n, final long n2, final boolean b) {
        zzd.f((Object)context, "context");
        zzd.f((Object)userIdentifier, "userIdentifier");
        this(context, userIdentifier, n, n2, b, null, 32, null);
    }
    
    public ro8(final Context i1, UserIdentifier p8, final long j1, final long k1, final boolean l1, aav d2, final int n, final hg8 hg8) {
        d2 = aav.d2(p8);
        zzd.e((Object)d2, "get(userIdentifier)");
        zzd.f((Object)i1, "context");
        zzd.f((Object)p8, "userIdentifier");
        super(p8, 0);
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = d2;
        final cum$a companion = cum.Companion;
        p8 = super.P0;
        zzd.e((Object)p8, "owner");
        this.n1 = companion.b(j1, p8);
        ((cw0)this).I();
        ((cw0)this).G((ysm)new jdi());
        ((j1p$a)this.Y()).a.J0 = (sba)ro8.o1;
    }
    
    public final void C(final tsc<pmi, pav> tsc) {
        zzd.f((Object)tsc, "result");
        this.o0(tsc);
    }
    
    public final Runnable d(final cw0<?> cw0) {
        if (cw0 != null) {
            cw0.H(true);
        }
        return (Runnable)new o20((Object)this, 7);
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("delete_retweet");
        e.p("source_tweet_id", String.valueOf(this.j1));
        return (qrc)e.e();
    }
    
    @Override
    public final wsc g0() {
        return (wsc)new mhe();
    }
    
    @Override
    public final boolean l0(final tsc<pmi, pav> tsc) {
        zzd.f((Object)tsc, "result");
        return zi8.H(tsc);
    }
    
    public final void o0(final tsc<?, ?> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "result"
        //     3: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: aload_0        
        //     8: getfield        ro8.i1:Landroid/content/Context;
        //    11: invokevirtual   kmm.Z:(Landroid/content/Context;)Lhn6;
        //    14: astore_2       
        //    15: aload_0        
        //    16: getfield        kmm.P0:Lcom/twitter/util/user/UserIdentifier;
        //    19: invokevirtual   com/twitter/util/user/UserIdentifier.getId:()J
        //    22: lstore_3       
        //    23: aload_1        
        //    24: getfield        tsc.b:Z
        //    27: ifeq            974
        //    30: aload_0        
        //    31: getfield        ro8.k1:J
        //    34: lload_3        
        //    35: lcmp           
        //    36: ifne            45
        //    39: iconst_1       
        //    40: istore          5
        //    42: goto            48
        //    45: iconst_0       
        //    46: istore          5
        //    48: aload_0        
        //    49: getfield        ro8.m1:Laav;
        //    52: astore          6
        //    54: aload_0        
        //    55: getfield        ro8.j1:J
        //    58: lstore          7
        //    60: aload_0        
        //    61: getfield        ro8.l1:Z
        //    64: istore          9
        //    66: aload           6
        //    68: invokevirtual   tk1.H2:()Ltyr;
        //    71: astore          10
        //    73: aload           10
        //    75: invokeinterface tyr.H0:()V
        //    80: iload           5
        //    82: ifne            434
        //    85: aload           6
        //    87: invokevirtual   rp1.T:()Ldwo;
        //    90: checkcast       Lcom/twitter/database/schema/TwitterSchema;
        //    93: ldc             Lfrs;.class
        //    95: invokeinterface dwo.f:(Ljava/lang/Class;)Lalq;
        //   100: checkcast       Lfrs;
        //   103: invokeinterface alq.c:()Lglq;
        //   108: astore_1       
        //   109: new             Lzrl$a;
        //   112: astore          11
        //   114: aload           11
        //   116: invokespecial   zrl$a.<init>:()V
        //   119: ldc             "owner_id"
        //   121: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   124: astore          12
        //   126: aload           11
        //   128: iconst_4       
        //   129: anewarray       Ljava/lang/String;
        //   132: dup            
        //   133: iconst_0       
        //   134: aload           12
        //   136: aastore        
        //   137: dup            
        //   138: iconst_1       
        //   139: ldc_w           "data_type"
        //   142: iconst_1       
        //   143: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   146: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   149: aastore        
        //   150: dup            
        //   151: iconst_2       
        //   152: ldc_w           "data_id"
        //   155: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   158: aastore        
        //   159: dup            
        //   160: iconst_3       
        //   161: ldc_w           "type"
        //   164: iconst_2       
        //   165: anewarray       Ljava/lang/Integer;
        //   168: dup            
        //   169: iconst_0       
        //   170: bipush          27
        //   172: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   175: aastore        
        //   176: dup            
        //   177: iconst_1       
        //   178: bipush          28
        //   180: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   183: aastore        
        //   184: invokestatic    tsl.h:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   187: aastore        
        //   188: invokestatic    tsl.a:([Ljava/lang/String;)Ljava/lang/String;
        //   191: iconst_2       
        //   192: anewarray       Ljava/lang/Object;
        //   195: dup            
        //   196: iconst_0       
        //   197: lload_3        
        //   198: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   201: aastore        
        //   202: dup            
        //   203: iconst_1       
        //   204: lload           7
        //   206: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   209: aastore        
        //   210: invokevirtual   jp1$a.t:(Ljava/lang/String;[Ljava/lang/Object;)Ljp1$a;
        //   213: pop            
        //   214: aload_1        
        //   215: aload           11
        //   217: invokevirtual   h4j.e:()Ljava/lang/Object;
        //   220: checkcast       Lzrl;
        //   223: invokeinterface glq.e:(Lzrl;)Lj0m;
        //   228: astore_1       
        //   229: aload_1        
        //   230: invokevirtual   j0m.getCount:()I
        //   233: ifle            392
        //   236: aload_1        
        //   237: invokevirtual   j0m.moveToFirst:()Z
        //   240: ifeq            392
        //   243: iconst_0       
        //   244: istore          13
        //   246: aload_1        
        //   247: invokevirtual   j0m.a:()Ljava/lang/Object;
        //   250: checkcast       Lfrs$a;
        //   253: invokeinterface frs$a.f:()Ljava/lang/String;
        //   258: astore          12
        //   260: aload           6
        //   262: invokevirtual   rp1.T:()Ldwo;
        //   265: checkcast       Lcom/twitter/database/schema/TwitterSchema;
        //   268: ldc_w           Ly8t;.class
        //   271: invokeinterface dwo.b:(Ljava/lang/Class;)Lilq;
        //   276: astore          14
        //   278: ldc             "owner_id"
        //   280: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   283: astore          15
        //   285: ldc_w           "entity_id"
        //   288: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   291: astore          11
        //   293: iload           13
        //   295: aload           14
        //   297: iconst_3       
        //   298: anewarray       Ljava/lang/String;
        //   301: dup            
        //   302: iconst_0       
        //   303: aload           15
        //   305: aastore        
        //   306: dup            
        //   307: iconst_1       
        //   308: aload           11
        //   310: aastore        
        //   311: dup            
        //   312: iconst_2       
        //   313: ldc_w           "type"
        //   316: iconst_2       
        //   317: anewarray       Ljava/lang/Integer;
        //   320: dup            
        //   321: iconst_0       
        //   322: bipush          27
        //   324: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   327: aastore        
        //   328: dup            
        //   329: iconst_1       
        //   330: bipush          28
        //   332: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   335: aastore        
        //   336: invokestatic    tsl.h:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   339: aastore        
        //   340: invokestatic    tsl.a:([Ljava/lang/String;)Ljava/lang/String;
        //   343: iconst_2       
        //   344: anewarray       Ljava/lang/Object;
        //   347: dup            
        //   348: iconst_0       
        //   349: lload_3        
        //   350: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   353: aastore        
        //   354: dup            
        //   355: iconst_1       
        //   356: aload           12
        //   358: aastore        
        //   359: invokeinterface ilq.d:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   364: iadd           
        //   365: istore          13
        //   367: aload_1        
        //   368: invokevirtual   j0m.moveToNext:()Z
        //   371: istore          16
        //   373: iload           16
        //   375: ifne            389
        //   378: iload           13
        //   380: istore          17
        //   382: iload           5
        //   384: istore          13
        //   386: goto            399
        //   389: goto            246
        //   392: iconst_0       
        //   393: istore          17
        //   395: iload           5
        //   397: istore          13
        //   399: aload_1        
        //   400: invokevirtual   j0m.close:()V
        //   403: iload           17
        //   405: istore          5
        //   407: goto            580
        //   410: astore_2       
        //   411: aload_1        
        //   412: ifnull          428
        //   415: aload_1        
        //   416: invokevirtual   j0m.close:()V
        //   419: goto            428
        //   422: astore_1       
        //   423: aload_2        
        //   424: aload_1        
        //   425: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   428: aload_2        
        //   429: athrow         
        //   430: astore_1       
        //   431: goto            965
        //   434: aload           6
        //   436: invokevirtual   rp1.T:()Ldwo;
        //   439: checkcast       Lcom/twitter/database/schema/TwitterSchema;
        //   442: ldc_w           Ly8t;.class
        //   445: invokeinterface dwo.b:(Ljava/lang/Class;)Lilq;
        //   450: bipush          6
        //   452: anewarray       Ljava/lang/String;
        //   455: dup            
        //   456: iconst_0       
        //   457: ldc             "owner_id"
        //   459: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   462: aastore        
        //   463: dup            
        //   464: iconst_1       
        //   465: ldc_w           "sender_id"
        //   468: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   471: aastore        
        //   472: dup            
        //   473: iconst_2       
        //   474: ldc_w           "data_type"
        //   477: iconst_1       
        //   478: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   481: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   484: aastore        
        //   485: dup            
        //   486: iconst_3       
        //   487: ldc_w           "data_id"
        //   490: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   493: aastore        
        //   494: dup            
        //   495: iconst_4       
        //   496: ldc_w           "flags"
        //   499: bipush          64
        //   501: invokestatic    tsl.f:(Ljava/lang/String;I)Ljava/lang/String;
        //   504: aastore        
        //   505: dup            
        //   506: iconst_5       
        //   507: ldc_w           "type"
        //   510: iconst_2       
        //   511: anewarray       Ljava/lang/Integer;
        //   514: dup            
        //   515: iconst_0       
        //   516: bipush          27
        //   518: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   521: aastore        
        //   522: dup            
        //   523: iconst_1       
        //   524: bipush          28
        //   526: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   529: aastore        
        //   530: invokestatic    tsl.h:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   533: aastore        
        //   534: invokestatic    tsl.a:([Ljava/lang/String;)Ljava/lang/String;
        //   537: iconst_3       
        //   538: anewarray       Ljava/lang/Object;
        //   541: dup            
        //   542: iconst_0       
        //   543: lload_3        
        //   544: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   547: aastore        
        //   548: dup            
        //   549: iconst_1       
        //   550: lload_3        
        //   551: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   554: aastore        
        //   555: dup            
        //   556: iconst_2       
        //   557: lload           7
        //   559: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   562: aastore        
        //   563: invokeinterface ilq.d:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   568: iconst_0       
        //   569: iadd           
        //   570: istore          17
        //   572: iload           5
        //   574: istore          13
        //   576: iload           17
        //   578: istore          5
        //   580: aload           10
        //   582: astore          12
        //   584: aload_2        
        //   585: astore_1       
        //   586: aload           6
        //   588: invokevirtual   rp1.T:()Ldwo;
        //   591: checkcast       Lcom/twitter/database/schema/TwitterSchema;
        //   594: ldc_w           Lv8t;.class
        //   597: invokeinterface dwo.f:(Ljava/lang/Class;)Lalq;
        //   602: checkcast       Lv8t;
        //   605: invokeinterface alq.c:()Lglq;
        //   610: astore          11
        //   612: new             Lzrl$a;
        //   615: astore_2       
        //   616: aload_2        
        //   617: invokespecial   zrl$a.<init>:()V
        //   620: aload_2        
        //   621: iconst_4       
        //   622: anewarray       Ljava/lang/String;
        //   625: dup            
        //   626: iconst_0       
        //   627: ldc_w           "timeline_owner_id"
        //   630: lload_3        
        //   631: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   634: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   637: aastore        
        //   638: dup            
        //   639: iconst_1       
        //   640: ldc_w           "timeline_type"
        //   643: bipush          17
        //   645: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   648: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   651: aastore        
        //   652: dup            
        //   653: iconst_2       
        //   654: ldc_w           "timeline_data_type"
        //   657: iconst_1       
        //   658: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   661: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   664: aastore        
        //   665: dup            
        //   666: iconst_3       
        //   667: ldc_w           "timeline_data_id"
        //   670: lload           7
        //   672: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   675: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   678: aastore        
        //   679: invokestatic    tsl.a:([Ljava/lang/String;)Ljava/lang/String;
        //   682: invokevirtual   jp1$a.s:(Ljava/lang/String;)Ljp1$a;
        //   685: pop            
        //   686: aload           11
        //   688: aload_2        
        //   689: invokevirtual   h4j.e:()Ljava/lang/Object;
        //   692: checkcast       Lzrl;
        //   695: invokeinterface glq.e:(Lzrl;)Lj0m;
        //   700: astore_2       
        //   701: aload_2        
        //   702: invokevirtual   j0m.getCount:()I
        //   705: iconst_1       
        //   706: if_icmpne       733
        //   709: aload_2        
        //   710: invokevirtual   j0m.moveToFirst:()Z
        //   713: ifeq            733
        //   716: aload_2        
        //   717: invokevirtual   j0m.a:()Ljava/lang/Object;
        //   720: checkcast       Lv8t$a;
        //   723: invokeinterface frs$a.m:()J
        //   728: lstore          18
        //   730: goto            738
        //   733: ldc2_w          -1
        //   736: lstore          18
        //   738: aload_2        
        //   739: invokevirtual   j0m.close:()V
        //   742: lload           18
        //   744: lload_3        
        //   745: lcmp           
        //   746: ifne            755
        //   749: iconst_1       
        //   750: istore          17
        //   752: goto            758
        //   755: iconst_0       
        //   756: istore          17
        //   758: iload           13
        //   760: ifne            782
        //   763: iload           9
        //   765: ifne            782
        //   768: iload           17
        //   770: ifne            776
        //   773: goto            782
        //   776: iconst_0       
        //   777: istore          17
        //   779: goto            785
        //   782: iconst_1       
        //   783: istore          17
        //   785: iload           5
        //   787: istore          13
        //   789: iload           17
        //   791: ifne            893
        //   794: iload           5
        //   796: aload           6
        //   798: invokevirtual   rp1.T:()Ldwo;
        //   801: checkcast       Lcom/twitter/database/schema/TwitterSchema;
        //   804: ldc_w           Ly8t;.class
        //   807: invokeinterface dwo.b:(Ljava/lang/Class;)Lilq;
        //   812: iconst_4       
        //   813: anewarray       Ljava/lang/String;
        //   816: dup            
        //   817: iconst_0       
        //   818: ldc             "owner_id"
        //   820: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   823: aastore        
        //   824: dup            
        //   825: iconst_1       
        //   826: ldc_w           "data_type"
        //   829: iconst_1       
        //   830: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   833: invokestatic    tsl.b:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   836: aastore        
        //   837: dup            
        //   838: iconst_2       
        //   839: ldc_w           "data_id"
        //   842: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   845: aastore        
        //   846: dup            
        //   847: iconst_3       
        //   848: ldc_w           "type"
        //   851: invokestatic    tsl.c:(Ljava/lang/String;)Ljava/lang/String;
        //   854: aastore        
        //   855: invokestatic    tsl.a:([Ljava/lang/String;)Ljava/lang/String;
        //   858: iconst_3       
        //   859: anewarray       Ljava/lang/Object;
        //   862: dup            
        //   863: iconst_0       
        //   864: lload_3        
        //   865: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   868: aastore        
        //   869: dup            
        //   870: iconst_1       
        //   871: lload           7
        //   873: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   876: aastore        
        //   877: dup            
        //   878: iconst_2       
        //   879: bipush          17
        //   881: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   884: aastore        
        //   885: invokeinterface ilq.d:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   890: iadd           
        //   891: istore          13
        //   893: aload           6
        //   895: invokevirtual   aav.q0:()I
        //   898: pop            
        //   899: aload           12
        //   901: invokeinterface tyr.A:()V
        //   906: aload           12
        //   908: invokeinterface tyr.B:()V
        //   913: iload           13
        //   915: ifle            941
        //   918: getstatic       gfv.f:[Landroid/net/Uri;
        //   921: astore          10
        //   923: aload_1        
        //   924: astore_2       
        //   925: aload_2        
        //   926: aload           10
        //   928: invokevirtual   hn6.a:([Landroid/net/Uri;)V
        //   931: aload_2        
        //   932: getstatic       gfv.e:[Landroid/net/Uri;
        //   935: invokevirtual   hn6.a:([Landroid/net/Uri;)V
        //   938: goto            941
        //   941: goto            990
        //   944: astore_1       
        //   945: aload_2        
        //   946: ifnull          962
        //   949: aload_2        
        //   950: invokevirtual   j0m.close:()V
        //   953: goto            962
        //   956: astore_2       
        //   957: aload_1        
        //   958: aload_2        
        //   959: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   962: aload_1        
        //   963: athrow         
        //   964: astore_1       
        //   965: aload           10
        //   967: invokeinterface tyr.B:()V
        //   972: aload_1        
        //   973: athrow         
        //   974: aload_0        
        //   975: getfield        ro8.m1:Laav;
        //   978: aload_0        
        //   979: getfield        ro8.j1:J
        //   982: iconst_1       
        //   983: aload_2        
        //   984: invokevirtual   aav.f4:(JZLhn6;)I
        //   987: pop            
        //   988: aload_2        
        //   989: astore_1       
        //   990: aload_1        
        //   991: invokevirtual   hn6.b:()V
        //   994: return         
        //    Signature:
        //  (Ltsc<**>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  85     126    430    434    Any
        //  126    229    964    965    Any
        //  229    243    410    430    Any
        //  246    278    410    430    Any
        //  278    293    410    430    Any
        //  293    373    410    430    Any
        //  399    403    964    965    Any
        //  415    419    422    428    Any
        //  423    428    964    965    Any
        //  428    430    964    965    Any
        //  434    572    964    965    Any
        //  586    701    964    965    Any
        //  701    730    944    964    Any
        //  738    742    964    965    Any
        //  794    893    964    965    Any
        //  893    906    964    965    Any
        //  949    953    956    962    Any
        //  957    962    964    965    Any
        //  962    964    964    965    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0246:
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
    
    public final String s() {
        return this.n1;
    }
}
