import java.io.InputStream;
import java.io.Serializable;
import java.io.Closeable;
import java.io.FileInputStream;
import java.util.Collections;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import java.util.Iterator;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Map;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y8h
{
    public static final Charset b;
    public final nxa a;
    
    static {
        b = Charset.forName("UTF-8");
    }
    
    public y8h(final nxa a) {
        this.a = a;
    }
    
    public static Map<String, String> a(String optString) throws JSONException {
        final JSONObject jsonObject = new JSONObject(optString);
        final HashMap hashMap = new HashMap();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            final boolean null = jsonObject.isNull(s);
            optString = null;
            if (!null) {
                optString = jsonObject.optString(s, (String)null);
            }
            hashMap.put(s, optString);
        }
        return hashMap;
    }
    
    public static void d(final File file) {
        if (file.exists() && file.delete()) {
            final StringBuilder j = fu8.j("Deleted corrupt file: ");
            j.append(file.getAbsolutePath());
            Log.i("FirebaseCrashlytics", j.toString(), (Throwable)null);
        }
    }
    
    public final Map<String, String> b(String s, final boolean b) {
        Serializable s2;
        if (b) {
            s2 = this.a.h(s, "internal-keys");
        }
        else {
            s2 = this.a.h(s, "keys");
        }
        if (!((File)s2).exists() || ((File)s2).length() == 0L) {
            d((File)s2);
            return Collections.emptyMap();
        }
        final Throwable t = null;
        Label_0140: {
            InputStream inputStream;
            try {
                inputStream = (InputStream)(s = (String)new FileInputStream((File)s2));
                try {
                    try {
                        final Map<String, String> a = a(yw4.n(inputStream));
                        yw4.a((Closeable)inputStream, "Failed to close user metadata file.");
                        return a;
                    }
                    finally {
                        s2 = s;
                    }
                }
                catch (final Exception t) {}
            }
            catch (final Exception t) {
                inputStream = null;
            }
            finally {
                s2 = t;
                break Label_0140;
            }
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", t);
            d((File)s2);
            yw4.a((Closeable)inputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
        yw4.a((Closeable)s2, "Failed to close user metadata file.");
    }
    
    public final String c(String s) {
        final File h = this.a.h(s, "user-data");
        final boolean exists = h.exists();
        InputStream inputStream = null;
        if (!exists || h.length() == 0L) {
            s = hmg.h("No userId set for session ", s);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", s, (Throwable)null);
            }
            d(h);
            return null;
        }
        Label_0259: {
            InputStream inputStream2 = null;
            Closeable closeable;
            try {
                inputStream2 = (inputStream = new FileInputStream(h));
                try {
                    try {
                        final JSONObject jsonObject = new JSONObject(yw4.n(inputStream2));
                        String optString;
                        if (!jsonObject.isNull("userId")) {
                            optString = jsonObject.optString("userId", (String)null);
                        }
                        else {
                            optString = null;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Loaded userId ");
                        sb.append(optString);
                        sb.append(" for session ");
                        sb.append(s);
                        s = sb.toString();
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", s, (Throwable)null);
                        }
                        yw4.a((Closeable)inputStream2, "Failed to close user metadata file.");
                        return optString;
                    }
                    finally {}
                }
                catch (final Exception inputStream) {
                    inputStream2 = inputStream;
                }
            }
            catch (final Exception inputStream2) {
                closeable = null;
            }
            finally {
                break Label_0259;
            }
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", (Throwable)inputStream2);
            d(h);
            yw4.a(closeable, "Failed to close user metadata file.");
            return null;
        }
        yw4.a((Closeable)inputStream, "Failed to close user metadata file.");
    }
}
