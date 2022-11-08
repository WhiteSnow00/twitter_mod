import android.os.StatFs;
import android.os.SystemClock;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.io.IOException;
import java.util.Objects;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f09 implements cya
{
    public static final long p;
    public static final long q;
    public final long a;
    public final long b;
    public final CountDownLatch c;
    public long d;
    public final o73 e;
    public final Set<String> f;
    public long g;
    public final n7r h;
    public final e09 i;
    public final b8a j;
    public final n73 k;
    public final boolean l;
    public final f09.f09$a m;
    public final x3j n;
    public final Object o;
    
    static {
        p = TimeUnit.HOURS.toMillis(2L);
        q = TimeUnit.MINUTES.toMillis(30L);
    }
    
    public f09(final e09 i, final b8a j, final f09.f09$b f09$b, final o73 e, final n73 k, final Executor executor) {
        this.o = new Object();
        this.a = f09$b.a;
        final long b = f09$b.b;
        this.b = b;
        this.d = b;
        final n7r h = n7r.h;
        synchronized (n7r.class) {
            if (n7r.h == null) {
                n7r.h = new n7r();
            }
            final n7r h2 = n7r.h;
            monitorexit(n7r.class);
            this.h = h2;
            this.i = i;
            this.j = j;
            this.g = -1L;
            this.e = e;
            this.k = k;
            this.m = new f09.f09$a();
            this.n = x3j.E0;
            this.l = false;
            this.f = new HashSet();
            this.c = new CountDownLatch(0);
        }
    }
    
    public final void a() {
        final Object o = this.o;
        monitorenter(o);
        f09.f09$a m = null;
        try {
            try {
                this.i.h();
                this.f.clear();
                Objects.requireNonNull(this.e);
            }
            finally {
                monitorexit(o);
                m = this.m;
                monitorenter(m);
                final f09.f09$a f09$a = m;
                final boolean b = false;
                f09$a.a = b;
                final f09.f09$a f09$a2 = m;
                final long n = -1L;
                f09$a2.c = n;
                final f09.f09$a f09$a3 = m;
                final long n2 = -1L;
                f09$a3.b = n2;
                final f09.f09$a f09$a4 = m;
                monitorexit(f09$a4);
                return;
                final n73 k = this.k;
                final Throwable t;
                t.getMessage();
                Objects.requireNonNull(k);
            }
        }
        catch (final NullPointerException ex) {}
        catch (final IOException ex2) {}
        try {
            final f09.f09$a f09$a = m;
            final boolean b = false;
            f09$a.a = b;
            final f09.f09$a f09$a2 = m;
            final long n = -1L;
            f09$a2.c = n;
            final f09.f09$a f09$a3 = m;
            final long n2 = -1L;
            f09$a3.b = n2;
            final f09.f09$a f09$a4 = m;
            monitorexit(f09$a4);
        }
        finally {}
    }
    
    public final bya b(e09$b m, final q73 q73, final String s) throws IOException {
        synchronized (this.o) {
            final bya b = ((qg8$e)m).b();
            this.f.add(s);
            m = (e09$b)this.m;
            final long a = b.a();
            synchronized (m) {
                if (((f09.f09$a)m).a) {
                    ((f09.f09$a)m).b += a;
                    ++((f09.f09$a)m).c;
                }
                return b;
            }
        }
    }
    
    public final void c(long n) throws IOException {
        try {
            final Collection<e09$a> e = this.e(this.i.g());
            final long a = this.m.a();
            int n2 = 0;
            final Iterator iterator = ((ArrayList)e).iterator();
            long n3 = 0L;
            while (iterator.hasNext()) {
                final e09$a e09$a = (e09$a)iterator.next();
                if (n3 > a - n) {
                    break;
                }
                final long d = this.i.d(e09$a);
                this.f.remove(e09$a.getId());
                if (d <= 0L) {
                    continue;
                }
                ++n2;
                n3 += d;
                final zmp a2 = zmp.a();
                e09$a.getId();
                Objects.requireNonNull(this.e);
                a2.b();
            }
            final f09.f09$a m = this.m;
            n = -n3;
            final long n4 = -n2;
            synchronized (m) {
                if (m.a) {
                    m.b += n;
                    m.c += n4;
                }
                monitorexit(m);
                this.i.b();
            }
        }
        catch (final IOException ex) {
            final n73 k = this.k;
            ex.getMessage();
            Objects.requireNonNull(k);
            throw ex;
        }
    }
    
    public final bya d(final q73 a) {
        final zmp a2 = zmp.a();
        a2.a = a;
        try {
            synchronized (this.o) {
                final List a3 = h6q.A(a);
                int n = 0;
                bya f;
                Object o = f = null;
                while (true) {
                    final ArrayList list = (ArrayList)a3;
                    if (n >= list.size()) {
                        break;
                    }
                    o = list.get(n);
                    f = this.i.f((String)o, (Object)a);
                    if (f != null) {
                        break;
                    }
                    ++n;
                }
                if (f == null) {
                    Objects.requireNonNull(this.e);
                    this.f.remove(o);
                }
                else {
                    Objects.requireNonNull(o);
                    Objects.requireNonNull(this.e);
                    this.f.add(o);
                }
                monitorexit(this.o);
                a2.b();
                return f;
            }
        }
        catch (final IOException ex) {
            Objects.requireNonNull(this.k);
            Objects.requireNonNull(this.e);
            a2.b();
            return null;
        }
        a2.b();
    }
    
    public final Collection<e09$a> e(final Collection<e09$a> collection) {
        Objects.requireNonNull(this.n);
        final long currentTimeMillis = System.currentTimeMillis();
        final long p = f09.p;
        final ArrayList list = new ArrayList(collection.size());
        final ArrayList list2 = new ArrayList<Object>(collection.size());
        for (final e09$a e09$a : collection) {
            if (e09$a.b() > currentTimeMillis + p) {
                list.add(e09$a);
            }
            else {
                list2.add(e09$a);
            }
        }
        Collections.sort((List<Object>)list2, (Comparator<? super Object>)this.j.get());
        list.addAll(list2);
        return list;
    }
    
    public final boolean f(final q73 q73) {
        synchronized (this.o) {
            Object o = this.o;
            synchronized (o) {
                final List a = h6q.A(q73);
                int n = 0;
                boolean b;
                while (true) {
                    final ArrayList list = (ArrayList)a;
                    if (n >= list.size()) {
                        monitorexit(o);
                        b = false;
                        break;
                    }
                    if (this.f.contains(list.get(n))) {
                        monitorexit(o);
                        b = true;
                        break;
                    }
                    ++n;
                }
                if (b) {
                    return true;
                }
                try {
                    o = h6q.A(q73);
                    int n2 = 0;
                    while (true) {
                        final ArrayList list2 = (ArrayList)o;
                        if (n2 >= list2.size()) {
                            return false;
                        }
                        final String s = list2.get(n2);
                        if (this.i.e(s, (Object)q73)) {
                            this.f.add(s);
                            return true;
                        }
                        ++n2;
                    }
                }
                catch (final IOException ex) {
                    return false;
                }
            }
        }
    }
    
    public final bya g(final q73 a, final ytx ytx) throws IOException {
        final zmp a2 = zmp.a();
        a2.a = a;
        Objects.requireNonNull(this.e);
        Object o = this.o;
        monitorenter(o);
        try {
            try {
                if (a instanceof urh) {
                    Objects.requireNonNull((urh)a);
                    throw null;
                }
                final String w = h6q.W(a);
                monitorexit(o);
                try {
                    o = this.j(w, a);
                    try {
                        final qg8$e qg8$e = (qg8$e)o;
                        qg8$e.c(ytx);
                        final bya b = this.b((e09$b)qg8$e, a, w);
                        b.a();
                        this.m.a();
                        Objects.requireNonNull(this.e);
                        if (!qg8$e.a()) {
                            dli.m((Class)f09.class, "Failed to delete temp file");
                        }
                        a2.b();
                        return b;
                    }
                    finally {
                        if (!((qg8$e)o).a()) {
                            dli.m((Class)f09.class, "Failed to delete temp file");
                        }
                    }
                }
                catch (final IOException ex) {
                    Objects.requireNonNull(this.e);
                    final rp2 e0 = rp2.E0;
                    if (e0.u0(6)) {
                        e0.H0(6, f09.class.getSimpleName(), "Failed inserting a file into the cache", (Throwable)ex);
                    }
                    throw ex;
                }
                a2.b();
            }
            finally {
                monitorexit(o);
            }
        }
        catch (final UnsupportedEncodingException ex2) {}
    }
    
    public final boolean h() {
        Objects.requireNonNull(this.n);
        final long currentTimeMillis = System.currentTimeMillis();
        f09.f09$a f09$a = this.m;
        synchronized (f09$a) {
            boolean a = f09$a.a;
            monitorexit(f09$a);
            long n = -1L;
            if (a) {
                final long g = this.g;
                if (g != -1L) {
                    if (currentTimeMillis - g <= f09.q) {
                        return false;
                    }
                }
            }
            Objects.requireNonNull(this.n);
            final long currentTimeMillis2 = System.currentTimeMillis();
            final long n2 = f09.p + currentTimeMillis2;
            Object o;
            if (this.l && this.f.isEmpty()) {
                o = this.f;
            }
            else if (this.l) {
                o = new HashSet<String>();
            }
            else {
                o = null;
            }
            try {
                final Iterator iterator = this.i.g().iterator();
                long b = 0L;
                int n3 = 0;
                int n4 = 0;
                while (iterator.hasNext()) {
                    final e09$a e09$a = (e09$a)iterator.next();
                    final int n5 = n4 + 1;
                    final long n6 = b + e09$a.getSize();
                    long max;
                    int n7;
                    if (e09$a.b() > n2) {
                        e09$a.getSize();
                        max = Math.max(e09$a.b() - currentTimeMillis2, n);
                        n7 = 1;
                    }
                    else {
                        max = n;
                        n7 = n3;
                        if (this.l) {
                            Objects.requireNonNull(o);
                            ((Set<String>)o).add(e09$a.getId());
                            n7 = n3;
                            max = n;
                        }
                    }
                    n = max;
                    b = n6;
                    n3 = n7;
                    n4 = n5;
                }
                if (n3 != 0) {
                    Objects.requireNonNull(this.k);
                }
                f09$a = this.m;
                monitorenter(f09$a);
                try {
                    final long c = f09$a.c;
                    monitorexit(f09$a);
                    final long c2 = n4;
                    Label_0429: {
                        if (c == c2 && this.m.a() == b) {
                            break Label_0429;
                        }
                        if (this.l && this.f != o) {
                            Objects.requireNonNull(o);
                            this.f.clear();
                            this.f.addAll((Collection)o);
                        }
                        o = this.m;
                        synchronized (o) {
                            ((f09.f09$a)o).c = c2;
                            ((f09.f09$a)o).b = b;
                            ((f09.f09$a)o).a = true;
                            monitorexit(o);
                            this.g = currentTimeMillis2;
                            a = true;
                        }
                    }
                }
                finally {
                    try {
                        monitorexit(f09$a);
                    }
                    catch (final IOException f09$a) {
                        final n73 k = this.k;
                        ((Throwable)f09$a).getMessage();
                        Objects.requireNonNull(k);
                        a = false;
                    }
                }
            }
            catch (final IOException ex) {}
            return a;
        }
    }
    
    public final void i(final q73 q73) {
        final Object o = this.o;
        monitorenter(o);
        try {
            Label_0090: {
                try {
                    final List a = h6q.A(q73);
                    int n = 0;
                    while (true) {
                        final ArrayList list = (ArrayList)a;
                        if (n >= list.size()) {
                            break Label_0090;
                        }
                        final String s = list.get(n);
                        this.i.a(s);
                        this.f.remove(s);
                        ++n;
                    }
                }
                finally {
                    monitorexit(o);
                    monitorexit(o);
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    public final e09$b j(final String s, final q73 q73) throws IOException {
        synchronized (this.o) {
            final boolean h = this.h();
            this.k();
            final long a = this.m.a();
            if (a > this.d && !h) {
                final f09.f09$a m = this.m;
                synchronized (m) {
                    m.a = false;
                    m.c = -1L;
                    m.b = -1L;
                    monitorexit(m);
                    this.h();
                }
            }
            final long d = this.d;
            if (a > d) {
                this.c(d * 9L / 10L);
            }
            monitorexit(this.o);
            return this.i.C(s, (Object)q73);
        }
    }
    
    public final void k() {
        final boolean external = this.i.isExternal();
        final boolean b = true;
        int n;
        if (external) {
            n = 2;
        }
        else {
            n = 1;
        }
        final n7r h = this.h;
        final long b2 = this.b;
        final long a = this.m.a();
        h.a();
        h.a();
        if (h.f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - h.e > n7r.i) {
                    h.b();
                }
            }
            finally {
                h.f.unlock();
            }
        }
        StatFs statFs;
        if (n == 1) {
            statFs = h.a;
        }
        else {
            statFs = h.c;
        }
        long n2;
        if (statFs != null) {
            n2 = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        }
        else {
            n2 = 0L;
        }
        int n3 = b ? 1 : 0;
        if (n2 > 0L) {
            if (n2 < b2 - a) {
                n3 = (b ? 1 : 0);
            }
            else {
                n3 = 0;
            }
        }
        if (n3 != 0) {
            this.d = this.a;
        }
        else {
            this.d = this.b;
        }
    }
}
