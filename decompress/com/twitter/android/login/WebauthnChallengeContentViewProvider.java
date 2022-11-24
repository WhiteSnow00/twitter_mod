// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import android.net.Uri$Builder;
import android.net.Uri;
import android.app.Activity;
import android.os.Bundle;
import com.twitter.login.api.WebauthnArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

@a91
public class WebauthnChallengeContentViewProvider extends kcv implements yag
{
    public zbg Z0;
    public String a1;
    public final LoginChallengeCheckDelegate b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public Intent f1;
    
    public WebauthnChallengeContentViewProvider(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final WebauthnArgs webauthnArgs, final Bundle bundle, final duo duo, final rmv rmv, final zb7 zb7, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final LoginChallengeCheckDelegate b1 = new LoginChallengeCheckDelegate();
        this.b1 = b1;
        duo.b(this);
        if (bundle == null) {
            final fg4 fg4 = new fg4();
            ((o1p)fg4).q(new String[] { "login_challenge::::impression" });
            sbw.b((tlm)fg4);
            this.Z0 = webauthnArgs.getLoginResponse();
            this.a1 = webauthnArgs.getOverrideUrl();
        }
        if (this.Z0 == null) {
            ((Activity)dob).finish();
            return;
        }
        this.e1 = rmv.b("auth_timeline_token_tracking_enabled", false);
        this.d1 = false;
        this.f1 = null;
        b1.c = (yag)this;
        if (bundle != null) {
            iar.restoreFromBundle((Object)b1, bundle);
        }
        if (flr.g((CharSequence)this.a1)) {
            zb7.i((Activity)dob, this.W4(this.a1), (yp2)null);
        }
        else if (flr.g((CharSequence)this.Z0.d)) {
            zb7.i((Activity)dob, this.W4(this.Z0.d), (yp2)null);
        }
        else {
            ((Activity)dob).finish();
        }
    }
    
    public final void N4() {
        this.b1.b();
        this.b1.a();
    }
    
    @Override
    public final void O4(final Intent intent) {
        super.O4(intent);
        final WebauthnArgs webauthnArgs = (WebauthnArgs)xn6.d(intent.getExtras(), (Class)WebauthnArgs.class);
        if (webauthnArgs != null && webauthnArgs.getDeepLinkSuccess()) {
            this.d1 = true;
            final LoginChallengeCheckDelegate b1 = this.b1;
            final int f = b1.f;
            b1.h = f;
            final LoginChallengeCheckDelegate$a e = new LoginChallengeCheckDelegate$a(b1);
            b1.e = e;
            b1.d.postDelayed((Runnable)e, (long)f);
        }
    }
    
    @Override
    public final void P4() {
        super.P4();
        this.c1 = true;
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        if (this.c1) {
            this.c1 = false;
            if (!this.d1) {
                this.X4(super.N0.getIntExtra("extra_finish_with_result", 0));
            }
        }
    }
    
    public final String W4(String s) {
        if (flr.e((CharSequence)s)) {
            return null;
        }
        s = lse.a(s);
        final String s2 = s = unx.a(super.O0.getConfiguration().locale, s);
        if (this.e1) {
            final String b = u51.b();
            s = s2;
            if (!flr.e((CharSequence)b)) {
                final Uri$Builder buildUpon = Uri.parse(s2).buildUpon();
                buildUpon.appendQueryParameter("att", b);
                s = buildUpon.toString();
            }
        }
        final Uri parse = Uri.parse(s);
        final Set queryParameterNames = parse.getQueryParameterNames();
        final Uri$Builder clearQuery = parse.buildUpon().clearQuery();
        for (final String s3 : queryParameterNames) {
            if (s3.equals("platform")) {
                s = "web";
            }
            else {
                s = parse.getQueryParameter(s3);
            }
            clearQuery.appendQueryParameter(s3, s);
        }
        return clearQuery.build().buildUpon().appendQueryParameter("redirect_after_login_verification", "twitter://login_challenge_redirect").build().toString();
    }
    
    public final void X4(final int result) {
        if (this.c1) {
            final Intent intent = new Intent((Context)super.G0, (Class)WebauthnChallengeActivity.class);
            intent.setFlags(131072);
            intent.putExtra("extra_finish_with_result", result);
            ((Context)super.G0).startActivity(intent);
        }
        else if (result == 0) {
            super.H0.cancel();
        }
        else {
            final Intent f1 = this.f1;
            if (f1 == null) {
                ((Activity)super.G0).setResult(result);
            }
            else {
                ((Activity)super.G0).setResult(result, f1);
            }
            ((Activity)super.G0).finish();
        }
    }
    
    public final void a3() {
        final fg4 fg4 = new fg4(UserIdentifier.LOGGED_OUT);
        ((o1p)fg4).q(new String[] { "login_challenge::::cancel" });
        sbw.b((tlm)fg4);
        super.a3();
    }
    
    public final Activity g4() {
        return (Activity)super.G0;
    }
    
    @Override
    public final boolean k() {
        final fg4 fg4 = new fg4(UserIdentifier.LOGGED_OUT);
        ((o1p)fg4).q(new String[] { "login_challenge::::cancel" });
        sbw.b((tlm)fg4);
        return super.k();
    }
    
    public final void k3(final UserIdentifier userIdentifier, final String s) {
        ehk.c().a((CharSequence)s, 1);
        final fg4 fg4 = new fg4(userIdentifier);
        ((o1p)fg4).q(new String[] { "login::::failure" });
        sbw.b((tlm)fg4);
        this.X4(0);
    }
    
    public final zbg q1() {
        return this.Z0;
    }
    
    public final void r4(final qdw qdw) {
        hbg.a((Activity)super.G0, qdw, true);
        hbg.b(false, super.M0);
        final fg4 fg4 = new fg4(super.M0);
        ((o1p)fg4).q(new String[] { "login_challenge::::success" });
        sbw.b((tlm)fg4);
        final Intent f1 = new Intent();
        f1.putExtra("AbsFragmentActivity_intent_origin", this.getClass().getName());
        final rdw rdw = (rdw)qdw;
        swj.m(f1, "AbsFragmentActivity_account_user_identifier", rdw.k());
        f1.putExtra("extra_result_code", -1);
        this.f1 = f1;
        tsc.c().f(tjw.s((Context)super.G0, rdw.k()));
        this.X4(-1);
    }
}
