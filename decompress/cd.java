import java.util.Map;
import org.json.JSONException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cd extends dd
{
    public long a;
    public long b;
    public asc$a c;
    public final List<k0i> d;
    
    public cd() {
        this.a = -1L;
        this.b = -1L;
        this.c = asc$a.H0;
        this.d = new LinkedList();
    }
    
    @Override
    public JSONObject b() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("cookies", (Object)new JSONArray());
        final LinkedList d = this.d;
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)((k0i)iterator.next()).b());
        }
        jsonObject.put("headers", (Object)jsonArray);
        jsonObject.put("headersSize", this.a);
        jsonObject.put("bodySize", this.b);
        jsonObject.put("comment", (Object)null);
        jsonObject.put("httpVersion", (Object)this.c.F0);
        return jsonObject;
    }
    
    public final void c(final Map<String, List<String>> map) {
        long a;
        long n = a = 0L;
        if (map != null) {
            final Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
            while (true) {
                a = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<String, V> entry = iterator.next();
                String a2;
                if ((a2 = entry.getKey()) == null) {
                    a2 = "";
                }
                final long n2 = a2.length() + 3;
                final List list = (List)entry.getValue();
                if (list != null) {
                    n += (n2 + 1L) * list.size();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        String b;
                        if ((b = (String)iterator2.next()) == null) {
                            b = "";
                        }
                        final k0i k0i = new k0i();
                        k0i.a = a2;
                        k0i.b = b;
                        this.d.add(k0i);
                        n += b.length();
                    }
                }
                else {
                    n += n2;
                }
            }
        }
        this.a = a;
    }
}
