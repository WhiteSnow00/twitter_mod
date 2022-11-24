import java.util.Objects;
import java.util.WeakHashMap;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lci implements jci
{
    public final View F0;
    public final sci G0;
    public final int[] H0;
    
    public lci(final View f0) {
        e0e.f((Object)f0, "view");
        this.F0 = f0;
        final sci g0 = new sci(f0);
        g0.i(true);
        this.G0 = g0;
        this.H0 = new int[2];
        final WeakHashMap a = b7x.a;
        b7x$i.t(f0, true);
    }
    
    @Override
    public final Object a(long b, final mp6<? super crw> mp6) {
        if (!this.G0.b(crw.b(b) * -1.0f, crw.c(b) * -1.0f)) {
            Objects.requireNonNull(crw.Companion);
            b = crw.b;
        }
        this.d();
        return new crw(b);
    }
    
    @Override
    public final long b(final long n, final long n2, final int n3) {
        if (this.G0.j(eg8.h(n2), eg8.p(n3))) {
            et0.N0(this.H0, 0);
            this.G0.f(eg8.B(kgj.d(n)), eg8.B(kgj.e(n)), eg8.B(kgj.d(n2)), eg8.B(kgj.e(n2)), null, eg8.p(n3), this.H0);
            return eg8.n(this.H0, n2);
        }
        Objects.requireNonNull(kgj.Companion);
        return kgj.b;
    }
    
    @Override
    public final Object c(final long n, long b, final mp6<? super crw> mp6) {
        if (!this.G0.a(crw.b(b) * -1.0f, crw.c(b) * -1.0f, true)) {
            Objects.requireNonNull(crw.Companion);
            b = crw.b;
        }
        this.d();
        return new crw(b);
    }
    
    public final void d() {
        if (this.G0.h(0)) {
            this.G0.k(0);
        }
        if (this.G0.h(1)) {
            this.G0.k(1);
        }
    }
    
    @Override
    public final long f(final long n, final int n2) {
        if (this.G0.j(eg8.h(n), eg8.p(n2))) {
            et0.N0(this.H0, 0);
            this.G0.d(eg8.B(kgj.d(n)), eg8.B(kgj.e(n)), this.H0, null, eg8.p(n2));
            return eg8.n(this.H0, n);
        }
        Objects.requireNonNull(kgj.Companion);
        return kgj.b;
    }
}
