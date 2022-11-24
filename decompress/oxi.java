import android.os.BaseBundle;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.notifications.settings.args.NotificationsSettingsContentViewArgs;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxi
{
    public static Intent a(final Context context, final Bundle bundle, final boolean b) {
        final String string = ((BaseBundle)bundle).getString("enable_channel");
        int i = 0;
        boolean b2;
        boolean b3;
        boolean b5;
        if (string != null) {
            final String[] split = string.split(",");
            final int length = split.length;
            b2 = false;
            b3 = false;
            boolean b4 = false;
            while (i < length) {
                final String trim = split[i].trim();
                if (trim.equals("recommendations")) {
                    b2 = true;
                }
                if (trim.equals("topics")) {
                    b3 = true;
                }
                ++i;
                b4 = b;
            }
            b5 = b4;
        }
        else {
            b2 = false;
            b3 = false;
            b5 = false;
        }
        return lr0.a().a(context, (ContentViewArgs)new NotificationsSettingsContentViewArgs.PushNotificationsSettingsContentViewArgs(false, b2, b3, b5, null));
    }
}
