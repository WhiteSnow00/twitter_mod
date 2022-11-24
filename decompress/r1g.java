import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class r1g
{
    public final long a;
    public long b;
    public final UserIdentifier c;
    public final icu d;
    public final String e;
    public final String f;
    public final String g;
    public String h;
    public String i;
    
    public r1g(final String e) {
        this.b = -1L;
        this.e = e;
        final icu d = icu.d();
        this.d = d;
        this.a = d.b();
        this.c = UserIdentifier.getCurrent();
        this.f = ((Enum)fdi.d().f()).name();
        this.g = kes.a().b();
    }
    
    public static long d(final long n, final long n2) {
        if (n != -1L && n2 != -1L && n2 <= n) {
            return n - n2;
        }
        return -1L;
    }
    
    public final void a() {
        this.b = this.d.b();
        this.h = ((Enum)fdi.d().f()).name();
        this.i = kes.a().b();
        final Map<String, String> b = this.b();
        if (ita.b().b("scribe_livepipeline_events_enabled", false)) {
            final kkg t = kkg.t();
            t.w((Object)"total_time", (Object)Long.toString(this.c()));
            t.w((Object)"start_network_quality", (Object)this.f);
            t.w((Object)"end_network_quality", (Object)this.h);
            t.w((Object)"start_network_type", (Object)this.g);
            t.w((Object)"end_network_type", (Object)this.i);
            t.w((Object)"year_class", (Object)Integer.toString(nv8.m().a()));
            t.x((Map)b);
            final Map map = (Map)((z4j)t).e();
            final fg4 fg4 = new fg4(this.c);
            ((o1p)fg4).q(new String[] { this.e });
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
                    fg4.F0 = jsonObject.toString();
                    break Label_0260;
                }
                final JSONException ex;
                r9a.d((Throwable)ex);
            }
            sbw.b((tlm)fg4);
        }
    }
    
    public abstract Map<String, String> b();
    
    public final long c() {
        return d(this.b, this.a);
    }
}
