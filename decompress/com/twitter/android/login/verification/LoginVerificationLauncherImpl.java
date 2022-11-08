// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login.verification;

import com.twitter.login.api.LoginChallengeArgs;
import com.twitter.login.api.WebauthnArgs;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import android.content.Intent;
import kotlin.Metadata;

@a91
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lcom/twitter/android/login/verification/LoginVerificationLauncherImpl;", "Llbg;", "a", "feature.tfa.login.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class LoginVerificationLauncherImpl implements lbg
{
    public final xn6<blx, Intent> a;
    public final xn6<nag, Intent> b;
    public final b5j<zrm<Intent>> c;
    public pbg d;
    
    public LoginVerificationLauncherImpl(final sso sso, final mbi<?> mbi) {
        Objects.requireNonNull(bsm.Companion);
        final xn6<zm, Intent> g = mbi.g(Intent.class, (bsm<Intent>)new csm(), "webauthn");
        this.a = (xn6<blx, Intent>)g;
        final xn6<zm, Intent> g2 = mbi.g(Intent.class, (bsm<Intent>)new csm(), "challenge");
        this.b = (xn6<nag, Intent>)g2;
        this.c = (b5j<zrm<Intent>>)b5j.merge((naj)g.a(), (naj)g2.a());
        sso.b((Object)this);
    }
    
    public final void a(final jub<? super Boolean, ? super UserIdentifier, ? super Intent, oyv> jub) {
        final b5j<zrm<Intent>> c = this.c;
        final m29 c2;
        c2.c(c.doOnComplete((rj)new rj() {
            public final /* synthetic */ m29 C0 = c2 = af.c((b5j)c, "observable");
            
            public final void run() {
                this.C0.a();
            }
        }).subscribe((fk6)new f$c2((rtb)new LoginVerificationLauncherImpl$c((jub)jub, this))));
    }
    
    public final void b(final String s, final pbg d) {
        zzd.f((Object)s, "identifier");
        zzd.f((Object)d, "response");
        this.d = d;
        if (ckr.f1("U2FSecurityKey", Uri.parse(d.d).getQueryParameter("challenge_type"), true) && dta.b().b("u2f_security_key_auth_enabled", false) && pb7.e().k()) {
            this.a.d(new blx(new WebauthnArgs(d, (String)null, false)));
        }
        else {
            this.b.d(new nag(new LoginChallengeArgs(s, d)));
        }
    }
    
    public static final class a implements lbg$a
    {
        public final lbg a(final sso sso, final mbi<?> mbi) {
            return (lbg)new LoginVerificationLauncherImpl(sso, mbi);
        }
    }
}
