import android.content.ComponentName;
import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import com.twitter.util.user.UserIdentifier;
import android.util.Log;
import java.util.Objects;
import android.content.Intent;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.Set;
import java.util.List;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sra implements Callable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public sra(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() {
        switch (this.D0) {
            case 3: {
                final lsi lsi = (lsi)this.E0;
                final znu znu = (znu)this.F0;
                final s70 g0 = s70.G0;
                czd.f((Object)lsi, "$notificationInfo");
                czd.f((Object)znu, "this$0");
                final l40$a j0 = l40.J0;
                s70 e0 = s70.E0;
                final int ordinal = ((Enum)j0).ordinal();
                f40 f40 = null;
                s70 s70 = null;
                Label_0128: {
                    f40 f41;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f40 = null;
                            s70 = e0;
                            break Label_0128;
                        }
                        f41 = null;
                    }
                    else {
                        f41 = (f40)e0;
                    }
                    s70 = null;
                    f40 = f41;
                }
                final l40 l40 = new l40(f40, s70);
                final g70$a g70$a = new g70$a();
                final h70$a h70$a = new h70$a();
                final boolean a = nri.Companion.a(lsi);
                final String d = lsi.d;
                if (d != null) {
                    final int ordinal2 = ((Enum)y60.Q0).ordinal();
                    String s71 = d;
                    String s75 = null;
                    List list2 = null;
                    List list3 = null;
                    List list4 = null;
                    String s76 = null;
                    a70 a4 = null;
                    Label_0374: {
                        String s74 = null;
                        a70 a3 = null;
                        Label_0359: {
                            a70 a2 = null;
                            List list = null;
                            Label_0340: {
                                Label_0337: {
                                    String s72 = null;
                                    String s73 = null;
                                    Label_0320: {
                                        if (ordinal2 != 0) {
                                            if (ordinal2 == 1) {
                                                s72 = null;
                                                s73 = d;
                                                break Label_0320;
                                            }
                                            if (ordinal2 == 2) {
                                                a2 = (a70)d;
                                                s74 = null;
                                                s75 = null;
                                                break Label_0337;
                                            }
                                            if (ordinal2 == 3) {
                                                list = (List)d;
                                                s74 = null;
                                                a2 = null;
                                                s75 = null;
                                                break Label_0340;
                                            }
                                            if (ordinal2 == 4) {
                                                list2 = (List)d;
                                                a3 = null;
                                                s74 = null;
                                                s75 = null;
                                                list3 = null;
                                                break Label_0359;
                                            }
                                            if (ordinal2 == 5) {
                                                list4 = (List)d;
                                                s75 = null;
                                                s76 = null;
                                                a4 = null;
                                                list3 = null;
                                                list2 = null;
                                                break Label_0374;
                                            }
                                            s71 = null;
                                        }
                                        final String s77 = null;
                                        s72 = s71;
                                        s73 = s77;
                                    }
                                    final a70 a5 = null;
                                    final String s78 = s72;
                                    s74 = s73;
                                    s75 = s78;
                                    a2 = a5;
                                }
                                list = null;
                            }
                            final List list5 = null;
                            final List list6 = list;
                            a3 = a2;
                            list2 = list5;
                            list3 = list6;
                        }
                        final List list7 = null;
                        a4 = a3;
                        s76 = s74;
                        list4 = list7;
                    }
                    final y60 y60 = new y60(s75, s76, a4, list3, list2, list4);
                    final c70$b l41 = c70.L0;
                    final int ordinal3 = ((Enum)l41).ordinal();
                    s70 e2 = null;
                    y60 d2 = null;
                    Integer n = null;
                    Label_0460: {
                        Label_0457: {
                            if (ordinal3 != 0) {
                                if (ordinal3 == 1) {
                                    e2 = (s70)y60;
                                    d2 = null;
                                    break Label_0457;
                                }
                                if (ordinal3 == 2) {
                                    n = (Integer)y60;
                                    d2 = null;
                                    e2 = null;
                                    break Label_0460;
                                }
                                d2 = null;
                            }
                            else {
                                d2 = y60;
                            }
                            e2 = null;
                        }
                        n = null;
                    }
                    final c70 c70 = new c70();
                    if (d2 != null) {
                        c70.D0 = d2;
                    }
                    if (e2 != null) {
                        c70.E0 = e2;
                    }
                    if (n != null) {
                        c70.F0 = n;
                        c70.G0.set(0, true);
                    }
                    final c70$a c70$a = new c70$a();
                    c70$a.b(l41, (Object)y60);
                    if (a) {
                        c70$a.b(c70.M0, (Object)e0);
                    }
                    final c70 a6 = c70$a.a();
                    g70$a.a(g70.K0, (Object)c70);
                    h70$a.a(h70.b1, (Object)a6);
                }
                final nvi n2 = lsi.n;
                if (n2 != null) {
                    final mvi b = n2.b;
                    if (b != null) {
                        final f40$a k0 = f40.K0;
                        final k40.a a7 = new k40.a();
                        a7.b(k40.N0, b.d);
                        a7.b(k40.O0, Boolean.TRUE);
                        a7.b(k40.Q0, l40);
                        final f40 f42 = new f40(k0, (Object)a7.a());
                        final int ordinal4 = ((Enum)l40.I0).ordinal();
                        f40 f43;
                        if (ordinal4 != 0) {
                            if (ordinal4 == 1) {
                                final s70 s79 = (s70)f42;
                            }
                            f43 = null;
                        }
                        else {
                            f43 = f42;
                        }
                        final l40 l42 = new l40(f43, g0);
                        if (!a) {
                            e0 = null;
                        }
                        final l40 l43 = new l40(f42, e0);
                        final UserIdentifier b2 = lsi.B;
                        if (bo1.B(b2, "userIdentifier", b2, "android_custom_notification_layout_tweet_notifications_show_collapsed_profile", false)) {
                            g70$a.a(g70.M0, (Object)l42);
                        }
                        h70$a.a(h70.c1, (Object)l43);
                    }
                }
                final String i = lsi.k;
                if (i != null) {
                    final l40$a i2 = l40.I0;
                    final f40$a k2 = f40.K0;
                    final k40.a a8 = new k40.a();
                    a8.b(k40.N0, i);
                    a8.b(k40.Q0, l40);
                    final f40 f44 = new f40(k2, (Object)a8.a());
                    final int ordinal5 = ((Enum)i2).ordinal();
                    f40 f45 = f44;
                    if (ordinal5 != 0) {
                        if (ordinal5 == 1) {
                            final s70 s80 = (s70)f44;
                        }
                        f45 = null;
                    }
                    final l40 l44 = new l40(f45, g0);
                    final UserIdentifier b3 = lsi.B;
                    if (bo1.B(b3, "userIdentifier", b3, "android_custom_notification_layout_tweet_notifications_show_collapsed_media", false)) {
                        g70$a.a(g70.M0, (Object)l44);
                    }
                    h70$a.a(h70.k1, (Object)l44);
                }
                else {
                    h70$a.a(h70.k1, (Object)l40);
                }
                final String e3 = lsi.e;
                if (e3 != null) {
                    final c70$a c70$a2 = new c70$a();
                    final c70$b l45 = c70.L0;
                    final int ordinal6 = ((Enum)y60.Q0).ordinal();
                    String s81 = e3;
                    List list8 = null;
                    String s87 = null;
                    List list10 = null;
                    String s88 = null;
                    a70 a11 = null;
                    List list11 = null;
                    Label_1151: {
                        List list9 = null;
                        a70 a10 = null;
                        String s86 = null;
                        Label_1132: {
                            String s84 = null;
                            a70 a9 = null;
                            String s85 = null;
                            Label_1111: {
                                Label_1108: {
                                    String s83 = null;
                                    Label_1099: {
                                        if (ordinal6 != 0) {
                                            if (ordinal6 == 1) {
                                                final String s82 = null;
                                                s83 = e3;
                                                s84 = s82;
                                                break Label_1099;
                                            }
                                            if (ordinal6 == 2) {
                                                a9 = (a70)e3;
                                                s85 = null;
                                                s84 = null;
                                                break Label_1108;
                                            }
                                            if (ordinal6 == 3) {
                                                list8 = (List)e3;
                                                s85 = null;
                                                a9 = null;
                                                s84 = null;
                                                break Label_1111;
                                            }
                                            if (ordinal6 == 4) {
                                                list9 = (List)e3;
                                                a10 = null;
                                                s86 = null;
                                                s87 = null;
                                                list8 = null;
                                                break Label_1132;
                                            }
                                            if (ordinal6 == 5) {
                                                list10 = (List)e3;
                                                s87 = null;
                                                s88 = null;
                                                a11 = null;
                                                list8 = null;
                                                list11 = null;
                                                break Label_1151;
                                            }
                                            s81 = null;
                                        }
                                        final String s89 = null;
                                        s84 = s81;
                                        s83 = s89;
                                    }
                                    final a70 a12 = null;
                                    s85 = s83;
                                    a9 = a12;
                                }
                                list8 = null;
                            }
                            list9 = null;
                            final String s90 = s85;
                            final String s91 = s84;
                            a10 = a9;
                            s86 = s90;
                            s87 = s91;
                        }
                        final List list12 = null;
                        list11 = list9;
                        a11 = a10;
                        s88 = s86;
                        list10 = list12;
                    }
                    c70$a2.b(l45, (Object)new y60(s87, s88, a11, list8, list11, list10));
                    g70$a.a(g70.L0, (Object)c70$a2.a());
                    final h70.h70$b j2 = h70.j1;
                    c70$a2.b(c70.N0, (Object)6);
                    h70$a.a(j2, (Object)c70$a2.a());
                }
                final kvi m = lsi.m;
                if (m != null) {
                    final String e4 = lsi.e;
                    if (e4 != null) {
                        final c70$a c70$a3 = new c70$a();
                        final c70$b l46 = c70.L0;
                        final int ordinal7 = ((Enum)y60.Q0).ordinal();
                        String s92 = e4;
                        List list13 = null;
                        List list14 = null;
                        List list15 = null;
                        String s99 = null;
                        String s100 = null;
                        a70 a15 = null;
                        Label_1453: {
                            a70 a14 = null;
                            String s97 = null;
                            String s98 = null;
                            Label_1436: {
                                String s95 = null;
                                a70 a13 = null;
                                String s96 = null;
                                Label_1415: {
                                    Label_1412: {
                                        String s94 = null;
                                        Label_1403: {
                                            if (ordinal7 != 0) {
                                                if (ordinal7 == 1) {
                                                    final String s93 = null;
                                                    s94 = e4;
                                                    s95 = s93;
                                                    break Label_1403;
                                                }
                                                if (ordinal7 == 2) {
                                                    a13 = (a70)e4;
                                                    s96 = null;
                                                    s95 = null;
                                                    break Label_1412;
                                                }
                                                if (ordinal7 == 3) {
                                                    list13 = (List)e4;
                                                    s96 = null;
                                                    a13 = null;
                                                    s95 = null;
                                                    break Label_1415;
                                                }
                                                if (ordinal7 == 4) {
                                                    list14 = (List)e4;
                                                    a14 = null;
                                                    s97 = null;
                                                    s98 = null;
                                                    list13 = null;
                                                    break Label_1436;
                                                }
                                                if (ordinal7 == 5) {
                                                    list15 = (List)e4;
                                                    s99 = null;
                                                    s100 = null;
                                                    a15 = null;
                                                    list13 = null;
                                                    list14 = null;
                                                    break Label_1453;
                                                }
                                                s92 = null;
                                            }
                                            final String s101 = null;
                                            s95 = s92;
                                            s94 = s101;
                                        }
                                        final a70 a16 = null;
                                        s96 = s94;
                                        a13 = a16;
                                    }
                                    list13 = null;
                                }
                                list14 = null;
                                final String s102 = s96;
                                final String s103 = s95;
                                a14 = a13;
                                s97 = s102;
                                s98 = s103;
                            }
                            final List list16 = null;
                            a15 = a14;
                            s100 = s97;
                            s99 = s98;
                            list15 = list16;
                        }
                        c70$a3.b(l46, (Object)new y60(s99, s100, a15, list13, list14, list15));
                        g70$a.a(g70.L0, (Object)c70$a3.a());
                        final h70.h70$b j3 = h70.j1;
                        final UserIdentifier b4 = lsi.B;
                        if (bo1.B(b4, "userIdentifier", b4, "android_custom_notification_layout_truncate_media_card", false)) {
                            c70$a3.b(c70.N0, (Object)asa.a(b4).f("android_custom_notification_layout_media_card_max_lines", 3));
                        }
                        else {
                            c70$a3.b(c70.N0, (Object)3);
                        }
                        h70$a.a(j3, (Object)c70$a3.a());
                    }
                    final h70.h70$b i3 = h70.i1;
                    final c70$b l47 = c70.L0;
                    final y60$a q0 = y60.Q0;
                    String q2 = yqs.q(znu.a.getResources(), m.c);
                    final int ordinal8 = ((Enum)q0).ordinal();
                    List list17 = null;
                    String s104 = null;
                    String s105 = null;
                    a70 a17 = null;
                    List list18 = null;
                    List list19 = null;
                    Label_1795: {
                        Label_1792: {
                            String s106 = null;
                            a70 a18 = null;
                            String s107 = null;
                            Label_1771: {
                                Label_1768: {
                                    Label_1759: {
                                        Label_1750: {
                                            if (ordinal8 != 0) {
                                                if (ordinal8 != 1) {
                                                    if (ordinal8 != 2) {
                                                        if (ordinal8 != 3) {
                                                            if (ordinal8 != 4) {
                                                                if (ordinal8 == 5) {
                                                                    if (q2 != null) {
                                                                        list17 = (List)q2;
                                                                        s104 = null;
                                                                        s105 = null;
                                                                        a17 = null;
                                                                        list18 = null;
                                                                        list19 = null;
                                                                        break Label_1795;
                                                                    }
                                                                }
                                                            }
                                                            else if (q2 != null) {
                                                                list19 = (List)q2;
                                                                a17 = null;
                                                                s105 = null;
                                                                s104 = null;
                                                                list18 = null;
                                                                break Label_1792;
                                                            }
                                                        }
                                                        else if (q2 != null) {
                                                            list18 = (List)q2;
                                                            s106 = null;
                                                            a18 = null;
                                                            s107 = null;
                                                            break Label_1771;
                                                        }
                                                    }
                                                    else if (q2 != null) {
                                                        a18 = (a70)q2;
                                                        s106 = null;
                                                        s107 = null;
                                                        break Label_1768;
                                                    }
                                                }
                                                else if (q2 != null) {
                                                    s107 = null;
                                                    break Label_1759;
                                                }
                                            }
                                            else if (q2 != null) {
                                                break Label_1750;
                                            }
                                            q2 = null;
                                        }
                                        final String s108 = null;
                                        s107 = q2;
                                        q2 = s108;
                                    }
                                    final a70 a19 = null;
                                    s106 = q2;
                                    a18 = a19;
                                }
                                list18 = null;
                            }
                            list19 = null;
                            final String s109 = s106;
                            final String s110 = s107;
                            a17 = a18;
                            s105 = s109;
                            s104 = s110;
                        }
                        list17 = null;
                    }
                    final y60 y61 = new y60(s104, s105, a17, list18, list19, list17);
                    final int ordinal9 = ((Enum)l47).ordinal();
                    y60 y62 = y61;
                    s70 e5 = null;
                    y60 d3 = null;
                    Integer n3 = null;
                    Label_1882: {
                        Label_1879: {
                            if (ordinal9 != 0) {
                                if (ordinal9 == 1) {
                                    e5 = (s70)y61;
                                    d3 = null;
                                    break Label_1879;
                                }
                                if (ordinal9 == 2) {
                                    n3 = (Integer)y61;
                                    e5 = null;
                                    d3 = null;
                                    break Label_1882;
                                }
                                y62 = null;
                            }
                            final s70 s111 = null;
                            d3 = y62;
                            e5 = s111;
                        }
                        n3 = null;
                    }
                    final c70 c71 = new c70();
                    if (d3 != null) {
                        c71.D0 = d3;
                    }
                    if (e5 != null) {
                        c71.E0 = e5;
                    }
                    if (n3 != null) {
                        c71.F0 = n3;
                        c71.G0.set(0, true);
                    }
                    h70$a.a(i3, (Object)c71);
                }
                final nvi n4 = lsi.n;
                if (n4 != null) {
                    final mvi b5 = n4.b;
                    if (b5 != null) {
                        final h70.h70$b g2 = h70.g1;
                        final c70$b l48 = c70.L0;
                        final y60$a q3 = y60.Q0;
                        Object h = hmg.h("@", b5.b);
                        final int ordinal10 = ((Enum)q3).ordinal();
                        List list20 = null;
                        Object o = null;
                        a70 a20 = null;
                        List list21 = null;
                        List list22 = null;
                        Label_2169: {
                            Label_2166: {
                                Label_2163: {
                                    Label_2160: {
                                        Label_2157: {
                                            Label_2154: {
                                                if (ordinal10 != 0) {
                                                    if (ordinal10 != 1) {
                                                        if (ordinal10 != 2) {
                                                            if (ordinal10 != 3) {
                                                                if (ordinal10 != 4) {
                                                                    if (ordinal10 == 5) {
                                                                        if (h != null) {
                                                                            list20 = (List)h;
                                                                            o = null;
                                                                            h = null;
                                                                            a20 = null;
                                                                            list21 = null;
                                                                            list22 = null;
                                                                            break Label_2169;
                                                                        }
                                                                    }
                                                                }
                                                                else if (h != null) {
                                                                    list22 = (List)h;
                                                                    o = null;
                                                                    a20 = null;
                                                                    h = null;
                                                                    list21 = null;
                                                                    break Label_2166;
                                                                }
                                                            }
                                                            else if (h != null) {
                                                                list21 = (List)h;
                                                                o = null;
                                                                a20 = null;
                                                                h = null;
                                                                break Label_2163;
                                                            }
                                                        }
                                                        else if (h != null) {
                                                            a20 = (a70)h;
                                                            o = null;
                                                            h = null;
                                                            break Label_2160;
                                                        }
                                                    }
                                                    else if (h != null) {
                                                        o = null;
                                                        break Label_2157;
                                                    }
                                                }
                                                else if (h != null) {
                                                    o = h;
                                                    break Label_2154;
                                                }
                                                o = null;
                                            }
                                            h = null;
                                        }
                                        a20 = null;
                                    }
                                    list21 = null;
                                }
                                list22 = null;
                            }
                            list20 = null;
                        }
                        final y60 y63 = new y60((String)o, (String)h, a20, list21, list22, list20);
                        final int ordinal11 = ((Enum)l48).ordinal();
                        y60 y64 = y63;
                        s70 e6 = null;
                        y60 d4 = null;
                        Integer n5 = null;
                        Label_2256: {
                            Label_2253: {
                                if (ordinal11 != 0) {
                                    if (ordinal11 == 1) {
                                        e6 = (s70)y63;
                                        d4 = null;
                                        break Label_2253;
                                    }
                                    if (ordinal11 == 2) {
                                        n5 = (Integer)y63;
                                        e6 = null;
                                        d4 = null;
                                        break Label_2256;
                                    }
                                    y64 = null;
                                }
                                final s70 s112 = null;
                                d4 = y64;
                                e6 = s112;
                            }
                            n5 = null;
                        }
                        final c70 c72 = new c70();
                        if (d4 != null) {
                            c72.D0 = d4;
                        }
                        if (e6 != null) {
                            c72.E0 = e6;
                        }
                        if (n5 != null) {
                            c72.F0 = n5;
                            c72.G0.set(0, true);
                        }
                        h70$a.a(g2, (Object)c72);
                        final String c73 = b5.c;
                        if (c73 != null) {
                            final h70.h70$b f46 = h70.f1;
                            final y60 d5 = new y60(c73, (String)null, (a70)null, (List)null, (List)null, (List)null);
                            final c70 c74 = new c70();
                            c74.D0 = d5;
                            h70$a.a(f46, (Object)c74);
                        }
                        final String d6 = b5.d;
                        if (d6 != null) {
                            final h70.h70$b e7 = h70.e1;
                            final l40$a i4 = l40.I0;
                            final f40$a k3 = f40.K0;
                            final k40.a a21 = new k40.a();
                            a21.b(k40.N0, d6);
                            a21.b(k40.O0, Boolean.TRUE);
                            a21.b(k40.Q0, l40);
                            Object o2 = new f40(k3, (Object)a21.a());
                            final int ordinal12 = ((Enum)i4).ordinal();
                            s70 s113;
                            if (ordinal12 != 0) {
                                if (ordinal12 != 1) {
                                    s113 = null;
                                }
                                else {
                                    s113 = (s70)o2;
                                }
                                o2 = null;
                            }
                            else {
                                s113 = null;
                            }
                            h70$a.a(e7, (Object)new l40((f40)o2, s113));
                        }
                        else {
                            h70$a.a(h70.e1, (Object)l40);
                        }
                    }
                }
                final z50.z50$a j4 = z50.J0;
                v30 v30 = new v30(v30.M0, (Object)new h70(h70$a.a, h70$a.b, h70$a.c, h70$a.d, h70$a.e, h70$a.f, h70$a.g, h70$a.h, h70$a.i, h70$a.j, h70$a.k));
                final int ordinal13 = ((Enum)j4).ordinal();
                j20 j5 = null;
                Label_2642: {
                    if (ordinal13 != 0) {
                        if (ordinal13 == 1) {
                            j5 = null;
                            break Label_2642;
                        }
                        j5 = null;
                    }
                    else {
                        j5 = (j20)v30;
                    }
                    v30 = null;
                }
                final z50.z50$a i5 = z50.I0;
                final j20 j6 = new j20(j20.K0, (Object)new g70(g70$a.a, g70$a.b, g70$a.c));
                final int ordinal14 = ((Enum)i5).ordinal();
                if (ordinal14 != 0) {
                    if (ordinal14 == 1) {
                        v30 = (v30)j6;
                    }
                }
                else {
                    j5 = j6;
                }
                return new ynj((Object)new zsi(new z50(j5, v30)));
            }
            case 2: {
                final wr7 wr7 = (wr7)this.E0;
                final Set set = (Set)this.F0;
                final yt7 b6 = wr7.b;
                final n3e a22 = b6.a(b6.c(set));
                final qo7 qo7 = (qo7)fq4.p((Iterable)a22);
                h1e.a((Closeable)a22);
                ynj b7;
                if (qo7 != null) {
                    b7 = new ynj((Object)qo7.a);
                }
                else {
                    b7 = ynj.b;
                    final int a23 = c5j.a;
                }
                return b7;
            }
            case 1: {
                return zfm.a((Context)((xb3$a)this.E0).c.D0, (Bitmap)this.F0, 25.0f);
            }
            case 0: {
                final Context context = (Context)this.E0;
                final Intent intent = (Intent)this.F0;
                Object a24 = ump.a();
                Objects.requireNonNull(a24);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ump)a24).d.offer(intent);
                final Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a24) {
                    String s114 = ((ump)a24).a;
                    Label_3168: {
                        if (s114 != null) {
                            monitorexit(a24);
                        }
                        else {
                            final ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            Label_3166: {
                                if (resolveService != null) {
                                    final ServiceInfo serviceInfo = resolveService.serviceInfo;
                                    if (serviceInfo != null) {
                                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                                            final String name = serviceInfo.name;
                                            if (name != null) {
                                                if (name.startsWith(".")) {
                                                    final StringBuilder sb = new StringBuilder();
                                                    sb.append(context.getPackageName());
                                                    sb.append(serviceInfo.name);
                                                    ((ump)a24).a = sb.toString();
                                                }
                                                else {
                                                    ((ump)a24).a = serviceInfo.name;
                                                }
                                                s114 = ((ump)a24).a;
                                                monitorexit(a24);
                                                break Label_3168;
                                            }
                                        }
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                                        sb2.append(serviceInfo.packageName);
                                        sb2.append("/");
                                        sb2.append(serviceInfo.name);
                                        Log.e("FirebaseMessaging", sb2.toString());
                                        monitorexit(a24);
                                        break Label_3166;
                                    }
                                }
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                                monitorexit(a24);
                            }
                            s114 = null;
                        }
                    }
                    if (s114 != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Restricting intent to a specific service: ");
                            sb3.append(s114);
                            Log.d("FirebaseMessaging", sb3.toString());
                        }
                        intent2.setClassName(context.getPackageName(), s114);
                    }
                    int n6;
                    try {
                        ComponentName componentName;
                        if (((ump)a24).c(context)) {
                            componentName = cix.a(context, intent2);
                        }
                        else {
                            componentName = context.startService(intent2);
                            Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                        }
                        if (componentName == null) {
                            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                            n6 = 404;
                        }
                        else {
                            n6 = -1;
                        }
                    }
                    catch (final IllegalStateException ex) {
                        a24 = new StringBuilder();
                        ((StringBuilder)a24).append("Failed to start service while in background: ");
                        ((StringBuilder)a24).append(ex);
                        Log.e("FirebaseMessaging", ((StringBuilder)a24).toString());
                        n6 = 402;
                    }
                    catch (final SecurityException ex2) {
                        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", (Throwable)ex2);
                        n6 = 401;
                    }
                    return n6;
                }
                break;
            }
        }
        final v9u v9u = (v9u)this.E0;
        final Iterable iterable = (Iterable)this.F0;
        czd.f((Object)v9u, "this$0");
        czd.f((Object)iterable, "$objects");
        return cjh.c((two)v9u.D0).h(iterable, (Class)o6u.class, true);
    }
}
