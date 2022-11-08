import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$x;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$m;
import android.content.Context;
import androidx.recyclerview.widget.v;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zys
{
    public static String a(final int n, final int n2, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append("/");
        sb.append(n2);
        sb.append("/");
        sb.append(s);
        return sb.toString();
    }
    
    public static String b(final ips ips) {
        final q7t b = ips.k.b;
        String a;
        if (b != null) {
            a = b.a();
        }
        else {
            a = "";
        }
        return a;
    }
    
    public interface a
    {
    }
    
    public static final class b extends v
    {
        public final Context f;
        public final boolean g;
        
        public b(final Context f, final boolean g) {
            this.f = f;
            this.g = g;
        }
        
        public final int[] c(final RecyclerView$m recyclerView$m, final View view) {
            int n;
            if (this.g) {
                n = -(tbx.k(this.f).a - view.getRight() - recyclerView$m.getPaddingStart());
            }
            else {
                n = view.getLeft() - recyclerView$m.getPaddingLeft();
            }
            return new int[] { n, 0 };
        }
        
        public final RecyclerView$x d(final RecyclerView$m recyclerView$m) {
            if (!(recyclerView$m instanceof RecyclerView$x$b)) {
                return null;
            }
            return (RecyclerView$x)new u(this.f) {
                public final void f(final View view, final RecyclerView$x$a recyclerView$x$a) {
                    if (view == null) {
                        return;
                    }
                    final int n = b.this.c(recyclerView$m, view)[0];
                    final int l = this.l(Math.abs(n));
                    if (l > 0) {
                        recyclerView$x$a.b(n, 0, l, (Interpolator)super.j);
                    }
                }
                
                public final float k(final DisplayMetrics displayMetrics) {
                    return 50.0f / displayMetrics.densityDpi;
                }
                
                public final int m(final int n) {
                    return (int)Math.min(300.0f, (float)super.m(n));
                }
            };
        }
        
        public final View e(final RecyclerView$m recyclerView$m) {
            if (recyclerView$m.L() == 0) {
                return null;
            }
            final View k = recyclerView$m.K(0);
            final View i = recyclerView$m.K(recyclerView$m.L() - 1);
            if (recyclerView$m instanceof LinearLayoutManager) {
                final int s1 = ((LinearLayoutManager)recyclerView$m).s1();
                if (i != null && s1 == recyclerView$m.W() - 1) {
                    return i;
                }
                if (k != null) {
                    final int n = k.getWidth() / 2;
                    if (this.g) {
                        if (Math.abs(k.getLeft() - tbx.k(this.f).a) <= n) {
                            return recyclerView$m.K(1);
                        }
                    }
                    else if (Math.abs(k.getLeft()) >= n) {
                        return recyclerView$m.K(1);
                    }
                    return k;
                }
            }
            return null;
        }
    }
}
