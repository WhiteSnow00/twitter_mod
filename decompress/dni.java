import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class dni
{
    public final suh<vmi> a;
    
    public dni() {
        this.a = (suh<vmi>)new suh((Object[])new vmi[16]);
    }
    
    public boolean a(final Map<gpk, hpk> map, final eve eve, final qxd qxd, final boolean b) {
        czd.f((Object)map, "changes");
        czd.f((Object)eve, "parentCoordinates");
        final suh<vmi> a = this.a;
        final int f0 = a.F0;
        boolean b2 = false;
        if (f0 > 0) {
            final Object[] d0 = a.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            int n2 = 0;
            int i;
            do {
                b2 = (((vmi)d0[n]).a(map, eve, qxd, b) || n2 != 0);
                i = ++n;
                n2 = (b2 ? 1 : 0);
            } while (i < f0);
        }
        return b2;
    }
    
    public void b(final qxd qxd) {
        for (int n = this.a.F0 - 1; -1 < n; --n) {
            if (((vmi)this.a.D0[n]).c.l()) {
                this.a.p(n);
            }
        }
    }
    
    public void c() {
        final suh<vmi> a = this.a;
        final int f0 = a.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = a.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((vmi)d0[n]).c();
            } while (++n < f0);
        }
    }
    
    public boolean d(final qxd qxd) {
        final suh<vmi> a = this.a;
        final int f0 = a.F0;
        boolean b = false;
        if (f0 > 0) {
            final Object[] d0 = a.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            int n2 = 0;
            int i;
            do {
                b = (((vmi)d0[n]).d(qxd) || n2 != 0);
                i = ++n;
                n2 = (b ? 1 : 0);
            } while (i < f0);
        }
        this.b(qxd);
        return b;
    }
    
    public boolean e(final Map<gpk, hpk> map, final eve eve, final qxd qxd, final boolean b) {
        czd.f((Object)map, "changes");
        czd.f((Object)eve, "parentCoordinates");
        final suh<vmi> a = this.a;
        final int f0 = a.F0;
        boolean b2 = false;
        if (f0 > 0) {
            final Object[] d0 = a.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            int n2 = 0;
            int i;
            do {
                b2 = (((vmi)d0[n]).e(map, eve, qxd, b) || n2 != 0);
                i = ++n;
                n2 = (b2 ? 1 : 0);
            } while (i < f0);
        }
        return b2;
    }
    
    public final void f() {
        int n = 0;
        while (true) {
            final suh<vmi> a = this.a;
            if (n >= a.F0) {
                break;
            }
            final vmi vmi = (vmi)a.D0[n];
            if (!uoz.H(vmi.b)) {
                this.a.p(n);
                vmi.c();
            }
            else {
                ++n;
                vmi.f();
            }
        }
    }
}
