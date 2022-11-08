import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.d$c;
import androidx.fragment.app.s;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class dpb extends cuj
{
    public final p E0;
    public final int F0;
    public a G0;
    public Fragment H0;
    public boolean I0;
    
    @Deprecated
    public dpb(final p e0) {
        this.G0 = null;
        this.H0 = null;
        this.E0 = e0;
        this.F0 = 0;
    }
    
    public static String R(final int n, final long n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(n);
        sb.append(":");
        sb.append(n2);
        return sb.toString();
    }
    
    public Object F(final ViewGroup viewGroup, final int n) {
        if (this.G0 == null) {
            this.G0 = new a(this.E0);
        }
        final long itemId = this.getItemId(n);
        final Fragment h = this.E0.H(R(((View)viewGroup).getId(), itemId));
        Fragment fragment;
        if (h != null) {
            final a g0 = this.G0;
            Objects.requireNonNull(g0);
            g0.b(new s.a(7, h));
            fragment = h;
        }
        else {
            final Fragment q = this.Q(n);
            this.G0.e(((View)viewGroup).getId(), q, R(((View)viewGroup).getId(), itemId), 1);
            fragment = q;
        }
        if (fragment != this.H0) {
            fragment.Q1(false);
            if (this.F0 == 1) {
                this.G0.o(fragment, d$c.F0);
            }
            else {
                fragment.U1(false);
            }
        }
        return fragment;
    }
    
    public final boolean I(final View view, final Object o) {
        return ((Fragment)o).j1 == view;
    }
    
    public void L(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    public Parcelable M() {
        return null;
    }
    
    public final void N(final ViewGroup viewGroup, final int n, final Object o) {
        final Fragment h0 = (Fragment)o;
        final Fragment h2 = this.H0;
        if (h0 != h2) {
            if (h2 != null) {
                h2.Q1(false);
                if (this.F0 == 1) {
                    if (this.G0 == null) {
                        this.G0 = new a(this.E0);
                    }
                    this.G0.o(this.H0, d$c.F0);
                }
                else {
                    this.H0.U1(false);
                }
            }
            h0.Q1(true);
            if (this.F0 == 1) {
                if (this.G0 == null) {
                    this.G0 = new a(this.E0);
                }
                this.G0.o(h0, d$c.G0);
            }
            else {
                h0.U1(true);
            }
            this.H0 = h0;
        }
    }
    
    public final void O(final ViewGroup viewGroup) {
        if (((View)viewGroup).getId() != -1) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }
    
    public abstract Fragment Q(final int p0);
    
    public abstract long getItemId(final int p0);
    
    public final void i(final ViewGroup viewGroup, final int n, final Object o) {
        final Fragment fragment = (Fragment)o;
        if (this.G0 == null) {
            this.G0 = new a(this.E0);
        }
        final a g0 = this.G0;
        Objects.requireNonNull(g0);
        final p u0 = fragment.U0;
        if (u0 != null && u0 != g0.p) {
            final StringBuilder g2 = w48.g("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            g2.append(fragment.toString());
            g2.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(g2.toString());
        }
        g0.b(new s.a(6, fragment));
        if (fragment.equals((Object)this.H0)) {
            this.H0 = null;
        }
    }
    
    public final void j(final ViewGroup viewGroup) {
        final a g0 = this.G0;
        if (g0 != null) {
            if (!this.I0) {
                try {
                    this.I0 = true;
                    g0.l();
                }
                finally {
                    this.I0 = false;
                }
            }
            this.G0 = null;
        }
    }
}
