import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class t0g
{
    public final long a;
    public long b;
    public final UserIdentifier c;
    public final sbu d;
    public final String e;
    public final String f;
    public final String g;
    public String h;
    public String i;
    
    public t0g(final String e) {
        this.b = -1L;
        this.e = e;
        final sbu d = sbu.d();
        this.d = d;
        this.a = d.b();
        this.c = UserIdentifier.getCurrent();
        this.f = ((Enum)oci.d().f()).name();
        this.g = sds.a().b();
    }
    
    public static long d(final long n, final long n2) {
        if (n != -1L && n2 != -1L && n2 <= n) {
            return n - n2;
        }
        return -1L;
    }
    
    public final void a() {
        this.b = this.d.b();
        this.h = ((Enum)oci.d().f()).name();
        this.i = sds.a().b();
        final Map<String, String> b = this.b();
        if (asa.b().b("scribe_livepipeline_events_enabled", false)) {
            final qjg t = qjg.t();
            t.w((Object)"total_time", (Object)Long.toString(this.c()));
            t.w((Object)"start_network_quality", (Object)this.f);
            t.w((Object)"end_network_quality", (Object)this.h);
            t.w((Object)"start_network_type", (Object)this.g);
            t.w((Object)"end_network_type", (Object)this.i);
            t.w((Object)"year_class", (Object)Integer.toString(h91.d().a()));
            t.x((Map)b);
            final Map map = (Map)((n4j)t).e();
            final af4 af4 = new af4(this.c);
            ((u0p)af4).q(new String[] { this.e });
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
                    af4.F0 = jsonObject.toString();
                    break Label_0260;
                }
                final JSONException ex;
                m8a.d((Throwable)ex);
            }
            cbw.b((elm)af4);
        }
    }
    
    public abstract Map<String, String> b();
    
    public final long c() {
        return d(this.b, this.a);
    }
}
