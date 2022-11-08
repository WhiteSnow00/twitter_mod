// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Objects;

public final class c extends acv<lt6> implements gai
{
    public final t9j<or> b1;
    public final xn6<c7l, agl> c1;
    public final DMGroupParticipantsListController d1;
    public final String e1;
    public final int f1;
    public int g1;
    public boolean h1;
    
    public c(final ybv ybv, final pca<p4h> pca, final g3g g3g, final p9s p9s, final mbi<?> mbi, final pca<bo> pca2) {
        super(ybv);
        final kl7 kl7 = new kl7(((Fragment)super.D0).I0);
        final int c = kl7.C();
        this.f1 = c;
        if (c == 1) {
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { "messages:remove_participants:::impression" });
            saw.b((okm)zf4);
        }
        Objects.requireNonNull(agl.Companion);
        final xn6<zm, agl> h = mbi.h(agl.class, new zfl());
        this.c1 = (xn6<c7l, agl>)h;
        this.d1 = new DMGroupParticipantsListController(this.r0(), super.E0, g3g, super.X0.H0, ybv.q, kl7, (DMGroupParticipantsListController$a)new c$a(this));
        f.i(h.c().filter((ptk)g1r.Q0), (u93)new wr2((Object)this, 10));
        f.i(pca2.v0(), (u93)new dgk((Object)this, 8));
        this.e1 = ((kk7)kl7).n();
        final t9j a = p9s.a((Class)or.class);
        this.b1 = (t9j<or>)a;
        f.j(a.a(), (u93)new jp3((Object)this, 9), (raa)super.O0);
        f.i(xd.H((pca)pca, (Class)p4h.a.class), (u93)new en((Object)this, 8));
    }
    
    public static void e1(final MenuItem menuItem, final boolean visible) {
        if (menuItem != null) {
            menuItem.setVisible(visible);
        }
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        fai.z(2131689489, menu);
        return true;
    }
    
    @Override
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        final DMGroupParticipantsListController d1 = this.d1;
        pf8.r(d1);
        Objects.requireNonNull(d1);
        ((n8r)new DMGroupParticipantsListController$SavedState(d1)).saveToBundle(bundle);
    }
    
    public final void d1() {
        final jp7 o = ((kk7)new kl7(((Fragment)super.D0).I0)).o();
        final fai f = super.T0.f();
        pf8.r(f);
        final MenuItem item = f.findItem(2131429997);
        final MenuItem item2 = f.findItem(2131429995);
        final MenuItem item3 = f.findItem(2131429998);
        if (o48.a(o, this.g1)) {
            e1(item2, this.h1 ^ true);
            e1(item, this.h1);
        }
        e1(item3, this.h1);
    }
    
    public final int d2(final fai fai) {
        return 2;
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "dm_participants";
        lcv$b.c = 2131624316;
        return lcv$b;
    }
    
    @Override
    public final boolean q(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (itemId == 2131429995 || itemId == 2131429997) {
            final DMGroupParticipantsListController d1 = this.d1;
            pf8.r(d1);
            ((c$a)d1.g).a.C0.startActivityForResult(new Intent(d1.c, (Class)DMAddParticipantsActivity.class).putExtra("preselected_items", d1.b), 1);
            return true;
        }
        if (itemId == 2131429998) {
            final DMGroupParticipantsListController d2 = this.d1;
            pf8.r(d2);
            Objects.requireNonNull(d2);
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { "messages:view_participants:nav_bar:remove_members:click" });
            saw.b((okm)zf4);
            final DMGroupParticipantsListController$a g = d2.g;
            final Intent intent = new Intent(d2.c, (Class)DMViewGroupParticipantsActivity.class);
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("intent_type", 2);
            ((BaseBundle)bundle).putInt("list_type", 1);
            ((BaseBundle)bundle).putString("conversation_id", d2.i);
            final int a = w4j.a;
            ((c$a)g).a.r0().startActivity(intent.putExtras(((zl1)new kl7(bundle)).a));
            return true;
        }
        return false;
    }
}
