import java.util.Comparator;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clj
{
    public static final boolean a(final ceb ceb, final qsb<? super ceb, Boolean> qsb) {
        final int ordinal = ((Enum)ceb.G0).ordinal();
        final boolean b = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    return d(ceb, qsb);
                }
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean b2 = b;
                    if (d(ceb, qsb)) {
                        return b2;
                    }
                    if (qsb.invoke((Object)ceb)) {
                        b2 = b;
                        return b2;
                    }
                    return false;
                }
            }
            final ceb h0 = ceb.H0;
            if (h0 != null) {
                final int ordinal2 = ((Enum)h0.G0).ordinal();
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
                                    if (a(h0, qsb)) {
                                        return b2;
                                    }
                                    Objects.requireNonNull(rdb.Companion);
                                    if (c(ceb, h0, 2, qsb)) {
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
                        if (a(h0, qsb)) {
                            return b2;
                        }
                        if (qsb.invoke((Object)h0)) {
                            b2 = b;
                            return b2;
                        }
                        return false;
                    }
                }
                Objects.requireNonNull(rdb.Companion);
                return c(ceb, h0, 2, qsb);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            return false;
        }
        return d(ceb, qsb);
    }
    
    public static final boolean b(ceb ceb, final qsb<? super ceb, Boolean> qsb) {
        final int ordinal = ((Enum)ceb.G0).ordinal();
        final boolean b = false;
        Label_0124: {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 || ordinal == 3) {
                        break Label_0124;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return (boolean)qsb.invoke((Object)ceb);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                final ceb h0 = ceb.H0;
                if (h0 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                if (b(h0, qsb)) {
                    return true;
                }
                Objects.requireNonNull(rdb.Companion);
                final boolean booleanValue = b;
                if (c(ceb, h0, 1, qsb)) {
                    return true;
                }
                return booleanValue;
            }
        }
        ceb.F0.s((Comparator)yeb.D0);
        final suh f0 = ceb.F0;
        final int f2 = f0.F0;
        boolean booleanValue = b;
        if (f2 > 0) {
            final Object[] d0 = f0.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            do {
                ceb = (ceb)d0[n];
                if (jee.a0(ceb) && b(ceb, qsb)) {
                    return true;
                }
            } while (++n < f2);
            booleanValue = b;
            return booleanValue;
        }
        return booleanValue;
        booleanValue = true;
        return booleanValue;
    }
    
    public static final boolean c(final ceb ceb, final ceb ceb2, final int n, final qsb<? super ceb, Boolean> qsb) {
        if (e(ceb, ceb2, n, qsb)) {
            return true;
        }
        final Boolean b = (Boolean)af8.M(ceb, n, (qsb)new qsb<vv1$a, Boolean>(ceb, ceb2, n, qsb) {
            public final ceb D0;
            public final ceb E0;
            public final int F0;
            public final qsb<ceb, Boolean> G0;
            
            public final Object invoke(final Object o) {
                final vv1$a vv1$a = (vv1$a)o;
                czd.f((Object)vv1$a, "$this$searchBeyondBounds");
                Boolean value = clj.e(this.D0, this.E0, this.F0, this.G0);
                if (!value && vv1$a.a()) {
                    value = null;
                }
                return value;
            }
        });
        return b != null && b;
    }
    
    public static final boolean d(final ceb ceb, final qsb<? super ceb, Boolean> qsb) {
        ceb.F0.s((Comparator)yeb.D0);
        final suh f0 = ceb.F0;
        int f2 = f0.F0;
        if (f2 > 0) {
            --f2;
            final Object[] d0 = f0.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final ceb ceb2 = (ceb)d0[f2];
                if (jee.a0(ceb2) && a(ceb2, qsb)) {
                    return true;
                }
            } while (--f2 >= 0);
        }
        return false;
    }
    
    public static final boolean e(final ceb ceb, final ceb ceb2, int n, final qsb<? super ceb, Boolean> qsb) {
        final ueb h0 = ueb.H0;
        final ueb g0 = ceb.G0;
        final ueb e0 = ueb.E0;
        final int n2 = 1;
        if (g0 == e0 || g0 == h0) {
            ceb.F0.s((Comparator)yeb.D0);
            Objects.requireNonNull(rdb.Companion);
            if (n == 1) {
                final suh f0 = ceb.F0;
                final int e2 = ((gtd)new itd(0, f0.F0 - 1)).E0;
                if (e2 >= 0) {
                    int n3 = 0;
                    int n4 = 0;
                    while (true) {
                        if (n3 != 0) {
                            final ceb ceb3 = (ceb)f0.D0[n4];
                            if (jee.a0(ceb3) && b(ceb3, qsb)) {
                                return true;
                            }
                        }
                        if (czd.a(f0.D0[n4], (Object)ceb2)) {
                            n3 = 1;
                        }
                        if (n4 == e2) {
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
                final suh f2 = ceb.F0;
                int e3 = ((gtd)new itd(0, f2.F0 - 1)).E0;
                if (e3 >= 0) {
                    int n5 = 0;
                    while (true) {
                        if (n5 != 0) {
                            final ceb ceb4 = (ceb)f2.D0[e3];
                            if (jee.a0(ceb4) && a(ceb4, qsb)) {
                                return true;
                            }
                        }
                        if (czd.a(f2.D0[e3], (Object)ceb2)) {
                            n5 = 1;
                        }
                        if (e3 == 0) {
                            break;
                        }
                        --e3;
                    }
                }
            }
            Objects.requireNonNull(rdb.Companion);
            if (n == 1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0 && ceb.G0 != h0) {
                if (ceb.E0 == null) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    return (boolean)qsb.invoke((Object)ceb);
                }
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
