import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poy
{
    public static final v3a g;
    public final byte[] a;
    public final tjy b;
    public final dqy<l000> c;
    public final dqy<qiy> d;
    public final cqy e;
    public final jxy f;
    
    static {
        g = new v3a("ExtractChunkTaskHandler");
    }
    
    public poy(final tjy b, final dqy<l000> c, final dqy<qiy> d, final cqy e, final jxy f) {
        this.a = new byte[8192];
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final moy p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        poy.b:Ltjy;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        spe.D0:Ljava/lang/Object;
        //     9: checkcast       Ljava/lang/String;
        //    12: astore_3       
        //    13: aload_1        
        //    14: getfield        moy.E0:I
        //    17: istore          4
        //    19: aload_1        
        //    20: getfield        moy.F0:J
        //    23: lstore          5
        //    25: aload_1        
        //    26: getfield        moy.H0:Ljava/lang/String;
        //    29: astore          7
        //    31: new             Lgzy;
        //    34: dup            
        //    35: aload_2        
        //    36: aload_3        
        //    37: iload           4
        //    39: lload           5
        //    41: aload           7
        //    43: invokespecial   gzy.<init>:(Ltjy;Ljava/lang/String;IJLjava/lang/String;)V
        //    46: astore          8
        //    48: aload_2        
        //    49: aload_3        
        //    50: iload           4
        //    52: lload           5
        //    54: aload           7
        //    56: invokevirtual   tjy.r:(Ljava/lang/String;IJLjava/lang/String;)Ljava/io/File;
        //    59: astore_2       
        //    60: aload_2        
        //    61: invokevirtual   java/io/File.exists:()Z
        //    64: ifne            72
        //    67: aload_2        
        //    68: invokevirtual   java/io/File.mkdirs:()Z
        //    71: pop            
        //    72: aload_1        
        //    73: getfield        moy.N0:Ljava/io/InputStream;
        //    76: astore_2       
        //    77: aload_1        
        //    78: getfield        moy.I0:I
        //    81: iconst_1       
        //    82: if_icmpeq       88
        //    85: goto            100
        //    88: new             Ljava/util/zip/GZIPInputStream;
        //    91: dup            
        //    92: aload_2        
        //    93: sipush          8192
        //    96: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;I)V
        //    99: astore_2       
        //   100: aload_1        
        //   101: getfield        moy.J0:I
        //   104: ifle            747
        //   107: aload           8
        //   109: invokevirtual   gzy.b:()Lbzy;
        //   112: astore          7
        //   114: aload           7
        //   116: checkcast       Lyky;
        //   119: getfield        yky.e:I
        //   122: istore          4
        //   124: aload_1        
        //   125: getfield        moy.J0:I
        //   128: istore          9
        //   130: iload           4
        //   132: iload           9
        //   134: iconst_1       
        //   135: isub           
        //   136: if_icmpne       699
        //   139: aload           7
        //   141: checkcast       Lyky;
        //   144: getfield        yky.a:I
        //   147: istore          4
        //   149: iload           4
        //   151: iconst_1       
        //   152: if_icmpeq       463
        //   155: iload           4
        //   157: iconst_2       
        //   158: if_icmpeq       337
        //   161: iload           4
        //   163: iconst_3       
        //   164: if_icmpne       297
        //   167: getstatic       poy.g:Lv3a;
        //   170: ldc             "Resuming central directory from last chunk."
        //   172: iconst_0       
        //   173: anewarray       Ljava/lang/Object;
        //   176: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   179: pop            
        //   180: aload           7
        //   182: checkcast       Lyky;
        //   185: getfield        yky.c:J
        //   188: lstore          5
        //   190: aload           8
        //   192: invokevirtual   gzy.c:()Ljava/io/File;
        //   195: astore_3       
        //   196: new             Ljava/io/RandomAccessFile;
        //   199: astore          7
        //   201: aload           7
        //   203: aload_3        
        //   204: ldc             "rw"
        //   206: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   209: aload           7
        //   211: lload           5
        //   213: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   216: aload_2        
        //   217: aload           8
        //   219: getfield        gzy.a:[B
        //   222: invokevirtual   java/io/InputStream.read:([B)I
        //   225: istore          4
        //   227: iload           4
        //   229: ifle            245
        //   232: aload           7
        //   234: aload           8
        //   236: getfield        gzy.a:[B
        //   239: iconst_0       
        //   240: iload           4
        //   242: invokevirtual   java/io/RandomAccessFile.write:([BII)V
        //   245: iload           4
        //   247: sipush          8192
        //   250: if_icmpeq       216
        //   253: aload           7
        //   255: invokevirtual   java/io/RandomAccessFile.close:()V
        //   258: aload_1        
        //   259: invokevirtual   moy.f:()Z
        //   262: ifeq            268
        //   265: goto            674
        //   268: new             Lkpy;
        //   271: astore          7
        //   273: aload           7
        //   275: ldc             "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
        //   277: aload_1        
        //   278: getfield        spe.C0:I
        //   281: invokespecial   kpy.<init>:(Ljava/lang/String;I)V
        //   284: aload           7
        //   286: athrow         
        //   287: astore          8
        //   289: aload           7
        //   291: invokevirtual   java/io/RandomAccessFile.close:()V
        //   294: aload           8
        //   296: athrow         
        //   297: new             Lkpy;
        //   300: astore          8
        //   302: aload           8
        //   304: ldc             "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
        //   306: iconst_1       
        //   307: anewarray       Ljava/lang/Object;
        //   310: dup            
        //   311: iconst_0       
        //   312: aload           7
        //   314: checkcast       Lyky;
        //   317: getfield        yky.a:I
        //   320: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   323: aastore        
        //   324: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   327: aload_1        
        //   328: getfield        spe.C0:I
        //   331: invokespecial   kpy.<init>:(Ljava/lang/String;I)V
        //   334: aload           8
        //   336: athrow         
        //   337: getstatic       poy.g:Lv3a;
        //   340: ldc             "Resuming zip entry from last chunk during local file header."
        //   342: iconst_0       
        //   343: anewarray       Ljava/lang/Object;
        //   346: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   349: pop            
        //   350: aload_0        
        //   351: getfield        poy.b:Ltjy;
        //   354: astore          10
        //   356: aload_1        
        //   357: getfield        spe.D0:Ljava/lang/Object;
        //   360: checkcast       Ljava/lang/String;
        //   363: astore          11
        //   365: aload_1        
        //   366: getfield        moy.E0:I
        //   369: istore          4
        //   371: aload_1        
        //   372: getfield        moy.F0:J
        //   375: lstore          5
        //   377: aload_1        
        //   378: getfield        moy.H0:Ljava/lang/String;
        //   381: astore_3       
        //   382: aload           10
        //   384: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   387: pop            
        //   388: new             Ljava/io/File;
        //   391: astore          7
        //   393: aload           7
        //   395: aload           10
        //   397: aload           11
        //   399: iload           4
        //   401: lload           5
        //   403: aload_3        
        //   404: invokevirtual   tjy.r:(Ljava/lang/String;IJLjava/lang/String;)Ljava/io/File;
        //   407: ldc             "checkpoint_ext.dat"
        //   409: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   412: aload           7
        //   414: invokevirtual   java/io/File.exists:()Z
        //   417: ifeq            444
        //   420: new             Ljava/io/FileInputStream;
        //   423: astore_3       
        //   424: aload_3        
        //   425: aload           7
        //   427: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   430: new             Ljava/io/SequenceInputStream;
        //   433: dup            
        //   434: aload_3        
        //   435: aload_2        
        //   436: invokespecial   java/io/SequenceInputStream.<init>:(Ljava/io/InputStream;Ljava/io/InputStream;)V
        //   439: astore          7
        //   441: goto            750
        //   444: new             Lkpy;
        //   447: astore          7
        //   449: aload           7
        //   451: ldc             "Checkpoint extension file not found."
        //   453: aload_1        
        //   454: getfield        spe.C0:I
        //   457: invokespecial   kpy.<init>:(Ljava/lang/String;I)V
        //   460: aload           7
        //   462: athrow         
        //   463: getstatic       poy.g:Lv3a;
        //   466: ldc             "Resuming zip entry from last chunk during file %s."
        //   468: iconst_1       
        //   469: anewarray       Ljava/lang/Object;
        //   472: dup            
        //   473: iconst_0       
        //   474: aload           7
        //   476: checkcast       Lyky;
        //   479: getfield        yky.b:Ljava/lang/String;
        //   482: aastore        
        //   483: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   486: pop            
        //   487: new             Ljava/io/File;
        //   490: astore_3       
        //   491: aload_3        
        //   492: aload           7
        //   494: checkcast       Lyky;
        //   497: getfield        yky.b:Ljava/lang/String;
        //   500: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   503: aload_3        
        //   504: invokevirtual   java/io/File.exists:()Z
        //   507: ifeq            680
        //   510: new             Ljava/io/RandomAccessFile;
        //   513: astore          10
        //   515: aload           10
        //   517: aload_3        
        //   518: ldc             "rw"
        //   520: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   523: aload           10
        //   525: aload           7
        //   527: checkcast       Lyky;
        //   530: getfield        yky.c:J
        //   533: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   536: aload           7
        //   538: checkcast       Lyky;
        //   541: getfield        yky.d:J
        //   544: lstore          5
        //   546: lload           5
        //   548: ldc2_w          8192
        //   551: invokestatic    java/lang/Math.min:(JJ)J
        //   554: l2i            
        //   555: istore          4
        //   557: aload_2        
        //   558: aload_0        
        //   559: getfield        poy.a:[B
        //   562: iconst_0       
        //   563: iload           4
        //   565: invokevirtual   java/io/InputStream.read:([BII)I
        //   568: iconst_0       
        //   569: invokestatic    java/lang/Math.max:(II)I
        //   572: istore          9
        //   574: iload           9
        //   576: ifle            591
        //   579: aload           10
        //   581: aload_0        
        //   582: getfield        poy.a:[B
        //   585: iconst_0       
        //   586: iload           9
        //   588: invokevirtual   java/io/RandomAccessFile.write:([BII)V
        //   591: lload           5
        //   593: iload           9
        //   595: i2l            
        //   596: lsub           
        //   597: lstore          5
        //   599: lload           5
        //   601: lconst_0       
        //   602: lcmp           
        //   603: ifle            617
        //   606: iload           9
        //   608: ifgt            614
        //   611: goto            617
        //   614: goto            546
        //   617: aload           10
        //   619: invokevirtual   java/io/RandomAccessFile.length:()J
        //   622: lstore          12
        //   624: aload           10
        //   626: invokevirtual   java/io/RandomAccessFile.close:()V
        //   629: iload           9
        //   631: iload           4
        //   633: if_icmpeq       747
        //   636: getstatic       poy.g:Lv3a;
        //   639: ldc             "Chunk has ended while resuming the previous chunks file content."
        //   641: iconst_0       
        //   642: anewarray       Ljava/lang/Object;
        //   645: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   648: pop            
        //   649: aload_3        
        //   650: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   653: astore          7
        //   655: aload_1        
        //   656: getfield        moy.J0:I
        //   659: istore          4
        //   661: aload           8
        //   663: aload           7
        //   665: lload           12
        //   667: lload           5
        //   669: iload           4
        //   671: invokevirtual   gzy.f:(Ljava/lang/String;JJI)V
        //   674: aconst_null    
        //   675: astore          7
        //   677: goto            750
        //   680: new             Lkpy;
        //   683: astore          7
        //   685: aload           7
        //   687: ldc             "Partial file specified in checkpoint does not exist. Corrupt directory."
        //   689: aload_1        
        //   690: getfield        spe.C0:I
        //   693: invokespecial   kpy.<init>:(Ljava/lang/String;I)V
        //   696: aload           7
        //   698: athrow         
        //   699: new             Lkpy;
        //   702: astore          8
        //   704: aload           8
        //   706: ldc             "Trying to resume with chunk number %s when previously processed chunk was number %s."
        //   708: iconst_2       
        //   709: anewarray       Ljava/lang/Object;
        //   712: dup            
        //   713: iconst_0       
        //   714: iload           9
        //   716: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   719: aastore        
        //   720: dup            
        //   721: iconst_1       
        //   722: aload           7
        //   724: checkcast       Lyky;
        //   727: getfield        yky.e:I
        //   730: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   733: aastore        
        //   734: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   737: aload_1        
        //   738: getfield        spe.C0:I
        //   741: invokespecial   kpy.<init>:(Ljava/lang/String;I)V
        //   744: aload           8
        //   746: athrow         
        //   747: aload_2        
        //   748: astore          7
        //   750: aload           7
        //   752: ifnull          1220
        //   755: new             Lzly;
        //   758: astore_3       
        //   759: aload_3        
        //   760: aload           7
        //   762: invokespecial   zly.<init>:(Ljava/io/InputStream;)V
        //   765: aload_0        
        //   766: aload_1        
        //   767: invokevirtual   poy.b:(Lmoy;)Ljava/io/File;
        //   770: astore          11
        //   772: aload_3        
        //   773: invokevirtual   zly.a:()Lh0z;
        //   776: astore          10
        //   778: aload           10
        //   780: checkcast       Lcly;
        //   783: getfield        cly.d:Z
        //   786: ifne            936
        //   789: aload_3        
        //   790: getfield        zly.G0:Z
        //   793: ifne            936
        //   796: aload           10
        //   798: invokevirtual   h0z.h:()Z
        //   801: ifeq            922
        //   804: aload           10
        //   806: invokevirtual   h0z.g:()Z
        //   809: ifne            922
        //   812: aload           8
        //   814: aload           10
        //   816: checkcast       Lcly;
        //   819: getfield        cly.f:[B
        //   822: invokevirtual   gzy.i:([B)V
        //   825: new             Ljava/io/File;
        //   828: astore          14
        //   830: aload           14
        //   832: aload           11
        //   834: aload           10
        //   836: checkcast       Lcly;
        //   839: getfield        cly.a:Ljava/lang/String;
        //   842: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   845: aload           14
        //   847: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   850: invokevirtual   java/io/File.mkdirs:()Z
        //   853: pop            
        //   854: new             Ljava/io/FileOutputStream;
        //   857: astore          15
        //   859: aload           15
        //   861: aload           14
        //   863: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   866: aload_3        
        //   867: aload_0        
        //   868: getfield        poy.a:[B
        //   871: iconst_0       
        //   872: sipush          8192
        //   875: invokevirtual   zly.read:([BII)I
        //   878: istore          4
        //   880: iload           4
        //   882: ifle            914
        //   885: aload           15
        //   887: aload_0        
        //   888: getfield        poy.a:[B
        //   891: iconst_0       
        //   892: iload           4
        //   894: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   897: aload_3        
        //   898: aload_0        
        //   899: getfield        poy.a:[B
        //   902: iconst_0       
        //   903: sipush          8192
        //   906: invokevirtual   zly.read:([BII)I
        //   909: istore          4
        //   911: goto            880
        //   914: aload           15
        //   916: invokevirtual   java/io/FileOutputStream.close:()V
        //   919: goto            936
        //   922: aload           8
        //   924: aload           10
        //   926: checkcast       Lcly;
        //   929: getfield        cly.f:[B
        //   932: aload_3        
        //   933: invokevirtual   gzy.j:([BLjava/io/InputStream;)V
        //   936: aload_3        
        //   937: getfield        zly.F0:Z
        //   940: ifne            950
        //   943: aload_3        
        //   944: getfield        zly.G0:Z
        //   947: ifeq            772
        //   950: aload_3        
        //   951: getfield        zly.G0:Z
        //   954: ifeq            986
        //   957: getstatic       poy.g:Lv3a;
        //   960: ldc_w           "Writing central directory metadata."
        //   963: iconst_0       
        //   964: anewarray       Ljava/lang/Object;
        //   967: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   970: pop            
        //   971: aload           8
        //   973: aload           10
        //   975: checkcast       Lcly;
        //   978: getfield        cly.f:[B
        //   981: aload           7
        //   983: invokevirtual   gzy.j:([BLjava/io/InputStream;)V
        //   986: aload_1        
        //   987: invokevirtual   moy.f:()Z
        //   990: ifne            1220
        //   993: aload           10
        //   995: checkcast       Lcly;
        //   998: getfield        cly.d:Z
        //  1001: ifeq            1038
        //  1004: getstatic       poy.g:Lv3a;
        //  1007: ldc_w           "Writing slice checkpoint for partial local file header."
        //  1010: iconst_0       
        //  1011: anewarray       Ljava/lang/Object;
        //  1014: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1017: pop            
        //  1018: aload           8
        //  1020: aload           10
        //  1022: checkcast       Lcly;
        //  1025: getfield        cly.f:[B
        //  1028: aload_1        
        //  1029: getfield        moy.J0:I
        //  1032: invokevirtual   gzy.g:([BI)V
        //  1035: goto            1220
        //  1038: aload_3        
        //  1039: getfield        zly.G0:Z
        //  1042: ifeq            1071
        //  1045: getstatic       poy.g:Lv3a;
        //  1048: ldc_w           "Writing slice checkpoint for central directory."
        //  1051: iconst_0       
        //  1052: anewarray       Ljava/lang/Object;
        //  1055: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1058: pop            
        //  1059: aload           8
        //  1061: aload_1        
        //  1062: getfield        moy.J0:I
        //  1065: invokevirtual   gzy.e:(I)V
        //  1068: goto            1220
        //  1071: aload           10
        //  1073: checkcast       Lcly;
        //  1076: getfield        cly.c:I
        //  1079: ifne            1164
        //  1082: getstatic       poy.g:Lv3a;
        //  1085: ldc_w           "Writing slice checkpoint for partial file."
        //  1088: iconst_0       
        //  1089: anewarray       Ljava/lang/Object;
        //  1092: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1095: pop            
        //  1096: new             Ljava/io/File;
        //  1099: astore          7
        //  1101: aload           7
        //  1103: aload_0        
        //  1104: aload_1        
        //  1105: invokevirtual   poy.b:(Lmoy;)Ljava/io/File;
        //  1108: aload           10
        //  1110: checkcast       Lcly;
        //  1113: getfield        cly.a:Ljava/lang/String;
        //  1116: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1119: aload           10
        //  1121: checkcast       Lcly;
        //  1124: getfield        cly.b:J
        //  1127: aload_3        
        //  1128: getfield        zly.E0:J
        //  1131: lsub           
        //  1132: lstore          5
        //  1134: aload           7
        //  1136: invokevirtual   java/io/File.length:()J
        //  1139: lload           5
        //  1141: lcmp           
        //  1142: ifne            1148
        //  1145: goto            1192
        //  1148: new             Lkpy;
        //  1151: astore          7
        //  1153: aload           7
        //  1155: ldc_w           "Partial file is of unexpected size."
        //  1158: invokespecial   kpy.<init>:(Ljava/lang/String;)V
        //  1161: aload           7
        //  1163: athrow         
        //  1164: getstatic       poy.g:Lv3a;
        //  1167: ldc_w           "Writing slice checkpoint for partial unextractable file."
        //  1170: iconst_0       
        //  1171: anewarray       Ljava/lang/Object;
        //  1174: invokevirtual   v3a.i:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1177: pop            
        //  1178: aload           8
        //  1180: invokevirtual   gzy.c:()Ljava/io/File;
        //  1183: astore          7
        //  1185: aload           7
        //  1187: invokevirtual   java/io/File.length:()J
        //  1190: lstore          5
        //  1192: aload           8
        //  1194: aload           7
        //  1196: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //  1199: lload           5
        //  1201: aload_3        
        //  1202: getfield        zly.E0:J
        //  1205: aload_1        
        //  1206: getfield        moy.J0:I
        //  1209: invokevirtual   gzy.f:(Ljava/lang/String;JJI)V
        //  1212: goto            1220
        //  1215: astore          7
        //  1217: goto            1558
        //  1220: aload_2        
        //  1221: invokevirtual   java/io/InputStream.close:()V
        //  1224: aload_1        
        //  1225: invokevirtual   moy.f:()Z
        //  1228: ifeq            1281
        //  1231: aload           8
        //  1233: aload_1        
        //  1234: getfield        moy.J0:I
        //  1237: invokevirtual   gzy.h:(I)V
        //  1240: goto            1281
        //  1243: astore_2       
        //  1244: getstatic       poy.g:Lv3a;
        //  1247: ldc_w           "Writing extraction finished checkpoint failed with %s."
        //  1250: iconst_1       
        //  1251: anewarray       Ljava/lang/Object;
        //  1254: dup            
        //  1255: iconst_0       
        //  1256: aload_2        
        //  1257: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1260: aastore        
        //  1261: invokevirtual   v3a.k:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1264: pop            
        //  1265: new             Lkpy;
        //  1268: dup            
        //  1269: ldc_w           "Writing extraction finished checkpoint failed."
        //  1272: aload_2        
        //  1273: aload_1        
        //  1274: getfield        spe.C0:I
        //  1277: invokespecial   kpy.<init>:(Ljava/lang/String;Ljava/lang/Exception;I)V
        //  1280: athrow         
        //  1281: getstatic       poy.g:Lv3a;
        //  1284: ldc_w           "Extraction finished for chunk %s of slice %s of pack %s of session %s."
        //  1287: iconst_4       
        //  1288: anewarray       Ljava/lang/Object;
        //  1291: dup            
        //  1292: iconst_0       
        //  1293: aload_1        
        //  1294: getfield        moy.J0:I
        //  1297: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1300: aastore        
        //  1301: dup            
        //  1302: iconst_1       
        //  1303: aload_1        
        //  1304: getfield        moy.H0:Ljava/lang/String;
        //  1307: aastore        
        //  1308: dup            
        //  1309: iconst_2       
        //  1310: aload_1        
        //  1311: getfield        spe.D0:Ljava/lang/Object;
        //  1314: checkcast       Ljava/lang/String;
        //  1317: aastore        
        //  1318: dup            
        //  1319: iconst_3       
        //  1320: aload_1        
        //  1321: getfield        spe.C0:I
        //  1324: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1327: aastore        
        //  1328: invokevirtual   v3a.n:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1331: pop            
        //  1332: aload_0        
        //  1333: getfield        poy.c:Ldqy;
        //  1336: invokeinterface dqy.a:()Ljava/lang/Object;
        //  1341: checkcast       Ll000;
        //  1344: aload_1        
        //  1345: getfield        spe.C0:I
        //  1348: aload_1        
        //  1349: getfield        spe.D0:Ljava/lang/Object;
        //  1352: checkcast       Ljava/lang/String;
        //  1355: aload_1        
        //  1356: getfield        moy.H0:Ljava/lang/String;
        //  1359: aload_1        
        //  1360: getfield        moy.J0:I
        //  1363: invokeinterface l000.e:(ILjava/lang/String;Ljava/lang/String;I)V
        //  1368: aload_1        
        //  1369: getfield        moy.N0:Ljava/io/InputStream;
        //  1372: invokevirtual   java/io/InputStream.close:()V
        //  1375: goto            1420
        //  1378: astore_2       
        //  1379: getstatic       poy.g:Lv3a;
        //  1382: ldc_w           "Could not close file for chunk %s of slice %s of pack %s."
        //  1385: iconst_3       
        //  1386: anewarray       Ljava/lang/Object;
        //  1389: dup            
        //  1390: iconst_0       
        //  1391: aload_1        
        //  1392: getfield        moy.J0:I
        //  1395: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1398: aastore        
        //  1399: dup            
        //  1400: iconst_1       
        //  1401: aload_1        
        //  1402: getfield        moy.H0:Ljava/lang/String;
        //  1405: aastore        
        //  1406: dup            
        //  1407: iconst_2       
        //  1408: aload_1        
        //  1409: getfield        spe.D0:Ljava/lang/Object;
        //  1412: checkcast       Ljava/lang/String;
        //  1415: aastore        
        //  1416: invokevirtual   v3a.o:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1419: pop            
        //  1420: aload_1        
        //  1421: getfield        moy.M0:I
        //  1424: iconst_3       
        //  1425: if_icmpne       1555
        //  1428: aload_0        
        //  1429: getfield        poy.d:Ldqy;
        //  1432: invokeinterface dqy.a:()Ljava/lang/Object;
        //  1437: checkcast       Lqiy;
        //  1440: astore          7
        //  1442: aload_1        
        //  1443: getfield        spe.D0:Ljava/lang/Object;
        //  1446: checkcast       Ljava/lang/String;
        //  1449: astore          8
        //  1451: aload_1        
        //  1452: getfield        moy.L0:J
        //  1455: lstore          5
        //  1457: aload_0        
        //  1458: getfield        poy.e:Lcqy;
        //  1461: astore_2       
        //  1462: aload_2        
        //  1463: monitorenter   
        //  1464: aload_1        
        //  1465: getfield        moy.J0:I
        //  1468: i2d            
        //  1469: dconst_1       
        //  1470: dadd           
        //  1471: aload_1        
        //  1472: getfield        moy.K0:I
        //  1475: i2d            
        //  1476: ddiv           
        //  1477: dstore          16
        //  1479: aload_2        
        //  1480: getfield        cqy.a:Ljava/util/HashMap;
        //  1483: aload           8
        //  1485: dload           16
        //  1487: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1490: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1493: pop            
        //  1494: aload_2        
        //  1495: monitorexit    
        //  1496: aload           8
        //  1498: iconst_3       
        //  1499: iconst_0       
        //  1500: lload           5
        //  1502: lload           5
        //  1504: dload           16
        //  1506: iconst_1       
        //  1507: aload_1        
        //  1508: getfield        moy.G0:Ljava/lang/String;
        //  1511: aload_0        
        //  1512: getfield        poy.f:Ljxy;
        //  1515: aload_1        
        //  1516: getfield        spe.D0:Ljava/lang/Object;
        //  1519: checkcast       Ljava/lang/String;
        //  1522: invokevirtual   jxy.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1525: invokestatic    com/google/android/play/core/assetpacks/AssetPackState.h:(Ljava/lang/String;IIJJDILjava/lang/String;Ljava/lang/String;)Lcom/google/android/play/core/assetpacks/AssetPackState;
        //  1528: astore_1       
        //  1529: aload           7
        //  1531: getfield        qiy.o:Landroid/os/Handler;
        //  1534: new             Lixz;
        //  1537: dup            
        //  1538: aload           7
        //  1540: aload_1        
        //  1541: iconst_5       
        //  1542: invokespecial   ixz.<init>:(Ljava/lang/Object;Ljava/lang/Object;I)V
        //  1545: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //  1548: pop            
        //  1549: return         
        //  1550: astore_1       
        //  1551: aload_2        
        //  1552: monitorexit    
        //  1553: aload_1        
        //  1554: athrow         
        //  1555: return         
        //  1556: astore          7
        //  1558: aload_2        
        //  1559: invokevirtual   java/io/InputStream.close:()V
        //  1562: aload           7
        //  1564: athrow         
        //  1565: astore_2       
        //  1566: getstatic       poy.g:Lv3a;
        //  1569: ldc_w           "IOException during extraction %s."
        //  1572: iconst_1       
        //  1573: anewarray       Ljava/lang/Object;
        //  1576: dup            
        //  1577: iconst_0       
        //  1578: aload_2        
        //  1579: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1582: aastore        
        //  1583: invokevirtual   v3a.k:(Ljava/lang/String;[Ljava/lang/Object;)I
        //  1586: pop            
        //  1587: new             Lkpy;
        //  1590: dup            
        //  1591: ldc_w           "Error extracting chunk %s of slice %s of pack %s of session %s."
        //  1594: iconst_4       
        //  1595: anewarray       Ljava/lang/Object;
        //  1598: dup            
        //  1599: iconst_0       
        //  1600: aload_1        
        //  1601: getfield        moy.J0:I
        //  1604: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1607: aastore        
        //  1608: dup            
        //  1609: iconst_1       
        //  1610: aload_1        
        //  1611: getfield        moy.H0:Ljava/lang/String;
        //  1614: aastore        
        //  1615: dup            
        //  1616: iconst_2       
        //  1617: aload_1        
        //  1618: getfield        spe.D0:Ljava/lang/Object;
        //  1621: checkcast       Ljava/lang/String;
        //  1624: aastore        
        //  1625: dup            
        //  1626: iconst_3       
        //  1627: aload_1        
        //  1628: getfield        spe.C0:I
        //  1631: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1634: aastore        
        //  1635: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1638: aload_2        
        //  1639: aload_1        
        //  1640: getfield        spe.C0:I
        //  1643: invokespecial   kpy.<init>:(Ljava/lang/String;Ljava/lang/Exception;I)V
        //  1646: athrow         
        //  1647: astore          7
        //  1649: goto            294
        //  1652: astore_2       
        //  1653: goto            1562
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  72     85     1565   1647   Ljava/io/IOException;
        //  88     100    1565   1647   Ljava/io/IOException;
        //  100    130    1556   1558   Any
        //  139    149    1556   1558   Any
        //  167    209    1556   1558   Any
        //  209    216    287    297    Any
        //  216    227    287    297    Any
        //  232    245    287    297    Any
        //  253    265    1556   1558   Any
        //  268    287    1556   1558   Any
        //  289    294    1647   1652   Any
        //  294    297    1556   1558   Any
        //  297    337    1556   1558   Any
        //  337    441    1556   1558   Any
        //  444    463    1556   1558   Any
        //  463    546    1556   1558   Any
        //  546    574    1556   1558   Any
        //  579    591    1556   1558   Any
        //  617    629    1556   1558   Any
        //  636    661    1556   1558   Any
        //  661    674    1215   1220   Any
        //  680    699    1215   1220   Any
        //  699    747    1215   1220   Any
        //  755    772    1215   1220   Any
        //  772    880    1215   1220   Any
        //  885    911    1215   1220   Any
        //  914    919    1215   1220   Any
        //  922    936    1215   1220   Any
        //  936    950    1215   1220   Any
        //  950    986    1215   1220   Any
        //  986    1035   1215   1220   Any
        //  1038   1068   1215   1220   Any
        //  1071   1145   1215   1220   Any
        //  1148   1164   1215   1220   Any
        //  1164   1192   1215   1220   Any
        //  1192   1212   1215   1220   Any
        //  1220   1224   1565   1647   Ljava/io/IOException;
        //  1231   1240   1243   1281   Ljava/io/IOException;
        //  1368   1375   1378   1420   Ljava/io/IOException;
        //  1464   1494   1550   1555   Any
        //  1558   1562   1652   1656   Any
        //  1562   1565   1565   1647   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 787, Size: 787
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
    
    public final File b(final moy moy) {
        final File s = this.b.s((String)moy.D0, moy.E0, moy.F0, moy.H0);
        if (!s.exists()) {
            s.mkdirs();
        }
        return s;
    }
}
