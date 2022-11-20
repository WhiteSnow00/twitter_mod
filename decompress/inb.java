import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.app.common.inject.view.ViewObjectGraph;
import java.util.Objects;
import android.app.Activity;
import com.twitter.app.common.inject.view.ViewObjectGraph$a;
import java.util.UUID;
import com.twitter.app.common.inject.retained.RetainedObjectGraph$a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inb<F extends Fragment & qcc & haf & ndc & jtm> extends x9<F>
{
    public Bundle G0;
    
    public inb(final cpo cpo) {
        super(cpo);
    }
    
    public final RetainedObjectGraph$a c(final RetainedObjectGraph$a retainedObjectGraph$a, final Bundle bundle, final qcc qcc) {
        final Fragment fragment = (Fragment)qcc;
        czd.f((Object)fragment, "fragment");
        final UUID randomUUID = UUID.randomUUID();
        ((jtm)fragment).v("retainer_id", randomUUID);
        retainedObjectGraph$a.e(randomUUID).d(new etm(fragment)).c(bundle).a((r8x)new u8x());
        return retainedObjectGraph$a;
    }
    
    public final ViewObjectGraph$a d(ViewObjectGraph$a a, final Bundle bundle, final qcc qcc) {
        final Fragment fragment = (Fragment)qcc;
        czd.f((Object)fragment, "fragment");
        final mnb n0 = ((ucc)fragment).n0();
        czd.f((Object)n0, "<this>");
        final u8x u8x = new u8x();
        final w19 w19 = new w19();
        w19.c(((caf)n0).a().subscribe((lj6)new tt1((qsb)new v8x(u8x, w19), 4)));
        w1e.d((caf)u8x, (yaa)((cj8)((co1)this.o()).B((Class)cj8.class)).i());
        final cnb l0 = fragment.L0();
        czd.c((Object)l0);
        a = a.e((Activity)l0).d(fragment).c(bundle).a((r8x)u8x);
        czd.e((Object)a, "builder\n            .set\u2026wLifecycle(viewLifecycle)");
        return a;
    }
    
    public final void e(final F n, final jtm jtm, final Bundle bundle) {
        czd.f((Object)n, "injectedFragment");
        czd.f((Object)jtm, "retainer");
        this.a((qcc)n, jtm, bundle);
        final mnb n2 = ((ucc)n).n0();
        final wc6 wc6 = new wc6();
        wc6.d(new t19[] { n2.z().subscribe((lj6)new ebk((qsb)new qsb<vij, fzv>(this, n) {
                public final inb<F> D0;
                public final F E0;
                
                public final Object invoke(final Object o) {
                    final vij vij = (vij)o;
                    final inb<F> d0 = this.D0;
                    final Fragment & qcc & haf & ndc & jtm fragment = this.E0;
                    Bundle bundle;
                    if ((bundle = vij.E0) == null) {
                        bundle = d0.G0;
                    }
                    d0.b((qcc)fragment, bundle);
                    return fzv.a;
                }
            }, 9)), n2.c().subscribe((lj6)new st1((qsb)new qsb<rij, fzv>(this) {
                public final inb<F> D0;
                
                public final Object invoke(final Object o) {
                    this.D0.G0 = ((rij)o).E0;
                    return fzv.a;
                }
            }, 4)), n2.t().subscribe((lj6)new tt1((qsb)new qsb<wij, fzv>(this) {
                public final inb<F> D0;
                
                public final Object invoke(final Object o) {
                    final wij wij = (wij)o;
                    final inb<F> d0 = this.D0;
                    Objects.requireNonNull(d0);
                    cj1.f();
                    final ViewObjectGraph f0 = d0.F0;
                    if (f0 != null) {
                        nza.J1((co1)f0);
                    }
                    d0.F0 = null;
                    return fzv.a;
                }
            }, 3)), n2.b().subscribe((lj6)new sma((qsb)new qsb<mij, fzv>(this, wc6) {
                public final inb<F> D0;
                public final wc6 E0;
                
                public final Object invoke(final Object o) {
                    final boolean b = ((Activity)((mij)o).D0.H1()).isChangingConfigurations() ^ true;
                    if (b) {
                        ((u8x)((cj8)this.D0.t0((Class)cj8.class)).i()).D();
                    }
                    final inb<F> d0 = this.D0;
                    Objects.requireNonNull(d0);
                    cj1.f();
                    if (b) {
                        final RetainedObjectGraph e0 = d0.E0;
                        if (e0 != null) {
                            nza.J1((co1)e0);
                        }
                    }
                    d0.E0 = null;
                    this.E0.dispose();
                    return fzv.a;
                }
            }, 8)) });
    }
}
