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

public final class l0i extends cd
{
    public static final Set<String> g;
    public final asc$b e;
    public final String f;
    
    static {
        g = aop.t((Object)"timezone", (Object[])new String[] { "accept", "accept-encoding", "x-twitter-client-version", "twitter-display-size", "accept-language" });
    }
    
    public l0i(final asc asc) {
        this.e = asc.b;
        this.f = asc.c.toString();
        super.c = asc.u[0];
        super.b = asc.g();
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<String, V> entry : ((HashMap<Object, Object>)asc.m).entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList((Collection<?>)entry.getValue()));
        }
        final Map a = nuh.a(hashMap.size());
        for (final Map.Entry<String, V> entry2 : hashMap.entrySet()) {
            final String s = entry2.getKey();
            if (l0i.g.contains(s.toLowerCase(Locale.US))) {
                ((HashMap<String, List>)a).put(s, (List)entry2.getValue());
            }
        }
        this.c(a);
    }
    
    @Override
    public final JSONObject b() throws JSONException {
        final JSONObject b = super.b();
        b.put("postData", (Object)null);
        b.put("method", (Object)((Enum)this.e).name());
        b.put("url", (Object)this.f);
        b.put("queryString", (Object)new JSONArray());
        return b;
    }
}
