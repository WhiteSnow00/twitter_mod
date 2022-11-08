import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.app.collabs.search.CollaboratorsSearchViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ro4 extends u66
{
    public final CollaboratorsSearchViewModel E0;
    public final mp4 F0;
    
    public ro4(final e76 e76, final CollaboratorsSearchViewModel e77, final mp4 f0) {
        zzd.f((Object)e76, "composeDependencies");
        zzd.f((Object)e77, "viewModel");
        zzd.f((Object)f0, "effectHandler");
        super(e76);
        this.E0 = e77;
        this.F0 = f0;
    }
    
    public final void a(final m76 m76, final int n) {
        final m76 h = m76.h(-1753003564);
        final ea6$b a = ea6.a;
        final mp4 f0 = this.F0;
        final CollaboratorsSearchViewModel e0 = this.E0;
        h.x(-2088733469);
        final ro4$a ro4$a = new ro4$a((Object)f0);
        h.x(1941511575);
        h.x(-301010798);
        final Object y = af.y(h, 773894976, -492369756);
        Objects.requireNonNull(m76.Companion);
        Object d = y;
        if (y == m76$a.b) {
            d = rb0.d(jgw.A(h), h);
        }
        h.O();
        final yy6 c0 = ((ue6)d).C0;
        h.O();
        jgw.g((Object)e0, (Object)c0, (gub)new ro4$b((MviViewModel)e0, c0, nkz.v((Object)ro4$a, h), (ap6)null), h);
        h.O();
        h.O();
        h.O();
        ep4.d((jkh)null, (CollaboratorsSearchViewModel)null, h, 0, 3);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new ro4$c(this, n));
        }
    }
}
