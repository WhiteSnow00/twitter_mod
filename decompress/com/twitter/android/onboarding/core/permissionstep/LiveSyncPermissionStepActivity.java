// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.permissionstep;

import com.twitter.onboarding.ocf.NavigationHandler;
import android.app.Activity;
import android.content.Context;
import com.twitter.android.onboarding.core.permissionstep.di.view.LiveSyncPermissionViewObjectGraph;
import android.os.Bundle;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;

public class LiveSyncPermissionStepActivity extends vnd
{
    public b2g q1;
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final b2g q1 = this.q1;
        final boolean b = q1.e.b();
        if (b) {
            ml6.Companion.a().a(UserIdentifier.Companion.c());
            Objects.requireNonNull(b3k.Companion);
            Objects.requireNonNull(d3k.Companion);
            ((d3k)dgw.Companion.a().c((Class)d3k.class)).I4().a();
        }
        rrd rrd;
        if (b) {
            final dtv a = q1.i.a;
            e0e.c((Object)a);
            rrd = new rrd(a, (vrd)a3a.b);
        }
        else {
            final dtv b2 = q1.i.b;
            e0e.c((Object)b2);
            rrd = new rrd(b2, (vrd)null);
        }
        q1.b.b = (sj8$a)new l71((Object)q1, 18);
        q1.c.d(rrd, null);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final b2g w2 = ((LiveSyncPermissionViewObjectGraph)((x9)this.b1()).n()).W2();
        this.q1 = w2;
        if (bundle == null) {
            w2.f.c();
            if (w2.e.b()) {
                w2.b.b = (sj8$a)new pn1((Object)w2, 12);
                final NavigationHandler c = w2.c;
                final dtv a = w2.i.a;
                e0e.c((Object)a);
                c.e(a);
            }
            else {
                final d2g i = w2.i;
                if (i.j != null && i.h == null) {
                    final k7k.a q0 = LiveSyncPermissionRequestActivity.q0((Context)w2.a, ica.Companion.b("onboarding", "import_addressbook", "", "import"));
                    q0.w(w2.i.j);
                    final dtv a2 = w2.i.a;
                    e0e.c((Object)a2);
                    q0.v(a2.c);
                    final dtv b = w2.i.b;
                    e0e.c((Object)b);
                    q0.u(b.c);
                    final pej k = w2.i.k;
                    if (k != null) {
                        q0.t(w2.g.c((fym)k).toString());
                    }
                    final cej l = w2.i.l;
                    if (l != null) {
                        q0.a.putExtra("getHeaderImage", gmp.e((Object)l, (nmp)cej.c));
                    }
                    final Intent intent = ((k7k)q0.e()).toIntent((Context)w2.a, (Class<? extends Activity>)LiveSyncPermissionRequestActivity.class);
                    e0e.e((Object)intent, "getIntent(activity, argsBuilder)");
                    w2.a.startActivityForResult(intent, 11);
                }
                else {
                    final k7k.a q2 = LiveSyncPermissionRequestActivity.q0((Context)w2.a, ica.Companion.b("onboarding", "import_addressbook", "", "import"));
                    final OcfLiveSyncPermissionRequestActivity$a companion = OcfLiveSyncPermissionRequestActivity.Companion;
                    final Activity a3 = w2.a;
                    Objects.requireNonNull(companion);
                    e0e.f((Object)a3, "context");
                    final Intent intent2 = ((k7k)q2.e()).toIntent((Context)a3, (Class<? extends Activity>)OcfLiveSyncPermissionRequestActivity.class);
                    e0e.e((Object)intent2, "argsBuilder.build().toIn\u2026uestActivity::class.java)");
                    w2.d.d(intent2, w2.h);
                    w2.a.startActivityForResult(intent2, 11);
                }
            }
        }
    }
}
