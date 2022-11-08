import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zwp extends tk1
{
    public static final String Q0;
    public static final String R0;
    
    static {
        final StringBuilder g = w48.g(" (_id INTEGER PRIMARY KEY,log_type TEXT DEFAULT \"");
        g.append(xpa.s(1));
        g.append("\",");
        g.append("category");
        g.append(" TEXT,");
        g.append("log");
        mag.m(g, " BLOB,", "request_id", " TEXT DEFAULT \"0\",", "retry_count");
        final String b = xa0.B(g, " INT DEFAULT 0, ", "timestamp", " INT DEFAULT (CAST(STRFTIME('%s','now') AS INT)))");
        Q0 = l7k.c("CREATE TABLE scribe", b);
        R0 = l7k.c("CREATE TABLE scribe_temp", b);
    }
    
    public zwp(final Context context, final UserIdentifier userIdentifier, final iev$b iev$b, final ecb ecb, final xau xau, final cl0 cl0) {
        final StringBuilder sb = new StringBuilder();
        sb.append(userIdentifier.getId());
        sb.append("-");
        sb.append("scribe");
        super(context, sb.toString(), 3, iev$b, userIdentifier, ecb, xau, cl0);
    }
    
    public final void P(final poo<tyr> poo) {
        x3j.v(this.H2(), (rtb)new ywp((Object)poo, 0), (rtb)new xwp((Object)this, 0));
    }
    
    public final void b(final tyr tyr, final int n, final int n2) {
        if (n == 1) {
            final vhk vhk = (vhk)tyr;
            vhk.x("DROP TABLE scribe;");
            vhk.x(zwp.Q0);
        }
        if (n == 2) {
            final vhk vhk2 = (vhk)tyr;
            vhk2.H0();
            vhk2.x(zwp.R0);
            vhk2.x("INSERT INTO scribe_temp(_id, log_type, category, log, request_id, retry_count) SELECT * FROM scribe;");
            vhk2.x("DROP TABLE scribe;");
            vhk2.x("ALTER TABLE scribe_temp RENAME TO scribe;");
            vhk2.A();
            vhk2.B();
        }
    }
    
    public final void e(final tyr tyr) {
        ((vhk)tyr).x(zwp.Q0);
    }
    
    public final void f(final tyr tyr, final int n, final int n2) {
        bl0.a().a();
        e9a.b().a.h("database_migration", (Object)hi.H("Downgrade from ", n, " to ", n2));
        final vhk vhk = (vhk)tyr;
        vhk.x("DROP TABLE scribe;");
        vhk.x(zwp.Q0);
    }
}
