import java.util.Objects;
import java.util.WeakHashMap;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sbi implements qbi
{
    public final View C0;
    public final zbi D0;
    public final int[] E0;
    
    public sbi(final View c0) {
        zzd.f((Object)c0, "view");
        this.C0 = c0;
        final zbi d0 = new zbi(c0);
        d0.i(true);
        this.D0 = d0;
        this.E0 = new int[2];
        final WeakHashMap a = p5x.a;
        p5x$i.t(c0, true);
    }
    
    public final Object a(long b, final ap6<? super spw> ap6) {
        if (!this.D0.b(spw.b(b) * -1.0f, spw.c(b) * -1.0f)) {
            Objects.requireNonNull(spw.Companion);
            b = spw.b;
        }
        this.d();
        return new spw(b);
    }
    
    public final long b(final long n, final long n2, final int n3) {
        if (this.D0.j(lr0.e(n2), lr0.g(n3))) {
            it0.t0(this.E0, 0);
            this.D0.f(lr0.n(qfj.d(n)), lr0.n(qfj.e(n)), lr0.n(qfj.d(n2)), lr0.n(qfj.e(n2)), (int[])null, lr0.g(n3), this.E0);
            return lr0.f(this.E0, n2);
        }
        Objects.requireNonNull(qfj.Companion);
        return qfj.b;
    }
    
    public final Object c(final long n, long b, final ap6<? super spw> ap6) {
        if (!this.D0.a(spw.b(b) * -1.0f, spw.c(b) * -1.0f, true)) {
            Objects.requireNonNull(spw.Companion);
            b = spw.b;
        }
        this.d();
        return new spw(b);
    }
    
    public final void d() {
        if (this.D0.h(0)) {
            this.D0.k(0);
        }
        if (this.D0.h(1)) {
            this.D0.k(1);
        }
    }
    
    public final long f(final long n, final int n2) {
        if (this.D0.j(lr0.e(n), lr0.g(n2))) {
            it0.t0(this.E0, 0);
            this.D0.d(lr0.n(qfj.d(n)), lr0.n(qfj.e(n)), this.E0, (int[])null, lr0.g(n2));
            return lr0.f(this.E0, n);
        }
        Objects.requireNonNull(qfj.Companion);
        return qfj.b;
    }
}
