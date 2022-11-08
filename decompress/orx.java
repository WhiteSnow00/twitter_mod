import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orx implements nrx
{
    public final gcn a;
    public final o7a<mrx> b;
    
    public orx(final gcn a) {
        this.a = a;
        this.b = new orx$a(a);
    }
    
    public final void a(final mrx mrx) {
        this.a.b();
        this.a.c();
        try {
            ((o7a)this.b).f((Object)mrx);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final List<String> b(String string) {
        final q1o c = q1o.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (string == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, string);
        }
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final ArrayList list = new ArrayList<String>(b.getCount());
            while (b.moveToNext()) {
                if (b.isNull(0)) {
                    string = null;
                }
                else {
                    string = b.getString(0);
                }
                list.add(string);
            }
            return (List<String>)list;
        }
        finally {
            b.close();
            c.release();
        }
    }
}
