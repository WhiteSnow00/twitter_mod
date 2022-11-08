import com.twitter.util.InvalidDataException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rxf extends e7x implements a, puf
{
    public final qxf H0;
    public final uxo I0;
    public final nuf J0;
    public final rd6 K0;
    
    public rxf(final z7x z7x, final qxf h0, final uxo i0, final nuf j0, final vxf vxf) {
        super(z7x);
        final rd6 k0 = new rd6();
        this.K0 = k0;
        this.J0 = j0;
        this.H0 = h0;
        h0.a = (qxf.a)this;
        this.I0 = i0;
        final b5j distinctUntilChanged = vxf.d().map((qtb)vqf.E0).distinctUntilChanged();
        Objects.requireNonNull(i0);
        k0.a(distinctUntilChanged.subscribe((fk6)new j0p((Object)i0, 8)));
        h0.a = (qxf.a)this;
    }
    
    @Override
    public final void I0(final d2r d2r) {
        Objects.requireNonNull(this.J0);
        if (dta.b().b("live_event_landing_page_show_score_card", true)) {
            this.I0.a(d2r);
        }
        else {
            this.I0.a.a(0);
        }
    }
    
    @Override
    public final void Y() {
        this.I0.a.a(0);
    }
    
    public final void e1(final ouf ouf) {
        final qxf h0 = this.H0;
        final bwf a = ouf.a;
        Objects.requireNonNull(h0);
        try {
            final qxf.a a2 = h0.a;
            final o1g f = a.f;
            if (f == null || (!"available".equals(f.a) || f.b == null)) {
                throw new InvalidDataException("Scores not present in stream");
            }
            final hph b = a.f.b;
            pf8.r(b);
            a2.I0((d2r)b);
        }
        catch (final InvalidDataException ex) {
            h0.a.Y();
        }
    }
    
    @Override
    public final void w1() {
        this.K0.e();
    }
}
