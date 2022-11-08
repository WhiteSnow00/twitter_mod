import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzg
{
    public static String a(final vo6 vo6) {
        final int c = z6.c(vo6);
        Label_0107: {
            Label_0084: {
                if (c != 0) {
                    if (c == 1) {
                        break Label_0084;
                    }
                    if (c == 2) {
                        break Label_0107;
                    }
                    if (c != 3) {
                        if (c == 4) {
                            break Label_0084;
                        }
                        if (c != 7) {
                            if (c != 10) {
                                return "";
                            }
                            break Label_0084;
                        }
                    }
                    else {
                        final dtg c2 = wug.c(vo6.f());
                        if (c2 != null) {
                            return String.valueOf(c2.M0);
                        }
                    }
                }
                final dtg h = wug.h(vo6.f());
                if (h != null) {
                    return String.valueOf(h.M0);
                }
            }
            final tj3 w0 = vo6.C0.W0;
            if (w0 != null) {
                final String i = w0.i();
                if (i != null) {
                    return i;
                }
            }
        }
        final Iterator iterator = ((p7a)vo6.g()).iterator();
        while (true) {
            while (iterator.hasNext()) {
                final String i2 = iterator.next().I0;
                if (x3j.J(i2)) {
                    if (i2 != null) {
                        return i2;
                    }
                    return "";
                }
            }
            final String i2 = null;
            continue;
        }
    }
    
    public static String b(final dtg dtg) {
        final int ordinal = ((Enum)dtg.S0).ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return "";
        }
        return String.valueOf(dtg.M0);
    }
    
    public static long c(final vo6 vo6) {
        final int c = z6.c(vo6);
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        return wug.l(vo6, wug.c(vo6.f()));
                    }
                    if (c != 7) {
                        return -1L;
                    }
                    return wug.l(vo6, wug.h(vo6.f()));
                }
            }
            else {
                final tj3 w0 = vo6.C0.W0;
                if (w0 != null) {
                    final ebh f = w0.f();
                    if (f != null) {
                        return f.a;
                    }
                }
            }
            return vo6.w();
        }
        return wug.l(vo6, wug.h(vo6.f()));
    }
    
    public static long d(final dtg dtg) {
        final int ordinal = ((Enum)dtg.S0).ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return -1L;
        }
        return wug.l((vo6)null, dtg);
    }
    
    public static int e(final vo6 vo6) {
        if (vo6.U()) {
            return 8;
        }
        final int c = z6.c(vo6);
        if (c != 0) {
            if (c == 1) {
                return 2;
            }
            if (c == 2) {
                return 4;
            }
            if (c == 3) {
                return 3;
            }
            if (c != 7) {
                return -1;
            }
        }
        return 1;
    }
    
    public static int f(final dtg dtg) {
        final int ordinal = ((Enum)dtg.S0).ordinal();
        if (ordinal == 1) {
            return 8;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal != 3) {
            return -1;
        }
        return 1;
    }
    
    public static int g(final l1h l1h) {
        if (l1h == l1h.H0) {
            return 3;
        }
        if (l1h == l1h.I0) {
            return 1;
        }
        if (l1h == l1h.G0) {
            return 8;
        }
        return -1;
    }
}
