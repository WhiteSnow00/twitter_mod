import org.json.JSONException;
import org.json.JSONObject;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uzh extends dd
{
    public vzh e;
    public String f;
    public int g;
    public String h;
    
    public uzh(final xrc xrc) {
        this.e = new vzh(xrc);
        final xsc n = xrc.n;
        this.g = n.a;
        String b;
        if ((b = n.b) == null) {
            b = "";
        }
        this.h = b;
        super.b = n.q;
        super.c = n.t;
        if (xrc.o) {
            final Object s = xrc.s;
            Map<Object, Object> map;
            if (s != null) {
                map = xrc.r(s);
            }
            else {
                map = Collections.emptyMap();
            }
            this.c((Map)map);
        }
        if (n.c != null) {
            final StringWriter stringWriter = new StringWriter();
            n.c.printStackTrace(new PrintWriter(stringWriter, true));
            this.f = stringWriter.getBuffer().toString();
        }
    }
    
    public final JSONObject b() throws JSONException {
        final JSONObject b = super.b();
        b.put("content", (Object)this.e.b());
        b.put("exception", (Object)this.f);
        b.put("redirectURL", (Object)"");
        b.put("status", this.g);
        b.put("statusText", (Object)this.h);
        return b;
    }
}
