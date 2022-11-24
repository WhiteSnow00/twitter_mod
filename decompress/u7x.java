import android.view.ViewGroup;
import java.util.Iterator;
import android.view.View;
import java.util.HashSet;
import java.util.HashMap;
import android.os.Looper;
import android.graphics.Rect;
import java.util.Set;
import android.annotation.SuppressLint;
import android.os.Handler;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u7x implements onf$b
{
    public static final Map<String, String> M0;
    public final Handler F0;
    @SuppressLint({ "UseSparseArrays" })
    public final Map<Long, Runnable> G0;
    public final Set<Long> H0;
    public final Rect I0;
    public final long J0;
    public final float K0;
    public final wsl L0;
    
    static {
        u7x.M0 = new u7x$a();
    }
    
    public u7x(float k0, final double n) {
        final wsl b = wsl.b;
        final Handler f0 = new Handler(Looper.getMainLooper());
        this.G0 = new HashMap();
        this.H0 = new HashSet();
        this.I0 = new Rect();
        this.L0 = b;
        this.F0 = f0;
        long j0;
        if (n > 0.0) {
            j0 = (long)(n * 1000.0);
        }
        else {
            j0 = 10L;
        }
        this.J0 = j0;
        if (k0 < 0.0f || k0 > 1.0f) {
            k0 = 0.5f;
        }
        this.K0 = k0;
    }
    
    public final void M(final int n) {
    }
    
    public final void V(final onf onf) {
    }
    
    public final void a(final long n) {
        final Runnable runnable = this.G0.remove(n);
        if (runnable != null) {
            this.F0.removeCallbacks(runnable);
        }
    }
    
    public final void a0(final onf onf) {
    }
    
    public final void f(final onf onf) {
    }
    
    public final void l(final onf onf) {
    }
    
    public final void p(final onf onf) {
    }
    
    public final void s(final onf onf, int i, int n, int n2, final boolean b) {
        this.H0.clear();
        int min;
        View child;
        hp6 hp6;
        Rect i2;
        float n3;
        float k0;
        long d;
        npb npb;
        wsl b2;
        gjl g0;
        for (min = Math.min(n, ((ViewGroup)((n7m)onf).b).getChildCount()), i = 0; i < min; ++i) {
            child = ((ViewGroup)((n7m)onf).b).getChildAt(i);
            if (child.getTag(2131432253) != null) {
                hp6 = (hp6)child.getTag(2131432253);
                if (hp6 != null && hp6.O2() && hp6.G0 != null && !hp6.n0()) {
                    i2 = this.I0;
                    if (child.getGlobalVisibleRect(i2)) {
                        n3 = i2.height() / (float)child.getHeight();
                        k0 = this.K0;
                        n2 = 1;
                        if (n3 >= k0) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        if (n != 0 && !((HashMap)u7x.M0).containsKey(hp6.G0.a)) {
                            this.H0.add(hp6.D());
                            if (!this.G0.containsKey(hp6.D())) {
                                d = hp6.D();
                                npb = new npb((Object)this, (Object)hp6, 11);
                                this.G0.put(d, npb);
                                this.F0.postDelayed((Runnable)npb, this.J0);
                            }
                        }
                        else if (n == 0) {
                            this.a(hp6.D());
                        }
                        b2 = wsl.b;
                        if (Math.abs(1.0f - n3) < 1.0E-5f) {
                            n = n2;
                        }
                        else {
                            n = 0;
                        }
                        if (n != 0) {
                            g0 = hp6.G0;
                            if (g0 != null) {
                                this.L0.a(g0, wsl$a.H0);
                            }
                        }
                    }
                }
            }
        }
        if (this.H0.size() != this.G0.size()) {
            final HashSet<Long> set = new HashSet<Long>();
            for (final Long n4 : this.G0.keySet()) {
                if (!this.H0.contains(n4)) {
                    set.add(n4);
                }
            }
            final Iterator<Long> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                this.a(iterator2.next());
            }
        }
    }
    
    public final void u(final onf onf, final int n) {
    }
}
