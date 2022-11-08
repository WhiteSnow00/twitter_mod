import android.util.Log;
import android.graphics.Path;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uzj
{
    public static boolean a(final a[] array, final a[] array2) {
        if (array == null || array2 == null) {
            return false;
        }
        if (array.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i].a != array2[i].a || array[i].b.length != array2[i].b.length) {
                return false;
            }
        }
        return true;
    }
    
    public static float[] b(final float[] array, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        final int length = array.length;
        if (length >= 0) {
            n += 0;
            final int min = Math.min(n, length - 0);
            final float[] array2 = new float[n];
            System.arraycopy(array, 0, array2, 0, min);
            return array2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static a[] c(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int i = 1;
        int n = 0;
        while (i < s.length()) {
            while (i < s.length()) {
                final char char1 = s.charAt(i);
                if (((char1 - 'Z') * (char1 - 'A') <= 0 || (char1 - 'z') * (char1 - 'a') <= 0) && char1 != 'e' && char1 != 'E') {
                    break;
                }
                ++i;
            }
            final String trim = s.substring(n, i).trim();
            if (trim.length() > 0) {
                float[] b = null;
                Label_0464: {
                    if (trim.charAt(0) != 'z') {
                        if (trim.charAt(0) != 'Z') {
                            try {
                                final float[] array = new float[trim.length()];
                                final int length = trim.length();
                                int j = 1;
                                int n2 = 0;
                                while (j < length) {
                                    int n3 = 0;
                                    int n4 = 0;
                                    int n5 = 0;
                                    int n6 = 0;
                                    int n7 = j;
                                    int n8;
                                    while (true) {
                                        n8 = n4;
                                        if (n7 >= trim.length()) {
                                            break;
                                        }
                                        final char char2 = trim.charAt(n7);
                                        Label_0358: {
                                            int n9 = 0;
                                            int n10 = 0;
                                            int n11 = 0;
                                            Label_0344: {
                                                Label_0337: {
                                                    if (char2 != ' ') {
                                                        if (char2 == 'E' || char2 == 'e') {
                                                            n6 = 1;
                                                            break Label_0358;
                                                        }
                                                        n9 = n4;
                                                        switch (char2) {
                                                            default: {
                                                                n10 = n3;
                                                                n9 = n4;
                                                                n11 = n5;
                                                                break Label_0344;
                                                            }
                                                            case 46: {
                                                                if (n5 == 0) {
                                                                    n11 = 1;
                                                                    n10 = n3;
                                                                    n9 = n4;
                                                                    break Label_0344;
                                                                }
                                                                break;
                                                            }
                                                            case 45: {
                                                                n10 = n3;
                                                                n9 = n4;
                                                                n11 = n5;
                                                                if (n7 == j) {
                                                                    break Label_0344;
                                                                }
                                                                n10 = n3;
                                                                n9 = n4;
                                                                n11 = n5;
                                                                if (n6 == 0) {
                                                                    break;
                                                                }
                                                                break Label_0344;
                                                            }
                                                            case 44: {
                                                                break Label_0337;
                                                            }
                                                        }
                                                        n9 = 1;
                                                    }
                                                    else {
                                                        n9 = n4;
                                                    }
                                                }
                                                n10 = 1;
                                                n11 = n5;
                                            }
                                            n6 = 0;
                                            n5 = n11;
                                            n4 = n9;
                                            n3 = n10;
                                        }
                                        if (n3 != 0) {
                                            n8 = n4;
                                            break;
                                        }
                                        ++n7;
                                    }
                                    int n12 = n2;
                                    if (j < n7) {
                                        array[n2] = Float.parseFloat(trim.substring(j, n7));
                                        n12 = n2 + 1;
                                    }
                                    if (n8 == 0) {
                                        ++n7;
                                    }
                                    j = n7;
                                    n2 = n12;
                                }
                                b = b(array, n2);
                                break Label_0464;
                            }
                            catch (final NumberFormatException ex) {
                                throw new RuntimeException(zi.y("error in parsing \"", trim, "\""), ex);
                            }
                        }
                    }
                    b = new float[0];
                }
                list.add(new a(trim.charAt(0), b));
            }
            n = i;
            ++i;
        }
        if (i - n == 1 && n < s.length()) {
            list.add(new a(s.charAt(n), new float[0]));
        }
        return list.toArray(new a[list.size()]);
    }
    
    public static Path d(final String s) {
        final Path path = new Path();
        final a[] c = c(s);
        if (c != null) {
            try {
                a.b(c, path);
                return path;
            }
            catch (final RuntimeException ex) {
                throw new RuntimeException(l7k.c("Error in parsing ", s), ex);
            }
        }
        return null;
    }
    
    public static a[] e(final a[] array) {
        if (array == null) {
            return null;
        }
        final a[] array2 = new a[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new a(array[i]);
        }
        return array2;
    }
    
    public static final class a
    {
        public char a;
        public float[] b;
        
        public a(final char c, final float[] b) {
            this.a = c;
            this.b = b;
        }
        
        public a(final a a) {
            this.a = a.a;
            final float[] b = a.b;
            this.b = uzj.b(b, b.length);
        }
        
        public static void a(final Path path, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final boolean b, final boolean b2) {
            final double radians = Math.toRadians(n7);
            final double cos = Math.cos(radians);
            final double sin = Math.sin(radians);
            final double n8 = n;
            final double n9 = n2;
            final double n10 = n8;
            final double n11 = n5;
            final double n12 = (n9 * sin + n8 * cos) / n11;
            final double n13 = -n;
            final double n14 = n6;
            final double n15 = (n9 * cos + n13 * sin) / n14;
            final double n16 = n3;
            final double n17 = n4;
            final double n18 = (n17 * sin + n16 * cos) / n11;
            final double n19 = (n17 * cos + -n3 * sin) / n14;
            final double n20 = n12 - n18;
            final double n21 = n15 - n19;
            final double n22 = (n12 + n18) / 2.0;
            final double n23 = (n15 + n19) / 2.0;
            final double n24 = n21 * n21 + n20 * n20;
            if (n24 == 0.0) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            final double n25 = 1.0 / n24 - 0.25;
            if (n25 < 0.0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Points are too far apart ");
                sb.append(n24);
                Log.w("PathParser", sb.toString());
                final float n26 = (float)(Math.sqrt(n24) / 1.99999);
                a(path, n, n2, n3, n4, n5 * n26, n6 * n26, n7, b, b2);
                return;
            }
            final double sqrt = Math.sqrt(n25);
            final double n27 = n20 * sqrt;
            final double n28 = sqrt * n21;
            double n29;
            double n30;
            if (b == b2) {
                n29 = n22 - n28;
                n30 = n23 + n27;
            }
            else {
                n29 = n22 + n28;
                n30 = n23 - n27;
            }
            double atan2 = Math.atan2(n15 - n30, n12 - n29);
            final double n31 = Math.atan2(n19 - n30, n18 - n29) - atan2;
            int i = 0;
            final double n32 = dcmpl(n31, 0.0);
            final boolean b3 = n32 >= 0;
            double n33 = n31;
            if (b2 != b3) {
                if (n32 > 0) {
                    n33 = n31 - 6.283185307179586;
                }
                else {
                    n33 = n31 + 6.283185307179586;
                }
            }
            final double n34 = n29 * n11;
            final double n35 = n30 * n14;
            final double n36 = n34 * cos - n35 * sin;
            final int n37 = (int)Math.ceil(Math.abs(n33 * 4.0 / 3.141592653589793));
            final double cos2 = Math.cos(radians);
            final double sin2 = Math.sin(radians);
            final double cos3 = Math.cos(atan2);
            final double sin3 = Math.sin(atan2);
            final double n38 = -n11;
            final double n39 = n38 * cos2;
            final double n40 = n14 * sin2;
            double n41 = n39 * sin3 - n40 * cos3;
            final double n42 = n38 * sin2;
            final double n43 = n14 * cos2;
            double n44 = cos3 * n43 + sin3 * n42;
            final double n45 = n33 / n37;
            double n46 = n9;
            double n47 = n10;
            final double n48 = n11;
            final double n49 = cos2;
            final double n50 = n42;
            final double n51 = n36;
            final double n52 = n43;
            final double n53 = n45;
            while (i < n37) {
                final double n54 = atan2 + n53;
                final double sin4 = Math.sin(n54);
                final double cos4 = Math.cos(n54);
                final double n55 = n48 * n49 * cos4 + n51 - n40 * sin4;
                final double n56 = n52 * sin4 + (n48 * sin2 * cos4 + (n35 * cos + n34 * sin));
                final double n57 = n39 * sin4 - n40 * cos4;
                final double n58 = cos4 * n52 + sin4 * n50;
                final double n59 = n54 - atan2;
                final double tan = Math.tan(n59 / 2.0);
                final double n60 = (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) * Math.sin(n59) / 3.0;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)(n41 * n60 + n47), (float)(n44 * n60 + n46), (float)(n55 - n60 * n57), (float)(n56 - n60 * n58), (float)n55, (float)n56);
                ++i;
                atan2 = n54;
                n44 = n58;
                n41 = n57;
                n47 = n55;
                n46 = n56;
            }
        }
        
        public static void b(final a[] array, final Path path) {
            final float[] array2 = new float[6];
            int a = 109;
            int n10;
            for (int i = 0; i < array.length; i = n10 + 1) {
                int a2 = array[i].a;
                final float[] b = array[i].b;
                float n = array2[0];
                float n2 = array2[1];
                float n3 = array2[2];
                float n4 = array2[3];
                float n5 = array2[4];
                float n6 = array2[5];
                int n7 = 0;
                Label_0259: {
                    switch (a2) {
                        case 90:
                        case 122: {
                            path.close();
                            path.moveTo(n5, n6);
                            n = (n3 = n5);
                            n2 = (n4 = n6);
                            break;
                        }
                        case 81:
                        case 83:
                        case 113:
                        case 115: {
                            n7 = 4;
                            break Label_0259;
                        }
                        case 72:
                        case 86:
                        case 104:
                        case 118: {
                            n7 = 1;
                            break Label_0259;
                        }
                        case 67:
                        case 99: {
                            n7 = 6;
                            break Label_0259;
                        }
                        case 65:
                        case 97: {
                            n7 = 7;
                            break Label_0259;
                        }
                    }
                    n7 = 2;
                }
                final float n8 = n2;
                final int n9 = 0;
                n10 = i;
                float n11 = n;
                float n12 = n8;
                int n116;
                for (int j = n9; j < b.length; j += n7, n116 = a2, a = a2, a2 = n116) {
                    Label_2061: {
                        if (a2 != 65) {
                            float n100;
                            float n101;
                            if (a2 != 67) {
                                if (a2 == 72) {
                                    final float[] array3 = b;
                                    final int n13 = j + 0;
                                    path.lineTo(array3[n13], n12);
                                    n11 = array3[n13];
                                    continue;
                                }
                                if (a2 != 81) {
                                    if (a2 == 86) {
                                        final float[] array4 = b;
                                        final int n14 = j + 0;
                                        path.lineTo(n11, array4[n14]);
                                        n12 = array4[n14];
                                        continue;
                                    }
                                    if (a2 != 97) {
                                        Label_1511: {
                                            float n53 = 0.0f;
                                            float n54 = 0.0f;
                                            float n55 = 0.0f;
                                            Label_1488: {
                                                if (a2 != 99) {
                                                    if (a2 == 104) {
                                                        final int n15 = j + 0;
                                                        path.rLineTo(b[n15], 0.0f);
                                                        n11 += b[n15];
                                                        break Label_1511;
                                                    }
                                                    if (a2 != 113) {
                                                        float n36 = 0.0f;
                                                        Label_1241: {
                                                            if (a2 != 118) {
                                                                if (a2 != 76) {
                                                                    if (a2 != 77) {
                                                                        if (a2 == 83) {
                                                                            int n16 = j;
                                                                            if (a == 99 || a == 115 || a == 67 || a == 83) {
                                                                                n12 = n12 * 2.0f - n4;
                                                                                n11 = n11 * 2.0f - n3;
                                                                            }
                                                                            final int n17 = n16 + 0;
                                                                            final float n18 = b[n17];
                                                                            final int n19 = n16 + 1;
                                                                            final float n20 = b[n19];
                                                                            final int n21 = n16 + 2;
                                                                            final float n22 = b[n21];
                                                                            n16 += 3;
                                                                            path.cubicTo(n11, n12, n18, n20, n22, b[n16]);
                                                                            n3 = b[n17];
                                                                            n4 = b[n19];
                                                                            n11 = b[n21];
                                                                            n12 = b[n16];
                                                                            break Label_1511;
                                                                        }
                                                                        if (a2 == 84) {
                                                                            int n23 = j;
                                                                            float n25;
                                                                            float n26;
                                                                            if (a != 113 && a != 116 && a != 81 && a != 84) {
                                                                                final float n24 = n11;
                                                                                n25 = n12;
                                                                                n26 = n24;
                                                                            }
                                                                            else {
                                                                                final float n27 = n11 * 2.0f - n3;
                                                                                final float n28 = n12 * 2.0f - n4;
                                                                                n26 = n27;
                                                                                n25 = n28;
                                                                            }
                                                                            final int n29 = n23 + 0;
                                                                            final float n30 = b[n29];
                                                                            ++n23;
                                                                            path.quadTo(n26, n25, n30, b[n23]);
                                                                            final float n31 = b[n29];
                                                                            final float n32 = b[n23];
                                                                            n3 = n26;
                                                                            n4 = n25;
                                                                            n12 = n32;
                                                                            n11 = n31;
                                                                            continue;
                                                                        }
                                                                        if (a2 == 108) {
                                                                            int n33 = j;
                                                                            final int n34 = n33 + 0;
                                                                            final float n35 = b[n34];
                                                                            ++n33;
                                                                            path.rLineTo(n35, b[n33]);
                                                                            n11 += b[n34];
                                                                            n36 = b[n33];
                                                                            break Label_1241;
                                                                        }
                                                                        if (a2 != 109) {
                                                                            if (a2 != 115) {
                                                                                if (a2 == 116) {
                                                                                    float n37;
                                                                                    float n38;
                                                                                    if (a != 113 && a != 116 && a != 81 && a != 84) {
                                                                                        n37 = 0.0f;
                                                                                        n38 = 0.0f;
                                                                                    }
                                                                                    else {
                                                                                        n38 = n11 - n3;
                                                                                        n37 = n12 - n4;
                                                                                    }
                                                                                    final int n39 = j + 0;
                                                                                    final float n40 = b[n39];
                                                                                    final int n41 = j + 1;
                                                                                    path.rQuadTo(n38, n37, n40, b[n41]);
                                                                                    final float n42 = n11 + b[n39];
                                                                                    final float n43 = n12 + b[n41];
                                                                                    n4 = n37 + n12;
                                                                                    n3 = n38 + n11;
                                                                                    n11 = n42;
                                                                                    n12 = n43;
                                                                                }
                                                                                break Label_1511;
                                                                            }
                                                                            float n44;
                                                                            float n45;
                                                                            if (a != 99 && a != 115 && a != 67 && a != 83) {
                                                                                n44 = 0.0f;
                                                                                n45 = 0.0f;
                                                                            }
                                                                            else {
                                                                                n45 = n12 - n4;
                                                                                n44 = n11 - n3;
                                                                            }
                                                                            final int n46 = j + 0;
                                                                            final float n47 = b[n46];
                                                                            final int n48 = j + 1;
                                                                            final float n49 = b[n48];
                                                                            final int n50 = j + 2;
                                                                            final float n51 = b[n50];
                                                                            final int n52 = j + 3;
                                                                            path.rCubicTo(n44, n45, n47, n49, n51, b[n52]);
                                                                            n53 = b[n46] + n11;
                                                                            n54 = b[n48] + n12;
                                                                            n11 += b[n50];
                                                                            n55 = b[n52];
                                                                            break Label_1488;
                                                                        }
                                                                        else {
                                                                            final int n56 = j;
                                                                            final int n57 = n56 + 0;
                                                                            n11 += b[n57];
                                                                            final int n58 = n56 + 1;
                                                                            n12 += b[n58];
                                                                            if (n56 > 0) {
                                                                                path.rLineTo(b[n57], b[n58]);
                                                                                break Label_1511;
                                                                            }
                                                                            path.rMoveTo(b[n57], b[n58]);
                                                                            n5 = n11;
                                                                            n6 = n12;
                                                                        }
                                                                    }
                                                                    else {
                                                                        final int n59 = j;
                                                                        final int n60 = n59 + 0;
                                                                        n11 = b[n60];
                                                                        final int n61 = n59 + 1;
                                                                        n12 = b[n61];
                                                                        if (n59 > 0) {
                                                                            path.lineTo(b[n60], b[n61]);
                                                                            break Label_1511;
                                                                        }
                                                                        path.moveTo(b[n60], b[n61]);
                                                                        n6 = n12;
                                                                        n5 = n11;
                                                                    }
                                                                    n11 = n5;
                                                                    n12 = n6;
                                                                    break Label_1511;
                                                                }
                                                                int n62 = j;
                                                                final int n63 = n62 + 0;
                                                                final float n64 = b[n63];
                                                                ++n62;
                                                                path.lineTo(n64, b[n62]);
                                                                n11 = b[n63];
                                                                n12 = b[n62];
                                                                break Label_1511;
                                                            }
                                                            else {
                                                                final int n65 = j + 0;
                                                                path.rLineTo(0.0f, b[n65]);
                                                                n36 = b[n65];
                                                            }
                                                        }
                                                        n12 += n36;
                                                        break Label_1511;
                                                    }
                                                    int n66 = j;
                                                    final int n67 = n66 + 0;
                                                    final float n68 = b[n67];
                                                    final int n69 = n66 + 1;
                                                    final float n70 = b[n69];
                                                    final int n71 = n66 + 2;
                                                    final float n72 = b[n71];
                                                    n66 += 3;
                                                    path.rQuadTo(n68, n70, n72, b[n66]);
                                                    n53 = b[n67] + n11;
                                                    n54 = b[n69] + n12;
                                                    final float n73 = b[n71];
                                                    n55 = b[n66];
                                                    n11 += n73;
                                                }
                                                else {
                                                    int n74 = j;
                                                    final float n75 = b[n74 + 0];
                                                    final float n76 = b[n74 + 1];
                                                    final int n77 = n74 + 2;
                                                    final float n78 = b[n77];
                                                    final int n79 = n74 + 3;
                                                    final float n80 = b[n79];
                                                    final int n81 = n74 + 4;
                                                    final float n82 = b[n81];
                                                    n74 += 5;
                                                    path.rCubicTo(n75, n76, n78, n80, n82, b[n74]);
                                                    n53 = b[n77] + n11;
                                                    n54 = b[n79] + n12;
                                                    n11 += b[n81];
                                                    n55 = b[n74];
                                                }
                                            }
                                            final float n83 = n12 + n55;
                                            final float n84 = n53;
                                            n4 = n54;
                                            n3 = n84;
                                            n12 = n83;
                                        }
                                        continue;
                                    }
                                    final int n85 = j;
                                    final int n86 = n85 + 5;
                                    final float n87 = b[n86];
                                    final int n88 = n85 + 6;
                                    final float n89 = b[n88];
                                    final float n90 = b[n85 + 0];
                                    final float n91 = b[n85 + 1];
                                    final float n92 = b[n85 + 2];
                                    final boolean b2 = b[n85 + 3] != 0.0f;
                                    final boolean b3 = b[n85 + 4] != 0.0f;
                                    final float[] array5 = b;
                                    a(path, n11, n12, n87 + n11, n89 + n12, n90, n91, n92, b2, b3);
                                    n11 += array5[n86];
                                    n12 += array5[n88];
                                    break Label_2061;
                                }
                                else {
                                    int n93 = j;
                                    final float[] array6 = b;
                                    final int n94 = n93 + 0;
                                    final float n95 = array6[n94];
                                    final int n96 = n93 + 1;
                                    final float n97 = array6[n96];
                                    final int n98 = n93 + 2;
                                    final float n99 = array6[n98];
                                    n93 += 3;
                                    path.quadTo(n95, n97, n99, array6[n93]);
                                    n100 = array6[n94];
                                    n101 = array6[n96];
                                    n11 = array6[n98];
                                    n12 = array6[n93];
                                }
                            }
                            else {
                                int n102 = j;
                                final float[] array7 = b;
                                final float n103 = array7[n102 + 0];
                                final float n104 = array7[n102 + 1];
                                final int n105 = n102 + 2;
                                final float n106 = array7[n105];
                                final int n107 = n102 + 3;
                                final float n108 = array7[n107];
                                final int n109 = n102 + 4;
                                final float n110 = array7[n109];
                                n102 += 5;
                                path.cubicTo(n103, n104, n106, n108, n110, array7[n102]);
                                n11 = array7[n109];
                                n12 = array7[n102];
                                n100 = array7[n105];
                                n101 = array7[n107];
                            }
                            final float n111 = n101;
                            n3 = n100;
                            n4 = n111;
                            continue;
                        }
                        final int n112 = j;
                        final float[] array8 = b;
                        final int n113 = n112 + 5;
                        final float n114 = array8[n113];
                        final int n115 = n112 + 6;
                        a(path, n11, n12, n114, array8[n115], array8[n112 + 0], array8[n112 + 1], array8[n112 + 2], array8[n112 + 3] != 0.0f, array8[n112 + 4] != 0.0f);
                        n11 = array8[n113];
                        n12 = array8[n115];
                    }
                    n4 = n12;
                    n3 = n11;
                }
                array2[0] = n11;
                array2[1] = n12;
                array2[2] = n3;
                array2[3] = n4;
                array2[4] = n5;
                array2[5] = n6;
                a = array[n10].a;
            }
        }
    }
}
