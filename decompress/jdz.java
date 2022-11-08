import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdz implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ long D0;
    public final /* synthetic */ h1z E0;
    
    @Override
    public final void run() {
        switch (this.C0) {
            default: {
                final zlz zlz = (zlz)this.E0;
                final long d0 = this.D0;
                zlz.g();
                zlz.k();
                zlz.C0.b().P0.b("Activity paused, time", (Object)d0);
                final aiq h0 = zlz.H0;
                Objects.requireNonNull(((zlz)h0.E0).C0.P0);
                final olz d2 = new olz(h0, System.currentTimeMillis(), d0);
                h0.D0 = d2;
                ((zlz)h0.E0).E0.postDelayed((Runnable)d2, 2000L);
                if (zlz.C0.I0.v()) {
                    ((fey)zlz.G0.c).a();
                }
                return;
            }
            case 0: {
                ((nfz)this.E0).r(this.D0, true);
                ((abz)this.E0).C0.z().A(new AtomicReference());
            }
        }
    }
}
