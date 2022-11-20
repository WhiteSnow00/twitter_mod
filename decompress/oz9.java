import com.twitter.notifications.json.JsonEmailNotificationSettingsInput;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oz9 extends d2v<tmi>
{
    public static final cba l1;
    public final UserIdentifier j1;
    public final lz9 k1;
    
    static {
        l1 = (cba)aba.c("app", "twitter_service", "email_notification_settings", "update");
    }
    
    public oz9(final UserIdentifier j1, final lz9 k1) {
        super(j1, 0);
        this.j1 = j1;
        this.k1 = k1;
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)oz9.l1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_email_notifications_settings_update");
        a.p("user_id", (Object)this.j1.getStringId());
        final lz9 k1 = this.k1;
        final JsonEmailNotificationSettingsInput jsonEmailNotificationSettingsInput = new JsonEmailNotificationSettingsInput();
        jsonEmailNotificationSettingsInput.a = k1.c;
        jsonEmailNotificationSettingsInput.b = k1.f;
        jsonEmailNotificationSettingsInput.c = k1.l;
        jsonEmailNotificationSettingsInput.d = k1.b;
        jsonEmailNotificationSettingsInput.e = k1.j;
        jsonEmailNotificationSettingsInput.f = k1.e;
        jsonEmailNotificationSettingsInput.g = k1.p;
        jsonEmailNotificationSettingsInput.h = k1.h;
        jsonEmailNotificationSettingsInput.i = k1.a;
        jsonEmailNotificationSettingsInput.j = k1.i;
        jsonEmailNotificationSettingsInput.k = k1.d;
        jsonEmailNotificationSettingsInput.l = k1.n;
        jsonEmailNotificationSettingsInput.m = k1.m;
        jsonEmailNotificationSettingsInput.n = k1.k;
        jsonEmailNotificationSettingsInput.o = k1.g;
        jsonEmailNotificationSettingsInput.p = k1.o;
        jsonEmailNotificationSettingsInput.q = k1.q;
        jsonEmailNotificationSettingsInput.r = k1.r;
        a.p("settings", (Object)jsonEmailNotificationSettingsInput);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)v8g.d();
    }
}
