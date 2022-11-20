import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = { 485, 503 }, m = "invokeSuspend")
public final class j5m extends p0s implements itb<cy6, hqh, go6<? super fzv>, Object>
{
    public List D0;
    public List E0;
    public List F0;
    public Set G0;
    public Set H0;
    public int I0;
    public hqh J0;
    public final d5m K0;
    
    public j5m(final d5m k0, final go6<? super j5m> go6) {
        this.K0 = k0;
        super(3, (go6)go6);
    }
    
    public static final void b(final List list, final List list2, final List list3, final Set set, final Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }
    
    public static final void h(final List list, final d5m d5m) {
        list.clear();
        synchronized (d5m.d) {
            final ArrayList k = d5m.k;
            for (int i = 0; i < k.size(); ++i) {
                list.add(k.get(i));
            }
            d5m.k.clear();
        }
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final cy6 cy6 = (cy6)o;
        final hqh j0 = (hqh)o2;
        final j5m j5m = new j5m(this.K0, (go6<? super j5m>)o3);
        j5m.J0 = j0;
        return j5m.invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object d0) {
        Object d2 = dy6.D0;
        final int i0 = this.I0;
        final int n = 1;
        int j = 1;
        Label_0637: {
            while (true) {
                Set set = null;
                Object o = null;
                Object o2 = null;
                Object f0 = null;
                Object o3 = null;
                Object d4 = null;
                Object d5 = null;
                Object o4 = null;
                Label_0429: {
                    Object d6;
                    LinkedHashSet g2;
                    if (i0 != 0) {
                        if (i0 == 1) {
                            set = this.H0;
                            o = this.G0;
                            o2 = this.F0;
                            f0 = this.E0;
                            final List d3 = this.D0;
                            o3 = this.J0;
                            b1n.u(d0);
                            d0 = d3;
                            d4 = d2;
                            d5 = d2;
                            j = n;
                            o4 = this;
                            break Label_0429;
                        }
                        if (i0 == 2) {
                            set = this.H0;
                            final Set g0 = this.G0;
                            f0 = this.F0;
                            o2 = this.E0;
                            d5 = this.D0;
                            o = this.J0;
                            b1n.u(d0);
                            d6 = this;
                            d0 = d2;
                            break Label_0637;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        b1n.u(d0);
                        o3 = this.J0;
                        o = new ArrayList();
                        o2 = new ArrayList();
                        f0 = new ArrayList();
                        g2 = new LinkedHashSet();
                        set = new LinkedHashSet();
                        d6 = this;
                        d4 = d2;
                        d5 = d2;
                    }
                    final Object d7 = ((j5m)d6).K0.d;
                    monitorenter(d7);
                    monitorexit(d7);
                    Object o5 = ((j5m)d6).K0;
                    ((j5m)d6).J0 = (hqh)o3;
                    ((j5m)d6).D0 = (List)o;
                    ((j5m)d6).E0 = (List)o2;
                    ((j5m)d6).F0 = (List)f0;
                    ((j5m)d6).G0 = g2;
                    ((j5m)d6).H0 = set;
                    ((j5m)d6).I0 = j;
                    Label_0393: {
                        if (!((d5m)o5).v()) {
                            final qf3 o6 = new qf3(g63.H((go6)d6), j);
                            o6.r();
                            Object o7 = ((d5m)o5).d;
                            synchronized (o7) {
                                if (((d5m)o5).v()) {
                                    o6.resumeWith((Object)fzv.a);
                                }
                                else {
                                    ((d5m)o5).o = (pf3)o6;
                                }
                                o5 = fzv.a;
                                monitorexit(o7);
                                o7 = o6.q();
                                if (o7 == d5) {
                                    o5 = o7;
                                }
                                break Label_0393;
                            }
                        }
                        o5 = fzv.a;
                    }
                    if (o5 == d4) {
                        return d4;
                    }
                    final List list = (List)o2;
                    o2 = f0;
                    final List list2 = (List)g2;
                    o4 = d6;
                    f0 = list;
                    d0 = o;
                    o = list2;
                }
                final d5m k0 = ((j5m)o4).K0;
                Object d6 = k0.d;
                synchronized (d6) {
                    boolean b = false;
                    Label_0478: {
                        if (!d5m.p(k0)) {
                            d5m.r(k0);
                            if (!d5m.p(k0)) {
                                b = true;
                                break Label_0478;
                            }
                        }
                        b = false;
                    }
                    monitorexit(d6);
                    if (b) {
                        d6 = o2;
                        final Object o8 = o;
                        o = d0;
                        o2 = f0;
                        f0 = d6;
                        d0 = o8;
                        d6 = o4;
                        continue;
                    }
                    d6 = new j5m$a(((j5m)o4).K0, (List)d0, (List)d6, (Set)o, (List)o2, set);
                    ((j5m)o4).J0 = (hqh)o3;
                    ((j5m)o4).D0 = (List)d0;
                    ((j5m)o4).E0 = (List)d6;
                    ((j5m)o4).F0 = (List)o2;
                    ((j5m)o4).G0 = (Set)o;
                    ((j5m)o4).H0 = set;
                    ((j5m)o4).I0 = 2;
                    if (((hqh)o3).e((qsb)d6, (go6)o4) == d4) {
                        return d4;
                    }
                    final Set g0 = (Set)o;
                    d6 = (o = o4);
                    d2 = d5;
                    d5 = d0;
                    f0 = o2;
                    o2 = d6;
                    o = o3;
                    d0 = d4;
                    final d5m k2 = ((j5m)d6).K0;
                    o3 = k2.d;
                    synchronized (o3) {
                        if (k2.l.isEmpty() ^ true) {
                            final List l = iq4.I((Iterable)k2.l.values());
                            k2.l.clear();
                            d4 = new(java.util.ArrayList.class)();
                            final ArrayList list3 = (ArrayList)l;
                            new ArrayList(list3.size());
                            for (final int size = list3.size(), j = 0; j < size; ++j) {
                                final orh orh = list3.get(j);
                                ((ArrayList<lvj>)d4).add(new lvj((Object)orh, k2.m.get(orh)));
                            }
                            k2.m.clear();
                        }
                        else {
                            d4 = f2a.D0;
                        }
                        monitorexit(o3);
                        int size2;
                        for (size2 = ((List)d4).size(), j = 0; j < size2; ++j) {
                            final lvj lvj = ((List<lvj>)d4).get(j);
                            o3 = lvj.D0;
                            final nrh nrh = (nrh)lvj.E0;
                            if (nrh != null) {
                                ((orh)o3).c.i(nrh);
                            }
                        }
                        d4 = d2;
                        final d5m d5m = (d5m)d5;
                        j = 1;
                        d5 = d4;
                        d4 = d0;
                        o3 = d6;
                        o = d5m;
                        d0 = g0;
                    }
                }
                break;
            }
        }
    }
}
