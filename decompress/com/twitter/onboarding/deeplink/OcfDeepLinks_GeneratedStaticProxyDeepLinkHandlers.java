// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.deeplink;

import android.os.BaseBundle;
import com.twitter.android.navigation.NoOpActivity;
import com.twitter.android.onboarding.core.verification.EmailPinVerificationStepActivity;
import java.io.Serializable;
import com.twitter.onboarding.ocf.WebModalSubtaskPresenter;
import java.util.Objects;
import com.twitter.android.onboarding.core.webmodal.WebModalSubtaskActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class OcfDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent OcfDeepLinks_deepLinkToOcfBouncerFlow(final Context context, final Bundle bundle) {
        e0e.f((Object)context, "context");
        e0e.f((Object)bundle, "extras");
        Intent intent;
        if (ita.b().b("ocf_2fa_enrollment_bouncer_enabled", false)) {
            intent = ix.s(context, bundle, "/1.1/onboarding/bounce.json", "/i/bounce");
        }
        else {
            c0e.i("Bouncer deeplinks disabled");
            intent = ((Activity)context).getIntent();
            e0e.e((Object)intent, "{\n            ErrorRepor\u2026ctivity).intent\n        }");
        }
        return intent;
    }
    
    public static Intent OcfDeepLinks_deepLinkToOcfFlow(final Context context, final Bundle bundle) {
        e0e.f((Object)context, "context");
        e0e.f((Object)bundle, "extras");
        return ix.s(context, bundle, "/1.1/onboarding/task.json", "/i/flow");
    }
    
    public static Intent OcfDeepLinks_deepLinkToOcfWebModal(final Context context, final Bundle bundle) {
        e0e.f((Object)context, "context");
        e0e.f((Object)bundle, "extras");
        final String string = ((BaseBundle)bundle).getString("target_link");
        final Intent a = gn.Companion.a().a(context, (cn)fgg.a(pgg.H0));
        Intent intent;
        if (string == null) {
            r9a.d((Throwable)new IllegalArgumentException(mqb.l("Malformed WebModal deeplink: ", ((BaseBundle)bundle).getString("deep_link_uri"))));
            intent = a;
        }
        else {
            final rmv d = ita.d();
            int n = 0;
            if (!d.b("stateful_login_enabled", false)) {
                r9a.d((Throwable)new IllegalStateException(mqb.l("WebModal use is disabled: ", ((BaseBundle)bundle).getString("deep_link_uri"))));
                intent = a;
            }
            else {
                Objects.requireNonNull(WebModalSubtaskActivity.Companion);
                Objects.requireNonNull(WebModalSubtaskPresenter.c.Companion);
                final WebModalSubtaskPresenter.c[] values = WebModalSubtaskPresenter.c.values();
                final int length = values.length;
                Intent intent2;
                Enum<WebModalSubtaskPresenter.c> enum1;
                while (true) {
                    intent2 = null;
                    if (n >= length) {
                        enum1 = null;
                        break;
                    }
                    enum1 = values[n];
                    if (e0e.a((Object)((WebModalSubtaskPresenter.c)enum1).F0, (Object)string)) {
                        break;
                    }
                    ++n;
                }
                Intent intent3 = intent2;
                if (enum1 != null) {
                    intent3 = intent2;
                    if (!((BaseBundle)bundle).isEmpty()) {
                        intent3 = new Intent(context, (Class)WebModalSubtaskActivity.class);
                        intent3.setFlags(603979776);
                        intent3.putExtras(bundle);
                        intent3.putExtra("extra_target_link", (Serializable)enum1);
                        intent3.putExtra("extra_uri_extra_key", ((BaseBundle)bundle).getString("deep_link_uri"));
                    }
                }
                if (intent3 == null) {
                    r9a.d((Throwable)new IllegalArgumentException(mqb.l("Malformed WebModal deeplink: ", ((BaseBundle)bundle).getString("deep_link_uri"))));
                    intent = a;
                }
                else {
                    intent = intent3;
                }
            }
        }
        return intent;
    }
    
    public static Intent VerificationDeepLinks_deepLinkToVerificationStepWithPin(final Context context, final Bundle bundle) {
        sbw.a().c((tlm)new fg4(dda.g("onboarding", "verification", "email", "link", "click")));
        final String string = ((BaseBundle)bundle).getString("email");
        final String string2 = ((BaseBundle)bundle).getString("pin_code");
        Intent putExtra;
        if (flr.g((CharSequence)string) && flr.g((CharSequence)string2) && z0a.c1) {
            putExtra = new Intent(context, (Class)EmailPinVerificationStepActivity.class).putExtra("extra_email", string).putExtra("extra_pin_code", string2).putExtra("extra_started_from_deeplink", true);
        }
        else {
            if (!z0a.c1) {
                final m9a m9a = new m9a();
                m9a.b = new IllegalStateException("Onboarding verification deeplink url cannot be launchedoutside of flow");
                r9a.c(m9a);
                sbw.a().c((tlm)new fg4(dda.g("onboarding", "signup", "verification", "email", "invalid_email")));
            }
            else {
                final m9a m9a2 = new m9a();
                m9a2.b = new IllegalStateException("Onboarding verification deeplink url is not supported");
                r9a.c(m9a2);
            }
            putExtra = new Intent(context, (Class)NoOpActivity.class);
        }
        return putExtra;
    }
}
