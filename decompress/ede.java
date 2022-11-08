import android.database.Cursor;
import android.content.ContentValues;
import java.util.Iterator;
import java.util.ArrayList;
import android.database.sqlite.SQLiteBlobTooBigException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ede implements l00<String>
{
    public final wwp a;
    
    public ede(final wwp a) {
        zzd.f((Object)a, "sharedDatabase");
        this.a = a;
    }
    
    @Override
    public final void b() {
        final wwp a = this.a;
        a.a.P((poo<tyr>)new owp(a));
    }
    
    @Override
    public final void c() {
        final wwp a = this.a;
        Objects.requireNonNull(a);
        final t3s a2 = mq1.a;
        a.a.P((poo<tyr>)new qwp(a, System.currentTimeMillis() - a.b.a()));
    }
    
    @Override
    public final void d() {
        final wwp a = this.a;
        a.a.P((poo<tyr>)new pwp(a));
    }
    
    @Override
    public final List<String> e(String x) {
        final wwp a = this.a;
        Objects.requireNonNull(a);
        final t3s a2 = mq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final long a3 = a.b.a();
        final tyr p = a.a.p();
        final xyr xyr = new xyr("scribe");
        xyr.c = wwp.e;
        xyr.d = "request_id=? AND timestamp >=?";
        xyr.e = new String[] { x, String.valueOf(currentTimeMillis - a3) };
        x = (String)p.X(xyr.d());
        List<Object> emptyList = null;
        Label_0166: {
            if (x == null) {
                emptyList = Collections.emptyList();
            }
            else {
                final ijf h = ijf.H();
                try {
                    try {
                        while (((Cursor)x).moveToNext()) {
                            h.p((Object)new n00(((Cursor)x).getBlob(0)));
                        }
                    }
                    finally {}
                }
                catch (final SQLiteBlobTooBigException ex) {
                    e9a.d((Throwable)ex);
                }
                ((Cursor)x).close();
                final h4j h4j;
                emptyList = (List)h4j.e();
                break Label_0166;
                ((Cursor)x).close();
            }
        }
        zzd.e((Object)emptyList, "sharedDatabase.queryLogs(requestId)");
        final ArrayList list = new ArrayList<String>(kr4.h1((Iterable)emptyList, 10));
        final Iterator<n00> iterator = emptyList.iterator();
        while (iterator.hasNext()) {
            final byte[] a4 = iterator.next().a;
            zzd.e((Object)a4, "entity.log");
            list.add(new String(a4, zt3.b));
        }
        return (List<String>)list;
    }
    
    @Override
    public final void f(final String s, final int n) {
        this.a.a.P((poo<tyr>)new uwp(s, n));
    }
    
    @Override
    public final void g(final String s) {
        this.a.a.P((poo<tyr>)new nwp((Object)s, 0));
    }
    
    @Override
    public final void h(final String s) {
        final wwp a = this.a;
        Objects.requireNonNull(a);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("request_id", "0");
        a.a.P((poo<tyr>)new swp(contentValues, s));
    }
    
    @Override
    public final void i(final String s) {
        this.a.a.P((poo<tyr>)new twp(s));
    }
    
    @Override
    public final void j(final List<String> list) {
        zzd.f((Object)list, "logs");
        final wwp a = this.a;
        final ArrayList list2 = new ArrayList<n00>(kr4.h1((Iterable)list, 10));
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final byte[] bytes = iterator.next().getBytes(zt3.b);
            zzd.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
            list2.add(new n00(bytes));
        }
        Objects.requireNonNull(a);
        ij1.e();
        a.a.P((poo<tyr>)new vwp((List)list2));
    }
}
