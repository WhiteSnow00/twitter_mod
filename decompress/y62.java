import android.view.View$OnClickListener;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y62 implements okx<z62, Object, y42>
{
    public final gob C0;
    public final o42 D0;
    public final egd E0;
    public final mbi<?> F0;
    public final a72 G0;
    public final cor H0;
    public final zml<Object> I0;
    
    public y62(final gob c0, final o42 d0, final egd e0, final mbi<?> f0, final a72 g0, final cor h0) {
        zzd.f((Object)d0, "bookmarkActionHandler");
        zzd.f((Object)e0, "inAppMessageManager");
        zzd.f((Object)f0, "navigator");
        zzd.f((Object)g0, "bookmarksNotificationPresenter");
        zzd.f((Object)h0, "subscriptionsFeatures");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (zml<Object>)new zml();
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
        if (this.C0.Q().H("BookmarkTimelineFragment") == null) {
            final a a = new a(this.C0.Q());
            a.e(2131429268, (Fragment)new w62(), "BookmarkTimelineFragment", 1);
            a.d();
        }
    }
    
    public final void s(final Object o) {
        final y42 y42 = (y42)o;
        zzd.f((Object)y42, "effect");
        if (zzd.a((Object)y42, (Object)y42.b.a)) {
            final qmg qmg = new qmg((Context)this.C0, 0);
            qmg.s(2131952463);
            qmg.m(2131952461);
            ((Dialog)qmg.n(17039360, (DialogInterface$OnClickListener)null).p(2131952462, (DialogInterface$OnClickListener)new idm((Object)this, 1)).create()).show();
        }
        else if (zzd.a((Object)y42, (Object)y42$a.a)) {
            if (this.H0.d()) {
                this.G0.b(new z42.g(null, 1, null));
            }
            else {
                final d5s$a d5s$a = new d5s$a();
                d5s$a.e = this.G0.a();
                d5s$a.b = (View$OnClickListener)new kuf((Object)this, 8);
                d5s$a.s(2131959188);
                d5s$a.q(41);
                d5s$a.r("bookmark_removed");
                this.E0.a((zfd)((h4j)d5s$a).e());
            }
        }
    }
    
    public final b5j<Object> x() {
        return (b5j<Object>)this.I0;
    }
}
