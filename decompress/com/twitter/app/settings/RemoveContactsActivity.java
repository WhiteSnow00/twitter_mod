// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.app.Dialog;

public class RemoveContactsActivity extends vmd implements xv8, uv8
{
    public static final int o1 = 0;
    
    public final void k0(final Dialog dialog, int a, final int n) {
        if (n == -1) {
            final UserIdentifier m1 = ((ul1)this).m1;
            i1g.a(m1).e(0);
            final af4 af4 = new af4();
            ((u0p)af4).q(new String[] { "settings:contacts:live_sync::off" });
            cbw.b((elm)af4);
            final af4 af5 = new af4();
            ((u0p)af5).q(new String[] { "settings:contacts:destroy_contacts::click" });
            cbw.b((elm)af5);
            a = fk6.a;
            final gk6 a2 = gk6.Companion.a();
            a2.d(m1, (qsb)new vvs((Object)a2, m1, 1));
        }
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final p p = ((cnb)this).P();
        jjl jjl;
        if (bundle == null) {
            final kjl$b kjl$b = new kjl$b(1);
            ((kjl$a)kjl$b).H(2131956983);
            ((kjl$a)kjl$b).A(2131956982);
            ((kjl$a)kjl$b).G(((Context)this).getString(2131956978));
            ((kjl$a)kjl$b).D(((Context)this).getString(2131952374));
            jjl = (jjl)((xk1$a)kjl$b).w();
            ((wk1)jjl).e2(p, "RemoveContactsDialogFragmentActivityDialog");
        }
        else {
            jjl = (jjl)p.H("RemoveContactsDialogFragmentActivityDialog");
        }
        if (jjl != null) {
            ((wk1)jjl).U1 = (xv8)this;
            final int a = c5j.a;
            ((wk1)jjl).R1 = (uv8)this;
        }
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        this.finish();
    }
}
