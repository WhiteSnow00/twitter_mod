import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class csc<OBJECT, ERROR> extends qtm<xrc<OBJECT, ERROR>>
{
    public static final Set<arc$b> c;
    public final Set<Integer> a;
    public final Set<arc$b> b;
    
    static {
        csc.c = new HashSet((Collection<? extends E>)Arrays.asList(arc$b.values()));
    }
    
    public csc(final Collection<Integer> collection) {
        this.a = new HashSet((Collection<? extends E>)collection);
        this.b = csc.c;
    }
    
    public csc(final Collection<arc$b> collection, final Collection<Integer> collection2) {
        this.b = new HashSet((Collection<? extends E>)collection);
        this.a = new HashSet((Collection<? extends E>)collection2);
    }
    
    public static long e(arc j) {
        j = (arc)j.j("Retry-After");
        while (true) {
            if (ikr.g((CharSequence)j)) {
                long millis;
                try {
                    millis = TimeUnit.SECONDS.toMillis(Integer.parseInt((String)j));
                    return millis;
                }
                catch (final NumberFormatException ex) {
                    final m4s m4s = hq1.a;
                    final arc arc = j;
                    final Date date = m4s.parse((String)arc);
                    final Date date3;
                    final Date date2 = date3 = date;
                    if (date3 != null) {
                        final sbu sbu = sbu.d();
                        final long n = sbu.a();
                        final AtomicLong atomicLong = arc.F;
                        final long n2 = atomicLong.get();
                        final Date date4 = date2;
                        final long time = date4.getTime();
                        final long time2 = time;
                        final long n3 = n;
                        final long n4 = n2;
                        final long n5 = n3 + n4;
                        millis = time2 - n5;
                        return millis;
                    }
                    break Label_0073;
                }
                return millis;
            }
            break Label_0073;
            try {
                final m4s m4s = hq1.a;
                final arc arc = j;
                final Date date = m4s.parse((String)arc);
                final Date date3;
                final Date date2 = date3 = date;
                long millis;
                if (date3 != null) {
                    final sbu sbu = sbu.d();
                    final long n = sbu.a();
                    final AtomicLong atomicLong = arc.F;
                    final long n2 = atomicLong.get();
                    final Date date4 = date2;
                    final long time2;
                    final long time = time2 = date4.getTime();
                    final long n3 = n;
                    final long n4 = n2;
                    final long n5 = n3 + n4;
                    millis = time2 - n5;
                }
                else {
                    millis = 0L;
                }
                return millis;
            }
            catch (final ParseException ex2) {
                continue;
            }
            break;
        }
    }
    
    public long a(final atm<xrc<OBJECT, ERROR>> atm) {
        return 0L;
    }
    
    public String b() {
        return this.getClass().getSimpleName();
    }
    
    public final boolean c(final atm<xrc<OBJECT, ERROR>> atm) {
        final xrc<OBJECT, ERROR> e = atm.e();
        final boolean b = false;
        if (e == null) {
            return false;
        }
        final arc f = atm.e().f;
        if (f == null) {
            return false;
        }
        final bsc n = f.n;
        final HashSet b2 = this.b;
        final HashSet a = this.a;
        boolean b3 = b;
        if (b2.contains(f.b)) {
            b3 = b;
            if (a.contains(n.a)) {
                b3 = b;
                if (this.f(f, n)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final boolean d(final lci lci, final atm<xrc<OBJECT, ERROR>> atm) {
        return false;
    }
    
    public abstract boolean f(final arc p0, final bsc p1);
}
