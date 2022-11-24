import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class raz implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public raz(final Object h0, final Object g0, final int f0) {
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = g0;
    }
    
    public raz(final opz g0, final Runnable h0) {
        this.F0 = 2;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                synchronized (((jiz)this.H0).G0) {
                    final uhj h0 = ((jiz)this.H0).H0;
                    if (h0 != null) {
                        h0.q((mcs)this.G0);
                    }
                    return;
                }
                break;
            }
            case 2: {
                ((opz)this.G0).f();
                final opz opz = (opz)this.G0;
                final Runnable runnable = (Runnable)this.H0;
                opz.a().g();
                if (opz.U0 == null) {
                    opz.U0 = new ArrayList();
                }
                opz.U0.add(runnable);
                ((opz)this.G0).u();
                return;
            }
            case 1: {
                final AtomicReference atomicReference = (AtomicReference)this.G0;
                monitorenter(atomicReference);
                try {
                    final AtomicReference atomicReference2 = (AtomicReference)this.G0;
                    final Object h2 = this.H0;
                    final tcy l0 = ((ocz)h2).F0.L0;
                    final String i = ((ocz)h2).F0.r().l();
                    final n0z m = s0z.M;
                    Objects.requireNonNull(l0);
                    String s;
                    if (i == null) {
                        s = (String)m.a(null);
                    }
                    else {
                        s = (String)m.a(l0.H0.w(i, m.a));
                    }
                    atomicReference2.set(s);
                    return;
                }
                finally {
                    this.G0.notify();
                }
                try {}
                finally {
                    monitorexit(atomicReference);
                }
            }
            case 0: {
                ((kcz)this.H0).a.f();
                final opz a = ((kcz)this.H0).a;
                final sxz sxz = (sxz)this.G0;
                a.a().g();
                a.g();
                iuk.z(sxz.F0);
                a.J(sxz);
            }
        }
    }
}
