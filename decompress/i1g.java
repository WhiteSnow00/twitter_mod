import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class i1g
{
    public final long a;
    public long b;
    public final UserIdentifier c;
    public final zau d;
    public final String e;
    public final String f;
    public final String g;
    public String h;
    public String i;
    
    public i1g(final String e) {
        this.b = -1L;
        this.e = e;
        final zau d = zau.d();
        this.d = d;
        this.a = d.b();
        this.c = UserIdentifier.getCurrent();
        this.f = ((Enum)mci.d().f()).name();
        this.g = xcs.a().b();
    }
    
    public static long d(final long n, final long n2) {
        if (n != -1L && n2 != -1L && n2 <= n) {
            return n - n2;
        }
        return -1L;
    }
    
    public final void a() {
        this.b = this.d.b();
        this.h = ((Enum)mci.d().f()).name();
        this.i = xcs.a().b();
        final Map<String, String> b = this.b();
        if (dta.b().b("scribe_livepipeline_events_enabled", false)) {
            final sjg t = sjg.t();
            t.w((Object)"total_time", (Object)Long.toString(this.c()));
            t.w((Object)"start_network_quality", (Object)this.f);
            t.w((Object)"end_network_quality", (Object)this.h);
            t.w((Object)"start_network_type", (Object)this.g);
            t.w((Object)"end_network_type", (Object)this.i);
            t.w((Object)"year_class", (Object)Integer.toString(xa0.a().a()));
            t.x((Map)b);
            final Map map = (Map)((h4j)t).e();
            final zf4 zf4 = new zf4(this.c);
            zf4.q(new String[] { this.e });
            Label_0260: {
                Label_0256: {
                    JSONObject jsonObject;
                    try {
                        jsonObject = new JSONObject();
                        for (final Map.Entry<String, V> entry : map.entrySet()) {
                            jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
                        }
                    }
                    catch (final JSONException ex) {
                        break Label_0256;
                    }
                    zf4.F0 = jsonObject.toString();
                    break Label_0260;
                }
                final JSONException ex;
                e9a.d((Throwable)ex);
            }
            saw.b((okm)zf4);
        }
    }
    
    public abstract Map<String, String> b();
    
    public final long c() {
        return d(this.b, this.a);
    }
}
