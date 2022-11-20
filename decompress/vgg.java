import com.twitter.app.common.account.AppAccountManager;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.appbar.AppBarLayout$c;
import java.util.Objects;
import java.util.List;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.Toolbar;
import com.twitter.app.common.account.d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vgg implements n93
{
    public final chg a;
    public final pwe b;
    public final adw c;
    public final xbm d;
    public final mgv e;
    public final rvu f;
    public final d g;
    public final xba h;
    
    public vgg(final chg a, final pwe b, final adw c, final xbm d, final mgv e, final rvu f, final d g, final xba h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a(final Object o) {
        final chg a = this.a;
        final pwe b = this.b;
        final adw c = this.c;
        final xbm d = this.d;
        final mgv e = this.e;
        final rvu f = this.f;
        final d g = this.g;
        final xba h = this.h;
        final tmi tmi = (tmi)o;
        final whg whg = (whg)a.M1.get();
        final TabLayout u1 = a.u1;
        final ufg b2 = a.b1;
        if (whg.K0 != b2) {
            whg.K0 = (osj)b2;
        }
        if (whg.L0 != u1) {
            whg.L0 = u1;
        }
        final ViewGroup j = ((u9)a).F4().j();
        jee.l((Object)j);
        final int a2 = c5j.a;
        final Toolbar toolbar = (Toolbar)j;
        ((View)toolbar).setOnClickListener((View$OnClickListener)new m0x((Object)a, 11));
        final yfg yfg = (yfg)b.get();
        ((osj)yfg.b).z((List)null);
        List<wfg> list = yfg.e.b();
        if (list.isEmpty()) {
            list = yfg.c.a();
        }
        final egg d2 = yfg.d;
        Objects.requireNonNull(d2);
        ((osj)yfg.b).p(new s4e((Iterable)list, (jtb)new vkf(d2, 2)).s3());
        yfg.a();
        final int a3 = ((AppBarLayout$c)((View)toolbar).getLayoutParams()).a;
        a.c2 = a3;
        a.d2 = a3;
        f.i(a.n1.c(), (n93)new csf((Object)a, 12));
        f.j((h5j)c.e(), (n93)new tgg(a, 1), (z9a)d);
        f.j(e.p(), (n93)new ejl((Object)a, 7), (z9a)d);
        f.j(f.a().filter((ytk)i71.N0).observeOn(gmw.H()), (n93)new sgg(a, 1), (z9a)d);
        f.j((h5j)((AppAccountManager)g).f, (n93)new rgg(a, 1), (z9a)d);
        f.j(h.v0(), (n93)new ugg(a, 1), (z9a)d);
    }
}
