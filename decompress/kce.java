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

public final class kce implements m00<String>
{
    public final nxp a;
    
    public kce(final nxp a) {
        czd.f((Object)a, "sharedDatabase");
        this.a = a;
    }
    
    public final void b() {
        final nxp a = this.a;
        a.a.O((hpo<lzr>)new hxp(a));
    }
    
    public final void c() {
        final nxp a = this.a;
        Objects.requireNonNull(a);
        final m4s a2 = hq1.a;
        a.a.O((hpo<lzr>)new jxp(a, System.currentTimeMillis() - a.b.a()));
    }
    
    public final void d() {
        final nxp a = this.a;
        a.a.O((hpo<lzr>)new ixp(a));
    }
    
    public final List<String> e(String w) {
        final nxp a = this.a;
        Objects.requireNonNull(a);
        final m4s a2 = hq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final long a3 = a.b.a();
        final lzr p = a.a.p();
        final pzr pzr = new pzr("scribe");
        pzr.c = nxp.e;
        pzr.d = "request_id=? AND timestamp >=?";
        pzr.e = new String[] { w, String.valueOf(currentTimeMillis - a3) };
        w = (String)p.W(pzr.d());
        List<Object> emptyList = null;
        Label_0185: {
            if (w == null) {
                emptyList = Collections.emptyList();
            }
            else {
                final rif h = rif.H();
                try {
                    try {
                        while (((Cursor)w).moveToNext()) {
                            h.p((Object)new o00(((Cursor)w).getBlob(0)));
                        }
                    }
                    finally {}
                }
                catch (final SQLiteBlobTooBigException ex) {
                    m8a.d((Throwable)ex);
                }
                ((Cursor)w).close();
                final n4j n4j;
                emptyList = (List)n4j.e();
                break Label_0185;
                ((Cursor)w).close();
            }
        }
        czd.e((Object)emptyList, "sharedDatabase.queryLogs(requestId)");
        final ArrayList list = new ArrayList<String>(iq4.H((Iterable)emptyList, 10));
        final Iterator<o00> iterator = emptyList.iterator();
        while (iterator.hasNext()) {
            final byte[] a4 = iterator.next().a;
            czd.e((Object)a4, "entity.log");
            list.add(new String(a4, ht3.b));
        }
        return (List<String>)list;
    }
    
    public final void f(final String s, final int n) {
        this.a.a.O((hpo<lzr>)new mxp(s, n));
    }
    
    public final void g(final String s) {
        this.a.a.O((hpo<lzr>)new lxp(s));
    }
    
    public final void h(final String s) {
        final nxp a = this.a;
        Objects.requireNonNull(a);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("request_id", "0");
        a.a.O((hpo<lzr>)new kxp(contentValues, s));
    }
    
    public final void i(final String s) {
        this.a.a.O((hpo<lzr>)new fxp((Object)s, 0));
    }
    
    public final void j(final List<String> list) {
        czd.f((Object)list, "logs");
        final nxp a = this.a;
        final p8g e0 = p8g.E0;
        final ArrayList list2 = new ArrayList(iq4.H((Iterable)list, 10));
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final byte[] bytes = iterator.next().getBytes(ht3.b);
            czd.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
            list2.add((Object)new o00(bytes));
        }
        Objects.requireNonNull(a);
        cj1.e();
        a.a.O((hpo<lzr>)new gxp((Object)list2, (Enum)e0, 0));
    }
}
