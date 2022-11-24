import android.os.StatFs;
import android.os.SystemClock;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
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

public final class x09 implements cya
{
    public static final long p;
    public static final long q;
    public final long a;
    public final long b;
    public final CountDownLatch c;
    public long d;
    public final x73 e;
    public final Set<String> f;
    public long g;
    public final h9r h;
    public final w09 i;
    public final p8a j;
    public final w73 k;
    public final boolean l;
    public final x09.x09$a m;
    public final omi n;
    public final Object o;
    
    static {
        p = TimeUnit.HOURS.toMillis(2L);
        q = TimeUnit.MINUTES.toMillis(30L);
    }
    
    public x09(final w09 i, final p8a j, final x09.x09$b x09$b, final x73 e, final w73 k, final Executor executor) {
        this.o = new Object();
        this.a = x09$b.a;
        final long b = x09$b.b;
        this.b = b;
        this.d = b;
        final h9r h = h9r.h;
        synchronized (h9r.class) {
            if (h9r.h == null) {
                h9r.h = new h9r();
            }
            final h9r h2 = h9r.h;
            monitorexit(h9r.class);
            this.h = h2;
            this.i = i;
            this.j = j;
            this.g = -1L;
            this.e = e;
            this.k = k;
            this.m = new x09.x09$a();
            this.n = omi.I0;
            this.l = false;
            this.f = new HashSet();
            this.c = new CountDownLatch(0);
        }
    }
    
    public final void a() {
        final Object o = this.o;
        monitorenter(o);
        x09.x09$a m = null;
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
                final x09.x09$a x09$a = m;
                final boolean b = false;
                x09$a.a = b;
                final x09.x09$a x09$a2 = m;
                final long n = -1L;
                x09$a2.c = n;
                final x09.x09$a x09$a3 = m;
                final long n2 = -1L;
                x09$a3.b = n2;
                final x09.x09$a x09$a4 = m;
                monitorexit(x09$a4);
                return;
                final w73 k = this.k;
                final Throwable t;
                t.getMessage();
                Objects.requireNonNull(k);
            }
        }
        catch (final NullPointerException ex) {}
        catch (final IOException ex2) {}
        try {
            final x09.x09$a x09$a = m;
            final boolean b = false;
            x09$a.a = b;
            final x09.x09$a x09$a2 = m;
            final long n = -1L;
            x09$a2.c = n;
            final x09.x09$a x09$a3 = m;
            final long n2 = -1L;
            x09$a3.b = n2;
            final x09.x09$a x09$a4 = m;
            monitorexit(x09$a4);
        }
        finally {}
    }
    
    public final bya b(w09.b m, final z73 z73, final String s) throws IOException {
        synchronized (this.o) {
            final bya b = ((fh8$e)m).b();
            this.f.add(s);
            m = (w09.b)this.m;
            final long a = b.a();
            synchronized (m) {
                if (((x09.x09$a)m).a) {
                    ((x09.x09$a)m).b += a;
                    ++((x09.x09$a)m).c;
                }
                return b;
            }
        }
    }
    
    public final void c(long n) throws IOException {
        try {
            final Collection<w09.a> e = this.e(this.i.g());
            final long a = this.m.a();
            int n2 = 0;
            final Iterator iterator = ((ArrayList)e).iterator();
            long n3 = 0L;
            while (iterator.hasNext()) {
                final w09.a a2 = (w09.a)iterator.next();
                if (n3 > a - n) {
                    break;
                }
                final long d = this.i.d(a2);
                this.f.remove(a2.getId());
                if (d <= 0L) {
                    continue;
                }
                ++n2;
                n3 += d;
                final mop a3 = mop.a();
                a2.getId();
                Objects.requireNonNull(this.e);
                a3.b();
            }
            final x09.x09$a m = this.m;
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
            final w73 k = this.k;
            ex.getMessage();
            Objects.requireNonNull(k);
            throw ex;
        }
    }
    
    public final bya d(final z73 a) {
        final mop a2 = mop.a();
        a2.a = a;
        try {
            synchronized (this.o) {
                final List p = d4j.P(a);
                int n = 0;
                String s = null;
                bya f = null;
                while (true) {
                    final ArrayList list = (ArrayList)p;
                    if (n >= list.size()) {
                        break;
                    }
                    s = (String)list.get(n);
                    f = this.i.f(s, a);
                    if (f != null) {
                        break;
                    }
                    ++n;
                }
                if (f == null) {
                    Objects.requireNonNull(this.e);
                    this.f.remove(s);
                }
                else {
                    Objects.requireNonNull(s);
                    Objects.requireNonNull(this.e);
                    this.f.add(s);
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
    
    public final Collection<w09.a> e(final Collection<w09.a> collection) {
        Objects.requireNonNull(this.n);
        final long currentTimeMillis = System.currentTimeMillis();
        final long p = x09.p;
        final ArrayList list = new ArrayList(collection.size());
        final ArrayList list2 = new ArrayList<Object>(collection.size());
        for (final w09.a a : collection) {
            if (a.b() > currentTimeMillis + p) {
                list.add(a);
            }
            else {
                list2.add(a);
            }
        }
        Collections.sort((List<Object>)list2, (Comparator<? super Object>)this.j.get());
        list.addAll(list2);
        return list;
    }
    
    public final boolean f(final z73 z73) {
        synchronized (this.o) {
            Object o = this.o;
            synchronized (o) {
                final List p = d4j.P(z73);
                int n = 0;
                boolean b;
                while (true) {
                    final ArrayList list = (ArrayList)p;
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
                    o = d4j.P(z73);
                    int n2 = 0;
                    while (true) {
                        final ArrayList list2 = (ArrayList)o;
                        if (n2 >= list2.size()) {
                            return false;
                        }
                        final String s = list2.get(n2);
                        if (this.i.e(s, z73)) {
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
    
    public final bya g(final z73 a, final hvx hvx) throws IOException {
        final mop a2 = mop.a();
        a2.a = a;
        Objects.requireNonNull(this.e);
        Object o = this.o;
        monitorenter(o);
        try {
            try {
                if (a instanceof osh) {
                    Objects.requireNonNull((osh)a);
                    throw null;
                }
                final String v0 = d4j.v0(a);
                monitorexit(o);
                try {
                    o = this.j(v0, a);
                    try {
                        final fh8$e fh8$e = (fh8$e)o;
                        fh8$e.c(hvx);
                        final bya b = this.b((w09.b)fh8$e, a, v0);
                        b.a();
                        this.m.a();
                        Objects.requireNonNull(this.e);
                        if (!fh8$e.a()) {
                            fr0.n((Class)x09.class, "Failed to delete temp file");
                        }
                        a2.b();
                        return b;
                    }
                    finally {
                        if (!((fh8$e)o).a()) {
                            fr0.n((Class)x09.class, "Failed to delete temp file");
                        }
                    }
                }
                catch (final IOException ex) {
                    Objects.requireNonNull(this.e);
                    final eg8 h0 = eg8.H0;
                    if (h0.i0(6)) {
                        h0.z0(6, x09.class.getSimpleName(), "Failed inserting a file into the cache", ex);
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
        x09.x09$a x09$a = this.m;
        synchronized (x09$a) {
            boolean a = x09$a.a;
            monitorexit(x09$a);
            long n = -1L;
            if (a) {
                final long g = this.g;
                if (g != -1L) {
                    if (currentTimeMillis - g <= x09.q) {
                        return false;
                    }
                }
            }
            Objects.requireNonNull(this.n);
            final long currentTimeMillis2 = System.currentTimeMillis();
            final long n2 = x09.p + currentTimeMillis2;
            HashSet f;
            if (this.l && this.f.isEmpty()) {
                f = this.f;
            }
            else if (this.l) {
                f = new HashSet();
            }
            else {
                f = null;
            }
            try {
                final Iterator<w09.a> iterator = this.i.g().iterator();
                long b = 0L;
                int n3 = 0;
                int n4 = 0;
                while (iterator.hasNext()) {
                    final w09.a a2 = iterator.next();
                    final int n5 = n4 + 1;
                    final long n6 = b + a2.getSize();
                    long max;
                    int n7;
                    if (a2.b() > n2) {
                        a2.getSize();
                        max = Math.max(a2.b() - currentTimeMillis2, n);
                        n7 = 1;
                    }
                    else {
                        max = n;
                        n7 = n3;
                        if (this.l) {
                            Objects.requireNonNull(f);
                            f.add(a2.getId());
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
                x09$a = this.m;
                monitorenter(x09$a);
                try {
                    final long c = x09$a.c;
                    monitorexit(x09$a);
                    final long c2 = n4;
                    Label_0431: {
                        if (c == c2 && this.m.a() == b) {
                            break Label_0431;
                        }
                        if (this.l && this.f != f) {
                            Objects.requireNonNull(f);
                            this.f.clear();
                            this.f.addAll(f);
                        }
                        x09$a = this.m;
                        synchronized (x09$a) {
                            x09$a.c = c2;
                            x09$a.b = b;
                            x09$a.a = true;
                            monitorexit(x09$a);
                            this.g = currentTimeMillis2;
                            a = true;
                        }
                    }
                }
                finally {
                    try {
                        monitorexit(x09$a);
                    }
                    catch (final IOException x09$a) {
                        final w73 k = this.k;
                        ((Throwable)x09$a).getMessage();
                        Objects.requireNonNull(k);
                        a = false;
                    }
                }
            }
            catch (final IOException ex) {}
            return a;
        }
    }
    
    public final void i(final z73 z73) {
        final Object o = this.o;
        monitorenter(o);
        try {
            Label_0090: {
                try {
                    final List p = d4j.P(z73);
                    int n = 0;
                    while (true) {
                        final ArrayList list = (ArrayList)p;
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
    
    public final w09.b j(final String s, final z73 z73) throws IOException {
        synchronized (this.o) {
            final boolean h = this.h();
            this.k();
            final long a = this.m.a();
            if (a > this.d && !h) {
                final x09.x09$a m = this.m;
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
            return this.i.C(s, z73);
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
        final h9r h = this.h;
        final long b2 = this.b;
        final long a = this.m.a();
        h.a();
        h.a();
        if (h.f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - h.e > h9r.i) {
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
