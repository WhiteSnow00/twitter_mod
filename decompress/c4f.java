import java.util.Iterator;
import java.util.List;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4f implements fmj$a
{
    public static final c4f a;
    
    static {
        a = new c4f();
    }
    
    public final void a(final m9a m9a) {
        final StringBuilder sb = new StringBuilder(512);
        final b4f a = gwl.c().I6().a;
        Object o = a.b;
        synchronized (o) {
            final List u = ojf.u((Iterable)a.b.keySet());
            monitorexit(o);
            o = a.b();
            sb.append("Created Services: ");
            sb.append(a.a.get());
            sb.append(", Active: ");
            sb.append(u.size());
            sb.append(", Leaked: ");
            sb.append(((List)o).size());
            sb.append('\n');
            for (final Service service : u) {
                sb.append("* ");
                sb.append(service.getClass().getSimpleName());
                sb.append(" (alive for ");
                sb.append(nq1.c(a.a((Object)service)));
                sb.append(")\n");
            }
            final Iterator iterator2 = ((List)o).iterator();
            while (iterator2.hasNext()) {
                o = iterator2.next();
                sb.append("* ");
                sb.append(((List)o).getClass().getSimpleName());
                sb.append(" (*leaked* for ");
                sb.append(nq1.c(a.c(o)));
                sb.append(")\n");
            }
            m9a.b("OomeReporter.service_report", (Object)sb.toString());
        }
    }
}
