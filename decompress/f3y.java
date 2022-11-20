import java.util.concurrent.atomic.AtomicReference;
import android.content.ComponentName;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3y implements Runnable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public f3y(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public f3y(final Object f0, final Object e0, final int d0, final da8 da8) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    public f3y(final u9a f0) {
        this.D0 = 6;
        this.F0 = f0;
        this.E0 = new x1k();
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            case 5: {
                final ara ara = (ara)this.E0;
                final o2r o2r = (o2r)this.F0;
                ara.f.o((Object)o2r);
                ara.g.o((Object)o2r);
                return;
            }
            case 4: {
                synchronized (((bnz)this.F0).E0) {
                    final kij f0 = ((bnz)this.F0).F0;
                    if (f0 != null) {
                        final Exception n = ((ubs)this.E0).n();
                        Objects.requireNonNull(n, "null reference");
                        f0.c(n);
                    }
                    return;
                }
            }
            case 3: {
                final poz poz = (poz)this.F0;
                poz.a().g();
                poz.N0 = new g5z(poz);
                final zdy f2 = new zdy(poz);
                ((zmz)f2).i();
                poz.F0 = f2;
                final zby k = poz.K();
                final g7z d0 = poz.D0;
                Objects.requireNonNull(d0, "null reference");
                k.F0 = (sby)d0;
                final klz l0 = new klz(poz);
                l0.i();
                poz.L0 = l0;
                final bay i0 = new bay(poz);
                ((zmz)i0).i();
                poz.I0 = i0;
                final ogz k2 = new ogz(poz);
                ((zmz)k2).i();
                poz.K0 = k2;
                final umz h0 = new umz(poz);
                ((zmz)h0).i();
                poz.H0 = h0;
                poz.G0 = new v3z(poz);
                if (poz.T0 != poz.U0) {
                    poz.b().I0.c("Not all upload components initialized", (Object)poz.T0, (Object)poz.U0);
                }
                poz.P0 = true;
                final poz poz2 = (poz)this.F0;
                poz2.a().g();
                final zdy f3 = poz2.F0;
                poz.I((zmz)f3);
                f3.R();
                if (poz2.L0.M0.a() == 0L) {
                    final f4z m0 = poz2.L0.M0;
                    Objects.requireNonNull((ffz)poz2.c());
                    m0.b(System.currentTimeMillis());
                }
                poz2.D();
                return;
            }
            case 2: {
                glz.x(((dlz)this.F0).F0, (ComponentName)this.E0);
                return;
            }
            case 1: {
                final AtomicReference atomicReference = (AtomicReference)this.E0;
                monitorenter(atomicReference);
                try {
                    final AtomicReference atomicReference2 = (AtomicReference)this.E0;
                    final Object f4 = this.F0;
                    atomicReference2.set(((pbz)f4).D0.J0.n(((pbz)f4).D0.r().l(), uzy.O));
                    return;
                }
                finally {
                    this.E0.notify();
                }
                try {
                    return;
                }
                finally {
                    monitorexit(atomicReference);
                }
            }
            case 0: {
                final tmf tmf = (tmf)this.E0;
                final tmf$b tmf$b = (tmf$b)this.F0;
                final Object b = tmf.b;
                if (b == null) {
                    Objects.requireNonNull(tmf$b);
                    return;
                }
                try {
                    final jhy jhy = (jhy)tmf$b;
                    Objects.requireNonNull(jhy);
                    ((u5g)b).onLocationChanged(jhy.a);
                    return;
                }
                catch (final RuntimeException ex) {
                    Objects.requireNonNull(tmf$b);
                    throw ex;
                }
                break;
            }
        }
        final w1k b2 = ((x1k)this.E0).b();
        if (b2 != null) {
            ((u9a)this.F0).b(b2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
