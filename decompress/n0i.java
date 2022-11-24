import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0i extends dd
{
    public final String a;
    public final long b;
    public final String c;
    
    public n0i(final asc asc) {
        final btc n = asc.n;
        String r;
        if ((r = n.r) == null) {
            r = "";
        }
        this.a = r;
        this.b = n.q;
        this.c = n.x;
    }
    
    @Override
    public final JSONObject b() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("mimeType", (Object)this.a);
        jsonObject.put("size", this.b);
        jsonObject.put("text", (Object)this.c);
        jsonObject.put("comment", (Object)null);
        return jsonObject;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && n0i.class == o.getClass()) {
            final n0i n0i = (n0i)o;
            if (this.b != n0i.b || !this.a.equals(n0i.a) || !Objects.equals(this.c, n0i.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.i((Object)null, (Object)this.a, (Object)this.b, (Object)this.c);
    }
}
