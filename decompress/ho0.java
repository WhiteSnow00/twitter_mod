import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ho0 extends bd
{
    public final int c;
    public final int d;
    public final String e;
    
    public ho0(final int c, final int d, final String e) {
        super(1);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final JSONObject b() throws JSONException {
        synchronized (this) {
            final JSONObject b = super.b();
            b.put("appState", (Object)wa0.B(this.c));
            b.put("appStateType", (Object)go0.F(this.d));
            b.put("sourceName", (Object)this.e);
            return b;
        }
    }
}
