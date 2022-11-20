import android.app.Notification;
import android.media.AudioAttributes$Builder;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spi
{
    public static void a(final Context context, final qqi qqi, final rvi rvi) {
        final boolean d = rvi.d;
        final boolean b = false;
        int n;
        if (d) {
            n = 2;
        }
        else {
            n = 0;
        }
        int n2 = b ? 1 : 0;
        if (!rvi.f) {
            n2 = (b ? 1 : 0);
            if (!d) {
                n2 = (b ? 1 : 0);
                if (rvi.c == null) {
                    n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            qqi.n((CharSequence)null);
        }
        qqi.h(n);
        if (rvi.f) {
            qqi.k(-16711936, 500, 2000);
        }
        if (pbu.c().e("sound_effects", true) && Build$VERSION.SDK_INT < 26 && ((TelephonyManager)context.getSystemService("phone")).getCallState() == 0 && ikr.g((CharSequence)rvi.c)) {
            final Uri parse = Uri.parse(rvi.c);
            final Notification f = qqi.F;
            f.sound = parse;
            f.audioStreamType = 5;
            f.audioAttributes = new AudioAttributes$Builder().setContentType(4).setLegacyStreamType(5).build();
        }
    }
}
