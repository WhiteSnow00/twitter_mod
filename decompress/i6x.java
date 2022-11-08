import android.view.MotionEvent;
import android.util.Log;
import java.util.Objects;
import java.util.Arrays;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import android.view.View;
import android.widget.OverScroller;
import android.view.VelocityTracker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i6x
{
    public static final i6x$a x;
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public final i6x$b w;
    
    static {
        x = new Interpolator() {
            public final float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
    }
    
    public i6x(final Context context, final ViewGroup v, final c s) {
        this.c = -1;
        this.w = new Runnable() {
            @Override
            public final void run() {
                i6x.this.u(0);
            }
        };
        if (v == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (s != null) {
            this.v = v;
            this.s = s;
            final ViewConfiguration value = ViewConfiguration.get(context);
            final int n = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.p = n;
            this.o = n;
            this.b = value.getScaledTouchSlop();
            this.m = (float)value.getScaledMaximumFlingVelocity();
            this.n = (float)value.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, (Interpolator)i6x.x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }
    
    public static i6x j(final ViewGroup viewGroup, final c c) {
        final i6x i6x = new i6x(((View)viewGroup).getContext(), viewGroup, c);
        i6x.b *= (int)1.0f;
        return i6x;
    }
    
    public final void a() {
        this.c = -1;
        final float[] d = this.d;
        if (d != null) {
            Arrays.fill(d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        final VelocityTracker l = this.l;
        if (l != null) {
            l.recycle();
            this.l = null;
        }
    }
    
    public final void b(final View t, final int c) {
        if (t.getParent() == this.v) {
            this.t = t;
            this.c = c;
            this.s.h(t, c);
            this.u(1);
            return;
        }
        final StringBuilder g = w48.g("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        g.append(this.v);
        g.append(")");
        throw new IllegalArgumentException(g.toString());
    }
    
    public final boolean c(float abs, float abs2, final int n, final int n2) {
        abs = Math.abs(abs);
        abs2 = Math.abs(abs2);
        final int n3 = this.h[n];
        boolean b2;
        final boolean b = b2 = false;
        if ((n3 & n2) == n2) {
            b2 = b;
            if ((this.q & n2) != 0x0) {
                b2 = b;
                if ((this.j[n] & n2) != n2) {
                    b2 = b;
                    if ((this.i[n] & n2) != n2) {
                        final int b3 = this.b;
                        if (abs <= b3 && abs2 <= b3) {
                            b2 = b;
                        }
                        else {
                            if (abs < abs2 * 0.5f) {
                                Objects.requireNonNull(this.s);
                            }
                            b2 = b;
                            if ((this.i[n] & n2) == 0x0) {
                                b2 = b;
                                if (abs > this.b) {
                                    b2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final boolean d(int b, final int n) {
        final boolean n2 = this.n(n);
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = false;
        if (!n2) {
            return false;
        }
        final boolean b5 = (b & 0x1) == 0x1;
        if ((b & 0x2) == 0x2) {
            b = 1;
        }
        else {
            b = 0;
        }
        final float n3 = this.f[n] - this.d[n];
        final float n4 = this.g[n] - this.e[n];
        if (b5 && b != 0) {
            b = this.b;
            if (n4 * n4 + n3 * n3 > b * b) {
                b4 = true;
            }
            return b4;
        }
        if (b5) {
            boolean b6 = b2;
            if (Math.abs(n3) > this.b) {
                b6 = true;
            }
            return b6;
        }
        boolean b7 = b3;
        if (b != 0) {
            b7 = b3;
            if (Math.abs(n4) > this.b) {
                b7 = true;
            }
        }
        return b7;
    }
    
    public final boolean e(final View view, final float n, final float n2) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (view == null) {
            return false;
        }
        final boolean b4 = this.s.d(view) > 0;
        final boolean b5 = this.s.e(view) > 0;
        if (b4 && b5) {
            final int b6 = this.b;
            if (n2 * n2 + n * n > b6 * b6) {
                b3 = true;
            }
            return b3;
        }
        if (b4) {
            boolean b7 = b;
            if (Math.abs(n) > this.b) {
                b7 = true;
            }
            return b7;
        }
        boolean b8 = b2;
        if (b5) {
            b8 = b2;
            if (Math.abs(n2) > this.b) {
                b8 = true;
            }
        }
        return b8;
    }
    
    public final float f(final float n, final float n2, float n3) {
        final float abs = Math.abs(n);
        if (abs < n2) {
            return 0.0f;
        }
        if (abs > n3) {
            if (n <= 0.0f) {
                n3 = -n3;
            }
            return n3;
        }
        return n;
    }
    
    public final void g(final int n) {
        if (this.d != null) {
            if (this.n(n)) {
                this.d[n] = 0.0f;
                this.e[n] = 0.0f;
                this.f[n] = 0.0f;
                this.g[n] = 0.0f;
                this.h[n] = 0;
                this.i[n] = 0;
                this.j[n] = 0;
                this.k &= ~(1 << n);
            }
        }
    }
    
    public final int h(int n, int abs, final int n2) {
        if (n == 0) {
            return 0;
        }
        final int width = ((View)this.v).getWidth();
        final int n3 = width / 2;
        final float min = Math.min(1.0f, Math.abs(n) / (float)width);
        final float n4 = (float)n3;
        final float n5 = (float)Math.sin((min - 0.5f) * 0.47123894f);
        abs = Math.abs(abs);
        if (abs > 0) {
            n = Math.round(Math.abs((n5 * n4 + n4) / abs) * 1000.0f) * 4;
        }
        else {
            n = (int)((Math.abs(n) / (float)n2 + 1.0f) * 256.0f);
        }
        return Math.min(n, 600);
    }
    
    public final boolean i() {
        final int a = this.a;
        final boolean b = false;
        if (a == 2) {
            final boolean computeScrollOffset = this.r.computeScrollOffset();
            final int currX = this.r.getCurrX();
            final int currY = this.r.getCurrY();
            final int n = currX - this.t.getLeft();
            final int n2 = currY - this.t.getTop();
            if (n != 0) {
                p5x.r(this.t, n);
            }
            if (n2 != 0) {
                p5x.s(this.t, n2);
            }
            if (n != 0 || n2 != 0) {
                this.s.j(this.t, currX, currY, n, n2);
            }
            boolean b2 = computeScrollOffset;
            if (computeScrollOffset) {
                b2 = computeScrollOffset;
                if (currX == this.r.getFinalX()) {
                    b2 = computeScrollOffset;
                    if (currY == this.r.getFinalY()) {
                        this.r.abortAnimation();
                        b2 = false;
                    }
                }
            }
            if (!b2) {
                ((View)this.v).post((Runnable)this.w);
            }
        }
        boolean b3 = b;
        if (this.a == 2) {
            b3 = true;
        }
        return b3;
    }
    
    public final void k(final float n, final float n2) {
        this.u = true;
        this.s.k(this.t, n, n2);
        this.u = false;
        if (this.a == 1) {
            this.u(0);
        }
    }
    
    public final View l(final int n, final int n2) {
        for (int i = this.v.getChildCount() - 1; i >= 0; --i) {
            final View child = this.v.getChildAt(this.s.c(i));
            if (n >= child.getLeft() && n < child.getRight() && n2 >= child.getTop() && n2 < child.getBottom()) {
                return child;
            }
        }
        return null;
    }
    
    public final boolean m(int h, int h2, int abs, int abs2) {
        final int left = this.t.getLeft();
        final int top = this.t.getTop();
        final int n = h - left;
        final int n2 = h2 - top;
        if (n == 0 && n2 == 0) {
            this.r.abortAnimation();
            this.u(0);
            return false;
        }
        final View t = this.t;
        h = (int)this.n;
        h2 = (int)this.m;
        final int abs3 = Math.abs(abs);
        if (abs3 < h) {
            h = 0;
        }
        else {
            h = abs;
            if (abs3 > h2) {
                if (abs > 0) {
                    h = h2;
                }
                else {
                    h = -h2;
                }
            }
        }
        h2 = (int)this.n;
        abs = (int)this.m;
        final int abs4 = Math.abs(abs2);
        if (abs4 < h2) {
            h2 = 0;
        }
        else {
            h2 = abs2;
            if (abs4 > abs) {
                if (abs2 > 0) {
                    h2 = abs;
                }
                else {
                    h2 = -abs;
                }
            }
        }
        final int abs5 = Math.abs(n);
        abs = Math.abs(n2);
        abs2 = Math.abs(h);
        final int abs6 = Math.abs(h2);
        final int n3 = abs2 + abs6;
        final int n4 = abs5 + abs;
        float n5;
        float n6;
        if (h != 0) {
            n5 = (float)abs2;
            n6 = (float)n3;
        }
        else {
            n5 = (float)abs5;
            n6 = (float)n4;
        }
        final float n7 = n5 / n6;
        float n8;
        float n9;
        if (h2 != 0) {
            n8 = (float)abs6;
            n9 = (float)n3;
        }
        else {
            n8 = (float)abs;
            n9 = (float)n4;
        }
        final float n10 = n8 / n9;
        h = this.h(n, h, this.s.d(t));
        h2 = this.h(n2, h2, this.s.e(t));
        h = (int)(h2 * n10 + h * n7);
        this.r.startScroll(left, top, n, n2, h);
        this.u(2);
        return true;
    }
    
    public final boolean n(final int n) {
        final int k = this.k;
        boolean b = true;
        if ((1 << n & k) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final boolean o(final int n) {
        if (!this.n(n)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pointerId=");
            sb.append(n);
            sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            Log.e("ViewDragHelper", sb.toString());
            return false;
        }
        return true;
    }
    
    public final void p(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        final boolean b = false;
        final int n = 0;
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                Label_0216: {
                                    if (this.a == 1 && pointerId == this.c) {
                                        while (true) {
                                            while (i < motionEvent.getPointerCount()) {
                                                final int pointerId2 = motionEvent.getPointerId(i);
                                                if (pointerId2 != this.c) {
                                                    final View l = this.l((int)motionEvent.getX(i), (int)motionEvent.getY(i));
                                                    final View t = this.t;
                                                    if (l == t && this.y(t, pointerId2)) {
                                                        final int c = this.c;
                                                        if (c == -1) {
                                                            this.q();
                                                        }
                                                        break Label_0216;
                                                    }
                                                }
                                                ++i;
                                            }
                                            final int c = -1;
                                            continue;
                                        }
                                    }
                                }
                                this.g(pointerId);
                            }
                        }
                        else {
                            final int pointerId3 = motionEvent.getPointerId(actionIndex);
                            final float x = motionEvent.getX(actionIndex);
                            final float y = motionEvent.getY(actionIndex);
                            this.s(x, y, pointerId3);
                            if (this.a == 0) {
                                this.y(this.l((int)x, (int)y), pointerId3);
                                if ((this.h[pointerId3] & this.q) != 0x0) {
                                    this.s.g();
                                }
                            }
                            else {
                                final int n2 = (int)x;
                                final int n3 = (int)y;
                                final View t2 = this.t;
                                int n4;
                                if (t2 == null) {
                                    n4 = (b ? 1 : 0);
                                }
                                else {
                                    n4 = (b ? 1 : 0);
                                    if (n2 >= t2.getLeft()) {
                                        n4 = (b ? 1 : 0);
                                        if (n2 < t2.getRight()) {
                                            n4 = (b ? 1 : 0);
                                            if (n3 >= t2.getTop()) {
                                                n4 = (b ? 1 : 0);
                                                if (n3 < t2.getBottom()) {
                                                    n4 = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (n4 != 0) {
                                    this.y(this.t, pointerId3);
                                }
                            }
                        }
                    }
                    else {
                        if (this.a == 1) {
                            this.k(0.0f, 0.0f);
                        }
                        this.a();
                    }
                }
                else if (this.a == 1) {
                    if (this.o(this.c)) {
                        final int pointerIndex = motionEvent.findPointerIndex(this.c);
                        final float x2 = motionEvent.getX(pointerIndex);
                        final float y2 = motionEvent.getY(pointerIndex);
                        final float[] f = this.f;
                        final int c2 = this.c;
                        final int n5 = (int)(x2 - f[c2]);
                        final int n6 = (int)(y2 - this.g[c2]);
                        final int n7 = this.t.getLeft() + n5;
                        final int n8 = this.t.getTop() + n6;
                        final int left = this.t.getLeft();
                        final int top = this.t.getTop();
                        int a = n7;
                        if (n5 != 0) {
                            a = this.s.a(this.t, n7);
                            p5x.r(this.t, a - left);
                        }
                        int b2 = n8;
                        if (n6 != 0) {
                            b2 = this.s.b(this.t, n8, n6);
                            p5x.s(this.t, b2 - top);
                        }
                        if (n5 != 0 || n6 != 0) {
                            this.s.j(this.t, a, b2, a - left, b2 - top);
                        }
                        this.t(motionEvent);
                    }
                }
                else {
                    for (int pointerCount = motionEvent.getPointerCount(), j = n; j < pointerCount; ++j) {
                        final int pointerId4 = motionEvent.getPointerId(j);
                        if (this.o(pointerId4)) {
                            final float x3 = motionEvent.getX(j);
                            final float y3 = motionEvent.getY(j);
                            final float n9 = x3 - this.d[pointerId4];
                            final float n10 = y3 - this.e[pointerId4];
                            this.r(n9, n10, pointerId4);
                            if (this.a == 1) {
                                break;
                            }
                            final View k = this.l((int)x3, (int)y3);
                            if (this.e(k, n9, n10) && this.y(k, pointerId4)) {
                                break;
                            }
                        }
                    }
                    this.t(motionEvent);
                }
            }
            else {
                if (this.a == 1) {
                    this.q();
                }
                this.a();
            }
        }
        else {
            final float x4 = motionEvent.getX();
            final float y4 = motionEvent.getY();
            final int pointerId5 = motionEvent.getPointerId(0);
            final View m = this.l((int)x4, (int)y4);
            this.s(x4, y4, pointerId5);
            this.y(m, pointerId5);
            if ((this.h[pointerId5] & this.q) != 0x0) {
                this.s.g();
            }
        }
    }
    
    public final void q() {
        this.l.computeCurrentVelocity(1000, this.m);
        this.k(this.f(this.l.getXVelocity(this.c), this.n, this.m), this.f(this.l.getYVelocity(this.c), this.n, this.m));
    }
    
    public final void r(final float n, final float n2, final int n3) {
        int c;
        final boolean b = (c = (this.c(n, n2, n3, 1) ? 1 : 0)) != 0;
        if (this.c(n2, n, n3, 4)) {
            c = ((b ? 1 : 0) | 0x4);
        }
        int n4 = c;
        if (this.c(n, n2, n3, 2)) {
            n4 = (c | 0x2);
        }
        int n5 = n4;
        if (this.c(n2, n, n3, 8)) {
            n5 = (n4 | 0x8);
        }
        if (n5 != 0) {
            final int[] i = this.i;
            i[n3] |= n5;
            this.s.f(n5, n3);
        }
    }
    
    public final void s(final float n, final float n2, final int n3) {
        final float[] d = this.d;
        boolean b = false;
        if (d == null || d.length <= n3) {
            final int n4 = n3 + 1;
            final float[] d2 = new float[n4];
            final float[] e = new float[n4];
            final float[] f = new float[n4];
            final float[] g = new float[n4];
            final int[] h = new int[n4];
            final int[] i = new int[n4];
            final int[] j = new int[n4];
            if (d != null) {
                System.arraycopy(d, 0, d2, 0, d.length);
                final float[] e2 = this.e;
                System.arraycopy(e2, 0, e, 0, e2.length);
                final float[] f2 = this.f;
                System.arraycopy(f2, 0, f, 0, f2.length);
                final float[] g2 = this.g;
                System.arraycopy(g2, 0, g, 0, g2.length);
                final int[] h2 = this.h;
                System.arraycopy(h2, 0, h, 0, h2.length);
                final int[] k = this.i;
                System.arraycopy(k, 0, i, 0, k.length);
                final int[] l = this.j;
                System.arraycopy(l, 0, j, 0, l.length);
            }
            this.d = d2;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        this.d[n3] = (this.f[n3] = n);
        this.e[n3] = (this.g[n3] = n2);
        final int[] h3 = this.h;
        final int n5 = (int)n;
        final int n6 = (int)n2;
        if (n5 < ((View)this.v).getLeft() + this.o) {
            b = true;
        }
        int n7 = b ? 1 : 0;
        if (n6 < ((View)this.v).getTop() + this.o) {
            n7 = ((b ? 1 : 0) | 0x4);
        }
        int n8 = n7;
        if (n5 > ((View)this.v).getRight() - this.o) {
            n8 = (n7 | 0x2);
        }
        int n9 = n8;
        if (n6 > ((View)this.v).getBottom() - this.o) {
            n9 = (n8 | 0x8);
        }
        h3[n3] = n9;
        this.k |= 1 << n3;
    }
    
    public final void t(final MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
            final int pointerId = motionEvent.getPointerId(i);
            if (this.o(pointerId)) {
                final float x = motionEvent.getX(i);
                final float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }
    
    public final void u(final int a) {
        ((View)this.v).removeCallbacks((Runnable)this.w);
        if (this.a != a) {
            this.a = a;
            this.s.i(a);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }
    
    public final boolean v(final int n, final int n2) {
        if (this.u) {
            return this.m(n, n2, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    
    public final boolean w(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            Label_0484: {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    break Label_0484;
                                }
                                this.g(motionEvent.getPointerId(actionIndex));
                                break Label_0484;
                            }
                            else {
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                final float x = motionEvent.getX(actionIndex);
                                final float y = motionEvent.getY(actionIndex);
                                this.s(x, y, pointerId);
                                final int a = this.a;
                                if (a == 0) {
                                    if ((this.h[pointerId] & this.q) != 0x0) {
                                        this.s.g();
                                    }
                                    break Label_0484;
                                }
                                else {
                                    if (a != 2) {
                                        break Label_0484;
                                    }
                                    final View l = this.l((int)x, (int)y);
                                    if (l == this.t) {
                                        this.y(l, pointerId);
                                    }
                                    break Label_0484;
                                }
                            }
                        }
                    }
                    else {
                        if (this.d == null) {
                            break Label_0484;
                        }
                        if (this.e == null) {
                            break Label_0484;
                        }
                        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                            final int pointerId2 = motionEvent.getPointerId(i);
                            if (this.o(pointerId2)) {
                                final float x2 = motionEvent.getX(i);
                                final float y2 = motionEvent.getY(i);
                                final float n = x2 - this.d[pointerId2];
                                final float n2 = y2 - this.e[pointerId2];
                                final View j = this.l((int)x2, (int)y2);
                                final boolean b = j != null && this.e(j, n, n2);
                                if (b) {
                                    final int left = j.getLeft();
                                    final int a2 = this.s.a(j, (int)n + left);
                                    final int top = j.getTop();
                                    final int n3 = (int)n2;
                                    final int b2 = this.s.b(j, top + n3, n3);
                                    final int d = this.s.d(j);
                                    final int e = this.s.e(j);
                                    if (d == 0 || (d > 0 && a2 == left)) {
                                        if (e == 0) {
                                            break;
                                        }
                                        if (e > 0 && b2 == top) {
                                            break;
                                        }
                                    }
                                }
                                this.r(n, n2, pointerId2);
                                if (this.a == 1) {
                                    break;
                                }
                                if (b && this.y(j, pointerId2)) {
                                    break;
                                }
                            }
                        }
                        this.t(motionEvent);
                        break Label_0484;
                    }
                }
                this.a();
            }
        }
        else {
            final float x3 = motionEvent.getX();
            final float y3 = motionEvent.getY();
            final int pointerId3 = motionEvent.getPointerId(0);
            this.s(x3, y3, pointerId3);
            final View k = this.l((int)x3, (int)y3);
            if (k == this.t && this.a == 2) {
                this.y(k, pointerId3);
            }
            if ((this.h[pointerId3] & this.q) != 0x0) {
                this.s.g();
            }
        }
        boolean b3 = false;
        if (this.a == 1) {
            b3 = true;
        }
        return b3;
    }
    
    public final boolean x(final View t, final int n, final int n2) {
        this.t = t;
        this.c = -1;
        final boolean m = this.m(n, n2, 0, 0);
        if (!m && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return m;
    }
    
    public final boolean y(final View view, final int c) {
        if (view == this.t && this.c == c) {
            return true;
        }
        if (view != null && this.s.l(view, c)) {
            this.b(view, this.c = c);
            return true;
        }
        return false;
    }
    
    public abstract static class c
    {
        public int a(final View view, final int n) {
            return 0;
        }
        
        public abstract int b(final View p0, final int p1, final int p2);
        
        public int c(final int n) {
            return n;
        }
        
        public int d(final View view) {
            return 0;
        }
        
        public int e(final View view) {
            return 0;
        }
        
        public void f(final int n, final int n2) {
        }
        
        public void g() {
        }
        
        public void h(final View view, final int n) {
        }
        
        public abstract void i(final int p0);
        
        public abstract void j(final View p0, final int p1, final int p2, final int p3, final int p4);
        
        public abstract void k(final View p0, final float p1, final float p2);
        
        public abstract boolean l(final View p0, final int p1);
    }
}
