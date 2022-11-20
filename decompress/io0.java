import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class io0 extends ad
{
    public final int c;
    public final int d;
    public final String e;
    
    public io0(final int c, final int d, final String e) {
        super(1);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final JSONObject b() throws JSONException {
        synchronized (this) {
            final JSONObject b = super.b();
            b.put("appState", (Object)go0.E(this.c));
            b.put("appStateType", (Object)ho0.B(this.d));
            b.put("sourceName", (Object)this.e);
            return b;
        }
    }
}
