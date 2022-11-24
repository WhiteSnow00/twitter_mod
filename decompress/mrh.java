import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.Log;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import android.view.View$MeasureSpec;
import java.util.Arrays;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import java.util.HashMap;
import java.util.ArrayList;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrh
{
    public fre[] A;
    public int B;
    public int C;
    public View D;
    public int E;
    public float F;
    public Interpolator G;
    public boolean H;
    public Rect a;
    public View b;
    public int c;
    public boolean d;
    public int e;
    public urh f;
    public urh g;
    public krh h;
    public krh i;
    public sa7[] j;
    public vr0 k;
    public float l;
    public float m;
    public float n;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public float[] t;
    public ArrayList<urh> u;
    public float[] v;
    public ArrayList<zpe> w;
    public HashMap<String, pcx> x;
    public HashMap<String, acx> y;
    public HashMap<String, abx> z;
    
    public mrh(final View b) {
        this.a = new Rect();
        this.d = false;
        this.e = -1;
        this.f = new urh();
        this.g = new urh();
        this.h = new krh();
        this.i = new krh();
        this.l = Float.NaN;
        this.m = 0.0f;
        this.n = 1.0f;
        this.t = new float[4];
        this.u = new ArrayList<urh>();
        this.v = new float[1];
        this.w = new ArrayList<zpe>();
        this.B = -1;
        this.C = -1;
        this.D = null;
        this.E = -1;
        this.F = Float.NaN;
        this.G = null;
        this.H = false;
        this.b = b;
        this.c = b.getId();
        final ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout$a) {
            Objects.requireNonNull((ConstraintLayout$a)layoutParams);
        }
    }
    
    public final float a(float h0, final float[] array) {
        final float n = 0.0f;
        final float n2 = 1.0f;
        float min;
        if (array != null) {
            array[0] = 1.0f;
            min = h0;
        }
        else {
            final float n3 = this.n;
            min = h0;
            if (n3 != 1.0) {
                final float m = this.m;
                float n4 = h0;
                if (h0 < m) {
                    n4 = 0.0f;
                }
                min = n4;
                if (n4 > m) {
                    min = n4;
                    if (n4 < 1.0) {
                        min = Math.min((n4 - m) * n3, 1.0f);
                    }
                }
            }
        }
        mq9 f0 = this.f.F0;
        h0 = Float.NaN;
        final Iterator<urh> iterator = this.u.iterator();
        float n5 = n;
        while (iterator.hasNext()) {
            final urh urh = iterator.next();
            final mq9 f2 = urh.F0;
            if (f2 != null) {
                final float h2 = urh.H0;
                if (h2 < min) {
                    f0 = f2;
                    n5 = h2;
                }
                else {
                    if (!Float.isNaN(h0)) {
                        continue;
                    }
                    h0 = urh.H0;
                }
            }
        }
        float n6 = min;
        if (f0 != null) {
            if (Float.isNaN(h0)) {
                h0 = n2;
            }
            h0 -= n5;
            final double n7 = (min - n5) / h0;
            h0 = (n6 = (float)f0.a(n7) * h0 + n5);
            if (array != null) {
                array[0] = (float)f0.b(n7);
                n6 = h0;
            }
        }
        return n6;
    }
    
    public final void b(double n, final float[] array, final float[] array2) {
        final double[] array3 = new double[4];
        final double[] array4 = new double[4];
        this.j[0].c(n, array3);
        this.j[0].e(n, array4);
        float n2 = 0.0f;
        Arrays.fill(array2, 0.0f);
        final urh f = this.f;
        final int[] o = this.o;
        float j0 = f.J0;
        float k0 = f.K0;
        float l0 = f.L0;
        float m0 = f.M0;
        float n3 = 0.0f;
        int i = 0;
        float n4 = 0.0f;
        float n5 = 0.0f;
        while (i < o.length) {
            final float n6 = (float)array3[i];
            final float n7 = (float)array4[i];
            final int n8 = o[i];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            m0 = n6;
                            n5 = n7;
                        }
                    }
                    else {
                        l0 = n6;
                        n4 = n7;
                    }
                }
                else {
                    n3 = n7;
                    k0 = n6;
                }
            }
            else {
                j0 = n6;
                n2 = n7;
            }
            ++i;
        }
        final float n9 = n4 / 2.0f + n2;
        float n10 = n5 / 2.0f + n3;
        final mrh r0 = f.R0;
        float n11 = j0;
        float n12 = k0;
        float n13 = n9;
        if (r0 != null) {
            final float[] array5 = new float[2];
            final float[] array6 = new float[2];
            r0.b(n, array5, array6);
            final float n14 = array5[0];
            final float n15 = array5[1];
            final float n16 = array6[0];
            final float n17 = array6[1];
            final double n18 = n14;
            final double n19 = j0;
            n = k0;
            n11 = (float)(Math.sin(n) * n19 + n18 - l0 / 2.0f);
            n12 = (float)(n15 - Math.cos(n) * n19 - m0 / 2.0f);
            final double n20 = n16;
            final double n21 = n2;
            final double sin = Math.sin(n);
            final double cos = Math.cos(n);
            final double n22 = n3;
            n13 = (float)(cos * n22 + (sin * n21 + n20));
            n10 = (float)(Math.sin(n) * n22 + (n17 - Math.cos(n) * n21));
        }
        array[0] = l0 / 2.0f + n11 + 0.0f;
        array[1] = m0 / 2.0f + n12 + 0.0f;
        array2[0] = n13;
        array2[1] = n10;
    }
    
    public final boolean c(final View view, float interpolation, final long n, final bqe bqe) {
        final float a = this.a(interpolation, null);
        final int e = this.E;
        interpolation = a;
        if (e != -1) {
            final float n2 = 1.0f / e;
            final float n3 = (float)Math.floor(a / n2);
            final float n4 = interpolation = a % n2 / n2;
            if (!Float.isNaN(this.F)) {
                interpolation = (n4 + this.F) % 1.0f;
            }
            final Interpolator g = this.G;
            if (g != null) {
                interpolation = ((TimeInterpolator)g).getInterpolation(interpolation);
            }
            else if (interpolation > 0.5) {
                interpolation = 1.0f;
            }
            else {
                interpolation = 0.0f;
            }
            interpolation = interpolation * n2 + n3 * n2;
        }
        final HashMap<String, acx> y = this.y;
        if (y != null) {
            final Iterator<acx> iterator = y.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().d(view, interpolation);
            }
        }
        final HashMap<String, pcx> x = this.x;
        Object o2;
        int n6;
        if (x != null) {
            final Iterator<pcx> iterator2 = x.values().iterator();
            Object o = null;
            int n5 = 0;
            while (true) {
                o2 = o;
                n6 = n5;
                if (!iterator2.hasNext()) {
                    break;
                }
                final pcx pcx = iterator2.next();
                if (pcx instanceof pcx.d) {
                    o = pcx;
                }
                else {
                    n5 |= (pcx.e(view, interpolation, n, bqe) ? 1 : 0);
                }
            }
        }
        else {
            n6 = 0;
            o2 = null;
        }
        final sa7[] j = this.j;
        boolean b;
        if (j != null) {
            final sa7 sa7 = j[0];
            final double n7 = interpolation;
            sa7.c(n7, this.p);
            this.j[0].e(n7, this.q);
            final vr0 k = this.k;
            if (k != null) {
                final double[] p4 = this.p;
                if (p4.length > 0) {
                    k.c(n7, p4);
                    this.k.e(n7, this.q);
                }
            }
            if (!this.H) {
                final urh f = this.f;
                final int[] o3 = this.o;
                final double[] p5 = this.p;
                final double[] q = this.q;
                final boolean d = this.d;
                float j2 = f.J0;
                float k2 = f.K0;
                float l0 = f.L0;
                float m0 = f.M0;
                if (o3.length != 0 && f.U0.length <= o3[o3.length - 1]) {
                    final int n8 = o3[o3.length - 1] + 1;
                    f.U0 = new double[n8];
                    f.V0 = new double[n8];
                }
                Arrays.fill(f.U0, Double.NaN);
                for (int i = 0; i < o3.length; ++i) {
                    f.U0[o3[i]] = p5[i];
                    f.V0[o3[i]] = q[i];
                }
                float n9 = Float.NaN;
                float n10 = 0.0f;
                int n11 = 0;
                float n12 = 0.0f;
                float n13 = 0.0f;
                float n14 = 0.0f;
                float n15;
                while (true) {
                    final double[] u0 = f.U0;
                    n15 = interpolation;
                    if (n11 >= u0.length) {
                        break;
                    }
                    if (!Double.isNaN(u0[n11])) {
                        double n16 = 0.0;
                        if (!Double.isNaN(f.U0[n11])) {
                            n16 = f.U0[n11] + 0.0;
                        }
                        interpolation = (float)n16;
                        final float n17 = (float)f.V0[n11];
                        if (n11 != 1) {
                            if (n11 != 2) {
                                if (n11 != 3) {
                                    if (n11 != 4) {
                                        if (n11 == 5) {
                                            n9 = interpolation;
                                        }
                                    }
                                    else {
                                        n14 = n17;
                                        m0 = interpolation;
                                    }
                                }
                                else {
                                    n13 = n17;
                                    l0 = interpolation;
                                }
                            }
                            else {
                                k2 = interpolation;
                                n12 = n17;
                            }
                        }
                        else {
                            j2 = interpolation;
                            n10 = n17;
                        }
                    }
                    ++n11;
                    interpolation = n15;
                }
                final mrh r0 = f.R0;
                float n24;
                if (r0 != null) {
                    final float[] array = new float[2];
                    final float[] array2 = new float[2];
                    r0.b(n7, array, array2);
                    interpolation = array[0];
                    final float n18 = array[1];
                    final float n19 = array2[0];
                    final float n20 = array2[1];
                    final double n21 = interpolation;
                    final double n22 = j2;
                    final double n23 = k2;
                    interpolation = (float)(Math.sin(n23) * n22 + n21 - l0 / 2.0f);
                    n24 = (float)(n18 - Math.cos(n23) * n22 - m0 / 2.0f);
                    final double n25 = n19;
                    final double n26 = n10;
                    final double sin = Math.sin(n23);
                    final double cos = Math.cos(n23);
                    final double n27 = n12;
                    final float n28 = (float)(cos * n22 * n27 + (sin * n26 + n25));
                    final float n29 = (float)(Math.sin(n23) * n22 * n27 + (n20 - Math.cos(n23) * n26));
                    if (q.length >= 2) {
                        q[0] = n28;
                        q[1] = n29;
                    }
                    if (!Float.isNaN(n9)) {
                        view.setRotation((float)(Math.toDegrees(Math.atan2(n29, n28)) + n9));
                    }
                }
                else {
                    interpolation = j2;
                    n24 = k2;
                    if (!Float.isNaN(n9)) {
                        interpolation = n13 / 2.0f;
                        view.setRotation((float)(Math.toDegrees(Math.atan2(n14 / 2.0f + n12, interpolation + n10)) + n9 + 0.0f));
                        n24 = k2;
                        interpolation = j2;
                    }
                }
                if (view instanceof p7b) {
                    ((p7b)view).b();
                }
                else {
                    interpolation += 0.5f;
                    final int n30 = (int)interpolation;
                    final float n31 = n24 + 0.5f;
                    final int n32 = (int)n31;
                    final int n33 = (int)(interpolation + l0);
                    final int n34 = (int)(n31 + m0);
                    final int n35 = n33 - n30;
                    final int n36 = n34 - n32;
                    if (n35 != view.getMeasuredWidth() || n36 != view.getMeasuredHeight() || d) {
                        view.measure(View$MeasureSpec.makeMeasureSpec(n35, 1073741824), View$MeasureSpec.makeMeasureSpec(n36, 1073741824));
                    }
                    view.layout(n30, n32, n33, n34);
                }
                this.d = false;
                interpolation = n15;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View)view.getParent()).findViewById(this.C);
                }
                final View d2 = this.D;
                if (d2 != null) {
                    final float n37 = (this.D.getBottom() + d2.getTop()) / 2.0f;
                    final float n38 = (this.D.getRight() + this.D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        final float n39 = (float)view.getLeft();
                        final float n40 = (float)view.getTop();
                        view.setPivotX(n38 - n39);
                        view.setPivotY(n37 - n40);
                    }
                }
            }
            final HashMap<String, acx> y2 = this.y;
            float n41 = interpolation;
            if (y2 != null) {
                final Iterator<acx> iterator3 = y2.values().iterator();
                while (true) {
                    n41 = interpolation;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final h3r h3r = iterator3.next();
                    if (!(h3r instanceof acx$d)) {
                        continue;
                    }
                    final double[] q2 = this.q;
                    if (q2.length <= 1) {
                        continue;
                    }
                    view.setRotation(((h3r)h3r).a(interpolation) + (float)Math.toDegrees(Math.atan2(q2[1], q2[0])));
                }
            }
            if (o2 != null) {
                final double[] q3 = this.q;
                view.setRotation(((pcx)o2).d(n41, n, view, bqe) + (float)Math.toDegrees(Math.atan2(q3[1], q3[0])));
                n6 |= (((ars)o2).h ? 1 : 0);
            }
            int n42 = 1;
            while (true) {
                final sa7[] j3 = this.j;
                if (n42 >= j3.length) {
                    break;
                }
                j3[n42].d(n7, this.t);
                xd.W0((lj6)this.f.S0.get(this.r[n42 - 1]), view, this.t);
                ++n42;
            }
            final krh h = this.h;
            if (h.G0 == 0) {
                if (n41 <= 0.0f) {
                    view.setVisibility(h.H0);
                }
                else if (n41 >= 1.0f) {
                    view.setVisibility(this.i.H0);
                }
                else if (this.i.H0 != h.H0) {
                    view.setVisibility(0);
                }
            }
            interpolation = n41;
            b = (n6 != 0);
            if (this.A != null) {
                int n43 = 0;
                while (true) {
                    final fre[] a2 = this.A;
                    interpolation = n41;
                    b = (n6 != 0);
                    if (n43 >= a2.length) {
                        break;
                    }
                    a2[n43].g(n41, view);
                    ++n43;
                }
            }
        }
        else {
            final urh f2 = this.f;
            final float j4 = f2.J0;
            final urh g2 = this.g;
            final float d3 = va.d(g2.J0, j4, interpolation, j4);
            final float k3 = f2.K0;
            final float d4 = va.d(g2.K0, k3, interpolation, k3);
            final float l2 = f2.L0;
            final float l3 = g2.L0;
            final float d5 = va.d(l3, l2, interpolation, l2);
            final float m2 = f2.M0;
            final float m3 = g2.M0;
            final float d6 = va.d(m3, m2, interpolation, m2);
            final float n44 = d3 + 0.5f;
            final int n45 = (int)n44;
            final float n46 = d4 + 0.5f;
            final int n47 = (int)n46;
            final int n48 = (int)(n44 + d5);
            final int n49 = (int)(n46 + d6);
            if (l3 != l2 || m3 != m2 || this.d) {
                view.measure(View$MeasureSpec.makeMeasureSpec(n48 - n45, 1073741824), View$MeasureSpec.makeMeasureSpec(n49 - n47, 1073741824));
                this.d = false;
            }
            view.layout(n45, n47, n48, n49);
            b = (n6 != 0);
        }
        final HashMap<String, abx> z = this.z;
        if (z != null) {
            for (final abx abx : z.values()) {
                if (abx instanceof abx$d) {
                    final abx$d abx$d = (abx$d)abx;
                    final double[] q4 = this.q;
                    view.setRotation(((fqe)abx$d).a(interpolation) + (float)Math.toDegrees(Math.atan2(q4[1], q4[0])));
                }
                else {
                    abx.d(view, interpolation);
                }
            }
        }
        return b;
    }
    
    public final void d(final urh urh) {
        urh.g((float)(int)this.b.getX(), (float)(int)this.b.getY(), (float)this.b.getWidth(), (float)this.b.getHeight());
    }
    
    public final void e(final Rect rect, final Rect rect2, int n, int right, int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final int left = rect.left;
                        n2 = rect.right;
                        n = rect.bottom;
                        rect2.left = right - (rect.width() + (n + rect.top)) / 2;
                        rect2.top = (left + n2 - rect.height()) / 2;
                        n = rect2.left;
                        rect2.right = rect.width() + n;
                        n = rect2.top;
                        rect2.bottom = rect.height() + n;
                    }
                }
                else {
                    n = rect.left + rect.right;
                    rect2.left = rect.height() / 2 + rect.top - n / 2;
                    rect2.top = n2 - (rect.height() + n) / 2;
                    n = rect2.left;
                    rect2.right = rect.width() + n;
                    n = rect2.top;
                    rect2.bottom = rect.height() + n;
                }
            }
            else {
                n = rect.left;
                final int right2 = rect.right;
                final int top = rect.top;
                n2 = rect.bottom;
                rect2.left = right - (rect.width() + (top + n2)) / 2;
                rect2.top = (n + right2 - rect.height()) / 2;
                n = rect2.left;
                rect2.right = rect.width() + n;
                n = rect2.top;
                rect2.bottom = rect.height() + n;
            }
        }
        else {
            n = rect.left;
            right = rect.right;
            rect2.left = (rect.top + rect.bottom - rect.width()) / 2;
            rect2.top = n2 - (rect.height() + (n + right)) / 2;
            n = rect2.left;
            rect2.right = rect.width() + n;
            n = rect2.top;
            rect2.bottom = rect.height() + n;
        }
    }
    
    public final void f(int i, int j, final long k) {
        new HashSet();
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        final HashMap hashMap = new HashMap();
        final int b = this.B;
        if (b != -1) {
            this.f.O0 = b;
        }
        final krh h = this.h;
        final krh l = this.i;
        final boolean f = h.f(h.F0, l.F0);
        final String s = "alpha";
        if (f) {
            set2.add("alpha");
        }
        final boolean f2 = h.f(h.I0, l.I0);
        final String s2 = "elevation";
        if (f2) {
            set2.add("elevation");
        }
        final int h2 = h.H0;
        final int h3 = l.H0;
        if (h2 != h3 && h.G0 == 0 && (h2 == 0 || h3 == 0)) {
            set2.add("alpha");
        }
        final boolean f3 = h.f(h.J0, l.J0);
        final String s3 = "rotation";
        if (f3) {
            set2.add("rotation");
        }
        final boolean naN = Float.isNaN(h.T0);
        final String s4 = "transitionPathRotate";
        if (!naN || !Float.isNaN(l.T0)) {
            set2.add("transitionPathRotate");
        }
        if (!Float.isNaN(h.U0) || !Float.isNaN(l.U0)) {
            set2.add("progress");
        }
        if (h.f(h.K0, l.K0)) {
            set2.add("rotationX");
        }
        if (h.f(h.L0, l.L0)) {
            set2.add("rotationY");
        }
        final boolean f4 = h.f(h.O0, l.O0);
        String s5 = "transformPivotX";
        if (f4) {
            set2.add("transformPivotX");
        }
        final float p3 = h.P0;
        final String s6 = "rotationX";
        final boolean f5 = h.f(p3, l.P0);
        final String s7 = "transformPivotY";
        if (f5) {
            set2.add("transformPivotY");
        }
        final float m0 = h.M0;
        final String s8 = "rotationY";
        if (h.f(m0, l.M0)) {
            set2.add("scaleX");
        }
        final float n0 = h.N0;
        final String s9 = "progress";
        final boolean f6 = h.f(n0, l.N0);
        final String s10 = "scaleY";
        if (f6) {
            set2.add("scaleY");
        }
        final float q0 = h.Q0;
        final String s11 = "scaleX";
        if (h.f(q0, l.Q0)) {
            set2.add("translationX");
        }
        final float r0 = h.R0;
        final String s12 = "translationX";
        final boolean f7 = h.f(r0, l.R0);
        final String s13 = "translationY";
        if (f7) {
            set2.add("translationY");
        }
        final boolean f8 = h.f(h.S0, l.S0);
        final String s14 = "translationZ";
        if (f8) {
            set2.add("translationZ");
        }
        final ArrayList<zpe> w = this.w;
        String s16;
        ArrayList<fre> list3;
        String s17;
        String s18;
        if (w != null) {
            final Iterator<zpe> iterator = w.iterator();
            ArrayList<fre> list = null;
            while (iterator.hasNext()) {
                final zpe zpe = iterator.next();
                ArrayList<fre> list2;
                if (zpe instanceof are) {
                    final are are = (are)zpe;
                    final urh urh = new urh(i, j, are, this.f, this.g);
                    final int binarySearch = Collections.binarySearch((List<? extends Comparable<? super urh>>)this.u, urh);
                    if (binarySearch == 0) {
                        final StringBuilder f9 = ehk.f(" KeyPath position \"");
                        f9.append(urh.I0);
                        f9.append("\" outside of range");
                        Log.e("MotionController", f9.toString());
                    }
                    this.u.add(-binarySearch - 1, urh);
                    final int e = ((bre)are).e;
                    list2 = list;
                    if (e != -1) {
                        this.e = e;
                        list2 = list;
                    }
                }
                else if (zpe instanceof dqe) {
                    zpe.d(set3);
                    list2 = list;
                }
                else if (zpe instanceof cre) {
                    zpe.d(set);
                    list2 = list;
                }
                else if (zpe instanceof fre) {
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<fre>();
                    }
                    list2.add((fre)zpe);
                }
                else {
                    zpe.f(hashMap);
                    zpe.d(set2);
                    list2 = list;
                }
                list = list2;
            }
            final String s15 = s10;
            s16 = s13;
            list3 = list;
            s17 = s14;
            s18 = s15;
        }
        else {
            s17 = "translationZ";
            s5 = "transformPivotX";
            s18 = "scaleY";
            s16 = "translationY";
            list3 = null;
        }
        if (list3 != null) {
            this.A = list3.toArray(new fre[0]);
        }
        final boolean empty = set2.isEmpty();
        final String s19 = "waveOffset";
        final String s20 = "waveVariesBy";
        final String s21 = ",";
        final String s22 = "CUSTOM,";
        String s48;
        String s49;
        String s50;
        String s51;
        String s52;
        String s53;
        String s54;
        String s55;
        String s56;
        String s57;
        HashSet set5;
        String s58;
        HashSet set6;
        if (!empty) {
            this.y = new HashMap<String, acx>();
            final Iterator iterator2 = set2.iterator();
            final String s23 = s18;
            final String s24 = s17;
            String s25 = s5;
            final String s26 = s16;
            final String s27 = s12;
            final String s28 = s11;
            final String s29 = s8;
            final String s30 = s6;
            String s31 = s21;
            final String s32 = s20;
            final Iterator iterator3 = iterator2;
            while (iterator3.hasNext()) {
                final String e2 = (String)iterator3.next();
                Object o;
                String s34;
                String s35;
                if (e2.startsWith("CUSTOM,")) {
                    final SparseArray sparseArray = new SparseArray();
                    final String s33 = e2.split(s31)[1];
                    for (final zpe zpe2 : this.w) {
                        final HashMap<String, lj6> d = zpe2.d;
                        if (d == null) {
                            continue;
                        }
                        final lj6 lj6 = d.get(s33);
                        if (lj6 == null) {
                            continue;
                        }
                        sparseArray.append(zpe2.a, (Object)lj6);
                    }
                    o = new acx$b(e2, sparseArray);
                    s34 = s25;
                    s35 = s31;
                }
                else {
                    final String s36 = s31;
                    String s37 = null;
                    Label_1771: {
                        switch (e2.hashCode()) {
                            case 156108012: {
                                if (!e2.equals(s19)) {
                                    break;
                                }
                                i = 15;
                                s37 = s25;
                                break Label_1771;
                            }
                            case 92909918: {
                                if (!e2.equals("alpha")) {
                                    break;
                                }
                                i = 14;
                                s37 = s25;
                                break Label_1771;
                            }
                            case 37232917: {
                                if (!e2.equals("transitionPathRotate")) {
                                    break;
                                }
                                i = 13;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -4379043: {
                                if (!e2.equals("elevation")) {
                                    break;
                                }
                                i = 12;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -40300674: {
                                if (!e2.equals("rotation")) {
                                    break;
                                }
                                i = 11;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -760884509: {
                                if (!e2.equals(s7)) {
                                    break;
                                }
                                i = 10;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -760884510: {
                                if (!e2.equals(s25)) {
                                    break;
                                }
                                i = 9;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -797520672: {
                                if (!e2.equals(s32)) {
                                    break;
                                }
                                i = 8;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -908189617: {
                                if (!e2.equals(s23)) {
                                    break;
                                }
                                i = 7;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -908189618: {
                                if (!e2.equals(s28)) {
                                    break;
                                }
                                i = 6;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -1001078227: {
                                if (!e2.equals(s9)) {
                                    break;
                                }
                                i = 5;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -1225497655: {
                                if (!e2.equals(s24)) {
                                    break;
                                }
                                i = 4;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -1225497656: {
                                if (!e2.equals(s26)) {
                                    break;
                                }
                                i = 3;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -1225497657: {
                                if (!e2.equals(s27)) {
                                    break;
                                }
                                i = 2;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -1249320805: {
                                if (!e2.equals(s29)) {
                                    break;
                                }
                                i = 1;
                                s37 = s25;
                                break Label_1771;
                            }
                            case -1249320806: {
                                if (!e2.equals(s30)) {
                                    break;
                                }
                                i = 0;
                                s37 = s25;
                                break Label_1771;
                            }
                        }
                        i = -1;
                        s37 = s25;
                    }
                    Object o2 = null;
                    switch (i) {
                        default: {
                            o2 = null;
                            break;
                        }
                        case 15: {
                            o2 = new acx$a();
                            break;
                        }
                        case 14: {
                            o2 = new acx$a();
                            break;
                        }
                        case 13: {
                            o2 = new acx$d();
                            break;
                        }
                        case 12: {
                            o2 = new acx$c();
                            break;
                        }
                        case 11: {
                            o2 = new acx$h();
                            break;
                        }
                        case 10: {
                            o2 = new acx$f();
                            break;
                        }
                        case 9: {
                            o2 = new acx$e();
                            break;
                        }
                        case 8: {
                            o2 = new acx$a();
                            break;
                        }
                        case 7: {
                            o2 = new acx$l();
                            break;
                        }
                        case 6: {
                            o2 = new acx$k();
                            break;
                        }
                        case 5: {
                            o2 = new acx$g();
                            break;
                        }
                        case 4: {
                            o2 = new acx$o();
                            break;
                        }
                        case 3: {
                            o2 = new acx$n();
                            break;
                        }
                        case 2: {
                            o2 = new acx$m();
                            break;
                        }
                        case 1: {
                            o2 = new acx$j();
                            break;
                        }
                        case 0: {
                            o2 = new acx$i();
                            break;
                        }
                    }
                    o = o2;
                    s35 = s36;
                    s34 = s37;
                }
                if (o != null) {
                    ((h3r)o).e = e2;
                    this.y.put(e2, (acx)o);
                }
                s31 = s35;
                s25 = s34;
            }
            final HashSet set4 = set2;
            final String s38 = s31;
            final String s39 = s9;
            final String s40 = s28;
            final String s41 = s26;
            final String s42 = s24;
            final String s43 = s23;
            final String s44 = s32;
            final String s45 = s30;
            final String s46 = s27;
            final String s47 = s19;
            final ArrayList<zpe> w2 = this.w;
            if (w2 != null) {
                for (final zpe zpe3 : w2) {
                    if (zpe3 instanceof aqe) {
                        zpe3.a(this.y);
                    }
                }
            }
            this.h.b((HashMap)this.y, 0);
            this.i.b((HashMap)this.y, 100);
            final Iterator<String> iterator6 = this.y.keySet().iterator();
            while (true) {
                s48 = s42;
                s49 = s43;
                s50 = s40;
                s51 = s39;
                s52 = s41;
                s53 = s46;
                s54 = s45;
                s55 = s29;
                s56 = s47;
                s57 = s44;
                set5 = set4;
                s58 = s38;
                set6 = set3;
                if (!iterator6.hasNext()) {
                    break;
                }
                final String s59 = iterator6.next();
                Label_2356: {
                    if (hashMap.containsKey(s59)) {
                        final Integer n2 = hashMap.get(s59);
                        if (n2 != null) {
                            i = n2;
                            break Label_2356;
                        }
                    }
                    i = 0;
                }
                final h3r h3r = (h3r)this.y.get(s59);
                if (h3r == null) {
                    continue;
                }
                h3r.c(i);
            }
        }
        else {
            set5 = set2;
            s58 = ",";
            s51 = "progress";
            s50 = "scaleX";
            s52 = s16;
            s48 = s17;
            s49 = s18;
            s57 = "waveVariesBy";
            s55 = "rotationY";
            s54 = "rotationX";
            s53 = "translationX";
            s56 = "waveOffset";
            set6 = set3;
        }
        String s80;
        String s81;
        String s82;
        String s83;
        String s84;
        if (!set.isEmpty()) {
            if (this.x == null) {
                this.x = new HashMap<String, pcx>();
            }
            final Iterator iterator7 = set.iterator();
            final String s60 = s55;
            String s61 = s22;
            while (iterator7.hasNext()) {
                final String f10 = (String)iterator7.next();
                if (this.x.containsKey(f10)) {
                    continue;
                }
                String s63 = null;
                pcx pcx = null;
                Label_3213: {
                    if (f10.startsWith(s61)) {
                        final SparseArray sparseArray2 = new SparseArray();
                        final String s62 = f10.split(s58)[1];
                        for (final zpe zpe4 : this.w) {
                            final HashMap<String, lj6> d2 = zpe4.d;
                            if (d2 == null) {
                                continue;
                            }
                            final lj6 lj7 = d2.get(s62);
                            if (lj7 == null) {
                                continue;
                            }
                            sparseArray2.append(zpe4.a, (Object)lj7);
                        }
                        s63 = s61;
                        pcx = new pcx.b(f10, (SparseArray<lj6>)sparseArray2);
                    }
                    else {
                        s63 = s61;
                        Label_2995: {
                            switch (f10.hashCode()) {
                                case 92909918: {
                                    if (!f10.equals("alpha")) {
                                        break;
                                    }
                                    i = 11;
                                    break Label_2995;
                                }
                                case 37232917: {
                                    if (!f10.equals("transitionPathRotate")) {
                                        break;
                                    }
                                    i = 10;
                                    break Label_2995;
                                }
                                case -4379043: {
                                    if (!f10.equals("elevation")) {
                                        break;
                                    }
                                    i = 9;
                                    break Label_2995;
                                }
                                case -40300674: {
                                    if (!f10.equals("rotation")) {
                                        break;
                                    }
                                    i = 8;
                                    break Label_2995;
                                }
                                case -908189617: {
                                    if (!f10.equals(s49)) {
                                        break;
                                    }
                                    i = 7;
                                    break Label_2995;
                                }
                                case -908189618: {
                                    if (!f10.equals(s50)) {
                                        break;
                                    }
                                    i = 6;
                                    break Label_2995;
                                }
                                case -1001078227: {
                                    if (!f10.equals(s51)) {
                                        break;
                                    }
                                    i = 5;
                                    break Label_2995;
                                }
                                case -1225497655: {
                                    if (!f10.equals(s48)) {
                                        break;
                                    }
                                    i = 4;
                                    break Label_2995;
                                }
                                case -1225497656: {
                                    if (!f10.equals(s52)) {
                                        break;
                                    }
                                    i = 3;
                                    break Label_2995;
                                }
                                case -1225497657: {
                                    if (!f10.equals(s53)) {
                                        break;
                                    }
                                    i = 2;
                                    break Label_2995;
                                }
                                case -1249320805: {
                                    if (!f10.equals(s60)) {
                                        break;
                                    }
                                    i = 1;
                                    break Label_2995;
                                }
                                case -1249320806: {
                                    if (!f10.equals(s54)) {
                                        break;
                                    }
                                    i = 0;
                                    break Label_2995;
                                }
                            }
                            i = -1;
                        }
                        switch (i) {
                            default: {
                                pcx = null;
                                break Label_3213;
                            }
                            case 11: {
                                pcx = new pcx.a();
                                break;
                            }
                            case 10: {
                                pcx = new pcx.d();
                                break;
                            }
                            case 9: {
                                pcx = new pcx.c();
                                break;
                            }
                            case 8: {
                                pcx = new pcx.f();
                                break;
                            }
                            case 7: {
                                pcx = new pcx.j();
                                break;
                            }
                            case 6: {
                                pcx = new pcx.i();
                                break;
                            }
                            case 5: {
                                pcx = new pcx.e();
                                break;
                            }
                            case 4: {
                                pcx = new pcx.m();
                                break;
                            }
                            case 3: {
                                pcx = new pcx.l();
                                break;
                            }
                            case 2: {
                                pcx = new pcx.k();
                                break;
                            }
                            case 1: {
                                pcx = new pcx.h();
                                break;
                            }
                            case 0: {
                                pcx = new pcx.g();
                                break;
                            }
                        }
                        ((ars)pcx).i = k;
                    }
                }
                if (pcx != null) {
                    ((ars)pcx).f = f10;
                    this.x.put(f10, pcx);
                }
                s61 = s63;
            }
            final String s64 = s61;
            final String s65 = s53;
            String s66 = s60;
            String s67 = s52;
            final ArrayList<zpe> w3 = this.w;
            HashMap hashMap2 = hashMap;
            String s68 = s66;
            String s69 = s67;
            String s70 = s54;
            if (w3 != null) {
                Iterator<zpe> iterator9 = w3.iterator();
                String s71 = s54;
                HashMap hashMap3 = hashMap;
                while (true) {
                    hashMap2 = hashMap3;
                    s68 = s66;
                    s69 = s67;
                    s70 = s71;
                    if (!iterator9.hasNext()) {
                        break;
                    }
                    final zpe zpe5 = iterator9.next();
                    HashMap hashMap4 = hashMap3;
                    Iterator iterator10 = iterator9;
                    String s72 = s66;
                    String s73 = s67;
                    String s74 = s71;
                    if (zpe5 instanceof cre) {
                        final cre cre = (cre)zpe5;
                        final HashMap<String, pcx> x = this.x;
                        Objects.requireNonNull(cre);
                        final Iterator<String> iterator11 = x.keySet().iterator();
                        final String s75 = s71;
                        final String s76 = s67;
                        final HashMap<String, pcx> hashMap5 = x;
                        final String s77 = s66;
                        final Iterator iterator12 = iterator9;
                        while (true) {
                            hashMap4 = hashMap3;
                            iterator10 = iterator12;
                            s72 = s77;
                            s73 = s76;
                            s74 = s75;
                            if (!iterator11.hasNext()) {
                                break;
                            }
                            final String s78 = iterator11.next();
                            final pcx pcx2 = hashMap5.get(s78);
                            if (pcx2 == null) {
                                continue;
                            }
                            if (s78.startsWith("CUSTOM")) {
                                final lj6 lj8 = cre.d.get(s78.substring(7));
                                if (lj8 == null) {
                                    continue;
                                }
                                final pcx.b b2 = (pcx.b)pcx2;
                                i = cre.a;
                                final float s79 = cre.s;
                                j = cre.r;
                                final float t = cre.t;
                                b2.l.append(i, (Object)lj8);
                                b2.m.append(i, (Object)new float[] { s79, t });
                                ((ars)b2).b = Math.max(((ars)b2).b, j);
                            }
                            else {
                                Label_3951: {
                                    switch (s78.hashCode()) {
                                        case 92909918: {
                                            if (!s78.equals("alpha")) {
                                                break;
                                            }
                                            i = 11;
                                            break Label_3951;
                                        }
                                        case 37232917: {
                                            if (!s78.equals("transitionPathRotate")) {
                                                break;
                                            }
                                            i = 10;
                                            break Label_3951;
                                        }
                                        case -4379043: {
                                            if (!s78.equals("elevation")) {
                                                break;
                                            }
                                            i = 9;
                                            break Label_3951;
                                        }
                                        case -40300674: {
                                            if (!s78.equals("rotation")) {
                                                break;
                                            }
                                            i = 8;
                                            break Label_3951;
                                        }
                                        case -908189617: {
                                            if (!s78.equals(s49)) {
                                                break;
                                            }
                                            i = 7;
                                            break Label_3951;
                                        }
                                        case -908189618: {
                                            if (!s78.equals(s50)) {
                                                break;
                                            }
                                            i = 6;
                                            break Label_3951;
                                        }
                                        case -1001078227: {
                                            if (!s78.equals(s51)) {
                                                break;
                                            }
                                            i = 5;
                                            break Label_3951;
                                        }
                                        case -1225497655: {
                                            if (!s78.equals(s48)) {
                                                break;
                                            }
                                            i = 4;
                                            break Label_3951;
                                        }
                                        case -1225497656: {
                                            if (!s78.equals(s76)) {
                                                break;
                                            }
                                            i = 3;
                                            break Label_3951;
                                        }
                                        case -1225497657: {
                                            if (!s78.equals(s65)) {
                                                break;
                                            }
                                            i = 2;
                                            break Label_3951;
                                        }
                                        case -1249320805: {
                                            if (!s78.equals(s77)) {
                                                break;
                                            }
                                            i = 1;
                                            break Label_3951;
                                        }
                                        case -1249320806: {
                                            if (!s78.equals(s75)) {
                                                break;
                                            }
                                            i = 0;
                                            break Label_3951;
                                        }
                                    }
                                    i = -1;
                                }
                                switch (i) {
                                    default: {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("UNKNOWN addValues \"");
                                        sb.append(s78);
                                        sb.append("\"");
                                        Log.e("KeyTimeCycles", sb.toString());
                                        continue;
                                    }
                                    case 11: {
                                        if (!Float.isNaN(cre.f)) {
                                            ((ars)pcx2).b(cre.a, cre.f, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 10: {
                                        if (!Float.isNaN(cre.k)) {
                                            ((ars)pcx2).b(cre.a, cre.k, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 9: {
                                        if (!Float.isNaN(cre.g)) {
                                            ((ars)pcx2).b(cre.a, cre.g, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 8: {
                                        if (!Float.isNaN(cre.h)) {
                                            ((ars)pcx2).b(cre.a, cre.h, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 7: {
                                        if (!Float.isNaN(cre.m)) {
                                            ((ars)pcx2).b(cre.a, cre.m, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 6: {
                                        if (!Float.isNaN(cre.l)) {
                                            ((ars)pcx2).b(cre.a, cre.l, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 5: {
                                        if (!Float.isNaN(cre.q)) {
                                            ((ars)pcx2).b(cre.a, cre.q, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 4: {
                                        if (!Float.isNaN(cre.p)) {
                                            ((ars)pcx2).b(cre.a, cre.p, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 3: {
                                        if (!Float.isNaN(cre.o)) {
                                            ((ars)pcx2).b(cre.a, cre.o, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 2: {
                                        if (!Float.isNaN(cre.n)) {
                                            ((ars)pcx2).b(cre.a, cre.n, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 1: {
                                        if (!Float.isNaN(cre.j)) {
                                            ((ars)pcx2).b(cre.a, cre.j, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 0: {
                                        if (!Float.isNaN(cre.i)) {
                                            ((ars)pcx2).b(cre.a, cre.i, cre.s, cre.r, cre.t);
                                            continue;
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    iterator9 = iterator10;
                    s66 = s72;
                    hashMap3 = hashMap4;
                    s71 = s74;
                    s67 = s73;
                }
            }
            final Iterator<String> iterator13 = this.x.keySet().iterator();
            while (true) {
                s80 = s69;
                s81 = s65;
                s82 = s70;
                s83 = s68;
                s84 = s64;
                if (!iterator13.hasNext()) {
                    break;
                }
                final String s85 = iterator13.next();
                if (hashMap2.containsKey(s85)) {
                    i = (int)hashMap2.get(s85);
                }
                else {
                    i = 0;
                }
                ((ars)this.x.get(s85)).c(i);
            }
        }
        else {
            s84 = "CUSTOM,";
            final String s86 = s52;
            s81 = s53;
            s82 = s54;
            s83 = s55;
            s80 = s86;
        }
        final int n3 = this.u.size() + 2;
        final urh[] array = new urh[n3];
        array[0] = this.f;
        array[n3 - 1] = this.g;
        if (this.u.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        final Iterator<urh> iterator14 = this.u.iterator();
        i = 1;
        while (iterator14.hasNext()) {
            array[i] = iterator14.next();
            ++i;
        }
        final HashSet<String> set7 = new HashSet<String>();
        for (final String s87 : this.g.S0.keySet()) {
            if (this.f.S0.containsKey(s87)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s84);
                sb2.append(s87);
                if (set5.contains(sb2.toString())) {
                    continue;
                }
                set7.add(s87);
            }
        }
        final String s88 = s81;
        final String[] r2 = set7.toArray(new String[0]);
        this.r = r2;
        this.s = new int[r2.length];
        i = 0;
        String[] r3;
        while (true) {
            r3 = this.r;
            if (i >= r3.length) {
                break;
            }
            final String s89 = r3[i];
            this.s[i] = 0;
            lj6 lj9;
            int[] s90;
            for (j = 0; j < n3; ++j) {
                if (array[j].S0.containsKey(s89)) {
                    lj9 = array[j].S0.get(s89);
                    if (lj9 != null) {
                        s90 = this.s;
                        j = s90[i];
                        s90[i] = lj9.c() + j;
                        break;
                    }
                }
            }
            ++i;
        }
        if (array[0].O0 != -1) {
            i = 1;
        }
        else {
            i = 0;
        }
        final int n4 = r3.length + 18;
        final boolean[] array2 = new boolean[n4];
        j = 1;
        final String s91 = s3;
        final String s92 = s2;
        while (j < n3) {
            final urh urh2 = array[j];
            final urh urh3 = array[j - 1];
            final boolean e3 = urh2.e(urh2.J0, urh3.J0);
            final boolean e4 = urh2.e(urh2.K0, urh3.K0);
            array2[0] |= urh2.e(urh2.I0, urh3.I0);
            final boolean b3 = array2[1];
            final int n5 = ((e4 | e3) ? 1 : 0) | i;
            array2[1] = (((b3 ? 1 : 0) | n5) != 0x0);
            array2[2] |= (n5 != 0);
            array2[3] |= urh2.e(urh2.L0, urh3.L0);
            array2[4] |= urh2.e(urh2.M0, urh3.M0);
            ++j;
        }
        final String s93 = s80;
        final String s94 = s49;
        final String s95 = s50;
        final String s96 = s51;
        final String s97 = s92;
        final String s98 = s91;
        int n6 = 0;
        for (i = 1; i < n4; ++i, n6 = j) {
            j = n6;
            if (array2[i]) {
                j = n6 + 1;
            }
        }
        this.o = new int[n6];
        i = Math.max(2, n6);
        this.p = new double[i];
        this.q = new double[i];
        int n7 = 0;
        for (i = 1; i < n4; ++i, n7 = j) {
            j = n7;
            if (array2[i]) {
                this.o[n7] = i;
                j = n7 + 1;
            }
        }
        final double[][] array3 = new double[n3][this.o.length];
        final double[] array4 = new double[n3];
        i = 0;
        String s99 = s4;
        while (i < n3) {
            final urh urh4 = array[i];
            final double[] array5 = array3[i];
            final int[] o3 = this.o;
            final float i2 = urh4.I0;
            final float j2 = urh4.J0;
            final float k2 = urh4.K0;
            final float l2 = urh4.L0;
            final float m2 = urh4.M0;
            final float n8 = urh4.N0;
            j = 0;
            int n9 = 0;
            final String s100 = s99;
            for (int[] array6 = o3; j < array6.length; ++j) {
                if (array6[j] < 6) {
                    array5[n9] = (new float[] { i2, j2, k2, l2, m2, n8 })[array6[j]];
                    ++n9;
                }
            }
            array4[i] = array[i].H0;
            ++i;
            s99 = s100;
        }
        final String s101 = s99;
        i = 0;
        while (true) {
            final int[] o4 = this.o;
            if (i >= o4.length) {
                break;
            }
            j = o4[i];
            final String[] w4 = urh.W0;
            if (j < 6) {
                String s102 = m51.y(new StringBuilder(), w4[this.o[i]], " [");
                StringBuilder f11;
                for (j = 0; j < n3; ++j) {
                    f11 = ehk.f(s102);
                    f11.append(array3[j][i]);
                    s102 = f11.toString();
                }
            }
            ++i;
        }
        this.j = new sa7[this.r.length + 1];
        int n10 = 0;
        urh[] array7 = array;
        i = n3;
        while (true) {
            final String[] r4 = this.r;
            if (n10 >= r4.length) {
                break;
            }
            final String s103 = r4[n10];
            int n11 = 0;
            int n12 = 0;
            double[] array8 = null;
            double[][] array9 = null;
            while (n11 < i) {
                if (array7[n11].S0.containsKey(s103)) {
                    double[][] array10;
                    if ((array10 = array9) == null) {
                        array8 = new double[i];
                        final lj6 lj10 = array7[n11].S0.get(s103);
                        if (lj10 == null) {
                            j = 0;
                        }
                        else {
                            j = lj10.c();
                        }
                        array10 = new double[i][j];
                    }
                    array8[n12] = array7[n11].H0;
                    final urh urh5 = array7[n11];
                    final double[] array11 = array10[n12];
                    final lj6 lj11 = urh5.S0.get(s103);
                    if (lj11 != null) {
                        urh[] array12;
                        if (lj11.c() == 1) {
                            array11[0] = lj11.a();
                            array12 = array7;
                            j = i;
                        }
                        else {
                            final int c = lj11.c();
                            final float[] array13 = new float[c];
                            lj11.b(array13);
                            int n13 = 0;
                            int n14 = 0;
                            while (true) {
                                j = i;
                                array12 = array7;
                                if (n13 >= c) {
                                    break;
                                }
                                array11[n14] = array13[n13];
                                ++n13;
                                ++n14;
                            }
                        }
                        i = j;
                        array7 = array12;
                    }
                    ++n12;
                    array9 = array10;
                }
                ++n11;
            }
            final double[] copy = Arrays.copyOf(array8, n12);
            final double[][] array14 = Arrays.copyOf(array9, n12);
            final sa7[] j3 = this.j;
            ++n10;
            j3[n10] = sa7.a(this.e, copy, array14);
        }
        this.j[0] = sa7.a(this.e, array4, array3);
        if (array7[0].O0 != -1) {
            final int[] array15 = new int[i];
            final double[] array16 = new double[i];
            final double[][] array17 = new double[i][2];
            for (j = 0; j < i; ++j) {
                array15[j] = array7[j].O0;
                array16[j] = array7[j].H0;
                array17[j][0] = array7[j].J0;
                array17[j][1] = array7[j].K0;
            }
            this.k = new vr0(array15, array16, array17);
        }
        float n15 = Float.NaN;
        this.z = new HashMap<String, abx>();
        if (this.w != null) {
            final Iterator iterator16 = set6.iterator();
            String s104 = s94;
            final String s105 = s97;
            final String s106 = s98;
            final String s107 = s56;
            final String s108 = s93;
            String s109 = s83;
            final String s110 = s82;
            final String s111 = s101;
            String s112 = s;
            final Iterator iterator17 = iterator16;
            while (iterator17.hasNext()) {
                final String b4 = (String)iterator17.next();
                Object o5;
                String s113;
                if (b4.startsWith("CUSTOM")) {
                    o5 = new abx$b();
                    s113 = s109;
                }
                else {
                    String s114 = null;
                    Label_6797: {
                        Label_6791: {
                            Label_6762: {
                                switch (b4.hashCode()) {
                                    case 156108012: {
                                        if (!b4.equals(s107)) {
                                            break;
                                        }
                                        i = 13;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case 92909918: {
                                        if (!b4.equals(s112)) {
                                            break;
                                        }
                                        i = 12;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case 37232917: {
                                        if (!b4.equals(s111)) {
                                            break;
                                        }
                                        i = 11;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -4379043: {
                                        if (!b4.equals(s105)) {
                                            break;
                                        }
                                        i = 10;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -40300674: {
                                        if (!b4.equals(s106)) {
                                            break;
                                        }
                                        i = 9;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -797520672: {
                                        if (!b4.equals(s57)) {
                                            break;
                                        }
                                        i = 8;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -908189617: {
                                        if (!b4.equals(s104)) {
                                            break;
                                        }
                                        i = 7;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -908189618: {
                                        if (!b4.equals(s95)) {
                                            break;
                                        }
                                        i = 6;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -1001078227: {
                                        if (!b4.equals(s96)) {
                                            break;
                                        }
                                        i = 5;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -1225497655: {
                                        if (!b4.equals(s48)) {
                                            break;
                                        }
                                        i = 4;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -1225497656: {
                                        if (!b4.equals(s108)) {
                                            break;
                                        }
                                        i = 3;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                    case -1225497657: {
                                        if (!b4.equals(s88)) {
                                            break;
                                        }
                                        i = 2;
                                        break Label_6762;
                                    }
                                    case -1249320805: {
                                        if (!b4.equals(s109)) {
                                            break;
                                        }
                                        i = 1;
                                        break Label_6762;
                                    }
                                    case -1249320806: {
                                        if (!b4.equals(s110)) {
                                            break;
                                        }
                                        i = 0;
                                        s114 = s109;
                                        break Label_6797;
                                    }
                                }
                                break Label_6791;
                            }
                            s114 = s109;
                            break Label_6797;
                        }
                        i = -1;
                        s114 = s109;
                    }
                    Object o6 = null;
                    switch (i) {
                        default: {
                            o6 = null;
                            break;
                        }
                        case 13: {
                            o6 = new abx$a();
                            break;
                        }
                        case 12: {
                            o6 = new abx$a();
                            break;
                        }
                        case 11: {
                            o6 = new abx$d();
                            break;
                        }
                        case 10: {
                            o6 = new abx$c();
                            break;
                        }
                        case 9: {
                            o6 = new abx$f();
                            break;
                        }
                        case 8: {
                            o6 = new abx$a();
                            break;
                        }
                        case 7: {
                            o6 = new abx$j();
                            break;
                        }
                        case 6: {
                            o6 = new abx$i();
                            break;
                        }
                        case 5: {
                            o6 = new abx$e();
                            break;
                        }
                        case 4: {
                            o6 = new abx$m();
                            break;
                        }
                        case 3: {
                            o6 = new abx$l();
                            break;
                        }
                        case 2: {
                            o6 = new abx$k();
                            break;
                        }
                        case 1: {
                            o6 = new abx$h();
                            break;
                        }
                        case 0: {
                            o6 = new abx$g();
                            break;
                        }
                    }
                    o5 = o6;
                    s113 = s114;
                }
                final String s115 = s104;
                final String s116 = s57;
                String s118;
                String s119;
                if (o5 == null) {
                    final String s117 = s116;
                    s118 = s112;
                    s119 = s117;
                }
                else {
                    if (((fqe)o5).e == 1) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    if (i != 0 && Float.isNaN(n15)) {
                        final float[] array18 = new float[2];
                        final float n16 = 1.0f / 99;
                        double n17 = 0.0;
                        n15 = 0.0f;
                        double n18 = 0.0;
                        float n19;
                        double n20;
                        mq9 f12;
                        Iterator<urh> iterator18;
                        float n21;
                        float n22;
                        urh urh6;
                        mq9 f13;
                        mq9 mq9;
                        float h4;
                        float h5;
                        float n23;
                        float n24;
                        float n25;
                        for (i = 0; i < 100; ++i, n15 = n25) {
                            n19 = i * n16;
                            n20 = n19;
                            f12 = this.f.F0;
                            iterator18 = this.u.iterator();
                            n21 = Float.NaN;
                            n22 = 0.0f;
                            while (iterator18.hasNext()) {
                                urh6 = iterator18.next();
                                f13 = urh6.F0;
                                mq9 = f12;
                                h4 = n21;
                                h5 = n22;
                                if (f13 != null) {
                                    h5 = urh6.H0;
                                    if (h5 < n19) {
                                        mq9 = f13;
                                        h4 = n21;
                                    }
                                    else {
                                        mq9 = f12;
                                        h4 = n21;
                                        h5 = n22;
                                        if (Float.isNaN(n21)) {
                                            h4 = urh6.H0;
                                            h5 = n22;
                                            mq9 = f12;
                                        }
                                    }
                                }
                                f12 = mq9;
                                n21 = h4;
                                n22 = h5;
                            }
                            if (f12 != null) {
                                n23 = n21;
                                if (Float.isNaN(n21)) {
                                    n23 = 1.0f;
                                }
                                n24 = n23 - n22;
                                n20 = (float)f12.a((n19 - n22) / n24) * n24 + n22;
                            }
                            this.j[0].c(n20, this.p);
                            this.f.f(n20, this.o, this.p, array18, 0);
                            n25 = n15;
                            if (i > 0) {
                                n25 = (float)(Math.hypot(n17 - array18[1], n18 - array18[0]) + n15);
                            }
                            n18 = array18[0];
                            n17 = array18[1];
                        }
                        final String s120 = s116;
                        s118 = s112;
                        s119 = s120;
                    }
                    else {
                        final String s121 = s116;
                        s118 = s112;
                        s119 = s121;
                    }
                    ((fqe)o5).b = b4;
                    this.z.put(b4, (abx)o5);
                }
                s57 = s119;
                s104 = s115;
                s112 = s118;
                s109 = s113;
            }
            for (final zpe zpe6 : this.w) {
                if (zpe6 instanceof dqe) {
                    ((dqe)zpe6).g(this.z);
                }
            }
            final Iterator<abx> iterator20 = this.z.values().iterator();
            while (iterator20.hasNext()) {
                ((fqe)iterator20.next()).c();
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f(" start: x: ");
        f.append(this.f.J0);
        f.append(" y: ");
        f.append(this.f.K0);
        f.append(" end: x: ");
        f.append(this.g.J0);
        f.append(" y: ");
        f.append(this.g.K0);
        return f.toString();
    }
}
