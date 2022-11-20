import android.view.MenuItem;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import android.view.Menu;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$g;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$l;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.navigation.safety.MutedKeywordResult;
import com.twitter.navigation.safety.MuteKeywordComposerContentViewArgs;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixh extends vbv implements lxh
{
    public final kxh X0;
    public final owh Y0;
    public final p Z0;
    public final ss2 a1;
    public final ifd b1;
    public final dn6<MuteKeywordComposerContentViewArgs, MutedKeywordResult> c1;
    public final r8x d1;
    
    public ixh(final Intent intent, final r8x d1, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final kxh x0, final p z0, final zwh zwh, final ss2 a1, final ifd b1, final o5w o5w, final t8p t8p) {
        super(intent, d1, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = x0;
        this.a1 = a1;
        this.Z0 = z0;
        this.b1 = b1;
        this.d1 = d1;
        final View d2 = zwh.D0;
        ((u9)this).R4(d2);
        final RecyclerView e0 = zwh.E0;
        e0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        e0.h((RecyclerView$l)new jxh(krm.Companion.a((Activity)cnb).j(2131232707)));
        e0.setItemAnimator((RecyclerView$j)new g());
        final oxm b2 = nym.b(new String[] { ((Context)cnb).getString(2131954547) }, ((Context)cnb).getString(2131955287));
        final i2a$d i2a$d = new i2a$d();
        i2a$d.b();
        final g2a$a g2a$a = new g2a$a();
        g2a$a.h = r2a.S0;
        final nw6 a2 = tes.a;
        g2a$a.a = (tes)new dkr(2131955285);
        g2a$a.b = (tes)new qxm(b2);
        i2a$d.c = new i2a$e((g2a)((n4j)g2a$a).e());
        final i2a i2a = new i2a((Context)cnb, o5w, i2a$d, d2);
        i2a.b(true);
        final View h0 = i2a.H0;
        final owh g0 = zwh.G0;
        this.Y0 = g0;
        if (h0 != null) {
            ((RecyclerView$e)g0).y((RecyclerView$g)new q6m(e0, h0));
        }
        g0.H0 = (owh$a)new ixh$a(this);
        e0.setAdapter((RecyclerView$e)g0);
        x0.d = (lxh)this;
        final dn6 a3 = obi.a((Class)MutedKeywordResult.class);
        this.c1 = (dn6<MuteKeywordComposerContentViewArgs, MutedKeywordResult>)a3;
        f.i(a3.c(), (n93)new jgk((Object)this, 15));
        ((View)zwh.F0).setOnClickListener((View$OnClickListener)new fpf(this, 10));
        f.i(d1.k(), (n93)new dn((Object)this, 16));
    }
    
    public final boolean N2(hai f, final Menu menu) {
        super.N2(f, menu);
        final ss2 a1 = this.a1;
        final bai f2 = ((u9)this).F4();
        a1.K0 = f2;
        f = f2.f();
        jee.l((Object)f);
        f.z(2131689491, menu);
        return true;
    }
    
    public final void N4() {
        this.X0.d = null;
    }
    
    public final void W4(final mwh mwh) {
        Objects.requireNonNull(this.Y0);
    }
    
    public final void X4(final List<pwh> g0) {
        final owh y0 = this.Y0;
        y0.G0 = g0;
        for (final pwh pwh : g0) {
            if (pwh instanceof xwh && ((xwh)pwh).b) {
                y0.I0 = true;
                break;
            }
        }
        ((RecyclerView$e)y0).f();
    }
    
    public final void Y4(final int n, final mwh mwh, final int n2, final String s) {
        this.W4(mwh);
        final String string = ((gml$a$b)((u9)this).c()).E0.getContext().getString(n, new Object[] { mwh.c.trim() });
        final w5s$a w5s$a = new w5s$a();
        w5s$a.e = (red$c)red$c$c.b;
        w5s$a.t(string);
        w5s$a.q(n2);
        w5s$a.r(s);
        this.b1.a((dfd)((n4j)w5s$a).e());
    }
    
    public final int d2(final hai hai) {
        final ss2 a1 = this.a1;
        Objects.requireNonNull(a1);
        final MenuItem item = hai.findItem(2131428856);
        jee.l((Object)item);
        item.setVisible(((List)a1.E0.c).isEmpty() ^ true);
        return 2;
    }
    
    public final boolean n(final MenuItem menuItem) {
        final ss2 a1 = this.a1;
        Objects.requireNonNull(a1);
        final int itemId = menuItem.getItemId();
        final boolean b = true;
        boolean b2;
        if (itemId == 2131428856) {
            a1.g();
            final vk j0 = a1.J0;
            if (j0 != null) {
                j0.n(2131957528);
            }
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3 = b;
        if (!b2) {
            b3 = (super.n(menuItem) && b);
        }
        return b3;
    }
}
