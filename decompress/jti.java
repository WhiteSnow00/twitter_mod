import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jti extends ste implements qsb<bo6, lsi>
{
    public final lsi D0;
    
    public jti(final lsi d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final bo6 bo6 = (bo6)next;
        czd.f((Object)bo6, "quotedTweet");
        final lsi d0 = this.D0;
        final String h = bo6.h();
        final String m = bo6.M();
        final String e = bo6.E();
        final String a = bo6.A();
        final Iterable f = bo6.f();
        czd.e((Object)f, "quotedTweet.allMediaEntities");
        final Iterator iterator = ((y6a)f).iterator();
        while (true) {
            while (iterator.hasNext()) {
                next = iterator.next();
                if (((dtg)next).T0 == dtg.c.F0) {
                    final dtg dtg = (dtg)next;
                    String r0;
                    if (dtg != null) {
                        r0 = dtg.R0;
                    }
                    else {
                        r0 = null;
                    }
                    return lsi.a(d0, 0L, null, null, null, null, null, null, null, false, new lvl(h, m, e, a, r0, bo6.D0.N0), -1, 491519);
                }
            }
            next = null;
            continue;
        }
    }
}
