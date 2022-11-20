import java.io.IOException;
import android.graphics.PointF;
import android.graphics.Path$FillType;
import java.util.List;
import java.util.Collections;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ul6
{
    public static nhe$a a;
    
    static {
        ul6.a = nhe$a.a(new String[] { "ty", "d" });
    }
    
    public static tl6 a(final nhe nhe, final adg adg) throws IOException {
        nhe.b();
        int p2 = 2;
        while (true) {
        Label_1287_Outer:
            while (nhe.hasNext()) {
                final int f = nhe.f(ul6.a);
                if (f != 0) {
                    if (f != 1) {
                        nhe.h();
                        nhe.g0();
                    }
                    else {
                        p2 = nhe.P0();
                    }
                }
                else {
                    final String r1 = nhe.R1();
                    if (r1 == null) {
                        return null;
                    }
                    final int hashCode = r1.hashCode();
                    boolean j1 = false;
                    final int n = 0;
                    int n2 = 0;
                    Label_0442: {
                        switch (hashCode) {
                            case 3710: {
                                if (!r1.equals("tr")) {
                                    break;
                                }
                                n2 = 12;
                                break Label_0442;
                            }
                            case 3705: {
                                if (!r1.equals("tm")) {
                                    break;
                                }
                                n2 = 11;
                                break Label_0442;
                            }
                            case 3681: {
                                if (!r1.equals("st")) {
                                    break;
                                }
                                n2 = 10;
                                break Label_0442;
                            }
                            case 3679: {
                                if (!r1.equals("sr")) {
                                    break;
                                }
                                n2 = 9;
                                break Label_0442;
                            }
                            case 3669: {
                                if (!r1.equals("sh")) {
                                    break;
                                }
                                n2 = 8;
                                break Label_0442;
                            }
                            case 3646: {
                                if (!r1.equals("rp")) {
                                    break;
                                }
                                n2 = 7;
                                break Label_0442;
                            }
                            case 3633: {
                                if (!r1.equals("rc")) {
                                    break;
                                }
                                n2 = 6;
                                break Label_0442;
                            }
                            case 3488: {
                                if (!r1.equals("mm")) {
                                    break;
                                }
                                n2 = 5;
                                break Label_0442;
                            }
                            case 3308: {
                                if (!r1.equals("gs")) {
                                    break;
                                }
                                n2 = 4;
                                break Label_0442;
                            }
                            case 3307: {
                                if (!r1.equals("gr")) {
                                    break;
                                }
                                n2 = 3;
                                break Label_0442;
                            }
                            case 3295: {
                                if (!r1.equals("gf")) {
                                    break;
                                }
                                n2 = 2;
                                break Label_0442;
                            }
                            case 3270: {
                                if (!r1.equals("fl")) {
                                    break;
                                }
                                n2 = 1;
                                break Label_0442;
                            }
                            case 3239: {
                                if (!r1.equals("el")) {
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
                            sb.append(r1);
                            p9g.b(sb.toString());
                            a = null;
                            break;
                        }
                        case 12: {
                            a = t80.a(nhe, adg);
                            break;
                        }
                        case 11: {
                            final nhe$a a2 = xrp.a;
                            String r2 = null;
                            f80 z = null;
                            f80 z2 = null;
                            f80 z3 = null;
                            int n3 = 0;
                            boolean j2 = false;
                            while (nhe.hasNext()) {
                                final int f2 = nhe.f(xrp.a);
                                if (f2 != 0) {
                                    if (f2 != 1) {
                                        if (f2 != 2) {
                                            if (f2 != 3) {
                                                if (f2 != 4) {
                                                    if (f2 != 5) {
                                                        nhe.g0();
                                                    }
                                                    else {
                                                        j2 = nhe.J1();
                                                    }
                                                }
                                                else {
                                                    final int p3 = nhe.P0();
                                                    if (p3 != 1) {
                                                        if (p3 != 2) {
                                                            throw new IllegalArgumentException(udu.z("Unknown trim path type ", p3));
                                                        }
                                                        n3 = 2;
                                                    }
                                                    else {
                                                        n3 = 1;
                                                    }
                                                }
                                            }
                                            else {
                                                r2 = nhe.R1();
                                            }
                                        }
                                        else {
                                            z3 = g97.z(nhe, adg, false);
                                        }
                                    }
                                    else {
                                        z2 = g97.z(nhe, adg, false);
                                    }
                                }
                                else {
                                    z = g97.z(nhe, adg, false);
                                }
                            }
                            a = new wrp(r2, n3, z, z2, z3, j2);
                            break;
                        }
                        case 10: {
                            final nhe$a a3 = vrp.a;
                            final ArrayList<f80> list = new ArrayList<f80>();
                            h80 a4 = null;
                            String r3 = null;
                            f80 f3 = null;
                            e80 y = null;
                            f80 z4 = null;
                            int n4 = 0;
                            int n5 = 0;
                            float n6 = 0.0f;
                            boolean j3 = false;
                            while (nhe.hasNext()) {
                                switch (nhe.f(vrp.a)) {
                                    default: {
                                        nhe.g0();
                                        continue;
                                    }
                                    case 8: {
                                        nhe.a();
                                        f80 f4 = f3;
                                        while (nhe.hasNext()) {
                                            nhe.b();
                                            f80 z5 = null;
                                            String r4 = null;
                                            while (nhe.hasNext()) {
                                                final int f5 = nhe.f(vrp.b);
                                                if (f5 != 0) {
                                                    if (f5 != 1) {
                                                        nhe.h();
                                                        nhe.g0();
                                                    }
                                                    else {
                                                        z5 = g97.z(nhe, adg, true);
                                                    }
                                                }
                                                else {
                                                    r4 = nhe.R1();
                                                }
                                            }
                                            nhe.d();
                                            Objects.requireNonNull(r4);
                                            final int hashCode2 = r4.hashCode();
                                            int n7 = 0;
                                            Label_1025: {
                                                if (hashCode2 != 100) {
                                                    if (hashCode2 != 103) {
                                                        if (hashCode2 == 111) {
                                                            if (r4.equals("o")) {
                                                                n7 = 2;
                                                                break Label_1025;
                                                            }
                                                        }
                                                    }
                                                    else if (r4.equals("g")) {
                                                        n7 = 1;
                                                        break Label_1025;
                                                    }
                                                }
                                                else if (r4.equals("d")) {
                                                    n7 = 0;
                                                    break Label_1025;
                                                }
                                                n7 = -1;
                                            }
                                            if (n7 != 0 && n7 != 1) {
                                                if (n7 != 2) {
                                                    continue;
                                                }
                                                f4 = z5;
                                            }
                                            else {
                                                adg.n = true;
                                                list.add(z5);
                                            }
                                        }
                                        nhe.c();
                                        f3 = f4;
                                        if (list.size() == 1) {
                                            list.add(list.get(0));
                                            f3 = f4;
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 7: {
                                        j3 = nhe.J1();
                                        continue;
                                    }
                                    case 6: {
                                        n6 = (float)nhe.m2();
                                        continue;
                                    }
                                    case 5: {
                                        n5 = ib0.I(3)[nhe.P0() - 1];
                                        continue;
                                    }
                                    case 4: {
                                        n4 = ib0.I(3)[nhe.P0() - 1];
                                        continue;
                                    }
                                    case 3: {
                                        a4 = g97.A(nhe, adg);
                                        continue;
                                    }
                                    case 2: {
                                        z4 = g97.z(nhe, adg, true);
                                        continue;
                                    }
                                    case 1: {
                                        y = g97.y(nhe, adg);
                                        continue;
                                    }
                                    case 0: {
                                        r3 = nhe.R1();
                                        continue;
                                    }
                                }
                            }
                            if (a4 == null) {
                                a4 = new h80((List)Collections.singletonList(new dre(100)));
                            }
                            a = new urp(r3, f3, (List)list, y, a4, z4, n4, n5, n6, j3);
                            break;
                        }
                        case 9: {
                            final nhe$a a5 = nqk.a;
                            String r5 = null;
                            f80 z6 = null;
                            u80 b = null;
                            f80 z7 = null;
                            f80 z8 = null;
                            f80 z9 = null;
                            f80 z10 = null;
                            f80 z11 = null;
                            int n8 = 0;
                            boolean j4 = false;
                        Label_1287:
                            while (true) {
                                while (nhe.hasNext()) {
                                    switch (nhe.f(nqk.a)) {
                                        default: {
                                            nhe.h();
                                            nhe.g0();
                                            continue Label_1287_Outer;
                                        }
                                        case 9: {
                                            j4 = nhe.J1();
                                            continue Label_1287_Outer;
                                        }
                                        case 8: {
                                            z10 = g97.z(nhe, adg, false);
                                            continue Label_1287_Outer;
                                        }
                                        case 7: {
                                            z8 = g97.z(nhe, adg, true);
                                            continue Label_1287_Outer;
                                        }
                                        case 6: {
                                            z11 = g97.z(nhe, adg, false);
                                            continue Label_1287_Outer;
                                        }
                                        case 5: {
                                            z9 = g97.z(nhe, adg, true);
                                            continue Label_1287_Outer;
                                        }
                                        case 4: {
                                            z7 = g97.z(nhe, adg, false);
                                            continue Label_1287_Outer;
                                        }
                                        case 3: {
                                            b = k80.b(nhe, adg);
                                            continue Label_1287_Outer;
                                        }
                                        case 2: {
                                            z6 = g97.z(nhe, adg, false);
                                            continue Label_1287_Outer;
                                        }
                                        case 1: {
                                            final int p4 = nhe.P0();
                                            for (final int n9 : ib0.I(2)) {
                                                if (toe.f(n9) == p4) {
                                                    n8 = n9;
                                                    continue Label_1287;
                                                }
                                            }
                                            n8 = 0;
                                            continue Label_1287_Outer;
                                        }
                                        case 0: {
                                            r5 = nhe.R1();
                                            continue Label_1287_Outer;
                                        }
                                    }
                                }
                                break;
                            }
                            a = new mqk(r5, n8, z6, b, z7, z8, z9, z10, z11, j4);
                            break;
                        }
                        case 8: {
                            final nhe$a a6 = trp.a;
                            n80 n10 = null;
                            int p5 = 0;
                            String r6 = null;
                            boolean j5 = false;
                            while (nhe.hasNext()) {
                                final int f6 = nhe.f(trp.a);
                                if (f6 != 0) {
                                    if (f6 != 1) {
                                        if (f6 != 2) {
                                            if (f6 != 3) {
                                                nhe.g0();
                                            }
                                            else {
                                                j5 = nhe.J1();
                                            }
                                        }
                                        else {
                                            n10 = new n80(gre.a(nhe, adg, hnw.c(), (vow)krp.D0, false));
                                        }
                                    }
                                    else {
                                        p5 = nhe.P0();
                                    }
                                }
                                else {
                                    r6 = nhe.R1();
                                }
                            }
                            a = new srp(r6, p5, n10, j5);
                            break;
                        }
                        case 7: {
                            final nhe$a a7 = kgm.a;
                            String r7 = null;
                            f80 z12 = null;
                            f80 z13 = null;
                            s80 a8 = null;
                            boolean j6 = false;
                            while (nhe.hasNext()) {
                                final int f7 = nhe.f(kgm.a);
                                if (f7 != 0) {
                                    if (f7 != 1) {
                                        if (f7 != 2) {
                                            if (f7 != 3) {
                                                if (f7 != 4) {
                                                    nhe.g0();
                                                }
                                                else {
                                                    j6 = nhe.J1();
                                                }
                                            }
                                            else {
                                                a8 = t80.a(nhe, adg);
                                            }
                                        }
                                        else {
                                            z13 = g97.z(nhe, adg, false);
                                        }
                                    }
                                    else {
                                        z12 = g97.z(nhe, adg, false);
                                    }
                                }
                                else {
                                    r7 = nhe.R1();
                                }
                            }
                            a = new igm(r7, z12, z13, a8, j6);
                            break;
                        }
                        case 6: {
                            final nhe$a a9 = l6m.a;
                            String r8 = null;
                            u80 b2 = null;
                            Object b3 = null;
                            f80 z14 = null;
                            boolean j7 = false;
                            while (nhe.hasNext()) {
                                final int f8 = nhe.f(l6m.a);
                                if (f8 != 0) {
                                    if (f8 != 1) {
                                        if (f8 != 2) {
                                            if (f8 != 3) {
                                                if (f8 != 4) {
                                                    nhe.g0();
                                                }
                                                else {
                                                    j7 = nhe.J1();
                                                }
                                            }
                                            else {
                                                z14 = g97.z(nhe, adg, true);
                                            }
                                        }
                                        else {
                                            b3 = g97.B(nhe, adg);
                                        }
                                    }
                                    else {
                                        b2 = k80.b(nhe, adg);
                                    }
                                }
                                else {
                                    r8 = nhe.R1();
                                }
                            }
                            a = new j6m(r8, b2, (u80)b3, z14, j7);
                            break;
                        }
                        case 5: {
                            final nhe$a a10 = q5h.a;
                            boolean j8 = false;
                            String r9 = null;
                            int n11 = n;
                            while (nhe.hasNext()) {
                                final int f9 = nhe.f(q5h.a);
                                if (f9 != 0) {
                                    if (f9 != 1) {
                                        if (f9 != 2) {
                                            nhe.h();
                                            nhe.g0();
                                        }
                                        else {
                                            j8 = nhe.J1();
                                        }
                                    }
                                    else {
                                        final int p6 = nhe.P0();
                                        if (p6 != 1) {
                                            if (p6 == 2) {
                                                n11 = 2;
                                                continue;
                                            }
                                            if (p6 == 3) {
                                                n11 = 3;
                                                continue;
                                            }
                                            if (p6 == 4) {
                                                n11 = 4;
                                                continue;
                                            }
                                            if (p6 == 5) {
                                                n11 = 5;
                                                continue;
                                            }
                                        }
                                        n11 = 1;
                                    }
                                }
                                else {
                                    r9 = nhe.R1();
                                }
                            }
                            final o5h o5h = new o5h(r9, n11, j8);
                            adg.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                            a = o5h;
                            break;
                        }
                        case 4: {
                            final nhe$a a11 = z5c.a;
                            final ArrayList<f80> list2 = new ArrayList<f80>();
                            h80 a12 = null;
                            g80 g80 = null;
                            l80 b4 = null;
                            f80 z15 = null;
                            f80 f10 = null;
                            int n12 = 0;
                            int n13 = 0;
                            int n14 = 0;
                            float n15 = 0.0f;
                            boolean j9 = false;
                            String r10 = null;
                            l80 b5 = null;
                            while (nhe.hasNext()) {
                                switch (nhe.f(z5c.a)) {
                                    default: {
                                        nhe.h();
                                        nhe.g0();
                                        continue;
                                    }
                                    case 11: {
                                        nhe.a();
                                        f80 f11 = f10;
                                        while (nhe.hasNext()) {
                                            nhe.b();
                                            f80 z16 = null;
                                            String r11 = null;
                                            while (nhe.hasNext()) {
                                                final int f12 = nhe.f(z5c.c);
                                                if (f12 != 0) {
                                                    if (f12 != 1) {
                                                        nhe.h();
                                                        nhe.g0();
                                                    }
                                                    else {
                                                        z16 = g97.z(nhe, adg, true);
                                                    }
                                                }
                                                else {
                                                    r11 = nhe.R1();
                                                }
                                            }
                                            nhe.d();
                                            if (r11.equals("o")) {
                                                f11 = z16;
                                            }
                                            else {
                                                if (!r11.equals("d") && !r11.equals("g")) {
                                                    continue;
                                                }
                                                adg.n = true;
                                                list2.add(z16);
                                            }
                                        }
                                        nhe.c();
                                        f10 = f11;
                                        if (list2.size() == 1) {
                                            list2.add(list2.get(0));
                                            f10 = f11;
                                            continue;
                                        }
                                        continue;
                                    }
                                    case 10: {
                                        j9 = nhe.J1();
                                        continue;
                                    }
                                    case 9: {
                                        n15 = (float)nhe.m2();
                                        continue;
                                    }
                                    case 8: {
                                        n14 = ib0.I(3)[nhe.P0() - 1];
                                        continue;
                                    }
                                    case 7: {
                                        n13 = ib0.I(3)[nhe.P0() - 1];
                                        continue;
                                    }
                                    case 6: {
                                        z15 = g97.z(nhe, adg, true);
                                        continue;
                                    }
                                    case 5: {
                                        b4 = g97.B(nhe, adg);
                                        continue;
                                    }
                                    case 4: {
                                        b5 = g97.B(nhe, adg);
                                        continue;
                                    }
                                    case 3: {
                                        if (nhe.P0() == 1) {
                                            n12 = 1;
                                            continue;
                                        }
                                        n12 = 2;
                                        continue;
                                    }
                                    case 2: {
                                        a12 = g97.A(nhe, adg);
                                        continue;
                                    }
                                    case 1: {
                                        nhe.b();
                                        int p7 = -1;
                                        while (nhe.hasNext()) {
                                            final int f13 = nhe.f(z5c.b);
                                            if (f13 != 0) {
                                                if (f13 != 1) {
                                                    nhe.h();
                                                    nhe.g0();
                                                }
                                                else {
                                                    g80 = new g80(g97.x(nhe, adg, (vow)new t5c(p7)));
                                                }
                                            }
                                            else {
                                                p7 = nhe.P0();
                                            }
                                        }
                                        nhe.d();
                                        continue;
                                    }
                                    case 0: {
                                        r10 = nhe.R1();
                                        continue;
                                    }
                                }
                            }
                            if (a12 == null) {
                                a12 = new h80((List)Collections.singletonList(new dre(100)));
                            }
                            a = new x5c(r10, n12, g80, a12, b5, b4, z15, n13, n14, n15, (List)list2, f10, j9);
                            break;
                        }
                        case 3: {
                            final nhe$a a13 = orp.a;
                            final ArrayList<tl6> list3 = new ArrayList<tl6>();
                            String r12 = null;
                            while (nhe.hasNext()) {
                                final int f14 = nhe.f(orp.a);
                                if (f14 != 0) {
                                    if (f14 != 1) {
                                        if (f14 != 2) {
                                            nhe.g0();
                                        }
                                        else {
                                            nhe.a();
                                            while (nhe.hasNext()) {
                                                final tl6 a14 = a(nhe, adg);
                                                if (a14 != null) {
                                                    list3.add(a14);
                                                }
                                            }
                                            nhe.c();
                                        }
                                    }
                                    else {
                                        j1 = nhe.J1();
                                    }
                                }
                                else {
                                    r12 = nhe.R1();
                                }
                            }
                            a = new nrp(r12, (List)list3, j1);
                            break;
                        }
                        case 2: {
                            final nhe$a a15 = w5c.a;
                            Path$FillType path$FillType = Path$FillType.WINDING;
                            h80 a16 = null;
                            String r13 = null;
                            g80 g81 = null;
                            l80 b6 = null;
                            l80 b7 = null;
                            int n16 = 0;
                            boolean j10 = false;
                            while (nhe.hasNext()) {
                                switch (nhe.f(w5c.a)) {
                                    default: {
                                        nhe.h();
                                        nhe.g0();
                                        continue;
                                    }
                                    case 7: {
                                        j10 = nhe.J1();
                                        continue;
                                    }
                                    case 6: {
                                        if (nhe.P0() == 1) {
                                            path$FillType = Path$FillType.WINDING;
                                        }
                                        else {
                                            path$FillType = Path$FillType.EVEN_ODD;
                                        }
                                        continue;
                                    }
                                    case 5: {
                                        b7 = g97.B(nhe, adg);
                                        continue;
                                    }
                                    case 4: {
                                        b6 = g97.B(nhe, adg);
                                        continue;
                                    }
                                    case 3: {
                                        if (nhe.P0() == 1) {
                                            n16 = 1;
                                            continue;
                                        }
                                        n16 = 2;
                                        continue;
                                    }
                                    case 2: {
                                        a16 = g97.A(nhe, adg);
                                        continue;
                                    }
                                    case 1: {
                                        nhe.b();
                                        int p8 = -1;
                                        while (nhe.hasNext()) {
                                            final int f15 = nhe.f(w5c.b);
                                            if (f15 != 0) {
                                                if (f15 != 1) {
                                                    nhe.h();
                                                    nhe.g0();
                                                }
                                                else {
                                                    g81 = new g80(g97.x(nhe, adg, (vow)new t5c(p8)));
                                                }
                                            }
                                            else {
                                                p8 = nhe.P0();
                                            }
                                        }
                                        nhe.d();
                                        continue;
                                    }
                                    case 0: {
                                        r13 = nhe.R1();
                                        continue;
                                    }
                                }
                            }
                            if (a16 == null) {
                                a16 = new h80((List)Collections.singletonList(new dre(100)));
                            }
                            a = new u5c(r13, n16, path$FillType, g81, a16, b6, b7, j10);
                            break;
                        }
                        case 1: {
                            final nhe$a a17 = mrp.a;
                            int p9 = 1;
                            h80 a18 = null;
                            String r14 = null;
                            e80 y2 = null;
                            boolean j11 = false;
                            boolean j12 = false;
                            while (nhe.hasNext()) {
                                final int f16 = nhe.f(mrp.a);
                                if (f16 != 0) {
                                    if (f16 != 1) {
                                        if (f16 != 2) {
                                            if (f16 != 3) {
                                                if (f16 != 4) {
                                                    if (f16 != 5) {
                                                        nhe.h();
                                                        nhe.g0();
                                                    }
                                                    else {
                                                        j12 = nhe.J1();
                                                    }
                                                }
                                                else {
                                                    p9 = nhe.P0();
                                                }
                                            }
                                            else {
                                                j11 = nhe.J1();
                                            }
                                        }
                                        else {
                                            a18 = g97.A(nhe, adg);
                                        }
                                    }
                                    else {
                                        y2 = g97.y(nhe, adg);
                                    }
                                }
                                else {
                                    r14 = nhe.R1();
                                }
                            }
                            h80 h80;
                            if ((h80 = a18) == null) {
                                h80 = new h80((List)Collections.singletonList(new dre(100)));
                            }
                            Path$FillType path$FillType2;
                            if (p9 == 1) {
                                path$FillType2 = Path$FillType.WINDING;
                            }
                            else {
                                path$FillType2 = Path$FillType.EVEN_ODD;
                            }
                            a = new lrp(r14, j11, path$FillType2, y2, h80, j12);
                            break;
                        }
                        case 0: {
                            final nhe$a a19 = t94.a;
                            boolean b8 = p2 == 3;
                            String r15 = null;
                            u80<PointF, PointF> b9 = null;
                            l80 b10 = null;
                            boolean j13 = false;
                            while (nhe.hasNext()) {
                                final int f17 = nhe.f(t94.a);
                                if (f17 != 0) {
                                    if (f17 != 1) {
                                        if (f17 != 2) {
                                            if (f17 != 3) {
                                                if (f17 != 4) {
                                                    nhe.h();
                                                    nhe.g0();
                                                }
                                                else {
                                                    b8 = (nhe.P0() == 3);
                                                }
                                            }
                                            else {
                                                j13 = nhe.J1();
                                            }
                                        }
                                        else {
                                            b10 = g97.B(nhe, adg);
                                        }
                                    }
                                    else {
                                        b9 = k80.b(nhe, adg);
                                    }
                                }
                                else {
                                    r15 = nhe.R1();
                                }
                            }
                            a = new s94(r15, b9, b10, b8, j13);
                            break;
                        }
                    }
                    while (nhe.hasNext()) {
                        nhe.g0();
                    }
                    nhe.d();
                    return (tl6)a;
                }
            }
            final String r1 = null;
            continue;
        }
    }
}
