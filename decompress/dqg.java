import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.platform.AndroidComposeView$g;
import java.util.Comparator;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqg
{
    public final vve a;
    public final yo8 b;
    public boolean c;
    public final kjj d;
    public final suh<zqj$b> e;
    public long f;
    public final suh<a> g;
    public pi6 h;
    
    public dqg(final vve a) {
        czd.f((Object)a, "root");
        this.a = a;
        Objects.requireNonNull(zqj.Companion);
        this.b = new yo8();
        this.d = new kjj();
        this.e = (suh<zqj$b>)new suh((Object[])new zqj$b[16]);
        this.f = 1L;
        this.g = (suh<a>)new suh((Object[])new a[16]);
    }
    
    public final void a() {
        final suh<zqj$b> e = this.e;
        final int f0 = e.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = e.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((zqj$b)d0[n]).c();
            } while (++n < f0);
        }
        this.e.h();
    }
    
    public final void b(final boolean b) {
        if (b) {
            final kjj d = this.d;
            final vve a = this.a;
            Objects.requireNonNull(d);
            czd.f((Object)a, "rootNode");
            d.a.h();
            d.a.b((Object)a);
            a.n1 = true;
        }
        final kjj d2 = this.d;
        d2.a.s((Comparator)kjj.a.a.D0);
        final suh<vve> a2 = d2.a;
        int f0 = a2.F0;
        if (f0 > 0) {
            --f0;
            final Object[] d3 = a2.D0;
            czd.d((Object)d3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final vve vve = (vve)d3[f0];
                if (vve.n1) {
                    d2.a(vve);
                }
            } while (--f0 >= 0);
        }
        d2.a.h();
    }
    
    public final boolean c(final vve vve, pi6 j0) {
        if (vve.S0 == null) {
            return false;
        }
        boolean b;
        if (j0 != null) {
            b = vve.J(j0);
        }
        else {
            final bwe$a l = vve.f1.l;
            if (l != null) {
                j0 = l.J0;
            }
            else {
                j0 = null;
            }
            b = vve.J(j0);
        }
        final vve x = vve.x();
        if (b && x != null) {
            if (x.S0 == null) {
                this.q(x, false);
            }
            else {
                final int a1 = vve.a1;
                if (a1 == 1) {
                    this.o(x, false);
                }
                else if (a1 == 2) {
                    this.n(x, false);
                }
            }
        }
        return b;
    }
    
    public final boolean d(final vve vve, final pi6 pi6) {
        boolean b;
        if (pi6 != null) {
            b = vve.R(pi6);
        }
        else {
            b = vve.S(vve);
        }
        final vve x = vve.x();
        if (b && x != null) {
            final int z0 = vve.Z0;
            if (z0 == 1) {
                this.q(x, false);
            }
            else if (z0 == 2) {
                this.p(x, false);
            }
        }
        return b;
    }
    
    public final void e(final vve vve) {
        czd.f((Object)vve, "layoutNode");
        if (this.b.b()) {
            return;
        }
        if (!this.c) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (vve.f1.c ^ true) {
            final suh<vve> z = vve.z();
            final int f0 = z.F0;
            if (f0 > 0) {
                int n = 0;
                final Object[] d0 = z.D0;
                czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    final vve vve2 = (vve)d0[n];
                    if (vve2.f1.c && this.b.c(vve2)) {
                        this.l(vve2);
                    }
                    if (!vve2.f1.c) {
                        this.e(vve2);
                    }
                } while (++n < f0);
            }
            if (vve.f1.c && this.b.c(vve)) {
                this.l(vve);
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final boolean f(final vve vve) {
        final bwe f1 = vve.f1;
        final boolean g = f1.g;
        boolean b = false;
        if (g) {
            if (vve.a1 != 1) {
                final bwe$a l = f1.l;
                boolean b2 = false;
                Label_0066: {
                    if (l != null) {
                        final gcg n0 = l.N0;
                        if (n0 != null && ((kx)n0).f()) {
                            b2 = true;
                            break Label_0066;
                        }
                    }
                    b2 = false;
                }
                b = b;
                if (!b2) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public final boolean g(final vve vve) {
        final int z0 = vve.Z0;
        boolean b = true;
        if (z0 != 1) {
            b = (((kx)vve.f1.k.O0).f() && b);
        }
        return b;
    }
    
    public final boolean h(final nsb<fzv> nsb) {
        if (!this.a.H()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.V0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.c ^ true) {
            final pi6 h = this.h;
            boolean b = false;
            if (h != null) {
                this.c = true;
                try {
                    boolean b3;
                    if (this.b.b() ^ true) {
                        final yo8 b2 = this.b;
                        b = false;
                        while (b2.b() ^ true) {
                            final vve vve = ((TreeSet<vve>)b2.c).first();
                            czd.e((Object)vve, "node");
                            b2.c(vve);
                            final boolean l = this.l(vve);
                            if (vve == this.a && l) {
                                b = true;
                            }
                        }
                        b3 = b;
                        if (nsb != null) {
                            ((AndroidComposeView$g)nsb).invoke();
                            b3 = b;
                        }
                    }
                    else {
                        b3 = false;
                    }
                    this.c = false;
                    b = b3;
                }
                finally {
                    this.c = false;
                }
            }
            this.a();
            return b;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void i(final vve vve, final long n) {
        czd.f((Object)vve, "layoutNode");
        if (!(czd.a((Object)vve, (Object)this.a) ^ true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.H()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.V0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.c ^ true) {
            if (this.h != null) {
                this.c = true;
                try {
                    this.b.c(vve);
                    final boolean c = this.c(vve, new pi6(n));
                    this.d(vve, new pi6(n));
                    if ((c || vve.f1.g) && czd.a((Object)vve.I(), (Object)Boolean.TRUE)) {
                        vve.K();
                    }
                    if (vve.f1.d && vve.V0) {
                        vve.V();
                        this.d.b(vve);
                    }
                }
                finally {
                    this.c = false;
                }
            }
            this.a();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void j() {
        if (!this.a.H()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final vve a = this.a;
        if (!a.V0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.c ^ true) {
            if (this.h != null) {
                this.c = true;
                try {
                    this.k(a);
                }
                finally {
                    this.c = false;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void k(final vve vve) {
        this.m(vve);
        final suh<vve> z = vve.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final vve vve2 = (vve)d0[n];
                if (this.g(vve2)) {
                    this.k(vve2);
                }
            } while (++n < f0);
        }
        this.m(vve);
    }
    
    public final boolean l(final vve vve) {
        final boolean v0 = vve.V0;
        boolean b = false;
        final int n = 0;
        if (!v0) {
            final boolean c = vve.f1.c;
            final boolean b2 = true;
            if ((!c || !this.g(vve)) && !czd.a((Object)vve.I(), (Object)Boolean.TRUE) && !this.f(vve)) {
                final bwe f1 = vve.f1;
                int n2 = b2 ? 1 : 0;
                if (!((kx)f1.k.O0).f()) {
                    final bwe$a l = f1.l;
                    boolean b3 = false;
                    Label_0136: {
                        if (l != null) {
                            final gcg n3 = l.N0;
                            if (n3 != null && ((kx)n3).f()) {
                                b3 = true;
                                break Label_0136;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        n2 = (b2 ? 1 : 0);
                    }
                    else {
                        n2 = 0;
                    }
                }
                if (n2 == 0) {
                    return b;
                }
            }
        }
        final bwe f2 = vve.f1;
        final boolean f3 = f2.f;
        final hcg hcg = null;
        int n4;
        if (!f3 && !f2.c) {
            b = false;
            n4 = 0;
        }
        else {
            pi6 h;
            if (vve == this.a) {
                h = this.h;
                czd.c((Object)h);
            }
            else {
                h = null;
            }
            final boolean b4 = vve.f1.f && this.c(vve, h);
            final boolean d = this.d(vve, h);
            n4 = (b4 ? 1 : 0);
            b = d;
        }
        if ((n4 != 0 || vve.f1.g) && czd.a((Object)vve.I(), (Object)Boolean.TRUE)) {
            vve.K();
        }
        if (vve.f1.d && vve.V0) {
            if (vve == this.a) {
                if (vve.b1 == 3) {
                    vve.l();
                }
                final bwe$b k = vve.f1.k;
                final wgk$a$a companion = wgk$a.Companion;
                final int f4 = k.F0();
                final fve t0 = vve.T0;
                final vve x = vve.x();
                Object b5 = hcg;
                if (x != null) {
                    b5 = x.e1.b;
                }
                final eve c2 = wgk$a.c;
                Objects.requireNonNull(companion);
                final int b6 = wgk$a.b;
                final fve a = wgk$a.a;
                final bwe d2 = wgk$a.d;
                wgk$a.b = f4;
                wgk$a.a = t0;
                final boolean n5 = wgk$a$a.n(companion, (hcg)b5);
                ((wgk$a)companion).g((wgk)k, 0, 0, 0.0f);
                if (b5 != null) {
                    ((hcg)b5).I0 = n5;
                }
                wgk$a.b = b6;
                wgk$a.a = a;
                wgk$a.c = c2;
                wgk$a.d = d2;
            }
            else {
                vve.V();
            }
            this.d.b(vve);
        }
        if (this.g.m()) {
            final suh<a> g = this.g;
            final int f5 = g.F0;
            if (f5 > 0) {
                final Object[] d3 = g.D0;
                czd.d((Object)d3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n6 = n;
                do {
                    final a a2 = (a)d3[n6];
                    if (a2.a.H()) {
                        if (!a2.b) {
                            this.q(a2.a, a2.c);
                        }
                        else {
                            this.o(a2.a, a2.c);
                        }
                    }
                } while (++n6 < f5);
            }
            this.g.h();
        }
        return b;
    }
    
    public final void m(final vve vve) {
        final bwe f1 = vve.f1;
        if (!f1.c && !f1.f) {
            return;
        }
        pi6 h;
        if (vve == this.a) {
            h = this.h;
            czd.c((Object)h);
        }
        else {
            h = null;
        }
        if (vve.f1.f) {
            this.c(vve, h);
        }
        this.d(vve, h);
    }
    
    public final boolean n(final vve vve, final boolean b) {
        czd.f((Object)vve, "layoutNode");
        final int e = ib0.E(vve.f1.b);
        final boolean b2 = true;
        Label_0060: {
            if (e == 0) {
                break Label_0060;
            }
            if (e != 1) {
                if (e == 2) {
                    break Label_0060;
                }
                if (e != 3) {
                    if (e == 4) {
                        break Label_0060;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return false;
        }
        final bwe f1 = vve.f1;
        if ((f1.f || f1.g) && !b) {
            return false;
        }
        f1.d();
        vve.f1.c();
        if (czd.a((Object)vve.I(), (Object)Boolean.TRUE)) {
            final vve x = vve.x();
            if ((x == null || !x.f1.f) && (x == null || !x.f1.g)) {
                this.b.a(vve);
            }
        }
        if (this.c) {
            return false;
        }
        return b2;
    }
    
    public final boolean o(final vve vve, final boolean b) {
        czd.f((Object)vve, "layoutNode");
        final mcg s0 = vve.S0;
        final boolean b2 = true;
        if (s0 != null) {
            final int e = ib0.E(vve.f1.b);
            if (e != 0) {
                if (e == 1) {
                    return false;
                }
                if (e != 2 && e != 3) {
                    if (e != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final bwe f1 = vve.f1;
                    if (f1.f && !b) {
                        return false;
                    }
                    f1.f = true;
                    vve.L();
                    if (czd.a((Object)vve.I(), (Object)Boolean.TRUE) || this.f(vve)) {
                        final vve x = vve.x();
                        if (x == null || !x.f1.f) {
                            this.b.a(vve);
                        }
                    }
                    if (!this.c) {
                        return b2;
                    }
                    return false;
                }
            }
            this.g.b((Object)new a(vve, true, b));
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }
    
    public final boolean p(final vve vve, final boolean b) {
        czd.f((Object)vve, "layoutNode");
        final int e = ib0.E(vve.f1.b);
        final boolean b2 = true;
        if (e != 0 && e != 1 && e != 2 && e != 3) {
            if (e != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!b) {
                final bwe f1 = vve.f1;
                if (f1.c) {
                    return false;
                }
                if (f1.d) {
                    return false;
                }
            }
            vve.f1.c();
            if (vve.V0) {
                final vve x = vve.x();
                if ((x == null || !x.f1.d) && (x == null || !x.f1.c)) {
                    this.b.a(vve);
                }
            }
            if (!this.c) {
                return b2;
            }
        }
        return false;
    }
    
    public final boolean q(final vve vve, final boolean b) {
        czd.f((Object)vve, "layoutNode");
        final int e = ib0.E(vve.f1.b);
        final boolean b2 = true;
        if (e != 0 && e != 1) {
            if (e != 2 && e != 3) {
                if (e != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!vve.f1.c || b) {
                    vve.L();
                    if (vve.V0 || (vve.f1.c && this.g(vve))) {
                        final vve x = vve.x();
                        if (x == null || !x.f1.c) {
                            this.b.a(vve);
                        }
                    }
                    if (!this.c) {
                        return b2;
                    }
                }
            }
            else {
                this.g.b((Object)new a(vve, false, b));
            }
        }
        return false;
    }
    
    public final void r(final long n) {
        final pi6 h = this.h;
        if (h == null || !pi6.b(h.a, n)) {
            if (!(this.c ^ true)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.h = new pi6(n);
            this.a.L();
            this.b.a(this.a);
        }
    }
    
    public static final class a
    {
        public final vve a;
        public final boolean b;
        public final boolean c;
        
        public a(final vve a, final boolean b, final boolean c) {
            czd.f((Object)a, "node");
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
