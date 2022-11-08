import android.database.Cursor;
import androidx.work.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsx implements csx
{
    public final gcn a;
    public final o7a<bsx> b;
    public final j7a<bsx> c;
    public final dsx$e d;
    public final dsx$f e;
    public final dsx$g f;
    public final dsx$h g;
    public final dsx$i h;
    public final dsx$j i;
    public final dsx$k j;
    public final dsx$a k;
    public final dsx$b l;
    
    public dsx(final gcn a) {
        this.a = a;
        this.b = new dsx$c(a);
        this.c = new dsx$d(a);
        this.d = new hxp(a) {
            @Override
            public final String c() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.e = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.f = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.g = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.h = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.i = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.j = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.k = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.l = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        new AtomicBoolean(false);
        new AtomicBoolean(false);
    }
    
    public final void a(final String s) {
        this.a.b();
        final yyr a = this.d.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.d.d(a);
        }
    }
    
    public final void b(final String s) {
        this.a.b();
        final yyr a = this.f.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.f.d(a);
        }
    }
    
    public final List<bsx> c(long long1) {
        final q1o c = q1o.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        c.u2(1, long1);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "id");
            final int b3 = ea7.b(b, "state");
            final int b4 = ea7.b(b, "worker_class_name");
            final int b5 = ea7.b(b, "input_merger_class_name");
            final int b6 = ea7.b(b, "input");
            final int b7 = ea7.b(b, "output");
            final int b8 = ea7.b(b, "initial_delay");
            final int b9 = ea7.b(b, "interval_duration");
            final int b10 = ea7.b(b, "flex_duration");
            final int b11 = ea7.b(b, "run_attempt_count");
            final int b12 = ea7.b(b, "backoff_policy");
            final int b13 = ea7.b(b, "backoff_delay_duration");
            final int b14 = ea7.b(b, "last_enqueue_time");
            final int b15 = ea7.b(b, "minimum_retention_duration");
            try {
                final int b16 = ea7.b(b, "schedule_requested_at");
                final int b17 = ea7.b(b, "run_in_foreground");
                final int b18 = ea7.b(b, "out_of_quota_policy");
                final int b19 = ea7.b(b, "period_count");
                final int b20 = ea7.b(b, "generation");
                final int b21 = ea7.b(b, "required_network_type");
                final int b22 = ea7.b(b, "requires_charging");
                final int b23 = ea7.b(b, "requires_device_idle");
                final int b24 = ea7.b(b, "requires_battery_not_low");
                final int b25 = ea7.b(b, "requires_storage_not_low");
                final int b26 = ea7.b(b, "trigger_content_update_delay");
                final int b27 = ea7.b(b, "trigger_max_content_delay");
                final int b28 = ea7.b(b, "content_uri_triggers");
                final ArrayList list = new ArrayList<bsx>(b.getCount());
            Label_0745_Outer:
                while (b.moveToNext()) {
                    final boolean null = b.isNull(b2);
                    final byte[] array = null;
                    final kj6 kj6 = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = b.getString(b2);
                    }
                    final xqx.a w = dml.W(b.getInt(b3));
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    String string3;
                    if (b.isNull(b5)) {
                        string3 = null;
                    }
                    else {
                        string3 = b.getString(b5);
                    }
                    byte[] blob;
                    if (b.isNull(b6)) {
                        blob = null;
                    }
                    else {
                        blob = b.getBlob(b6);
                    }
                    final b a = androidx.work.b.a(blob);
                    byte[] blob2;
                    if (b.isNull(b7)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = b.getBlob(b7);
                    }
                    final b a2 = androidx.work.b.a(blob2);
                    final long long2 = b.getLong(b8);
                    final long long3 = b.getLong(b9);
                    final long long4 = b.getLong(b10);
                    final int int1 = b.getInt(b11);
                    final int t = dml.T(b.getInt(b12));
                    final long long5 = b.getLong(b13);
                    final long long6 = b.getLong(b14);
                    final long long7 = b.getLong(b15);
                    long1 = b.getLong(b16);
                    final boolean b29 = b.getInt(b17) != 0;
                    final int v = dml.V(b.getInt(b18));
                    final int int2 = b.getInt(b19);
                    final int int3 = b.getInt(b20);
                    while (true) {
                        Label_0748: {
                            if (!b.isNull(b21) || !b.isNull(b22) || !b.isNull(b23) || !b.isNull(b24) || !b.isNull(b25) || !b.isNull(b26) || !b.isNull(b27)) {
                                break Label_0748;
                            }
                            final kj6 kj7 = kj6;
                            if (!b.isNull(b28)) {
                                break Label_0748;
                            }
                            list.add(new bsx(string, w, string2, string3, a, a2, long2, long3, long4, kj7, int1, t, long5, long6, long7, long1, b29, v, int2, int3));
                            continue Label_0745_Outer;
                        }
                        final int n = b28;
                        final int u = dml.U(b.getInt(b21));
                        final boolean b30 = b.getInt(b22) != 0;
                        final boolean b31 = b.getInt(b23) != 0;
                        final boolean b32 = b.getInt(b24) != 0;
                        final boolean b33 = b.getInt(b25) != 0;
                        final long long8 = b.getLong(b26);
                        final long long9 = b.getLong(b27);
                        byte[] blob3;
                        if (b.isNull(n)) {
                            blob3 = array;
                        }
                        else {
                            blob3 = b.getBlob(n);
                        }
                        final kj6 kj7 = new kj6(u, b30, b31, b32, b33, long8, long9, dml.l(blob3));
                        continue;
                    }
                }
                b.close();
                c.release();
                return (List<bsx>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final int d(final xqx.a a, final String s) {
        this.a.b();
        final yyr a2 = this.e.a();
        ((vyr)a2).u2(1, (long)dml.u0(a));
        if (s == null) {
            ((vyr)a2).c3(2);
        }
        else {
            ((vyr)a2).Y1(2, s);
        }
        this.a.c();
        try {
            final int j0 = a2.j0();
            this.a.q();
            return j0;
        }
        finally {
            this.a.l();
            this.e.d(a2);
        }
    }
    
    public final List<bsx> e() {
        final q1o c = q1o.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "id");
            final int b3 = ea7.b(b, "state");
            final int b4 = ea7.b(b, "worker_class_name");
            final int b5 = ea7.b(b, "input_merger_class_name");
            final int b6 = ea7.b(b, "input");
            final int b7 = ea7.b(b, "output");
            final int b8 = ea7.b(b, "initial_delay");
            final int b9 = ea7.b(b, "interval_duration");
            final int b10 = ea7.b(b, "flex_duration");
            final int b11 = ea7.b(b, "run_attempt_count");
            final int b12 = ea7.b(b, "backoff_policy");
            final int b13 = ea7.b(b, "backoff_delay_duration");
            final int b14 = ea7.b(b, "last_enqueue_time");
            final int b15 = ea7.b(b, "minimum_retention_duration");
            try {
                final int b16 = ea7.b(b, "schedule_requested_at");
                final int b17 = ea7.b(b, "run_in_foreground");
                final int b18 = ea7.b(b, "out_of_quota_policy");
                final int b19 = ea7.b(b, "period_count");
                final int b20 = ea7.b(b, "generation");
                final int b21 = ea7.b(b, "required_network_type");
                final int b22 = ea7.b(b, "requires_charging");
                final int b23 = ea7.b(b, "requires_device_idle");
                final int b24 = ea7.b(b, "requires_battery_not_low");
                final int b25 = ea7.b(b, "requires_storage_not_low");
                final int b26 = ea7.b(b, "trigger_content_update_delay");
                final int b27 = ea7.b(b, "trigger_max_content_delay");
                final int b28 = ea7.b(b, "content_uri_triggers");
                final ArrayList list = new ArrayList<bsx>(b.getCount());
            Label_0676_Outer:
                while (b.moveToNext()) {
                    final boolean null = b.isNull(b2);
                    final byte[] array = null;
                    final kj6 kj6 = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = b.getString(b2);
                    }
                    final xqx.a w = dml.W(b.getInt(b3));
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    String string3;
                    if (b.isNull(b5)) {
                        string3 = null;
                    }
                    else {
                        string3 = b.getString(b5);
                    }
                    byte[] blob;
                    if (b.isNull(b6)) {
                        blob = null;
                    }
                    else {
                        blob = b.getBlob(b6);
                    }
                    final b a = androidx.work.b.a(blob);
                    byte[] blob2;
                    if (b.isNull(b7)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = b.getBlob(b7);
                    }
                    final b a2 = androidx.work.b.a(blob2);
                    final long long1 = b.getLong(b8);
                    final long long2 = b.getLong(b9);
                    final long long3 = b.getLong(b10);
                    final int int1 = b.getInt(b11);
                    final int t = dml.T(b.getInt(b12));
                    final long long4 = b.getLong(b13);
                    final long long5 = b.getLong(b14);
                    final long long6 = b.getLong(b15);
                    final long long7 = b.getLong(b16);
                    final boolean b29 = b.getInt(b17) != 0;
                    final int v = dml.V(b.getInt(b18));
                    final int int2 = b.getInt(b19);
                    final int int3 = b.getInt(b20);
                    while (true) {
                        Label_0679: {
                            if (!b.isNull(b21) || !b.isNull(b22) || !b.isNull(b23) || !b.isNull(b24) || !b.isNull(b25) || !b.isNull(b26) || !b.isNull(b27)) {
                                break Label_0679;
                            }
                            final kj6 kj7 = kj6;
                            if (!b.isNull(b28)) {
                                break Label_0679;
                            }
                            list.add(new bsx(string, w, string2, string3, a, a2, long1, long2, long3, kj7, int1, t, long4, long5, long6, long7, b29, v, int2, int3));
                            continue Label_0676_Outer;
                        }
                        final int n = b28;
                        final int u = dml.U(b.getInt(b21));
                        final boolean b30 = b.getInt(b22) != 0;
                        final boolean b31 = b.getInt(b23) != 0;
                        final boolean b32 = b.getInt(b24) != 0;
                        final boolean b33 = b.getInt(b25) != 0;
                        final long long8 = b.getLong(b26);
                        final long long9 = b.getLong(b27);
                        byte[] blob3;
                        if (b.isNull(n)) {
                            blob3 = array;
                        }
                        else {
                            blob3 = b.getBlob(n);
                        }
                        final kj6 kj7 = new kj6(u, b30, b31, b32, b33, long8, long9, dml.l(blob3));
                        continue;
                    }
                }
                b.close();
                c.release();
                return (List<bsx>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final List<String> f(String string) {
        final q1o c = q1o.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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
    
    public final xqx.a g(final String s) {
        final q1o c = q1o.c("SELECT state FROM workspec WHERE id=?", 1);
        if (s == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, s);
        }
        this.a.b();
        final gcn a = this.a;
        final xqx.a a2 = null;
        final Cursor b = he7.b(a, (wyr)c, false);
        xqx.a w = a2;
        try {
            if (b.moveToFirst()) {
                Integer value;
                if (b.isNull(0)) {
                    value = null;
                }
                else {
                    value = b.getInt(0);
                }
                if (value == null) {
                    w = a2;
                }
                else {
                    w = dml.W((int)value);
                }
            }
            return w;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final bsx h(String string) {
        final q1o c = q1o.c("SELECT * FROM workspec WHERE id=?", 1);
        if (string == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, string);
        }
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "id");
            final int b3 = ea7.b(b, "state");
            final int b4 = ea7.b(b, "worker_class_name");
            final int b5 = ea7.b(b, "input_merger_class_name");
            final int b6 = ea7.b(b, "input");
            final int b7 = ea7.b(b, "output");
            final int b8 = ea7.b(b, "initial_delay");
            final int b9 = ea7.b(b, "interval_duration");
            final int b10 = ea7.b(b, "flex_duration");
            final int b11 = ea7.b(b, "run_attempt_count");
            final int b12 = ea7.b(b, "backoff_policy");
            final int b13 = ea7.b(b, "backoff_delay_duration");
            final int b14 = ea7.b(b, "last_enqueue_time");
            final int b15 = ea7.b(b, "minimum_retention_duration");
            try {
                final int b16 = ea7.b(b, "schedule_requested_at");
                final int b17 = ea7.b(b, "run_in_foreground");
                final int b18 = ea7.b(b, "out_of_quota_policy");
                final int b19 = ea7.b(b, "period_count");
                final int b20 = ea7.b(b, "generation");
                final int b21 = ea7.b(b, "required_network_type");
                final int b22 = ea7.b(b, "requires_charging");
                final int b23 = ea7.b(b, "requires_device_idle");
                final int b24 = ea7.b(b, "requires_battery_not_low");
                final int b25 = ea7.b(b, "requires_storage_not_low");
                final int b26 = ea7.b(b, "trigger_content_update_delay");
                final int b27 = ea7.b(b, "trigger_max_content_delay");
                final int b28 = ea7.b(b, "content_uri_triggers");
                final boolean moveToFirst = b.moveToFirst();
                final byte[] array = null;
                bsx bsx = null;
                final kj6 kj6 = null;
                Label_0908: {
                    if (moveToFirst) {
                        if (b.isNull(b2)) {
                            string = null;
                        }
                        else {
                            string = b.getString(b2);
                        }
                        final xqx.a w = dml.W(b.getInt(b3));
                        String string2;
                        if (b.isNull(b4)) {
                            string2 = null;
                        }
                        else {
                            string2 = b.getString(b4);
                        }
                        String string3;
                        if (b.isNull(b5)) {
                            string3 = null;
                        }
                        else {
                            string3 = b.getString(b5);
                        }
                        byte[] blob;
                        if (b.isNull(b6)) {
                            blob = null;
                        }
                        else {
                            blob = b.getBlob(b6);
                        }
                        final b a = androidx.work.b.a(blob);
                        byte[] blob2;
                        if (b.isNull(b7)) {
                            blob2 = null;
                        }
                        else {
                            blob2 = b.getBlob(b7);
                        }
                        final b a2 = androidx.work.b.a(blob2);
                        final long long1 = b.getLong(b8);
                        final long long2 = b.getLong(b9);
                        final long long3 = b.getLong(b10);
                        final int int1 = b.getInt(b11);
                        final int t = dml.T(b.getInt(b12));
                        final long long4 = b.getLong(b13);
                        final long long5 = b.getLong(b14);
                        final long long6 = b.getLong(b15);
                        final long long7 = b.getLong(b16);
                        final boolean b29 = b.getInt(b17) != 0;
                        final int v = dml.V(b.getInt(b18));
                        final int int2 = b.getInt(b19);
                        final int int3 = b.getInt(b20);
                        while (true) {
                            Label_0684: {
                                if (!b.isNull(b21) || !b.isNull(b22) || !b.isNull(b23) || !b.isNull(b24) || !b.isNull(b25) || !b.isNull(b26) || !b.isNull(b27)) {
                                    break Label_0684;
                                }
                                final kj6 kj7 = kj6;
                                if (!b.isNull(b28)) {
                                    break Label_0684;
                                }
                                bsx = new bsx(string, w, string2, string3, a, a2, long1, long2, long3, kj7, int1, t, long4, long5, long6, long7, b29, v, int2, int3);
                                break Label_0908;
                            }
                            final int u = dml.U(b.getInt(b21));
                            final boolean b30 = b.getInt(b22) != 0;
                            final boolean b31 = b.getInt(b23) != 0;
                            final boolean b32 = b.getInt(b24) != 0;
                            final boolean b33 = b.getInt(b25) != 0;
                            final long long8 = b.getLong(b26);
                            final long long9 = b.getLong(b27);
                            byte[] blob3;
                            if (b.isNull(b28)) {
                                blob3 = array;
                            }
                            else {
                                blob3 = b.getBlob(b28);
                            }
                            final kj6 kj7 = new kj6(u, b30, b31, b32, b33, long8, long9, dml.l(blob3));
                            continue;
                        }
                    }
                }
                b.close();
                c.release();
                return bsx;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final void i(final String s, final long n) {
        this.a.b();
        final yyr a = this.h.a();
        ((vyr)a).u2(1, n);
        if (s == null) {
            ((vyr)a).c3(2);
        }
        else {
            ((vyr)a).Y1(2, s);
        }
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.h.d(a);
        }
    }
    
    public final void j(final bsx bsx) {
        this.a.b();
        this.a.c();
        try {
            ((o7a)this.b).f((Object)bsx);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final List<String> k(String string) {
        final q1o c = q1o.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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
    
    public final List<b> l(final String s) {
        final q1o c = q1o.c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (s == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, s);
        }
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final ArrayList list = new ArrayList<b>(b.getCount());
            while (b.moveToNext()) {
                byte[] blob;
                if (b.isNull(0)) {
                    blob = null;
                }
                else {
                    blob = b.getBlob(0);
                }
                list.add(androidx.work.b.a(blob));
            }
            return (List<b>)list;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final int m() {
        this.a.b();
        final yyr a = this.l.a();
        this.a.c();
        try {
            final int j0 = a.j0();
            this.a.q();
            return j0;
        }
        finally {
            this.a.l();
            this.l.d(a);
        }
    }
    
    public final List<bsx> n(int c) {
        c = (int)q1o.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        ((q1o)c).u2(1, (long)200);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "id");
            final int b3 = ea7.b(b, "state");
            final int b4 = ea7.b(b, "worker_class_name");
            final int b5 = ea7.b(b, "input_merger_class_name");
            final int b6 = ea7.b(b, "input");
            final int b7 = ea7.b(b, "output");
            final int b8 = ea7.b(b, "initial_delay");
            final int b9 = ea7.b(b, "interval_duration");
            final int b10 = ea7.b(b, "flex_duration");
            final int b11 = ea7.b(b, "run_attempt_count");
            final int b12 = ea7.b(b, "backoff_policy");
            final int b13 = ea7.b(b, "backoff_delay_duration");
            final int b14 = ea7.b(b, "last_enqueue_time");
            final int b15 = ea7.b(b, "minimum_retention_duration");
            try {
                final int b16 = ea7.b(b, "schedule_requested_at");
                final int b17 = ea7.b(b, "run_in_foreground");
                final int b18 = ea7.b(b, "out_of_quota_policy");
                final int b19 = ea7.b(b, "period_count");
                final int b20 = ea7.b(b, "generation");
                final int b21 = ea7.b(b, "required_network_type");
                final int b22 = ea7.b(b, "requires_charging");
                final int b23 = ea7.b(b, "requires_device_idle");
                final int b24 = ea7.b(b, "requires_battery_not_low");
                final int b25 = ea7.b(b, "requires_storage_not_low");
                final int b26 = ea7.b(b, "trigger_content_update_delay");
                final int b27 = ea7.b(b, "trigger_max_content_delay");
                final int b28 = ea7.b(b, "content_uri_triggers");
                final ArrayList list = new ArrayList<bsx>(b.getCount());
            Label_0685_Outer:
                while (b.moveToNext()) {
                    final boolean null = b.isNull(b2);
                    final byte[] array = null;
                    final kj6 kj6 = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = b.getString(b2);
                    }
                    final xqx.a w = dml.W(b.getInt(b3));
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    String string3;
                    if (b.isNull(b5)) {
                        string3 = null;
                    }
                    else {
                        string3 = b.getString(b5);
                    }
                    byte[] blob;
                    if (b.isNull(b6)) {
                        blob = null;
                    }
                    else {
                        blob = b.getBlob(b6);
                    }
                    final b a = androidx.work.b.a(blob);
                    byte[] blob2;
                    if (b.isNull(b7)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = b.getBlob(b7);
                    }
                    final b a2 = androidx.work.b.a(blob2);
                    final long long1 = b.getLong(b8);
                    final long long2 = b.getLong(b9);
                    final long long3 = b.getLong(b10);
                    final int int1 = b.getInt(b11);
                    final int t = dml.T(b.getInt(b12));
                    final long long4 = b.getLong(b13);
                    final long long5 = b.getLong(b14);
                    final long long6 = b.getLong(b15);
                    final long long7 = b.getLong(b16);
                    final boolean b29 = b.getInt(b17) != 0;
                    final int v = dml.V(b.getInt(b18));
                    final int int2 = b.getInt(b19);
                    final int int3 = b.getInt(b20);
                    while (true) {
                        Label_0688: {
                            if (!b.isNull(b21) || !b.isNull(b22) || !b.isNull(b23) || !b.isNull(b24) || !b.isNull(b25) || !b.isNull(b26) || !b.isNull(b27)) {
                                break Label_0688;
                            }
                            final kj6 kj7 = kj6;
                            if (!b.isNull(b28)) {
                                break Label_0688;
                            }
                            list.add(new bsx(string, w, string2, string3, a, a2, long1, long2, long3, kj7, int1, t, long4, long5, long6, long7, b29, v, int2, int3));
                            continue Label_0685_Outer;
                        }
                        final int n = b28;
                        final int u = dml.U(b.getInt(b21));
                        final boolean b30 = b.getInt(b22) != 0;
                        final boolean b31 = b.getInt(b23) != 0;
                        final boolean b32 = b.getInt(b24) != 0;
                        final boolean b33 = b.getInt(b25) != 0;
                        final long long8 = b.getLong(b26);
                        final long long9 = b.getLong(b27);
                        byte[] blob3;
                        if (b.isNull(n)) {
                            blob3 = array;
                        }
                        else {
                            blob3 = b.getBlob(n);
                        }
                        final kj6 kj7 = new kj6(u, b30, b31, b32, b33, long8, long9, dml.l(blob3));
                        continue;
                    }
                }
                b.close();
                ((q1o)c).release();
                return (List<bsx>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        ((q1o)c).release();
    }
    
    public final int o(final String s, final long n) {
        this.a.b();
        final yyr a = this.k.a();
        ((vyr)a).u2(1, n);
        if (s == null) {
            ((vyr)a).c3(2);
        }
        else {
            ((vyr)a).Y1(2, s);
        }
        this.a.c();
        try {
            final int j0 = a.j0();
            this.a.q();
            return j0;
        }
        finally {
            this.a.l();
            this.k.d(a);
        }
    }
    
    public final List<bsx$b> p(String string) {
        final q1o c = q1o.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (string == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, string);
        }
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final ArrayList list = new ArrayList<bsx$b>(b.getCount());
            while (b.moveToNext()) {
                if (b.isNull(0)) {
                    string = null;
                }
                else {
                    string = b.getString(0);
                }
                list.add(new bsx$b(string, dml.W(b.getInt(1))));
            }
            return (List<bsx$b>)list;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final List<bsx> q(int b) {
        final q1o c = q1o.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c.u2(1, (long)b);
        this.a.b();
        final Cursor b2 = he7.b(this.a, (wyr)c, false);
        try {
            final int b3 = ea7.b(b2, "id");
            final int b4 = ea7.b(b2, "state");
            final int b5 = ea7.b(b2, "worker_class_name");
            final int b6 = ea7.b(b2, "input_merger_class_name");
            final int b7 = ea7.b(b2, "input");
            final int b8 = ea7.b(b2, "output");
            final int b9 = ea7.b(b2, "initial_delay");
            final int b10 = ea7.b(b2, "interval_duration");
            final int b11 = ea7.b(b2, "flex_duration");
            final int b12 = ea7.b(b2, "run_attempt_count");
            final int b13 = ea7.b(b2, "backoff_policy");
            final int b14 = ea7.b(b2, "backoff_delay_duration");
            final int b15 = ea7.b(b2, "last_enqueue_time");
            final int b16 = ea7.b(b2, "minimum_retention_duration");
            try {
                final int b17 = ea7.b(b2, "schedule_requested_at");
                final int b18 = ea7.b(b2, "run_in_foreground");
                final int b19 = ea7.b(b2, "out_of_quota_policy");
                final int b20 = ea7.b(b2, "period_count");
                final int b21 = ea7.b(b2, "generation");
                final int b22 = ea7.b(b2, "required_network_type");
                final int b23 = ea7.b(b2, "requires_charging");
                final int b24 = ea7.b(b2, "requires_device_idle");
                final int b25 = ea7.b(b2, "requires_battery_not_low");
                final int b26 = ea7.b(b2, "requires_storage_not_low");
                final int b27 = ea7.b(b2, "trigger_content_update_delay");
                final int b28 = ea7.b(b2, "trigger_max_content_delay");
                b = ea7.b(b2, "content_uri_triggers");
                final ArrayList list = new ArrayList<bsx>(b2.getCount());
            Label_0684_Outer:
                while (b2.moveToNext()) {
                    final boolean null = b2.isNull(b3);
                    final byte[] array = null;
                    final kj6 kj6 = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = b2.getString(b3);
                    }
                    final xqx.a w = dml.W(b2.getInt(b4));
                    String string2;
                    if (b2.isNull(b5)) {
                        string2 = null;
                    }
                    else {
                        string2 = b2.getString(b5);
                    }
                    String string3;
                    if (b2.isNull(b6)) {
                        string3 = null;
                    }
                    else {
                        string3 = b2.getString(b6);
                    }
                    byte[] blob;
                    if (b2.isNull(b7)) {
                        blob = null;
                    }
                    else {
                        blob = b2.getBlob(b7);
                    }
                    final b a = b.a(blob);
                    byte[] blob2;
                    if (b2.isNull(b8)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = b2.getBlob(b8);
                    }
                    final b a2 = b.a(blob2);
                    final long long1 = b2.getLong(b9);
                    final long long2 = b2.getLong(b10);
                    final long long3 = b2.getLong(b11);
                    final int int1 = b2.getInt(b12);
                    final int t = dml.T(b2.getInt(b13));
                    final long long4 = b2.getLong(b14);
                    final long long5 = b2.getLong(b15);
                    final long long6 = b2.getLong(b16);
                    final long long7 = b2.getLong(b17);
                    final boolean b29 = b2.getInt(b18) != 0;
                    final int v = dml.V(b2.getInt(b19));
                    final int int2 = b2.getInt(b20);
                    final int int3 = b2.getInt(b21);
                    while (true) {
                        Label_0687: {
                            if (!b2.isNull(b22) || !b2.isNull(b23) || !b2.isNull(b24) || !b2.isNull(b25) || !b2.isNull(b26) || !b2.isNull(b27) || !b2.isNull(b28)) {
                                break Label_0687;
                            }
                            final kj6 kj7 = kj6;
                            if (!b2.isNull(b)) {
                                break Label_0687;
                            }
                            list.add(new bsx(string, w, string2, string3, a, a2, long1, long2, long3, kj7, int1, t, long4, long5, long6, long7, b29, v, int2, int3));
                            continue Label_0684_Outer;
                        }
                        final int n = b;
                        final int u = dml.U(b2.getInt(b22));
                        final boolean b30 = b2.getInt(b23) != 0;
                        final boolean b31 = b2.getInt(b24) != 0;
                        final boolean b32 = b2.getInt(b25) != 0;
                        final boolean b33 = b2.getInt(b26) != 0;
                        final long long8 = b2.getLong(b27);
                        final long long9 = b2.getLong(b28);
                        byte[] blob3;
                        if (b2.isNull(n)) {
                            blob3 = array;
                        }
                        else {
                            blob3 = b2.getBlob(n);
                        }
                        final kj6 kj7 = new kj6(u, b30, b31, b32, b33, long8, long9, dml.l(blob3));
                        continue;
                    }
                }
                b2.close();
                c.release();
                return (List<bsx>)list;
            }
            finally {}
        }
        finally {}
        b2.close();
        c.release();
    }
    
    public final void r(final bsx bsx) {
        this.a.b();
        this.a.c();
        try {
            final dsx$d c = this.c;
            final yyr a = ((hxp)c).a();
            try {
                c.e(a, (Object)bsx);
                a.j0();
                ((hxp)c).d(a);
                this.a.q();
            }
            finally {
                ((hxp)c).d(a);
            }
        }
        finally {
            this.a.l();
        }
    }
    
    public final void s(final String s, final b b) {
        this.a.b();
        final yyr a = this.g.a();
        final byte[] f = b.f(b);
        if (f == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).D2(1, f);
        }
        if (s == null) {
            ((vyr)a).c3(2);
        }
        else {
            ((vyr)a).Y1(2, s);
        }
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.g.d(a);
        }
    }
    
    public final List<bsx> t() {
        final q1o c = q1o.c("SELECT * FROM workspec WHERE state=1", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "id");
            final int b3 = ea7.b(b, "state");
            final int b4 = ea7.b(b, "worker_class_name");
            final int b5 = ea7.b(b, "input_merger_class_name");
            final int b6 = ea7.b(b, "input");
            final int b7 = ea7.b(b, "output");
            final int b8 = ea7.b(b, "initial_delay");
            final int b9 = ea7.b(b, "interval_duration");
            final int b10 = ea7.b(b, "flex_duration");
            final int b11 = ea7.b(b, "run_attempt_count");
            final int b12 = ea7.b(b, "backoff_policy");
            final int b13 = ea7.b(b, "backoff_delay_duration");
            final int b14 = ea7.b(b, "last_enqueue_time");
            final int b15 = ea7.b(b, "minimum_retention_duration");
            try {
                final int b16 = ea7.b(b, "schedule_requested_at");
                final int b17 = ea7.b(b, "run_in_foreground");
                final int b18 = ea7.b(b, "out_of_quota_policy");
                final int b19 = ea7.b(b, "period_count");
                final int b20 = ea7.b(b, "generation");
                final int b21 = ea7.b(b, "required_network_type");
                final int b22 = ea7.b(b, "requires_charging");
                final int b23 = ea7.b(b, "requires_device_idle");
                final int b24 = ea7.b(b, "requires_battery_not_low");
                final int b25 = ea7.b(b, "requires_storage_not_low");
                final int b26 = ea7.b(b, "trigger_content_update_delay");
                final int b27 = ea7.b(b, "trigger_max_content_delay");
                final int b28 = ea7.b(b, "content_uri_triggers");
                final ArrayList list = new ArrayList<bsx>(b.getCount());
            Label_0676_Outer:
                while (b.moveToNext()) {
                    final boolean null = b.isNull(b2);
                    final byte[] array = null;
                    final kj6 kj6 = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = b.getString(b2);
                    }
                    final xqx.a w = dml.W(b.getInt(b3));
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    String string3;
                    if (b.isNull(b5)) {
                        string3 = null;
                    }
                    else {
                        string3 = b.getString(b5);
                    }
                    byte[] blob;
                    if (b.isNull(b6)) {
                        blob = null;
                    }
                    else {
                        blob = b.getBlob(b6);
                    }
                    final b a = androidx.work.b.a(blob);
                    byte[] blob2;
                    if (b.isNull(b7)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = b.getBlob(b7);
                    }
                    final b a2 = androidx.work.b.a(blob2);
                    final long long1 = b.getLong(b8);
                    final long long2 = b.getLong(b9);
                    final long long3 = b.getLong(b10);
                    final int int1 = b.getInt(b11);
                    final int t = dml.T(b.getInt(b12));
                    final long long4 = b.getLong(b13);
                    final long long5 = b.getLong(b14);
                    final long long6 = b.getLong(b15);
                    final long long7 = b.getLong(b16);
                    final boolean b29 = b.getInt(b17) != 0;
                    final int v = dml.V(b.getInt(b18));
                    final int int2 = b.getInt(b19);
                    final int int3 = b.getInt(b20);
                    while (true) {
                        Label_0679: {
                            if (!b.isNull(b21) || !b.isNull(b22) || !b.isNull(b23) || !b.isNull(b24) || !b.isNull(b25) || !b.isNull(b26) || !b.isNull(b27)) {
                                break Label_0679;
                            }
                            final kj6 kj7 = kj6;
                            if (!b.isNull(b28)) {
                                break Label_0679;
                            }
                            list.add(new bsx(string, w, string2, string3, a, a2, long1, long2, long3, kj7, int1, t, long4, long5, long6, long7, b29, v, int2, int3));
                            continue Label_0676_Outer;
                        }
                        final int n = b28;
                        final int u = dml.U(b.getInt(b21));
                        final boolean b30 = b.getInt(b22) != 0;
                        final boolean b31 = b.getInt(b23) != 0;
                        final boolean b32 = b.getInt(b24) != 0;
                        final boolean b33 = b.getInt(b25) != 0;
                        final long long8 = b.getLong(b26);
                        final long long9 = b.getLong(b27);
                        byte[] blob3;
                        if (b.isNull(n)) {
                            blob3 = array;
                        }
                        else {
                            blob3 = b.getBlob(n);
                        }
                        final kj6 kj7 = new kj6(u, b30, b31, b32, b33, long8, long9, dml.l(blob3));
                        continue;
                    }
                }
                b.close();
                c.release();
                return (List<bsx>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final boolean u() {
        final boolean b = false;
        final q1o c = q1o.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.b();
        final Cursor b2 = he7.b(this.a, (wyr)c, false);
        boolean b3 = b;
        try {
            if (b2.moveToFirst()) {
                final int int1 = b2.getInt(0);
                b3 = b;
                if (int1 != 0) {
                    b3 = true;
                }
            }
            return b3;
        }
        finally {
            b2.close();
            c.release();
        }
    }
    
    public final int v(final String s) {
        this.a.b();
        final yyr a = this.j.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        this.a.c();
        try {
            final int j0 = a.j0();
            this.a.q();
            return j0;
        }
        finally {
            this.a.l();
            this.j.d(a);
        }
    }
    
    public final int w(final String s) {
        this.a.b();
        final yyr a = this.i.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        this.a.c();
        try {
            final int j0 = a.j0();
            this.a.q();
            return j0;
        }
        finally {
            this.a.l();
            this.i.d(a);
        }
    }
}
