import android.util.SparseArray;
import android.graphics.PathEffect;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ul9
{
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;
    
    static {
        h = new byte[] { 0, 7, 8, 15 };
        i = new byte[] { 0, 119, -120, -1 };
        j = new byte[] { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
    }
    
    public ul9(final int n, final int n2) {
        final Paint a = new Paint();
        (this.a = a).setStyle(Paint$Style.FILL_AND_STROKE);
        a.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        a.setPathEffect((PathEffect)null);
        final Paint b = new Paint();
        (this.b = b).setStyle(Paint$Style.FILL);
        b.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OVER));
        b.setPathEffect((PathEffect)null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[] { 0, -1, -16777216, -8421505 }, b(), c());
        this.f = new h(n, n2);
    }
    
    public static byte[] a(final int n, final int n2, final nhx nhx) {
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)nhx.g(n2);
        }
        return array;
    }
    
    public static int[] b() {
        final int[] array = new int[16];
        array[0] = 0;
        for (int i = 1; i < 16; ++i) {
            if (i < 8) {
                int n;
                if ((i & 0x1) != 0x0) {
                    n = 255;
                }
                else {
                    n = 0;
                }
                int n2;
                if ((i & 0x2) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x4) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                array[i] = d(255, n, n2, n3);
            }
            else {
                int n4 = 127;
                int n5;
                if ((i & 0x1) != 0x0) {
                    n5 = 127;
                }
                else {
                    n5 = 0;
                }
                int n6;
                if ((i & 0x2) != 0x0) {
                    n6 = 127;
                }
                else {
                    n6 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n4 = 0;
                }
                array[i] = d(255, n5, n6, n4);
            }
        }
        return array;
    }
    
    public static int[] c() {
        final int[] array = new int[256];
        array[0] = 0;
        for (int i = 0; i < 256; ++i) {
            int n = 255;
            if (i < 8) {
                int n2;
                if ((i & 0x1) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x2) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n = 0;
                }
                array[i] = d(63, n2, n3, n);
            }
            else {
                final int n4 = i & 0x88;
                int n5 = 170;
                int n6 = 85;
                if (n4 != 0) {
                    if (n4 != 8) {
                        int n7 = 43;
                        if (n4 != 128) {
                            if (n4 == 136) {
                                int n8;
                                if ((i & 0x1) != 0x0) {
                                    n8 = 43;
                                }
                                else {
                                    n8 = 0;
                                }
                                int n9;
                                if ((i & 0x10) != 0x0) {
                                    n9 = 85;
                                }
                                else {
                                    n9 = 0;
                                }
                                int n10;
                                if ((i & 0x2) != 0x0) {
                                    n10 = 43;
                                }
                                else {
                                    n10 = 0;
                                }
                                int n11;
                                if ((i & 0x20) != 0x0) {
                                    n11 = 85;
                                }
                                else {
                                    n11 = 0;
                                }
                                if ((i & 0x4) == 0x0) {
                                    n7 = 0;
                                }
                                if ((i & 0x40) == 0x0) {
                                    n6 = 0;
                                }
                                array[i] = d(255, n8 + n9, n10 + n11, n7 + n6);
                            }
                        }
                        else {
                            int n12;
                            if ((i & 0x1) != 0x0) {
                                n12 = 43;
                            }
                            else {
                                n12 = 0;
                            }
                            int n13;
                            if ((i & 0x10) != 0x0) {
                                n13 = 85;
                            }
                            else {
                                n13 = 0;
                            }
                            int n14;
                            if ((i & 0x2) != 0x0) {
                                n14 = 43;
                            }
                            else {
                                n14 = 0;
                            }
                            int n15;
                            if ((i & 0x20) != 0x0) {
                                n15 = 85;
                            }
                            else {
                                n15 = 0;
                            }
                            if ((i & 0x4) == 0x0) {
                                n7 = 0;
                            }
                            if ((i & 0x40) == 0x0) {
                                n6 = 0;
                            }
                            array[i] = d(255, n12 + 127 + n13, n14 + 127 + n15, n7 + 127 + n6);
                        }
                    }
                    else {
                        int n16;
                        if ((i & 0x1) != 0x0) {
                            n16 = 85;
                        }
                        else {
                            n16 = 0;
                        }
                        int n17;
                        if ((i & 0x10) != 0x0) {
                            n17 = 170;
                        }
                        else {
                            n17 = 0;
                        }
                        int n18;
                        if ((i & 0x2) != 0x0) {
                            n18 = 85;
                        }
                        else {
                            n18 = 0;
                        }
                        int n19;
                        if ((i & 0x20) != 0x0) {
                            n19 = 170;
                        }
                        else {
                            n19 = 0;
                        }
                        if ((i & 0x4) == 0x0) {
                            n6 = 0;
                        }
                        if ((i & 0x40) == 0x0) {
                            n5 = 0;
                        }
                        array[i] = d(127, n16 + n17, n18 + n19, n6 + n5);
                    }
                }
                else {
                    int n20;
                    if ((i & 0x1) != 0x0) {
                        n20 = 85;
                    }
                    else {
                        n20 = 0;
                    }
                    int n21;
                    if ((i & 0x10) != 0x0) {
                        n21 = 170;
                    }
                    else {
                        n21 = 0;
                    }
                    int n22;
                    if ((i & 0x2) != 0x0) {
                        n22 = 85;
                    }
                    else {
                        n22 = 0;
                    }
                    int n23;
                    if ((i & 0x20) != 0x0) {
                        n23 = 170;
                    }
                    else {
                        n23 = 0;
                    }
                    if ((i & 0x4) == 0x0) {
                        n6 = 0;
                    }
                    if ((i & 0x40) == 0x0) {
                        n5 = 0;
                    }
                    array[i] = d(255, n20 + n21, n22 + n23, n6 + n5);
                }
            }
        }
        return array;
    }
    
    public static int d(final int n, final int n2, final int n3, final int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }
    
    public static void e(byte[] array, final int[] array2, final int n, final int n2, int n3, final Paint paint, final Canvas canvas) {
        final nhx nhx = new nhx(array, 1, (da8)null);
        byte[] a = null;
        byte[] a3;
        byte[] a2 = a3 = null;
        int n4 = n3;
        n3 = n2;
        while (nhx.b() != 0) {
            final int g = nhx.g(8);
            if (g != 240) {
                switch (g) {
                    default: {
                        switch (g) {
                            default: {
                                continue;
                            }
                            case 34: {
                                a2 = a(16, 8, nhx);
                                continue;
                            }
                            case 33: {
                                a = a(4, 8, nhx);
                                continue;
                            }
                            case 32: {
                                a3 = a(4, 4, nhx);
                                continue;
                            }
                        }
                        break;
                    }
                    case 18: {
                        final int n5 = 0;
                        int n6 = n3;
                        n3 = n5;
                        do {
                            int n7 = nhx.g(8);
                            int n8;
                            if (n7 != 0) {
                                n8 = 1;
                            }
                            else if (!nhx.f()) {
                                n8 = nhx.g(7);
                                if (n8 != 0) {
                                    n7 = 0;
                                }
                                else {
                                    n7 = 0;
                                    n3 = 1;
                                    n8 = 0;
                                }
                            }
                            else {
                                n8 = nhx.g(7);
                                n7 = nhx.g(8);
                            }
                            if (n8 != 0 && paint != null) {
                                paint.setColor(array2[n7]);
                                canvas.drawRect((float)n6, (float)n4, (float)(n6 + n8), (float)(n4 + 1), paint);
                            }
                            n6 += n8;
                        } while (n3 == 0);
                        n3 = n6;
                        continue;
                    }
                    case 17: {
                        if (n == 3) {
                            if (a2 == null) {
                                array = ul9.j;
                            }
                            else {
                                array = a2;
                            }
                        }
                        else {
                            array = null;
                        }
                        final int n9 = 0;
                        int n10 = n3;
                        n3 = n9;
                        while (true) {
                            int g2 = nhx.g(4);
                            int g3 = 0;
                            int n12 = 0;
                            Label_0564: {
                                Label_0553: {
                                    if (g2 == 0) {
                                        Label_0467: {
                                            if (nhx.f()) {
                                                int n11;
                                                if (!nhx.f()) {
                                                    g3 = nhx.g(2) + 4;
                                                    n11 = nhx.g(4);
                                                }
                                                else {
                                                    final int g4 = nhx.g(2);
                                                    if (g4 == 0) {
                                                        g2 = 0;
                                                        break Label_0553;
                                                    }
                                                    if (g4 == 1) {
                                                        n12 = n3;
                                                        n3 = 0;
                                                        g3 = 2;
                                                        break Label_0564;
                                                    }
                                                    if (g4 != 2) {
                                                        if (g4 != 3) {
                                                            break Label_0467;
                                                        }
                                                        g3 = nhx.g(8) + 25;
                                                        n11 = nhx.g(4);
                                                    }
                                                    else {
                                                        g3 = nhx.g(4) + 9;
                                                        n11 = nhx.g(4);
                                                    }
                                                }
                                                final int n13 = n3;
                                                n3 = n11;
                                                n12 = n13;
                                                break Label_0564;
                                            }
                                            g3 = nhx.g(3);
                                            if (g3 != 0) {
                                                n12 = n3;
                                                g3 += 2;
                                                n3 = 0;
                                                break Label_0564;
                                            }
                                            n3 = 1;
                                        }
                                        n12 = n3;
                                        n3 = 0;
                                        g3 = 0;
                                        break Label_0564;
                                    }
                                }
                                g3 = 1;
                                n12 = n3;
                                n3 = g2;
                            }
                            if (g3 != 0 && paint != null) {
                                int n14 = n3;
                                if (array != null) {
                                    n14 = array[n3];
                                }
                                paint.setColor(array2[n14]);
                                canvas.drawRect((float)n10, (float)n4, (float)(n10 + g3), (float)(n4 + 1), paint);
                            }
                            n10 += g3;
                            if (n12 != 0) {
                                break;
                            }
                            n3 = n12;
                        }
                        nhx.c();
                        n3 = n10;
                        continue;
                    }
                    case 16: {
                        if (n == 3) {
                            if (a == null) {
                                array = ul9.i;
                            }
                            else {
                                array = a;
                            }
                        }
                        else if (n == 2) {
                            if (a3 == null) {
                                array = ul9.h;
                            }
                            else {
                                array = a3;
                            }
                        }
                        else {
                            array = null;
                        }
                        final int n15 = 0;
                        int n16 = n3;
                        n3 = n15;
                        while (true) {
                            int g5 = nhx.g(2);
                            int n17 = 0;
                            int n19 = 0;
                            Label_0913: {
                                Label_0770: {
                                    if (g5 == 0) {
                                        int n18 = 0;
                                        Label_0868: {
                                            if (nhx.f()) {
                                                n17 = nhx.g(3) + 3;
                                                n18 = nhx.g(2);
                                            }
                                            else {
                                                if (nhx.f()) {
                                                    g5 = 0;
                                                    break Label_0770;
                                                }
                                                final int g6 = nhx.g(2);
                                                if (g6 != 0) {
                                                    if (g6 == 1) {
                                                        n19 = n3;
                                                        n3 = 0;
                                                        n17 = 2;
                                                        break Label_0913;
                                                    }
                                                    if (g6 == 2) {
                                                        n17 = nhx.g(4) + 12;
                                                        n18 = nhx.g(2);
                                                        break Label_0868;
                                                    }
                                                    if (g6 == 3) {
                                                        n17 = nhx.g(8) + 29;
                                                        n18 = nhx.g(2);
                                                        break Label_0868;
                                                    }
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                                final int n20 = 0;
                                                n17 = 0;
                                                n19 = n3;
                                                n3 = n20;
                                                break Label_0913;
                                            }
                                        }
                                        final int n21 = n3;
                                        n3 = n18;
                                        n19 = n21;
                                        break Label_0913;
                                    }
                                }
                                final int n22 = n3;
                                final int n23 = 1;
                                n3 = g5;
                                n19 = n22;
                                n17 = n23;
                            }
                            if (n17 != 0 && paint != null) {
                                int n24 = n3;
                                if (array != null) {
                                    n24 = array[n3];
                                }
                                paint.setColor(array2[n24]);
                                canvas.drawRect((float)n16, (float)n4, (float)(n16 + n17), (float)(n4 + 1), paint);
                            }
                            n16 += n17;
                            if (n19 != 0) {
                                break;
                            }
                            n3 = n19;
                        }
                        nhx.c();
                        n3 = n16;
                        continue;
                    }
                }
            }
            else {
                n4 += 2;
                n3 = n2;
            }
        }
    }
    
    public static a f(final nhx nhx, int i) {
        final int g = nhx.g(8);
        nhx.m(8);
        i -= 2;
        final int[] array2;
        final int[] array = array2 = new int[4];
        array2[0] = 0;
        array2[1] = -1;
        array2[2] = -16777216;
        array2[3] = -8421505;
        final int[] b = b();
        final int[] c = c();
        while (i > 0) {
            final int g2 = nhx.g(8);
            final int g3 = nhx.g(8);
            i -= 2;
            int[] array3;
            if ((g3 & 0x80) != 0x0) {
                array3 = array;
            }
            else if ((g3 & 0x40) != 0x0) {
                array3 = b;
            }
            else {
                array3 = c;
            }
            int g4;
            int g5;
            int g6;
            int g7;
            if ((g3 & 0x1) != 0x0) {
                g4 = nhx.g(8);
                g5 = nhx.g(8);
                g6 = nhx.g(8);
                g7 = nhx.g(8);
                i -= 4;
            }
            else {
                final int g8 = nhx.g(6);
                final int g9 = nhx.g(4);
                final int g10 = nhx.g(4);
                final int g11 = nhx.g(2);
                i -= 2;
                g5 = g9 << 4;
                g7 = g11 << 6;
                g4 = g8 << 2;
                g6 = g10 << 4;
            }
            if (g4 == 0) {
                g5 = 0;
                g6 = 0;
                g7 = 255;
            }
            final byte b2 = (byte)(255 - (g7 & 0xFF));
            final double n = g4;
            final double n2 = g5 - 128;
            final int n3 = (int)(1.402 * n2 + n);
            final double n4 = g6 - 128;
            array3[g2] = d(b2, cnw.i(n3, 0, 255), cnw.i((int)(n - 0.34414 * n4 - n2 * 0.71414), 0, 255), cnw.i((int)(n4 * 1.772 + n), 0, 255));
        }
        return new a(g, array, b, c);
    }
    
    public static c g(final nhx nhx) {
        final int g = nhx.g(16);
        nhx.m(4);
        final int g2 = nhx.g(2);
        final boolean f = nhx.f();
        nhx.m(1);
        byte[] f2 = cnw.f;
        byte[] array;
        if (g2 == 1) {
            nhx.m(nhx.g(8) * 16);
            array = f2;
        }
        else {
            array = f2;
            if (g2 == 0) {
                final int g3 = nhx.g(16);
                final int g4 = nhx.g(16);
                if (g3 > 0) {
                    f2 = new byte[g3];
                    nhx.i(f2, g3);
                }
                array = f2;
                if (g4 > 0) {
                    final byte[] array2 = new byte[g4];
                    nhx.i(array2, g4);
                    final byte[] array3 = array2;
                    return new c(g, f, f2, array3);
                }
            }
        }
        final byte[] array3 = array;
        f2 = array;
        return new c(g, f, f2, array3);
    }
    
    public static final class a
    {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;
        
        public a(final int a, final int[] b, final int[] c, final int[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        
        public b(final int a, final int b, final int c, final int d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;
        
        public c(final int a, final boolean b, final byte[] c, final byte[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        public final SparseArray<e> c;
        
        public d(final int p0, final int p1, final int p2, final SparseArray<e> p3) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: iload_1        
            //     6: putfield        ul9$d.a:I
            //     9: aload_0        
            //    10: iload_2        
            //    11: putfield        ul9$d.b:I
            //    14: aload_0        
            //    15: aload_3        
            //    16: putfield        ul9$d.c:Landroid/util/SparseArray;
            //    19: return         
            //    Signature:
            //  (IIILandroid/util/SparseArray<Lul9$e;>;)V
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
    
    public static final class e
    {
        public final int a;
        public final int b;
        
        public e(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class f
    {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;
        
        public f(final int p0, final boolean p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final SparseArray<g> p10) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: iload_1        
            //     6: putfield        ul9$f.a:I
            //     9: aload_0        
            //    10: iload_2        
            //    11: putfield        ul9$f.b:Z
            //    14: aload_0        
            //    15: iload_3        
            //    16: putfield        ul9$f.c:I
            //    19: aload_0        
            //    20: iload           4
            //    22: putfield        ul9$f.d:I
            //    25: aload_0        
            //    26: iload           5
            //    28: putfield        ul9$f.e:I
            //    31: aload_0        
            //    32: iload           6
            //    34: putfield        ul9$f.f:I
            //    37: aload_0        
            //    38: iload           7
            //    40: putfield        ul9$f.g:I
            //    43: aload_0        
            //    44: iload           8
            //    46: putfield        ul9$f.h:I
            //    49: aload_0        
            //    50: iload           9
            //    52: putfield        ul9$f.i:I
            //    55: aload_0        
            //    56: aload           10
            //    58: putfield        ul9$f.j:Landroid/util/SparseArray;
            //    61: return         
            //    Signature:
            //  (IZIIIIIIIILandroid/util/SparseArray<Lul9$g;>;)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 11
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
    
    public static final class g
    {
        public final int a;
        public final int b;
        
        public g(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class h
    {
        public final int a;
        public final int b;
        public final SparseArray<f> c;
        public final SparseArray<a> d;
        public final SparseArray<c> e;
        public final SparseArray<a> f;
        public final SparseArray<c> g;
        public b h;
        public d i;
        
        public h(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = (SparseArray<f>)new SparseArray();
            this.d = (SparseArray<a>)new SparseArray();
            this.e = (SparseArray<c>)new SparseArray();
            this.f = (SparseArray<a>)new SparseArray();
            this.g = (SparseArray<c>)new SparseArray();
        }
    }
}
