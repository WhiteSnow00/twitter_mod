import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import android.content.Context;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rvp implements mx9<ovp$c>
{
    public final obi<?> D0;
    public final awp E0;
    
    public rvp(final obi<?> d0, final awp e0) {
        czd.f((Object)d0, "navigator");
        czd.f((Object)e0, "requestHelper");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void q(final Object o) {
        final ovp$c ovp$c = (ovp$c)o;
        czd.f((Object)ovp$c, "effect");
        if (ovp$c instanceof ovp$c$b) {
            final awp e0 = this.E0;
            final String a = ovp$c.a();
            final List e2 = ((ovp$c$b)ovp$c).e;
            final us7 b = ovp$c.b();
            final pvp pvp = new pvp(this);
            Objects.requireNonNull(e0);
            czd.f((Object)a, "commentText");
            czd.f((Object)e2, "users");
            czd.f((Object)b, "content");
            final qo7.a a2 = new qo7.a();
            a2.d = chw.P();
            a2.h = true;
            final ArrayList b2 = new ArrayList<exj>(iq4.H((Iterable)e2, 10));
            final Iterator iterator = e2.iterator();
            while (iterator.hasNext()) {
                b2.add(exj.a((cgv)iterator.next()));
            }
            a2.b = (List<exj>)b2;
            final qo7 qo7 = (qo7)a2.e();
            final w19 h = e0.h;
            final qqh c = e0.c;
            final LinkedHashSet set = new LinkedHashSet();
            final Iterator iterator2 = e2.iterator();
            while (iterator2.hasNext()) {
                set.add(((cgv)iterator2.next()).D0);
            }
            h.c(c.a((Set)set).w((psb)new ti4((qsb)new xvp(qo7), 4)).G((lj6)new sma((qsb)new yvp(e0, a, b, (ftb<? super tj7, ? super Context, fzv>)pvp), 10), (lj6)jub.e));
        }
        else if (ovp$c instanceof ovp$c$a) {
            final awp e3 = this.E0;
            final String a3 = ovp$c.a();
            final ovp$c$a ovp$c$a = (ovp$c$a)ovp$c;
            final List f = ovp$c$a.f;
            final List e4 = ovp$c$a.e;
            final us7 b3 = ovp$c.b();
            final qvp qvp = new qvp(this);
            Objects.requireNonNull(e3);
            czd.f((Object)a3, "commentText");
            czd.f((Object)f, "conversations");
            czd.f((Object)e4, "users");
            czd.f((Object)b3, "content");
            final ArrayList list = new ArrayList<Object>(iq4.H((Iterable)e4, 10));
            for (final cgv cgv : e4) {
                final qo7.a a4 = new qo7.a();
                a4.d = chw.U(e3.a.getId(), cgv.D0);
                a4.b = s9i.r(exj.a(cgv));
                list.add(a4.e());
            }
            final List x0 = mq4.x0((Collection)list, (Iterable)f);
            final trc c2 = trc.c();
            czd.e((Object)c2, "get()");
            e3.h.c(h5j.fromIterable((Iterable)x0).flatMapSingle((psb)new ola((qsb)new uvp(c2, e3, a3, b3), 7)).toList().G((lj6)new st1((qsb)new vvp(x0, e3, b3, (ftb<? super tj7, ? super Context, fzv>)qvp), 6), (lj6)jub.e));
        }
    }
}
