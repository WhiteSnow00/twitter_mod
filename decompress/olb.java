import android.annotation.SuppressLint;
import com.twitter.util.user.UserIdentifier$Companion;
import com.twitter.database.schema.TwitterSchema;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olb extends d2v<tmi>
{
    public static final olb.olb$a Companion;
    public final String j1;
    public final String k1;
    public final Map<String, String> l1;
    public final cxs m1;
    public final vav n1;
    
    static {
        Companion = new olb.olb$a();
    }
    
    public olb(final UserIdentifier userIdentifier, final String s, final cxs m1, String string) {
        czd.f((Object)userIdentifier, "owner");
        czd.f((Object)s, "url");
        czd.f((Object)m1, "item");
        super(userIdentifier, 0);
        this.j1 = string;
        final Uri parse = Uri.parse(s);
        czd.e((Object)parse, "parse(this)");
        final Set b = a6w.b;
        string = parse.buildUpon().query((String)null).fragment((String)null).build().toString();
        czd.e((Object)string, "stripQueryAndFragment(url.toUri()).toString()");
        this.k1 = string;
        final Uri parse2 = Uri.parse(s);
        czd.e((Object)parse2, "parse(this)");
        this.l1 = a6w.i(parse2);
        this.m1 = m1;
        final vav c2 = vav.c2(userIdentifier);
        czd.e((Object)c2, "get(owner)");
        this.n1 = c2;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        for (final Map.Entry<String, V> entry : this.l1.entrySet()) {
            final String s = entry.getKey();
            final String s2 = (String)entry.getValue();
            czd.c((Object)s);
            czd.c((Object)s2);
            ((tqc$a)mcv).d(s, s2);
        }
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).m(this.k1);
        return ((tqc$a)mcv).k();
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)new vge();
    }
    
    @SuppressLint({ "MissingPropagatedAnnotation" })
    public final void n0(final xrc<tmi, kbv> xrc) {
        final cxs m1 = this.m1;
        czd.d((Object)m1, "null cannot be cast to non-null type com.twitter.model.timeline.TimelineNotificationItem");
        final o0t o0t = (o0t)m1;
        final fpi k = ((o0t)this.m1).k;
        czd.e((Object)k, "timelineItem.notification");
        final psi i = o0t.k.i;
        czd.c((Object)i);
        psi j;
        if (!czd.a((Object)this.j1, (Object)"LIKE") && !czd.a((Object)this.j1, (Object)"REVERTED_LIKE")) {
            String a = i.a;
            if (a == null) {
                a = "";
            }
            j = new psi(a, this.j1, i.c, i.d, i.e, i.f);
        }
        else {
            final String j2 = this.j1;
            String b = i.b;
            if (b == null) {
                b = "";
            }
            j = new psi(j2, b, i.c, i.d, i.e, i.f);
        }
        final fpi$a fpi$a = new fpi$a();
        fpi$a.a = k.a;
        fpi$a.b = k.b;
        fpi$a.c = k.c;
        fpi$a.d = k.d;
        fpi$a.e = k.e;
        fpi$a.f = k.f;
        fpi$a.g = k.g;
        fpi$a.k = k.k;
        fpi$a.l = k.l;
        fpi$a.h = k.h;
        fpi$a.i = j;
        final fpi fpi = (fpi)((n4j)fpi$a).e();
        final vav n1 = this.n1;
        final o0t o0t2 = (o0t)this.m1;
        Objects.requireNonNull(n1);
        final StringBuilder sb = new StringBuilder();
        sb.append("updateForwardFeedback: ");
        sb.append(o0t2);
        sb.append(" notification: ");
        sb.append(fpi);
        s9g.a("DatabaseHelper", sb.toString());
        final long a2 = ((cxs)o0t2).a;
        final f60 c = ((two)((np1)n1).T()).b((Class)o9t.class).c();
        ((o9t$a)c.a).k(vav.i4((Object)fpi, (rlp)fpi.m));
        c.e(itl.b("_id", (Object)a2));
        final o0t o0t3 = (o0t)this.m1;
        final String j3 = this.j1;
        final int hashCode = j3.hashCode();
        String s = null;
        Label_0560: {
            if (hashCode != -1905342203) {
                if (hashCode != -1531093805) {
                    if (hashCode == 2336663) {
                        if (j3.equals("LIKE")) {
                            s = "inline_feedback_like";
                            break Label_0560;
                        }
                    }
                }
                else if (j3.equals("REVERTED_LIKE")) {
                    s = "inline_feedback_reverted_like";
                    break Label_0560;
                }
            }
            else if (j3.equals("DISLIKE")) {
                s = "inline_feedback_dislike";
                break Label_0560;
            }
            s = "inline_feedback_reverted_dislike";
        }
        czd.f((Object)o0t3, "item");
        final h0p l = ((cxs)o0t3).j;
        if (l != null) {
            String g = l.g;
            if (g == null) {
                g = "";
            }
            czd.c((Object)l);
            String f = l.f;
            if (f == null) {
                f = "";
            }
            final fca a3 = fca.a();
            final UserIdentifier$Companion companion = UserIdentifier.Companion;
            final UserIdentifier c2 = companion.c();
            final af4 af4 = new af4(companion.c());
            ((u0p)af4).T = vba.Companion.e("ntab", "all", f, g, s).toString();
            final int a4 = c5j.a;
            ((u0p)af4).i((j0p)rqv.a(((cxs)o0t3).j));
            a3.b(c2, (elm)af4);
        }
    }
}
