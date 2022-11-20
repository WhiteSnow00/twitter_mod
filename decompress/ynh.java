import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ynh extends ste implements qsb<boh, boh>
{
    public final ModuleOverviewViewModel D0;
    public final h9w E0;
    
    public ynh(final ModuleOverviewViewModel d0, final h9w e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final boh boh = (boh)o;
        czd.f((Object)boh, "$this$setState");
        final bmh s0 = this.D0.S0;
        final h9w e0 = this.E0;
        Objects.requireNonNull(s0);
        czd.f((Object)e0, "modules");
        final cmh cmh = new cmh(s0, e0);
        final dmh dmh = new dmh(s0, e0);
        if (n4l.Companion.b()) {
            o = cmh.invoke();
        }
        else {
            o = dmh.invoke();
        }
        final List list = (List)o;
        final bmh s2 = this.D0.S0;
        final h9w e2 = this.E0;
        Objects.requireNonNull(s2);
        czd.f((Object)e2, "modules");
        final List b = e2.b;
        if (!(b instanceof Collection) || !b.isEmpty()) {
            final Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                final g9w d = ((f9w)iterator.next()).d;
                String a;
                if (d != null) {
                    a = d.a;
                }
                else {
                    a = null;
                }
                if (s2.a(a, e2)) {
                    final boolean b2 = true;
                    return boh.l(boh, false, list, b2, n4l.Companion.b() ^ true, false, 16);
                }
            }
        }
        final boolean b2 = false;
        return boh.l(boh, false, list, b2, n4l.Companion.b() ^ true, false, 16);
    }
}
