import android.os.BaseBundle;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import java.util.concurrent.Callable;
import android.graphics.Bitmap;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class he3 implements fe3
{
    public final hlc F0;
    public final duo G0;
    public final ke3 H0;
    public final cyw$a I0;
    public final e39 J0;
    public final e39 K0;
    public final e39 L0;
    public final e39 M0;
    public final long N0;
    public final int O0;
    public final k9x P0;
    
    public he3(final hlc f0, final duo g0, final ke3 h0, final cyw$a i0, final UserIdentifier userIdentifier, final int o0, final k9x p7) {
        this.J0 = new e39();
        this.K0 = new e39();
        this.L0 = new e39();
        this.M0 = new e39();
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.N0 = userIdentifier.getId();
        this.O0 = o0;
        this.P0 = p7;
    }
    
    public final void B0(final Bitmap bitmap) {
        this.H0.t1(bitmap);
        this.H0.h0();
    }
    
    public final void a() {
        this.H0.a();
        this.H0.D0();
        this.H0.M0();
        ((m81)this.H0).getAutoPlayableItem().a1();
        this.H0.P0().d();
        this.H0.l1();
        this.J0.a();
        this.L0.a();
    }
    
    public final void b0(final Bitmap bitmap) {
        this.H0.t1(bitmap);
        this.H0.h0();
        this.H0.D0();
        this.J0.c(t5j.fromCallable((Callable)new ge3((Object)bitmap, 0)).subscribe((rk6)new lem((Object)this, 27)));
    }
    
    public final void b3(final dwg dwg) {
        final e2h j0 = e2h.J0;
        final e2h c = dwg.c;
        if (j0 == c) {
            if (!this.H0.Q0()) {
                this.H0.h0();
                final ke3 h0 = this.H0;
                final int a = o5j.a;
                h0.Z0((j7d)dwg);
            }
        }
        else {
            if (e2h.L0 != c) {
                final StringBuilder f = ehk.f("Can't preview media file with type ");
                f.append(dwg.c);
                throw new IllegalStateException(f.toString());
            }
            this.H0.u0();
            final VideoContainerHost p = this.H0.P0();
            final cyw$a i0 = this.I0;
            Object c2;
            if (this.H0.u()) {
                c2 = r1n.S0;
            }
            else {
                c2 = r1n.T0;
            }
            i0.c = (ulk)c2;
            i0.a = (h1)new nb3(dwg, this.N0);
            i0.d = (j7x)k7x.j;
            i0.f = (fv0)new fv0$a(dwg.b.h());
            i0.l = false;
            p.setVideoContainerConfig((cyw)((z4j)i0).e());
            this.H0.P0().getEventDispatcher().g((d2)new rok((rok$a)new he3$b(this)));
            lp7.t((Class)he3.class, "startAutoPlay");
            ((m81)this.H0).getAutoPlayableItem().j1();
        }
    }
    
    public final void bind() {
        this.G0.a((gto<?>)new tt2(this) {
            public final he3 F0;
            
            public final void a(final Bundle bundle) {
                bundle.putBoolean("muted", this.F0.H0.u());
                ((BaseBundle)bundle).putInt("background_color", this.F0.H0.g0());
            }
            
            public final void v(final Parcelable parcelable) {
                final Bundle bundle = (Bundle)parcelable;
                this.F0.H0.setMuted(bundle.getBoolean("muted"));
                this.F0.H0.setBackgroundColor(((BaseBundle)bundle).getInt("background_color"));
            }
        });
        this.K0.c(this.H0.j0().subscribe((rk6)new kd1((Object)this, 20)));
        this.M0.c(this.P0.l().subscribe((rk6)new ppa(this, 15)));
    }
    
    public final void show() {
        this.H0.show();
    }
    
    public final void unbind() {
        this.J0.a();
        this.K0.a();
        this.L0.a();
        this.M0.a();
    }
}
