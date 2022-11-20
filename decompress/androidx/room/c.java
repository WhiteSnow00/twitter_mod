// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.util.Log;
import android.database.sqlite.SQLiteException;
import java.util.Objects;
import android.database.Cursor;
import java.util.HashSet;
import android.annotation.SuppressLint;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public final class c
{
    public static final String[] m;
    public final HashMap<String, Integer> a;
    public final String[] b;
    public Map<String, Set<String>> c;
    public final tcn d;
    public AtomicBoolean e;
    public volatile boolean f;
    public volatile qzr g;
    public final b h;
    public final i99 i;
    @SuppressLint({ "RestrictedApi" })
    public final kpo<c, d> j;
    public final Object k;
    public c$a l;
    
    static {
        m = new String[] { "UPDATE", "DELETE", "INSERT" };
    }
    
    public c(final tcn d, final Map<String, String> map, final Map<String, Set<String>> c, final String... array) {
        int i = 0;
        this.e = new AtomicBoolean(false);
        this.f = false;
        this.j = new kpo<c, d>();
        this.k = new Object();
        this.l = new Runnable(this) {
            public final c D0;
            
            public final Set<Integer> a() {
                final HashSet set = new HashSet();
                final Cursor o = this.D0.d.o((ozr)new k9q("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                try {
                    while (o.moveToNext()) {
                        set.add(o.getInt(0));
                    }
                    o.close();
                    if (!set.isEmpty()) {
                        this.D0.g.i0();
                    }
                    return set;
                }
                finally {
                    o.close();
                }
            }
            
            @Override
            public final void run() {
            Label_0170_Outer:
                while (true) {
                    final ReentrantReadWriteLock.ReadLock lock = this.D0.d.i.readLock();
                    lock.lock();
                    Set<Integer> set;
                    while (true) {
                        try {
                            try {
                                if (!this.D0.c()) {
                                    lock.unlock();
                                    Objects.requireNonNull(this.D0);
                                    return;
                                }
                                if (!this.D0.e.compareAndSet(true, false)) {
                                    lock.unlock();
                                    Objects.requireNonNull(this.D0);
                                    return;
                                }
                                if (this.D0.d.j()) {
                                    lock.unlock();
                                    Objects.requireNonNull(this.D0);
                                    return;
                                }
                                final lzr g2 = this.D0.d.d.G2();
                                g2.G0();
                                Set set2 = null;
                                try {
                                    final Set<Integer> a = this.a();
                                    try {
                                        g2.z();
                                        set = a;
                                        try {
                                            g2.A();
                                            set = a;
                                            lock.unlock();
                                            Objects.requireNonNull(this.D0);
                                        }
                                        catch (final SQLiteException ex) {}
                                        catch (final IllegalStateException ex2) {}
                                    }
                                    finally {}
                                }
                                finally {
                                    set2 = null;
                                }
                                set = set2;
                                g2.A();
                                set = set2;
                            }
                            finally {}
                        }
                        catch (final SQLiteException ex3) {}
                        catch (final IllegalStateException ex4) {}
                        Set set2 = null;
                        final SQLiteException ex3;
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex3);
                        set = set2;
                        continue;
                    }
                    if (set != null && !set.isEmpty()) {
                        synchronized (this.D0.j) {
                            final Iterator<Map.Entry<c, d>> iterator = this.D0.j.iterator();
                            while (true) {
                                final kpo$e kpo$e = (kpo$e)iterator;
                                if (!kpo$e.hasNext()) {
                                    break;
                                }
                                final d d = ((Map.Entry)kpo$e.next()).getValue();
                                final int length = d.a.length;
                                Set<String> set3 = null;
                                Set<String> d2;
                                for (int i = 0; i < length; ++i, set3 = d2) {
                                    d2 = set3;
                                    if (set.contains(d.a[i])) {
                                        if (length == 1) {
                                            d2 = d.d;
                                        }
                                        else {
                                            if ((d2 = set3) == null) {
                                                d2 = new HashSet<String>(length);
                                            }
                                            d2.add(d.b[i]);
                                        }
                                    }
                                }
                                if (set3 == null) {
                                    continue Label_0170_Outer;
                                }
                                d.c.a(set3);
                            }
                        }
                    }
                    return;
                    lock.unlock();
                    Objects.requireNonNull(this.D0);
                }
            }
        };
        this.d = d;
        this.h = new b(array.length);
        this.a = new HashMap<String, Integer>();
        this.c = c;
        this.i = new i99(d);
        final int length = array.length;
        this.b = new String[length];
        while (i < length) {
            final String s = array[i];
            final Locale us = Locale.US;
            final String lowerCase = s.toLowerCase(us);
            this.a.put(lowerCase, i);
            final String s2 = map.get(array[i]);
            if (s2 != null) {
                this.b[i] = s2.toLowerCase(us);
            }
            else {
                this.b[i] = lowerCase;
            }
            ++i;
        }
        for (final Map.Entry<K, String> entry : map.entrySet()) {
            final String s3 = entry.getValue();
            final Locale us2 = Locale.US;
            final String lowerCase2 = s3.toLowerCase(us2);
            if (this.a.containsKey(lowerCase2)) {
                final String lowerCase3 = ((String)entry.getKey()).toLowerCase(us2);
                final HashMap<String, Integer> a = this.a;
                a.put(lowerCase3, a.get(lowerCase2));
            }
        }
    }
    
    public static void b(final StringBuilder sb, final String s, final String s2) {
        nb0.z(sb, "`", "room_table_modification_trigger_", s, "_");
        sb.append(s2);
        sb.append("`");
    }
    
    @SuppressLint({ "RestrictedApi" })
    public final void a(c h) {
        final String[] e = this.e(h.a);
        final int length = e.length;
        final int[] array = new int[length];
        final int length2 = e.length;
        final int n = 0;
        for (int i = 0; i < length2; ++i) {
            final Integer n2 = this.a.get(e[i].toLowerCase(Locale.US));
            if (n2 == null) {
                final StringBuilder j = fu8.j("There is no table with name ");
                j.append(e[i]);
                throw new IllegalArgumentException(j.toString());
            }
            array[i] = n2;
        }
        final d d = new d(h, array, e);
        Object o = this.j;
        synchronized (o) {
            final d d2 = this.j.j(h, d);
            monitorexit(o);
            if (d2 == null) {
                h = (c)this.h;
                monitorenter(h);
                final int n3 = 0;
                int n4 = n;
                int n5 = n3;
            Label_0218_Outer:
                while (true) {
                    while (true) {
                        if (n4 < length) {
                            final int n6 = array[n4];
                            try {
                                o = ((b)h).a;
                                final long n7 = o[n6];
                                o[n6] = 1L + n7;
                                if (n7 == 0L) {
                                    ((b)h).d = true;
                                    n5 = 1;
                                }
                                ++n4;
                                continue Label_0218_Outer;
                                monitorexit(h);
                                iftrue(Label_0238:)(n5 == 0);
                                this.g();
                            }
                            finally {}
                            break;
                        }
                        continue;
                    }
                }
            }
            Label_0238:;
        }
    }
    
    public final boolean c() {
        if (!this.d.n()) {
            return false;
        }
        if (!this.f) {
            this.d.d.G2();
        }
        if (!this.f) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public final void d(c h) {
        Object o = this.j;
        synchronized (o) {
            final d d = this.j.l(h);
            monitorexit(o);
            if (d != null) {
                h = (c)this.h;
                o = d.a;
                monitorenter(h);
                try {
                    final int length = o.length;
                    int i = 0;
                    boolean b = false;
                    while (i < length) {
                        if (((b)h).a[o[i]]-- == 1L) {
                            ((b)h).d = true;
                            b = true;
                        }
                        ++i;
                    }
                    monitorexit(h);
                    if (b) {
                        this.g();
                    }
                }
                finally {}
            }
        }
    }
    
    public final String[] e(final String[] array) {
        final HashSet set = new HashSet();
        for (final String s : array) {
            final String lowerCase = s.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                set.addAll(this.c.get(lowerCase));
            }
            else {
                set.add(s);
            }
        }
        return (String[])set.toArray(new String[set.size()]);
    }
    
    public final void f(final lzr lzr, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(n);
        sb.append(", 0)");
        lzr.x(sb.toString());
        final String s = this.b[n];
        final StringBuilder sb2 = new StringBuilder();
        final String[] m = androidx.room.c.m;
        for (int i = 0; i < 3; ++i) {
            final String s2 = m[i];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, s, s2);
            sb2.append(" AFTER ");
            sb2.append(s2);
            sb2.append(" ON `");
            nb0.z(sb2, s, "` BEGIN UPDATE ", "room_table_modification_log", " SET ");
            nb0.z(sb2, "invalidated", " = 1", " WHERE ", "table_id");
            sb2.append(" = ");
            sb2.append(n);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            lzr.x(sb2.toString());
        }
    }
    
    public final void g() {
        if (!this.d.n()) {
            return;
        }
        this.h(this.d.d.G2());
    }
    
    public final void h(final lzr ex) {
        if (((lzr)ex).g3()) {
            return;
        }
        try {
            final ReentrantReadWriteLock.ReadLock lock = this.d.i.readLock();
            lock.lock();
            try {
                synchronized (this.k) {
                    final int[] a = this.h.a();
                    if (a == null) {
                        return;
                    }
                    final int length = a.length;
                    if (((lzr)ex).r3()) {
                        ((lzr)ex).G0();
                    }
                    else {
                        ((lzr)ex).u();
                    }
                    for (int i = 0; i < length; ++i) {
                        final int n = a[i];
                        Label_0200: {
                            if (n != 1) {
                                if (n != 2) {
                                    continue;
                                }
                                Label_0237: {
                                    try {
                                        final String s = this.b[i];
                                        final StringBuilder sb = new StringBuilder();
                                        final String[] m = androidx.room.c.m;
                                        for (int j = 0; j < 3; ++j) {
                                            final String s2 = m[j];
                                            sb.setLength(0);
                                            sb.append("DROP TRIGGER IF EXISTS ");
                                            b(sb, s, s2);
                                            ((lzr)ex).x(sb.toString());
                                        }
                                        continue;
                                    }
                                    finally {
                                        break Label_0237;
                                    }
                                    break Label_0200;
                                }
                                ((lzr)ex).A();
                            }
                        }
                        this.f((lzr)ex, i);
                    }
                    ((lzr)ex).z();
                    ((lzr)ex).A();
                    return;
                }
            }
            finally {
                lock.unlock();
            }
        }
        catch (final SQLiteException ex) {}
        catch (final IllegalStateException ex2) {}
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex);
    }
    
    public static final class b
    {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        
        public b(final int n) {
            final long[] a = new long[n];
            this.a = a;
            final boolean[] b = new boolean[n];
            this.b = b;
            this.c = new int[n];
            Arrays.fill(a, 0L);
            Arrays.fill(b, false);
        }
        
        public final int[] a() {
            synchronized (this) {
                if (!this.d) {
                    return null;
                }
                for (int length = this.a.length, i = 0; i < length; ++i) {
                    final long n = this.a[i];
                    int n2 = 1;
                    final boolean b = n > 0L;
                    final boolean[] b2 = this.b;
                    if (b != b2[i]) {
                        final int[] c = this.c;
                        if (!b) {
                            n2 = 2;
                        }
                        c[i] = n2;
                    }
                    else {
                        this.c[i] = 0;
                    }
                    b2[i] = b;
                }
                this.d = false;
                return this.c.clone();
            }
        }
    }
    
    public abstract static class c
    {
        public final String[] a;
        
        public c(final String[] array) {
            this.a = Arrays.copyOf(array, array.length);
        }
        
        public abstract void a(final Set<String> p0);
    }
    
    public static final class d
    {
        public final int[] a;
        public final String[] b;
        public final c c;
        public final Set<String> d;
        
        public d(final c c, final int[] a, final String[] b) {
            this.c = c;
            this.a = a;
            this.b = b;
            if (a.length == 1) {
                final HashSet set = new HashSet();
                set.add(b[0]);
                this.d = (Set<String>)Collections.unmodifiableSet((Set<?>)set);
            }
            else {
                this.d = null;
            }
        }
        
        public final void a(final String[] array) {
            final int length = this.b.length;
            final Set<String> set = null;
            Set<String> d;
            if (length == 1) {
                final int length2 = array.length;
                int n = 0;
                while (true) {
                    d = set;
                    if (n >= length2) {
                        break;
                    }
                    if (array[n].equalsIgnoreCase(this.b[0])) {
                        d = this.d;
                        break;
                    }
                    ++n;
                }
            }
            else {
                final HashSet set2 = new HashSet();
                for (final String s : array) {
                    for (final String s2 : this.b) {
                        if (s2.equalsIgnoreCase(s)) {
                            set2.add(s2);
                            break;
                        }
                    }
                }
                d = set;
                if (set2.size() > 0) {
                    d = set2;
                }
            }
            if (d != null) {
                this.c.a(d);
            }
        }
    }
}
