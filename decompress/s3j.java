import java.util.List;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFollowedUsers;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s3j implements e4e<mjf, o2t$a>
{
    public final e4e<mjf, o2t$a> a;
    public final String b;
    public final String c;
    public final czr<Set<Long>> d;
    public final w1t e;
    
    public s3j(final e4e<mjf, o2t$a> a, final a4j a4j, final czr<Set<Long>> d, final nhw nhw) {
        final String d2 = a4j.d;
        final String e = a4j.e;
        final w1t k = nhw.k;
        this.a = a;
        this.b = d2;
        this.c = e;
        this.d = d;
        this.e = k;
    }
    
    public s3j(final e4e<mjf, o2t$a> a, final czr<Set<Long>> d, final String b, final String c, final w1t e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(Object o) {
        o = this.a.a((Object)o);
        final qjg$a qjg$a = new qjg$a(3);
        ((qjg)qjg$a).w((Object)"subtask_id", (Object)this.b);
        ((qjg)qjg$a).w((Object)"flow_token", (Object)this.c);
        final Set set = (Set)this.d.get();
        if (!set.isEmpty()) {
            final long[] h = fq4.H((Collection)set);
            final Pattern a = ikr.a;
            final StringBuilder sb = new StringBuilder();
            sb.append((CharSequence)"");
            final int length = h.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                final long n2 = h[i];
                if (++n > 1) {
                    sb.append((CharSequence)", ");
                }
                sb.append((CharSequence)String.valueOf(n2));
                ++i;
            }
            sb.append((CharSequence)"");
            final String string = sb.toString();
            czd.e((Object)string, "joinTo(StringBuilder(), \u2026ed, transform).toString()");
            ((qjg)qjg$a).w((Object)"follows", (Object)ikr.b.d((CharSequence)string, ""));
        }
        ((o2t$a)o).k = new pqv((Map)((n4j)qjg$a).e());
        try {
            ((o2t$a)o).o = this.b();
        }
        catch (final IOException ex) {
            m8a.d((Throwable)ex);
        }
        return o;
    }
    
    public final g7c b() throws IOException {
        if (this.e == null) {
            return null;
        }
        final Set set = (Set)this.d.get();
        String s;
        if (set.isEmpty()) {
            s = this.e.b;
        }
        else {
            final List u = rif.u((Iterable)set);
            final JsonFollowedUsers jsonFollowedUsers = new JsonFollowedUsers();
            jsonFollowedUsers.a = u;
            s = rih.a((Object)jsonFollowedUsers);
        }
        final qjg t = qjg.t();
        t.w((Object)"id", (Object)this.e.a);
        t.w((Object)"context", (Object)s);
        final Map map = (Map)((n4j)t).e();
        final g7c$a g7c$a = new g7c$a();
        g7c$a.b = new f7c(new String[] { "timeline_response", "timeline" });
        g7c$a.a = "timeline_by_id_query";
        ((qjg)g7c$a.c).x(map);
        return (g7c)((n4j)g7c$a).e();
    }
}
