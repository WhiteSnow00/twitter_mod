import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1h
{
    public static pug a(pug pug, final List<Long> list, final Set<Long> set) {
        final pug$a pug$a = new pug$a();
        final Iterator iterator = ((p7a)pug).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final dtg dtg = iterator.next();
            int n2 = n;
            Object o = dtg;
            if (list.contains(dtg.M0)) {
                n2 = n;
                o = dtg;
                if (!dtg.V0.isEmpty()) {
                    final List<s0h> v0 = dtg.V0;
                    final ijf$a ijf$a = new ijf$a(v0.size());
                    for (final s0h s0h : v0) {
                        if (!set.contains(s0h.a)) {
                            ((ijf)ijf$a).p((Object)s0h);
                        }
                    }
                    List p3 = v0;
                    if (((ijf)ijf$a).size() != v0.size()) {
                        p3 = (List)((h4j)ijf$a).e();
                    }
                    n2 = n;
                    o = dtg;
                    if (p3 != dtg.V0) {
                        final dtg.a a = new dtg.a(dtg);
                        a.p = p3;
                        o = ((h4j)a).e();
                        n2 = 1;
                    }
                }
            }
            ((p7a.a<d7a, p7a, p7a.a>)pug$a).p((d7a)o);
            n = n2;
        }
        if (n != 0) {
            pug = (pug)((h4j)pug$a).e();
        }
        return pug;
    }
    
    public static List<s0h> b(final Iterable<dtg> iterable) {
        final Iterator<dtg> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            return (List<s0h>)d0;
        }
        final dtg dtg = iterator.next();
        if (!iterator.hasNext()) {
            return dtg.V0;
        }
        final ijf j = ijf.J();
        j.q((Iterable)dtg.V0);
        while (iterator.hasNext()) {
            j.q((Iterable)iterator.next().V0);
        }
        return (List)((h4j)j).e();
    }
    
    public static List<s0h> c(final List<? extends l9s> list) {
        Object o;
        if (list.isEmpty()) {
            o = ced.D0;
            final int a = w4j.a;
        }
        else if (list.size() == 1) {
            o = list.get(0).a();
        }
        else {
            final ijf j = ijf.J();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                j.q((Iterable)((l9s)iterator.next()).a());
            }
            o = ((h4j)j).e();
        }
        return (List<s0h>)o;
    }
    
    public static s0h d(final List<s0h> list, final UserIdentifier userIdentifier) {
        for (final s0h s0h : list) {
            if (userIdentifier.hasId(s0h.a)) {
                return s0h;
            }
        }
        return null;
    }
}
