import java.util.concurrent.TimeUnit;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otv implements mtv
{
    public final rsv a;
    public final Map<Long, ptv> b;
    
    public otv(final rsv a, final ibm ibm) {
        zzd.f((Object)a, "undoNudgePresenter");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = new LinkedHashMap();
        ibm.i((rj)new ut1((Object)this, 25));
    }
    
    public final long a(long c) {
        final ptv ptv = this.b.get(c);
        if (ptv != null) {
            c = ptv.c;
        }
        else {
            c = 0L;
        }
        return c;
    }
    
    public final void b(long longValue) {
        final ptv ptv = (ptv)this.b.remove(longValue);
        if (ptv != null) {
            ptv.a.e();
            final Iterator iterator = ptv.d.iterator();
            while (iterator.hasNext()) {
                longValue = ((Number)iterator.next()).longValue();
                this.b.remove(longValue);
            }
        }
    }
    
    public final void c(final UserIdentifier userIdentifier, final List<Long> list) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)list, "draftIds");
        final int a = cor.Companion.a();
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b(iterator.next().longValue());
        }
        final t3s a2 = mq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final TimeUnit seconds = TimeUnit.SECONDS;
        final long n = a;
        final long millis = seconds.toMillis(n);
        final rd6 rd6 = new rd6();
        rd6.a(xw0.g(seconds, n, (rj)new ntv(this, userIdentifier, (List)list, a)));
        final ptv ptv = new ptv(rd6, millis + currentTimeMillis, currentTimeMillis, (List)list);
        final Iterator<Number> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final long longValue = iterator2.next().longValue();
            final lnr.a companion = lnr.Companion;
            final kba a3 = kba.a;
            lnr.a.a(companion, kba.b, longValue, a, null, null, null, null, null, null, null, null, 1048568);
            this.b.put(longValue, ptv);
        }
    }
    
    public final long d(long b) {
        final ptv ptv = this.b.get(b);
        if (ptv != null) {
            b = ptv.b;
        }
        else {
            b = 0L;
        }
        return b;
    }
}
