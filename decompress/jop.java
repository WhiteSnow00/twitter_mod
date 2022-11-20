import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jop
{
    public final yvl a;
    
    public jop(final yvl a) {
        this.a = a;
    }
    
    public final wnp a(final JSONObject jsonObject) throws JSONException {
        final int int1 = jsonObject.getInt("settings_version");
        Object o;
        if (int1 != 3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not determine SettingsJsonTransform for settings version ");
            sb.append(int1);
            sb.append(". Using default settings values.");
            Log.e("FirebaseCrashlytics", sb.toString(), (Throwable)null);
            o = new pj8();
        }
        else {
            o = new vqp();
        }
        return ((kop)o).a(this.a, jsonObject);
    }
}
