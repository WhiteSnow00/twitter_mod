import android.annotation.SuppressLint;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.util.Log;
import android.view.View;
import java.util.Objects;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ki1 extends ou3<ji1<? extends li1<? extends s2d<? extends n8a>>>>
{
    public Matrix K0;
    public Matrix L0;
    public qfg M0;
    public qfg N0;
    public float O0;
    public float P0;
    public float Q0;
    public s2d R0;
    public VelocityTracker S0;
    public long T0;
    public qfg U0;
    public qfg V0;
    public float W0;
    public float X0;
    
    public ki1(final ji1<? extends li1<? extends s2d<? extends n8a>>> p0, final Matrix p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   ou3.<init>:(Lju3;)V
        //     5: aload_0        
        //     6: new             Landroid/graphics/Matrix;
        //     9: dup            
        //    10: invokespecial   android/graphics/Matrix.<init>:()V
        //    13: putfield        ki1.K0:Landroid/graphics/Matrix;
        //    16: aload_0        
        //    17: new             Landroid/graphics/Matrix;
        //    20: dup            
        //    21: invokespecial   android/graphics/Matrix.<init>:()V
        //    24: putfield        ki1.L0:Landroid/graphics/Matrix;
        //    27: aload_0        
        //    28: fconst_0       
        //    29: fconst_0       
        //    30: invokestatic    qfg.b:(FF)Lqfg;
        //    33: putfield        ki1.M0:Lqfg;
        //    36: aload_0        
        //    37: fconst_0       
        //    38: fconst_0       
        //    39: invokestatic    qfg.b:(FF)Lqfg;
        //    42: putfield        ki1.N0:Lqfg;
        //    45: aload_0        
        //    46: fconst_1       
        //    47: putfield        ki1.O0:F
        //    50: aload_0        
        //    51: fconst_1       
        //    52: putfield        ki1.P0:F
        //    55: aload_0        
        //    56: fconst_1       
        //    57: putfield        ki1.Q0:F
        //    60: aload_0        
        //    61: lconst_0       
        //    62: putfield        ki1.T0:J
        //    65: aload_0        
        //    66: fconst_0       
        //    67: fconst_0       
        //    68: invokestatic    qfg.b:(FF)Lqfg;
        //    71: putfield        ki1.U0:Lqfg;
        //    74: aload_0        
        //    75: fconst_0       
        //    76: fconst_0       
        //    77: invokestatic    qfg.b:(FF)Lqfg;
        //    80: putfield        ki1.V0:Lqfg;
        //    83: aload_0        
        //    84: aload_2        
        //    85: putfield        ki1.K0:Landroid/graphics/Matrix;
        //    88: aload_0        
        //    89: ldc             3.0
        //    91: invokestatic    xnw.c:(F)F
        //    94: putfield        ki1.W0:F
        //    97: aload_0        
        //    98: ldc             3.5
        //   100: invokestatic    xnw.c:(F)F
        //   103: putfield        ki1.X0:F
        //   106: return         
        //    Signature:
        //  (Lji1<+Lli1<+Ls2d<+Ln8a;>;>;>;Landroid/graphics/Matrix;F)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2023)
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
    
    public static float e(final MotionEvent motionEvent) {
        final float n = motionEvent.getX(0) - motionEvent.getX(1);
        final float n2 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float)Math.sqrt(n2 * n2 + n * n);
    }
    
    public final qfg a(final float n, final float n2) {
        final hbx viewPortHandler = ((ju3)super.J0).getViewPortHandler();
        final float left = viewPortHandler.b.left;
        this.b();
        return qfg.b(n - left, -(((View)super.J0).getMeasuredHeight() - n2 - viewPortHandler.k()));
    }
    
    public final void b() {
        if (this.R0 == null) {
            final ji1 ji1 = (ji1)super.J0;
            Objects.requireNonNull(ji1.A1);
            Objects.requireNonNull(ji1.B1);
        }
        final s2d r0 = this.R0;
        if (r0 != null) {
            ((ji1)super.J0).n(((x2d)r0).y());
        }
    }
    
    public final void c(final MotionEvent motionEvent) {
        super.F0 = ou3$a.G0;
        this.K0.set(this.L0);
        final ohj onChartGestureListener = ((ju3)super.J0).getOnChartGestureListener();
        this.b();
        this.K0.postTranslate(motionEvent.getX() - this.M0.b, motionEvent.getY() - this.M0.c);
        if (onChartGestureListener != null) {
            onChartGestureListener.e();
        }
    }
    
    public final void d(final MotionEvent motionEvent) {
        this.L0.set(this.K0);
        this.M0.b = motionEvent.getX();
        this.M0.c = motionEvent.getY();
        final ji1 ji1 = (ji1)super.J0;
        final flc d = ((ju3)ji1).d(motionEvent.getX(), motionEvent.getY());
        s2d r0;
        if (d != null) {
            r0 = ((lu3<s2d>)((ju3)ji1).G0).c(d.f);
        }
        else {
            r0 = null;
        }
        this.R0 = r0;
    }
    
    public final void f() {
        final qfg v0 = this.V0;
        v0.b = 0.0f;
        v0.c = 0.0f;
    }
    
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        super.F0 = ou3$a.L0;
        final ohj onChartGestureListener = ((ju3)super.J0).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.g();
        }
        final ji1 ji1 = (ji1)super.J0;
        if (ji1.o1 && ((ju3<li1>)ji1).getData().e() > 0) {
            final qfg a = this.a(motionEvent.getX(), motionEvent.getY());
            final ji1 ji2 = (ji1)super.J0;
            final boolean r1 = ji2.r1;
            float n = 1.0f;
            float n2;
            if (r1) {
                n2 = 1.4f;
            }
            else {
                n2 = 1.0f;
            }
            if (ji2.s1) {
                n = 1.4f;
            }
            final float b = a.b;
            final float c = a.c;
            final Matrix k1 = ji2.K1;
            final hbx y0 = ((ju3)ji2).Y0;
            final float n3 = -c;
            Objects.requireNonNull(y0);
            k1.reset();
            k1.set(y0.a);
            k1.postScale(n2, n, b, n3);
            ((ju3)ji2).Y0.m(k1, (View)ji2, false);
            ji2.b();
            ((View)ji2).postInvalidate();
            if (((ju3)super.J0).F0) {
                final StringBuilder f = ehk.f("Double-Tap, Zooming In, x: ");
                f.append(a.b);
                f.append(", y: ");
                f.append(a.c);
                Log.i("BarlineChartTouch", f.toString());
            }
            qfg.c(a);
        }
        return super.onDoubleTap(motionEvent);
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        super.F0 = ou3$a.N0;
        final ohj onChartGestureListener = ((ju3)super.J0).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.c();
        }
        return super.onFling(motionEvent, motionEvent2, n, n2);
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        super.F0 = ou3$a.M0;
        final ohj onChartGestureListener = ((ju3)super.J0).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.a();
        }
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        super.F0 = ou3$a.K0;
        final ohj onChartGestureListener = ((ju3)super.J0).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.d();
        }
        final ji1 ji1 = (ji1)super.J0;
        if (!((ju3)ji1).H0) {
            return false;
        }
        final flc d = ((ju3)ji1).d(motionEvent.getX(), motionEvent.getY());
        if (d != null && !d.a(super.H0)) {
            super.J0.f(d);
            super.H0 = d;
        }
        else {
            super.J0.f(null);
            super.H0 = null;
        }
        return super.onSingleTapUp(motionEvent);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final ou3$a g0 = ou3$a.G0;
        if (this.S0 == null) {
            this.S0 = VelocityTracker.obtain();
        }
        this.S0.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        int n = 3;
        if (actionMasked == 3) {
            final VelocityTracker s0 = this.S0;
            if (s0 != null) {
                s0.recycle();
                this.S0 = null;
            }
        }
        if (super.G0 == 0) {
            super.I0.onTouchEvent(motionEvent);
        }
        final ji1 ji1 = (ji1)super.J0;
        if (!ji1.q1 && !ji1.r1 && !ji1.s1) {
            return true;
        }
        final int n2 = motionEvent.getAction() & 0xFF;
        if (n2 != 0) {
            final int n3 = 0;
            final int n4 = 0;
            final boolean b = false;
            final boolean b2 = false;
            final int n5 = 0;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 5) {
                            if (n2 == 6) {
                                final VelocityTracker s2 = this.S0;
                                s2.computeCurrentVelocity(1000, (float)xnw.c);
                                final int actionIndex = motionEvent.getActionIndex();
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                final float xVelocity = s2.getXVelocity(pointerId);
                                final float yVelocity = s2.getYVelocity(pointerId);
                                for (int pointerCount = motionEvent.getPointerCount(), i = n5; i < pointerCount; ++i) {
                                    if (i != actionIndex) {
                                        final int pointerId2 = motionEvent.getPointerId(i);
                                        if (s2.getYVelocity(pointerId2) * yVelocity + s2.getXVelocity(pointerId2) * xVelocity < 0.0f) {
                                            s2.clear();
                                            break;
                                        }
                                    }
                                }
                                super.G0 = 5;
                            }
                        }
                        else if (motionEvent.getPointerCount() >= 2) {
                            ((ju3)super.J0).c();
                            this.d(motionEvent);
                            this.O0 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.P0 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            final float e = e(motionEvent);
                            this.Q0 = e;
                            if (e > 10.0f) {
                                final ji1 ji2 = (ji1)super.J0;
                                if (ji2.n1) {
                                    super.G0 = 4;
                                }
                                else {
                                    final boolean r1 = ji2.r1;
                                    if (r1 != ji2.s1) {
                                        if (r1) {
                                            n = 2;
                                        }
                                        super.G0 = n;
                                    }
                                    else {
                                        if (this.O0 > this.P0) {
                                            n = 2;
                                        }
                                        super.G0 = n;
                                    }
                                }
                            }
                            final qfg n6 = this.N0;
                            final float x = motionEvent.getX(0);
                            final float x2 = motionEvent.getX(1);
                            final float y = motionEvent.getY(0);
                            final float y2 = motionEvent.getY(1);
                            n6.b = (x2 + x) / 2.0f;
                            n6.c = (y2 + y) / 2.0f;
                        }
                    }
                    else {
                        super.G0 = 0;
                        final ohj onChartGestureListener = super.J0.getOnChartGestureListener();
                        if (onChartGestureListener != null) {
                            onChartGestureListener.b();
                        }
                    }
                }
                else {
                    final int g2 = super.G0;
                    if (g2 == 1) {
                        ((ju3)super.J0).c();
                        this.c(motionEvent);
                    }
                    else if (g2 != 2 && g2 != 3 && g2 != 4) {
                        if (g2 == 0) {
                            final float x3 = motionEvent.getX();
                            final float b3 = this.M0.b;
                            final float y3 = motionEvent.getY();
                            final float c = this.M0.c;
                            final float n7 = x3 - b3;
                            final float n8 = y3 - c;
                            if (Math.abs((float)Math.sqrt(n8 * n8 + n7 * n7)) > this.W0) {
                                final ji1 ji3 = (ji1)super.J0;
                                final hbx y4 = ((ju3)ji3).Y0;
                                if (y4.l <= 0.0f && y4.m <= 0.0f) {
                                    int n9 = n3;
                                    if (y4.b()) {
                                        n9 = n3;
                                        if (y4.c()) {
                                            n9 = 1;
                                        }
                                    }
                                    if (n9 == 0 && ((ji1)super.J0).q1) {
                                        super.G0 = 1;
                                    }
                                    else {
                                        super.F0 = g0;
                                        final ji1 ji4 = (ji1)super.J0;
                                        if (ji4.p1) {
                                            final flc d = ((ju3)ji4).d(motionEvent.getX(), motionEvent.getY());
                                            if (d != null && !d.a(super.H0)) {
                                                super.H0 = d;
                                                ((ju3)super.J0).f(d);
                                            }
                                        }
                                    }
                                }
                                else if (ji3.q1) {
                                    super.F0 = g0;
                                    super.G0 = 1;
                                }
                            }
                        }
                    }
                    else {
                        ((ju3)super.J0).c();
                        final ji1 ji5 = (ji1)super.J0;
                        if ((ji5.r1 || ji5.s1) && motionEvent.getPointerCount() >= 2) {
                            final ohj onChartGestureListener2 = ((ju3)super.J0).getOnChartGestureListener();
                            final float e2 = e(motionEvent);
                            if (e2 > this.X0) {
                                final qfg n10 = this.N0;
                                final qfg a = this.a(n10.b, n10.c);
                                final hbx viewPortHandler = ((ju3)super.J0).getViewPortHandler();
                                final int g3 = super.G0;
                                float n11 = 1.0f;
                                if (g3 == 4) {
                                    super.F0 = ou3$a.J0;
                                    final float n12 = e2 / this.Q0;
                                    final boolean b4 = n12 < 1.0f;
                                    final boolean b5 = b4 ? (viewPortHandler.i > viewPortHandler.g) : (viewPortHandler.i < viewPortHandler.h);
                                    int n13 = 0;
                                    Label_1088: {
                                        if (b4) {
                                            n13 = n4;
                                            if (viewPortHandler.j <= viewPortHandler.e) {
                                                break Label_1088;
                                            }
                                        }
                                        else {
                                            n13 = n4;
                                            if (viewPortHandler.j >= viewPortHandler.f) {
                                                break Label_1088;
                                            }
                                        }
                                        n13 = 1;
                                    }
                                    final ji1 ji6 = (ji1)super.J0;
                                    float n14;
                                    if (ji6.r1) {
                                        n14 = n12;
                                    }
                                    else {
                                        n14 = 1.0f;
                                    }
                                    if (ji6.s1) {
                                        n11 = n12;
                                    }
                                    if (n13 != 0 || b5) {
                                        this.K0.set(this.L0);
                                        this.K0.postScale(n14, n11, a.b, a.c);
                                        if (onChartGestureListener2 != null) {
                                            onChartGestureListener2.f();
                                        }
                                    }
                                }
                                else if (g3 == 2 && ((ji1)super.J0).r1) {
                                    super.F0 = ou3$a.H0;
                                    final float n15 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.O0;
                                    int n16 = 0;
                                    Label_1286: {
                                        if (n15 < 1.0f) {
                                            n16 = (b ? 1 : 0);
                                            if (viewPortHandler.i <= viewPortHandler.g) {
                                                break Label_1286;
                                            }
                                        }
                                        else {
                                            n16 = (b ? 1 : 0);
                                            if (viewPortHandler.i >= viewPortHandler.h) {
                                                break Label_1286;
                                            }
                                        }
                                        n16 = 1;
                                    }
                                    if (n16 != 0) {
                                        this.K0.set(this.L0);
                                        this.K0.postScale(n15, 1.0f, a.b, a.c);
                                        if (onChartGestureListener2 != null) {
                                            onChartGestureListener2.f();
                                        }
                                    }
                                }
                                else if (g3 == 3 && ((ji1)super.J0).s1) {
                                    super.F0 = ou3$a.I0;
                                    final float n17 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.P0;
                                    int n18 = 0;
                                    Label_1443: {
                                        if (n17 < 1.0f) {
                                            n18 = (b2 ? 1 : 0);
                                            if (viewPortHandler.j <= viewPortHandler.e) {
                                                break Label_1443;
                                            }
                                        }
                                        else {
                                            n18 = (b2 ? 1 : 0);
                                            if (viewPortHandler.j >= viewPortHandler.f) {
                                                break Label_1443;
                                            }
                                        }
                                        n18 = 1;
                                    }
                                    if (n18 != 0) {
                                        this.K0.set(this.L0);
                                        this.K0.postScale(1.0f, n17, a.b, a.c);
                                        if (onChartGestureListener2 != null) {
                                            onChartGestureListener2.f();
                                        }
                                    }
                                }
                                qfg.c(a);
                            }
                        }
                    }
                }
            }
            else {
                final VelocityTracker s3 = this.S0;
                final int pointerId3 = motionEvent.getPointerId(0);
                s3.computeCurrentVelocity(1000, (float)xnw.c);
                final float yVelocity2 = s3.getYVelocity(pointerId3);
                final float xVelocity2 = s3.getXVelocity(pointerId3);
                if ((Math.abs(xVelocity2) > xnw.b || Math.abs(yVelocity2) > xnw.b) && super.G0 == 1 && ((ju3)super.J0).I0) {
                    this.f();
                    this.T0 = AnimationUtils.currentAnimationTimeMillis();
                    this.U0.b = motionEvent.getX();
                    this.U0.c = motionEvent.getY();
                    final qfg v0 = this.V0;
                    v0.b = xVelocity2;
                    v0.c = yVelocity2;
                    ((View)super.J0).postInvalidateOnAnimation();
                }
                final int g4 = super.G0;
                if (g4 == 2 || g4 == 3 || g4 == 4 || g4 == 5) {
                    ((ji1)super.J0).b();
                    ((View)super.J0).postInvalidate();
                }
                super.G0 = 0;
                final ViewParent parent = ((View)super.J0).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                final VelocityTracker s4 = this.S0;
                if (s4 != null) {
                    s4.recycle();
                    this.S0 = null;
                }
                final ohj onChartGestureListener3 = super.J0.getOnChartGestureListener();
                if (onChartGestureListener3 != null) {
                    onChartGestureListener3.b();
                }
            }
        }
        else {
            final ohj onChartGestureListener4 = super.J0.getOnChartGestureListener();
            if (onChartGestureListener4 != null) {
                onChartGestureListener4.h();
            }
            this.f();
            this.d(motionEvent);
        }
        final hbx viewPortHandler2 = ((ju3)super.J0).getViewPortHandler();
        final Matrix k0 = this.K0;
        viewPortHandler2.m(k0, (View)super.J0, true);
        this.K0 = k0;
        return true;
    }
}
