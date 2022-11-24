import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w1h
{
    public static jvg a(jvg jvg, final List<Long> list, final Set<Long> set) {
        final jvg.a a = new jvg.a();
        final Iterator<wtg> iterator = jvg.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final wtg wtg = iterator.next();
            int n2 = n;
            wtg wtg2 = wtg;
            if (list.contains(wtg.P0)) {
                n2 = n;
                wtg2 = wtg;
                if (!wtg.Y0.isEmpty()) {
                    final List y0 = wtg.Y0;
                    final ojf$a ojf$a = new ojf$a(y0.size());
                    for (final m1h m1h : y0) {
                        if (!set.contains(m1h.a)) {
                            ((ojf)ojf$a).p((Object)m1h);
                        }
                    }
                    List p3 = y0;
                    if (((ojf)ojf$a).size() != y0.size()) {
                        p3 = (List)((z4j)ojf$a).e();
                    }
                    n2 = n;
                    wtg2 = wtg;
                    if (p3 != wtg.Y0) {
                        final wtg$a wtg$a = new wtg$a(wtg);
                        wtg$a.p = p3;
                        wtg2 = (wtg)((z4j)wtg$a).e();
                        n2 = 1;
                    }
                }
            }
            ((d8a.a<wtg, d8a, d8a.a>)a).p(wtg2);
            n = n2;
        }
        if (n != 0) {
            jvg = (jvg)a.e();
        }
        return jvg;
    }
    
    public static List<m1h> b(final Iterable<wtg> iterable) {
        final Iterator<wtg> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            final ged$b g0 = ged.G0;
            final int a = o5j.a;
            return (List<m1h>)g0;
        }
        final wtg wtg = iterator.next();
        if (!iterator.hasNext()) {
            return wtg.Y0;
        }
        final ojf j = ojf.J();
        j.q((Iterable)wtg.Y0);
        while (iterator.hasNext()) {
            j.q((Iterable)iterator.next().Y0);
        }
        return (List)((z4j)j).e();
    }
    
    public static List<m1h> c(final List<? extends yas> list) {
        Object o;
        if (list.isEmpty()) {
            o = ged.G0;
            final int a = o5j.a;
        }
        else if (list.size() == 1) {
            o = list.get(0).a();
        }
        else {
            final ojf j = ojf.J();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                j.q((Iterable)((yas)iterator.next()).a());
            }
            o = ((z4j)j).e();
        }
        return (List<m1h>)o;
    }
    
    public static m1h d(final List<m1h> list, final UserIdentifier userIdentifier) {
        for (final m1h m1h : list) {
            if (userIdentifier.hasId(m1h.a)) {
                return m1h;
            }
        }
        return null;
    }
}
