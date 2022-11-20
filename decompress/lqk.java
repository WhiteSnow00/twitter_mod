import java.util.ArrayList;
import java.util.List;
import android.graphics.PointF;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqk implements nzj, a, cqe
{
    public final Path a;
    public final String b;
    public final idg c;
    public final int d;
    public final boolean e;
    public final rm1<?, Float> f;
    public final rm1<?, PointF> g;
    public final rm1<?, Float> h;
    public final rm1<?, Float> i;
    public final rm1<?, Float> j;
    public final rm1<?, Float> k;
    public final rm1<?, Float> l;
    public ozk m;
    public boolean n;
    
    public lqk(final idg c, final tm1 tm1, final mqk mqk) {
        this.a = new Path();
        this.m = new ozk();
        this.c = c;
        this.b = mqk.a;
        final int b = mqk.b;
        this.d = b;
        this.e = mqk.j;
        final rm1<Float, Float> v = mqk.c.V();
        this.f = (m6b)v;
        final rm1 v2 = mqk.d.V();
        this.g = v2;
        final rm1<Float, Float> v3 = mqk.e.V();
        this.h = (m6b)v3;
        final rm1<Float, Float> v4 = mqk.g.V();
        this.j = (m6b)v4;
        final rm1<Float, Float> v5 = mqk.i.V();
        this.l = (m6b)v5;
        if (b == 1) {
            this.i = (m6b)mqk.f.V();
            this.k = (m6b)mqk.h.V();
        }
        else {
            this.i = null;
            this.k = null;
        }
        tm1.d((rm1)v);
        tm1.d((rm1)v2);
        tm1.d((rm1)v3);
        tm1.d((rm1)v4);
        tm1.d((rm1)v5);
        if (b == 1) {
            tm1.d((rm1)this.i);
            tm1.d((rm1)this.k);
        }
        v.a((rm1.a)this);
        v2.a((rm1.a)this);
        v3.a((rm1.a)this);
        v4.a((rm1.a)this);
        v5.a((rm1.a)this);
        if (b == 1) {
            this.i.a((rm1.a)this);
            this.k.a((rm1.a)this);
        }
    }
    
    public final void a() {
        this.n = false;
        this.c.invalidateSelf();
    }
    
    public final void b(final List<qk6> list, final List<qk6> list2) {
        int n = 0;
        while (true) {
            final ArrayList list3 = (ArrayList)list;
            if (n >= list3.size()) {
                break;
            }
            final qk6 qk6 = list3.get(n);
            if (qk6 instanceof v3u) {
                final v3u v3u = (v3u)qk6;
                if (v3u.c == 1) {
                    this.m.b(v3u);
                    v3u.d(this);
                }
            }
            ++n;
        }
    }
    
    public final <T> void e(final T t, final ydg ydg) {
        if (t == pdg.u) {
            this.f.k(ydg);
        }
        else if (t == pdg.v) {
            this.h.k(ydg);
        }
        else if (t == pdg.l) {
            this.g.k(ydg);
        }
        else {
            if (t == pdg.w) {
                final m6b i = this.i;
                if (i != null) {
                    i.k(ydg);
                    return;
                }
            }
            if (t == pdg.x) {
                this.j.k(ydg);
            }
            else {
                if (t == pdg.y) {
                    final m6b k = this.k;
                    if (k != null) {
                        k.k(ydg);
                        return;
                    }
                }
                if (t == pdg.z) {
                    this.l.k(ydg);
                }
            }
        }
    }
    
    public final void f(final aqe aqe, final int n, final List<aqe> list, final aqe aqe2) {
        lbh.e(aqe, n, (List)list, aqe2, (cqe)this);
    }
    
    public final String getName() {
        return this.b;
    }
    
    public final Path r() {
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
            return this.a;
        }
        final int e = ib0.E(this.d);
        double n = 0.0;
        if (e != 0) {
            if (e == 1) {
                final int n2 = (int)Math.floor(((rm1<K, Float>)this.f).f());
                final m6b h = this.h;
                if (h != null) {
                    n = ((rm1<K, Float>)h).f();
                }
                final double radians = Math.toRadians(n - 90.0);
                final double n3 = n2;
                final float n4 = (float)(6.283185307179586 / n3);
                final float n5 = ((rm1<K, Float>)this.l).f() / 100.0f;
                final float floatValue = ((rm1<K, Float>)this.j).f();
                final double n6 = floatValue;
                float n7 = (float)(Math.cos(radians) * n6);
                float n8 = (float)(Math.sin(radians) * n6);
                this.a.moveTo(n7, n8);
                final double n9 = n4;
                double n10 = radians + n9;
                final double ceil = Math.ceil(n3);
                float n12;
                float n13;
                for (int n11 = 0; n11 < ceil; ++n11, n8 = n13, n7 = n12) {
                    n12 = (float)(Math.cos(n10) * n6);
                    n13 = (float)(Math.sin(n10) * n6);
                    if (n5 != 0.0f) {
                        final double n14 = (float)(Math.atan2(n8, n7) - 1.5707963267948966);
                        final float n15 = (float)Math.cos(n14);
                        final float n16 = (float)Math.sin(n14);
                        final double n17 = (float)(Math.atan2(n13, n12) - 1.5707963267948966);
                        final float n18 = (float)Math.cos(n17);
                        final float n19 = (float)Math.sin(n17);
                        final float n20 = floatValue * n5 * 0.25f;
                        this.a.cubicTo(n7 - n15 * n20, n8 - n16 * n20, n12 + n18 * n20, n13 + n20 * n19, n12, n13);
                    }
                    else {
                        this.a.lineTo(n12, n13);
                    }
                    n10 += n9;
                }
                final PointF pointF = this.g.f();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            }
        }
        else {
            final float floatValue2 = ((rm1<K, Float>)this.f).f();
            final m6b h2 = this.h;
            if (h2 != null) {
                n = ((rm1<K, Float>)h2).f();
            }
            final double radians2 = Math.toRadians(n - 90.0);
            final double n21 = floatValue2;
            final float n22 = (float)(6.283185307179586 / n21);
            final float n23 = n22 / 2.0f;
            final float n24 = floatValue2 - (int)floatValue2;
            final float n25 = fcmpl(n24, 0.0f);
            double n26 = radians2;
            if (n25 != 0) {
                n26 = radians2 + (1.0f - n24) * n23;
            }
            final float floatValue3 = ((rm1<K, Float>)this.j).f();
            final float floatValue4 = ((rm1<K, Float>)this.i).f();
            final m6b k = this.k;
            float n27;
            if (k != null) {
                n27 = ((rm1<K, Float>)k).f() / 100.0f;
            }
            else {
                n27 = 0.0f;
            }
            final m6b l = this.l;
            float n28;
            if (l != null) {
                n28 = ((rm1<K, Float>)l).f() / 100.0f;
            }
            else {
                n28 = 0.0f;
            }
            float e2;
            float n30;
            float n31;
            double n32;
            if (n25 != 0) {
                e2 = k6e.e(floatValue3, floatValue4, n24, floatValue4);
                final double n29 = e2;
                n30 = (float)(Math.cos(n26) * n29);
                n31 = (float)(n29 * Math.sin(n26));
                this.a.moveTo(n30, n31);
                n32 = n26 + n22 * n24 / 2.0f;
            }
            else {
                final double n33 = floatValue3;
                n30 = (float)(Math.cos(n26) * n33);
                n31 = (float)(Math.sin(n26) * n33);
                this.a.moveTo(n30, n31);
                n32 = n26 + n23;
                e2 = 0.0f;
            }
            final double n34 = Math.ceil(n21) * 2.0;
            int n35 = 0;
            int n36 = 0;
            float n37 = n31;
            float n38 = n30;
            final float n39 = n22;
            while (true) {
                final double n40 = n35;
                if (n40 >= n34) {
                    break;
                }
                float n41;
                if (n36 != 0) {
                    n41 = floatValue3;
                }
                else {
                    n41 = floatValue4;
                }
                final float n42 = fcmpl(e2, 0.0f);
                float n43;
                if (n42 != 0 && n40 == n34 - 2.0) {
                    n43 = n39 * n24 / 2.0f;
                }
                else {
                    n43 = n23;
                }
                if (n42 != 0 && n40 == n34 - 1.0) {
                    n41 = e2;
                }
                final double n44 = n41;
                final float n45 = (float)(Math.cos(n32) * n44);
                final float n46 = (float)(n44 * Math.sin(n32));
                if (n27 == 0.0f && n28 == 0.0f) {
                    this.a.lineTo(n45, n46);
                }
                else {
                    final double n47 = (float)(Math.atan2(n37, n38) - 1.5707963267948966);
                    final float n48 = (float)Math.cos(n47);
                    final float n49 = (float)Math.sin(n47);
                    final double n50 = (float)(Math.atan2(n46, n45) - 1.5707963267948966);
                    final float n51 = (float)Math.cos(n50);
                    final float n52 = (float)Math.sin(n50);
                    float n53;
                    if (n36 != 0) {
                        n53 = n27;
                    }
                    else {
                        n53 = n28;
                    }
                    float n54;
                    if (n36 != 0) {
                        n54 = n28;
                    }
                    else {
                        n54 = n27;
                    }
                    float n55;
                    if (n36 != 0) {
                        n55 = floatValue4;
                    }
                    else {
                        n55 = floatValue3;
                    }
                    float n56;
                    if (n36 != 0) {
                        n56 = floatValue3;
                    }
                    else {
                        n56 = floatValue4;
                    }
                    final float n57 = n55 * n53 * 0.47829f;
                    final float n58 = n48 * n57;
                    final float n59 = n57 * n49;
                    final float n60 = n56 * n54 * 0.47829f;
                    final float n61 = n51 * n60;
                    final float n62 = n60 * n52;
                    float n63 = n61;
                    float n64 = n58;
                    float n65 = n59;
                    float n66 = n62;
                    if (n25 != 0) {
                        if (n35 == 0) {
                            n64 = n58 * n24;
                            n65 = n59 * n24;
                            n63 = n61;
                            n66 = n62;
                        }
                        else {
                            n63 = n61;
                            n64 = n58;
                            n65 = n59;
                            n66 = n62;
                            if (n40 == n34 - 1.0) {
                                n63 = n61 * n24;
                                n66 = n62 * n24;
                                n65 = n59;
                                n64 = n58;
                            }
                        }
                    }
                    this.a.cubicTo(n38 - n64, n37 - n65, n45 + n63, n46 + n66, n45, n46);
                }
                n32 += n43;
                n36 ^= 0x1;
                ++n35;
                n38 = n45;
                n37 = n46;
            }
            final PointF pointF2 = this.g.f();
            this.a.offset(pointF2.x, pointF2.y);
            this.a.close();
        }
        this.a.close();
        this.m.c(this.a);
        this.n = true;
        return this.a;
    }
}
