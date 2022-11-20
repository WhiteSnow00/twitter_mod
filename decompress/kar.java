import android.database.sqlite.SQLiteQueryBuilder;
import java.util.Set;
import android.database.Cursor;
import java.util.Collection;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "Range" })
public final class kar
{
    public am3 a;
    public Collection<f9p> b;
    public Collection<f9p> c;
    
    public kar() {
        this.a = am3.l;
        final gdd$b e0 = gdd.E0;
        final int a = c5j.a;
        this.b = (Collection<f9p>)e0;
        this.c = (Collection<f9p>)e0;
    }
    
    public static Collection<f9p> b(final Cursor cursor, final String s, final int[] array, final Set<etl> set, int a) {
        if (!cursor.isAfterLast() && a != 0) {
            final rif h = rif.H();
            int n = 0;
            int n2;
            do {
                final int int1 = cursor.getInt(cursor.getColumnIndex("type"));
                if (!fq4.b(array, int1)) {
                    n2 = n;
                }
                else {
                    n2 = n;
                    if (!set.add(new etl(String.valueOf(cursor.getLong(cursor.getColumnIndex("query_id"))), int1))) {
                        continue;
                    }
                    int n3;
                    if (int1 != 0) {
                        if (int1 != 2) {
                            if (int1 != 11) {
                                if (int1 != 12) {
                                    n3 = -1;
                                }
                                else {
                                    n3 = 12;
                                }
                            }
                            else {
                                n3 = 5;
                            }
                        }
                        else {
                            n3 = 8;
                        }
                    }
                    else {
                        n3 = 4;
                    }
                    String s2;
                    if (int1 != 0) {
                        if (int1 != 2) {
                            if (int1 != 11) {
                                if (int1 != 12) {
                                    s2 = "";
                                }
                                else {
                                    s2 = "com.twitter.android.action.TOPIC_TIMELINE_SHOW_RECENT";
                                }
                            }
                            else {
                                s2 = "com.twitter.android.action.SEARCH_QUERY_SAVED";
                            }
                        }
                        else {
                            s2 = "com.twitter.android.action.USER_SHOW_RECENT";
                        }
                    }
                    else {
                        s2 = "com.twitter.android.action.SEARCH_RECENT";
                    }
                    h.p((Object)g9p.a(n3, s, cursor.getString(cursor.getColumnIndex("query")), s2, cursor.getString(cursor.getColumnIndex("name")), (viw)klp.a(cursor.getBlob(cursor.getColumnIndex("user_search_suggestion")), (rlp)viw.j), (rlv)null, (tqt)klp.a(cursor.getBlob(cursor.getColumnIndex("topic_search_suggestion")), (rlp)tqt.c)));
                    n2 = n + 1;
                }
            } while (cursor.moveToNext() && (n = n2) < a);
            if (!cursor.isAfterLast()) {
                while (fq4.b(array, cursor.getInt(cursor.getColumnIndex("type")))) {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
            }
            return (Collection)((n4j)h).e();
        }
        final gdd$b e0 = gdd.E0;
        a = c5j.a;
        return (Collection<f9p>)e0;
    }
    
    public final Collection<f9p> a() {
        final rif h = rif.H();
        am3 a;
        if (!this.a.k.isEmpty()) {
            a = this.a;
        }
        else {
            a = null;
        }
        h.p((Object)a);
        h.q((Iterable)this.b);
        return (Collection)((n4j)h).e();
    }
    
    public final void c(final lzr lzr, final String s, final Set<etl> set, final int n, int a) {
        final SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        sqLiteQueryBuilder.setTables("search_queries");
        sqLiteQueryBuilder.appendWhere((CharSequence)"name LIKE ");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("%");
        sqLiteQueryBuilder.appendWhereEscapeString(sb.toString());
        sqLiteQueryBuilder.appendWhere((CharSequence)" AND query!=''");
        sqLiteQueryBuilder.appendWhere((CharSequence)" AND query NOT LIKE 'place:%'");
        this.a = am3.l;
        final gdd$b e0 = gdd.E0;
        a = c5j.a;
        this.b = (Collection<f9p>)e0;
        this.c = (Collection<f9p>)e0;
        final Cursor t = lzr.t(sqLiteQueryBuilder.buildQuery(kar.a.b, "type IN (0,2,12)", (String)null, (String)null, "score DESC, time DESC", (String)null));
        if (t != null && t.moveToFirst()) {
            this.a = new am3(s, (Collection)b(t, s, new int[] { 2, 12 }, set, 12));
        }
        if (t != null && t.moveToFirst()) {
            this.b = b(t, s, new int[] { 0 }, set, n);
        }
        if (t != null) {
            t.close();
        }
        final Cursor t2 = lzr.t(sqLiteQueryBuilder.buildQuery(kar.a.a, "type IN (11)", "name", (String)null, "type ASC, query_id DESC, time DESC", (String)null));
        if (t2 != null && t2.moveToFirst()) {
            this.c = b(t2, s, new int[] { 11 }, set, Integer.MAX_VALUE);
        }
        if (t2 != null) {
            t2.close();
        }
    }
    
    public interface a
    {
        public static final String[] a = { "name", "query", "type", "query_id", "user_search_suggestion", "topic_search_suggestion", "min(priority)" };
        public static final String[] b = { "name", "query", "type", "query_id", "user_search_suggestion", "topic_search_suggestion", "time", "score" };
    }
}
