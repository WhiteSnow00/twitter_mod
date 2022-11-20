import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qxp extends ok1
{
    public static final String R0;
    public static final String S0;
    
    static {
        final StringBuilder j = fu8.j(" (_id INTEGER PRIMARY KEY,log_type TEXT DEFAULT \"");
        j.append(p8g.E0);
        j.append("\",");
        j.append("category");
        j.append(" TEXT,");
        nb0.z(j, "log", " BLOB,", "request_id", " TEXT DEFAULT \"0\",");
        final String c = mb0.C(j, "retry_count", " INT DEFAULT 0, ", "timestamp", " INT DEFAULT (CAST(STRFTIME('%s','now') AS INT)))");
        R0 = hmg.h("CREATE TABLE scribe", c);
        S0 = hmg.h("CREATE TABLE scribe_temp", c);
    }
    
    public qxp(final Context context, final UserIdentifier userIdentifier, final dfv$b dfv$b, final bbb bbb, final qbu qbu, final xk0 xk0) {
        final StringBuilder sb = new StringBuilder();
        sb.append(userIdentifier.getId());
        sb.append("-");
        sb.append("scribe");
        super(context, sb.toString(), 3, dfv$b, userIdentifier, bbb, qbu, xk0);
    }
    
    public final void O(final hpo<lzr> hpo) {
        v68.p(this.G2(), (qsb)new pxp((Object)hpo, 0), (qsb)new oxp((Object)this, 0));
    }
    
    public final void b(final lzr lzr, final int n, final int n2) {
        if (n == 1) {
            final bik bik = (bik)lzr;
            bik.x("DROP TABLE scribe;");
            bik.x(qxp.R0);
        }
        if (n == 2) {
            final bik bik2 = (bik)lzr;
            bik2.G0();
            bik2.x(qxp.S0);
            bik2.x("INSERT INTO scribe_temp(_id, log_type, category, log, request_id, retry_count) SELECT * FROM scribe;");
            bik2.x("DROP TABLE scribe;");
            bik2.x("ALTER TABLE scribe_temp RENAME TO scribe;");
            bik2.z();
            bik2.A();
        }
    }
    
    public final void e(final lzr lzr) {
        ((bik)lzr).x(qxp.R0);
    }
    
    public final void f(final lzr lzr, final int n, final int n2) {
        wk0.b().a();
        m8a.b().a.h("database_migration", (Object)zjf.h("Downgrade from ", n, " to ", n2));
        final bik bik = (bik)lzr;
        bik.x("DROP TABLE scribe;");
        bik.x(qxp.R0);
    }
}
