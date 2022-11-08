import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apl implements zol
{
    public final Map<Class<? extends n5s<?, ?>>, bpl> a;
    
    public apl(final Map<Class<? extends n5s<?, ?>>, ? extends bpl> a) {
        this.a = (Map<Class<? extends n5s<?, ?>>, bpl>)a;
    }
    
    public final b5j<mqi> a(final mqi mqi, final xsi xsi) {
        zzd.f((Object)mqi, "notificationBuilder");
        zzd.f((Object)xsi, "notificationLayout");
        final ArrayList list = new ArrayList();
        final k20 k20 = (k20)xsi.a.g(x50.H0);
        final Object o = null;
        if (k20 != null) {
            final Object c0 = ((z5s)k20).C0;
            k3j.v(c0, (Class)n5s.class);
            final n5s n5s = (n5s)c0;
            final bpl bpl = this.a.get(n5s.getClass());
            b5j map = null;
            Label_0135: {
                if (bpl != null) {
                    final b5j a = bpl.a(n5s);
                    if (a != null) {
                        map = a.map((qtb)new ros((rtb)new apl$a(mqi), 27));
                        break Label_0135;
                    }
                }
                map = null;
            }
            if (map != null) {
                list.add(map);
            }
        }
        final v30 v30 = (v30)xsi.a.g(x50.I0);
        if (v30 != null) {
            final Object c2 = ((z5s)v30).C0;
            k3j.v(c2, (Class)n5s.class);
            final n5s n5s2 = (n5s)c2;
            final bpl bpl2 = this.a.get(n5s2.getClass());
            Object map2 = o;
            if (bpl2 != null) {
                final b5j a2 = bpl2.a(n5s2);
                map2 = o;
                if (a2 != null) {
                    map2 = a2.map((qtb)new dzf((rtb)new apl$b(mqi), 6));
                }
            }
            if (map2 != null) {
                list.add(map2);
            }
        }
        final b5j doOnError = b5j.combineLatest((Iterable)list, (qtb)new wpl((rtb)new apl$c(mqi), 2)).doOnError((fk6)new jua((rtb)new apl$d(this), 29));
        zzd.e((Object)doOnError, "override fun setupLayout\u2026tEvent(\"failure\") }\n    }");
        return (b5j<mqi>)doOnError;
    }
}
