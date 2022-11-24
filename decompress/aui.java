import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aui extends pue implements stb<hp6, bti>
{
    public final bti F0;
    
    public aui(final bti f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final hp6 hp6 = (hp6)next;
        e0e.f((Object)hp6, "quotedTweet");
        final bti f0 = this.F0;
        final String h = hp6.h();
        final String m = hp6.M();
        final String e = hp6.E();
        final String a = hp6.A();
        final Iterable<wtg> f2 = hp6.f();
        e0e.e((Object)f2, "quotedTweet.allMediaEntities");
        final Iterator iterator = ((d8a)f2).iterator();
        while (true) {
            while (iterator.hasNext()) {
                next = iterator.next();
                if (((wtg)next).V0 == wtg$c.H0) {
                    final wtg wtg = (wtg)next;
                    String t0;
                    if (wtg != null) {
                        t0 = wtg.T0;
                    }
                    else {
                        t0 = null;
                    }
                    return bti.a(f0, 0L, (String)null, (String)null, (String)null, (ewi)null, (List)null, (List)null, (String)null, false, new uvl(h, m, e, a, t0, hp6.F0.P0), -1, 491519);
                }
            }
            next = null;
            continue;
        }
    }
}
