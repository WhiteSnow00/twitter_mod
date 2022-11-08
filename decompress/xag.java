import android.os.BaseBundle;
import com.twitter.analytics.tracking.a;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import com.twitter.app.common.account.d;
import android.os.Bundle;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Activity;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xag
{
    static {
        Pattern.compile("[0-9]+");
    }
    
    public static void a(final Activity activity, final ocw ocw, final boolean b) {
        final Intent intent = activity.getIntent();
        if (b) {
            final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)intent.getParcelableExtra("accountAuthenticatorResponse");
            if (accountAuthenticatorResponse != null) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("authAccount", ((pcw)ocw).b());
                ((BaseBundle)bundle).putString("accountType", d.j);
                accountAuthenticatorResponse.onResult(bundle);
            }
        }
    }
    
    public static void b(final boolean b, final UserIdentifier userIdentifier) {
        final zf4 zf4 = new zf4(userIdentifier);
        zf4.q(new String[] { "login::::success" });
        String s;
        if (b) {
            zf4.B = "sso_sdk";
            final int a = w4j.a;
            s = "switch_account";
        }
        else {
            s = "logged_out";
        }
        com.twitter.analytics.tracking.a.b().a(zf4);
        ((c7k)zew.a().c((Class)c7k.class)).R2().a(zf4);
        saw.b((okm)zf4);
        c(userIdentifier, "login", "", s, "", "success");
    }
    
    public static void c(final UserIdentifier userIdentifier, final String... array) {
        final zf4 zf4 = new zf4(userIdentifier);
        zf4.q(array);
        saw.b((okm)zf4);
    }
}
