import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w33
{
    public static final a Companion;
    public final Context a;
    public final g8l b;
    public final ocw c;
    public final vit d;
    
    static {
        Companion = new a();
    }
    
    public w33(final Context a, final p p5, final UserIdentifier userIdentifier, final g8l b, final ocw c) {
        zzd.f((Object)a, "context");
        zzd.f((Object)p5, "fragmentManager");
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)c, "userInfo");
        this.a = a;
        this.b = b;
        this.c = c;
        final tit tit = new tit();
        Objects.requireNonNull(lri.Companion);
        psa d;
        if (dta.a(userIdentifier).b("android_account_notifications_tooltip_fatigue_enabled", false)) {
            d = new psa("fatigue_account_notif_profile_tooltip", dta.a(userIdentifier).f("android_account_notifications_tooltip_max_amount", 3), dta.a(userIdentifier).h("android_account_notifications_tooltip_min_interval_ms", 604800000L), userIdentifier);
        }
        else {
            d = psa.d("fatigue_account_notif_profile_tooltip", userIdentifier);
        }
        tit.c(d);
        this.d = new vit(a, p5, (sit)tit, c);
    }
    
    public static final class a
    {
    }
}
