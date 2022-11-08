import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tzh extends dd
{
    public static final Set<String> g;
    public final xrc$b e;
    public final String f;
    
    static {
        g = nmp.t((Object)"timezone", (Object[])new String[] { "accept", "accept-encoding", "x-twitter-client-version", "twitter-display-size", "accept-language" });
    }
    
    public tzh(final xrc xrc) {
        this.e = xrc.b;
        this.f = xrc.c.toString();
        super.c = xrc.u[0];
        super.b = xrc.g();
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<String, V> entry : ((HashMap<Object, Object>)xrc.m).entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList((Collection<?>)entry.getValue()));
        }
        final Map a = tth.a(hashMap.size());
        for (final Map.Entry<String, V> entry2 : hashMap.entrySet()) {
            final String s = entry2.getKey();
            if (tzh.g.contains(s.toLowerCase(Locale.US))) {
                ((HashMap<String, List>)a).put(s, (List)entry2.getValue());
            }
        }
        this.c(a);
    }
    
    public final JSONObject b() throws JSONException {
        final JSONObject b = super.b();
        b.put("postData", (Object)null);
        b.put("method", (Object)((Enum)this.e).name());
        b.put("url", (Object)this.f);
        b.put("queryString", (Object)new JSONArray());
        return b;
    }
}
