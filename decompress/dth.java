import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dth implements iwj
{
    public final xc0 a;
    public final List<xc0$b<phk>> b;
    public final nxe c;
    public final nxe d;
    public final List<hwj> e;
    
    public dth(final xc0 a, final kks kks, final List<xc0$b<phk>> b, final rp8 rp8, final qkb$b qkb$b) {
        e0e.f((Object)a, "annotatedString");
        e0e.f((Object)b, "placeholders");
        e0e.f((Object)rp8, "density");
        e0e.f((Object)qkb$b, "fontFamilyResolver");
        this.a = a;
        this.b = b;
        this.c = jty.M(3, (ptb)new ptb<Float>(this) {
            public final dth F0;
            
            public final Object invoke() {
                final ArrayList e = this.F0.e;
                hwj hwj;
                if (e.isEmpty()) {
                    hwj = null;
                }
                else {
                    Object value = e.get(0);
                    float c = ((hwj)value).a.c();
                    final int f = shw.F((List)e);
                    int n = 1;
                    hwj hwj2 = (hwj)value;
                    if (1 <= f) {
                        while (true) {
                            final Object value2 = e.get(n);
                            final float c2 = ((hwj)value2).a.c();
                            float n2 = c;
                            if (Float.compare(c, c2) < 0) {
                                value = value2;
                                n2 = c2;
                            }
                            hwj2 = (hwj)value;
                            if (n == f) {
                                break;
                            }
                            ++n;
                            c = n2;
                        }
                    }
                    hwj = hwj2;
                }
                final hwj hwj3 = hwj;
                if (hwj3 != null) {
                    final iwj a = hwj3.a;
                    if (a != null) {
                        return a.c();
                    }
                }
                return 0.0f;
            }
        });
        this.d = jty.M(3, (ptb)new ptb<Float>(this) {
            public final dth F0;
            
            public final Object invoke() {
                final ArrayList e = this.F0.e;
                hwj hwj;
                if (e.isEmpty()) {
                    hwj = null;
                }
                else {
                    Object value = e.get(0);
                    float b = ((hwj)value).a.b();
                    final int f = shw.F((List)e);
                    int n = 1;
                    hwj hwj2 = (hwj)value;
                    if (1 <= f) {
                        while (true) {
                            final Object value2 = e.get(n);
                            final float b2 = ((hwj)value2).a.b();
                            float n2 = b;
                            if (Float.compare(b, b2) < 0) {
                                value = value2;
                                n2 = b2;
                            }
                            hwj2 = (hwj)value;
                            if (n == f) {
                                break;
                            }
                            ++n;
                            b = n2;
                        }
                    }
                    hwj = hwj2;
                }
                final hwj hwj3 = hwj;
                if (hwj3 != null) {
                    final iwj a = hwj3.a;
                    if (a != null) {
                        return a.b();
                    }
                }
                return 0.0f;
            }
        });
        final jwj b2 = kks.b;
        final xc0 a2 = yc0.a;
        e0e.f((Object)b2, "defaultParagraphStyle");
        final int length = a.F0.length();
        final List h0 = a.H0;
        final ArrayList list = new ArrayList();
        final int size = h0.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final xc0$b xc0$b = h0.get(i);
            final jwj jwj = (jwj)xc0$b.a;
            final int b3 = xc0$b.b;
            final int c = xc0$b.c;
            if (b3 != n) {
                list.add(new xc0$b((Object)b2, n, b3));
            }
            list.add(new xc0$b((Object)b2.a(jwj), b3, c));
            ++i;
            n = c;
        }
        if (n != length) {
            list.add(new xc0$b((Object)b2, n, length));
        }
        if (list.isEmpty()) {
            list.add(new xc0$b((Object)b2, 0, 0));
        }
        final ArrayList e = new ArrayList<hwj>(list.size());
        for (int size2 = list.size(), j = 0; j < size2; ++j) {
            final xc0$b xc0$b2 = list.get(j);
            final int b4 = xc0$b2.b;
            final int c2 = xc0$b2.c;
            String substring;
            if (b4 != c2) {
                substring = a.F0.substring(b4, c2);
                e0e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            }
            else {
                substring = "";
            }
            Object o;
            if (b4 == c2) {
                o = h3a.F0;
            }
            else if (b4 == 0 && c2 >= a.F0.length()) {
                o = a.G0;
            }
            else {
                final List g0 = a.G0;
                final ArrayList list2 = new ArrayList<xc0$b>(g0.size());
                for (int size3 = g0.size(), k = 0; k < size3; ++k) {
                    final Object value = g0.get(k);
                    final xc0$b xc0$b3 = (xc0$b)value;
                    if (yc0.c(b4, c2, xc0$b3.b, xc0$b3.c)) {
                        list2.add((xc0$b)value);
                    }
                }
                final ArrayList list3 = new ArrayList<xc0$b<f1r>>(list2.size());
                final int size4 = list2.size();
                int l = 0;
                final ArrayList<xc0$b> list4 = (ArrayList<xc0$b>)list2;
                while (l < size4) {
                    final xc0$b xc0$b4 = list4.get(l);
                    list3.add((xc0$b<f1r>)new xc0$b(xc0$b4.a, jb2.F(xc0$b4.b, b4, c2) - b4, jb2.F(xc0$b4.c, b4, c2) - b4));
                    ++l;
                }
                o = list3;
            }
            final h3a f0 = h3a.F0;
            e0e.f(o, "spanStyles");
            final List b5 = rr4.b2((Iterable)f0, (Comparator)new xc0$c());
            final int size5 = b5.size();
            int c3 = -1;
            for (int n2 = 0; n2 < size5; ++n2) {
                final xc0$b xc0$b5 = b5.get(n2);
                if (xc0$b5.b < c3) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
                if (xc0$b5.c > substring.length()) {
                    final StringBuilder f2 = ehk.f("ParagraphStyle range [");
                    f2.append(xc0$b5.b);
                    f2.append(", ");
                    throw new IllegalArgumentException(ad.y(f2, xc0$b5.c, ") is out of boundary").toString());
                }
                c3 = xc0$b5.c;
            }
            Object o2 = xc0$b2.a;
            if (((jwj)o2).b == null) {
                o2 = new jwj(((jwj)o2).a, b2.b, ((jwj)o2).c, ((jwj)o2).d, ((jwj)o2).e, ((jwj)o2).f, ((jwj)o2).g, ((jwj)o2).h);
            }
            final kks kks2 = new kks(kks.a, kks.b.a((jwj)o2));
            final List<xc0$b<phk>> b6 = this.b;
            final int b7 = xc0$b2.b;
            final int c4 = xc0$b2.c;
            final ArrayList list5 = new ArrayList<xc0$b>(b6.size());
            for (int size6 = b6.size(), n3 = 0; n3 < size6; ++n3) {
                final Object value2 = b6.get(n3);
                final xc0$b xc0$b6 = (xc0$b)value2;
                if (yc0.c(b7, c4, xc0$b6.b, xc0$b6.c)) {
                    list5.add((xc0$b)value2);
                }
            }
            final ArrayList list6 = new ArrayList<xc0$b<phk>>(list5.size());
            for (int size7 = list5.size(), n4 = 0; n4 < size7; ++n4) {
                final xc0$b xc0$b7 = list5.get(n4);
                final int b8 = xc0$b7.b;
                if (b7 > b8 || xc0$b7.c > c4) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                list6.add((xc0$b<phk>)new xc0$b(xc0$b7.a, b8 - b7, xc0$b7.c - b7));
            }
            e.add(new hwj((iwj)new e50(substring, kks2, (List<xc0$b<f1r>>)o, (List<xc0$b<phk>>)list6, qkb$b, rp8), xc0$b2.b, xc0$b2.c));
        }
        this.e = e;
    }
    
    public final boolean a() {
        final ArrayList e = this.e;
        final int size = e.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            if (((hwj)e.get(n)).a.a()) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final float b() {
        return ((Number)this.d.getValue()).floatValue();
    }
    
    public final float c() {
        return ((Number)this.c.getValue()).floatValue();
    }
}
