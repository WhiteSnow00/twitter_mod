import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0i extends dd
{
    public String a;
    public String b;
    
    @Override
    public final JSONObject b() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", (Object)this.a);
        jsonObject.put("value", (Object)this.b);
        jsonObject.put("comment", (Object)null);
        return jsonObject;
    }
}
