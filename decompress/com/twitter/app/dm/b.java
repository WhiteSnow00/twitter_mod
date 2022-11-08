// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import android.content.Context;
import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

public final class b extends abv implements DMConversationSettingsPreferenceFragment$a
{
    public String W0;
    public jp7 X0;
    public final boolean Y0;
    public final boolean Z0;
    public final DMConversationSettingsPreferenceFragment a1;
    
    public b(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final pca<bo> pca2, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        final Bundle extras = intent.getExtras();
        final kk7 kk7 = new kk7(extras);
        this.Z0 = o48.g(kk7);
        this.Y0 = kk7.A();
        this.X0 = kk7.o();
        this.W0 = kk7.n();
        DMConversationSettingsPreferenceFragment a1;
        if ((a1 = (DMConversationSettingsPreferenceFragment)((x9)this).I4().H("tag")) == null) {
            a1 = new DMConversationSettingsPreferenceFragment();
            ((Fragment)a1).N1(extras);
            final a a2 = new a(((x9)this).I4());
            a2.e(2131429268, (Fragment)a1, "tag", 1);
            a2.c();
        }
        this.a1 = a1;
        f.i((b5j)z7x.l(), (u93)new dgk((Object)this, 7));
        f.i((b5j)z7x.o(), (u93)new jp3((Object)this, 7));
        ro.a((pca)pca2, 9, (u93)new en((Object)this, 6));
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        super.N2(fai, menu);
        fai.z(2131689487, menu);
        return true;
    }
    
    public final int d2(final fai fai) {
        final MenuItem item = fai.findItem(2131430013);
        pf8.r(item);
        item.setVisible(this.Z0 && this.Y0 && !dli.G(this.W0));
        return 2;
    }
    
    public final boolean q(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131430013) {
            final gob d0 = ((x9)this).D0;
            final Intent intent = new Intent((Context)((x9)this).D0, (Class)GroupInfoEditActivity.class);
            final Bundle w = zi.w("intent_type", 2);
            final jp7 x0 = this.X0;
            pf8.r(x0);
            yvj.k(w, "inbox_item", (Object)x0, (alp)jp7.w);
            final int a = w4j.a;
            d0.startActivityForResult(intent.putExtras(((zl1)new kk7(w)).a), 9);
            return true;
        }
        return super.q(menuItem);
    }
}
