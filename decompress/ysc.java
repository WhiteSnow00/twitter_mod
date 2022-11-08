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

public abstract class ysc<OBJECT, ERROR> extends ysm<tsc<OBJECT, ERROR>>
{
    public static final Set<xrc$b> c;
    public final Set<Integer> a;
    public final Set<xrc$b> b;
    
    static {
        ysc.c = new HashSet((Collection<? extends E>)Arrays.asList(xrc$b.values()));
    }
    
    public ysc(final Collection<Integer> collection) {
        this.a = new HashSet((Collection<? extends E>)collection);
        this.b = ysc.c;
    }
    
    public ysc(final Collection<xrc$b> collection, final Collection<Integer> collection2) {
        this.b = new HashSet((Collection<? extends E>)collection);
        this.a = new HashSet((Collection<? extends E>)collection2);
    }
    
    public static long e(xrc j) {
        j = (xrc)j.j("Retry-After");
        while (true) {
            if (pjr.g((CharSequence)j)) {
                long millis;
                try {
                    millis = TimeUnit.SECONDS.toMillis(Integer.parseInt((String)j));
                    return millis;
                }
                catch (final NumberFormatException ex) {
                    final t3s t3s = mq1.a;
                    final xrc xrc = j;
                    final Date date = t3s.parse((String)xrc);
                    final Date date3;
                    final Date date2 = date3 = date;
                    if (date3 != null) {
                        final zau zau = zau.d();
                        final long n = zau.a();
                        final AtomicLong atomicLong = xrc.F;
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
                    break Label_0074;
                }
                return millis;
            }
            break Label_0074;
            try {
                final t3s t3s = mq1.a;
                final xrc xrc = j;
                final Date date = t3s.parse((String)xrc);
                final Date date3;
                final Date date2 = date3 = date;
                long millis;
                if (date3 != null) {
                    final zau zau = zau.d();
                    final long n = zau.a();
                    final AtomicLong atomicLong = xrc.F;
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
    
    public long a(final ism<tsc<OBJECT, ERROR>> ism) {
        return 0L;
    }
    
    public String b() {
        return this.getClass().getSimpleName();
    }
    
    public final boolean c(final ism<tsc<OBJECT, ERROR>> ism) {
        final Object e = ism.e();
        final boolean b = false;
        if (e == null) {
            return false;
        }
        final xrc f = ((tsc)ism.e()).f;
        if (f == null) {
            return false;
        }
        final xsc n = f.n;
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
    
    public final boolean d(final jci jci, final ism<tsc<OBJECT, ERROR>> ism) {
        return false;
    }
    
    public abstract boolean f(final xrc p0, final xsc p1);
}
