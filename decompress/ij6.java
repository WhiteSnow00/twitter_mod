import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashSet;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ij6 extends ynx
{
    public pdf A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public uo3[] F0;
    public uo3[] G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public WeakReference<yi6> K0;
    public WeakReference<yi6> L0;
    public WeakReference<yi6> M0;
    public WeakReference<yi6> N0;
    public HashSet<hj6> O0;
    public js1.a P0;
    public js1 v0;
    public kp8 w0;
    public int x0;
    public js1.b y0;
    public boolean z0;
    
    public ij6() {
        this.v0 = new js1(this);
        this.w0 = new kp8(this);
        this.y0 = null;
        this.z0 = false;
        this.A0 = new pdf();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new uo3[4];
        this.G0 = new uo3[4];
        this.H0 = 257;
        this.I0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new HashSet<hj6>();
        this.P0 = new js1.a();
    }
    
    public static boolean k0(final hj6 hj6, final js1.b b, final js1.a a) {
        final hj6$a d0 = hj6$a.D0;
        final hj6$a c0 = hj6$a.C0;
        if (b == null) {
            return false;
        }
        if (hj6.i0 != 8 && !(hj6 instanceof bbc) && !(hj6 instanceof si1)) {
            final hj6$a[] u = hj6.U;
            a.a = u[0];
            a.b = u[1];
            a.c = hj6.x();
            a.d = hj6.q();
            a.i = false;
            a.j = 0;
            final hj6$a a2 = a.a;
            final hj6$a e0 = hj6$a.E0;
            final boolean b2 = a2 == e0;
            final boolean b3 = a.b == e0;
            final boolean b4 = b2 && hj6.Y > 0.0f;
            final boolean b5 = b3 && hj6.Y > 0.0f;
            int n;
            if ((n = (b2 ? 1 : 0)) != 0) {
                n = (b2 ? 1 : 0);
                if (hj6.A(0)) {
                    n = (b2 ? 1 : 0);
                    if (hj6.r == 0) {
                        n = (b2 ? 1 : 0);
                        if (!b4) {
                            a.a = d0;
                            if (b3 && hj6.s == 0) {
                                a.a = c0;
                            }
                            n = 0;
                        }
                    }
                }
            }
            boolean b6;
            if (b6 = b3) {
                b6 = b3;
                if (hj6.A(1)) {
                    b6 = b3;
                    if (hj6.s == 0) {
                        b6 = b3;
                        if (!b5) {
                            a.b = d0;
                            if (n != 0 && hj6.r == 0) {
                                a.b = c0;
                            }
                            b6 = false;
                        }
                    }
                }
            }
            if (hj6.H()) {
                a.a = c0;
                n = 0;
            }
            if (hj6.I()) {
                a.b = c0;
                b6 = false;
            }
            if (b4) {
                if (hj6.t[0] == 4) {
                    a.a = c0;
                }
                else if (!b6) {
                    int n2;
                    if (a.b == c0) {
                        n2 = a.d;
                    }
                    else {
                        a.a = d0;
                        ((ConstraintLayout.b)b).b(hj6, a);
                        n2 = a.f;
                    }
                    a.a = c0;
                    a.c = (int)(hj6.Y * n2);
                }
            }
            if (b5) {
                if (hj6.t[1] == 4) {
                    a.b = c0;
                }
                else if (n == 0) {
                    int n3;
                    if (a.a == c0) {
                        n3 = a.c;
                    }
                    else {
                        a.b = d0;
                        ((ConstraintLayout.b)b).b(hj6, a);
                        n3 = a.e;
                    }
                    a.b = c0;
                    if (hj6.Z == -1) {
                        a.d = (int)(n3 / hj6.Y);
                    }
                    else {
                        a.d = (int)(hj6.Y * n3);
                    }
                }
            }
            ((ConstraintLayout.b)b).b(hj6, a);
            hj6.X(a.e);
            hj6.S(a.f);
            hj6.E = a.h;
            hj6.P(a.g);
            a.j = 0;
            return a.i;
        }
        a.e = 0;
        a.f = 0;
        return false;
    }
    
    @Override
    public final void J() {
        this.A0.u();
        this.B0 = 0;
        this.C0 = 0;
        super.J();
    }
    
    public final void Y(final boolean b, final boolean b2) {
        super.Y(b, b2);
        for (int size = super.u0.size(), i = 0; i < size; ++i) {
            super.u0.get(i).Y(b, b2);
        }
    }
    
    @Override
    public final void a0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: getstatic       hj6$a.D0:Lhj6$a;
        //     7: astore_2       
        //     8: getstatic       hj6$a.C0:Lhj6$a;
        //    11: astore_3       
        //    12: iconst_0       
        //    13: istore          4
        //    15: aload_0        
        //    16: iconst_0       
        //    17: putfield        hj6.a0:I
        //    20: aload_0        
        //    21: iconst_0       
        //    22: putfield        hj6.b0:I
        //    25: aload_0        
        //    26: iconst_0       
        //    27: putfield        ij6.I0:Z
        //    30: aload_0        
        //    31: iconst_0       
        //    32: putfield        ij6.J0:Z
        //    35: aload_0        
        //    36: getfield        ynx.u0:Ljava/util/ArrayList;
        //    39: invokevirtual   java/util/ArrayList.size:()I
        //    42: istore          5
        //    44: iload           5
        //    46: istore          6
        //    48: iconst_0       
        //    49: aload_0        
        //    50: invokevirtual   hj6.x:()I
        //    53: invokestatic    java/lang/Math.max:(II)I
        //    56: istore          7
        //    58: iconst_0       
        //    59: aload_0        
        //    60: invokevirtual   hj6.q:()I
        //    63: invokestatic    java/lang/Math.max:(II)I
        //    66: istore          8
        //    68: aload_0        
        //    69: getfield        hj6.U:[Lhj6$a;
        //    72: astore          9
        //    74: aload           9
        //    76: iconst_1       
        //    77: aaload         
        //    78: astore          10
        //    80: aload           9
        //    82: iconst_0       
        //    83: aaload         
        //    84: astore          11
        //    86: aload_0        
        //    87: getfield        ij6.x0:I
        //    90: ifne            1253
        //    93: aload_0        
        //    94: getfield        ij6.H0:I
        //    97: iconst_1       
        //    98: invokestatic    nnj.b:(II)Z
        //   101: ifeq            1253
        //   104: aload_0        
        //   105: getfield        ij6.y0:Ljs1$b;
        //   108: astore          12
        //   110: aload_0        
        //   111: getfield        hj6.U:[Lhj6$a;
        //   114: astore          13
        //   116: aload           13
        //   118: iconst_0       
        //   119: aaload         
        //   120: astore          9
        //   122: aload           13
        //   124: iconst_1       
        //   125: aaload         
        //   126: astore          14
        //   128: aload_0        
        //   129: invokevirtual   hj6.L:()V
        //   132: aload_0        
        //   133: getfield        ynx.u0:Ljava/util/ArrayList;
        //   136: astore          13
        //   138: aload           13
        //   140: invokevirtual   java/util/ArrayList.size:()I
        //   143: istore          15
        //   145: iconst_0       
        //   146: istore          16
        //   148: iload           16
        //   150: iload           15
        //   152: if_icmpge       174
        //   155: aload           13
        //   157: iload           16
        //   159: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   162: checkcast       Lhj6;
        //   165: invokevirtual   hj6.L:()V
        //   168: iinc            16, 1
        //   171: goto            148
        //   174: aload_0        
        //   175: getfield        ij6.z0:Z
        //   178: istore          17
        //   180: aload           9
        //   182: aload_3        
        //   183: if_acmpne       198
        //   186: aload_0        
        //   187: iconst_0       
        //   188: aload_0        
        //   189: invokevirtual   hj6.x:()I
        //   192: invokevirtual   hj6.Q:(II)V
        //   195: goto            211
        //   198: aload_0        
        //   199: getfield        hj6.J:Lyi6;
        //   202: iconst_0       
        //   203: invokevirtual   yi6.m:(I)V
        //   206: aload_0        
        //   207: iconst_0       
        //   208: putfield        hj6.a0:I
        //   211: iconst_0       
        //   212: istore          18
        //   214: iconst_0       
        //   215: istore          19
        //   217: iload           4
        //   219: istore          16
        //   221: iload           16
        //   223: iload           15
        //   225: if_icmpge       423
        //   228: aload           13
        //   230: iload           16
        //   232: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   235: checkcast       Lhj6;
        //   238: astore          9
        //   240: aload           9
        //   242: instanceof      Lbbc;
        //   245: ifeq            367
        //   248: aload           9
        //   250: checkcast       Lbbc;
        //   253: astore          9
        //   255: iload           18
        //   257: istore          20
        //   259: iload           19
        //   261: istore          4
        //   263: aload           9
        //   265: getfield        bbc.y0:I
        //   268: iconst_1       
        //   269: if_icmpne       409
        //   272: aload           9
        //   274: getfield        bbc.v0:I
        //   277: istore          4
        //   279: iload           4
        //   281: iconst_m1      
        //   282: if_icmpeq       295
        //   285: aload           9
        //   287: iload           4
        //   289: invokevirtual   bbc.a0:(I)V
        //   292: goto            357
        //   295: aload           9
        //   297: getfield        bbc.w0:I
        //   300: iconst_m1      
        //   301: if_icmpeq       329
        //   304: aload_0        
        //   305: invokevirtual   hj6.H:()Z
        //   308: ifeq            329
        //   311: aload           9
        //   313: aload_0        
        //   314: invokevirtual   hj6.x:()I
        //   317: aload           9
        //   319: getfield        bbc.w0:I
        //   322: isub           
        //   323: invokevirtual   bbc.a0:(I)V
        //   326: goto            357
        //   329: aload_0        
        //   330: invokevirtual   hj6.H:()Z
        //   333: ifeq            357
        //   336: aload           9
        //   338: aload           9
        //   340: getfield        bbc.u0:F
        //   343: aload_0        
        //   344: invokevirtual   hj6.x:()I
        //   347: i2f            
        //   348: fmul           
        //   349: ldc_w           0.5
        //   352: fadd           
        //   353: f2i            
        //   354: invokevirtual   bbc.a0:(I)V
        //   357: iconst_1       
        //   358: istore          20
        //   360: iload           19
        //   362: istore          4
        //   364: goto            409
        //   367: iload           18
        //   369: istore          20
        //   371: iload           19
        //   373: istore          4
        //   375: aload           9
        //   377: instanceof      Lsi1;
        //   380: ifeq            409
        //   383: iload           18
        //   385: istore          20
        //   387: iload           19
        //   389: istore          4
        //   391: aload           9
        //   393: checkcast       Lsi1;
        //   396: invokevirtual   si1.c0:()I
        //   399: ifne            409
        //   402: iconst_1       
        //   403: istore          4
        //   405: iload           18
        //   407: istore          20
        //   409: iinc            16, 1
        //   412: iload           20
        //   414: istore          18
        //   416: iload           4
        //   418: istore          19
        //   420: goto            221
        //   423: iload           7
        //   425: istore          16
        //   427: iload           8
        //   429: istore          4
        //   431: aload           10
        //   433: astore          9
        //   435: iload           18
        //   437: ifeq            505
        //   440: iconst_0       
        //   441: istore          8
        //   443: iload           8
        //   445: iload           15
        //   447: if_icmpge       505
        //   450: aload           13
        //   452: iload           8
        //   454: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   457: checkcast       Lhj6;
        //   460: astore          10
        //   462: aload           10
        //   464: instanceof      Lbbc;
        //   467: ifeq            499
        //   470: aload           10
        //   472: checkcast       Lbbc;
        //   475: astore          10
        //   477: aload           10
        //   479: getfield        bbc.y0:I
        //   482: iconst_1       
        //   483: if_icmpne       499
        //   486: iconst_0       
        //   487: aload           10
        //   489: aload           12
        //   491: iload           17
        //   493: invokestatic    ix8.b:(ILhj6;Ljs1$b;Z)V
        //   496: goto            499
        //   499: iinc            8, 1
        //   502: goto            443
        //   505: iconst_0       
        //   506: aload_0        
        //   507: aload           12
        //   509: iload           17
        //   511: invokestatic    ix8.b:(ILhj6;Ljs1$b;Z)V
        //   514: iload           19
        //   516: ifeq            588
        //   519: iconst_0       
        //   520: istore          8
        //   522: iload           8
        //   524: iload           15
        //   526: if_icmpge       588
        //   529: aload           13
        //   531: iload           8
        //   533: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   536: checkcast       Lhj6;
        //   539: astore          10
        //   541: aload           10
        //   543: instanceof      Lsi1;
        //   546: ifeq            582
        //   549: aload           10
        //   551: checkcast       Lsi1;
        //   554: astore          10
        //   556: aload           10
        //   558: invokevirtual   si1.c0:()I
        //   561: ifne            582
        //   564: aload           10
        //   566: invokevirtual   si1.b0:()Z
        //   569: ifeq            582
        //   572: iconst_1       
        //   573: aload           10
        //   575: aload           12
        //   577: iload           17
        //   579: invokestatic    ix8.b:(ILhj6;Ljs1$b;Z)V
        //   582: iinc            8, 1
        //   585: goto            522
        //   588: aload           14
        //   590: aload_3        
        //   591: if_acmpne       606
        //   594: aload_0        
        //   595: iconst_0       
        //   596: aload_0        
        //   597: invokevirtual   hj6.q:()I
        //   600: invokevirtual   hj6.R:(II)V
        //   603: goto            619
        //   606: aload_0        
        //   607: getfield        hj6.K:Lyi6;
        //   610: iconst_0       
        //   611: invokevirtual   yi6.m:(I)V
        //   614: aload_0        
        //   615: iconst_0       
        //   616: putfield        hj6.b0:I
        //   619: iconst_0       
        //   620: istore          19
        //   622: iconst_0       
        //   623: istore          7
        //   625: iconst_0       
        //   626: istore          8
        //   628: iload           7
        //   630: iload           15
        //   632: if_icmpge       830
        //   635: aload           13
        //   637: iload           7
        //   639: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   642: checkcast       Lhj6;
        //   645: astore          10
        //   647: aload           10
        //   649: instanceof      Lbbc;
        //   652: ifeq            773
        //   655: aload           10
        //   657: checkcast       Lbbc;
        //   660: astore          10
        //   662: iload           19
        //   664: istore          20
        //   666: iload           8
        //   668: istore          18
        //   670: aload           10
        //   672: getfield        bbc.y0:I
        //   675: ifne            816
        //   678: aload           10
        //   680: getfield        bbc.v0:I
        //   683: istore          19
        //   685: iload           19
        //   687: iconst_m1      
        //   688: if_icmpeq       701
        //   691: aload           10
        //   693: iload           19
        //   695: invokevirtual   bbc.a0:(I)V
        //   698: goto            763
        //   701: aload           10
        //   703: getfield        bbc.w0:I
        //   706: iconst_m1      
        //   707: if_icmpeq       735
        //   710: aload_0        
        //   711: invokevirtual   hj6.I:()Z
        //   714: ifeq            735
        //   717: aload           10
        //   719: aload_0        
        //   720: invokevirtual   hj6.q:()I
        //   723: aload           10
        //   725: getfield        bbc.w0:I
        //   728: isub           
        //   729: invokevirtual   bbc.a0:(I)V
        //   732: goto            763
        //   735: aload_0        
        //   736: invokevirtual   hj6.I:()Z
        //   739: ifeq            763
        //   742: aload           10
        //   744: aload           10
        //   746: getfield        bbc.u0:F
        //   749: aload_0        
        //   750: invokevirtual   hj6.q:()I
        //   753: i2f            
        //   754: fmul           
        //   755: ldc_w           0.5
        //   758: fadd           
        //   759: f2i            
        //   760: invokevirtual   bbc.a0:(I)V
        //   763: iconst_1       
        //   764: istore          20
        //   766: iload           8
        //   768: istore          18
        //   770: goto            816
        //   773: iload           19
        //   775: istore          20
        //   777: iload           8
        //   779: istore          18
        //   781: aload           10
        //   783: instanceof      Lsi1;
        //   786: ifeq            816
        //   789: iload           19
        //   791: istore          20
        //   793: iload           8
        //   795: istore          18
        //   797: aload           10
        //   799: checkcast       Lsi1;
        //   802: invokevirtual   si1.c0:()I
        //   805: iconst_1       
        //   806: if_icmpne       816
        //   809: iconst_1       
        //   810: istore          18
        //   812: iload           19
        //   814: istore          20
        //   816: iinc            7, 1
        //   819: iload           20
        //   821: istore          19
        //   823: iload           18
        //   825: istore          8
        //   827: goto            628
        //   830: iload           19
        //   832: ifeq            894
        //   835: iconst_0       
        //   836: istore          7
        //   838: iload           7
        //   840: iload           15
        //   842: if_icmpge       894
        //   845: aload           13
        //   847: iload           7
        //   849: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   852: checkcast       Lhj6;
        //   855: astore          10
        //   857: aload           10
        //   859: instanceof      Lbbc;
        //   862: ifeq            888
        //   865: aload           10
        //   867: checkcast       Lbbc;
        //   870: astore          10
        //   872: aload           10
        //   874: getfield        bbc.y0:I
        //   877: ifne            888
        //   880: iconst_1       
        //   881: aload           10
        //   883: aload           12
        //   885: invokestatic    ix8.g:(ILhj6;Ljs1$b;)V
        //   888: iinc            7, 1
        //   891: goto            838
        //   894: iconst_0       
        //   895: aload_0        
        //   896: aload           12
        //   898: invokestatic    ix8.g:(ILhj6;Ljs1$b;)V
        //   901: iload           8
        //   903: ifeq            974
        //   906: iconst_0       
        //   907: istore          8
        //   909: iload           8
        //   911: iload           15
        //   913: if_icmpge       974
        //   916: aload           13
        //   918: iload           8
        //   920: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   923: checkcast       Lhj6;
        //   926: astore          10
        //   928: aload           10
        //   930: instanceof      Lsi1;
        //   933: ifeq            968
        //   936: aload           10
        //   938: checkcast       Lsi1;
        //   941: astore          10
        //   943: aload           10
        //   945: invokevirtual   si1.c0:()I
        //   948: iconst_1       
        //   949: if_icmpne       968
        //   952: aload           10
        //   954: invokevirtual   si1.b0:()Z
        //   957: ifeq            968
        //   960: iconst_1       
        //   961: aload           10
        //   963: aload           12
        //   965: invokestatic    ix8.g:(ILhj6;Ljs1$b;)V
        //   968: iinc            8, 1
        //   971: goto            909
        //   974: iconst_0       
        //   975: istore          8
        //   977: iload           8
        //   979: iload           15
        //   981: if_icmpge       1090
        //   984: aload           13
        //   986: iload           8
        //   988: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   991: checkcast       Lhj6;
        //   994: astore          10
        //   996: aload           10
        //   998: invokevirtual   hj6.G:()Z
        //  1001: ifeq            1084
        //  1004: aload           10
        //  1006: invokestatic    ix8.a:(Lhj6;)Z
        //  1009: ifeq            1084
        //  1012: aload           10
        //  1014: aload           12
        //  1016: getstatic       ix8.a:Ljs1$a;
        //  1019: invokestatic    ij6.k0:(Lhj6;Ljs1$b;Ljs1$a;)Z
        //  1022: pop            
        //  1023: aload           10
        //  1025: instanceof      Lbbc;
        //  1028: ifeq            1066
        //  1031: aload           10
        //  1033: checkcast       Lbbc;
        //  1036: getfield        bbc.y0:I
        //  1039: ifne            1053
        //  1042: iconst_0       
        //  1043: aload           10
        //  1045: aload           12
        //  1047: invokestatic    ix8.g:(ILhj6;Ljs1$b;)V
        //  1050: goto            1084
        //  1053: iconst_0       
        //  1054: aload           10
        //  1056: aload           12
        //  1058: iload           17
        //  1060: invokestatic    ix8.b:(ILhj6;Ljs1$b;Z)V
        //  1063: goto            1084
        //  1066: iconst_0       
        //  1067: aload           10
        //  1069: aload           12
        //  1071: iload           17
        //  1073: invokestatic    ix8.b:(ILhj6;Ljs1$b;Z)V
        //  1076: iconst_0       
        //  1077: aload           10
        //  1079: aload           12
        //  1081: invokestatic    ix8.g:(ILhj6;Ljs1$b;)V
        //  1084: iinc            8, 1
        //  1087: goto            977
        //  1090: iconst_0       
        //  1091: istore          19
        //  1093: iload           16
        //  1095: istore          7
        //  1097: iload           4
        //  1099: istore          8
        //  1101: aload           9
        //  1103: astore          10
        //  1105: iload           19
        //  1107: iload           6
        //  1109: if_icmpge       1253
        //  1112: aload_0        
        //  1113: getfield        ynx.u0:Ljava/util/ArrayList;
        //  1116: iload           19
        //  1118: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1121: checkcast       Lhj6;
        //  1124: astore          10
        //  1126: aload           10
        //  1128: invokevirtual   hj6.G:()Z
        //  1131: ifeq            1247
        //  1134: aload           10
        //  1136: instanceof      Lbbc;
        //  1139: ifne            1247
        //  1142: aload           10
        //  1144: instanceof      Lsi1;
        //  1147: ifne            1247
        //  1150: aload           10
        //  1152: instanceof      Lpdx;
        //  1155: ifne            1247
        //  1158: aload           10
        //  1160: getfield        hj6.G:Z
        //  1163: ifne            1247
        //  1166: aload           10
        //  1168: iconst_0       
        //  1169: invokevirtual   hj6.p:(I)Lhj6$a;
        //  1172: astore          12
        //  1174: aload           10
        //  1176: iconst_1       
        //  1177: invokevirtual   hj6.p:(I)Lhj6$a;
        //  1180: astore          13
        //  1182: aload           12
        //  1184: aload_1        
        //  1185: if_acmpne       1218
        //  1188: aload           10
        //  1190: getfield        hj6.r:I
        //  1193: iconst_1       
        //  1194: if_icmpeq       1218
        //  1197: aload           13
        //  1199: aload_1        
        //  1200: if_acmpne       1218
        //  1203: aload           10
        //  1205: getfield        hj6.s:I
        //  1208: iconst_1       
        //  1209: if_icmpeq       1218
        //  1212: iconst_1       
        //  1213: istore          8
        //  1215: goto            1221
        //  1218: iconst_0       
        //  1219: istore          8
        //  1221: iload           8
        //  1223: ifne            1247
        //  1226: new             Ljs1$a;
        //  1229: dup            
        //  1230: invokespecial   js1$a.<init>:()V
        //  1233: astore          12
        //  1235: aload           10
        //  1237: aload_0        
        //  1238: getfield        ij6.y0:Ljs1$b;
        //  1241: aload           12
        //  1243: invokestatic    ij6.k0:(Lhj6;Ljs1$b;Ljs1$a;)Z
        //  1246: pop            
        //  1247: iinc            19, 1
        //  1250: goto            1093
        //  1253: iload           6
        //  1255: iconst_2       
        //  1256: if_icmple       3302
        //  1259: aload           10
        //  1261: astore          21
        //  1263: aload           11
        //  1265: aload_2        
        //  1266: if_acmpeq       1275
        //  1269: aload           21
        //  1271: aload_2        
        //  1272: if_acmpne       3285
        //  1275: aload_0        
        //  1276: getfield        ij6.H0:I
        //  1279: sipush          1024
        //  1282: invokestatic    nnj.b:(II)Z
        //  1285: ifeq            3285
        //  1288: aload_0        
        //  1289: getfield        ij6.y0:Ljs1$b;
        //  1292: astore          22
        //  1294: getstatic       yi6$a.H0:Lyi6$a;
        //  1297: astore          23
        //  1299: aload_0        
        //  1300: getfield        ynx.u0:Ljava/util/ArrayList;
        //  1303: astore          24
        //  1305: aload           24
        //  1307: invokevirtual   java/util/ArrayList.size:()I
        //  1310: istore          4
        //  1312: iconst_0       
        //  1313: istore          5
        //  1315: iload           5
        //  1317: iload           4
        //  1319: if_icmpge       1410
        //  1322: aload           24
        //  1324: iload           5
        //  1326: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1329: checkcast       Lhj6;
        //  1332: astore          9
        //  1334: aload_0        
        //  1335: getfield        hj6.U:[Lhj6$a;
        //  1338: astore          12
        //  1340: aload           12
        //  1342: iconst_0       
        //  1343: aaload         
        //  1344: astore          10
        //  1346: aload           12
        //  1348: iconst_1       
        //  1349: aaload         
        //  1350: astore          12
        //  1352: aload           9
        //  1354: getfield        hj6.U:[Lhj6$a;
        //  1357: astore          13
        //  1359: aload           10
        //  1361: aload           12
        //  1363: aload           13
        //  1365: iconst_0       
        //  1366: aaload         
        //  1367: aload           13
        //  1369: iconst_1       
        //  1370: aaload         
        //  1371: invokestatic    t9c.c:(Lhj6$a;Lhj6$a;Lhj6$a;Lhj6$a;)Z
        //  1374: ifne            1380
        //  1377: goto            1388
        //  1380: aload           9
        //  1382: instanceof      Lf8b;
        //  1385: ifeq            1404
        //  1388: aload           11
        //  1390: astore          9
        //  1392: iconst_0       
        //  1393: istore          5
        //  1395: aload_2        
        //  1396: astore          10
        //  1398: aload           21
        //  1400: astore_2       
        //  1401: goto            3131
        //  1404: iinc            5, 1
        //  1407: goto            1315
        //  1410: iconst_0       
        //  1411: istore          5
        //  1413: aconst_null    
        //  1414: astore          25
        //  1416: aconst_null    
        //  1417: astore          10
        //  1419: aconst_null    
        //  1420: astore          12
        //  1422: aconst_null    
        //  1423: astore          9
        //  1425: aconst_null    
        //  1426: astore          14
        //  1428: aconst_null    
        //  1429: astore          13
        //  1431: iload           5
        //  1433: iload           4
        //  1435: if_icmpge       2006
        //  1438: aload           24
        //  1440: iload           5
        //  1442: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1445: checkcast       Lhj6;
        //  1448: astore          26
        //  1450: aload_0        
        //  1451: getfield        hj6.U:[Lhj6$a;
        //  1454: astore          27
        //  1456: aload           27
        //  1458: iconst_0       
        //  1459: aaload         
        //  1460: astore          28
        //  1462: aload           27
        //  1464: iconst_1       
        //  1465: aaload         
        //  1466: astore          27
        //  1468: aload           26
        //  1470: getfield        hj6.U:[Lhj6$a;
        //  1473: astore          29
        //  1475: aload           28
        //  1477: aload           27
        //  1479: aload           29
        //  1481: iconst_0       
        //  1482: aaload         
        //  1483: aload           29
        //  1485: iconst_1       
        //  1486: aaload         
        //  1487: invokestatic    t9c.c:(Lhj6$a;Lhj6$a;Lhj6$a;Lhj6$a;)Z
        //  1490: ifne            1505
        //  1493: aload           26
        //  1495: aload           22
        //  1497: aload_0        
        //  1498: getfield        ij6.P0:Ljs1$a;
        //  1501: invokestatic    ij6.k0:(Lhj6;Ljs1$b;Ljs1$a;)Z
        //  1504: pop            
        //  1505: aload           26
        //  1507: instanceof      Lbbc;
        //  1510: istore          17
        //  1512: aload           25
        //  1514: astore          29
        //  1516: aload           12
        //  1518: astore          27
        //  1520: iload           17
        //  1522: ifeq            1621
        //  1525: aload           26
        //  1527: checkcast       Lbbc;
        //  1530: astore          30
        //  1532: aload           12
        //  1534: astore          28
        //  1536: aload           30
        //  1538: getfield        bbc.y0:I
        //  1541: ifne            1570
        //  1544: aload           12
        //  1546: astore          28
        //  1548: aload           12
        //  1550: ifnonnull       1562
        //  1553: new             Ljava/util/ArrayList;
        //  1556: dup            
        //  1557: invokespecial   java/util/ArrayList.<init>:()V
        //  1560: astore          28
        //  1562: aload           28
        //  1564: aload           30
        //  1566: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1569: pop            
        //  1570: aload           25
        //  1572: astore          29
        //  1574: aload           28
        //  1576: astore          27
        //  1578: aload           30
        //  1580: getfield        bbc.y0:I
        //  1583: iconst_1       
        //  1584: if_icmpne       1621
        //  1587: aload           25
        //  1589: astore          12
        //  1591: aload           25
        //  1593: ifnonnull       1605
        //  1596: new             Ljava/util/ArrayList;
        //  1599: dup            
        //  1600: invokespecial   java/util/ArrayList.<init>:()V
        //  1603: astore          12
        //  1605: aload           12
        //  1607: aload           30
        //  1609: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1612: pop            
        //  1613: aload           28
        //  1615: astore          27
        //  1617: aload           12
        //  1619: astore          29
        //  1621: aload           10
        //  1623: astore          12
        //  1625: aload           9
        //  1627: astore          28
        //  1629: aload           26
        //  1631: instanceof      Lzjc;
        //  1634: ifeq            1799
        //  1637: aload           26
        //  1639: instanceof      Lsi1;
        //  1642: ifeq            1740
        //  1645: aload           26
        //  1647: checkcast       Lsi1;
        //  1650: astore          30
        //  1652: aload           10
        //  1654: astore          25
        //  1656: aload           30
        //  1658: invokevirtual   si1.c0:()I
        //  1661: ifne            1690
        //  1664: aload           10
        //  1666: astore          25
        //  1668: aload           10
        //  1670: ifnonnull       1682
        //  1673: new             Ljava/util/ArrayList;
        //  1676: dup            
        //  1677: invokespecial   java/util/ArrayList.<init>:()V
        //  1680: astore          25
        //  1682: aload           25
        //  1684: aload           30
        //  1686: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1689: pop            
        //  1690: aload           25
        //  1692: astore          12
        //  1694: aload           9
        //  1696: astore          28
        //  1698: aload           30
        //  1700: invokevirtual   si1.c0:()I
        //  1703: iconst_1       
        //  1704: if_icmpne       1799
        //  1707: aload           9
        //  1709: astore          28
        //  1711: aload           9
        //  1713: ifnonnull       1725
        //  1716: new             Ljava/util/ArrayList;
        //  1719: dup            
        //  1720: invokespecial   java/util/ArrayList.<init>:()V
        //  1723: astore          28
        //  1725: aload           28
        //  1727: aload           30
        //  1729: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1732: pop            
        //  1733: aload           25
        //  1735: astore          12
        //  1737: goto            1799
        //  1740: aload           26
        //  1742: checkcast       Lzjc;
        //  1745: astore          25
        //  1747: aload           10
        //  1749: astore          12
        //  1751: aload           10
        //  1753: ifnonnull       1765
        //  1756: new             Ljava/util/ArrayList;
        //  1759: dup            
        //  1760: invokespecial   java/util/ArrayList.<init>:()V
        //  1763: astore          12
        //  1765: aload           12
        //  1767: aload           25
        //  1769: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1772: pop            
        //  1773: aload           9
        //  1775: astore          28
        //  1777: aload           9
        //  1779: ifnonnull       1791
        //  1782: new             Ljava/util/ArrayList;
        //  1785: dup            
        //  1786: invokespecial   java/util/ArrayList.<init>:()V
        //  1789: astore          28
        //  1791: aload           28
        //  1793: aload           25
        //  1795: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1798: pop            
        //  1799: aload           14
        //  1801: astore          30
        //  1803: aload           26
        //  1805: getfield        hj6.J:Lyi6;
        //  1808: getfield        yi6.f:Lyi6;
        //  1811: ifnonnull       1880
        //  1814: aload           14
        //  1816: astore          30
        //  1818: aload           26
        //  1820: getfield        hj6.L:Lyi6;
        //  1823: getfield        yi6.f:Lyi6;
        //  1826: ifnonnull       1880
        //  1829: aload           14
        //  1831: astore          30
        //  1833: iload           17
        //  1835: ifne            1880
        //  1838: aload           14
        //  1840: astore          30
        //  1842: aload           26
        //  1844: instanceof      Lsi1;
        //  1847: ifne            1880
        //  1850: aload           14
        //  1852: astore          10
        //  1854: aload           14
        //  1856: ifnonnull       1868
        //  1859: new             Ljava/util/ArrayList;
        //  1862: dup            
        //  1863: invokespecial   java/util/ArrayList.<init>:()V
        //  1866: astore          10
        //  1868: aload           10
        //  1870: aload           26
        //  1872: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1875: pop            
        //  1876: aload           10
        //  1878: astore          30
        //  1880: aload           13
        //  1882: astore          31
        //  1884: aload           26
        //  1886: getfield        hj6.K:Lyi6;
        //  1889: getfield        yi6.f:Lyi6;
        //  1892: ifnonnull       1976
        //  1895: aload           13
        //  1897: astore          31
        //  1899: aload           26
        //  1901: getfield        hj6.M:Lyi6;
        //  1904: getfield        yi6.f:Lyi6;
        //  1907: ifnonnull       1976
        //  1910: aload           13
        //  1912: astore          31
        //  1914: aload           26
        //  1916: getfield        hj6.N:Lyi6;
        //  1919: getfield        yi6.f:Lyi6;
        //  1922: ifnonnull       1976
        //  1925: aload           13
        //  1927: astore          31
        //  1929: iload           17
        //  1931: ifne            1976
        //  1934: aload           13
        //  1936: astore          31
        //  1938: aload           26
        //  1940: instanceof      Lsi1;
        //  1943: ifne            1976
        //  1946: aload           13
        //  1948: astore          10
        //  1950: aload           13
        //  1952: ifnonnull       1964
        //  1955: new             Ljava/util/ArrayList;
        //  1958: dup            
        //  1959: invokespecial   java/util/ArrayList.<init>:()V
        //  1962: astore          10
        //  1964: aload           10
        //  1966: aload           26
        //  1968: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1971: pop            
        //  1972: aload           10
        //  1974: astore          31
        //  1976: iinc            5, 1
        //  1979: aload           29
        //  1981: astore          25
        //  1983: aload           12
        //  1985: astore          10
        //  1987: aload           27
        //  1989: astore          12
        //  1991: aload           28
        //  1993: astore          9
        //  1995: aload           30
        //  1997: astore          14
        //  1999: aload           31
        //  2001: astore          13
        //  2003: goto            1431
        //  2006: new             Ljava/util/ArrayList;
        //  2009: dup            
        //  2010: invokespecial   java/util/ArrayList.<init>:()V
        //  2013: astore          28
        //  2015: aload           25
        //  2017: ifnull          2058
        //  2020: aload           25
        //  2022: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2025: astore          25
        //  2027: aload           25
        //  2029: invokeinterface java/util/Iterator.hasNext:()Z
        //  2034: ifeq            2058
        //  2037: aload           25
        //  2039: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2044: checkcast       Lbbc;
        //  2047: iconst_0       
        //  2048: aload           28
        //  2050: aconst_null    
        //  2051: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2054: pop            
        //  2055: goto            2027
        //  2058: aload           10
        //  2060: ifnull          2123
        //  2063: aload           10
        //  2065: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2068: astore          25
        //  2070: aload           25
        //  2072: invokeinterface java/util/Iterator.hasNext:()Z
        //  2077: ifeq            2123
        //  2080: aload           25
        //  2082: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2087: checkcast       Lzjc;
        //  2090: astore          27
        //  2092: aload           27
        //  2094: iconst_0       
        //  2095: aload           28
        //  2097: aconst_null    
        //  2098: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2101: astore          10
        //  2103: aload           27
        //  2105: aload           28
        //  2107: iconst_0       
        //  2108: aload           10
        //  2110: invokevirtual   zjc.a0:(Ljava/util/ArrayList;ILznx;)V
        //  2113: aload           10
        //  2115: aload           28
        //  2117: invokevirtual   znx.b:(Ljava/util/ArrayList;)V
        //  2120: goto            2070
        //  2123: aload_0        
        //  2124: getstatic       yi6$a.C0:Lyi6$a;
        //  2127: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2130: getfield        yi6.a:Ljava/util/HashSet;
        //  2133: astore          10
        //  2135: aload           10
        //  2137: ifnull          2181
        //  2140: aload           10
        //  2142: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2145: astore          10
        //  2147: aload           10
        //  2149: invokeinterface java/util/Iterator.hasNext:()Z
        //  2154: ifeq            2181
        //  2157: aload           10
        //  2159: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2164: checkcast       Lyi6;
        //  2167: getfield        yi6.d:Lhj6;
        //  2170: iconst_0       
        //  2171: aload           28
        //  2173: aconst_null    
        //  2174: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2177: pop            
        //  2178: goto            2147
        //  2181: aload_0        
        //  2182: getstatic       yi6$a.E0:Lyi6$a;
        //  2185: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2188: getfield        yi6.a:Ljava/util/HashSet;
        //  2191: astore          10
        //  2193: aload           10
        //  2195: ifnull          2239
        //  2198: aload           10
        //  2200: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2203: astore          10
        //  2205: aload           10
        //  2207: invokeinterface java/util/Iterator.hasNext:()Z
        //  2212: ifeq            2239
        //  2215: aload           10
        //  2217: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2222: checkcast       Lyi6;
        //  2225: getfield        yi6.d:Lhj6;
        //  2228: iconst_0       
        //  2229: aload           28
        //  2231: aconst_null    
        //  2232: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2235: pop            
        //  2236: goto            2205
        //  2239: aload_0        
        //  2240: aload           23
        //  2242: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2245: getfield        yi6.a:Ljava/util/HashSet;
        //  2248: astore          10
        //  2250: aload           10
        //  2252: ifnull          2296
        //  2255: aload           10
        //  2257: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2260: astore          10
        //  2262: aload           10
        //  2264: invokeinterface java/util/Iterator.hasNext:()Z
        //  2269: ifeq            2296
        //  2272: aload           10
        //  2274: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2279: checkcast       Lyi6;
        //  2282: getfield        yi6.d:Lhj6;
        //  2285: iconst_0       
        //  2286: aload           28
        //  2288: aconst_null    
        //  2289: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2292: pop            
        //  2293: goto            2262
        //  2296: aload           14
        //  2298: ifnull          2339
        //  2301: aload           14
        //  2303: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2306: astore          10
        //  2308: aload           10
        //  2310: invokeinterface java/util/Iterator.hasNext:()Z
        //  2315: ifeq            2339
        //  2318: aload           10
        //  2320: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2325: checkcast       Lhj6;
        //  2328: iconst_0       
        //  2329: aload           28
        //  2331: aconst_null    
        //  2332: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2335: pop            
        //  2336: goto            2308
        //  2339: aload           12
        //  2341: ifnull          2382
        //  2344: aload           12
        //  2346: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2349: astore          10
        //  2351: aload           10
        //  2353: invokeinterface java/util/Iterator.hasNext:()Z
        //  2358: ifeq            2382
        //  2361: aload           10
        //  2363: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2368: checkcast       Lbbc;
        //  2371: iconst_1       
        //  2372: aload           28
        //  2374: aconst_null    
        //  2375: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2378: pop            
        //  2379: goto            2351
        //  2382: aload           9
        //  2384: ifnull          2447
        //  2387: aload           9
        //  2389: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2392: astore          10
        //  2394: aload           10
        //  2396: invokeinterface java/util/Iterator.hasNext:()Z
        //  2401: ifeq            2447
        //  2404: aload           10
        //  2406: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2411: checkcast       Lzjc;
        //  2414: astore          12
        //  2416: aload           12
        //  2418: iconst_1       
        //  2419: aload           28
        //  2421: aconst_null    
        //  2422: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2425: astore          9
        //  2427: aload           12
        //  2429: aload           28
        //  2431: iconst_1       
        //  2432: aload           9
        //  2434: invokevirtual   zjc.a0:(Ljava/util/ArrayList;ILznx;)V
        //  2437: aload           9
        //  2439: aload           28
        //  2441: invokevirtual   znx.b:(Ljava/util/ArrayList;)V
        //  2444: goto            2394
        //  2447: aload_0        
        //  2448: getstatic       yi6$a.D0:Lyi6$a;
        //  2451: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2454: getfield        yi6.a:Ljava/util/HashSet;
        //  2457: astore          10
        //  2459: aload           10
        //  2461: ifnull          2505
        //  2464: aload           10
        //  2466: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2469: astore          10
        //  2471: aload           10
        //  2473: invokeinterface java/util/Iterator.hasNext:()Z
        //  2478: ifeq            2505
        //  2481: aload           10
        //  2483: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2488: checkcast       Lyi6;
        //  2491: getfield        yi6.d:Lhj6;
        //  2494: iconst_1       
        //  2495: aload           28
        //  2497: aconst_null    
        //  2498: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2501: pop            
        //  2502: goto            2471
        //  2505: aload_0        
        //  2506: getstatic       yi6$a.G0:Lyi6$a;
        //  2509: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2512: getfield        yi6.a:Ljava/util/HashSet;
        //  2515: astore          10
        //  2517: aload           10
        //  2519: ifnull          2563
        //  2522: aload           10
        //  2524: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2527: astore          10
        //  2529: aload           10
        //  2531: invokeinterface java/util/Iterator.hasNext:()Z
        //  2536: ifeq            2563
        //  2539: aload           10
        //  2541: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2546: checkcast       Lyi6;
        //  2549: getfield        yi6.d:Lhj6;
        //  2552: iconst_1       
        //  2553: aload           28
        //  2555: aconst_null    
        //  2556: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2559: pop            
        //  2560: goto            2529
        //  2563: aload_0        
        //  2564: getstatic       yi6$a.F0:Lyi6$a;
        //  2567: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2570: getfield        yi6.a:Ljava/util/HashSet;
        //  2573: astore          10
        //  2575: aload           10
        //  2577: ifnull          2621
        //  2580: aload           10
        //  2582: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2585: astore          10
        //  2587: aload           10
        //  2589: invokeinterface java/util/Iterator.hasNext:()Z
        //  2594: ifeq            2621
        //  2597: aload           10
        //  2599: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2604: checkcast       Lyi6;
        //  2607: getfield        yi6.d:Lhj6;
        //  2610: iconst_1       
        //  2611: aload           28
        //  2613: aconst_null    
        //  2614: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2617: pop            
        //  2618: goto            2587
        //  2621: aload_0        
        //  2622: aload           23
        //  2624: invokevirtual   hj6.n:(Lyi6$a;)Lyi6;
        //  2627: getfield        yi6.a:Ljava/util/HashSet;
        //  2630: astore          10
        //  2632: aload           10
        //  2634: ifnull          2678
        //  2637: aload           10
        //  2639: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  2642: astore          10
        //  2644: aload           10
        //  2646: invokeinterface java/util/Iterator.hasNext:()Z
        //  2651: ifeq            2678
        //  2654: aload           10
        //  2656: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2661: checkcast       Lyi6;
        //  2664: getfield        yi6.d:Lhj6;
        //  2667: iconst_1       
        //  2668: aload           28
        //  2670: aconst_null    
        //  2671: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2674: pop            
        //  2675: goto            2644
        //  2678: aload           13
        //  2680: ifnull          2721
        //  2683: aload           13
        //  2685: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2688: astore          10
        //  2690: aload           10
        //  2692: invokeinterface java/util/Iterator.hasNext:()Z
        //  2697: ifeq            2721
        //  2700: aload           10
        //  2702: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2707: checkcast       Lhj6;
        //  2710: iconst_1       
        //  2711: aload           28
        //  2713: aconst_null    
        //  2714: invokestatic    t9c.a:(Lhj6;ILjava/util/ArrayList;Lznx;)Lznx;
        //  2717: pop            
        //  2718: goto            2690
        //  2721: iconst_0       
        //  2722: istore          5
        //  2724: iload           5
        //  2726: iload           4
        //  2728: if_icmpge       2842
        //  2731: aload           24
        //  2733: iload           5
        //  2735: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2738: checkcast       Lhj6;
        //  2741: astore          10
        //  2743: aload           10
        //  2745: getfield        hj6.U:[Lhj6$a;
        //  2748: astore          9
        //  2750: aload           9
        //  2752: iconst_0       
        //  2753: aaload         
        //  2754: aload_1        
        //  2755: if_acmpne       2772
        //  2758: aload           9
        //  2760: iconst_1       
        //  2761: aaload         
        //  2762: aload_1        
        //  2763: if_acmpne       2772
        //  2766: iconst_1       
        //  2767: istore          16
        //  2769: goto            2775
        //  2772: iconst_0       
        //  2773: istore          16
        //  2775: iload           16
        //  2777: ifeq            2836
        //  2780: aload           28
        //  2782: aload           10
        //  2784: getfield        hj6.s0:I
        //  2787: invokestatic    t9c.b:(Ljava/util/ArrayList;I)Lznx;
        //  2790: astore          9
        //  2792: aload           28
        //  2794: aload           10
        //  2796: getfield        hj6.t0:I
        //  2799: invokestatic    t9c.b:(Ljava/util/ArrayList;I)Lznx;
        //  2802: astore          10
        //  2804: aload           9
        //  2806: ifnull          2836
        //  2809: aload           10
        //  2811: ifnull          2836
        //  2814: aload           9
        //  2816: iconst_0       
        //  2817: aload           10
        //  2819: invokevirtual   znx.d:(ILznx;)V
        //  2822: aload           10
        //  2824: iconst_2       
        //  2825: putfield        znx.c:I
        //  2828: aload           28
        //  2830: aload           9
        //  2832: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //  2835: pop            
        //  2836: iinc            5, 1
        //  2839: goto            2724
        //  2842: aload           28
        //  2844: invokevirtual   java/util/ArrayList.size:()I
        //  2847: iconst_1       
        //  2848: if_icmpgt       2854
        //  2851: goto            3098
        //  2854: aload_0        
        //  2855: getfield        hj6.U:[Lhj6$a;
        //  2858: iconst_0       
        //  2859: aaload         
        //  2860: astore          10
        //  2862: aload_2        
        //  2863: astore          12
        //  2865: aload           10
        //  2867: aload           12
        //  2869: if_acmpne       2972
        //  2872: aload           28
        //  2874: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2877: astore          13
        //  2879: iconst_0       
        //  2880: istore          5
        //  2882: aconst_null    
        //  2883: astore          10
        //  2885: aload           13
        //  2887: invokeinterface java/util/Iterator.hasNext:()Z
        //  2892: ifeq            2949
        //  2895: aload           13
        //  2897: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2902: checkcast       Lznx;
        //  2905: astore          9
        //  2907: aload           9
        //  2909: getfield        znx.c:I
        //  2912: iconst_1       
        //  2913: if_icmpne       2919
        //  2916: goto            2885
        //  2919: aload           9
        //  2921: aload_0        
        //  2922: getfield        ij6.A0:Lpdf;
        //  2925: iconst_0       
        //  2926: invokevirtual   znx.c:(Lpdf;I)I
        //  2929: istore          16
        //  2931: iload           16
        //  2933: iload           5
        //  2935: if_icmple       2885
        //  2938: aload           9
        //  2940: astore          10
        //  2942: iload           16
        //  2944: istore          5
        //  2946: goto            2885
        //  2949: aload           10
        //  2951: ifnull          2972
        //  2954: aload_0        
        //  2955: aload_3        
        //  2956: invokevirtual   hj6.T:(Lhj6$a;)V
        //  2959: aload_0        
        //  2960: iload           5
        //  2962: invokevirtual   hj6.X:(I)V
        //  2965: aload           10
        //  2967: astore          9
        //  2969: goto            2975
        //  2972: aconst_null    
        //  2973: astore          9
        //  2975: aload_3        
        //  2976: astore          13
        //  2978: aload_0        
        //  2979: getfield        hj6.U:[Lhj6$a;
        //  2982: iconst_1       
        //  2983: aaload         
        //  2984: aload           12
        //  2986: if_acmpne       3082
        //  2989: aload           28
        //  2991: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2994: astore_1       
        //  2995: iconst_0       
        //  2996: istore          5
        //  2998: aconst_null    
        //  2999: astore          10
        //  3001: aload_1        
        //  3002: invokeinterface java/util/Iterator.hasNext:()Z
        //  3007: ifeq            3062
        //  3010: aload_1        
        //  3011: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3016: checkcast       Lznx;
        //  3019: astore          14
        //  3021: aload           14
        //  3023: getfield        znx.c:I
        //  3026: ifne            3032
        //  3029: goto            3001
        //  3032: aload           14
        //  3034: aload_0        
        //  3035: getfield        ij6.A0:Lpdf;
        //  3038: iconst_1       
        //  3039: invokevirtual   znx.c:(Lpdf;I)I
        //  3042: istore          16
        //  3044: iload           16
        //  3046: iload           5
        //  3048: if_icmple       3001
        //  3051: aload           14
        //  3053: astore          10
        //  3055: iload           16
        //  3057: istore          5
        //  3059: goto            3001
        //  3062: aload           10
        //  3064: ifnull          3082
        //  3067: aload_0        
        //  3068: aload           13
        //  3070: invokevirtual   hj6.W:(Lhj6$a;)V
        //  3073: aload_0        
        //  3074: iload           5
        //  3076: invokevirtual   hj6.S:(I)V
        //  3079: goto            3085
        //  3082: aconst_null    
        //  3083: astore          10
        //  3085: aload           9
        //  3087: ifnonnull       3114
        //  3090: aload           10
        //  3092: ifnull          3098
        //  3095: goto            3114
        //  3098: aload_2        
        //  3099: astore          10
        //  3101: iconst_0       
        //  3102: istore          5
        //  3104: aload           11
        //  3106: astore          9
        //  3108: aload           21
        //  3110: astore_2       
        //  3111: goto            3131
        //  3114: iconst_1       
        //  3115: istore          5
        //  3117: aload           21
        //  3119: astore_2       
        //  3120: aload           11
        //  3122: astore          9
        //  3124: aload           12
        //  3126: astore          10
        //  3128: aload           13
        //  3130: astore_3       
        //  3131: iload           5
        //  3133: ifeq            3272
        //  3136: aload           9
        //  3138: astore          13
        //  3140: aload           13
        //  3142: aload           10
        //  3144: if_acmpne       3192
        //  3147: aload_0        
        //  3148: invokevirtual   hj6.x:()I
        //  3151: istore          16
        //  3153: iload           7
        //  3155: istore          5
        //  3157: iload           5
        //  3159: iload           16
        //  3161: if_icmpge       3183
        //  3164: iload           5
        //  3166: ifle            3183
        //  3169: aload_0        
        //  3170: iload           5
        //  3172: invokevirtual   hj6.X:(I)V
        //  3175: aload_0        
        //  3176: iconst_1       
        //  3177: putfield        ij6.I0:Z
        //  3180: goto            3192
        //  3183: aload_0        
        //  3184: invokevirtual   hj6.x:()I
        //  3187: istore          7
        //  3189: goto            3192
        //  3192: aload_2        
        //  3193: astore          9
        //  3195: aload           9
        //  3197: aload           10
        //  3199: if_acmpne       3247
        //  3202: aload_0        
        //  3203: invokevirtual   hj6.q:()I
        //  3206: istore          16
        //  3208: iload           8
        //  3210: istore          5
        //  3212: iload           5
        //  3214: iload           16
        //  3216: if_icmpge       3238
        //  3219: iload           5
        //  3221: ifle            3238
        //  3224: aload_0        
        //  3225: iload           5
        //  3227: invokevirtual   hj6.S:(I)V
        //  3230: aload_0        
        //  3231: iconst_1       
        //  3232: putfield        ij6.J0:Z
        //  3235: goto            3247
        //  3238: aload_0        
        //  3239: invokevirtual   hj6.q:()I
        //  3242: istore          8
        //  3244: goto            3247
        //  3247: iload           8
        //  3249: istore          19
        //  3251: iconst_1       
        //  3252: istore          8
        //  3254: aload           10
        //  3256: astore          12
        //  3258: aload           13
        //  3260: astore_2       
        //  3261: iload           7
        //  3263: istore          20
        //  3265: iload           6
        //  3267: istore          18
        //  3269: goto            3328
        //  3272: aload_2        
        //  3273: astore          12
        //  3275: aload           9
        //  3277: astore_2       
        //  3278: aload           12
        //  3280: astore          9
        //  3282: goto            3305
        //  3285: iload           5
        //  3287: istore          6
        //  3289: aload           10
        //  3291: astore          9
        //  3293: aload_2        
        //  3294: astore          10
        //  3296: aload           11
        //  3298: astore_2       
        //  3299: goto            3305
        //  3302: goto            3285
        //  3305: iconst_0       
        //  3306: istore          5
        //  3308: iload           6
        //  3310: istore          18
        //  3312: iload           8
        //  3314: istore          19
        //  3316: iload           7
        //  3318: istore          20
        //  3320: aload           10
        //  3322: astore          12
        //  3324: iload           5
        //  3326: istore          8
        //  3328: aload_0        
        //  3329: bipush          64
        //  3331: invokevirtual   ij6.l0:(I)Z
        //  3334: ifne            3356
        //  3337: aload_0        
        //  3338: sipush          128
        //  3341: invokevirtual   ij6.l0:(I)Z
        //  3344: ifeq            3350
        //  3347: goto            3356
        //  3350: iconst_0       
        //  3351: istore          7
        //  3353: goto            3359
        //  3356: iconst_1       
        //  3357: istore          7
        //  3359: aload_0        
        //  3360: getfield        ij6.A0:Lpdf;
        //  3363: astore          10
        //  3365: aload           10
        //  3367: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3370: pop            
        //  3371: aload           10
        //  3373: iconst_0       
        //  3374: putfield        pdf.g:Z
        //  3377: aload_0        
        //  3378: getfield        ij6.H0:I
        //  3381: ifeq            3398
        //  3384: iload           7
        //  3386: ifeq            3398
        //  3389: aload           10
        //  3391: iconst_1       
        //  3392: putfield        pdf.g:Z
        //  3395: goto            3398
        //  3398: aload_0        
        //  3399: getfield        ynx.u0:Ljava/util/ArrayList;
        //  3402: astore          13
        //  3404: aload_0        
        //  3405: getfield        hj6.U:[Lhj6$a;
        //  3408: astore          10
        //  3410: aload           10
        //  3412: iconst_0       
        //  3413: aaload         
        //  3414: aload           12
        //  3416: if_acmpeq       3437
        //  3419: aload           10
        //  3421: iconst_1       
        //  3422: aaload         
        //  3423: aload           12
        //  3425: if_acmpne       3431
        //  3428: goto            3437
        //  3431: iconst_0       
        //  3432: istore          15
        //  3434: goto            3440
        //  3437: iconst_1       
        //  3438: istore          15
        //  3440: aload_0        
        //  3441: iconst_0       
        //  3442: putfield        ij6.D0:I
        //  3445: aload_0        
        //  3446: iconst_0       
        //  3447: putfield        ij6.E0:I
        //  3450: iconst_0       
        //  3451: istore          7
        //  3453: iload           7
        //  3455: iload           18
        //  3457: if_icmpge       3496
        //  3460: aload_0        
        //  3461: getfield        ynx.u0:Ljava/util/ArrayList;
        //  3464: iload           7
        //  3466: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3469: checkcast       Lhj6;
        //  3472: astore          10
        //  3474: aload           10
        //  3476: instanceof      Lynx;
        //  3479: ifeq            3490
        //  3482: aload           10
        //  3484: checkcast       Lynx;
        //  3487: invokevirtual   ynx.a0:()V
        //  3490: iinc            7, 1
        //  3493: goto            3453
        //  3496: aload_0        
        //  3497: bipush          64
        //  3499: invokevirtual   ij6.l0:(I)Z
        //  3502: istore          32
        //  3504: iload           8
        //  3506: istore          5
        //  3508: iconst_0       
        //  3509: istore          7
        //  3511: iconst_1       
        //  3512: istore          8
        //  3514: iload           8
        //  3516: ifeq            4701
        //  3519: iload           7
        //  3521: iconst_1       
        //  3522: iadd           
        //  3523: istore          33
        //  3525: aload_0        
        //  3526: getfield        ij6.A0:Lpdf;
        //  3529: invokevirtual   pdf.u:()V
        //  3532: aload_0        
        //  3533: iconst_0       
        //  3534: putfield        ij6.D0:I
        //  3537: aload_0        
        //  3538: iconst_0       
        //  3539: putfield        ij6.E0:I
        //  3542: aload_0        
        //  3543: aload_0        
        //  3544: getfield        ij6.A0:Lpdf;
        //  3547: invokevirtual   hj6.l:(Lpdf;)V
        //  3550: iconst_0       
        //  3551: istore          7
        //  3553: iload           7
        //  3555: iload           18
        //  3557: if_icmpge       3594
        //  3560: aload_0        
        //  3561: getfield        ynx.u0:Ljava/util/ArrayList;
        //  3564: iload           7
        //  3566: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3569: checkcast       Lhj6;
        //  3572: astore          10
        //  3574: aload           10
        //  3576: aload_0        
        //  3577: getfield        ij6.A0:Lpdf;
        //  3580: invokevirtual   hj6.l:(Lpdf;)V
        //  3583: iinc            7, 1
        //  3586: goto            3553
        //  3589: astore          10
        //  3591: goto            3940
        //  3594: aload_0        
        //  3595: aload_0        
        //  3596: getfield        ij6.A0:Lpdf;
        //  3599: invokevirtual   ij6.d0:(Lpdf;)V
        //  3602: aload_0        
        //  3603: getfield        ij6.K0:Ljava/lang/ref/WeakReference;
        //  3606: astore          10
        //  3608: aload           10
        //  3610: ifnull          3682
        //  3613: aload           10
        //  3615: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3618: ifnull          3682
        //  3621: aload_0        
        //  3622: getfield        ij6.K0:Ljava/lang/ref/WeakReference;
        //  3625: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3628: checkcast       Lyi6;
        //  3631: astore          14
        //  3633: aload_0        
        //  3634: getfield        ij6.A0:Lpdf;
        //  3637: aload_0        
        //  3638: getfield        hj6.K:Lyi6;
        //  3641: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3644: astore          10
        //  3646: aload_0        
        //  3647: getfield        ij6.A0:Lpdf;
        //  3650: aload           14
        //  3652: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3655: astore          11
        //  3657: aload_0        
        //  3658: getfield        ij6.A0:Lpdf;
        //  3661: astore          14
        //  3663: aload           14
        //  3665: aload           11
        //  3667: aload           10
        //  3669: iconst_0       
        //  3670: iconst_5       
        //  3671: invokevirtual   pdf.f:(Lukq;Lukq;II)V
        //  3674: aload_0        
        //  3675: aconst_null    
        //  3676: putfield        ij6.K0:Ljava/lang/ref/WeakReference;
        //  3679: goto            3682
        //  3682: aload_0        
        //  3683: getfield        ij6.M0:Ljava/lang/ref/WeakReference;
        //  3686: astore          10
        //  3688: aload           10
        //  3690: ifnull          3755
        //  3693: aload           10
        //  3695: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3698: ifnull          3755
        //  3701: aload_0        
        //  3702: getfield        ij6.M0:Ljava/lang/ref/WeakReference;
        //  3705: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3708: checkcast       Lyi6;
        //  3711: astore          14
        //  3713: aload_0        
        //  3714: getfield        ij6.A0:Lpdf;
        //  3717: aload_0        
        //  3718: getfield        hj6.M:Lyi6;
        //  3721: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3724: astore          10
        //  3726: aload_0        
        //  3727: getfield        ij6.A0:Lpdf;
        //  3730: aload           14
        //  3732: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3735: astore          14
        //  3737: aload_0        
        //  3738: getfield        ij6.A0:Lpdf;
        //  3741: aload           10
        //  3743: aload           14
        //  3745: iconst_0       
        //  3746: iconst_5       
        //  3747: invokevirtual   pdf.f:(Lukq;Lukq;II)V
        //  3750: aload_0        
        //  3751: aconst_null    
        //  3752: putfield        ij6.M0:Ljava/lang/ref/WeakReference;
        //  3755: aload_0        
        //  3756: getfield        ij6.L0:Ljava/lang/ref/WeakReference;
        //  3759: astore          10
        //  3761: aload           10
        //  3763: ifnull          3828
        //  3766: aload           10
        //  3768: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3771: ifnull          3828
        //  3774: aload_0        
        //  3775: getfield        ij6.L0:Ljava/lang/ref/WeakReference;
        //  3778: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3781: checkcast       Lyi6;
        //  3784: astore          14
        //  3786: aload_0        
        //  3787: getfield        ij6.A0:Lpdf;
        //  3790: aload_0        
        //  3791: getfield        hj6.J:Lyi6;
        //  3794: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3797: astore          10
        //  3799: aload_0        
        //  3800: getfield        ij6.A0:Lpdf;
        //  3803: aload           14
        //  3805: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3808: astore          14
        //  3810: aload_0        
        //  3811: getfield        ij6.A0:Lpdf;
        //  3814: aload           14
        //  3816: aload           10
        //  3818: iconst_0       
        //  3819: iconst_5       
        //  3820: invokevirtual   pdf.f:(Lukq;Lukq;II)V
        //  3823: aload_0        
        //  3824: aconst_null    
        //  3825: putfield        ij6.L0:Ljava/lang/ref/WeakReference;
        //  3828: aload_0        
        //  3829: getfield        ij6.N0:Ljava/lang/ref/WeakReference;
        //  3832: astore          10
        //  3834: aload           10
        //  3836: ifnull          3909
        //  3839: aload           10
        //  3841: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3844: ifnull          3909
        //  3847: aload_0        
        //  3848: getfield        ij6.N0:Ljava/lang/ref/WeakReference;
        //  3851: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //  3854: checkcast       Lyi6;
        //  3857: astore          14
        //  3859: aload_0        
        //  3860: getfield        ij6.A0:Lpdf;
        //  3863: aload_0        
        //  3864: getfield        hj6.L:Lyi6;
        //  3867: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3870: astore          10
        //  3872: aload_0        
        //  3873: getfield        ij6.A0:Lpdf;
        //  3876: aload           14
        //  3878: invokevirtual   pdf.l:(Ljava/lang/Object;)Lukq;
        //  3881: astore          14
        //  3883: aload_0        
        //  3884: getfield        ij6.A0:Lpdf;
        //  3887: aload           10
        //  3889: aload           14
        //  3891: iconst_0       
        //  3892: iconst_5       
        //  3893: invokevirtual   pdf.f:(Lukq;Lukq;II)V
        //  3896: aload_0        
        //  3897: aconst_null    
        //  3898: putfield        ij6.N0:Ljava/lang/ref/WeakReference;
        //  3901: goto            3909
        //  3904: astore          10
        //  3906: goto            3932
        //  3909: aload_0        
        //  3910: getfield        ij6.A0:Lpdf;
        //  3913: invokevirtual   pdf.q:()V
        //  3916: iconst_1       
        //  3917: istore          8
        //  3919: goto            3994
        //  3922: astore          10
        //  3924: goto            3932
        //  3927: astore          10
        //  3929: goto            3906
        //  3932: iconst_1       
        //  3933: istore          8
        //  3935: goto            3948
        //  3938: astore          10
        //  3940: goto            3948
        //  3943: astore          10
        //  3945: goto            3940
        //  3948: aload           10
        //  3950: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //  3953: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //  3956: astore          14
        //  3958: new             Ljava/lang/StringBuilder;
        //  3961: dup            
        //  3962: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3965: astore          11
        //  3967: aload           11
        //  3969: ldc_w           "EXCEPTION : "
        //  3972: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3975: pop            
        //  3976: aload           11
        //  3978: aload           10
        //  3980: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3983: pop            
        //  3984: aload           14
        //  3986: aload           11
        //  3988: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3991: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //  3994: iload           8
        //  3996: ifeq            4119
        //  3999: aload_0        
        //  4000: getfield        ij6.A0:Lpdf;
        //  4003: astore          10
        //  4005: getstatic       nnj.a:[Z
        //  4008: iconst_2       
        //  4009: iconst_0       
        //  4010: bastore        
        //  4011: aload_0        
        //  4012: bipush          64
        //  4014: invokevirtual   ij6.l0:(I)Z
        //  4017: istore          17
        //  4019: aload_0        
        //  4020: aload           10
        //  4022: iload           17
        //  4024: invokevirtual   hj6.Z:(Lpdf;Z)V
        //  4027: aload_0        
        //  4028: getfield        ynx.u0:Ljava/util/ArrayList;
        //  4031: invokevirtual   java/util/ArrayList.size:()I
        //  4034: istore          16
        //  4036: iconst_0       
        //  4037: istore          7
        //  4039: iconst_0       
        //  4040: istore          8
        //  4042: iload           7
        //  4044: iload           16
        //  4046: if_icmpge       4116
        //  4049: aload_0        
        //  4050: getfield        ynx.u0:Ljava/util/ArrayList;
        //  4053: iload           7
        //  4055: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  4058: checkcast       Lhj6;
        //  4061: astore          14
        //  4063: aload           14
        //  4065: aload           10
        //  4067: iload           17
        //  4069: invokevirtual   hj6.Z:(Lpdf;Z)V
        //  4072: aload           14
        //  4074: getfield        hj6.h:I
        //  4077: iconst_m1      
        //  4078: if_icmpne       4099
        //  4081: aload           14
        //  4083: getfield        hj6.i:I
        //  4086: iconst_m1      
        //  4087: if_icmpeq       4093
        //  4090: goto            4099
        //  4093: iconst_0       
        //  4094: istore          6
        //  4096: goto            4102
        //  4099: iconst_1       
        //  4100: istore          6
        //  4102: iload           6
        //  4104: ifeq            4110
        //  4107: iconst_1       
        //  4108: istore          8
        //  4110: iinc            7, 1
        //  4113: goto            4042
        //  4116: goto            4169
        //  4119: aload_0        
        //  4120: aload_0        
        //  4121: getfield        ij6.A0:Lpdf;
        //  4124: iload           32
        //  4126: invokevirtual   hj6.Z:(Lpdf;Z)V
        //  4129: iconst_0       
        //  4130: istore          8
        //  4132: iload           8
        //  4134: iload           18
        //  4136: if_icmpge       4166
        //  4139: aload_0        
        //  4140: getfield        ynx.u0:Ljava/util/ArrayList;
        //  4143: iload           8
        //  4145: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  4148: checkcast       Lhj6;
        //  4151: aload_0        
        //  4152: getfield        ij6.A0:Lpdf;
        //  4155: iload           32
        //  4157: invokevirtual   hj6.Z:(Lpdf;Z)V
        //  4160: iinc            8, 1
        //  4163: goto            4132
        //  4166: iconst_0       
        //  4167: istore          8
        //  4169: iload           8
        //  4171: istore          6
        //  4173: iload           5
        //  4175: istore          7
        //  4177: iload           15
        //  4179: ifeq            4418
        //  4182: iload           8
        //  4184: istore          6
        //  4186: iload           5
        //  4188: istore          7
        //  4190: iload           33
        //  4192: bipush          8
        //  4194: if_icmpge       4418
        //  4197: iload           8
        //  4199: istore          6
        //  4201: iload           5
        //  4203: istore          7
        //  4205: getstatic       nnj.a:[Z
        //  4208: iconst_2       
        //  4209: baload         
        //  4210: ifeq            4418
        //  4213: iconst_0       
        //  4214: istore          6
        //  4216: iconst_0       
        //  4217: istore          7
        //  4219: iconst_0       
        //  4220: istore          16
        //  4222: iload           6
        //  4224: iload           18
        //  4226: if_icmpge       4293
        //  4229: aload_0        
        //  4230: getfield        ynx.u0:Ljava/util/ArrayList;
        //  4233: iload           6
        //  4235: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  4238: checkcast       Lhj6;
        //  4241: astore          10
        //  4243: aload           10
        //  4245: getfield        hj6.a0:I
        //  4248: istore          4
        //  4250: iload           16
        //  4252: aload           10
        //  4254: invokevirtual   hj6.x:()I
        //  4257: iload           4
        //  4259: iadd           
        //  4260: invokestatic    java/lang/Math.max:(II)I
        //  4263: istore          16
        //  4265: aload           10
        //  4267: getfield        hj6.b0:I
        //  4270: istore          4
        //  4272: iload           7
        //  4274: aload           10
        //  4276: invokevirtual   hj6.q:()I
        //  4279: iload           4
        //  4281: iadd           
        //  4282: invokestatic    java/lang/Math.max:(II)I
        //  4285: istore          7
        //  4287: iinc            6, 1
        //  4290: goto            4222
        //  4293: aload_0        
        //  4294: getfield        hj6.d0:I
        //  4297: iload           16
        //  4299: invokestatic    java/lang/Math.max:(II)I
        //  4302: istore          6
        //  4304: aload_0        
        //  4305: getfield        hj6.e0:I
        //  4308: iload           7
        //  4310: invokestatic    java/lang/Math.max:(II)I
        //  4313: istore          34
        //  4315: iload           8
        //  4317: istore          4
        //  4319: iload           5
        //  4321: istore          16
        //  4323: aload_2        
        //  4324: aload           12
        //  4326: if_acmpne       4366
        //  4329: iload           8
        //  4331: istore          4
        //  4333: iload           5
        //  4335: istore          16
        //  4337: aload_0        
        //  4338: invokevirtual   hj6.x:()I
        //  4341: iload           6
        //  4343: if_icmpge       4366
        //  4346: aload_0        
        //  4347: iload           6
        //  4349: invokevirtual   hj6.X:(I)V
        //  4352: aload_0        
        //  4353: getfield        hj6.U:[Lhj6$a;
        //  4356: iconst_0       
        //  4357: aload           12
        //  4359: aastore        
        //  4360: iconst_1       
        //  4361: istore          4
        //  4363: iconst_1       
        //  4364: istore          16
        //  4366: iload           4
        //  4368: istore          6
        //  4370: iload           16
        //  4372: istore          7
        //  4374: aload           9
        //  4376: aload           12
        //  4378: if_acmpne       4418
        //  4381: iload           4
        //  4383: istore          6
        //  4385: iload           16
        //  4387: istore          7
        //  4389: aload_0        
        //  4390: invokevirtual   hj6.q:()I
        //  4393: iload           34
        //  4395: if_icmpge       4418
        //  4398: aload_0        
        //  4399: iload           34
        //  4401: invokevirtual   hj6.S:(I)V
        //  4404: aload_0        
        //  4405: getfield        hj6.U:[Lhj6$a;
        //  4408: iconst_1       
        //  4409: aload           12
        //  4411: aastore        
        //  4412: iconst_1       
        //  4413: istore          6
        //  4415: iconst_1       
        //  4416: istore          7
        //  4418: aload_0        
        //  4419: getfield        hj6.d0:I
        //  4422: aload_0        
        //  4423: invokevirtual   hj6.x:()I
        //  4426: invokestatic    java/lang/Math.max:(II)I
        //  4429: istore          5
        //  4431: iload           7
        //  4433: istore          8
        //  4435: iload           5
        //  4437: aload_0        
        //  4438: invokevirtual   hj6.x:()I
        //  4441: if_icmple       4463
        //  4444: aload_0        
        //  4445: iload           5
        //  4447: invokevirtual   hj6.X:(I)V
        //  4450: aload_0        
        //  4451: getfield        hj6.U:[Lhj6$a;
        //  4454: iconst_0       
        //  4455: aload_3        
        //  4456: aastore        
        //  4457: iconst_1       
        //  4458: istore          6
        //  4460: iconst_1       
        //  4461: istore          8
        //  4463: aload_0        
        //  4464: getfield        hj6.e0:I
        //  4467: aload_0        
        //  4468: invokevirtual   hj6.q:()I
        //  4471: invokestatic    java/lang/Math.max:(II)I
        //  4474: istore          7
        //  4476: iload           7
        //  4478: aload_0        
        //  4479: invokevirtual   hj6.q:()I
        //  4482: if_icmple       4507
        //  4485: aload_0        
        //  4486: iload           7
        //  4488: invokevirtual   hj6.S:(I)V
        //  4491: aload_0        
        //  4492: getfield        hj6.U:[Lhj6$a;
        //  4495: iconst_1       
        //  4496: aload_3        
        //  4497: aastore        
        //  4498: iconst_1       
        //  4499: istore          7
        //  4501: iconst_1       
        //  4502: istore          8
        //  4504: goto            4511
        //  4507: iload           6
        //  4509: istore          7
        //  4511: iload           7
        //  4513: istore          5
        //  4515: iload           8
        //  4517: istore          4
        //  4519: iload           8
        //  4521: ifne            4673
        //  4524: iload           7
        //  4526: istore          16
        //  4528: iload           8
        //  4530: istore          6
        //  4532: aload_0        
        //  4533: getfield        hj6.U:[Lhj6$a;
        //  4536: iconst_0       
        //  4537: aaload         
        //  4538: aload           12
        //  4540: if_acmpne       4597
        //  4543: iload           7
        //  4545: istore          16
        //  4547: iload           8
        //  4549: istore          6
        //  4551: iload           20
        //  4553: ifle            4597
        //  4556: iload           7
        //  4558: istore          16
        //  4560: iload           8
        //  4562: istore          6
        //  4564: aload_0        
        //  4565: invokevirtual   hj6.x:()I
        //  4568: iload           20
        //  4570: if_icmple       4597
        //  4573: aload_0        
        //  4574: iconst_1       
        //  4575: putfield        ij6.I0:Z
        //  4578: aload_0        
        //  4579: getfield        hj6.U:[Lhj6$a;
        //  4582: iconst_0       
        //  4583: aload_3        
        //  4584: aastore        
        //  4585: aload_0        
        //  4586: iload           20
        //  4588: invokevirtual   hj6.X:(I)V
        //  4591: iconst_1       
        //  4592: istore          16
        //  4594: iconst_1       
        //  4595: istore          6
        //  4597: iload           16
        //  4599: istore          5
        //  4601: iload           6
        //  4603: istore          4
        //  4605: aload_0        
        //  4606: getfield        hj6.U:[Lhj6$a;
        //  4609: iconst_1       
        //  4610: aaload         
        //  4611: aload           12
        //  4613: if_acmpne       4673
        //  4616: iload           16
        //  4618: istore          5
        //  4620: iload           6
        //  4622: istore          4
        //  4624: iload           19
        //  4626: ifle            4673
        //  4629: iload           16
        //  4631: istore          5
        //  4633: iload           6
        //  4635: istore          4
        //  4637: aload_0        
        //  4638: invokevirtual   hj6.q:()I
        //  4641: iload           19
        //  4643: if_icmple       4673
        //  4646: aload_0        
        //  4647: iconst_1       
        //  4648: putfield        ij6.J0:Z
        //  4651: aload_0        
        //  4652: getfield        hj6.U:[Lhj6$a;
        //  4655: iconst_1       
        //  4656: aload_3        
        //  4657: aastore        
        //  4658: aload_0        
        //  4659: iload           19
        //  4661: invokevirtual   hj6.S:(I)V
        //  4664: iconst_1       
        //  4665: istore          8
        //  4667: iconst_1       
        //  4668: istore          5
        //  4670: goto            4681
        //  4673: iload           5
        //  4675: istore          8
        //  4677: iload           4
        //  4679: istore          5
        //  4681: iload           33
        //  4683: bipush          8
        //  4685: if_icmple       4694
        //  4688: iconst_0       
        //  4689: istore          8
        //  4691: goto            4694
        //  4694: iload           33
        //  4696: istore          7
        //  4698: goto            3514
        //  4701: aload_0        
        //  4702: aload           13
        //  4704: putfield        ynx.u0:Ljava/util/ArrayList;
        //  4707: iload           5
        //  4709: ifeq            4729
        //  4712: aload_0        
        //  4713: getfield        hj6.U:[Lhj6$a;
        //  4716: astore          10
        //  4718: aload           10
        //  4720: iconst_0       
        //  4721: aload_2        
        //  4722: aastore        
        //  4723: aload           10
        //  4725: iconst_1       
        //  4726: aload           9
        //  4728: aastore        
        //  4729: aload_0        
        //  4730: aload_0        
        //  4731: getfield        ij6.A0:Lpdf;
        //  4734: getfield        pdf.l:Lwb7;
        //  4737: invokevirtual   ynx.M:(Lwb7;)V
        //  4740: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3525   3550   3943   3948   Ljava/lang/Exception;
        //  3560   3574   3589   3594   Ljava/lang/Exception;
        //  3574   3583   3938   3940   Ljava/lang/Exception;
        //  3594   3602   3938   3940   Ljava/lang/Exception;
        //  3602   3608   3927   3932   Ljava/lang/Exception;
        //  3613   3663   3927   3932   Ljava/lang/Exception;
        //  3663   3674   3904   3906   Ljava/lang/Exception;
        //  3674   3679   3922   3927   Ljava/lang/Exception;
        //  3682   3688   3904   3906   Ljava/lang/Exception;
        //  3693   3750   3904   3906   Ljava/lang/Exception;
        //  3750   3755   3922   3927   Ljava/lang/Exception;
        //  3755   3761   3904   3906   Ljava/lang/Exception;
        //  3766   3823   3904   3906   Ljava/lang/Exception;
        //  3823   3828   3922   3927   Ljava/lang/Exception;
        //  3828   3834   3904   3906   Ljava/lang/Exception;
        //  3839   3896   3904   3906   Ljava/lang/Exception;
        //  3896   3901   3922   3927   Ljava/lang/Exception;
        //  3909   3916   3922   3927   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_3682:
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
    
    public final void c0(final hj6 hj6, int n) {
        if (n == 0) {
            n = this.D0;
            final uo3[] g0 = this.G0;
            if (n + 1 >= g0.length) {
                this.G0 = Arrays.copyOf(g0, g0.length * 2);
            }
            final uo3[] g2 = this.G0;
            n = this.D0;
            g2[n] = new uo3(hj6, 0, this.z0);
            this.D0 = n + 1;
        }
        else if (n == 1) {
            n = this.E0;
            final uo3[] f0 = this.F0;
            if (n + 1 >= f0.length) {
                this.F0 = Arrays.copyOf(f0, f0.length * 2);
            }
            final uo3[] f2 = this.F0;
            n = this.E0;
            f2[n] = new uo3(hj6, 1, this.z0);
            this.E0 = n + 1;
        }
    }
    
    public final void d0(final pdf pdf) {
        final hj6$a c0 = hj6$a.C0;
        final hj6$a d0 = hj6$a.D0;
        final boolean l0 = this.l0(64);
        this.f(pdf, l0);
        final int size = super.u0.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final hj6 hj6 = super.u0.get(i);
            final boolean[] t = hj6.T;
            t[1] = (t[0] = false);
            if (hj6 instanceof si1) {
                b = true;
            }
            ++i;
        }
        if (b) {
            for (int j = 0; j < size; ++j) {
                final hj6 hj7 = super.u0.get(j);
                if (hj7 instanceof si1) {
                    final si1 si1 = (si1)hj7;
                    for (int k = 0; k < ((zjc)si1).v0; ++k) {
                        final hj6 hj8 = ((zjc)si1).u0[k];
                        if (si1.x0 || hj8.g()) {
                            final int w0 = si1.w0;
                            if (w0 != 0 && w0 != 1) {
                                if (w0 == 2 || w0 == 3) {
                                    hj8.T[1] = true;
                                }
                            }
                            else {
                                hj8.T[0] = true;
                            }
                        }
                    }
                }
            }
        }
        this.O0.clear();
        for (int n = 0; n < size; ++n) {
            final hj6 hj9 = super.u0.get(n);
            if (hj9.e()) {
                if (hj9 instanceof pdx) {
                    this.O0.add(hj9);
                }
                else {
                    hj9.f(pdf, l0);
                }
            }
        }
        while (this.O0.size() > 0) {
            final int size2 = this.O0.size();
        Label_0443:
            for (final pdx pdx : this.O0) {
                final HashSet<hj6> o0 = this.O0;
                int n2 = 0;
                while (true) {
                    while (n2 < ((zjc)pdx).v0) {
                        if (o0.contains(((zjc)pdx).u0[n2])) {
                            final boolean b2 = true;
                            if (b2) {
                                ((hj6)pdx).f(pdf, l0);
                                this.O0.remove(pdx);
                                break Label_0443;
                            }
                            continue Label_0443;
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
                final Iterator<hj6> iterator2 = this.O0.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().f(pdf, l0);
                }
                this.O0.clear();
            }
        }
        if (pdf.p) {
            final HashSet<hj6> set = new HashSet<hj6>();
            for (int n3 = 0; n3 < size; ++n3) {
                final hj6 hj10 = super.u0.get(n3);
                if (!hj10.e()) {
                    set.add(hj10);
                }
            }
            int n4;
            if (super.U[0] == d0) {
                n4 = 0;
            }
            else {
                n4 = 1;
            }
            this.d(this, pdf, (HashSet)set, n4, false);
            for (final hj6 hj11 : set) {
                nnj.a(this, pdf, hj11);
                hj11.f(pdf, l0);
            }
        }
        else {
            for (int n5 = 0; n5 < size; ++n5) {
                final hj6 hj12 = super.u0.get(n5);
                if (hj12 instanceof ij6) {
                    final hj6$a[] u = hj12.U;
                    final hj6$a hj6$a = u[0];
                    final hj6$a hj6$a2 = u[1];
                    if (hj6$a == d0) {
                        hj12.T(c0);
                    }
                    if (hj6$a2 == d0) {
                        hj12.W(c0);
                    }
                    hj12.f(pdf, l0);
                    if (hj6$a == d0) {
                        hj12.T(hj6$a);
                    }
                    if (hj6$a2 == d0) {
                        hj12.W(hj6$a2);
                    }
                }
                else {
                    nnj.a(this, pdf, hj12);
                    if (!hj12.e()) {
                        hj12.f(pdf, l0);
                    }
                }
            }
        }
        if (this.D0 > 0) {
            to3.a(this, pdf, null, 0);
        }
        if (this.E0 > 0) {
            to3.a(this, pdf, null, 1);
        }
    }
    
    public final void e0(final yi6 yi6) {
        final WeakReference<yi6> n0 = this.N0;
        if (n0 == null || n0.get() == null || yi6.d() > this.N0.get().d()) {
            this.N0 = new WeakReference<yi6>(yi6);
        }
    }
    
    public final void f0(final yi6 yi6) {
        final WeakReference<yi6> l0 = this.L0;
        if (l0 == null || l0.get() == null || yi6.d() > this.L0.get().d()) {
            this.L0 = new WeakReference<yi6>(yi6);
        }
    }
    
    public final void g0(final yi6 yi6) {
        final WeakReference<yi6> m0 = this.M0;
        if (m0 == null || m0.get() == null || yi6.d() > this.M0.get().d()) {
            this.M0 = new WeakReference<yi6>(yi6);
        }
    }
    
    public final void h0(final yi6 yi6) {
        final WeakReference<yi6> k0 = this.K0;
        if (k0 == null || k0.get() == null || yi6.d() > this.K0.get().d()) {
            this.K0 = new WeakReference<yi6>(yi6);
        }
    }
    
    public final boolean i0(final boolean b, final int n) {
        final kp8 w0 = this.w0;
        final hj6$a f0 = hj6$a.F0;
        final hj6$a d0 = hj6$a.D0;
        final hj6$a c0 = hj6$a.C0;
        final boolean b2 = true;
        final boolean b3 = b & true;
        final hj6$a p2 = w0.a.p(0);
        final hj6$a p3 = w0.a.p(1);
        final int y = w0.a.y();
        final int z = w0.a.z();
        Label_0269: {
            if (b3 && (p2 == d0 || p3 == d0)) {
                final Iterator iterator = w0.e.iterator();
                while (true) {
                    aox aox;
                    do {
                        final boolean b4 = b3;
                        if (iterator.hasNext()) {
                            aox = (aox)iterator.next();
                        }
                        else if (n == 0) {
                            if (b4 && p2 == d0) {
                                w0.a.T(c0);
                                final ij6 a = w0.a;
                                a.X(w0.d(a, 0));
                                final ij6 a2 = w0.a;
                                a2.d.e.d(a2.x());
                            }
                            break Label_0269;
                        }
                        else {
                            if (b4 && p3 == d0) {
                                w0.a.W(c0);
                                final ij6 a3 = w0.a;
                                a3.S(w0.d(a3, 1));
                                final ij6 a4 = w0.a;
                                ((aox)a4.e).e.d(a4.q());
                            }
                            break Label_0269;
                        }
                    } while (aox.f != n || aox.k());
                    final boolean b4 = false;
                    continue;
                }
            }
        }
        boolean b5 = false;
        Label_0436: {
            Label_0433: {
                if (n == 0) {
                    final ij6 a5 = w0.a;
                    final hj6$a[] u = a5.U;
                    if (u[0] == c0 || u[0] == f0) {
                        final int n2 = a5.x() + y;
                        w0.a.d.i.d(n2);
                        w0.a.d.e.d(n2 - y);
                        break Label_0433;
                    }
                }
                else {
                    final ij6 a6 = w0.a;
                    final hj6$a[] u2 = a6.U;
                    if (u2[1] == c0 || u2[1] == f0) {
                        final int n3 = a6.q() + z;
                        ((aox)w0.a.e).i.d(n3);
                        ((aox)w0.a.e).e.d(n3 - z);
                        break Label_0433;
                    }
                }
                b5 = false;
                break Label_0436;
            }
            b5 = true;
        }
        w0.g();
        for (final aox aox2 : w0.e) {
            if (aox2.f != n) {
                continue;
            }
            if (aox2.b == w0.a && !aox2.g) {
                continue;
            }
            aox2.e();
        }
        final Iterator iterator3 = w0.e.iterator();
        boolean b6 = false;
        Label_0629: {
            while (true) {
                b6 = b2;
                if (!iterator3.hasNext()) {
                    break Label_0629;
                }
                final aox aox3 = (aox)iterator3.next();
                if (aox3.f != n) {
                    continue;
                }
                if (!b5 && aox3.b == w0.a) {
                    continue;
                }
                if (!aox3.h.j) {
                    break;
                }
                if (!aox3.i.j) {
                    break;
                }
                if (!(aox3 instanceof vo3) && !((lp8)aox3.e).j) {
                    break;
                }
            }
            b6 = false;
        }
        w0.a.T(p2);
        w0.a.W(p3);
        return b6;
    }
    
    public final void j0() {
        this.w0.b = true;
    }
    
    public final boolean l0(final int n) {
        return (this.H0 & n) == n;
    }
    
    public final void m0(final js1.b b) {
        this.y0 = b;
        this.w0.f = b;
    }
    
    public final void n0(final int h0) {
        this.H0 = h0;
        pdf.p = this.l0(512);
    }
    
    public final void o0() {
        this.v0.c(this);
    }
    
    public final void u(final StringBuilder sb) {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(super.j);
        sb2.append(":{\n");
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("  actualWidth:");
        sb3.append(super.W);
        sb.append(sb3.toString());
        sb.append("\n");
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("  actualHeight:");
        sb4.append(super.X);
        sb.append(sb4.toString());
        sb.append("\n");
        final Iterator<hj6> iterator = super.u0.iterator();
        while (iterator.hasNext()) {
            iterator.next().u(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
