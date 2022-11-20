import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class beb implements aeb
{
    public final ceb a;
    public final okh b;
    public fve c;
    
    public beb() {
        final ceb a = new ceb();
        this.a = a;
        this.b = deb.a((okh)okh.Companion, a);
    }
    
    public final boolean a(final int n) {
        final ceb q = jee.q(this.a);
        boolean b = false;
        if (q == null) {
            return false;
        }
        final fve c = this.c;
        final Object o = null;
        if (c != null) {
            Objects.requireNonNull(rdb.Companion);
            peb peb;
            if (n == 1) {
                peb = q.N0.b;
            }
            else if (n == 2) {
                peb = q.N0.c;
            }
            else if (n == 5) {
                peb = q.N0.d;
            }
            else if (n == 6) {
                peb = q.N0.e;
            }
            else if (n == 3) {
                final int ordinal = ((Enum)c).ordinal();
                peb peb2;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    peb2 = q.N0.i;
                }
                else {
                    peb2 = q.N0.h;
                }
                Objects.requireNonNull(peb.Companion);
                if (czd.a((Object)peb2, (Object)peb.b)) {
                    peb2 = null;
                }
                peb = peb2;
                if (peb2 == null) {
                    peb = q.N0.f;
                }
            }
            else if (n == 4) {
                final int ordinal2 = ((Enum)c).ordinal();
                peb peb3;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    peb3 = q.N0.h;
                }
                else {
                    peb3 = q.N0.i;
                }
                Objects.requireNonNull(peb.Companion);
                if (czd.a((Object)peb3, (Object)peb.b)) {
                    peb3 = null;
                }
                peb = peb3;
                if (peb3 == null) {
                    peb = q.N0.g;
                }
            }
            else if (n == 7) {
                peb = (peb)q.N0.j.invoke((Object)new rdb(n));
            }
            else {
                if (n != 8) {
                    throw new IllegalStateException("invalid FocusDirection".toString());
                }
                peb = (peb)q.N0.k.invoke((Object)new rdb(n));
            }
            Objects.requireNonNull(peb.Companion);
            if (!czd.a((Object)peb, (Object)peb.c)) {
                if (czd.a((Object)peb, (Object)peb.b)) {
                    final ceb a = this.a;
                    final fve c2 = this.c;
                    if (c2 == null) {
                        czd.m("layoutDirection");
                        throw null;
                    }
                    final beb$a beb$a = new beb$a(q);
                    czd.f((Object)a, "$this$focusSearch");
                    boolean b2 = false;
                    Label_0560: {
                        if (n != 1) {
                            if (n != 2) {
                                b2 = false;
                                break Label_0560;
                            }
                        }
                        b2 = true;
                    }
                    boolean b3 = false;
                    Label_0865: {
                        if (b2) {
                            if (n == 1) {
                                b3 = clj.b(a, (qsb<? super ceb, Boolean>)beb$a);
                            }
                            else {
                                if (n != 2) {
                                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                                }
                                b3 = clj.a(a, (qsb<? super ceb, Boolean>)beb$a);
                            }
                        }
                        else {
                            boolean b4 = false;
                            Label_0662: {
                                if (n != 3) {
                                    if (n != 4) {
                                        b4 = false;
                                        break Label_0662;
                                    }
                                }
                                b4 = true;
                            }
                            boolean b5 = false;
                            Label_0681: {
                                if (!b4) {
                                    if (n != 5) {
                                        b5 = false;
                                        break Label_0681;
                                    }
                                }
                                b5 = true;
                            }
                            boolean b6 = false;
                            Label_0701: {
                                if (!b5) {
                                    if (n != 6) {
                                        b6 = false;
                                        break Label_0701;
                                    }
                                }
                                b6 = true;
                            }
                            if (b6) {
                                b3 = jhv.i(a, n, (qsb<? super ceb, Boolean>)beb$a);
                            }
                            else {
                                if (n == 7) {
                                    final int ordinal3 = ((Enum)c2).ordinal();
                                    int n2;
                                    if (ordinal3 != 0) {
                                        if (ordinal3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        n2 = 3;
                                    }
                                    else {
                                        n2 = 4;
                                    }
                                    final ceb q2 = jee.q(a);
                                    if (q2 != null) {
                                        b3 = jhv.i(q2, n2, (qsb<? super ceb, Boolean>)beb$a);
                                        break Label_0865;
                                    }
                                }
                                else {
                                    if (n != 8) {
                                        throw new IllegalStateException("Invalid FocusDirection".toString());
                                    }
                                    final ceb q3 = jee.q(a);
                                    Object s = o;
                                    if (q3 != null) {
                                        s = jee.s(q3);
                                    }
                                    if (!czd.a(s, (Object)a)) {
                                        if (s != null) {
                                            b3 = (boolean)beb$a.invoke(s);
                                            break Label_0865;
                                        }
                                    }
                                }
                                b3 = false;
                            }
                        }
                    }
                    if (!b3) {
                        final int ordinal4 = ((Enum)this.a.G0).ordinal();
                        boolean b7 = false;
                        Label_0927: {
                            Label_0925: {
                                if (ordinal4 != 0 && ordinal4 != 1 && ordinal4 != 2) {
                                    if (ordinal4 != 3) {
                                        if (ordinal4 == 4) {
                                            break Label_0925;
                                        }
                                        if (ordinal4 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    b7 = false;
                                    break Label_0927;
                                }
                            }
                            b7 = true;
                        }
                        boolean a2 = false;
                        Label_1014: {
                            if (b7) {
                                if (!this.a.G0.b()) {
                                    boolean b8 = false;
                                    Label_0978: {
                                        if (n != 1) {
                                            if (n != 2) {
                                                b8 = false;
                                                break Label_0978;
                                            }
                                        }
                                        b8 = true;
                                    }
                                    if (b8) {
                                        this.b(false);
                                        if (this.a.G0.b()) {
                                            a2 = this.a(n);
                                            break Label_1014;
                                        }
                                    }
                                }
                            }
                            a2 = false;
                        }
                        if (!a2) {
                            return b;
                        }
                    }
                }
                else {
                    peb.b();
                }
                b = true;
            }
            return b;
        }
        czd.m("layoutDirection");
        throw null;
    }
    
    public final void b(final boolean b) {
        final ceb a = this.a;
        final ueb g0 = a.G0;
        if (web.c(a, b)) {
            final ceb a2 = this.a;
            final int ordinal = ((Enum)g0).ordinal();
            ueb ueb;
            if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                if (ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ueb = ueb.I0;
                }
                else {
                    ueb = ueb.G0;
                }
            }
            else {
                ueb = ueb.D0;
            }
            a2.b(ueb);
        }
    }
}
