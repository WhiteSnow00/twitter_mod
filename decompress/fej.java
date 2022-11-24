import java.util.Iterator;
import java.util.List;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.app.Dialog;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fej implements eo6
{
    public static final fej.fej$a Companion;
    public final gej F0;
    public final a2g G0;
    public final Context H0;
    
    static {
        Companion = new fej.fej$a();
    }
    
    public fej(gej f0, final d2g d2g, final a2g g0, final Context h0) {
        e0e.f((Object)f0, "viewHolder");
        e0e.f((Object)d2g, "subtaskProperties");
        e0e.f((Object)g0, "liveSyncPermissionRequestListener");
        e0e.f((Object)h0, "context");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final d26 h2 = d2g.h;
        if (h2 == null) {
            r9a.d((Throwable)new NullPointerException("Component collection used for live sync permission component is null."));
        }
        e0e.c((Object)h2);
        final Dialog dialog = new Dialog(h0);
        final List e = h2.e;
        final s53 s53 = null;
        final int n = 1;
        boolean b2 = false;
        Label_0213: {
            if (e != null) {
                if (!e.isEmpty()) {
                    for (final rrp rrp : e) {
                        s53 s54;
                        if (rrp instanceof s53) {
                            s54 = (s53)rrp;
                        }
                        else {
                            s54 = null;
                        }
                        boolean equals = false;
                        Label_0199: {
                            if (s54 != null) {
                                final wcj f2 = s54.f;
                                if (f2 != null) {
                                    final dtv a = f2.a;
                                    if (a != null) {
                                        final String b = a.b;
                                        if (b != null) {
                                            equals = b.equals("next_link");
                                            break Label_0199;
                                        }
                                    }
                                }
                            }
                            equals = false;
                        }
                        if (equals) {
                            b2 = true;
                            break Label_0213;
                        }
                    }
                }
            }
            b2 = false;
        }
        if (b2) {
            final gej f3 = this.F0;
            final CharSequence text = this.H0.getResources().getText(2131952839);
            e0e.d((Object)text, "null cannot be cast to non-null type kotlin.String");
            final String s55 = (String)text;
            final List e2 = h2.e;
            Object o = null;
            Label_0374: {
                if (e2 != null) {
                    while (true) {
                        for (final Object next : e2) {
                            final rrp rrp2 = (rrp)next;
                            s53 s56;
                            if (rrp2 instanceof s53) {
                                s56 = (s53)rrp2;
                            }
                            else {
                                s56 = null;
                            }
                            boolean equals2 = false;
                            Label_0352: {
                                if (s56 != null) {
                                    final wcj f4 = s56.f;
                                    if (f4 != null) {
                                        final dtv a2 = f4.a;
                                        if (a2 != null) {
                                            final String b3 = a2.b;
                                            if (b3 != null) {
                                                equals2 = b3.equals("next_link");
                                                break Label_0352;
                                            }
                                        }
                                    }
                                }
                                equals2 = false;
                            }
                            if (equals2) {
                                final rrp rrp3 = (rrp)next;
                                o = rrp3;
                                break Label_0374;
                            }
                        }
                        final rrp rrp3 = null;
                        continue;
                    }
                }
                o = null;
            }
            s53 s57;
            if (o instanceof s53) {
                s57 = (s53)o;
            }
            else {
                s57 = null;
            }
            String c = s55;
            if (s57 != null) {
                final wcj f5 = s57.f;
                c = s55;
                if (f5 != null) {
                    c = f5.c;
                    if (c == null) {
                        c = s55;
                    }
                }
            }
            final obs obs = new obs((Object)this, (Object)dialog, 13);
            Objects.requireNonNull(f3);
            f3.b.a((CharSequence)c, (View$OnClickListener)obs);
        }
        final List e3 = h2.e;
        int n2 = 0;
        Label_0579: {
            if (e3 != null) {
                if (!e3.isEmpty()) {
                    for (final rrp rrp4 : e3) {
                        s53 s58;
                        if (rrp4 instanceof s53) {
                            s58 = (s53)rrp4;
                        }
                        else {
                            s58 = null;
                        }
                        boolean equals3 = false;
                        Label_0564: {
                            if (s58 != null) {
                                final wcj f6 = s58.f;
                                if (f6 != null) {
                                    final dtv a3 = f6.a;
                                    if (a3 != null) {
                                        final String b4 = a3.b;
                                        if (b4 != null) {
                                            equals3 = b4.equals("skip_link");
                                            break Label_0564;
                                        }
                                    }
                                }
                            }
                            equals3 = false;
                        }
                        if (equals3) {
                            n2 = n;
                            break Label_0579;
                        }
                    }
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            final gej f7 = this.F0;
            final CharSequence text2 = this.H0.getResources().getText(2131958112);
            e0e.d((Object)text2, "null cannot be cast to non-null type kotlin.String");
            final String s59 = (String)text2;
            final List e4 = h2.e;
            Object o2 = null;
            Label_0740: {
                if (e4 != null) {
                    while (true) {
                        for (final Object next2 : e4) {
                            final rrp rrp5 = (rrp)next2;
                            s53 s60;
                            if (rrp5 instanceof s53) {
                                s60 = (s53)rrp5;
                            }
                            else {
                                s60 = null;
                            }
                            boolean equals4 = false;
                            Label_0718: {
                                if (s60 != null) {
                                    final wcj f8 = s60.f;
                                    if (f8 != null) {
                                        final dtv a4 = f8.a;
                                        if (a4 != null) {
                                            final String b5 = a4.b;
                                            if (b5 != null) {
                                                equals4 = b5.equals("skip_link");
                                                break Label_0718;
                                            }
                                        }
                                    }
                                }
                                equals4 = false;
                            }
                            if (equals4) {
                                final rrp rrp6 = (rrp)next2;
                                o2 = rrp6;
                                break Label_0740;
                            }
                        }
                        final rrp rrp6 = null;
                        continue;
                    }
                }
                o2 = null;
            }
            s53 s61 = s53;
            if (o2 instanceof s53) {
                s61 = (s53)o2;
            }
            String c2 = s59;
            if (s61 != null) {
                final wcj f9 = s61.f;
                c2 = s59;
                if (f9 != null) {
                    c2 = f9.c;
                    if (c2 == null) {
                        c2 = s59;
                    }
                }
            }
            final a2p a2p = new a2p((Object)this, (Object)dialog, 16);
            Objects.requireNonNull(f7);
            f7.b.b(c2, (View$OnClickListener)a2p);
        }
        f0 = this.F0;
        f0.a.a(f0.c);
    }
    
    public final vn6 c() {
        return vn6.Companion.a(this.F0.c);
    }
}
