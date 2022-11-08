import android.view.ViewGroup$LayoutParams;
import androidx.compose.ui.platform.e;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xwe
{
    public final jwe a;
    public le6 b;
    public glr c;
    public int d;
    public final Map<jwe, a> e;
    public final Map<Object, jwe> f;
    public final xwe.xwe$b g;
    public final Map<Object, jwe> h;
    public final glr$a i;
    public int j;
    public int k;
    public final String l;
    
    public xwe(final jwe a, final glr c) {
        zzd.f((Object)a, "root");
        zzd.f((Object)c, "slotReusePolicy");
        this.a = a;
        this.c = c;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new xwe.xwe$b(this);
        this.h = new LinkedHashMap();
        this.i = new glr$a();
        this.l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }
    
    public final void a(final int n) {
        this.j = 0;
        final int n2 = this.a.t().size() - this.k - 1;
        if (n <= n2) {
            this.i.clear();
            if (n <= n2) {
                int n3 = n;
                while (true) {
                    this.i.C0.add(this.b(n3));
                    if (n3 == n2) {
                        break;
                    }
                    ++n3;
                }
            }
            this.c.c(this.i);
            for (int i = n2; i >= n; --i) {
                final jwe jwe = this.a.t().get(i);
                final Object value = this.e.get(jwe);
                zzd.c(value);
                final a a = (a)value;
                final Object a2 = a.a;
                if (this.i.contains(a2)) {
                    Objects.requireNonNull(jwe);
                    jwe.Y0 = 3;
                    ++this.j;
                    ((nhq)a.e).setValue((Object)Boolean.FALSE);
                }
                else {
                    final jwe a3 = this.a;
                    a3.L0 = true;
                    this.e.remove(jwe);
                    final ke6 c = a.c;
                    if (c != null) {
                        c.dispose();
                    }
                    this.a.U(i, 1);
                    a3.L0 = false;
                }
                this.f.remove(a2);
            }
        }
        this.c();
    }
    
    public final Object b(final int n) {
        final a value = this.e.get(this.a.t().get(n));
        zzd.c((Object)value);
        return value.a;
    }
    
    public final void c() {
        final int size = this.e.size();
        final int size2 = this.a.t().size();
        final int n = 0;
        if (size != size2) {
            final StringBuilder g = w48.g("Inconsistency between the count of nodes tracked by the state (");
            g.append(this.e.size());
            g.append(") and the children count on the SubcomposeLayout (");
            g.append(this.a.t().size());
            g.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
            throw new IllegalArgumentException(g.toString().toString());
        }
        if (this.a.t().size() - this.j - this.k < 0) {
            final StringBuilder g2 = w48.g("Incorrect state. Total children ");
            g2.append(this.a.t().size());
            g2.append(". Reusable children ");
            g2.append(this.j);
            g2.append(". Precomposed children ");
            g2.append(this.k);
            throw new IllegalArgumentException(g2.toString().toString());
        }
        int n2 = n;
        if (this.h.size() == this.k) {
            n2 = 1;
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder g3 = w48.g("Incorrect state. Precomposed children ");
        g3.append(this.k);
        g3.append(". Map size ");
        g3.append(this.h.size());
        throw new IllegalArgumentException(g3.toString().toString());
    }
    
    public final void d(final int n, final int n2, final int n3) {
        final jwe a = this.a;
        a.L0 = true;
        a.O(n, n2, n3);
        a.L0 = false;
    }
    
    public final void e(final jwe jwe, Object o, final gub<? super m76, ? super Integer, oyv> b) {
        Object o2 = this.e;
        Object o3;
        if ((o3 = ((LinkedHashMap<K, ahq>)o2).get(jwe)) == null) {
            final w56 a = w56.a;
            o3 = new a(o, (gub)w56.b);
            ((Map<K, ahq>)o2).put((K)jwe, (ahq)o3);
        }
        final a a2 = (a)o3;
        final ke6 c = a2.c;
        final boolean b2 = c == null || c.u();
        if (a2.b == b && !b2 && !a2.d) {
            return;
        }
        zzd.f((Object)b, "<set-?>");
        a2.b = b;
        o3 = ahq.Companion.a();
        try {
            o2 = ((ahq)o3).i();
            try {
                final jwe a3 = this.a;
                a3.L0 = true;
                final gub<? super m76, ? super Integer, oyv> b3 = a2.b;
                final ke6 c2 = a2.c;
                final le6 b4 = this.b;
                if (b4 != null) {
                    final i36 k = m8y.k(-34810602, true, new axe(a2, (gub)b3));
                    ke6 a4 = null;
                    Label_0226: {
                        if (c2 != null) {
                            a4 = c2;
                            if (!c2.isDisposed()) {
                                break Label_0226;
                            }
                        }
                        final ViewGroup$LayoutParams a5 = androidx.compose.ui.platform.e.a;
                        o = new urv(jwe);
                        a4 = pe6.a((xr0<?>)o, b4);
                    }
                    a4.e((gub)k);
                    a2.c = a4;
                    a3.L0 = false;
                    ((ahq)o3).p((ahq)o2);
                    ((ahq)o3).c();
                    a2.d = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            }
            finally {
                ((ahq)o3).p((ahq)o2);
            }
        }
        finally {
            ((ahq)o3).c();
        }
    }
    
    public final jwe f(final Object a) {
        final int j = this.j;
        final jwe jwe = null;
        if (j == 0) {
            return null;
        }
        final int n = this.a.t().size() - this.k;
        while (true) {
            int i;
            for (int n2 = n - this.j, n3 = i = n - 1; i >= n2; --i) {
                if (zzd.a(this.b(i), a)) {
                    final int n4 = i;
                    int n5 = n4;
                    Label_0180: {
                        if (n4 == -1) {
                            for (i = n3; i >= n2; --i) {
                                final Object value = this.e.get(this.a.t().get(i));
                                zzd.c(value);
                                final a a2 = (a)value;
                                if (this.c.d(a, a2.a)) {
                                    a2.a = a;
                                    n5 = i;
                                    break Label_0180;
                                }
                            }
                            n5 = n4;
                        }
                    }
                    jwe jwe2;
                    if (n5 == -1) {
                        jwe2 = jwe;
                    }
                    else {
                        if (i != n2) {
                            this.d(i, n2, 1);
                        }
                        --this.j;
                        jwe2 = this.a.t().get(n2);
                        final Object value2 = this.e.get(jwe2);
                        zzd.c(value2);
                        final a a3 = (a)value2;
                        ((nhq)a3.e).setValue((Object)Boolean.TRUE);
                        a3.d = true;
                        ahq.Companion.e();
                    }
                    return jwe2;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    public static final class a
    {
        public Object a;
        public gub<? super m76, ? super Integer, oyv> b;
        public ke6 c;
        public boolean d;
        public final cwj e;
        
        public a(final Object a, final gub b) {
            zzd.f((Object)b, "content");
            this.a = a;
            this.b = (gub<? super m76, ? super Integer, oyv>)b;
            this.c = null;
            this.e = (cwj)nkz.r((Object)Boolean.TRUE);
        }
    }
}
