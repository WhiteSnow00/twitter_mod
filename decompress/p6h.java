import java.util.Iterator;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6h implements o6h
{
    public final gcn a;
    public final o7a<q7h> b;
    public final j7a<q7h> c;
    public final p6h$c d;
    
    public p6h(final gcn a) {
        this.a = a;
        this.b = new p6h$a(a);
        this.c = new p6h$b(a);
        this.d = new hxp(a) {
            @Override
            public final String c() {
                return "UPDATE messages SET updatedAt = ?, waitingForDisplay = 0, clickCount = 0, displayCount = 0, triggerCount = 0, ignoreCount = 0, lastClickTime = 0, lastDisplayTime = 0, lastTriggerTime = 0, lastIgnoreTime = 0 ";
            }
        };
    }
    
    public final List<q7h> a() {
        final q1o c = q1o.c("SELECT * FROM messages WHERE NOT(hasExpired)", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "rowId");
            final int b3 = ea7.b(b, "messageId");
            final int b4 = ea7.b(b, "message");
            final int b5 = ea7.b(b, "createdAt");
            final int b6 = ea7.b(b, "updatedAt");
            final int b7 = ea7.b(b, "expireAt");
            final int b8 = ea7.b(b, "sensors");
            final int b9 = ea7.b(b, "scheduleTime");
            final int b10 = ea7.b(b, "waitingForDisplay");
            final int b11 = ea7.b(b, "hasExpired");
            final int b12 = ea7.b(b, "clickCount");
            final int b13 = ea7.b(b, "displayCount");
            final int b14 = ea7.b(b, "dismissCount");
            final int b15 = ea7.b(b, "triggerCount");
            try {
                final int b16 = ea7.b(b, "ignoreCount");
                final int b17 = ea7.b(b, "lastClickTime");
                final int b18 = ea7.b(b, "lastDisplayTime");
                final int b19 = ea7.b(b, "lastDismissTime");
                final int b20 = ea7.b(b, "lastTriggerTime");
                final int b21 = ea7.b(b, "lastIgnoreTime");
                final int b22 = ea7.b(b, "notificationId");
                final int b23 = ea7.b(b, "notificationTag");
                final ArrayList list = new ArrayList<q7h>(b.getCount());
                while (b.moveToNext()) {
                    String string;
                    if (b.isNull(b3)) {
                        string = null;
                    }
                    else {
                        string = b.getString(b3);
                    }
                    final q7h q7h = new q7h(string);
                    q7h.a = b.getInt(b2);
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    q7h.c = wvz.j(string2);
                    q7h.d = b.getLong(b5);
                    q7h.e = b.getLong(b6);
                    q7h.f = b.getLong(b7);
                    q7h.g = b.getLong(b8);
                    q7h.h = b.getLong(b9);
                    final int int1 = b.getInt(b10);
                    final boolean b24 = true;
                    q7h.i = (int1 != 0);
                    q7h.j = (b.getInt(b11) != 0 && b24);
                    q7h.k = b.getLong(b12);
                    q7h.l = b.getLong(b13);
                    q7h.m = b.getLong(b14);
                    q7h.n = b.getLong(b15);
                    q7h.o = b.getLong(b16);
                    q7h.p = b.getLong(b17);
                    q7h.q = b.getLong(b18);
                    q7h.r = b.getLong(b19);
                    q7h.s = b.getLong(b20);
                    q7h.t = b.getLong(b21);
                    q7h.u = b.getInt(b22);
                    if (b.isNull(b23)) {
                        q7h.v = null;
                    }
                    else {
                        q7h.v = b.getString(b23);
                    }
                    list.add(q7h);
                }
                b.close();
                c.release();
                return (List<q7h>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final void b(final List<String> list) {
        this.a.b();
        final StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM messages WHERE messageId in (");
        amy.j(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        final gcn a = this.a;
        a.a();
        a.b();
        final yyr e2 = a.d.H2().e2(string);
        final Iterator iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (s == null) {
                ((vyr)e2).c3(n);
            }
            else {
                ((vyr)e2).Y1(n, s);
            }
            ++n;
        }
        this.a.c();
        try {
            e2.j0();
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final long c() {
        final q1o c = q1o.c("SELECT MIN(scheduleTime) FROM messages WHERE scheduleTime > 0 AND NOT(hasExpired)", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            long long1;
            if (b.moveToFirst()) {
                long1 = b.getLong(0);
            }
            else {
                long1 = 0L;
            }
            return long1;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final List<q7h> d() {
        final q1o c = q1o.c("SELECT * FROM messages WHERE scheduleTime > 0", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "rowId");
            final int b3 = ea7.b(b, "messageId");
            final int b4 = ea7.b(b, "message");
            final int b5 = ea7.b(b, "createdAt");
            final int b6 = ea7.b(b, "updatedAt");
            final int b7 = ea7.b(b, "expireAt");
            final int b8 = ea7.b(b, "sensors");
            final int b9 = ea7.b(b, "scheduleTime");
            final int b10 = ea7.b(b, "waitingForDisplay");
            final int b11 = ea7.b(b, "hasExpired");
            final int b12 = ea7.b(b, "clickCount");
            final int b13 = ea7.b(b, "displayCount");
            final int b14 = ea7.b(b, "dismissCount");
            final int b15 = ea7.b(b, "triggerCount");
            try {
                final int b16 = ea7.b(b, "ignoreCount");
                final int b17 = ea7.b(b, "lastClickTime");
                final int b18 = ea7.b(b, "lastDisplayTime");
                final int b19 = ea7.b(b, "lastDismissTime");
                final int b20 = ea7.b(b, "lastTriggerTime");
                final int b21 = ea7.b(b, "lastIgnoreTime");
                final int b22 = ea7.b(b, "notificationId");
                final int b23 = ea7.b(b, "notificationTag");
                final ArrayList list = new ArrayList<q7h>(b.getCount());
                while (b.moveToNext()) {
                    String string;
                    if (b.isNull(b3)) {
                        string = null;
                    }
                    else {
                        string = b.getString(b3);
                    }
                    final q7h q7h = new q7h(string);
                    q7h.a = b.getInt(b2);
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    q7h.c = wvz.j(string2);
                    q7h.d = b.getLong(b5);
                    q7h.e = b.getLong(b6);
                    q7h.f = b.getLong(b7);
                    q7h.g = b.getLong(b8);
                    q7h.h = b.getLong(b9);
                    final int int1 = b.getInt(b10);
                    final boolean b24 = true;
                    q7h.i = (int1 != 0);
                    q7h.j = (b.getInt(b11) != 0 && b24);
                    q7h.k = b.getLong(b12);
                    q7h.l = b.getLong(b13);
                    q7h.m = b.getLong(b14);
                    q7h.n = b.getLong(b15);
                    q7h.o = b.getLong(b16);
                    q7h.p = b.getLong(b17);
                    q7h.q = b.getLong(b18);
                    q7h.r = b.getLong(b19);
                    q7h.s = b.getLong(b20);
                    q7h.t = b.getLong(b21);
                    q7h.u = b.getInt(b22);
                    if (b.isNull(b23)) {
                        q7h.v = null;
                    }
                    else {
                        q7h.v = b.getString(b23);
                    }
                    list.add(q7h);
                }
                b.close();
                c.release();
                return (List<q7h>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final List<String> e() {
        final q1o c = q1o.c("SELECT messageId FROM messages", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final ArrayList list = new ArrayList<String>(b.getCount());
            while (b.moveToNext()) {
                String string;
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
    
    public final q7h f(String s) {
        final q1o c = q1o.c("SELECT * FROM messages WHERE messageId = ?", 1);
        if (s == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, s);
        }
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "rowId");
            final int b3 = ea7.b(b, "messageId");
            final int b4 = ea7.b(b, "message");
            final int b5 = ea7.b(b, "createdAt");
            final int b6 = ea7.b(b, "updatedAt");
            final int b7 = ea7.b(b, "expireAt");
            final int b8 = ea7.b(b, "sensors");
            final int b9 = ea7.b(b, "scheduleTime");
            final int b10 = ea7.b(b, "waitingForDisplay");
            final int b11 = ea7.b(b, "hasExpired");
            final int b12 = ea7.b(b, "clickCount");
            final int b13 = ea7.b(b, "displayCount");
            final int b14 = ea7.b(b, "dismissCount");
            final int b15 = ea7.b(b, "triggerCount");
            try {
                final int b16 = ea7.b(b, "ignoreCount");
                final int b17 = ea7.b(b, "lastClickTime");
                final int b18 = ea7.b(b, "lastDisplayTime");
                final int b19 = ea7.b(b, "lastDismissTime");
                final int b20 = ea7.b(b, "lastTriggerTime");
                final int b21 = ea7.b(b, "lastIgnoreTime");
                final int b22 = ea7.b(b, "notificationId");
                final int b23 = ea7.b(b, "notificationTag");
                q7h q7h2;
                if (b.moveToFirst()) {
                    if (b.isNull(b3)) {
                        s = null;
                    }
                    else {
                        s = b.getString(b3);
                    }
                    final q7h q7h = new q7h(s);
                    q7h.a = b.getInt(b2);
                    if (b.isNull(b4)) {
                        s = null;
                    }
                    else {
                        s = b.getString(b4);
                    }
                    q7h.c = wvz.j(s);
                    q7h.d = b.getLong(b5);
                    q7h.e = b.getLong(b6);
                    q7h.f = b.getLong(b7);
                    q7h.g = b.getLong(b8);
                    q7h.h = b.getLong(b9);
                    q7h.i = (b.getInt(b10) != 0);
                    q7h.j = (b.getInt(b11) != 0);
                    q7h.k = b.getLong(b12);
                    q7h.l = b.getLong(b13);
                    q7h.m = b.getLong(b14);
                    q7h.n = b.getLong(b15);
                    q7h.o = b.getLong(b16);
                    q7h.p = b.getLong(b17);
                    q7h.q = b.getLong(b18);
                    q7h.r = b.getLong(b19);
                    q7h.s = b.getLong(b20);
                    q7h.t = b.getLong(b21);
                    q7h.u = b.getInt(b22);
                    if (b.isNull(b23)) {
                        q7h.v = null;
                        q7h2 = q7h;
                    }
                    else {
                        q7h.v = b.getString(b23);
                        q7h2 = q7h;
                    }
                }
                else {
                    q7h2 = null;
                }
                b.close();
                c.release();
                return q7h2;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final long g() {
        final q1o c = q1o.c("SELECT MIN(expireAt) FROM messages WHERE expireAt > 0 AND NOT(hasExpired)", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            long long1;
            if (b.moveToFirst()) {
                long1 = b.getLong(0);
            }
            else {
                long1 = 0L;
            }
            return long1;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final List<q7h> h() {
        final q1o c = q1o.c("SELECT * FROM messages WHERE notificationId != 0", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final int b2 = ea7.b(b, "rowId");
            final int b3 = ea7.b(b, "messageId");
            final int b4 = ea7.b(b, "message");
            final int b5 = ea7.b(b, "createdAt");
            final int b6 = ea7.b(b, "updatedAt");
            final int b7 = ea7.b(b, "expireAt");
            final int b8 = ea7.b(b, "sensors");
            final int b9 = ea7.b(b, "scheduleTime");
            final int b10 = ea7.b(b, "waitingForDisplay");
            final int b11 = ea7.b(b, "hasExpired");
            final int b12 = ea7.b(b, "clickCount");
            final int b13 = ea7.b(b, "displayCount");
            final int b14 = ea7.b(b, "dismissCount");
            final int b15 = ea7.b(b, "triggerCount");
            try {
                final int b16 = ea7.b(b, "ignoreCount");
                final int b17 = ea7.b(b, "lastClickTime");
                final int b18 = ea7.b(b, "lastDisplayTime");
                final int b19 = ea7.b(b, "lastDismissTime");
                final int b20 = ea7.b(b, "lastTriggerTime");
                final int b21 = ea7.b(b, "lastIgnoreTime");
                final int b22 = ea7.b(b, "notificationId");
                final int b23 = ea7.b(b, "notificationTag");
                final ArrayList list = new ArrayList<q7h>(b.getCount());
                while (b.moveToNext()) {
                    String string;
                    if (b.isNull(b3)) {
                        string = null;
                    }
                    else {
                        string = b.getString(b3);
                    }
                    final q7h q7h = new q7h(string);
                    q7h.a = b.getInt(b2);
                    String string2;
                    if (b.isNull(b4)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b4);
                    }
                    q7h.c = wvz.j(string2);
                    q7h.d = b.getLong(b5);
                    q7h.e = b.getLong(b6);
                    q7h.f = b.getLong(b7);
                    q7h.g = b.getLong(b8);
                    q7h.h = b.getLong(b9);
                    final int int1 = b.getInt(b10);
                    final boolean b24 = true;
                    q7h.i = (int1 != 0);
                    q7h.j = (b.getInt(b11) != 0 && b24);
                    q7h.k = b.getLong(b12);
                    q7h.l = b.getLong(b13);
                    q7h.m = b.getLong(b14);
                    q7h.n = b.getLong(b15);
                    q7h.o = b.getLong(b16);
                    q7h.p = b.getLong(b17);
                    q7h.q = b.getLong(b18);
                    q7h.r = b.getLong(b19);
                    q7h.s = b.getLong(b20);
                    q7h.t = b.getLong(b21);
                    q7h.u = b.getInt(b22);
                    if (b.isNull(b23)) {
                        q7h.v = null;
                    }
                    else {
                        q7h.v = b.getString(b23);
                    }
                    list.add(q7h);
                }
                b.close();
                c.release();
                return (List<q7h>)list;
            }
            finally {}
        }
        finally {}
        b.close();
        c.release();
    }
    
    public final void i(final q7h q7h) {
        this.a.b();
        this.a.c();
        try {
            final p6h$b c = this.c;
            final yyr a = ((hxp)c).a();
            try {
                c.e(a, (Object)q7h);
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
    
    public final void j(final long n) {
        this.a.b();
        final yyr a = this.d.a();
        ((vyr)a).u2(1, n);
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
    
    public final void k(final List<q7h> list) {
        this.a.b();
        this.a.c();
        try {
            final p6h$a b = this.b;
            final yyr a = ((hxp)b).a();
            try {
                final Iterator iterator = ((ArrayList)list).iterator();
                while (iterator.hasNext()) {
                    b.e(a, iterator.next());
                    a.J1();
                }
                ((hxp)b).d(a);
                this.a.q();
            }
            finally {
                ((hxp)b).d(a);
            }
        }
        finally {
            this.a.l();
        }
    }
    
    public final List<Long> l() {
        final q1o c = q1o.c("SELECT sensors FROM messages", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
        try {
            final ArrayList list = new ArrayList<Long>(b.getCount());
            while (b.moveToNext()) {
                Long value;
                if (b.isNull(0)) {
                    value = null;
                }
                else {
                    value = b.getLong(0);
                }
                list.add(value);
            }
            return (List<Long>)list;
        }
        finally {
            b.close();
            c.release();
        }
    }
}
