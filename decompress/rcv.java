import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcv implements w00<String>
{
    public final vzo a;
    public final hew b;
    public final a c;
    public final Set<p1p> d;
    
    public rcv(final vzo a, final hew b, final Set<p1p> d) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = new a();
    }
    
    public final w00$a a(final UserIdentifier userIdentifier, final List<String> list) {
        final ArrayList list2 = new ArrayList();
        Objects.requireNonNull(this.c);
        final StringBuilder j = fu8.j("[");
        j.append(ikr.h((CharSequence)",", (Iterable)list));
        j.append("]");
        list2.add(new gs1("log", j.toString()));
        final String g = this.b.a.g(userIdentifier).A().g;
        if (g != null) {
            list2.add(new gs1("lang", g));
        }
        final brc f = brc.f(userIdentifier);
        this.a.a.c("debug_prefs");
        wk0.b().t();
        ((gm1)f).d((CharSequence)asa.d().l("scribe_url", "https://api.twitter.com/1.1/jot/client_event"));
        ((gm1)f).h = arc$b.G0;
        final int a = c5j.a;
        ((gm1)f).q = (mrc)gev.c();
        ((gm1)f).c((List)list2);
        final arc e = f.e();
        e.d();
        final bsc n = e.n;
        jee.l((Object)n);
        final boolean z = e.z();
        final int a2 = n.a;
        final w00$a w00$a = new w00$a(z, a2);
        final py6 c = this.a.c;
        if (c != null) {
            final long i = n.i;
            if (((cjg)c).r) {
                c.x.addAndGet(i);
                ((cjg)c).v();
            }
        }
        if (z) {
            final Iterator<p1p> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().a((List)list, userIdentifier);
            }
        }
        else if (a2 == 400) {
            final Set r = dnp.r((Iterable)new s4e((Iterable)list, (jtb)qcv.b));
            final h8a h8a = new h8a((Throwable)new b());
            ((HashMap<String, String>)h8a.a).put("logs", ikr.h((CharSequence)",\n", (Iterable)r));
            m8a.c(h8a);
        }
        return w00$a;
    }
    
    public static final class a
    {
    }
    
    public static final class b extends RuntimeException
    {
        public b() {
            super("Flushed logs contained invalid data");
        }
    }
}
