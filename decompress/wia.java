import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Comparator;
import java.util.Collections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wia extends wf
{
    public static final Rect n;
    public static final wfb.a<ng> o;
    public static final wia$b p;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public int k;
    public int l;
    public int m;
    
    static {
        n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        wia.o = new wfb.a<ng>() {
            public final void a(final Object o, final Rect rect) {
                ((ng)o).g(rect);
            }
        };
        p = new Object() {};
    }
    
    public wia(final View i) {
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new int[2];
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        if (i != null) {
            this.i = i;
            this.h = (AccessibilityManager)i.getContext().getSystemService("accessibility");
            i.setFocusable(true);
            final WeakHashMap a = b7x.a;
            if (b7x$d.c(i) == 0) {
                b7x$d.s(i, 1);
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }
    
    @Override
    public final pg b(final View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }
    
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }
    
    @Override
    public final void d(final View view, final ng ng) {
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        this.v(ng);
    }
    
    public final boolean j(final int n) {
        if (this.k == n) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            this.z(n, 65536);
            return true;
        }
        return false;
    }
    
    public final boolean k(final int n) {
        if (this.l != n) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        this.x(n, false);
        this.z(n, 8);
        return true;
    }
    
    public final AccessibilityEvent l(final int n, final int n2) {
        if (n == -1) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
            this.i.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        final AccessibilityEvent obtain2 = AccessibilityEvent.obtain(n2);
        final ng s = this.s(n);
        ((AccessibilityRecord)obtain2).getText().add(s.p());
        ((AccessibilityRecord)obtain2).setContentDescription(s.k());
        ((AccessibilityRecord)obtain2).setScrollable(s.a.isScrollable());
        ((AccessibilityRecord)obtain2).setPassword(s.a.isPassword());
        ((AccessibilityRecord)obtain2).setEnabled(s.r());
        ((AccessibilityRecord)obtain2).setChecked(s.a.isChecked());
        this.u(n, obtain2);
        if (((AccessibilityRecord)obtain2).getText().isEmpty() && ((AccessibilityRecord)obtain2).getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        ((AccessibilityRecord)obtain2).setClassName(s.i());
        tg.a((AccessibilityRecord)obtain2, this.i, n);
        obtain2.setPackageName((CharSequence)this.i.getContext().getPackageName());
        return obtain2;
    }
    
    public final ng m(int i) {
        final ng v = ng.v();
        v.K(true);
        v.L(true);
        v.E((CharSequence)"android.view.View");
        final Rect n = wia.n;
        v.A(n);
        v.B(n);
        v.T(this.i);
        this.w(i, v);
        if (v.p() == null && v.k() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        v.g(this.e);
        if (this.e.equals((Object)n)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        final int f = v.f();
        if ((f & 0x40) != 0x0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((f & 0x80) == 0x0) {
            v.R((CharSequence)this.i.getContext().getPackageName());
            final View j = this.i;
            v.c = i;
            v.a.setSource(j, i);
            final int k = this.k;
            final int n2 = 0;
            if (k == i) {
                v.y(true);
                v.a(128);
            }
            else {
                v.y(false);
                v.a(64);
            }
            final boolean b = this.l == i;
            if (b) {
                v.a(2);
            }
            else if (v.s()) {
                v.a(1);
            }
            v.M(b);
            this.i.getLocationOnScreen(this.g);
            v.h(this.d);
            if (this.d.equals((Object)n)) {
                v.g(this.d);
                if (v.b != -1) {
                    ng v2;
                    Rect d;
                    Rect e;
                    for (v2 = ng.v(), i = v.b; i != -1; i = v2.b) {
                        v2.U(this.i, -1);
                        v2.A(wia.n);
                        this.w(i, v2);
                        v2.g(this.e);
                        d = this.d;
                        e = this.e;
                        d.offset(e.left, e.top);
                    }
                    v2.w();
                }
                this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            }
            if (this.i.getLocalVisibleRect(this.f)) {
                this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                if (this.d.intersect(this.f)) {
                    v.B(this.d);
                    final Rect d2 = this.d;
                    i = n2;
                    Label_0621: {
                        if (d2 != null) {
                            if (d2.isEmpty()) {
                                i = n2;
                            }
                            else if (this.i.getWindowVisibility() != 0) {
                                i = n2;
                            }
                            else {
                                ViewParent viewParent;
                                View view;
                                for (viewParent = this.i.getParent(); viewParent instanceof View; viewParent = view.getParent()) {
                                    view = (View)viewParent;
                                    i = n2;
                                    if (view.getAlpha() <= 0.0f) {
                                        break Label_0621;
                                    }
                                    if (view.getVisibility() != 0) {
                                        i = n2;
                                        break Label_0621;
                                    }
                                }
                                i = n2;
                                if (viewParent != null) {
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        v.c0(true);
                    }
                }
            }
            return v;
        }
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }
    
    public final boolean n(final MotionEvent motionEvent) {
        final boolean enabled = this.h.isEnabled();
        boolean b = true;
        if (enabled) {
            if (this.h.isTouchExplorationEnabled()) {
                final int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    final int m = this.m;
                    if (m != Integer.MIN_VALUE) {
                        if (m != Integer.MIN_VALUE) {
                            this.z(this.m = Integer.MIN_VALUE, 128);
                            this.z(m, 256);
                        }
                        return true;
                    }
                    return false;
                }
                else {
                    final int o = this.o(motionEvent.getX(), motionEvent.getY());
                    final int i = this.m;
                    if (i != o) {
                        this.z(this.m = o, 128);
                        this.z(i, 256);
                    }
                    if (o != Integer.MIN_VALUE) {
                        return b;
                    }
                }
            }
        }
        b = false;
        return b;
    }
    
    public abstract int o(final float p0, final float p1);
    
    public abstract void p(final List<Integer> p0);
    
    public final void q(final int n) {
        if (n != Integer.MIN_VALUE && this.h.isEnabled()) {
            final ViewParent parent = this.i.getParent();
            if (parent != null) {
                final AccessibilityEvent l = this.l(n, 2048);
                ag.b(l, 0);
                parent.requestSendAccessibilityEvent(this.i, l);
            }
        }
    }
    
    public final boolean r(int n, final Rect rect) {
        final ArrayList list = new ArrayList();
        this.p(list);
        final r1r r1r = new r1r();
        final int n2 = 0;
        for (int i = 0; i < list.size(); ++i) {
            r1r.g((int)list.get(i), this.m((int)list.get(i)));
        }
        final int l = this.l;
        ng ng;
        if (l == Integer.MIN_VALUE) {
            ng = null;
        }
        else {
            ng = r1r.e(l, null);
        }
        final int n3 = -1;
        ng ng3;
        if (n != 1 && n != 2) {
            if (n != 17 && n != 33 && n != 66 && n != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            final Rect rect2 = new Rect();
            final int j = this.l;
            if (j != Integer.MIN_VALUE) {
                this.s(j).g(rect2);
            }
            else if (rect != null) {
                rect2.set(rect);
            }
            else {
                final View k = this.i;
                final int width = k.getWidth();
                final int height = k.getHeight();
                if (n != 17) {
                    if (n != 33) {
                        if (n != 66) {
                            if (n != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            rect2.set(0, -1, width, -1);
                        }
                        else {
                            rect2.set(-1, 0, -1, height);
                        }
                    }
                    else {
                        rect2.set(0, height, width, height);
                    }
                }
                else {
                    rect2.set(width, 0, width, height);
                }
            }
            final Object p2 = wia.p;
            final wfb.a<ng> o = wia.o;
            final Rect rect3 = new Rect(rect2);
            if (n != 17) {
                if (n != 33) {
                    if (n != 66) {
                        if (n != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect3.offset(0, -(rect2.height() + 1));
                    }
                    else {
                        rect3.offset(-(rect2.width() + 1), 0);
                    }
                }
                else {
                    rect3.offset(0, rect2.height() + 1);
                }
            }
            else {
                rect3.offset(rect2.width() + 1, 0);
            }
            Objects.requireNonNull(p2);
            final int h0 = r1r.H0;
            final Rect rect4 = new Rect();
            int n4 = 0;
            ng ng2 = null;
            while (true) {
                ng3 = ng2;
                if (n4 >= h0) {
                    break;
                }
                final ng ng4 = (ng)r1r.G0[n4];
                if (ng4 != ng) {
                    o.a(ng4, rect4);
                    boolean b = false;
                    Label_0633: {
                        Label_0630: {
                            if (wfb.c(rect2, rect4, n)) {
                                if (wfb.c(rect2, rect3, n)) {
                                    if (!wfb.a(n, rect2, rect4, rect3)) {
                                        if (wfb.a(n, rect2, rect3, rect4)) {
                                            break Label_0630;
                                        }
                                        final int d = wfb.d(n, rect2, rect4);
                                        final int e = wfb.e(n, rect2, rect4);
                                        final int d2 = wfb.d(n, rect2, rect3);
                                        final int e2 = wfb.e(n, rect2, rect3);
                                        if (e * e + d * 13 * d >= e2 * e2 + d2 * 13 * d2) {
                                            break Label_0630;
                                        }
                                    }
                                }
                                b = true;
                                break Label_0633;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        rect3.set(rect4);
                        ng2 = ng4;
                    }
                }
                ++n4;
            }
        }
        else {
            final View m = this.i;
            final WeakHashMap a = b7x.a;
            final boolean b2 = b7x$e.d(m) == 1;
            final Object p3 = wia.p;
            final wfb.a<ng> o2 = wia.o;
            Objects.requireNonNull(p3);
            final int h2 = r1r.H0;
            final ArrayList list2 = new ArrayList(h2);
            for (int n5 = 0; n5 < h2; ++n5) {
                list2.add((Object)r1r.G0[n5]);
            }
            Collections.sort((List<Object>)list2, new wfb.b<Object>(b2, (wfb.a<? super Object>)o2));
            Object o3 = null;
            Label_0867: {
                if (n != 1) {
                    if (n != 2) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    }
                    final int size = list2.size();
                    if (ng == null) {
                        n = -1;
                    }
                    else {
                        n = list2.lastIndexOf(ng);
                    }
                    if (++n < size) {
                        o3 = list2.get(n);
                        break Label_0867;
                    }
                }
                else {
                    n = list2.size();
                    if (ng != null) {
                        n = list2.indexOf(ng);
                    }
                    if (--n >= 0) {
                        o3 = list2.get(n);
                        break Label_0867;
                    }
                }
                o3 = null;
            }
            ng3 = (ng)o3;
        }
        n = n2;
        if (ng3 == null) {
            n = Integer.MIN_VALUE;
        }
        else {
            int n6;
            while (true) {
                n6 = n3;
                if (n >= r1r.H0) {
                    break;
                }
                if (r1r.G0[n] == ng3) {
                    n6 = n;
                    break;
                }
                ++n;
            }
            n = r1r.F0[n6];
        }
        return this.y(n);
    }
    
    public final ng s(int i) {
        if (i != -1) {
            return this.m(i);
        }
        final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.i);
        final ng ng = new ng(obtain);
        final View j = this.i;
        final WeakHashMap a = b7x.a;
        j.onInitializeAccessibilityNodeInfo(obtain);
        final ArrayList list = new ArrayList();
        this.p(list);
        if (obtain.getChildCount() > 0 && list.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        for (i = 0; i < list.size(); ++i) {
            ng.a.addChild(this.i, (int)list.get(i));
        }
        return ng;
    }
    
    public abstract boolean t(final int p0, final int p1, final Bundle p2);
    
    public void u(final int n, final AccessibilityEvent accessibilityEvent) {
    }
    
    public void v(final ng ng) {
    }
    
    public abstract void w(final int p0, final ng p1);
    
    public void x(final int n, final boolean b) {
    }
    
    public final boolean y(final int l) {
        if (!this.i.isFocused() && !this.i.requestFocus()) {
            return false;
        }
        final int i = this.l;
        if (i == l) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.k(i);
        }
        if (l == Integer.MIN_VALUE) {
            return false;
        }
        this.x(this.l = l, true);
        this.z(l, 8);
        return true;
    }
    
    public final boolean z(final int n, final int n2) {
        if (n != Integer.MIN_VALUE && this.h.isEnabled()) {
            final ViewParent parent = this.i.getParent();
            return parent != null && parent.requestSendAccessibilityEvent(this.i, this.l(n, n2));
        }
        return false;
    }
    
    public final class c extends pg
    {
        public final wia b;
        
        public c(final wia b) {
            this.b = b;
        }
        
        @Override
        public final ng a(final int n) {
            return new ng(AccessibilityNodeInfo.obtain(this.b.s(n).a));
        }
        
        @Override
        public final ng b(int n) {
            if (n == 2) {
                n = this.b.k;
            }
            else {
                n = this.b.l;
            }
            if (n == Integer.MIN_VALUE) {
                return null;
            }
            return new ng(AccessibilityNodeInfo.obtain(this.b.s(n).a));
        }
        
        @Override
        public final boolean c(final int k, int i, final Bundle bundle) {
            final wia b = this.b;
            boolean b2;
            if (k != -1) {
                b2 = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 64) {
                            if (i != 128) {
                                b2 = b.t(k, i, bundle);
                            }
                            else {
                                b2 = b.j(k);
                            }
                        }
                        else {
                            if (b.h.isEnabled()) {
                                if (b.h.isTouchExplorationEnabled()) {
                                    i = b.k;
                                    if (i != k) {
                                        if (i != Integer.MIN_VALUE) {
                                            b.j(i);
                                        }
                                        b.k = k;
                                        b.i.invalidate();
                                        b.z(k, 32768);
                                        return b2;
                                    }
                                }
                            }
                            b2 = false;
                        }
                    }
                    else {
                        b2 = b.k(k);
                    }
                }
                else {
                    b2 = b.y(k);
                }
            }
            else {
                final View j = b.i;
                final WeakHashMap a = b7x.a;
                b2 = b7x$d.j(j, i, bundle);
            }
            return b2;
        }
    }
}
