import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddj
{
    public final scs a;
    public o97 b;
    
    public ddj(final scs a) {
        this.a = a;
    }
    
    public final sa8 a(final cdj cdj) {
        final boolean b = cdj instanceof ttr;
        final sa8 sa8 = null;
        if (b) {
            final ttr ttr = (ttr)cdj;
            final rrd rrd = this.a.d.get(ttr.b);
            sa8 a;
            if (rrd == null) {
                a = sa8;
            }
            else {
                final vrd b2 = rrd.b;
                if (ttr.c != 3) {
                    a = sa8;
                }
                else {
                    a = sa8;
                    if (b2 instanceof ta8) {
                        a = ((ta8)b2).a();
                    }
                }
            }
            return a;
        }
        if (cdj instanceof ya8) {
            return ((ya8)cdj).b;
        }
        return null;
    }
    
    public final String b(final cdj cdj) {
        final boolean b = cdj instanceof ttr;
        final String s = null;
        if (b) {
            final ttr ttr = (ttr)cdj;
            final rrd rrd = this.a.d.get(ttr.b);
            Object o = null;
            Label_0099: {
                if (ttr.b.equals(this.a.h.a)) {
                    final o97 b2 = this.b;
                    if (b2 != null) {
                        o = b2.h3();
                        break Label_0099;
                    }
                }
                if (rrd != null) {
                    o = rrd.b;
                }
                else {
                    o = null;
                }
            }
            final int c = ttr.c;
            String s2;
            if (c != 1) {
                if (c != 2) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 8) {
                                if (c != 9) {
                                    s2 = s;
                                }
                                else {
                                    s2 = s;
                                    if (o instanceof jwd) {
                                        s2 = NumberFormat.getIntegerInstance().format(((jwd)o).b.size());
                                    }
                                }
                            }
                            else {
                                s2 = s;
                                if (o instanceof d07) {
                                    s2 = ((d07)o).q();
                                }
                            }
                        }
                        else {
                            s2 = s;
                            if (o instanceof phw) {
                                s2 = NumberFormat.getIntegerInstance().format(((phw)o).b.size());
                            }
                        }
                    }
                    else {
                        s2 = s;
                        if (o instanceof zz9) {
                            s2 = ((zz9)o).c();
                        }
                    }
                }
                else {
                    s2 = s;
                    if (o instanceof b7i) {
                        s2 = ((b7i)o).getName();
                    }
                }
            }
            else {
                s2 = s;
                if (o instanceof ack) {
                    s2 = ((ack)o).b();
                }
            }
            return s2;
        }
        if (cdj instanceof ilr) {
            return ((ilr)cdj).b;
        }
        return null;
    }
}
