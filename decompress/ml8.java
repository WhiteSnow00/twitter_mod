import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ml8 extends ste implements qsb<List<? extends lsi>, fzv>
{
    public final nl8 D0;
    
    public ml8(final nl8 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        final ArrayList d = ib0.D(list, "notificationInfos");
        for (final Object next : list) {
            final fvi k = ((lsi)next).K;
            String a;
            if (k != null) {
                a = k.a;
            }
            else {
                a = null;
            }
            if (czd.a((Object)a, (Object)"DELAY")) {
                d.add(next);
            }
        }
        final nl8 d2 = this.D0;
        for (final lsi lsi : d) {
            d2.b.a(lsi, "delay_cancel");
            final sql c = d2.c;
            final UserIdentifier b = d2.d.b();
            czd.e((Object)b, "userManager.current");
            c.b(b, s9i.r(lsi.a));
        }
        return fzv.a;
    }
}
