import org.json.JSONException;
import org.json.JSONObject;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import j$.util.DesugarTimeZone;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dd
{
    public static String a(final Date date) {
        final TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }
    
    public abstract JSONObject b() throws JSONException;
    
    @Override
    public final String toString() {
        try {
            return this.b().toString(3);
        }
        catch (final JSONException ex) {
            throw new AssertionError(ex);
        }
    }
}
