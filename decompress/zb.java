import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zb<V> implements hnf<V>
{
    public static final boolean F0;
    public static final Logger G0;
    public static final zb$a H0;
    public static final Object I0;
    public volatile Object C0;
    public volatile zb$d D0;
    public volatile zb$h E0;
    
    static {
        F0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        G0 = Logger.getLogger(zb.class.getName());
        g h0;
        try {
            final e e = new e(AtomicReferenceFieldUpdater.newUpdater(zb$h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(zb$h.class, zb$h.class, "b"), (AtomicReferenceFieldUpdater<zb, zb$h>)AtomicReferenceFieldUpdater.newUpdater(zb.class, zb$h.class, "E0"), (AtomicReferenceFieldUpdater<zb, zb$d>)AtomicReferenceFieldUpdater.newUpdater(zb.class, zb$d.class, "D0"), (AtomicReferenceFieldUpdater<zb, Object>)AtomicReferenceFieldUpdater.newUpdater(zb.class, Object.class, "C0"));
        }
        finally {
            h0 = new g();
        }
        H0 = (zb$a)h0;
        final Throwable t;
        if (t != null) {
            zb.G0.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        I0 = new Object();
    }
    
    public static void c(final zb<?> zb) {
        final zb$d zb$d = null;
        zb<?> c0 = zb;
        zb$d c2 = zb$d;
    Label_0006:
        while (true) {
            zb$h zb$h = c0.E0;
            if (zb.H0.c((zb)c0, zb$h, zb.zb$h.c)) {
                while (zb$h != null) {
                    final Thread a = zb$h.a;
                    if (a != null) {
                        zb$h.a = null;
                        LockSupport.unpark(a);
                    }
                    zb$h = zb$h.b;
                }
                zb$d d0;
                do {
                    d0 = c0.D0;
                } while (!zb.H0.a((zb)c0, d0, zb.zb$d.d));
                zb$d c3 = d0;
                zb$d zb$d3;
                while (true) {
                    final zb$d zb$d2 = c3;
                    zb$d3 = c2;
                    if (zb$d2 == null) {
                        break;
                    }
                    c3 = zb$d2.c;
                    zb$d2.c = c2;
                    c2 = zb$d2;
                }
                while (zb$d3 != null) {
                    c2 = zb$d3.c;
                    final Runnable a2 = zb$d3.a;
                    if (a2 instanceof zb.zb$f) {
                        final zb.zb$f zb$f = (zb.zb$f)a2;
                        c0 = zb$f.C0;
                        if (c0.C0 == zb$f && zb.H0.b((zb)c0, (Object)zb$f, k((hnf<?>)zb$f.D0))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        d(a2, zb$d3.b);
                    }
                    zb$d3 = c2;
                }
                break;
            }
        }
    }
    
    public static void d(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger g0 = zb.G0;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            g0.log(severe, sb.toString(), ex);
        }
    }
    
    public static Object k(final hnf<?> hnf) {
        if (hnf instanceof zb) {
            Object o2;
            final Object o = o2 = ((zb)hnf).C0;
            if (o instanceof zb.zb$b) {
                final zb.zb$b zb$b = (zb.zb$b)o;
                o2 = o;
                if (zb$b.a) {
                    if (zb$b.b != null) {
                        o2 = new zb.zb$b(false, zb$b.b);
                    }
                    else {
                        o2 = zb.zb$b.d;
                    }
                }
            }
            return o2;
        }
        final boolean cancelled = ((Future)hnf).isCancelled();
        if ((zb.F0 ^ true) & cancelled) {
            return zb.zb$b.d;
        }
        try {
            Object o3;
            if ((o3 = l((Future<Object>)hnf)) == null) {
                o3 = zb.I0;
            }
            return o3;
        }
        catch (final CancellationException ex) {
            if (!cancelled) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(hnf);
                return new zb.zb$c((Throwable)new IllegalArgumentException(sb.toString(), ex));
            }
            return new zb.zb$b(false, (Throwable)ex);
        }
        catch (final ExecutionException ex2) {
            return new zb.zb$c(ex2.getCause());
        }
        finally {
            final Throwable t;
            return new zb.zb$c(t);
        }
    }
    
    public static <V> V l(final Future<V> future) throws ExecutionException {
        boolean b = false;
        try {
            return future.get();
        }
        catch (final InterruptedException ex) {
            b = true;
            return future.get();
        }
        finally {
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public final void a(final StringBuilder sb) {
        try {
            final zb l = l((Future<zb>)this);
            sb.append("SUCCESS, result=[");
            String value;
            if (l == this) {
                value = "this future";
            }
            else {
                value = String.valueOf(l);
            }
            sb.append(value);
            sb.append("]");
        }
        catch (final RuntimeException ex) {
            sb.append("UNKNOWN, cause=[");
            sb.append(ex.getClass());
            sb.append(" thrown from get()]");
        }
        catch (final CancellationException ex2) {
            sb.append("CANCELLED");
        }
        catch (final ExecutionException ex3) {
            sb.append("FAILURE, cause=[");
            sb.append(ex3.getCause());
            sb.append("]");
        }
    }
    
    public final boolean cancel(final boolean b) {
        Object o = this.C0;
        final boolean b2 = true;
        boolean b3;
        if (o == null | o instanceof zb.zb$f) {
            zb.zb$b zb$b;
            if (zb.F0) {
                zb$b = new zb.zb$b(b, (Throwable)new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                zb$b = zb.zb$b.c;
            }
            else {
                zb$b = zb.zb$b.d;
            }
            b3 = false;
            zb zb = this;
            while (true) {
                if (zb.H0.b(zb, o, (Object)zb$b)) {
                    c(zb);
                    b3 = b2;
                    if (!(o instanceof zb.zb$f)) {
                        break;
                    }
                    final hnf d0 = ((zb.zb$f)o).D0;
                    if (!(d0 instanceof zb)) {
                        ((Future)d0).cancel(b);
                        b3 = b2;
                        break;
                    }
                    zb = (zb)d0;
                    o = zb.C0;
                    final boolean b4 = o == null;
                    b3 = b2;
                    if (!(b4 | o instanceof zb.zb$f)) {
                        break;
                    }
                    b3 = true;
                }
                else {
                    if (!((o = zb.C0) instanceof zb.zb$f)) {
                        break;
                    }
                    continue;
                }
            }
        }
        else {
            b3 = false;
        }
        return b3;
    }
    
    public final void e(final Runnable runnable, final Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        zb$d c = this.D0;
        if (c != zb$d.d) {
            final zb$d zb$d = new zb$d(runnable, executor);
            do {
                zb$d.c = c;
                if (zb.H0.a(this, c, zb$d)) {
                    return;
                }
            } while ((c = this.D0) != zb.zb$d.d);
        }
        d(runnable, executor);
    }
    
    public final V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c0 = this.C0;
        if (c0 != null & (c0 instanceof zb.zb$f ^ true)) {
            return this.h(c0);
        }
        zb$h zb$h = this.E0;
        if (zb$h != zb.zb$h.c) {
            final zb$h zb$h2 = new zb$h();
            do {
                final zb$a h0 = zb.H0;
                h0.d(zb$h2, zb$h);
                if (h0.c(this, zb$h, zb$h2)) {
                    Object c2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.n(zb$h2);
                            throw new InterruptedException();
                        }
                        c2 = this.C0;
                    } while (!(c2 != null & (c2 instanceof zb.zb$f ^ true)));
                    return this.h(c2);
                }
            } while ((zb$h = this.E0) != zb.zb$h.c);
        }
        return this.h(this.C0);
    }
    
    public final V get(long convert, final TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c0 = this.C0;
        if (c0 != null & (c0 instanceof zb.zb$f ^ true)) {
            return this.h(c0);
        }
        long n;
        if (nanos > 0L) {
            n = System.nanoTime() + nanos;
        }
        else {
            n = 0L;
        }
        long n2 = nanos;
        Label_0260: {
            if (nanos >= 1000L) {
                zb$h zb$h = this.E0;
                if (zb$h != zb.zb$h.c) {
                    final zb$h zb$h2 = new zb$h();
                    do {
                        final zb$a h0 = zb.H0;
                        h0.d(zb$h2, zb$h);
                        if (h0.c(this, zb$h, zb$h2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.n(zb$h2);
                                    throw new InterruptedException();
                                }
                                final Object c2 = this.C0;
                                if (c2 != null & (c2 instanceof zb.zb$f ^ true)) {
                                    return this.h(c2);
                                }
                                n2 = (nanos = n - System.nanoTime());
                            } while (n2 >= 1000L);
                            this.n(zb$h2);
                            break Label_0260;
                        }
                    } while ((zb$h = this.E0) != zb.zb$h.c);
                }
                return this.h(this.C0);
            }
        }
        while (n2 > 0L) {
            final Object c3 = this.C0;
            if (c3 != null & (c3 instanceof zb.zb$f ^ true)) {
                return this.h(c3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n2 = n - System.nanoTime();
        }
        final String string = this.toString();
        final String string2 = timeUnit.toString();
        final Locale root = Locale.ROOT;
        final String lowerCase = string2.toLowerCase(root);
        final StringBuilder d = c0.D("Waited ", convert, " ");
        d.append(timeUnit.toString().toLowerCase(root));
        String s2;
        final String s = s2 = d.toString();
        if (n2 + 1000L < 0L) {
            final String c4 = l7k.c(s, " (plus ");
            final long n3 = -n2;
            convert = timeUnit.convert(n3, TimeUnit.NANOSECONDS);
            final long n4 = n3 - timeUnit.toNanos(convert);
            final long n5 = lcmp(convert, 0L);
            final boolean b = n5 == 0 || n4 > 1000L;
            String c5 = c4;
            if (n5 > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(c4);
                sb.append(convert);
                sb.append(" ");
                sb.append(lowerCase);
                String s3 = sb.toString();
                if (b) {
                    s3 = l7k.c(s3, ",");
                }
                c5 = l7k.c(s3, " ");
            }
            String g = c5;
            if (b) {
                g = tok.g(c5, n4, " nanoseconds ");
            }
            s2 = l7k.c(g, "delay)");
        }
        if (this.isDone()) {
            throw new TimeoutException(l7k.c(s2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(zi.y(s2, " for ", string));
    }
    
    public final V h(final Object o) throws ExecutionException {
        if (o instanceof zb.zb$b) {
            final Throwable b = ((zb.zb$b)o).b;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(b);
            throw ex;
        }
        if (!(o instanceof zb.zb$c)) {
            Object o2;
            if ((o2 = o) == zb.I0) {
                o2 = null;
            }
            return (V)o2;
        }
        throw new ExecutionException(((zb.zb$c)o).a);
    }
    
    public final boolean isCancelled() {
        return this.C0 instanceof zb.zb$b;
    }
    
    public final boolean isDone() {
        final Object c0 = this.C0;
        return (c0 instanceof zb.zb$f ^ true) & c0 != null;
    }
    
    public final String m() {
        final Object c0 = this.C0;
        if (c0 instanceof zb.zb$f) {
            final StringBuilder g = w48.g("setFuture=[");
            final hnf d0 = ((zb.zb$f)c0).D0;
            String value;
            if (d0 == this) {
                value = "this future";
            }
            else {
                value = String.valueOf(d0);
            }
            return hi.I(g, value, "]");
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder g2 = w48.g("remaining delay=[");
            g2.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            g2.append(" ms]");
            return g2.toString();
        }
        return null;
    }
    
    public final void n(zb$h e0) {
        e0.a = null;
    Label_0005:
        while (true) {
            e0 = this.E0;
            if (e0 == zb$h.c) {
                return;
            }
            zb$h zb$h = null;
            while (e0 != null) {
                final zb$h b = e0.b;
                zb$h zb$h2;
                if (e0.a != null) {
                    zb$h2 = e0;
                }
                else if (zb$h != null) {
                    zb$h.b = b;
                    zb$h2 = zb$h;
                    if (zb$h.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    zb$h2 = zb$h;
                    if (!zb.H0.c(this, e0, b)) {
                        continue Label_0005;
                    }
                }
                e0 = b;
                zb$h = zb$h2;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.C0 instanceof zb.zb$b) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.a(sb);
        }
        else {
            String s;
            try {
                s = this.m();
            }
            catch (final RuntimeException ex) {
                final StringBuilder g = w48.g("Exception thrown from implementation: ");
                g.append(ex.getClass());
                s = g.toString();
            }
            if (s != null && !s.isEmpty()) {
                aob.h(sb, "PENDING, info=[", s, "]");
            }
            else if (this.isDone()) {
                this.a(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static final class e extends zb$a
    {
        public final AtomicReferenceFieldUpdater<zb$h, Thread> a;
        public final AtomicReferenceFieldUpdater<zb$h, zb$h> b;
        public final AtomicReferenceFieldUpdater<zb, zb$h> c;
        public final AtomicReferenceFieldUpdater<zb, zb$d> d;
        public final AtomicReferenceFieldUpdater<zb, Object> e;
        
        public e(final AtomicReferenceFieldUpdater<zb$h, Thread> a, final AtomicReferenceFieldUpdater<zb$h, zb$h> b, final AtomicReferenceFieldUpdater<zb, zb$h> c, final AtomicReferenceFieldUpdater<zb, zb$d> d, final AtomicReferenceFieldUpdater<zb, Object> e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public final boolean a(final zb<?> zb, final zb$d zb$d, final zb$d zb$d2) {
            final AtomicReferenceFieldUpdater<zb, zb$d> d = this.d;
            while (!d.compareAndSet(zb, zb$d, zb$d2)) {
                if (d.get(zb) != zb$d) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean b(final zb<?> zb, final Object o, final Object o2) {
            final AtomicReferenceFieldUpdater<zb, Object> e = this.e;
            while (!e.compareAndSet(zb, o, o2)) {
                if (e.get(zb) != o) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean c(final zb<?> zb, final zb$h zb$h, final zb$h zb$h2) {
            final AtomicReferenceFieldUpdater<zb, zb$h> c = this.c;
            while (!c.compareAndSet(zb, zb$h, zb$h2)) {
                if (c.get(zb) != zb$h) {
                    return false;
                }
            }
            return true;
        }
        
        public final void d(final zb$h zb$h, final zb$h zb$h2) {
            this.b.lazySet(zb$h, zb$h2);
        }
        
        public final void e(final zb$h zb$h, final Thread thread) {
            this.a.lazySet(zb$h, thread);
        }
    }
    
    public static final class g extends zb$a
    {
        public final boolean a(final zb<?> zb, final zb$d zb$d, final zb$d d0) {
            synchronized (zb) {
                if (zb.D0 == zb$d) {
                    zb.D0 = d0;
                    return true;
                }
                return false;
            }
        }
        
        public final boolean b(final zb<?> zb, final Object o, final Object c0) {
            synchronized (zb) {
                if (zb.C0 == o) {
                    zb.C0 = c0;
                    return true;
                }
                return false;
            }
        }
        
        public final boolean c(final zb<?> zb, final zb$h zb$h, final zb$h e0) {
            synchronized (zb) {
                if (zb.E0 == zb$h) {
                    zb.E0 = e0;
                    return true;
                }
                return false;
            }
        }
        
        public final void d(final zb$h zb$h, final zb$h b) {
            zb$h.b = b;
        }
        
        public final void e(final zb$h zb$h, final Thread a) {
            zb$h.a = a;
        }
    }
}
