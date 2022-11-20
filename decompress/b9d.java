import java.util.LinkedHashSet;
import com.twitter.util.user.UserIdentifier;
import java.net.InetAddress;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9d implements oj
{
    public final int D0;
    public final String E0;
    public final Object F0;
    public final Object G0;
    
    public b9d(final Object f0, final String e0, final Object g0, final int d0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
        this.G0 = g0;
    }
    
    public final void run() {
        switch (this.D0) {
            case 0: {
                final c9d c9d = (c9d)this.F0;
                final String e0 = this.E0;
                final List list = (List)this.G0;
                czd.f((Object)c9d, "this$0");
                czd.f((Object)e0, "$hostname");
                czd.f((Object)list, "$addresses");
                synchronized (c9d.c) {
                    if (c9d.c.contains(e0)) {
                        monitorexit(c9d.c);
                        return;
                    }
                    c9d.c.add(e0);
                    monitorexit(c9d.c);
                    ((d49)c9d).b(e0, list, (qsb<? super String, fzv>)new c9d$a(c9d));
                    final LinkedHashSet c = c9d.c;
                    synchronized (c9d.c) {
                        c9d.c.remove(e0);
                        return;
                    }
                }
                break;
            }
        }
        final atg atg = (atg)this.F0;
        final String e2 = this.E0;
        final UserIdentifier userIdentifier = (UserIdentifier)this.G0;
        final cjh c2 = cjh.c(((np1)atg.a).T());
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).s(itl.a(new String[] { itl.b("upload_operation_id", (Object)e2), itl.b("user_id", (Object)userIdentifier.getId()) }));
        c2.a((Class)wsg$b.class, (osl)((n4j)osl$a).e());
    }
}
