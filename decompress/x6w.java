import com.twitter.media.ui.image.c;
import android.view.View;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton$a;
import com.twitter.media.ui.image.b$a;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x6w implements wrk, v7x
{
    public final r6w D0;
    public final obi<?> E0;
    public final as3 F0;
    public final vxs G0;
    public final hkf H0;
    public final k2p I0;
    public final yaa<kjf> J0;
    public final ifd K0;
    public final qkq L0;
    public boolean M0;
    public int N0;
    
    public x6w(final r6w d0, final obi<?> e0, final as3 f0, final l2p l2p, final vxs g0, final hkf h0, final yaa<kjf> j0, final ifd k0, final qkq l0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = l2p.f(Boolean.TRUE);
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    public final void a(final fsv fsv, final int n, final cgv cgv) {
        final scv k = fsv.k;
        final String n2 = k.N0;
        final gfv$a gfv$a = new gfv$a();
        gfv$a.c = 11;
        gfv$a.a = k.J0;
        final gfv gfv = (gfv)((n4j)gfv$a).e();
        this.H0.f = (hkf$b)new hkf$b(this) {
            public final x6w a;
            
            public final void a() {
                final ifd k0 = this.a.K0;
                final w5s$a w5s$a = new w5s$a();
                w5s$a.s(2131954686);
                w5s$a.e = (red$c)red$c$c.b;
                w5s$a.r("level_up_error");
                k0.a((dfd)((n4j)w5s$a).e());
            }
            
            public final void b() {
                final ifd k0 = this.a.K0;
                final w5s$a w5s$a = new w5s$a();
                w5s$a.s(2131954684);
                w5s$a.e = (red$c)red$c$c.b;
                w5s$a.r("level_up_pinned");
                k0.a((dfd)((n4j)w5s$a).e());
            }
        };
        final t6w t6w = (t6w)this.D0;
        Objects.requireNonNull(t6w);
        if (k.a() != null) {
            final xh1 a = k.a();
            ((c)t6w.E0).setCroppingRectangleProvider((b$a)new s6w(t6w, a));
            final FrescoMediaImageView e0 = t6w.E0;
            final soj a2 = a.a();
            ((c)e0).p(y7d.d(a2.a, a2.b, (k6w)null));
        }
        else {
            final String q0 = k.Q0;
            if (q0 != null) {
                ((c)t6w.E0).p(new x7d$a(q0, (jvg)null));
            }
        }
        ((t6w)this.D0).F0.setText((CharSequence)n2);
        final r6w d0 = this.D0;
        final String p3 = k.P0;
        final t6w t6w2 = (t6w)d0;
        Objects.requireNonNull(t6w2);
        if (asa.b().b("android_channel_discovery_description_enabled", false)) {
            v68.P(t6w2.K0, p3);
        }
        else {
            ((View)t6w2.K0).setVisibility(8);
        }
        final Boolean g0 = k.G0;
        if (g0 != null && cgv != null) {
            final r6w d2 = this.D0;
            final boolean booleanValue = g0;
            final View n3 = ((t6w)d2).N0;
            int visibility;
            if (booleanValue) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            n3.setVisibility(visibility);
        }
        final r6w d3 = this.D0;
        final boolean f0 = k.F0;
        final ImageView o0 = ((t6w)d3).O0;
        int visibility2;
        if (f0) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)o0).setVisibility(visibility2);
        ((t6w)this.D0).a(n2, fsv.k.D0);
        ((t6w)this.D0).I0.setOnToggleInterceptListener((ToggleTwitterButton$a)new v6w(this, n2, fsv, gfv, k));
        ((View)((t6w)this.D0).P0).setOnClickListener((View$OnClickListener)new mgk((Object)this, (Object)fsv, 2));
        final t6w t6w3 = (t6w)this.D0;
        if (n != 2) {
            if (n != 3) {
                ((View)t6w3.P0).setVisibility(8);
                ((View)t6w3.I0).setVisibility(8);
            }
            else {
                ((View)t6w3.I0).setVisibility(0);
                ((View)t6w3.P0).setVisibility(8);
            }
        }
        else {
            ((View)t6w3.I0).setVisibility(8);
            ((View)t6w3.P0).setVisibility(0);
        }
        if (n == 2) {
            ((t6w)this.D0).b(fsv.k.c());
        }
        if (((cxs)fsv).k() && !((cxs)fsv).c().s.isEmpty()) {
            final r6w d4 = this.D0;
            final k2p i0 = this.I0;
            final t6w t6w4 = (t6w)d4;
            t6w4.L0.setVisibility(0);
            ((View)t6w4.M0.g()).setOnClickListener((View$OnClickListener)i0);
            ((View)t6w4.M0.f()).setTag(2131432056, (Object)fsv);
            ((View)t6w4.M0.f()).setTag(2131429106, (Object)((cxs)fsv).c().s);
        }
        else {
            final t6w t6w5 = (t6w)this.D0;
            t6w5.L0.setVisibility(8);
            t6w5.M0.k(8);
        }
    }
    
    public final void c(final fsv fsv, final cgv cgv, final cgv cgv2) {
        final scv k = fsv.k;
        final Boolean g0 = k.G0;
        if (g0 != null) {
            this.M0 = g0;
        }
        final t6w t6w = (t6w)this.D0;
        t6w.H0.setContentSize(t6w.Q0.b);
        t6w.H0.f(cgv.c(), ikr.l(cgv.K0), (String)null, cgv.N0 || (cgv.h() != null && cgv.h()), cgv.M0);
        ((View)t6w.H0).setContentDescription((CharSequence)t6w.J0.getString(2131952407, new Object[] { cgv.c(), ikr.l(cgv.K0) }));
        t6w.G0.H(cgv);
        ((t6w)this.D0).D0.setOnClickListener((View$OnClickListener)new u6w((Object)this, (Object)fsv, (Object)k, (Object)cgv2, (Object)cgv, 0));
    }
    
    public final View getHeldView() {
        return ((t6w)this.D0).D0;
    }
    
    public final void l(final int n0) {
        this.N0 = n0;
    }
}
