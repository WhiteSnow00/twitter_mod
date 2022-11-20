import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmq extends ai8<ql1>
{
    public static final pmq.pmq$a Companion;
    public final h4b c;
    public final smq d;
    public final nnl<tmi> e;
    public List<String> f;
    
    static {
        Companion = new pmq.pmq$a();
    }
    
    public pmq(final h4b c, final smq d) {
        czd.f((Object)c, "fleetsRepository");
        czd.f((Object)d, "errorReporter");
        this.c = c;
        this.d = d;
        this.e = (nnl<tmi>)new nnl();
    }
    
    public final void g(final List<? extends ql1> list, final s2b s2b, final String s, final boolean b) {
        if (s2b != null) {
            final ArrayList f = this.f;
            ArrayList<String> f2 = null;
            Label_0577: {
                if (f == null) {
                    final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
                    int n = 0;
                    while (true) {
                        while (iterator.hasNext()) {
                            if (czd.a((Object)iterator.next().a(), (Object)s2b)) {
                                final ArrayList list2 = new ArrayList();
                                for (final ql1 next : list) {
                                    final ql1 ql1 = next;
                                    if (!ql1.b() && !ql1.e() && !ql1.d()) {
                                        list2.add(next);
                                    }
                                }
                                if (n != -1 && (list2.isEmpty() ^ true) && (list.get(n).d() || list.get(n).e() || !list.get(n).b())) {
                                    final ArrayList<ql1> list3 = new ArrayList<ql1>();
                                    for (final ql1 next2 : list) {
                                        final ql1 ql2 = next2;
                                        if (!ql2.b() || ql2.e() || ql2.d()) {
                                            list3.add(next2);
                                        }
                                    }
                                    final ArrayList list4 = new ArrayList<String>(iq4.H((Iterable)list3, 10));
                                    final Iterator<ql1> iterator4 = list3.iterator();
                                    while (true) {
                                        f2 = (ArrayList<String>)list4;
                                        if (!iterator4.hasNext()) {
                                            break Label_0577;
                                        }
                                        list4.add((Object)iterator4.next().a());
                                    }
                                }
                                else {
                                    final ArrayList list5 = new ArrayList<String>(iq4.H((Iterable)list, 10));
                                    final Iterator<ql1> iterator5 = list.iterator();
                                    while (true) {
                                        f2 = (ArrayList<String>)list5;
                                        if (!iterator5.hasNext()) {
                                            break Label_0577;
                                        }
                                        list5.add((Object)iterator5.next().a());
                                    }
                                }
                            }
                            else {
                                ++n;
                            }
                        }
                        n = -1;
                        continue;
                    }
                }
                final ArrayList list6 = new ArrayList();
                for (final ql1 next3 : list) {
                    final ql1 ql3 = next3;
                    if (f.contains(ql3.a()) || ql3.e()) {
                        list6.add(next3);
                    }
                }
                final ArrayList list7 = new ArrayList<String>(iq4.H((Iterable)list6, 10));
                final Iterator iterator7 = list6.iterator();
                while (true) {
                    f2 = (ArrayList<String>)list7;
                    if (!iterator7.hasNext()) {
                        break;
                    }
                    list7.add((Object)((ql1)iterator7.next()).a());
                }
            }
            final ArrayList<ql1> list8 = new ArrayList<ql1>();
            for (final ql1 next4 : list) {
                if (f2.contains(next4.a())) {
                    list8.add(next4);
                }
            }
            this.d((n3e)new ckf((Iterable)list8));
            this.e.onNext((Object)tmi.a);
            this.f = f2;
        }
        else {
            this.d((n3e)new ckf((Iterable)list));
            this.e.onNext((Object)tmi.a);
        }
    }
    
    public final long getItemId(int n) {
        final Object item = this.getItem(n);
        czd.e(item, "getItem(position)");
        final ql1 ql1 = (ql1)item;
        if (ql1 instanceof tmq) {
            final pmq.pmq$a companion = pmq.Companion;
            final tmq tmq = (tmq)ql1;
            Objects.requireNonNull(companion);
            if (tmq.o.a.length() == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                return -1L;
            }
            n = tmq.o.a.hashCode();
        }
        else {
            n = ((ql1)this.getItem(n)).a().hashCode();
        }
        return n;
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
