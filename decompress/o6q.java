import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o6q implements n6q
{
    public final gcn a;
    public final o7a<p6q> b;
    
    public o6q(final gcn a) {
        this.a = a;
        this.b = new o6q$a(a);
    }
    
    public final List<p6q> a() {
        final q1o c = q1o.c("SELECT * FROM signals", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "signalId");
            final int b3 = ea7.b(b, "clicks");
            final int b4 = ea7.b(b, "dismisses");
            final int b5 = ea7.b(b, "data");
            final ArrayList list = new ArrayList<p6q>(b.getCount());
            while (b.moveToNext()) {
                final p6q p6q = new p6q();
                p6q.a = b.getInt(b2);
                p6q.b = b.getLong(b3);
                p6q.c = b.getLong(b4);
                if (b.isNull(b5)) {
                    p6q.d = null;
                }
                else {
                    p6q.d = b.getString(b5);
                }
                list.add(p6q);
            }
            return (List<p6q>)list;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final p6q b(int b) {
        final q1o c = q1o.c("SELECT * FROM signals WHERE signalId = ?", 1);
        c.u2(1, (long)b);
        this.a.b();
        final Cursor b2 = he7.b(this.a, (wyr)c, false);
        try {
            final int b3 = ea7.b(b2, "signalId");
            final int b4 = ea7.b(b2, "clicks");
            b = ea7.b(b2, "dismisses");
            final int b5 = ea7.b(b2, "data");
            final boolean moveToFirst = b2.moveToFirst();
            p6q p6q = null;
            if (moveToFirst) {
                p6q = new p6q();
                p6q.a = b2.getInt(b3);
                p6q.b = b2.getLong(b4);
                p6q.c = b2.getLong(b);
                if (b2.isNull(b5)) {
                    p6q.d = null;
                }
                else {
                    p6q.d = b2.getString(b5);
                }
            }
            return p6q;
        }
        finally {
            b2.close();
            c.release();
        }
    }
    
    public final void c(final p6q p6q) {
        this.a.b();
        this.a.c();
        try {
            ((o7a)this.b).f((Object)p6q);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
}
