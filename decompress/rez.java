import java.util.Objects;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rez implements Runnable
{
    public final int D0;
    public final String E0;
    public final String F0;
    public final Object G0;
    public final Object H0;
    
    public rez(final bgz h0, final AtomicReference g0, final String e0, final String f0) {
        this.D0 = 0;
        this.H0 = h0;
        this.G0 = g0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public rez(final sek h0, final String e0, final Bundle g0) {
        this.D0 = 1;
        this.H0 = h0;
        this.E0 = e0;
        this.F0 = "_err";
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final lpz q = ((poz)((sek)this.H0).D0).Q();
                final String e0 = this.E0;
                final String f0 = this.F0;
                final Bundle bundle = (Bundle)this.G0;
                Objects.requireNonNull((ffz)((poz)((sek)this.H0).D0).c());
                final wgy s0 = q.s0(e0, f0, bundle, "auto", System.currentTimeMillis(), false);
                final poz poz = (poz)((sek)this.H0).D0;
                Objects.requireNonNull(s0, "null reference");
                poz.j(s0, this.E0);
                return;
            }
            case 0: {
                final glz z = ((pbz)this.H0).D0.z();
                final AtomicReference atomicReference = (AtomicReference)this.G0;
                final String e2 = this.E0;
                final String f2 = this.F0;
                ((axy)z).g();
                z.h();
                z.t((Runnable)new qjz(z, atomicReference, e2, f2, z.q(false)));
            }
        }
    }
}
