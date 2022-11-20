import android.os.BaseBundle;
import android.animation.TimeInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c$a;
import android.util.SparseBooleanArray;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint$Style;
import android.view.VelocityTracker;
import java.util.HashSet;
import android.os.Bundle;
import android.graphics.Path;
import android.graphics.Paint;
import java.util.Collection;
import android.graphics.Canvas;
import java.util.Objects;
import android.util.SparseArray;
import android.view.View$OnTouchListener;
import androidx.core.widget.NestedScrollView;
import android.view.Display;
import android.view.ViewGroup;
import android.view.MotionEvent;
import java.util.Iterator;
import androidx.constraintlayout.widget.b;
import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import android.graphics.Matrix;
import android.view.View;
import android.graphics.RectF;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import androidx.constraintlayout.widget.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class erh extends ConstraintLayout implements dci
{
    public static boolean g2;
    public long A1;
    public float B1;
    public boolean C1;
    public ArrayList<crh> D1;
    public ArrayList<crh> E1;
    public CopyOnWriteArrayList<i> F1;
    public int G1;
    public long H1;
    public float I1;
    public int J1;
    public float K1;
    public boolean L1;
    public int M1;
    public int N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public float S1;
    public epe T1;
    public boolean U1;
    public irh V0;
    public h V1;
    public drh W0;
    public Runnable W1;
    public Interpolator X0;
    public Rect X1;
    public float Y0;
    public boolean Y1;
    public int Z0;
    public j Z1;
    public int a1;
    public f a2;
    public int b1;
    public boolean b2;
    public int c1;
    public RectF c2;
    public int d1;
    public View d2;
    public boolean e1;
    public Matrix e2;
    public HashMap<View, xqh> f1;
    public ArrayList<Integer> f2;
    public long g1;
    public float h1;
    public float i1;
    public float j1;
    public long k1;
    public float l1;
    public boolean m1;
    public boolean n1;
    public i o1;
    public int p1;
    public e q1;
    public boolean r1;
    public lir s1;
    public d t1;
    public dr8 u1;
    public int v1;
    public int w1;
    public boolean x1;
    public float y1;
    public float z1;
    
    public erh(final Context context, final AttributeSet set) {
        super(context, set);
        this.X0 = null;
        this.Y0 = 0.0f;
        this.Z0 = -1;
        this.a1 = -1;
        this.b1 = -1;
        final int n = 0;
        this.c1 = 0;
        this.d1 = 0;
        this.e1 = true;
        this.f1 = new HashMap<View, xqh>();
        this.g1 = 0L;
        this.h1 = 1.0f;
        this.i1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = 0.0f;
        this.n1 = false;
        this.p1 = 0;
        this.r1 = false;
        this.s1 = new lir();
        this.t1 = new d();
        this.x1 = false;
        this.C1 = false;
        this.D1 = null;
        this.E1 = null;
        this.F1 = null;
        this.G1 = 0;
        this.H1 = -1L;
        this.I1 = 0.0f;
        this.J1 = 0;
        this.K1 = 0.0f;
        this.L1 = false;
        this.T1 = new epe(0);
        this.U1 = false;
        this.W1 = null;
        new HashMap();
        this.X1 = new Rect();
        this.Y1 = false;
        this.Z1 = j.D0;
        this.a2 = new f();
        this.b2 = false;
        this.c2 = new RectF();
        this.d2 = null;
        this.e2 = null;
        this.f2 = new ArrayList<Integer>();
        erh.g2 = ((View)this).isInEditMode();
        if (set != null) {
            final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, as2.c1);
            final int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            int n2 = 1;
            while (i < indexCount) {
                final int index = obtainStyledAttributes.getIndex(i);
                int p2 = 2;
                int boolean1;
                if (index == 2) {
                    this.V0 = new irh(((View)this).getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                    boolean1 = n2;
                }
                else if (index == 1) {
                    this.a1 = obtainStyledAttributes.getResourceId(index, -1);
                    boolean1 = n2;
                }
                else if (index == 4) {
                    this.l1 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.n1 = true;
                    boolean1 = n2;
                }
                else if (index == 0) {
                    boolean1 = (obtainStyledAttributes.getBoolean(index, (boolean)(n2 != 0)) ? 1 : 0);
                }
                else if (index == 5) {
                    boolean1 = n2;
                    if (this.p1 == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            p2 = 0;
                        }
                        this.p1 = p2;
                        boolean1 = n2;
                    }
                }
                else {
                    boolean1 = n2;
                    if (index == 3) {
                        this.p1 = obtainStyledAttributes.getInt(index, 0);
                        boolean1 = n2;
                    }
                }
                ++i;
                n2 = boolean1;
            }
            obtainStyledAttributes.recycle();
            if (this.V0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (n2 == 0) {
                this.V0 = null;
            }
        }
        if (this.p1 != 0) {
            final irh v0 = this.V0;
            if (v0 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            }
            else {
                final int j = v0.i();
                final irh v2 = this.V0;
                final b b = v2.b(v2.i());
                final String c = la8.c(((View)this).getContext(), j);
                for (int childCount = this.getChildCount(), k = 0; k < childCount; ++k) {
                    final View child = this.getChildAt(k);
                    final int id = child.getId();
                    if (id == -1) {
                        final StringBuilder y = pd.y("CHECK: ", c, " ALL VIEWS SHOULD HAVE ID's ");
                        y.append(child.getClass().getName());
                        y.append(" does not!");
                        Log.w("MotionLayout", y.toString());
                    }
                    if (b.n(id) == null) {
                        final StringBuilder y2 = pd.y("CHECK: ", c, " NO CONSTRAINTS for ");
                        y2.append(la8.d(child));
                        Log.w("MotionLayout", y2.toString());
                    }
                }
                final Integer[] array = b.f.keySet().toArray(new Integer[0]);
                final int length = array.length;
                final int[] array2 = new int[length];
                int n3 = 0;
                int l;
                while (true) {
                    l = n;
                    if (n3 >= length) {
                        break;
                    }
                    array2[n3] = array[n3];
                    ++n3;
                }
                while (l < length) {
                    final int n4 = array2[l];
                    final String c2 = la8.c(((View)this).getContext(), n4);
                    if (((View)this).findViewById(array2[l]) == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("CHECK: ");
                        sb.append(c);
                        sb.append(" NO View matches id ");
                        sb.append(c2);
                        Log.w("MotionLayout", sb.toString());
                    }
                    if (b.m(n4).e.d == -1) {
                        Log.w("MotionLayout", zh8.o("CHECK: ", c, "(", c2, ") no LAYOUT_HEIGHT"));
                    }
                    if (b.m(n4).e.c == -1) {
                        Log.w("MotionLayout", zh8.o("CHECK: ", c, "(", c2, ") no LAYOUT_HEIGHT"));
                    }
                    ++l;
                }
                final SparseIntArray sparseIntArray = new SparseIntArray();
                final SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (final irh.b b2 : this.V0.d) {
                    if (b2 == this.V0.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (b2.d == b2.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    final int d = b2.d;
                    final int c3 = b2.c;
                    final String c4 = la8.c(((View)this).getContext(), d);
                    final String c5 = la8.c(((View)this).getContext(), c3);
                    if (sparseIntArray.get(d) == c3) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("CHECK: two transitions with the same start and end ");
                        sb2.append(c4);
                        sb2.append("->");
                        sb2.append(c5);
                        Log.e("MotionLayout", sb2.toString());
                    }
                    if (sparseIntArray2.get(c3) == d) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("CHECK: you can't have reverse transitions");
                        sb3.append(c4);
                        sb3.append("->");
                        sb3.append(c5);
                        Log.e("MotionLayout", sb3.toString());
                    }
                    sparseIntArray.put(d, c3);
                    sparseIntArray2.put(c3, d);
                    if (this.V0.b(d) == null) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append(" no such constraintSetStart ");
                        sb4.append(c4);
                        Log.e("MotionLayout", sb4.toString());
                    }
                    if (this.V0.b(c3) == null) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append(" no such constraintSetEnd ");
                        sb5.append(c4);
                        Log.e("MotionLayout", sb5.toString());
                    }
                }
            }
        }
        if (this.a1 == -1) {
            final irh v3 = this.V0;
            if (v3 != null) {
                this.a1 = v3.i();
                this.Z0 = this.V0.i();
                this.b1 = this.V0.d();
            }
        }
    }
    
    public static Rect z(final erh erh, final ni6 ni6) {
        erh.X1.top = ni6.z();
        erh.X1.left = ni6.y();
        final Rect x1 = erh.X1;
        final int x2 = ni6.x();
        final Rect x3 = erh.X1;
        x1.right = x2 + x3.left;
        final int q = ni6.q();
        final Rect x4 = erh.X1;
        x3.bottom = q + x4.top;
        return x4;
    }
    
    public final void A(final float l1) {
        final irh v0 = this.V0;
        if (v0 == null) {
            return;
        }
        final float j1 = this.j1;
        final float i1 = this.i1;
        if (j1 != i1 && this.m1) {
            this.j1 = i1;
        }
        final float j2 = this.j1;
        if (j2 == l1) {
            return;
        }
        this.r1 = false;
        this.l1 = l1;
        this.h1 = v0.c() / 1000.0f;
        this.setProgress(this.l1);
        this.W0 = null;
        this.X0 = this.V0.f();
        this.m1 = false;
        this.g1 = this.getNanoTime();
        this.n1 = true;
        this.i1 = j2;
        this.j1 = j2;
        ((View)this).invalidate();
    }
    
    public final void B(final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final xqh xqh = this.f1.get(this.getChildAt(i));
            if (xqh != null && "button".equals(la8.d(xqh.b)) && xqh.A != null) {
                int n = 0;
                while (true) {
                    final iqe[] a = xqh.A;
                    if (n >= a.length) {
                        break;
                    }
                    final iqe iqe = a[n];
                    float n2;
                    if (b) {
                        n2 = -100.0f;
                    }
                    else {
                        n2 = 100.0f;
                    }
                    iqe.g(n2, xqh.b);
                    ++n;
                }
            }
        }
    }
    
    public final void C(final boolean b) {
        final j g0 = j.G0;
        if (this.k1 == -1L) {
            this.k1 = this.getNanoTime();
        }
        final float j1 = this.j1;
        if (j1 > 0.0f && j1 < 1.0f) {
            this.a1 = -1;
        }
        final boolean c1 = this.C1;
        final boolean b2 = false;
        final boolean b3 = true;
        final boolean b4 = true;
        boolean b5 = false;
        Label_1149: {
            if (!c1) {
                b5 = b2;
                if (!this.n1) {
                    break Label_1149;
                }
                if (!b) {
                    b5 = b2;
                    if (this.l1 == j1) {
                        break Label_1149;
                    }
                }
            }
            final float signum = Math.signum(this.l1 - j1);
            final long nanoTime = this.getNanoTime();
            final drh w0 = this.W0;
            float y0;
            if (!(w0 instanceof drh)) {
                y0 = (nanoTime - this.k1) * signum * 1.0E-9f / this.h1;
            }
            else {
                y0 = 0.0f;
            }
            float n = this.j1 + y0;
            if (this.m1) {
                n = this.l1;
            }
            final float n2 = fcmpl(signum, 0.0f);
            boolean b6;
            if ((n2 > 0 && n >= this.l1) || (signum <= 0.0f && n <= this.l1)) {
                n = this.l1;
                this.n1 = false;
                b6 = true;
            }
            else {
                b6 = false;
            }
            this.j1 = n;
            this.i1 = n;
            this.k1 = nanoTime;
            int n4 = 0;
            Label_0548: {
                if (w0 != null && !b6) {
                    if (this.r1) {
                        final float interpolation = ((TimeInterpolator)w0).getInterpolation((nanoTime - this.g1) * 1.0E-9f);
                        final drh w2 = this.W0;
                        final lir s1 = this.s1;
                        int n3;
                        if (w2 == s1) {
                            if (s1.c.b()) {
                                n3 = 2;
                            }
                            else {
                                n3 = 1;
                            }
                        }
                        else {
                            n3 = 0;
                        }
                        this.j1 = interpolation;
                        this.k1 = nanoTime;
                        final drh w3 = this.W0;
                        n = interpolation;
                        n4 = n3;
                        if (!(w3 instanceof drh)) {
                            break Label_0548;
                        }
                        final float a = w3.a();
                        this.Y0 = a;
                        if (Math.abs(a) * this.h1 <= 1.0E-5f && n3 == 2) {
                            this.n1 = false;
                        }
                        float n5 = interpolation;
                        if (a > 0.0f) {
                            n5 = interpolation;
                            if (interpolation >= 1.0f) {
                                this.j1 = 1.0f;
                                this.n1 = false;
                                n5 = 1.0f;
                            }
                        }
                        n = n5;
                        n4 = n3;
                        if (a >= 0.0f) {
                            break Label_0548;
                        }
                        n = n5;
                        n4 = n3;
                        if (n5 <= 0.0f) {
                            this.j1 = 0.0f;
                            this.n1 = false;
                            n = 0.0f;
                            n4 = n3;
                        }
                        break Label_0548;
                    }
                    else {
                        final float interpolation2 = ((TimeInterpolator)w0).getInterpolation(n);
                        final drh w4 = this.W0;
                        if (w4 instanceof drh) {
                            this.Y0 = w4.a();
                        }
                        else {
                            this.Y0 = (((TimeInterpolator)w4).getInterpolation(n + y0) - interpolation2) * signum / y0;
                        }
                        n = interpolation2;
                    }
                }
                else {
                    this.Y0 = y0;
                }
                n4 = 0;
            }
            if (Math.abs(this.Y0) > 1.0E-5f) {
                this.setState(j.F0);
            }
            float s2 = n;
            Label_0655: {
                if (n4 != 1) {
                    float l1 = 0.0f;
                    Label_0624: {
                        if (n2 <= 0 || n < this.l1) {
                            l1 = n;
                            if (signum > 0.0f) {
                                break Label_0624;
                            }
                            l1 = n;
                            if (n > this.l1) {
                                break Label_0624;
                            }
                        }
                        l1 = this.l1;
                        this.n1 = false;
                    }
                    if (l1 < 1.0f) {
                        s2 = l1;
                        if (l1 > 0.0f) {
                            break Label_0655;
                        }
                    }
                    this.n1 = false;
                    this.setState(g0);
                    s2 = l1;
                }
            }
            final int childCount = this.getChildCount();
            this.C1 = false;
            final long nanoTime2 = this.getNanoTime();
            this.S1 = s2;
            final Interpolator x0 = this.X0;
            float interpolation3;
            if (x0 == null) {
                interpolation3 = s2;
            }
            else {
                interpolation3 = ((TimeInterpolator)x0).getInterpolation(s2);
            }
            final Interpolator x2 = this.X0;
            if (x2 != null) {
                final float interpolation4 = ((TimeInterpolator)x2).getInterpolation(signum / this.h1 + s2);
                this.Y0 = interpolation4;
                this.Y0 = interpolation4 - ((TimeInterpolator)this.X0).getInterpolation(s2);
            }
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final xqh xqh = this.f1.get(child);
                if (xqh != null) {
                    this.C1 |= xqh.c(child, interpolation3, nanoTime2, this.T1);
                }
            }
            final boolean b7 = (n2 > 0 && s2 >= this.l1) || (signum <= 0.0f && s2 <= this.l1);
            if (!this.C1 && !this.n1 && b7) {
                this.setState(g0);
            }
            if (this.L1) {
                this.requestLayout();
            }
            this.C1 |= (b7 ^ true);
            boolean b8 = false;
            Label_0971: {
                if (s2 <= 0.0f) {
                    final int z0 = this.Z0;
                    if (z0 != -1 && this.a1 != z0) {
                        this.a1 = z0;
                        this.V0.b(z0).a(this);
                        this.setState(g0);
                        b8 = true;
                        break Label_0971;
                    }
                }
                b8 = false;
            }
            boolean b9 = b8;
            if (s2 >= 1.0) {
                final int a2 = this.a1;
                final int b10 = this.b1;
                b9 = b8;
                if (a2 != b10) {
                    this.a1 = b10;
                    this.V0.b(b10).a(this);
                    this.setState(g0);
                    b9 = true;
                }
            }
            if (!this.C1 && !this.n1) {
                if ((n2 > 0 && s2 == 1.0f) || (signum < 0.0f && s2 == 0.0f)) {
                    this.setState(g0);
                }
            }
            else {
                ((View)this).invalidate();
            }
            b5 = b9;
            if (!this.C1) {
                b5 = b9;
                if (!this.n1) {
                    if (n2 <= 0 || s2 != 1.0f) {
                        b5 = b9;
                        if (signum >= 0.0f) {
                            break Label_1149;
                        }
                        b5 = b9;
                        if (s2 != 0.0f) {
                            break Label_1149;
                        }
                    }
                    this.J();
                    b5 = b9;
                }
            }
        }
        final float j2 = this.j1;
        boolean b12 = false;
        Label_1244: {
            if (j2 >= 1.0f) {
                final int a3 = this.a1;
                final int b11 = this.b1;
                if (a3 != b11) {
                    b5 = b4;
                }
                this.a1 = b11;
            }
            else {
                b12 = b5;
                if (j2 > 0.0f) {
                    break Label_1244;
                }
                final int a4 = this.a1;
                final int z2 = this.Z0;
                if (a4 != z2) {
                    b5 = b3;
                }
                this.a1 = z2;
            }
            b12 = b5;
        }
        this.b2 |= b12;
        if (b12 && !this.U1) {
            this.requestLayout();
        }
        this.i1 = this.j1;
    }
    
    public final void D() {
        if (this.o1 == null) {
            final CopyOnWriteArrayList<i> f1 = this.F1;
            if (f1 == null || f1.isEmpty()) {
                return;
            }
        }
        if (this.K1 != this.i1) {
            if (this.J1 != -1) {
                final i o1 = this.o1;
                if (o1 != null) {
                    o1.d();
                }
                final CopyOnWriteArrayList<i> f2 = this.F1;
                if (f2 != null) {
                    final Iterator<i> iterator = f2.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().d();
                    }
                }
            }
            this.J1 = -1;
            this.K1 = this.i1;
            final i o2 = this.o1;
            if (o2 != null) {
                o2.c();
            }
            final CopyOnWriteArrayList<i> f3 = this.F1;
            if (f3 != null) {
                final Iterator<i> iterator2 = f3.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().c();
                }
            }
        }
    }
    
    public final void E() {
        Label_0103: {
            if (this.o1 == null) {
                final CopyOnWriteArrayList<i> f1 = this.F1;
                if (f1 == null || f1.isEmpty()) {
                    break Label_0103;
                }
            }
            if (this.J1 == -1) {
                this.J1 = this.a1;
                int intValue;
                if (!this.f2.isEmpty()) {
                    final ArrayList<Integer> f2 = this.f2;
                    intValue = f2.get(f2.size() - 1);
                }
                else {
                    intValue = -1;
                }
                final int a1 = this.a1;
                if (intValue != a1 && a1 != -1) {
                    this.f2.add(a1);
                }
            }
        }
        this.K();
        final Runnable w1 = this.W1;
        if (w1 != null) {
            w1.run();
        }
    }
    
    public final void F(int n, float n2, final float n3, final float n4, final float[] array) {
        final HashMap<View, xqh> f1 = this.f1;
        final View p5 = this.p(n);
        final xqh xqh = f1.get(p5);
        if (xqh != null) {
            n2 = xqh.a(n2, xqh.v);
            final m97[] j = xqh.j;
            n = 0;
            if (j != null) {
                final m97 m97 = j[0];
                final double n5 = n2;
                m97.e(n5, xqh.q);
                xqh.j[0].c(n5, xqh.p);
                n2 = xqh.v[0];
                double[] q;
                while (true) {
                    q = xqh.q;
                    if (n >= q.length) {
                        break;
                    }
                    q[n] *= n2;
                    ++n;
                }
                final sr0 k = xqh.k;
                if (k != null) {
                    final double[] p6 = xqh.p;
                    if (p6.length > 0) {
                        k.c(n5, p6);
                        xqh.k.e(n5, xqh.q);
                        xqh.f.i(n3, n4, array, xqh.o, xqh.q, xqh.p);
                    }
                }
                else {
                    xqh.f.i(n3, n4, array, xqh.o, q, xqh.p);
                }
            }
            else {
                final frh g = xqh.g;
                n2 = g.H0;
                final frh f2 = xqh.f;
                final float n6 = n2 - f2.H0;
                final float n7 = g.I0 - f2.I0;
                final float j2 = g.J0;
                final float j3 = f2.J0;
                final float k2 = g.K0;
                n2 = f2.K0;
                array[0] = (j2 - j3 + n6) * n3 + (1.0f - n3) * n6;
                array[1] = (k2 - n2 + n7) * n4 + (1.0f - n4) * n7;
            }
            p5.getY();
        }
        else {
            String s;
            if (p5 == null) {
                s = udu.z("", n);
            }
            else {
                s = p5.getContext().getResources().getResourceName(n);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("WARNING could not find view id ");
            sb.append(s);
            Log.w("MotionLayout", sb.toString());
        }
    }
    
    public final b G(final int n) {
        final irh v0 = this.V0;
        if (v0 == null) {
            return null;
        }
        return v0.b(n);
    }
    
    public final boolean H(float n, float n2, final View view, MotionEvent obtain) {
        final boolean b = view instanceof ViewGroup;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0097: {
            if (b) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                    final View child = viewGroup.getChildAt(i);
                    if (this.H(child.getLeft() + n - view.getScrollX(), child.getTop() + n2 - view.getScrollY(), child, obtain)) {
                        b3 = true;
                        break Label_0097;
                    }
                }
            }
            b3 = false;
        }
        if (!b3) {
            this.c2.set(n, n2, view.getRight() + n - view.getLeft(), view.getBottom() + n2 - view.getTop());
            if (obtain.getAction() != 0 || this.c2.contains(obtain.getX(), obtain.getY())) {
                n = -n;
                n2 = -n2;
                final Matrix matrix = view.getMatrix();
                boolean b4;
                if (matrix.isIdentity()) {
                    obtain.offsetLocation(n, n2);
                    b4 = view.onTouchEvent(obtain);
                    obtain.offsetLocation(-n, -n2);
                }
                else {
                    obtain = MotionEvent.obtain(obtain);
                    obtain.offsetLocation(n, n2);
                    if (this.e2 == null) {
                        this.e2 = new Matrix();
                    }
                    matrix.invert(this.e2);
                    obtain.transform(this.e2);
                    b4 = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (b4) {
                    b3 = b2;
                }
            }
        }
        return b3;
    }
    
    public final void I(final int n) {
        if (n != 0) {
            try {
                final irh v0 = new irh(((View)this).getContext(), this, n);
                this.V0 = v0;
                if (this.a1 == -1) {
                    this.a1 = v0.i();
                    this.Z0 = this.V0.i();
                    this.b1 = this.V0.d();
                }
                if (this.isAttachedToWindow()) {
                    try {
                        final Display display = ((View)this).getDisplay();
                        if (display != null) {
                            display.getRotation();
                        }
                        final irh v2 = this.V0;
                        if (v2 != null) {
                            final b b = v2.b(this.a1);
                            this.V0.o(this);
                            if (b != null) {
                                b.b(this);
                            }
                            this.Z0 = this.a1;
                        }
                        this.J();
                        final h v3 = this.V1;
                        if (v3 != null) {
                            if (this.Y1) {
                                ((View)this).post((Runnable)new Runnable(this) {
                                    public final erh D0;
                                    
                                    @Override
                                    public final void run() {
                                        this.D0.V1.a();
                                    }
                                });
                                return;
                            }
                            v3.a();
                            return;
                        }
                        else {
                            final irh v4 = this.V0;
                            if (v4 == null) {
                                return;
                            }
                            final irh.b c = v4.c;
                            if (c != null && c.n == 4) {
                                this.P();
                                this.setState(j.E0);
                                this.setState(j.F0);
                            }
                            return;
                        }
                    }
                    catch (final Exception ex) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", ex);
                    }
                }
                this.V0 = null;
                return;
            }
            catch (final Exception ex2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", ex2);
            }
        }
        this.V0 = null;
    }
    
    public final void J() {
        final irh v0 = this.V0;
        if (v0 == null) {
            return;
        }
        if (v0.a(this, this.a1)) {
            this.requestLayout();
            return;
        }
        final int a1 = this.a1;
        if (a1 != -1) {
            final irh v2 = this.V0;
            for (final irh.b b : v2.d) {
                if (b.m.size() > 0) {
                    final Iterator<irh.b.a> iterator2 = b.m.iterator();
                    while (iterator2.hasNext()) {
                        ((irh.b.a)iterator2.next()).b(this);
                    }
                }
            }
            for (final irh.b b2 : v2.f) {
                if (b2.m.size() > 0) {
                    final Iterator<irh.b.a> iterator4 = b2.m.iterator();
                    while (iterator4.hasNext()) {
                        ((irh.b.a)iterator4.next()).b(this);
                    }
                }
            }
            for (final irh.b b3 : v2.d) {
                if (b3.m.size() > 0) {
                    final Iterator<irh.b.a> iterator6 = b3.m.iterator();
                    while (iterator6.hasNext()) {
                        ((irh.b.a)iterator6.next()).a(this, a1, b3);
                    }
                }
            }
            for (final irh.b b4 : v2.f) {
                if (b4.m.size() > 0) {
                    final Iterator<irh.b.a> iterator8 = b4.m.iterator();
                    while (iterator8.hasNext()) {
                        ((irh.b.a)iterator8.next()).a(this, a1, b4);
                    }
                }
            }
        }
        if (this.V0.q()) {
            final irh.b c = this.V0.c;
            if (c != null) {
                final kut l = c.l;
                if (l != null) {
                    final int d = l.d;
                    Object o;
                    if (d != -1) {
                        final View viewById = ((View)l.r).findViewById(d);
                        if ((o = viewById) == null) {
                            final StringBuilder j = fu8.j("cannot find TouchAnchorId @id/");
                            j.append(la8.c(((View)l.r).getContext(), l.d));
                            Log.e("TouchResponse", j.toString());
                            o = viewById;
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o instanceof NestedScrollView) {
                        final NestedScrollView nestedScrollView = (NestedScrollView)o;
                        ((View)nestedScrollView).setOnTouchListener((View$OnTouchListener)new iut());
                        nestedScrollView.setOnScrollChangeListener((NestedScrollView.NestedScrollView$c)new jut());
                    }
                }
            }
        }
    }
    
    public final void K() {
        if (this.o1 == null) {
            final CopyOnWriteArrayList<i> f1 = this.F1;
            if (f1 == null || f1.isEmpty()) {
                return;
            }
        }
        for (final Integer n : this.f2) {
            final i o1 = this.o1;
            if (o1 != null) {
                n.intValue();
                o1.a();
            }
            final CopyOnWriteArrayList<i> f2 = this.F1;
            if (f2 != null) {
                for (final i i : f2) {
                    n.intValue();
                    i.a();
                }
            }
        }
        this.f2.clear();
    }
    
    public final void L() {
        this.a2.f();
        ((View)this).invalidate();
    }
    
    public final void M(int b) {
        this.setState(j.E0);
        this.a1 = b;
        this.Z0 = -1;
        this.b1 = -1;
        final ii6 n0 = super.N0;
        if (n0 != null) {
            final float n2 = -1;
            final int b2 = n0.b;
            if (b2 == b) {
                ii6.a a;
                if (b == -1) {
                    a = (ii6.a)n0.d.valueAt(0);
                }
                else {
                    a = (ii6.a)n0.d.get(b2);
                }
                b = n0.c;
                if (b == -1 || !a.b.get(b).a(n2, n2)) {
                    b = a.a(n2, n2);
                    if (n0.c != b) {
                        b f;
                        if (b == -1) {
                            f = null;
                        }
                        else {
                            f = a.b.get(b).f;
                        }
                        if (b != -1) {
                            final int e = a.b.get(b).e;
                        }
                        if (f != null) {
                            n0.c = b;
                            f.b(n0.a);
                        }
                    }
                }
            }
            else {
                n0.b = b;
                final ii6.a a2 = (ii6.a)n0.d.get(b);
                final int a3 = a2.a(n2, n2);
                b b3;
                if (a3 == -1) {
                    b3 = a2.d;
                }
                else {
                    b3 = a2.b.get(a3).f;
                }
                if (a3 != -1) {
                    final int e2 = a2.b.get(a3).e;
                }
                if (b3 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("NO Constraint set found ! id=");
                    sb.append(b);
                    sb.append(", dim =");
                    sb.append(n2);
                    sb.append(", ");
                    sb.append(n2);
                    Log.v("ConstraintLayoutStates", sb.toString());
                }
                else {
                    n0.c = a3;
                    b3.b(n0.a);
                }
            }
        }
        else {
            final irh v0 = this.V0;
            if (v0 != null) {
                v0.b(b).b(this);
            }
        }
    }
    
    public final void N(final int n, final int n2) {
        if (!this.isAttachedToWindow()) {
            if (this.V1 == null) {
                this.V1 = new h();
            }
            final h v1 = this.V1;
            v1.c = n;
            v1.d = n2;
            return;
        }
        final irh v2 = this.V0;
        if (v2 != null) {
            v2.p(this.Z0 = n, this.b1 = n2);
            this.a2.e(this.V0.b(n), this.V0.b(n2));
            this.L();
            this.A(this.j1 = 0.0f);
        }
    }
    
    public final void O(int a1, float l1, float z) {
        final float n = l1;
        if (this.V0 == null) {
            return;
        }
        if (this.j1 == n) {
            return;
        }
        final int n2 = 1;
        this.r1 = true;
        this.g1 = this.getNanoTime();
        final float h1 = this.V0.c() / 1000.0f;
        this.h1 = h1;
        this.l1 = n;
        this.n1 = true;
        Label_0845: {
            if (a1 != 0 && a1 != 1 && a1 != 2) {
                if (a1 == 4) {
                    final d t1 = this.t1;
                    l1 = this.j1;
                    final float h2 = this.V0.h();
                    t1.a = z;
                    t1.b = l1;
                    t1.c = h2;
                    this.W0 = this.t1;
                    break Label_0845;
                }
                if (a1 != 5) {
                    if (a1 != 6 && a1 != 7) {
                        break Label_0845;
                    }
                }
                else {
                    final float j1 = this.j1;
                    final float h3 = this.V0.h();
                    Label_0202: {
                        if (z > 0.0f) {
                            final float n3 = z / h3;
                            if (z * n3 - h3 * n3 * n3 / 2.0f + j1 > 1.0f) {
                                a1 = n2;
                                break Label_0202;
                            }
                        }
                        else {
                            final float n4 = -z / h3;
                            if (h3 * n4 * n4 / 2.0f + z * n4 + j1 < 0.0f) {
                                a1 = n2;
                                break Label_0202;
                            }
                        }
                        a1 = 0;
                    }
                    if (a1 != 0) {
                        final d t2 = this.t1;
                        l1 = this.j1;
                        final float h4 = this.V0.h();
                        t2.a = z;
                        t2.b = l1;
                        t2.c = h4;
                        this.W0 = this.t1;
                        break Label_0845;
                    }
                    final lir s1 = this.s1;
                    final float j2 = this.j1;
                    final float h5 = this.h1;
                    final float h6 = this.V0.h();
                    final irh.b c = this.V0.c;
                    float s2 = 0.0f;
                    Label_0322: {
                        if (c != null) {
                            final kut i = c.l;
                            if (i != null) {
                                s2 = i.s;
                                break Label_0322;
                            }
                        }
                        s2 = 0.0f;
                    }
                    s1.b(j2, l1, z, h5, h6, s2);
                    this.Y0 = 0.0f;
                    a1 = this.a1;
                    this.l1 = n;
                    this.a1 = a1;
                    this.W0 = (drh)this.s1;
                    break Label_0845;
                }
            }
            Label_0454: {
                if (a1 != 1 && a1 != 7) {
                    if (a1 != 2) {
                        l1 = n;
                        if (a1 != 6) {
                            break Label_0454;
                        }
                    }
                    l1 = 1.0f;
                }
                else {
                    l1 = 0.0f;
                }
            }
            final irh v0 = this.V0;
            final irh.b c2 = v0.c;
            Label_0495: {
                if (c2 != null) {
                    final kut k = c2.l;
                    if (k != null) {
                        a1 = k.D;
                        break Label_0495;
                    }
                }
                a1 = 0;
            }
            if (a1 == 0) {
                final lir s3 = this.s1;
                final float j3 = this.j1;
                final float h7 = v0.h();
                final irh.b c3 = this.V0.c;
                float s4 = 0.0f;
                Label_0557: {
                    if (c3 != null) {
                        final kut m = c3.l;
                        if (m != null) {
                            s4 = m.s;
                            break Label_0557;
                        }
                    }
                    s4 = 0.0f;
                }
                s3.b(j3, l1, z, h1, h7, s4);
            }
            else {
                final lir s5 = this.s1;
                final float j4 = this.j1;
                Label_0615: {
                    if (c2 != null) {
                        final kut l2 = c2.l;
                        if (l2 != null) {
                            z = l2.z;
                            break Label_0615;
                        }
                    }
                    z = 0.0f;
                }
                float a2 = 0.0f;
                Label_0645: {
                    if (c2 != null) {
                        final kut l3 = c2.l;
                        if (l3 != null) {
                            a2 = l3.A;
                            break Label_0645;
                        }
                    }
                    a2 = 0.0f;
                }
                float y = 0.0f;
                Label_0675: {
                    if (c2 != null) {
                        final kut l4 = c2.l;
                        if (l4 != null) {
                            y = l4.y;
                            break Label_0675;
                        }
                    }
                    y = 0.0f;
                }
                float b = 0.0f;
                Label_0705: {
                    if (c2 != null) {
                        final kut l5 = c2.l;
                        if (l5 != null) {
                            b = l5.B;
                            break Label_0705;
                        }
                    }
                    b = 0.0f;
                }
                Label_0733: {
                    if (c2 != null) {
                        final kut l6 = c2.l;
                        if (l6 != null) {
                            a1 = l6.C;
                            break Label_0733;
                        }
                    }
                    a1 = 0;
                }
                if (s5.b == null) {
                    s5.b = new p4r();
                }
                final p4r b2 = s5.b;
                s5.c = (kir)b2;
                b2.c = l1;
                b2.a = y;
                b2.e = j4;
                b2.b = a2;
                b2.g = z;
                b2.h = b;
                b2.i = a1;
                b2.d = 0.0f;
            }
            a1 = this.a1;
            this.l1 = l1;
            this.a1 = a1;
            this.W0 = (drh)this.s1;
        }
        this.m1 = false;
        this.g1 = this.getNanoTime();
        ((View)this).invalidate();
    }
    
    public final void P() {
        this.A(1.0f);
        this.W1 = null;
    }
    
    public final void Q(int i) {
        if (!this.isAttachedToWindow()) {
            if (this.V1 == null) {
                this.V1 = new h();
            }
            this.V1.d = i;
            return;
        }
        final irh v0 = this.V0;
        int b1 = i;
        if (v0 != null) {
            final l9r b2 = v0.b;
            b1 = i;
            if (b2 != null) {
                int n = this.a1;
                final float n2 = -1;
                final l9r$a l9r$a = (l9r$a)b2.b.get(i);
                Label_0269: {
                    if (l9r$a == null) {
                        n = i;
                    }
                    else {
                        final float n3 = fcmpl(n2, -1.0f);
                        if (n3 != 0 && n3 != 0) {
                            final Iterator iterator = l9r$a.b.iterator();
                            l9r$b l9r$b = null;
                            while (iterator.hasNext()) {
                                final l9r$b l9r$b2 = (l9r$b)iterator.next();
                                if (l9r$b2.a(n2, n2)) {
                                    if (n == l9r$b2.e) {
                                        break Label_0269;
                                    }
                                    l9r$b = l9r$b2;
                                }
                            }
                            if (l9r$b != null) {
                                n = l9r$b.e;
                            }
                            else {
                                n = l9r$a.c;
                            }
                        }
                        else if (l9r$a.c != n) {
                            final Iterator iterator2 = l9r$a.b.iterator();
                            while (iterator2.hasNext()) {
                                if (n == ((l9r$b)iterator2.next()).e) {
                                    break Label_0269;
                                }
                            }
                            n = l9r$a.c;
                        }
                    }
                }
                b1 = i;
                if (n != -1) {
                    b1 = n;
                }
            }
        }
        i = this.a1;
        if (i != b1) {
            if (this.Z0 == b1) {
                this.A(0.0f);
            }
            else if (this.b1 == b1) {
                this.A(1.0f);
            }
            else {
                this.b1 = b1;
                if (i != -1) {
                    this.N(i, b1);
                    this.A(1.0f);
                    this.j1 = 0.0f;
                    this.P();
                }
                else {
                    final int n4 = 0;
                    this.r1 = false;
                    this.l1 = 1.0f;
                    this.i1 = 0.0f;
                    this.j1 = 0.0f;
                    this.k1 = this.getNanoTime();
                    this.g1 = this.getNanoTime();
                    this.m1 = false;
                    this.W0 = null;
                    this.h1 = this.V0.c() / 1000.0f;
                    this.Z0 = -1;
                    this.V0.p(-1, this.b1);
                    final SparseArray sparseArray = new SparseArray();
                    final int childCount = this.getChildCount();
                    this.f1.clear();
                    View child;
                    for (i = 0; i < childCount; ++i) {
                        child = this.getChildAt(i);
                        this.f1.put(child, new xqh(child));
                        sparseArray.put(child.getId(), (Object)this.f1.get(child));
                    }
                    this.n1 = true;
                    this.a2.e(null, this.V0.b(b1));
                    this.L();
                    this.a2.a();
                    int childCount2;
                    View child2;
                    xqh xqh;
                    frh f;
                    for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
                        child2 = this.getChildAt(i);
                        xqh = this.f1.get(child2);
                        if (xqh != null) {
                            f = xqh.f;
                            f.F0 = 0.0f;
                            f.G0 = 0.0f;
                            f.g(child2.getX(), child2.getY(), (float)child2.getWidth(), (float)child2.getHeight());
                            xqh.h.i(child2);
                        }
                    }
                    final int width = ((View)this).getWidth();
                    final int height = ((View)this).getHeight();
                    xqh xqh2;
                    for (i = 0; i < childCount; ++i) {
                        xqh2 = this.f1.get(this.getChildAt(i));
                        if (xqh2 != null) {
                            this.V0.g(xqh2);
                            xqh2.f(width, height, this.getNanoTime());
                        }
                    }
                    final irh.b c = this.V0.c;
                    float j;
                    if (c != null) {
                        j = c.i;
                    }
                    else {
                        j = 0.0f;
                    }
                    if (j != 0.0f) {
                        float min = Float.MAX_VALUE;
                        float max = -3.4028235E38f;
                        int n5 = 0;
                        while (true) {
                            i = n4;
                            if (n5 >= childCount) {
                                break;
                            }
                            final frh g = this.f1.get(this.getChildAt(n5)).g;
                            final float n6 = g.I0 + g.H0;
                            min = Math.min(min, n6);
                            max = Math.max(max, n6);
                            ++n5;
                        }
                        while (i < childCount) {
                            final xqh xqh3 = this.f1.get(this.getChildAt(i));
                            final frh g2 = xqh3.g;
                            final float h0 = g2.H0;
                            final float i2 = g2.I0;
                            xqh3.n = 1.0f / (1.0f - j);
                            xqh3.m = j - (h0 + i2 - min) * j / (max - min);
                            ++i;
                        }
                    }
                    this.i1 = 0.0f;
                    this.j1 = 0.0f;
                    this.n1 = true;
                    ((View)this).invalidate();
                }
            }
        }
    }
    
    public final void R(final int n, final b b) {
        final irh v0 = this.V0;
        if (v0 != null) {
            v0.g.put(n, (Object)b);
        }
        this.a2.e(this.V0.b(this.Z0), this.V0.b(this.b1));
        this.L();
        if (this.a1 == n) {
            b.b(this);
        }
    }
    
    public final void S(final int n, final View... array) {
        final irh v0 = this.V0;
        if (v0 != null) {
            final ccx q = v0.q;
            Objects.requireNonNull(q);
            final ArrayList list = new ArrayList();
            final Iterator<bcx> iterator = q.b.iterator();
            bcx bcx = null;
            while (iterator.hasNext()) {
                final bcx bcx2 = iterator.next();
                if (bcx2.a == n) {
                    for (final View view : array) {
                        if (bcx2.b(view)) {
                            list.add(view);
                        }
                    }
                    if (!list.isEmpty()) {
                        final View[] array2 = list.toArray(new View[0]);
                        final int currentState = q.a.getCurrentState();
                        if (bcx2.e != 2) {
                            if (currentState == -1) {
                                final String d = q.d;
                                final StringBuilder j = fu8.j("No support for ViewTransition within transition yet. Currently: ");
                                j.append(q.a.toString());
                                Log.w(d, j.toString());
                            }
                            else {
                                final b g = q.a.G(currentState);
                                if (g != null) {
                                    bcx2.a(q, q.a, currentState, g, array2);
                                }
                            }
                        }
                        else {
                            bcx2.a(q, q.a, currentState, (b)null, array2);
                        }
                        list.clear();
                    }
                    bcx = bcx2;
                }
            }
            if (bcx == null) {
                Log.e(q.d, " Could not find ViewTransition");
            }
        }
        else {
            Log.e("MotionLayout", " no motionScene");
        }
    }
    
    @Override
    public final void dispatchDraw(final Canvas canvas) {
        this.C(false);
        final irh v0 = this.V0;
        if (v0 != null) {
            final ccx q = v0.q;
            if (q != null) {
                final ArrayList<bcx$a> e = q.e;
                if (e != null) {
                    final Iterator<bcx$a> iterator = e.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a();
                    }
                    q.e.removeAll(q.f);
                    q.f.clear();
                    if (q.e.isEmpty()) {
                        q.e = null;
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.V0 == null) {
            return;
        }
        if ((this.p1 & 0x1) == 0x1 && !((View)this).isInEditMode()) {
            ++this.G1;
            final long nanoTime = this.getNanoTime();
            final long h1 = this.H1;
            if (h1 != -1L) {
                final long n = nanoTime - h1;
                if (n > 200000000L) {
                    this.I1 = (int)(this.G1 / (n * 1.0E-9f) * 100.0f) / 100.0f;
                    this.G1 = 0;
                    this.H1 = nanoTime;
                }
            }
            else {
                this.H1 = nanoTime;
            }
            final Paint paint = new Paint();
            paint.setTextSize(42.0f);
            final float n2 = (int)(this.getProgress() * 1000.0f) / 10.0f;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.I1);
            sb.append(" fps ");
            sb.append(la8.e(this, this.Z0));
            sb.append(" -> ");
            final StringBuilder j = fu8.j(sb.toString());
            j.append(la8.e(this, this.b1));
            j.append(" (progress: ");
            j.append(n2);
            j.append(" ) state=");
            final int a1 = this.a1;
            String e2;
            if (a1 == -1) {
                e2 = "undefined";
            }
            else {
                e2 = la8.e(this, a1);
            }
            j.append(e2);
            final String string = j.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, (float)(((View)this).getHeight() - 29), paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, (float)(((View)this).getHeight() - 30), paint);
        }
        if (this.p1 > 1) {
            if (this.q1 == null) {
                this.q1 = new e();
            }
            final e q2 = this.q1;
            final HashMap<View, xqh> f1 = this.f1;
            final int c = this.V0.c();
            final int p = this.p1;
            Objects.requireNonNull(q2);
            if (f1 != null) {
                if (f1.size() != 0) {
                    canvas.save();
                    if (!((View)q2.n).isInEditMode() && (p & 0x1) == 0x2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(((View)q2.n).getContext().getResources().getResourceName(q2.n.b1));
                        sb2.append(":");
                        sb2.append(q2.n.getProgress());
                        final String string2 = sb2.toString();
                        canvas.drawText(string2, 10.0f, (float)(((View)q2.n).getHeight() - 30), q2.h);
                        canvas.drawText(string2, 11.0f, (float)(((View)q2.n).getHeight() - 29), q2.e);
                    }
                    final Iterator<xqh> iterator2 = f1.values().iterator();
                    Canvas canvas2 = canvas;
                    while (iterator2.hasNext()) {
                        final xqh xqh = iterator2.next();
                        int n3 = xqh.f.E0;
                        final Iterator iterator3 = xqh.u.iterator();
                        while (iterator3.hasNext()) {
                            n3 = Math.max(n3, ((frh)iterator3.next()).E0);
                        }
                        int max;
                        final int n4 = max = Math.max(n3, xqh.g.E0);
                        if (p > 0 && (max = n4) == 0) {
                            max = 1;
                        }
                        if (max == 0) {
                            continue;
                        }
                        final float[] c2 = q2.c;
                        final int[] b = q2.b;
                        int k;
                        if (c2 != null) {
                            final double[] f2 = xqh.j[0].f();
                            if (b != null) {
                                final Iterator iterator4 = xqh.u.iterator();
                                int n5 = 0;
                                while (iterator4.hasNext()) {
                                    b[n5] = ((frh)iterator4.next()).R0;
                                    ++n5;
                                }
                            }
                            int i = 0;
                            int n6 = 0;
                            while (i < f2.length) {
                                xqh.j[0].c(f2[i], xqh.p);
                                xqh.f.f(f2[i], xqh.o, xqh.p, c2, n6);
                                n6 += 2;
                                ++i;
                            }
                            k = n6 / 2;
                        }
                        else {
                            k = 0;
                        }
                        q2.k = k;
                        if (max < 1) {
                            continue;
                        }
                        final int n7 = c / 16;
                        final float[] a2 = q2.a;
                        if (a2 == null || a2.length != n7 * 2) {
                            q2.a = new float[n7 * 2];
                            q2.d = new Path();
                        }
                        final float n8 = (float)q2.m;
                        canvas2.translate(n8, n8);
                        q2.e.setColor(1996488704);
                        q2.i.setColor(1996488704);
                        q2.f.setColor(1996488704);
                        q2.g.setColor(1996488704);
                        final float[] a3 = q2.a;
                        float n9 = 1.0f / (n7 - 1);
                        final HashMap y = xqh.y;
                        i2r i2r;
                        if (y == null) {
                            i2r = null;
                        }
                        else {
                            i2r = y.get("translationX");
                        }
                        final i2r i2r2 = i2r;
                        final HashMap y2 = xqh.y;
                        i2r i2r3;
                        if (y2 == null) {
                            i2r3 = null;
                        }
                        else {
                            i2r3 = y2.get("translationY");
                        }
                        final i2r i2r4 = i2r3;
                        final HashMap z = xqh.z;
                        Object o;
                        if (z == null) {
                            o = null;
                        }
                        else {
                            o = z.get("translationX");
                        }
                        final HashMap z2 = xqh.z;
                        Object o2;
                        if (z2 == null) {
                            o2 = null;
                        }
                        else {
                            o2 = z2.get("translationY");
                        }
                        final Object o3 = o2;
                        int l = 0;
                        final i2r i2r5 = i2r2;
                        final i2r i2r6 = i2r4;
                        final Object o4 = o3;
                        while (l < n7) {
                            final float n10 = l * n9;
                            final float n11 = xqh.n;
                            float min = n10;
                            if (n11 != 1.0f) {
                                final float m = xqh.m;
                                float n12 = n10;
                                if (n10 < m) {
                                    n12 = 0.0f;
                                }
                                min = n12;
                                if (n12 > m) {
                                    min = n12;
                                    if (n12 < 1.0) {
                                        min = Math.min((n12 - m) * n11, 1.0f);
                                    }
                                }
                            }
                            double n13 = min;
                            ip9 d0 = xqh.f.D0;
                            final Iterator iterator5 = xqh.u.iterator();
                            float n14 = Float.NaN;
                            float n15 = 0.0f;
                            final float n16 = n9;
                            while (iterator5.hasNext()) {
                                final frh frh = (frh)iterator5.next();
                                final ip9 d2 = frh.D0;
                                ip9 ip9 = d0;
                                float f3 = n14;
                                float f4 = n15;
                                if (d2 != null) {
                                    f4 = frh.F0;
                                    if (f4 < min) {
                                        ip9 = d2;
                                        f3 = n14;
                                    }
                                    else {
                                        ip9 = d0;
                                        f3 = n14;
                                        f4 = n15;
                                        if (Float.isNaN(n14)) {
                                            f3 = frh.F0;
                                            f4 = n15;
                                            ip9 = d0;
                                        }
                                    }
                                }
                                d0 = ip9;
                                n14 = f3;
                                n15 = f4;
                            }
                            if (d0 != null) {
                                float n17 = n14;
                                if (Float.isNaN(n14)) {
                                    n17 = 1.0f;
                                }
                                final float n18 = n17 - n15;
                                n13 = (float)d0.a((min - n15) / n18) * n18 + n15;
                            }
                            xqh.j[0].c(n13, xqh.p);
                            final sr0 k2 = xqh.k;
                            if (k2 != null) {
                                final double[] p2 = xqh.p;
                                if (p2.length > 0) {
                                    k2.c(n13, p2);
                                }
                            }
                            final frh f5 = xqh.f;
                            final int[] o5 = xqh.o;
                            final double[] p3 = xqh.p;
                            int n19 = l * 2;
                            f5.f(n13, o5, p3, a3, n19);
                            if (o != null) {
                                a3[n19] += ((ipe)o).a(min);
                            }
                            else if (i2r5 != null) {
                                a3[n19] += i2r5.a(min);
                            }
                            if (o4 != null) {
                                ++n19;
                                a3[n19] += ((ipe)o4).a(min);
                            }
                            else if (i2r6 != null) {
                                ++n19;
                                a3[n19] += i2r6.a(min);
                            }
                            ++l;
                            n9 = n16;
                        }
                        q2.a(canvas, max, q2.k, xqh);
                        q2.e.setColor(-21965);
                        q2.f.setColor(-2067046);
                        q2.i.setColor(-2067046);
                        q2.g.setColor(-13391360);
                        final float n20 = (float)(-q2.m);
                        canvas.translate(n20, n20);
                        q2.a(canvas, max, q2.k, xqh);
                        if (max == 5) {
                            q2.d.reset();
                            for (int n21 = 0; n21 <= 50; ++n21) {
                                final float n22 = n21 / (float)50;
                                final float[] j2 = q2.j;
                                xqh.j[0].c((double)xqh.a(n22, (float[])null), xqh.p);
                                final frh f6 = xqh.f;
                                final int[] o6 = xqh.o;
                                final double[] p4 = xqh.p;
                                float h2 = f6.H0;
                                float i2 = f6.I0;
                                float j3 = f6.J0;
                                float k3 = f6.K0;
                                for (int n23 = 0; n23 < o6.length; ++n23) {
                                    final float n24 = (float)p4[n23];
                                    final int n25 = o6[n23];
                                    if (n25 != 1) {
                                        if (n25 != 2) {
                                            if (n25 != 3) {
                                                if (n25 == 4) {
                                                    k3 = n24;
                                                }
                                            }
                                            else {
                                                j3 = n24;
                                            }
                                        }
                                        else {
                                            i2 = n24;
                                        }
                                    }
                                    else {
                                        h2 = n24;
                                    }
                                }
                                if (f6.P0 != null) {
                                    final double n26 = 0.0f;
                                    final double n27 = h2;
                                    final double n28 = i2;
                                    h2 = (float)(Math.sin(n28) * n27 + n26 - j3 / 2.0f);
                                    i2 = (float)(n26 - Math.cos(n28) * n27 - k3 / 2.0f);
                                }
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                final float n29 = h2 + 0.0f;
                                final float n30 = i2 + 0.0f;
                                final float n31 = j3 + h2 + 0.0f;
                                final float n32 = k3 + i2 + 0.0f;
                                j2[0] = n29;
                                j2[1] = n30;
                                j2[2] = n31;
                                j2[3] = n30;
                                j2[4] = n31;
                                j2[5] = n32;
                                j2[6] = n29;
                                j2[7] = n32;
                                final Path d3 = q2.d;
                                final float[] j4 = q2.j;
                                d3.moveTo(j4[0], j4[1]);
                                final Path d4 = q2.d;
                                final float[] j5 = q2.j;
                                d4.lineTo(j5[2], j5[3]);
                                final Path d5 = q2.d;
                                final float[] j6 = q2.j;
                                d5.lineTo(j6[4], j6[5]);
                                final Path d6 = q2.d;
                                final float[] j7 = q2.j;
                                d6.lineTo(j7[6], j7[7]);
                                q2.d.close();
                            }
                            q2.e.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(q2.d, q2.e);
                            canvas.translate(-2.0f, -2.0f);
                            q2.e.setColor(-65536);
                            canvas.drawPath(q2.d, q2.e);
                        }
                        canvas2 = canvas;
                    }
                    canvas.restore();
                }
            }
        }
    }
    
    public int[] getConstraintSetIds() {
        final irh v0 = this.V0;
        if (v0 == null) {
            return null;
        }
        final int size = v0.g.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = v0.g.keyAt(i);
        }
        return array;
    }
    
    public int getCurrentState() {
        return this.a1;
    }
    
    public ArrayList<irh.b> getDefinedTransitions() {
        final irh v0 = this.V0;
        if (v0 == null) {
            return null;
        }
        return v0.d;
    }
    
    public dr8 getDesignTool() {
        if (this.u1 == null) {
            this.u1 = new dr8();
        }
        return this.u1;
    }
    
    public int getEndState() {
        return this.b1;
    }
    
    public long getNanoTime() {
        return System.nanoTime();
    }
    
    public float getProgress() {
        return this.j1;
    }
    
    public irh getScene() {
        return this.V0;
    }
    
    public int getStartState() {
        return this.Z0;
    }
    
    public float getTargetPosition() {
        return this.l1;
    }
    
    public Bundle getTransitionState() {
        if (this.V1 == null) {
            this.V1 = new h();
        }
        final h v1 = this.V1;
        final erh e = v1.e;
        v1.d = e.b1;
        v1.c = e.Z0;
        v1.b = e.getVelocity();
        v1.a = v1.e.getProgress();
        final h v2 = this.V1;
        Objects.requireNonNull(v2);
        final Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", v2.a);
        bundle.putFloat("motion.velocity", v2.b);
        ((BaseBundle)bundle).putInt("motion.StartState", v2.c);
        ((BaseBundle)bundle).putInt("motion.EndState", v2.d);
        return bundle;
    }
    
    public long getTransitionTimeMs() {
        final irh v0 = this.V0;
        if (v0 != null) {
            this.h1 = v0.c() / 1000.0f;
        }
        return (long)(this.h1 * 1000.0f);
    }
    
    public float getVelocity() {
        return this.Y0;
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        this.A1 = this.getNanoTime();
        this.B1 = 0.0f;
        this.y1 = 0.0f;
        this.z1 = 0.0f;
    }
    
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }
    
    public final void j(final View view, int n) {
        final irh v0 = this.V0;
        if (v0 != null) {
            final float b1 = this.B1;
            final float n2 = 0.0f;
            if (b1 != 0.0f) {
                final float n3 = this.y1 / b1;
                final float n4 = this.z1 / b1;
                final irh.b c = v0.c;
                if (c != null) {
                    final kut l = c.l;
                    if (l != null) {
                        boolean b2 = false;
                        l.m = false;
                        final float progress = l.r.getProgress();
                        l.r.F(l.d, progress, l.h, l.g, l.n);
                        final float k = l.k;
                        final float[] n5 = l.n;
                        final float n6 = n5[0];
                        final float i = l.l;
                        final float n7 = n5[1];
                        float n8;
                        if (k != 0.0f) {
                            n8 = n3 * k / n5[0];
                        }
                        else {
                            n8 = n4 * i / n5[1];
                        }
                        float n9 = progress;
                        if (!Float.isNaN(n8)) {
                            n9 = progress + n8 / 3.0f;
                        }
                        if (n9 != 0.0f) {
                            if (n9 != 1.0f) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            final int c2 = l.c;
                            if (c2 != 3) {
                                b2 = true;
                            }
                            if (((b2 ? 1 : 0) & n) != 0x0) {
                                final erh r = l.r;
                                float n10;
                                if (n9 < 0.5) {
                                    n10 = n2;
                                }
                                else {
                                    n10 = 1.0f;
                                }
                                r.O(c2, n10, n8);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void k(final View view, final int n, final int n2, final int[] array, int e) {
        final irh v0 = this.V0;
        if (v0 == null) {
            return;
        }
        final irh.b c = v0.c;
        if (c != null) {
            e = ((c.o ^ true) ? 1 : 0);
            if (e != 0) {
                final int n3 = -1;
                if (e != 0) {
                    final kut l = c.l;
                    if (l != null) {
                        e = l.e;
                        if (e != -1 && view.getId() != e) {
                            return;
                        }
                    }
                }
                final irh.b c2 = v0.c;
                boolean u = false;
                Label_0121: {
                    if (c2 != null) {
                        final kut i = c2.l;
                        if (i != null) {
                            u = i.u;
                            break Label_0121;
                        }
                    }
                    u = false;
                }
                if (u) {
                    final kut j = c.l;
                    e = n3;
                    if (j != null) {
                        e = n3;
                        if ((j.w & 0x4) != 0x0) {
                            e = n2;
                        }
                    }
                    final float i2 = this.i1;
                    if ((i2 == 1.0f || i2 == 0.0f) && view.canScrollVertically(e)) {
                        return;
                    }
                }
                final kut k = c.l;
                if (k != null && (k.w & 0x1) != 0x0) {
                    final float n4 = (float)n;
                    final float n5 = (float)n2;
                    final irh.b c3 = v0.c;
                    float n7 = 0.0f;
                    Label_0379: {
                        if (c3 != null) {
                            final kut m = c3.l;
                            if (m != null) {
                                m.r.F(m.d, m.r.getProgress(), m.h, m.g, m.n);
                                final float k2 = m.k;
                                if (k2 != 0.0f) {
                                    final float[] n6 = m.n;
                                    if (n6[0] == 0.0f) {
                                        n6[0] = 1.0E-7f;
                                    }
                                    n7 = n4 * k2 / n6[0];
                                    break Label_0379;
                                }
                                final float[] n8 = m.n;
                                if (n8[1] == 0.0f) {
                                    n8[1] = 1.0E-7f;
                                }
                                n7 = n5 * m.l / n8[1];
                                break Label_0379;
                            }
                        }
                        n7 = 0.0f;
                    }
                    final float j2 = this.j1;
                    if ((j2 <= 0.0f && n7 < 0.0f) || (j2 >= 1.0f && n7 > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post((Runnable)new Runnable(view) {
                            public final View D0;
                            
                            @Override
                            public final void run() {
                                this.D0.setNestedScrollingEnabled(true);
                            }
                        });
                        return;
                    }
                }
                final float i3 = this.i1;
                final long nanoTime = this.getNanoTime();
                final float y1 = (float)n;
                this.y1 = y1;
                final float z1 = (float)n2;
                this.z1 = z1;
                this.B1 = (float)((nanoTime - this.A1) * 1.0E-9);
                this.A1 = nanoTime;
                final irh.b c4 = v0.c;
                if (c4 != null) {
                    final kut l2 = c4.l;
                    if (l2 != null) {
                        final float progress = l2.r.getProgress();
                        if (!l2.m) {
                            l2.m = true;
                            l2.r.setProgress(progress);
                        }
                        l2.r.F(l2.d, progress, l2.h, l2.g, l2.n);
                        final float k3 = l2.k;
                        final float[] n9 = l2.n;
                        if (Math.abs(l2.l * n9[1] + k3 * n9[0]) < 0.01) {
                            final float[] n10 = l2.n;
                            n10[1] = (n10[0] = 0.01f);
                        }
                        final float k4 = l2.k;
                        float n11;
                        if (k4 != 0.0f) {
                            n11 = y1 * k4 / l2.n[0];
                        }
                        else {
                            n11 = z1 * l2.l / l2.n[1];
                        }
                        final float max = Math.max(Math.min(progress + n11, 1.0f), 0.0f);
                        if (max != l2.r.getProgress()) {
                            l2.r.setProgress(max);
                        }
                    }
                }
                if (i3 != this.i1) {
                    array[0] = n;
                    array[1] = n2;
                }
                this.C(false);
                if (array[0] != 0 || array[1] != 0) {
                    this.x1 = true;
                }
            }
        }
    }
    
    public final void m(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (this.x1 || n != 0 || n2 != 0) {
            array[0] += n3;
            array[1] += n4;
        }
        this.x1 = false;
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        final irh v0 = this.V0;
        if (v0 != null) {
            final irh.b c = v0.c;
            if (c != null) {
                final kut l = c.l;
                if (l != null) {
                    if ((l.w & 0x2) == 0x0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Display display = ((View)this).getDisplay();
        if (display != null) {
            display.getRotation();
        }
        final irh v0 = this.V0;
        if (v0 != null) {
            final int a1 = this.a1;
            if (a1 != -1) {
                final b b = v0.b(a1);
                this.V0.o(this);
                if (b != null) {
                    b.b(this);
                }
                this.Z0 = this.a1;
            }
        }
        this.J();
        final h v2 = this.V1;
        if (v2 != null) {
            if (this.Y1) {
                ((View)this).post((Runnable)new Runnable(this) {
                    public final erh D0;
                    
                    @Override
                    public final void run() {
                        this.D0.V1.a();
                    }
                });
            }
            else {
                v2.a();
            }
        }
        else {
            final irh v3 = this.V0;
            if (v3 != null) {
                final irh.b c = v3.c;
                if (c != null && c.n == 4) {
                    this.P();
                    this.setState(j.E0);
                    this.setState(j.F0);
                }
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final irh v0 = this.V0;
        if (v0 != null) {
            if (this.e1) {
                final ccx q = v0.q;
                if (q != null) {
                    final int currentState = q.a.getCurrentState();
                    if (currentState != -1) {
                        if (q.c == null) {
                            q.c = new HashSet<View>();
                            for (final bcx bcx : q.b) {
                                for (int childCount = q.a.getChildCount(), i = 0; i < childCount; ++i) {
                                    final View child = q.a.getChildAt(i);
                                    if (bcx.c(child)) {
                                        child.getId();
                                        q.c.add(child);
                                    }
                                }
                            }
                        }
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        final Rect rect = new Rect();
                        final int action = motionEvent.getAction();
                        final ArrayList<bcx$a> e = q.e;
                        int n = 2;
                        if (e != null && !e.isEmpty()) {
                            for (final bcx$a bcx$a : q.e) {
                                Objects.requireNonNull(bcx$a);
                                if (action != 1) {
                                    if (action != 2) {
                                        continue;
                                    }
                                    bcx$a.c.b.getHitRect(bcx$a.l);
                                    if (bcx$a.l.contains((int)x, (int)y) || bcx$a.h) {
                                        continue;
                                    }
                                    bcx$a.b();
                                }
                                else {
                                    if (bcx$a.h) {
                                        continue;
                                    }
                                    bcx$a.b();
                                }
                            }
                        }
                        if (action == 0 || action == 1) {
                            final b g = q.a.G(currentState);
                            for (final bcx bcx2 : q.b) {
                                final int b = bcx2.b;
                                if ((b != 1) ? ((b != n) ? (b == 3 && action == 0) : (action == 1)) : (action == 0)) {
                                    final Iterator<View> iterator4 = q.c.iterator();
                                    int n2 = n;
                                    while (true) {
                                        n = n2;
                                        if (!iterator4.hasNext()) {
                                            break;
                                        }
                                        final View view = iterator4.next();
                                        if (!bcx2.c(view)) {
                                            continue;
                                        }
                                        view.getHitRect(rect);
                                        if (rect.contains((int)x, (int)y)) {
                                            bcx2.a(q, q.a, currentState, g, new View[] { view });
                                        }
                                        n2 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                final irh.b c = this.V0.c;
                if (c != null && (c.o ^ true)) {
                    final kut l = c.l;
                    if (l != null) {
                        if (motionEvent.getAction() == 0) {
                            final RectF b2 = l.b(this, new RectF());
                            if (b2 != null && !b2.contains(motionEvent.getX(), motionEvent.getY())) {
                                return false;
                            }
                        }
                        final int e2 = l.e;
                        if (e2 != -1) {
                            final View d2 = this.d2;
                            if (d2 == null || d2.getId() != e2) {
                                this.d2 = ((View)this).findViewById(e2);
                            }
                            final View d3 = this.d2;
                            if (d3 != null) {
                                this.c2.set((float)d3.getLeft(), (float)this.d2.getTop(), (float)this.d2.getRight(), (float)this.d2.getBottom());
                                if (this.c2.contains(motionEvent.getX(), motionEvent.getY()) && !this.H((float)this.d2.getLeft(), (float)this.d2.getTop(), this.d2, motionEvent)) {
                                    return this.onTouchEvent(motionEvent);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final void onLayout(final boolean b, int v1, int w1, final int n, final int n2) {
        this.U1 = true;
        try {
            if (this.V0 == null) {
                super.onLayout(b, v1, w1, n, n2);
                return;
            }
            v1 = n - v1;
            w1 = n2 - w1;
            if (this.v1 != v1 || this.w1 != w1) {
                this.L();
                this.C(true);
            }
            this.v1 = v1;
            this.w1 = w1;
        }
        finally {
            this.U1 = false;
        }
    }
    
    @Override
    public final void onMeasure(int i, int d1) {
        if (this.V0 == null) {
            super.onMeasure(i, d1);
            return;
        }
        final int c1 = this.c1;
        final int n = 0;
        final int n2 = 1;
        boolean b = c1 != i || this.d1 != d1;
        if (this.b2) {
            this.b2 = false;
            this.J();
            this.K();
            b = true;
        }
        if (super.K0) {
            b = true;
        }
        this.c1 = i;
        this.d1 = d1;
        final int j = this.V0.i();
        final int d2 = this.V0.d();
        Label_0245: {
            Label_0232: {
                if (!b) {
                    final f a2 = this.a2;
                    if (j == a2.e && d2 == a2.f) {
                        break Label_0232;
                    }
                }
                if (this.Z0 != -1) {
                    super.onMeasure(i, d1);
                    this.a2.e(this.V0.b(j), this.V0.b(d2));
                    this.a2.f();
                    final f a3 = this.a2;
                    a3.e = j;
                    a3.f = d2;
                    i = 0;
                    break Label_0245;
                }
            }
            if (b) {
                super.onMeasure(i, d1);
            }
            i = 1;
        }
        if (this.L1 || i != 0) {
            final int paddingTop = ((View)this).getPaddingTop();
            d1 = ((View)this).getPaddingBottom();
            i = ((View)this).getPaddingLeft();
            i = ((ni6)super.F0).x() + (((View)this).getPaddingRight() + i);
            d1 = ((ni6)super.F0).q() + (d1 + paddingTop);
            final int q1 = this.Q1;
            if (q1 == Integer.MIN_VALUE || q1 == 0) {
                i = this.M1;
                i += (int)(this.S1 * (this.O1 - i));
                this.requestLayout();
            }
            final int r1 = this.R1;
            if (r1 == Integer.MIN_VALUE || r1 == 0) {
                d1 = this.N1;
                d1 += (int)(this.S1 * (this.P1 - d1));
                this.requestLayout();
            }
            ((View)this).setMeasuredDimension(i, d1);
        }
        final float signum = Math.signum(this.l1 - this.j1);
        final long nanoTime = this.getNanoTime();
        final drh w0 = this.W0;
        float n3;
        if (!(w0 instanceof lir)) {
            n3 = (nanoTime - this.k1) * signum * 1.0E-9f / this.h1;
        }
        else {
            n3 = 0.0f;
        }
        float n4 = this.j1 + n3;
        if (this.m1) {
            n4 = this.l1;
        }
        d1 = fcmpl(signum, 0.0f);
        if ((d1 > 0 && n4 >= this.l1) || (signum <= 0.0f && n4 <= this.l1)) {
            n4 = this.l1;
            i = n2;
        }
        else {
            i = 0;
        }
        float n5 = n4;
        if (w0 != null) {
            n5 = n4;
            if (i == 0) {
                if (this.r1) {
                    n5 = ((TimeInterpolator)w0).getInterpolation((nanoTime - this.g1) * 1.0E-9f);
                }
                else {
                    n5 = ((TimeInterpolator)w0).getInterpolation(n4);
                }
            }
        }
        float s1 = 0.0f;
        Label_0631: {
            if (d1 <= 0 || n5 < this.l1) {
                s1 = n5;
                if (signum > 0.0f) {
                    break Label_0631;
                }
                s1 = n5;
                if (n5 > this.l1) {
                    break Label_0631;
                }
            }
            s1 = this.l1;
        }
        this.S1 = s1;
        d1 = this.getChildCount();
        final long nanoTime2 = this.getNanoTime();
        final Interpolator x0 = this.X0;
        if (x0 == null) {
            i = n;
        }
        else {
            s1 = ((TimeInterpolator)x0).getInterpolation(s1);
            i = n;
        }
        while (i < d1) {
            final View child = this.getChildAt(i);
            final xqh xqh = this.f1.get(child);
            if (xqh != null) {
                xqh.c(child, s1, nanoTime2, this.T1);
            }
            ++i;
        }
        if (this.L1) {
            this.requestLayout();
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public final void onRtlPropertiesChanged(final int n) {
        final irh v0 = this.V0;
        if (v0 != null) {
            final boolean s = this.s();
            v0.p = s;
            final irh.b c = v0.c;
            if (c != null) {
                final kut l = c.l;
                if (l != null) {
                    l.c(s);
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent l) {
        final irh v0 = this.V0;
        if (v0 == null || !this.e1 || !v0.q()) {
            return super.onTouchEvent(l);
        }
        final irh v2 = this.V0;
        final irh.b c = v2.c;
        if (c != null && !(c.o ^ true)) {
            return super.onTouchEvent(l);
        }
        final int currentState = this.getCurrentState();
        final RectF rectF = new RectF();
        if (v2.o == null) {
            Objects.requireNonNull(v2.a);
            final g b = g.b;
            b.a = VelocityTracker.obtain();
            v2.o = b;
        }
        v2.o.a(l);
        if (currentState != -1) {
            final int action = l.getAction();
            if (action != 0) {
                if (action == 2) {
                    if (!v2.m) {
                        final float n = l.getRawY() - v2.s;
                        final float n2 = l.getRawX() - v2.r;
                        if (n2 == 0.0 && n == 0.0) {
                            return !this.V0.c.a(4) || this.V0.c.l.m;
                        }
                        final MotionEvent i = v2.l;
                        if (i == null) {
                            return !this.V0.c.a(4) || this.V0.c.l.m;
                        }
                        Object c2;
                        if (currentState != -1) {
                            final l9r b2 = v2.b;
                            int a = 0;
                            Label_0253: {
                                if (b2 != null) {
                                    a = b2.a(currentState);
                                    if (a != -1) {
                                        break Label_0253;
                                    }
                                }
                                a = currentState;
                            }
                            final ArrayList<irh.b> list = new ArrayList<irh.b>();
                            for (final irh.b b3 : v2.d) {
                                if (b3.d == a || b3.c == a) {
                                    list.add(b3);
                                }
                            }
                            final RectF rectF2 = new RectF();
                            final Iterator<irh.b> iterator2 = list.iterator();
                            float n3 = 0.0f;
                            c2 = null;
                            while (iterator2.hasNext()) {
                                final irh.b b4 = iterator2.next();
                                if (b4.o) {
                                    continue;
                                }
                                final kut j = b4.l;
                                if (j == null) {
                                    continue;
                                }
                                j.c(v2.p);
                                final RectF b5 = b4.l.b(v2.a, rectF2);
                                if (b5 != null && !b5.contains(i.getX(), i.getY())) {
                                    continue;
                                }
                                final RectF a2 = b4.l.a(v2.a, rectF2);
                                if (a2 != null && !a2.contains(i.getX(), i.getY())) {
                                    continue;
                                }
                                final kut k = b4.l;
                                float n4 = k.l * n + k.k * n2;
                                if (k.j) {
                                    final float x = i.getX();
                                    Objects.requireNonNull(b4.l);
                                    final float n5 = x - 0.5f;
                                    final float y = i.getY();
                                    Objects.requireNonNull(b4.l);
                                    final float n6 = y - 0.5f;
                                    n4 = (float)(Math.atan2(n + n6, n2 + n5) - Math.atan2(n5, n6)) * 10.0f;
                                }
                                float n7;
                                if (b4.c == currentState) {
                                    n7 = -1.0f;
                                }
                                else {
                                    n7 = 1.1f;
                                }
                                final float n8 = n7 * n4;
                                if (n8 <= n3) {
                                    continue;
                                }
                                n3 = n8;
                                c2 = b4;
                            }
                        }
                        else {
                            c2 = v2.c;
                        }
                        if (c2 != null) {
                            this.setTransition((irh.b)c2);
                            final RectF b6 = v2.c.l.b(v2.a, rectF);
                            v2.n = (b6 != null && !b6.contains(v2.l.getX(), v2.l.getY()));
                            final kut m = v2.c.l;
                            final float r = v2.r;
                            final float s = v2.s;
                            m.p = r;
                            m.q = s;
                            m.m = false;
                        }
                    }
                }
            }
            else {
                v2.r = l.getRawX();
                v2.s = l.getRawY();
                v2.l = l;
                v2.m = false;
                final kut l2 = v2.c.l;
                if (l2 == null) {
                    return !this.V0.c.a(4) || this.V0.c.l.m;
                }
                final RectF a3 = l2.a(v2.a, rectF);
                if (a3 != null && !a3.contains(v2.l.getX(), v2.l.getY())) {
                    v2.l = null;
                    v2.m = true;
                    return !this.V0.c.a(4) || this.V0.c.l.m;
                }
                final RectF b7 = v2.c.l.b(v2.a, rectF);
                if (b7 != null && !b7.contains(v2.l.getX(), v2.l.getY())) {
                    v2.n = true;
                }
                else {
                    v2.n = false;
                }
                final kut l3 = v2.c.l;
                final float r2 = v2.r;
                final float s2 = v2.s;
                l3.p = r2;
                l3.q = s2;
                return !this.V0.c.a(4) || this.V0.c.l.m;
            }
        }
        if (!v2.m) {
            final irh.b c3 = v2.c;
            Label_3599: {
                if (c3 != null) {
                    final kut l4 = c3.l;
                    if (l4 != null && !v2.n) {
                        final g o = v2.o;
                        final j g0 = j.G0;
                        if (l4.j) {
                            o.a(l);
                            final int action2 = l.getAction();
                            if (action2 != 0) {
                                if (action2 != 1) {
                                    if (action2 == 2) {
                                        l.getRawY();
                                        l.getRawX();
                                        final float n9 = ((View)l4.r).getWidth() / 2.0f;
                                        final float n10 = ((View)l4.r).getHeight() / 2.0f;
                                        final int i2 = l4.i;
                                        float n13;
                                        float n14;
                                        if (i2 != -1) {
                                            final View viewById = ((View)l4.r).findViewById(i2);
                                            ((View)l4.r).getLocationOnScreen(l4.o);
                                            final float n11 = (float)l4.o[0];
                                            final float n12 = (viewById.getRight() + viewById.getLeft()) / 2.0f;
                                            n13 = (viewById.getBottom() + viewById.getTop()) / 2.0f + l4.o[1];
                                            n14 = n11 + n12;
                                        }
                                        else {
                                            final int d = l4.d;
                                            n14 = n9;
                                            n13 = n10;
                                            if (d != -1) {
                                                final erh r3 = l4.r;
                                                final View viewById2 = ((View)l4.r).findViewById(r3.f1.get(((View)r3).findViewById(d)).f.N0);
                                                if (viewById2 == null) {
                                                    Log.e("TouchResponse", "could not find view to animate to");
                                                    n14 = n9;
                                                    n13 = n10;
                                                }
                                                else {
                                                    ((View)l4.r).getLocationOnScreen(l4.o);
                                                    n14 = l4.o[0] + (viewById2.getRight() + viewById2.getLeft()) / 2.0f;
                                                    n13 = l4.o[1] + (viewById2.getBottom() + viewById2.getTop()) / 2.0f;
                                                }
                                            }
                                        }
                                        final float rawX = l.getRawX();
                                        final float rawY = l.getRawY();
                                        final double atan2 = Math.atan2(l.getRawY() - n13, l.getRawX() - n14);
                                        final float n15 = (float)((atan2 - Math.atan2(l4.q - n13, l4.p - n14)) * 180.0 / 3.141592653589793);
                                        float n16;
                                        if (n15 > 330.0f) {
                                            n16 = n15 - 360.0f;
                                        }
                                        else {
                                            n16 = n15;
                                            if (n15 < -330.0f) {
                                                n16 = n15 + 360.0f;
                                            }
                                        }
                                        if (Math.abs(n16) > 0.01 || l4.m) {
                                            final float progress = l4.r.getProgress();
                                            if (!l4.m) {
                                                l4.m = true;
                                                l4.r.setProgress(progress);
                                            }
                                            final int d2 = l4.d;
                                            if (d2 != -1) {
                                                l4.r.F(d2, progress, l4.h, l4.g, l4.n);
                                                final float[] n17 = l4.n;
                                                n17[1] = (float)Math.toDegrees(n17[1]);
                                            }
                                            else {
                                                l4.n[1] = 360.0f;
                                            }
                                            final float max = Math.max(Math.min(n16 * l4.v / l4.n[1] + progress, 1.0f), 0.0f);
                                            final float progress2 = l4.r.getProgress();
                                            if (max != progress2) {
                                                final float n18 = fcmpl(progress2, 0.0f);
                                                if (n18 == 0 || progress2 == 1.0f) {
                                                    l4.r.B(n18 == 0);
                                                }
                                                l4.r.setProgress(max);
                                                o.b(1000);
                                                final float c4 = o.c();
                                                final double n19 = o.d();
                                                final double n20 = c4;
                                                l4.r.Y0 = (float)Math.toDegrees((float)(Math.sin(Math.atan2(n19, n20) - atan2) * Math.hypot(n19, n20) / Math.hypot(rawX - n14, rawY - n13)));
                                            }
                                            else {
                                                l4.r.Y0 = 0.0f;
                                            }
                                            l4.p = l.getRawX();
                                            l4.q = l.getRawY();
                                        }
                                    }
                                }
                                else {
                                    l4.m = false;
                                    o.b(16);
                                    final float c5 = o.c();
                                    final float d3 = o.d();
                                    final float progress3 = l4.r.getProgress();
                                    float n21 = ((View)l4.r).getWidth() / 2.0f;
                                    float n22 = ((View)l4.r).getHeight() / 2.0f;
                                    final int i3 = l4.i;
                                    Label_2171: {
                                        float n23;
                                        float n24;
                                        int n25;
                                        int n26;
                                        if (i3 != -1) {
                                            final View viewById3 = ((View)l4.r).findViewById(i3);
                                            ((View)l4.r).getLocationOnScreen(l4.o);
                                            n23 = (viewById3.getRight() + viewById3.getLeft()) / 2.0f + l4.o[0];
                                            n24 = (float)l4.o[1];
                                            n25 = viewById3.getTop();
                                            n26 = viewById3.getBottom();
                                        }
                                        else {
                                            final int d4 = l4.d;
                                            if (d4 == -1) {
                                                break Label_2171;
                                            }
                                            final erh r4 = l4.r;
                                            final View viewById4 = ((View)l4.r).findViewById(r4.f1.get(((View)r4).findViewById(d4)).f.N0);
                                            ((View)l4.r).getLocationOnScreen(l4.o);
                                            n23 = (viewById4.getRight() + viewById4.getLeft()) / 2.0f + l4.o[0];
                                            n24 = (float)l4.o[1];
                                            n25 = viewById4.getTop();
                                            n26 = viewById4.getBottom();
                                        }
                                        final float n27 = n24 + (n26 + n25) / 2.0f;
                                        n21 = n23;
                                        n22 = n27;
                                    }
                                    final float n28 = l.getRawX() - n21;
                                    final float n29 = l.getRawY() - n22;
                                    final double degrees = Math.toDegrees(Math.atan2(n29, n28));
                                    final int d5 = l4.d;
                                    if (d5 != -1) {
                                        l4.r.F(d5, progress3, l4.h, l4.g, l4.n);
                                        final float[] n30 = l4.n;
                                        n30[1] = (float)Math.toDegrees(n30[1]);
                                    }
                                    else {
                                        l4.n[1] = 360.0f;
                                    }
                                    final float n31 = (float)(Math.toDegrees(Math.atan2(d3 + n29, c5 + n28)) - degrees) * 62.5f;
                                    float n32;
                                    if (!Float.isNaN(n31)) {
                                        n32 = n31 * 3.0f * l4.v / l4.n[1] + progress3;
                                    }
                                    else {
                                        n32 = progress3;
                                    }
                                    if (n32 != 0.0f && n32 != 1.0f) {
                                        final int c6 = l4.c;
                                        if (c6 != 3) {
                                            final float n33 = n31 * l4.v / l4.n[1];
                                            float n34;
                                            if (n32 < 0.5) {
                                                n34 = 0.0f;
                                            }
                                            else {
                                                n34 = 1.0f;
                                            }
                                            float abs = n33;
                                            if (c6 == 6) {
                                                abs = n33;
                                                if (progress3 + n33 < 0.0f) {
                                                    abs = Math.abs(n33);
                                                }
                                                n34 = 1.0f;
                                            }
                                            float n35 = abs;
                                            float n36 = n34;
                                            if (l4.c == 7) {
                                                float n37 = abs;
                                                if (progress3 + abs > 1.0f) {
                                                    n37 = -Math.abs(abs);
                                                }
                                                n36 = 0.0f;
                                                n35 = n37;
                                            }
                                            l4.r.O(l4.c, n36, n35 * 3.0f);
                                            if (0.0f >= progress3 || 1.0f <= progress3) {
                                                l4.r.setState(g0);
                                            }
                                            break Label_3599;
                                        }
                                    }
                                    if (0.0f >= n32 || 1.0f <= n32) {
                                        l4.r.setState(g0);
                                    }
                                }
                            }
                            else {
                                l4.p = l.getRawX();
                                l4.q = l.getRawY();
                                l4.m = false;
                            }
                        }
                        else {
                            o.a(l);
                            final int action3 = l.getAction();
                            if (action3 != 0) {
                                if (action3 != 1) {
                                    if (action3 == 2) {
                                        final float n38 = l.getRawY() - l4.q;
                                        final float n39 = l.getRawX() - l4.p;
                                        if (Math.abs(l4.l * n38 + l4.k * n39) > l4.x || l4.m) {
                                            final float progress4 = l4.r.getProgress();
                                            if (!l4.m) {
                                                l4.m = true;
                                                l4.r.setProgress(progress4);
                                            }
                                            final int d6 = l4.d;
                                            if (d6 != -1) {
                                                l4.r.F(d6, progress4, l4.h, l4.g, l4.n);
                                            }
                                            else {
                                                final float n40 = (float)Math.min(((View)l4.r).getWidth(), ((View)l4.r).getHeight());
                                                final float[] n41 = l4.n;
                                                n41[1] = l4.l * n40;
                                                n41[0] = n40 * l4.k;
                                            }
                                            final float k2 = l4.k;
                                            final float[] n42 = l4.n;
                                            if (Math.abs((l4.l * n42[1] + k2 * n42[0]) * l4.v) < 0.01) {
                                                final float[] n43 = l4.n;
                                                n43[1] = (n43[0] = 0.01f);
                                            }
                                            float n44;
                                            if (l4.k != 0.0f) {
                                                n44 = n39 / l4.n[0];
                                            }
                                            else {
                                                n44 = n38 / l4.n[1];
                                            }
                                            float n46;
                                            final float n45 = n46 = Math.max(Math.min(progress4 + n44, 1.0f), 0.0f);
                                            if (l4.c == 6) {
                                                n46 = Math.max(n45, 0.01f);
                                            }
                                            float min = n46;
                                            if (l4.c == 7) {
                                                min = Math.min(n46, 0.99f);
                                            }
                                            final float progress5 = l4.r.getProgress();
                                            if (min != progress5) {
                                                final float n47 = fcmpl(progress5, 0.0f);
                                                if (n47 == 0 || progress5 == 1.0f) {
                                                    l4.r.B(n47 == 0);
                                                }
                                                l4.r.setProgress(min);
                                                o.b(1000);
                                                final float c7 = o.c();
                                                final float d7 = o.d();
                                                float y2;
                                                if (l4.k != 0.0f) {
                                                    y2 = c7 / l4.n[0];
                                                }
                                                else {
                                                    y2 = d7 / l4.n[1];
                                                }
                                                l4.r.Y0 = y2;
                                            }
                                            else {
                                                l4.r.Y0 = 0.0f;
                                            }
                                            l4.p = l.getRawX();
                                            l4.q = l.getRawY();
                                        }
                                    }
                                }
                                else {
                                    l4.m = false;
                                    o.b(1000);
                                    final float c8 = o.c();
                                    final float d8 = o.d();
                                    final float progress6 = l4.r.getProgress();
                                    final int d9 = l4.d;
                                    if (d9 != -1) {
                                        l4.r.F(d9, progress6, l4.h, l4.g, l4.n);
                                    }
                                    else {
                                        final float n48 = (float)Math.min(((View)l4.r).getWidth(), ((View)l4.r).getHeight());
                                        final float[] n49 = l4.n;
                                        n49[1] = l4.l * n48;
                                        n49[0] = n48 * l4.k;
                                    }
                                    final float k3 = l4.k;
                                    final float[] n50 = l4.n;
                                    final float n51 = n50[0];
                                    final float n52 = n50[1];
                                    float n53;
                                    if (k3 != 0.0f) {
                                        n53 = c8 / n50[0];
                                    }
                                    else {
                                        n53 = d8 / n50[1];
                                    }
                                    float n54;
                                    if (!Float.isNaN(n53)) {
                                        n54 = n53 / 3.0f + progress6;
                                    }
                                    else {
                                        n54 = progress6;
                                    }
                                    if (n54 != 0.0f && n54 != 1.0f) {
                                        final int c9 = l4.c;
                                        if (c9 != 3) {
                                            float n55;
                                            if (n54 < 0.5) {
                                                n55 = 0.0f;
                                            }
                                            else {
                                                n55 = 1.0f;
                                            }
                                            float abs2 = n53;
                                            if (c9 == 6) {
                                                abs2 = n53;
                                                if (progress6 + n53 < 0.0f) {
                                                    abs2 = Math.abs(n53);
                                                }
                                                n55 = 1.0f;
                                            }
                                            float n56 = abs2;
                                            if (l4.c == 7) {
                                                n56 = abs2;
                                                if (progress6 + abs2 > 1.0f) {
                                                    n56 = -Math.abs(abs2);
                                                }
                                                n55 = 0.0f;
                                            }
                                            l4.r.O(l4.c, n55, n56);
                                            if (0.0f >= progress6 || 1.0f <= progress6) {
                                                l4.r.setState(g0);
                                            }
                                            break Label_3599;
                                        }
                                    }
                                    if (0.0f >= n54 || 1.0f <= n54) {
                                        l4.r.setState(g0);
                                    }
                                }
                            }
                            else {
                                l4.p = l.getRawX();
                                l4.q = l.getRawY();
                                l4.m = false;
                            }
                        }
                    }
                }
            }
            v2.r = l.getRawX();
            v2.s = l.getRawY();
            if (l.getAction() == 1) {
                final g o2 = v2.o;
                if (o2 != null) {
                    final VelocityTracker a4 = o2.a;
                    if (a4 != null) {
                        a4.recycle();
                        o2.a = null;
                    }
                    v2.o = null;
                    final int a5 = this.a1;
                    if (a5 != -1) {
                        v2.a(this, a5);
                    }
                }
            }
        }
        return !this.V0.c.a(4) || this.V0.c.l.m;
    }
    
    @Override
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        if (view instanceof crh) {
            final crh crh = (crh)view;
            if (this.F1 == null) {
                this.F1 = new CopyOnWriteArrayList<i>();
            }
            this.F1.add((i)crh);
            if (crh.L0) {
                if (this.D1 == null) {
                    this.D1 = new ArrayList<crh>();
                }
                this.D1.add(crh);
            }
            if (crh.M0) {
                if (this.E1 == null) {
                    this.E1 = new ArrayList<crh>();
                }
                this.E1.add(crh);
            }
        }
    }
    
    @Override
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        final ArrayList<crh> d1 = this.D1;
        if (d1 != null) {
            d1.remove(view);
        }
        final ArrayList<crh> e1 = this.E1;
        if (e1 != null) {
            e1.remove(view);
        }
    }
    
    @Override
    public final void requestLayout() {
        if (!this.L1 && this.a1 == -1) {
            final irh v0 = this.V0;
            if (v0 != null) {
                final irh.b c = v0.c;
                if (c != null) {
                    final int q = c.q;
                    if (q == 0) {
                        return;
                    }
                    if (q == 2) {
                        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                            this.f1.get(this.getChildAt(i)).d = true;
                        }
                        return;
                    }
                }
            }
        }
        super.requestLayout();
    }
    
    public void setDebugMode(final int p) {
        this.p1 = p;
        ((View)this).invalidate();
    }
    
    public void setDelayedApplicationOfInitialState(final boolean y1) {
        this.Y1 = y1;
    }
    
    public void setInteractionEnabled(final boolean e1) {
        this.e1 = e1;
    }
    
    public void setInterpolatedProgress(final float progress) {
        if (this.V0 != null) {
            this.setState(j.F0);
            final Interpolator f = this.V0.f();
            if (f != null) {
                this.setProgress(((TimeInterpolator)f).getInterpolation(progress));
                return;
            }
        }
        this.setProgress(progress);
    }
    
    public void setOnHide(final float progress) {
        final ArrayList<crh> e1 = this.E1;
        if (e1 != null) {
            for (int size = e1.size(), i = 0; i < size; ++i) {
                this.E1.get(i).setProgress(progress);
            }
        }
    }
    
    public void setOnShow(final float progress) {
        final ArrayList<crh> d1 = this.D1;
        if (d1 != null) {
            for (int size = d1.size(), i = 0; i < size; ++i) {
                this.D1.get(i).setProgress(progress);
            }
        }
    }
    
    public void setProgress(final float i1) {
        final j g0 = j.G0;
        final j f0 = j.F0;
        final float n = fcmpg(i1, 0.0f);
        if (n < 0 || i1 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!this.isAttachedToWindow()) {
            if (this.V1 == null) {
                this.V1 = new h();
            }
            this.V1.a = i1;
            return;
        }
        if (n <= 0) {
            if (this.j1 == 1.0f && this.a1 == this.b1) {
                this.setState(f0);
            }
            this.a1 = this.Z0;
            if (this.j1 == 0.0f) {
                this.setState(g0);
            }
        }
        else if (i1 >= 1.0f) {
            if (this.j1 == 0.0f && this.a1 == this.Z0) {
                this.setState(f0);
            }
            this.a1 = this.b1;
            if (this.j1 == 1.0f) {
                this.setState(g0);
            }
        }
        else {
            this.a1 = -1;
            this.setState(f0);
        }
        if (this.V0 == null) {
            return;
        }
        this.m1 = true;
        this.l1 = i1;
        this.i1 = i1;
        this.k1 = -1L;
        this.g1 = -1L;
        this.W0 = null;
        this.n1 = true;
        ((View)this).invalidate();
    }
    
    public void setScene(final irh v0) {
        this.V0 = v0;
        final boolean s = this.s();
        v0.p = s;
        final irh.b c = v0.c;
        if (c != null) {
            final kut l = c.l;
            if (l != null) {
                l.c(s);
            }
        }
        this.L();
    }
    
    public void setStartState(final int a1) {
        if (!this.isAttachedToWindow()) {
            if (this.V1 == null) {
                this.V1 = new h();
            }
            final h v1 = this.V1;
            v1.c = a1;
            v1.d = a1;
            return;
        }
        this.a1 = a1;
    }
    
    public void setState(final j z1) {
        final j g0 = j.G0;
        if (z1 == g0 && this.a1 == -1) {
            return;
        }
        final j z2 = this.Z1;
        this.Z1 = z1;
        final j f0 = j.F0;
        if (z2 == f0 && z1 == f0) {
            this.D();
        }
        final int ordinal = z2.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                if (z1 == g0) {
                    this.E();
                }
            }
        }
        else {
            if (z1 == f0) {
                this.D();
            }
            if (z1 == g0) {
                this.E();
            }
        }
    }
    
    public void setTransition(int a1) {
        final irh v0 = this.V0;
        if (v0 != null) {
            while (true) {
                for (final irh.b c : v0.d) {
                    if (c.a == a1) {
                        this.Z0 = c.d;
                        this.b1 = c.c;
                        if (!this.isAttachedToWindow()) {
                            if (this.V1 == null) {
                                this.V1 = new h();
                            }
                            final h v2 = this.V1;
                            v2.c = this.Z0;
                            v2.d = this.b1;
                            return;
                        }
                        float progress = Float.NaN;
                        a1 = this.a1;
                        if (a1 == this.Z0) {
                            progress = 0.0f;
                        }
                        else if (a1 == this.b1) {
                            progress = 1.0f;
                        }
                        final irh v3 = this.V0;
                        v3.c = c;
                        final kut l = c.l;
                        if (l != null) {
                            l.c(v3.p);
                        }
                        this.a2.e(this.V0.b(this.Z0), this.V0.b(this.b1));
                        this.L();
                        if (this.j1 != progress) {
                            if (progress == 0.0f) {
                                this.B(true);
                                this.V0.b(this.Z0).b(this);
                            }
                            else if (progress == 1.0f) {
                                this.B(false);
                                this.V0.b(this.b1).b(this);
                            }
                        }
                        float j1;
                        if (Float.isNaN(progress)) {
                            j1 = 0.0f;
                        }
                        else {
                            j1 = progress;
                        }
                        this.j1 = j1;
                        if (Float.isNaN(progress)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(la8.b());
                            sb.append(" transitionToStart ");
                            Log.v("MotionLayout", sb.toString());
                            this.A(0.0f);
                            return;
                        }
                        this.setProgress(progress);
                        return;
                    }
                }
                irh.b c = null;
                continue;
            }
        }
    }
    
    public void setTransition(final irh.b c) {
        final irh v0 = this.V0;
        v0.c = c;
        if (c != null) {
            final kut l = c.l;
            if (l != null) {
                l.c(v0.p);
            }
        }
        this.setState(j.E0);
        if (this.a1 == this.V0.d()) {
            this.j1 = 1.0f;
            this.i1 = 1.0f;
            this.l1 = 1.0f;
        }
        else {
            this.j1 = 0.0f;
            this.i1 = 0.0f;
            this.l1 = 0.0f;
        }
        long nanoTime;
        if (c.a(1)) {
            nanoTime = -1L;
        }
        else {
            nanoTime = this.getNanoTime();
        }
        this.k1 = nanoTime;
        final int i = this.V0.i();
        final int d = this.V0.d();
        if (i == this.Z0 && d == this.b1) {
            return;
        }
        this.Z0 = i;
        this.b1 = d;
        this.V0.p(i, d);
        this.a2.e(this.V0.b(this.Z0), this.V0.b(this.b1));
        final f a2 = this.a2;
        final int z0 = this.Z0;
        final int b1 = this.b1;
        a2.e = z0;
        a2.f = b1;
        a2.f();
        this.L();
    }
    
    public void setTransitionDuration(final int j) {
        final irh v0 = this.V0;
        if (v0 == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        final irh.b c = v0.c;
        if (c != null) {
            c.h = Math.max(j, 8);
        }
        else {
            v0.j = j;
        }
    }
    
    public void setTransitionListener(final i o1) {
        this.o1 = o1;
    }
    
    public void setTransitionState(final Bundle bundle) {
        if (this.V1 == null) {
            this.V1 = new h();
        }
        final h v1 = this.V1;
        Objects.requireNonNull(v1);
        v1.a = bundle.getFloat("motion.progress");
        v1.b = bundle.getFloat("motion.velocity");
        v1.c = ((BaseBundle)bundle).getInt("motion.StartState");
        v1.d = ((BaseBundle)bundle).getInt("motion.EndState");
        if (this.isAttachedToWindow()) {
            this.V1.a();
        }
    }
    
    @Override
    public final void t(final int n) {
        super.N0 = null;
    }
    
    public final String toString() {
        final Context context = ((View)this).getContext();
        final StringBuilder sb = new StringBuilder();
        sb.append(la8.c(context, this.Z0));
        sb.append("->");
        sb.append(la8.c(context, this.b1));
        sb.append(" (pos:");
        sb.append(this.j1);
        sb.append(" Dpos/Dt:");
        sb.append(this.Y0);
        return sb.toString();
    }
    
    public final class d extends drh
    {
        public float a;
        public float b;
        public float c;
        public final erh d;
        
        public d(final erh d) {
            this.d = d;
            this.a = 0.0f;
            this.b = 0.0f;
        }
        
        @Override
        public final float a() {
            return this.d.Y0;
        }
        
        public final float getInterpolation(final float n) {
            final float a = this.a;
            if (a > 0.0f) {
                final float c = this.c;
                float n2 = n;
                if (a / c < n) {
                    n2 = a / c;
                }
                this.d.Y0 = a - c * n2;
                return a * n2 - c * n2 * n2 / 2.0f + this.b;
            }
            final float n3 = -a;
            final float c2 = this.c;
            float n4 = n;
            if (n3 / c2 < n) {
                n4 = -a / c2;
            }
            this.d.Y0 = c2 * n4 + a;
            return c2 * n4 * n4 / 2.0f + a * n4 + this.b;
        }
    }
    
    public final class e
    {
        public float[] a;
        public int[] b;
        public float[] c;
        public Path d;
        public Paint e;
        public Paint f;
        public Paint g;
        public Paint h;
        public Paint i;
        public float[] j;
        public int k;
        public Rect l;
        public int m;
        public final erh n;
        
        public e(final erh n) {
            this.n = n;
            this.l = new Rect();
            this.m = 1;
            (this.e = new Paint()).setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint$Style.STROKE);
            (this.f = new Paint()).setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint$Style.STROKE);
            (this.g = new Paint()).setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint$Style.STROKE);
            (this.h = new Paint()).setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(((View)n).getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            (this.i = new Paint()).setAntiAlias(true);
            this.g.setPathEffect((PathEffect)new DashPathEffect(new float[] { 4.0f, 8.0f }, 0.0f));
            this.c = new float[100];
            this.b = new int[50];
        }
        
        public final void a(final Canvas canvas, final int n, final int n2, final xqh xqh) {
            if (n == 4) {
                int i = 0;
                boolean b = false;
                boolean b2 = false;
                while (i < this.k) {
                    final int[] b3 = this.b;
                    if (b3[i] == 1) {
                        b = true;
                    }
                    if (b3[i] == 0) {
                        b2 = true;
                    }
                    ++i;
                }
                if (b) {
                    this.d(canvas);
                }
                if (b2) {
                    this.b(canvas);
                }
            }
            if (n == 2) {
                this.d(canvas);
            }
            if (n == 3) {
                this.b(canvas);
            }
            canvas.drawLines(this.a, this.e);
            final View b4 = xqh.b;
            int width;
            int height;
            if (b4 != null) {
                width = b4.getWidth();
                height = xqh.b.getHeight();
            }
            else {
                width = 0;
                height = 0;
            }
            for (int j = 1; j < n2 - 1; ++j) {
                if (n != 4 || this.b[j - 1] != 0) {
                    final float[] c = this.c;
                    final int n3 = j * 2;
                    final float n4 = c[n3];
                    final float n5 = c[n3 + 1];
                    this.d.reset();
                    this.d.moveTo(n4, n5 + 10.0f);
                    this.d.lineTo(n4 + 10.0f, n5);
                    this.d.lineTo(n4, n5 - 10.0f);
                    this.d.lineTo(n4 - 10.0f, n5);
                    this.d.close();
                    final int n6 = j - 1;
                    final frh frh = xqh.u.get(n6);
                    if (n == 4) {
                        final int[] b5 = this.b;
                        if (b5[n6] == 1) {
                            this.e(canvas, n4 - 0.0f, n5 - 0.0f);
                        }
                        else if (b5[n6] == 0) {
                            this.c(canvas, n4 - 0.0f, n5 - 0.0f);
                        }
                        else if (b5[n6] == 2) {
                            this.f(canvas, n4 - 0.0f, n5 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.d, this.i);
                    }
                    if (n == 2) {
                        this.e(canvas, n4 - 0.0f, n5 - 0.0f);
                    }
                    if (n == 3) {
                        this.c(canvas, n4 - 0.0f, n5 - 0.0f);
                    }
                    if (n == 6) {
                        this.f(canvas, n4 - 0.0f, n5 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            final float[] a = this.a;
            if (a.length > 1) {
                canvas.drawCircle(a[0], a[1], 8.0f, this.f);
                final float[] a2 = this.a;
                canvas.drawCircle(a2[a2.length - 2], a2[a2.length - 1], 8.0f, this.f);
            }
        }
        
        public final void b(final Canvas canvas) {
            final float[] a = this.a;
            final float n = a[0];
            final float n2 = a[1];
            final float n3 = a[a.length - 2];
            final float n4 = a[a.length - 1];
            canvas.drawLine(Math.min(n, n3), Math.max(n2, n4), Math.max(n, n3), Math.max(n2, n4), this.g);
            canvas.drawLine(Math.min(n, n3), Math.min(n2, n4), Math.min(n, n3), Math.max(n2, n4), this.g);
        }
        
        public final void c(final Canvas canvas, final float n, final float n2) {
            final float[] a = this.a;
            final float n3 = a[0];
            final float n4 = a[1];
            final float n5 = a[a.length - 2];
            final float n6 = a[a.length - 1];
            final float min = Math.min(n3, n5);
            final float max = Math.max(n4, n6);
            final float n7 = n - Math.min(n3, n5);
            final float n8 = Math.max(n4, n6) - n2;
            final StringBuilder j = fu8.j("");
            j.append((int)(n7 * 100.0f / Math.abs(n5 - n3) + 0.5) / 100.0f);
            final String string = j.toString();
            this.g(string, this.h);
            canvas.drawText(string, n7 / 2.0f - this.l.width() / 2 + min, n2 - 20.0f, this.h);
            canvas.drawLine(n, n2, Math.min(n3, n5), n2, this.g);
            final StringBuilder i = fu8.j("");
            i.append((int)(n8 * 100.0f / Math.abs(n6 - n4) + 0.5) / 100.0f);
            final String string2 = i.toString();
            this.g(string2, this.h);
            canvas.drawText(string2, n + 5.0f, max - (n8 / 2.0f - this.l.height() / 2), this.h);
            canvas.drawLine(n, n2, n, Math.max(n4, n6), this.g);
        }
        
        public final void d(final Canvas canvas) {
            final float[] a = this.a;
            canvas.drawLine(a[0], a[1], a[a.length - 2], a[a.length - 1], this.g);
        }
        
        public final void e(final Canvas canvas, final float n, final float n2) {
            final float[] a = this.a;
            final float n3 = a[0];
            final float n4 = a[1];
            final float n5 = a[a.length - 2];
            final float n6 = a[a.length - 1];
            final float n7 = (float)Math.hypot(n3 - n5, n4 - n6);
            final float n8 = n5 - n3;
            final float n9 = n6 - n4;
            final float n10 = ((n2 - n4) * n9 + (n - n3) * n8) / (n7 * n7);
            final float n11 = n3 + n8 * n10;
            final float n12 = n4 + n10 * n9;
            final Path path = new Path();
            path.moveTo(n, n2);
            path.lineTo(n11, n12);
            final float n13 = (float)Math.hypot(n11 - n, n12 - n2);
            final StringBuilder j = fu8.j("");
            j.append((int)(n13 * 100.0f / n7) / 100.0f);
            final String string = j.toString();
            this.g(string, this.h);
            canvas.drawTextOnPath(string, path, n13 / 2.0f - this.l.width() / 2, -20.0f, this.h);
            canvas.drawLine(n, n2, n11, n12, this.g);
        }
        
        public final void f(final Canvas canvas, final float n, final float n2, final int n3, final int n4) {
            final StringBuilder j = fu8.j("");
            j.append((int)((n - n3 / 2) * 100.0f / (((View)this.n).getWidth() - n3) + 0.5) / 100.0f);
            final String string = j.toString();
            this.g(string, this.h);
            canvas.drawText(string, n / 2.0f - this.l.width() / 2 + 0.0f, n2 - 20.0f, this.h);
            canvas.drawLine(n, n2, Math.min(0.0f, 1.0f), n2, this.g);
            final StringBuilder i = fu8.j("");
            i.append((int)((n2 - n4 / 2) * 100.0f / (((View)this.n).getHeight() - n4) + 0.5) / 100.0f);
            final String string2 = i.toString();
            this.g(string2, this.h);
            canvas.drawText(string2, n + 5.0f, 0.0f - (n2 / 2.0f - this.l.height() / 2), this.h);
            canvas.drawLine(n, n2, n, Math.max(0.0f, 1.0f), this.g);
        }
        
        public final void g(final String s, final Paint paint) {
            paint.getTextBounds(s, 0, s.length(), this.l);
        }
    }
    
    public final class f
    {
        public oi6 a;
        public oi6 b;
        public b c;
        public b d;
        public int e;
        public int f;
        public final erh g;
        
        public f(final erh g) {
            this.g = g;
            this.a = new oi6();
            this.b = new oi6();
            this.c = null;
            this.d = null;
        }
        
        public final void a() {
            final int childCount = this.g.getChildCount();
            this.g.f1.clear();
            final SparseArray sparseArray = new SparseArray();
            final int[] array = new int[childCount];
            for (int i = 0; i < childCount; ++i) {
                final View child = this.g.getChildAt(i);
                final xqh xqh = new xqh(child);
                sparseArray.put(array[i] = child.getId(), (Object)xqh);
                this.g.f1.put(child, xqh);
            }
            int j;
            int n;
            for (j = 0, n = childCount; j < n; ++j) {
                final View child2 = this.g.getChildAt(j);
                final xqh xqh2 = this.g.f1.get(child2);
                if (xqh2 != null) {
                    if (this.c != null) {
                        final ni6 d = this.d(this.a, child2);
                        if (d != null) {
                            final Rect z = erh.z(this.g, d);
                            final b c = this.c;
                            final int width = ((View)this.g).getWidth();
                            final int height = ((View)this.g).getHeight();
                            final int c2 = c.c;
                            if (c2 != 0) {
                                xqh2.e(z, xqh2.a, c2, width, height);
                            }
                            final frh f = xqh2.f;
                            f.F0 = 0.0f;
                            f.G0 = 0.0f;
                            xqh2.d(f);
                            xqh2.f.g((float)z.left, (float)z.top, (float)z.width(), (float)z.height());
                            final b.a m = c.m(xqh2.c);
                            xqh2.f.b(m);
                            xqh2.l = m.d.g;
                            xqh2.h.g(z, c, c2, xqh2.c);
                            xqh2.C = m.f.i;
                            final b.c d2 = m.d;
                            xqh2.E = d2.j;
                            xqh2.F = d2.i;
                            final Context context = xqh2.b.getContext();
                            final b.c d3 = m.d;
                            final int l = d3.l;
                            final String k = d3.k;
                            final int m2 = d3.m;
                            Object loadInterpolator;
                            if (l != -2) {
                                if (l != -1) {
                                    if (l != 0) {
                                        if (l != 1) {
                                            if (l != 2) {
                                                if (l != 4) {
                                                    if (l != 5) {
                                                        loadInterpolator = null;
                                                    }
                                                    else {
                                                        loadInterpolator = new OvershootInterpolator();
                                                    }
                                                }
                                                else {
                                                    loadInterpolator = new BounceInterpolator();
                                                }
                                            }
                                            else {
                                                loadInterpolator = new DecelerateInterpolator();
                                            }
                                        }
                                        else {
                                            loadInterpolator = new AccelerateInterpolator();
                                        }
                                    }
                                    else {
                                        loadInterpolator = new AccelerateDecelerateInterpolator();
                                    }
                                }
                                else {
                                    loadInterpolator = new wqh(ip9.c(k));
                                }
                            }
                            else {
                                loadInterpolator = AnimationUtils.loadInterpolator(context, m2);
                            }
                            xqh2.G = (Interpolator)loadInterpolator;
                        }
                        else if (this.g.p1 != 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(la8.b());
                            sb.append("no widget for  ");
                            sb.append(la8.d(child2));
                            sb.append(" (");
                            sb.append(child2.getClass().getName());
                            sb.append(")");
                            Log.e("MotionLayout", sb.toString());
                        }
                    }
                    else {
                        Objects.requireNonNull(this.g);
                    }
                    if (this.d != null) {
                        final ni6 d4 = this.d(this.b, child2);
                        if (d4 != null) {
                            final Rect z2 = erh.z(this.g, d4);
                            final b d5 = this.d;
                            final int width2 = ((View)this.g).getWidth();
                            final int height2 = ((View)this.g).getHeight();
                            final int c3 = d5.c;
                            Rect a = z2;
                            if (c3 != 0) {
                                xqh2.e(z2, xqh2.a, c3, width2, height2);
                                a = xqh2.a;
                            }
                            final frh g = xqh2.g;
                            g.F0 = 1.0f;
                            g.G0 = 1.0f;
                            xqh2.d(g);
                            xqh2.g.g((float)a.left, (float)a.top, (float)a.width(), (float)a.height());
                            xqh2.g.b(d5.m(xqh2.c));
                            xqh2.i.g(a, d5, c3, xqh2.c);
                        }
                        else if (this.g.p1 != 0) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(la8.b());
                            sb2.append("no widget for  ");
                            sb2.append(la8.d(child2));
                            sb2.append(" (");
                            sb2.append(child2.getClass().getName());
                            sb2.append(")");
                            Log.e("MotionLayout", sb2.toString());
                        }
                    }
                }
            }
            final SparseArray sparseArray2 = sparseArray;
            for (int n2 = 0; n2 < n; ++n2) {
                final xqh xqh3 = (xqh)sparseArray2.get(array[n2]);
                final int n3 = xqh3.f.N0;
                if (n3 != -1) {
                    final xqh xqh4 = (xqh)sparseArray2.get(n3);
                    xqh3.f.j(xqh4, xqh4.f);
                    xqh3.g.j(xqh4, xqh4.g);
                }
            }
        }
        
        public final void b(int n, final int n2) {
            final int optimizationLevel = this.g.getOptimizationLevel();
            final erh g = this.g;
            if (g.a1 == g.getStartState()) {
                final erh g2 = this.g;
                final oi6 b = this.b;
                final b d = this.d;
                int n3;
                if (d != null && d.c != 0) {
                    n3 = n2;
                }
                else {
                    n3 = n;
                }
                int n4;
                if (d != null && d.c != 0) {
                    n4 = n;
                }
                else {
                    n4 = n2;
                }
                g2.w(b, optimizationLevel, n3, n4);
                final b c = this.c;
                if (c != null) {
                    final erh g3 = this.g;
                    final oi6 a = this.a;
                    final int c2 = c.c;
                    int n5;
                    if (c2 == 0) {
                        n5 = n;
                    }
                    else {
                        n5 = n2;
                    }
                    if (c2 == 0) {
                        n = n2;
                    }
                    g3.w(a, optimizationLevel, n5, n);
                }
            }
            else {
                final b c3 = this.c;
                if (c3 != null) {
                    final erh g4 = this.g;
                    final oi6 a2 = this.a;
                    final int c4 = c3.c;
                    int n6;
                    if (c4 == 0) {
                        n6 = n;
                    }
                    else {
                        n6 = n2;
                    }
                    int n7;
                    if (c4 == 0) {
                        n7 = n2;
                    }
                    else {
                        n7 = n;
                    }
                    g4.w(a2, optimizationLevel, n6, n7);
                }
                final erh g5 = this.g;
                final oi6 b2 = this.b;
                final b d2 = this.d;
                int n8;
                if (d2 != null && d2.c != 0) {
                    n8 = n2;
                }
                else {
                    n8 = n;
                }
                if (d2 == null || d2.c == 0) {
                    n = n2;
                }
                g5.w(b2, optimizationLevel, n8, n);
            }
        }
        
        public final void c(final oi6 oi6, final oi6 oi7) {
            final ArrayList u0 = oi6.u0;
            final HashMap hashMap = new HashMap();
            hashMap.put(oi6, oi7);
            oi7.u0.clear();
            ((ni6)oi7).k((ni6)oi6, hashMap);
            for (final ni6 ni6 : u0) {
                Object o;
                if (ni6 instanceof ni1) {
                    o = new ni1();
                }
                else if (ni6 instanceof bac) {
                    o = new bac();
                }
                else if (ni6 instanceof c7b) {
                    o = new c7b();
                }
                else if (ni6 instanceof ahk) {
                    o = new ahk();
                }
                else if (ni6 instanceof yic) {
                    o = new ajc();
                }
                else {
                    o = new ni6();
                }
                oi7.a((ni6)o);
                hashMap.put(ni6, o);
            }
            for (final ni6 ni7 : u0) {
                ((ni6)hashMap.get(ni7)).k(ni7, hashMap);
            }
        }
        
        public final ni6 d(final oi6 oi6, final View view) {
            if (((ni6)oi6).h0 == view) {
                return (ni6)oi6;
            }
            final ArrayList u0 = oi6.u0;
            for (int size = u0.size(), i = 0; i < size; ++i) {
                final ni6 ni6 = u0.get(i);
                if (ni6.h0 == view) {
                    return ni6;
                }
            }
            return null;
        }
        
        public final void e(final b c, final b d) {
            final ni6$a e0 = ni6$a.E0;
            this.c = c;
            this.d = d;
            this.a = new oi6();
            this.b = new oi6();
            this.a.m0(this.g.F0.y0);
            this.b.m0(this.g.F0.y0);
            this.a.b0();
            this.b.b0();
            this.c(this.g.F0, this.a);
            this.c(this.g.F0, this.b);
            if (this.g.j1 > 0.5) {
                if (c != null) {
                    this.g(this.a, c);
                }
                this.g(this.b, d);
            }
            else {
                this.g(this.b, d);
                if (c != null) {
                    this.g(this.a, c);
                }
            }
            this.a.z0 = this.g.s();
            this.a.o0();
            this.b.z0 = this.g.s();
            this.b.o0();
            final ViewGroup$LayoutParams layoutParams = ((View)this.g).getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ((ni6)this.a).T(e0);
                    ((ni6)this.b).T(e0);
                }
                if (layoutParams.height == -2) {
                    ((ni6)this.a).W(e0);
                    ((ni6)this.b).W(e0);
                }
            }
        }
        
        public final void f() {
            final erh g = this.g;
            final int c1 = g.c1;
            final int d1 = g.d1;
            final int mode = View$MeasureSpec.getMode(c1);
            final int mode2 = View$MeasureSpec.getMode(d1);
            final erh g2 = this.g;
            g2.Q1 = mode;
            g2.R1 = mode2;
            g2.getOptimizationLevel();
            this.b(c1, d1);
            final boolean b = ((View)this.g).getParent() instanceof erh;
            final int n = 0;
            final int n2 = 0;
            final int n3 = 1;
            if (!b || mode != 1073741824 || mode2 != 1073741824) {
                this.b(c1, d1);
                this.g.M1 = ((ni6)this.a).x();
                this.g.N1 = ((ni6)this.a).q();
                this.g.O1 = ((ni6)this.b).x();
                this.g.P1 = ((ni6)this.b).q();
                final erh g3 = this.g;
                g3.L1 = (g3.M1 != g3.O1 || g3.N1 != g3.P1);
            }
            final erh g4 = this.g;
            final int m1 = g4.M1;
            final int n4 = g4.N1;
            final int q1 = g4.Q1;
            int n5 = 0;
            Label_0307: {
                if (q1 != Integer.MIN_VALUE) {
                    n5 = m1;
                    if (q1 != 0) {
                        break Label_0307;
                    }
                }
                n5 = (int)(g4.S1 * (g4.O1 - m1) + m1);
            }
            final int r1 = g4.R1;
            int n6 = 0;
            Label_0355: {
                if (r1 != Integer.MIN_VALUE) {
                    n6 = n4;
                    if (r1 != 0) {
                        break Label_0355;
                    }
                }
                n6 = (int)(g4.S1 * (g4.P1 - n4) + n4);
            }
            final oi6 a = this.a;
            g4.v(c1, d1, n5, n6, a.I0 || this.b.I0, a.J0 || this.b.J0);
            final erh g5 = this.g;
            final int childCount = g5.getChildCount();
            g5.a2.a();
            g5.n1 = true;
            final SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < childCount; ++i) {
                final View child = g5.getChildAt(i);
                sparseArray.put(child.getId(), (Object)g5.f1.get(child));
            }
            final int width = ((View)g5).getWidth();
            final int height = ((View)g5).getHeight();
            final irh.b c2 = g5.V0.c;
            int p;
            if (c2 != null) {
                p = c2.p;
            }
            else {
                p = -1;
            }
            if (p != -1) {
                for (int j = 0; j < childCount; ++j) {
                    final xqh xqh = g5.f1.get(g5.getChildAt(j));
                    if (xqh != null) {
                        xqh.B = p;
                    }
                }
            }
            final SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            final int[] array = new int[g5.f1.size()];
            int k = 0;
            int n7 = 0;
            while (k < childCount) {
                final xqh xqh2 = g5.f1.get(g5.getChildAt(k));
                final int n8 = xqh2.f.N0;
                int n9 = n7;
                if (n8 != -1) {
                    sparseBooleanArray.put(n8, true);
                    array[n7] = xqh2.f.N0;
                    n9 = n7 + 1;
                }
                ++k;
                n7 = n9;
            }
            for (int l = 0; l < n7; ++l) {
                final xqh xqh3 = g5.f1.get(((View)g5).findViewById(array[l]));
                if (xqh3 != null) {
                    g5.V0.g(xqh3);
                    xqh3.f(width, height, g5.getNanoTime());
                }
            }
            for (int n10 = 0; n10 < childCount; ++n10) {
                final View child2 = g5.getChildAt(n10);
                final xqh xqh4 = g5.f1.get(child2);
                if (!sparseBooleanArray.get(child2.getId())) {
                    if (xqh4 != null) {
                        g5.V0.g(xqh4);
                        xqh4.f(width, height, g5.getNanoTime());
                    }
                }
            }
            final irh.b c3 = g5.V0.c;
            float i2;
            if (c3 != null) {
                i2 = c3.i;
            }
            else {
                i2 = 0.0f;
            }
            if (i2 != 0.0f) {
                final boolean b2 = i2 < 0.0;
                final float abs = Math.abs(i2);
                float n11 = Float.MAX_VALUE;
                final float n12 = -3.4028235E38f;
                int n13 = 0;
                float min = Float.MAX_VALUE;
                float max = -3.4028235E38f;
                while (true) {
                    while (n13 < childCount) {
                        final xqh xqh5 = g5.f1.get(g5.getChildAt(n13));
                        if (!Float.isNaN(xqh5.l)) {
                            final int n14 = n3;
                            int n15 = n;
                            if (n14 != 0) {
                                int n16 = 0;
                                float n17 = n12;
                                int n18;
                                while (true) {
                                    n18 = n2;
                                    if (n16 >= childCount) {
                                        break;
                                    }
                                    final xqh xqh6 = g5.f1.get(g5.getChildAt(n16));
                                    float min2 = n11;
                                    float max2 = n17;
                                    if (!Float.isNaN(xqh6.l)) {
                                        min2 = Math.min(n11, xqh6.l);
                                        max2 = Math.max(n17, xqh6.l);
                                    }
                                    ++n16;
                                    n11 = min2;
                                    n17 = max2;
                                }
                                while (n18 < childCount) {
                                    final xqh xqh7 = g5.f1.get(g5.getChildAt(n18));
                                    if (!Float.isNaN(xqh7.l)) {
                                        xqh7.n = 1.0f / (1.0f - abs);
                                        if (b2) {
                                            xqh7.m = abs - (n17 - xqh7.l) / (n17 - n11) * abs;
                                        }
                                        else {
                                            xqh7.m = abs - (xqh7.l - n11) * abs / (n17 - n11);
                                        }
                                    }
                                    ++n18;
                                }
                                return;
                            }
                            while (n15 < childCount) {
                                final xqh xqh8 = g5.f1.get(g5.getChildAt(n15));
                                final frh g6 = xqh8.g;
                                final float h0 = g6.H0;
                                final float i3 = g6.I0;
                                float n19;
                                if (b2) {
                                    n19 = i3 - h0;
                                }
                                else {
                                    n19 = i3 + h0;
                                }
                                xqh8.n = 1.0f / (1.0f - abs);
                                xqh8.m = abs - (n19 - min) * abs / (max - min);
                                ++n15;
                            }
                            return;
                        }
                        else {
                            final frh g7 = xqh5.g;
                            final float h2 = g7.H0;
                            final float i4 = g7.I0;
                            float n20;
                            if (b2) {
                                n20 = i4 - h2;
                            }
                            else {
                                n20 = i4 + h2;
                            }
                            min = Math.min(min, n20);
                            max = Math.max(max, n20);
                            ++n13;
                        }
                    }
                    final int n14 = 0;
                    continue;
                }
            }
        }
        
        public final void g(final oi6 oi6, final b b) {
            final SparseArray sparseArray = new SparseArray();
            final c$a c$a = new c$a();
            sparseArray.clear();
            sparseArray.put(0, (Object)oi6);
            sparseArray.put(((View)this.g).getId(), (Object)oi6);
            if (b != null && b.c != 0) {
                final erh g = this.g;
                g.w(this.b, g.getOptimizationLevel(), View$MeasureSpec.makeMeasureSpec(((View)this.g).getHeight(), 1073741824), View$MeasureSpec.makeMeasureSpec(((View)this.g).getWidth(), 1073741824));
            }
            for (final ni6 ni6 : oi6.u0) {
                sparseArray.put(((View)ni6.h0).getId(), (Object)ni6);
            }
            for (final ni6 ni7 : oi6.u0) {
                final View view = (View)ni7.h0;
                final int id = view.getId();
                if (b.f.containsKey(id)) {
                    final b.a a = b.f.get(id);
                    if (a != null) {
                        a.a((a)c$a);
                    }
                }
                ni7.X(b.m(view.getId()).e.c);
                ni7.S(b.m(view.getId()).e.d);
                if (view instanceof androidx.constraintlayout.widget.a) {
                    final androidx.constraintlayout.widget.a a2 = (androidx.constraintlayout.widget.a)view;
                    final int id2 = a2.getId();
                    if (b.f.containsKey(id2)) {
                        final b.a a3 = b.f.get(id2);
                        if (a3 != null && ni7 instanceof ajc) {
                            a2.n(a3, (ajc)ni7, (a)c$a, (SparseArray<ni6>)sparseArray);
                        }
                    }
                    if (view instanceof Barrier) {
                        ((androidx.constraintlayout.widget.a)view).s();
                    }
                }
                ((a)c$a).resolveLayoutDirection(((View)this.g).getLayoutDirection());
                this.g.g(false, view, ni7, (a)c$a, (SparseArray<ni6>)sparseArray);
                if (b.m(view.getId()).c.c == 1) {
                    ni7.i0 = view.getVisibility();
                }
                else {
                    ni7.i0 = b.m(view.getId()).c.b;
                }
            }
            for (final ni6 ni8 : oi6.u0) {
                if (ni8 instanceof jex) {
                    final androidx.constraintlayout.widget.a a4 = (androidx.constraintlayout.widget.a)ni8.h0;
                    final yic yic = (yic)ni8;
                    Objects.requireNonNull(a4);
                    yic.b();
                    for (int i = 0; i < a4.E0; ++i) {
                        yic.a((ni6)sparseArray.get(a4.D0[i]));
                    }
                    final jex jex = (jex)yic;
                    for (int j = 0; j < ((ajc)jex).v0; ++j) {
                        final ni6 ni9 = ((ajc)jex).u0[j];
                        if (ni9 != null) {
                            ni9.G = true;
                        }
                    }
                }
            }
        }
    }
    
    public static final class g
    {
        public static g b;
        public VelocityTracker a;
        
        static {
            g.b = new g();
        }
        
        public final void a(final MotionEvent motionEvent) {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.addMovement(motionEvent);
            }
        }
        
        public final void b(final int n) {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.computeCurrentVelocity(n);
            }
        }
        
        public final float c() {
            final VelocityTracker a = this.a;
            if (a != null) {
                return a.getXVelocity();
            }
            return 0.0f;
        }
        
        public final float d() {
            final VelocityTracker a = this.a;
            if (a != null) {
                return a.getYVelocity();
            }
            return 0.0f;
        }
    }
    
    public final class h
    {
        public float a;
        public float b;
        public int c;
        public int d;
        public final erh e;
        
        public h(final erh e) {
            this.e = e;
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }
        
        public final void a() {
            final int c = this.c;
            if (c != -1 || this.d != -1) {
                if (c == -1) {
                    this.e.Q(this.d);
                }
                else {
                    final int d = this.d;
                    if (d == -1) {
                        this.e.M(c);
                    }
                    else {
                        this.e.N(c, d);
                    }
                }
                this.e.setState(j.E0);
            }
            if (!Float.isNaN(this.b)) {
                final erh e = this.e;
                final float a = this.a;
                final float b = this.b;
                if (!e.isAttachedToWindow()) {
                    if (e.V1 == null) {
                        e.V1 = e.new h();
                    }
                    final h v1 = e.V1;
                    v1.a = a;
                    v1.b = b;
                }
                else {
                    e.setProgress(a);
                    e.setState(j.F0);
                    e.Y0 = b;
                    float n = 1.0f;
                    final float n2 = fcmpl(b, 0.0f);
                    if (n2 != 0) {
                        if (n2 <= 0) {
                            n = 0.0f;
                        }
                        e.A(n);
                    }
                    else if (a != 0.0f && a != 1.0f) {
                        if (a <= 0.5f) {
                            n = 0.0f;
                        }
                        e.A(n);
                    }
                }
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
                return;
            }
            if (Float.isNaN(this.a)) {
                return;
            }
            this.e.setProgress(this.a);
        }
    }
    
    public interface i
    {
        void a();
        
        void b();
        
        void c();
        
        void d();
    }
    
    public enum j
    {
        D0, 
        E0, 
        F0, 
        G0;
        
        public static final j[] H0;
    }
}
