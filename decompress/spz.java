import java.util.Objects;
import java.util.Iterator;
import java.util.RandomAccess;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.util.Arrays;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spz<T> implements nqz<T>
{
    public static final int[] n;
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final kpz e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final unz k;
    public final xrz l;
    public final zjz m;
    
    static {
        n = new int[0];
        o = hsz.k();
    }
    
    public spz(final int[] a, final Object[] b, final int c, final int d, final kpz e, final boolean g, final int[] h, final int i, final int j, final unz k, final xrz l, final zjz m, final cpz cpz) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.f = (m != null && m.c(e));
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.e = e;
    }
    
    public static yrz A(final Object o) {
        final bmz bmz = (bmz)o;
        yrz zzc;
        if ((zzc = bmz.zzc) == yrz.f) {
            zzc = yrz.b();
            bmz.zzc = zzc;
        }
        return zzc;
    }
    
    public static spz B(final fpz fpz, final ypz ypz, final unz unz, final xrz xrz, final zjz zjz, final cpz cpz) {
        if (fpz instanceof lqz) {
            return C((lqz)fpz, ypz, unz, xrz, zjz, cpz);
        }
        final wrz wrz = (wrz)fpz;
        throw null;
    }
    
    public static spz C(final lqz lqz, final ypz ypz, final unz unz, final xrz xrz, final zjz zjz, final cpz cpz) {
        int n;
        if ((lqz.d & 0x1) == 0x1) {
            n = 1;
        }
        else {
            n = 2;
        }
        final int n2 = 0;
        final boolean b = n == 2;
        final String b2 = lqz.b;
        final int length = b2.length();
        int n5;
        if (b2.charAt(0) >= '\ud800') {
            int n3 = 1;
            while (true) {
                final int n4 = n5 = n3 + 1;
                if (b2.charAt(n3) < '\ud800') {
                    break;
                }
                n3 = n4;
            }
        }
        else {
            n5 = 1;
        }
        int n6 = n5 + 1;
        final char char1 = b2.charAt(n5);
        int n7 = n6;
        int n8;
        if ((n8 = char1) >= 55296) {
            int n9 = char1 & '\u1fff';
            int n10 = 13;
            char char2;
            while (true) {
                n7 = n6 + 1;
                char2 = b2.charAt(n6);
                if (char2 < '\ud800') {
                    break;
                }
                n9 |= (char2 & '\u1fff') << n10;
                n10 += 13;
                n6 = n7;
            }
            n8 = (n9 | char2 << n10);
        }
        int[] n11;
        int n12;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        if (n8 == 0) {
            n11 = spz.n;
            n12 = 0;
            final int n13 = 0;
            n14 = 0;
            n15 = 0;
            n16 = 0;
            n17 = 0;
            n18 = n2;
            n19 = n13;
        }
        else {
            final int n20 = n7 + 1;
            int char3;
            final char c = (char)(char3 = b2.charAt(n7));
            int n21 = n20;
            if (c >= '\ud800') {
                int n22 = c & '\u1fff';
                int n23 = 13;
                int n24 = n20;
                int n25;
                char char4;
                while (true) {
                    n25 = n24 + 1;
                    char4 = b2.charAt(n24);
                    if (char4 < '\ud800') {
                        break;
                    }
                    n22 |= (char4 & '\u1fff') << n23;
                    n23 += 13;
                    n24 = n25;
                }
                char3 = (n22 | char4 << n23);
                n21 = n25;
            }
            final int n26 = n21 + 1;
            int char5;
            final char c2 = (char)(char5 = b2.charAt(n21));
            int n27 = n26;
            if (c2 >= '\ud800') {
                int n28 = c2 & '\u1fff';
                int n29 = 13;
                int n30 = n26;
                int n31;
                char char6;
                while (true) {
                    n31 = n30 + 1;
                    char6 = b2.charAt(n30);
                    if (char6 < '\ud800') {
                        break;
                    }
                    n28 |= (char6 & '\u1fff') << n29;
                    n29 += 13;
                    n30 = n31;
                }
                char5 = (n28 | char6 << n29);
                n27 = n31;
            }
            final int n32 = n27 + 1;
            int char7;
            final char c3 = (char)(char7 = b2.charAt(n27));
            int n33 = n32;
            if (c3 >= '\ud800') {
                int n34 = c3 & '\u1fff';
                int n35 = 13;
                int n36 = n32;
                int n37;
                char char8;
                while (true) {
                    n37 = n36 + 1;
                    char8 = b2.charAt(n36);
                    if (char8 < '\ud800') {
                        break;
                    }
                    n34 |= (char8 & '\u1fff') << n35;
                    n35 += 13;
                    n36 = n37;
                }
                char7 = (n34 | char8 << n35);
                n33 = n37;
            }
            final int n38 = n33 + 1;
            int char9;
            final char c4 = (char)(char9 = b2.charAt(n33));
            int n39 = n38;
            if (c4 >= '\ud800') {
                int n40 = c4 & '\u1fff';
                int n41 = 13;
                int n42 = n38;
                int n43;
                char char10;
                while (true) {
                    n43 = n42 + 1;
                    char10 = b2.charAt(n42);
                    if (char10 < '\ud800') {
                        break;
                    }
                    n40 |= (char10 & '\u1fff') << n41;
                    n41 += 13;
                    n42 = n43;
                }
                char9 = (n40 | char10 << n41);
                n39 = n43;
            }
            final int n44 = n39 + 1;
            int char11;
            final char c5 = (char)(char11 = b2.charAt(n39));
            int n45 = n44;
            if (c5 >= '\ud800') {
                final int n46 = c5 & '\u1fff';
                int n47 = 13;
                int n48 = n44;
                int n49 = n46;
                int n50;
                char char12;
                while (true) {
                    n50 = n48 + 1;
                    char12 = b2.charAt(n48);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n49 |= (char12 & '\u1fff') << n47;
                    n47 += 13;
                    n48 = n50;
                }
                final int n51 = n49 | char12 << n47;
                n45 = n50;
                char11 = n51;
            }
            final int n52 = n45 + 1;
            int char13;
            final char c6 = (char)(char13 = b2.charAt(n45));
            int n53 = n52;
            if (c6 >= '\ud800') {
                final int n54 = c6 & '\u1fff';
                int n55 = 13;
                int n56 = n52;
                int n57 = n54;
                int n58;
                char char14;
                while (true) {
                    n58 = n56 + 1;
                    char14 = b2.charAt(n56);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n57 |= (char14 & '\u1fff') << n55;
                    n55 += 13;
                    n56 = n58;
                }
                final int n59 = n57 | char14 << n55;
                n53 = n58;
                char13 = n59;
            }
            final int n60 = n53 + 1;
            int char15;
            final char c7 = (char)(char15 = b2.charAt(n53));
            int n61 = n60;
            if (c7 >= '\ud800') {
                int n62 = c7 & '\u1fff';
                int n63 = 13;
                int n64 = n60;
                int n65;
                char char16;
                while (true) {
                    n65 = n64 + 1;
                    char16 = b2.charAt(n64);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n62 |= (char16 & '\u1fff') << n63;
                    n63 += 13;
                    n64 = n65;
                }
                char15 = (n62 | char16 << n63);
                n61 = n65;
            }
            final int n66 = n61 + 1;
            int char17;
            final char c8 = (char)(char17 = b2.charAt(n61));
            int n67 = n66;
            if (c8 >= '\ud800') {
                final int n68 = c8 & '\u1fff';
                int n69 = n66;
                int n70 = 13;
                int n71 = n68;
                int n72;
                char char18;
                while (true) {
                    n72 = n69 + 1;
                    char18 = b2.charAt(n69);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n71 |= (char18 & '\u1fff') << n70;
                    n70 += 13;
                    n69 = n72;
                }
                final int n73 = n71 | char18 << n70;
                n67 = n72;
                char17 = n73;
            }
            n11 = new int[char17 + char13 + char15];
            final int n74 = char3 + char3 + char5;
            n12 = char13;
            final int n75 = char3;
            n7 = n67;
            n17 = char17;
            n16 = n74;
            n15 = char11;
            n14 = char9;
            n19 = char7;
            n18 = n75;
        }
        final Unsafe o = spz.o;
        final Object[] c9 = lqz.c;
        final Class<? extends kpz> class1 = lqz.a.getClass();
        final int[] array = new int[n15 * 3];
        final Object[] array2 = new Object[n15 + n15];
        final int n76 = n17 + n12;
        final int n77 = n17;
        final int n78 = n7;
        int n79 = n76;
        int n80 = 0;
        int n81 = 0;
        int n82 = n77;
        int n83 = n14;
        final int n84 = n19;
        int i = n78;
        final int n85 = n18;
        while (i < length) {
            int n86 = i + 1;
            int char19 = b2.charAt(i);
            int n90;
            int n91;
            if (char19 >= 55296) {
                int n87 = char19 & 0x1FFF;
                int n88 = 13;
                int n89;
                char char20;
                while (true) {
                    n89 = n86 + 1;
                    char20 = b2.charAt(n86);
                    n90 = n17;
                    if (char20 < '\ud800') {
                        break;
                    }
                    n87 |= (char20 & '\u1fff') << n88;
                    n88 += 13;
                    n17 = n90;
                    n86 = n89;
                }
                char19 = (n87 | char20 << n88);
                n91 = n89;
            }
            else {
                n91 = n86;
                n90 = n17;
            }
            final int n92 = n91 + 1;
            int char21 = b2.charAt(n91);
            int n96;
            int n97;
            if (char21 >= 55296) {
                int n93 = char21 & 0x1FFF;
                int n94 = n92;
                int n95 = 13;
                char char22;
                while (true) {
                    n96 = n94 + 1;
                    char22 = b2.charAt(n94);
                    n97 = n83;
                    if (char22 < '\ud800') {
                        break;
                    }
                    n93 |= (char22 & '\u1fff') << n95;
                    n95 += 13;
                    n83 = n97;
                    n94 = n96;
                }
                char21 = (n93 | char22 << n95);
            }
            else {
                n97 = n83;
                n96 = n92;
            }
            final int n98 = char21 & 0xFF;
            int n99 = n81;
            if ((char21 & 0x400) != 0x0) {
                n11[n81] = n80;
                n99 = n81 + 1;
            }
            int n105;
            int n109;
            int n110;
            int n111;
            int n112;
            int n113;
            int n114;
            if (n98 >= 51) {
                int n100 = n96 + 1;
                int char23 = b2.charAt(n96);
                if (char23 >= 55296) {
                    int n101 = 13;
                    int n102 = char23 & 0x1FFF;
                    int n103 = n100;
                    char char24;
                    while (true) {
                        n100 = n103 + 1;
                        char24 = b2.charAt(n103);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n102 |= (char24 & '\u1fff') << n101;
                        n101 += 13;
                        n103 = n100;
                    }
                    char23 = (n102 | char24 << n101);
                }
                final int n104 = n98 - 51;
                if (n104 != 9 && n104 != 17) {
                    n105 = n16;
                    if (n104 == 12) {
                        n105 = n16;
                        if (!b) {
                            final int n106 = n80 / 3;
                            n105 = n16 + 1;
                            array2[n106 + n106 + 1] = c9[n16];
                        }
                    }
                }
                else {
                    final int n107 = n80 / 3;
                    n105 = n16 + 1;
                    array2[n107 + n107 + 1] = c9[n16];
                }
                int n108 = char23 + char23;
                final Object o2 = c9[n108];
                Field o3;
                if (o2 instanceof Field) {
                    o3 = (Field)o2;
                }
                else {
                    o3 = o(class1, (String)o2);
                    c9[n108] = o3;
                }
                n109 = (int)o.objectFieldOffset(o3);
                ++n108;
                final Object o4 = c9[n108];
                Field o5;
                if (o4 instanceof Field) {
                    o5 = (Field)o4;
                }
                else {
                    o5 = o(class1, (String)o4);
                    c9[n108] = o5;
                }
                n110 = (int)o.objectFieldOffset(o5);
                n111 = 0;
                n112 = n100;
                n113 = n82;
                n114 = n79;
            }
            else {
                final int n115 = n16 + 1;
                final Field o6 = o(class1, (String)c9[n16]);
                int n125 = 0;
                int n126 = 0;
                Label_2164: {
                    if (n98 != 9 && n98 != 17) {
                        if (n98 != 27 && n98 != 49) {
                            int n116;
                            int n117;
                            if (n98 != 12 && n98 != 30 && n98 != 44) {
                                n116 = n115;
                                n117 = n82;
                                if (n98 == 50) {
                                    final int n118 = n82 + 1;
                                    n11[n82] = n80;
                                    final int n119 = n80 / 3;
                                    final int n120 = n119 + n119;
                                    final int n121 = n115 + 1;
                                    array2[n120] = c9[n115];
                                    if ((char21 & 0x800) != 0x0) {
                                        final int n122 = n121 + 1;
                                        array2[n120 + 1] = c9[n121];
                                        n117 = n118;
                                        n116 = n122;
                                    }
                                    else {
                                        n117 = n118;
                                        n116 = n121;
                                    }
                                }
                            }
                            else {
                                n116 = n115;
                                n117 = n82;
                                if (!b) {
                                    final int n123 = n80 / 3;
                                    final int n124 = n115 + 1;
                                    array2[n123 + n123 + 1] = c9[n115];
                                    n125 = n82;
                                    n126 = n124;
                                    break Label_2164;
                                }
                            }
                            n126 = n116;
                            n125 = n117;
                        }
                        else {
                            final int n127 = n80 / 3;
                            final int n128 = n115 + 1;
                            array2[n127 + n127 + 1] = c9[n115];
                            n125 = n82;
                            n126 = n128;
                        }
                    }
                    else {
                        final int n129 = n80 / 3;
                        array2[n129 + n129 + 1] = o6.getType();
                        n125 = n82;
                        n126 = n115;
                    }
                }
                final int n130 = (int)o.objectFieldOffset(o6);
                int n136;
                int n137;
                int n138;
                if ((char21 & 0x1000) == 0x1000 && n98 <= 17) {
                    int n131 = n96 + 1;
                    int char25 = b2.charAt(n96);
                    if (char25 >= 55296) {
                        int n132 = char25 & 0x1FFF;
                        int n133 = 13;
                        int n134 = n131;
                        char char26;
                        while (true) {
                            n131 = n134 + 1;
                            char26 = b2.charAt(n134);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n132 |= (char26 & '\u1fff') << n133;
                            n133 += 13;
                            n134 = n131;
                        }
                        char25 = (n132 | char26 << n133);
                    }
                    final int n135 = char25 / 32 + (n85 + n85);
                    final Object o7 = c9[n135];
                    Field o8;
                    if (o7 instanceof Field) {
                        o8 = (Field)o7;
                    }
                    else {
                        o8 = o(class1, (String)o7);
                        c9[n135] = o8;
                    }
                    n136 = (int)o.objectFieldOffset(o8);
                    n137 = char25 % 32;
                    n138 = n131;
                }
                else {
                    final int n139 = 1048575;
                    n137 = 0;
                    n138 = n96;
                    n136 = n139;
                }
                n109 = n130;
                n110 = n136;
                n111 = n137;
                n112 = n138;
                n113 = n125;
                n114 = n79;
                n105 = n126;
                if (n98 >= 18) {
                    n109 = n130;
                    n110 = n136;
                    n111 = n137;
                    n112 = n138;
                    n113 = n125;
                    n114 = n79;
                    n105 = n126;
                    if (n98 <= 49) {
                        n11[n79] = n130;
                        n114 = n79 + 1;
                        n105 = n126;
                        n113 = n125;
                        n112 = n138;
                        n111 = n137;
                        n110 = n136;
                        n109 = n130;
                    }
                }
            }
            final int n140 = n80 + 1;
            array[n80] = char19;
            final int n141 = n140 + 1;
            int n142;
            if ((char21 & 0x200) != 0x0) {
                n142 = 536870912;
            }
            else {
                n142 = 0;
            }
            int n143;
            if ((char21 & 0x100) != 0x0) {
                n143 = 268435456;
            }
            else {
                n143 = 0;
            }
            array[n140] = (n142 | n143 | n98 << 20 | n109);
            array[n141] = (n111 << 20 | n110);
            n80 = n141 + 1;
            final int n144 = n112;
            n16 = n105;
            n17 = n90;
            n83 = n97;
            i = n144;
            n81 = n99;
            n82 = n113;
            n79 = n114;
        }
        return new spz(array, array2, n84, n83, lqz.a, b, n11, n17, n76, unz, xrz, zjz, cpz);
    }
    
    public static double D(final Object o, final long n) {
        return (double)hsz.j(o, n);
    }
    
    public static float E(final Object o, final long n) {
        return (float)hsz.j(o, n);
    }
    
    public static int H(final Object o, final long n) {
        return (int)hsz.j(o, n);
    }
    
    public static long b(final Object o, final long n) {
        return (long)hsz.j(o, n);
    }
    
    public static Field o(final Class clazz, final String s) {
        try {
            return clazz.getDeclaredField(s);
        }
        catch (final NoSuchFieldException ex) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (final Field field : declaredFields) {
                if (s.equals(field.getName())) {
                    return field;
                }
            }
            final String name = clazz.getName();
            final String string = Arrays.toString(declaredFields);
            final StringBuilder k = l58.k("Field ", s, " for ", name, " not found. Known fields are ");
            k.append(string);
            throw new RuntimeException(k.toString());
        }
    }
    
    public static boolean x(final Object o, final long n) {
        return (boolean)hsz.j(o, n);
    }
    
    public static final void y(final int n, final Object o, final ftz ftz) throws IOException {
        if (o instanceof String) {
            ((mjz)ftz).a.H(n, (String)o);
            return;
        }
        ((mjz)ftz).f(n, (oiz)o);
    }
    
    public final int F(final Object o) {
        final Unsafe o2 = spz.o;
        int i = 0;
        int n = 0;
        int n2 = 1048575;
        int int1 = 0;
        while (i < this.a.length) {
            final int a = this.a(i);
            final int[] a2 = this.a;
            final int n3 = a2[i];
            final int n4 = a >>> 20 & 0xFF;
            int n8;
            int n9;
            if (n4 <= 17) {
                final int n5 = a2[i + 2];
                final int n6 = n5 & 0xFFFFF;
                final int n7 = 1 << (n5 >>> 20);
                n8 = n2;
                n9 = n7;
                if (n6 != n2) {
                    int1 = o2.getInt(o, (long)n6);
                    n8 = n6;
                    n9 = n7;
                }
            }
            else {
                n9 = 0;
                n8 = n2;
            }
            final long n10 = 0xFFFFF & a;
            int c = 0;
            Label_3003: {
                int n11 = 0;
                Label_2998: {
                    Label_2995: {
                        Label_2971: {
                            int n19 = 0;
                            int n20 = 0;
                            Label_2946: {
                                int n14 = 0;
                                int n15 = 0;
                                Label_2868: {
                                    Label_2788: {
                                        int n26 = 0;
                                        int n27 = 0;
                                        int n28 = 0;
                                        Label_2733: {
                                            int n12 = 0;
                                            int n13 = 0;
                                            Label_2438: {
                                                int n25 = 0;
                                                Label_2291: {
                                                    int n22 = 0;
                                                    int n29 = 0;
                                                    Label_2287: {
                                                        int n23 = 0;
                                                        int n24 = 0;
                                                        Label_2282: {
                                                            Label_2264: {
                                                                int n21 = 0;
                                                                int s3 = 0;
                                                                Label_1787: {
                                                                    int n16 = 0;
                                                                    int n17 = 0;
                                                                    int n18 = 0;
                                                                    switch (n4) {
                                                                        default: {
                                                                            c = n;
                                                                            break Label_3003;
                                                                        }
                                                                        case 68: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.O(n3, (kpz)o2.getObject(o, n10), this.m(i));
                                                                                break Label_2998;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 67: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final long b = b(o, n10);
                                                                                n12 = ijz.w(n3 << 3);
                                                                                n13 = ijz.x(b >> 63 ^ b + b);
                                                                                break Label_2438;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 66: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final int h = H(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.w(h >> 31 ^ h + h);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 65: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2995;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 64: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2971;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 63: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final int h2 = H(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.P(h2);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 62: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final int h3 = H(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.w(h3);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 61: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final oiz oiz = (oiz)o2.getObject(o, n10);
                                                                                n16 = ijz.w(n3 << 3);
                                                                                n17 = oiz.i();
                                                                                n18 = ijz.w(n17);
                                                                                break;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 60: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = qqz.E(n3, o2.getObject(o, n10), this.m(i));
                                                                                break Label_2998;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 59: {
                                                                            c = n;
                                                                            if (!this.w(o, n3, i)) {
                                                                                break Label_3003;
                                                                            }
                                                                            final Object object = o2.getObject(o, n10);
                                                                            if (object instanceof oiz) {
                                                                                final oiz oiz2 = (oiz)object;
                                                                                n16 = ijz.w(n3 << 3);
                                                                                n17 = oiz2.i();
                                                                                n18 = ijz.w(n17);
                                                                                break;
                                                                            }
                                                                            final String s = (String)object;
                                                                            n14 = ijz.w(n3 << 3);
                                                                            n15 = ijz.R(s);
                                                                            break Label_2868;
                                                                        }
                                                                        case 58: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2788;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 57: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2971;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 56: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2995;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 55: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final int h4 = H(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.P(h4);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 54: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final long b2 = b(o, n10);
                                                                                n19 = ijz.w(n3 << 3);
                                                                                n20 = ijz.x(b2);
                                                                                break Label_2946;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 53: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                final long b3 = b(o, n10);
                                                                                n19 = ijz.w(n3 << 3);
                                                                                n20 = ijz.x(b3);
                                                                                break Label_2946;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 52: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2971;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 51: {
                                                                            c = n;
                                                                            if (this.w(o, n3, i)) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2995;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 50: {
                                                                            cpz.a(o2.getObject(o, n10), this.n(i));
                                                                            c = n;
                                                                            break Label_3003;
                                                                        }
                                                                        case 49: {
                                                                            n11 = qqz.A(n3, (List)o2.getObject(o, n10), this.m(i));
                                                                            break Label_2998;
                                                                        }
                                                                        case 48: {
                                                                            final int h5 = qqz.H((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (h5 > 0) {
                                                                                final int s2 = ijz.S(n3);
                                                                                n21 = ijz.w(h5);
                                                                                n22 = h5;
                                                                                s3 = s2;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 47: {
                                                                            final int g = qqz.G((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (g > 0) {
                                                                                final int s4 = ijz.S(n3);
                                                                                n21 = ijz.w(g);
                                                                                n22 = g;
                                                                                s3 = s4;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 46: {
                                                                            final int z = qqz.z((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (z > 0) {
                                                                                final int s5 = ijz.S(n3);
                                                                                n21 = ijz.w(z);
                                                                                n22 = z;
                                                                                s3 = s5;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 45: {
                                                                            final int x = qqz.x((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (x > 0) {
                                                                                final int s6 = ijz.S(n3);
                                                                                n21 = ijz.w(x);
                                                                                n22 = x;
                                                                                s3 = s6;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 44: {
                                                                            final int v = qqz.v((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (v > 0) {
                                                                                final int s7 = ijz.S(n3);
                                                                                n21 = ijz.w(v);
                                                                                n22 = v;
                                                                                s3 = s7;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 43: {
                                                                            final int j = qqz.J((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (j > 0) {
                                                                                final int s8 = ijz.S(n3);
                                                                                n21 = ijz.w(j);
                                                                                n22 = j;
                                                                                s3 = s8;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 42: {
                                                                            final List list = (List)o2.getObject(o, n10);
                                                                            final Class a3 = qqz.a;
                                                                            final int size = list.size();
                                                                            c = n;
                                                                            if (size > 0) {
                                                                                final int s9 = ijz.S(n3);
                                                                                n21 = ijz.w(size);
                                                                                n22 = size;
                                                                                s3 = s9;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 41: {
                                                                            final int x2 = qqz.x((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (x2 > 0) {
                                                                                final int s10 = ijz.S(n3);
                                                                                n21 = ijz.w(x2);
                                                                                n22 = x2;
                                                                                s3 = s10;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 40: {
                                                                            final int z2 = qqz.z((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (z2 > 0) {
                                                                                final int s11 = ijz.S(n3);
                                                                                n21 = ijz.w(z2);
                                                                                n22 = z2;
                                                                                s3 = s11;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 39: {
                                                                            final int b4 = qqz.B((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (b4 > 0) {
                                                                                final int s12 = ijz.S(n3);
                                                                                n21 = ijz.w(b4);
                                                                                n22 = b4;
                                                                                s3 = s12;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 38: {
                                                                            final int k = qqz.K((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (k > 0) {
                                                                                final int s13 = ijz.S(n3);
                                                                                n21 = ijz.w(k);
                                                                                n22 = k;
                                                                                s3 = s13;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 37: {
                                                                            final int d = qqz.D((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (d > 0) {
                                                                                final int s14 = ijz.S(n3);
                                                                                n21 = ijz.w(d);
                                                                                n22 = d;
                                                                                s3 = s14;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 36: {
                                                                            final int x3 = qqz.x((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (x3 > 0) {
                                                                                final int s15 = ijz.S(n3);
                                                                                n21 = ijz.w(x3);
                                                                                n22 = x3;
                                                                                s3 = s15;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 35: {
                                                                            final int z3 = qqz.z((List)o2.getObject(o, n10));
                                                                            c = n;
                                                                            if (z3 > 0) {
                                                                                s3 = ijz.S(n3);
                                                                                n21 = ijz.w(z3);
                                                                                n22 = z3;
                                                                                break Label_1787;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 34: {
                                                                            final List list2 = (List)o2.getObject(o, n10);
                                                                            final Class a4 = qqz.a;
                                                                            n23 = list2.size();
                                                                            if (n23 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n22 = qqz.H(list2);
                                                                            n24 = ijz.S(n3);
                                                                            break Label_2282;
                                                                        }
                                                                        case 33: {
                                                                            final List list3 = (List)o2.getObject(o, n10);
                                                                            final Class a5 = qqz.a;
                                                                            n23 = list3.size();
                                                                            if (n23 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n22 = qqz.G(list3);
                                                                            n24 = ijz.S(n3);
                                                                            break Label_2282;
                                                                        }
                                                                        case 32: {
                                                                            n11 = qqz.y(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 31: {
                                                                            n11 = qqz.w(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 30: {
                                                                            final List list4 = (List)o2.getObject(o, n10);
                                                                            final Class a6 = qqz.a;
                                                                            n23 = list4.size();
                                                                            if (n23 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n22 = qqz.v(list4);
                                                                            n24 = ijz.S(n3);
                                                                            break Label_2282;
                                                                        }
                                                                        case 29: {
                                                                            final List list5 = (List)o2.getObject(o, n10);
                                                                            final Class a7 = qqz.a;
                                                                            n23 = list5.size();
                                                                            if (n23 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n22 = qqz.J(list5);
                                                                            n24 = ijz.S(n3);
                                                                            break Label_2282;
                                                                        }
                                                                        case 28: {
                                                                            n11 = qqz.u(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 27: {
                                                                            n11 = qqz.F(n3, (List)o2.getObject(o, n10), this.m(i));
                                                                            break Label_2998;
                                                                        }
                                                                        case 26: {
                                                                            n11 = qqz.I(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 25: {
                                                                            final List list6 = (List)o2.getObject(o, n10);
                                                                            final Class a8 = qqz.a;
                                                                            final int size2 = list6.size();
                                                                            if (size2 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n25 = (ijz.w(n3 << 3) + 1) * size2;
                                                                            break Label_2291;
                                                                        }
                                                                        case 24: {
                                                                            n11 = qqz.w(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 23: {
                                                                            n11 = qqz.y(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 22: {
                                                                            final List list7 = (List)o2.getObject(o, n10);
                                                                            final Class a9 = qqz.a;
                                                                            n23 = list7.size();
                                                                            if (n23 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n22 = qqz.B(list7);
                                                                            n24 = ijz.S(n3);
                                                                            break Label_2282;
                                                                        }
                                                                        case 21: {
                                                                            final List list8 = (List)o2.getObject(o, n10);
                                                                            final Class a10 = qqz.a;
                                                                            n23 = list8.size();
                                                                            if (n23 == 0) {
                                                                                break Label_2264;
                                                                            }
                                                                            n22 = qqz.K(list8);
                                                                            n24 = ijz.S(n3);
                                                                            break Label_2282;
                                                                        }
                                                                        case 20: {
                                                                            n11 = qqz.C(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 19: {
                                                                            n11 = qqz.w(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 18: {
                                                                            n11 = qqz.y(n3, (List)o2.getObject(o, n10));
                                                                            break Label_2998;
                                                                        }
                                                                        case 17: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.O(n3, (kpz)o2.getObject(o, n10), this.m(i));
                                                                                break Label_2998;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 16: {
                                                                            c = n;
                                                                            if ((n9 & int1) != 0x0) {
                                                                                final long long1 = o2.getLong(o, n10);
                                                                                n12 = ijz.w(n3 << 3);
                                                                                n13 = ijz.x(long1 >> 63 ^ long1 + long1);
                                                                                break Label_2438;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 15: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final int int2 = o2.getInt(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.w(int2 >> 31 ^ int2 + int2);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 14: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2995;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 13: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2971;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 12: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final int int3 = o2.getInt(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.P(int3);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 11: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final int int4 = o2.getInt(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.w(int4);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 10: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final oiz oiz3 = (oiz)o2.getObject(o, n10);
                                                                                n26 = ijz.w(n3 << 3);
                                                                                n27 = oiz3.i();
                                                                                n28 = ijz.w(n27);
                                                                                break Label_2733;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 9: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = qqz.E(n3, o2.getObject(o, n10), this.m(i));
                                                                                break Label_2998;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 8: {
                                                                            c = n;
                                                                            if ((int1 & n9) == 0x0) {
                                                                                break Label_3003;
                                                                            }
                                                                            final Object object2 = o2.getObject(o, n10);
                                                                            if (object2 instanceof oiz) {
                                                                                final oiz oiz4 = (oiz)object2;
                                                                                n26 = ijz.w(n3 << 3);
                                                                                n27 = oiz4.i();
                                                                                n28 = ijz.w(n27);
                                                                                break Label_2733;
                                                                            }
                                                                            final String s16 = (String)object2;
                                                                            n14 = ijz.w(n3 << 3);
                                                                            n15 = ijz.R(s16);
                                                                            break Label_2868;
                                                                        }
                                                                        case 7: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2788;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 6: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2971;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 5: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2995;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 4: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final int int5 = o2.getInt(o, n10);
                                                                                n14 = ijz.w(n3 << 3);
                                                                                n15 = ijz.P(int5);
                                                                                break Label_2868;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 3: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final long long2 = o2.getLong(o, n10);
                                                                                n19 = ijz.w(n3 << 3);
                                                                                n20 = ijz.x(long2);
                                                                                break Label_2946;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 2: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                final long long3 = o2.getLong(o, n10);
                                                                                n19 = ijz.w(n3 << 3);
                                                                                n20 = ijz.x(long3);
                                                                                break Label_2946;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 1: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2971;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                        case 0: {
                                                                            c = n;
                                                                            if ((int1 & n9) != 0x0) {
                                                                                n11 = ijz.w(n3 << 3);
                                                                                break Label_2995;
                                                                            }
                                                                            break Label_3003;
                                                                        }
                                                                    }
                                                                    n25 = n18 + n17 + n16;
                                                                    break Label_2291;
                                                                }
                                                                n29 = n21 + s3;
                                                                break Label_2287;
                                                            }
                                                            n25 = 0;
                                                            break Label_2291;
                                                        }
                                                        n29 = n24 * n23;
                                                    }
                                                    n25 = n29 + n22;
                                                }
                                                c = n + n25;
                                                break Label_3003;
                                            }
                                            n11 = n13 + n12;
                                            break Label_2998;
                                        }
                                        c = zk.c(n28, n27, n26, n);
                                        break Label_3003;
                                    }
                                    ++n11;
                                    break Label_2998;
                                }
                                n11 = n15 + n14;
                                break Label_2998;
                            }
                            n11 = n19 + n20;
                            break Label_2998;
                        }
                        n11 += 4;
                        break Label_2998;
                    }
                    n11 += 8;
                }
                c = n + n11;
            }
            i += 3;
            n = c;
            n2 = n8;
        }
        final xrz l = this.l;
        final int a11 = l.a(l.c(o));
        if (!this.f) {
            return a11 + n;
        }
        this.m.a(o);
        throw null;
    }
    
    public final int G(final Object o) {
        final Unsafe o2 = spz.o;
        int i = 0;
        int n = 0;
        while (i < this.a.length) {
            final int a = this.a(i);
            final int n2 = a >>> 20 & 0xFF;
            final int[] a2 = this.a;
            final int n3 = a2[i];
            final long n4 = a & 0xFFFFF;
            if (n2 >= nkz.G0.F0 && n2 <= nkz.H0.F0) {
                final int n5 = a2[i + 2];
            }
            int n6 = 0;
            Label_2934: {
                int n7 = 0;
                Label_2929: {
                    Label_2926: {
                        Label_2899: {
                            int n15 = 0;
                            int n16 = 0;
                            Label_2871: {
                                int n10 = 0;
                                int n11 = 0;
                                Label_2791: {
                                    Label_2704: {
                                        while (true) {
                                            int n12 = 0;
                                            int n13 = 0;
                                            int n14 = 0;
                                            Label_2649: {
                                                int n8 = 0;
                                                int n9 = 0;
                                                Label_2342: {
                                                    int n18 = 0;
                                                    int n22 = 0;
                                                    Label_2195: {
                                                        int n19 = 0;
                                                        int n20 = 0;
                                                        Label_2190: {
                                                            Label_2172: {
                                                                int n17 = 0;
                                                                int s3 = 0;
                                                                switch (n2) {
                                                                    default: {
                                                                        n6 = n;
                                                                        break Label_2934;
                                                                    }
                                                                    case 68: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.O(n3, (kpz)hsz.j(o, n4), this.m(i));
                                                                            break Label_2929;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 67: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final long b = b(o, n4);
                                                                            n8 = ijz.w(n3 << 3);
                                                                            n9 = ijz.x(b >> 63 ^ b + b);
                                                                            break Label_2342;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 66: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final int h = H(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.w(h >> 31 ^ h + h);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 65: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2926;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 64: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2899;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 63: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final int h2 = H(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.P(h2);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 62: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final int h3 = H(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.w(h3);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 61: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final oiz oiz = (oiz)hsz.j(o, n4);
                                                                            n12 = ijz.w(n3 << 3);
                                                                            n13 = oiz.i();
                                                                            n14 = ijz.w(n13);
                                                                            break Label_2649;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 60: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = qqz.E(n3, hsz.j(o, n4), this.m(i));
                                                                            break Label_2929;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 59: {
                                                                        n6 = n;
                                                                        if (!this.w(o, n3, i)) {
                                                                            break Label_2934;
                                                                        }
                                                                        final Object j = hsz.j(o, n4);
                                                                        if (j instanceof oiz) {
                                                                            final oiz oiz2 = (oiz)j;
                                                                            n12 = ijz.w(n3 << 3);
                                                                            n13 = oiz2.i();
                                                                            n14 = ijz.w(n13);
                                                                            break Label_2649;
                                                                        }
                                                                        final String s = (String)j;
                                                                        n10 = ijz.w(n3 << 3);
                                                                        n11 = ijz.R(s);
                                                                        break Label_2791;
                                                                    }
                                                                    case 58: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2704;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 57: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2899;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 56: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2926;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 55: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final int h4 = H(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.P(h4);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 54: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final long b2 = b(o, n4);
                                                                            n15 = ijz.w(n3 << 3);
                                                                            n16 = ijz.x(b2);
                                                                            break Label_2871;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 53: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            final long b3 = b(o, n4);
                                                                            n15 = ijz.w(n3 << 3);
                                                                            n16 = ijz.x(b3);
                                                                            break Label_2871;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 52: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2899;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 51: {
                                                                        n6 = n;
                                                                        if (this.w(o, n3, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2926;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 50: {
                                                                        cpz.a(hsz.j(o, n4), this.n(i));
                                                                        n6 = n;
                                                                        break Label_2934;
                                                                    }
                                                                    case 49: {
                                                                        n7 = qqz.A(n3, (List)hsz.j(o, n4), this.m(i));
                                                                        break Label_2929;
                                                                    }
                                                                    case 48: {
                                                                        final int h5 = qqz.H((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (h5 > 0) {
                                                                            final int s2 = ijz.S(n3);
                                                                            n17 = ijz.w(h5);
                                                                            n18 = h5;
                                                                            s3 = s2;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 47: {
                                                                        final int g = qqz.G((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (g > 0) {
                                                                            final int s4 = ijz.S(n3);
                                                                            n17 = ijz.w(g);
                                                                            n18 = g;
                                                                            s3 = s4;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 46: {
                                                                        final int z = qqz.z((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (z > 0) {
                                                                            final int s5 = ijz.S(n3);
                                                                            n17 = ijz.w(z);
                                                                            n18 = z;
                                                                            s3 = s5;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 45: {
                                                                        final int x = qqz.x((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (x > 0) {
                                                                            final int s6 = ijz.S(n3);
                                                                            n17 = ijz.w(x);
                                                                            n18 = x;
                                                                            s3 = s6;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 44: {
                                                                        final int v = qqz.v((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (v > 0) {
                                                                            final int s7 = ijz.S(n3);
                                                                            n17 = ijz.w(v);
                                                                            n18 = v;
                                                                            s3 = s7;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 43: {
                                                                        final int k = qqz.J((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (k > 0) {
                                                                            final int s8 = ijz.S(n3);
                                                                            n17 = ijz.w(k);
                                                                            n18 = k;
                                                                            s3 = s8;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 42: {
                                                                        final List list = (List)o2.getObject(o, n4);
                                                                        final Class a3 = qqz.a;
                                                                        final int size = list.size();
                                                                        n6 = n;
                                                                        if (size > 0) {
                                                                            final int s9 = ijz.S(n3);
                                                                            n17 = ijz.w(size);
                                                                            n18 = size;
                                                                            s3 = s9;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 41: {
                                                                        final int x2 = qqz.x((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (x2 > 0) {
                                                                            final int s10 = ijz.S(n3);
                                                                            n17 = ijz.w(x2);
                                                                            n18 = x2;
                                                                            s3 = s10;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 40: {
                                                                        final int z2 = qqz.z((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (z2 > 0) {
                                                                            final int s11 = ijz.S(n3);
                                                                            n17 = ijz.w(z2);
                                                                            n18 = z2;
                                                                            s3 = s11;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 39: {
                                                                        final int b4 = qqz.B((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (b4 > 0) {
                                                                            final int s12 = ijz.S(n3);
                                                                            n17 = ijz.w(b4);
                                                                            n18 = b4;
                                                                            s3 = s12;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 38: {
                                                                        final int l = qqz.K((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (l > 0) {
                                                                            final int s13 = ijz.S(n3);
                                                                            n17 = ijz.w(l);
                                                                            n18 = l;
                                                                            s3 = s13;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 37: {
                                                                        final int d = qqz.D((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (d > 0) {
                                                                            final int s14 = ijz.S(n3);
                                                                            n17 = ijz.w(d);
                                                                            n18 = d;
                                                                            s3 = s14;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 36: {
                                                                        final int x3 = qqz.x((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (x3 > 0) {
                                                                            final int s15 = ijz.S(n3);
                                                                            n17 = ijz.w(x3);
                                                                            n18 = x3;
                                                                            s3 = s15;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 35: {
                                                                        final int z3 = qqz.z((List)o2.getObject(o, n4));
                                                                        n6 = n;
                                                                        if (z3 > 0) {
                                                                            s3 = ijz.S(n3);
                                                                            n17 = ijz.w(z3);
                                                                            n18 = z3;
                                                                            break;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 34: {
                                                                        final List list2 = (List)hsz.j(o, n4);
                                                                        final Class a4 = qqz.a;
                                                                        n19 = list2.size();
                                                                        if (n19 == 0) {
                                                                            break Label_2172;
                                                                        }
                                                                        n18 = qqz.H(list2);
                                                                        n20 = ijz.S(n3);
                                                                        break Label_2190;
                                                                    }
                                                                    case 33: {
                                                                        final List list3 = (List)hsz.j(o, n4);
                                                                        final Class a5 = qqz.a;
                                                                        n19 = list3.size();
                                                                        if (n19 == 0) {
                                                                            break Label_2172;
                                                                        }
                                                                        n18 = qqz.G(list3);
                                                                        n20 = ijz.S(n3);
                                                                        break Label_2190;
                                                                    }
                                                                    case 32: {
                                                                        n7 = qqz.y(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 31: {
                                                                        n7 = qqz.w(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 30: {
                                                                        final List list4 = (List)hsz.j(o, n4);
                                                                        final Class a6 = qqz.a;
                                                                        n19 = list4.size();
                                                                        if (n19 == 0) {
                                                                            break Label_2172;
                                                                        }
                                                                        n18 = qqz.v(list4);
                                                                        n20 = ijz.S(n3);
                                                                        break Label_2190;
                                                                    }
                                                                    case 29: {
                                                                        final List list5 = (List)hsz.j(o, n4);
                                                                        final Class a7 = qqz.a;
                                                                        n19 = list5.size();
                                                                        if (n19 == 0) {
                                                                            break Label_2172;
                                                                        }
                                                                        n18 = qqz.J(list5);
                                                                        n20 = ijz.S(n3);
                                                                        break Label_2190;
                                                                    }
                                                                    case 28: {
                                                                        n7 = qqz.u(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 27: {
                                                                        n7 = qqz.F(n3, (List)hsz.j(o, n4), this.m(i));
                                                                        break Label_2929;
                                                                    }
                                                                    case 26: {
                                                                        n7 = qqz.I(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 25: {
                                                                        final List list6 = (List)hsz.j(o, n4);
                                                                        final Class a8 = qqz.a;
                                                                        final int size2 = list6.size();
                                                                        int n21;
                                                                        if (size2 == 0) {
                                                                            n21 = 0;
                                                                        }
                                                                        else {
                                                                            n21 = (ijz.w(n3 << 3) + 1) * size2;
                                                                        }
                                                                        n6 = n + n21;
                                                                        break Label_2934;
                                                                    }
                                                                    case 24: {
                                                                        n7 = qqz.w(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 23: {
                                                                        n7 = qqz.y(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 22: {
                                                                        final List list7 = (List)hsz.j(o, n4);
                                                                        final Class a9 = qqz.a;
                                                                        n19 = list7.size();
                                                                        if (n19 == 0) {
                                                                            break Label_2172;
                                                                        }
                                                                        n18 = qqz.B(list7);
                                                                        n20 = ijz.S(n3);
                                                                        break Label_2190;
                                                                    }
                                                                    case 21: {
                                                                        final List list8 = (List)hsz.j(o, n4);
                                                                        final Class a10 = qqz.a;
                                                                        n19 = list8.size();
                                                                        if (n19 == 0) {
                                                                            break Label_2172;
                                                                        }
                                                                        n18 = qqz.K(list8);
                                                                        n20 = ijz.S(n3);
                                                                        break Label_2190;
                                                                    }
                                                                    case 20: {
                                                                        n7 = qqz.C(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 19: {
                                                                        n7 = qqz.w(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 18: {
                                                                        n7 = qqz.y(n3, (List)hsz.j(o, n4));
                                                                        break Label_2929;
                                                                    }
                                                                    case 17: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.O(n3, (kpz)hsz.j(o, n4), this.m(i));
                                                                            break Label_2929;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 16: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final long h6 = hsz.h(o, n4);
                                                                            n8 = ijz.w(n3 << 3);
                                                                            n9 = ijz.x(h6 >> 63 ^ h6 + h6);
                                                                            break Label_2342;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 15: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final int g2 = hsz.g(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.w(g2 >> 31 ^ g2 + g2);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 14: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2926;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 13: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2899;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 12: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final int g3 = hsz.g(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.P(g3);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 11: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final int g4 = hsz.g(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.w(g4);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 10: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final oiz oiz3 = (oiz)hsz.j(o, n4);
                                                                            n12 = ijz.w(n3 << 3);
                                                                            n13 = oiz3.i();
                                                                            n14 = ijz.w(n13);
                                                                            break Label_2649;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 9: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = qqz.E(n3, hsz.j(o, n4), this.m(i));
                                                                            break Label_2929;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 8: {
                                                                        n6 = n;
                                                                        if (!this.v(o, i)) {
                                                                            break Label_2934;
                                                                        }
                                                                        final Object m = hsz.j(o, n4);
                                                                        if (m instanceof oiz) {
                                                                            final oiz oiz4 = (oiz)m;
                                                                            n12 = ijz.w(n3 << 3);
                                                                            n13 = oiz4.i();
                                                                            n14 = ijz.w(n13);
                                                                            break Label_2649;
                                                                        }
                                                                        final String s16 = (String)m;
                                                                        n10 = ijz.w(n3 << 3);
                                                                        n11 = ijz.R(s16);
                                                                        break Label_2791;
                                                                    }
                                                                    case 7: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2704;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 6: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2899;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 5: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2926;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 4: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final int g5 = hsz.g(o, n4);
                                                                            n10 = ijz.w(n3 << 3);
                                                                            n11 = ijz.P(g5);
                                                                            break Label_2791;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 3: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final long h7 = hsz.h(o, n4);
                                                                            n15 = ijz.w(n3 << 3);
                                                                            n16 = ijz.x(h7);
                                                                            break Label_2871;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 2: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            final long h8 = hsz.h(o, n4);
                                                                            n15 = ijz.w(n3 << 3);
                                                                            n16 = ijz.x(h8);
                                                                            break Label_2871;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 1: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2899;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                    case 0: {
                                                                        n6 = n;
                                                                        if (this.v(o, i)) {
                                                                            n7 = ijz.w(n3 << 3);
                                                                            break Label_2926;
                                                                        }
                                                                        break Label_2934;
                                                                    }
                                                                }
                                                                n22 = n17 + s3;
                                                                break Label_2195;
                                                            }
                                                            final int n23 = 0;
                                                            break Label_2199;
                                                        }
                                                        n22 = n20 * n19;
                                                    }
                                                    final int n23 = n22 + n18;
                                                    n6 = n + n23;
                                                    break Label_2934;
                                                }
                                                n7 = n9 + n8;
                                                break Label_2929;
                                            }
                                            final int n23 = n14 + n13 + n12;
                                            continue;
                                        }
                                    }
                                    ++n7;
                                    break Label_2929;
                                }
                                n7 = n11 + n10;
                                break Label_2929;
                            }
                            n7 = n16 + n15;
                            break Label_2929;
                        }
                        n7 += 4;
                        break Label_2929;
                    }
                    n7 += 8;
                }
                n6 = n + n7;
            }
            i += 3;
            n = n6;
        }
        final xrz l2 = this.l;
        return l2.a(l2.c(o)) + n;
    }
    
    public final int I(final Object o, final int n, final long n2) throws IOException {
        final Unsafe o2 = spz.o;
        final Object n3 = this.n(n);
        final Object object = o2.getObject(o, n2);
        if (!((zoz)object).F0) {
            final zoz g0 = zoz.G0;
            zoz zoz;
            if (g0.isEmpty()) {
                zoz = new zoz();
            }
            else {
                zoz = new zoz(g0);
            }
            cpz.b((Object)zoz, object);
            o2.putObject(o, n2, zoz);
        }
        final xoz xoz = (xoz)n3;
        throw null;
    }
    
    public final int J(final Object o, final byte[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final long n8, final int n9, final ygz ygz) throws IOException {
        final Unsafe o2 = spz.o;
        final long n10 = this.a[n9 + 2] & 0xFFFFF;
        switch (n7) {
            case 68: {
                if (n5 == 3) {
                    n = bhz.c(this.m(n9), array, n, n2, (n3 & 0xFFFFFFF8) | 0x4, ygz);
                    Object object;
                    if (o2.getInt(o, n10) == n4) {
                        object = o2.getObject(o, n8);
                    }
                    else {
                        object = null;
                    }
                    if (object == null) {
                        o2.putObject(o, n8, ygz.c);
                    }
                    else {
                        o2.putObject(o, n8, tmz.c(object, ygz.c));
                    }
                    o2.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 67: {
                if (n5 != 0) {
                    break;
                }
                n = bhz.m(array, n, ygz);
                o2.putObject(o, n8, ziz.b(ygz.b));
                o2.putInt(o, n10, n4);
                return n;
            }
            case 66: {
                if (n5 != 0) {
                    break;
                }
                n = bhz.j(array, n, ygz);
                o2.putObject(o, n8, ziz.a(ygz.a));
                o2.putInt(o, n10, n4);
                return n;
            }
            case 63: {
                if (n5 == 0) {
                    n = bhz.j(array, n, ygz);
                    n2 = ygz.a;
                    final kmz l = this.l(n9);
                    if (l != null && !l.o(n2)) {
                        A(o).c(n3, (Object)(long)n2);
                    }
                    else {
                        o2.putObject(o, n8, n2);
                        o2.putInt(o, n10, n4);
                    }
                    break;
                }
                break;
            }
            case 61: {
                if (n5 != 2) {
                    break;
                }
                n = bhz.a(array, n, ygz);
                o2.putObject(o, n8, ygz.c);
                o2.putInt(o, n10, n4);
                return n;
            }
            case 60: {
                if (n5 == 2) {
                    n = bhz.d(this.m(n9), array, n, n2, ygz);
                    Object object2;
                    if (o2.getInt(o, n10) == n4) {
                        object2 = o2.getObject(o, n8);
                    }
                    else {
                        object2 = null;
                    }
                    if (object2 == null) {
                        o2.putObject(o, n8, ygz.c);
                    }
                    else {
                        o2.putObject(o, n8, tmz.c(object2, ygz.c));
                    }
                    o2.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 59: {
                if (n5 == 2) {
                    n = bhz.j(array, n, ygz);
                    n2 = ygz.a;
                    if (n2 == 0) {
                        o2.putObject(o, n8, "");
                    }
                    else {
                        if ((n6 & 0x20000000) != 0x0 && !ctz.d(array, n, n + n2)) {
                            throw zzkm.a();
                        }
                        o2.putObject(o, n8, new String(array, n, n2, tmz.a));
                        n += n2;
                    }
                    o2.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 58: {
                if (n5 == 0) {
                    n = bhz.m(array, n, ygz);
                    o2.putObject(o, n8, ygz.b != 0L);
                    o2.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 57:
            case 64: {
                if (n5 != 5) {
                    break;
                }
                o2.putObject(o, n8, bhz.b(array, n));
                o2.putInt(o, n10, n4);
                return n + 4;
            }
            case 56:
            case 65: {
                if (n5 != 1) {
                    break;
                }
                o2.putObject(o, n8, bhz.n(array, n));
                o2.putInt(o, n10, n4);
                return n + 8;
            }
            case 55:
            case 62: {
                if (n5 != 0) {
                    break;
                }
                n = bhz.j(array, n, ygz);
                o2.putObject(o, n8, ygz.a);
                o2.putInt(o, n10, n4);
                return n;
            }
            case 53:
            case 54: {
                if (n5 != 0) {
                    break;
                }
                n = bhz.m(array, n, ygz);
                o2.putObject(o, n8, ygz.b);
                o2.putInt(o, n10, n4);
                return n;
            }
            case 52: {
                if (n5 != 5) {
                    break;
                }
                o2.putObject(o, n8, Float.intBitsToFloat(bhz.b(array, n)));
                o2.putInt(o, n10, n4);
                return n + 4;
            }
            case 51: {
                if (n5 != 1) {
                    break;
                }
                o2.putObject(o, n8, Double.longBitsToDouble(bhz.n(array, n)));
                o2.putInt(o, n10, n4);
                return n + 8;
            }
        }
        return n;
    }
    
    public final int K(final Object o, final byte[] array, int n, final int n2, final ygz ygz) throws IOException {
        Object o2 = o;
        final Unsafe o3 = spz.o;
        spz spz = this;
        byte[] array2 = array;
        int i = n;
        ygz ygz2 = ygz;
        n = -1;
        int n3 = 0;
        int n4 = 1048575;
        int int1 = 0;
        while (i < n2) {
            final int n5 = i + 1;
            int a = array2[i];
            if (a < 0) {
                i = bhz.k(a, array2, n5, ygz2);
                a = ygz2.a;
            }
            else {
                i = n5;
            }
            final int n6 = a >>> 3;
            final int n7 = a & 0x7;
            Label_0178: {
                Label_0176: {
                    if (n6 > n) {
                        n = n3 / 3;
                        if (n6 < spz.c || n6 > spz.d) {
                            break Label_0176;
                        }
                        n = spz.N(n6, n);
                    }
                    else {
                        if (n6 < spz.c || n6 > spz.d) {
                            break Label_0176;
                        }
                        n = spz.N(n6, 0);
                    }
                    break Label_0178;
                }
                n = -1;
            }
            Label_1381: {
                int n18 = 0;
                int n19 = 0;
                Label_1366: {
                    Label_1353: {
                        int n28 = 0;
                        Label_1317: {
                            int n22 = 0;
                            Label_1017: {
                                if (n != -1) {
                                    final int[] a2 = spz.a;
                                    final int n8 = a2[n + 1];
                                    final int n9 = n8 >>> 20 & 0xFF;
                                    final long n10 = n8 & 0xFFFFF;
                                    final spz spz2 = spz;
                                    Label_1151: {
                                        Label_1144: {
                                            if (n9 <= 17) {
                                                final int n11 = a2[n + 2];
                                                final int n12 = 1 << (n11 >>> 20);
                                                final int n13 = n11 & 0xFFFFF;
                                                int n14;
                                                if (n13 != n4) {
                                                    if (n4 != 1048575) {
                                                        o3.putInt(o2, (long)n4, int1);
                                                    }
                                                    if (n13 != 1048575) {
                                                        int1 = o3.getInt(o2, (long)n13);
                                                    }
                                                    n4 = n13;
                                                    n14 = int1;
                                                }
                                                else {
                                                    n14 = int1;
                                                }
                                                Label_1003: {
                                                    int n16 = 0;
                                                    int n17 = 0;
                                                    Label_0941: {
                                                        Label_0930: {
                                                            Label_0785: {
                                                                Label_0650: {
                                                                    Label_0563: {
                                                                        int n15 = 0;
                                                                        Label_0552: {
                                                                            switch (n9) {
                                                                                case 16: {
                                                                                    if (n7 == 0) {
                                                                                        i = bhz.m(array2, i, ygz2);
                                                                                        o3.putLong(o, n10, ziz.b(ygz2.b));
                                                                                        int1 = (n14 | n12);
                                                                                        break Label_0563;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 15: {
                                                                                    if (n7 == 0) {
                                                                                        n15 = bhz.j(array2, i, ygz2);
                                                                                        o3.putInt(o2, n10, ziz.a(ygz2.a));
                                                                                        break Label_0552;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 12: {
                                                                                    if (n7 == 0) {
                                                                                        n15 = bhz.j(array2, i, ygz2);
                                                                                        o3.putInt(o2, n10, ygz2.a);
                                                                                        break Label_0552;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 10: {
                                                                                    if (n7 == 2) {
                                                                                        n15 = bhz.a(array2, i, ygz2);
                                                                                        o3.putObject(o2, n10, ygz2.c);
                                                                                        break Label_0552;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 9: {
                                                                                    if (n7 != 2) {
                                                                                        break;
                                                                                    }
                                                                                    n16 = bhz.d(spz2.m(n), array2, i, n2, ygz2);
                                                                                    final Object object = o3.getObject(o2, n10);
                                                                                    if (object == null) {
                                                                                        o3.putObject(o2, n10, ygz2.c);
                                                                                        break Label_0650;
                                                                                    }
                                                                                    o3.putObject(o2, n10, tmz.c(object, ygz2.c));
                                                                                    break Label_0650;
                                                                                }
                                                                                case 8: {
                                                                                    if (n7 == 2) {
                                                                                        if ((0x20000000 & n8) == 0x0) {
                                                                                            n16 = bhz.g(array2, i, ygz2);
                                                                                        }
                                                                                        else {
                                                                                            n16 = bhz.h(array2, i, ygz2);
                                                                                        }
                                                                                        o3.putObject(o2, n10, ygz2.c);
                                                                                        break Label_0650;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 7: {
                                                                                    if (n7 == 0) {
                                                                                        i = bhz.m(array2, i, ygz2);
                                                                                        hsz.m(o2, n10, ygz2.b != 0L);
                                                                                        break Label_0785;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 6:
                                                                                case 13: {
                                                                                    if (n7 == 5) {
                                                                                        o3.putInt(o2, n10, bhz.b(array2, i));
                                                                                        i += 4;
                                                                                        break Label_0785;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 5:
                                                                                case 14: {
                                                                                    if (n7 == 1) {
                                                                                        o3.putLong(o, n10, bhz.n(array2, i));
                                                                                        n16 = i + 8;
                                                                                        break Label_0930;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 4:
                                                                                case 11: {
                                                                                    if (n7 == 0) {
                                                                                        n16 = bhz.j(array2, i, ygz2);
                                                                                        o3.putInt(o2, n10, ygz2.a);
                                                                                        break Label_0930;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 2:
                                                                                case 3: {
                                                                                    if (n7 == 0) {
                                                                                        n16 = bhz.m(array2, i, ygz2);
                                                                                        o3.putLong(o, n10, ygz2.b);
                                                                                        n17 = (n14 | n12);
                                                                                        break Label_0941;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 1: {
                                                                                    if (n7 == 5) {
                                                                                        hsz.o(o2, n10, Float.intBitsToFloat(bhz.b(array2, i)));
                                                                                        n16 = i + 4;
                                                                                        break Label_0930;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 0: {
                                                                                    if (n7 == 1) {
                                                                                        hsz.n(o2, n10, Double.longBitsToDouble(bhz.n(array2, i)));
                                                                                        n18 = i + 8;
                                                                                        n19 = (n14 | n12);
                                                                                        spz = spz2;
                                                                                        break Label_1366;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break Label_1003;
                                                                        }
                                                                        i = n15;
                                                                        int1 = (n14 | n12);
                                                                    }
                                                                    break Label_1144;
                                                                }
                                                                break Label_0930;
                                                            }
                                                            int1 = (n14 | n12);
                                                            n3 = n;
                                                            break Label_1151;
                                                        }
                                                        n17 = (n14 | n12);
                                                    }
                                                    final int n20 = n17;
                                                    i = n16;
                                                    n3 = n;
                                                    int1 = n20;
                                                    break Label_1381;
                                                }
                                                final int n21 = n;
                                                int1 = n14;
                                                n = n4;
                                                n22 = n21;
                                                break Label_1017;
                                            }
                                            Label_1236: {
                                                if (n9 != 27) {
                                                    int n24 = 0;
                                                    Label_1292: {
                                                        int n23;
                                                        if (n9 <= 49) {
                                                            final int l = this.L(o, array, i, n2, a, n6, n7, n, n8, n9, n10, ygz);
                                                            if ((n23 = l) != i) {
                                                                n24 = l;
                                                                break Label_1292;
                                                            }
                                                        }
                                                        else if (n9 == 50) {
                                                            if (n7 != 2) {
                                                                break Label_1236;
                                                            }
                                                            this.I(o, n, n10);
                                                            throw null;
                                                        }
                                                        else {
                                                            final int j = this.J(o, array, i, n2, a, n6, n7, n8, n9, n10, n, ygz);
                                                            if ((n23 = j) != i) {
                                                                n24 = j;
                                                                break Label_1292;
                                                            }
                                                        }
                                                        i = n23;
                                                        break Label_1236;
                                                    }
                                                    final int n25 = n24;
                                                    n19 = int1;
                                                    n18 = n25;
                                                    break Label_1353;
                                                }
                                                if (n7 == 2) {
                                                    qmz w;
                                                    final qmz qmz = w = (qmz)o3.getObject(o2, n10);
                                                    if (!qmz.d()) {
                                                        final int size = ((List)qmz).size();
                                                        int n26;
                                                        if (size == 0) {
                                                            n26 = 10;
                                                        }
                                                        else {
                                                            n26 = size + size;
                                                        }
                                                        w = qmz.W(n26);
                                                        o3.putObject(o2, n10, w);
                                                    }
                                                    i = bhz.e(spz2.m(n), a, array, i, n2, w, ygz);
                                                    break Label_1144;
                                                }
                                            }
                                            final int n27 = n4;
                                            n28 = n;
                                            n = n27;
                                            break Label_1317;
                                        }
                                        n3 = n;
                                    }
                                    n = n6;
                                    continue;
                                }
                                n22 = 0;
                                n = n4;
                            }
                            n28 = n22;
                        }
                        final int k = bhz.i(a, array, i, n2, A(o), ygz);
                        final int n29 = n28;
                        n19 = int1;
                        n4 = n;
                        n18 = k;
                        n = n29;
                    }
                    spz = this;
                    array2 = array;
                    ygz2 = ygz;
                    o2 = o;
                }
                final int n30 = n19;
                i = n18;
                int1 = n30;
                n3 = n;
            }
            n = n6;
        }
        if (n4 != 1048575) {
            o3.putInt(o, (long)n4, int1);
        }
        if (i == n2) {
            return i;
        }
        throw zzkm.c();
    }
    
    public final int L(Object zzc, final byte[] array, int i, int j, int n, int n2, int n3, int intValue, final long n4, int n5, final long n6, final ygz ygz) throws IOException {
        int n7 = i;
        final Unsafe o = spz.o;
        qmz w;
        final qmz qmz = w = (qmz)o.getObject(zzc, n6);
        if (!qmz.d()) {
            final int size = ((List)qmz).size();
            int n8;
            if (size == 0) {
                n8 = 10;
            }
            else {
                n8 = size + size;
            }
            w = qmz.W(n8);
            o.putObject(zzc, n6, w);
        }
        Label_2612: {
            switch (n5) {
                default: {
                    n5 = n7;
                    if (n3 == 3) {
                        final nqz m = this.m(intValue);
                        n2 = ((n & 0xFFFFFFF8) | 0x4);
                        i = bhz.c(m, array, i, j, n2, ygz);
                        ((List<Object>)w).add(ygz.c);
                        while (i < j) {
                            n3 = bhz.j(array, i, ygz);
                            if (n != ygz.a) {
                                break;
                            }
                            i = bhz.c(m, array, n3, j, n2, ygz);
                            ((List<oiz>)w).add((oiz)ygz.c);
                        }
                        return i;
                    }
                    break;
                }
                case 34:
                case 48: {
                    if (n3 == 2) {
                        final xnz xnz = (xnz)w;
                        i = bhz.j(array, n7, ygz);
                        j = ygz.a + i;
                        while (i < j) {
                            i = bhz.m(array, i, ygz);
                            xnz.j(ziz.b(ygz.b));
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 0) {
                            final xnz xnz2 = (xnz)w;
                            i = bhz.m(array, n7, ygz);
                            xnz2.j(ziz.b(ygz.b));
                            while (i < j) {
                                n2 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                i = bhz.m(array, n2, ygz);
                                xnz2.j(ziz.b(ygz.b));
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 33:
                case 47: {
                    if (n3 == 2) {
                        final dmz dmz = (dmz)w;
                        i = bhz.j(array, n7, ygz);
                        j = ygz.a + i;
                        while (i < j) {
                            i = bhz.j(array, i, ygz);
                            dmz.j(ziz.a(ygz.a));
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 0) {
                            final dmz dmz2 = (dmz)w;
                            i = bhz.j(array, n7, ygz);
                            dmz2.j(ziz.a(ygz.a));
                            while (i < j) {
                                n2 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                i = bhz.j(array, n2, ygz);
                                dmz2.j(ziz.a(ygz.a));
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 30:
                case 44: {
                    if (n3 == 2) {
                        i = bhz.f(array, n7, w, ygz);
                    }
                    else {
                        n5 = n7;
                        if (n3 != 0) {
                            break;
                        }
                        i = bhz.l(n, array, i, j, w, ygz);
                    }
                    final bmz bmz = (bmz)zzc;
                    if ((zzc = bmz.zzc) == yrz.f) {
                        zzc = null;
                    }
                    final kmz l = this.l(intValue);
                    final xrz k = this.l;
                    final Class a = qqz.a;
                    Object o2;
                    if (l == null) {
                        o2 = zzc;
                    }
                    else if (w instanceof RandomAccess) {
                        n3 = ((List)w).size();
                        n = 0;
                        Object e;
                        for (j = 0; j < n3; ++j) {
                            intValue = (int)((List<oiz>)w).get(j);
                            if (l.o(intValue)) {
                                if (j != n) {
                                    ((List<oiz>)w).set(n, (oiz)intValue);
                                }
                                ++n;
                            }
                            else {
                                if ((e = zzc) == null) {
                                    e = k.e();
                                }
                                k.f(e, n2, (long)intValue);
                                zzc = e;
                            }
                        }
                        if (n == n3) {
                            o2 = zzc;
                        }
                        else {
                            ((List<oiz>)w).subList(n, n3).clear();
                            o2 = zzc;
                        }
                    }
                    else {
                        final Iterator<oiz> iterator = ((List<oiz>)w).iterator();
                        while (true) {
                            o2 = zzc;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            j = iterator.next();
                            if (l.o(j)) {
                                continue;
                            }
                            Object e2;
                            if ((e2 = zzc) == null) {
                                e2 = k.e();
                            }
                            k.f(e2, n2, (long)j);
                            iterator.remove();
                            zzc = e2;
                        }
                    }
                    if (o2 == null) {
                        return i;
                    }
                    bmz.zzc = (yrz)o2;
                    return i;
                }
                case 28: {
                    n5 = n7;
                    if (n3 != 2) {
                        break;
                    }
                    i = bhz.j(array, n7, ygz);
                    n2 = ygz.a;
                    if (n2 < 0) {
                        throw zzkm.b();
                    }
                    if (n2 <= array.length - i) {
                        while (true) {
                            Label_1023: {
                                if (n2 != 0) {
                                    ((List<oiz>)w).add(oiz.q(array, i, n2));
                                    break Label_1023;
                                }
                                ((List<oiz>)w).add((oiz)oiz.G0);
                                while (i < j) {
                                    n2 = bhz.j(array, i, ygz);
                                    if (n != ygz.a) {
                                        break;
                                    }
                                    i = bhz.j(array, n2, ygz);
                                    n2 = ygz.a;
                                    if (n2 < 0) {
                                        throw zzkm.b();
                                    }
                                    if (n2 > array.length - i) {
                                        throw zzkm.d();
                                    }
                                    if (n2 != 0) {
                                        ((List<oiz>)w).add(oiz.q(array, i, n2));
                                        break Label_1023;
                                    }
                                    ((List<oiz>)w).add((oiz)oiz.G0);
                                }
                                return i;
                            }
                            i += n2;
                            continue;
                        }
                    }
                    throw zzkm.d();
                }
                case 27: {
                    if (n3 != 2) {
                        n5 = n7;
                        break;
                    }
                    return bhz.e(this.m(intValue), n, array, i, j, w, ygz);
                }
                case 26: {
                    n5 = n7;
                    if (n3 != 2) {
                        break;
                    }
                    if ((n4 & 0x20000000L) == 0x0L) {
                        i = bhz.j(array, n7, ygz);
                        n2 = ygz.a;
                        if (n2 >= 0) {
                            while (true) {
                                Label_1257: {
                                    if (n2 != 0) {
                                        ((List<String>)w).add(new String(array, i, n2, tmz.a));
                                        break Label_1257;
                                    }
                                    ((List<String>)w).add("");
                                    while (true) {
                                        n5 = i;
                                        if (i >= j) {
                                            break Label_2612;
                                        }
                                        n2 = bhz.j(array, i, ygz);
                                        n5 = i;
                                        if (n != ygz.a) {
                                            break Label_2612;
                                        }
                                        i = bhz.j(array, n2, ygz);
                                        n2 = ygz.a;
                                        if (n2 < 0) {
                                            throw zzkm.b();
                                        }
                                        if (n2 != 0) {
                                            ((List<String>)w).add(new String(array, i, n2, tmz.a));
                                            break;
                                        }
                                        ((List<String>)w).add("");
                                    }
                                }
                                i += n2;
                                continue;
                            }
                        }
                        throw zzkm.b();
                    }
                    else {
                        i = bhz.j(array, n7, ygz);
                        n3 = ygz.a;
                        if (n3 < 0) {
                            throw zzkm.b();
                        }
                        if (n3 == 0) {
                            ((List<String>)w).add("");
                        }
                        else {
                            n2 = i + n3;
                            if (!ctz.d(array, i, n2)) {
                                throw zzkm.a();
                            }
                            ((List<String>)w).add(new String(array, i, n3, tmz.a));
                            i = n2;
                        }
                        while (true) {
                            n5 = i;
                            if (i >= j) {
                                break Label_2612;
                            }
                            n2 = bhz.j(array, i, ygz);
                            n5 = i;
                            if (n != ygz.a) {
                                break Label_2612;
                            }
                            n2 = bhz.j(array, n2, ygz);
                            n3 = ygz.a;
                            if (n3 < 0) {
                                throw zzkm.b();
                            }
                            if (n3 == 0) {
                                ((List<String>)w).add("");
                                i = n2;
                            }
                            else {
                                i = n2 + n3;
                                if (!ctz.d(array, n2, i)) {
                                    throw zzkm.a();
                                }
                                ((List<String>)w).add(new String(array, n2, n3, tmz.a));
                            }
                        }
                    }
                    break;
                }
                case 25:
                case 42: {
                    if (n3 == 2) {
                        final ehz ehz = (ehz)w;
                        i = bhz.j(array, n7, ygz);
                        j = ygz.a + i;
                        while (i < j) {
                            i = bhz.m(array, i, ygz);
                            ehz.g(ygz.b != 0L);
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 0) {
                            final ehz ehz2 = (ehz)w;
                            i = bhz.m(array, n7, ygz);
                            ehz2.g(ygz.b != 0L);
                            while (i < j) {
                                n2 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                i = bhz.m(array, n2, ygz);
                                ehz2.g(ygz.b != 0L);
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 24:
                case 31:
                case 41:
                case 45: {
                    if (n3 == 2) {
                        final dmz dmz3 = (dmz)w;
                        for (i = bhz.j(array, n7, ygz), j = ygz.a + i; i < j; i += 4) {
                            dmz3.j(bhz.b(array, i));
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 5) {
                            final dmz dmz4 = (dmz)w;
                            dmz4.j(bhz.b(array, i));
                            while (true) {
                                i = n7 + 4;
                                if (i >= j) {
                                    break;
                                }
                                n7 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                dmz4.j(bhz.b(array, n7));
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 23:
                case 32:
                case 40:
                case 46: {
                    if (n3 == 2) {
                        final xnz xnz3 = (xnz)w;
                        for (i = bhz.j(array, n7, ygz), j = ygz.a + i; i < j; i += 8) {
                            xnz3.j(bhz.n(array, i));
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 1) {
                            final xnz xnz4 = (xnz)w;
                            xnz4.j(bhz.n(array, i));
                            while (true) {
                                i = n7 + 8;
                                if (i >= j) {
                                    break;
                                }
                                n7 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                xnz4.j(bhz.n(array, n7));
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 22:
                case 29:
                case 39:
                case 43: {
                    if (n3 == 2) {
                        i = bhz.f(array, n7, w, ygz);
                        return i;
                    }
                    if (n3 != 0) {
                        n5 = n7;
                        break;
                    }
                    return bhz.l(n, array, i, j, w, ygz);
                }
                case 20:
                case 21:
                case 37:
                case 38: {
                    if (n3 == 2) {
                        final xnz xnz5 = (xnz)w;
                        i = bhz.j(array, n7, ygz);
                        j = ygz.a + i;
                        while (i < j) {
                            i = bhz.m(array, i, ygz);
                            xnz5.j(ygz.b);
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 0) {
                            final xnz xnz6 = (xnz)w;
                            i = bhz.m(array, n7, ygz);
                            xnz6.j(ygz.b);
                            while (i < j) {
                                n2 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                i = bhz.m(array, n2, ygz);
                                xnz6.j(ygz.b);
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 19:
                case 36: {
                    if (n3 == 2) {
                        final qkz qkz = (qkz)w;
                        for (i = bhz.j(array, n7, ygz), j = ygz.a + i; i < j; i += 4) {
                            qkz.g(Float.intBitsToFloat(bhz.b(array, i)));
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 5) {
                            final qkz qkz2 = (qkz)w;
                            qkz2.g(Float.intBitsToFloat(bhz.b(array, i)));
                            while (true) {
                                i = n7 + 4;
                                if (i >= j) {
                                    break;
                                }
                                n7 = bhz.j(array, i, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                qkz2.g(Float.intBitsToFloat(bhz.b(array, n7)));
                            }
                            return i;
                        }
                        break;
                    }
                    break;
                }
                case 18:
                case 35: {
                    if (n3 == 2) {
                        final ojz ojz = (ojz)w;
                        for (i = bhz.j(array, n7, ygz), j = ygz.a + i; i < j; i += 8) {
                            ojz.g(Double.longBitsToDouble(bhz.n(array, i)));
                        }
                        if (i == j) {
                            return i;
                        }
                        throw zzkm.d();
                    }
                    else {
                        n5 = n7;
                        if (n3 == 1) {
                            final ojz ojz2 = (ojz)w;
                            ojz2.g(Double.longBitsToDouble(bhz.n(array, i)));
                            i = n7;
                            while (true) {
                                n2 = i + 8;
                                if (n2 >= j) {
                                    break;
                                }
                                i = bhz.j(array, n2, ygz);
                                if (n != ygz.a) {
                                    break;
                                }
                                ojz2.g(Double.longBitsToDouble(bhz.n(array, i)));
                            }
                            return n2;
                        }
                        break;
                    }
                    break;
                }
            }
        }
        i = n5;
        return i;
    }
    
    public final int M(final int n) {
        return this.a[n + 2];
    }
    
    public final int N(final int n, int i) {
        int n2 = this.a.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int n5 = this.a[n4];
            if (n == n5) {
                return n4;
            }
            if (n < n5) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    public final int a(final int n) {
        return this.a[n + 1];
    }
    
    public final int c(final Object o) {
        int n;
        if (this.g) {
            n = this.G(o);
        }
        else {
            n = this.F(o);
        }
        return n;
    }
    
    public final void d(final Object o) {
        int i = this.i;
        int j;
        while (true) {
            j = this.j;
            if (i >= j) {
                break;
            }
            final long n = this.a(this.h[i]) & 0xFFFFF;
            final Object k = hsz.j(o, n);
            if (k != null) {
                ((zoz)k).F0 = false;
                hsz.r(o, n, k);
            }
            ++i;
        }
        for (int length = this.h.length, l = j; l < length; ++l) {
            this.k.a(o, (long)this.h[l]);
        }
        this.l.g(o);
        if (this.f) {
            this.m.b(o);
        }
    }
    
    public final void e(final Object o, final ftz ftz) throws IOException {
        if (!this.g) {
            this.t(o, ftz);
            return;
        }
        if (!this.f) {
            for (int length = this.a.length, i = 0; i < length; i += 3) {
                final int a = this.a(i);
                final int n = this.a[i];
                switch (a >>> 20 & 0xFF) {
                    case 68: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).l(n, hsz.j(o, (long)(a & 0xFFFFF)), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).b(n, b(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).a(n, H(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).q(n, b(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).p(n, H(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).h(n, H(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).c(n, H(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).f(n, (oiz)hsz.j(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).o(n, hsz.j(o, (long)(a & 0xFFFFF)), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.w(o, n, i)) {
                            y(n, hsz.j(o, (long)(a & 0xFFFFF)), ftz);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).e(n, x(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).i(n, H(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).j(n, b(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).m(n, H(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).d(n, b(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).n(n, b(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).k(n, E(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.w(o, n, i)) {
                            ((mjz)ftz).g(n, D(o, a & 0xFFFFF));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        if (hsz.j(o, (long)(a & 0xFFFFF)) == null) {
                            break;
                        }
                        final xoz xoz = (xoz)this.n(i);
                        throw null;
                    }
                    case 49: {
                        qqz.h(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, this.m(i));
                        break;
                    }
                    case 48: {
                        qqz.o(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 47: {
                        qqz.n(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 46: {
                        qqz.m(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 45: {
                        qqz.l(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 44: {
                        qqz.d(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 43: {
                        qqz.q(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 42: {
                        qqz.a(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 41: {
                        qqz.e(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 40: {
                        qqz.f(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 39: {
                        qqz.i(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 38: {
                        qqz.r(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 37: {
                        qqz.j(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 36: {
                        qqz.g(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 35: {
                        qqz.c(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, true);
                        break;
                    }
                    case 34: {
                        qqz.o(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 33: {
                        qqz.n(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 32: {
                        qqz.m(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 31: {
                        qqz.l(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 30: {
                        qqz.d(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 29: {
                        qqz.q(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 28: {
                        qqz.b(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz);
                        break;
                    }
                    case 27: {
                        qqz.k(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, this.m(i));
                        break;
                    }
                    case 26: {
                        qqz.p(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz);
                        break;
                    }
                    case 25: {
                        qqz.a(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 24: {
                        qqz.e(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 23: {
                        qqz.f(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 22: {
                        qqz.i(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 21: {
                        qqz.r(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 20: {
                        qqz.j(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 19: {
                        qqz.g(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 18: {
                        qqz.c(n, (List)hsz.j(o, (long)(a & 0xFFFFF)), ftz, false);
                        break;
                    }
                    case 17: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).l(n, hsz.j(o, (long)(a & 0xFFFFF)), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).b(n, hsz.h(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).a(n, hsz.g(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).q(n, hsz.h(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).p(n, hsz.g(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).h(n, hsz.g(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).c(n, hsz.g(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).f(n, (oiz)hsz.j(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).o(n, hsz.j(o, (long)(a & 0xFFFFF)), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if (this.v(o, i)) {
                            y(n, hsz.j(o, (long)(a & 0xFFFFF)), ftz);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).e(n, hsz.v(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).i(n, hsz.g(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).j(n, hsz.h(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).m(n, hsz.g(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).d(n, hsz.h(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).n(n, hsz.h(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).k(n, hsz.f(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (this.v(o, i)) {
                            ((mjz)ftz).g(n, hsz.e(o, (long)(a & 0xFFFFF)));
                            break;
                        }
                        break;
                    }
                }
            }
            final xrz l = this.l;
            l.i(l.c(o), ftz);
            return;
        }
        this.m.a(o);
        throw null;
    }
    
    public final Object f() {
        return ((bmz)this.e).r(4);
    }
    
    public final int g(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int a = this.a(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & a;
            int n4 = 37;
            int n5 = 0;
            Label_1281: {
                int n6 = 0;
                int n7 = 0;
                Label_1277: {
                    switch (a >>> 20 & 0xFF) {
                        default: {
                            n5 = n;
                            break Label_1281;
                        }
                        case 68: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = hsz.j(o, n3).hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 67: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.b(b(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 66: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = H(o, n3);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 65: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.b(b(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 64: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = H(o, n3);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 63: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = H(o, n3);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 62: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = H(o, n3);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 61: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = hsz.j(o, n3).hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 60: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = hsz.j(o, n3).hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 59: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = ((String)hsz.j(o, n3)).hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 58: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.a(x(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 57: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = H(o, n3);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 56: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.b(b(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 55: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = H(o, n3);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 54: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.b(b(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 53: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.b(b(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 52: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = Float.floatToIntBits(E(o, n3));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 51: {
                            n5 = n;
                            if (this.w(o, n2, i)) {
                                n6 = n * 53;
                                n7 = tmz.b(Double.doubleToLongBits(D(o, n3)));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 50: {
                            n6 = n * 53;
                            n7 = hsz.j(o, n3).hashCode();
                            break Label_1277;
                        }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49: {
                            n6 = n * 53;
                            n7 = hsz.j(o, n3).hashCode();
                            break Label_1277;
                        }
                        case 17: {
                            final Object j = hsz.j(o, n3);
                            if (j != null) {
                                n4 = j.hashCode();
                                break;
                            }
                            break;
                        }
                        case 16: {
                            n6 = n * 53;
                            n7 = tmz.b(hsz.h(o, n3));
                            break Label_1277;
                        }
                        case 15: {
                            n6 = n * 53;
                            n7 = hsz.g(o, n3);
                            break Label_1277;
                        }
                        case 14: {
                            n6 = n * 53;
                            n7 = tmz.b(hsz.h(o, n3));
                            break Label_1277;
                        }
                        case 13: {
                            n6 = n * 53;
                            n7 = hsz.g(o, n3);
                            break Label_1277;
                        }
                        case 12: {
                            n6 = n * 53;
                            n7 = hsz.g(o, n3);
                            break Label_1277;
                        }
                        case 11: {
                            n6 = n * 53;
                            n7 = hsz.g(o, n3);
                            break Label_1277;
                        }
                        case 10: {
                            n6 = n * 53;
                            n7 = hsz.j(o, n3).hashCode();
                            break Label_1277;
                        }
                        case 9: {
                            final Object k = hsz.j(o, n3);
                            if (k != null) {
                                n4 = k.hashCode();
                                break;
                            }
                            break;
                        }
                        case 8: {
                            n6 = n * 53;
                            n7 = ((String)hsz.j(o, n3)).hashCode();
                            break Label_1277;
                        }
                        case 7: {
                            n6 = n * 53;
                            n7 = tmz.a(hsz.v(o, n3));
                            break Label_1277;
                        }
                        case 6: {
                            n6 = n * 53;
                            n7 = hsz.g(o, n3);
                            break Label_1277;
                        }
                        case 5: {
                            n6 = n * 53;
                            n7 = tmz.b(hsz.h(o, n3));
                            break Label_1277;
                        }
                        case 4: {
                            n6 = n * 53;
                            n7 = hsz.g(o, n3);
                            break Label_1277;
                        }
                        case 3: {
                            n6 = n * 53;
                            n7 = tmz.b(hsz.h(o, n3));
                            break Label_1277;
                        }
                        case 2: {
                            n6 = n * 53;
                            n7 = tmz.b(hsz.h(o, n3));
                            break Label_1277;
                        }
                        case 1: {
                            n6 = n * 53;
                            n7 = Float.floatToIntBits(hsz.f(o, n3));
                            break Label_1277;
                        }
                        case 0: {
                            n6 = n * 53;
                            n7 = tmz.b(Double.doubleToLongBits(hsz.e(o, n3)));
                            break Label_1277;
                        }
                    }
                    n5 = n * 53 + n4;
                    break Label_1281;
                }
                n5 = n7 + n6;
            }
            i += 3;
            n = n5;
        }
        final int hashCode = this.l.c(o).hashCode();
        if (!this.f) {
            return hashCode + n * 53;
        }
        this.m.a(o);
        throw null;
    }
    
    public final void h(final Object o, final byte[] array, final int n, final int n2, final ygz ygz) throws IOException {
        if (this.g) {
            this.K(o, array, n, n2, ygz);
            return;
        }
        this.z(o, array, n, n2, 0, ygz);
    }
    
    public final void i(final Object o, final Object o2) {
        Objects.requireNonNull(o2);
        for (int i = 0; i < this.a.length; i += 3) {
            final int a = this.a(i);
            final long n = 0xFFFFF & a;
            final int n2 = this.a[i];
            switch (a >>> 20 & 0xFF) {
                case 68: {
                    this.q(o, o2, i);
                    break;
                }
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67: {
                    if (this.w(o2, n2, i)) {
                        hsz.r(o, n, hsz.j(o2, n));
                        this.s(o, n2, i);
                        break;
                    }
                    break;
                }
                case 60: {
                    this.q(o, o2, i);
                    break;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59: {
                    if (this.w(o2, n2, i)) {
                        hsz.r(o, n, hsz.j(o2, n));
                        this.s(o, n2, i);
                        break;
                    }
                    break;
                }
                case 50: {
                    final Class a2 = qqz.a;
                    hsz.r(o, n, cpz.b(hsz.j(o, n), hsz.j(o2, n)));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    this.k.b(o, o2, n);
                    break;
                }
                case 17: {
                    this.p(o, o2, i);
                    break;
                }
                case 16: {
                    if (this.v(o2, i)) {
                        hsz.q(o, n, hsz.h(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 15: {
                    if (this.v(o2, i)) {
                        hsz.p(o, n, hsz.g(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 14: {
                    if (this.v(o2, i)) {
                        hsz.q(o, n, hsz.h(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 13: {
                    if (this.v(o2, i)) {
                        hsz.p(o, n, hsz.g(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 12: {
                    if (this.v(o2, i)) {
                        hsz.p(o, n, hsz.g(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (this.v(o2, i)) {
                        hsz.p(o, n, hsz.g(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 10: {
                    if (this.v(o2, i)) {
                        hsz.r(o, n, hsz.j(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.p(o, o2, i);
                    break;
                }
                case 8: {
                    if (this.v(o2, i)) {
                        hsz.r(o, n, hsz.j(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 7: {
                    if (this.v(o2, i)) {
                        hsz.m(o, n, hsz.v(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.v(o2, i)) {
                        hsz.p(o, n, hsz.g(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.v(o2, i)) {
                        hsz.q(o, n, hsz.h(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.v(o2, i)) {
                        hsz.p(o, n, hsz.g(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.v(o2, i)) {
                        hsz.q(o, n, hsz.h(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.v(o2, i)) {
                        hsz.q(o, n, hsz.h(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.v(o2, i)) {
                        hsz.o(o, n, hsz.f(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.v(o2, i)) {
                        hsz.n(o, n, hsz.e(o2, n));
                        this.r(o, i);
                        break;
                    }
                    break;
                }
            }
        }
        final xrz l = this.l;
        final Class a3 = qqz.a;
        l.h(o, l.d(l.c(o), l.c(o2)));
        if (!this.f) {
            return;
        }
        this.m.a(o2);
        throw null;
    }
    
    public final boolean j(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int a = this.a(i);
            final long n = a & 0xFFFFF;
            boolean b = false;
            switch (a >>> 20 & 0xFF) {
                default: {
                    continue;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68: {
                    final long n2 = this.M(i) & 0xFFFFF;
                    if (hsz.g(o, n2) != hsz.g(o2, n2)) {
                        return false;
                    }
                    if (!qqz.s(hsz.j(o, n), hsz.j(o2, n))) {
                        return false;
                    }
                    continue;
                }
                case 50: {
                    b = qqz.s(hsz.j(o, n), hsz.j(o2, n));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    b = qqz.s(hsz.j(o, n), hsz.j(o2, n));
                    break;
                }
                case 17: {
                    if (this.u(o, o2, i) && qqz.s(hsz.j(o, n), hsz.j(o2, n))) {
                        continue;
                    }
                    return false;
                }
                case 16: {
                    if (this.u(o, o2, i) && hsz.h(o, n) == hsz.h(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 15: {
                    if (this.u(o, o2, i) && hsz.g(o, n) == hsz.g(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 14: {
                    if (this.u(o, o2, i) && hsz.h(o, n) == hsz.h(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 13: {
                    if (this.u(o, o2, i) && hsz.g(o, n) == hsz.g(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 12: {
                    if (this.u(o, o2, i) && hsz.g(o, n) == hsz.g(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 11: {
                    if (this.u(o, o2, i) && hsz.g(o, n) == hsz.g(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 10: {
                    if (this.u(o, o2, i) && qqz.s(hsz.j(o, n), hsz.j(o2, n))) {
                        continue;
                    }
                    return false;
                }
                case 9: {
                    if (this.u(o, o2, i) && qqz.s(hsz.j(o, n), hsz.j(o2, n))) {
                        continue;
                    }
                    return false;
                }
                case 8: {
                    if (this.u(o, o2, i) && qqz.s(hsz.j(o, n), hsz.j(o2, n))) {
                        continue;
                    }
                    return false;
                }
                case 7: {
                    if (this.u(o, o2, i) && hsz.v(o, n) == hsz.v(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 6: {
                    if (this.u(o, o2, i) && hsz.g(o, n) == hsz.g(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 5: {
                    if (this.u(o, o2, i) && hsz.h(o, n) == hsz.h(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 4: {
                    if (this.u(o, o2, i) && hsz.g(o, n) == hsz.g(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 3: {
                    if (this.u(o, o2, i) && hsz.h(o, n) == hsz.h(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 2: {
                    if (this.u(o, o2, i) && hsz.h(o, n) == hsz.h(o2, n)) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    if (this.u(o, o2, i) && Float.floatToIntBits(hsz.f(o, n)) == Float.floatToIntBits(hsz.f(o2, n))) {
                        continue;
                    }
                    return false;
                }
                case 0: {
                    if (this.u(o, o2, i) && Double.doubleToLongBits(hsz.e(o, n)) == Double.doubleToLongBits(hsz.e(o2, n))) {
                        continue;
                    }
                    return false;
                }
            }
            if (!b) {
                return false;
            }
        }
        if (!this.l.c(o).equals(this.l.c(o2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(o);
        this.m.a(o2);
        throw null;
    }
    
    public final boolean k(final Object o) {
        int n = 0;
        int n2 = 1048575;
        int int1 = 0;
        while (true) {
            final int i = this.i;
            final int n3 = 1;
            if (n < i) {
                final int n4 = this.h[n];
                final int n5 = this.a[n4];
                final int a = this.a(n4);
                final int n6 = this.a[n4 + 2];
                final int n7 = n6 & 0xFFFFF;
                final int n8 = 1 << (n6 >>> 20);
                int n9 = n2;
                int n10 = int1;
                if (n7 != n2) {
                    if (n7 != 1048575) {
                        int1 = spz.o.getInt(o, (long)n7);
                    }
                    n9 = n7;
                    n10 = int1;
                }
                if ((0x10000000 & a) != 0x0) {
                    boolean v;
                    if (n9 == 1048575) {
                        v = this.v(o, n4);
                    }
                    else {
                        v = ((n10 & n8) != 0x0);
                    }
                    if (!v) {
                        return false;
                    }
                }
                final int n11 = a >>> 20 & 0xFF;
                Label_0435: {
                    if (n11 != 9 && n11 != 17) {
                        if (n11 != 27) {
                            if (n11 != 60 && n11 != 68) {
                                if (n11 != 49) {
                                    if (n11 != 50) {
                                        break Label_0435;
                                    }
                                    if (((zoz)hsz.j(o, (long)(a & 0xFFFFF))).isEmpty()) {
                                        break Label_0435;
                                    }
                                    final xoz xoz = (xoz)this.n(n4);
                                    throw null;
                                }
                            }
                            else {
                                if (this.w(o, n5, n4) && !this.m(n4).k(hsz.j(o, (long)(a & 0xFFFFF)))) {
                                    return false;
                                }
                                break Label_0435;
                            }
                        }
                        final List list = (List)hsz.j(o, (long)(a & 0xFFFFF));
                        if (!list.isEmpty()) {
                            final nqz m = this.m(n4);
                            for (int j = 0; j < list.size(); ++j) {
                                if (!m.k(list.get(j))) {
                                    return false;
                                }
                            }
                        }
                    }
                    else {
                        int v2;
                        if (n9 == 1048575) {
                            v2 = (this.v(o, n4) ? 1 : 0);
                        }
                        else if ((n10 & n8) != 0x0) {
                            v2 = n3;
                        }
                        else {
                            v2 = 0;
                        }
                        if (v2 != 0 && !this.m(n4).k(hsz.j(o, (long)(a & 0xFFFFF)))) {
                            return false;
                        }
                    }
                }
                ++n;
                n2 = n9;
                int1 = n10;
            }
            else {
                if (!this.f) {
                    return true;
                }
                this.m.a(o);
                throw null;
            }
        }
    }
    
    public final kmz l(int n) {
        n /= 3;
        return (kmz)this.b[n + n + 1];
    }
    
    public final nqz m(int n) {
        n /= 3;
        n += n;
        final Object[] b = this.b;
        final nqz nqz = (nqz)b[n];
        if (nqz != null) {
            return nqz;
        }
        return (nqz)(this.b[n] = fqz.c.a((Class)b[n + 1]));
    }
    
    public final Object n(int n) {
        n /= 3;
        return this.b[n + n];
    }
    
    public final void p(final Object o, Object j, final int n) {
        final long n2 = this.a(n) & 0xFFFFF;
        if (!this.v(j, n)) {
            return;
        }
        final Object i = hsz.j(o, n2);
        j = hsz.j(j, n2);
        if (i != null && j != null) {
            hsz.r(o, n2, tmz.c(i, j));
            this.r(o, n);
            return;
        }
        if (j != null) {
            hsz.r(o, n2, j);
            this.r(o, n);
        }
    }
    
    public final void q(final Object o, Object j, final int n) {
        final int a = this.a(n);
        final int n2 = this.a[n];
        final long n3 = a & 0xFFFFF;
        if (!this.w(j, n2, n)) {
            return;
        }
        Object i;
        if (this.w(o, n2, n)) {
            i = hsz.j(o, n3);
        }
        else {
            i = null;
        }
        j = hsz.j(j, n3);
        if (i != null && j != null) {
            hsz.r(o, n3, tmz.c(i, j));
            this.s(o, n2, n);
            return;
        }
        if (j != null) {
            hsz.r(o, n3, j);
            this.s(o, n2, n);
        }
    }
    
    public final void r(final Object o, int m) {
        m = this.M(m);
        final long n = 0xFFFFF & m;
        if (n == 1048575L) {
            return;
        }
        hsz.p(o, n, 1 << (m >>> 20) | hsz.g(o, n));
    }
    
    public final void s(final Object o, final int n, final int n2) {
        hsz.p(o, (long)(this.M(n2) & 0xFFFFF), n);
    }
    
    public final void t(final Object o, final ftz ftz) throws IOException {
        if (!this.f) {
            final int length = this.a.length;
            final Unsafe o2 = spz.o;
            int i = 0;
            int n = 1048575;
            int int1 = 0;
            while (i < length) {
                final int a = this.a(i);
                final int[] a2 = this.a;
                final int n2 = a2[i];
                final int n3 = a >>> 20 & 0xFF;
                int n8;
                if (n3 <= 17) {
                    final int n4 = a2[i + 2];
                    final int n5 = n4 & 0xFFFFF;
                    int n6;
                    if (n5 != (n6 = n)) {
                        int1 = o2.getInt(o, (long)n5);
                        n6 = n5;
                    }
                    final int n7 = 1 << (n4 >>> 20);
                    n = n6;
                    n8 = n7;
                }
                else {
                    n8 = 0;
                }
                final long n9 = a & 0xFFFFF;
                switch (n3) {
                    case 68: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).l(n2, o2.getObject(o, n9), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).b(n2, b(o, n9));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).a(n2, H(o, n9));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).q(n2, b(o, n9));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).p(n2, H(o, n9));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).h(n2, H(o, n9));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).c(n2, H(o, n9));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).f(n2, (oiz)o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).o(n2, o2.getObject(o, n9), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.w(o, n2, i)) {
                            y(n2, o2.getObject(o, n9), ftz);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).e(n2, x(o, n9));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).i(n2, H(o, n9));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).j(n2, b(o, n9));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).m(n2, H(o, n9));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).d(n2, b(o, n9));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).n(n2, b(o, n9));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).k(n2, E(o, n9));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.w(o, n2, i)) {
                            ((mjz)ftz).g(n2, D(o, n9));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        if (o2.getObject(o, n9) == null) {
                            break;
                        }
                        final xoz xoz = (xoz)this.n(i);
                        throw null;
                    }
                    case 49: {
                        qqz.h(this.a[i], (List)o2.getObject(o, n9), ftz, this.m(i));
                        break;
                    }
                    case 48: {
                        qqz.o(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 47: {
                        qqz.n(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 46: {
                        qqz.m(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 45: {
                        qqz.l(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 44: {
                        qqz.d(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 43: {
                        qqz.q(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 42: {
                        qqz.a(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 41: {
                        qqz.e(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 40: {
                        qqz.f(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 39: {
                        qqz.i(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 38: {
                        qqz.r(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 37: {
                        qqz.j(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 36: {
                        qqz.g(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 35: {
                        qqz.c(this.a[i], (List)o2.getObject(o, n9), ftz, true);
                        break;
                    }
                    case 34: {
                        qqz.o(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 33: {
                        qqz.n(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 32: {
                        qqz.m(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 31: {
                        qqz.l(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 30: {
                        qqz.d(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 29: {
                        qqz.q(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 28: {
                        qqz.b(this.a[i], (List)o2.getObject(o, n9), ftz);
                        break;
                    }
                    case 27: {
                        qqz.k(this.a[i], (List)o2.getObject(o, n9), ftz, this.m(i));
                        break;
                    }
                    case 26: {
                        qqz.p(this.a[i], (List)o2.getObject(o, n9), ftz);
                        break;
                    }
                    case 25: {
                        qqz.a(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 24: {
                        qqz.e(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 23: {
                        qqz.f(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 22: {
                        qqz.i(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 21: {
                        qqz.r(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 20: {
                        qqz.j(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 19: {
                        qqz.g(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 18: {
                        qqz.c(this.a[i], (List)o2.getObject(o, n9), ftz, false);
                        break;
                    }
                    case 17: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).l(n2, o2.getObject(o, n9), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).b(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).a(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).q(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).p(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).h(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).c(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).f(n2, (oiz)o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).o(n2, o2.getObject(o, n9), this.m(i));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if ((int1 & n8) != 0x0) {
                            y(n2, o2.getObject(o, n9), ftz);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).e(n2, hsz.v(o, n9));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).i(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).j(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).m(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).d(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).n(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).k(n2, hsz.f(o, n9));
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if ((int1 & n8) != 0x0) {
                            ((mjz)ftz).g(n2, hsz.e(o, n9));
                            break;
                        }
                        break;
                    }
                }
                i += 3;
            }
            final xrz l = this.l;
            l.i(l.c(o), ftz);
            return;
        }
        this.m.a(o);
        throw null;
    }
    
    public final boolean u(final Object o, final Object o2, final int n) {
        return this.v(o, n) == this.v(o2, n);
    }
    
    public final boolean v(Object j, int a) {
        final int m = this.M(a);
        final long n = m & 0xFFFFF;
        if (n != 1048575L) {
            return (hsz.g(j, n) & 1 << (m >>> 20)) != 0x0;
        }
        a = this.a(a);
        final long n2 = a & 0xFFFFF;
        switch (a >>> 20 & 0xFF) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return hsz.j(j, n2) != null;
            }
            case 16: {
                return hsz.h(j, n2) != 0L;
            }
            case 15: {
                return hsz.g(j, n2) != 0;
            }
            case 14: {
                return hsz.h(j, n2) != 0L;
            }
            case 13: {
                return hsz.g(j, n2) != 0;
            }
            case 12: {
                return hsz.g(j, n2) != 0;
            }
            case 11: {
                return hsz.g(j, n2) != 0;
            }
            case 10: {
                return !oiz.G0.equals(hsz.j(j, n2));
            }
            case 9: {
                return hsz.j(j, n2) != null;
            }
            case 8: {
                j = hsz.j(j, n2);
                if (j instanceof String) {
                    return !((String)j).isEmpty();
                }
                if (j instanceof oiz) {
                    return !oiz.G0.equals(j);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return hsz.v(j, n2);
            }
            case 6: {
                return hsz.g(j, n2) != 0;
            }
            case 5: {
                return hsz.h(j, n2) != 0L;
            }
            case 4: {
                return hsz.g(j, n2) != 0;
            }
            case 3: {
                return hsz.h(j, n2) != 0L;
            }
            case 2: {
                return hsz.h(j, n2) != 0L;
            }
            case 1: {
                return Float.floatToRawIntBits(hsz.f(j, n2)) != 0;
            }
            case 0: {
                return Double.doubleToRawLongBits(hsz.e(j, n2)) != 0L;
            }
        }
    }
    
    public final boolean w(final Object o, final int n, final int n2) {
        return hsz.g(o, (long)(this.M(n2) & 0xFFFFF)) == n;
    }
    
    public final int z(Object o, final byte[] array, int i, final int n, int n2, final ygz ygz) throws IOException {
        spz spz = this;
        ygz ygz2 = ygz;
        final Unsafe o2 = spz.o;
        byte[] array2 = array;
        int n3 = n2;
        int n4 = n;
        int n5 = -1;
        int n6 = 0;
        int n7 = 1048575;
        int n8 = 0;
        int n9 = 0;
        spz spz2 = null;
        while (true) {
            final Object o3 = o;
            if (i >= n4) {
                o = o3;
                spz2 = spz;
                n2 = i;
                break;
            }
            final int n10 = i + 1;
            final byte b = (byte)(i = array2[i]);
            int k = n10;
            if (b < 0) {
                k = bhz.k((int)b, array2, n10, ygz2);
                i = ygz2.a;
            }
            final int n11 = i >>> 3;
            final int n12 = i & 0x7;
            int n14;
            if (n11 > n5) {
                final int n13 = n6 / 3;
                if (n11 >= spz.c && n11 <= spz.d) {
                    n14 = spz.N(n11, n13);
                }
                else {
                    n14 = -1;
                }
            }
            else if (n11 >= spz.c && n11 <= spz.d) {
                n14 = spz.N(n11, 0);
            }
            else {
                n14 = -1;
            }
            int n38 = 0;
            int n39 = 0;
            int n40 = 0;
            int n41 = 0;
            Label_1685: {
                if (n14 != -1) {
                    final int[] a = spz.a;
                    final int n15 = a[n14 + 1];
                    final int n16 = n15 >>> 20 & 0xFF;
                    final long n17 = n15 & 0xFFFFF;
                    int int1 = 0;
                    int n28 = 0;
                    Label_1460: {
                        if (n16 <= 17) {
                            final int n18 = a[n14 + 2];
                            final int n19 = 1 << (n18 >>> 20);
                            final int n20 = n18 & 0xFFFFF;
                            if (n20 != n7) {
                                if (n7 != 1048575) {
                                    o2.putInt(o3, (long)n7, n8);
                                }
                                int1 = o2.getInt(o3, (long)n20);
                                n7 = n20;
                            }
                            else {
                                int1 = n8;
                            }
                            Label_1291: {
                                int n22 = 0;
                                int n23 = 0;
                                int n24 = 0;
                                Label_1262: {
                                    Label_1203: {
                                        int n29 = 0;
                                        int n30 = 0;
                                        Label_1170: {
                                            Label_1085: {
                                                int n25 = 0;
                                                Label_1064: {
                                                    Label_1022: {
                                                        Label_0982: {
                                                            Label_0935: {
                                                                int n26 = 0;
                                                                switch (n16) {
                                                                    default: {
                                                                        if (n12 == 3) {
                                                                            final int c = bhz.c(spz.m(n14), array, k, n, n11 << 3 | 0x4, ygz);
                                                                            if ((int1 & n19) == 0x0) {
                                                                                o2.putObject(o3, n17, ygz.c);
                                                                            }
                                                                            else {
                                                                                o2.putObject(o3, n17, tmz.c(o2.getObject(o3, n17), ygz.c));
                                                                            }
                                                                            array2 = array;
                                                                            final int n21 = int1 | n19;
                                                                            n22 = c;
                                                                            n23 = n;
                                                                            n24 = n21;
                                                                            break Label_1262;
                                                                        }
                                                                        break Label_1203;
                                                                    }
                                                                    case 16: {
                                                                        if (n12 == 0) {
                                                                            n25 = bhz.m(array2, k, ygz);
                                                                            o2.putLong(o, n17, ziz.b(ygz.b));
                                                                            break Label_1064;
                                                                        }
                                                                        break Label_1085;
                                                                    }
                                                                    case 15: {
                                                                        if (n12 == 0) {
                                                                            n26 = bhz.j(array2, k, ygz);
                                                                            o2.putInt(o3, n17, ziz.a(ygz.a));
                                                                            break;
                                                                        }
                                                                        break Label_0982;
                                                                    }
                                                                    case 12: {
                                                                        ygz2 = ygz;
                                                                        if (n12 != 0) {
                                                                            break Label_0982;
                                                                        }
                                                                        n26 = bhz.j(array2, k, ygz2);
                                                                        final int a2 = ygz2.a;
                                                                        final kmz l = spz.l(n14);
                                                                        if (l != null && !l.o(a2)) {
                                                                            A(o).c(i, (Object)(long)a2);
                                                                            final int n27 = i;
                                                                            i = n26;
                                                                            n28 = n27;
                                                                            break Label_1460;
                                                                        }
                                                                        o2.putInt(o3, n17, a2);
                                                                        break;
                                                                    }
                                                                    case 10: {
                                                                        if (n12 == 2) {
                                                                            n26 = bhz.a(array2, k, ygz);
                                                                            o2.putObject(o3, n17, ygz.c);
                                                                            break;
                                                                        }
                                                                        break Label_0982;
                                                                    }
                                                                    case 9: {
                                                                        if (n12 != 2) {
                                                                            break Label_0982;
                                                                        }
                                                                        n26 = bhz.d(spz.m(n14), array2, k, n4, ygz);
                                                                        if ((int1 & n19) == 0x0) {
                                                                            o2.putObject(o3, n17, ygz.c);
                                                                            break;
                                                                        }
                                                                        o2.putObject(o3, n17, tmz.c(o2.getObject(o3, n17), ygz.c));
                                                                        break;
                                                                    }
                                                                    case 8: {
                                                                        if (n12 == 2) {
                                                                            if ((n15 & 0x20000000) == 0x0) {
                                                                                n29 = bhz.g(array2, k, ygz);
                                                                            }
                                                                            else {
                                                                                n29 = bhz.h(array2, k, ygz);
                                                                            }
                                                                            o2.putObject(o3, n17, ygz.c);
                                                                            break Label_0935;
                                                                        }
                                                                        break Label_0982;
                                                                    }
                                                                    case 7: {
                                                                        if (n12 == 0) {
                                                                            n29 = bhz.m(array2, k, ygz);
                                                                            hsz.m(o3, n17, ygz.b != 0L);
                                                                            break Label_1022;
                                                                        }
                                                                        break Label_0982;
                                                                    }
                                                                    case 6:
                                                                    case 13: {
                                                                        if (n12 == 5) {
                                                                            o2.putInt(o3, n17, bhz.b(array2, k));
                                                                            n29 = k + 4;
                                                                            break Label_0935;
                                                                        }
                                                                        break Label_0982;
                                                                    }
                                                                    case 5:
                                                                    case 14: {
                                                                        if (n12 == 1) {
                                                                            o2.putLong(o, n17, bhz.n(array2, k));
                                                                            n29 = k + 8;
                                                                            n30 = (int1 | n19);
                                                                            break Label_1170;
                                                                        }
                                                                        break Label_0982;
                                                                    }
                                                                    case 4:
                                                                    case 11: {
                                                                        if (n12 == 0) {
                                                                            n29 = bhz.j(array2, k, ygz);
                                                                            o2.putInt(o3, n17, ygz.a);
                                                                            break Label_1022;
                                                                        }
                                                                        break Label_1085;
                                                                    }
                                                                    case 2:
                                                                    case 3: {
                                                                        if (n12 == 0) {
                                                                            n25 = bhz.m(array2, k, ygz);
                                                                            o2.putLong(o, n17, ygz.b);
                                                                            break Label_1064;
                                                                        }
                                                                        break Label_1085;
                                                                    }
                                                                    case 1: {
                                                                        if (n12 == 5) {
                                                                            hsz.o(o3, n17, Float.intBitsToFloat(bhz.b(array2, k)));
                                                                            n29 = k + 4;
                                                                            break Label_1022;
                                                                        }
                                                                        break Label_1203;
                                                                    }
                                                                    case 0: {
                                                                        if (n12 == 1) {
                                                                            hsz.n(o3, n17, Double.longBitsToDouble(bhz.n(array2, k)));
                                                                            n29 = k + 8;
                                                                            break Label_1022;
                                                                        }
                                                                        break Label_1203;
                                                                    }
                                                                }
                                                                final int n31 = n26;
                                                                n24 = (int1 | n19);
                                                                n23 = n4;
                                                                n22 = n31;
                                                                break Label_1262;
                                                            }
                                                            break Label_1022;
                                                        }
                                                        break Label_1291;
                                                    }
                                                    n30 = (int1 | n19);
                                                    break Label_1170;
                                                }
                                                n24 = (int1 | n19);
                                                n23 = n4;
                                                n22 = n25;
                                                break Label_1262;
                                            }
                                            break Label_1291;
                                        }
                                        ygz2 = ygz;
                                        final int n32 = i;
                                        n5 = n11;
                                        n3 = n2;
                                        i = n29;
                                        n6 = n14;
                                        n8 = n30;
                                        n9 = n32;
                                        continue;
                                    }
                                    break Label_1291;
                                }
                                ygz2 = ygz;
                                final int n33 = n22;
                                final int n34 = i;
                                i = n33;
                                n4 = n23;
                                n28 = n34;
                                int1 = n24;
                                break Label_1460;
                            }
                            final int n35 = n7;
                            final int n36 = k;
                            n8 = int1;
                            spz2 = spz;
                            final int n37 = n2;
                            n38 = n36;
                            n39 = n37;
                            n40 = n14;
                            n41 = n35;
                            break Label_1685;
                        }
                        int1 = n8;
                        Label_1559: {
                            if (n16 != 27) {
                                int n42;
                                if (n16 <= 49) {
                                    final int j = this.L(o, array, k, n, i, n11, n12, n14, n15, n16, n17, ygz);
                                    if (j == k) {
                                        k = j;
                                        break Label_1559;
                                    }
                                    n42 = j;
                                }
                                else if (n16 == 50) {
                                    if (n12 != 2) {
                                        break Label_1559;
                                    }
                                    this.I(o, n14, n17);
                                    throw null;
                                }
                                else {
                                    final int m = this.J(o, array, k, n, i, n11, n12, n15, n16, n17, n14, ygz);
                                    if (m == k) {
                                        k = m;
                                        break Label_1559;
                                    }
                                    n42 = m;
                                }
                                array2 = array;
                                n4 = n;
                                n3 = n2;
                                ygz2 = ygz;
                                spz = this;
                                n6 = n14;
                                n5 = n11;
                                n9 = i;
                                i = n42;
                                continue;
                            }
                            if (n12 == 2) {
                                qmz w;
                                final qmz qmz = w = (qmz)o2.getObject(o3, n17);
                                if (!qmz.d()) {
                                    final int size = ((List)qmz).size();
                                    int n43;
                                    if (size == 0) {
                                        n43 = 10;
                                    }
                                    else {
                                        n43 = size + size;
                                    }
                                    w = qmz.W(n43);
                                    o2.putObject(o3, n17, w);
                                }
                                final nqz m2 = spz.m(n14);
                                n28 = i;
                                i = bhz.e(m2, i, array, k, n, w, ygz);
                                array2 = array;
                                n4 = n;
                                break Label_1460;
                            }
                        }
                        final int n44 = n14;
                        n41 = n7;
                        spz2 = this;
                        n39 = n2;
                        n38 = k;
                        n40 = n44;
                        break Label_1685;
                    }
                    final int n45 = n2;
                    n6 = n14;
                    n9 = n28;
                    n8 = int1;
                    n5 = n11;
                    n3 = n45;
                    continue;
                }
                final int n46 = n3;
                n41 = n7;
                spz2 = spz;
                final int n47 = 0;
                n38 = k;
                n39 = n46;
                n40 = n47;
            }
            if (i == n39 && n39 != 0) {
                n2 = n38;
                n3 = n39;
                n7 = n41;
                n9 = i;
                break;
            }
            int n48;
            if (spz2.f && ygz.d != vjz.a()) {
                if (ygz.d.a.get(new rjz(spz2.e, n11)) != null) {
                    final clz clz = (clz)o;
                    throw null;
                }
                n48 = bhz.i(i, array, n38, n, A(o), ygz);
            }
            else {
                n48 = bhz.i(i, array, n38, n, A(o), ygz);
            }
            ygz2 = ygz;
            n5 = n11;
            spz = spz2;
            final int n49 = n41;
            n4 = n;
            n9 = i;
            i = n48;
            n3 = n39;
            n6 = n40;
            array2 = array;
            n7 = n49;
        }
        if (n7 != 1048575) {
            o2.putInt(o, (long)n7, n8);
        }
        int n50;
        int n51;
        Object j2;
        zoz zoz;
        xoz xoz;
        for (i = spz2.i; i < spz2.j; ++i) {
            n50 = spz2.h[i];
            n51 = spz2.a[n50];
            j2 = hsz.j(o, (long)(spz2.a(n50) & 0xFFFFF));
            if (j2 != null) {
                if (spz2.l(n50) != null) {
                    zoz = (zoz)j2;
                    xoz = (xoz)spz2.n(n50);
                    throw null;
                }
            }
        }
        if (n3 == 0) {
            if (n2 != n) {
                throw zzkm.c();
            }
        }
        else if (n2 > n || n9 != n3) {
            throw zzkm.c();
        }
        return n2;
    }
}
