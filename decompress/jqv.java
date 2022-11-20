import org.json.JSONException;
import org.json.JSONObject;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class jqv extends nqv
{
    public final String E1;
    public final pqv F1;
    public final long G1;
    
    public jqv(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final String s, final pqv f1, final bba k0, final String e1, final vav vav, final long g1) {
        super(context, userIdentifier, userIdentifier2, n, 1, (yov)a83.b, s, f1, vav);
        this.E1 = e1;
        this.F1 = f1;
        this.G1 = g1;
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = k0;
    }
    
    public final g7c r0() {
        Label_0137: {
            if (!Objects.equals(this.F1.a("useGraphQLReactivity"), "true")) {
                break Label_0137;
            }
            final JSONObject jsonObject = new JSONObject(this.F1.a);
            try {
                final String string = Long.toString(this.G1);
                jsonObject.put("sortIndex", (Object)string);
                jsonObject.put("sort_index", (Object)string);
                final g7c$a g7c$a = new g7c$a();
                g7c$a.a = "bonus_follow_timeline";
                g7c$a.b = new f7c(new String[] { "timeline_response", "timeline" });
                ((qjg)g7c$a.c).w((Object)"context", (Object)jsonObject.toString());
                ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
                return (g7c)((n4j)g7c$a).e();
                return null;
            }
            catch (final JSONException ex) {
                return null;
            }
        }
    }
    
    public zvl s0() {
        final zvl$a zvl$a = new zvl$a();
        zvl$a.a = "/2/timeline/reactive.json";
        ((qjg)zvl$a.b).w((Object)"entry_id", (Object)this.E1);
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        return false;
    }
}
