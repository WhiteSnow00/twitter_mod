import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lly extends ohy
{
    public lly() {
        super.a.add(qly.J0);
        super.a.add(qly.U0);
        super.a.add(qly.W0);
        super.a.add(qly.X0);
        super.a.add(qly.c1);
        super.a.add(qly.l1);
        super.a.add(qly.m1);
        super.a.add(qly.n1);
        super.a.add(qly.A1);
        super.a.add(qly.I1);
        super.a.add(qly.M1);
        super.a.add(qly.N1);
        super.a.add(qly.O1);
    }
    
    @Override
    public final kfy a(String k, final y7z y7z, final List list) {
        final qly g0 = qly.G0;
        final int ordinal = ((Enum)vbz.e(k)).ordinal();
        int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal == 24) {
                    final qly c1 = qly.c1;
                    vbz.i("EXPRESSION_LIST", 1, list);
                    Object o = kfy.x0;
                    for (int i = n2; i < list.size(); ++i) {
                        o = y7z.d((kfy)list.get(i));
                        if (o instanceof pcy) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                    }
                    return (kfy)o;
                }
                if (ordinal != 33) {
                    if (ordinal == 49) {
                        final qly a1 = qly.A1;
                        vbz.h("NULL", 0, list);
                        return (kfy)kfy.y0;
                    }
                    if (ordinal != 58) {
                        if (ordinal == 17) {
                            acy acy;
                            if (list.isEmpty()) {
                                acy = new acy();
                            }
                            else {
                                final acy acy2 = new acy();
                                final Iterator iterator = list.iterator();
                                while (true) {
                                    acy = acy2;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final kfy d = y7z.d((kfy)iterator.next());
                                    if (d instanceof pcy) {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                    acy2.v(n, d);
                                    ++n;
                                }
                            }
                            return (kfy)acy;
                        }
                        if (ordinal == 18) {
                            oey oey;
                            if (list.isEmpty()) {
                                oey = new oey();
                            }
                            else {
                                if (list.size() % 2 != 0) {
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
                                }
                                final oey oey2 = new oey();
                                int n4 = n3;
                                while (true) {
                                    oey = oey2;
                                    if (n4 >= list.size() - 1) {
                                        break;
                                    }
                                    final kfy d2 = y7z.d((kfy)list.get(n4));
                                    final kfy d3 = y7z.d((kfy)list.get(n4 + 1));
                                    if (d2 instanceof pcy || d3 instanceof pcy) {
                                        throw new IllegalStateException("Failed to evaluate map entry");
                                    }
                                    oey2.i(d2.k(), d3);
                                    n4 += 2;
                                }
                            }
                            return (kfy)oey;
                        }
                        if (ordinal == 35 || ordinal == 36) {
                            final qly n5 = qly.n1;
                            vbz.h("GET_PROPERTY", 2, list);
                            final kfy d4 = y7z.d((kfy)list.get(0));
                            final kfy d5 = y7z.d((kfy)list.get(1));
                            Object o2;
                            if (d4 instanceof acy && vbz.k(d5)) {
                                o2 = ((acy)d4).q(d5.h().intValue());
                            }
                            else if (d4 instanceof fey) {
                                o2 = ((fey)d4).n(d5.k());
                            }
                            else {
                                if (d4 instanceof wgy) {
                                    if ("length".equals(d5.k())) {
                                        o2 = new ddy((double)d4.k().length());
                                        return (kfy)o2;
                                    }
                                    if (vbz.k(d5) && d5.h() < d4.k().length()) {
                                        o2 = new wgy(String.valueOf(d4.k().charAt(d5.h().intValue())));
                                        return (kfy)o2;
                                    }
                                }
                                o2 = kfy.x0;
                            }
                            return (kfy)o2;
                        }
                        switch (ordinal) {
                            default: {
                                this.b(k);
                                throw null;
                            }
                            case 64: {
                                final qly o3 = qly.O1;
                                vbz.i("VAR", 1, list);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    final kfy d6 = y7z.d((kfy)iterator2.next());
                                    if (!(d6 instanceof wgy)) {
                                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", d6.getClass().getCanonicalName()));
                                    }
                                    y7z.g(d6.k(), (kfy)kfy.x0);
                                }
                                return (kfy)kfy.x0;
                            }
                            case 63: {
                                final qly n6 = qly.N1;
                                vbz.h("UNDEFINED", 0, list);
                                return (kfy)kfy.x0;
                            }
                            case 62: {
                                final qly m1 = qly.M1;
                                vbz.h("TYPEOF", 1, list);
                                final kfy d7 = y7z.d((kfy)list.get(0));
                                if (d7 instanceof chy) {
                                    k = "undefined";
                                }
                                else if (d7 instanceof icy) {
                                    k = "boolean";
                                }
                                else if (d7 instanceof ddy) {
                                    k = "number";
                                }
                                else if (d7 instanceof wgy) {
                                    k = "string";
                                }
                                else if (d7 instanceof dfy) {
                                    k = "function";
                                }
                                else {
                                    if (d7 instanceof vfy || d7 instanceof pcy) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", d7));
                                    }
                                    k = "object";
                                }
                                return (kfy)new wgy(k);
                            }
                        }
                    }
                    else {
                        final qly i2 = qly.I1;
                        vbz.h("SET_PROPERTY", 3, list);
                        final kfy d8 = y7z.d((kfy)list.get(0));
                        final kfy d9 = y7z.d((kfy)list.get(1));
                        final kfy d10 = y7z.d((kfy)list.get(2));
                        if (d8 != kfy.x0 && d8 != kfy.y0) {
                            if (d8 instanceof acy && d9 instanceof ddy) {
                                ((acy)d8).v(d9.h().intValue(), d10);
                            }
                            else if (d8 instanceof fey) {
                                ((fey)d8).i(d9.k(), d10);
                            }
                            return d10;
                        }
                        throw new IllegalStateException(String.format("Can't set property %s of %s", d9.k(), d8.k()));
                    }
                }
                else {
                    final qly l1 = qly.l1;
                    vbz.h("GET", 1, list);
                    final kfy d11 = y7z.d((kfy)list.get(0));
                    if (d11 instanceof wgy) {
                        return y7z.f(d11.k());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", d11.getClass().getCanonicalName()));
                }
            }
            else {
                final qly u0 = qly.U0;
                vbz.i("CONST", 2, list);
                if (list.size() % 2 == 0) {
                    for (int j = 0; j < list.size() - 1; j += 2) {
                        final kfy d12 = y7z.d((kfy)list.get(j));
                        if (!(d12 instanceof wgy)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", d12.getClass().getCanonicalName()));
                        }
                        k = d12.k();
                        y7z.g(k, y7z.d((kfy)list.get(j + 1)));
                        ((Map)y7z.d).put(k, Boolean.TRUE);
                    }
                    return (kfy)kfy.x0;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
            }
        }
        else {
            final qly j2 = qly.J0;
            vbz.h("ASSIGN", 2, list);
            final kfy d13 = y7z.d((kfy)list.get(0));
            if (!(d13 instanceof wgy)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", d13.getClass().getCanonicalName()));
            }
            if (y7z.i(d13.k())) {
                final kfy d14 = y7z.d((kfy)list.get(1));
                y7z.h(d13.k(), d14);
                return d14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", d13.k()));
        }
    }
}
