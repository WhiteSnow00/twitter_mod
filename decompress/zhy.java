import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhy extends ohy
{
    public final int b;
    
    public zhy(final int b) {
        this.b = b;
        if (b != 1) {
            super.a.add(qly.b1);
            super.a.add(qly.o1);
            super.a.add(qly.p1);
            super.a.add(qly.q1);
            super.a.add(qly.r1);
            super.a.add(qly.t1);
            super.a.add(qly.u1);
            super.a.add(qly.z1);
            return;
        }
        super.a.add(qly.G0);
        super.a.add(qly.a1);
        super.a.add(qly.v1);
        super.a.add(qly.w1);
        super.a.add(qly.x1);
        super.a.add(qly.C1);
        super.a.add(qly.D1);
        super.a.add(qly.F1);
        super.a.add(qly.G1);
        super.a.add(qly.J1);
    }
    
    public static boolean c(final kfy kfy, final kfy kfy2) {
        if (!kfy.getClass().equals(kfy2.getClass())) {
            if ((!(kfy instanceof chy) && !(kfy instanceof wey)) || (!(kfy2 instanceof chy) && !(kfy2 instanceof wey))) {
                final boolean b = kfy instanceof ddy;
                if (b && kfy2 instanceof wgy) {
                    return c(kfy, (kfy)new ddy(kfy2.h()));
                }
                final boolean b2 = kfy instanceof wgy;
                if (b2 && kfy2 instanceof ddy) {
                    return c((kfy)new ddy(kfy.h()), kfy2);
                }
                if (kfy instanceof icy) {
                    return c((kfy)new ddy(kfy.h()), kfy2);
                }
                if (kfy2 instanceof icy) {
                    return c(kfy, (kfy)new ddy(kfy2.h()));
                }
                if ((!b2 && !b) || !(kfy2 instanceof fey)) {
                    return kfy instanceof fey && (kfy2 instanceof wgy || kfy2 instanceof ddy) && c((kfy)new wgy(kfy.k()), kfy2);
                }
                final wgy wgy = new wgy(kfy2.k());
                try {
                    return c(kfy, (kfy)wgy);
                }
                finally {}
            }
            return true;
        }
        if (kfy instanceof chy || kfy instanceof wey) {
            return true;
        }
        if (kfy instanceof ddy) {
            if (!Double.isNaN(kfy.h())) {
                if (!Double.isNaN(kfy2.h())) {
                    if (kfy.h() == (double)kfy2.h()) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (kfy instanceof wgy) {
            return kfy.k().equals(kfy2.k());
        }
        if (kfy instanceof icy) {
            return kfy.j().equals(kfy2.j());
        }
        return kfy == kfy2;
    }
    
    public static boolean d(kfy o, final kfy kfy) {
        Object o2 = o;
        if (o instanceof fey) {
            o2 = new wgy(((kfy)o).k());
        }
        o = kfy;
        if (kfy instanceof fey) {
            o = new wgy(kfy.k());
        }
        if (o2 instanceof wgy && o instanceof wgy) {
            return ((kfy)o2).k().compareTo(((kfy)o).k()) < 0;
        }
        final double doubleValue = ((kfy)o2).h();
        final double doubleValue2 = ((kfy)o).h();
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
    
    public static boolean e(kfy o, final kfy kfy) {
        Object o2 = o;
        if (o instanceof fey) {
            o2 = new wgy(((kfy)o).k());
        }
        o = kfy;
        if (kfy instanceof fey) {
            o = new wgy(kfy.k());
        }
        return ((o2 instanceof wgy && o instanceof wgy) || (!Double.isNaN(((kfy)o2).h()) && !Double.isNaN(((kfy)o).h()))) && !d((kfy)o, (kfy)o2);
    }
    
    @Override
    public final kfy a(final String s, final y7z y7z, final List list) {
        switch (this.b) {
            default: {
                final qly g0 = qly.G0;
                final int ordinal = ((Enum)vbz.e(s)).ordinal();
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
                                            final qly x1 = qly.x1;
                                            vbz.h("NEGATE", 1, list);
                                            o = new ddy(-y7z.d((kfy)list.get(0)).h());
                                            break;
                                        }
                                        case 45: {
                                            final qly w1 = qly.w1;
                                            vbz.h("MULTIPLY", 2, list);
                                            o = new ddy(y7z.d((kfy)list.get(0)).h() * y7z.d((kfy)list.get(1)).h());
                                            break;
                                        }
                                        case 44: {
                                            final qly v1 = qly.v1;
                                            vbz.h("MODULUS", 2, list);
                                            o = new ddy(y7z.d((kfy)list.get(0)).h() % y7z.d((kfy)list.get(1)).h());
                                            break;
                                        }
                                    }
                                }
                                else {
                                    vbz.h(s, 1, list);
                                    o = y7z.d((kfy)list.get(0));
                                }
                            }
                            else {
                                vbz.h(s, 2, list);
                                o = y7z.d((kfy)list.get(0));
                                y7z.d((kfy)list.get(1));
                            }
                        }
                        else {
                            final qly j1 = qly.J1;
                            vbz.h("SUBTRACT", 2, list);
                            final kfy d = y7z.d((kfy)list.get(0));
                            Double n;
                            if ((n = -y7z.d((kfy)list.get(1)).h()) == null) {
                                n = Double.NaN;
                            }
                            o = new ddy(n + d.h());
                        }
                    }
                    else {
                        final qly a1 = qly.a1;
                        vbz.h("DIVIDE", 2, list);
                        o = new ddy(y7z.d((kfy)list.get(0)).h() / y7z.d((kfy)list.get(1)).h());
                    }
                }
                else {
                    vbz.h("ADD", 2, list);
                    final kfy d2 = y7z.d((kfy)list.get(0));
                    final kfy d3 = y7z.d((kfy)list.get(1));
                    if (!(d2 instanceof fey) && !(d2 instanceof wgy) && !(d3 instanceof fey) && !(d3 instanceof wgy)) {
                        o = new ddy(d3.h() + d2.h());
                    }
                    else {
                        o = new wgy(String.valueOf(d2.k()).concat(String.valueOf(d3.k())));
                    }
                }
                return (kfy)o;
            }
            case 0: {
                vbz.h(((Enum)vbz.e(s)).name(), 2, list);
                final kfy d4 = y7z.d((kfy)list.get(0));
                final kfy d5 = y7z.d((kfy)list.get(1));
                final int ordinal2 = ((Enum)vbz.e(s)).ordinal();
                boolean b = false;
                Label_0239: {
                    if (ordinal2 != 23) {
                        boolean b2 = false;
                        if (ordinal2 != 48) {
                            if (ordinal2 == 42) {
                                b = d(d4, d5);
                                break Label_0239;
                            }
                            if (ordinal2 == 43) {
                                b = e(d4, d5);
                                break Label_0239;
                            }
                            switch (ordinal2) {
                                default: {
                                    this.b(s);
                                    throw null;
                                }
                                case 40: {
                                    b2 = vbz.l(d4, d5);
                                    break;
                                }
                                case 39: {
                                    b = vbz.l(d4, d5);
                                    break Label_0239;
                                }
                                case 38: {
                                    b = e(d5, d4);
                                    break Label_0239;
                                }
                                case 37: {
                                    b = d(d5, d4);
                                    break Label_0239;
                                }
                            }
                        }
                        else {
                            b2 = c(d4, d5);
                        }
                        b = (b2 ^ true);
                    }
                    else {
                        b = c(d4, d5);
                    }
                }
                icy icy;
                if (b) {
                    icy = kfy.C0;
                }
                else {
                    icy = kfy.D0;
                }
                return (kfy)icy;
            }
        }
    }
}
