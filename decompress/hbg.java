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

public final class hbg
{
    public static final int a = 0;
    
    static {
        Pattern.compile("[0-9]+");
    }
    
    public static void a(final Activity activity, final qdw qdw, final boolean b) {
        final Intent intent = activity.getIntent();
        if (b) {
            final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)intent.getParcelableExtra("accountAuthenticatorResponse");
            if (accountAuthenticatorResponse != null) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("authAccount", ((rdw)qdw).c());
                ((BaseBundle)bundle).putString("accountType", d.j);
                accountAuthenticatorResponse.onResult(bundle);
            }
        }
    }
    
    public static void b(final boolean b, final UserIdentifier userIdentifier) {
        final fg4 fg4 = new fg4(userIdentifier);
        ((o1p)fg4).q(new String[] { "login::::success" });
        String s;
        if (b) {
            ((o1p)fg4).B = "sso_sdk";
            final int a = o5j.a;
            s = "switch_account";
        }
        else {
            s = "logged_out";
        }
        com.twitter.analytics.tracking.a.b().a(fg4);
        ((y7k)cgw.a().c((Class)y7k.class)).R2().a(fg4);
        sbw.b((tlm)fg4);
        c(userIdentifier, "login", "", s, "", "success");
    }
    
    public static void c(final UserIdentifier userIdentifier, final String... array) {
        final fg4 fg4 = new fg4(userIdentifier);
        ((o1p)fg4).q(array);
        sbw.b((tlm)fg4);
    }
}
