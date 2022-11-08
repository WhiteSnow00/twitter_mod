import android.widget.TextView;
import java.util.List;
import java.util.Objects;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eei implements sn6
{
    public qv C0;
    public final fei D0;
    public final kn E0;
    public final hsm<qv> F0;
    public final f7p G0;
    public final p1c H0;
    public final tll$a$b I0;
    
    public eei(final Intent intent, final fei d0, final kn e0, final hsm<qv> f0, final f7p g0, final p1c h0) {
        zzd.f((Object)d0, "advancedSearchViewDelegate");
        zzd.f((Object)e0, "finisher");
        zzd.f((Object)f0, "resultWriter");
        zzd.f((Object)g0, "scribeReporter");
        zzd.f((Object)h0, "geoPermissions");
        qv g2;
        if ((g2 = (qv)tkp.a(intent.getByteArrayExtra("extra_advanced_filters"), (alp)qv.f)) == null) {
            g2 = qv.g;
        }
        zzd.e((Object)g2, "ParcelUtils.getExtra(\n  \u2026ncedSearchFilters.DEFAULT");
        this.C0 = g2;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (tll$a$b)tll.Companion.b((sn6)this, d0.G0);
    }
    
    public final void a() {
        this.D0.L0.setChecked(this.C0.c);
        final List<String> d = this.C0.d;
        final boolean b = d == null || d.isEmpty();
        oyv a = null;
        if (!b) {
            final fei d2 = this.D0;
            final List<String> d3 = this.C0.d;
            zzd.c((Object)d3);
            d2.b(d3.get(0));
        }
        else {
            this.D0.b(null);
        }
        final fvj<Integer, String> e = this.C0.e;
        if (e != null) {
            final fei d4 = this.D0;
            final Object a2 = ((g2j)e).a;
            pf8.r(a2);
            zzd.e(a2, "it.first()");
            final int intValue = ((Number)a2).intValue();
            Objects.requireNonNull(d4);
            d4.T0 = qa8.Companion.a(intValue);
            ((TextView)d4.R0).setText((CharSequence)d4.E0.getString(intValue));
            a = oyv.a;
        }
        if (a == null) {
            final fei d5 = this.D0;
            final qa8 e2 = qa8.E0;
            Objects.requireNonNull(d5);
            d5.T0 = qa8.Companion.a(2131951943);
            ((TextView)d5.R0).setText((CharSequence)d5.E0.getString(2131951943));
        }
    }
    
    public final jn6 c() {
        return (jn6)this.I0;
    }
}
