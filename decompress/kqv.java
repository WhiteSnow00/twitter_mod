import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqv extends jqv
{
    public final String H1;
    public final long I1;
    public final vav J1;
    public final String K1;
    
    public kqv(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final String s, final long i1, final String k1, final bba bba, final vav j1, final String h1) {
        super(context, userIdentifier, userIdentifier2, n, s, pqv.c, bba, k1, j1, -1L);
        this.H1 = h1;
        this.I1 = i1;
        this.J1 = j1;
        this.K1 = k1;
    }
    
    @Override
    public final zvl s0() {
        final lws o1 = super.o1;
        final lzr p = ((ok1)this.J1).p();
        final String b = itl.b("timeline_type", (Object)o1.a);
        int n = 0;
        final String a = itl.a(new String[] { itl.a(new String[] { b, itl.b("timeline_owner_id", (Object)o1.c), itl.b("timeline_timeline_tag", (Object)o1.b) }), itl.b("timeline_data_type", (Object)8) });
        final rif h = rif.H();
        final pzr pzr = new pzr("timeline_view");
        pzr.c = new String[] { "timeline_data_id" };
        pzr.d = a;
        pzr.e = null;
        Object w = p.W(pzr.d());
        try {
            if (((Cursor)w).moveToFirst()) {
                do {
                    h.p((Object)((Cursor)w).getLong(0));
                } while (((Cursor)w).moveToNext());
            }
            ((Cursor)w).close();
            final List list = (List)((n4j)h).e();
            w = new zvl$a();
            ((zvl$a)w).a = "/2/timeline/reactive.json";
            ((qjg)((zvl$a)w).b).w((Object)"blending_type", (Object)"wtf");
            final String[] array = new String[list.size()];
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                array[n] = String.valueOf(iterator.next());
                ++n;
            }
            ((zvl$a)w).p("excluded_user_ids", ikr.i((CharSequence)",", (Object[])array));
            ((zvl$a)w).p("target_user_id", String.valueOf(this.I1));
            ((qjg)((zvl$a)w).b).w((Object)"action", (Object)this.H1);
            ((qjg)((zvl$a)w).b).w((Object)"entry_id", (Object)this.K1);
            return (zvl)((n4j)w).e();
        }
        finally {
            if (w != null) {
                try {
                    ((Cursor)w).close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
    }
}
