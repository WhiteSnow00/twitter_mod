import android.graphics.PointF;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public class zre<T>
{
    public final udg a;
    public final T b;
    public T c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;
    
    public zre(final T t) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.MAX_VALUE;
    }
    
    public zre(final udg a, final T b, final T c, final Interpolator d, final float g, final Float h) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = g;
        this.h = h;
    }
    
    public zre(final udg p0, final T p1, final T p2, final Interpolator p3, final Interpolator p4, final float p5, final Float p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: ldc             -3987645.8
        //     7: putfield        zre.i:F
        //    10: aload_0        
        //    11: ldc             -3987645.8
        //    13: putfield        zre.j:F
        //    16: aload_0        
        //    17: ldc             784923401
        //    19: putfield        zre.k:I
        //    22: aload_0        
        //    23: ldc             784923401
        //    25: putfield        zre.l:I
        //    28: aload_0        
        //    29: ldc             1.4E-45
        //    31: putfield        zre.m:F
        //    34: aload_0        
        //    35: ldc             1.4E-45
        //    37: putfield        zre.n:F
        //    40: aload_0        
        //    41: aconst_null    
        //    42: putfield        zre.o:Landroid/graphics/PointF;
        //    45: aload_0        
        //    46: aconst_null    
        //    47: putfield        zre.p:Landroid/graphics/PointF;
        //    50: aload_0        
        //    51: aload_1        
        //    52: putfield        zre.a:Ludg;
        //    55: aload_0        
        //    56: aload_2        
        //    57: putfield        zre.b:Ljava/lang/Object;
        //    60: aload_0        
        //    61: aload_3        
        //    62: putfield        zre.c:Ljava/lang/Object;
        //    65: aload_0        
        //    66: aconst_null    
        //    67: putfield        zre.d:Landroid/view/animation/Interpolator;
        //    70: aload_0        
        //    71: aload           4
        //    73: putfield        zre.e:Landroid/view/animation/Interpolator;
        //    76: aload_0        
        //    77: aload           5
        //    79: putfield        zre.f:Landroid/view/animation/Interpolator;
        //    82: aload_0        
        //    83: fload           6
        //    85: putfield        zre.g:F
        //    88: aload_0        
        //    89: aconst_null    
        //    90: putfield        zre.h:Ljava/lang/Float;
        //    93: return         
        //    Signature:
        //  (Ludg;TT;TT;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 7
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
    
    public zre(final udg a, final T b, final T c, final Interpolator d, final Interpolator e, final Interpolator f, final float g, final Float h) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final float a() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            }
            else {
                final float b = this.b();
                final float floatValue = this.h;
                final float g = this.g;
                final udg a = this.a;
                this.n = (floatValue - g) / (a.l - a.k) + b;
            }
        }
        return this.n;
    }
    
    public final float b() {
        final udg a = this.a;
        if (a == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            final float g = this.g;
            final float k = a.k;
            this.m = (g - k) / (a.l - k);
        }
        return this.m;
    }
    
    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Keyframe{startValue=");
        f.append(this.b);
        f.append(", endValue=");
        f.append(this.c);
        f.append(", startFrame=");
        f.append(this.g);
        f.append(", endFrame=");
        f.append(this.h);
        f.append(", interpolator=");
        f.append(this.d);
        f.append('}');
        return f.toString();
    }
}
