import android.os.BaseBundle;
import android.animation.TimeInterpolator;
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

public class zqh extends ConstraintLayout implements bci
{
    public static boolean f2;
    public float A1;
    public boolean B1;
    public ArrayList<wqh> C1;
    public ArrayList<wqh> D1;
    public CopyOnWriteArrayList<zqh.zqh$i> E1;
    public int F1;
    public long G1;
    public float H1;
    public int I1;
    public float J1;
    public boolean K1;
    public int L1;
    public int M1;
    public int N1;
    public int O1;
    public int P1;
    public int Q1;
    public float R1;
    public spe S1;
    public boolean T1;
    public drh U0;
    public zqh.zqh$h U1;
    public xqh V0;
    public Runnable V1;
    public Interpolator W0;
    public Rect W1;
    public float X0;
    public boolean X1;
    public int Y0;
    public zqh.zqh$j Y1;
    public int Z0;
    public zqh.zqh$f Z1;
    public int a1;
    public boolean a2;
    public int b1;
    public RectF b2;
    public int c1;
    public View c2;
    public boolean d1;
    public Matrix d2;
    public HashMap<View, rqh> e1;
    public ArrayList<Integer> e2;
    public long f1;
    public float g1;
    public float h1;
    public float i1;
    public long j1;
    public float k1;
    public boolean l1;
    public boolean m1;
    public zqh.zqh$i n1;
    public int o1;
    public zqh.zqh$e p1;
    public boolean q1;
    public rhr r1;
    public d s1;
    public ur8 t1;
    public int u1;
    public int v1;
    public boolean w1;
    public float x1;
    public float y1;
    public long z1;
    
    public zqh(final Context context, final AttributeSet set) {
        super(context, set);
        this.W0 = null;
        this.X0 = 0.0f;
        this.Y0 = -1;
        this.Z0 = -1;
        this.a1 = -1;
        final int n = 0;
        this.b1 = 0;
        this.c1 = 0;
        this.d1 = true;
        this.e1 = new HashMap<View, rqh>();
        this.f1 = 0L;
        this.g1 = 1.0f;
        this.h1 = 0.0f;
        this.i1 = 0.0f;
        this.k1 = 0.0f;
        this.m1 = false;
        this.o1 = 0;
        this.q1 = false;
        this.r1 = new rhr();
        this.s1 = new d();
        this.w1 = false;
        this.B1 = false;
        this.C1 = null;
        this.D1 = null;
        this.E1 = null;
        this.F1 = 0;
        this.G1 = -1L;
        this.H1 = 0.0f;
        this.I1 = 0;
        this.J1 = 0.0f;
        this.K1 = false;
        this.S1 = new spe();
        this.T1 = false;
        this.V1 = null;
        new HashMap();
        this.W1 = new Rect();
        this.X1 = false;
        this.Y1 = zqh.zqh$j.C0;
        this.Z1 = new zqh.zqh$f(this);
        this.a2 = false;
        this.b2 = new RectF();
        this.c2 = null;
        this.d2 = null;
        this.e2 = new ArrayList<Integer>();
        zqh.f2 = ((View)this).isInEditMode();
        if (set != null) {
            final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, k3j.S0);
            final int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            int n2 = 1;
            while (i < indexCount) {
                final int index = obtainStyledAttributes.getIndex(i);
                int o1 = 2;
                int boolean1;
                if (index == 2) {
                    this.U0 = new drh(((View)this).getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                    boolean1 = n2;
                }
                else if (index == 1) {
                    this.Z0 = obtainStyledAttributes.getResourceId(index, -1);
                    boolean1 = n2;
                }
                else if (index == 4) {
                    this.k1 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.m1 = true;
                    boolean1 = n2;
                }
                else if (index == 0) {
                    boolean1 = (obtainStyledAttributes.getBoolean(index, (boolean)(n2 != 0)) ? 1 : 0);
                }
                else if (index == 5) {
                    boolean1 = n2;
                    if (this.o1 == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            o1 = 0;
                        }
                        this.o1 = o1;
                        boolean1 = n2;
                    }
                }
                else {
                    boolean1 = n2;
                    if (index == 3) {
                        this.o1 = obtainStyledAttributes.getInt(index, 0);
                        boolean1 = n2;
                    }
                }
                ++i;
                n2 = boolean1;
            }
            obtainStyledAttributes.recycle();
            if (this.U0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (n2 == 0) {
                this.U0 = null;
            }
        }
        if (this.o1 != 0) {
            final drh u0 = this.U0;
            if (u0 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            }
            else {
                final int j = u0.i();
                final drh u2 = this.U0;
                final b b = u2.b(u2.i());
                final String c = za8.c(((View)this).getContext(), j);
                for (int childCount = ((ViewGroup)this).getChildCount(), k = 0; k < childCount; ++k) {
                    final View child = ((ViewGroup)this).getChildAt(k);
                    final int id = child.getId();
                    if (id == -1) {
                        final StringBuilder z = bd.z("CHECK: ", c, " ALL VIEWS SHOULD HAVE ID's ");
                        z.append(child.getClass().getName());
                        z.append(" does not!");
                        Log.w("MotionLayout", z.toString());
                    }
                    if (b.n(id) == null) {
                        final StringBuilder z2 = bd.z("CHECK: ", c, " NO CONSTRAINTS for ");
                        z2.append(za8.d(child));
                        Log.w("MotionLayout", z2.toString());
                    }
                }
                final Integer[] array = (Integer[])b.f.keySet().toArray(new Integer[0]);
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
                    final String c2 = za8.c(((View)this).getContext(), n4);
                    if (((View)this).findViewById(array2[l]) == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("CHECK: ");
                        sb.append(c);
                        sb.append(" NO View matches id ");
                        sb.append(c2);
                        Log.w("MotionLayout", sb.toString());
                    }
                    if (b.m(n4).e.d == -1) {
                        Log.w("MotionLayout", yqh.k("CHECK: ", c, "(", c2, ") no LAYOUT_HEIGHT"));
                    }
                    if (b.m(n4).e.c == -1) {
                        Log.w("MotionLayout", yqh.k("CHECK: ", c, "(", c2, ") no LAYOUT_HEIGHT"));
                    }
                    ++l;
                }
                final SparseIntArray sparseIntArray = new SparseIntArray();
                final SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (final drh$b drh$b : this.U0.d) {
                    if (drh$b == this.U0.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (drh$b.d == drh$b.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    final int d = drh$b.d;
                    final int c3 = drh$b.c;
                    final String c4 = za8.c(((View)this).getContext(), d);
                    final String c5 = za8.c(((View)this).getContext(), c3);
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
                    if (this.U0.b(d) == null) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append(" no such constraintSetStart ");
                        sb4.append(c4);
                        Log.e("MotionLayout", sb4.toString());
                    }
                    if (this.U0.b(c3) == null) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append(" no such constraintSetEnd ");
                        sb5.append(c4);
                        Log.e("MotionLayout", sb5.toString());
                    }
                }
            }
        }
        if (this.Z0 == -1) {
            final drh u3 = this.U0;
            if (u3 != null) {
                this.Z0 = u3.i();
                this.Y0 = this.U0.i();
                this.a1 = this.U0.d();
            }
        }
    }
    
    public static Rect z(final zqh zqh, final hj6 hj6) {
        zqh.W1.top = hj6.z();
        zqh.W1.left = hj6.y();
        final Rect w1 = zqh.W1;
        final int x = hj6.x();
        final Rect w2 = zqh.W1;
        w1.right = x + w2.left;
        final int q = hj6.q();
        final Rect w3 = zqh.W1;
        w2.bottom = q + w3.top;
        return w3;
    }
    
    public final void A(final float k1) {
        final drh u0 = this.U0;
        if (u0 == null) {
            return;
        }
        final float i1 = this.i1;
        final float h1 = this.h1;
        if (i1 != h1 && this.l1) {
            this.i1 = h1;
        }
        final float i2 = this.i1;
        if (i2 == k1) {
            return;
        }
        this.q1 = false;
        this.k1 = k1;
        this.g1 = u0.c() / 1000.0f;
        this.setProgress(this.k1);
        this.V0 = null;
        this.W0 = this.U0.f();
        this.l1 = false;
        this.f1 = this.getNanoTime();
        this.m1 = true;
        this.h1 = i2;
        this.i1 = i2;
        ((View)this).invalidate();
    }
    
    public final void B(final boolean b) {
        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            final rqh rqh = this.e1.get(((ViewGroup)this).getChildAt(i));
            if (rqh != null && "button".equals(za8.d(rqh.b)) && rqh.A != null) {
                int n = 0;
                while (true) {
                    final wqe[] a = rqh.A;
                    if (n >= a.length) {
                        break;
                    }
                    final wqe wqe = a[n];
                    float n2;
                    if (b) {
                        n2 = -100.0f;
                    }
                    else {
                        n2 = 100.0f;
                    }
                    wqe.g(n2, rqh.b);
                    ++n;
                }
            }
        }
    }
    
    public final void C(final boolean b) {
        final zqh.zqh$j f0 = zqh.zqh$j.F0;
        if (this.j1 == -1L) {
            this.j1 = this.getNanoTime();
        }
        final float i1 = this.i1;
        if (i1 > 0.0f && i1 < 1.0f) {
            this.Z0 = -1;
        }
        final boolean b2 = this.B1;
        final boolean b3 = false;
        final boolean b4 = true;
        final boolean b5 = true;
        boolean b6 = false;
        Label_1171: {
            if (!b2) {
                b6 = b3;
                if (!this.m1) {
                    break Label_1171;
                }
                if (!b) {
                    b6 = b3;
                    if (this.k1 == i1) {
                        break Label_1171;
                    }
                }
            }
            final float signum = Math.signum(this.k1 - i1);
            final long nanoTime = this.getNanoTime();
            final xqh v0 = this.V0;
            float x0;
            if (!(v0 instanceof xqh)) {
                x0 = (nanoTime - this.j1) * signum * 1.0E-9f / this.g1;
            }
            else {
                x0 = 0.0f;
            }
            float n = this.i1 + x0;
            if (this.l1) {
                n = this.k1;
            }
            final float n2 = fcmpl(signum, 0.0f);
            boolean b7;
            if ((n2 > 0 && n >= this.k1) || (signum <= 0.0f && n <= this.k1)) {
                n = this.k1;
                this.m1 = false;
                b7 = true;
            }
            else {
                b7 = false;
            }
            this.i1 = n;
            this.h1 = n;
            this.j1 = nanoTime;
            int n4 = 0;
            Label_0559: {
                if (v0 != null && !b7) {
                    if (this.q1) {
                        final float interpolation = ((TimeInterpolator)v0).getInterpolation((nanoTime - this.f1) * 1.0E-9f);
                        final xqh v2 = this.V0;
                        final rhr r1 = this.r1;
                        int n3;
                        if (v2 == r1) {
                            if (r1.c.b()) {
                                n3 = 2;
                            }
                            else {
                                n3 = 1;
                            }
                        }
                        else {
                            n3 = 0;
                        }
                        this.i1 = interpolation;
                        this.j1 = nanoTime;
                        final xqh v3 = this.V0;
                        n = interpolation;
                        n4 = n3;
                        if (!(v3 instanceof xqh)) {
                            break Label_0559;
                        }
                        final float a = v3.a();
                        this.X0 = a;
                        if (Math.abs(a) * this.g1 <= 1.0E-5f && n3 == 2) {
                            this.m1 = false;
                        }
                        float n5 = interpolation;
                        if (a > 0.0f) {
                            n5 = interpolation;
                            if (interpolation >= 1.0f) {
                                this.i1 = 1.0f;
                                this.m1 = false;
                                n5 = 1.0f;
                            }
                        }
                        n = n5;
                        n4 = n3;
                        if (a >= 0.0f) {
                            break Label_0559;
                        }
                        n = n5;
                        n4 = n3;
                        if (n5 <= 0.0f) {
                            this.i1 = 0.0f;
                            this.m1 = false;
                            n = 0.0f;
                            n4 = n3;
                        }
                        break Label_0559;
                    }
                    else {
                        final float interpolation2 = ((TimeInterpolator)v0).getInterpolation(n);
                        final xqh v4 = this.V0;
                        if (v4 instanceof xqh) {
                            this.X0 = v4.a();
                        }
                        else {
                            this.X0 = (((TimeInterpolator)v4).getInterpolation(n + x0) - interpolation2) * signum / x0;
                        }
                        n = interpolation2;
                    }
                }
                else {
                    this.X0 = x0;
                }
                n4 = 0;
            }
            if (Math.abs(this.X0) > 1.0E-5f) {
                this.setState(zqh.zqh$j.E0);
            }
            float r2 = n;
            Label_0668: {
                if (n4 != 1) {
                    float k1 = 0.0f;
                    Label_0636: {
                        if (n2 <= 0 || n < this.k1) {
                            k1 = n;
                            if (signum > 0.0f) {
                                break Label_0636;
                            }
                            k1 = n;
                            if (n > this.k1) {
                                break Label_0636;
                            }
                        }
                        k1 = this.k1;
                        this.m1 = false;
                    }
                    if (k1 < 1.0f) {
                        r2 = k1;
                        if (k1 > 0.0f) {
                            break Label_0668;
                        }
                    }
                    this.m1 = false;
                    this.setState(f0);
                    r2 = k1;
                }
            }
            final int childCount = ((ViewGroup)this).getChildCount();
            this.B1 = false;
            final long nanoTime2 = this.getNanoTime();
            this.R1 = r2;
            final Interpolator w0 = this.W0;
            float interpolation3;
            if (w0 == null) {
                interpolation3 = r2;
            }
            else {
                interpolation3 = ((TimeInterpolator)w0).getInterpolation(r2);
            }
            final Interpolator w2 = this.W0;
            if (w2 != null) {
                final float interpolation4 = ((TimeInterpolator)w2).getInterpolation(signum / this.g1 + r2);
                this.X0 = interpolation4;
                this.X0 = interpolation4 - ((TimeInterpolator)this.W0).getInterpolation(r2);
            }
            for (int j = 0; j < childCount; ++j) {
                final View child = ((ViewGroup)this).getChildAt(j);
                final rqh rqh = this.e1.get(child);
                if (rqh != null) {
                    this.B1 |= rqh.c(child, interpolation3, nanoTime2, this.S1);
                }
            }
            final boolean b8 = (n2 > 0 && r2 >= this.k1) || (signum <= 0.0f && r2 <= this.k1);
            if (!this.B1 && !this.m1 && b8) {
                this.setState(f0);
            }
            if (this.K1) {
                this.requestLayout();
            }
            this.B1 |= (b8 ^ true);
            boolean b9 = false;
            Label_0990: {
                if (r2 <= 0.0f) {
                    final int y0 = this.Y0;
                    if (y0 != -1 && this.Z0 != y0) {
                        this.Z0 = y0;
                        this.U0.b(y0).a((ConstraintLayout)this);
                        this.setState(f0);
                        b9 = true;
                        break Label_0990;
                    }
                }
                b9 = false;
            }
            boolean b10 = b9;
            if (r2 >= 1.0) {
                final int z0 = this.Z0;
                final int a2 = this.a1;
                b10 = b9;
                if (z0 != a2) {
                    this.Z0 = a2;
                    this.U0.b(a2).a((ConstraintLayout)this);
                    this.setState(f0);
                    b10 = true;
                }
            }
            if (!this.B1 && !this.m1) {
                if ((n2 > 0 && r2 == 1.0f) || (signum < 0.0f && r2 == 0.0f)) {
                    this.setState(f0);
                }
            }
            else {
                ((View)this).invalidate();
            }
            b6 = b10;
            if (!this.B1) {
                b6 = b10;
                if (!this.m1) {
                    if (n2 <= 0 || r2 != 1.0f) {
                        b6 = b10;
                        if (signum >= 0.0f) {
                            break Label_1171;
                        }
                        b6 = b10;
                        if (r2 != 0.0f) {
                            break Label_1171;
                        }
                    }
                    this.J();
                    b6 = b10;
                }
            }
        }
        final float i2 = this.i1;
        boolean b11 = false;
        Label_1266: {
            if (i2 >= 1.0f) {
                final int z2 = this.Z0;
                final int a3 = this.a1;
                if (z2 != a3) {
                    b6 = b5;
                }
                this.Z0 = a3;
            }
            else {
                b11 = b6;
                if (i2 > 0.0f) {
                    break Label_1266;
                }
                final int z3 = this.Z0;
                final int y2 = this.Y0;
                if (z3 != y2) {
                    b6 = b4;
                }
                this.Z0 = y2;
            }
            b11 = b6;
        }
        this.a2 |= b11;
        if (b11 && !this.T1) {
            this.requestLayout();
        }
        this.h1 = this.i1;
    }
    
    public final void D() {
        if (this.n1 == null) {
            final CopyOnWriteArrayList<zqh.zqh$i> e1 = this.E1;
            if (e1 == null || e1.isEmpty()) {
                return;
            }
        }
        if (this.J1 != this.h1) {
            if (this.I1 != -1) {
                final zqh.zqh$i n1 = this.n1;
                if (n1 != null) {
                    n1.d();
                }
                final CopyOnWriteArrayList<zqh.zqh$i> e2 = this.E1;
                if (e2 != null) {
                    final Iterator<zqh.zqh$i> iterator = e2.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().d();
                    }
                }
            }
            this.I1 = -1;
            this.J1 = this.h1;
            final zqh.zqh$i n2 = this.n1;
            if (n2 != null) {
                n2.c();
            }
            final CopyOnWriteArrayList<zqh.zqh$i> e3 = this.E1;
            if (e3 != null) {
                final Iterator<zqh.zqh$i> iterator2 = e3.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().c();
                }
            }
        }
    }
    
    public final void E() {
        Label_0103: {
            if (this.n1 == null) {
                final CopyOnWriteArrayList<zqh.zqh$i> e1 = this.E1;
                if (e1 == null || e1.isEmpty()) {
                    break Label_0103;
                }
            }
            if (this.I1 == -1) {
                this.I1 = this.Z0;
                int intValue;
                if (!this.e2.isEmpty()) {
                    final ArrayList<Integer> e2 = this.e2;
                    intValue = e2.get(e2.size() - 1);
                }
                else {
                    intValue = -1;
                }
                final int z0 = this.Z0;
                if (intValue != z0 && z0 != -1) {
                    this.e2.add(z0);
                }
            }
        }
        this.K();
        final Runnable v1 = this.V1;
        if (v1 != null) {
            v1.run();
        }
    }
    
    public final void F(int n, float n2, final float n3, final float n4, final float[] array) {
        final HashMap<View, rqh> e1 = this.e1;
        final View p5 = this.p(n);
        final rqh rqh = e1.get(p5);
        if (rqh != null) {
            n2 = rqh.a(n2, rqh.v);
            final ia7[] j = rqh.j;
            n = 0;
            if (j != null) {
                final ia7 ia7 = j[0];
                final double n5 = n2;
                ia7.e(n5, rqh.q);
                rqh.j[0].c(n5, rqh.p);
                n2 = rqh.v[0];
                double[] q;
                while (true) {
                    q = rqh.q;
                    if (n >= q.length) {
                        break;
                    }
                    q[n] *= n2;
                    ++n;
                }
                final zr0 k = rqh.k;
                if (k != null) {
                    final double[] p6 = rqh.p;
                    if (p6.length > 0) {
                        k.c(n5, p6);
                        rqh.k.e(n5, rqh.q);
                        rqh.f.i(n3, n4, array, rqh.o, rqh.q, rqh.p);
                    }
                }
                else {
                    rqh.f.i(n3, n4, array, rqh.o, q, rqh.p);
                }
            }
            else {
                final arh g = rqh.g;
                n2 = g.G0;
                final arh f = rqh.f;
                final float n6 = n2 - f.G0;
                final float n7 = g.H0 - f.H0;
                n2 = g.I0;
                final float i0 = f.I0;
                final float j2 = g.J0;
                final float j3 = f.J0;
                array[0] = (n2 - i0 + n6) * n3 + (1.0f - n3) * n6;
                array[1] = (j2 - j3 + n7) * n4 + (1.0f - n4) * n7;
            }
            p5.getY();
        }
        else {
            String s;
            if (p5 == null) {
                s = yk.y("", n);
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
        final drh u0 = this.U0;
        if (u0 == null) {
            return null;
        }
        return u0.b(n);
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
            this.b2.set(n, n2, view.getRight() + n - view.getLeft(), view.getBottom() + n2 - view.getTop());
            if (obtain.getAction() != 0 || this.b2.contains(obtain.getX(), obtain.getY())) {
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
                    if (this.d2 == null) {
                        this.d2 = new Matrix();
                    }
                    matrix.invert(this.d2);
                    obtain.transform(this.d2);
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
                final drh u0 = new drh(((View)this).getContext(), this, n);
                this.U0 = u0;
                if (this.Z0 == -1) {
                    this.Z0 = u0.i();
                    this.Y0 = this.U0.i();
                    this.a1 = this.U0.d();
                }
                if (this.isAttachedToWindow()) {
                    try {
                        final Display display = ((View)this).getDisplay();
                        if (display != null) {
                            display.getRotation();
                        }
                        final drh u2 = this.U0;
                        if (u2 != null) {
                            final b b = u2.b(this.Z0);
                            this.U0.o(this);
                            if (b != null) {
                                b.b((ConstraintLayout)this);
                            }
                            this.Y0 = this.Z0;
                        }
                        this.J();
                        final zqh.zqh$h u3 = this.U1;
                        if (u3 != null) {
                            if (this.X1) {
                                ((View)this).post((Runnable)new zqh$a(this));
                                return;
                            }
                            u3.a();
                            return;
                        }
                        else {
                            final drh u4 = this.U0;
                            if (u4 == null) {
                                return;
                            }
                            final drh$b c = u4.c;
                            if (c != null && c.n == 4) {
                                this.P();
                                this.setState(zqh.zqh$j.D0);
                                this.setState(zqh.zqh$j.E0);
                            }
                            return;
                        }
                    }
                    catch (final Exception ex) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", ex);
                    }
                }
                this.U0 = null;
                return;
            }
            catch (final Exception ex2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", ex2);
            }
        }
        this.U0 = null;
    }
    
    public final void J() {
        final drh u0 = this.U0;
        if (u0 == null) {
            return;
        }
        if (u0.a(this, this.Z0)) {
            this.requestLayout();
            return;
        }
        final int z0 = this.Z0;
        if (z0 != -1) {
            final drh u2 = this.U0;
            for (final drh$b drh$b : u2.d) {
                if (drh$b.m.size() > 0) {
                    final Iterator iterator2 = drh$b.m.iterator();
                    while (iterator2.hasNext()) {
                        ((drh$b$a)iterator2.next()).b(this);
                    }
                }
            }
            for (final drh$b drh$b2 : u2.f) {
                if (drh$b2.m.size() > 0) {
                    final Iterator iterator4 = drh$b2.m.iterator();
                    while (iterator4.hasNext()) {
                        ((drh$b$a)iterator4.next()).b(this);
                    }
                }
            }
            for (final drh$b drh$b3 : u2.d) {
                if (drh$b3.m.size() > 0) {
                    final Iterator iterator6 = drh$b3.m.iterator();
                    while (iterator6.hasNext()) {
                        ((drh$b$a)iterator6.next()).a(this, z0, drh$b3);
                    }
                }
            }
            for (final drh$b drh$b4 : u2.f) {
                if (drh$b4.m.size() > 0) {
                    final Iterator iterator8 = drh$b4.m.iterator();
                    while (iterator8.hasNext()) {
                        ((drh$b$a)iterator8.next()).a(this, z0, drh$b4);
                    }
                }
            }
        }
        if (this.U0.q()) {
            final drh$b c = this.U0.c;
            if (c != null) {
                final ttt l = c.l;
                if (l != null) {
                    final int d = l.d;
                    Object o;
                    if (d != -1) {
                        final View viewById = ((View)l.r).findViewById(d);
                        if ((o = viewById) == null) {
                            final StringBuilder g = w48.g("cannot find TouchAnchorId @id/");
                            g.append(za8.c(((View)l.r).getContext(), l.d));
                            Log.e("TouchResponse", g.toString());
                            o = viewById;
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o instanceof NestedScrollView) {
                        final NestedScrollView nestedScrollView = (NestedScrollView)o;
                        ((View)nestedScrollView).setOnTouchListener((View$OnTouchListener)new rtt());
                        nestedScrollView.setOnScrollChangeListener((NestedScrollView.c)new stt());
                    }
                }
            }
        }
    }
    
    public final void K() {
        if (this.n1 == null) {
            final CopyOnWriteArrayList<zqh.zqh$i> e1 = this.E1;
            if (e1 == null || e1.isEmpty()) {
                return;
            }
        }
        for (final Integer n : this.e2) {
            final zqh.zqh$i n2 = this.n1;
            if (n2 != null) {
                n.intValue();
                n2.a();
            }
            final CopyOnWriteArrayList<zqh.zqh$i> e2 = this.E1;
            if (e2 != null) {
                for (final zqh.zqh$i zqh$i : e2) {
                    n.intValue();
                    zqh$i.a();
                }
            }
        }
        this.e2.clear();
    }
    
    public final void L() {
        this.Z1.f();
        ((View)this).invalidate();
    }
    
    public final void M(int n) {
        this.setState(zqh.zqh$j.D0);
        this.Z0 = n;
        this.Y0 = -1;
        this.a1 = -1;
        final cj6 m0 = super.M0;
        if (m0 != null) {
            final float n2 = -1;
            final int b = m0.b;
            if (b == n) {
                cj6$a cj6$a;
                if (n == -1) {
                    cj6$a = (cj6$a)m0.d.valueAt(0);
                }
                else {
                    cj6$a = (cj6$a)m0.d.get(b);
                }
                n = m0.c;
                if (n == -1 || !((cj6$b)cj6$a.b.get(n)).a(n2, n2)) {
                    final int a = cj6$a.a(n2, n2);
                    if (m0.c != a) {
                        b f;
                        if (a == -1) {
                            f = null;
                        }
                        else {
                            f = cj6$a.b.get(a).f;
                        }
                        if (a != -1) {
                            n = ((cj6$b)cj6$a.b.get(a)).e;
                        }
                        if (f != null) {
                            m0.c = a;
                            f.b(m0.a);
                        }
                    }
                }
            }
            else {
                m0.b = n;
                final cj6$a cj6$a2 = (cj6$a)m0.d.get(n);
                final int a2 = cj6$a2.a(n2, n2);
                b b2;
                if (a2 == -1) {
                    b2 = cj6$a2.d;
                }
                else {
                    b2 = cj6$a2.b.get(a2).f;
                }
                if (a2 != -1) {
                    final int e = cj6$a2.b.get(a2).e;
                }
                if (b2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("NO Constraint set found ! id=");
                    sb.append(n);
                    sb.append(", dim =");
                    sb.append(n2);
                    sb.append(", ");
                    sb.append(n2);
                    Log.v("ConstraintLayoutStates", sb.toString());
                }
                else {
                    m0.c = a2;
                    b2.b(m0.a);
                }
            }
        }
        else {
            final drh u0 = this.U0;
            if (u0 != null) {
                u0.b(n).b((ConstraintLayout)this);
            }
        }
    }
    
    public final void N(final int n, final int n2) {
        if (!this.isAttachedToWindow()) {
            if (this.U1 == null) {
                this.U1 = new zqh.zqh$h(this);
            }
            final zqh.zqh$h u1 = this.U1;
            u1.c = n;
            u1.d = n2;
            return;
        }
        final drh u2 = this.U0;
        if (u2 != null) {
            u2.p(this.Y0 = n, this.a1 = n2);
            this.Z1.e(this.U0.b(n), this.U0.b(n2));
            this.L();
            this.A(this.i1 = 0.0f);
        }
    }
    
    public final void O(int z0, float k1, float z2) {
        final float n = k1;
        if (this.U0 == null) {
            return;
        }
        if (this.i1 == n) {
            return;
        }
        final int n2 = 1;
        this.q1 = true;
        this.f1 = this.getNanoTime();
        final float g1 = this.U0.c() / 1000.0f;
        this.g1 = g1;
        this.k1 = n;
        this.m1 = true;
        Label_0845: {
            if (z0 != 0 && z0 != 1 && z0 != 2) {
                if (z0 == 4) {
                    final d s1 = this.s1;
                    final float i1 = this.i1;
                    k1 = this.U0.h();
                    s1.a = z2;
                    s1.b = i1;
                    s1.c = k1;
                    this.V0 = this.s1;
                    break Label_0845;
                }
                if (z0 != 5) {
                    if (z0 != 6 && z0 != 7) {
                        break Label_0845;
                    }
                }
                else {
                    final float i2 = this.i1;
                    final float h = this.U0.h();
                    Label_0202: {
                        if (z2 > 0.0f) {
                            final float n3 = z2 / h;
                            if (z2 * n3 - h * n3 * n3 / 2.0f + i2 > 1.0f) {
                                z0 = n2;
                                break Label_0202;
                            }
                        }
                        else {
                            final float n4 = -z2 / h;
                            if (h * n4 * n4 / 2.0f + z2 * n4 + i2 < 0.0f) {
                                z0 = n2;
                                break Label_0202;
                            }
                        }
                        z0 = 0;
                    }
                    if (z0 != 0) {
                        final d s2 = this.s1;
                        final float i3 = this.i1;
                        k1 = this.U0.h();
                        s2.a = z2;
                        s2.b = i3;
                        s2.c = k1;
                        this.V0 = this.s1;
                        break Label_0845;
                    }
                    final rhr r1 = this.r1;
                    final float i4 = this.i1;
                    final float g2 = this.g1;
                    final float h2 = this.U0.h();
                    final drh$b c = this.U0.c;
                    float s3 = 0.0f;
                    Label_0322: {
                        if (c != null) {
                            final ttt l = c.l;
                            if (l != null) {
                                s3 = l.s;
                                break Label_0322;
                            }
                        }
                        s3 = 0.0f;
                    }
                    r1.b(i4, k1, z2, g2, h2, s3);
                    this.X0 = 0.0f;
                    z0 = this.Z0;
                    this.k1 = n;
                    this.Z0 = z0;
                    this.V0 = (xqh)this.r1;
                    break Label_0845;
                }
            }
            Label_0454: {
                if (z0 != 1 && z0 != 7) {
                    if (z0 != 2) {
                        k1 = n;
                        if (z0 != 6) {
                            break Label_0454;
                        }
                    }
                    k1 = 1.0f;
                }
                else {
                    k1 = 0.0f;
                }
            }
            final drh u0 = this.U0;
            final drh$b c2 = u0.c;
            Label_0495: {
                if (c2 != null) {
                    final ttt j = c2.l;
                    if (j != null) {
                        z0 = j.D;
                        break Label_0495;
                    }
                }
                z0 = 0;
            }
            if (z0 == 0) {
                final rhr r2 = this.r1;
                final float i5 = this.i1;
                final float h3 = u0.h();
                final drh$b c3 = this.U0.c;
                float s4 = 0.0f;
                Label_0557: {
                    if (c3 != null) {
                        final ttt m = c3.l;
                        if (m != null) {
                            s4 = m.s;
                            break Label_0557;
                        }
                    }
                    s4 = 0.0f;
                }
                r2.b(i5, k1, z2, g1, h3, s4);
            }
            else {
                final rhr r3 = this.r1;
                final float i6 = this.i1;
                Label_0615: {
                    if (c2 != null) {
                        final ttt l2 = c2.l;
                        if (l2 != null) {
                            z2 = l2.z;
                            break Label_0615;
                        }
                    }
                    z2 = 0.0f;
                }
                float a = 0.0f;
                Label_0645: {
                    if (c2 != null) {
                        final ttt l3 = c2.l;
                        if (l3 != null) {
                            a = l3.A;
                            break Label_0645;
                        }
                    }
                    a = 0.0f;
                }
                float y = 0.0f;
                Label_0675: {
                    if (c2 != null) {
                        final ttt l4 = c2.l;
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
                        final ttt l5 = c2.l;
                        if (l5 != null) {
                            b = l5.B;
                            break Label_0705;
                        }
                    }
                    b = 0.0f;
                }
                Label_0733: {
                    if (c2 != null) {
                        final ttt l6 = c2.l;
                        if (l6 != null) {
                            z0 = l6.C;
                            break Label_0733;
                        }
                    }
                    z0 = 0;
                }
                if (r3.b == null) {
                    r3.b = new w3r();
                }
                final w3r b2 = r3.b;
                r3.c = (qhr)b2;
                b2.c = k1;
                b2.a = y;
                b2.e = i6;
                b2.b = a;
                b2.g = z2;
                b2.h = b;
                b2.i = z0;
                b2.d = 0.0f;
            }
            z0 = this.Z0;
            this.k1 = k1;
            this.Z0 = z0;
            this.V0 = (xqh)this.r1;
        }
        this.l1 = false;
        this.f1 = this.getNanoTime();
        ((View)this).invalidate();
    }
    
    public final void P() {
        this.A(1.0f);
        this.V1 = null;
    }
    
    public final void Q(int i) {
        if (!this.isAttachedToWindow()) {
            if (this.U1 == null) {
                this.U1 = new zqh.zqh$h(this);
            }
            this.U1.d = i;
            return;
        }
        final drh u0 = this.U0;
        int a1 = i;
        if (u0 != null) {
            final q8r b = u0.b;
            a1 = i;
            if (b != null) {
                int n = this.Z0;
                final float n2 = -1;
                final q8r$a q8r$a = (q8r$a)b.b.get(i);
                Label_0255: {
                    if (q8r$a == null) {
                        n = i;
                    }
                    else {
                        final float n3 = fcmpl(n2, -1.0f);
                        if (n3 != 0 && n3 != 0) {
                            final Iterator iterator = q8r$a.b.iterator();
                            q8r$b q8r$b = null;
                            while (iterator.hasNext()) {
                                final q8r$b q8r$b2 = (q8r$b)iterator.next();
                                if (q8r$b2.a(n2, n2)) {
                                    if (n == q8r$b2.e) {
                                        break Label_0255;
                                    }
                                    q8r$b = q8r$b2;
                                }
                            }
                            if (q8r$b != null) {
                                n = q8r$b.e;
                            }
                            else {
                                n = q8r$a.c;
                            }
                        }
                        else if (q8r$a.c != n) {
                            final Iterator iterator2 = q8r$a.b.iterator();
                            while (iterator2.hasNext()) {
                                if (n == ((q8r$b)iterator2.next()).e) {
                                    break Label_0255;
                                }
                            }
                            n = q8r$a.c;
                        }
                    }
                }
                a1 = i;
                if (n != -1) {
                    a1 = n;
                }
            }
        }
        i = this.Z0;
        if (i != a1) {
            if (this.Y0 == a1) {
                this.A(0.0f);
            }
            else if (this.a1 == a1) {
                this.A(1.0f);
            }
            else {
                this.a1 = a1;
                if (i != -1) {
                    this.N(i, a1);
                    this.A(1.0f);
                    this.i1 = 0.0f;
                    this.P();
                }
                else {
                    final int n4 = 0;
                    this.q1 = false;
                    this.k1 = 1.0f;
                    this.h1 = 0.0f;
                    this.i1 = 0.0f;
                    this.j1 = this.getNanoTime();
                    this.f1 = this.getNanoTime();
                    this.l1 = false;
                    this.V0 = null;
                    this.g1 = this.U0.c() / 1000.0f;
                    this.Y0 = -1;
                    this.U0.p(-1, this.a1);
                    final SparseArray sparseArray = new SparseArray();
                    final int childCount = ((ViewGroup)this).getChildCount();
                    this.e1.clear();
                    View child;
                    for (i = 0; i < childCount; ++i) {
                        child = ((ViewGroup)this).getChildAt(i);
                        this.e1.put(child, new rqh(child));
                        sparseArray.put(child.getId(), (Object)this.e1.get(child));
                    }
                    this.m1 = true;
                    this.Z1.e((b)null, this.U0.b(a1));
                    this.L();
                    this.Z1.a();
                    int childCount2;
                    View child2;
                    rqh rqh;
                    arh f;
                    for (childCount2 = ((ViewGroup)this).getChildCount(), i = 0; i < childCount2; ++i) {
                        child2 = ((ViewGroup)this).getChildAt(i);
                        rqh = this.e1.get(child2);
                        if (rqh != null) {
                            f = rqh.f;
                            f.E0 = 0.0f;
                            f.F0 = 0.0f;
                            f.g(child2.getX(), child2.getY(), (float)child2.getWidth(), (float)child2.getHeight());
                            rqh.h.i(child2);
                        }
                    }
                    final int width = ((View)this).getWidth();
                    final int height = ((View)this).getHeight();
                    rqh rqh2;
                    for (i = 0; i < childCount; ++i) {
                        rqh2 = this.e1.get(((ViewGroup)this).getChildAt(i));
                        if (rqh2 != null) {
                            this.U0.g(rqh2);
                            rqh2.f(width, height, this.getNanoTime());
                        }
                    }
                    final drh$b c = this.U0.c;
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
                            final arh g = this.e1.get(((ViewGroup)this).getChildAt(n5)).g;
                            final float n6 = g.H0 + g.G0;
                            min = Math.min(min, n6);
                            max = Math.max(max, n6);
                            ++n5;
                        }
                        while (i < childCount) {
                            final rqh rqh3 = this.e1.get(((ViewGroup)this).getChildAt(i));
                            final arh g2 = rqh3.g;
                            final float g3 = g2.G0;
                            final float h0 = g2.H0;
                            rqh3.n = 1.0f / (1.0f - j);
                            rqh3.m = j - (g3 + h0 - min) * j / (max - min);
                            ++i;
                        }
                    }
                    this.h1 = 0.0f;
                    this.i1 = 0.0f;
                    this.m1 = true;
                    ((View)this).invalidate();
                }
            }
        }
    }
    
    public final void R(final int n, final b b) {
        final drh u0 = this.U0;
        if (u0 != null) {
            u0.g.put(n, (Object)b);
        }
        this.Z1.e(this.U0.b(this.Y0), this.U0.b(this.a1));
        this.L();
        if (this.Z0 == n) {
            b.b((ConstraintLayout)this);
        }
    }
    
    public final void S(final int n, final View... array) {
        final drh u0 = this.U0;
        if (u0 != null) {
            final hbx q = u0.q;
            Objects.requireNonNull(q);
            final ArrayList list = new ArrayList();
            final Iterator<gbx> iterator = q.b.iterator();
            gbx gbx = null;
            while (iterator.hasNext()) {
                final gbx gbx2 = iterator.next();
                if (gbx2.a == n) {
                    for (final View view : array) {
                        if (gbx2.b(view)) {
                            list.add(view);
                        }
                    }
                    if (!list.isEmpty()) {
                        final View[] array2 = list.toArray(new View[0]);
                        final int currentState = q.a.getCurrentState();
                        if (gbx2.e != 2) {
                            if (currentState == -1) {
                                final String d = q.d;
                                final StringBuilder g = w48.g("No support for ViewTransition within transition yet. Currently: ");
                                g.append(q.a.toString());
                                Log.w(d, g.toString());
                            }
                            else {
                                final b g2 = q.a.G(currentState);
                                if (g2 != null) {
                                    gbx2.a(q, q.a, currentState, g2, array2);
                                }
                            }
                        }
                        else {
                            gbx2.a(q, q.a, currentState, (b)null, array2);
                        }
                        list.clear();
                    }
                    gbx = gbx2;
                }
            }
            if (gbx == null) {
                Log.e(q.d, " Could not find ViewTransition");
            }
        }
        else {
            Log.e("MotionLayout", " no motionScene");
        }
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        this.C(false);
        final drh u0 = this.U0;
        if (u0 != null) {
            final hbx q = u0.q;
            if (q != null) {
                final ArrayList<gbx$a> e = q.e;
                if (e != null) {
                    final Iterator<gbx$a> iterator = e.iterator();
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
        if (this.U0 == null) {
            return;
        }
        if ((this.o1 & 0x1) == 0x1 && !((View)this).isInEditMode()) {
            ++this.F1;
            final long nanoTime = this.getNanoTime();
            final long g1 = this.G1;
            if (g1 != -1L) {
                final long n = nanoTime - g1;
                if (n > 200000000L) {
                    this.H1 = (int)(this.F1 / (n * 1.0E-9f) * 100.0f) / 100.0f;
                    this.F1 = 0;
                    this.G1 = nanoTime;
                }
            }
            else {
                this.G1 = nanoTime;
            }
            final Paint paint = new Paint();
            paint.setTextSize(42.0f);
            final float n2 = (int)(this.getProgress() * 1000.0f) / 10.0f;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.H1);
            sb.append(" fps ");
            sb.append(za8.e(this, this.Y0));
            sb.append(" -> ");
            final StringBuilder g2 = w48.g(sb.toString());
            g2.append(za8.e(this, this.a1));
            g2.append(" (progress: ");
            g2.append(n2);
            g2.append(" ) state=");
            final int z0 = this.Z0;
            String e2;
            if (z0 == -1) {
                e2 = "undefined";
            }
            else {
                e2 = za8.e(this, z0);
            }
            g2.append(e2);
            final String string = g2.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, (float)(((View)this).getHeight() - 29), paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, (float)(((View)this).getHeight() - 30), paint);
        }
        if (this.o1 > 1) {
            if (this.p1 == null) {
                this.p1 = new zqh.zqh$e(this);
            }
            final zqh.zqh$e p = this.p1;
            final HashMap<View, rqh> e3 = this.e1;
            final int c = this.U0.c();
            final int o1 = this.o1;
            Objects.requireNonNull(p);
            if (e3 != null) {
                if (e3.size() != 0) {
                    canvas.save();
                    if (!((View)p.n).isInEditMode() && (o1 & 0x1) == 0x2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(((View)p.n).getContext().getResources().getResourceName(p.n.a1));
                        sb2.append(":");
                        sb2.append(p.n.getProgress());
                        final String string2 = sb2.toString();
                        canvas.drawText(string2, 10.0f, (float)(((View)p.n).getHeight() - 30), p.h);
                        canvas.drawText(string2, 11.0f, (float)(((View)p.n).getHeight() - 29), p.e);
                    }
                    final Iterator<rqh> iterator2 = e3.values().iterator();
                    Canvas canvas2 = canvas;
                    while (iterator2.hasNext()) {
                        final rqh rqh = iterator2.next();
                        int n3 = rqh.f.D0;
                        final Iterator iterator3 = rqh.u.iterator();
                        while (iterator3.hasNext()) {
                            n3 = Math.max(n3, ((arh)iterator3.next()).D0);
                        }
                        int max;
                        final int n4 = max = Math.max(n3, rqh.g.D0);
                        if (o1 > 0 && (max = n4) == 0) {
                            max = 1;
                        }
                        if (max == 0) {
                            continue;
                        }
                        final float[] c2 = p.c;
                        final int[] b = p.b;
                        int k;
                        if (c2 != null) {
                            final double[] f = rqh.j[0].f();
                            if (b != null) {
                                final Iterator iterator4 = rqh.u.iterator();
                                int n5 = 0;
                                while (iterator4.hasNext()) {
                                    b[n5] = ((arh)iterator4.next()).Q0;
                                    ++n5;
                                }
                            }
                            int i = 0;
                            int n6 = 0;
                            while (i < f.length) {
                                rqh.j[0].c(f[i], rqh.p);
                                rqh.f.f(f[i], rqh.o, rqh.p, c2, n6);
                                n6 += 2;
                                ++i;
                            }
                            k = n6 / 2;
                        }
                        else {
                            k = 0;
                        }
                        p.k = k;
                        if (max < 1) {
                            continue;
                        }
                        final int n7 = c / 16;
                        final float[] a = p.a;
                        if (a == null || a.length != n7 * 2) {
                            p.a = new float[n7 * 2];
                            p.d = new Path();
                        }
                        final float n8 = (float)p.m;
                        canvas2.translate(n8, n8);
                        p.e.setColor(1996488704);
                        p.i.setColor(1996488704);
                        p.f.setColor(1996488704);
                        p.g.setColor(1996488704);
                        final float[] a2 = p.a;
                        float n9 = 1.0f / (n7 - 1);
                        final HashMap y = rqh.y;
                        p1r p1r;
                        if (y == null) {
                            p1r = null;
                        }
                        else {
                            p1r = y.get("translationX");
                        }
                        final p1r p1r2 = p1r;
                        final HashMap y2 = rqh.y;
                        p1r p1r3;
                        if (y2 == null) {
                            p1r3 = null;
                        }
                        else {
                            p1r3 = y2.get("translationY");
                        }
                        final p1r p1r4 = p1r3;
                        final HashMap z2 = rqh.z;
                        wpe wpe;
                        if (z2 == null) {
                            wpe = null;
                        }
                        else {
                            wpe = z2.get("translationX");
                        }
                        final HashMap z3 = rqh.z;
                        m9x m9x;
                        if (z3 == null) {
                            m9x = null;
                        }
                        else {
                            m9x = z3.get("translationY");
                        }
                        final m9x m9x2 = m9x;
                        int j = 0;
                        final p1r p1r5 = p1r2;
                        final p1r p1r6 = p1r4;
                        final m9x m9x3 = m9x2;
                        while (j < n7) {
                            final float n10 = j * n9;
                            final float n11 = rqh.n;
                            float min = n10;
                            if (n11 != 1.0f) {
                                final float m = rqh.m;
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
                            bq9 c3 = rqh.f.C0;
                            final Iterator iterator5 = rqh.u.iterator();
                            float n14 = Float.NaN;
                            float n15 = 0.0f;
                            final float n16 = n9;
                            while (iterator5.hasNext()) {
                                final arh arh = (arh)iterator5.next();
                                final bq9 c4 = arh.C0;
                                bq9 bq9 = c3;
                                float e4 = n14;
                                float e5 = n15;
                                if (c4 != null) {
                                    e5 = arh.E0;
                                    if (e5 < min) {
                                        bq9 = c4;
                                        e4 = n14;
                                    }
                                    else {
                                        bq9 = c3;
                                        e4 = n14;
                                        e5 = n15;
                                        if (Float.isNaN(n14)) {
                                            e4 = arh.E0;
                                            e5 = n15;
                                            bq9 = c3;
                                        }
                                    }
                                }
                                c3 = bq9;
                                n14 = e4;
                                n15 = e5;
                            }
                            if (c3 != null) {
                                float n17 = n14;
                                if (Float.isNaN(n14)) {
                                    n17 = 1.0f;
                                }
                                final float n18 = n17 - n15;
                                n13 = (float)c3.a((double)((min - n15) / n18)) * n18 + n15;
                            }
                            rqh.j[0].c(n13, rqh.p);
                            final zr0 l = rqh.k;
                            if (l != null) {
                                final double[] p2 = rqh.p;
                                if (p2.length > 0) {
                                    l.c(n13, p2);
                                }
                            }
                            final arh f2 = rqh.f;
                            final int[] o2 = rqh.o;
                            final double[] p3 = rqh.p;
                            int n19 = j * 2;
                            f2.f(n13, o2, p3, a2, n19);
                            if (wpe != null) {
                                a2[n19] += wpe.a(min);
                            }
                            else if (p1r5 != null) {
                                a2[n19] += p1r5.a(min);
                            }
                            if (m9x3 != null) {
                                ++n19;
                                a2[n19] += m9x3.a(min);
                            }
                            else if (p1r6 != null) {
                                ++n19;
                                a2[n19] += p1r6.a(min);
                            }
                            ++j;
                            n9 = n16;
                        }
                        p.a(canvas, max, p.k, rqh);
                        p.e.setColor(-21965);
                        p.f.setColor(-2067046);
                        p.i.setColor(-2067046);
                        p.g.setColor(-13391360);
                        final float n20 = (float)(-p.m);
                        canvas.translate(n20, n20);
                        p.a(canvas, max, p.k, rqh);
                        if (max == 5) {
                            p.d.reset();
                            for (int n21 = 0; n21 <= 50; ++n21) {
                                final float n22 = n21 / (float)50;
                                final float[] j2 = p.j;
                                rqh.j[0].c(rqh.a(n22, (float[])null), rqh.p);
                                final arh f3 = rqh.f;
                                final int[] o3 = rqh.o;
                                final double[] p4 = rqh.p;
                                float g3 = f3.G0;
                                float h0 = f3.H0;
                                float i2 = f3.I0;
                                float j3 = f3.J0;
                                for (int n23 = 0; n23 < o3.length; ++n23) {
                                    final float n24 = (float)p4[n23];
                                    final int n25 = o3[n23];
                                    if (n25 != 1) {
                                        if (n25 != 2) {
                                            if (n25 != 3) {
                                                if (n25 == 4) {
                                                    j3 = n24;
                                                }
                                            }
                                            else {
                                                i2 = n24;
                                            }
                                        }
                                        else {
                                            h0 = n24;
                                        }
                                    }
                                    else {
                                        g3 = n24;
                                    }
                                }
                                if (f3.O0 != null) {
                                    final double n26 = 0.0f;
                                    final double n27 = g3;
                                    final double n28 = h0;
                                    g3 = (float)(Math.sin(n28) * n27 + n26 - i2 / 2.0f);
                                    h0 = (float)(n26 - Math.cos(n28) * n27 - j3 / 2.0f);
                                }
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                final float n29 = g3 + 0.0f;
                                final float n30 = h0 + 0.0f;
                                final float n31 = i2 + g3 + 0.0f;
                                final float n32 = j3 + h0 + 0.0f;
                                j2[0] = n29;
                                j2[1] = n30;
                                j2[2] = n31;
                                j2[3] = n30;
                                j2[4] = n31;
                                j2[5] = n32;
                                j2[6] = n29;
                                j2[7] = n32;
                                final Path d = p.d;
                                final float[] j4 = p.j;
                                d.moveTo(j4[0], j4[1]);
                                final Path d2 = p.d;
                                final float[] j5 = p.j;
                                d2.lineTo(j5[2], j5[3]);
                                final Path d3 = p.d;
                                final float[] j6 = p.j;
                                d3.lineTo(j6[4], j6[5]);
                                final Path d4 = p.d;
                                final float[] j7 = p.j;
                                d4.lineTo(j7[6], j7[7]);
                                p.d.close();
                            }
                            p.e.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(p.d, p.e);
                            canvas.translate(-2.0f, -2.0f);
                            p.e.setColor(-65536);
                            canvas.drawPath(p.d, p.e);
                        }
                        canvas2 = canvas;
                    }
                    canvas.restore();
                }
            }
        }
    }
    
    public int[] getConstraintSetIds() {
        final drh u0 = this.U0;
        if (u0 == null) {
            return null;
        }
        final int size = u0.g.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = u0.g.keyAt(i);
        }
        return array;
    }
    
    public int getCurrentState() {
        return this.Z0;
    }
    
    public ArrayList<drh$b> getDefinedTransitions() {
        final drh u0 = this.U0;
        if (u0 == null) {
            return null;
        }
        return u0.d;
    }
    
    public ur8 getDesignTool() {
        if (this.t1 == null) {
            this.t1 = new ur8();
        }
        return this.t1;
    }
    
    public int getEndState() {
        return this.a1;
    }
    
    public long getNanoTime() {
        return System.nanoTime();
    }
    
    public float getProgress() {
        return this.i1;
    }
    
    public drh getScene() {
        return this.U0;
    }
    
    public int getStartState() {
        return this.Y0;
    }
    
    public float getTargetPosition() {
        return this.k1;
    }
    
    public Bundle getTransitionState() {
        if (this.U1 == null) {
            this.U1 = new zqh.zqh$h(this);
        }
        final zqh.zqh$h u1 = this.U1;
        final zqh e = u1.e;
        u1.d = e.a1;
        u1.c = e.Y0;
        u1.b = e.getVelocity();
        u1.a = u1.e.getProgress();
        final zqh.zqh$h u2 = this.U1;
        Objects.requireNonNull(u2);
        final Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", u2.a);
        bundle.putFloat("motion.velocity", u2.b);
        ((BaseBundle)bundle).putInt("motion.StartState", u2.c);
        ((BaseBundle)bundle).putInt("motion.EndState", u2.d);
        return bundle;
    }
    
    public long getTransitionTimeMs() {
        final drh u0 = this.U0;
        if (u0 != null) {
            this.g1 = u0.c() / 1000.0f;
        }
        return (long)(this.g1 * 1000.0f);
    }
    
    public float getVelocity() {
        return this.X0;
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        this.z1 = this.getNanoTime();
        this.A1 = 0.0f;
        this.x1 = 0.0f;
        this.y1 = 0.0f;
    }
    
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }
    
    public final void j(final View view, int n) {
        final drh u0 = this.U0;
        if (u0 != null) {
            final float a1 = this.A1;
            final float n2 = 0.0f;
            if (a1 != 0.0f) {
                final float n3 = this.x1 / a1;
                final float n4 = this.y1 / a1;
                final drh$b c = u0.c;
                if (c != null) {
                    final ttt l = c.l;
                    if (l != null) {
                        boolean b = false;
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
                                b = true;
                            }
                            if (((b ? 1 : 0) & n) != 0x0) {
                                final zqh r = l.r;
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
        final drh u0 = this.U0;
        if (u0 == null) {
            return;
        }
        final drh$b c = u0.c;
        if (c != null) {
            e = ((c.o ^ true) ? 1 : 0);
            if (e != 0) {
                final int n3 = -1;
                if (e != 0) {
                    final ttt l = c.l;
                    if (l != null) {
                        e = l.e;
                        if (e != -1 && view.getId() != e) {
                            return;
                        }
                    }
                }
                final drh$b c2 = u0.c;
                boolean u2 = false;
                Label_0121: {
                    if (c2 != null) {
                        final ttt i = c2.l;
                        if (i != null) {
                            u2 = i.u;
                            break Label_0121;
                        }
                    }
                    u2 = false;
                }
                if (u2) {
                    final ttt j = c.l;
                    e = n3;
                    if (j != null) {
                        e = n3;
                        if ((j.w & 0x4) != 0x0) {
                            e = n2;
                        }
                    }
                    final float h1 = this.h1;
                    if ((h1 == 1.0f || h1 == 0.0f) && view.canScrollVertically(e)) {
                        return;
                    }
                }
                final ttt k = c.l;
                if (k != null && (k.w & 0x1) != 0x0) {
                    final float n4 = (float)n;
                    final float n5 = (float)n2;
                    final drh$b c3 = u0.c;
                    float n7 = 0.0f;
                    Label_0379: {
                        if (c3 != null) {
                            final ttt m = c3.l;
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
                    final float i2 = this.i1;
                    if ((i2 <= 0.0f && n7 < 0.0f) || (i2 >= 1.0f && n7 > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post((Runnable)new zqh$b(view));
                        return;
                    }
                }
                final float h2 = this.h1;
                final long nanoTime = this.getNanoTime();
                final float x1 = (float)n;
                this.x1 = x1;
                final float y1 = (float)n2;
                this.y1 = y1;
                this.A1 = (float)((nanoTime - this.z1) * 1.0E-9);
                this.z1 = nanoTime;
                final drh$b c4 = u0.c;
                if (c4 != null) {
                    final ttt l2 = c4.l;
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
                            n11 = x1 * k4 / l2.n[0];
                        }
                        else {
                            n11 = y1 * l2.l / l2.n[1];
                        }
                        final float max = Math.max(Math.min(progress + n11, 1.0f), 0.0f);
                        if (max != l2.r.getProgress()) {
                            l2.r.setProgress(max);
                        }
                    }
                }
                if (h2 != this.h1) {
                    array[0] = n;
                    array[1] = n2;
                }
                this.C(false);
                if (array[0] != 0 || array[1] != 0) {
                    this.w1 = true;
                }
            }
        }
    }
    
    public final void m(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (this.w1 || n != 0 || n2 != 0) {
            array[0] += n3;
            array[1] += n4;
        }
        this.w1 = false;
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        final drh u0 = this.U0;
        if (u0 != null) {
            final drh$b c = u0.c;
            if (c != null) {
                final ttt l = c.l;
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
        final drh u0 = this.U0;
        if (u0 != null) {
            final int z0 = this.Z0;
            if (z0 != -1) {
                final b b = u0.b(z0);
                this.U0.o(this);
                if (b != null) {
                    b.b((ConstraintLayout)this);
                }
                this.Y0 = this.Z0;
            }
        }
        this.J();
        final zqh.zqh$h u2 = this.U1;
        if (u2 != null) {
            if (this.X1) {
                ((View)this).post((Runnable)new zqh$c(this));
            }
            else {
                u2.a();
            }
        }
        else {
            final drh u3 = this.U0;
            if (u3 != null) {
                final drh$b c = u3.c;
                if (c != null && c.n == 4) {
                    this.P();
                    this.setState(zqh.zqh$j.D0);
                    this.setState(zqh.zqh$j.E0);
                }
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final drh u0 = this.U0;
        if (u0 != null) {
            if (this.d1) {
                final hbx q = u0.q;
                if (q != null) {
                    final int currentState = q.a.getCurrentState();
                    if (currentState != -1) {
                        if (q.c == null) {
                            q.c = new HashSet<View>();
                            for (final gbx gbx : q.b) {
                                for (int childCount = ((ViewGroup)q.a).getChildCount(), i = 0; i < childCount; ++i) {
                                    final View child = ((ViewGroup)q.a).getChildAt(i);
                                    if (gbx.c(child)) {
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
                        final ArrayList<gbx$a> e = q.e;
                        int n = 2;
                        if (e != null && !e.isEmpty()) {
                            for (final gbx$a gbx$a : q.e) {
                                Objects.requireNonNull(gbx$a);
                                if (action != 1) {
                                    if (action != 2) {
                                        continue;
                                    }
                                    gbx$a.c.b.getHitRect(gbx$a.l);
                                    if (gbx$a.l.contains((int)x, (int)y) || gbx$a.h) {
                                        continue;
                                    }
                                    gbx$a.b();
                                }
                                else {
                                    if (gbx$a.h) {
                                        continue;
                                    }
                                    gbx$a.b();
                                }
                            }
                        }
                        if (action == 0 || action == 1) {
                            final b g = q.a.G(currentState);
                            for (final gbx gbx2 : q.b) {
                                final int b = gbx2.b;
                                if ((b != 1) ? ((b != n) ? (b == 3 && action == 0) : (action == 1)) : (action == 0)) {
                                    final Iterator<View> iterator4 = q.c.iterator();
                                    int n2 = n;
                                    while (true) {
                                        n = n2;
                                        if (!iterator4.hasNext()) {
                                            break;
                                        }
                                        final View view = iterator4.next();
                                        if (!gbx2.c(view)) {
                                            continue;
                                        }
                                        view.getHitRect(rect);
                                        if (rect.contains((int)x, (int)y)) {
                                            gbx2.a(q, q.a, currentState, g, new View[] { view });
                                        }
                                        n2 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                final drh$b c = this.U0.c;
                if (c != null && (c.o ^ true)) {
                    final ttt l = c.l;
                    if (l != null) {
                        if (motionEvent.getAction() == 0) {
                            final RectF b2 = l.b((ViewGroup)this, new RectF());
                            if (b2 != null && !b2.contains(motionEvent.getX(), motionEvent.getY())) {
                                return false;
                            }
                        }
                        final int e2 = l.e;
                        if (e2 != -1) {
                            final View c2 = this.c2;
                            if (c2 == null || c2.getId() != e2) {
                                this.c2 = ((View)this).findViewById(e2);
                            }
                            final View c3 = this.c2;
                            if (c3 != null) {
                                this.b2.set((float)c3.getLeft(), (float)this.c2.getTop(), (float)this.c2.getRight(), (float)this.c2.getBottom());
                                if (this.b2.contains(motionEvent.getX(), motionEvent.getY()) && !this.H((float)this.c2.getLeft(), (float)this.c2.getTop(), this.c2, motionEvent)) {
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
    
    public final void onLayout(final boolean b, int u1, int v1, final int n, final int n2) {
        this.T1 = true;
        try {
            if (this.U0 == null) {
                super.onLayout(b, u1, v1, n, n2);
                return;
            }
            u1 = n - u1;
            v1 = n2 - v1;
            if (this.u1 != u1 || this.v1 != v1) {
                this.L();
                this.C(true);
            }
            this.u1 = u1;
            this.v1 = v1;
        }
        finally {
            this.T1 = false;
        }
    }
    
    public final void onMeasure(int i, int c1) {
        if (this.U0 == null) {
            super.onMeasure(i, c1);
            return;
        }
        final int b1 = this.b1;
        final int n = 0;
        final int n2 = 1;
        boolean b2 = b1 != i || this.c1 != c1;
        if (this.a2) {
            this.a2 = false;
            this.J();
            this.K();
            b2 = true;
        }
        if (super.J0) {
            b2 = true;
        }
        this.b1 = i;
        this.c1 = c1;
        final int j = this.U0.i();
        final int d = this.U0.d();
        Label_0237: {
            Label_0225: {
                if (!b2) {
                    final zqh.zqh$f z1 = this.Z1;
                    if (j == z1.e && d == z1.f) {
                        break Label_0225;
                    }
                }
                if (this.Y0 != -1) {
                    super.onMeasure(i, c1);
                    this.Z1.e(this.U0.b(j), this.U0.b(d));
                    this.Z1.f();
                    final zqh.zqh$f z2 = this.Z1;
                    z2.e = j;
                    z2.f = d;
                    i = 0;
                    break Label_0237;
                }
            }
            if (b2) {
                super.onMeasure(i, c1);
            }
            i = 1;
        }
        if (this.K1 || i != 0) {
            c1 = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int paddingLeft = ((View)this).getPaddingLeft();
            i = ((View)this).getPaddingRight();
            i = super.E0.x() + (i + paddingLeft);
            c1 = super.E0.q() + (paddingBottom + c1);
            final int p2 = this.P1;
            if (p2 == Integer.MIN_VALUE || p2 == 0) {
                i = this.L1;
                i += (int)(this.R1 * (this.N1 - i));
                this.requestLayout();
            }
            final int q1 = this.Q1;
            if (q1 == Integer.MIN_VALUE || q1 == 0) {
                c1 = this.M1;
                c1 += (int)(this.R1 * (this.O1 - c1));
                this.requestLayout();
            }
            ((View)this).setMeasuredDimension(i, c1);
        }
        final float signum = Math.signum(this.k1 - this.i1);
        final long nanoTime = this.getNanoTime();
        final xqh v0 = this.V0;
        float n3;
        if (!(v0 instanceof rhr)) {
            n3 = (nanoTime - this.j1) * signum * 1.0E-9f / this.g1;
        }
        else {
            n3 = 0.0f;
        }
        float n4 = this.i1 + n3;
        if (this.l1) {
            n4 = this.k1;
        }
        c1 = fcmpl(signum, 0.0f);
        if ((c1 > 0 && n4 >= this.k1) || (signum <= 0.0f && n4 <= this.k1)) {
            n4 = this.k1;
            i = n2;
        }
        else {
            i = 0;
        }
        float n5 = n4;
        if (v0 != null) {
            n5 = n4;
            if (i == 0) {
                if (this.q1) {
                    n5 = ((TimeInterpolator)v0).getInterpolation((nanoTime - this.f1) * 1.0E-9f);
                }
                else {
                    n5 = ((TimeInterpolator)v0).getInterpolation(n4);
                }
            }
        }
        float r1 = 0.0f;
        Label_0630: {
            if (c1 <= 0 || n5 < this.k1) {
                r1 = n5;
                if (signum > 0.0f) {
                    break Label_0630;
                }
                r1 = n5;
                if (n5 > this.k1) {
                    break Label_0630;
                }
            }
            r1 = this.k1;
        }
        this.R1 = r1;
        c1 = ((ViewGroup)this).getChildCount();
        final long nanoTime2 = this.getNanoTime();
        final Interpolator w0 = this.W0;
        if (w0 == null) {
            i = n;
        }
        else {
            r1 = ((TimeInterpolator)w0).getInterpolation(r1);
            i = n;
        }
        while (i < c1) {
            final View child = ((ViewGroup)this).getChildAt(i);
            final rqh rqh = this.e1.get(child);
            if (rqh != null) {
                rqh.c(child, r1, nanoTime2, this.S1);
            }
            ++i;
        }
        if (this.K1) {
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
        final drh u0 = this.U0;
        if (u0 != null) {
            final boolean s = this.s();
            u0.p = s;
            final drh$b c = u0.c;
            if (c != null) {
                final ttt l = c.l;
                if (l != null) {
                    l.c(s);
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent l) {
        final drh u0 = this.U0;
        if (u0 == null || !this.d1 || !u0.q()) {
            return super.onTouchEvent(l);
        }
        final drh u2 = this.U0;
        final drh$b c = u2.c;
        if (c != null && !(c.o ^ true)) {
            return super.onTouchEvent(l);
        }
        final int currentState = this.getCurrentState();
        final RectF rectF = new RectF();
        if (u2.o == null) {
            Objects.requireNonNull(u2.a);
            final zqh.zqh$g b = zqh.zqh$g.b;
            b.a = VelocityTracker.obtain();
            u2.o = b;
        }
        u2.o.a(l);
        if (currentState != -1) {
            final int action = l.getAction();
            if (action != 0) {
                if (action == 2) {
                    if (!u2.m) {
                        final float n = l.getRawY() - u2.s;
                        final float n2 = l.getRawX() - u2.r;
                        if (n2 == 0.0 && n == 0.0) {
                            return !this.U0.c.a(4) || this.U0.c.l.m;
                        }
                        final MotionEvent i = u2.l;
                        if (i == null) {
                            return !this.U0.c.a(4) || this.U0.c.l.m;
                        }
                        drh$b c2;
                        if (currentState != -1) {
                            final q8r b2 = u2.b;
                            int a = 0;
                            Label_0243: {
                                if (b2 != null) {
                                    a = b2.a(currentState);
                                    if (a != -1) {
                                        break Label_0243;
                                    }
                                }
                                a = currentState;
                            }
                            final ArrayList<drh$b> list = new ArrayList<drh$b>();
                            for (final drh$b drh$b : u2.d) {
                                if (drh$b.d == a || drh$b.c == a) {
                                    list.add(drh$b);
                                }
                            }
                            final RectF rectF2 = new RectF();
                            final Iterator<drh$b> iterator2 = list.iterator();
                            float n3 = 0.0f;
                            c2 = null;
                            while (iterator2.hasNext()) {
                                final drh$b drh$b2 = iterator2.next();
                                if (drh$b2.o) {
                                    continue;
                                }
                                final ttt j = drh$b2.l;
                                if (j == null) {
                                    continue;
                                }
                                j.c(u2.p);
                                final RectF b3 = drh$b2.l.b((ViewGroup)u2.a, rectF2);
                                if (b3 != null && !b3.contains(i.getX(), i.getY())) {
                                    continue;
                                }
                                final RectF a2 = drh$b2.l.a((ViewGroup)u2.a, rectF2);
                                if (a2 != null && !a2.contains(i.getX(), i.getY())) {
                                    continue;
                                }
                                final ttt k = drh$b2.l;
                                float n4 = k.l * n + k.k * n2;
                                if (k.j) {
                                    final float x = i.getX();
                                    Objects.requireNonNull(drh$b2.l);
                                    final float n5 = x - 0.5f;
                                    final float y = i.getY();
                                    Objects.requireNonNull(drh$b2.l);
                                    final float n6 = y - 0.5f;
                                    n4 = (float)(Math.atan2(n + n6, n2 + n5) - Math.atan2(n5, n6)) * 10.0f;
                                }
                                float n7;
                                if (drh$b2.c == currentState) {
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
                                c2 = drh$b2;
                            }
                        }
                        else {
                            c2 = u2.c;
                        }
                        if (c2 != null) {
                            this.setTransition(c2);
                            final RectF b4 = u2.c.l.b((ViewGroup)u2.a, rectF);
                            u2.n = (b4 != null && !b4.contains(u2.l.getX(), u2.l.getY()));
                            final ttt m = u2.c.l;
                            final float r = u2.r;
                            final float s = u2.s;
                            m.p = r;
                            m.q = s;
                            m.m = false;
                        }
                    }
                }
            }
            else {
                u2.r = l.getRawX();
                u2.s = l.getRawY();
                u2.l = l;
                u2.m = false;
                final ttt l2 = u2.c.l;
                if (l2 == null) {
                    return !this.U0.c.a(4) || this.U0.c.l.m;
                }
                final RectF a3 = l2.a((ViewGroup)u2.a, rectF);
                if (a3 != null && !a3.contains(u2.l.getX(), u2.l.getY())) {
                    u2.l = null;
                    u2.m = true;
                    return !this.U0.c.a(4) || this.U0.c.l.m;
                }
                final RectF b5 = u2.c.l.b((ViewGroup)u2.a, rectF);
                if (b5 != null && !b5.contains(u2.l.getX(), u2.l.getY())) {
                    u2.n = true;
                }
                else {
                    u2.n = false;
                }
                final ttt l3 = u2.c.l;
                final float r2 = u2.r;
                final float s2 = u2.s;
                l3.p = r2;
                l3.q = s2;
                return !this.U0.c.a(4) || this.U0.c.l.m;
            }
        }
        if (!u2.m) {
            final drh$b c3 = u2.c;
            Label_3434: {
                if (c3 != null) {
                    final ttt l4 = c3.l;
                    if (l4 != null && !u2.n) {
                        final zqh.zqh$g o = u2.o;
                        final zqh.zqh$j f0 = zqh.zqh$j.F0;
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
                                                final zqh r3 = l4.r;
                                                final View viewById2 = ((View)l4.r).findViewById(r3.e1.get(((View)r3).findViewById(d)).f.M0);
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
                                                l4.r.X0 = (float)Math.toDegrees((float)(Math.sin(Math.atan2(n19, n20) - atan2) * Math.hypot(n19, n20) / Math.hypot(rawX - n14, rawY - n13)));
                                            }
                                            else {
                                                l4.r.X0 = 0.0f;
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
                                    Label_2087: {
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
                                                break Label_2087;
                                            }
                                            final zqh r4 = l4.r;
                                            final View viewById4 = ((View)l4.r).findViewById(r4.e1.get(((View)r4).findViewById(d4)).f.M0);
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
                                                l4.r.setState(f0);
                                            }
                                            break Label_3434;
                                        }
                                    }
                                    if (0.0f >= n32 || 1.0f <= n32) {
                                        l4.r.setState(f0);
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
                                                float x2;
                                                if (l4.k != 0.0f) {
                                                    x2 = c7 / l4.n[0];
                                                }
                                                else {
                                                    x2 = d7 / l4.n[1];
                                                }
                                                l4.r.X0 = x2;
                                            }
                                            else {
                                                l4.r.X0 = 0.0f;
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
                                                l4.r.setState(f0);
                                            }
                                            break Label_3434;
                                        }
                                    }
                                    if (0.0f >= n54 || 1.0f <= n54) {
                                        l4.r.setState(f0);
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
            u2.r = l.getRawX();
            u2.s = l.getRawY();
            if (l.getAction() == 1) {
                final zqh.zqh$g o2 = u2.o;
                if (o2 != null) {
                    final VelocityTracker a4 = o2.a;
                    if (a4 != null) {
                        a4.recycle();
                        o2.a = null;
                    }
                    u2.o = null;
                    final int z0 = this.Z0;
                    if (z0 != -1) {
                        u2.a(this, z0);
                    }
                }
            }
        }
        return !this.U0.c.a(4) || this.U0.c.l.m;
    }
    
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        if (view instanceof wqh) {
            final wqh wqh = (wqh)view;
            if (this.E1 == null) {
                this.E1 = new CopyOnWriteArrayList<zqh.zqh$i>();
            }
            this.E1.add((zqh.zqh$i)wqh);
            if (wqh.K0) {
                if (this.C1 == null) {
                    this.C1 = new ArrayList<wqh>();
                }
                this.C1.add(wqh);
            }
            if (wqh.L0) {
                if (this.D1 == null) {
                    this.D1 = new ArrayList<wqh>();
                }
                this.D1.add(wqh);
            }
        }
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        final ArrayList<wqh> c1 = this.C1;
        if (c1 != null) {
            c1.remove(view);
        }
        final ArrayList<wqh> d1 = this.D1;
        if (d1 != null) {
            d1.remove(view);
        }
    }
    
    public final void requestLayout() {
        if (!this.K1 && this.Z0 == -1) {
            final drh u0 = this.U0;
            if (u0 != null) {
                final drh$b c = u0.c;
                if (c != null) {
                    final int q = c.q;
                    if (q == 0) {
                        return;
                    }
                    if (q == 2) {
                        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                            this.e1.get(((ViewGroup)this).getChildAt(i)).d = true;
                        }
                        return;
                    }
                }
            }
        }
        super.requestLayout();
    }
    
    public void setDebugMode(final int o1) {
        this.o1 = o1;
        ((View)this).invalidate();
    }
    
    public void setDelayedApplicationOfInitialState(final boolean x1) {
        this.X1 = x1;
    }
    
    public void setInteractionEnabled(final boolean d1) {
        this.d1 = d1;
    }
    
    public void setInterpolatedProgress(final float progress) {
        if (this.U0 != null) {
            this.setState(zqh.zqh$j.E0);
            final Interpolator f = this.U0.f();
            if (f != null) {
                this.setProgress(((TimeInterpolator)f).getInterpolation(progress));
                return;
            }
        }
        this.setProgress(progress);
    }
    
    public void setOnHide(final float progress) {
        final ArrayList<wqh> d1 = this.D1;
        if (d1 != null) {
            for (int size = d1.size(), i = 0; i < size; ++i) {
                this.D1.get(i).setProgress(progress);
            }
        }
    }
    
    public void setOnShow(final float progress) {
        final ArrayList<wqh> c1 = this.C1;
        if (c1 != null) {
            for (int size = c1.size(), i = 0; i < size; ++i) {
                this.C1.get(i).setProgress(progress);
            }
        }
    }
    
    public void setProgress(final float h1) {
        final zqh.zqh$j f0 = zqh.zqh$j.F0;
        final zqh.zqh$j e0 = zqh.zqh$j.E0;
        final float n = fcmpg(h1, 0.0f);
        if (n < 0 || h1 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!this.isAttachedToWindow()) {
            if (this.U1 == null) {
                this.U1 = new zqh.zqh$h(this);
            }
            this.U1.a = h1;
            return;
        }
        if (n <= 0) {
            if (this.i1 == 1.0f && this.Z0 == this.a1) {
                this.setState(e0);
            }
            this.Z0 = this.Y0;
            if (this.i1 == 0.0f) {
                this.setState(f0);
            }
        }
        else if (h1 >= 1.0f) {
            if (this.i1 == 0.0f && this.Z0 == this.Y0) {
                this.setState(e0);
            }
            this.Z0 = this.a1;
            if (this.i1 == 1.0f) {
                this.setState(f0);
            }
        }
        else {
            this.Z0 = -1;
            this.setState(e0);
        }
        if (this.U0 == null) {
            return;
        }
        this.l1 = true;
        this.k1 = h1;
        this.h1 = h1;
        this.j1 = -1L;
        this.f1 = -1L;
        this.V0 = null;
        this.m1 = true;
        ((View)this).invalidate();
    }
    
    public void setScene(final drh u0) {
        this.U0 = u0;
        final boolean s = this.s();
        u0.p = s;
        final drh$b c = u0.c;
        if (c != null) {
            final ttt l = c.l;
            if (l != null) {
                l.c(s);
            }
        }
        this.L();
    }
    
    public void setStartState(final int z0) {
        if (!this.isAttachedToWindow()) {
            if (this.U1 == null) {
                this.U1 = new zqh.zqh$h(this);
            }
            final zqh.zqh$h u1 = this.U1;
            u1.c = z0;
            u1.d = z0;
            return;
        }
        this.Z0 = z0;
    }
    
    public void setState(final zqh.zqh$j y1) {
        final zqh.zqh$j f0 = zqh.zqh$j.F0;
        if (y1 == f0 && this.Z0 == -1) {
            return;
        }
        final zqh.zqh$j y2 = this.Y1;
        this.Y1 = y1;
        final zqh.zqh$j e0 = zqh.zqh$j.E0;
        if (y2 == e0 && y1 == e0) {
            this.D();
        }
        final int ordinal = ((Enum)y2).ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                if (y1 == f0) {
                    this.E();
                }
            }
        }
        else {
            if (y1 == e0) {
                this.D();
            }
            if (y1 == f0) {
                this.E();
            }
        }
    }
    
    public void setTransition(int z0) {
        final drh u0 = this.U0;
        if (u0 != null) {
            while (true) {
                for (final drh$b c : u0.d) {
                    if (c.a == z0) {
                        this.Y0 = c.d;
                        this.a1 = c.c;
                        if (!this.isAttachedToWindow()) {
                            if (this.U1 == null) {
                                this.U1 = new zqh.zqh$h(this);
                            }
                            final zqh.zqh$h u2 = this.U1;
                            u2.c = this.Y0;
                            u2.d = this.a1;
                            return;
                        }
                        float progress = Float.NaN;
                        z0 = this.Z0;
                        if (z0 == this.Y0) {
                            progress = 0.0f;
                        }
                        else if (z0 == this.a1) {
                            progress = 1.0f;
                        }
                        final drh u3 = this.U0;
                        u3.c = c;
                        final ttt l = c.l;
                        if (l != null) {
                            l.c(u3.p);
                        }
                        this.Z1.e(this.U0.b(this.Y0), this.U0.b(this.a1));
                        this.L();
                        if (this.i1 != progress) {
                            if (progress == 0.0f) {
                                this.B(true);
                                this.U0.b(this.Y0).b((ConstraintLayout)this);
                            }
                            else if (progress == 1.0f) {
                                this.B(false);
                                this.U0.b(this.a1).b((ConstraintLayout)this);
                            }
                        }
                        float i1;
                        if (Float.isNaN(progress)) {
                            i1 = 0.0f;
                        }
                        else {
                            i1 = progress;
                        }
                        this.i1 = i1;
                        if (Float.isNaN(progress)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(za8.b());
                            sb.append(" transitionToStart ");
                            Log.v("MotionLayout", sb.toString());
                            this.A(0.0f);
                            return;
                        }
                        this.setProgress(progress);
                        return;
                    }
                }
                drh$b c = null;
                continue;
            }
        }
    }
    
    public void setTransition(final drh$b c) {
        final drh u0 = this.U0;
        u0.c = c;
        if (c != null) {
            final ttt l = c.l;
            if (l != null) {
                l.c(u0.p);
            }
        }
        this.setState(zqh.zqh$j.D0);
        if (this.Z0 == this.U0.d()) {
            this.i1 = 1.0f;
            this.h1 = 1.0f;
            this.k1 = 1.0f;
        }
        else {
            this.i1 = 0.0f;
            this.h1 = 0.0f;
            this.k1 = 0.0f;
        }
        long nanoTime;
        if (c.a(1)) {
            nanoTime = -1L;
        }
        else {
            nanoTime = this.getNanoTime();
        }
        this.j1 = nanoTime;
        final int i = this.U0.i();
        final int d = this.U0.d();
        if (i == this.Y0 && d == this.a1) {
            return;
        }
        this.Y0 = i;
        this.a1 = d;
        this.U0.p(i, d);
        this.Z1.e(this.U0.b(this.Y0), this.U0.b(this.a1));
        final zqh.zqh$f z1 = this.Z1;
        final int y0 = this.Y0;
        final int a1 = this.a1;
        z1.e = y0;
        z1.f = a1;
        z1.f();
        this.L();
    }
    
    public void setTransitionDuration(final int j) {
        final drh u0 = this.U0;
        if (u0 == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        final drh$b c = u0.c;
        if (c != null) {
            c.h = Math.max(j, 8);
        }
        else {
            u0.j = j;
        }
    }
    
    public void setTransitionListener(final zqh.zqh$i n1) {
        this.n1 = n1;
    }
    
    public void setTransitionState(final Bundle bundle) {
        if (this.U1 == null) {
            this.U1 = new zqh.zqh$h(this);
        }
        final zqh.zqh$h u1 = this.U1;
        Objects.requireNonNull(u1);
        u1.a = bundle.getFloat("motion.progress");
        u1.b = bundle.getFloat("motion.velocity");
        u1.c = ((BaseBundle)bundle).getInt("motion.StartState");
        u1.d = ((BaseBundle)bundle).getInt("motion.EndState");
        if (this.isAttachedToWindow()) {
            this.U1.a();
        }
    }
    
    public final void t(final int n) {
        super.M0 = null;
    }
    
    public final String toString() {
        final Context context = ((View)this).getContext();
        final StringBuilder sb = new StringBuilder();
        sb.append(za8.c(context, this.Y0));
        sb.append("->");
        sb.append(za8.c(context, this.a1));
        sb.append(" (pos:");
        sb.append(this.i1);
        sb.append(" Dpos/Dt:");
        sb.append(this.X0);
        return sb.toString();
    }
    
    public final class d extends xqh
    {
        public float a;
        public float b;
        public float c;
        
        public d() {
            this.a = 0.0f;
            this.b = 0.0f;
        }
        
        @Override
        public final float a() {
            return zqh.this.X0;
        }
        
        public final float getInterpolation(final float n) {
            final float a = this.a;
            if (a > 0.0f) {
                final float c = this.c;
                float n2 = n;
                if (a / c < n) {
                    n2 = a / c;
                }
                zqh.this.X0 = a - c * n2;
                return a * n2 - c * n2 * n2 / 2.0f + this.b;
            }
            final float n3 = -a;
            final float c2 = this.c;
            float n4 = n;
            if (n3 / c2 < n) {
                n4 = -a / c2;
            }
            zqh.this.X0 = c2 * n4 + a;
            return c2 * n4 * n4 / 2.0f + a * n4 + this.b;
        }
    }
}
