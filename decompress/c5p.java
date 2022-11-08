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

public final class c5p
{
    public final m5b a;
    public final ibm b;
    public a c;
    
    public c5p(final m5b a, final ibm b) {
        zzd.f((Object)a, "fleetsRepository");
        zzd.f((Object)b, "releaseCompletable");
        this.a = a;
        this.b = b;
    }
    
    public static final void a(final c5p c5p, Map r1, final List list) {
        Objects.requireNonNull(c5p);
        if (list.isEmpty() ^ true) {
            final ArrayList list2 = new ArrayList(kr4.h1((Iterable)list, 10));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(String.valueOf(((Number)iterator.next()).longValue()));
            }
            final ArrayList list3 = new ArrayList<gvj>(kr4.h1((Iterable)list2, 10));
            for (final String s : list2) {
                final lfw lfw = r1.get(s);
                rfw b;
                if (lfw != null) {
                    b = lfw.b;
                }
                else {
                    b = null;
                }
                list3.add(new gvj((Object)s, (Object)b));
            }
            r1 = vkg.r1((Iterable)list3);
            c5p.a.f(r1);
            final a c = c5p.c;
            if (c != null) {
                ((BaseAdapter)((g8p)c).K0).notifyDataSetChanged();
            }
        }
    }
    
    public final void b(final Collection<? extends l8p> collection) {
        if (!bfe.w()) {
            return;
        }
        final ArrayList list = new ArrayList();
        for (final Object next : collection) {
            if (next instanceof sm3) {
                list.add(next);
            }
        }
        final sm3 sm3 = (sm3)or4.I1((List)list);
        List k;
        if (sm3 != null) {
            k = sm3.k;
        }
        else {
            k = null;
        }
        Object c0 = k;
        if (k == null) {
            c0 = v2a.C0;
        }
        this.b.i((rj)new hjd(b5j.just(c0).map((qtb)new r0n((rtb)new c5p$b(this), 25)).flatMap((qtb)new t2o((rtb)new c5p$c(this), 18)).subscribe((fk6)new zgw((rtb)new c5p$d(this), 22), (fk6)new hlx((rtb)c5p$e.C0, 24)), 9));
    }
    
    public final void c(final List<? extends diw> list) {
        zzd.f((Object)list, "typeaheadUserSuggestions");
        if (!bfe.x()) {
            return;
        }
        final ArrayList list2 = new ArrayList<Long>(kr4.h1((Iterable)list, 10));
        final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().b());
        }
        this.b.i((rj)new svu(this.d((List<Long>)list2).subscribe((fk6)new b5p((rtb)new c5p$f(this, (List)list2), 0), (fk6)new c5l((rtb)c5p$g.C0, 18)), 12));
    }
    
    public final b5j<Map<String, lfw>> d(final List<Long> list) {
        b5j b5j;
        if (list.isEmpty() ^ true) {
            b5j = this.a.a((List)list).w((qtb)new sbn((rtb)c5p$h.C0, 22)).P();
            zzd.e((Object)b5j, "{\n            fleetsRepo\u2026.toObservable()\n        }");
        }
        else {
            b5j = b5j.just((Object)a3a.C0);
            zzd.e((Object)b5j, "{\n            Observable\u2026ust(emptyMap())\n        }");
        }
        return (b5j<Map<String, lfw>>)b5j;
    }
    
    public interface a
    {
    }
}
