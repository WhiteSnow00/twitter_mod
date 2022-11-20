import android.os.BaseBundle;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.notifications.settings.args.NotificationsSettingsContentViewArgs;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zwi
{
    public static Intent a(final Context context, final Bundle bundle, final boolean b) {
        final String string = ((BaseBundle)bundle).getString("enable_channel");
        int i = 0;
        boolean b5;
        boolean b6;
        boolean b7;
        if (string != null) {
            final String[] split = string.split(",");
            final int length = split.length;
            boolean b2 = false;
            boolean b3 = false;
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
            b5 = b2;
            b6 = b3;
            b7 = b4;
        }
        else {
            b5 = false;
            b6 = false;
            b7 = false;
        }
        return i81.a().a(context, (ContentViewArgs)new NotificationsSettingsContentViewArgs.PushNotificationsSettingsContentViewArgs(false, b5, b6, b7, null));
    }
}
