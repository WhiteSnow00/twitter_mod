import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout$b;
import java.util.HashSet;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oi6 extends qox
{
    public bdf A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public co3[] F0;
    public co3[] G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public WeakReference<ei6> K0;
    public WeakReference<ei6> L0;
    public WeakReference<ei6> M0;
    public WeakReference<ei6> N0;
    public HashSet<ni6> O0;
    public fs1$a P0;
    public fs1 v0;
    public so8 w0;
    public int x0;
    public fs1$b y0;
    public boolean z0;
    
    public oi6() {
        this.v0 = new fs1(this);
        this.w0 = new so8(this);
        this.y0 = null;
        this.z0 = false;
        this.A0 = new bdf();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new co3[4];
        this.G0 = new co3[4];
        this.H0 = 257;
        this.I0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new HashSet<ni6>();
        this.P0 = new fs1$a();
    }
    
    public static boolean k0(final ni6 ni6, final fs1$b fs1$b, final fs1$a fs1$a) {
        final ni6$a e0 = ni6$a.E0;
        final ni6$a d0 = ni6$a.D0;
        if (fs1$b == null) {
            return false;
        }
        if (ni6.i0 != 8 && !(ni6 instanceof bac) && !(ni6 instanceof ni1)) {
            final ni6$a[] u = ni6.U;
            fs1$a.a = u[0];
            fs1$a.b = u[1];
            fs1$a.c = ni6.x();
            fs1$a.d = ni6.q();
            fs1$a.i = false;
            fs1$a.j = 0;
            final ni6$a a = fs1$a.a;
            final ni6$a f0 = ni6$a.F0;
            final boolean b = a == f0;
            final boolean b2 = fs1$a.b == f0;
            final boolean b3 = b && ni6.Y > 0.0f;
            final boolean b4 = b2 && ni6.Y > 0.0f;
            int n;
            if ((n = (b ? 1 : 0)) != 0) {
                n = (b ? 1 : 0);
                if (ni6.A(0)) {
                    n = (b ? 1 : 0);
                    if (ni6.r == 0) {
                        n = (b ? 1 : 0);
                        if (!b3) {
                            fs1$a.a = e0;
                            if (b2 && ni6.s == 0) {
                                fs1$a.a = d0;
                            }
                            n = 0;
                        }
                    }
                }
            }
            boolean b5;
            if (b5 = b2) {
                b5 = b2;
                if (ni6.A(1)) {
                    b5 = b2;
                    if (ni6.s == 0) {
                        b5 = b2;
                        if (!b4) {
                            fs1$a.b = e0;
                            if (n != 0 && ni6.r == 0) {
                                fs1$a.b = d0;
                            }
                            b5 = false;
                        }
                    }
                }
            }
            if (ni6.H()) {
                fs1$a.a = d0;
                n = 0;
            }
            if (ni6.I()) {
                fs1$a.b = d0;
                b5 = false;
            }
            if (b3) {
                if (ni6.t[0] == 4) {
                    fs1$a.a = d0;
                }
                else if (!b5) {
                    int n2;
                    if (fs1$a.b == d0) {
                        n2 = fs1$a.d;
                    }
                    else {
                        fs1$a.a = e0;
                        ((ConstraintLayout$b)fs1$b).b(ni6, fs1$a);
                        n2 = fs1$a.f;
                    }
                    fs1$a.a = d0;
                    fs1$a.c = (int)(ni6.Y * n2);
                }
            }
            if (b4) {
                if (ni6.t[1] == 4) {
                    fs1$a.b = d0;
                }
                else if (n == 0) {
                    int n3;
                    if (fs1$a.a == d0) {
                        n3 = fs1$a.c;
                    }
                    else {
                        fs1$a.b = e0;
                        ((ConstraintLayout$b)fs1$b).b(ni6, fs1$a);
                        n3 = fs1$a.e;
                    }
                    fs1$a.b = d0;
                    if (ni6.Z == -1) {
                        fs1$a.d = (int)(n3 / ni6.Y);
                    }
                    else {
                        fs1$a.d = (int)(ni6.Y * n3);
                    }
                }
            }
            ((ConstraintLayout$b)fs1$b).b(ni6, fs1$a);
            ni6.X(fs1$a.e);
            ni6.S(fs1$a.f);
            ni6.E = fs1$a.h;
            ni6.P(fs1$a.g);
            fs1$a.j = 0;
            return fs1$a.i;
        }
        fs1$a.e = 0;
        fs1$a.f = 0;
        return false;
    }
    
    public final void J() {
        this.A0.u();
        this.B0 = 0;
        this.C0 = 0;
        super.J();
    }
    
    public final void Y(final boolean b, final boolean b2) {
        super.Y(b, b2);
        for (int size = super.u0.size(), i = 0; i < size; ++i) {
            ((ni6)super.u0.get(i)).Y(b, b2);
        }
    }
    
    public final void a0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          24
        //     5: getstatic       ni6$a.E0:Lni6$a;
        //     8: astore          17
        //    10: getstatic       ni6$a.D0:Lni6$a;
        //    13: astore          16
        //    15: iconst_0       
        //    16: istore          6
        //    18: aload_0        
        //    19: iconst_0       
        //    20: putfield        ni6.a0:I
        //    23: aload_0        
        //    24: iconst_0       
        //    25: putfield        ni6.b0:I
        //    28: aload_0        
        //    29: iconst_0       
        //    30: putfield        oi6.I0:Z
        //    33: aload_0        
        //    34: iconst_0       
        //    35: putfield        oi6.J0:Z
        //    38: aload_0        
        //    39: getfield        qox.u0:Ljava/util/ArrayList;
        //    42: invokevirtual   java/util/ArrayList.size:()I
        //    45: istore          4
        //    47: iload           4
        //    49: istore_3       
        //    50: iconst_0       
        //    51: aload_0        
        //    52: invokevirtual   ni6.x:()I
        //    55: invokestatic    java/lang/Math.max:(II)I
        //    58: istore_2       
        //    59: iconst_0       
        //    60: aload_0        
        //    61: invokevirtual   ni6.q:()I
        //    64: invokestatic    java/lang/Math.max:(II)I
        //    67: istore_1       
        //    68: aload_0        
        //    69: getfield        ni6.U:[Lni6$a;
        //    72: astore          18
        //    74: aload           18
        //    76: iconst_1       
        //    77: aaload         
        //    78: astore          15
        //    80: aload           18
        //    82: iconst_0       
        //    83: aaload         
        //    84: astore          22
        //    86: aload_0        
        //    87: getfield        oi6.x0:I
        //    90: ifne            1224
        //    93: aload_0        
        //    94: getfield        oi6.H0:I
        //    97: iconst_1       
        //    98: invokestatic    snj.b:(II)Z
        //   101: ifeq            1224
        //   104: aload_0        
        //   105: getfield        oi6.y0:Lfs1$b;
        //   108: astore          19
        //   110: aload_0        
        //   111: getfield        ni6.U:[Lni6$a;
        //   114: astore          20
        //   116: aload           20
        //   118: iconst_0       
        //   119: aaload         
        //   120: astore          18
        //   122: aload           20
        //   124: iconst_1       
        //   125: aaload         
        //   126: astore          21
        //   128: aload_0        
        //   129: invokevirtual   ni6.L:()V
        //   132: aload_0        
        //   133: getfield        qox.u0:Ljava/util/ArrayList;
        //   136: astore          20
        //   138: aload           20
        //   140: invokevirtual   java/util/ArrayList.size:()I
        //   143: istore          10
        //   145: iconst_0       
        //   146: istore          5
        //   148: iload           5
        //   150: iload           10
        //   152: if_icmpge       174
        //   155: aload           20
        //   157: iload           5
        //   159: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   162: checkcast       Lni6;
        //   165: invokevirtual   ni6.L:()V
        //   168: iinc            5, 1
        //   171: goto            148
        //   174: aload_0        
        //   175: getfield        oi6.z0:Z
        //   178: istore          13
        //   180: aload           18
        //   182: aload           16
        //   184: if_acmpne       199
        //   187: aload_0        
        //   188: iconst_0       
        //   189: aload_0        
        //   190: invokevirtual   ni6.x:()I
        //   193: invokevirtual   ni6.Q:(II)V
        //   196: goto            212
        //   199: aload_0        
        //   200: getfield        ni6.J:Lei6;
        //   203: iconst_0       
        //   204: invokevirtual   ei6.m:(I)V
        //   207: aload_0        
        //   208: iconst_0       
        //   209: putfield        ni6.a0:I
        //   212: iconst_0       
        //   213: istore          8
        //   215: iconst_0       
        //   216: istore          7
        //   218: iload           6
        //   220: istore          5
        //   222: iload           5
        //   224: iload           10
        //   226: if_icmpge       424
        //   229: aload           20
        //   231: iload           5
        //   233: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   236: checkcast       Lni6;
        //   239: astore          18
        //   241: aload           18
        //   243: instanceof      Lbac;
        //   246: ifeq            368
        //   249: aload           18
        //   251: checkcast       Lbac;
        //   254: astore          18
        //   256: iload           8
        //   258: istore          9
        //   260: iload           7
        //   262: istore          6
        //   264: aload           18
        //   266: getfield        bac.y0:I
        //   269: iconst_1       
        //   270: if_icmpne       410
        //   273: aload           18
        //   275: getfield        bac.v0:I
        //   278: istore          6
        //   280: iload           6
        //   282: iconst_m1      
        //   283: if_icmpeq       296
        //   286: aload           18
        //   288: iload           6
        //   290: invokevirtual   bac.a0:(I)V
        //   293: goto            358
        //   296: aload           18
        //   298: getfield        bac.w0:I
        //   301: iconst_m1      
        //   302: if_icmpeq       330
        //   305: aload_0        
        //   306: invokevirtual   ni6.H:()Z
        //   309: ifeq            330
        //   312: aload           18
        //   314: aload_0        
        //   315: invokevirtual   ni6.x:()I
        //   318: aload           18
        //   320: getfield        bac.w0:I
        //   323: isub           
        //   324: invokevirtual   bac.a0:(I)V
        //   327: goto            358
        //   330: aload_0        
        //   331: invokevirtual   ni6.H:()Z
        //   334: ifeq            358
        //   337: aload           18
        //   339: aload           18
        //   341: getfield        bac.u0:F
        //   344: aload_0        
        //   345: invokevirtual   ni6.x:()I
        //   348: i2f            
        //   349: fmul           
        //   350: ldc_w           0.5
        //   353: fadd           
        //   354: f2i            
        //   355: invokevirtual   bac.a0:(I)V
        //   358: iconst_1       
        //   359: istore          9
        //   361: iload           7
        //   363: istore          6
        //   365: goto            410
        //   368: iload           8
        //   370: istore          9
        //   372: iload           7
        //   374: istore          6
        //   376: aload           18
        //   378: instanceof      Lni1;
        //   381: ifeq            410
        //   384: iload           8
        //   386: istore          9
        //   388: iload           7
        //   390: istore          6
        //   392: aload           18
        //   394: checkcast       Lni1;
        //   397: invokevirtual   ni1.c0:()I
        //   400: ifne            410
        //   403: iconst_1       
        //   404: istore          6
        //   406: iload           8
        //   408: istore          9
        //   410: iinc            5, 1
        //   413: iload           9
        //   415: istore          8
        //   417: iload           6
        //   419: istore          7
        //   421: goto            222
        //   424: iload_2        
        //   425: istore          5
        //   427: iload_1        
        //   428: istore          6
        //   430: aload           15
        //   432: astore          18
        //   434: iload           8
        //   436: ifeq            501
        //   439: iconst_0       
        //   440: istore_1       
        //   441: iload_1        
        //   442: iload           10
        //   444: if_icmpge       501
        //   447: aload           20
        //   449: iload_1        
        //   450: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   453: checkcast       Lni6;
        //   456: astore          15
        //   458: aload           15
        //   460: instanceof      Lbac;
        //   463: ifeq            495
        //   466: aload           15
        //   468: checkcast       Lbac;
        //   471: astore          15
        //   473: aload           15
        //   475: getfield        bac.y0:I
        //   478: iconst_1       
        //   479: if_icmpne       495
        //   482: iconst_0       
        //   483: aload           15
        //   485: aload           19
        //   487: iload           13
        //   489: invokestatic    tw8.b:(ILni6;Lfs1$b;Z)V
        //   492: goto            495
        //   495: iinc            1, 1
        //   498: goto            441
        //   501: iconst_0       
        //   502: aload_0        
        //   503: aload           19
        //   505: iload           13
        //   507: invokestatic    tw8.b:(ILni6;Lfs1$b;Z)V
        //   510: iload           7
        //   512: ifeq            581
        //   515: iconst_0       
        //   516: istore_1       
        //   517: iload_1        
        //   518: iload           10
        //   520: if_icmpge       581
        //   523: aload           20
        //   525: iload_1        
        //   526: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   529: checkcast       Lni6;
        //   532: astore          15
        //   534: aload           15
        //   536: instanceof      Lni1;
        //   539: ifeq            575
        //   542: aload           15
        //   544: checkcast       Lni1;
        //   547: astore          15
        //   549: aload           15
        //   551: invokevirtual   ni1.c0:()I
        //   554: ifne            575
        //   557: aload           15
        //   559: invokevirtual   ni1.b0:()Z
        //   562: ifeq            575
        //   565: iconst_1       
        //   566: aload           15
        //   568: aload           19
        //   570: iload           13
        //   572: invokestatic    tw8.b:(ILni6;Lfs1$b;Z)V
        //   575: iinc            1, 1
        //   578: goto            517
        //   581: aload           21
        //   583: aload           16
        //   585: if_acmpne       600
        //   588: aload_0        
        //   589: iconst_0       
        //   590: aload_0        
        //   591: invokevirtual   ni6.q:()I
        //   594: invokevirtual   ni6.R:(II)V
        //   597: goto            613
        //   600: aload_0        
        //   601: getfield        ni6.K:Lei6;
        //   604: iconst_0       
        //   605: invokevirtual   ei6.m:(I)V
        //   608: aload_0        
        //   609: iconst_0       
        //   610: putfield        ni6.b0:I
        //   613: iconst_0       
        //   614: istore          7
        //   616: iconst_0       
        //   617: istore_2       
        //   618: iconst_0       
        //   619: istore_1       
        //   620: iload_2        
        //   621: iload           10
        //   623: if_icmpge       815
        //   626: aload           20
        //   628: iload_2        
        //   629: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   632: checkcast       Lni6;
        //   635: astore          15
        //   637: aload           15
        //   639: instanceof      Lbac;
        //   642: ifeq            761
        //   645: aload           15
        //   647: checkcast       Lbac;
        //   650: astore          15
        //   652: iload           7
        //   654: istore          9
        //   656: iload_1        
        //   657: istore          8
        //   659: aload           15
        //   661: getfield        bac.y0:I
        //   664: ifne            802
        //   667: aload           15
        //   669: getfield        bac.v0:I
        //   672: istore          7
        //   674: iload           7
        //   676: iconst_m1      
        //   677: if_icmpeq       690
        //   680: aload           15
        //   682: iload           7
        //   684: invokevirtual   bac.a0:(I)V
        //   687: goto            752
        //   690: aload           15
        //   692: getfield        bac.w0:I
        //   695: iconst_m1      
        //   696: if_icmpeq       724
        //   699: aload_0        
        //   700: invokevirtual   ni6.I:()Z
        //   703: ifeq            724
        //   706: aload           15
        //   708: aload_0        
        //   709: invokevirtual   ni6.q:()I
        //   712: aload           15
        //   714: getfield        bac.w0:I
        //   717: isub           
        //   718: invokevirtual   bac.a0:(I)V
        //   721: goto            752
        //   724: aload_0        
        //   725: invokevirtual   ni6.I:()Z
        //   728: ifeq            752
        //   731: aload           15
        //   733: aload           15
        //   735: getfield        bac.u0:F
        //   738: aload_0        
        //   739: invokevirtual   ni6.q:()I
        //   742: i2f            
        //   743: fmul           
        //   744: ldc_w           0.5
        //   747: fadd           
        //   748: f2i            
        //   749: invokevirtual   bac.a0:(I)V
        //   752: iconst_1       
        //   753: istore          9
        //   755: iload_1        
        //   756: istore          8
        //   758: goto            802
        //   761: iload           7
        //   763: istore          9
        //   765: iload_1        
        //   766: istore          8
        //   768: aload           15
        //   770: instanceof      Lni1;
        //   773: ifeq            802
        //   776: iload           7
        //   778: istore          9
        //   780: iload_1        
        //   781: istore          8
        //   783: aload           15
        //   785: checkcast       Lni1;
        //   788: invokevirtual   ni1.c0:()I
        //   791: iconst_1       
        //   792: if_icmpne       802
        //   795: iconst_1       
        //   796: istore          8
        //   798: iload           7
        //   800: istore          9
        //   802: iinc            2, 1
        //   805: iload           9
        //   807: istore          7
        //   809: iload           8
        //   811: istore_1       
        //   812: goto            620
        //   815: iload           7
        //   817: ifeq            876
        //   820: iconst_0       
        //   821: istore_2       
        //   822: iload_2        
        //   823: iload           10
        //   825: if_icmpge       876
        //   828: aload           20
        //   830: iload_2        
        //   831: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   834: checkcast       Lni6;
        //   837: astore          15
        //   839: aload           15
        //   841: instanceof      Lbac;
        //   844: ifeq            870
        //   847: aload           15
        //   849: checkcast       Lbac;
        //   852: astore          15
        //   854: aload           15
        //   856: getfield        bac.y0:I
        //   859: ifne            870
        //   862: iconst_1       
        //   863: aload           15
        //   865: aload           19
        //   867: invokestatic    tw8.g:(ILni6;Lfs1$b;)V
        //   870: iinc            2, 1
        //   873: goto            822
        //   876: iconst_0       
        //   877: aload_0        
        //   878: aload           19
        //   880: invokestatic    tw8.g:(ILni6;Lfs1$b;)V
        //   883: iload_1        
        //   884: ifeq            952
        //   887: iconst_0       
        //   888: istore_1       
        //   889: iload_1        
        //   890: iload           10
        //   892: if_icmpge       952
        //   895: aload           20
        //   897: iload_1        
        //   898: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   901: checkcast       Lni6;
        //   904: astore          15
        //   906: aload           15
        //   908: instanceof      Lni1;
        //   911: ifeq            946
        //   914: aload           15
        //   916: checkcast       Lni1;
        //   919: astore          15
        //   921: aload           15
        //   923: invokevirtual   ni1.c0:()I
        //   926: iconst_1       
        //   927: if_icmpne       946
        //   930: aload           15
        //   932: invokevirtual   ni1.b0:()Z
        //   935: ifeq            946
        //   938: iconst_1       
        //   939: aload           15
        //   941: aload           19
        //   943: invokestatic    tw8.g:(ILni6;Lfs1$b;)V
        //   946: iinc            1, 1
        //   949: goto            889
        //   952: iconst_0       
        //   953: istore_1       
        //   954: iload_1        
        //   955: iload           10
        //   957: if_icmpge       1065
        //   960: aload           20
        //   962: iload_1        
        //   963: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   966: checkcast       Lni6;
        //   969: astore          15
        //   971: aload           15
        //   973: invokevirtual   ni6.G:()Z
        //   976: ifeq            1059
        //   979: aload           15
        //   981: invokestatic    tw8.a:(Lni6;)Z
        //   984: ifeq            1059
        //   987: aload           15
        //   989: aload           19
        //   991: getstatic       tw8.a:Lfs1$a;
        //   994: invokestatic    oi6.k0:(Lni6;Lfs1$b;Lfs1$a;)Z
        //   997: pop            
        //   998: aload           15
        //  1000: instanceof      Lbac;
        //  1003: ifeq            1041
        //  1006: aload           15
        //  1008: checkcast       Lbac;
        //  1011: getfield        bac.y0:I
        //  1014: ifne            1028
        //  1017: iconst_0       
        //  1018: aload           15
        //  1020: aload           19
        //  1022: invokestatic    tw8.g:(ILni6;Lfs1$b;)V
        //  1025: goto            1059
        //  1028: iconst_0       
        //  1029: aload           15
        //  1031: aload           19
        //  1033: iload           13
        //  1035: invokestatic    tw8.b:(ILni6;Lfs1$b;Z)V
        //  1038: goto            1059
        //  1041: iconst_0       
        //  1042: aload           15
        //  1044: aload           19
        //  1046: iload           13
        //  1048: invokestatic    tw8.b:(ILni6;Lfs1$b;Z)V
        //  1051: iconst_0       
        //  1052: aload           15
        //  1054: aload           19
        //  1056: invokestatic    tw8.g:(ILni6;Lfs1$b;)V
        //  1059: iinc            1, 1
        //  1062: goto            954
        //  1065: iconst_0       
        //  1066: istore          7
        //  1068: iload           5
        //  1070: istore_2       
        //  1071: iload           6
        //  1073: istore_1       
        //  1074: aload           18
        //  1076: astore          15
        //  1078: iload           7
        //  1080: iload_3        
        //  1081: if_icmpge       1224
        //  1084: aload_0        
        //  1085: getfield        qox.u0:Ljava/util/ArrayList;
        //  1088: iload           7
        //  1090: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1093: checkcast       Lni6;
        //  1096: astore          15
        //  1098: aload           15
        //  1100: invokevirtual   ni6.G:()Z
        //  1103: ifeq            1218
        //  1106: aload           15
        //  1108: instanceof      Lbac;
        //  1111: ifne            1218
        //  1114: aload           15
        //  1116: instanceof      Lni1;
        //  1119: ifne            1218
        //  1122: aload           15
        //  1124: instanceof      Ljex;
        //  1127: ifne            1218
        //  1130: aload           15
        //  1132: getfield        ni6.G:Z
        //  1135: ifne            1218
        //  1138: aload           15
        //  1140: iconst_0       
        //  1141: invokevirtual   ni6.p:(I)Lni6$a;
        //  1144: astore          20
        //  1146: aload           15
        //  1148: iconst_1       
        //  1149: invokevirtual   ni6.p:(I)Lni6$a;
        //  1152: astore          19
        //  1154: aload           20
        //  1156: aload           24
        //  1158: if_acmpne       1191
        //  1161: aload           15
        //  1163: getfield        ni6.r:I
        //  1166: iconst_1       
        //  1167: if_icmpeq       1191
        //  1170: aload           19
        //  1172: aload           24
        //  1174: if_acmpne       1191
        //  1177: aload           15
        //  1179: getfield        ni6.s:I
        //  1182: iconst_1       
        //  1183: if_icmpeq       1191
        //  1186: iconst_1       
        //  1187: istore_1       
        //  1188: goto            1193
        //  1191: iconst_0       
        //  1192: istore_1       
        //  1193: iload_1        
        //  1194: ifne            1218
        //  1197: new             Lfs1$a;
        //  1200: dup            
        //  1201: invokespecial   fs1$a.<init>:()V
        //  1204: astore          19
        //  1206: aload           15
        //  1208: aload_0        
        //  1209: getfield        oi6.y0:Lfs1$b;
        //  1212: aload           19
        //  1214: invokestatic    oi6.k0:(Lni6;Lfs1$b;Lfs1$a;)Z
        //  1217: pop            
        //  1218: iinc            7, 1
        //  1221: goto            1068
        //  1224: iload_3        
        //  1225: iconst_2       
        //  1226: if_icmple       3273
        //  1229: aload           15
        //  1231: astore          23
        //  1233: aload           22
        //  1235: aload           17
        //  1237: if_acmpeq       1247
        //  1240: aload           23
        //  1242: aload           17
        //  1244: if_acmpne       3255
        //  1247: aload_0        
        //  1248: getfield        oi6.H0:I
        //  1251: sipush          1024
        //  1254: invokestatic    snj.b:(II)Z
        //  1257: ifeq            3255
        //  1260: aload_0        
        //  1261: getfield        oi6.y0:Lfs1$b;
        //  1264: astore          33
        //  1266: getstatic       ei6$a.I0:Lei6$a;
        //  1269: astore          32
        //  1271: aload_0        
        //  1272: getfield        qox.u0:Ljava/util/ArrayList;
        //  1275: astore          31
        //  1277: aload           31
        //  1279: invokevirtual   java/util/ArrayList.size:()I
        //  1282: istore          6
        //  1284: iconst_0       
        //  1285: istore          4
        //  1287: iload           4
        //  1289: iload           6
        //  1291: if_icmpge       1384
        //  1294: aload           31
        //  1296: iload           4
        //  1298: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1301: checkcast       Lni6;
        //  1304: astore          18
        //  1306: aload_0        
        //  1307: getfield        ni6.U:[Lni6$a;
        //  1310: astore          19
        //  1312: aload           19
        //  1314: iconst_0       
        //  1315: aaload         
        //  1316: astore          15
        //  1318: aload           19
        //  1320: iconst_1       
        //  1321: aaload         
        //  1322: astore          19
        //  1324: aload           18
        //  1326: getfield        ni6.U:[Lni6$a;
        //  1329: astore          20
        //  1331: aload           15
        //  1333: aload           19
        //  1335: aload           20
        //  1337: iconst_0       
        //  1338: aaload         
        //  1339: aload           20
        //  1341: iconst_1       
        //  1342: aaload         
        //  1343: invokestatic    t8c.c:(Lni6$a;Lni6$a;Lni6$a;Lni6$a;)Z
        //  1346: ifne            1352
        //  1349: goto            1360
        //  1352: aload           18
        //  1354: instanceof      Lc7b;
        //  1357: ifeq            1378
        //  1360: aload           22
        //  1362: astore          18
        //  1364: iconst_0       
        //  1365: istore          4
        //  1367: aload           17
        //  1369: astore          15
        //  1371: aload           23
        //  1373: astore          17
        //  1375: goto            3117
        //  1378: iinc            4, 1
        //  1381: goto            1287
        //  1384: iconst_0       
        //  1385: istore          4
        //  1387: aconst_null    
        //  1388: astore          25
        //  1390: aconst_null    
        //  1391: astore          15
        //  1393: aconst_null    
        //  1394: astore          19
        //  1396: aconst_null    
        //  1397: astore          18
        //  1399: aconst_null    
        //  1400: astore          21
        //  1402: aconst_null    
        //  1403: astore          20
        //  1405: iload           4
        //  1407: iload           6
        //  1409: if_icmpge       1980
        //  1412: aload           31
        //  1414: iload           4
        //  1416: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1419: checkcast       Lni6;
        //  1422: astore          34
        //  1424: aload_0        
        //  1425: getfield        ni6.U:[Lni6$a;
        //  1428: astore          27
        //  1430: aload           27
        //  1432: iconst_0       
        //  1433: aaload         
        //  1434: astore          26
        //  1436: aload           27
        //  1438: iconst_1       
        //  1439: aaload         
        //  1440: astore          27
        //  1442: aload           34
        //  1444: getfield        ni6.U:[Lni6$a;
        //  1447: astore          28
        //  1449: aload           26
        //  1451: aload           27
        //  1453: aload           28
        //  1455: iconst_0       
        //  1456: aaload         
        //  1457: aload           28
        //  1459: iconst_1       
        //  1460: aaload         
        //  1461: invokestatic    t8c.c:(Lni6$a;Lni6$a;Lni6$a;Lni6$a;)Z
        //  1464: ifne            1479
        //  1467: aload           34
        //  1469: aload           33
        //  1471: aload_0        
        //  1472: getfield        oi6.P0:Lfs1$a;
        //  1475: invokestatic    oi6.k0:(Lni6;Lfs1$b;Lfs1$a;)Z
        //  1478: pop            
        //  1479: aload           34
        //  1481: instanceof      Lbac;
        //  1484: istore          13
        //  1486: aload           25
        //  1488: astore          28
        //  1490: aload           19
        //  1492: astore          27
        //  1494: iload           13
        //  1496: ifeq            1595
        //  1499: aload           34
        //  1501: checkcast       Lbac;
        //  1504: astore          29
        //  1506: aload           19
        //  1508: astore          26
        //  1510: aload           29
        //  1512: getfield        bac.y0:I
        //  1515: ifne            1544
        //  1518: aload           19
        //  1520: astore          26
        //  1522: aload           19
        //  1524: ifnonnull       1536
        //  1527: new             Ljava/util/ArrayList;
        //  1530: dup            
        //  1531: invokespecial   java/util/ArrayList.<init>:()V
        //  1534: astore          26
        //  1536: aload           26
        //  1538: aload           29
        //  1540: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1543: pop            
        //  1544: aload           25
        //  1546: astore          28
        //  1548: aload           26
        //  1550: astore          27
        //  1552: aload           29
        //  1554: getfield        bac.y0:I
        //  1557: iconst_1       
        //  1558: if_icmpne       1595
        //  1561: aload           25
        //  1563: astore          19
        //  1565: aload           25
        //  1567: ifnonnull       1579
        //  1570: new             Ljava/util/ArrayList;
        //  1573: dup            
        //  1574: invokespecial   java/util/ArrayList.<init>:()V
        //  1577: astore          19
        //  1579: aload           19
        //  1581: aload           29
        //  1583: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1586: pop            
        //  1587: aload           26
        //  1589: astore          27
        //  1591: aload           19
        //  1593: astore          28
        //  1595: aload           15
        //  1597: astore          19
        //  1599: aload           18
        //  1601: astore          26
        //  1603: aload           34
        //  1605: instanceof      Lajc;
        //  1608: ifeq            1773
        //  1611: aload           34
        //  1613: instanceof      Lni1;
        //  1616: ifeq            1714
        //  1619: aload           34
        //  1621: checkcast       Lni1;
        //  1624: astore          29
        //  1626: aload           15
        //  1628: astore          25
        //  1630: aload           29
        //  1632: invokevirtual   ni1.c0:()I
        //  1635: ifne            1664
        //  1638: aload           15
        //  1640: astore          25
        //  1642: aload           15
        //  1644: ifnonnull       1656
        //  1647: new             Ljava/util/ArrayList;
        //  1650: dup            
        //  1651: invokespecial   java/util/ArrayList.<init>:()V
        //  1654: astore          25
        //  1656: aload           25
        //  1658: aload           29
        //  1660: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1663: pop            
        //  1664: aload           25
        //  1666: astore          19
        //  1668: aload           18
        //  1670: astore          26
        //  1672: aload           29
        //  1674: invokevirtual   ni1.c0:()I
        //  1677: iconst_1       
        //  1678: if_icmpne       1773
        //  1681: aload           18
        //  1683: astore          26
        //  1685: aload           18
        //  1687: ifnonnull       1699
        //  1690: new             Ljava/util/ArrayList;
        //  1693: dup            
        //  1694: invokespecial   java/util/ArrayList.<init>:()V
        //  1697: astore          26
        //  1699: aload           26
        //  1701: aload           29
        //  1703: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1706: pop            
        //  1707: aload           25
        //  1709: astore          19
        //  1711: goto            1773
        //  1714: aload           34
        //  1716: checkcast       Lajc;
        //  1719: astore          25
        //  1721: aload           15
        //  1723: astore          19
        //  1725: aload           15
        //  1727: ifnonnull       1739
        //  1730: new             Ljava/util/ArrayList;
        //  1733: dup            
        //  1734: invokespecial   java/util/ArrayList.<init>:()V
        //  1737: astore          19
        //  1739: aload           19
        //  1741: aload           25
        //  1743: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1746: pop            
        //  1747: aload           18
        //  1749: astore          26
        //  1751: aload           18
        //  1753: ifnonnull       1765
        //  1756: new             Ljava/util/ArrayList;
        //  1759: dup            
        //  1760: invokespecial   java/util/ArrayList.<init>:()V
        //  1763: astore          26
        //  1765: aload           26
        //  1767: aload           25
        //  1769: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1772: pop            
        //  1773: aload           21
        //  1775: astore          29
        //  1777: aload           34
        //  1779: getfield        ni6.J:Lei6;
        //  1782: getfield        ei6.f:Lei6;
        //  1785: ifnonnull       1854
        //  1788: aload           21
        //  1790: astore          29
        //  1792: aload           34
        //  1794: getfield        ni6.L:Lei6;
        //  1797: getfield        ei6.f:Lei6;
        //  1800: ifnonnull       1854
        //  1803: aload           21
        //  1805: astore          29
        //  1807: iload           13
        //  1809: ifne            1854
        //  1812: aload           21
        //  1814: astore          29
        //  1816: aload           34
        //  1818: instanceof      Lni1;
        //  1821: ifne            1854
        //  1824: aload           21
        //  1826: astore          15
        //  1828: aload           21
        //  1830: ifnonnull       1842
        //  1833: new             Ljava/util/ArrayList;
        //  1836: dup            
        //  1837: invokespecial   java/util/ArrayList.<init>:()V
        //  1840: astore          15
        //  1842: aload           15
        //  1844: aload           34
        //  1846: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1849: pop            
        //  1850: aload           15
        //  1852: astore          29
        //  1854: aload           20
        //  1856: astore          30
        //  1858: aload           34
        //  1860: getfield        ni6.K:Lei6;
        //  1863: getfield        ei6.f:Lei6;
        //  1866: ifnonnull       1950
        //  1869: aload           20
        //  1871: astore          30
        //  1873: aload           34
        //  1875: getfield        ni6.M:Lei6;
        //  1878: getfield        ei6.f:Lei6;
        //  1881: ifnonnull       1950
        //  1884: aload           20
        //  1886: astore          30
        //  1888: aload           34
        //  1890: getfield        ni6.N:Lei6;
        //  1893: getfield        ei6.f:Lei6;
        //  1896: ifnonnull       1950
        //  1899: aload           20
        //  1901: astore          30
        //  1903: iload           13
        //  1905: ifne            1950
        //  1908: aload           20
        //  1910: astore          30
        //  1912: aload           34
        //  1914: instanceof      Lni1;
        //  1917: ifne            1950
        //  1920: aload           20
        //  1922: astore          15
        //  1924: aload           20
        //  1926: ifnonnull       1938
        //  1929: new             Ljava/util/ArrayList;
        //  1932: dup            
        //  1933: invokespecial   java/util/ArrayList.<init>:()V
        //  1936: astore          15
        //  1938: aload           15
        //  1940: aload           34
        //  1942: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1945: pop            
        //  1946: aload           15
        //  1948: astore          30
        //  1950: iinc            4, 1
        //  1953: aload           28
        //  1955: astore          25
        //  1957: aload           19
        //  1959: astore          15
        //  1961: aload           27
        //  1963: astore          19
        //  1965: aload           26
        //  1967: astore          18
        //  1969: aload           29
        //  1971: astore          21
        //  1973: aload           30
        //  1975: astore          20
        //  1977: goto            1405
        //  1980: new             Ljava/util/ArrayList;
        //  1983: dup            
        //  1984: invokespecial   java/util/ArrayList.<init>:()V
        //  1987: astore          26
        //  1989: aload           25
        //  1991: ifnull          2032
        //  1994: aload           25
        //  1996: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1999: astore          25
        //  2001: aload           25
        //  2003: invokeinterface java/util/Iterator.hasNext:()Z
        //  2008: ifeq            2032
        //  2011: aload           25
        //  2013: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2018: checkcast       Lbac;
        //  2021: iconst_0       
        //  2022: aload           26
        //  2024: aconst_null    
        //  2025: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2028: pop            
        //  2029: goto            2001
        //  2032: aload           15
        //  2034: ifnull          2097
        //  2037: aload           15
        //  2039: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2042: astore          25
        //  2044: aload           25
        //  2046: invokeinterface java/util/Iterator.hasNext:()Z
        //  2051: ifeq            2097
        //  2054: aload           25
        //  2056: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2061: checkcast       Lajc;
        //  2064: astore          27
        //  2066: aload           27
        //  2068: iconst_0       
        //  2069: aload           26
        //  2071: aconst_null    
        //  2072: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2075: astore          15
        //  2077: aload           27
        //  2079: aload           26
        //  2081: iconst_0       
        //  2082: aload           15
        //  2084: invokevirtual   ajc.a0:(Ljava/util/ArrayList;ILrox;)V
        //  2087: aload           15
        //  2089: aload           26
        //  2091: invokevirtual   rox.b:(Ljava/util/ArrayList;)V
        //  2094: goto            2044
        //  2097: aload_0        
        //  2098: getstatic       ei6$a.D0:Lei6$a;
        //  2101: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2104: getfield        ei6.a:Ljava/util/HashSet;
        //  2107: astore          15
        //  2109: aload           15
        //  2111: ifnull          2155
        //  2114: aload           15
        //  2116: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2119: astore          15
        //  2121: aload           15
        //  2123: invokeinterface java/util/Iterator.hasNext:()Z
        //  2128: ifeq            2155
        //  2131: aload           15
        //  2133: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2138: checkcast       Lei6;
        //  2141: getfield        ei6.d:Lni6;
        //  2144: iconst_0       
        //  2145: aload           26
        //  2147: aconst_null    
        //  2148: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2151: pop            
        //  2152: goto            2121
        //  2155: aload_0        
        //  2156: getstatic       ei6$a.F0:Lei6$a;
        //  2159: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2162: getfield        ei6.a:Ljava/util/HashSet;
        //  2165: astore          15
        //  2167: aload           15
        //  2169: ifnull          2213
        //  2172: aload           15
        //  2174: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2177: astore          15
        //  2179: aload           15
        //  2181: invokeinterface java/util/Iterator.hasNext:()Z
        //  2186: ifeq            2213
        //  2189: aload           15
        //  2191: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2196: checkcast       Lei6;
        //  2199: getfield        ei6.d:Lni6;
        //  2202: iconst_0       
        //  2203: aload           26
        //  2205: aconst_null    
        //  2206: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2209: pop            
        //  2210: goto            2179
        //  2213: aload_0        
        //  2214: aload           32
        //  2216: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2219: getfield        ei6.a:Ljava/util/HashSet;
        //  2222: astore          15
        //  2224: aload           15
        //  2226: ifnull          2270
        //  2229: aload           15
        //  2231: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2234: astore          15
        //  2236: aload           15
        //  2238: invokeinterface java/util/Iterator.hasNext:()Z
        //  2243: ifeq            2270
        //  2246: aload           15
        //  2248: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2253: checkcast       Lei6;
        //  2256: getfield        ei6.d:Lni6;
        //  2259: iconst_0       
        //  2260: aload           26
        //  2262: aconst_null    
        //  2263: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2266: pop            
        //  2267: goto            2236
        //  2270: aload           21
        //  2272: ifnull          2313
        //  2275: aload           21
        //  2277: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2280: astore          15
        //  2282: aload           15
        //  2284: invokeinterface java/util/Iterator.hasNext:()Z
        //  2289: ifeq            2313
        //  2292: aload           15
        //  2294: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2299: checkcast       Lni6;
        //  2302: iconst_0       
        //  2303: aload           26
        //  2305: aconst_null    
        //  2306: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2309: pop            
        //  2310: goto            2282
        //  2313: aload           19
        //  2315: ifnull          2356
        //  2318: aload           19
        //  2320: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2323: astore          15
        //  2325: aload           15
        //  2327: invokeinterface java/util/Iterator.hasNext:()Z
        //  2332: ifeq            2356
        //  2335: aload           15
        //  2337: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2342: checkcast       Lbac;
        //  2345: iconst_1       
        //  2346: aload           26
        //  2348: aconst_null    
        //  2349: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2352: pop            
        //  2353: goto            2325
        //  2356: aload           18
        //  2358: ifnull          2421
        //  2361: aload           18
        //  2363: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2366: astore          15
        //  2368: aload           15
        //  2370: invokeinterface java/util/Iterator.hasNext:()Z
        //  2375: ifeq            2421
        //  2378: aload           15
        //  2380: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2385: checkcast       Lajc;
        //  2388: astore          18
        //  2390: aload           18
        //  2392: iconst_1       
        //  2393: aload           26
        //  2395: aconst_null    
        //  2396: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2399: astore          19
        //  2401: aload           18
        //  2403: aload           26
        //  2405: iconst_1       
        //  2406: aload           19
        //  2408: invokevirtual   ajc.a0:(Ljava/util/ArrayList;ILrox;)V
        //  2411: aload           19
        //  2413: aload           26
        //  2415: invokevirtual   rox.b:(Ljava/util/ArrayList;)V
        //  2418: goto            2368
        //  2421: aload_0        
        //  2422: getstatic       ei6$a.E0:Lei6$a;
        //  2425: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2428: getfield        ei6.a:Ljava/util/HashSet;
        //  2431: astore          15
        //  2433: aload           15
        //  2435: ifnull          2479
        //  2438: aload           15
        //  2440: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2443: astore          15
        //  2445: aload           15
        //  2447: invokeinterface java/util/Iterator.hasNext:()Z
        //  2452: ifeq            2479
        //  2455: aload           15
        //  2457: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2462: checkcast       Lei6;
        //  2465: getfield        ei6.d:Lni6;
        //  2468: iconst_1       
        //  2469: aload           26
        //  2471: aconst_null    
        //  2472: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2475: pop            
        //  2476: goto            2445
        //  2479: aload_0        
        //  2480: getstatic       ei6$a.H0:Lei6$a;
        //  2483: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2486: getfield        ei6.a:Ljava/util/HashSet;
        //  2489: astore          15
        //  2491: aload           15
        //  2493: ifnull          2537
        //  2496: aload           15
        //  2498: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2501: astore          15
        //  2503: aload           15
        //  2505: invokeinterface java/util/Iterator.hasNext:()Z
        //  2510: ifeq            2537
        //  2513: aload           15
        //  2515: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2520: checkcast       Lei6;
        //  2523: getfield        ei6.d:Lni6;
        //  2526: iconst_1       
        //  2527: aload           26
        //  2529: aconst_null    
        //  2530: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2533: pop            
        //  2534: goto            2503
        //  2537: aload_0        
        //  2538: getstatic       ei6$a.G0:Lei6$a;
        //  2541: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2544: getfield        ei6.a:Ljava/util/HashSet;
        //  2547: astore          15
        //  2549: aload           15
        //  2551: ifnull          2595
        //  2554: aload           15
        //  2556: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2559: astore          15
        //  2561: aload           15
        //  2563: invokeinterface java/util/Iterator.hasNext:()Z
        //  2568: ifeq            2595
        //  2571: aload           15
        //  2573: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2578: checkcast       Lei6;
        //  2581: getfield        ei6.d:Lni6;
        //  2584: iconst_1       
        //  2585: aload           26
        //  2587: aconst_null    
        //  2588: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2591: pop            
        //  2592: goto            2561
        //  2595: aload_0        
        //  2596: aload           32
        //  2598: invokevirtual   ni6.n:(Lei6$a;)Lei6;
        //  2601: getfield        ei6.a:Ljava/util/HashSet;
        //  2604: astore          15
        //  2606: aload           15
        //  2608: ifnull          2652
        //  2611: aload           15
        //  2613: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2616: astore          15
        //  2618: aload           15
        //  2620: invokeinterface java/util/Iterator.hasNext:()Z
        //  2625: ifeq            2652
        //  2628: aload           15
        //  2630: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2635: checkcast       Lei6;
        //  2638: getfield        ei6.d:Lni6;
        //  2641: iconst_1       
        //  2642: aload           26
        //  2644: aconst_null    
        //  2645: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2648: pop            
        //  2649: goto            2618
        //  2652: aload           20
        //  2654: ifnull          2695
        //  2657: aload           20
        //  2659: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2662: astore          15
        //  2664: aload           15
        //  2666: invokeinterface java/util/Iterator.hasNext:()Z
        //  2671: ifeq            2695
        //  2674: aload           15
        //  2676: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2681: checkcast       Lni6;
        //  2684: iconst_1       
        //  2685: aload           26
        //  2687: aconst_null    
        //  2688: invokestatic    t8c.a:(Lni6;ILjava/util/ArrayList;Lrox;)Lrox;
        //  2691: pop            
        //  2692: goto            2664
        //  2695: iconst_0       
        //  2696: istore          4
        //  2698: iload           4
        //  2700: iload           6
        //  2702: if_icmpge       2818
        //  2705: aload           31
        //  2707: iload           4
        //  2709: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2712: checkcast       Lni6;
        //  2715: astore          18
        //  2717: aload           18
        //  2719: getfield        ni6.U:[Lni6$a;
        //  2722: astore          15
        //  2724: aload           15
        //  2726: iconst_0       
        //  2727: aaload         
        //  2728: aload           24
        //  2730: if_acmpne       2748
        //  2733: aload           15
        //  2735: iconst_1       
        //  2736: aaload         
        //  2737: aload           24
        //  2739: if_acmpne       2748
        //  2742: iconst_1       
        //  2743: istore          5
        //  2745: goto            2751
        //  2748: iconst_0       
        //  2749: istore          5
        //  2751: iload           5
        //  2753: ifeq            2812
        //  2756: aload           26
        //  2758: aload           18
        //  2760: getfield        ni6.s0:I
        //  2763: invokestatic    t8c.b:(Ljava/util/ArrayList;I)Lrox;
        //  2766: astore          15
        //  2768: aload           26
        //  2770: aload           18
        //  2772: getfield        ni6.t0:I
        //  2775: invokestatic    t8c.b:(Ljava/util/ArrayList;I)Lrox;
        //  2778: astore          18
        //  2780: aload           15
        //  2782: ifnull          2812
        //  2785: aload           18
        //  2787: ifnull          2812
        //  2790: aload           15
        //  2792: iconst_0       
        //  2793: aload           18
        //  2795: invokevirtual   rox.d:(ILrox;)V
        //  2798: aload           18
        //  2800: iconst_2       
        //  2801: putfield        rox.c:I
        //  2804: aload           26
        //  2806: aload           15
        //  2808: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //  2811: pop            
        //  2812: iinc            4, 1
        //  2815: goto            2698
        //  2818: aload           26
        //  2820: invokevirtual   java/util/ArrayList.size:()I
        //  2823: iconst_1       
        //  2824: if_icmpgt       2830
        //  2827: goto            3080
        //  2830: aload_0        
        //  2831: getfield        ni6.U:[Lni6$a;
        //  2834: iconst_0       
        //  2835: aaload         
        //  2836: astore          15
        //  2838: aload           17
        //  2840: astore          19
        //  2842: aload           15
        //  2844: aload           19
        //  2846: if_acmpne       2950
        //  2849: aload           26
        //  2851: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2854: astore          20
        //  2856: iconst_0       
        //  2857: istore          4
        //  2859: aconst_null    
        //  2860: astore          15
        //  2862: aload           20
        //  2864: invokeinterface java/util/Iterator.hasNext:()Z
        //  2869: ifeq            2926
        //  2872: aload           20
        //  2874: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2879: checkcast       Lrox;
        //  2882: astore          18
        //  2884: aload           18
        //  2886: getfield        rox.c:I
        //  2889: iconst_1       
        //  2890: if_icmpne       2896
        //  2893: goto            2862
        //  2896: aload           18
        //  2898: aload_0        
        //  2899: getfield        oi6.A0:Lbdf;
        //  2902: iconst_0       
        //  2903: invokevirtual   rox.c:(Lbdf;I)I
        //  2906: istore          5
        //  2908: iload           5
        //  2910: iload           4
        //  2912: if_icmple       2862
        //  2915: aload           18
        //  2917: astore          15
        //  2919: iload           5
        //  2921: istore          4
        //  2923: goto            2862
        //  2926: aload           15
        //  2928: ifnull          2950
        //  2931: aload_0        
        //  2932: aload           16
        //  2934: invokevirtual   ni6.T:(Lni6$a;)V
        //  2937: aload_0        
        //  2938: iload           4
        //  2940: invokevirtual   ni6.X:(I)V
        //  2943: aload           15
        //  2945: astore          18
        //  2947: goto            2953
        //  2950: aconst_null    
        //  2951: astore          18
        //  2953: aload           16
        //  2955: astore          20
        //  2957: aload_0        
        //  2958: getfield        ni6.U:[Lni6$a;
        //  2961: iconst_1       
        //  2962: aaload         
        //  2963: aload           19
        //  2965: if_acmpne       3064
        //  2968: aload           26
        //  2970: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2973: astore          24
        //  2975: iconst_0       
        //  2976: istore          4
        //  2978: aconst_null    
        //  2979: astore          15
        //  2981: aload           24
        //  2983: invokeinterface java/util/Iterator.hasNext:()Z
        //  2988: ifeq            3044
        //  2991: aload           24
        //  2993: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2998: checkcast       Lrox;
        //  3001: astore          21
        //  3003: aload           21
        //  3005: getfield        rox.c:I
        //  3008: ifne            3014
        //  3011: goto            2981
        //  3014: aload           21
        //  3016: aload_0        
        //  3017: getfield        oi6.A0:Lbdf;
        //  3020: iconst_1       
        //  3021: invokevirtual   rox.c:(Lbdf;I)I
        //  3024: istore          5
        //  3026: iload           5
        //  3028: iload           4
        //  3030: if_icmple       2981
        //  3033: aload           21
        //  3035: astore          15
        //  3037: iload           5
        //  3039: istore          4
        //  3041: goto            2981
        //  3044: aload           15
        //  3046: ifnull          3064
        //  3049: aload_0        
        //  3050: aload           20
        //  3052: invokevirtual   ni6.W:(Lni6$a;)V
        //  3055: aload_0        
        //  3056: iload           4
        //  3058: invokevirtual   ni6.S:(I)V
        //  3061: goto            3067
        //  3064: aconst_null    
        //  3065: astore          15
        //  3067: aload           18
        //  3069: ifnonnull       3098
        //  3072: aload           15
        //  3074: ifnull          3080
        //  3077: goto            3098
        //  3080: aload           17
        //  3082: astore          15
        //  3084: iconst_0       
        //  3085: istore          4
        //  3087: aload           22
        //  3089: astore          18
        //  3091: aload           23
        //  3093: astore          17
        //  3095: goto            3117
        //  3098: iconst_1       
        //  3099: istore          4
        //  3101: aload           23
        //  3103: astore          17
        //  3105: aload           22
        //  3107: astore          18
        //  3109: aload           19
        //  3111: astore          15
        //  3113: aload           20
        //  3115: astore          16
        //  3117: iload           4
        //  3119: ifeq            3240
        //  3122: aload           18
        //  3124: aload           15
        //  3126: if_acmpne       3166
        //  3129: aload_0        
        //  3130: invokevirtual   ni6.x:()I
        //  3133: istore          4
        //  3135: iload_2        
        //  3136: iload           4
        //  3138: if_icmpge       3158
        //  3141: iload_2        
        //  3142: ifle            3158
        //  3145: aload_0        
        //  3146: iload_2        
        //  3147: invokevirtual   ni6.X:(I)V
        //  3150: aload_0        
        //  3151: iconst_1       
        //  3152: putfield        oi6.I0:Z
        //  3155: goto            3166
        //  3158: aload_0        
        //  3159: invokevirtual   ni6.x:()I
        //  3162: istore_2       
        //  3163: goto            3166
        //  3166: aload           17
        //  3168: astore          20
        //  3170: aload           20
        //  3172: aload           15
        //  3174: if_acmpne       3214
        //  3177: aload_0        
        //  3178: invokevirtual   ni6.q:()I
        //  3181: istore          4
        //  3183: iload_1        
        //  3184: iload           4
        //  3186: if_icmpge       3206
        //  3189: iload_1        
        //  3190: ifle            3206
        //  3193: aload_0        
        //  3194: iload_1        
        //  3195: invokevirtual   ni6.S:(I)V
        //  3198: aload_0        
        //  3199: iconst_1       
        //  3200: putfield        oi6.J0:Z
        //  3203: goto            3214
        //  3206: aload_0        
        //  3207: invokevirtual   ni6.q:()I
        //  3210: istore_1       
        //  3211: goto            3214
        //  3214: iload_1        
        //  3215: istore          8
        //  3217: iconst_1       
        //  3218: istore_1       
        //  3219: aload           15
        //  3221: astore          19
        //  3223: aload           18
        //  3225: astore          17
        //  3227: iload_2        
        //  3228: istore          7
        //  3230: aload           20
        //  3232: astore          18
        //  3234: iload_3        
        //  3235: istore          9
        //  3237: goto            3295
        //  3240: aload           17
        //  3242: astore          19
        //  3244: aload           18
        //  3246: astore          17
        //  3248: aload           19
        //  3250: astore          18
        //  3252: goto            3276
        //  3255: iload           4
        //  3257: istore_3       
        //  3258: aload           15
        //  3260: astore          18
        //  3262: aload           17
        //  3264: astore          15
        //  3266: aload           22
        //  3268: astore          17
        //  3270: goto            3276
        //  3273: goto            3255
        //  3276: iconst_0       
        //  3277: istore          4
        //  3279: iload_3        
        //  3280: istore          9
        //  3282: iload_1        
        //  3283: istore          8
        //  3285: iload_2        
        //  3286: istore          7
        //  3288: aload           15
        //  3290: astore          19
        //  3292: iload           4
        //  3294: istore_1       
        //  3295: aload_0        
        //  3296: bipush          64
        //  3298: invokevirtual   oi6.l0:(I)Z
        //  3301: ifne            3322
        //  3304: aload_0        
        //  3305: sipush          128
        //  3308: invokevirtual   oi6.l0:(I)Z
        //  3311: ifeq            3317
        //  3314: goto            3322
        //  3317: iconst_0       
        //  3318: istore_2       
        //  3319: goto            3324
        //  3322: iconst_1       
        //  3323: istore_2       
        //  3324: aload_0        
        //  3325: getfield        oi6.A0:Lbdf;
        //  3328: astore          15
        //  3330: aload           15
        //  3332: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3335: pop            
        //  3336: aload           15
        //  3338: iconst_0       
        //  3339: putfield        bdf.g:Z
        //  3342: aload_0        
        //  3343: getfield        oi6.H0:I
        //  3346: ifeq            3362
        //  3349: iload_2        
        //  3350: ifeq            3362
        //  3353: aload           15
        //  3355: iconst_1       
        //  3356: putfield        bdf.g:Z
        //  3359: goto            3362
        //  3362: aload_0        
        //  3363: getfield        qox.u0:Ljava/util/ArrayList;
        //  3366: astore          20
        //  3368: aload_0        
        //  3369: getfield        ni6.U:[Lni6$a;
        //  3372: astore          15
        //  3374: aload           15
        //  3376: iconst_0       
        //  3377: aaload         
        //  3378: aload           19
        //  3380: if_acmpeq       3401
        //  3383: aload           15
        //  3385: iconst_1       
        //  3386: aaload         
        //  3387: aload           19
        //  3389: if_acmpne       3395
        //  3392: goto            3401
        //  3395: iconst_0       
        //  3396: istore          10
        //  3398: goto            3404
        //  3401: iconst_1       
        //  3402: istore          10
        //  3404: aload_0        
        //  3405: iconst_0       
        //  3406: putfield        oi6.D0:I
        //  3409: aload_0        
        //  3410: iconst_0       
        //  3411: putfield        oi6.E0:I
        //  3414: iconst_0       
        //  3415: istore_2       
        //  3416: iload_2        
        //  3417: iload           9
        //  3419: if_icmpge       3457
        //  3422: aload_0        
        //  3423: getfield        qox.u0:Ljava/util/ArrayList;
        //  3426: iload_2        
        //  3427: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3430: checkcast       Lni6;
        //  3433: astore          15
        //  3435: aload           15
        //  3437: instanceof      Lqox;
        //  3440: ifeq            3451
        //  3443: aload           15
        //  3445: checkcast       Lqox;
        //  3448: invokevirtual   qox.a0:()V
        //  3451: iinc            2, 1
        //  3454: goto            3416
        //  3457: aload_0        
        //  3458: bipush          64
        //  3460: invokevirtual   oi6.l0:(I)Z
        //  3463: istore          14
        //  3465: iload_1        
        //  3466: istore          4
        //  3468: iconst_0       
        //  3469: istore_2       
        //  3470: iconst_1       
        //  3471: istore_1       
        //  3472: iload_1        
        //  3473: ifeq            4586
        //  3476: iload_2        
        //  3477: iconst_1       
        //  3478: iadd           
        //  3479: istore          11
        //  3481: aload_0        
        //  3482: getfield        oi6.A0:Lbdf;
        //  3485: invokevirtual   bdf.u:()V
        //  3488: aload_0        
        //  3489: iconst_0       
        //  3490: putfield        oi6.D0:I
        //  3493: aload_0        
        //  3494: iconst_0       
        //  3495: putfield        oi6.E0:I
        //  3498: aload_0        
        //  3499: aload_0        
        //  3500: getfield        oi6.A0:Lbdf;
        //  3503: invokevirtual   ni6.l:(Lbdf;)V
        //  3506: iconst_0       
        //  3507: istore_2       
        //  3508: iload_2        
        //  3509: iload           9
        //  3511: if_icmpge       3547
        //  3514: aload_0        
        //  3515: getfield        qox.u0:Ljava/util/ArrayList;
        //  3518: iload_2        
        //  3519: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3522: checkcast       Lni6;
        //  3525: astore          15
        //  3527: aload           15
        //  3529: aload_0        
        //  3530: getfield        oi6.A0:Lbdf;
        //  3533: invokevirtual   ni6.l:(Lbdf;)V
        //  3536: iinc            2, 1
        //  3539: goto            3508
        //  3542: astore          15
        //  3544: goto            3891
        //  3547: aload_0        
        //  3548: aload_0        
        //  3549: getfield        oi6.A0:Lbdf;
        //  3552: invokevirtual   oi6.d0:(Lbdf;)V
        //  3555: aload_0        
        //  3556: getfield        oi6.K0:Ljava/lang/ref/WeakReference;
        //  3559: astore          15
        //  3561: aload           15
        //  3563: ifnull          3635
        //  3566: aload           15
        //  3568: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3571: ifnull          3635
        //  3574: aload_0        
        //  3575: getfield        oi6.K0:Ljava/lang/ref/WeakReference;
        //  3578: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3581: checkcast       Lei6;
        //  3584: astore          21
        //  3586: aload_0        
        //  3587: getfield        oi6.A0:Lbdf;
        //  3590: aload_0        
        //  3591: getfield        ni6.K:Lei6;
        //  3594: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3597: astore          15
        //  3599: aload_0        
        //  3600: getfield        oi6.A0:Lbdf;
        //  3603: aload           21
        //  3605: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3608: astore          22
        //  3610: aload_0        
        //  3611: getfield        oi6.A0:Lbdf;
        //  3614: astore          21
        //  3616: aload           21
        //  3618: aload           22
        //  3620: aload           15
        //  3622: iconst_0       
        //  3623: iconst_5       
        //  3624: invokevirtual   bdf.f:(Lolq;Lolq;II)V
        //  3627: aload_0        
        //  3628: aconst_null    
        //  3629: putfield        oi6.K0:Ljava/lang/ref/WeakReference;
        //  3632: goto            3635
        //  3635: aload_0        
        //  3636: getfield        oi6.M0:Ljava/lang/ref/WeakReference;
        //  3639: astore          15
        //  3641: aload           15
        //  3643: ifnull          3708
        //  3646: aload           15
        //  3648: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3651: ifnull          3708
        //  3654: aload_0        
        //  3655: getfield        oi6.M0:Ljava/lang/ref/WeakReference;
        //  3658: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3661: checkcast       Lei6;
        //  3664: astore          21
        //  3666: aload_0        
        //  3667: getfield        oi6.A0:Lbdf;
        //  3670: aload_0        
        //  3671: getfield        ni6.M:Lei6;
        //  3674: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3677: astore          15
        //  3679: aload_0        
        //  3680: getfield        oi6.A0:Lbdf;
        //  3683: aload           21
        //  3685: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3688: astore          21
        //  3690: aload_0        
        //  3691: getfield        oi6.A0:Lbdf;
        //  3694: aload           15
        //  3696: aload           21
        //  3698: iconst_0       
        //  3699: iconst_5       
        //  3700: invokevirtual   bdf.f:(Lolq;Lolq;II)V
        //  3703: aload_0        
        //  3704: aconst_null    
        //  3705: putfield        oi6.M0:Ljava/lang/ref/WeakReference;
        //  3708: aload_0        
        //  3709: getfield        oi6.L0:Ljava/lang/ref/WeakReference;
        //  3712: astore          15
        //  3714: aload           15
        //  3716: ifnull          3781
        //  3719: aload           15
        //  3721: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3724: ifnull          3781
        //  3727: aload_0        
        //  3728: getfield        oi6.L0:Ljava/lang/ref/WeakReference;
        //  3731: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3734: checkcast       Lei6;
        //  3737: astore          21
        //  3739: aload_0        
        //  3740: getfield        oi6.A0:Lbdf;
        //  3743: aload_0        
        //  3744: getfield        ni6.J:Lei6;
        //  3747: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3750: astore          15
        //  3752: aload_0        
        //  3753: getfield        oi6.A0:Lbdf;
        //  3756: aload           21
        //  3758: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3761: astore          21
        //  3763: aload_0        
        //  3764: getfield        oi6.A0:Lbdf;
        //  3767: aload           21
        //  3769: aload           15
        //  3771: iconst_0       
        //  3772: iconst_5       
        //  3773: invokevirtual   bdf.f:(Lolq;Lolq;II)V
        //  3776: aload_0        
        //  3777: aconst_null    
        //  3778: putfield        oi6.L0:Ljava/lang/ref/WeakReference;
        //  3781: aload_0        
        //  3782: getfield        oi6.N0:Ljava/lang/ref/WeakReference;
        //  3785: astore          15
        //  3787: aload           15
        //  3789: ifnull          3862
        //  3792: aload           15
        //  3794: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3797: ifnull          3862
        //  3800: aload_0        
        //  3801: getfield        oi6.N0:Ljava/lang/ref/WeakReference;
        //  3804: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3807: checkcast       Lei6;
        //  3810: astore          21
        //  3812: aload_0        
        //  3813: getfield        oi6.A0:Lbdf;
        //  3816: aload_0        
        //  3817: getfield        ni6.L:Lei6;
        //  3820: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3823: astore          15
        //  3825: aload_0        
        //  3826: getfield        oi6.A0:Lbdf;
        //  3829: aload           21
        //  3831: invokevirtual   bdf.l:(Ljava/lang/Object;)Lolq;
        //  3834: astore          21
        //  3836: aload_0        
        //  3837: getfield        oi6.A0:Lbdf;
        //  3840: aload           15
        //  3842: aload           21
        //  3844: iconst_0       
        //  3845: iconst_5       
        //  3846: invokevirtual   bdf.f:(Lolq;Lolq;II)V
        //  3849: aload_0        
        //  3850: aconst_null    
        //  3851: putfield        oi6.N0:Ljava/lang/ref/WeakReference;
        //  3854: goto            3862
        //  3857: astore          15
        //  3859: goto            3884
        //  3862: aload_0        
        //  3863: getfield        oi6.A0:Lbdf;
        //  3866: invokevirtual   bdf.q:()V
        //  3869: iconst_1       
        //  3870: istore_1       
        //  3871: goto            3945
        //  3874: astore          15
        //  3876: goto            3884
        //  3879: astore          15
        //  3881: goto            3859
        //  3884: iconst_1       
        //  3885: istore_1       
        //  3886: goto            3899
        //  3889: astore          15
        //  3891: goto            3899
        //  3894: astore          15
        //  3896: goto            3891
        //  3899: aload           15
        //  3901: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //  3904: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //  3907: astore          21
        //  3909: new             Ljava/lang/StringBuilder;
        //  3912: dup            
        //  3913: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3916: astore          22
        //  3918: aload           22
        //  3920: ldc_w           "EXCEPTION : "
        //  3923: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3926: pop            
        //  3927: aload           22
        //  3929: aload           15
        //  3931: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3934: pop            
        //  3935: aload           21
        //  3937: aload           22
        //  3939: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3942: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //  3945: iload_1        
        //  3946: ifeq            4061
        //  3949: aload_0        
        //  3950: getfield        oi6.A0:Lbdf;
        //  3953: astore          15
        //  3955: getstatic       snj.a:[Z
        //  3958: iconst_2       
        //  3959: iconst_0       
        //  3960: bastore        
        //  3961: aload_0        
        //  3962: bipush          64
        //  3964: invokevirtual   oi6.l0:(I)Z
        //  3967: istore          13
        //  3969: aload_0        
        //  3970: aload           15
        //  3972: iload           13
        //  3974: invokevirtual   ni6.Z:(Lbdf;Z)V
        //  3977: aload_0        
        //  3978: getfield        qox.u0:Ljava/util/ArrayList;
        //  3981: invokevirtual   java/util/ArrayList.size:()I
        //  3984: istore          5
        //  3986: iconst_0       
        //  3987: istore_2       
        //  3988: iconst_0       
        //  3989: istore_1       
        //  3990: iload_2        
        //  3991: iload           5
        //  3993: if_icmpge       4058
        //  3996: aload_0        
        //  3997: getfield        qox.u0:Ljava/util/ArrayList;
        //  4000: iload_2        
        //  4001: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  4004: checkcast       Lni6;
        //  4007: astore          21
        //  4009: aload           21
        //  4011: aload           15
        //  4013: iload           13
        //  4015: invokevirtual   ni6.Z:(Lbdf;Z)V
        //  4018: aload           21
        //  4020: getfield        ni6.h:I
        //  4023: iconst_m1      
        //  4024: if_icmpne       4044
        //  4027: aload           21
        //  4029: getfield        ni6.i:I
        //  4032: iconst_m1      
        //  4033: if_icmpeq       4039
        //  4036: goto            4044
        //  4039: iconst_0       
        //  4040: istore_3       
        //  4041: goto            4046
        //  4044: iconst_1       
        //  4045: istore_3       
        //  4046: iload_3        
        //  4047: ifeq            4052
        //  4050: iconst_1       
        //  4051: istore_1       
        //  4052: iinc            2, 1
        //  4055: goto            3990
        //  4058: goto            4107
        //  4061: aload_0        
        //  4062: aload_0        
        //  4063: getfield        oi6.A0:Lbdf;
        //  4066: iload           14
        //  4068: invokevirtual   ni6.Z:(Lbdf;Z)V
        //  4071: iconst_0       
        //  4072: istore_1       
        //  4073: iload_1        
        //  4074: iload           9
        //  4076: if_icmpge       4105
        //  4079: aload_0        
        //  4080: getfield        qox.u0:Ljava/util/ArrayList;
        //  4083: iload_1        
        //  4084: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  4087: checkcast       Lni6;
        //  4090: aload_0        
        //  4091: getfield        oi6.A0:Lbdf;
        //  4094: iload           14
        //  4096: invokevirtual   ni6.Z:(Lbdf;Z)V
        //  4099: iinc            1, 1
        //  4102: goto            4073
        //  4105: iconst_0       
        //  4106: istore_1       
        //  4107: iload_1        
        //  4108: istore_3       
        //  4109: iload           4
        //  4111: istore_2       
        //  4112: iload           10
        //  4114: ifeq            4330
        //  4117: iload_1        
        //  4118: istore_3       
        //  4119: iload           4
        //  4121: istore_2       
        //  4122: iload           11
        //  4124: bipush          8
        //  4126: if_icmpge       4330
        //  4129: iload_1        
        //  4130: istore_3       
        //  4131: iload           4
        //  4133: istore_2       
        //  4134: getstatic       snj.a:[Z
        //  4137: iconst_2       
        //  4138: baload         
        //  4139: ifeq            4330
        //  4142: iconst_0       
        //  4143: istore_3       
        //  4144: iconst_0       
        //  4145: istore_2       
        //  4146: iconst_0       
        //  4147: istore          5
        //  4149: iload_3        
        //  4150: iload           9
        //  4152: if_icmpge       4216
        //  4155: aload_0        
        //  4156: getfield        qox.u0:Ljava/util/ArrayList;
        //  4159: iload_3        
        //  4160: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  4163: checkcast       Lni6;
        //  4166: astore          15
        //  4168: aload           15
        //  4170: getfield        ni6.a0:I
        //  4173: istore          6
        //  4175: iload           5
        //  4177: aload           15
        //  4179: invokevirtual   ni6.x:()I
        //  4182: iload           6
        //  4184: iadd           
        //  4185: invokestatic    java/lang/Math.max:(II)I
        //  4188: istore          5
        //  4190: aload           15
        //  4192: getfield        ni6.b0:I
        //  4195: istore          6
        //  4197: iload_2        
        //  4198: aload           15
        //  4200: invokevirtual   ni6.q:()I
        //  4203: iload           6
        //  4205: iadd           
        //  4206: invokestatic    java/lang/Math.max:(II)I
        //  4209: istore_2       
        //  4210: iinc            3, 1
        //  4213: goto            4149
        //  4216: aload_0        
        //  4217: getfield        ni6.d0:I
        //  4220: iload           5
        //  4222: invokestatic    java/lang/Math.max:(II)I
        //  4225: istore_3       
        //  4226: aload_0        
        //  4227: getfield        ni6.e0:I
        //  4230: iload_2        
        //  4231: invokestatic    java/lang/Math.max:(II)I
        //  4234: istore          12
        //  4236: iload_1        
        //  4237: istore          6
        //  4239: iload           4
        //  4241: istore          5
        //  4243: aload           17
        //  4245: aload           19
        //  4247: if_acmpne       4284
        //  4250: iload_1        
        //  4251: istore          6
        //  4253: iload           4
        //  4255: istore          5
        //  4257: aload_0        
        //  4258: invokevirtual   ni6.x:()I
        //  4261: iload_3        
        //  4262: if_icmpge       4284
        //  4265: aload_0        
        //  4266: iload_3        
        //  4267: invokevirtual   ni6.X:(I)V
        //  4270: aload_0        
        //  4271: getfield        ni6.U:[Lni6$a;
        //  4274: iconst_0       
        //  4275: aload           19
        //  4277: aastore        
        //  4278: iconst_1       
        //  4279: istore          6
        //  4281: iconst_1       
        //  4282: istore          5
        //  4284: iload           6
        //  4286: istore_3       
        //  4287: iload           5
        //  4289: istore_2       
        //  4290: aload           18
        //  4292: aload           19
        //  4294: if_acmpne       4330
        //  4297: iload           6
        //  4299: istore_3       
        //  4300: iload           5
        //  4302: istore_2       
        //  4303: aload_0        
        //  4304: invokevirtual   ni6.q:()I
        //  4307: iload           12
        //  4309: if_icmpge       4330
        //  4312: aload_0        
        //  4313: iload           12
        //  4315: invokevirtual   ni6.S:(I)V
        //  4318: aload_0        
        //  4319: getfield        ni6.U:[Lni6$a;
        //  4322: iconst_1       
        //  4323: aload           19
        //  4325: aastore        
        //  4326: iconst_1       
        //  4327: istore_3       
        //  4328: iconst_1       
        //  4329: istore_2       
        //  4330: aload_0        
        //  4331: getfield        ni6.d0:I
        //  4334: aload_0        
        //  4335: invokevirtual   ni6.x:()I
        //  4338: invokestatic    java/lang/Math.max:(II)I
        //  4341: istore          4
        //  4343: iload_3        
        //  4344: istore_1       
        //  4345: iload           4
        //  4347: aload_0        
        //  4348: invokevirtual   ni6.x:()I
        //  4351: if_icmple       4372
        //  4354: aload_0        
        //  4355: iload           4
        //  4357: invokevirtual   ni6.X:(I)V
        //  4360: aload_0        
        //  4361: getfield        ni6.U:[Lni6$a;
        //  4364: iconst_0       
        //  4365: aload           16
        //  4367: aastore        
        //  4368: iconst_1       
        //  4369: istore_1       
        //  4370: iconst_1       
        //  4371: istore_2       
        //  4372: aload_0        
        //  4373: getfield        ni6.e0:I
        //  4376: aload_0        
        //  4377: invokevirtual   ni6.q:()I
        //  4380: invokestatic    java/lang/Math.max:(II)I
        //  4383: istore_3       
        //  4384: iload_3        
        //  4385: aload_0        
        //  4386: invokevirtual   ni6.q:()I
        //  4389: if_icmple       4412
        //  4392: aload_0        
        //  4393: iload_3        
        //  4394: invokevirtual   ni6.S:(I)V
        //  4397: aload_0        
        //  4398: getfield        ni6.U:[Lni6$a;
        //  4401: iconst_1       
        //  4402: aload           16
        //  4404: aastore        
        //  4405: iconst_1       
        //  4406: istore_1       
        //  4407: iconst_1       
        //  4408: istore_2       
        //  4409: goto            4412
        //  4412: iload_1        
        //  4413: istore_3       
        //  4414: iload_2        
        //  4415: istore          6
        //  4417: iload_2        
        //  4418: ifne            4562
        //  4421: iload_1        
        //  4422: istore          5
        //  4424: iload_2        
        //  4425: istore          4
        //  4427: aload_0        
        //  4428: getfield        ni6.U:[Lni6$a;
        //  4431: iconst_0       
        //  4432: aaload         
        //  4433: aload           19
        //  4435: if_acmpne       4489
        //  4438: iload_1        
        //  4439: istore          5
        //  4441: iload_2        
        //  4442: istore          4
        //  4444: iload           7
        //  4446: ifle            4489
        //  4449: iload_1        
        //  4450: istore          5
        //  4452: iload_2        
        //  4453: istore          4
        //  4455: aload_0        
        //  4456: invokevirtual   ni6.x:()I
        //  4459: iload           7
        //  4461: if_icmple       4489
        //  4464: aload_0        
        //  4465: iconst_1       
        //  4466: putfield        oi6.I0:Z
        //  4469: aload_0        
        //  4470: getfield        ni6.U:[Lni6$a;
        //  4473: iconst_0       
        //  4474: aload           16
        //  4476: aastore        
        //  4477: aload_0        
        //  4478: iload           7
        //  4480: invokevirtual   ni6.X:(I)V
        //  4483: iconst_1       
        //  4484: istore          5
        //  4486: iconst_1       
        //  4487: istore          4
        //  4489: iload           5
        //  4491: istore_3       
        //  4492: iload           4
        //  4494: istore          6
        //  4496: aload_0        
        //  4497: getfield        ni6.U:[Lni6$a;
        //  4500: iconst_1       
        //  4501: aaload         
        //  4502: aload           19
        //  4504: if_acmpne       4562
        //  4507: iload           5
        //  4509: istore_3       
        //  4510: iload           4
        //  4512: istore          6
        //  4514: iload           8
        //  4516: ifle            4562
        //  4519: iload           5
        //  4521: istore_3       
        //  4522: iload           4
        //  4524: istore          6
        //  4526: aload_0        
        //  4527: invokevirtual   ni6.q:()I
        //  4530: iload           8
        //  4532: if_icmple       4562
        //  4535: aload_0        
        //  4536: iconst_1       
        //  4537: putfield        oi6.J0:Z
        //  4540: aload_0        
        //  4541: getfield        ni6.U:[Lni6$a;
        //  4544: iconst_1       
        //  4545: aload           16
        //  4547: aastore        
        //  4548: aload_0        
        //  4549: iload           8
        //  4551: invokevirtual   ni6.S:(I)V
        //  4554: iconst_1       
        //  4555: istore_1       
        //  4556: iconst_1       
        //  4557: istore          4
        //  4559: goto            4568
        //  4562: iload           6
        //  4564: istore          4
        //  4566: iload_3        
        //  4567: istore_1       
        //  4568: iload           11
        //  4570: bipush          8
        //  4572: if_icmple       4580
        //  4575: iconst_0       
        //  4576: istore_1       
        //  4577: goto            4580
        //  4580: iload           11
        //  4582: istore_2       
        //  4583: goto            3472
        //  4586: aload_0        
        //  4587: aload           20
        //  4589: putfield        qox.u0:Ljava/util/ArrayList;
        //  4592: iload           4
        //  4594: ifeq            4615
        //  4597: aload_0        
        //  4598: getfield        ni6.U:[Lni6$a;
        //  4601: astore          15
        //  4603: aload           15
        //  4605: iconst_0       
        //  4606: aload           17
        //  4608: aastore        
        //  4609: aload           15
        //  4611: iconst_1       
        //  4612: aload           18
        //  4614: aastore        
        //  4615: aload_0        
        //  4616: aload_0        
        //  4617: getfield        oi6.A0:Lbdf;
        //  4620: getfield        bdf.l:Lbb7;
        //  4623: invokevirtual   qox.M:(Lbb7;)V
        //  4626: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3481   3506   3894   3899   Ljava/lang/Exception;
        //  3514   3527   3542   3547   Ljava/lang/Exception;
        //  3527   3536   3889   3891   Ljava/lang/Exception;
        //  3547   3555   3889   3891   Ljava/lang/Exception;
        //  3555   3561   3879   3884   Ljava/lang/Exception;
        //  3566   3616   3879   3884   Ljava/lang/Exception;
        //  3616   3627   3857   3859   Ljava/lang/Exception;
        //  3627   3632   3874   3879   Ljava/lang/Exception;
        //  3635   3641   3857   3859   Ljava/lang/Exception;
        //  3646   3703   3857   3859   Ljava/lang/Exception;
        //  3703   3708   3874   3879   Ljava/lang/Exception;
        //  3708   3714   3857   3859   Ljava/lang/Exception;
        //  3719   3776   3857   3859   Ljava/lang/Exception;
        //  3776   3781   3874   3879   Ljava/lang/Exception;
        //  3781   3787   3857   3859   Ljava/lang/Exception;
        //  3792   3849   3857   3859   Ljava/lang/Exception;
        //  3849   3854   3874   3879   Ljava/lang/Exception;
        //  3862   3869   3874   3879   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_3635:
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
    
    public final void c0(final ni6 ni6, int n) {
        if (n == 0) {
            n = this.D0;
            final co3[] g0 = this.G0;
            if (n + 1 >= g0.length) {
                this.G0 = Arrays.copyOf(g0, g0.length * 2);
            }
            final co3[] g2 = this.G0;
            n = this.D0;
            g2[n] = new co3(ni6, 0, this.z0);
            this.D0 = n + 1;
        }
        else if (n == 1) {
            n = this.E0;
            final co3[] f0 = this.F0;
            if (n + 1 >= f0.length) {
                this.F0 = Arrays.copyOf(f0, f0.length * 2);
            }
            final co3[] f2 = this.F0;
            n = this.E0;
            f2[n] = new co3(ni6, 1, this.z0);
            this.E0 = n + 1;
        }
    }
    
    public final void d0(final bdf bdf) {
        final ni6$a d0 = ni6$a.D0;
        final ni6$a e0 = ni6$a.E0;
        final boolean l0 = this.l0(64);
        ((ni6)this).f(bdf, l0);
        final int size = super.u0.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final ni6 ni6 = super.u0.get(i);
            final boolean[] t = ni6.T;
            t[1] = (t[0] = false);
            if (ni6 instanceof ni1) {
                b = true;
            }
            ++i;
        }
        if (b) {
            for (int j = 0; j < size; ++j) {
                final ni6 ni7 = super.u0.get(j);
                if (ni7 instanceof ni1) {
                    final ni1 ni8 = (ni1)ni7;
                    for (int k = 0; k < ni8.v0; ++k) {
                        final ni6 ni9 = ni8.u0[k];
                        if (ni8.x0 || ni9.g()) {
                            final int w0 = ni8.w0;
                            if (w0 != 0 && w0 != 1) {
                                if (w0 == 2 || w0 == 3) {
                                    ni9.T[1] = true;
                                }
                            }
                            else {
                                ni9.T[0] = true;
                            }
                        }
                    }
                }
            }
        }
        this.O0.clear();
        for (int n = 0; n < size; ++n) {
            final ni6 ni10 = super.u0.get(n);
            if (ni10.e()) {
                if (ni10 instanceof jex) {
                    this.O0.add(ni10);
                }
                else {
                    ni10.f(bdf, l0);
                }
            }
        }
        while (this.O0.size() > 0) {
            final int size2 = this.O0.size();
        Label_0423:
            for (final jex jex : this.O0) {
                final HashSet<ni6> o0 = this.O0;
                int n2 = 0;
                while (true) {
                    while (n2 < ((ajc)jex).v0) {
                        if (o0.contains(((ajc)jex).u0[n2])) {
                            final boolean b2 = true;
                            if (b2) {
                                ((ni6)jex).f(bdf, l0);
                                this.O0.remove(jex);
                                break Label_0423;
                            }
                            continue Label_0423;
                        }
                        else {
                            ++n2;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
            if (size2 == this.O0.size()) {
                final Iterator<ni6> iterator2 = this.O0.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().f(bdf, l0);
                }
                this.O0.clear();
            }
        }
        if (bdf.p) {
            final HashSet<ni6> set = new HashSet<ni6>();
            for (int n3 = 0; n3 < size; ++n3) {
                final ni6 ni11 = super.u0.get(n3);
                if (!ni11.e()) {
                    set.add(ni11);
                }
            }
            int n4;
            if (((ni6)this).U[0] == e0) {
                n4 = 0;
            }
            else {
                n4 = 1;
            }
            ((ni6)this).d(this, bdf, (HashSet)set, n4, false);
            for (final ni6 ni12 : set) {
                snj.a(this, bdf, ni12);
                ni12.f(bdf, l0);
            }
        }
        else {
            for (int n5 = 0; n5 < size; ++n5) {
                final ni6 ni13 = super.u0.get(n5);
                if (ni13 instanceof oi6) {
                    final ni6$a[] u = ni13.U;
                    final ni6$a ni6$a = u[0];
                    final ni6$a ni6$a2 = u[1];
                    if (ni6$a == e0) {
                        ni13.T(d0);
                    }
                    if (ni6$a2 == e0) {
                        ni13.W(d0);
                    }
                    ni13.f(bdf, l0);
                    if (ni6$a == e0) {
                        ni13.T(ni6$a);
                    }
                    if (ni6$a2 == e0) {
                        ni13.W(ni6$a2);
                    }
                }
                else {
                    snj.a(this, bdf, ni13);
                    if (!ni13.e()) {
                        ni13.f(bdf, l0);
                    }
                }
            }
        }
        if (this.D0 > 0) {
            bo3.a(this, bdf, (ArrayList)null, 0);
        }
        if (this.E0 > 0) {
            bo3.a(this, bdf, (ArrayList)null, 1);
        }
    }
    
    public final void e0(final ei6 ei6) {
        final WeakReference<ei6> n0 = this.N0;
        if (n0 == null || n0.get() == null || ei6.d() > this.N0.get().d()) {
            this.N0 = new WeakReference<ei6>(ei6);
        }
    }
    
    public final void f0(final ei6 ei6) {
        final WeakReference<ei6> l0 = this.L0;
        if (l0 == null || l0.get() == null || ei6.d() > this.L0.get().d()) {
            this.L0 = new WeakReference<ei6>(ei6);
        }
    }
    
    public final void g0(final ei6 ei6) {
        final WeakReference<ei6> m0 = this.M0;
        if (m0 == null || m0.get() == null || ei6.d() > this.M0.get().d()) {
            this.M0 = new WeakReference<ei6>(ei6);
        }
    }
    
    public final void h0(final ei6 ei6) {
        final WeakReference<ei6> k0 = this.K0;
        if (k0 == null || k0.get() == null || ei6.d() > this.K0.get().d()) {
            this.K0 = new WeakReference<ei6>(ei6);
        }
    }
    
    public final boolean i0(final boolean b, final int n) {
        final so8 w0 = this.w0;
        final ni6$a g0 = ni6$a.G0;
        final ni6$a e0 = ni6$a.E0;
        final ni6$a d0 = ni6$a.D0;
        final boolean b2 = true;
        final boolean b3 = b & true;
        final ni6$a p2 = ((ni6)w0.a).p(0);
        final ni6$a p3 = ((ni6)w0.a).p(1);
        final int y = ((ni6)w0.a).y();
        final int z = ((ni6)w0.a).z();
        Label_0279: {
            if (b3 && (p2 == e0 || p3 == e0)) {
                final Iterator iterator = w0.e.iterator();
                while (true) {
                    sox sox;
                    do {
                        final boolean b4 = b3;
                        if (iterator.hasNext()) {
                            sox = (sox)iterator.next();
                        }
                        else if (n == 0) {
                            if (b4 && p2 == e0) {
                                ((ni6)w0.a).T(d0);
                                final oi6 a = w0.a;
                                ((ni6)a).X(w0.d(a, 0));
                                final oi6 a2 = w0.a;
                                ((sox)((ni6)a2).d).e.d(((ni6)a2).x());
                            }
                            break Label_0279;
                        }
                        else {
                            if (b4 && p3 == e0) {
                                ((ni6)w0.a).W(d0);
                                final oi6 a3 = w0.a;
                                ((ni6)a3).S(w0.d(a3, 1));
                                final oi6 a4 = w0.a;
                                ((ni6)a4).e.e.d(((ni6)a4).q());
                            }
                            break Label_0279;
                        }
                    } while (sox.f != n || sox.k());
                    final boolean b4 = false;
                    continue;
                }
            }
        }
        boolean b5 = false;
        Label_0444: {
            Label_0442: {
                if (n == 0) {
                    final oi6 a5 = w0.a;
                    final ni6$a[] u = ((ni6)a5).U;
                    if (u[0] == d0 || u[0] == g0) {
                        final int n2 = ((ni6)a5).x() + y;
                        ((sox)((ni6)w0.a).d).i.d(n2);
                        ((sox)((ni6)w0.a).d).e.d(n2 - y);
                        break Label_0442;
                    }
                }
                else {
                    final oi6 a6 = w0.a;
                    final ni6$a[] u2 = ((ni6)a6).U;
                    if (u2[1] == d0 || u2[1] == g0) {
                        final int n3 = ((ni6)a6).q() + z;
                        ((ni6)w0.a).e.i.d(n3);
                        ((ni6)w0.a).e.e.d(n3 - z);
                        break Label_0442;
                    }
                }
                b5 = false;
                break Label_0444;
            }
            b5 = true;
        }
        w0.g();
        for (final sox sox2 : w0.e) {
            if (sox2.f != n) {
                continue;
            }
            if (sox2.b == w0.a && !sox2.g) {
                continue;
            }
            sox2.e();
        }
        final Iterator iterator3 = w0.e.iterator();
        boolean b6 = false;
        Label_0641: {
            while (true) {
                b6 = b2;
                if (!iterator3.hasNext()) {
                    break Label_0641;
                }
                final sox sox3 = (sox)iterator3.next();
                if (sox3.f != n) {
                    continue;
                }
                if (!b5 && sox3.b == w0.a) {
                    continue;
                }
                if (!sox3.h.j) {
                    break;
                }
                if (!sox3.i.j) {
                    break;
                }
                if (!(sox3 instanceof do3) && !((to8)sox3.e).j) {
                    break;
                }
            }
            b6 = false;
        }
        ((ni6)w0.a).T(p2);
        ((ni6)w0.a).W(p3);
        return b6;
    }
    
    public final void j0() {
        this.w0.b = true;
    }
    
    public final boolean l0(final int n) {
        return (this.H0 & n) == n;
    }
    
    public final void m0(final fs1$b fs1$b) {
        this.y0 = fs1$b;
        this.w0.f = fs1$b;
    }
    
    public final void n0(final int h0) {
        this.H0 = h0;
        bdf.p = this.l0(512);
    }
    
    public final void o0() {
        this.v0.c(this);
    }
    
    public final void u(final StringBuilder sb) {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(((ni6)this).j);
        sb2.append(":{\n");
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("  actualWidth:");
        sb3.append(((ni6)this).W);
        sb.append(sb3.toString());
        sb.append("\n");
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("  actualHeight:");
        sb4.append(((ni6)this).X);
        sb.append(sb4.toString());
        sb.append("\n");
        final Iterator iterator = super.u0.iterator();
        while (iterator.hasNext()) {
            ((ni6)iterator.next()).u(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
