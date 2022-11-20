import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afm extends d2v<g42>
{
    public final String j1;
    
    public afm(final UserIdentifier userIdentifier, final String j1) {
        super(userIdentifier, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        if (nza.o1()) {
            final p6c a = w1e.A("bookmark_delete");
            a.p("tweet_id", (Object)this.j1);
            return (tqc)((n4j)a).e();
        }
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a2 = c5j.a;
        ((tqc$a)mcv).n("1.1/bookmark/entries/remove.json", "/");
        ((tqc$a)mcv).d("tweet_id", this.j1);
        return ((tqc$a)mcv).k();
    }
    
    public final asc<g42, kbv> g0() {
        if (nza.o1()) {
            return (asc<g42, kbv>)e7c.Companion.b(g42.class, new String[0]);
        }
        return (asc<g42, kbv>)v8g.c((Class)g42.class);
    }
}
