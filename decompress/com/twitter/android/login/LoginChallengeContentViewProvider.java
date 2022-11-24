// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login;

import android.content.Context;
import android.app.Activity;
import android.net.Uri$Builder;
import android.webkit.WebSettings;
import android.net.Uri;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.os.Bundle;
import com.twitter.login.api.LoginChallengeArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

@a91
public class LoginChallengeContentViewProvider extends kcv implements yag
{
    public zbg Z0;
    public String a1;
    public String b1;
    public final LoginChallengeCheckDelegate c1;
    public final iw6 d1;
    public final tsc e1;
    public final igt f1;
    
    public LoginChallengeContentViewProvider(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final iw6 d1, final fda<fo> fda2, final LoginChallengeArgs loginChallengeArgs, final Bundle bundle, final duo duo, final rmv rmv, final zb7 zb7, final gn gn, final tsc e1, final igt f1, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final LoginChallengeCheckDelegate c1 = new LoginChallengeCheckDelegate();
        this.c1 = c1;
        (this.d1 = d1).b();
        this.e1 = e1;
        this.f1 = f1;
        duo.b(this);
        c1.c = (yag)this;
        if (bundle != null) {
            iar.restoreFromBundle((Object)c1, bundle);
        }
        if (bundle == null) {
            final fg4 fg4 = new fg4();
            ((o1p)fg4).q(new String[] { "login_challenge::::impression" });
            sbw.b((tlm)fg4);
            this.Z0 = loginChallengeArgs.getResponse();
            this.a1 = loginChallengeArgs.getIdentifier();
        }
        if (this.Z0 == null) {
            this.D4();
        }
        final WebView webView = (WebView)this.C4(2131432650);
        final WebSettings settings = webView.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        final boolean b = rmv.b("auth_timeline_token_tracking_enabled", false);
        webView.setWebViewClient((WebViewClient)new LoginChallengeContentViewProvider$a(this, b, rmv, zb7, gn));
        if (this.b1 == null) {
            this.b1 = this.Z0.d;
        }
        this.b1 = lse.a(this.b1);
        this.b1 = unx.a(resources.getConfiguration().locale, this.b1);
        if (b) {
            final String b2 = u51.b();
            if (!flr.e((CharSequence)b2)) {
                final Uri$Builder buildUpon = Uri.parse(this.b1).buildUpon();
                buildUpon.appendQueryParameter("att", b2);
                this.b1 = buildUpon.toString();
            }
        }
        webView.loadUrl(this.b1);
        vo.a((fda)fda2, 100, (fa3)new wgk((Object)this, 2));
    }
    
    public static void W4() {
        final fg4 fg4 = new fg4(UserIdentifier.LOGGED_OUT);
        ((o1p)fg4).q(new String[] { "login_challenge::::cancel" });
        sbw.b((tlm)fg4);
    }
    
    public final void N4() {
        final iw6 d1 = this.d1;
        if (d1 != null) {
            d1.a();
        }
        this.c1.a();
    }
    
    @Override
    public final void P4() {
        super.P4();
        this.c1.b();
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        final LoginChallengeCheckDelegate c1 = this.c1;
        final int f = c1.f;
        c1.h = f;
        final LoginChallengeCheckDelegate$a e = new LoginChallengeCheckDelegate$a(c1);
        c1.e = e;
        c1.d.postDelayed((Runnable)e, (long)f);
    }
    
    public final void a3() {
        W4();
        super.a3();
    }
    
    public final Activity g4() {
        return (Activity)super.G0;
    }
    
    @Override
    public final boolean k() {
        W4();
        return super.k();
    }
    
    public final void k3(final UserIdentifier userIdentifier, final String s) {
        this.f1.a((CharSequence)s, 1);
        final fg4 fg4 = new fg4(userIdentifier);
        ((o1p)fg4).q(new String[] { "login::::failure" });
        sbw.b((tlm)fg4);
        super.H0.cancel();
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
        final Intent intent = new Intent();
        intent.putExtra("AbsFragmentActivity_intent_origin", this.getClass().getName());
        final rdw rdw = (rdw)qdw;
        swj.m(intent, "AbsFragmentActivity_account_user_identifier", rdw.k());
        ((Activity)super.G0).setResult(-1, intent);
        this.e1.f(tjw.s((Context)super.G0, rdw.k()));
        ((Activity)super.G0).finish();
    }
}
