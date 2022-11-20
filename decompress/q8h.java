import android.os.BaseBundle;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8h
{
    public static void a(final String s, final Bundle bundle) {
        try {
            yza.c();
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle();
            final String string = ((BaseBundle)bundle2).getString("google.c.a.c_id");
            if (string != null) {
                ((BaseBundle)bundle3).putString("_nmid", string);
            }
            final String string2 = ((BaseBundle)bundle2).getString("google.c.a.c_l");
            if (string2 != null) {
                ((BaseBundle)bundle3).putString("_nmn", string2);
            }
            final String string3 = ((BaseBundle)bundle2).getString("google.c.a.m_l");
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                ((BaseBundle)bundle3).putString("label", string3);
            }
            final String string4 = ((BaseBundle)bundle2).getString("google.c.a.m_c");
            if (!TextUtils.isEmpty((CharSequence)string4)) {
                ((BaseBundle)bundle3).putString("message_channel", string4);
            }
            String string5 = ((BaseBundle)bundle2).getString("from");
            final String s2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                ((BaseBundle)bundle3).putString("_nt", string5);
            }
            final String string6 = ((BaseBundle)bundle2).getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    ((BaseBundle)bundle3).putInt("_nmt", Integer.parseInt(string6));
                }
                catch (final NumberFormatException ex) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", (Throwable)ex);
                }
            }
            String string7 = s2;
            if (((BaseBundle)bundle2).containsKey("google.c.a.udt")) {
                string7 = ((BaseBundle)bundle2).getString("google.c.a.udt");
            }
            if (string7 != null) {
                try {
                    ((BaseBundle)bundle3).putInt("_ndt", Integer.parseInt(string7));
                }
                catch (final NumberFormatException ex2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", (Throwable)ex2);
                }
            }
            String s3;
            if (uti.f(bundle2)) {
                s3 = "display";
            }
            else {
                s3 = "data";
            }
            if ("_nr".equals(s) || "_nf".equals(s)) {
                ((BaseBundle)bundle3).putString("_nmc", s3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Logging to scion event=");
                sb.append(s);
                sb.append(" scionPayload=");
                sb.append(bundle3);
                Log.d("FirebaseMessaging", sb.toString());
            }
            final rz rz = (rz)yza.c().b((Class)rz.class);
            if (rz != null) {
                rz.b("fcm", s, bundle3);
            }
            else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        }
        catch (final IllegalStateException ex3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }
    
    public static boolean b(final Intent intent) {
        boolean equals;
        final boolean b = equals = false;
        if (intent != null) {
            if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                equals = b;
            }
            else {
                final Bundle extras = intent.getExtras();
                if (extras == null) {
                    equals = b;
                }
                else {
                    equals = "1".equals(((BaseBundle)extras).getString("google.c.a.e"));
                }
            }
        }
        return equals;
    }
}
