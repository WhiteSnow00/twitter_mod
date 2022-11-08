import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlz implements Runnable
{
    public final /* synthetic */ long C0;
    public final /* synthetic */ zlz D0;
    
    public jlz(final zlz d0, final long c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        final zlz d0 = this.D0;
        final long c0 = this.C0;
        d0.g();
        d0.k();
        d0.C0.b().P0.b("Activity resumed, time", (Object)c0);
        if (d0.C0.I0.v() || d0.C0.u().R0.b()) {
            final vlz g0 = d0.G0;
            g0.d.g();
            ((fey)g0.c).a();
            g0.a = c0;
            g0.b = c0;
        }
        final aiq h0 = d0.H0;
        ((zlz)h0.E0).g();
        final olz olz = (olz)h0.D0;
        if (olz != null) {
            ((zlz)h0.E0).E0.removeCallbacks((Runnable)olz);
        }
        ((zlz)h0.E0).C0.u().R0.a(false);
        final xlz f0 = d0.F0;
        f0.a.g();
        if (f0.a.C0.h()) {
            Objects.requireNonNull(f0.a.C0.P0);
            f0.b(System.currentTimeMillis(), false);
        }
    }
}
