import android.view.View$OnClickListener;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r62 implements ilx<s62, Object, r42>
{
    public final cnb D0;
    public final i42 E0;
    public final ifd F0;
    public final obi<?> G0;
    public final t62 H0;
    public final uor I0;
    public final nnl<Object> J0;
    
    public r62(final cnb d0, final i42 e0, final ifd f0, final obi<?> g0, final t62 h0, final uor i0) {
        czd.f((Object)e0, "bookmarkActionHandler");
        czd.f((Object)f0, "inAppMessageManager");
        czd.f((Object)g0, "navigator");
        czd.f((Object)h0, "bookmarksNotificationPresenter");
        czd.f((Object)i0, "subscriptionsFeatures");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (nnl<Object>)new nnl();
    }
    
    public final void T(final jbx jbx) {
        czd.f((Object)jbx, "state");
        if (this.D0.P().H("BookmarkTimelineFragment") == null) {
            final a a = new a(this.D0.P());
            a.e(2131429268, (Fragment)new p62(), "BookmarkTimelineFragment", 1);
            a.d();
        }
    }
    
    public final void q(final Object o) {
        final r42 r42 = (r42)o;
        czd.f((Object)r42, "effect");
        if (czd.a((Object)r42, (Object)r42.b.a)) {
            final pmg pmg = new pmg((Context)this.D0, 0);
            pmg.s(2131952462);
            pmg.m(2131952460);
            ((Dialog)pmg.n(17039360, (DialogInterface$OnClickListener)null).p(2131952461, (DialogInterface$OnClickListener)new nr2((Object)this, 2)).create()).show();
        }
        else if (czd.a((Object)r42, (Object)r42.a.a)) {
            if (this.I0.d()) {
                this.H0.b((s42)new s42.g(null, 1, null));
            }
            else {
                final w5s$a w5s$a = new w5s$a();
                w5s$a.e = this.H0.a();
                w5s$a.b = (View$OnClickListener)new j1p((Object)this, 4);
                w5s$a.s(2131959190);
                w5s$a.q(41);
                w5s$a.r("bookmark_removed");
                this.F0.a((dfd)((n4j)w5s$a).e());
            }
        }
    }
    
    public final h5j<Object> w() {
        return (h5j<Object>)this.J0;
    }
}
