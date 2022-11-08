import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgy extends egy
{
    public final /* synthetic */ int b;
    
    public pgy(final int b) {
        this.b = b;
        if (b != 1) {
            super.a.add(gky.Y0);
            super.a.add(gky.l1);
            super.a.add(gky.m1);
            super.a.add(gky.n1);
            super.a.add(gky.o1);
            super.a.add(gky.q1);
            super.a.add(gky.r1);
            super.a.add(gky.w1);
            return;
        }
        super.a.add(gky.D0);
        super.a.add(gky.X0);
        super.a.add(gky.s1);
        super.a.add(gky.t1);
        super.a.add(gky.u1);
        super.a.add(gky.z1);
        super.a.add(gky.A1);
        super.a.add(gky.C1);
        super.a.add(gky.D1);
        super.a.add(gky.G1);
    }
    
    public static boolean c(final aey aey, final aey aey2) {
        if (!aey.getClass().equals(aey2.getClass())) {
            if ((!(aey instanceof sfy) && !(aey instanceof mdy)) || (!(aey2 instanceof sfy) && !(aey2 instanceof mdy))) {
                final boolean b = aey instanceof tby;
                if (b && aey2 instanceof mfy) {
                    return c(aey, (aey)new tby(aey2.h()));
                }
                final boolean b2 = aey instanceof mfy;
                if (b2 && aey2 instanceof tby) {
                    return c((aey)new tby(aey.h()), aey2);
                }
                if (aey instanceof yay) {
                    return c((aey)new tby(aey.h()), aey2);
                }
                if (aey2 instanceof yay) {
                    return c(aey, (aey)new tby(aey2.h()));
                }
                if ((!b2 && !b) || !(aey2 instanceof vcy)) {
                    return aey instanceof vcy && (aey2 instanceof mfy || aey2 instanceof tby) && c((aey)new mfy(aey.j()), aey2);
                }
                final mfy mfy = new mfy(aey2.j());
                try {
                    return c(aey, (aey)mfy);
                }
                finally {}
            }
            return true;
        }
        if (aey instanceof sfy || aey instanceof mdy) {
            return true;
        }
        if (aey instanceof tby) {
            if (!Double.isNaN(aey.h())) {
                if (!Double.isNaN(aey2.h())) {
                    if (aey.h() == (double)aey2.h()) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (aey instanceof mfy) {
            return aey.j().equals(aey2.j());
        }
        if (aey instanceof yay) {
            return aey.i().equals(aey2.i());
        }
        return aey == aey2;
    }
    
    public static boolean d(aey o, final aey aey) {
        Object o2 = o;
        if (o instanceof vcy) {
            o2 = new mfy(((aey)o).j());
        }
        o = aey;
        if (aey instanceof vcy) {
            o = new mfy(aey.j());
        }
        if (o2 instanceof mfy && o instanceof mfy) {
            return ((aey)o2).j().compareTo(((aey)o).j()) < 0;
        }
        final double doubleValue = ((aey)o2).h();
        final double doubleValue2 = ((aey)o).h();
        if (!Double.isNaN(doubleValue)) {
            if (!Double.isNaN(doubleValue2)) {
                final double n = dcmpl(doubleValue, 0.0);
                if ((n == 0 && doubleValue2 == 0.0) || (n == 0 && doubleValue2 == 0.0)) {
                    return false;
                }
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean e(aey o, final aey aey) {
        Object o2 = o;
        if (o instanceof vcy) {
            o2 = new mfy(((aey)o).j());
        }
        o = aey;
        if (aey instanceof vcy) {
            o = new mfy(aey.j());
        }
        return ((o2 instanceof mfy && o instanceof mfy) || (!Double.isNaN(((aey)o2).h()) && !Double.isNaN(((aey)o).h()))) && !d((aey)o, (aey)o2);
    }
    
    public final aey a(final String s, final k6z k6z, final List list) {
        switch (this.b) {
            default: {
                final gky d0 = gky.D0;
                final int ordinal = ((Enum)haz.e(s)).ordinal();
                Object o;
                if (ordinal != 0) {
                    if (ordinal != 21) {
                        if (ordinal != 59) {
                            if (ordinal != 52 && ordinal != 53) {
                                if (ordinal != 55 && ordinal != 56) {
                                    switch (ordinal) {
                                        default: {
                                            this.b(s);
                                            throw null;
                                        }
                                        case 46: {
                                            final gky u1 = gky.u1;
                                            haz.h("NEGATE", 1, list);
                                            o = new tby(Double.valueOf(-k6z.b((aey)list.get(0)).h()));
                                            break;
                                        }
                                        case 45: {
                                            final gky t1 = gky.t1;
                                            haz.h("MULTIPLY", 2, list);
                                            o = new tby(Double.valueOf(k6z.b((aey)list.get(0)).h() * k6z.b((aey)list.get(1)).h()));
                                            break;
                                        }
                                        case 44: {
                                            final gky s2 = gky.s1;
                                            haz.h("MODULUS", 2, list);
                                            o = new tby(Double.valueOf(k6z.b((aey)list.get(0)).h() % k6z.b((aey)list.get(1)).h()));
                                            break;
                                        }
                                    }
                                }
                                else {
                                    haz.h(s, 1, list);
                                    o = k6z.b((aey)list.get(0));
                                }
                            }
                            else {
                                haz.h(s, 2, list);
                                o = k6z.b((aey)list.get(0));
                                k6z.b((aey)list.get(1));
                            }
                        }
                        else {
                            final gky g1 = gky.G1;
                            haz.h("SUBTRACT", 2, list);
                            final aey b = k6z.b((aey)list.get(0));
                            Double n;
                            if ((n = -k6z.b((aey)list.get(1)).h()) == null) {
                                n = Double.NaN;
                            }
                            o = new tby(Double.valueOf(n + b.h()));
                        }
                    }
                    else {
                        final gky x0 = gky.X0;
                        haz.h("DIVIDE", 2, list);
                        o = new tby(Double.valueOf(k6z.b((aey)list.get(0)).h() / k6z.b((aey)list.get(1)).h()));
                    }
                }
                else {
                    haz.h("ADD", 2, list);
                    final aey b2 = k6z.b((aey)list.get(0));
                    final aey b3 = k6z.b((aey)list.get(1));
                    if (!(b2 instanceof vcy) && !(b2 instanceof mfy) && !(b3 instanceof vcy) && !(b3 instanceof mfy)) {
                        o = new tby(Double.valueOf(b3.h() + b2.h()));
                    }
                    else {
                        o = new mfy(String.valueOf(b2.j()).concat(String.valueOf(b3.j())));
                    }
                }
                return (aey)o;
            }
            case 0: {
                haz.h(((Enum)haz.e(s)).name(), 2, list);
                final aey b4 = k6z.b((aey)list.get(0));
                final aey b5 = k6z.b((aey)list.get(1));
                final int ordinal2 = ((Enum)haz.e(s)).ordinal();
                boolean b6 = false;
                Label_0239: {
                    if (ordinal2 != 23) {
                        boolean b7 = false;
                        if (ordinal2 != 48) {
                            if (ordinal2 == 42) {
                                b6 = d(b4, b5);
                                break Label_0239;
                            }
                            if (ordinal2 == 43) {
                                b6 = e(b4, b5);
                                break Label_0239;
                            }
                            switch (ordinal2) {
                                default: {
                                    this.b(s);
                                    throw null;
                                }
                                case 40: {
                                    b7 = haz.l(b4, b5);
                                    break;
                                }
                                case 39: {
                                    b6 = haz.l(b4, b5);
                                    break Label_0239;
                                }
                                case 38: {
                                    b6 = e(b5, b4);
                                    break Label_0239;
                                }
                                case 37: {
                                    b6 = d(b5, b4);
                                    break Label_0239;
                                }
                            }
                        }
                        else {
                            b7 = c(b4, b5);
                        }
                        b6 = (b7 ^ true);
                    }
                    else {
                        b6 = c(b4, b5);
                    }
                }
                yay yay;
                if (b6) {
                    yay = aey.z0;
                }
                else {
                    yay = aey.A0;
                }
                return (aey)yay;
            }
        }
    }
}
