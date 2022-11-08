import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f1k
{
    public static final f1k.f1k$a Companion;
    public final LinkedList<? extends List<e1k>> a;
    
    static {
        Companion = new f1k.f1k$a();
    }
    
    public f1k() {
        this(null, 1, null);
    }
    
    public f1k(final LinkedList<? extends List<e1k>> a) {
        zzd.f((Object)a, "pendingScribeEvents");
        this.a = a;
    }
    
    public final List<zf4> a(final Long n) {
        final LinkedList<? extends List<e1k>> a = this.a;
        zzd.f((Object)a, "<this>");
        final boolean empty = a.isEmpty();
        final List list = null;
        Object remove;
        if (empty) {
            remove = null;
        }
        else {
            remove = a.remove(0);
        }
        final List list2 = (List)remove;
        lev lev;
        if (n != null) {
            final long longValue = n.longValue();
            lev = new lev();
            lev.a = longValue;
            lev.c = 0;
        }
        else {
            lev = null;
        }
        List p = list;
        if (list2 != null) {
            final ArrayList list3 = new ArrayList<zf4>(kr4.h1((Iterable)list2, 10));
            for (final e1k e1k : list2) {
                final zf4 zf4 = new zf4(e1k.a, new String[] { e1k.b });
                zf4.j((Collection)e1k.d);
                if (lev != null) {
                    final rth$a g = zf4.g;
                    final int a2 = w4j.a;
                    ((List<lev>)g).add(0, lev);
                }
                final Long c = e1k.c;
                if (c != null) {
                    zf4.s((long)c);
                }
                final rzo f = e1k.f;
                if (f != null) {
                    zf4.Y0 = f;
                }
                list3.add(zf4);
            }
            p = or4.p2((Collection)list3);
        }
        List list4;
        if ((list4 = p) == null) {
            list4 = new ArrayList();
        }
        return list4;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f1k && zzd.a((Object)this.a, (Object)((f1k)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final LinkedList<? extends List<e1k>> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("PendingComposerScribeEventsHolder(pendingScribeEvents=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
