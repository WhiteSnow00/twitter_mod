import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhy extends tgy
{
    public final int b;
    
    public fhy(final int b) {
        this.b = b;
        if (b != 1) {
            super.a.add(xky.Z0);
            super.a.add(xky.m1);
            super.a.add(xky.n1);
            super.a.add(xky.o1);
            super.a.add(xky.p1);
            super.a.add(xky.r1);
            super.a.add(xky.s1);
            super.a.add(xky.x1);
            return;
        }
        super.a.add(xky.E0);
        super.a.add(xky.Y0);
        super.a.add(xky.t1);
        super.a.add(xky.u1);
        super.a.add(xky.v1);
        super.a.add(xky.A1);
        super.a.add(xky.B1);
        super.a.add(xky.D1);
        super.a.add(xky.E1);
        super.a.add(xky.H1);
    }
    
    public static boolean c(final pey pey, final pey pey2) {
        if (!pey.getClass().equals(pey2.getClass())) {
            if ((!(pey instanceof hgy) && !(pey instanceof cey)) || (!(pey2 instanceof hgy) && !(pey2 instanceof cey))) {
                final boolean b = pey instanceof jcy;
                if (b && pey2 instanceof bgy) {
                    return c(pey, (pey)new jcy(pey2.h()));
                }
                final boolean b2 = pey instanceof bgy;
                if (b2 && pey2 instanceof jcy) {
                    return c((pey)new jcy(pey.h()), pey2);
                }
                if (pey instanceof oby) {
                    return c((pey)new jcy(pey.h()), pey2);
                }
                if (pey2 instanceof oby) {
                    return c(pey, (pey)new jcy(pey2.h()));
                }
                if ((!b2 && !b) || !(pey2 instanceof ldy)) {
                    return pey instanceof ldy && (pey2 instanceof bgy || pey2 instanceof jcy) && c((pey)new bgy(pey.j()), pey2);
                }
                final bgy bgy = new bgy(pey2.j());
                try {
                    return c(pey, (pey)bgy);
                }
                finally {}
            }
            return true;
        }
        if (pey instanceof hgy || pey instanceof cey) {
            return true;
        }
        if (pey instanceof jcy) {
            if (!Double.isNaN(pey.h())) {
                if (!Double.isNaN(pey2.h())) {
                    if (pey.h() == (double)pey2.h()) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (pey instanceof bgy) {
            return pey.j().equals(pey2.j());
        }
        if (pey instanceof oby) {
            return pey.i().equals(pey2.i());
        }
        return pey == pey2;
    }
    
    public static boolean d(pey o, final pey pey) {
        Object o2 = o;
        if (o instanceof ldy) {
            o2 = new bgy(((pey)o).j());
        }
        o = pey;
        if (pey instanceof ldy) {
            o = new bgy(pey.j());
        }
        if (o2 instanceof bgy && o instanceof bgy) {
            return ((pey)o2).j().compareTo(((pey)o).j()) < 0;
        }
        final double doubleValue = ((pey)o2).h();
        final double doubleValue2 = ((pey)o).h();
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
    
    public static boolean e(pey o, final pey pey) {
        Object o2 = o;
        if (o instanceof ldy) {
            o2 = new bgy(((pey)o).j());
        }
        o = pey;
        if (pey instanceof ldy) {
            o = new bgy(pey.j());
        }
        return ((o2 instanceof bgy && o instanceof bgy) || (!Double.isNaN(((pey)o2).h()) && !Double.isNaN(((pey)o).h()))) && !d((pey)o, (pey)o2);
    }
    
    public final pey a(final String s, final z6z z6z, final List list) {
        switch (this.b) {
            default: {
                final xky e0 = xky.E0;
                final int ordinal = ((Enum)waz.e(s)).ordinal();
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
                                            final xky v1 = xky.v1;
                                            waz.h("NEGATE", 1, list);
                                            o = new jcy(Double.valueOf(-z6z.d((pey)list.get(0)).h()));
                                            break;
                                        }
                                        case 45: {
                                            final xky u1 = xky.u1;
                                            waz.h("MULTIPLY", 2, list);
                                            o = new jcy(Double.valueOf(z6z.d((pey)list.get(0)).h() * z6z.d((pey)list.get(1)).h()));
                                            break;
                                        }
                                        case 44: {
                                            final xky t1 = xky.t1;
                                            waz.h("MODULUS", 2, list);
                                            o = new jcy(Double.valueOf(z6z.d((pey)list.get(0)).h() % z6z.d((pey)list.get(1)).h()));
                                            break;
                                        }
                                    }
                                }
                                else {
                                    waz.h(s, 1, list);
                                    o = z6z.d((pey)list.get(0));
                                }
                            }
                            else {
                                waz.h(s, 2, list);
                                o = z6z.d((pey)list.get(0));
                                z6z.d((pey)list.get(1));
                            }
                        }
                        else {
                            final xky h1 = xky.H1;
                            waz.h("SUBTRACT", 2, list);
                            final pey d = z6z.d((pey)list.get(0));
                            Double n;
                            if ((n = -z6z.d((pey)list.get(1)).h()) == null) {
                                n = Double.NaN;
                            }
                            o = new jcy(Double.valueOf(n + d.h()));
                        }
                    }
                    else {
                        final xky y0 = xky.Y0;
                        waz.h("DIVIDE", 2, list);
                        o = new jcy(Double.valueOf(z6z.d((pey)list.get(0)).h() / z6z.d((pey)list.get(1)).h()));
                    }
                }
                else {
                    waz.h("ADD", 2, list);
                    final pey d2 = z6z.d((pey)list.get(0));
                    final pey d3 = z6z.d((pey)list.get(1));
                    if (!(d2 instanceof ldy) && !(d2 instanceof bgy) && !(d3 instanceof ldy) && !(d3 instanceof bgy)) {
                        o = new jcy(Double.valueOf(d3.h() + d2.h()));
                    }
                    else {
                        o = new bgy(String.valueOf(d2.j()).concat(String.valueOf(d3.j())));
                    }
                }
                return (pey)o;
            }
            case 0: {
                waz.h(((Enum)waz.e(s)).name(), 2, list);
                final pey d4 = z6z.d((pey)list.get(0));
                final pey d5 = z6z.d((pey)list.get(1));
                final int ordinal2 = ((Enum)waz.e(s)).ordinal();
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
                                    b2 = waz.l(d4, d5);
                                    break;
                                }
                                case 39: {
                                    b = waz.l(d4, d5);
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
                oby oby;
                if (b) {
                    oby = pey.A0;
                }
                else {
                    oby = pey.B0;
                }
                return (pey)oby;
            }
        }
    }
}
