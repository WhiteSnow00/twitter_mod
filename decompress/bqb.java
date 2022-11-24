import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;
import android.util.Pair;
import java.util.Arrays;
import java.util.UUID;
import android.util.Log;
import com.google.android.exoplayer2.drm.b$b;
import java.util.ArrayList;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n$a;
import java.util.ArrayDeque;
import android.util.SparseArray;
import java.util.List;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqb implements qoa
{
    public static final byte[] G;
    public static final n H;
    public int A;
    public boolean B;
    public voa C;
    public vwt[] D;
    public vwt[] E;
    public boolean F;
    public final int a;
    public final List<n> b;
    public final SparseArray<bqb.bqb$b> c;
    public final gxj d;
    public final gxj e;
    public final gxj f;
    public final byte[] g;
    public final gxj h;
    public final tat i;
    public final bda j;
    public final gxj k;
    public final ArrayDeque<jx0.a> l;
    public final ArrayDeque<bqb.bqb$a> m;
    public int n;
    public int o;
    public long p;
    public int q;
    public gxj r;
    public long s;
    public int t;
    public long u;
    public long v;
    public long w;
    public bqb.bqb$b x;
    public int y;
    public int z;
    
    static {
        G = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
        final n$a n$a = new n$a();
        n$a.k = "application/x-emsg";
        H = n$a.a();
    }
    
    public bqb(final int p0, final tat p1, final pwt p2, final List<n> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: iload_1        
        //     6: putfield        bqb.a:I
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        bqb.i:Ltat;
        //    14: aload_0        
        //    15: aload_3        
        //    16: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //    19: putfield        bqb.b:Ljava/util/List;
        //    22: aload_0        
        //    23: new             Lbda;
        //    26: dup            
        //    27: invokespecial   bda.<init>:()V
        //    30: putfield        bqb.j:Lbda;
        //    33: aload_0        
        //    34: new             Lgxj;
        //    37: dup            
        //    38: bipush          16
        //    40: invokespecial   gxj.<init>:(I)V
        //    43: putfield        bqb.k:Lgxj;
        //    46: aload_0        
        //    47: new             Lgxj;
        //    50: dup            
        //    51: getstatic       z6i.a:[B
        //    54: invokespecial   gxj.<init>:([B)V
        //    57: putfield        bqb.d:Lgxj;
        //    60: aload_0        
        //    61: new             Lgxj;
        //    64: dup            
        //    65: iconst_5       
        //    66: invokespecial   gxj.<init>:(I)V
        //    69: putfield        bqb.e:Lgxj;
        //    72: aload_0        
        //    73: new             Lgxj;
        //    76: dup            
        //    77: invokespecial   gxj.<init>:()V
        //    80: putfield        bqb.f:Lgxj;
        //    83: bipush          16
        //    85: newarray        B
        //    87: astore_2       
        //    88: aload_0        
        //    89: aload_2        
        //    90: putfield        bqb.g:[B
        //    93: aload_0        
        //    94: new             Lgxj;
        //    97: dup            
        //    98: aload_2        
        //    99: invokespecial   gxj.<init>:([B)V
        //   102: putfield        bqb.h:Lgxj;
        //   105: aload_0        
        //   106: new             Ljava/util/ArrayDeque;
        //   109: dup            
        //   110: invokespecial   java/util/ArrayDeque.<init>:()V
        //   113: putfield        bqb.l:Ljava/util/ArrayDeque;
        //   116: aload_0        
        //   117: new             Ljava/util/ArrayDeque;
        //   120: dup            
        //   121: invokespecial   java/util/ArrayDeque.<init>:()V
        //   124: putfield        bqb.m:Ljava/util/ArrayDeque;
        //   127: aload_0        
        //   128: new             Landroid/util/SparseArray;
        //   131: dup            
        //   132: invokespecial   android/util/SparseArray.<init>:()V
        //   135: putfield        bqb.c:Landroid/util/SparseArray;
        //   138: aload_0        
        //   139: ldc2_w          -9223372036854775807
        //   142: putfield        bqb.v:J
        //   145: aload_0        
        //   146: ldc2_w          -9223372036854775807
        //   149: putfield        bqb.u:J
        //   152: aload_0        
        //   153: ldc2_w          -9223372036854775807
        //   156: putfield        bqb.w:J
        //   159: aload_0        
        //   160: getstatic       voa.D:Lvoa$a;
        //   163: putfield        bqb.C:Lvoa;
        //   166: aload_0        
        //   167: iconst_0       
        //   168: anewarray       Lvwt;
        //   171: putfield        bqb.D:[Lvwt;
        //   174: aload_0        
        //   175: iconst_0       
        //   176: anewarray       Lvwt;
        //   179: putfield        bqb.E:[Lvwt;
        //   182: return         
        //    Signature:
        //  (ILtat;Lpwt;Ljava/util/List<Lcom/google/android/exoplayer2/n;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public static int d(final int n) throws ParserException {
        if (n >= 0) {
            return n;
        }
        final StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(n);
        throw ParserException.a(sb.toString(), (Throwable)null);
    }
    
    public static b g(final List<jx0.b> list) {
        final int size = list.size();
        final b b = null;
        List<b$b> list2 = null;
        List<b$b> list3;
        for (int i = 0; i < size; ++i, list2 = list3) {
            final jx0.b b2 = list.get(i);
            list3 = list2;
            if (b2.a == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<b$b>();
                }
                final byte[] a = b2.b.a;
                final pnl.a b3 = pnl.b(a);
                UUID a2;
                if (b3 == null) {
                    a2 = null;
                }
                else {
                    a2 = b3.a;
                }
                if (a2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList<b$b>)list3).add(new b$b(a2, "video/mp4", a));
                }
            }
        }
        b b4;
        if (list2 == null) {
            b4 = b;
        }
        else {
            b4 = new b((String)null, false, (b$b[])list2.toArray(new b$b[0]));
        }
        return b4;
    }
    
    public static void h(final gxj gxj, int n, final rwt rwt) throws ParserException {
        gxj.D(n + 8);
        n = (gxj.e() & 0xFFFFFF);
        if ((n & 0x1) != 0x0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean b = (n & 0x2) != 0x0;
        final int w = gxj.w();
        if (w == 0) {
            Arrays.fill(rwt.l, 0, rwt.e, false);
            return;
        }
        n = rwt.e;
        if (w == n) {
            Arrays.fill(rwt.l, 0, w, b);
            final int c = gxj.c;
            n = gxj.b;
            rwt.n.A(c - n);
            rwt.k = true;
            rwt.o = true;
            final gxj n2 = rwt.n;
            gxj.d(n2.a, 0, n2.c);
            rwt.n.D(0);
            rwt.o = false;
            return;
        }
        final StringBuilder sb = new StringBuilder(80);
        sb.append("Senc sample count ");
        sb.append(w);
        sb.append(" is different from fragment sample count");
        sb.append(n);
        throw ParserException.a(sb.toString(), (Throwable)null);
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        roa roa2 = roa;
        while (true) {
            final int n = this.n;
            final int n2 = 1;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        int n6 = 0;
                        Label_1413: {
                            bqb.bqb$b x;
                            if ((x = this.x) == null) {
                                final SparseArray<bqb.bqb$b> c = this.c;
                                final int size = c.size();
                                long n3 = Long.MAX_VALUE;
                                x = null;
                                bqb.bqb$b bqb$b2;
                                long n4;
                                for (int i = 0; i < size; ++i, x = bqb$b2, n3 = n4) {
                                    final bqb.bqb$b bqb$b = (bqb.bqb$b)c.valueAt(i);
                                    final boolean l = bqb$b.l;
                                    if (!l) {
                                        bqb$b2 = x;
                                        n4 = n3;
                                        if (bqb$b.f == bqb$b.d.b) {
                                            continue;
                                        }
                                    }
                                    if (l && bqb$b.h == bqb$b.b.d) {
                                        bqb$b2 = x;
                                        n4 = n3;
                                    }
                                    else {
                                        final long a = bqb$b.a();
                                        bqb$b2 = x;
                                        n4 = n3;
                                        if (a < n3) {
                                            bqb$b2 = bqb$b;
                                            n4 = a;
                                        }
                                    }
                                }
                                if (x == null) {
                                    final int n5 = (int)(this.s - roa.getPosition());
                                    if (n5 >= 0) {
                                        roa2.k(n5);
                                        this.e();
                                        n6 = 0;
                                        break Label_1413;
                                    }
                                    throw ParserException.a("Offset to end of mdat was negative.", (Throwable)null);
                                }
                                else {
                                    int n7;
                                    if ((n7 = (int)(x.a() - roa.getPosition())) < 0) {
                                        Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        n7 = 0;
                                    }
                                    roa2.k(n7);
                                    this.x = x;
                                }
                            }
                            if (this.n == 3) {
                                int y;
                                if (!x.l) {
                                    y = x.d.d[x.f];
                                }
                                else {
                                    y = x.b.h[x.f];
                                }
                                this.y = y;
                                if (x.f < x.i) {
                                    roa2.k(y);
                                    final qwt b = x.b();
                                    if (b != null) {
                                        final gxj n8 = x.b.n;
                                        final int d = b.d;
                                        if (d != 0) {
                                            n8.E(d);
                                        }
                                        final rwt b2 = x.b;
                                        final int f = x.f;
                                        if (b2.k && b2.l[f]) {
                                            n8.E(n8.y() * 6);
                                        }
                                    }
                                    if (!x.c()) {
                                        this.x = null;
                                    }
                                    this.n = 3;
                                    n6 = n2;
                                    break Label_1413;
                                }
                                if (x.d.a.g == 1) {
                                    this.y = y - 8;
                                    roa2.k(8);
                                }
                                if ("audio/ac4".equals(x.d.a.f.Q0)) {
                                    this.z = x.d(this.y, 7);
                                    gf.a(this.y, this.h);
                                    x.a.d(this.h, 7);
                                    this.z += 7;
                                }
                                else {
                                    this.z = x.d(this.y, 0);
                                }
                                this.y += this.z;
                                this.n = 4;
                                this.A = 0;
                            }
                            final wwt d2 = x.d;
                            final pwt a2 = d2.a;
                            final vwt a3 = x.a;
                            long n9;
                            if (!x.l) {
                                n9 = d2.f[x.f];
                            }
                            else {
                                n9 = x.b.i[x.f];
                            }
                            final tat j = this.i;
                            long a4 = n9;
                            if (j != null) {
                                a4 = j.a(n9);
                            }
                            final int k = a2.j;
                            if (k != 0) {
                                final byte[] a5 = this.e.a;
                                a5[0] = 0;
                                a5[2] = (a5[1] = 0);
                                final int n10 = 4 - k;
                                while (this.z < this.y) {
                                    final int a6 = this.A;
                                    if (a6 == 0) {
                                        roa2.readFully(a5, n10, k + 1);
                                        this.e.D(0);
                                        final int e = this.e.e();
                                        if (e < 1) {
                                            throw ParserException.a("Invalid NAL length", (Throwable)null);
                                        }
                                        this.A = e - 1;
                                        this.d.D(0);
                                        a3.d(this.d, 4);
                                        a3.d(this.e, 1);
                                        boolean b4 = false;
                                        Label_0917: {
                                            if (this.E.length > 0) {
                                                final String q0 = a2.f.Q0;
                                                final byte b3 = a5[4];
                                                final byte[] a7 = z6i.a;
                                                if (("video/avc".equals(q0) && (b3 & 0x1F) == 0x6) || ("video/hevc".equals(q0) && (b3 & 0x7E) >> 1 == 39)) {
                                                    b4 = true;
                                                    break Label_0917;
                                                }
                                            }
                                            b4 = false;
                                        }
                                        this.B = b4;
                                        this.z += 5;
                                        this.y += n10;
                                    }
                                    else {
                                        int n11;
                                        if (this.B) {
                                            this.f.A(a6);
                                            roa2.readFully(this.f.a, 0, this.A);
                                            a3.d(this.f, this.A);
                                            n11 = this.A;
                                            final gxj f2 = this.f;
                                            final int f3 = z6i.f(f2.a, f2.c);
                                            this.f.D((int)("video/hevc".equals(a2.f.Q0) ? 1 : 0));
                                            this.f.C(f3);
                                            co3.a(a4, this.f, this.E);
                                        }
                                        else {
                                            n11 = a3.c((k88)roa2, a6, false);
                                        }
                                        this.z += n11;
                                        this.A -= n11;
                                    }
                                }
                            }
                            else {
                                while (true) {
                                    final int z = this.z;
                                    final int y2 = this.y;
                                    if (z >= y2) {
                                        break;
                                    }
                                    this.z += a3.c((k88)roa2, y2 - z, false);
                                }
                            }
                            int n12;
                            if (!x.l) {
                                n12 = x.d.g[x.f];
                            }
                            else if (x.b.j[x.f]) {
                                n12 = 1;
                            }
                            else {
                                n12 = 0;
                            }
                            int n13 = n12;
                            if (x.b() != null) {
                                n13 = (n12 | 0x40000000);
                            }
                            final qwt b5 = x.b();
                            vwt$a c2;
                            if (b5 != null) {
                                c2 = b5.c;
                            }
                            else {
                                c2 = null;
                            }
                            a3.b(a4, n13, this.y, 0, c2);
                            while (!this.m.isEmpty()) {
                                final bqb.bqb$a bqb$a = this.m.removeFirst();
                                this.t -= bqb$a.c;
                                long a8;
                                final long n14 = a8 = bqb$a.a;
                                if (bqb$a.b) {
                                    a8 = n14 + a4;
                                }
                                final tat m = this.i;
                                long a9 = a8;
                                if (m != null) {
                                    a9 = m.a(a8);
                                }
                                final vwt[] d3 = this.D;
                                for (int length = d3.length, n15 = 0; n15 < length; ++n15) {
                                    d3[n15].b(a9, 1, bqb$a.c, this.t, (vwt$a)null);
                                }
                            }
                            if (!x.c()) {
                                this.x = null;
                            }
                            this.n = 3;
                            n6 = 1;
                        }
                        if (n6 != 0) {
                            return 0;
                        }
                        continue;
                    }
                    else {
                        final int size2 = this.c.size();
                        long n16 = Long.MAX_VALUE;
                        bqb.bqb$b bqb$b3 = null;
                        bqb.bqb$b bqb$b4;
                        long n18;
                        for (int n17 = 0; n17 < size2; ++n17, bqb$b3 = bqb$b4, n16 = n18) {
                            final rwt b6 = ((bqb.bqb$b)this.c.valueAt(n17)).b;
                            bqb$b4 = bqb$b3;
                            n18 = n16;
                            if (b6.o) {
                                final long c3 = b6.c;
                                bqb$b4 = bqb$b3;
                                n18 = n16;
                                if (c3 < n16) {
                                    bqb$b4 = (bqb.bqb$b)this.c.valueAt(n17);
                                    n18 = c3;
                                }
                            }
                        }
                        if (bqb$b3 == null) {
                            this.n = 3;
                        }
                        else {
                            final int n19 = (int)(n16 - roa.getPosition());
                            if (n19 < 0) {
                                throw ParserException.a("Offset to encryption data was negative.", (Throwable)null);
                            }
                            roa2.k(n19);
                            final rwt b7 = bqb$b3.b;
                            final gxj n20 = b7.n;
                            roa2.readFully(n20.a, 0, n20.c);
                            b7.n.D(0);
                            b7.o = false;
                        }
                    }
                }
                else {
                    final int n21 = (int)this.p - this.q;
                    final gxj r = this.r;
                    roa roa3;
                    if (r != null) {
                        roa2.readFully(r.a, 8, n21);
                        final int o = this.o;
                        final jx0.b b8 = new jx0.b(o, r);
                        final long position = roa.getPosition();
                        if (!this.l.isEmpty()) {
                            this.l.peek().c.add(b8);
                            roa3 = roa2;
                        }
                        else {
                            Label_2603: {
                                if (o == 1936286840) {
                                    r.D(8);
                                    final int e2 = r.e();
                                    r.E(4);
                                    final long u = r.u();
                                    long n22;
                                    long n23;
                                    if ((e2 >> 24 & 0xFF) == 0x0) {
                                        n22 = r.u();
                                        n23 = r.u();
                                    }
                                    else {
                                        n22 = r.x();
                                        n23 = r.x();
                                    }
                                    long n24 = position + n23;
                                    final long n25 = rnw.N(n22, 1000000L, u);
                                    r.E(2);
                                    final int y3 = r.y();
                                    final int[] array = new int[y3];
                                    final long[] array2 = new long[y3];
                                    final long[] array3 = new long[y3];
                                    final long[] array4 = new long[y3];
                                    long n26 = n25;
                                    for (int n27 = 0; n27 < y3; ++n27) {
                                        final int e3 = r.e();
                                        if ((e3 & Integer.MIN_VALUE) != 0x0) {
                                            throw ParserException.a("Unhandled indirect reference", (Throwable)null);
                                        }
                                        final long u2 = r.u();
                                        array[n27] = (e3 & Integer.MAX_VALUE);
                                        array2[n27] = n24;
                                        array4[n27] = n26;
                                        n22 += u2;
                                        n26 = rnw.N(n22, 1000000L, u);
                                        array3[n27] = n26 - array4[n27];
                                        r.E(4);
                                        n24 += array[n27];
                                    }
                                    final Pair create = Pair.create((Object)n25, (Object)new qa4(array, array2, array3, array4));
                                    this.w = (long)create.first;
                                    this.C.l((qcp)create.second);
                                    this.F = true;
                                }
                                else if (o == 1701671783) {
                                    if (this.D.length != 0) {
                                        r.D(8);
                                        final int n28 = r.e() >> 24 & 0xFF;
                                        long n29 = -9223372036854775807L;
                                        long n31;
                                        long n32;
                                        String s;
                                        String s2;
                                        long n33;
                                        if (n28 != 0) {
                                            if (n28 != 1) {
                                                d10.F(46, "Skipping unsupported emsg version: ", n28, "FragmentedMp4Extractor");
                                                break Label_2603;
                                            }
                                            final long u3 = r.u();
                                            final long n30 = rnw.N(r.x(), 1000000L, u3);
                                            n31 = rnw.N(r.u(), 1000L, u3);
                                            n32 = r.u();
                                            s = r.n();
                                            Objects.requireNonNull(s);
                                            s2 = r.n();
                                            Objects.requireNonNull(s2);
                                            n33 = n29;
                                            n29 = n30;
                                        }
                                        else {
                                            s = r.n();
                                            Objects.requireNonNull(s);
                                            s2 = r.n();
                                            Objects.requireNonNull(s2);
                                            final long u4 = r.u();
                                            n33 = rnw.N(r.u(), 1000000L, u4);
                                            final long w = this.w;
                                            if (w != -9223372036854775807L) {
                                                n29 = w + n33;
                                            }
                                            n31 = rnw.N(r.u(), 1000L, u4);
                                            n32 = r.u();
                                        }
                                        final int n34 = r.c - r.b;
                                        final byte[] array5 = new byte[n34];
                                        r.d(array5, 0, n34);
                                        new(zca.class)();
                                        final bda j2 = this.j;
                                        j2.a.reset();
                                        try {
                                            final DataOutputStream b9 = j2.b;
                                            b9.writeBytes(s);
                                            b9.writeByte(0);
                                            final DataOutputStream b10 = j2.b;
                                            b10.writeBytes(s2);
                                            b10.writeByte(0);
                                            j2.b.writeLong(n31);
                                            j2.b.writeLong(n32);
                                            j2.b.write(array5);
                                            j2.b.flush();
                                            final gxj gxj = new gxj(j2.a.toByteArray());
                                            final int n35 = gxj.c - gxj.b;
                                            for (final vwt vwt : this.D) {
                                                gxj.D(0);
                                                vwt.d(gxj, n35);
                                            }
                                            if (n29 == -9223372036854775807L) {
                                                this.m.addLast(new bqb.bqb$a(n33, true, n35));
                                                this.t += n35;
                                            }
                                            else if (!this.m.isEmpty()) {
                                                this.m.addLast(new bqb.bqb$a(n29, false, n35));
                                                this.t += n35;
                                            }
                                            else {
                                                final tat i2 = this.i;
                                                long a10 = n29;
                                                if (i2 != null) {
                                                    a10 = i2.a(n29);
                                                }
                                                final vwt[] d5 = this.D;
                                                for (int length3 = d5.length, n37 = 0; n37 < length3; ++n37) {
                                                    d5[n37].b(a10, 1, n35, 0, (vwt$a)null);
                                                }
                                            }
                                        }
                                        catch (final IOException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                    }
                                }
                            }
                            roa3 = roa;
                        }
                    }
                    else {
                        roa2.k(n21);
                        roa3 = roa2;
                    }
                    this.j(roa.getPosition());
                    roa2 = roa3;
                }
            }
            else {
                boolean b11 = false;
                Label_3520: {
                    if (this.q == 0) {
                        if (!roa2.f(this.k.a, 0, 8, true)) {
                            b11 = false;
                            break Label_3520;
                        }
                        this.q = 8;
                        this.k.D(0);
                        this.p = this.k.u();
                        this.o = this.k.e();
                    }
                    final long p2 = this.p;
                    if (p2 == 1L) {
                        roa2.readFully(this.k.a, 8, 8);
                        this.q += 8;
                        this.p = this.k.x();
                    }
                    else if (p2 == 0L) {
                        long n39;
                        final long n38 = n39 = roa.getLength();
                        if (n38 == -1L) {
                            n39 = n38;
                            if (!this.l.isEmpty()) {
                                n39 = this.l.peek().b;
                            }
                        }
                        if (n39 != -1L) {
                            this.p = n39 - roa.getPosition() + this.q;
                        }
                    }
                    if (this.p < this.q) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    final long n40 = roa.getPosition() - this.q;
                    final int o2 = this.o;
                    if ((o2 == 1836019558 || o2 == 1835295092) && !this.F) {
                        this.C.l((qcp)new qcp.b(this.v, n40));
                        this.F = true;
                    }
                    if (this.o == 1836019558) {
                        for (int size3 = this.c.size(), n41 = 0; n41 < size3; ++n41) {
                            final rwt b12 = ((bqb.bqb$b)this.c.valueAt(n41)).b;
                            Objects.requireNonNull(b12);
                            b12.c = n40;
                            b12.b = n40;
                        }
                    }
                    final int o3 = this.o;
                    if (o3 == 1835295092) {
                        this.x = null;
                        this.s = n40 + this.p;
                        this.n = 2;
                    }
                    else if (o3 == 1836019574 || o3 == 1953653099 || o3 == 1835297121 || o3 == 1835626086 || o3 == 1937007212 || o3 == 1836019558 || o3 == 1953653094 || o3 == 1836475768 || o3 == 1701082227) {
                        final long n42 = roa.getPosition() + this.p - 8L;
                        this.l.push(new jx0.a(this.o, n42));
                        if (this.p == this.q) {
                            this.j(n42);
                        }
                        else {
                            this.e();
                        }
                    }
                    else if (o3 == 1751411826 || o3 == 1835296868 || o3 == 1836476516 || o3 == 1936286840 || o3 == 1937011556 || o3 == 1937011827 || o3 == 1668576371 || o3 == 1937011555 || o3 == 1937011578 || o3 == 1937013298 || o3 == 1937007471 || o3 == 1668232756 || o3 == 1937011571 || o3 == 1952867444 || o3 == 1952868452 || o3 == 1953196132 || o3 == 1953654136 || o3 == 1953658222 || o3 == 1886614376 || o3 == 1935763834 || o3 == 1935763823 || o3 == 1936027235 || o3 == 1970628964 || o3 == 1935828848 || o3 == 1936158820 || o3 == 1701606260 || o3 == 1835362404 || o3 == 1701671783) {
                        if (this.q != 8) {
                            throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        final long p3 = this.p;
                        if (p3 > 2147483647L) {
                            throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        final gxj r2 = new gxj((int)p3);
                        System.arraycopy(this.k.a, 0, r2.a, 0, 8);
                        this.r = r2;
                        this.n = 1;
                    }
                    else {
                        if (this.p > 2147483647L) {
                            throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.r = null;
                        this.n = 1;
                    }
                    b11 = true;
                }
                if (!b11) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final boolean b(final roa roa) throws IOException {
        return r1n.e0(roa, true, false);
    }
    
    public final void c(final long n, final long u) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            ((bqb.bqb$b)this.c.valueAt(i)).e();
        }
        this.m.clear();
        this.t = 0;
        this.u = u;
        this.l.clear();
        this.e();
    }
    
    public final void e() {
        this.n = 0;
        this.q = 0;
    }
    
    public final kk8 f(final SparseArray<kk8> sparseArray, final int n) {
        if (sparseArray.size() == 1) {
            return (kk8)sparseArray.valueAt(0);
        }
        final kk8 kk8 = (kk8)sparseArray.get(n);
        Objects.requireNonNull(kk8);
        return kk8;
    }
    
    public final void i(final voa c) {
        this.C = c;
        this.e();
        final vwt[] d = new vwt[2];
        this.D = d;
        final int a = this.a;
        int n = 100;
        final int n2 = 0;
        int n3;
        if ((a & 0x4) != 0x0) {
            d[0] = this.C.r(100, 5);
            n = 101;
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final vwt[] d2 = (vwt[])rnw.J((Object[])this.D, n3);
        this.D = d2;
        for (int length = d2.length, i = 0; i < length; ++i) {
            d2[i].e(bqb.H);
        }
        this.E = new vwt[this.b.size()];
        for (int j = n2; j < this.E.length; ++j, ++n) {
            final vwt r = this.C.r(n, 3);
            r.e((n)this.b.get(j));
            this.E[j] = r;
        }
    }
    
    public final void j(final long n) throws ParserException {
        bqb bqb2;
        bqb bqb3;
        for (bqb bqb = bqb2 = this; !bqb2.l.isEmpty() && bqb2.l.peek().b == n; bqb2 = bqb3) {
            final jx0.a a = bqb2.l.pop();
            final int a2 = a.a;
            if (a2 == 1836019574) {
                final b g = g(a.c);
                final jx0.a b = a.b(1836475768);
                Objects.requireNonNull(b);
                final SparseArray sparseArray = new SparseArray();
                final int size = b.c.size();
                long n2 = -9223372036854775807L;
                for (int i = 0; i < size; ++i) {
                    final jx0.b b2 = b.c.get(i);
                    final int a3 = b2.a;
                    if (a3 == 1953654136) {
                        final gxj b3 = b2.b;
                        b3.D(12);
                        final Pair create = Pair.create((Object)b3.e(), (Object)new kk8(b3.e() - 1, b3.e(), b3.e(), b3.e()));
                        sparseArray.put((int)create.first, (Object)create.second);
                    }
                    else if (a3 == 1835362404) {
                        final gxj b4 = b2.b;
                        b4.D(8);
                        if ((b4.e() >> 24 & 0xFF) == 0x0) {
                            n2 = b4.u();
                        }
                        else {
                            n2 = b4.x();
                        }
                    }
                }
                final ArrayList list = (ArrayList)kx0.f(a, new iyb(), n2, g, (bqb2.a & 0x10) != 0x0, false, (dub)new aqb(bqb2));
                final int size2 = list.size();
                if (bqb2.c.size() == 0) {
                    for (int j = 0; j < size2; ++j) {
                        final wwt wwt = list.get(j);
                        final pwt a4 = wwt.a;
                        bqb2.c.put(a4.a, (Object)new bqb.bqb$b(bqb2.C.r(j, a4.b), wwt, bqb2.f((SparseArray<kk8>)sparseArray, a4.a)));
                        bqb2.v = Math.max(bqb2.v, a4.e);
                    }
                    bqb2.C.p();
                }
                else {
                    omi.p(bqb2.c.size() == size2);
                    for (int k = 0; k < size2; ++k) {
                        final wwt d = list.get(k);
                        final pwt a5 = d.a;
                        final bqb.bqb$b bqb$b = (bqb.bqb$b)bqb2.c.get(a5.a);
                        final kk8 f = bqb2.f((SparseArray<kk8>)sparseArray, a5.a);
                        bqb$b.d = d;
                        bqb$b.e = f;
                        bqb$b.a.e(d.a.f);
                        bqb$b.e();
                    }
                }
                bqb3 = bqb2;
            }
            else if (a2 == 1836019558) {
                SparseArray c = bqb2.c;
                int a6 = bqb2.a;
                final byte[] g2 = bqb2.g;
                int size3 = a.d.size();
                int l = 0;
                jx0.a a7 = a;
                while (l < size3) {
                    final jx0.a a8 = a7.d.get(l);
                    int n24 = 0;
                    int n31 = 0;
                    Label_3081: {
                        if (a8.a == 1953653094) {
                            final jx0.b c2 = a8.c(1952868452);
                            Objects.requireNonNull(c2);
                            final gxj b5 = c2.b;
                            b5.D(8);
                            final int n3 = b5.e() & 0xFFFFFF;
                            bqb.bqb$b bqb$b2 = (bqb.bqb$b)c.get(b5.e());
                            if (bqb$b2 == null) {
                                bqb$b2 = null;
                            }
                            else {
                                if ((n3 & 0x1) != 0x0) {
                                    final long x = b5.x();
                                    final rwt b6 = bqb$b2.b;
                                    b6.b = x;
                                    b6.c = x;
                                }
                                final kk8 e = bqb$b2.e;
                                int a9;
                                if ((n3 & 0x2) != 0x0) {
                                    a9 = b5.e() - 1;
                                }
                                else {
                                    a9 = e.a;
                                }
                                int n4;
                                if ((n3 & 0x8) != 0x0) {
                                    n4 = b5.e();
                                }
                                else {
                                    n4 = e.b;
                                }
                                int n5;
                                if ((n3 & 0x10) != 0x0) {
                                    n5 = b5.e();
                                }
                                else {
                                    n5 = e.c;
                                }
                                int n6;
                                if ((n3 & 0x20) != 0x0) {
                                    n6 = b5.e();
                                }
                                else {
                                    n6 = e.d;
                                }
                                bqb$b2.b.a = new kk8(a9, n4, n5, n6);
                            }
                            if (bqb$b2 != null) {
                                final rwt b7 = bqb$b2.b;
                                final long p = b7.p;
                                final boolean q = b7.q;
                                bqb$b2.e();
                                bqb$b2.l = true;
                                final jx0.b c3 = a8.c(1952867444);
                                if (c3 != null && (a6 & 0x2) == 0x0) {
                                    final gxj b8 = c3.b;
                                    b8.D(8);
                                    long p2;
                                    if ((b8.e() >> 24 & 0xFF) == 0x1) {
                                        p2 = b8.x();
                                    }
                                    else {
                                        p2 = b8.u();
                                    }
                                    b7.p = p2;
                                    b7.q = true;
                                }
                                else {
                                    b7.p = p;
                                    b7.q = q;
                                }
                                final ArrayList c4 = a8.c;
                                final int size4 = c4.size();
                                int n7 = 0;
                                int d2 = 0;
                                int e2 = 0;
                                while (n7 < size4) {
                                    final jx0.b b9 = (jx0.b)c4.get(n7);
                                    int n8 = d2;
                                    int n9 = e2;
                                    if (b9.a == 1953658222) {
                                        final gxj b10 = b9.b;
                                        b10.D(12);
                                        final int w = b10.w();
                                        n8 = d2;
                                        n9 = e2;
                                        if (w > 0) {
                                            n9 = e2 + w;
                                            n8 = d2 + 1;
                                        }
                                    }
                                    ++n7;
                                    d2 = n8;
                                    e2 = n9;
                                }
                                final SparseArray sparseArray2 = c;
                                final int n10 = size3;
                                final bqb.bqb$b bqb$b3 = bqb$b2;
                                bqb$b3.h = 0;
                                bqb$b3.g = 0;
                                bqb$b3.f = 0;
                                final rwt b11 = bqb$b3.b;
                                b11.d = d2;
                                b11.e = e2;
                                if (b11.g.length < d2) {
                                    b11.f = new long[d2];
                                    b11.g = new int[d2];
                                }
                                if (b11.h.length < e2) {
                                    final int n11 = e2 * 125 / 100;
                                    b11.h = new int[n11];
                                    b11.i = new long[n11];
                                    b11.j = new boolean[n11];
                                    b11.l = new boolean[n11];
                                }
                                int n12 = 0;
                                int n13 = 0;
                                int n14 = 0;
                                final jx0.a a10 = a8;
                                final rwt rwt = b7;
                                final jx0.a a11 = a7;
                                final bqb.bqb$b bqb$b4 = bqb$b3;
                                while (n12 < size4) {
                                    final jx0.b b12 = (jx0.b)c4.get(n12);
                                    if (b12.a == 1953658222) {
                                        final gxj b13 = b12.b;
                                        b13.D(8);
                                        final int n15 = b13.e() & 0xFFFFFF;
                                        final pwt a12 = bqb$b4.d.a;
                                        final rwt b14 = bqb$b4.b;
                                        final kk8 a13 = b14.a;
                                        final int a14 = rnw.a;
                                        b14.g[n14] = b13.w();
                                        final long[] f2 = b14.f;
                                        f2[n14] = b14.b;
                                        if ((n15 & 0x1) != 0x0) {
                                            f2[n14] += b13.e();
                                        }
                                        final boolean b15 = (n15 & 0x4) != 0x0;
                                        int n16 = a13.d;
                                        if (b15) {
                                            n16 = b13.e();
                                        }
                                        final boolean b16 = (n15 & 0x100) != 0x0;
                                        final boolean b17 = (n15 & 0x200) != 0x0;
                                        final boolean b18 = (n15 & 0x400) != 0x0;
                                        final boolean b19 = (n15 & 0x800) != 0x0;
                                        final long[] h = a12.h;
                                        long n17;
                                        if (h != null && h.length == 1 && h[0] == 0L) {
                                            n17 = a12.i[0];
                                        }
                                        else {
                                            n17 = 0L;
                                        }
                                        final int[] h2 = b14.h;
                                        final long[] m = b14.i;
                                        final boolean[] j2 = b14.j;
                                        final boolean b20 = a12.b == 2 && (a6 & 0x1) != 0x0;
                                        final int n18 = b14.g[n14] + n13;
                                        final long c5 = a12.c;
                                        long p3 = b14.p;
                                        int n19 = n13;
                                        n13 = n18;
                                        final boolean b21 = b15;
                                        while (n19 < n13) {
                                            int n20;
                                            if (b16) {
                                                n20 = b13.e();
                                            }
                                            else {
                                                n20 = a13.b;
                                            }
                                            d(n20);
                                            int n21;
                                            if (b17) {
                                                n21 = b13.e();
                                            }
                                            else {
                                                n21 = a13.c;
                                            }
                                            d(n21);
                                            int n22;
                                            if (b18) {
                                                n22 = b13.e();
                                            }
                                            else if (n19 == 0 && b21) {
                                                n22 = n16;
                                            }
                                            else {
                                                n22 = a13.d;
                                            }
                                            int e3;
                                            if (b19) {
                                                e3 = b13.e();
                                            }
                                            else {
                                                e3 = 0;
                                            }
                                            m[n19] = rnw.N(e3 + p3 - n17, 1000000L, c5);
                                            if (!b14.q) {
                                                m[n19] += bqb$b4.d.h;
                                            }
                                            h2[n19] = n21;
                                            j2[n19] = ((n22 >> 16 & 0x1) == 0x0 && (!b20 || n19 == 0));
                                            p3 += n20;
                                            ++n19;
                                        }
                                        b14.p = p3;
                                        ++n14;
                                    }
                                    ++n12;
                                }
                                final jx0.a a15 = a11;
                                final int n23 = a6;
                                n24 = l;
                                final pwt a16 = bqb$b4.d.a;
                                final kk8 a17 = rwt.a;
                                Objects.requireNonNull(a17);
                                final qwt a18 = a16.a(a17.a);
                                final jx0.b c6 = a10.c(1935763834);
                                if (c6 != null) {
                                    Objects.requireNonNull(a18);
                                    final gxj b22 = c6.b;
                                    final int d3 = a18.d;
                                    b22.D(8);
                                    if ((b22.e() & 0xFFFFFF & 0x1) == 0x1) {
                                        b22.E(8);
                                    }
                                    final int t = b22.t();
                                    final int w2 = b22.w();
                                    final int e4 = rwt.e;
                                    if (w2 > e4) {
                                        final StringBuilder sb = new StringBuilder(78);
                                        sb.append("Saiz sample count ");
                                        sb.append(w2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(e4);
                                        throw ParserException.a(sb.toString(), (Throwable)null);
                                    }
                                    int n26;
                                    if (t == 0) {
                                        final boolean[] l2 = rwt.l;
                                        int n25 = 0;
                                        n26 = 0;
                                        while (n25 < w2) {
                                            final int t2 = b22.t();
                                            n26 += t2;
                                            l2[n25] = (t2 > d3);
                                            ++n25;
                                        }
                                    }
                                    else {
                                        final boolean b23 = t > d3;
                                        n26 = t * w2 + 0;
                                        Arrays.fill(rwt.l, 0, w2, b23);
                                    }
                                    Arrays.fill(rwt.l, w2, rwt.e, false);
                                    if (n26 > 0) {
                                        rwt.n.A(n26);
                                        rwt.k = true;
                                        rwt.o = true;
                                    }
                                }
                                final jx0.b c7 = a10.c(1935763823);
                                if (c7 != null) {
                                    final gxj b24 = c7.b;
                                    b24.D(8);
                                    final int e5 = b24.e();
                                    if ((0xFFFFFF & e5 & 0x1) == 0x1) {
                                        b24.E(8);
                                    }
                                    final int w3 = b24.w();
                                    if (w3 != 1) {
                                        final StringBuilder sb2 = new StringBuilder(40);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(w3);
                                        throw ParserException.a(sb2.toString(), (Throwable)null);
                                    }
                                    final long c8 = rwt.c;
                                    long n27;
                                    if ((e5 >> 24 & 0xFF) == 0x0) {
                                        n27 = b24.u();
                                    }
                                    else {
                                        n27 = b24.x();
                                    }
                                    rwt.c = c8 + n27;
                                }
                                final jx0.b c9 = a10.c(1936027235);
                                if (c9 != null) {
                                    h(c9.b, 0, rwt);
                                }
                                String b25;
                                if (a18 != null) {
                                    b25 = a18.b;
                                }
                                else {
                                    b25 = null;
                                }
                                gxj gxj = null;
                                gxj gxj2 = null;
                                gxj gxj3;
                                gxj gxj4;
                                for (int n28 = 0; n28 < a10.c.size(); ++n28, gxj = gxj3, gxj2 = gxj4) {
                                    final jx0.b b26 = a10.c.get(n28);
                                    final gxj b27 = b26.b;
                                    final int a19 = b26.a;
                                    if (a19 == 1935828848) {
                                        b27.D(12);
                                        gxj3 = gxj;
                                        gxj4 = gxj2;
                                        if (b27.e() == 1936025959) {
                                            gxj3 = b27;
                                            gxj4 = gxj2;
                                        }
                                    }
                                    else {
                                        gxj3 = gxj;
                                        gxj4 = gxj2;
                                        if (a19 == 1936158820) {
                                            b27.D(12);
                                            gxj3 = gxj;
                                            gxj4 = gxj2;
                                            if (b27.e() == 1936025959) {
                                                gxj4 = b27;
                                                gxj3 = gxj;
                                            }
                                        }
                                    }
                                }
                                if (gxj != null) {
                                    if (gxj2 != null) {
                                        gxj.D(8);
                                        final int e6 = gxj.e();
                                        gxj.E(4);
                                        if ((e6 >> 24 & 0xFF) == 0x1) {
                                            gxj.E(4);
                                        }
                                        if (gxj.e() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        gxj2.D(8);
                                        final int n29 = gxj2.e() >> 24 & 0xFF;
                                        gxj2.E(4);
                                        if (n29 == 1) {
                                            if (gxj2.u() == 0L) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        }
                                        else if (n29 >= 2) {
                                            gxj2.E(4);
                                        }
                                        if (gxj2.u() != 1L) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        gxj2.E(1);
                                        final int t3 = gxj2.t();
                                        final boolean b28 = gxj2.t() == 1;
                                        if (b28) {
                                            final int t4 = gxj2.t();
                                            final byte[] array = new byte[16];
                                            gxj2.d(array, 0, 16);
                                            byte[] array3;
                                            if (t4 == 0) {
                                                final int t5 = gxj2.t();
                                                final byte[] array2 = new byte[t5];
                                                gxj2.d(array2, 0, t5);
                                                array3 = array2;
                                            }
                                            else {
                                                array3 = null;
                                            }
                                            rwt.k = true;
                                            rwt.m = new qwt(b28, b25, t4, array, (t3 & 0xF0) >> 4, t3 & 0xF, array3);
                                        }
                                    }
                                }
                                for (int size5 = a10.c.size(), n30 = 0; n30 < size5; ++n30) {
                                    final jx0.b b29 = a10.c.get(n30);
                                    if (b29.a == 1970628964) {
                                        final gxj b30 = b29.b;
                                        b30.D(8);
                                        b30.d(g2, 0, 16);
                                        if (Arrays.equals(g2, bqb.G)) {
                                            h(b30, 16, rwt);
                                        }
                                    }
                                }
                                n31 = n10;
                                c = sparseArray2;
                                a7 = a15;
                                a6 = n23;
                                break Label_3081;
                            }
                        }
                        n24 = l;
                        n31 = size3;
                    }
                    ++n24;
                    size3 = n31;
                    l = n24;
                }
                final b g3 = g(a7.c);
                bqb = this;
                if (g3 != null) {
                    for (int size6 = bqb.c.size(), n32 = 0; n32 < size6; ++n32) {
                        final bqb.bqb$b bqb$b5 = (bqb.bqb$b)bqb.c.valueAt(n32);
                        final pwt a20 = bqb$b5.d.a;
                        final kk8 a21 = bqb$b5.b.a;
                        final int a22 = rnw.a;
                        final qwt a23 = a20.a(a21.a);
                        String b31;
                        if (a23 != null) {
                            b31 = a23.b;
                        }
                        else {
                            b31 = null;
                        }
                        final b a24 = g3.a(b31);
                        final n$a n$a = new n$a(bqb$b5.d.a.f);
                        n$a.n = a24;
                        bqb$b5.a.e(new n(n$a));
                    }
                }
                if (bqb.u != -9223372036854775807L) {
                    for (int size7 = bqb.c.size(), n33 = 0; n33 < size7; ++n33) {
                        final bqb.bqb$b bqb$b6 = (bqb.bqb$b)bqb.c.valueAt(n33);
                        final long u = bqb.u;
                        int f3 = bqb$b6.f;
                        while (true) {
                            final rwt b32 = bqb$b6.b;
                            if (f3 >= b32.e || b32.i[f3] >= u) {
                                break;
                            }
                            if (b32.j[f3]) {
                                bqb$b6.i = f3;
                            }
                            ++f3;
                        }
                    }
                    bqb.u = -9223372036854775807L;
                }
                bqb3 = bqb;
            }
            else {
                final bqb bqb4 = bqb;
                bqb3 = bqb2;
                bqb = bqb4;
                if (!bqb2.l.isEmpty()) {
                    bqb2.l.peek().d.add(a);
                    bqb = bqb4;
                    bqb3 = bqb2;
                }
            }
        }
        this.e();
    }
    
    public final void release() {
    }
}
