import java.util.Iterator;
import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r6k
{
    public static final boolean a(final q6k q6k, final String... array) {
        zzd.f((Object)q6k, "<this>");
        final List b = q6k.b;
        final boolean b2 = b instanceof Collection;
        final boolean b3 = false;
        boolean b4;
        if (b2 && b.isEmpty()) {
            b4 = b3;
        }
        else {
            final Iterator iterator = b.iterator();
            u6k u6k;
            do {
                b4 = b3;
                if (!iterator.hasNext()) {
                    return b4;
                }
                u6k = (u6k)iterator.next();
            } while (!jt0.A0((Object[])array, (Object)u6k.a) || !u6k.b);
            b4 = true;
        }
        return b4;
    }
    
    public static final void b(final pca<q6k> pca, final int n, final u93<q6k> u93) {
        zzd.f((Object)pca, "<this>");
        final b5j filter = pca.v0().filter((ptk)new wj4((rtb)new r6k$f(n), 2));
        zzd.e((Object)filter, "requestCode: Int, onNext\u2026uestCode == requestCode }");
        final m29 m29;
        m29.c(filter.doOnComplete((rj)new r6k$c(m29 = new m29())).subscribe((fk6)new f$o2((rtb)new r6k$d((u93)u93))));
    }
    
    public static final void c(final pca<q6k> pca, final int[] array, final rtb<? super q6k, oyv> rtb) {
        zzd.f((Object)pca, "<this>");
        final b5j filter = pca.v0().filter((ptk)new ku9((rtb)new r6k$e(array), 1));
        zzd.e((Object)filter, "vararg requestCode: Int,\u2026uestCode in requestCode }");
        final m29 m29;
        m29.c(filter.doOnComplete((rj)new r6k$a(m29 = new m29())).subscribe((fk6)new f$o2((rtb)new r6k$b((rtb)rtb))));
    }
}
