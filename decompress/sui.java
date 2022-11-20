import com.twitter.notifications.settings.presenter.PushNotificationsSettingsContentViewProvider;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sui
{
    public final UserIdentifier a;
    public final jyi b;
    
    public sui(final UserIdentifier a, final jyi b) {
        this.a = a;
        this.b = b;
    }
    
    public static void a(final boolean b) {
        final kca q1 = PushNotificationsSettingsContentViewProvider.q1;
        String s;
        if (b) {
            s = "success";
        }
        else {
            s = "failure";
        }
        cbw.b((elm)new af4(vba.f((ica)q1, "read_settings", "", s)));
    }
}
