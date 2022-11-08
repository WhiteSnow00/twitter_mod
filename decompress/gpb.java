import kotlin.NoWhenBranchMatchedException;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpb extends gue implements rtb<t2g<? extends Cursor>, t2g<? extends j0m<Object>>>
{
    public final /* synthetic */ hpb<Object> C0;
    
    public gpb(final hpb<Object> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final t2g t2g = (t2g)o;
        zzd.f((Object)t2g, "event");
        if (t2g instanceof t2g$a) {
            final Cursor cursor = (Cursor)((t2g$a)t2g).a;
            final glq c = this.C0.D0.c();
            Object f = null;
            if (cursor != null) {
                final String[] columnNames = cursor.getColumnNames();
                final hlq hlq = (hlq)c;
                final String[] g = hlq.g();
                bl0.a().a();
                if (columnNames.length == g.length) {
                    f = hlq.f((Object)cursor);
                }
            }
            if (f == null) {
                o = t2g$b.a;
            }
            else {
                o = new t2g$a(f);
            }
        }
        else if (t2g instanceof t2g$d) {
            o = t2g$d.a;
        }
        else if (t2g instanceof t2g$b) {
            o = t2g$b.a;
        }
        else {
            if (!(t2g instanceof t2g$c)) {
                throw new NoWhenBranchMatchedException();
            }
            o = t2g$c.a;
        }
        return o;
    }
}
