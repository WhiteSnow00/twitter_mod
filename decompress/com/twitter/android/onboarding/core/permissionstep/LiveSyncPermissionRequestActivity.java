// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.permissionstep;

import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment$InstantiationException;
import java.io.Serializable;
import com.twitter.permissions.PermissionRequestActivity$a;
import android.app.Dialog;
import android.content.DialogInterface;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.permissions.PermissionRequestActivity;

public class LiveSyncPermissionRequestActivity extends PermissionRequestActivity implements c1g
{
    public i1g v1;
    public i99 w1;
    public long x1;
    
    public static x6k$a q0(final Context context, final bba bba) {
        final boolean d = i1g.a(UserIdentifier.getCurrent()).d();
        final x6k$a x6k$a = new x6k$a();
        x6k$a.w(context.getString(2131951891));
        x6k$a.t(context.getString(2131951889));
        x6k$a.v(context.getString(2131958684));
        x6k$a.u(context.getString(2131955472));
        ((xi1.a)x6k$a).a.putExtra("getPermissionsToRequest", new String[] { "android.permission.READ_CONTACTS" });
        x6k$a.s(bba);
        ((xi1.a)x6k$a).a.putExtra("getRetargetingMessageFormat", context.getString(2131955676));
        ((xi1.a)x6k$a).a.putExtra("getRetargetingTitle", context.getString(2131955677));
        x6k$a.q(d ^ true);
        ((xi1.a)x6k$a).a.putExtra("getRetargetingDialogTheme", 2132017634);
        x6k$a.r(true);
        return x6k$a;
    }
    
    public final void B(final DialogInterface dialogInterface) {
        this.R0(dialogInterface, 1);
    }
    
    public final boolean d0() {
        return this.v1.b();
    }
    
    public final void h0(final bba bba) {
        PermissionRequestActivity.g0(bba, "permissions_denied", super.q1.getDeniedPermissions());
        cbw.b((elm)this.w1.h("contacts_prompt", "", "deny"));
    }
    
    public final void j0(final bba bba) {
        PermissionRequestActivity.g0(bba, "permissions_granted", super.q1.getGrantedPermissions());
        cbw.b((elm)this.w1.h("contacts_prompt", "", "accept"));
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        this.y(dialog, n, n2);
    }
    
    public void n0() {
        cbw.b((elm)this.w1.h("contacts_sync_prompt", "", "impression"));
        super.o1 = PermissionRequestActivity$a.E0;
        final x6k x6k = new x6k(((Activity)this).getIntent());
        final Bundle a = nh.A("twitter:id", 1);
        ((BaseBundle)a).putString("scribe_page", super.p1);
        final byte[] byteArrayExtra = ((xi1)x6k).mIntent.getByteArrayExtra("getHeaderImage");
        final pdj$b c = pdj.c;
        a.putSerializable("header_image", (Serializable)klp.e((Object)klp.a(byteArrayExtra, (rlp)c), (rlp)c));
        ((BaseBundle)a).putString("twitter:title_string", ((xi1)x6k).mIntent.getStringExtra("getPreliminaryTitle").toString());
        final int a2 = c5j.a;
        ((BaseBundle)a).putString("twitter:positive_button_string", ((xi1)x6k).mIntent.getStringExtra("getPreliminaryPositiveButtonText").toString());
        final int a3 = c5j.a;
        ((BaseBundle)a).putString("twitter:negative_button_string", ((xi1)x6k).mIntent.getStringExtra("getPreliminaryNegativeButtonText").toString());
        final String stringExtra = ((xi1)x6k).mIntent.getStringExtra("getPreliminaryMessage");
        if (stringExtra != null) {
            ((BaseBundle)a).putString("twitter:message_string", stringExtra.toString());
            final int a4 = c5j.a;
        }
        int n;
        if (klp.a(((xi1)x6k).mIntent.getByteArrayExtra("getHeaderImage"), (rlp)c) != null) {
            n = 2132017632;
        }
        else {
            n = 2132017631;
        }
        if (((BaseBundle)a).containsKey("scribe_page")) {
            final ns ns = new ns();
            ((Fragment)ns).N1(a);
            if (n != 0) {
                ((nv8)ns).c2(n);
            }
            final int a5 = c5j.a;
            ((wk1)ns).T1 = (wv8)this;
            ((wk1)ns).U1 = (xv8)this;
            ((wk1)ns).l2(((cnb)this).P());
            return;
        }
        throw new Fragment$InstantiationException("Missing scribe page", (Exception)null);
    }
    
    public final void o0() {
        if (g7k.d().k()) {
            cbw.b((elm)this.w1.h("contacts_denied_prompt", "", "impression"));
        }
        super.o0();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final long id = UserIdentifier.getCurrent().getId();
        this.x1 = id;
        this.w1 = i99.e(super.p1, UserIdentifier.fromId(id));
        this.v1 = ((pk6)mfw.a().c((Class)pk6.class)).w2();
    }
    
    public final void p0() {
        if (g7k.d().k()) {
            cbw.b((elm)this.w1.h("contacts_prompt", "", "impression"));
        }
        super.p0();
    }
    
    public final void y(final Dialog dialog, final int n, final int n2) {
        if (n == 1 && this.x1 > 0L) {
            String s;
            if (n2 == -1) {
                this.v1.e(2);
                s = "accept";
            }
            else if (n2 == -2) {
                s = "deny";
            }
            else {
                s = null;
            }
            if (s != null) {
                cbw.b((elm)this.w1.h("contacts_sync_prompt", "", s));
            }
        }
        super.k0(dialog, n, n2);
    }
}
