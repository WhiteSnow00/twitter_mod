import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bky extends egy
{
    public bky() {
        super.a.add(gky.G0);
        super.a.add(gky.R0);
        super.a.add(gky.T0);
        super.a.add(gky.U0);
        super.a.add(gky.Z0);
        super.a.add(gky.i1);
        super.a.add(gky.j1);
        super.a.add(gky.k1);
        super.a.add(gky.x1);
        super.a.add(gky.F1);
        super.a.add(gky.J1);
        super.a.add(gky.K1);
        super.a.add(gky.L1);
    }
    
    public final aey a(String j, final k6z k6z, final List list) {
        final gky d0 = gky.D0;
        final int ordinal = ((Enum)haz.e(j)).ordinal();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal == 24) {
                    final gky z0 = gky.Z0;
                    haz.i("EXPRESSION_LIST", 1, list);
                    Object o = aey.u0;
                    for (int i = n2; i < list.size(); ++i) {
                        o = k6z.b((aey)list.get(i));
                        if (o instanceof fby) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                    }
                    return (aey)o;
                }
                if (ordinal != 33) {
                    if (ordinal == 49) {
                        final gky x1 = gky.x1;
                        haz.h("NULL", 0, list);
                        return (aey)aey.v0;
                    }
                    if (ordinal != 58) {
                        if (ordinal == 17) {
                            qay qay;
                            if (list.isEmpty()) {
                                qay = new qay();
                            }
                            else {
                                final qay qay2 = new qay();
                                final Iterator iterator = list.iterator();
                                int n4 = n;
                                while (true) {
                                    qay = qay2;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final aey b = k6z.b((aey)iterator.next());
                                    if (b instanceof fby) {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                    qay2.v(n4, b);
                                    ++n4;
                                }
                            }
                            return (aey)qay;
                        }
                        if (ordinal == 18) {
                            edy edy;
                            if (list.isEmpty()) {
                                edy = new edy();
                            }
                            else {
                                if (list.size() % 2 != 0) {
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
                                }
                                final edy edy2 = new edy();
                                while (true) {
                                    edy = edy2;
                                    if (n3 >= list.size() - 1) {
                                        break;
                                    }
                                    final aey b2 = k6z.b((aey)list.get(n3));
                                    final aey b3 = k6z.b((aey)list.get(n3 + 1));
                                    if (b2 instanceof fby || b3 instanceof fby) {
                                        throw new IllegalStateException("Failed to evaluate map entry");
                                    }
                                    edy2.m(b2.j(), b3);
                                    n3 += 2;
                                }
                            }
                            return (aey)edy;
                        }
                        if (ordinal == 35 || ordinal == 36) {
                            final gky k1 = gky.k1;
                            haz.h("GET_PROPERTY", 2, list);
                            final aey b4 = k6z.b((aey)list.get(0));
                            final aey b5 = k6z.b((aey)list.get(1));
                            Object o2;
                            if (b4 instanceof qay && haz.k(b5)) {
                                o2 = ((qay)b4).q(b5.h().intValue());
                            }
                            else if (b4 instanceof vcy) {
                                o2 = ((vcy)b4).n(b5.j());
                            }
                            else {
                                if (b4 instanceof mfy) {
                                    if ("length".equals(b5.j())) {
                                        o2 = new tby(Double.valueOf(b4.j().length()));
                                        return (aey)o2;
                                    }
                                    if (haz.k(b5) && b5.h() < b4.j().length()) {
                                        o2 = new mfy(String.valueOf(b4.j().charAt(b5.h().intValue())));
                                        return (aey)o2;
                                    }
                                }
                                o2 = aey.u0;
                            }
                            return (aey)o2;
                        }
                        switch (ordinal) {
                            default: {
                                this.b(j);
                                throw null;
                            }
                            case 64: {
                                final gky l1 = gky.L1;
                                haz.i("VAR", 1, list);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    final aey b6 = k6z.b((aey)iterator2.next());
                                    if (!(b6 instanceof mfy)) {
                                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b6.getClass().getCanonicalName()));
                                    }
                                    k6z.e(b6.j(), (aey)aey.u0);
                                }
                                return (aey)aey.u0;
                            }
                            case 63: {
                                final gky k2 = gky.K1;
                                haz.h("UNDEFINED", 0, list);
                                return (aey)aey.u0;
                            }
                            case 62: {
                                final gky j2 = gky.J1;
                                haz.h("TYPEOF", 1, list);
                                final aey b7 = k6z.b((aey)list.get(0));
                                if (b7 instanceof sfy) {
                                    j = "undefined";
                                }
                                else if (b7 instanceof yay) {
                                    j = "boolean";
                                }
                                else if (b7 instanceof tby) {
                                    j = "number";
                                }
                                else if (b7 instanceof mfy) {
                                    j = "string";
                                }
                                else if (b7 instanceof udy) {
                                    j = "function";
                                }
                                else {
                                    if (b7 instanceof ley || b7 instanceof fby) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b7));
                                    }
                                    j = "object";
                                }
                                return (aey)new mfy(j);
                            }
                        }
                    }
                    else {
                        final gky f1 = gky.F1;
                        haz.h("SET_PROPERTY", 3, list);
                        final aey b8 = k6z.b((aey)list.get(0));
                        final aey b9 = k6z.b((aey)list.get(1));
                        final aey b10 = k6z.b((aey)list.get(2));
                        if (b8 != aey.u0 && b8 != aey.v0) {
                            if (b8 instanceof qay && b9 instanceof tby) {
                                ((qay)b8).v(b9.h().intValue(), b10);
                            }
                            else if (b8 instanceof vcy) {
                                ((vcy)b8).m(b9.j(), b10);
                            }
                            return b10;
                        }
                        throw new IllegalStateException(String.format("Can't set property %s of %s", b9.j(), b8.j()));
                    }
                }
                else {
                    final gky i2 = gky.i1;
                    haz.h("GET", 1, list);
                    final aey b11 = k6z.b((aey)list.get(0));
                    if (b11 instanceof mfy) {
                        return k6z.d(b11.j());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b11.getClass().getCanonicalName()));
                }
            }
            else {
                final gky r0 = gky.R0;
                haz.i("CONST", 2, list);
                if (list.size() % 2 == 0) {
                    for (int n5 = 0; n5 < list.size() - 1; n5 += 2) {
                        final aey b12 = k6z.b((aey)list.get(n5));
                        if (!(b12 instanceof mfy)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b12.getClass().getCanonicalName()));
                        }
                        j = b12.j();
                        k6z.e(j, k6z.b((aey)list.get(n5 + 1)));
                        ((Map)k6z.d).put(j, Boolean.TRUE);
                    }
                    return (aey)aey.u0;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
            }
        }
        else {
            final gky g0 = gky.G0;
            haz.h("ASSIGN", 2, list);
            final aey b13 = k6z.b((aey)list.get(0));
            if (!(b13 instanceof mfy)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b13.getClass().getCanonicalName()));
            }
            if (k6z.g(b13.j())) {
                final aey b14 = k6z.b((aey)list.get(1));
                k6z.f(b13.j(), b14);
                return b14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b13.j()));
        }
    }
}
