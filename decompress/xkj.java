import java.util.Comparator;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xkj
{
    public static final boolean a(final efb efb, final rtb<? super efb, Boolean> rtb) {
        final int ordinal = efb.F0.ordinal();
        final boolean b = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    return d(efb, rtb);
                }
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean b2 = b;
                    if (d(efb, rtb)) {
                        return b2;
                    }
                    if (rtb.invoke((Object)efb)) {
                        b2 = b;
                        return b2;
                    }
                    return false;
                }
            }
            final efb g0 = efb.G0;
            if (g0 != null) {
                final int ordinal2 = g0.F0.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                else {
                                    boolean b2 = b;
                                    if (a(g0, rtb)) {
                                        return b2;
                                    }
                                    Objects.requireNonNull(teb.Companion);
                                    if (c(efb, g0, 2, rtb)) {
                                        b2 = b;
                                        return b2;
                                    }
                                    return false;
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    }
                    else {
                        boolean b2 = b;
                        if (a(g0, rtb)) {
                            return b2;
                        }
                        if (rtb.invoke((Object)g0)) {
                            b2 = b;
                            return b2;
                        }
                        return false;
                    }
                }
                Objects.requireNonNull(teb.Companion);
                return c(efb, g0, 2, rtb);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            return false;
        }
        return d(efb, rtb);
    }
    
    public static final boolean b(efb efb, final rtb<? super efb, Boolean> rtb) {
        final int ordinal = efb.F0.ordinal();
        final boolean b = false;
        Label_0122: {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 || ordinal == 3) {
                        break Label_0122;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return (boolean)rtb.invoke((Object)efb);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                final efb g0 = efb.G0;
                if (g0 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                if (b(g0, rtb)) {
                    return true;
                }
                Objects.requireNonNull(teb.Companion);
                final boolean booleanValue = b;
                if (c(efb, g0, 1, rtb)) {
                    return true;
                }
                return booleanValue;
            }
        }
        efb.E0.s((Comparator)agb.C0);
        final ouh e0 = efb.E0;
        final int e2 = e0.E0;
        boolean booleanValue = b;
        if (e2 > 0) {
            final Object[] c0 = e0.C0;
            zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            do {
                efb = (efb)c0[n];
                if (kq9.U0(efb) && b(efb, rtb)) {
                    return true;
                }
            } while (++n < e2);
            booleanValue = b;
            return booleanValue;
        }
        return booleanValue;
        booleanValue = true;
        return booleanValue;
    }
    
    public static final boolean c(final efb efb, final efb efb2, final int n, final rtb<? super efb, Boolean> rtb) {
        if (e(efb, efb2, n, rtb)) {
            return true;
        }
        final Boolean b = (Boolean)h6q.V(efb, n, (rtb)new xkj$a(efb, efb2, n, (rtb)rtb));
        return b != null && b;
    }
    
    public static final boolean d(final efb efb, final rtb<? super efb, Boolean> rtb) {
        efb.E0.s((Comparator)agb.C0);
        final ouh e0 = efb.E0;
        int e2 = e0.E0;
        if (e2 > 0) {
            --e2;
            final Object[] c0 = e0.C0;
            zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final efb efb2 = (efb)c0[e2];
                if (kq9.U0(efb2) && a(efb2, rtb)) {
                    return true;
                }
            } while (--e2 >= 0);
        }
        return false;
    }
    
    public static final boolean e(final efb efb, final efb efb2, int n, final rtb<? super efb, Boolean> rtb) {
        final wfb g0 = wfb.G0;
        final wfb f0 = efb.F0;
        final wfb d0 = wfb.D0;
        final int n2 = 1;
        if (f0 == d0 || f0 == g0) {
            efb.E0.s((Comparator)agb.C0);
            Objects.requireNonNull(teb.Companion);
            if (n == 1) {
                final ouh e0 = efb.E0;
                final int d2 = ((dud)new fud(0, e0.E0 - 1)).D0;
                if (d2 >= 0) {
                    int n3 = 0;
                    int n4 = 0;
                    while (true) {
                        if (n3 != 0) {
                            final efb efb3 = (efb)e0.C0[n4];
                            if (kq9.U0(efb3) && b(efb3, rtb)) {
                                return true;
                            }
                        }
                        if (zzd.a(e0.C0[n4], (Object)efb2)) {
                            n3 = 1;
                        }
                        if (n4 == d2) {
                            break;
                        }
                        ++n4;
                    }
                }
            }
            else {
                if (n != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                final ouh e2 = efb.E0;
                int d3 = ((dud)new fud(0, e2.E0 - 1)).D0;
                if (d3 >= 0) {
                    int n5 = 0;
                    while (true) {
                        if (n5 != 0) {
                            final efb efb4 = (efb)e2.C0[d3];
                            if (kq9.U0(efb4) && a(efb4, rtb)) {
                                return true;
                            }
                        }
                        if (zzd.a(e2.C0[d3], (Object)efb2)) {
                            n5 = 1;
                        }
                        if (d3 == 0) {
                            break;
                        }
                        --d3;
                    }
                }
            }
            Objects.requireNonNull(teb.Companion);
            if (n == 1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0 && efb.F0 != g0) {
                if (efb.D0 == null) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    return (boolean)rtb.invoke((Object)efb);
                }
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
