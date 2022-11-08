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

public final class dxl implements cxl
{
    public final gcn a;
    
    public dxl(final gcn a) {
        this.a = a;
    }
    
    public final LiveData<List<bsx$c>> a(final wyr wyr) {
        final c e = this.a.e;
        final dxl$a dxl$a = new dxl$a(this, wyr);
        final aiq i = e.i;
        final String[] e2 = e.e(new String[] { "WorkTag", "WorkProgress", "WorkSpec" });
        for (final String s : e2) {
            if (!e.a.containsKey(s.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(l7k.c("There is no table with name ", s));
            }
        }
        Objects.requireNonNull(i);
        return (LiveData<List<bsx$c>>)new e((gcn)i.E0, i, (Callable)dxl$a, e2);
    }
    
    public final void b(final at0<String, ArrayList<b>> at0) {
        final at0.c c = (at0.c)at0.keySet();
        if (c.isEmpty()) {
            return;
        }
        if (((l7q)at0).E0 > 999) {
            at0 at2 = new at0(999);
            final int e0 = ((l7q)at0).E0;
            int i = 0;
            int n = 0;
        Label_0046:
            while (true) {
                n = 0;
                while (i < e0) {
                    ((l7q)at2).put((Object)((l7q)at0).i(i), (Object)((l7q)at0).m(i));
                    final int n2 = i + 1;
                    final int n3 = n + 1;
                    i = n2;
                    if ((n = n3) == 999) {
                        this.b((at0<String, ArrayList<b>>)at2);
                        at2 = new at0(999);
                        i = n2;
                        continue Label_0046;
                    }
                }
                break;
            }
            if (n > 0) {
                this.b((at0<String, ArrayList<b>>)at2);
            }
            return;
        }
        final StringBuilder g = w48.g("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        final int e2 = ((l7q)c.C0).E0;
        amy.j(g, e2);
        g.append(")");
        final q1o c2 = q1o.c(g.toString(), e2 + 0);
        final Iterator<Object> iterator = c.iterator();
        int n4 = 1;
        while (true) {
            final vkd vkd = (vkd)iterator;
            if (!vkd.hasNext()) {
                break;
            }
            final String s = (String)vkd.next();
            if (s == null) {
                c2.c3(n4);
            }
            else {
                c2.Y1(n4, s);
            }
            ++n4;
        }
        final Cursor b = he7.b(this.a, (wyr)c2, false);
        try {
            final int a = ea7.a(b, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (b.moveToNext()) {
                final ArrayList list = (ArrayList)((l7q)at0).getOrDefault((Object)b.getString(a), (Object)null);
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
    
    public final void c(final at0<String, ArrayList<String>> at0) {
        final at0.c c = (at0.c)at0.keySet();
        if (c.isEmpty()) {
            return;
        }
        if (((l7q)at0).E0 > 999) {
            at0 at2 = new at0(999);
            final int e0 = ((l7q)at0).E0;
            int n = 0;
            int n2 = 0;
        Label_0046:
            while (true) {
                n2 = 0;
                int i = n;
                while (i < e0) {
                    ((l7q)at2).put((Object)((l7q)at0).i(i), (Object)((l7q)at0).m(i));
                    n = i + 1;
                    final int n3 = n2 + 1;
                    i = n;
                    if ((n2 = n3) == 999) {
                        this.c((at0<String, ArrayList<String>>)at2);
                        at2 = new at0(999);
                        continue Label_0046;
                    }
                }
                break;
            }
            if (n2 > 0) {
                this.c((at0<String, ArrayList<String>>)at2);
            }
            return;
        }
        final StringBuilder g = w48.g("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        final int e2 = ((l7q)c.C0).E0;
        amy.j(g, e2);
        g.append(")");
        final q1o c2 = q1o.c(g.toString(), e2 + 0);
        final Iterator<Object> iterator = c.iterator();
        int n4 = 1;
        while (true) {
            final vkd vkd = (vkd)iterator;
            if (!vkd.hasNext()) {
                break;
            }
            final String s = (String)vkd.next();
            if (s == null) {
                c2.c3(n4);
            }
            else {
                c2.Y1(n4, s);
            }
            ++n4;
        }
        final Cursor b = he7.b(this.a, (wyr)c2, false);
        try {
            final int a = ea7.a(b, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (b.moveToNext()) {
                final ArrayList list = (ArrayList)((l7q)at0).getOrDefault((Object)b.getString(a), (Object)null);
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
