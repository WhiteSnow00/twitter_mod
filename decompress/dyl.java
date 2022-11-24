import android.database.Cursor;
import java.util.Iterator;
import androidx.work.b;
import java.util.ArrayList;
import androidx.room.c;
import java.util.concurrent.Callable;
import androidx.room.e;
import java.util.Objects;
import java.util.Locale;
import java.util.List;
import androidx.lifecycle.LiveData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyl implements cyl
{
    public final ldn a;
    
    public dyl(final ldn a) {
        this.a = a;
    }
    
    public final LiveData<List<ktx$c>> a(final k0s k0s) {
        final c e = this.a.e;
        final dyl$a dyl$a = new dyl$a(this, k0s);
        final gz i = e.i;
        final String[] e2 = e.e(new String[] { "WorkTag", "WorkProgress", "WorkSpec" });
        for (final String s : e2) {
            if (!e.a.containsKey(s.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(mqb.l("There is no table with name ", s));
            }
        }
        Objects.requireNonNull(i);
        return (LiveData<List<ktx$c>>)new e((ldn)i.H0, i, (Callable)dyl$a, e2);
    }
    
    public final void b(final ws0<String, ArrayList<b>> ws0) {
        final ws0$c ws0$c = (ws0$c)ws0.keySet();
        if (ws0$c.isEmpty()) {
            return;
        }
        if (ws0.H0 > 999) {
            ws0 ws2 = new ws0(999);
            final int h0 = ws0.H0;
            int n = 0;
            int n2 = 0;
        Label_0048:
            while (true) {
                n2 = 0;
                int i = n;
                while (i < h0) {
                    ws2.put((Object)ws0.i(i), (Object)ws0.n(i));
                    n = i + 1;
                    final int n3 = n2 + 1;
                    i = n;
                    if ((n2 = n3) == 999) {
                        this.b(ws2);
                        ws2 = new ws0(999);
                        continue Label_0048;
                    }
                }
                break;
            }
            if (n2 > 0) {
                this.b(ws2);
            }
            return;
        }
        final StringBuilder f = ehk.f("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        final int h2 = ws0$c.F0.H0;
        xd.t(f, h2);
        f.append(")");
        final w2o c = w2o.c(f.toString(), h2 + 0);
        final Iterator iterator = ws0$c.iterator();
        int n4 = 1;
        while (true) {
            final zkd zkd = (zkd)iterator;
            if (!zkd.hasNext()) {
                break;
            }
            final String s = zkd.next();
            if (s == null) {
                c.c3(n4);
            }
            else {
                c.Y1(n4, s);
            }
            ++n4;
        }
        final Cursor b = re7.b(this.a, (k0s)c, false);
        try {
            final int a = oa7.a(b, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (b.moveToNext()) {
                final ArrayList list = (ArrayList)ws0.getOrDefault((Object)b.getString(a), (Object)null);
                if (list != null) {
                    byte[] blob;
                    if (b.isNull(0)) {
                        blob = null;
                    }
                    else {
                        blob = b.getBlob(0);
                    }
                    list.add(androidx.work.b.a(blob));
                }
            }
        }
        finally {
            b.close();
        }
    }
    
    public final void c(final ws0<String, ArrayList<String>> ws0) {
        final ws0$c ws0$c = (ws0$c)ws0.keySet();
        if (ws0$c.isEmpty()) {
            return;
        }
        if (ws0.H0 > 999) {
            ws0 ws2 = new ws0(999);
            final int h0 = ws0.H0;
            int n = 0;
            int n2 = 0;
        Label_0048:
            while (true) {
                n2 = 0;
                int i = n;
                while (i < h0) {
                    ws2.put((Object)ws0.i(i), (Object)ws0.n(i));
                    n = i + 1;
                    final int n3 = n2 + 1;
                    i = n;
                    if ((n2 = n3) == 999) {
                        this.c(ws2);
                        ws2 = new ws0(999);
                        continue Label_0048;
                    }
                }
                break;
            }
            if (n2 > 0) {
                this.c(ws2);
            }
            return;
        }
        final StringBuilder f = ehk.f("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        final int h2 = ws0$c.F0.H0;
        xd.t(f, h2);
        f.append(")");
        final w2o c = w2o.c(f.toString(), h2 + 0);
        final Iterator iterator = ws0$c.iterator();
        int n4 = 1;
        while (true) {
            final zkd zkd = (zkd)iterator;
            if (!zkd.hasNext()) {
                break;
            }
            final String s = zkd.next();
            if (s == null) {
                c.c3(n4);
            }
            else {
                c.Y1(n4, s);
            }
            ++n4;
        }
        final Cursor b = re7.b(this.a, (k0s)c, false);
        try {
            final int a = oa7.a(b, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (b.moveToNext()) {
                final ArrayList list = (ArrayList)ws0.getOrDefault((Object)b.getString(a), (Object)null);
                if (list != null) {
                    String string;
                    if (b.isNull(0)) {
                        string = null;
                    }
                    else {
                        string = b.getString(0);
                    }
                    list.add(string);
                }
            }
        }
        finally {
            b.close();
        }
    }
}
