import com.twitter.api.model.json.common.JsonTwitterErrors;
import java.io.IOException;
import com.twitter.model.json.timeline.urt.JsonTimelineResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqv extends wge<r2t, kbv>
{
    public final r2t$b G0;
    
    public hqv(final r2t$b g0) {
        this.G0 = g0;
    }
    
    public final Object a(final tge tge) throws IOException {
        w3c.g();
        try {
            final qhh qhh = (qhh)gih.f(tge, (Class)JsonTimelineResponse.class, false);
            Object t;
            if (qhh != null) {
                t = qhh.t();
            }
            else {
                t = null;
            }
            final int a = c5j.a;
            final r2t$a r2t$a = (r2t$a)t;
            r2t$a.c = this.G0;
            return ((n4j)r2t$a).e();
        }
        finally {
            w3c.h();
        }
    }
    
    public final Object b(final tge tge, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed with parse error on status-code: ");
        sb.append(n);
        s9g.k("URT_Parser_Reader", sb.toString());
        return kih.b((fih)gih.f(tge, (Class)JsonTwitterErrors.class, false));
    }
}
