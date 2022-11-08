import com.twitter.util.user.UserIdentifier;
import java.security.Provider;
import java.security.Security;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbg
{
    static {
        Security.addProvider((Provider)new ab2());
    }
    
    public static void a(final UserIdentifier userIdentifier) {
        wau.e(userIdentifier, "login_verification").i().f("login_verification", false).a("lv_private_key").a("lv_public_key").a("lv_secret").a("lv_times_to_hash").a("lv_totp_secret").e();
    }
}
