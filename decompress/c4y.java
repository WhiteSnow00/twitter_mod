import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4y implements Runnable
{
    public final int F0;
    public final Object G0;
    
    public c4y(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            case 2: {
                final bnz bnz = (bnz)this.G0;
                final gz h0 = bnz.H0;
                final long f0 = bnz.F0;
                final long g0 = bnz.G0;
                ((wxy)h0.H0).g();
                ((ocz)h0.H0).F0.b().R0.a("Application going to the background");
                ((ocz)h0.H0).F0.u().U0.a(true);
                final Bundle bundle = new Bundle();
                if (!((ocz)h0.H0).F0.L0.v()) {
                    ((mnz)h0.H0).J0.c.a();
                    ((mnz)h0.H0).J0.a(false, false, g0);
                }
                ((ocz)h0.H0).F0.w().p("auto", "_ab", f0, bundle);
                return;
            }
            case 1: {
                ((w1y)this.G0).m.lock();
                try {
                    w1y.p((w1y)this.G0);
                    return;
                }
                finally {
                    ((w1y)this.G0).m.unlock();
                }
                break;
            }
        }
        final ejh ejh = (ejh)this.G0;
        final int decrementAndGet = ejh.b.decrementAndGet();
        iuk.G(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            final dks dks = (dks)ejh;
            synchronized (dks) {
                dks.i = true;
                dks.d.d();
                monitorexit(dks);
                ejh.c.set(false);
            }
        }
        miz.F0.clear();
        gmz.a.clear();
    }
}
