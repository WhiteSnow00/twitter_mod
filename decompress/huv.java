import java.util.concurrent.TimeUnit;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huv implements fuv
{
    public final ltv a;
    public final Map<Long, iuv> b;
    
    public huv(final ltv a, final xbm xbm) {
        czd.f((Object)a, "undoNudgePresenter");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = new LinkedHashMap();
        xbm.i((oj)new wp1((Object)this, 27));
    }
    
    @Override
    public final long a(long c) {
        final iuv iuv = this.b.get(c);
        if (iuv != null) {
            c = iuv.c;
        }
        else {
            c = 0L;
        }
        return c;
    }
    
    @Override
    public final void b(long longValue) {
        final iuv iuv = (iuv)this.b.remove(longValue);
        if (iuv != null) {
            iuv.a.e();
            final Iterator iterator = iuv.d.iterator();
            while (iterator.hasNext()) {
                longValue = ((Number)iterator.next()).longValue();
                this.b.remove(longValue);
            }
        }
    }
    
    @Override
    public final void c(final UserIdentifier userIdentifier, final List<Long> list) {
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)list, "draftIds");
        final int a = uor.Companion.a();
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b(iterator.next().longValue());
        }
        final m4s a2 = hq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final TimeUnit seconds = TimeUnit.SECONDS;
        final long n = a;
        final long millis = seconds.toMillis(n);
        final wc6 wc6 = new wc6();
        wc6.a(rw0.g(seconds, n, (oj)new guv(this, userIdentifier, (List)list, a)));
        final iuv iuv = new iuv(wc6, millis + currentTimeMillis, currentTimeMillis, (List)list);
        final Iterator<Number> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final long longValue = iterator2.next().longValue();
            final eor$a companion = eor.Companion;
            final taa a3 = taa.a;
            eor$a.a(companion, taa.b, Long.valueOf(longValue), Integer.valueOf(a), (String)null, (String)null, (String)null, (String)null, (Integer)null, (Boolean)null, (Boolean)null, (String)null, 1048568);
            this.b.put(longValue, iuv);
        }
    }
    
    @Override
    public final long d(long b) {
        final iuv iuv = this.b.get(b);
        if (iuv != null) {
            b = iuv.b;
        }
        else {
            b = 0L;
        }
        return b;
    }
}
