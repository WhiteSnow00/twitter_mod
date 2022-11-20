import android.content.DialogInterface;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ufj implements DialogInterface$OnClickListener
{
    public final adw D0;
    public final Context E0;
    public final vfj F0;
    
    public ufj(final adw d0, final Context e0, final vfj f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final adw d0 = this.D0;
        final Context e0 = this.E0;
        final vfj f0 = this.F0;
        final vfj$a companion = vfj.Companion;
        czd.f((Object)d0, "$userInfo");
        czd.f((Object)e0, "$context");
        czd.f((Object)f0, "this$0");
        d0.m((ryt<ziw$a, ziw$a>)fv.c);
        final ejw v = ejw.v(e0, d0);
        v.q("use_cookie_personalization", false);
        trc.c().f((orc)((n4j)v).e());
        final ziw a = d0.A();
        czd.e((Object)a, "userInfo.userSettings");
        f0.h2(a);
        vfj.Companion.b("cookies_personalization", d0.A().h);
    }
}
