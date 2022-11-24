import android.os.BaseBundle;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Arrays;
import android.content.res.Resources;
import org.json.JSONException;
import org.json.JSONArray;
import android.util.Log;
import android.text.TextUtils;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lui
{
    public final Bundle a;
    
    public lui(final Bundle bundle) {
        this.a = new Bundle(bundle);
    }
    
    public static boolean f(final Bundle bundle) {
        return "1".equals(((BaseBundle)bundle).getString("gcm.n.e")) || "1".equals(((BaseBundle)bundle).getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }
    
    public static String h(final String s) {
        String substring = s;
        if (s.startsWith("gcm.n.")) {
            substring = s.substring(6);
        }
        return substring;
    }
    
    public final boolean a(String e) {
        e = this.e(e);
        return "1".equals(e) || Boolean.parseBoolean(e);
    }
    
    public final Integer b(final String s) {
        final String e = this.e(s);
        if (!TextUtils.isEmpty((CharSequence)e)) {
            try {
                return Integer.parseInt(e);
            }
            catch (final NumberFormatException ex) {
                final StringBuilder f = ehk.f("Couldn't parse value of ");
                f.append(h(s));
                f.append("(");
                f.append(e);
                f.append(") into an int");
                Log.w("NotificationParams", f.toString());
            }
        }
        return null;
    }
    
    public final JSONArray c(final String s) {
        final String e = this.e(s);
        if (!TextUtils.isEmpty((CharSequence)e)) {
            try {
                return new JSONArray(e);
            }
            catch (final JSONException ex) {
                final StringBuilder f = ehk.f("Malformed JSON for key ");
                f.append(h(s));
                f.append(": ");
                f.append(e);
                f.append(", falling back to default");
                Log.w("NotificationParams", f.toString());
            }
        }
        return null;
    }
    
    public final String d(final Resources resources, String o, final String s) {
        final String e = this.e(s);
        if (!TextUtils.isEmpty((CharSequence)e)) {
            return e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("_loc_key");
        final String e2 = this.e(sb.toString());
        final boolean empty = TextUtils.isEmpty((CharSequence)e2);
        final String s2 = null;
        String s3;
        if (empty) {
            s3 = s2;
        }
        else {
            final int identifier = resources.getIdentifier(e2, "string", (String)o);
            if (identifier == 0) {
                final StringBuilder sb2 = new StringBuilder();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(s);
                sb3.append("_loc_key");
                sb2.append(h(sb3.toString()));
                sb2.append(" resource not found: ");
                sb2.append(s);
                sb2.append(" Default value will be used.");
                Log.w("NotificationParams", sb2.toString());
                s3 = s2;
            }
            else {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(s);
                sb4.append("_loc_args");
                final JSONArray c = this.c(sb4.toString());
                if (c == null) {
                    o = null;
                }
                else {
                    final int length = c.length();
                    final String[] array = new String[length];
                    int n = 0;
                    while (true) {
                        o = array;
                        if (n >= length) {
                            break;
                        }
                        array[n] = c.optString(n);
                        ++n;
                    }
                }
                if (o == null) {
                    s3 = resources.getString(identifier);
                }
                else {
                    try {
                        s3 = resources.getString(identifier, (Object[])o);
                    }
                    catch (final MissingFormatArgumentException ex) {
                        final StringBuilder f = ehk.f("Missing format argument for ");
                        f.append(h(s));
                        f.append(": ");
                        f.append(Arrays.toString((Object[])o));
                        f.append(" Default value will be used.");
                        Log.w("NotificationParams", f.toString(), (Throwable)ex);
                        s3 = s2;
                    }
                }
            }
        }
        return s3;
    }
    
    public final String e(final String s) {
        final Bundle a = this.a;
        String s2 = s;
        if (!((BaseBundle)a).containsKey(s)) {
            s2 = s;
            if (s.startsWith("gcm.n.")) {
                String replace;
                if (!s.startsWith("gcm.n.")) {
                    replace = s;
                }
                else {
                    replace = s.replace("gcm.n.", "gcm.notification.");
                }
                s2 = s;
                if (((BaseBundle)this.a).containsKey(replace)) {
                    s2 = replace;
                }
            }
        }
        return ((BaseBundle)a).getString(s2);
    }
    
    public final Bundle g() {
        final Bundle bundle = new Bundle(this.a);
        for (final String s : ((BaseBundle)this.a).keySet()) {
            if (!s.startsWith("google.c.a.") && !s.equals("from")) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
}
