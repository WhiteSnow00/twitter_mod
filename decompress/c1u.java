import android.view.ViewGroup;
import android.util.AndroidRuntimeException;
import android.animation.TimeInterpolator;
import java.util.Iterator;
import android.view.View;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class c1u extends g0u
{
    public ArrayList<g0u> j1;
    public boolean k1;
    public int l1;
    public boolean m1;
    public int n1;
    
    public c1u() {
        this.j1 = new ArrayList<g0u>();
        this.k1 = true;
        this.m1 = false;
        this.n1 = 0;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public c1u(final Context context, final AttributeSet set) {
        super(context, set);
        this.j1 = new ArrayList<g0u>();
        this.k1 = true;
        this.m1 = false;
        this.n1 = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nmr.h);
        this.W(nmv.h(obtainStyledAttributes, (XmlPullParser)set, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
    
    public final void E(final View view) {
        super.E(view);
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            this.j1.get(i).E(view);
        }
    }
    
    public final g0u F(final g0u$e g0u$e) {
        super.F(g0u$e);
        return this;
    }
    
    public final g0u G(final View view) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).G(view);
        }
        super.K0.remove(view);
        return this;
    }
    
    public final void H(final View view) {
        super.H(view);
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            this.j1.get(i).H(view);
        }
    }
    
    public final void I() {
        if (this.j1.isEmpty()) {
            this.P();
            this.q();
            return;
        }
        final b b = new b(this);
        final Iterator<g0u> iterator = this.j1.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((g0u$e)b);
        }
        this.l1 = this.j1.size();
        if (!this.k1) {
            for (int i = 1; i < this.j1.size(); ++i) {
                this.j1.get(i - 1).a((g0u$e)new a1u(this.j1.get(i)) {
                    public final g0u F0;
                    
                    public final void d(final g0u g0u) {
                        this.F0.I();
                        g0u.F((g0u$e)this);
                    }
                });
            }
            final g0u g0u = this.j1.get(0);
            if (g0u != null) {
                g0u.I();
            }
        }
        else {
            final Iterator<g0u> iterator2 = this.j1.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().I();
            }
        }
    }
    
    public final /* bridge */ g0u J(final long n) {
        this.U(n);
        return this;
    }
    
    public final void K(final g0u$d e1) {
        super.e1 = e1;
        this.n1 |= 0x8;
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            this.j1.get(i).K(e1);
        }
    }
    
    public final /* bridge */ g0u L(final TimeInterpolator timeInterpolator) {
        this.V(timeInterpolator);
        return this;
    }
    
    public final void M(final l0k l0k) {
        super.M(l0k);
        this.n1 |= 0x4;
        if (this.j1 != null) {
            for (int i = 0; i < this.j1.size(); ++i) {
                this.j1.get(i).M(l0k);
            }
        }
    }
    
    public final void N(final g7r d1) {
        super.d1 = d1;
        this.n1 |= 0x2;
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            this.j1.get(i).N(d1);
        }
    }
    
    public final g0u O(final long g0) {
        super.G0 = g0;
        return this;
    }
    
    public final String Q(final String s) {
        String s2 = super.Q(s);
        for (int i = 0; i < this.j1.size(); ++i) {
            final StringBuilder n = a88.n(s2, "\n");
            final g0u g0u = this.j1.get(i);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("  ");
            n.append(g0u.Q(sb.toString()));
            s2 = n.toString();
        }
        return s2;
    }
    
    public final c1u R(final g0u$e g0u$e) {
        super.a(g0u$e);
        return this;
    }
    
    public final c1u S(final g0u g0u) {
        this.j1.add(g0u);
        g0u.T0 = this;
        final long h0 = super.H0;
        if (h0 >= 0L) {
            g0u.J(h0);
        }
        if ((this.n1 & 0x1) != 0x0) {
            g0u.L(super.I0);
        }
        if ((this.n1 & 0x2) != 0x0) {
            g0u.N(super.d1);
        }
        if ((this.n1 & 0x4) != 0x0) {
            g0u.M(super.f1);
        }
        if ((this.n1 & 0x8) != 0x0) {
            g0u.K(super.e1);
        }
        return this;
    }
    
    public final g0u T(final int n) {
        if (n >= 0 && n < this.j1.size()) {
            return this.j1.get(n);
        }
        return null;
    }
    
    public final c1u U(final long h0) {
        super.H0 = h0;
        if (h0 >= 0L) {
            final ArrayList<g0u> j1 = this.j1;
            if (j1 != null) {
                for (int size = j1.size(), i = 0; i < size; ++i) {
                    this.j1.get(i).J(h0);
                }
            }
        }
        return this;
    }
    
    public final c1u V(final TimeInterpolator i0) {
        this.n1 |= 0x1;
        final ArrayList<g0u> j1 = this.j1;
        if (j1 != null) {
            for (int size = j1.size(), k = 0; k < size; ++k) {
                this.j1.get(k).L(i0);
            }
        }
        super.I0 = i0;
        return this;
    }
    
    public final c1u W(final int n) {
        if (n != 0) {
            if (n != 1) {
                throw new AndroidRuntimeException(rk0.B("Invalid parameter for TransitionSet ordering: ", n));
            }
            this.k1 = false;
        }
        else {
            this.k1 = true;
        }
        return this;
    }
    
    public final g0u a(final g0u$e g0u$e) {
        super.a(g0u$e);
        return this;
    }
    
    public final g0u c(final int n) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).c(n);
        }
        super.c(n);
        return this;
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.n();
    }
    
    public final g0u d(final View view) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).d(view);
        }
        super.K0.add(view);
        return this;
    }
    
    public final g0u e(final Class clazz) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).e(clazz);
        }
        super.e(clazz);
        return this;
    }
    
    public final g0u f(final String s) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).f(s);
        }
        super.f(s);
        return this;
    }
    
    public final void h(final e1u e1u) {
        if (this.C(e1u.b)) {
            for (final g0u g0u : this.j1) {
                if (g0u.C(e1u.b)) {
                    g0u.h(e1u);
                    e1u.c.add(g0u);
                }
            }
        }
    }
    
    public final void j(final e1u e1u) {
        super.j(e1u);
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            this.j1.get(i).j(e1u);
        }
    }
    
    public final void k(final e1u e1u) {
        if (this.C(e1u.b)) {
            for (final g0u g0u : this.j1) {
                if (g0u.C(e1u.b)) {
                    g0u.k(e1u);
                    e1u.c.add(g0u);
                }
            }
        }
    }
    
    public final g0u n() {
        final c1u t0 = (c1u)super.n();
        t0.j1 = new ArrayList<g0u>();
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            final g0u n = this.j1.get(i).n();
            t0.j1.add(n);
            n.T0 = t0;
        }
        return t0;
    }
    
    public final void p(final ViewGroup viewGroup, final f1u f1u, final f1u f1u2, final ArrayList<e1u> list, final ArrayList<e1u> list2) {
        final long g0 = super.G0;
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            final g0u g0u = this.j1.get(i);
            if (g0 > 0L && (this.k1 || i == 0)) {
                final long g2 = g0u.G0;
                if (g2 > 0L) {
                    g0u.O(g2 + g0);
                }
                else {
                    g0u.O(g0);
                }
            }
            g0u.p(viewGroup, f1u, f1u2, (ArrayList)list, (ArrayList)list2);
        }
    }
    
    public final g0u r(final int n) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).r(n);
        }
        super.r(n);
        return this;
    }
    
    public final g0u s(final View view) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).s(view);
        }
        ArrayList o0 = super.O0;
        if (view != null) {
            o0 = g0u$c.a(o0, (Object)view);
        }
        super.O0 = o0;
        return this;
    }
    
    public final g0u t(final Class<?> clazz, final boolean b) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).t((Class)clazz);
        }
        super.t((Class)clazz);
        return this;
    }
    
    public final g0u u(final String s) {
        for (int i = 0; i < this.j1.size(); ++i) {
            this.j1.get(i).u(s);
        }
        super.u(s);
        return this;
    }
    
    public final void v(final ViewGroup viewGroup) {
        super.v(viewGroup);
        for (int size = this.j1.size(), i = 0; i < size; ++i) {
            this.j1.get(i).v(viewGroup);
        }
    }
    
    public static final class b extends a1u
    {
        public c1u F0;
        
        public b(final c1u f0) {
            this.F0 = f0;
        }
        
        public final void d(final g0u g0u) {
            final c1u f0 = this.F0;
            final int l1 = f0.l1 - 1;
            f0.l1 = l1;
            if (l1 == 0) {
                f0.m1 = false;
                f0.q();
            }
            g0u.F((g0u$e)this);
        }
        
        @Override
        public final void e() {
            final c1u f0 = this.F0;
            if (!f0.m1) {
                f0.P();
                this.F0.m1 = true;
            }
        }
    }
}
