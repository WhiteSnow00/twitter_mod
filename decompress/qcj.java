import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qcj
{
    public final acs a;
    public i87 b;
    
    public qcj(final acs a) {
        this.a = a;
    }
    
    public final o98 a(final pcj pcj) {
        final boolean b = pcj instanceof vsr;
        final o98 o98 = null;
        if (b) {
            final vsr vsr = (vsr)pcj;
            final pqd pqd = this.a.d.get(vsr.b);
            o98 a;
            if (pqd == null) {
                a = o98;
            }
            else {
                final tqd b2 = pqd.b;
                if (vsr.c != 3) {
                    a = o98;
                }
                else {
                    a = o98;
                    if (b2 instanceof p98) {
                        a = ((p98)b2).a();
                    }
                }
            }
            return a;
        }
        if (pcj instanceof u98) {
            return ((u98)pcj).b;
        }
        return null;
    }
    
    public final String b(final pcj pcj) {
        final boolean b = pcj instanceof vsr;
        final String s = null;
        if (b) {
            final vsr vsr = (vsr)pcj;
            final pqd pqd = this.a.d.get(vsr.b);
            Object o = null;
            Label_0099: {
                if (vsr.b.equals(this.a.h.a)) {
                    final i87 b2 = this.b;
                    if (b2 != null) {
                        o = b2.h3();
                        break Label_0099;
                    }
                }
                if (pqd != null) {
                    o = pqd.b;
                }
                else {
                    o = null;
                }
            }
            final int c = vsr.c;
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
                                    if (o instanceof hvd) {
                                        s2 = NumberFormat.getIntegerInstance().format(((hvd)o).b.size());
                                    }
                                }
                            }
                            else {
                                s2 = s;
                                if (o instanceof xy6) {
                                    s2 = ((xy6)o).q();
                                }
                            }
                        }
                        else {
                            s2 = s;
                            if (o instanceof zgw) {
                                s2 = NumberFormat.getIntegerInstance().format(((zgw)o).b.size());
                            }
                        }
                    }
                    else {
                        s2 = s;
                        if (o instanceof xy9) {
                            s2 = ((xy9)o).c();
                        }
                    }
                }
                else {
                    s2 = s;
                    if (o instanceof i6i) {
                        s2 = ((i6i)o).getName();
                    }
                }
            }
            else {
                s2 = s;
                if (o instanceof mbk) {
                    s2 = ((mbk)o).b();
                }
            }
            return s2;
        }
        if (pcj instanceof lkr) {
            return ((lkr)pcj).b;
        }
        return null;
    }
}
