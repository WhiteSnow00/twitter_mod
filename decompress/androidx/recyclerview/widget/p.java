// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public final class p implements Runnable
{
    public static final ThreadLocal<p> H0;
    public static Comparator<c> I0;
    public ArrayList<RecyclerView> D0;
    public long E0;
    public long F0;
    public ArrayList<c> G0;
    
    static {
        H0 = new ThreadLocal<p>();
        p.I0 = new Comparator<c>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                final c c = (c)o;
                final c c2 = (c)o2;
                final RecyclerView d = c.d;
                final int n = 1;
                final int n2 = 0;
                if (d == null != (c2.d == null)) {
                    if (d == null) {
                        return n;
                    }
                }
                else {
                    final boolean a = c.a;
                    if (a != c2.a) {
                        final int n3 = n;
                        if (!a) {
                            return n3;
                        }
                    }
                    else {
                        int n3 = c2.b - c.b;
                        if (n3 != 0) {
                            return n3;
                        }
                        final int n4 = c.c - c2.c;
                        n3 = n2;
                        if (n4 != 0) {
                            n3 = n4;
                            return n3;
                        }
                        return n3;
                    }
                }
                return -1;
            }
        };
    }
    
    public p() {
        this.D0 = new ArrayList<RecyclerView>();
        this.G0 = new ArrayList<c>();
    }
    
    public final void a(final RecyclerView recyclerView, final int a, final int b) {
        if (recyclerView.isAttachedToWindow() && this.E0 == 0L) {
            this.E0 = recyclerView.getNanoTime();
            ((View)recyclerView).post((Runnable)this);
        }
        final p.p$b g1 = recyclerView.G1;
        g1.a = a;
        g1.b = b;
    }
    
    public final void b(final long n) {
        final int size = this.D0.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final RecyclerView recyclerView = this.D0.get(i);
            int n3 = n2;
            if (((View)recyclerView).getWindowVisibility() == 0) {
                recyclerView.G1.b(recyclerView, false);
                n3 = n2 + recyclerView.G1.d;
            }
            ++i;
            n2 = n3;
        }
        this.G0.ensureCapacity(n2);
        int j = 0;
        int n4 = 0;
        while (j < size) {
            final RecyclerView d = this.D0.get(j);
            int n5;
            if (((View)d).getWindowVisibility() != 0) {
                n5 = n4;
            }
            else {
                final p.p$b g1 = d.G1;
                final int b = Math.abs(g1.b) + Math.abs(g1.a);
                int n6 = 0;
                while (true) {
                    n5 = n4;
                    if (n6 >= g1.d * 2) {
                        break;
                    }
                    c c;
                    if (n4 >= this.G0.size()) {
                        c = new c();
                        this.G0.add(c);
                    }
                    else {
                        c = this.G0.get(n4);
                    }
                    final int[] c2 = g1.c;
                    final int c3 = c2[n6 + 1];
                    c.a = (c3 <= b);
                    c.b = b;
                    c.c = c3;
                    c.d = d;
                    c.e = c2[n6];
                    ++n4;
                    n6 += 2;
                }
            }
            ++j;
            n4 = n5;
        }
        Collections.sort(this.G0, (Comparator<? super c>)p.I0);
        for (int k = 0; k < this.G0.size(); ++k) {
            final c c4 = this.G0.get(k);
            final RecyclerView d2 = c4.d;
            if (d2 == null) {
                break;
            }
            long n7;
            if (c4.a) {
                n7 = Long.MAX_VALUE;
            }
            else {
                n7 = n;
            }
            final RecyclerView$c0 c5 = this.c(d2, c4.e, n7);
            if (c5 != null && c5.E0 != null && c5.W() && !c5.X()) {
                final RecyclerView recyclerView2 = (RecyclerView)c5.E0.get();
                if (recyclerView2 != null) {
                    if (recyclerView2.g1 && recyclerView2.H0.h() != 0) {
                        recyclerView2.n0();
                    }
                    final p.p$b g2 = recyclerView2.G1;
                    g2.b(recyclerView2, true);
                    if (g2.d != 0) {
                        try {
                            final Method b2 = lvt.b;
                            lvt$a.a("RV Nested Prefetch");
                            final RecyclerView$y h1 = recyclerView2.H1;
                            final RecyclerView$e o0 = recyclerView2.O0;
                            h1.d = 1;
                            h1.e = o0.c();
                            h1.g = false;
                            h1.h = false;
                            h1.i = false;
                            for (int l = 0; l < g2.d * 2; l += 2) {
                                this.c(recyclerView2, g2.c[l], n);
                            }
                            lvt$a.b();
                        }
                        finally {
                            final Method b3 = lvt.b;
                            lvt$a.b();
                        }
                    }
                }
            }
            c4.a = false;
            c4.b = 0;
            c4.c = 0;
            c4.d = null;
            c4.e = 0;
        }
    }
    
    public final RecyclerView$c0 c(final RecyclerView recyclerView, final int n, final long n2) {
        final int h = recyclerView.H0.h();
        int i = 0;
        while (true) {
            while (i < h) {
                final RecyclerView$c0 r = RecyclerView.R(recyclerView.H0.g(i));
                if (r.F0 == n && !r.X()) {
                    final boolean b = true;
                    if (b) {
                        return null;
                    }
                    final RecyclerView$t e0 = recyclerView.E0;
                    try {
                        recyclerView.b0();
                        final RecyclerView$c0 m = e0.m(n, n2);
                        if (m != null) {
                            if (m.W() && !m.X()) {
                                e0.j(m.D0);
                            }
                            else {
                                e0.a(m, false);
                            }
                        }
                        return m;
                    }
                    finally {
                        recyclerView.c0(false);
                    }
                }
                else {
                    ++i;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    @Override
    public final void run() {
        try {
            final Method b = lvt.b;
            lvt$a.a("RV Prefetch");
            if (this.D0.isEmpty()) {
                this.E0 = 0L;
                lvt$a.b();
                return;
            }
            final int size = this.D0.size();
            int i = 0;
            long n = 0L;
            while (i < size) {
                final RecyclerView recyclerView = this.D0.get(i);
                long max = n;
                if (((View)recyclerView).getWindowVisibility() == 0) {
                    max = Math.max(((View)recyclerView).getDrawingTime(), n);
                }
                ++i;
                n = max;
            }
            if (n == 0L) {
                this.E0 = 0L;
                lvt$a.b();
                return;
            }
            this.b(TimeUnit.MILLISECONDS.toNanos(n) + this.F0);
            this.E0 = 0L;
            lvt$a.b();
        }
        finally {
            this.E0 = 0L;
            final Method b2 = lvt.b;
            lvt$a.b();
        }
    }
    
    public static final class c
    {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }
}
