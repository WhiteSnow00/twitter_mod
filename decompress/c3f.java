import android.view.Window;
import java.text.NumberFormat;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c3f implements plj$a
{
    public final void a(final h8a h8a) {
        final StringBuilder sb = new StringBuilder(512);
        final e3f a = pd.b().q3().a;
        Object o = a.b;
        synchronized (o) {
            final List u = rif.u((Iterable)a.b.keySet());
            monitorexit(o);
            o = a.b();
            sb.append("Created Activities: ");
            sb.append(a.a.get());
            sb.append(", Active: ");
            sb.append(u.size());
            sb.append(", Leaked: ");
            sb.append(((List)o).size());
            sb.append('\n');
            for (final Activity activity : u) {
                sb.append("* ");
                sb.append(activity.getClass().getSimpleName());
                sb.append(" (alive for ");
                sb.append(hq1.c(a.a(activity)));
                this.b(sb, activity);
                sb.append(")\n");
            }
            final Iterator iterator2 = ((List)o).iterator();
            while (iterator2.hasNext()) {
                o = iterator2.next();
                sb.append("* ");
                sb.append(((List)o).getClass().getSimpleName());
                sb.append(" (*leaked* for ");
                sb.append(hq1.c(a.c(o)));
                this.b(sb, (Activity)o);
                sb.append(")\n");
            }
            h8a.b("OomeReporter.activity_report", (Object)sb.toString());
        }
    }
    
    public final void b(final StringBuilder sb, final Activity activity) {
        try {
            final za8$a za8$a = new za8$a();
            final NumberFormat c = ikr.c;
            final Window window = activity.getWindow();
            if (window != null) {
                za8.a(window.getDecorView(), (n93)za8$a);
            }
            if (activity instanceof cnb) {
                final List m = ((cnb)activity).P().M();
                if (m != null) {
                    for (final Fragment fragment : m) {
                        if (fragment != null) {
                            za8.a(fragment.k1, (n93)za8$a);
                        }
                    }
                }
            }
            sb.append(", ");
            sb.append(c.format(za8$a.a));
            sb.append(", ");
            sb.append(c.format(za8$a.b));
        }
        catch (final OutOfMemoryError outOfMemoryError) {}
    }
}
