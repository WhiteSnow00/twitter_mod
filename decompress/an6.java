import java.io.IOException;
import android.graphics.Path$FillType;
import java.util.List;
import java.util.Collections;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class an6
{
    public static jie.a a;
    
    static {
        an6.a = jie.a.a("ty", "d");
    }
    
    public static zm6 a(final jie jie, final udg udg) throws IOException {
        jie.b();
        int q0 = 2;
        while (true) {
        Label_1288_Outer:
            while (jie.hasNext()) {
                final int f = jie.f(an6.a);
                if (f != 0) {
                    if (f != 1) {
                        jie.h();
                        jie.h0();
                    }
                    else {
                        q0 = jie.Q0();
                    }
                }
                else {
                    final String s1 = jie.S1();
                    if (s1 == null) {
                        return null;
                    }
                    final int hashCode = s1.hashCode();
                    boolean k1 = false;
                    final int n = 0;
                    int n2 = 0;
                    Label_0442: {
                        switch (hashCode) {
                            case 3710: {
                                if (!s1.equals("tr")) {
                                    break;
                                }
                                n2 = 12;
                                break Label_0442;
                            }
                            case 3705: {
                                if (!s1.equals("tm")) {
                                    break;
                                }
                                n2 = 11;
                                break Label_0442;
                            }
                            case 3681: {
                                if (!s1.equals("st")) {
                                    break;
                                }
                                n2 = 10;
                                break Label_0442;
                            }
                            case 3679: {
                                if (!s1.equals("sr")) {
                                    break;
                                }
                                n2 = 9;
                                break Label_0442;
                            }
                            case 3669: {
                                if (!s1.equals("sh")) {
                                    break;
                                }
                                n2 = 8;
                                break Label_0442;
                            }
                            case 3646: {
                                if (!s1.equals("rp")) {
                                    break;
                                }
                                n2 = 7;
                                break Label_0442;
                            }
                            case 3633: {
                                if (!s1.equals("rc")) {
                                    break;
                                }
                                n2 = 6;
                                break Label_0442;
                            }
                            case 3488: {
                                if (!s1.equals("mm")) {
                                    break;
                                }
                                n2 = 5;
                                break Label_0442;
                            }
                            case 3308: {
                                if (!s1.equals("gs")) {
                                    break;
                                }
                                n2 = 4;
                                break Label_0442;
                            }
                            case 3307: {
                                if (!s1.equals("gr")) {
                                    break;
                                }
                                n2 = 3;
                                break Label_0442;
                            }
                            case 3295: {
                                if (!s1.equals("gf")) {
                                    break;
                                }
                                n2 = 2;
                                break Label_0442;
                            }
                            case 3270: {
                                if (!s1.equals("fl")) {
                                    break;
                                }
                                n2 = 1;
                                break Label_0442;
                            }
                            case 3239: {
                                if (!s1.equals("el")) {
                                    break;
                                }
                                n2 = 0;
                                break Label_0442;
                            }
                        }
                        n2 = -1;
                    }
                    Object a = null;
                    switch (n2) {
                        default: {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unknown shape type ");
                            sb.append(s1);
                            kag.b(sb.toString());
                            a = null;
                            break;
                        }
                        case 12: {
                            a = t80.a(jie, udg);
                            break;
                        }
                        case 11: {
                            final jie.a a2 = ssp.a;
                            String s2 = null;
                            f80 n3 = null;
                            f80 n4 = null;
                            f80 n5 = null;
                            int n6 = 0;
                            boolean k2 = false;
                            while (jie.hasNext()) {
                                final int f2 = jie.f(ssp.a);
                                if (f2 != 0) {
                                    if (f2 != 1) {
                                        if (f2 != 2) {
                                            if (f2 != 3) {
                                                if (f2 != 4) {
                                                    if (f2 != 5) {
                                                        jie.h0();
                                                    }
                                                    else {
                                                        k2 = jie.K1();
                                                    }
                                                }
                                                else {
                                                    final int q2 = jie.Q0();
                                                    if (q2 != 1) {
                                                        if (q2 != 2) {
                                                            throw new IllegalArgumentException(rk0.B("Unknown trim path type ", q2));
                                                        }
                                                        n6 = 2;
                                                    }
                                                    else {
                                                        n6 = 1;
                                                    }
                                                }
                                            }
                                            else {
                                                s2 = jie.S1();
                                            }
                                        }
                                        else {
                                            n5 = lai.n(jie, udg, false);
                                        }
                                    }
                                    else {
                                        n4 = lai.n(jie, udg, false);
                                    }
                                }
                                else {
                                    n3 = lai.n(jie, udg, false);
                                }
                            }
                            a = new rsp(s2, n6, n3, n4, n5, k2);
                            break;
                        }
                        case 10: {
                            final jie.a a3 = qsp.a;
                            final ArrayList<f80> list = new ArrayList<f80>();
                            h80 o = null;
                            String s3 = null;
                            f80 f3 = null;
                            e80 m = null;
                            f80 n7 = null;
                            int n8 = 0;
                            int n9 = 0;
                            float n10 = 0.0f;
                            boolean k3 = false;
                            while (jie.hasNext()) {
                                switch (jie.f(qsp.a)) {
                                    default: {
                                        jie.h0();
                                        continue;
                                    }
                                    case 8: {
                                        jie.a();
                                        f80 f4 = f3;
                                        while (jie.hasNext()) {
                                            jie.b();
                                            f80 n11 = null;
                                            String s4 = null;
                                            while (jie.hasNext()) {
                                                final int f5 = jie.f(qsp.b);
                                                if (f5 != 0) {
                                                    if (f5 != 1) {
                                                        jie.h();
                                                        jie.h0();
                                                    }
                                                    else {
                                                        n11 = lai.n(jie, udg, true);
                                                    }
                                                }
                                                else {
                                                    s4 = jie.S1();
                                                }
                                            }
                                            jie.d();
                                            Objects.requireNonNull(s4);
                                            final int hashCode2 = s4.hashCode();
                                            int n12 = 0;
                                            Label_1025: {
                                                if (hashCode2 != 100) {
                                                    if (hashCode2 != 103) {
                                                        if (hashCode2 == 111) {
                                                            if (s4.equals("o")) {
                                                                n12 = 2;
                                                                break Label_1025;
                                                            }
                                                        }
                                                    }
                                                    else if (s4.equals("g")) {
                                                        n12 = 1;
                                                        break Label_1025;
                                                    }
                                                }
                                                else if (s4.equals("d")) {
                                                    n12 = 0;
                                                    break Label_1025;
                                                }
                                                n12 = -1;
                                            }
                                            if (n12 != 0 && n12 != 1) {
                                                if (n12 != 2) {
                                                    continue;
                                                }
                                                f4 = n11;
                                            }
                                            else {
                                                udg.n = true;
                                                list.add(n11);
                                            }
                                        }
                                        jie.c();
                                        f3 = f4;
                                        if (list.size() == 1) {
                                            list.add(list.get(0));
                                            f3 = f4;
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 7: {
                                        k3 = jie.K1();
                                        continue;
                                    }
                                    case 6: {
                                        n10 = (float)jie.n2();
                                        continue;
                                    }
                                    case 5: {
                                        n9 = lb0.I(3)[jie.Q0() - 1];
                                        continue;
                                    }
                                    case 4: {
                                        n8 = lb0.I(3)[jie.Q0() - 1];
                                        continue;
                                    }
                                    case 3: {
                                        o = lai.o(jie, udg);
                                        continue;
                                    }
                                    case 2: {
                                        n7 = lai.n(jie, udg, true);
                                        continue;
                                    }
                                    case 1: {
                                        m = lai.m(jie, udg);
                                        continue;
                                    }
                                    case 0: {
                                        s3 = jie.S1();
                                        continue;
                                    }
                                }
                            }
                            h80 h80;
                            if (o == null) {
                                h80 = new h80((List)Collections.singletonList(new zre(100)));
                            }
                            else {
                                h80 = o;
                            }
                            a = new psp(s3, f3, (List)list, m, h80, n7, n8, n9, n10, k3);
                            break;
                        }
                        case 9: {
                            final jie.a a4 = zqk.a;
                            String s5 = null;
                            f80 n13 = null;
                            u80 b = null;
                            f80 n14 = null;
                            f80 n15 = null;
                            f80 n16 = null;
                            f80 n17 = null;
                            f80 n18 = null;
                            int n19 = 0;
                            boolean k4 = false;
                        Label_1288:
                            while (true) {
                                while (jie.hasNext()) {
                                    switch (jie.f(zqk.a)) {
                                        default: {
                                            jie.h();
                                            jie.h0();
                                            continue Label_1288_Outer;
                                        }
                                        case 9: {
                                            k4 = jie.K1();
                                            continue Label_1288_Outer;
                                        }
                                        case 8: {
                                            n17 = lai.n(jie, udg, false);
                                            continue Label_1288_Outer;
                                        }
                                        case 7: {
                                            n15 = lai.n(jie, udg, true);
                                            continue Label_1288_Outer;
                                        }
                                        case 6: {
                                            n18 = lai.n(jie, udg, false);
                                            continue Label_1288_Outer;
                                        }
                                        case 5: {
                                            n16 = lai.n(jie, udg, true);
                                            continue Label_1288_Outer;
                                        }
                                        case 4: {
                                            n14 = lai.n(jie, udg, false);
                                            continue Label_1288_Outer;
                                        }
                                        case 3: {
                                            b = k80.b(jie, udg);
                                            continue Label_1288_Outer;
                                        }
                                        case 2: {
                                            n13 = lai.n(jie, udg, false);
                                            continue Label_1288_Outer;
                                        }
                                        case 1: {
                                            final int q3 = jie.Q0();
                                            for (final int n20 : lb0.I(2)) {
                                                if (xnf.f(n20) == q3) {
                                                    n19 = n20;
                                                    continue Label_1288;
                                                }
                                            }
                                            n19 = 0;
                                            continue Label_1288_Outer;
                                        }
                                        case 0: {
                                            s5 = jie.S1();
                                            continue Label_1288_Outer;
                                        }
                                    }
                                }
                                break;
                            }
                            a = new yqk(s5, n19, n13, b, n14, n15, n16, n17, n18, k4);
                            break;
                        }
                        case 8: {
                            final jie.a a5 = osp.a;
                            n80 n21 = null;
                            int q4 = 0;
                            String s6 = null;
                            boolean k5 = false;
                            while (jie.hasNext()) {
                                final int f6 = jie.f(osp.a);
                                if (f6 != 0) {
                                    if (f6 != 1) {
                                        if (f6 != 2) {
                                            if (f6 != 3) {
                                                jie.h0();
                                            }
                                            else {
                                                k5 = jie.K1();
                                            }
                                        }
                                        else {
                                            n21 = new n80(cse.a(jie, udg, wnw.c(), (kpw)fsp.F0, false));
                                        }
                                    }
                                    else {
                                        q4 = jie.Q0();
                                    }
                                }
                                else {
                                    s6 = jie.S1();
                                }
                            }
                            a = new nsp(s6, q4, n21, k5);
                            break;
                        }
                        case 7: {
                            final jie.a a6 = zgm.a;
                            String s7 = null;
                            f80 n22 = null;
                            f80 n23 = null;
                            s80 a7 = null;
                            boolean k6 = false;
                            while (jie.hasNext()) {
                                final int f7 = jie.f(zgm.a);
                                if (f7 != 0) {
                                    if (f7 != 1) {
                                        if (f7 != 2) {
                                            if (f7 != 3) {
                                                if (f7 != 4) {
                                                    jie.h0();
                                                }
                                                else {
                                                    k6 = jie.K1();
                                                }
                                            }
                                            else {
                                                a7 = t80.a(jie, udg);
                                            }
                                        }
                                        else {
                                            n23 = lai.n(jie, udg, false);
                                        }
                                    }
                                    else {
                                        n22 = lai.n(jie, udg, false);
                                    }
                                }
                                else {
                                    s7 = jie.S1();
                                }
                            }
                            a = new xgm(s7, n22, n23, a7, k6);
                            break;
                        }
                        case 6: {
                            final jie.a a8 = y6m.a;
                            String s8 = null;
                            u80 b2 = null;
                            Object p2 = null;
                            f80 n24 = null;
                            boolean k7 = false;
                            while (jie.hasNext()) {
                                final int f8 = jie.f(y6m.a);
                                if (f8 != 0) {
                                    if (f8 != 1) {
                                        if (f8 != 2) {
                                            if (f8 != 3) {
                                                if (f8 != 4) {
                                                    jie.h0();
                                                }
                                                else {
                                                    k7 = jie.K1();
                                                }
                                            }
                                            else {
                                                n24 = lai.n(jie, udg, true);
                                            }
                                        }
                                        else {
                                            p2 = lai.p(jie, udg);
                                        }
                                    }
                                    else {
                                        b2 = k80.b(jie, udg);
                                    }
                                }
                                else {
                                    s8 = jie.S1();
                                }
                            }
                            a = new w6m(s8, b2, (u80)p2, n24, k7);
                            break;
                        }
                        case 5: {
                            final jie.a a9 = h6h.a;
                            boolean k8 = false;
                            String s9 = null;
                            int n25 = n;
                            while (jie.hasNext()) {
                                final int f9 = jie.f(h6h.a);
                                if (f9 != 0) {
                                    if (f9 != 1) {
                                        if (f9 != 2) {
                                            jie.h();
                                            jie.h0();
                                        }
                                        else {
                                            k8 = jie.K1();
                                        }
                                    }
                                    else {
                                        final int q5 = jie.Q0();
                                        if (q5 != 1) {
                                            if (q5 == 2) {
                                                n25 = 2;
                                                continue;
                                            }
                                            if (q5 == 3) {
                                                n25 = 3;
                                                continue;
                                            }
                                            if (q5 == 4) {
                                                n25 = 4;
                                                continue;
                                            }
                                            if (q5 == 5) {
                                                n25 = 5;
                                                continue;
                                            }
                                        }
                                        n25 = 1;
                                    }
                                }
                                else {
                                    s9 = jie.S1();
                                }
                            }
                            final f6h f6h = new f6h(s9, n25, k8);
                            udg.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                            a = f6h;
                            break;
                        }
                        case 4: {
                            final jie.a a10 = b7c.a;
                            final ArrayList<f80> list2 = new ArrayList<f80>();
                            h80 o2 = null;
                            g80 g80 = null;
                            l80 p3 = null;
                            f80 n26 = null;
                            f80 f10 = null;
                            int n27 = 0;
                            int n28 = 0;
                            int n29 = 0;
                            float n30 = 0.0f;
                            boolean k9 = false;
                            String s10 = null;
                            l80 p4 = null;
                            while (jie.hasNext()) {
                                switch (jie.f(b7c.a)) {
                                    default: {
                                        jie.h();
                                        jie.h0();
                                        continue;
                                    }
                                    case 11: {
                                        jie.a();
                                        f80 f11 = f10;
                                        while (jie.hasNext()) {
                                            jie.b();
                                            f80 n31 = null;
                                            String s11 = null;
                                            while (jie.hasNext()) {
                                                final int f12 = jie.f(b7c.c);
                                                if (f12 != 0) {
                                                    if (f12 != 1) {
                                                        jie.h();
                                                        jie.h0();
                                                    }
                                                    else {
                                                        n31 = lai.n(jie, udg, true);
                                                    }
                                                }
                                                else {
                                                    s11 = jie.S1();
                                                }
                                            }
                                            jie.d();
                                            if (s11.equals("o")) {
                                                f11 = n31;
                                            }
                                            else {
                                                if (!s11.equals("d") && !s11.equals("g")) {
                                                    continue;
                                                }
                                                udg.n = true;
                                                list2.add(n31);
                                            }
                                        }
                                        jie.c();
                                        f10 = f11;
                                        if (list2.size() == 1) {
                                            list2.add(list2.get(0));
                                            f10 = f11;
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 10: {
                                        k9 = jie.K1();
                                        continue;
                                    }
                                    case 9: {
                                        n30 = (float)jie.n2();
                                        continue;
                                    }
                                    case 8: {
                                        n29 = lb0.I(3)[jie.Q0() - 1];
                                        continue;
                                    }
                                    case 7: {
                                        n28 = lb0.I(3)[jie.Q0() - 1];
                                        continue;
                                    }
                                    case 6: {
                                        n26 = lai.n(jie, udg, true);
                                        continue;
                                    }
                                    case 5: {
                                        p3 = lai.p(jie, udg);
                                        continue;
                                    }
                                    case 4: {
                                        p4 = lai.p(jie, udg);
                                        continue;
                                    }
                                    case 3: {
                                        if (jie.Q0() == 1) {
                                            n27 = 1;
                                            continue;
                                        }
                                        n27 = 2;
                                        continue;
                                    }
                                    case 2: {
                                        o2 = lai.o(jie, udg);
                                        continue;
                                    }
                                    case 1: {
                                        jie.b();
                                        int q6 = -1;
                                        while (jie.hasNext()) {
                                            final int f13 = jie.f(b7c.b);
                                            if (f13 != 0) {
                                                if (f13 != 1) {
                                                    jie.h();
                                                    jie.h0();
                                                }
                                                else {
                                                    g80 = new g80(lai.l(jie, udg, (kpw)new v6c(q6)));
                                                }
                                            }
                                            else {
                                                q6 = jie.Q0();
                                            }
                                        }
                                        jie.d();
                                        continue;
                                    }
                                    case 0: {
                                        s10 = jie.S1();
                                        continue;
                                    }
                                }
                            }
                            if (o2 == null) {
                                o2 = new h80((List)Collections.singletonList(new zre(100)));
                            }
                            a = new z6c(s10, n27, g80, o2, p4, p3, n26, n28, n29, n30, (List)list2, f10, k9);
                            break;
                        }
                        case 3: {
                            final jie.a a11 = jsp.a;
                            final ArrayList<zm6> list3 = new ArrayList<zm6>();
                            String s12 = null;
                            while (jie.hasNext()) {
                                final int f14 = jie.f(jsp.a);
                                if (f14 != 0) {
                                    if (f14 != 1) {
                                        if (f14 != 2) {
                                            jie.h0();
                                        }
                                        else {
                                            jie.a();
                                            while (jie.hasNext()) {
                                                final zm6 a12 = a(jie, udg);
                                                if (a12 != null) {
                                                    list3.add(a12);
                                                }
                                            }
                                            jie.c();
                                        }
                                    }
                                    else {
                                        k1 = jie.K1();
                                    }
                                }
                                else {
                                    s12 = jie.S1();
                                }
                            }
                            a = new isp(s12, (List)list3, k1);
                            break;
                        }
                        case 2: {
                            final jie.a a13 = y6c.a;
                            Path$FillType path$FillType = Path$FillType.WINDING;
                            h80 o3 = null;
                            String s13 = null;
                            g80 g81 = null;
                            l80 p5 = null;
                            l80 p6 = null;
                            int n32 = 0;
                            boolean k10 = false;
                            while (jie.hasNext()) {
                                switch (jie.f(y6c.a)) {
                                    default: {
                                        jie.h();
                                        jie.h0();
                                        continue;
                                    }
                                    case 7: {
                                        k10 = jie.K1();
                                        continue;
                                    }
                                    case 6: {
                                        if (jie.Q0() == 1) {
                                            path$FillType = Path$FillType.WINDING;
                                        }
                                        else {
                                            path$FillType = Path$FillType.EVEN_ODD;
                                        }
                                        continue;
                                    }
                                    case 5: {
                                        p6 = lai.p(jie, udg);
                                        continue;
                                    }
                                    case 4: {
                                        p5 = lai.p(jie, udg);
                                        continue;
                                    }
                                    case 3: {
                                        if (jie.Q0() == 1) {
                                            n32 = 1;
                                            continue;
                                        }
                                        n32 = 2;
                                        continue;
                                    }
                                    case 2: {
                                        o3 = lai.o(jie, udg);
                                        continue;
                                    }
                                    case 1: {
                                        jie.b();
                                        int q7 = -1;
                                        while (jie.hasNext()) {
                                            final int f15 = jie.f(y6c.b);
                                            if (f15 != 0) {
                                                if (f15 != 1) {
                                                    jie.h();
                                                    jie.h0();
                                                }
                                                else {
                                                    g81 = new g80(lai.l(jie, udg, (kpw)new v6c(q7)));
                                                }
                                            }
                                            else {
                                                q7 = jie.Q0();
                                            }
                                        }
                                        jie.d();
                                        continue;
                                    }
                                    case 0: {
                                        s13 = jie.S1();
                                        continue;
                                    }
                                }
                            }
                            if (o3 == null) {
                                o3 = new h80((List)Collections.singletonList(new zre(100)));
                            }
                            a = new w6c(s13, n32, path$FillType, g81, o3, p5, p6, k10);
                            break;
                        }
                        case 1: {
                            final jie.a a14 = hsp.a;
                            int q8 = 1;
                            h80 o4 = null;
                            String s14 = null;
                            e80 l = null;
                            boolean k11 = false;
                            boolean k12 = false;
                            while (jie.hasNext()) {
                                final int f16 = jie.f(hsp.a);
                                if (f16 != 0) {
                                    if (f16 != 1) {
                                        if (f16 != 2) {
                                            if (f16 != 3) {
                                                if (f16 != 4) {
                                                    if (f16 != 5) {
                                                        jie.h();
                                                        jie.h0();
                                                    }
                                                    else {
                                                        k12 = jie.K1();
                                                    }
                                                }
                                                else {
                                                    q8 = jie.Q0();
                                                }
                                            }
                                            else {
                                                k11 = jie.K1();
                                            }
                                        }
                                        else {
                                            o4 = lai.o(jie, udg);
                                        }
                                    }
                                    else {
                                        l = lai.m(jie, udg);
                                    }
                                }
                                else {
                                    s14 = jie.S1();
                                }
                            }
                            h80 h81;
                            if ((h81 = o4) == null) {
                                h81 = new h80((List)Collections.singletonList(new zre(100)));
                            }
                            Path$FillType path$FillType2;
                            if (q8 == 1) {
                                path$FillType2 = Path$FillType.WINDING;
                            }
                            else {
                                path$FillType2 = Path$FillType.EVEN_ODD;
                            }
                            a = new gsp(s14, k11, path$FillType2, l, h81, k12);
                            break;
                        }
                        case 0: {
                            final jie.a a15 = wa4.a;
                            boolean b3 = q0 == 3;
                            String s15 = null;
                            u80 b4 = null;
                            l80 p7 = null;
                            boolean k13 = false;
                            while (jie.hasNext()) {
                                final int f17 = jie.f(wa4.a);
                                if (f17 != 0) {
                                    if (f17 != 1) {
                                        if (f17 != 2) {
                                            if (f17 != 3) {
                                                if (f17 != 4) {
                                                    jie.h();
                                                    jie.h0();
                                                }
                                                else {
                                                    b3 = (jie.Q0() == 3);
                                                }
                                            }
                                            else {
                                                k13 = jie.K1();
                                            }
                                        }
                                        else {
                                            p7 = lai.p(jie, udg);
                                        }
                                    }
                                    else {
                                        b4 = k80.b(jie, udg);
                                    }
                                }
                                else {
                                    s15 = jie.S1();
                                }
                            }
                            a = new va4(s15, b4, p7, b3, k13);
                            break;
                        }
                    }
                    while (jie.hasNext()) {
                        jie.h0();
                    }
                    jie.d();
                    return (zm6)a;
                }
            }
            final String s1 = null;
            continue;
        }
    }
}
