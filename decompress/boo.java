import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import java.util.HashMap;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boo implements pda, s3s, cg4
{
    public static final j4a H0;
    public final kwo C0;
    public final mi4 D0;
    public final mi4 E0;
    public final qda F0;
    public final hxe<String> G0;
    
    static {
        H0 = new j4a("proto");
    }
    
    public boo(final mi4 d0, final mi4 e0, final qda f0, final kwo c0, final hxe<String> g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public static String i(final Iterable<k7k> iterable) {
        final StringBuilder sb = new StringBuilder("(");
        final Iterator<k7k> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().b());
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }
    
    public static <T> T j(final Cursor cursor, final boo.boo$a<Cursor, T> boo$a) {
        try {
            return (T)boo$a.apply((Object)cursor);
        }
        finally {
            cursor.close();
        }
    }
    
    @Override
    public final void D1(final Iterable<k7k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder g = w48.g("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        g.append(i(iterable));
        this.h((boo.boo$a<SQLiteDatabase, Object>)new zno((Object)this, (Object)g.toString(), (Object)"SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 0));
    }
    
    @Override
    public final void Y(final Iterable<k7k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder g = w48.g("DELETE FROM events WHERE _id in ");
        g.append(i(iterable));
        this.e().compileStatement(g.toString()).execute();
    }
    
    public final void a() {
        this.h((boo.boo$a<SQLiteDatabase, Object>)new cg8((Object)this, 2));
    }
    
    public final <T> T b(final s3s$a<T> s3s$a) {
        final SQLiteDatabase e = this.e();
        final g1r e2 = g1r.E0;
        final long b = this.E0.B();
        while (true) {
            try {
                e.beginTransaction();
                try {
                    final Object execute = s3s$a.execute();
                    e.setTransactionSuccessful();
                    return (T)execute;
                }
                finally {
                    e.endTransaction();
                }
            }
            catch (final SQLiteDatabaseLockedException ex) {
                if (this.E0.B() < this.F0.a() + b) {
                    SystemClock.sleep(50L);
                    continue;
                }
                e2.apply((Object)ex);
                throw null;
            }
            break;
        }
    }
    
    @Override
    public final Iterable<k7k> b0(final q0u q0u) {
        return this.h((boo.boo$a<SQLiteDatabase, Iterable<k7k>>)new wno((Object)this, (Object)q0u));
    }
    
    public final ng4 c() {
        final int e = ng4.e;
        final ng4$a ng4$a = new ng4$a();
        final HashMap hashMap = new HashMap();
        final SQLiteDatabase e2 = this.e();
        e2.beginTransaction();
        try {
            final ng4 ng4 = j(e2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), (boo.boo$a<Cursor, ng4>)new rno((Object)this, (Object)hashMap, (Object)ng4$a));
            e2.setTransactionSuccessful();
            return ng4;
        }
        finally {
            e2.endTransaction();
        }
    }
    
    public final void close() {
        ((SQLiteOpenHelper)this.C0).close();
    }
    
    public final void d(final long n, final n8g$a n8g$a, final String s) {
        this.h((boo.boo$a<SQLiteDatabase, Object>)new uno(s, n8g$a, n));
    }
    
    public final SQLiteDatabase e() {
        Object c0 = this.C0;
        Objects.requireNonNull(c0);
        final long b = this.E0.B();
        while (true) {
            try {
                final SQLiteDatabase writableDatabase = ((SQLiteOpenHelper)c0).getWritableDatabase();
                c0 = writableDatabase;
                return writableDatabase;
            }
            catch (final SQLiteDatabaseLockedException ex) {
                if (this.E0.B() < this.F0.a() + b) {
                    SystemClock.sleep(50L);
                    continue;
                }
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable)ex);
            }
            break;
        }
    }
    
    @Override
    public final k7k e3(final q0u q0u, final cca cca) {
        jag.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", q0u.d(), cca.h(), q0u.b());
        final long longValue = this.h((boo.boo$a<SQLiteDatabase, Long>)new zno((Object)this, (Object)cca, (Object)q0u, 1));
        if (longValue < 1L) {
            return null;
        }
        return (k7k)new rb1(longValue, q0u, cca);
    }
    
    public final Long f(final SQLiteDatabase sqLiteDatabase, final q0u q0u) {
        final StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(q0u.b(), String.valueOf(ezk.a(q0u.d()))));
        if (q0u.c() != null) {
            sb.append(" and extras = ?");
            list.add(Base64.encodeToString(q0u.c(), 0));
        }
        else {
            sb.append(" and extras is null");
        }
        return j(sqLiteDatabase.query("transport_contexts", new String[] { "_id" }, sb.toString(), (String[])list.toArray(new String[0]), (String)null, (String)null, (String)null), (boo.boo$a<Cursor, Long>)p71.E0);
    }
    
    @Override
    public final int g() {
        return this.h((boo.boo$a<SQLiteDatabase, Integer>)new tno(this, this.D0.B() - this.F0.b()));
    }
    
    public final <T> T h(final boo.boo$a<SQLiteDatabase, T> boo$a) {
        final SQLiteDatabase e = this.e();
        e.beginTransaction();
        try {
            final Object apply = boo$a.apply((Object)e);
            e.setTransactionSuccessful();
            return (T)apply;
        }
        finally {
            e.endTransaction();
        }
    }
    
    @Override
    public final boolean o1(final q0u q0u) {
        return this.h((boo.boo$a<SQLiteDatabase, Boolean>)new xno((Object)this, (Object)q0u, 0));
    }
    
    @Override
    public final long q2(final q0u q0u) {
        final Cursor rawQuery = this.e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { q0u.b(), String.valueOf(ezk.a(q0u.d())) });
        try {
            Long n;
            if (rawQuery.moveToNext()) {
                n = rawQuery.getLong(0);
            }
            else {
                n = 0L;
            }
            rawQuery.close();
            return n;
        }
        finally {
            rawQuery.close();
        }
    }
    
    @Override
    public final Iterable<q0u> v0() {
        return this.h((boo.boo$a<SQLiteDatabase, Iterable<q0u>>)vno.D0);
    }
    
    @Override
    public final void v3(final q0u q0u, final long n) {
        this.h((boo.boo$a<SQLiteDatabase, Object>)new sno(n, q0u));
    }
}
