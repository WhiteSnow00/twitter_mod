import android.os.BaseBundle;
import android.util.Log;
import org.json.JSONException;
import java.util.Iterator;
import org.json.JSONObject;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rd2 implements d00, wd2
{
    public td2 D0;
    
    public static String b(final String s, final Bundle bundle) throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        final JSONObject jsonObject2 = new JSONObject();
        for (final String s2 : ((BaseBundle)bundle).keySet()) {
            jsonObject2.put(s2, ((BaseBundle)bundle).get(s2));
        }
        jsonObject.put("name", (Object)s);
        jsonObject.put("parameters", (Object)jsonObject2);
        return jsonObject.toString();
    }
    
    public final void a(final String s, final Bundle bundle) {
        final td2 d0 = this.D0;
        if (d0 != null) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append("$A$:");
                sb.append(b(s, bundle));
                d0.a(sb.toString());
            }
            catch (final JSONException ex) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", (Throwable)null);
            }
        }
    }
    
    public final void d(final td2 d0) {
        this.D0 = d0;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", (Throwable)null);
        }
    }
}
