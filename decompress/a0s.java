import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0s extends epk implements fpk, hpk, dp8
{
    public final z5x D0;
    public final /* synthetic */ dp8 E0;
    public rok F0;
    public final ouh<a0s$a<?>> G0;
    public final ouh<a0s$a<?>> H0;
    public rok I0;
    public long J0;
    public yy6 K0;
    
    public a0s(final z5x d0, final dp8 e0) {
        zzd.f((Object)d0, "viewConfiguration");
        zzd.f((Object)e0, "density");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = c0s.a;
        this.G0 = (ouh<a0s$a<?>>)new ouh((Object[])new a0s$a[16]);
        this.H0 = (ouh<a0s$a<?>>)new ouh((Object[])new a0s$a[16]);
        Objects.requireNonNull(iud.Companion);
        this.J0 = 0L;
        this.K0 = (yy6)x4c.C0;
    }
    
    public final long C(final float n) {
        return this.E0.C(n);
    }
    
    public final long C0(final long n) {
        return this.E0.C0(n);
    }
    
    public final long D(final long n) {
        return this.E0.D(n);
    }
    
    public final void I(final rok rok, final sok sok) {
        Object o = this.G0;
        synchronized (o) {
            final ouh<a0s$a<?>> h0 = this.H0;
            h0.e(h0.E0, (ouh)this.G0);
            monitorexit(o);
            try {
                final int ordinal = ((Enum)sok).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                    }
                    else {
                        o = this.H0;
                        int e0 = ((ouh)o).E0;
                        if (e0 > 0) {
                            --e0;
                            o = ((ouh)o).C0;
                            zzd.d(o, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            do {
                                ((a0s$a)o[e0]).d(rok, sok);
                            } while (--e0 >= 0);
                        }
                        return;
                    }
                }
                o = this.H0;
                final int e2 = ((ouh)o).E0;
                if (e2 > 0) {
                    int n = 0;
                    o = ((ouh)o).C0;
                    zzd.d(o, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        ((a0s$a)o[n]).d(rok, sok);
                    } while (++n < e2);
                }
            }
            finally {
                this.H0.h();
            }
        }
    }
    
    public final void O(final yy6 k0) {
        zzd.f((Object)k0, "<set-?>");
        this.K0 = k0;
    }
    
    public final int S(final float n) {
        return this.E0.S(n);
    }
    
    public final float V(final long n) {
        return this.E0.V(n);
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final <R> Object Z(final gub<? super pe1, ? super ap6<? super R>, ?> gub, final ap6<? super R> ap6) {
        final hg3 hg3 = new hg3(asy.Z((ap6)ap6), 1);
        hg3.r();
        final a0s$a a0s$a = new a0s$a(this, (ap6)hg3);
        synchronized (this.G0) {
            this.G0.b((Object)a0s$a);
            new qoo(asy.Z(asy.w((gub)gub, (Object)a0s$a, (ap6)a0s$a)), (Object)zy6.C0).resumeWith((Object)oyv.a);
            monitorexit(this.G0);
            hg3.w((rtb)new rtb<Throwable, oyv>() {
                public final Object invoke(final Object o) {
                    final Throwable t = (Throwable)o;
                    final a0s$a<R> c0 = (a0s$a<R>)a0s$a;
                    final gg3 e0 = c0.E0;
                    if (e0 != null) {
                        e0.v(t);
                    }
                    c0.E0 = null;
                    return oyv.a;
                }
            });
            return hg3.q();
        }
    }
    
    public final void f() {
        final rok i0 = this.I0;
        if (i0 == null) {
            return;
        }
        final List a = i0.a;
        final int size = a.size();
        final int n = 0;
        int n2 = 0;
        boolean b;
        while (true) {
            b = true;
            if (n2 >= size) {
                break;
            }
            if (!(true ^ ((zok)a.get(n2)).d)) {
                b = false;
                break;
            }
            ++n2;
        }
        if (b) {
            return;
        }
        final List a2 = i0.a;
        final ArrayList list = new ArrayList<zok>(a2.size());
        for (int size2 = a2.size(), j = n; j < size2; ++j) {
            final zok zok = a2.get(j);
            final long a3 = zok.a;
            final long c = zok.c;
            final long b2 = zok.b;
            final float c2 = zok.c();
            final long c3 = zok.c;
            final long b3 = zok.b;
            final boolean d = zok.d;
            Objects.requireNonNull(lpk.Companion);
            Objects.requireNonNull(qfj.Companion);
            list.add(new zok(a3, b2, c, false, c2, b3, c3, d, d, 1, qfj.b));
        }
        final rok f0 = new rok((List)list, (nyd)null);
        this.I(this.F0 = f0, sok.C0);
        this.I(f0, sok.D0);
        this.I(f0, sok.E0);
        this.I0 = null;
    }
    
    public final void g(rok rok, final sok sok, final long j0) {
        this.J0 = j0;
        if (sok == sok.C0) {
            this.F0 = rok;
        }
        this.I(rok, sok);
        final List a = rok.a;
        final int size = a.size();
        final int n = 0;
        while (true) {
            for (int i = 0; i < size; ++i) {
                if (!h6q.n((zok)a.get(i))) {
                    final int n2 = n;
                    if ((n2 ^ 0x1) == 0x0) {
                        rok = null;
                    }
                    this.I0 = rok;
                    return;
                }
            }
            final int n2 = 1;
            continue;
        }
    }
    
    public final float getDensity() {
        return this.E0.getDensity();
    }
    
    public final epk l0() {
        return this;
    }
    
    public final float m0(final int n) {
        return this.E0.m0(n);
    }
    
    public final float n0(final float n) {
        return this.E0.n0(n);
    }
    
    public final float p0() {
        return this.E0.p0();
    }
    
    public final float t0(final float n) {
        return this.E0.t0(n);
    }
    
    public final int w0(final long n) {
        return this.E0.w0(n);
    }
}
