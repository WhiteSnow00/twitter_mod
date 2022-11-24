import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obk<T> extends lc<T>
{
    public final kbk<T> H0;
    public int I0;
    public w3u<? extends T> J0;
    public int K0;
    
    public obk(final kbk<T> h0, final int n) {
        e0e.f((Object)h0, "builder");
        super(n, h0.getSize());
        this.H0 = h0;
        this.I0 = h0.i();
        this.K0 = -1;
        this.f();
    }
    
    @Override
    public final void add(final T t) {
        this.d();
        this.H0.add(super.F0, (Object)t);
        ++super.F0;
        this.e();
    }
    
    public final void d() {
        if (this.I0 == this.H0.i()) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final void e() {
        super.G0 = this.H0.getSize();
        this.I0 = this.H0.i();
        this.K0 = -1;
        this.f();
    }
    
    public final void f() {
        final kbk<T> h0 = this.H0;
        final Object[] k0 = h0.K0;
        if (k0 == null) {
            this.J0 = null;
            return;
        }
        final int g0 = h0.getSize() - 1 & 0xFFFFFFE0;
        int f0;
        if ((f0 = super.F0) > g0) {
            f0 = g0;
        }
        final int h2 = this.H0.I0 / 5 + 1;
        final w3u<? extends T> j0 = this.J0;
        if (j0 == null) {
            this.J0 = (w3u<? extends T>)new w3u(k0, f0, g0, h2);
        }
        else {
            e0e.c((Object)j0);
            ((lc)j0).F0 = f0;
            ((lc)j0).G0 = g0;
            if (j0.I0.length < (j0.H0 = h2)) {
                j0.I0 = new Object[h2];
            }
            final Object[] i0 = j0.I0;
            boolean j2 = false;
            i0[0] = k0;
            if (f0 == g0) {
                j2 = true;
            }
            j0.e(f0 - ((j0.J0 = j2) ? 1 : 0), 1);
        }
    }
    
    @Override
    public final T next() {
        this.d();
        this.a();
        final int f0 = super.F0;
        this.K0 = f0;
        final w3u<? extends T> j0 = this.J0;
        if (j0 == null) {
            final Object[] l0 = this.H0.L0;
            super.F0 = f0 + 1;
            return (T)l0[f0];
        }
        if (((lc)j0).hasNext()) {
            ++super.F0;
            return (T)j0.next();
        }
        return (T)this.H0.L0[super.F0++ - ((lc)j0).G0];
    }
    
    @Override
    public final T previous() {
        this.d();
        this.c();
        int f0 = super.F0;
        this.K0 = f0 - 1;
        final w3u<? extends T> j0 = this.J0;
        if (j0 == null) {
            final Object[] l0 = this.H0.L0;
            final int f2 = f0 - 1;
            super.F0 = f2;
            return (T)l0[f2];
        }
        final int g0 = ((lc)j0).G0;
        if (f0 > g0) {
            final Object[] l2 = this.H0.L0;
            --f0;
            super.F0 = f0;
            return (T)l2[f0 - g0];
        }
        super.F0 = f0 - 1;
        return (T)j0.previous();
    }
    
    @Override
    public final void remove() {
        this.d();
        final int k0 = this.K0;
        if (k0 != -1) {
            this.H0.e(k0);
            final int k2 = this.K0;
            if (k2 < super.F0) {
                super.F0 = k2;
            }
            this.e();
            return;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final void set(final T t) {
        this.d();
        final int k0 = this.K0;
        if (k0 != -1) {
            this.H0.set(k0, (Object)t);
            this.I0 = this.H0.i();
            this.f();
            return;
        }
        throw new IllegalStateException();
    }
}
