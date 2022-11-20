import java.io.IOException;
import android.graphics.Rect;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdg
{
    public static final nhe$a a;
    public static nhe$a b;
    public static final nhe$a c;
    public static final nhe$a d;
    
    static {
        a = nhe$a.a(new String[] { "w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers" });
        hdg.b = nhe$a.a(new String[] { "id", "layers", "w", "h", "p", "u" });
        c = nhe$a.a(new String[] { "list" });
        d = nhe$a.a(new String[] { "cm", "tm", "dr" });
    }
    
    public static adg a(final nhe nhe) throws IOException {
        float c = hnw.c();
        ecg h = new ecg();
        final ArrayList i = new ArrayList();
        final HashMap c2 = new HashMap();
        final HashMap d = new HashMap();
        HashMap e = new HashMap();
        ArrayList f = new ArrayList();
        u0r g = new u0r();
        final adg adg = new adg();
        nhe.b();
        int p = 0;
        float m = 0.0f;
        float k = 0.0f;
        float l = 0.0f;
        int p2 = 0;
        while (nhe.hasNext()) {
            ecg ecg = null;
            float n2 = 0.0f;
            ArrayList list2 = null;
            HashMap hashMap = null;
            u0r u0r2 = null;
            float n16 = 0.0f;
            Label_1634: {
                float n3 = 0.0f;
                Label_1630: {
                    Label_1577: {
                        float n4 = 0.0f;
                        ArrayList list4 = null;
                        Label_0824: {
                            switch (nhe.f(hdg.a)) {
                                default: {
                                    final ArrayList list = f;
                                    final u0r u0r = g;
                                    final float n = l;
                                    ecg = h;
                                    nhe.h();
                                    nhe.g0();
                                    n2 = c;
                                    list2 = list;
                                    n3 = n;
                                    hashMap = e;
                                    u0r2 = u0r;
                                    break Label_1630;
                                }
                                case 10: {
                                    nhe.a();
                                    n4 = l;
                                    final float n5 = k;
                                    while (nhe.hasNext()) {
                                        nhe.b();
                                        String r1 = null;
                                        float n6 = 0.0f;
                                        float n7 = 0.0f;
                                        while (nhe.hasNext()) {
                                            final int f2 = nhe.f(hdg.d);
                                            if (f2 != 0) {
                                                if (f2 != 1) {
                                                    if (f2 != 2) {
                                                        nhe.h();
                                                        nhe.g0();
                                                    }
                                                    else {
                                                        n7 = (float)nhe.m2();
                                                    }
                                                }
                                                else {
                                                    n6 = (float)nhe.m2();
                                                }
                                            }
                                            else {
                                                r1 = nhe.R1();
                                            }
                                        }
                                        nhe.d();
                                        f.add(new klg(r1, n6, n7));
                                    }
                                    nhe.c();
                                    k = n5;
                                    break;
                                }
                                case 9: {
                                    nhe.a();
                                    while (nhe.hasNext()) {
                                        final nhe$a a = ojb.a;
                                        final ArrayList<nrp> list3 = new ArrayList<nrp>();
                                        nhe.b();
                                        double m2 = 0.0;
                                        String r2 = null;
                                        String r3 = null;
                                        char char1 = '\0';
                                        while (nhe.hasNext()) {
                                            final int f3 = nhe.f(ojb.a);
                                            if (f3 != 0) {
                                                if (f3 != 1) {
                                                    if (f3 != 2) {
                                                        if (f3 != 3) {
                                                            if (f3 != 4) {
                                                                if (f3 != 5) {
                                                                    nhe.h();
                                                                    nhe.g0();
                                                                }
                                                                else {
                                                                    nhe.b();
                                                                    while (nhe.hasNext()) {
                                                                        if (nhe.f(ojb.b) != 0) {
                                                                            nhe.h();
                                                                            nhe.g0();
                                                                        }
                                                                        else {
                                                                            nhe.a();
                                                                            while (nhe.hasNext()) {
                                                                                list3.add((nrp)ul6.a(nhe, adg));
                                                                            }
                                                                            nhe.c();
                                                                        }
                                                                    }
                                                                    nhe.d();
                                                                }
                                                            }
                                                            else {
                                                                r3 = nhe.R1();
                                                            }
                                                        }
                                                        else {
                                                            r2 = nhe.R1();
                                                        }
                                                    }
                                                    else {
                                                        m2 = nhe.m2();
                                                    }
                                                }
                                                else {
                                                    nhe.m2();
                                                }
                                            }
                                            else {
                                                char1 = nhe.R1().charAt(0);
                                            }
                                        }
                                        nhe.d();
                                        final njb njb = new njb((List)list3, char1, m2, r2, r3);
                                        g.g(njb.hashCode(), (Object)njb);
                                    }
                                    nhe.c();
                                    n4 = l;
                                    break;
                                }
                                case 8: {
                                    nhe.b();
                                    while (nhe.hasNext()) {
                                        if (nhe.f(hdg.c) != 0) {
                                            nhe.h();
                                            nhe.g0();
                                        }
                                        else {
                                            nhe.a();
                                            while (nhe.hasNext()) {
                                                final nhe$a a2 = yjb.a;
                                                nhe.b();
                                                String r4 = null;
                                                String r6;
                                                String r5 = r6 = null;
                                                while (nhe.hasNext()) {
                                                    final int f4 = nhe.f(yjb.a);
                                                    if (f4 != 0) {
                                                        if (f4 != 1) {
                                                            if (f4 != 2) {
                                                                if (f4 != 3) {
                                                                    nhe.h();
                                                                    nhe.g0();
                                                                }
                                                                else {
                                                                    nhe.m2();
                                                                }
                                                            }
                                                            else {
                                                                r6 = nhe.R1();
                                                            }
                                                        }
                                                        else {
                                                            r5 = nhe.R1();
                                                        }
                                                    }
                                                    else {
                                                        r4 = nhe.R1();
                                                    }
                                                }
                                                nhe.d();
                                                e.put(r5, new jjb(r4, r5, r6));
                                            }
                                            nhe.c();
                                        }
                                    }
                                    nhe.d();
                                    n4 = l;
                                    list4 = f;
                                    break Label_0824;
                                }
                                case 7: {
                                    final ArrayList list5 = f;
                                    final float n8 = l;
                                    nhe.a();
                                    ecg = h;
                                    n2 = c;
                                    while (nhe.hasNext()) {
                                        final ArrayList<wue> list6 = new ArrayList<wue>();
                                        final ecg ecg2 = new ecg();
                                        nhe.b();
                                        final String s = null;
                                        String r7 = null;
                                        int p3 = 0;
                                        int p4 = 0;
                                        final u0r u0r3 = g;
                                        String r8 = s;
                                        while (nhe.hasNext()) {
                                            final int f5 = nhe.f(hdg.b);
                                            if (f5 != 0) {
                                                if (f5 != 1) {
                                                    if (f5 != 2) {
                                                        if (f5 != 3) {
                                                            if (f5 != 4) {
                                                                if (f5 != 5) {
                                                                    nhe.h();
                                                                    nhe.g0();
                                                                }
                                                                else {
                                                                    nhe.R1();
                                                                }
                                                            }
                                                            else {
                                                                r7 = nhe.R1();
                                                            }
                                                        }
                                                        else {
                                                            p4 = nhe.P0();
                                                        }
                                                    }
                                                    else {
                                                        p3 = nhe.P0();
                                                    }
                                                }
                                                else {
                                                    nhe.a();
                                                    while (nhe.hasNext()) {
                                                        final wue a3 = yue.a(nhe, adg);
                                                        ecg2.j(a3.d, (Object)a3);
                                                        list6.add(a3);
                                                    }
                                                    nhe.c();
                                                }
                                            }
                                            else {
                                                r8 = nhe.R1();
                                            }
                                        }
                                        nhe.d();
                                        if (r7 != null) {
                                            d.put(r8, new ldg(p3, p4, r8, r7));
                                        }
                                        else {
                                            c2.put(r8, list6);
                                        }
                                        g = u0r3;
                                    }
                                    final u0r u0r4 = g;
                                    nhe.c();
                                    list2 = list5;
                                    n3 = n8;
                                    hashMap = e;
                                    u0r2 = u0r4;
                                    break Label_1630;
                                }
                                case 6: {
                                    final float n9 = c;
                                    final ecg ecg3 = h;
                                    list2 = f;
                                    final u0r u0r5 = g;
                                    n3 = l;
                                    nhe.a();
                                    int n10 = 0;
                                    ecg = ecg3;
                                    while (nhe.hasNext()) {
                                        final wue a4 = yue.a(nhe, adg);
                                        int n11 = n10;
                                        if (a4.e == 3) {
                                            n11 = n10 + 1;
                                        }
                                        i.add(a4);
                                        ecg.j(a4.d, (Object)a4);
                                        if (n11 > 4) {
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("You have ");
                                            sb.append(n11);
                                            sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                                            p9g.b(sb.toString());
                                        }
                                        n10 = n11;
                                    }
                                    nhe.c();
                                    n2 = n9;
                                    hashMap = e;
                                    u0r2 = u0r5;
                                    break Label_1630;
                                }
                                case 5: {
                                    final float n12 = c;
                                    final HashMap hashMap2 = e;
                                    final ArrayList list7 = f;
                                    final u0r u0r6 = g;
                                    final int n13 = p;
                                    final float n14 = k;
                                    final float n15 = l;
                                    final ecg ecg4 = h;
                                    final String[] split = nhe.R1().split("\\.");
                                    final int int1 = Integer.parseInt(split[0]);
                                    final int int2 = Integer.parseInt(split[1]);
                                    final int int3 = Integer.parseInt(split[2]);
                                    boolean b = false;
                                    Label_1436: {
                                        Label_1433: {
                                            if (int1 >= 4) {
                                                if (int1 <= 4) {
                                                    if (int2 < 4) {
                                                        break Label_1433;
                                                    }
                                                    if (int2 <= 4) {
                                                        if (int3 < 0) {
                                                            break Label_1433;
                                                        }
                                                    }
                                                }
                                                b = true;
                                                break Label_1436;
                                            }
                                        }
                                        b = false;
                                    }
                                    ecg = ecg4;
                                    n2 = n12;
                                    k = n14;
                                    list2 = list7;
                                    n3 = n15;
                                    hashMap = hashMap2;
                                    u0r2 = u0r6;
                                    p = n13;
                                    if (!b) {
                                        adg.a("Lottie only supports bodymovin >= 4.4.0");
                                        ecg = ecg4;
                                        n2 = n12;
                                        k = n14;
                                        list2 = list7;
                                        n3 = n15;
                                        hashMap = hashMap2;
                                        u0r2 = u0r6;
                                        p = n13;
                                    }
                                    break Label_1630;
                                }
                                case 4: {
                                    final ArrayList list8 = f;
                                    final u0r u0r7 = g;
                                    ecg = h;
                                    m = (float)nhe.m2();
                                    n16 = l;
                                    n2 = c;
                                    list2 = list8;
                                    hashMap = e;
                                    u0r2 = u0r7;
                                    break Label_1634;
                                }
                                case 3: {
                                    l = (float)nhe.m2() - 0.01f;
                                    break Label_1577;
                                }
                                case 2: {
                                    k = (float)nhe.m2();
                                    break Label_1577;
                                }
                                case 1: {
                                    p = nhe.P0();
                                    continue;
                                }
                                case 0: {
                                    p2 = nhe.P0();
                                    continue;
                                }
                            }
                            list4 = f;
                        }
                        final HashMap hashMap3 = e;
                        n2 = c;
                        u0r2 = g;
                        ecg = h;
                        list2 = list4;
                        n3 = n4;
                        hashMap = hashMap3;
                        break Label_1630;
                    }
                    final u0r u0r8 = g;
                    hashMap = e;
                    final ArrayList list9 = f;
                    ecg = h;
                    n16 = l;
                    n2 = c;
                    list2 = list9;
                    u0r2 = u0r8;
                    break Label_1634;
                    continue;
                }
                n16 = n3;
            }
            final ecg ecg5 = ecg;
            f = list2;
            final HashMap hashMap4 = hashMap;
            g = u0r2;
            c = n2;
            h = ecg5;
            e = hashMap4;
            l = n16;
        }
        adg.j = new Rect(0, 0, (int)(p2 * c), (int)(p * c));
        adg.k = k;
        adg.l = l;
        adg.m = m;
        adg.i = i;
        adg.h = h;
        adg.c = c2;
        adg.d = d;
        adg.g = g;
        adg.e = e;
        adg.f = f;
        return adg;
    }
}
