import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z5k
{
    public final SharedPreferences a;
    
    public z5k(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("PeriscopeSessionCoordinator", 0);
        this.a = sharedPreferences;
    }
    
    public static String a(final UserIdentifier userIdentifier) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriscopeCookie_");
        sb.append(userIdentifier);
        return sb.toString();
    }
    
    public static String b(final UserIdentifier userIdentifier) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriscopeCookieType_");
        sb.append(userIdentifier);
        return sb.toString();
    }
    
    public static String c(final UserIdentifier userIdentifier) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriscopeSerializedUser_");
        sb.append(userIdentifier);
        return sb.toString();
    }
    
    public final void d(final UserIdentifier userIdentifier) {
        this.a.edit().remove(a(userIdentifier)).remove(b(userIdentifier)).apply();
    }
}
