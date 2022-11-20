import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i67 extends ad
{
    public final String c;
    public final String d;
    public final String e;
    
    public i67(final String c, final String d, final Throwable t) {
        super(2);
        this.c = c;
        this.d = d;
        this.e = s9g.f(t);
    }
    
    public final JSONObject b() throws JSONException {
        synchronized (this) {
            final JSONObject b = super.b();
            b.put("errorTypeName", (Object)this.c);
            b.put("errorMessage", (Object)this.d);
            final String e = this.e;
            if (e != null) {
                b.put("stackTrace", (Object)e);
            }
            return b;
        }
    }
}
