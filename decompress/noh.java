import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class noh extends pue implements stb<qoh, qoh>
{
    public final ModuleOverviewViewModel F0;
    public final x9w G0;
    
    public noh(final ModuleOverviewViewModel f0, final x9w g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final qoh qoh = (qoh)o;
        e0e.f((Object)qoh, "$this$setState");
        final qmh u0 = this.F0.U0;
        final x9w g0 = this.G0;
        Objects.requireNonNull(u0);
        e0e.f((Object)g0, "modules");
        final rmh rmh = new rmh(u0, g0);
        final smh smh = new smh(u0, g0);
        if (c5l.Companion.b()) {
            o = rmh.invoke();
        }
        else {
            o = smh.invoke();
        }
        final List list = (List)o;
        final qmh u2 = this.F0.U0;
        final x9w g2 = this.G0;
        Objects.requireNonNull(u2);
        e0e.f((Object)g2, "modules");
        final List b = g2.b;
        if (!(b instanceof Collection) || !b.isEmpty()) {
            final Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                final w9w d = ((v9w)iterator.next()).d;
                String a;
                if (d != null) {
                    a = d.a;
                }
                else {
                    a = null;
                }
                if (u2.a(a, g2)) {
                    final boolean b2 = true;
                    return qoh.l(qoh, false, list, b2, c5l.Companion.b() ^ true, false, 16);
                }
            }
        }
        final boolean b2 = false;
        return qoh.l(qoh, false, list, b2, c5l.Companion.b() ^ true, false, 16);
    }
}
