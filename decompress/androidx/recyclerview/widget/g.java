// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import java.util.WeakHashMap;
import android.view.ViewPropertyAnimator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.util.List;
import java.util.ArrayList;
import android.animation.TimeInterpolator;

public class g extends g0
{
    public static TimeInterpolator s;
    public ArrayList<RecyclerView$c0> h;
    public ArrayList<RecyclerView$c0> i;
    public ArrayList<e> j;
    public ArrayList<d> k;
    public ArrayList<ArrayList<RecyclerView$c0>> l;
    public ArrayList<ArrayList<e>> m;
    public ArrayList<ArrayList<d>> n;
    public ArrayList<RecyclerView$c0> o;
    public ArrayList<RecyclerView$c0> p;
    public ArrayList<RecyclerView$c0> q;
    public ArrayList<RecyclerView$c0> r;
    
    public g() {
        this.h = new ArrayList<RecyclerView$c0>();
        this.i = new ArrayList<RecyclerView$c0>();
        this.j = new ArrayList<e>();
        this.k = new ArrayList<d>();
        this.l = new ArrayList<ArrayList<RecyclerView$c0>>();
        this.m = new ArrayList<ArrayList<e>>();
        this.n = new ArrayList<ArrayList<d>>();
        this.o = new ArrayList<RecyclerView$c0>();
        this.p = new ArrayList<RecyclerView$c0>();
        this.q = new ArrayList<RecyclerView$c0>();
        this.r = new ArrayList<RecyclerView$c0>();
    }
    
    public final boolean g(final RecyclerView$c0 recyclerView$c0, final List<Object> list) {
        return !list.isEmpty() || this.f(recyclerView$c0);
    }
    
    public final void j(final RecyclerView$c0 recyclerView$c0) {
        final View d0 = recyclerView$c0.D0;
        d0.animate().cancel();
        for (int i = this.j.size() - 1; i >= 0; --i) {
            if (this.j.get(i).a == recyclerView$c0) {
                d0.setTranslationY(0.0f);
                d0.setTranslationX(0.0f);
                ((RecyclerView$j)this).h(recyclerView$c0);
                this.j.remove(i);
            }
        }
        this.t(this.k, recyclerView$c0);
        if (this.h.remove(recyclerView$c0)) {
            d0.setAlpha(1.0f);
            ((RecyclerView$j)this).h(recyclerView$c0);
        }
        if (this.i.remove(recyclerView$c0)) {
            d0.setAlpha(1.0f);
            ((RecyclerView$j)this).h(recyclerView$c0);
        }
        for (int j = this.n.size() - 1; j >= 0; --j) {
            final ArrayList list = this.n.get(j);
            this.t(list, recyclerView$c0);
            if (list.isEmpty()) {
                this.n.remove(j);
            }
        }
        for (int k = this.m.size() - 1; k >= 0; --k) {
            final ArrayList list2 = this.m.get(k);
            int l = list2.size() - 1;
            while (l >= 0) {
                if (((e)list2.get(l)).a == recyclerView$c0) {
                    d0.setTranslationY(0.0f);
                    d0.setTranslationX(0.0f);
                    ((RecyclerView$j)this).h(recyclerView$c0);
                    list2.remove(l);
                    if (list2.isEmpty()) {
                        this.m.remove(k);
                        break;
                    }
                    break;
                }
                else {
                    --l;
                }
            }
        }
        for (int n = this.l.size() - 1; n >= 0; --n) {
            final ArrayList list3 = this.l.get(n);
            if (list3.remove(recyclerView$c0)) {
                d0.setAlpha(1.0f);
                ((RecyclerView$j)this).h(recyclerView$c0);
                if (list3.isEmpty()) {
                    this.l.remove(n);
                }
            }
        }
        this.q.remove(recyclerView$c0);
        this.o.remove(recyclerView$c0);
        this.r.remove(recyclerView$c0);
        this.p.remove(recyclerView$c0);
        this.s();
    }
    
    public final void k() {
        int size = this.j.size();
        while (--size >= 0) {
            final e e = this.j.get(size);
            final View d0 = e.a.D0;
            d0.setTranslationY(0.0f);
            d0.setTranslationX(0.0f);
            ((RecyclerView$j)this).h(e.a);
            this.j.remove(size);
        }
        int size2 = this.h.size();
        while (--size2 >= 0) {
            ((RecyclerView$j)this).h((RecyclerView$c0)this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (--size3 >= 0) {
            final RecyclerView$c0 recyclerView$c0 = this.i.get(size3);
            recyclerView$c0.D0.setAlpha(1.0f);
            ((RecyclerView$j)this).h(recyclerView$c0);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (--size4 >= 0) {
            final d d2 = this.k.get(size4);
            final RecyclerView$c0 a = d2.a;
            if (a != null) {
                this.u(d2, a);
            }
            final RecyclerView$c0 b = d2.b;
            if (b != null) {
                this.u(d2, b);
            }
        }
        this.k.clear();
        if (!this.l()) {
            return;
        }
        int size5 = this.m.size();
        while (true) {
            final int n = size5 - 1;
            if (n < 0) {
                break;
            }
            final ArrayList list = this.m.get(n);
            int size6 = list.size();
            while (--size6 >= 0) {
                final e e2 = (e)list.get(size6);
                final View d3 = e2.a.D0;
                d3.setTranslationY(0.0f);
                d3.setTranslationX(0.0f);
                ((RecyclerView$j)this).h(e2.a);
                list.remove(size6);
                if (list.isEmpty()) {
                    this.m.remove(list);
                }
            }
            size5 = n;
        }
        int size7 = this.l.size();
        while (true) {
            final int n2 = size7 - 1;
            if (n2 < 0) {
                break;
            }
            final ArrayList list2 = this.l.get(n2);
            int size8 = list2.size();
            while (--size8 >= 0) {
                final RecyclerView$c0 recyclerView$c2 = (RecyclerView$c0)list2.get(size8);
                recyclerView$c2.D0.setAlpha(1.0f);
                ((RecyclerView$j)this).h(recyclerView$c2);
                list2.remove(size8);
                if (list2.isEmpty()) {
                    this.l.remove(list2);
                }
            }
            size7 = n2;
        }
        int size9 = this.n.size();
        while (true) {
            final int n3 = size9 - 1;
            if (n3 < 0) {
                break;
            }
            final ArrayList list3 = this.n.get(n3);
            int size10 = list3.size();
            while (--size10 >= 0) {
                final d d4 = (d)list3.get(size10);
                final RecyclerView$c0 a2 = d4.a;
                if (a2 != null) {
                    this.u(d4, a2);
                }
                final RecyclerView$c0 b2 = d4.b;
                if (b2 != null) {
                    this.u(d4, b2);
                }
                if (list3.isEmpty()) {
                    this.n.remove(list3);
                }
            }
            size9 = n3;
        }
        this.r(this.q);
        this.r(this.p);
        this.r(this.o);
        this.r(this.r);
        ((RecyclerView$j)this).i();
    }
    
    public final boolean l() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }
    
    public final void m() {
        final boolean b = this.h.isEmpty() ^ true;
        final boolean b2 = this.j.isEmpty() ^ true;
        final boolean b3 = this.k.isEmpty() ^ true;
        final boolean b4 = this.i.isEmpty() ^ true;
        if (!b && !b2 && !b4 && !b3) {
            return;
        }
        for (final RecyclerView$c0 recyclerView$c0 : this.h) {
            final View d0 = recyclerView$c0.D0;
            final ViewPropertyAnimator animate = d0.animate();
            this.q.add(recyclerView$c0);
            animate.setDuration(((RecyclerView$j)this).d).alpha(0.0f).setListener((Animator$AnimatorListener)new h(this, recyclerView$c0, animate, d0)).start();
        }
        this.h.clear();
        if (b2) {
            final ArrayList list = new ArrayList();
            list.addAll(this.j);
            this.m.add(list);
            this.j.clear();
            final Runnable runnable = new Runnable(this, list) {
                public final ArrayList D0;
                public final g E0;
                
                @Override
                public final void run() {
                    for (final e e : this.D0) {
                        final g e2 = this.E0;
                        final RecyclerView$c0 a = e.a;
                        final int b = e.b;
                        final int c = e.c;
                        final int d = e.d;
                        final int e3 = e.e;
                        Objects.requireNonNull(e2);
                        final View d2 = a.D0;
                        final int n = d - b;
                        final int n2 = e3 - c;
                        if (n != 0) {
                            d2.animate().translationX(0.0f);
                        }
                        if (n2 != 0) {
                            d2.animate().translationY(0.0f);
                        }
                        final ViewPropertyAnimator animate = d2.animate();
                        e2.p.add(a);
                        animate.setDuration(((RecyclerView$j)e2).e).setListener((Animator$AnimatorListener)new j(e2, a, n, d2, n2, animate)).start();
                    }
                    this.D0.clear();
                    this.E0.m.remove(this.D0);
                }
            };
            if (b) {
                final View d2 = ((e)list.get(0)).a.D0;
                final long d3 = ((RecyclerView$j)this).d;
                final WeakHashMap a = j6x.a;
                j6x$d.n(d2, (Runnable)runnable, d3);
            }
            else {
                runnable.run();
            }
        }
        if (b3) {
            final ArrayList list2 = new ArrayList();
            list2.addAll(this.k);
            this.n.add(list2);
            this.k.clear();
            final Runnable runnable2 = new Runnable(this, list2) {
                public final ArrayList D0;
                public final g E0;
                
                @Override
                public final void run() {
                    for (final d d : this.D0) {
                        final g e0 = this.E0;
                        Objects.requireNonNull(e0);
                        final RecyclerView$c0 a = d.a;
                        View d2 = null;
                        View d3;
                        if (a == null) {
                            d3 = null;
                        }
                        else {
                            d3 = a.D0;
                        }
                        final RecyclerView$c0 b = d.b;
                        if (b != null) {
                            d2 = b.D0;
                        }
                        if (d3 != null) {
                            final ViewPropertyAnimator setDuration = d3.animate().setDuration(((RecyclerView$j)e0).f);
                            e0.r.add(d.a);
                            setDuration.translationX((float)(d.e - d.c));
                            setDuration.translationY((float)(d.f - d.d));
                            setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new k(e0, d, setDuration, d3)).start();
                        }
                        if (d2 != null) {
                            final ViewPropertyAnimator animate = d2.animate();
                            e0.r.add(d.b);
                            animate.translationX(0.0f).translationY(0.0f).setDuration(((RecyclerView$j)e0).f).alpha(1.0f).setListener((Animator$AnimatorListener)new l(e0, d, animate, d2)).start();
                        }
                    }
                    this.D0.clear();
                    this.E0.n.remove(this.D0);
                }
            };
            if (b) {
                final View d4 = ((d)list2.get(0)).a.D0;
                final long d5 = ((RecyclerView$j)this).d;
                final WeakHashMap a2 = j6x.a;
                j6x$d.n(d4, (Runnable)runnable2, d5);
            }
            else {
                runnable2.run();
            }
        }
        if (b4) {
            final ArrayList list3 = new ArrayList();
            list3.addAll(this.i);
            this.l.add(list3);
            this.i.clear();
            final Runnable runnable3 = new Runnable(this, list3) {
                public final ArrayList D0;
                public final g E0;
                
                @Override
                public final void run() {
                    for (final RecyclerView$c0 recyclerView$c0 : this.D0) {
                        final g e0 = this.E0;
                        Objects.requireNonNull(e0);
                        final View d0 = recyclerView$c0.D0;
                        final ViewPropertyAnimator animate = d0.animate();
                        e0.o.add(recyclerView$c0);
                        animate.alpha(1.0f).setDuration(((RecyclerView$j)e0).c).setListener((Animator$AnimatorListener)new i(e0, recyclerView$c0, d0, animate)).start();
                    }
                    this.D0.clear();
                    this.E0.l.remove(this.D0);
                }
            };
            if (!b && !b2 && !b3) {
                runnable3.run();
            }
            else {
                long f = 0L;
                long d6;
                if (b) {
                    d6 = ((RecyclerView$j)this).d;
                }
                else {
                    d6 = 0L;
                }
                long e;
                if (b2) {
                    e = ((RecyclerView$j)this).e;
                }
                else {
                    e = 0L;
                }
                if (b3) {
                    f = ((RecyclerView$j)this).f;
                }
                final long max = Math.max(e, f);
                final View d7 = ((RecyclerView$c0)list3.get(0)).D0;
                final WeakHashMap a3 = j6x.a;
                j6x$d.n(d7, (Runnable)runnable3, max + d6);
            }
        }
    }
    
    public final void n(final RecyclerView$c0 recyclerView$c0) {
        this.v(recyclerView$c0);
        recyclerView$c0.D0.setAlpha(0.0f);
        this.i.add(recyclerView$c0);
    }
    
    public boolean o(final RecyclerView$c0 recyclerView$c0, final RecyclerView$c0 recyclerView$c2, final int n, final int n2, final int n3, final int n4) {
        if (recyclerView$c0 == recyclerView$c2) {
            return this.p(recyclerView$c0, n, n2, n3, n4);
        }
        final float translationX = recyclerView$c0.D0.getTranslationX();
        final float translationY = recyclerView$c0.D0.getTranslationY();
        final float alpha = recyclerView$c0.D0.getAlpha();
        this.v(recyclerView$c0);
        final int n5 = (int)(n3 - n - translationX);
        final int n6 = (int)(n4 - n2 - translationY);
        recyclerView$c0.D0.setTranslationX(translationX);
        recyclerView$c0.D0.setTranslationY(translationY);
        recyclerView$c0.D0.setAlpha(alpha);
        this.v(recyclerView$c2);
        recyclerView$c2.D0.setTranslationX((float)(-n5));
        recyclerView$c2.D0.setTranslationY((float)(-n6));
        recyclerView$c2.D0.setAlpha(0.0f);
        this.k.add(new d(recyclerView$c0, recyclerView$c2, n, n2, n3, n4));
        return true;
    }
    
    public final boolean p(final RecyclerView$c0 recyclerView$c0, int n, int n2, final int n3, final int n4) {
        final View d0 = recyclerView$c0.D0;
        n += (int)d0.getTranslationX();
        final int n5 = n2 + (int)recyclerView$c0.D0.getTranslationY();
        this.v(recyclerView$c0);
        final int n6 = n3 - n;
        n2 = n4 - n5;
        if (n6 == 0 && n2 == 0) {
            ((RecyclerView$j)this).h(recyclerView$c0);
            return false;
        }
        if (n6 != 0) {
            d0.setTranslationX((float)(-n6));
        }
        if (n2 != 0) {
            d0.setTranslationY((float)(-n2));
        }
        this.j.add(new e(recyclerView$c0, n, n5, n3, n4));
        return true;
    }
    
    public final boolean q(final RecyclerView$c0 recyclerView$c0) {
        this.v(recyclerView$c0);
        this.h.add(recyclerView$c0);
        return true;
    }
    
    public final void r(final List<RecyclerView$c0> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            ((RecyclerView$c0)list.get(i)).D0.animate().cancel();
        }
    }
    
    public final void s() {
        if (!this.l()) {
            ((RecyclerView$j)this).i();
        }
    }
    
    public final void t(final List<d> list, final RecyclerView$c0 recyclerView$c0) {
        int size = list.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final d d = list.get(n);
            size = n;
            if (!this.u(d, recyclerView$c0)) {
                continue;
            }
            size = n;
            if (d.a != null) {
                continue;
            }
            size = n;
            if (d.b != null) {
                continue;
            }
            list.remove(d);
            size = n;
        }
    }
    
    public final boolean u(final d d, final RecyclerView$c0 recyclerView$c0) {
        if (d.b == recyclerView$c0) {
            d.b = null;
        }
        else {
            if (d.a != recyclerView$c0) {
                return false;
            }
            d.a = null;
        }
        recyclerView$c0.D0.setAlpha(1.0f);
        recyclerView$c0.D0.setTranslationX(0.0f);
        recyclerView$c0.D0.setTranslationY(0.0f);
        ((RecyclerView$j)this).h(recyclerView$c0);
        return true;
    }
    
    public final void v(final RecyclerView$c0 recyclerView$c0) {
        if (g.s == null) {
            g.s = new ValueAnimator().getInterpolator();
        }
        recyclerView$c0.D0.animate().setInterpolator(g.s);
        this.j(recyclerView$c0);
    }
    
    public static final class d
    {
        public RecyclerView$c0 a;
        public RecyclerView$c0 b;
        public int c;
        public int d;
        public int e;
        public int f;
        
        public d(final RecyclerView$c0 a, final RecyclerView$c0 b, final int c, final int d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final String toString() {
            final StringBuilder j = fu8.j("ChangeInfo{oldHolder=");
            j.append(this.a);
            j.append(", newHolder=");
            j.append(this.b);
            j.append(", fromX=");
            j.append(this.c);
            j.append(", fromY=");
            j.append(this.d);
            j.append(", toX=");
            j.append(this.e);
            j.append(", toY=");
            return x70.C(j, this.f, '}');
        }
    }
    
    public static final class e
    {
        public RecyclerView$c0 a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        public e(final RecyclerView$c0 a, final int b, final int c, final int d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
