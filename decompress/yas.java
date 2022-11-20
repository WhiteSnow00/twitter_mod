import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yas
{
    public static final itb<ywk, wfj, go6<? super fzv>, Object> a;
    
    static {
        yas.a = new yas$a((go6)null);
    }
    
    public static final Object a(le1 d0, final go6 go6) {
        abs abs2 = null;
        Label_0050: {
            if (go6 instanceof abs) {
                final abs abs = (abs)go6;
                final int f0 = abs.F0;
                if ((f0 & Integer.MIN_VALUE) != 0x0) {
                    abs.F0 = f0 + Integer.MIN_VALUE;
                    abs2 = abs;
                    break Label_0050;
                }
            }
            abs2 = new abs(go6);
        }
        Object o = abs2.E0;
        final dy6 d2 = dy6.D0;
        final int f2 = abs2.F0;
        while (true) {
            Label_0140: {
                if (f2 != 0) {
                    if (f2 == 1) {
                        d0 = abs2.D0;
                        b1n.u(o);
                        break Label_0140;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    b1n.u(o);
                }
                abs2.D0 = d0;
                abs2.F0 = 1;
                if ((o = g4k.d(d0, (bpk)null, (go6)abs2, 1, (Object)null)) == d2) {
                    return d2;
                }
            }
            final apk apk = (apk)o;
            final List a2 = apk.a;
            final int size = a2.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                ((hpk)a2.get(i)).a();
            }
            final List a3 = apk.a;
            final int size2 = a3.size();
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= size2) {
                    break;
                }
                if (((hpk)a3.get(n2)).d) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            if (n3 != 0) {
                continue;
            }
            break;
        }
        return fzv.a;
    }
    
    public static final Object b(final le1 le1, final boolean b, final go6<? super hpk> go6) {
        return c(le1, bpk.E0, b, go6);
    }
    
    public static final Object c(le1 d0, bpk e0, boolean f0, final go6<? super hpk> go6) {
        yas$b yas$b2 = null;
        Label_0053: {
            if (go6 instanceof yas$b) {
                final yas$b yas$b = (yas$b)go6;
                final int h0 = yas$b.H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    yas$b.H0 = h0 + Integer.MIN_VALUE;
                    yas$b2 = yas$b;
                    break Label_0053;
                }
            }
            yas$b2 = new yas$b((go6)go6);
        }
        Object o = yas$b2.G0;
        final dy6 d2 = dy6.D0;
        final int h2 = yas$b2.H0;
        while (true) {
        Label_0119:
            while (true) {
                Label_0163: {
                    if (h2 != 0) {
                        if (h2 == 1) {
                            f0 = yas$b2.F0;
                            e0 = yas$b2.E0;
                            d0 = yas$b2.D0;
                            b1n.u(o);
                            break Label_0163;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        b1n.u(o);
                    }
                    yas$b2.D0 = d0;
                    yas$b2.E0 = e0;
                    yas$b2.F0 = f0;
                    yas$b2.H0 = 1;
                    if ((o = d0.g0(e0, (go6)yas$b2)) == d2) {
                        return d2;
                    }
                }
                final apk apk = (apk)o;
                final List a = apk.a;
                final int size = a.size();
                int i = 0;
                while (i < size) {
                    final hpk hpk = a.get(i);
                    boolean b;
                    if (f0) {
                        b = gmw.i(hpk);
                    }
                    else {
                        b = gmw.j(hpk);
                    }
                    if (!b) {
                        final boolean b2 = false;
                        if (b2) {
                            return apk.a.get(0);
                        }
                        continue Label_0119;
                    }
                    else {
                        ++i;
                    }
                }
                break;
            }
            final boolean b2 = true;
            continue;
        }
    }
    
    public static final Object d(final ppk ppk, final itb<? super ywk, ? super wfj, ? super go6<? super fzv>, ?> itb, final qsb<? super wfj, fzv> qsb, final go6<? super fzv> go6) {
        final Object b = wkb.b(ppk, (ftb)new yas$c(new zwk((lo8)ppk), (itb)itb, (qsb)qsb, (go6)null), (go6)go6);
        if (b == dy6.D0) {
            return b;
        }
        return fzv.a;
    }
    
    public static final Object e(final ppk ppk, final qsb<? super wfj, fzv> qsb, final qsb<? super wfj, fzv> qsb2, final itb<? super ywk, ? super wfj, ? super go6<? super fzv>, ?> itb, final qsb<? super wfj, fzv> qsb3, final go6<? super fzv> go6) {
        final Object h = sh4.h((ftb)new yas$d(ppk, (itb)itb, (qsb)qsb2, (qsb)qsb, (qsb)qsb3, (go6)null), (go6)go6);
        if (h == dy6.D0) {
            return h;
        }
        return fzv.a;
    }
    
    public static Object f(final ppk ppk, final qsb qsb, final go6 go6) {
        return e(ppk, null, null, (itb<? super ywk, ? super wfj, ? super go6<? super fzv>, ?>)yas.a, (qsb<? super wfj, fzv>)qsb, (go6<? super fzv>)go6);
    }
    
    public static final Object g(le1 le1, final go6<? super hpk> go6) {
        Object o = null;
        Label_0050: {
            if (go6 instanceof yas$e) {
                final yas$e yas$e = (yas$e)go6;
                final int f0 = yas$e.F0;
                if ((f0 & Integer.MIN_VALUE) != 0x0) {
                    yas$e.F0 = f0 + Integer.MIN_VALUE;
                    o = yas$e;
                    break Label_0050;
                }
            }
            o = new yas$e((go6)go6);
        }
        Object o2 = ((yas$e)o).E0;
        final dy6 d0 = dy6.D0;
        final int f2 = ((yas$e)o).F0;
        while (true) {
        Label_0121:
            while (true) {
                Label_0374: {
                    Label_0161: {
                        if (f2 != 0) {
                            if (f2 == 1) {
                                le1 = ((yas$e)o).D0;
                                b1n.u(o2);
                                break Label_0161;
                            }
                            if (f2 == 2) {
                                le1 = ((yas$e)o).D0;
                                b1n.u(o2);
                                break Label_0374;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            b1n.u(o2);
                        }
                        final bpk e0 = bpk.E0;
                        ((yas$e)o).D0 = le1;
                        ((yas$e)o).F0 = 1;
                        if ((o2 = le1.g0(e0, (go6)o)) == d0) {
                            return d0;
                        }
                    }
                    final apk apk = (apk)o2;
                    final List a = apk.a;
                    final int size = a.size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            if (!gmw.k((hpk)a.get(i))) {
                                final boolean b = false;
                                if (b) {
                                    return apk.a.get(0);
                                }
                                final List a2 = apk.a;
                                final int size2 = a2.size();
                                int j = 0;
                                while (true) {
                                    while (j < size2) {
                                        final hpk hpk = a2.get(j);
                                        if (hpk.d() || gmw.E(hpk, le1.a(), le1.Q())) {
                                            final boolean b2 = true;
                                            if (b2) {
                                                return null;
                                            }
                                            final bpk f3 = bpk.F0;
                                            ((yas$e)o).D0 = le1;
                                            ((yas$e)o).F0 = 2;
                                            if ((o2 = le1.g0(f3, (go6)o)) == d0) {
                                                return d0;
                                            }
                                            break Label_0374;
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    final boolean b2 = false;
                                    continue;
                                }
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = true;
                        continue;
                    }
                }
                final List a3 = ((apk)o2).a;
                final int size3 = a3.size();
                int k = 0;
                while (k < size3) {
                    if (((hpk)a3.get(k)).d()) {
                        final boolean b3 = true;
                        if (b3) {
                            return null;
                        }
                        continue Label_0121;
                    }
                    else {
                        ++k;
                    }
                }
                break;
            }
            final boolean b3 = false;
            continue;
        }
    }
}
