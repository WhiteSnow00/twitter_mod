import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6p implements c9p
{
    public final a8p a;
    
    public p6p(final a8p a) {
        zzd.f((Object)a, "suggestionCache");
        this.a = a;
    }
    
    @Override
    public final List<l8p> a(final String s, final psl psl) {
        zzd.f((Object)s, "untrimmedQuery");
        return (List<l8p>)v2a.C0;
    }
    
    @Override
    public final List<l8p> b(final String s, final String s2, final psl psl) {
        zzd.f((Object)s, "untrimmedQuery");
        zzd.f((Object)s2, "trimmedQuery");
        final ArrayList list = new ArrayList();
        final LinkedHashSet set = new LinkedHashSet();
        final ffv a = this.a.a(s2);
        if (a != null) {
            final List d = a.d;
            zzd.e((Object)d, "tas.channels");
            final b2m a2 = b2m.a;
            final ArrayList list2 = new ArrayList();
            for (final efv efv : d) {
                final mev e = efv.e;
                zzd.c((Object)e);
                final hfv d2 = efv.d;
                zzd.c((Object)d2);
                final psl psl2 = new psl(e.b, 0);
                if (!set.contains(psl2)) {
                    set.add(psl2);
                    final mev e2 = efv.e;
                    zzd.c((Object)e2);
                    final mev e3 = efv.e;
                    zzd.c((Object)e3);
                    final String b = e3.b;
                    final mev e4 = efv.e;
                    zzd.c((Object)e4);
                    list2.add(new sq3(e2, s, b, e4.a, d2));
                }
            }
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
        }
        return list;
    }
}
