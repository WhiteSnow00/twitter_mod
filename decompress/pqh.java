import androidx.constraintlayout.widget.b$e;
import androidx.constraintlayout.widget.b$d;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b;
import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import android.util.Log;
import java.util.Objects;
import java.util.HashMap;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqh implements Comparable<pqh>
{
    public float C0;
    public int D0;
    public int E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public LinkedHashMap<String, zi6> S0;
    
    public pqh() {
        this.C0 = 1.0f;
        this.D0 = 0;
        this.F0 = 0.0f;
        this.G0 = 0.0f;
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        this.J0 = 1.0f;
        this.K0 = 1.0f;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        this.N0 = 0.0f;
        this.O0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = Float.NaN;
        this.R0 = Float.NaN;
        this.S0 = new LinkedHashMap<String, zi6>();
    }
    
    public final void b(final HashMap<String, max> hashMap, final int n) {
        for (final String s : hashMap.keySet()) {
            final max max = hashMap.get(s);
            Objects.requireNonNull(s);
            int n2 = -1;
            switch (s) {
                case "alpha": {
                    n2 = 13;
                    break;
                }
                case "transitionPathRotate": {
                    n2 = 12;
                    break;
                }
                case "elevation": {
                    n2 = 11;
                    break;
                }
                case "rotation": {
                    n2 = 10;
                    break;
                }
                case "transformPivotY": {
                    n2 = 9;
                    break;
                }
                case "transformPivotX": {
                    n2 = 8;
                    break;
                }
                case "scaleY": {
                    n2 = 7;
                    break;
                }
                case "scaleX": {
                    n2 = 6;
                    break;
                }
                case "progress": {
                    n2 = 5;
                    break;
                }
                case "translationZ": {
                    n2 = 4;
                    break;
                }
                case "translationY": {
                    n2 = 3;
                    break;
                }
                case "translationX": {
                    n2 = 2;
                    break;
                }
                case "rotationY": {
                    n2 = 1;
                    break;
                }
                case "rotationX": {
                    n2 = 0;
                    break;
                }
                default:
                    break;
            }
            float n3 = 1.0f;
            final float n4 = 0.0f;
            final float n5 = 0.0f;
            final float n6 = 0.0f;
            final float n7 = 0.0f;
            final float n8 = 0.0f;
            final float n9 = 0.0f;
            final float n10 = 0.0f;
            final float n11 = 0.0f;
            final float n12 = 0.0f;
            final float n13 = 0.0f;
            final float n14 = 0.0f;
            switch (n2) {
                default: {
                    if (!s.startsWith("CUSTOM")) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN spline ");
                        sb.append(s);
                        Log.e("MotionPaths", sb.toString());
                        continue;
                    }
                    final String s2 = s.split(",")[1];
                    if (!this.S0.containsKey(s2)) {
                        continue;
                    }
                    final zi6 zi6 = this.S0.get(s2);
                    if (max instanceof max.b) {
                        ((max.b)max).f.append(n, (Object)zi6);
                        continue;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s);
                    sb2.append(" ViewSpline not a CustomSet frame = ");
                    sb2.append(n);
                    sb2.append(", value");
                    sb2.append(zi6.a());
                    sb2.append(max);
                    Log.e("MotionPaths", sb2.toString());
                    continue;
                }
                case 13: {
                    if (!Float.isNaN(this.C0)) {
                        n3 = this.C0;
                    }
                    max.b(n, n3);
                    continue;
                }
                case 12: {
                    float q0;
                    if (Float.isNaN(this.Q0)) {
                        q0 = n14;
                    }
                    else {
                        q0 = this.Q0;
                    }
                    max.b(n, q0);
                    continue;
                }
                case 11: {
                    float f0;
                    if (Float.isNaN(this.F0)) {
                        f0 = n4;
                    }
                    else {
                        f0 = this.F0;
                    }
                    max.b(n, f0);
                    continue;
                }
                case 10: {
                    float g0;
                    if (Float.isNaN(this.G0)) {
                        g0 = n5;
                    }
                    else {
                        g0 = this.G0;
                    }
                    max.b(n, g0);
                    continue;
                }
                case 9: {
                    float m0;
                    if (Float.isNaN(this.M0)) {
                        m0 = n6;
                    }
                    else {
                        m0 = this.M0;
                    }
                    max.b(n, m0);
                    continue;
                }
                case 8: {
                    float l0;
                    if (Float.isNaN(this.L0)) {
                        l0 = n7;
                    }
                    else {
                        l0 = this.L0;
                    }
                    max.b(n, l0);
                    continue;
                }
                case 7: {
                    if (!Float.isNaN(this.K0)) {
                        n3 = this.K0;
                    }
                    max.b(n, n3);
                    continue;
                }
                case 6: {
                    if (!Float.isNaN(this.J0)) {
                        n3 = this.J0;
                    }
                    max.b(n, n3);
                    continue;
                }
                case 5: {
                    float r0;
                    if (Float.isNaN(this.R0)) {
                        r0 = n8;
                    }
                    else {
                        r0 = this.R0;
                    }
                    max.b(n, r0);
                    continue;
                }
                case 4: {
                    float p2;
                    if (Float.isNaN(this.P0)) {
                        p2 = n9;
                    }
                    else {
                        p2 = this.P0;
                    }
                    max.b(n, p2);
                    continue;
                }
                case 3: {
                    float o0;
                    if (Float.isNaN(this.O0)) {
                        o0 = n10;
                    }
                    else {
                        o0 = this.O0;
                    }
                    max.b(n, o0);
                    continue;
                }
                case 2: {
                    float n15;
                    if (Float.isNaN(this.N0)) {
                        n15 = n11;
                    }
                    else {
                        n15 = this.N0;
                    }
                    max.b(n, n15);
                    continue;
                }
                case 1: {
                    float i0;
                    if (Float.isNaN(this.I0)) {
                        i0 = n12;
                    }
                    else {
                        i0 = this.I0;
                    }
                    max.b(n, i0);
                    continue;
                }
                case 0: {
                    float h0;
                    if (Float.isNaN(this.H0)) {
                        h0 = n13;
                    }
                    else {
                        h0 = this.H0;
                    }
                    max.b(n, h0);
                    continue;
                }
            }
        }
    }
    
    @Override
    public final int compareTo(final Object o) {
        Objects.requireNonNull(o);
        return Float.compare(0.0f, 0.0f);
    }
    
    public final void e(final View view) {
        this.E0 = view.getVisibility();
        float alpha;
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        }
        else {
            alpha = view.getAlpha();
        }
        this.C0 = alpha;
        this.F0 = view.getElevation();
        this.G0 = view.getRotation();
        this.H0 = view.getRotationX();
        this.I0 = view.getRotationY();
        this.J0 = view.getScaleX();
        this.K0 = view.getScaleY();
        this.L0 = view.getPivotX();
        this.M0 = view.getPivotY();
        this.N0 = view.getTranslationX();
        this.O0 = view.getTranslationY();
        this.P0 = view.getTranslationZ();
    }
    
    public final boolean f(final float n, final float n2) {
        final boolean naN = Float.isNaN(n);
        final boolean b = true;
        boolean b2 = true;
        if (!naN && !Float.isNaN(n2)) {
            if (Math.abs(n - n2) <= 1.0E-6f) {
                b2 = false;
            }
            return b2;
        }
        return Float.isNaN(n) != Float.isNaN(n2) && b;
    }
    
    public final void g(final Rect rect, final b b, final int n, int b2) {
        rect.width();
        rect.height();
        final b$a m = b.m(b2);
        final b$d c = m.c;
        final int c2 = c.c;
        this.D0 = c2;
        b2 = c.b;
        this.E0 = b2;
        float d;
        if (b2 != 0 && c2 == 0) {
            d = 0.0f;
        }
        else {
            d = c.d;
        }
        this.C0 = d;
        final b$e f = m.f;
        final boolean i = f.m;
        this.F0 = f.n;
        this.G0 = f.b;
        this.H0 = f.c;
        this.I0 = f.d;
        this.J0 = f.e;
        this.K0 = f.f;
        this.L0 = f.g;
        this.M0 = f.h;
        this.N0 = f.j;
        this.O0 = f.k;
        this.P0 = f.l;
        bq9.c(m.d.d);
        this.Q0 = m.d.h;
        this.R0 = m.c.e;
        final Iterator iterator = m.g.keySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            b2 = 1;
            if (!hasNext) {
                break;
            }
            final String s = (String)iterator.next();
            final zi6 zi6 = m.g.get(s);
            final int d2 = nb0.D(zi6.c);
            if (d2 == 4 || d2 == 5 || d2 == 7) {
                b2 = 0;
            }
            if (b2 == 0) {
                continue;
            }
            this.S0.put(s, zi6);
        }
        Label_0376: {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        break Label_0376;
                    }
                    if (n != 4) {
                        return;
                    }
                }
                final float g0 = this.G0 + 90.0f;
                this.G0 = g0;
                if (g0 > 180.0f) {
                    this.G0 = g0 - 360.0f;
                }
                return;
            }
        }
        this.G0 -= 90.0f;
    }
    
    public final void i(final View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.e(view);
    }
}
