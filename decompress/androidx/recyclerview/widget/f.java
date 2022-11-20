// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import java.util.ArrayList;
import android.view.View;
import java.util.List;

public final class f
{
    public final b a;
    public final a b;
    public final List<View> c;
    
    public f(final b a) {
        this.a = a;
        this.b = new a();
        this.c = new ArrayList();
    }
    
    public final void a(final View view, int n, final boolean b) {
        if (n < 0) {
            n = ((c0)this.a).b();
        }
        else {
            n = this.f(n);
        }
        this.b.e(n, b);
        if (b) {
            this.i(view);
        }
        final c0 c0 = (c0)this.a;
        ((ViewGroup)c0.a).addView(view, n);
        final RecyclerView a = c0.a;
        Objects.requireNonNull(a);
        final RecyclerView$c0 r = RecyclerView.R(view);
        final RecyclerView$e o0 = a.O0;
        if (o0 != null && r != null) {
            o0.u(r);
        }
        final ArrayList f1 = a.f1;
        if (f1 != null) {
            n = f1.size();
            while (--n >= 0) {
                ((RecyclerView$o)a.f1.get(n)).e(view);
            }
        }
    }
    
    public final void b(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n < 0) {
            n = ((c0)this.a).b();
        }
        else {
            n = this.f(n);
        }
        this.b.e(n, b);
        if (b) {
            this.i(view);
        }
        final c0 c0 = (c0)this.a;
        Objects.requireNonNull(c0);
        final RecyclerView$c0 r = RecyclerView.R(view);
        if (r != null) {
            if (!r.c0() && !r.n0()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(r);
                throw new IllegalArgumentException(nh.B(c0.a, sb));
            }
            r.M0 &= 0xFFFFFEFF;
        }
        RecyclerView.c(c0.a, view, n, viewGroup$LayoutParams);
    }
    
    public final void c(int f) {
        f = this.f(f);
        this.b.f(f);
        final c0 c0 = (c0)this.a;
        final View a = c0.a(f);
        if (a != null) {
            final RecyclerView$c0 r = RecyclerView.R(a);
            if (r != null) {
                if (r.c0() && !r.n0()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(r);
                    throw new IllegalArgumentException(nh.B(c0.a, sb));
                }
                r.w(256);
            }
        }
        RecyclerView.d(c0.a, f);
    }
    
    public final View d(int f) {
        f = this.f(f);
        return ((c0)this.a).a(f);
    }
    
    public final int e() {
        return ((c0)this.a).b() - this.c.size();
    }
    
    public final int f(final int n) {
        if (n < 0) {
            return -1;
        }
        int n2;
        for (int b = ((c0)this.a).b(), i = n; i < b; i += n2) {
            n2 = n - (i - this.b.b(i));
            if (n2 == 0) {
                while (this.b.d(i)) {
                    ++i;
                }
                return i;
            }
        }
        return -1;
    }
    
    public final View g(final int n) {
        return ((c0)this.a).a(n);
    }
    
    public final int h() {
        return ((c0)this.a).b();
    }
    
    public final void i(final View view) {
        this.c.add(view);
        final c0 c0 = (c0)this.a;
        Objects.requireNonNull(c0);
        final RecyclerView$c0 r = RecyclerView.R(view);
        if (r != null) {
            final RecyclerView a = c0.a;
            final int t0 = r.T0;
            if (t0 != -1) {
                r.S0 = t0;
            }
            else {
                final View d0 = r.D0;
                final WeakHashMap a2 = j6x.a;
                r.S0 = j6x$d.c(d0);
            }
            a.w0(r, 4);
        }
    }
    
    public final int j(final View view) {
        final int c = ((c0)this.a).c(view);
        if (c == -1) {
            return -1;
        }
        if (this.b.d(c)) {
            return -1;
        }
        return c - this.b.b(c);
    }
    
    public final boolean k(final View view) {
        return this.c.contains(view);
    }
    
    public final void l(int f) {
        f = this.f(f);
        final View a = ((c0)this.a).a(f);
        if (a == null) {
            return;
        }
        if (this.b.f(f)) {
            this.m(a);
        }
        ((c0)this.a).d(f);
    }
    
    public final boolean m(final View view) {
        if (this.c.remove(view)) {
            final c0 c0 = (c0)this.a;
            Objects.requireNonNull(c0);
            final RecyclerView$c0 r = RecyclerView.R(view);
            if (r != null) {
                c0.a.w0(r, r.S0);
                r.S0 = 0;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(", hidden list:");
        sb.append(this.c.size());
        return sb.toString();
    }
    
    public static final class a
    {
        public long a;
        public a b;
        
        public a() {
            this.a = 0L;
        }
        
        public final void a(final int n) {
            if (n >= 64) {
                final a b = this.b;
                if (b != null) {
                    b.a(n - 64);
                }
            }
            else {
                this.a &= ~(1L << n);
            }
        }
        
        public final int b(int b) {
            final a b2 = this.b;
            if (b2 == null) {
                if (b >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & (1L << b) - 1L);
            }
            else {
                if (b < 64) {
                    return Long.bitCount(this.a & (1L << b) - 1L);
                }
                b = b2.b(b - 64);
                return Long.bitCount(this.a) + b;
            }
        }
        
        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }
        
        public final boolean d(final int n) {
            if (n >= 64) {
                this.c();
                return this.b.d(n - 64);
            }
            return (this.a & 1L << n) != 0x0L;
        }
        
        public final void e(final int n, final boolean b) {
            if (n >= 64) {
                this.c();
                this.b.e(n - 64, b);
            }
            else {
                final long a = this.a;
                final boolean b2 = (Long.MIN_VALUE & a) != 0x0L;
                final long n2 = (1L << n) - 1L;
                this.a = ((a & ~n2) << 1 | (a & n2));
                if (b) {
                    this.h(n);
                }
                else {
                    this.a(n);
                }
                if (b2 || this.b != null) {
                    this.c();
                    this.b.e(0, b2);
                }
            }
        }
        
        public final boolean f(final int n) {
            if (n >= 64) {
                this.c();
                return this.b.f(n - 64);
            }
            final long n2 = 1L << n;
            final long a = this.a;
            final boolean b = (a & n2) != 0x0L;
            final long a2 = a & ~n2;
            this.a = a2;
            final long n3 = n2 - 1L;
            this.a = ((a2 & n3) | Long.rotateRight(~n3 & a2, 1));
            final a b2 = this.b;
            if (b2 != null) {
                if (b2.d(0)) {
                    this.h(63);
                }
                this.b.f(0);
            }
            return b;
        }
        
        public final void g() {
            this.a = 0L;
            final a b = this.b;
            if (b != null) {
                b.g();
            }
        }
        
        public final void h(final int n) {
            if (n >= 64) {
                this.c();
                this.b.h(n - 64);
            }
            else {
                this.a |= 1L << n;
            }
        }
        
        @Override
        public final String toString() {
            String s;
            if (this.b == null) {
                s = Long.toBinaryString(this.a);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.b.toString());
                sb.append("xx");
                sb.append(Long.toBinaryString(this.a));
                s = sb.toString();
            }
            return s;
        }
    }
    
    public interface b
    {
    }
}
