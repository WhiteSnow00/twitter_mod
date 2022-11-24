import java.util.Objects;
import tv.periscope.model.b;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r5k extends sl8
{
    public final Resources G0;
    public final tl2 H0;
    public final fci<?> I0;
    public final pac J0;
    public final oys K0;
    public final cwf L0;
    public final e39 M0;
    public final int N0;
    public final int O0;
    
    public r5k(final Resources g0, final tl2 h0, final fci<?> i0, final pac j0, final oys k0) {
        final qac qac = (qac)j0;
        super(qac.F0);
        this.M0 = new e39();
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = new cwf(k0.f(), "BroadcastCard");
        this.N0 = b1b.B(qac.F0.getContext(), 2130969093);
        this.O0 = g0.getColor(2131099729);
    }
    
    public final void l0(final b b) {
        ((qac)this.J0).k(b.c0());
        ((qac)this.J0).m(b.i0());
        final pac j0 = this.J0;
        String y;
        if ((y = b.y()) == null) {
            y = "";
        }
        ((qac)j0).o(new hpj(y, beq.c));
        final qac qac = (qac)this.J0;
        Objects.requireNonNull(qac);
        qac.H0.setVisibility(0);
        o9a.E(qac.J0, (CharSequence)null);
        qac.I0.setImageResource(2131231665);
        qac.I0.setVisibility(0);
    }
}
