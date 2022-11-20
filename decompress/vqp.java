import org.json.JSONException;
import java.util.Objects;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vqp implements kop
{
    @Override
    public final wnp a(final yvl yvl, final JSONObject jsonObject) throws JSONException {
        jsonObject.optInt("settings_version", 0);
        final int optInt = jsonObject.optInt("cache_duration", 3600);
        final double optDouble = jsonObject.optDouble("on_demand_upload_rate_per_minute", 10.0);
        final double optDouble2 = jsonObject.optDouble("on_demand_backoff_base", 1.2);
        final int optInt2 = jsonObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        wnp$b wnp$b;
        if (jsonObject.has("session")) {
            wnp$b = new wnp$b(jsonObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        }
        else {
            wnp$b = new wnp$b(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        final JSONObject jsonObject2 = jsonObject.getJSONObject("features");
        final wnp$a wnp$a = new wnp$a(jsonObject2.optBoolean("collect_reports", true), jsonObject2.optBoolean("collect_anrs", false));
        final long n = optInt;
        long optLong;
        if (jsonObject.has("expires_at")) {
            optLong = jsonObject.optLong("expires_at");
        }
        else {
            Objects.requireNonNull(yvl);
            optLong = n * 1000L + System.currentTimeMillis();
        }
        return new wnp(optLong, wnp$b, wnp$a, optDouble, optDouble2, optInt2);
    }
}
