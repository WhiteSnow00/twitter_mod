import j$.util.DesugarTimeZone;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnw
{
    public static AtomicReference<nrs> a;
    
    static {
        lnw.a = new AtomicReference<nrs>();
    }
    
    public static long a(final long timeInMillis) {
        final Calendar e = e(null);
        e.setTimeInMillis(timeInMillis);
        return b(e).getTimeInMillis();
    }
    
    public static Calendar b(Calendar e) {
        final Calendar e2 = e(e);
        e = e(null);
        e.set(e2.get(1), e2.get(2), e2.get(5));
        return e;
    }
    
    public static TimeZone c() {
        return DesugarTimeZone.getTimeZone("UTC");
    }
    
    public static Calendar d() {
        nrs c;
        if ((c = lnw.a.get()) == null) {
            c = nrs.c;
        }
        final TimeZone b = c.b;
        Calendar calendar;
        if (b == null) {
            calendar = Calendar.getInstance();
        }
        else {
            calendar = Calendar.getInstance(b);
        }
        final Long a = c.a;
        if (a != null) {
            calendar.setTimeInMillis(a);
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }
    
    public static Calendar e(final Calendar calendar) {
        final Calendar instance = Calendar.getInstance(c());
        if (calendar == null) {
            instance.clear();
        }
        else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
