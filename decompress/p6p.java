import android.widget.BaseAdapter;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6p
{
    public final l5b a;
    public final kcm b;
    public a c;
    
    public p6p(final l5b a, final kcm b) {
        e0e.f((Object)a, "fleetsRepository");
        e0e.f((Object)b, "releaseCompletable");
        this.a = a;
        this.b = b;
    }
    
    public static final void a(final p6p p6p, Map z, final List list) {
        Objects.requireNonNull(p6p);
        if (list.isEmpty() ^ true) {
            final ArrayList list2 = new ArrayList(nr4.d1((Iterable)list, 10));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(String.valueOf(((Number)iterator.next()).longValue()));
            }
            final ArrayList list3 = new ArrayList<awj>(nr4.d1((Iterable)list2, 10));
            for (final String s : list2) {
                final vgw vgw = z.get(s);
                bhw b;
                if (vgw != null) {
                    b = vgw.b;
                }
                else {
                    b = null;
                }
                list3.add(new awj((Object)s, (Object)b));
            }
            z = mlg.Z((Iterable)list3);
            p6p.a.f(z);
            final a c = p6p.c;
            if (c != null) {
                ((BaseAdapter)((s9p)c).N0).notifyDataSetChanged();
            }
        }
    }
    
    public final void b(final Collection<? extends x9p> collection) {
        if (!xli.t()) {
            return;
        }
        final ArrayList list = new ArrayList();
        for (final Object next : collection) {
            if (next instanceof bn3) {
                list.add(next);
            }
        }
        final bn3 bn3 = (bn3)rr4.E1((List)list);
        List k;
        if (bn3 != null) {
            k = bn3.k;
        }
        else {
            k = null;
        }
        Object f0 = k;
        if (k == null) {
            f0 = h3a.F0;
        }
        this.b.i((sj)new jjd(t5j.just(f0).map((rtb)new t8o((stb)new p6p$b(this), 23)).flatMap((rtb)new a4o((stb)new p6p$c(this), 17)).subscribe((rk6)new gpl((stb)new p6p$d(this), 26), (rk6)new rm8((stb)p6p$e.F0, 29)), 10));
    }
    
    public final void c(final List<? extends ljw> list) {
        e0e.f((Object)list, "typeaheadUserSuggestions");
        if (!xli.u()) {
            return;
        }
        final ArrayList list2 = new ArrayList<Long>(nr4.d1((Iterable)list, 10));
        final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().b());
        }
        this.b.i((sj)new cj7(this.d((List<Long>)list2).subscribe((rk6)new e4b((stb)new p6p$f(this, (List)list2), 3), (rk6)new ucj((stb)p6p$g.F0, 20)), 9));
    }
    
    public final t5j<Map<String, vgw>> d(final List<Long> list) {
        t5j t5j;
        if (list.isEmpty() ^ true) {
            t5j = this.a.a((List)list).w((rtb)new wcn((stb)p6p$h.F0, 22)).P();
            e0e.e((Object)t5j, "{\n            fleetsRepo\u2026.toObservable()\n        }");
        }
        else {
            t5j = t5j.just((Object)m3a.F0);
            e0e.e((Object)t5j, "{\n            Observable\u2026ust(emptyMap())\n        }");
        }
        return (t5j<Map<String, vgw>>)t5j;
    }
    
    public interface a
    {
    }
}
