import com.twitter.media.ui.image.AspectRatioFrameLayout;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.util.InvalidDataException;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrf implements a, ij3, g81, nm2$c, xtf$a, f0g$a
{
    public final mrf.mrf$b D0;
    public mrf.mrf$a E0;
    public final req F0;
    public final nm2 G0;
    public final xtf H0;
    public final f0g I0;
    public final hrf J0;
    public final brf K0;
    
    public mrf(final mrf.mrf$b d0, final brf k0, final req f0, final nm2 g0, final hrf j0, final xtf h0, final f0g i0) {
        this.E0 = (mrf.mrf$a)gw8.E0;
        this.D0 = d0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        g0.I0 = (nm2$c)this;
        h0.c = (xtf$a)this;
        i0.c = (f0g$a)this;
        this.K0 = k0;
        k0.h = (brf.a)this;
        final krf krf = new krf((Object)this, 0);
        g0.J0 = (View$OnClickListener)krf;
        d0.a.setOnClickListener((View$OnClickListener)krf);
    }
    
    @Override
    public final void b(final jqf jqf) {
        final int a = this.J0.a(jqf);
        if (a != 1) {
            if (a != 2) {
                this.q();
            }
            else {
                final brf k0 = this.K0;
                k0.h.m();
                final String x = jqf.x;
                if (x == null) {
                    m8a.d((Throwable)new InvalidDataException("TweetMedia event card did not provide a valid tweet id"));
                }
                else {
                    final h5j x2 = k0.e.x2(Long.parseLong(x));
                    final w19 c = k0.c;
                    final ynj b = ynj.b;
                    final int a2 = c5j.a;
                    c.c(((kog)new hpg((ppg)new yog((lcq)x2.single((Object)b).I(k0.f).y(k0.g), (ytk)f71.Q0), (psb)arf.E0)).p((lj6)new lds((Object)k0, (Object)jqf, 2), (lj6)new a1p((Object)k0, 5), (oj)jub.c));
                }
            }
        }
        else {
            this.F0.a();
            this.H0.a();
            this.I0.a();
            this.G0.show();
        }
    }
    
    public final void c() {
        this.r();
    }
    
    public final void d() {
        this.r();
    }
    
    @Override
    public final void e(final bzf bzf) {
        this.F0.a();
        this.G0.a();
        this.I0.a();
        final xtf h0 = this.H0;
        final ViewGroup$LayoutParams layoutParams = ((View)h0.a.F0).getLayoutParams();
        final int a = c5j.a;
        ((LinearLayout$LayoutParams)layoutParams).gravity = 1;
        final mxw g = ((wyf)bzf).g(h0.b, (View$OnClickListener)new vtf(h0, 0));
        ((AspectRatioFrameLayout)h0.a.F0).setAspectRatio(g.f.d());
        h0.a.E0.setVideoContainerConfig(g);
        final y1 eventDispatcher = h0.a.E0.getEventDispatcher();
        if (eventDispatcher != null) {
            eventDispatcher.g((f2)new nnk((nnk$a)new wtf(h0)));
        }
        ((View)this.H0.a.F0).setVisibility(0);
    }
    
    public final void f() {
        this.r();
    }
    
    @Override
    public final void g(final bzf bzf) {
        this.F0.a();
        this.G0.a();
        this.H0.a();
        final f0g i0 = this.I0;
        final ViewGroup$LayoutParams layoutParams = ((View)i0.a.F0).getLayoutParams();
        final int a = c5j.a;
        ((LinearLayout$LayoutParams)layoutParams).gravity = 1;
        final mxw g = ((wyf)bzf).g(i0.b, (View$OnClickListener)new k1p((Object)i0, 3));
        ((AspectRatioFrameLayout)i0.a.F0).setAspectRatio(g.f.d());
        i0.a.E0.setVideoContainerConfig(g);
        final y1 eventDispatcher = i0.a.E0.getEventDispatcher();
        if (eventDispatcher != null) {
            eventDispatcher.g((f2)new nnk((nnk$a)new e0g(i0)));
        }
        ((View)this.I0.a.F0).setVisibility(0);
    }
    
    public final e81 getAutoPlayableItem() {
        return this.G0.getAutoPlayableItem();
    }
    
    public final boolean h() {
        return true;
    }
    
    public final void i() {
        this.q();
    }
    
    public final void j() {
        final brf k0 = this.K0;
        k0.b.a();
        k0.c.a();
    }
    
    public final void k() {
        final brf k0 = this.K0;
        k0.b.a();
        k0.c.a();
    }
    
    public final void l(final m9i m9i) {
        final brf k0 = this.K0;
        final w19 b = k0.b;
        final mv1 d0 = ((wgm)k0.a).D0;
        final brf.a h = k0.h;
        Objects.requireNonNull(h);
        b.c(((h5j)d0).subscribe((lj6)new vgd(h, 2), (lj6)wgd.G0));
    }
    
    @Override
    public final void m() {
        this.q();
    }
    
    public final void n() {
        this.E0.k1();
    }
    
    public final void o() {
        this.r();
    }
    
    public final void p() {
        this.E0.k1();
    }
    
    public final void q() {
        this.G0.a();
        this.H0.a();
        this.I0.a();
        this.F0.c();
    }
    
    public final void r() {
        this.G0.a();
        this.H0.a();
        this.I0.a();
        this.F0.c();
    }
}
