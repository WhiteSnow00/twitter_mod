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

public final class eqb implements joa
{
    public static final byte[] G;
    public static final n H;
    public int A;
    public boolean B;
    public ooa C;
    public ovt[] D;
    public ovt[] E;
    public boolean F;
    public final int a;
    public final List<n> b;
    public final SparseArray<eqb.eqb$b> c;
    public final mwj d;
    public final mwj e;
    public final mwj f;
    public final byte[] g;
    public final mwj h;
    public final h9t i;
    public final lca j;
    public final mwj k;
    public final ArrayDeque<kx0$a> l;
    public final ArrayDeque<eqb.eqb$a> m;
    public int n;
    public int o;
    public long p;
    public int q;
    public mwj r;
    public long s;
    public int t;
    public long u;
    public long v;
    public long w;
    public eqb.eqb$b x;
    public int y;
    public int z;
    
    static {
        G = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
        final n$a n$a = new n$a();
        n$a.k = "application/x-emsg";
        H = n$a.a();
    }
    
    public eqb(final int p0, final h9t p1, final ivt p2, final List<n> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: iload_1        
        //     6: putfield        eqb.a:I
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        eqb.i:Lh9t;
        //    14: aload_0        
        //    15: aload_3        
        //    16: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //    19: putfield        eqb.b:Ljava/util/List;
        //    22: aload_0        
        //    23: new             Llca;
        //    26: dup            
        //    27: invokespecial   lca.<init>:()V
        //    30: putfield        eqb.j:Llca;
        //    33: aload_0        
        //    34: new             Lmwj;
        //    37: dup            
        //    38: bipush          16
        //    40: invokespecial   mwj.<init>:(I)V
        //    43: putfield        eqb.k:Lmwj;
        //    46: aload_0        
        //    47: new             Lmwj;
        //    50: dup            
        //    51: getstatic       e6i.a:[B
        //    54: invokespecial   mwj.<init>:([B)V
        //    57: putfield        eqb.d:Lmwj;
        //    60: aload_0        
        //    61: new             Lmwj;
        //    64: dup            
        //    65: iconst_5       
        //    66: invokespecial   mwj.<init>:(I)V
        //    69: putfield        eqb.e:Lmwj;
        //    72: aload_0        
        //    73: new             Lmwj;
        //    76: dup            
        //    77: invokespecial   mwj.<init>:()V
        //    80: putfield        eqb.f:Lmwj;
        //    83: bipush          16
        //    85: newarray        B
        //    87: astore_2       
        //    88: aload_0        
        //    89: aload_2        
        //    90: putfield        eqb.g:[B
        //    93: aload_0        
        //    94: new             Lmwj;
        //    97: dup            
        //    98: aload_2        
        //    99: invokespecial   mwj.<init>:([B)V
        //   102: putfield        eqb.h:Lmwj;
        //   105: aload_0        
        //   106: new             Ljava/util/ArrayDeque;
        //   109: dup            
        //   110: invokespecial   java/util/ArrayDeque.<init>:()V
        //   113: putfield        eqb.l:Ljava/util/ArrayDeque;
        //   116: aload_0        
        //   117: new             Ljava/util/ArrayDeque;
        //   120: dup            
        //   121: invokespecial   java/util/ArrayDeque.<init>:()V
        //   124: putfield        eqb.m:Ljava/util/ArrayDeque;
        //   127: aload_0        
        //   128: new             Landroid/util/SparseArray;
        //   131: dup            
        //   132: invokespecial   android/util/SparseArray.<init>:()V
        //   135: putfield        eqb.c:Landroid/util/SparseArray;
        //   138: aload_0        
        //   139: ldc2_w          -9223372036854775807
        //   142: putfield        eqb.v:J
        //   145: aload_0        
        //   146: ldc2_w          -9223372036854775807
        //   149: putfield        eqb.u:J
        //   152: aload_0        
        //   153: ldc2_w          -9223372036854775807
        //   156: putfield        eqb.w:J
        //   159: aload_0        
        //   160: getstatic       ooa.C:Looa$a;
        //   163: putfield        eqb.C:Looa;
        //   166: aload_0        
        //   167: iconst_0       
        //   168: anewarray       Lovt;
        //   171: putfield        eqb.D:[Lovt;
        //   174: aload_0        
        //   175: iconst_0       
        //   176: anewarray       Lovt;
        //   179: putfield        eqb.E:[Lovt;
        //   182: return         
        //    Signature:
        //  (ILh9t;Livt;Ljava/util/List<Lcom/google/android/exoplayer2/n;>;)V
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
    
    public static b g(final List<kx0$b> list) {
        final int size = list.size();
        final b b = null;
        List<b$b> list2 = null;
        List<b$b> list3;
        for (int i = 0; i < size; ++i, list2 = list3) {
            final kx0$b kx0$b = list.get(i);
            list3 = list2;
            if (((kx0)kx0$b).a == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<b$b>();
                }
                final byte[] a = kx0$b.b.a;
                final pml.a b2 = pml.b(a);
                UUID a2;
                if (b2 == null) {
                    a2 = null;
                }
                else {
                    a2 = b2.a;
                }
                if (a2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList<b$b>)list3).add(new b$b(a2, "video/mp4", a));
                }
            }
        }
        b b3;
        if (list2 == null) {
            b3 = b;
        }
        else {
            b3 = new b((String)null, false, (b$b[])list2.toArray(new b$b[0]));
        }
        return b3;
    }
    
    public static void h(final mwj mwj, int n, final kvt kvt) throws ParserException {
        mwj.D(n + 8);
        n = (mwj.e() & 0xFFFFFF);
        if ((n & 0x1) != 0x0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean b = (n & 0x2) != 0x0;
        n = mwj.w();
        if (n == 0) {
            Arrays.fill(kvt.l, 0, kvt.e, false);
            return;
        }
        final int e = kvt.e;
        if (n == e) {
            Arrays.fill(kvt.l, 0, n, b);
            n = mwj.c;
            kvt.n.A(n - mwj.b);
            kvt.k = true;
            kvt.o = true;
            final mwj n2 = kvt.n;
            mwj.d(n2.a, 0, n2.c);
            kvt.n.D(0);
            kvt.o = false;
            return;
        }
        final StringBuilder sb = new StringBuilder(80);
        sb.append("Senc sample count ");
        sb.append(n);
        sb.append(" is different from fragment sample count");
        sb.append(e);
        throw ParserException.a(sb.toString(), (Throwable)null);
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        koa koa2 = koa;
        while (true) {
            final int n = this.n;
            final int n2 = 1;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        int n6 = 0;
                        Label_1467: {
                            eqb.eqb$b x;
                            if ((x = this.x) == null) {
                                final SparseArray<eqb.eqb$b> c = this.c;
                                final int size = c.size();
                                long n3 = Long.MAX_VALUE;
                                x = null;
                                eqb.eqb$b eqb$b2;
                                long n4;
                                for (int i = 0; i < size; ++i, x = eqb$b2, n3 = n4) {
                                    final eqb.eqb$b eqb$b = (eqb.eqb$b)c.valueAt(i);
                                    final boolean l = eqb$b.l;
                                    if (!l) {
                                        eqb$b2 = x;
                                        n4 = n3;
                                        if (eqb$b.f == eqb$b.d.b) {
                                            continue;
                                        }
                                    }
                                    if (l && eqb$b.h == eqb$b.b.d) {
                                        eqb$b2 = x;
                                        n4 = n3;
                                    }
                                    else {
                                        final long a = eqb$b.a();
                                        eqb$b2 = x;
                                        n4 = n3;
                                        if (a < n3) {
                                            eqb$b2 = eqb$b;
                                            n4 = a;
                                        }
                                    }
                                }
                                if (x == null) {
                                    final int n5 = (int)(this.s - koa.getPosition());
                                    if (n5 >= 0) {
                                        koa2.k(n5);
                                        this.e();
                                        n6 = 0;
                                        break Label_1467;
                                    }
                                    throw ParserException.a("Offset to end of mdat was negative.", (Throwable)null);
                                }
                                else {
                                    int n7;
                                    if ((n7 = (int)(x.a() - koa.getPosition())) < 0) {
                                        Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        n7 = 0;
                                    }
                                    koa2.k(n7);
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
                                    koa2.k(y);
                                    final jvt b = x.b();
                                    if (b != null) {
                                        final mwj n8 = x.b.n;
                                        final int d = b.d;
                                        if (d != 0) {
                                            n8.E(d);
                                        }
                                        final kvt b2 = x.b;
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
                                    break Label_1467;
                                }
                                if (x.d.a.g == 1) {
                                    this.y = y - 8;
                                    koa2.k(8);
                                }
                                if ("audio/ac4".equals(x.d.a.f.N0)) {
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
                            final pvt d2 = x.d;
                            final ivt a2 = d2.a;
                            final ovt a3 = x.a;
                            long n9;
                            if (!x.l) {
                                n9 = d2.f[x.f];
                            }
                            else {
                                n9 = x.b.i[x.f];
                            }
                            final h9t j = this.i;
                            long a4 = n9;
                            if (j != null) {
                                a4 = j.a(n9);
                            }
                            final int k = a2.j;
                            if (k != 0) {
                                final byte[] a5 = this.e.a;
                                a5[0] = 0;
                                a5[1] = 0;
                                a5[2] = 0;
                                final int n10 = 4 - k;
                                while (this.z < this.y) {
                                    final int a6 = this.A;
                                    if (a6 == 0) {
                                        koa2.readFully(a5, n10, k + 1);
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
                                        Label_0955: {
                                            if (this.E.length > 0) {
                                                final String n11 = a2.f.N0;
                                                final byte b3 = a5[4];
                                                final byte[] a7 = e6i.a;
                                                if (("video/avc".equals(n11) && (b3 & 0x1F) == 0x6) || ("video/hevc".equals(n11) && (b3 & 0x7E) >> 1 == 39)) {
                                                    b4 = true;
                                                    break Label_0955;
                                                }
                                            }
                                            b4 = false;
                                        }
                                        this.B = b4;
                                        this.z += 5;
                                        this.y += n10;
                                    }
                                    else {
                                        int n12;
                                        if (this.B) {
                                            this.f.A(a6);
                                            koa2.readFully(this.f.a, 0, this.A);
                                            a3.d(this.f, this.A);
                                            n12 = this.A;
                                            final mwj f2 = this.f;
                                            final int f3 = e6i.f(f2.a, f2.c);
                                            this.f.D((int)("video/hevc".equals(a2.f.N0) ? 1 : 0));
                                            this.f.C(f3);
                                            vn3.a(a4, this.f, this.E);
                                        }
                                        else {
                                            n12 = a3.c((v78)koa2, a6, false);
                                        }
                                        this.z += n12;
                                        this.A -= n12;
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
                                    this.z += a3.c((v78)koa2, y2 - z, false);
                                }
                            }
                            int n13;
                            if (!x.l) {
                                n13 = x.d.g[x.f];
                            }
                            else if (x.b.j[x.f]) {
                                n13 = 1;
                            }
                            else {
                                n13 = 0;
                            }
                            int n14 = n13;
                            if (x.b() != null) {
                                n14 = (n13 | 0x40000000);
                            }
                            final jvt b5 = x.b();
                            ovt$a c2;
                            if (b5 != null) {
                                c2 = b5.c;
                            }
                            else {
                                c2 = null;
                            }
                            a3.b(a4, n14, this.y, 0, c2);
                            while (!this.m.isEmpty()) {
                                final eqb.eqb$a eqb$a = this.m.removeFirst();
                                this.t -= eqb$a.c;
                                long a8;
                                final long n15 = a8 = eqb$a.a;
                                if (eqb$a.b) {
                                    a8 = n15 + a4;
                                }
                                final h9t m = this.i;
                                long a9 = a8;
                                if (m != null) {
                                    a9 = m.a(a8);
                                }
                                final ovt[] d3 = this.D;
                                for (int length = d3.length, n16 = 0; n16 < length; ++n16) {
                                    d3[n16].b(a9, 1, eqb$a.c, this.t, (ovt$a)null);
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
                        long n17 = Long.MAX_VALUE;
                        eqb.eqb$b eqb$b3 = null;
                        eqb.eqb$b eqb$b4;
                        long n19;
                        for (int n18 = 0; n18 < size2; ++n18, eqb$b3 = eqb$b4, n17 = n19) {
                            final kvt b6 = ((eqb.eqb$b)this.c.valueAt(n18)).b;
                            eqb$b4 = eqb$b3;
                            n19 = n17;
                            if (b6.o) {
                                final long c3 = b6.c;
                                eqb$b4 = eqb$b3;
                                n19 = n17;
                                if (c3 < n17) {
                                    eqb$b4 = (eqb.eqb$b)this.c.valueAt(n18);
                                    n19 = c3;
                                }
                            }
                        }
                        if (eqb$b3 == null) {
                            this.n = 3;
                        }
                        else {
                            final int n20 = (int)(n17 - koa.getPosition());
                            if (n20 < 0) {
                                throw ParserException.a("Offset to encryption data was negative.", (Throwable)null);
                            }
                            koa2.k(n20);
                            final kvt b7 = eqb$b3.b;
                            final mwj n21 = b7.n;
                            koa2.readFully(n21.a, 0, n21.c);
                            b7.n.D(0);
                            b7.o = false;
                        }
                    }
                }
                else {
                    final int n22 = (int)this.p - this.q;
                    final mwj r = this.r;
                    koa koa3;
                    if (r != null) {
                        koa2.readFully(r.a, 8, n22);
                        final int o = this.o;
                        final kx0$b kx0$b = new kx0$b(o, r);
                        final long position = koa.getPosition();
                        if (!this.l.isEmpty()) {
                            this.l.peek().c.add(kx0$b);
                            koa3 = koa2;
                        }
                        else {
                            Label_2682: {
                                if (o == 1936286840) {
                                    r.D(8);
                                    final int e2 = r.e();
                                    r.E(4);
                                    final long u = r.u();
                                    long n23;
                                    long n24;
                                    if ((e2 >> 24 & 0xFF) == 0x0) {
                                        n23 = r.u();
                                        n24 = r.u();
                                    }
                                    else {
                                        n23 = r.x();
                                        n24 = r.x();
                                    }
                                    long n25 = position + n24;
                                    final long n26 = imw.N(n23, 1000000L, u);
                                    r.E(2);
                                    final int y3 = r.y();
                                    final int[] array = new int[y3];
                                    final long[] array2 = new long[y3];
                                    final long[] array3 = new long[y3];
                                    final long[] array4 = new long[y3];
                                    long n27 = n26;
                                    for (int n28 = 0; n28 < y3; ++n28) {
                                        final int e3 = r.e();
                                        if ((e3 & Integer.MIN_VALUE) != 0x0) {
                                            throw ParserException.a("Unhandled indirect reference", (Throwable)null);
                                        }
                                        final long u2 = r.u();
                                        array[n28] = (e3 & Integer.MAX_VALUE);
                                        array2[n28] = n25;
                                        array4[n28] = n27;
                                        n23 += u2;
                                        n27 = imw.N(n23, 1000000L, u);
                                        array3[n28] = n27 - array4[n28];
                                        r.E(4);
                                        n25 += array[n28];
                                    }
                                    final Pair create = Pair.create((Object)n26, (Object)new ja4(array, array2, array3, array4));
                                    this.w = (long)create.first;
                                    this.C.n((ebp)create.second);
                                    this.F = true;
                                }
                                else if (o == 1701671783) {
                                    if (this.D.length != 0) {
                                        r.D(8);
                                        final int n29 = r.e() >> 24 & 0xFF;
                                        long n30 = -9223372036854775807L;
                                        long n32;
                                        long n33;
                                        String s;
                                        String s2;
                                        long n34;
                                        if (n29 != 0) {
                                            if (n29 != 1) {
                                                zi.z(46, "Skipping unsupported emsg version: ", n29, "FragmentedMp4Extractor");
                                                break Label_2682;
                                            }
                                            final long u3 = r.u();
                                            final long n31 = imw.N(r.x(), 1000000L, u3);
                                            n32 = imw.N(r.u(), 1000L, u3);
                                            n33 = r.u();
                                            s = r.n();
                                            Objects.requireNonNull(s);
                                            s2 = r.n();
                                            Objects.requireNonNull(s2);
                                            n34 = n30;
                                            n30 = n31;
                                        }
                                        else {
                                            s = r.n();
                                            Objects.requireNonNull(s);
                                            s2 = r.n();
                                            Objects.requireNonNull(s2);
                                            final long u4 = r.u();
                                            final long n35 = imw.N(r.u(), 1000000L, u4);
                                            final long w = this.w;
                                            if (w != -9223372036854775807L) {
                                                n30 = w + n35;
                                            }
                                            n32 = imw.N(r.u(), 1000L, u4);
                                            n33 = r.u();
                                            n34 = n35;
                                        }
                                        final int n36 = r.c - r.b;
                                        final byte[] array5 = new byte[n36];
                                        r.d(array5, 0, n36);
                                        new(jca.class)();
                                        final lca j2 = this.j;
                                        j2.a.reset();
                                        try {
                                            final DataOutputStream b8 = j2.b;
                                            b8.writeBytes(s);
                                            b8.writeByte(0);
                                            final DataOutputStream b9 = j2.b;
                                            b9.writeBytes(s2);
                                            b9.writeByte(0);
                                            j2.b.writeLong(n32);
                                            j2.b.writeLong(n33);
                                            j2.b.write(array5);
                                            j2.b.flush();
                                            final mwj mwj = new mwj(j2.a.toByteArray());
                                            final int n37 = mwj.c - mwj.b;
                                            for (final ovt ovt : this.D) {
                                                mwj.D(0);
                                                ovt.d(mwj, n37);
                                            }
                                            if (n30 == -9223372036854775807L) {
                                                this.m.addLast(new eqb.eqb$a(n34, true, n37));
                                                this.t += n37;
                                            }
                                            else if (!this.m.isEmpty()) {
                                                this.m.addLast(new eqb.eqb$a(n30, false, n37));
                                                this.t += n37;
                                            }
                                            else {
                                                final h9t i2 = this.i;
                                                long a10 = n30;
                                                if (i2 != null) {
                                                    a10 = i2.a(n30);
                                                }
                                                final ovt[] d5 = this.D;
                                                for (int length3 = d5.length, n39 = 0; n39 < length3; ++n39) {
                                                    d5[n39].b(a10, 1, n37, 0, (ovt$a)null);
                                                }
                                            }
                                        }
                                        catch (final IOException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                    }
                                }
                            }
                            koa3 = koa;
                        }
                    }
                    else {
                        koa2.k(n22);
                        koa3 = koa2;
                    }
                    this.j(koa.getPosition());
                    koa2 = koa3;
                }
            }
            else {
                boolean b10 = false;
                Label_3609: {
                    if (this.q == 0) {
                        if (!koa2.f(this.k.a, 0, 8, true)) {
                            b10 = false;
                            break Label_3609;
                        }
                        this.q = 8;
                        this.k.D(0);
                        this.p = this.k.u();
                        this.o = this.k.e();
                    }
                    final long p2 = this.p;
                    if (p2 == 1L) {
                        koa2.readFully(this.k.a, 8, 8);
                        this.q += 8;
                        this.p = this.k.x();
                    }
                    else if (p2 == 0L) {
                        long n41;
                        final long n40 = n41 = koa.getLength();
                        if (n40 == -1L) {
                            n41 = n40;
                            if (!this.l.isEmpty()) {
                                n41 = this.l.peek().b;
                            }
                        }
                        if (n41 != -1L) {
                            this.p = n41 - koa.getPosition() + this.q;
                        }
                    }
                    if (this.p < this.q) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    final long n42 = koa.getPosition() - this.q;
                    final int o2 = this.o;
                    if ((o2 == 1836019558 || o2 == 1835295092) && !this.F) {
                        this.C.n((ebp)new ebp.b(this.v, n42));
                        this.F = true;
                    }
                    if (this.o == 1836019558) {
                        for (int size3 = this.c.size(), n43 = 0; n43 < size3; ++n43) {
                            final kvt b11 = ((eqb.eqb$b)this.c.valueAt(n43)).b;
                            Objects.requireNonNull(b11);
                            b11.c = n42;
                            b11.b = n42;
                        }
                    }
                    final int o3 = this.o;
                    if (o3 == 1835295092) {
                        this.x = null;
                        this.s = n42 + this.p;
                        this.n = 2;
                    }
                    else if (o3 == 1836019574 || o3 == 1953653099 || o3 == 1835297121 || o3 == 1835626086 || o3 == 1937007212 || o3 == 1836019558 || o3 == 1953653094 || o3 == 1836475768 || o3 == 1701082227) {
                        final long n44 = koa.getPosition() + this.p - 8L;
                        this.l.push(new kx0$a(this.o, n44));
                        if (this.p == this.q) {
                            this.j(n44);
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
                        final mwj r2 = new mwj((int)p3);
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
                    b10 = true;
                }
                if (!b10) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        return m0n.C0(koa, true, false);
    }
    
    @Override
    public final void c(final long n, final long u) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            ((eqb.eqb$b)this.c.valueAt(i)).e();
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
    
    public final wj8 f(final SparseArray<wj8> sparseArray, final int n) {
        if (sparseArray.size() == 1) {
            return (wj8)sparseArray.valueAt(0);
        }
        final wj8 wj8 = (wj8)sparseArray.get(n);
        Objects.requireNonNull(wj8);
        return wj8;
    }
    
    @Override
    public final void i(final ooa c) {
        this.C = c;
        this.e();
        final ovt[] d = new ovt[2];
        this.D = d;
        final int a = this.a;
        int n = 100;
        final int n2 = 0;
        int n3;
        if ((a & 0x4) != 0x0) {
            d[0] = this.C.s(100, 5);
            n = 101;
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final ovt[] d2 = (ovt[])imw.J((Object[])this.D, n3);
        this.D = d2;
        for (int length = d2.length, i = 0; i < length; ++i) {
            d2[i].e(eqb.H);
        }
        this.E = new ovt[this.b.size()];
        for (int j = n2; j < this.E.length; ++j, ++n) {
            final ovt s = this.C.s(n, 3);
            s.e((n)this.b.get(j));
            this.E[j] = s;
        }
    }
    
    public final void j(final long n) throws ParserException {
        eqb eqb2;
        eqb eqb3;
        for (eqb eqb = eqb2 = this; !eqb2.l.isEmpty() && eqb2.l.peek().b == n; eqb2 = eqb3) {
            final kx0$a kx0$a = eqb2.l.pop();
            final int a = ((kx0)kx0$a).a;
            if (a == 1836019574) {
                final b g = g(kx0$a.c);
                final kx0$a b = kx0$a.b(1836475768);
                Objects.requireNonNull(b);
                final SparseArray sparseArray = new SparseArray();
                final int size = b.c.size();
                long n2 = -9223372036854775807L;
                for (int i = 0; i < size; ++i) {
                    final kx0$b kx0$b = b.c.get(i);
                    final int a2 = ((kx0)kx0$b).a;
                    if (a2 == 1953654136) {
                        final mwj b2 = kx0$b.b;
                        b2.D(12);
                        final Pair create = Pair.create((Object)b2.e(), (Object)new wj8(b2.e() - 1, b2.e(), b2.e(), b2.e()));
                        sparseArray.put((int)create.first, (Object)create.second);
                    }
                    else if (a2 == 1835362404) {
                        final mwj b3 = kx0$b.b;
                        b3.D(8);
                        if ((b3.e() >> 24 & 0xFF) == 0x0) {
                            n2 = b3.u();
                        }
                        else {
                            n2 = b3.x();
                        }
                    }
                }
                final ArrayList list = (ArrayList)lx0.f(kx0$a, new hyb(), n2, g, (eqb2.a & 0x10) != 0x0, false, (cub)new dqb(eqb2));
                final int size2 = list.size();
                if (eqb2.c.size() == 0) {
                    for (int j = 0; j < size2; ++j) {
                        final pvt pvt = list.get(j);
                        final ivt a3 = pvt.a;
                        eqb2.c.put(a3.a, (Object)new eqb.eqb$b(eqb2.C.s(j, a3.b), pvt, eqb2.f((SparseArray<wj8>)sparseArray, a3.a)));
                        eqb2.v = Math.max(eqb2.v, a3.e);
                    }
                    eqb2.C.q();
                }
                else {
                    ri4.t(eqb2.c.size() == size2);
                    for (int k = 0; k < size2; ++k) {
                        final pvt d = list.get(k);
                        final ivt a4 = d.a;
                        final eqb.eqb$b eqb$b = (eqb.eqb$b)eqb2.c.get(a4.a);
                        final wj8 f = eqb2.f((SparseArray<wj8>)sparseArray, a4.a);
                        eqb$b.d = d;
                        eqb$b.e = f;
                        eqb$b.a.e(d.a.f);
                        eqb$b.e();
                    }
                }
                eqb3 = eqb2;
            }
            else if (a == 1836019558) {
                SparseArray c = eqb2.c;
                int a5 = eqb2.a;
                final byte[] g2 = eqb2.g;
                int size3 = kx0$a.d.size();
                int l = 0;
                kx0$a kx0$a2 = kx0$a;
                while (l < size3) {
                    final kx0$a kx0$a3 = kx0$a2.d.get(l);
                    int n24 = 0;
                    int n31 = 0;
                    int n32 = 0;
                    Label_3129: {
                        if (((kx0)kx0$a3).a == 1953653094) {
                            final kx0$b c2 = kx0$a3.c(1952868452);
                            Objects.requireNonNull(c2);
                            final mwj b4 = c2.b;
                            b4.D(8);
                            final int n3 = b4.e() & 0xFFFFFF;
                            eqb.eqb$b eqb$b2 = (eqb.eqb$b)c.get(b4.e());
                            if (eqb$b2 == null) {
                                eqb$b2 = null;
                            }
                            else {
                                if ((n3 & 0x1) != 0x0) {
                                    final long x = b4.x();
                                    final kvt b5 = eqb$b2.b;
                                    b5.b = x;
                                    b5.c = x;
                                }
                                final wj8 e = eqb$b2.e;
                                int a6;
                                if ((n3 & 0x2) != 0x0) {
                                    a6 = b4.e() - 1;
                                }
                                else {
                                    a6 = e.a;
                                }
                                int n4;
                                if ((n3 & 0x8) != 0x0) {
                                    n4 = b4.e();
                                }
                                else {
                                    n4 = e.b;
                                }
                                int n5;
                                if ((n3 & 0x10) != 0x0) {
                                    n5 = b4.e();
                                }
                                else {
                                    n5 = e.c;
                                }
                                int n6;
                                if ((n3 & 0x20) != 0x0) {
                                    n6 = b4.e();
                                }
                                else {
                                    n6 = e.d;
                                }
                                eqb$b2.b.a = new wj8(a6, n4, n5, n6);
                            }
                            if (eqb$b2 != null) {
                                final kvt b6 = eqb$b2.b;
                                final long p = b6.p;
                                final boolean q = b6.q;
                                eqb$b2.e();
                                eqb$b2.l = true;
                                final kx0$b c3 = kx0$a3.c(1952867444);
                                if (c3 != null && (a5 & 0x2) == 0x0) {
                                    final mwj b7 = c3.b;
                                    b7.D(8);
                                    long p2;
                                    if ((b7.e() >> 24 & 0xFF) == 0x1) {
                                        p2 = b7.x();
                                    }
                                    else {
                                        p2 = b7.u();
                                    }
                                    b6.p = p2;
                                    b6.q = true;
                                }
                                else {
                                    b6.p = p;
                                    b6.q = q;
                                }
                                final ArrayList c4 = kx0$a3.c;
                                final int size4 = c4.size();
                                int n7 = 0;
                                int d2 = 0;
                                int e2 = 0;
                                while (n7 < size4) {
                                    final kx0$b kx0$b2 = (kx0$b)c4.get(n7);
                                    int n8 = d2;
                                    int n9 = e2;
                                    if (((kx0)kx0$b2).a == 1953658222) {
                                        final mwj b8 = kx0$b2.b;
                                        b8.D(12);
                                        final int w = b8.w();
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
                                final eqb.eqb$b eqb$b3 = eqb$b2;
                                eqb$b3.h = 0;
                                eqb$b3.g = 0;
                                eqb$b3.f = 0;
                                final kvt b9 = eqb$b3.b;
                                b9.d = d2;
                                b9.e = e2;
                                if (b9.g.length < d2) {
                                    b9.f = new long[d2];
                                    b9.g = new int[d2];
                                }
                                if (b9.h.length < e2) {
                                    final int n11 = e2 * 125 / 100;
                                    b9.h = new int[n11];
                                    b9.i = new long[n11];
                                    b9.j = new boolean[n11];
                                    b9.l = new boolean[n11];
                                }
                                int n12 = 0;
                                int n13 = 0;
                                int n14 = 0;
                                final kx0$a kx0$a4 = kx0$a3;
                                final kvt kvt = b6;
                                final kx0$a kx0$a5 = kx0$a2;
                                final eqb.eqb$b eqb$b4 = eqb$b3;
                                while (n12 < size4) {
                                    final kx0$b kx0$b3 = (kx0$b)c4.get(n12);
                                    if (((kx0)kx0$b3).a == 1953658222) {
                                        final mwj b10 = kx0$b3.b;
                                        b10.D(8);
                                        final int n15 = b10.e() & 0xFFFFFF;
                                        final ivt a7 = eqb$b4.d.a;
                                        final kvt b11 = eqb$b4.b;
                                        final wj8 a8 = b11.a;
                                        final int a9 = imw.a;
                                        b11.g[n14] = b10.w();
                                        final long[] f2 = b11.f;
                                        f2[n14] = b11.b;
                                        if ((n15 & 0x1) != 0x0) {
                                            f2[n14] += b10.e();
                                        }
                                        final boolean b12 = (n15 & 0x4) != 0x0;
                                        int n16 = a8.d;
                                        if (b12) {
                                            n16 = b10.e();
                                        }
                                        final boolean b13 = (n15 & 0x100) != 0x0;
                                        final boolean b14 = (n15 & 0x200) != 0x0;
                                        final boolean b15 = (n15 & 0x400) != 0x0;
                                        final boolean b16 = (n15 & 0x800) != 0x0;
                                        final long[] h = a7.h;
                                        long n17;
                                        if (h != null && h.length == 1 && h[0] == 0L) {
                                            n17 = a7.i[0];
                                        }
                                        else {
                                            n17 = 0L;
                                        }
                                        final int[] h2 = b11.h;
                                        final long[] m = b11.i;
                                        final boolean[] j2 = b11.j;
                                        final boolean b17 = a7.b == 2 && (a5 & 0x1) != 0x0;
                                        final int n18 = b11.g[n14] + n13;
                                        final long c5 = a7.c;
                                        long p3 = b11.p;
                                        int n19 = n13;
                                        n13 = n18;
                                        final boolean b18 = b12;
                                        while (n19 < n13) {
                                            int n20;
                                            if (b13) {
                                                n20 = b10.e();
                                            }
                                            else {
                                                n20 = a8.b;
                                            }
                                            d(n20);
                                            int n21;
                                            if (b14) {
                                                n21 = b10.e();
                                            }
                                            else {
                                                n21 = a8.c;
                                            }
                                            d(n21);
                                            int n22;
                                            if (b15) {
                                                n22 = b10.e();
                                            }
                                            else if (n19 == 0 && b18) {
                                                n22 = n16;
                                            }
                                            else {
                                                n22 = a8.d;
                                            }
                                            int e3;
                                            if (b16) {
                                                e3 = b10.e();
                                            }
                                            else {
                                                e3 = 0;
                                            }
                                            m[n19] = imw.N(e3 + p3 - n17, 1000000L, c5);
                                            if (!b11.q) {
                                                m[n19] += eqb$b4.d.h;
                                            }
                                            h2[n19] = n21;
                                            j2[n19] = ((n22 >> 16 & 0x1) == 0x0 && (!b17 || n19 == 0));
                                            p3 += n20;
                                            ++n19;
                                        }
                                        b11.p = p3;
                                        ++n14;
                                    }
                                    ++n12;
                                }
                                final kx0$a kx0$a6 = kx0$a5;
                                final int n23 = a5;
                                n24 = l;
                                final ivt a10 = eqb$b4.d.a;
                                final wj8 a11 = kvt.a;
                                Objects.requireNonNull(a11);
                                final jvt a12 = a10.a(a11.a);
                                final kx0$b c6 = kx0$a4.c(1935763834);
                                if (c6 != null) {
                                    Objects.requireNonNull(a12);
                                    final mwj b19 = c6.b;
                                    final int d3 = a12.d;
                                    b19.D(8);
                                    if ((b19.e() & 0xFFFFFF & 0x1) == 0x1) {
                                        b19.E(8);
                                    }
                                    final int t = b19.t();
                                    final int w2 = b19.w();
                                    final int e4 = kvt.e;
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
                                        final boolean[] l2 = kvt.l;
                                        int n25 = 0;
                                        n26 = 0;
                                        while (n25 < w2) {
                                            final int t2 = b19.t();
                                            n26 += t2;
                                            l2[n25] = (t2 > d3);
                                            ++n25;
                                        }
                                    }
                                    else {
                                        final boolean b20 = t > d3;
                                        n26 = t * w2 + 0;
                                        Arrays.fill(kvt.l, 0, w2, b20);
                                    }
                                    Arrays.fill(kvt.l, w2, kvt.e, false);
                                    if (n26 > 0) {
                                        kvt.n.A(n26);
                                        kvt.k = true;
                                        kvt.o = true;
                                    }
                                }
                                final kx0$b c7 = kx0$a4.c(1935763823);
                                if (c7 != null) {
                                    final mwj b21 = c7.b;
                                    b21.D(8);
                                    final int e5 = b21.e();
                                    if ((0xFFFFFF & e5 & 0x1) == 0x1) {
                                        b21.E(8);
                                    }
                                    final int w3 = b21.w();
                                    if (w3 != 1) {
                                        final StringBuilder sb2 = new StringBuilder(40);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(w3);
                                        throw ParserException.a(sb2.toString(), (Throwable)null);
                                    }
                                    final long c8 = kvt.c;
                                    long n27;
                                    if ((e5 >> 24 & 0xFF) == 0x0) {
                                        n27 = b21.u();
                                    }
                                    else {
                                        n27 = b21.x();
                                    }
                                    kvt.c = c8 + n27;
                                }
                                final kx0$b c9 = kx0$a4.c(1936027235);
                                if (c9 != null) {
                                    h(c9.b, 0, kvt);
                                }
                                String b22;
                                if (a12 != null) {
                                    b22 = a12.b;
                                }
                                else {
                                    b22 = null;
                                }
                                mwj mwj2;
                                mwj mwj = mwj2 = null;
                                mwj mwj3;
                                mwj mwj4;
                                for (int n28 = 0; n28 < kx0$a4.c.size(); ++n28, mwj = mwj3, mwj2 = mwj4) {
                                    final kx0$b kx0$b4 = kx0$a4.c.get(n28);
                                    final mwj b23 = kx0$b4.b;
                                    final int a13 = ((kx0)kx0$b4).a;
                                    if (a13 == 1935828848) {
                                        b23.D(12);
                                        mwj3 = mwj;
                                        mwj4 = mwj2;
                                        if (b23.e() == 1936025959) {
                                            mwj3 = b23;
                                            mwj4 = mwj2;
                                        }
                                    }
                                    else {
                                        mwj3 = mwj;
                                        mwj4 = mwj2;
                                        if (a13 == 1936158820) {
                                            b23.D(12);
                                            mwj3 = mwj;
                                            mwj4 = mwj2;
                                            if (b23.e() == 1936025959) {
                                                mwj4 = b23;
                                                mwj3 = mwj;
                                            }
                                        }
                                    }
                                }
                                if (mwj != null) {
                                    if (mwj2 != null) {
                                        mwj.D(8);
                                        final int e6 = mwj.e();
                                        mwj.E(4);
                                        if ((e6 >> 24 & 0xFF) == 0x1) {
                                            mwj.E(4);
                                        }
                                        if (mwj.e() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        mwj2.D(8);
                                        final int n29 = mwj2.e() >> 24 & 0xFF;
                                        mwj2.E(4);
                                        if (n29 == 1) {
                                            if (mwj2.u() == 0L) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        }
                                        else if (n29 >= 2) {
                                            mwj2.E(4);
                                        }
                                        if (mwj2.u() != 1L) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        mwj2.E(1);
                                        final int t3 = mwj2.t();
                                        final boolean b24 = mwj2.t() == 1;
                                        if (b24) {
                                            final int t4 = mwj2.t();
                                            final byte[] array = new byte[16];
                                            mwj2.d(array, 0, 16);
                                            byte[] array3;
                                            if (t4 == 0) {
                                                final int t5 = mwj2.t();
                                                final byte[] array2 = new byte[t5];
                                                mwj2.d(array2, 0, t5);
                                                array3 = array2;
                                            }
                                            else {
                                                array3 = null;
                                            }
                                            kvt.k = true;
                                            kvt.m = new jvt(b24, b22, t4, array, (t3 & 0xF0) >> 4, t3 & 0xF, array3);
                                        }
                                    }
                                }
                                for (int size5 = kx0$a4.c.size(), n30 = 0; n30 < size5; ++n30) {
                                    final kx0$b kx0$b5 = kx0$a4.c.get(n30);
                                    if (((kx0)kx0$b5).a == 1970628964) {
                                        final mwj b25 = kx0$b5.b;
                                        b25.D(8);
                                        final byte[] array4 = g2;
                                        b25.d(array4, 0, 16);
                                        if (Arrays.equals(array4, eqb.G)) {
                                            h(b25, 16, kvt);
                                        }
                                    }
                                }
                                n31 = n10;
                                c = sparseArray2;
                                kx0$a2 = kx0$a6;
                                n32 = n23;
                                break Label_3129;
                            }
                        }
                        final int n33 = a5;
                        n31 = size3;
                        final int n34 = l;
                        n32 = n33;
                        n24 = n34;
                    }
                    size3 = n31;
                    ++n24;
                    a5 = n32;
                    l = n24;
                }
                final b g3 = g(kx0$a2.c);
                eqb = this;
                if (g3 != null) {
                    for (int size6 = eqb.c.size(), n35 = 0; n35 < size6; ++n35) {
                        final eqb.eqb$b eqb$b5 = (eqb.eqb$b)eqb.c.valueAt(n35);
                        final ivt a14 = eqb$b5.d.a;
                        final wj8 a15 = eqb$b5.b.a;
                        final int a16 = imw.a;
                        final jvt a17 = a14.a(a15.a);
                        String b26;
                        if (a17 != null) {
                            b26 = a17.b;
                        }
                        else {
                            b26 = null;
                        }
                        final b a18 = g3.a(b26);
                        final n$a n$a = new n$a(eqb$b5.d.a.f);
                        n$a.n = a18;
                        eqb$b5.a.e(new n(n$a));
                    }
                }
                if (eqb.u != -9223372036854775807L) {
                    for (int size7 = eqb.c.size(), n36 = 0; n36 < size7; ++n36) {
                        final eqb.eqb$b eqb$b6 = (eqb.eqb$b)eqb.c.valueAt(n36);
                        final long u = eqb.u;
                        int f3 = eqb$b6.f;
                        while (true) {
                            final kvt b27 = eqb$b6.b;
                            if (f3 >= b27.e || b27.i[f3] >= u) {
                                break;
                            }
                            if (b27.j[f3]) {
                                eqb$b6.i = f3;
                            }
                            ++f3;
                        }
                    }
                    eqb.u = -9223372036854775807L;
                }
                eqb3 = eqb;
            }
            else {
                final eqb eqb4 = eqb;
                eqb3 = eqb2;
                eqb = eqb4;
                if (!eqb2.l.isEmpty()) {
                    eqb2.l.peek().d.add(kx0$a);
                    eqb = eqb4;
                    eqb3 = eqb2;
                }
            }
        }
        this.e();
    }
    
    @Override
    public final void release() {
    }
}
