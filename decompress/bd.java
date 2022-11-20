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

public abstract class bd extends cd
{
    public long a;
    public long b;
    public arc$a c;
    public final List<tzh> d;
    
    public bd() {
        this.a = -1L;
        this.b = -1L;
        this.c = arc$a.F0;
        this.d = new LinkedList();
    }
    
    public JSONObject b() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("cookies", (Object)new JSONArray());
        final LinkedList d = this.d;
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)((tzh)iterator.next()).b());
        }
        jsonObject.put("headers", (Object)jsonArray);
        jsonObject.put("headersSize", this.a);
        jsonObject.put("bodySize", this.b);
        jsonObject.put("comment", (Object)null);
        jsonObject.put("httpVersion", (Object)this.c.D0);
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
                        final tzh tzh = new tzh();
                        tzh.a = a2;
                        tzh.b = b;
                        this.d.add(tzh);
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
