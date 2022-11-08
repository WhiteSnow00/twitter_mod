// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.view.ViewGroup;
import android.view.MotionEvent;
import com.google.android.material.snackbar.g;
import com.google.android.material.snackbar.e;
import android.view.ViewParent;
import java.util.WeakHashMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class SwipeDismissBehavior<V extends View> extends c<V>
{
    public i6x a;
    public SwipeDismissBehavior.SwipeDismissBehavior$b b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public float g;
    public final SwipeDismissBehavior$a h;
    
    public SwipeDismissBehavior() {
        this.d = 2;
        this.e = 0.5f;
        this.f = 0.0f;
        this.g = 0.5f;
        this.h = new i6x.c() {
            public int a;
            public int b = -1;
            
            @Override
            public final int a(final View view, final int n) {
                final WeakHashMap a = p5x.a;
                final boolean b = p5x$e.d(view) == 1;
                final int d = SwipeDismissBehavior.this.d;
                int n2;
                int n4;
                if (d == 0) {
                    if (b) {
                        n2 = this.a - view.getWidth();
                        final int n3 = this.a;
                        return Math.min(Math.max(n2, n), n3);
                    }
                    n2 = this.a;
                    n4 = view.getWidth();
                }
                else {
                    if (d != 1) {
                        n2 = this.a - view.getWidth();
                        final int n3 = view.getWidth() + this.a;
                        return Math.min(Math.max(n2, n), n3);
                    }
                    if (!b) {
                        n2 = this.a - view.getWidth();
                        final int n3 = this.a;
                        return Math.min(Math.max(n2, n), n3);
                    }
                    n2 = this.a;
                    n4 = view.getWidth();
                }
                final int n3 = n4 + n2;
                return Math.min(Math.max(n2, n), n3);
            }
            
            @Override
            public final int b(final View view, final int n, final int n2) {
                return view.getTop();
            }
            
            @Override
            public final int d(final View view) {
                return view.getWidth();
            }
            
            @Override
            public final void h(final View view, final int b) {
                this.b = b;
                this.a = view.getLeft();
                final ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            
            @Override
            public final void i(final int n) {
                final SwipeDismissBehavior.SwipeDismissBehavior$b b = SwipeDismissBehavior.this.b;
                if (b != null) {
                    final e e = (e)b;
                    if (n != 0) {
                        if (n == 1 || n == 2) {
                            g.b().e((g.b)e.a.m);
                        }
                    }
                    else {
                        g.b().f((g.b)e.a.m);
                    }
                }
            }
            
            @Override
            public final void j(final View view, final int n, final int n2, final int n3, final int n4) {
                final float n5 = view.getWidth() * SwipeDismissBehavior.this.f + this.a;
                final float n6 = view.getWidth() * SwipeDismissBehavior.this.g + this.a;
                final float n7 = (float)n;
                if (n7 <= n5) {
                    view.setAlpha(1.0f);
                }
                else if (n7 >= n6) {
                    view.setAlpha(0.0f);
                }
                else {
                    view.setAlpha(SwipeDismissBehavior.u(1.0f - (n7 - n5) / (n6 - n5)));
                }
            }
            
            @Override
            public final void k(final View view, final float n, final float n2) {
                this.b = -1;
                final int width = view.getWidth();
                boolean b = true;
                final float n3 = fcmpl(n, 0.0f);
                boolean b3 = false;
                Label_0171: {
                    Label_0168: {
                        if (n3 != 0) {
                            final WeakHashMap a = p5x.a;
                            final boolean b2 = p5x$e.d(view) == 1;
                            final int d = SwipeDismissBehavior.this.d;
                            if (d != 2) {
                                if ((d != 0) ? (d != 1) : (b2 ? (n >= 0.0f) : (n3 <= 0))) {
                                    break Label_0168;
                                }
                            }
                        }
                        else if (Math.abs(view.getLeft() - this.a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.e)) {
                            break Label_0168;
                        }
                        b3 = true;
                        break Label_0171;
                    }
                    b3 = false;
                }
                int a3;
                if (b3) {
                    final int left = view.getLeft();
                    final int a2 = this.a;
                    if (left < a2) {
                        a3 = a2 - width;
                    }
                    else {
                        a3 = a2 + width;
                    }
                }
                else {
                    a3 = this.a;
                    b = false;
                }
                if (SwipeDismissBehavior.this.a.v(a3, view.getTop())) {
                    final SwipeDismissBehavior$c swipeDismissBehavior$c = new SwipeDismissBehavior$c(SwipeDismissBehavior.this, view, b);
                    final WeakHashMap a4 = p5x.a;
                    p5x$d.m(view, (Runnable)swipeDismissBehavior$c);
                }
                else if (b) {
                    final SwipeDismissBehavior.SwipeDismissBehavior$b b4 = SwipeDismissBehavior.this.b;
                    if (b4 != null) {
                        ((e)b4).a(view);
                    }
                }
            }
            
            @Override
            public final boolean l(final View view, final int n) {
                final int b = this.b;
                return (b == -1 || b == n) && SwipeDismissBehavior.this.t(view);
            }
        };
    }
    
    public static float u(final float n) {
        return Math.min(Math.max(0.0f, n), 1.0f);
    }
    
    @Override
    public boolean h(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        boolean c = this.c;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        }
        else {
            c = coordinatorLayout.s((View)v, (int)motionEvent.getX(), (int)motionEvent.getY());
            this.c = c;
        }
        if (c) {
            if (this.a == null) {
                this.a = new i6x(((View)coordinatorLayout).getContext(), (ViewGroup)coordinatorLayout, (i6x.c)this.h);
            }
            return this.a.w(motionEvent);
        }
        return false;
    }
    
    @Override
    public final boolean i(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        final WeakHashMap a = p5x.a;
        if (p5x$d.c((View)v) == 0) {
            p5x$d.s((View)v, 1);
            p5x.w(1048576, (View)v);
            p5x.q((View)v, 0);
            if (this.t(v)) {
                p5x.x((View)v, ng$a.n, (CharSequence)null, (bh)new a(this));
            }
        }
        return false;
    }
    
    @Override
    public final boolean s(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final i6x a = this.a;
        if (a != null) {
            a.p(motionEvent);
            return true;
        }
        return false;
    }
    
    public boolean t(final View view) {
        return true;
    }
}
