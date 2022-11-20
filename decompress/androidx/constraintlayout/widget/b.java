// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import java.util.Locale;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.util.Arrays;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.HashSet;
import android.view.View;
import android.util.Log;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import java.util.HashMap;
import android.util.SparseIntArray;

public final class b
{
    public static final int[] g;
    public static SparseIntArray h;
    public static SparseIntArray i;
    public String a;
    public String b;
    public int c;
    public HashMap<String, fi6> d;
    public boolean e;
    public HashMap<Integer, a> f;
    
    static {
        g = new int[] { 0, 4, 8 };
        b.h = new SparseIntArray();
        b.i = new SparseIntArray();
        b.h.append(82, 25);
        b.h.append(83, 26);
        b.h.append(85, 29);
        b.h.append(86, 30);
        b.h.append(92, 36);
        b.h.append(91, 35);
        b.h.append(63, 4);
        b.h.append(62, 3);
        b.h.append(58, 1);
        b.h.append(60, 91);
        b.h.append(59, 92);
        b.h.append(101, 6);
        b.h.append(102, 7);
        b.h.append(70, 17);
        b.h.append(71, 18);
        b.h.append(72, 19);
        b.h.append(54, 99);
        b.h.append(0, 27);
        b.h.append(87, 32);
        b.h.append(88, 33);
        b.h.append(69, 10);
        b.h.append(68, 9);
        b.h.append(106, 13);
        b.h.append(109, 16);
        b.h.append(107, 14);
        b.h.append(104, 11);
        b.h.append(108, 15);
        b.h.append(105, 12);
        b.h.append(95, 40);
        b.h.append(80, 39);
        b.h.append(79, 41);
        b.h.append(94, 42);
        b.h.append(78, 20);
        b.h.append(93, 37);
        b.h.append(67, 5);
        b.h.append(81, 87);
        b.h.append(90, 87);
        b.h.append(84, 87);
        b.h.append(61, 87);
        b.h.append(57, 87);
        b.h.append(5, 24);
        b.h.append(7, 28);
        b.h.append(23, 31);
        b.h.append(24, 8);
        b.h.append(6, 34);
        b.h.append(8, 2);
        b.h.append(3, 23);
        b.h.append(4, 21);
        b.h.append(96, 95);
        b.h.append(73, 96);
        b.h.append(2, 22);
        b.h.append(13, 43);
        b.h.append(26, 44);
        b.h.append(21, 45);
        b.h.append(22, 46);
        b.h.append(20, 60);
        b.h.append(18, 47);
        b.h.append(19, 48);
        b.h.append(14, 49);
        b.h.append(15, 50);
        b.h.append(16, 51);
        b.h.append(17, 52);
        b.h.append(25, 53);
        b.h.append(97, 54);
        b.h.append(74, 55);
        b.h.append(98, 56);
        b.h.append(75, 57);
        b.h.append(99, 58);
        b.h.append(76, 59);
        b.h.append(64, 61);
        b.h.append(66, 62);
        b.h.append(65, 63);
        b.h.append(28, 64);
        b.h.append(121, 65);
        b.h.append(35, 66);
        b.h.append(122, 67);
        b.h.append(113, 79);
        b.h.append(1, 38);
        b.h.append(112, 68);
        b.h.append(100, 69);
        b.h.append(77, 70);
        b.h.append(111, 97);
        b.h.append(32, 71);
        b.h.append(30, 72);
        b.h.append(31, 73);
        b.h.append(33, 74);
        b.h.append(29, 75);
        b.h.append(114, 76);
        b.h.append(89, 77);
        b.h.append(123, 78);
        b.h.append(56, 80);
        b.h.append(55, 81);
        b.h.append(116, 82);
        b.h.append(120, 83);
        b.h.append(119, 84);
        b.h.append(118, 85);
        b.h.append(117, 86);
        b.i.append(85, 6);
        b.i.append(85, 7);
        b.i.append(0, 27);
        b.i.append(89, 13);
        b.i.append(92, 16);
        b.i.append(90, 14);
        b.i.append(87, 11);
        b.i.append(91, 15);
        b.i.append(88, 12);
        b.i.append(78, 40);
        b.i.append(71, 39);
        b.i.append(70, 41);
        b.i.append(77, 42);
        b.i.append(69, 20);
        b.i.append(76, 37);
        b.i.append(60, 5);
        b.i.append(72, 87);
        b.i.append(75, 87);
        b.i.append(73, 87);
        b.i.append(57, 87);
        b.i.append(56, 87);
        b.i.append(5, 24);
        b.i.append(7, 28);
        b.i.append(23, 31);
        b.i.append(24, 8);
        b.i.append(6, 34);
        b.i.append(8, 2);
        b.i.append(3, 23);
        b.i.append(4, 21);
        b.i.append(79, 95);
        b.i.append(64, 96);
        b.i.append(2, 22);
        b.i.append(13, 43);
        b.i.append(26, 44);
        b.i.append(21, 45);
        b.i.append(22, 46);
        b.i.append(20, 60);
        b.i.append(18, 47);
        b.i.append(19, 48);
        b.i.append(14, 49);
        b.i.append(15, 50);
        b.i.append(16, 51);
        b.i.append(17, 52);
        b.i.append(25, 53);
        b.i.append(80, 54);
        b.i.append(65, 55);
        b.i.append(81, 56);
        b.i.append(66, 57);
        b.i.append(82, 58);
        b.i.append(67, 59);
        b.i.append(59, 62);
        b.i.append(58, 63);
        b.i.append(28, 64);
        b.i.append(105, 65);
        b.i.append(34, 66);
        b.i.append(106, 67);
        b.i.append(96, 79);
        b.i.append(1, 38);
        b.i.append(97, 98);
        b.i.append(95, 68);
        b.i.append(83, 69);
        b.i.append(68, 70);
        b.i.append(32, 71);
        b.i.append(30, 72);
        b.i.append(31, 73);
        b.i.append(33, 74);
        b.i.append(29, 75);
        b.i.append(98, 76);
        b.i.append(74, 77);
        b.i.append(107, 78);
        b.i.append(55, 80);
        b.i.append(54, 81);
        b.i.append(100, 82);
        b.i.append(104, 83);
        b.i.append(103, 84);
        b.i.append(102, 85);
        b.i.append(101, 86);
        b.i.append(94, 97);
    }
    
    public b() {
        this.b = "";
        this.c = 0;
        this.d = new HashMap<String, fi6>();
        this.e = true;
        this.f = new HashMap<Integer, a>();
    }
    
    public static a d(final Context context, final XmlPullParser xmlPullParser) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        final a a = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, as2.R0);
        t(a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return a;
    }
    
    public static int q(final TypedArray typedArray, final int n, int n2) {
        if ((n2 = typedArray.getResourceId(n, n2)) == -1) {
            n2 = typedArray.getInt(n, -1);
        }
        return n2;
    }
    
    public static void r(final Object o, final TypedArray typedArray, int n, final int n2) {
        if (o == null) {
            return;
        }
        final int type = typedArray.peekValue(n).type;
        boolean b = true;
        final int n3 = 0;
        if (type != 3) {
            Label_0099: {
                if (type != 5) {
                    final int int1 = typedArray.getInt(n, 0);
                    if (int1 == -4) {
                        n = -2;
                        break Label_0099;
                    }
                    n = n3;
                    if (int1 != -3 && (n = int1) != -2 && (n = int1) != -1) {
                        n = n3;
                    }
                }
                else {
                    n = typedArray.getDimensionPixelSize(n, 0);
                }
                b = false;
            }
            if (o instanceof ConstraintLayout.a) {
                final ConstraintLayout.a a = (ConstraintLayout.a)o;
                if (n2 == 0) {
                    a.width = n;
                    a.W = b;
                }
                else {
                    a.height = n;
                    a.X = b;
                }
            }
            else if (o instanceof b) {
                final b b2 = (b)o;
                if (n2 == 0) {
                    b2.c = n;
                    b2.m0 = b;
                }
                else {
                    b2.d = n;
                    b2.n0 = b;
                }
            }
            else if (o instanceof a.a) {
                final a.a a2 = (a.a)o;
                if (n2 == 0) {
                    a2.b(23, n);
                    a2.d(80, b);
                }
                else {
                    a2.b(21, n);
                    a2.d(81, b);
                }
            }
            return;
        }
        final String string = typedArray.getString(n);
        if (string == null) {
            return;
        }
        n = string.indexOf(61);
        final int length = string.length();
        if (n <= 0 || n >= length - 1) {
            return;
        }
        final String substring = string.substring(0, n);
        final String substring2 = string.substring(n + 1);
        if (substring2.length() <= 0) {
            return;
        }
        final String trim = substring.trim();
        final String trim2 = substring2.trim();
        Label_0550: {
            if ("ratio".equalsIgnoreCase(trim)) {
                if (o instanceof ConstraintLayout.a) {
                    final ConstraintLayout.a a3 = (ConstraintLayout.a)o;
                    if (n2 == 0) {
                        a3.width = 0;
                    }
                    else {
                        a3.height = 0;
                    }
                    s(a3, trim2);
                    return;
                }
                if (o instanceof b) {
                    ((b)o).z = trim2;
                    return;
                }
                if (o instanceof a.a) {
                    ((a.a)o).c(5, trim2);
                }
                return;
            }
            else if (!"weight".equalsIgnoreCase(trim)) {
                break Label_0550;
            }
            try {
                final float float1 = Float.parseFloat(trim2);
                if (o instanceof ConstraintLayout.a) {
                    final ConstraintLayout.a a4 = (ConstraintLayout.a)o;
                    if (n2 == 0) {
                        a4.width = 0;
                        a4.H = float1;
                    }
                    else {
                        a4.height = 0;
                        a4.I = float1;
                    }
                }
                else if (o instanceof b) {
                    final b b3 = (b)o;
                    if (n2 == 0) {
                        b3.c = 0;
                        b3.V = float1;
                    }
                    else {
                        b3.d = 0;
                        b3.U = float1;
                    }
                }
                else if (o instanceof a.a) {
                    final a.a a5 = (a.a)o;
                    if (n2 == 0) {
                        a5.b(23, 0);
                        a5.a(39, float1);
                    }
                    else {
                        a5.b(21, 0);
                        a5.a(40, float1);
                    }
                }
                Label_0729: {
                    return;
                }
                a.a a7 = null;
                while (true) {
                    b b4 = null;
                    float max = 0.0f;
                    Block_35: {
                        ConstraintLayout.a a6 = null;
                        Block_33: {
                        Block_31_Outer:
                            while (true) {
                                b4 = (b)o;
                                iftrue(Label_0663:)(n2 != 0);
                                break Block_35;
                                Label_0663:
                                b4.d = 0;
                                b4.f0 = max;
                                b4.Z = 2;
                                return;
                                while (true) {
                                    max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                    iftrue(Label_0628:)(!(o instanceof ConstraintLayout.a));
                                    a6 = (ConstraintLayout.a)o;
                                    iftrue(Label_0609:)(n2 != 0);
                                    break Block_33;
                                    iftrue(Label_0729:)(!"parent".equalsIgnoreCase(trim));
                                    continue;
                                }
                                Label_0628:
                                iftrue(Label_0682:)(!(o instanceof b));
                                continue Block_31_Outer;
                            }
                            while (true) {
                                a7.b(23, 0);
                                a7.b(54, 2);
                                return;
                                a7 = (a.a)o;
                                iftrue(Label_0715:)(n2 != 0);
                                continue;
                            }
                        }
                        a6.width = 0;
                        a6.R = max;
                        a6.L = 2;
                        return;
                    }
                    b4.c = 0;
                    b4.e0 = max;
                    b4.Y = 2;
                    return;
                    Label_0682:
                    iftrue(Label_0729:)(!(o instanceof a.a));
                    continue;
                }
                Label_0715:
                a7.b(21, 0);
                a7.b(55, 2);
                return;
                ConstraintLayout.a a6 = null;
                Label_0609:
                a6.height = 0;
                float max = 0.0f;
                a6.S = max;
                a6.M = 2;
            }
            catch (final NumberFormatException ex) {}
        }
    }
    
    public static void s(final ConstraintLayout.a a, final String g) {
    Block_14_Outer:
        while (true) {
            if (g == null) {
                break Label_0238;
            }
            final int length = g.length();
            final int index = g.indexOf(44);
            final int n = 0;
            final int n2 = 0;
            final int n3 = -1;
            int n4 = n;
            int n5 = n3;
            if (index > 0) {
                n4 = n;
                n5 = n3;
                if (index < length - 1) {
                    final String substring = g.substring(0, index);
                    if (substring.equalsIgnoreCase("W")) {
                        n5 = n2;
                    }
                    else if (substring.equalsIgnoreCase("H")) {
                        n5 = 1;
                    }
                    else {
                        n5 = -1;
                    }
                    n4 = index + 1;
                }
            }
            final int index2 = g.indexOf(58);
            Label_0216: {
                if (index2 < 0 || index2 >= length - 1) {
                    break Label_0216;
                }
                final String substring2 = g.substring(n4, index2);
                final String substring3 = g.substring(index2 + 1);
                if (substring2.length() <= 0 || substring3.length() <= 0) {
                    break Label_0238;
                }
                try {
                    final float float1 = Float.parseFloat(substring2);
                    final float float2 = Float.parseFloat(substring3);
                    if (float1 > 0.0f && float2 > 0.0f) {
                        if (n5 == 1) {
                            Math.abs(float2 / float1);
                        }
                        else {
                            Math.abs(float1 / float2);
                        }
                    }
                    a.G = g;
                    return;
                    while (true) {
                        final String substring4;
                        Float.parseFloat(substring4);
                        continue Block_14_Outer;
                        substring4 = g.substring(n4);
                        iftrue(Label_0238:)(substring4.length() <= 0);
                        continue;
                    }
                }
                catch (final NumberFormatException ex) {
                    continue;
                }
            }
            break;
        }
    }
    
    public static void t(final a a, final TypedArray typedArray) {
        final int indexCount = typedArray.getIndexCount();
        final a.a h = new a.a();
        a.h = h;
        a.d.a = false;
        a.e.b = false;
        a.c.a = false;
        a.f.a = false;
        for (int i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            switch (b.i.get(index)) {
                default: {
                    final StringBuilder j = fu8.j("Unknown attribute 0x");
                    j.append(Integer.toHexString(index));
                    j.append("   ");
                    j.append(b.h.get(index));
                    Log.w("ConstraintSet", j.toString());
                    break;
                }
                case 99: {
                    h.d(99, typedArray.getBoolean(index, a.e.h));
                    break;
                }
                case 98: {
                    if (erh.g2) {
                        if ((a.a = typedArray.getResourceId(index, a.a)) == -1) {
                            a.b = typedArray.getString(index);
                            break;
                        }
                        break;
                    }
                    else {
                        if (typedArray.peekValue(index).type == 3) {
                            a.b = typedArray.getString(index);
                            break;
                        }
                        a.a = typedArray.getResourceId(index, a.a);
                        break;
                    }
                    break;
                }
                case 97: {
                    h.b(97, typedArray.getInt(index, a.e.p0));
                    break;
                }
                case 96: {
                    r(h, typedArray, index, 1);
                    break;
                }
                case 95: {
                    r(h, typedArray, index, 0);
                    break;
                }
                case 94: {
                    h.b(94, typedArray.getDimensionPixelSize(index, a.e.T));
                    break;
                }
                case 93: {
                    h.b(93, typedArray.getDimensionPixelSize(index, a.e.M));
                    break;
                }
                case 87: {
                    final StringBuilder k = fu8.j("unused attribute 0x");
                    k.append(Integer.toHexString(index));
                    k.append("   ");
                    k.append(b.h.get(index));
                    Log.w("ConstraintSet", k.toString());
                    break;
                }
                case 86: {
                    final int type = typedArray.peekValue(index).type;
                    if (type == 1) {
                        h.b(89, a.d.m = typedArray.getResourceId(index, -1));
                        final c d = a.d;
                        if (d.m != -1) {
                            h.b(88, d.l = -2);
                            break;
                        }
                        break;
                    }
                    else {
                        if (type != 3) {
                            final c d2 = a.d;
                            d2.l = typedArray.getInteger(index, d2.m);
                            h.b(88, a.d.l);
                            break;
                        }
                        h.c(90, a.d.k = typedArray.getString(index));
                        if (a.d.k.indexOf("/") > 0) {
                            h.b(89, a.d.m = typedArray.getResourceId(index, -1));
                            h.b(88, a.d.l = -2);
                            break;
                        }
                        h.b(88, a.d.l = -1);
                        break;
                    }
                    break;
                }
                case 85: {
                    h.a(85, typedArray.getFloat(index, a.d.i));
                    break;
                }
                case 84: {
                    h.b(84, typedArray.getInteger(index, a.d.j));
                    break;
                }
                case 83: {
                    h.b(83, q(typedArray, index, a.f.i));
                    break;
                }
                case 82: {
                    h.b(82, typedArray.getInteger(index, a.d.c));
                    break;
                }
                case 81: {
                    h.d(81, typedArray.getBoolean(index, a.e.n0));
                    break;
                }
                case 80: {
                    h.d(80, typedArray.getBoolean(index, a.e.m0));
                    break;
                }
                case 79: {
                    h.a(79, typedArray.getFloat(index, a.d.g));
                    break;
                }
                case 78: {
                    h.b(78, typedArray.getInt(index, a.c.c));
                    break;
                }
                case 77: {
                    h.c(77, typedArray.getString(index));
                    break;
                }
                case 76: {
                    h.b(76, typedArray.getInt(index, a.d.e));
                    break;
                }
                case 75: {
                    h.d(75, typedArray.getBoolean(index, a.e.o0));
                    break;
                }
                case 74: {
                    h.c(74, typedArray.getString(index));
                    break;
                }
                case 73: {
                    h.b(73, typedArray.getDimensionPixelSize(index, a.e.h0));
                    break;
                }
                case 72: {
                    h.b(72, typedArray.getInt(index, a.e.g0));
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 70: {
                    h.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                }
                case 69: {
                    h.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                }
                case 68: {
                    h.a(68, typedArray.getFloat(index, a.c.e));
                    break;
                }
                case 67: {
                    h.a(67, typedArray.getFloat(index, a.d.h));
                    break;
                }
                case 66: {
                    h.b(66, typedArray.getInt(index, 0));
                    break;
                }
                case 65: {
                    if (typedArray.peekValue(index).type == 3) {
                        h.c(65, typedArray.getString(index));
                        break;
                    }
                    h.c(65, ip9.c[typedArray.getInteger(index, 0)]);
                    break;
                }
                case 64: {
                    h.b(64, q(typedArray, index, a.d.b));
                    break;
                }
                case 63: {
                    h.a(63, typedArray.getFloat(index, a.e.C));
                    break;
                }
                case 62: {
                    h.b(62, typedArray.getDimensionPixelSize(index, a.e.B));
                    break;
                }
                case 60: {
                    h.a(60, typedArray.getFloat(index, a.f.b));
                    break;
                }
                case 59: {
                    h.b(59, typedArray.getDimensionPixelSize(index, a.e.d0));
                    break;
                }
                case 58: {
                    h.b(58, typedArray.getDimensionPixelSize(index, a.e.c0));
                    break;
                }
                case 57: {
                    h.b(57, typedArray.getDimensionPixelSize(index, a.e.b0));
                    break;
                }
                case 56: {
                    h.b(56, typedArray.getDimensionPixelSize(index, a.e.a0));
                    break;
                }
                case 55: {
                    h.b(55, typedArray.getInt(index, a.e.Z));
                    break;
                }
                case 54: {
                    h.b(54, typedArray.getInt(index, a.e.Y));
                    break;
                }
                case 53: {
                    h.a(53, typedArray.getDimension(index, a.f.l));
                    break;
                }
                case 52: {
                    h.a(52, typedArray.getDimension(index, a.f.k));
                    break;
                }
                case 51: {
                    h.a(51, typedArray.getDimension(index, a.f.j));
                    break;
                }
                case 50: {
                    h.a(50, typedArray.getDimension(index, a.f.h));
                    break;
                }
                case 49: {
                    h.a(49, typedArray.getDimension(index, a.f.g));
                    break;
                }
                case 48: {
                    h.a(48, typedArray.getFloat(index, a.f.f));
                    break;
                }
                case 47: {
                    h.a(47, typedArray.getFloat(index, a.f.e));
                    break;
                }
                case 46: {
                    h.a(46, typedArray.getFloat(index, a.f.d));
                    break;
                }
                case 45: {
                    h.a(45, typedArray.getFloat(index, a.f.c));
                    break;
                }
                case 44: {
                    h.d(44, true);
                    h.a(44, typedArray.getDimension(index, a.f.n));
                    break;
                }
                case 43: {
                    h.a(43, typedArray.getFloat(index, a.c.d));
                    break;
                }
                case 42: {
                    h.b(42, typedArray.getInt(index, a.e.X));
                    break;
                }
                case 41: {
                    h.b(41, typedArray.getInt(index, a.e.W));
                    break;
                }
                case 40: {
                    h.a(40, typedArray.getFloat(index, a.e.U));
                    break;
                }
                case 39: {
                    h.a(39, typedArray.getFloat(index, a.e.V));
                    break;
                }
                case 38: {
                    h.b(38, a.a = typedArray.getResourceId(index, a.a));
                    break;
                }
                case 37: {
                    h.a(37, typedArray.getFloat(index, a.e.y));
                    break;
                }
                case 34: {
                    h.b(34, typedArray.getDimensionPixelSize(index, a.e.I));
                    break;
                }
                case 31: {
                    h.b(31, typedArray.getDimensionPixelSize(index, a.e.L));
                    break;
                }
                case 28: {
                    h.b(28, typedArray.getDimensionPixelSize(index, a.e.H));
                    break;
                }
                case 27: {
                    h.b(27, typedArray.getInt(index, a.e.F));
                    break;
                }
                case 24: {
                    h.b(24, typedArray.getDimensionPixelSize(index, a.e.G));
                    break;
                }
                case 23: {
                    h.b(23, typedArray.getLayoutDimension(index, a.e.c));
                    break;
                }
                case 22: {
                    h.b(22, b.g[typedArray.getInt(index, a.c.b)]);
                    break;
                }
                case 21: {
                    h.b(21, typedArray.getLayoutDimension(index, a.e.d));
                    break;
                }
                case 20: {
                    h.a(20, typedArray.getFloat(index, a.e.x));
                    break;
                }
                case 19: {
                    h.a(19, typedArray.getFloat(index, a.e.g));
                    break;
                }
                case 18: {
                    h.b(18, typedArray.getDimensionPixelOffset(index, a.e.f));
                    break;
                }
                case 17: {
                    h.b(17, typedArray.getDimensionPixelOffset(index, a.e.e));
                    break;
                }
                case 16: {
                    h.b(16, typedArray.getDimensionPixelSize(index, a.e.O));
                    break;
                }
                case 15: {
                    h.b(15, typedArray.getDimensionPixelSize(index, a.e.S));
                    break;
                }
                case 14: {
                    h.b(14, typedArray.getDimensionPixelSize(index, a.e.P));
                    break;
                }
                case 13: {
                    h.b(13, typedArray.getDimensionPixelSize(index, a.e.N));
                    break;
                }
                case 12: {
                    h.b(12, typedArray.getDimensionPixelSize(index, a.e.R));
                    break;
                }
                case 11: {
                    h.b(11, typedArray.getDimensionPixelSize(index, a.e.Q));
                    break;
                }
                case 8: {
                    h.b(8, typedArray.getDimensionPixelSize(index, a.e.K));
                    break;
                }
                case 7: {
                    h.b(7, typedArray.getDimensionPixelOffset(index, a.e.E));
                    break;
                }
                case 6: {
                    h.b(6, typedArray.getDimensionPixelOffset(index, a.e.D));
                    break;
                }
                case 5: {
                    h.c(5, typedArray.getString(index));
                    break;
                }
                case 2: {
                    h.b(2, typedArray.getDimensionPixelSize(index, a.e.J));
                    break;
                }
            }
        }
    }
    
    public final void a(final ConstraintLayout constraintLayout) {
        for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (!this.f.containsKey(id)) {
                final StringBuilder j = fu8.j("id unknown ");
                j.append(la8.d(child));
                Log.w("ConstraintSet", j.toString());
            }
            else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f.containsKey(id)) {
                    final a a = this.f.get(id);
                    if (a != null) {
                        fi6.e(child, a.g);
                    }
                }
            }
        }
    }
    
    public final void b(final ConstraintLayout constraintLayout) {
        this.c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }
    
    public final void c(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        final HashSet set = new HashSet((Collection<? extends E>)this.f.keySet());
        final int n = 0;
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (!this.f.containsKey(id)) {
                final StringBuilder j = fu8.j("id unknown ");
                j.append(la8.d(child));
                Log.w("ConstraintSet", j.toString());
            }
            else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f.containsKey(id)) {
                        set.remove(id);
                        final a a = this.f.get(id);
                        if (a != null) {
                            if (child instanceof Barrier) {
                                a.e.i0 = 1;
                                final Barrier barrier = (Barrier)child;
                                ((View)barrier).setId(id);
                                barrier.setType(a.e.g0);
                                barrier.setMargin(a.e.h0);
                                barrier.setAllowsGoneWidget(a.e.o0);
                                final b e = a.e;
                                final int[] j2 = e.j0;
                                if (j2 != null) {
                                    ((androidx.constraintlayout.widget.a)barrier).setReferencedIds(j2);
                                }
                                else {
                                    final String k0 = e.k0;
                                    if (k0 != null) {
                                        e.j0 = this.k((View)barrier, k0);
                                        ((androidx.constraintlayout.widget.a)barrier).setReferencedIds(a.e.j0);
                                    }
                                }
                            }
                            final ConstraintLayout.a layoutParams = (ConstraintLayout.a)child.getLayoutParams();
                            layoutParams.a();
                            a.a(layoutParams);
                            fi6.e(child, a.g);
                            child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            final d c = a.c;
                            if (c.c == 0) {
                                child.setVisibility(c.b);
                            }
                            child.setAlpha(a.c.d);
                            child.setRotation(a.f.b);
                            child.setRotationX(a.f.c);
                            child.setRotationY(a.f.d);
                            child.setScaleX(a.f.e);
                            child.setScaleY(a.f.f);
                            final e f = a.f;
                            if (f.i != -1) {
                                final View viewById = ((View)child.getParent()).findViewById(a.f.i);
                                if (viewById != null) {
                                    final float n2 = (viewById.getBottom() + viewById.getTop()) / 2.0f;
                                    final float n3 = (viewById.getRight() + viewById.getLeft()) / 2.0f;
                                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                                        final float n4 = (float)child.getLeft();
                                        final float n5 = (float)child.getTop();
                                        child.setPivotX(n3 - n4);
                                        child.setPivotY(n2 - n5);
                                    }
                                }
                            }
                            else {
                                if (!Float.isNaN(f.g)) {
                                    child.setPivotX(a.f.g);
                                }
                                if (!Float.isNaN(a.f.h)) {
                                    child.setPivotY(a.f.h);
                                }
                            }
                            child.setTranslationX(a.f.j);
                            child.setTranslationY(a.f.k);
                            child.setTranslationZ(a.f.l);
                            final e f2 = a.f;
                            if (f2.m) {
                                child.setElevation(f2.n);
                            }
                        }
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("WARNING NO CONSTRAINTS for view ");
                        sb.append(id);
                        Log.v("ConstraintSet", sb.toString());
                    }
                }
            }
        }
        final Iterator iterator = set.iterator();
        int l;
        while (true) {
            l = n;
            if (!iterator.hasNext()) {
                break;
            }
            final Integer n6 = (Integer)iterator.next();
            final a a2 = this.f.get(n6);
            if (a2 == null) {
                continue;
            }
            if (a2.e.i0 == 1) {
                final Barrier barrier2 = new Barrier(((View)constraintLayout).getContext());
                ((View)barrier2).setId((int)n6);
                final b e2 = a2.e;
                final int[] j3 = e2.j0;
                if (j3 != null) {
                    ((androidx.constraintlayout.widget.a)barrier2).setReferencedIds(j3);
                }
                else {
                    final String k2 = e2.k0;
                    if (k2 != null) {
                        e2.j0 = this.k((View)barrier2, k2);
                        ((androidx.constraintlayout.widget.a)barrier2).setReferencedIds(a2.e.j0);
                    }
                }
                barrier2.setType(a2.e.g0);
                barrier2.setMargin(a2.e.h0);
                final ConstraintLayout.a h = constraintLayout.h();
                ((androidx.constraintlayout.widget.a)barrier2).s();
                a2.a(h);
                constraintLayout.addView((View)barrier2, (ViewGroup$LayoutParams)h);
            }
            if (!a2.e.a) {
                continue;
            }
            final Guideline guideline = new Guideline(((View)constraintLayout).getContext());
            guideline.setId((int)n6);
            final ConstraintLayout.a h2 = constraintLayout.h();
            a2.a(h2);
            constraintLayout.addView((View)guideline, (ViewGroup$LayoutParams)h2);
        }
        while (l < childCount) {
            final View child2 = constraintLayout.getChildAt(l);
            if (child2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a)child2).j(constraintLayout);
            }
            ++l;
        }
    }
    
    public final void e(final int n, final int n2) {
        if (n != 1 && n != 2) {
            if (n != 6 && n != 7) {
                this.j(2131429694, 3, 0, n, 0);
                this.j(2131429694, 4, 0, n2, 0);
                final a a = this.f.get(2131429694);
                if (a != null) {
                    a.e.y = 0.5f;
                }
            }
            else {
                this.j(2131429694, 6, 0, n, 0);
                this.j(2131429694, 7, 0, n2, 0);
                final a a2 = this.f.get(2131429694);
                if (a2 != null) {
                    a2.e.x = 0.5f;
                }
            }
        }
        else {
            this.j(2131429694, 1, 0, n, 0);
            this.j(2131429694, 2, 0, n2, 0);
            final a a3 = this.f.get(2131429694);
            if (a3 != null) {
                a3.e.x = 0.5f;
            }
        }
    }
    
    public final void f(final int n, final int n2) {
        if (this.f.containsKey(n)) {
            final a a = this.f.get(n);
            if (a == null) {
                return;
            }
            switch (n2) {
                default: {
                    throw new IllegalArgumentException("unknown constraint");
                }
                case 8: {
                    final b e = a.e;
                    e.C = -1.0f;
                    e.B = -1;
                    e.A = -1;
                    break;
                }
                case 7: {
                    final b e2 = a.e;
                    e2.v = -1;
                    e2.w = -1;
                    e2.K = 0;
                    e2.R = Integer.MIN_VALUE;
                    break;
                }
                case 6: {
                    final b e3 = a.e;
                    e3.t = -1;
                    e3.u = -1;
                    e3.L = 0;
                    e3.S = Integer.MIN_VALUE;
                    break;
                }
                case 5: {
                    final b e4 = a.e;
                    e4.q = -1;
                    e4.r = -1;
                    e4.s = -1;
                    e4.M = 0;
                    e4.T = Integer.MIN_VALUE;
                    break;
                }
                case 4: {
                    final b e5 = a.e;
                    e5.o = -1;
                    e5.p = -1;
                    e5.J = 0;
                    e5.Q = Integer.MIN_VALUE;
                    break;
                }
                case 3: {
                    final b e6 = a.e;
                    e6.n = -1;
                    e6.m = -1;
                    e6.I = 0;
                    e6.O = Integer.MIN_VALUE;
                    break;
                }
                case 2: {
                    final b e7 = a.e;
                    e7.l = -1;
                    e7.k = -1;
                    e7.H = -1;
                    e7.P = Integer.MIN_VALUE;
                    break;
                }
                case 1: {
                    final b e8 = a.e;
                    e8.j = -1;
                    e8.i = -1;
                    e8.G = -1;
                    e8.N = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    
    public final void g(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        this.f.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final ConstraintLayout.a a = (ConstraintLayout.a)child.getLayoutParams();
            final int id = child.getId();
            if (this.e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f.containsKey(id)) {
                this.f.put(id, new a());
            }
            final a a2 = this.f.get(id);
            if (a2 != null) {
                final HashMap<String, fi6> d = this.d;
                final HashMap<String, fi6> g = new HashMap<String, fi6>();
                final Class<? extends View> class1 = child.getClass();
                for (final String s : d.keySet()) {
                    final fi6 fi6 = d.get(s);
                    try {
                        if (s.equals("BackgroundColor")) {
                            g.put(s, new fi6(fi6, ((ColorDrawable)child.getBackground()).getColor()));
                            continue;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("getMap");
                        sb.append(s);
                        final String string = sb.toString();
                        try {
                            g.put(s, new fi6(fi6, class1.getMethod(string, (Class<?>[])new Class[0]).invoke(child, new Object[0])));
                        }
                        catch (final InvocationTargetException fi6) {}
                        catch (final IllegalAccessException fi6) {}
                        catch (final NoSuchMethodException fi6) {}
                    }
                    catch (final InvocationTargetException ex) {}
                    catch (final IllegalAccessException ex2) {}
                    catch (final NoSuchMethodException ex3) {}
                    ((Throwable)fi6).printStackTrace();
                }
                a2.g = g;
                a2.c(id, a);
                a2.c.b = child.getVisibility();
                a2.c.d = child.getAlpha();
                a2.f.b = child.getRotation();
                a2.f.c = child.getRotationX();
                a2.f.d = child.getRotationY();
                a2.f.e = child.getScaleX();
                a2.f.f = child.getScaleY();
                final float pivotX = child.getPivotX();
                final float pivotY = child.getPivotY();
                if (pivotX != 0.0 || pivotY != 0.0) {
                    final e f = a2.f;
                    f.g = pivotX;
                    f.h = pivotY;
                }
                a2.f.j = child.getTranslationX();
                a2.f.k = child.getTranslationY();
                a2.f.l = child.getTranslationZ();
                final e f2 = a2.f;
                if (f2.m) {
                    f2.n = child.getElevation();
                }
                if (child instanceof Barrier) {
                    final Barrier barrier = (Barrier)child;
                    a2.e.o0 = barrier.getAllowsGoneWidget();
                    a2.e.j0 = ((androidx.constraintlayout.widget.a)barrier).getReferencedIds();
                    a2.e.g0 = barrier.getType();
                    a2.e.h0 = barrier.getMargin();
                }
            }
        }
    }
    
    public final void h(final b b) {
        this.f.clear();
        for (final Integer n : b.f.keySet()) {
            final a a = b.f.get(n);
            if (a == null) {
                continue;
            }
            this.f.put(n, a.b());
        }
    }
    
    public final void i(final int n, final int n2, final int j, final int n3) {
        if (!this.f.containsKey(n)) {
            this.f.put(n, new a());
        }
        final a a = this.f.get(n);
        if (a == null) {
            return;
        }
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.u(n2));
                sb.append(" to ");
                sb.append(this.u(n3));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n3 == 7) {
                    final b e = a.e;
                    e.w = j;
                    e.v = -1;
                    break;
                }
                if (n3 == 6) {
                    final b e2 = a.e;
                    e2.v = j;
                    e2.w = -1;
                    break;
                }
                final StringBuilder i = fu8.j("right to ");
                i.append(this.u(n3));
                i.append(" undefined");
                throw new IllegalArgumentException(i.toString());
            }
            case 6: {
                if (n3 == 6) {
                    final b e3 = a.e;
                    e3.u = j;
                    e3.t = -1;
                    break;
                }
                if (n3 == 7) {
                    final b e4 = a.e;
                    e4.t = j;
                    e4.u = -1;
                    break;
                }
                final StringBuilder k = fu8.j("right to ");
                k.append(this.u(n3));
                k.append(" undefined");
                throw new IllegalArgumentException(k.toString());
            }
            case 5: {
                if (n3 == 5) {
                    final b e5 = a.e;
                    e5.q = j;
                    e5.p = -1;
                    e5.o = -1;
                    e5.m = -1;
                    e5.n = -1;
                    break;
                }
                if (n3 == 3) {
                    final b e6 = a.e;
                    e6.r = j;
                    e6.p = -1;
                    e6.o = -1;
                    e6.m = -1;
                    e6.n = -1;
                    break;
                }
                if (n3 == 4) {
                    final b e7 = a.e;
                    e7.s = j;
                    e7.p = -1;
                    e7.o = -1;
                    e7.m = -1;
                    e7.n = -1;
                    break;
                }
                final StringBuilder l = fu8.j("right to ");
                l.append(this.u(n3));
                l.append(" undefined");
                throw new IllegalArgumentException(l.toString());
            }
            case 4: {
                if (n3 == 4) {
                    final b e8 = a.e;
                    e8.p = j;
                    e8.o = -1;
                    e8.q = -1;
                    e8.r = -1;
                    e8.s = -1;
                    break;
                }
                if (n3 == 3) {
                    final b e9 = a.e;
                    e9.o = j;
                    e9.p = -1;
                    e9.q = -1;
                    e9.r = -1;
                    e9.s = -1;
                    break;
                }
                final StringBuilder m = fu8.j("right to ");
                m.append(this.u(n3));
                m.append(" undefined");
                throw new IllegalArgumentException(m.toString());
            }
            case 3: {
                if (n3 == 3) {
                    final b e10 = a.e;
                    e10.m = j;
                    e10.n = -1;
                    e10.q = -1;
                    e10.r = -1;
                    e10.s = -1;
                    break;
                }
                if (n3 == 4) {
                    final b e11 = a.e;
                    e11.n = j;
                    e11.m = -1;
                    e11.q = -1;
                    e11.r = -1;
                    e11.s = -1;
                    break;
                }
                final StringBuilder j2 = fu8.j("right to ");
                j2.append(this.u(n3));
                j2.append(" undefined");
                throw new IllegalArgumentException(j2.toString());
            }
            case 2: {
                if (n3 == 1) {
                    final b e12 = a.e;
                    e12.k = j;
                    e12.l = -1;
                    break;
                }
                if (n3 == 2) {
                    final b e13 = a.e;
                    e13.l = j;
                    e13.k = -1;
                    break;
                }
                final StringBuilder j3 = fu8.j("right to ");
                j3.append(this.u(n3));
                j3.append(" undefined");
                throw new IllegalArgumentException(j3.toString());
            }
            case 1: {
                if (n3 == 1) {
                    final b e14 = a.e;
                    e14.i = j;
                    e14.j = -1;
                    break;
                }
                if (n3 == 2) {
                    final b e15 = a.e;
                    e15.j = j;
                    e15.i = -1;
                    break;
                }
                final StringBuilder j4 = fu8.j("left to ");
                j4.append(this.u(n3));
                j4.append(" undefined");
                throw new IllegalArgumentException(j4.toString());
            }
        }
    }
    
    public final void j(final int n, final int n2, final int j, final int n3, final int n4) {
        if (!this.f.containsKey(n)) {
            this.f.put(n, new a());
        }
        final a a = this.f.get(n);
        if (a == null) {
            return;
        }
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.u(n2));
                sb.append(" to ");
                sb.append(this.u(n3));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n3 == 7) {
                    final b e = a.e;
                    e.w = j;
                    e.v = -1;
                }
                else {
                    if (n3 != 6) {
                        final StringBuilder i = fu8.j("right to ");
                        i.append(this.u(n3));
                        i.append(" undefined");
                        throw new IllegalArgumentException(i.toString());
                    }
                    final b e2 = a.e;
                    e2.v = j;
                    e2.w = -1;
                }
                a.e.K = n4;
                break;
            }
            case 6: {
                if (n3 == 6) {
                    final b e3 = a.e;
                    e3.u = j;
                    e3.t = -1;
                }
                else {
                    if (n3 != 7) {
                        final StringBuilder k = fu8.j("right to ");
                        k.append(this.u(n3));
                        k.append(" undefined");
                        throw new IllegalArgumentException(k.toString());
                    }
                    final b e4 = a.e;
                    e4.t = j;
                    e4.u = -1;
                }
                a.e.L = n4;
                break;
            }
            case 5: {
                if (n3 == 5) {
                    final b e5 = a.e;
                    e5.q = j;
                    e5.p = -1;
                    e5.o = -1;
                    e5.m = -1;
                    e5.n = -1;
                    break;
                }
                if (n3 == 3) {
                    final b e6 = a.e;
                    e6.r = j;
                    e6.p = -1;
                    e6.o = -1;
                    e6.m = -1;
                    e6.n = -1;
                    break;
                }
                if (n3 == 4) {
                    final b e7 = a.e;
                    e7.s = j;
                    e7.p = -1;
                    e7.o = -1;
                    e7.m = -1;
                    e7.n = -1;
                    break;
                }
                final StringBuilder l = fu8.j("right to ");
                l.append(this.u(n3));
                l.append(" undefined");
                throw new IllegalArgumentException(l.toString());
            }
            case 4: {
                if (n3 == 4) {
                    final b e8 = a.e;
                    e8.p = j;
                    e8.o = -1;
                    e8.q = -1;
                    e8.r = -1;
                    e8.s = -1;
                }
                else {
                    if (n3 != 3) {
                        final StringBuilder m = fu8.j("right to ");
                        m.append(this.u(n3));
                        m.append(" undefined");
                        throw new IllegalArgumentException(m.toString());
                    }
                    final b e9 = a.e;
                    e9.o = j;
                    e9.p = -1;
                    e9.q = -1;
                    e9.r = -1;
                    e9.s = -1;
                }
                a.e.J = n4;
                break;
            }
            case 3: {
                if (n3 == 3) {
                    final b e10 = a.e;
                    e10.m = j;
                    e10.n = -1;
                    e10.q = -1;
                    e10.r = -1;
                    e10.s = -1;
                }
                else {
                    if (n3 != 4) {
                        final StringBuilder j2 = fu8.j("right to ");
                        j2.append(this.u(n3));
                        j2.append(" undefined");
                        throw new IllegalArgumentException(j2.toString());
                    }
                    final b e11 = a.e;
                    e11.n = j;
                    e11.m = -1;
                    e11.q = -1;
                    e11.r = -1;
                    e11.s = -1;
                }
                a.e.I = n4;
                break;
            }
            case 2: {
                if (n3 == 1) {
                    final b e12 = a.e;
                    e12.k = j;
                    e12.l = -1;
                }
                else {
                    if (n3 != 2) {
                        final StringBuilder j3 = fu8.j("right to ");
                        j3.append(this.u(n3));
                        j3.append(" undefined");
                        throw new IllegalArgumentException(j3.toString());
                    }
                    final b e13 = a.e;
                    e13.l = j;
                    e13.k = -1;
                }
                a.e.H = n4;
                break;
            }
            case 1: {
                if (n3 == 1) {
                    final b e14 = a.e;
                    e14.i = j;
                    e14.j = -1;
                }
                else {
                    if (n3 != 2) {
                        final StringBuilder j4 = fu8.j("Left to ");
                        j4.append(this.u(n3));
                        j4.append(" undefined");
                        throw new IllegalArgumentException(j4.toString());
                    }
                    final b e15 = a.e;
                    e15.j = j;
                    e15.i = -1;
                }
                a.e.G = n4;
                break;
            }
        }
    }
    
    public final int[] k(final View view, String s) {
        final String[] split = s.split(",");
        final Context context = view.getContext();
        s = (String)(Object)new int[split.length];
        int i;
        int n;
        for (i = 0, n = 0; i < split.length; ++i, ++n) {
            final String trim = split[i].trim();
            int int1;
            try {
                int1 = yvl.class.getField(trim).getInt(null);
            }
            catch (final Exception ex) {
                int1 = 0;
            }
            int identifier = int1;
            if (int1 == 0) {
                identifier = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int intValue;
            if ((intValue = identifier) == 0) {
                intValue = identifier;
                if (view.isInEditMode()) {
                    intValue = identifier;
                    if (view.getParent() instanceof ConstraintLayout) {
                        final Object l = ((ConstraintLayout)view.getParent()).l(trim);
                        intValue = identifier;
                        if (l != null) {
                            intValue = identifier;
                            if (l instanceof Integer) {
                                intValue = (int)l;
                            }
                        }
                    }
                }
            }
            s[n] = intValue;
        }
        Object copy = s;
        if (n != split.length) {
            copy = Arrays.copyOf((int[])(Object)s, n);
        }
        return (int[])copy;
    }
    
    public final a l(final Context context, final AttributeSet set, final boolean b) {
        final a a = new a();
        int[] array;
        if (b) {
            array = as2.R0;
        }
        else {
            array = as2.P0;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, array);
        if (b) {
            t(a, obtainStyledAttributes);
        }
        else {
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && 23 != index && 24 != index) {
                    a.d.a = true;
                    a.e.b = true;
                    a.c.a = true;
                    a.f.a = true;
                }
                switch (b.h.get(index)) {
                    default: {
                        final StringBuilder j = fu8.j("Unknown attribute 0x");
                        j.append(Integer.toHexString(index));
                        j.append("   ");
                        j.append(b.h.get(index));
                        Log.w("ConstraintSet", j.toString());
                        break;
                    }
                    case 97: {
                        final b e = a.e;
                        e.p0 = obtainStyledAttributes.getInt(index, e.p0);
                        break;
                    }
                    case 96: {
                        r(a.e, obtainStyledAttributes, index, 1);
                        break;
                    }
                    case 95: {
                        r(a.e, obtainStyledAttributes, index, 0);
                        break;
                    }
                    case 94: {
                        final b e2 = a.e;
                        e2.T = obtainStyledAttributes.getDimensionPixelSize(index, e2.T);
                        break;
                    }
                    case 93: {
                        final b e3 = a.e;
                        e3.M = obtainStyledAttributes.getDimensionPixelSize(index, e3.M);
                        break;
                    }
                    case 92: {
                        final b e4 = a.e;
                        e4.s = q(obtainStyledAttributes, index, e4.s);
                        break;
                    }
                    case 91: {
                        final b e5 = a.e;
                        e5.r = q(obtainStyledAttributes, index, e5.r);
                        break;
                    }
                    case 87: {
                        final StringBuilder k = fu8.j("unused attribute 0x");
                        k.append(Integer.toHexString(index));
                        k.append("   ");
                        k.append(b.h.get(index));
                        Log.w("ConstraintSet", k.toString());
                        break;
                    }
                    case 86: {
                        final int type = obtainStyledAttributes.peekValue(index).type;
                        if (type == 1) {
                            a.d.m = obtainStyledAttributes.getResourceId(index, -1);
                            final c d = a.d;
                            if (d.m != -1) {
                                d.l = -2;
                                break;
                            }
                            break;
                        }
                        else {
                            if (type != 3) {
                                final c d2 = a.d;
                                d2.l = obtainStyledAttributes.getInteger(index, d2.m);
                                break;
                            }
                            a.d.k = obtainStyledAttributes.getString(index);
                            if (a.d.k.indexOf("/") > 0) {
                                a.d.m = obtainStyledAttributes.getResourceId(index, -1);
                                a.d.l = -2;
                                break;
                            }
                            a.d.l = -1;
                            break;
                        }
                        break;
                    }
                    case 85: {
                        final c d3 = a.d;
                        d3.i = obtainStyledAttributes.getFloat(index, d3.i);
                        break;
                    }
                    case 84: {
                        final c d4 = a.d;
                        d4.j = obtainStyledAttributes.getInteger(index, d4.j);
                        break;
                    }
                    case 83: {
                        final e f = a.f;
                        f.i = q(obtainStyledAttributes, index, f.i);
                        break;
                    }
                    case 82: {
                        final c d5 = a.d;
                        d5.c = obtainStyledAttributes.getInteger(index, d5.c);
                        break;
                    }
                    case 81: {
                        final b e6 = a.e;
                        e6.n0 = obtainStyledAttributes.getBoolean(index, e6.n0);
                        break;
                    }
                    case 80: {
                        final b e7 = a.e;
                        e7.m0 = obtainStyledAttributes.getBoolean(index, e7.m0);
                        break;
                    }
                    case 79: {
                        final c d6 = a.d;
                        d6.g = obtainStyledAttributes.getFloat(index, d6.g);
                        break;
                    }
                    case 78: {
                        final d c = a.c;
                        c.c = obtainStyledAttributes.getInt(index, c.c);
                        break;
                    }
                    case 77: {
                        a.e.l0 = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 76: {
                        final c d7 = a.d;
                        d7.e = obtainStyledAttributes.getInt(index, d7.e);
                        break;
                    }
                    case 75: {
                        final b e8 = a.e;
                        e8.o0 = obtainStyledAttributes.getBoolean(index, e8.o0);
                        break;
                    }
                    case 74: {
                        a.e.k0 = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 73: {
                        final b e9 = a.e;
                        e9.h0 = obtainStyledAttributes.getDimensionPixelSize(index, e9.h0);
                        break;
                    }
                    case 72: {
                        final b e10 = a.e;
                        e10.g0 = obtainStyledAttributes.getInt(index, e10.g0);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 70: {
                        a.e.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    }
                    case 69: {
                        a.e.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    }
                    case 68: {
                        final d c2 = a.c;
                        c2.e = obtainStyledAttributes.getFloat(index, c2.e);
                        break;
                    }
                    case 67: {
                        final c d8 = a.d;
                        d8.h = obtainStyledAttributes.getFloat(index, d8.h);
                        break;
                    }
                    case 66: {
                        a.d.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    }
                    case 65: {
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            a.d.d = obtainStyledAttributes.getString(index);
                            break;
                        }
                        a.d.d = ip9.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                    case 64: {
                        final c d9 = a.d;
                        d9.b = q(obtainStyledAttributes, index, d9.b);
                        break;
                    }
                    case 63: {
                        final b e11 = a.e;
                        e11.C = obtainStyledAttributes.getFloat(index, e11.C);
                        break;
                    }
                    case 62: {
                        final b e12 = a.e;
                        e12.B = obtainStyledAttributes.getDimensionPixelSize(index, e12.B);
                        break;
                    }
                    case 61: {
                        final b e13 = a.e;
                        e13.A = q(obtainStyledAttributes, index, e13.A);
                        break;
                    }
                    case 60: {
                        final e f2 = a.f;
                        f2.b = obtainStyledAttributes.getFloat(index, f2.b);
                        break;
                    }
                    case 59: {
                        final b e14 = a.e;
                        e14.d0 = obtainStyledAttributes.getDimensionPixelSize(index, e14.d0);
                        break;
                    }
                    case 58: {
                        final b e15 = a.e;
                        e15.c0 = obtainStyledAttributes.getDimensionPixelSize(index, e15.c0);
                        break;
                    }
                    case 57: {
                        final b e16 = a.e;
                        e16.b0 = obtainStyledAttributes.getDimensionPixelSize(index, e16.b0);
                        break;
                    }
                    case 56: {
                        final b e17 = a.e;
                        e17.a0 = obtainStyledAttributes.getDimensionPixelSize(index, e17.a0);
                        break;
                    }
                    case 55: {
                        final b e18 = a.e;
                        e18.Z = obtainStyledAttributes.getInt(index, e18.Z);
                        break;
                    }
                    case 54: {
                        final b e19 = a.e;
                        e19.Y = obtainStyledAttributes.getInt(index, e19.Y);
                        break;
                    }
                    case 53: {
                        final e f3 = a.f;
                        f3.l = obtainStyledAttributes.getDimension(index, f3.l);
                        break;
                    }
                    case 52: {
                        final e f4 = a.f;
                        f4.k = obtainStyledAttributes.getDimension(index, f4.k);
                        break;
                    }
                    case 51: {
                        final e f5 = a.f;
                        f5.j = obtainStyledAttributes.getDimension(index, f5.j);
                        break;
                    }
                    case 50: {
                        final e f6 = a.f;
                        f6.h = obtainStyledAttributes.getDimension(index, f6.h);
                        break;
                    }
                    case 49: {
                        final e f7 = a.f;
                        f7.g = obtainStyledAttributes.getDimension(index, f7.g);
                        break;
                    }
                    case 48: {
                        final e f8 = a.f;
                        f8.f = obtainStyledAttributes.getFloat(index, f8.f);
                        break;
                    }
                    case 47: {
                        final e f9 = a.f;
                        f9.e = obtainStyledAttributes.getFloat(index, f9.e);
                        break;
                    }
                    case 46: {
                        final e f10 = a.f;
                        f10.d = obtainStyledAttributes.getFloat(index, f10.d);
                        break;
                    }
                    case 45: {
                        final e f11 = a.f;
                        f11.c = obtainStyledAttributes.getFloat(index, f11.c);
                        break;
                    }
                    case 44: {
                        final e f12 = a.f;
                        f12.m = true;
                        f12.n = obtainStyledAttributes.getDimension(index, f12.n);
                        break;
                    }
                    case 43: {
                        final d c3 = a.c;
                        c3.d = obtainStyledAttributes.getFloat(index, c3.d);
                        break;
                    }
                    case 42: {
                        final b e20 = a.e;
                        e20.X = obtainStyledAttributes.getInt(index, e20.X);
                        break;
                    }
                    case 41: {
                        final b e21 = a.e;
                        e21.W = obtainStyledAttributes.getInt(index, e21.W);
                        break;
                    }
                    case 40: {
                        final b e22 = a.e;
                        e22.U = obtainStyledAttributes.getFloat(index, e22.U);
                        break;
                    }
                    case 39: {
                        final b e23 = a.e;
                        e23.V = obtainStyledAttributes.getFloat(index, e23.V);
                        break;
                    }
                    case 38: {
                        a.a = obtainStyledAttributes.getResourceId(index, a.a);
                        break;
                    }
                    case 37: {
                        final b e24 = a.e;
                        e24.y = obtainStyledAttributes.getFloat(index, e24.y);
                        break;
                    }
                    case 36: {
                        final b e25 = a.e;
                        e25.m = q(obtainStyledAttributes, index, e25.m);
                        break;
                    }
                    case 35: {
                        final b e26 = a.e;
                        e26.n = q(obtainStyledAttributes, index, e26.n);
                        break;
                    }
                    case 34: {
                        final b e27 = a.e;
                        e27.I = obtainStyledAttributes.getDimensionPixelSize(index, e27.I);
                        break;
                    }
                    case 33: {
                        final b e28 = a.e;
                        e28.u = q(obtainStyledAttributes, index, e28.u);
                        break;
                    }
                    case 32: {
                        final b e29 = a.e;
                        e29.t = q(obtainStyledAttributes, index, e29.t);
                        break;
                    }
                    case 31: {
                        final b e30 = a.e;
                        e30.L = obtainStyledAttributes.getDimensionPixelSize(index, e30.L);
                        break;
                    }
                    case 30: {
                        final b e31 = a.e;
                        e31.l = q(obtainStyledAttributes, index, e31.l);
                        break;
                    }
                    case 29: {
                        final b e32 = a.e;
                        e32.k = q(obtainStyledAttributes, index, e32.k);
                        break;
                    }
                    case 28: {
                        final b e33 = a.e;
                        e33.H = obtainStyledAttributes.getDimensionPixelSize(index, e33.H);
                        break;
                    }
                    case 27: {
                        final b e34 = a.e;
                        e34.F = obtainStyledAttributes.getInt(index, e34.F);
                        break;
                    }
                    case 26: {
                        final b e35 = a.e;
                        e35.j = q(obtainStyledAttributes, index, e35.j);
                        break;
                    }
                    case 25: {
                        final b e36 = a.e;
                        e36.i = q(obtainStyledAttributes, index, e36.i);
                        break;
                    }
                    case 24: {
                        final b e37 = a.e;
                        e37.G = obtainStyledAttributes.getDimensionPixelSize(index, e37.G);
                        break;
                    }
                    case 23: {
                        final b e38 = a.e;
                        e38.c = obtainStyledAttributes.getLayoutDimension(index, e38.c);
                        break;
                    }
                    case 22: {
                        final d c4 = a.c;
                        c4.b = obtainStyledAttributes.getInt(index, c4.b);
                        final d c5 = a.c;
                        c5.b = b.g[c5.b];
                        break;
                    }
                    case 21: {
                        final b e39 = a.e;
                        e39.d = obtainStyledAttributes.getLayoutDimension(index, e39.d);
                        break;
                    }
                    case 20: {
                        final b e40 = a.e;
                        e40.x = obtainStyledAttributes.getFloat(index, e40.x);
                        break;
                    }
                    case 19: {
                        final b e41 = a.e;
                        e41.g = obtainStyledAttributes.getFloat(index, e41.g);
                        break;
                    }
                    case 18: {
                        final b e42 = a.e;
                        e42.f = obtainStyledAttributes.getDimensionPixelOffset(index, e42.f);
                        break;
                    }
                    case 17: {
                        final b e43 = a.e;
                        e43.e = obtainStyledAttributes.getDimensionPixelOffset(index, e43.e);
                        break;
                    }
                    case 16: {
                        final b e44 = a.e;
                        e44.O = obtainStyledAttributes.getDimensionPixelSize(index, e44.O);
                        break;
                    }
                    case 15: {
                        final b e45 = a.e;
                        e45.S = obtainStyledAttributes.getDimensionPixelSize(index, e45.S);
                        break;
                    }
                    case 14: {
                        final b e46 = a.e;
                        e46.P = obtainStyledAttributes.getDimensionPixelSize(index, e46.P);
                        break;
                    }
                    case 13: {
                        final b e47 = a.e;
                        e47.N = obtainStyledAttributes.getDimensionPixelSize(index, e47.N);
                        break;
                    }
                    case 12: {
                        final b e48 = a.e;
                        e48.R = obtainStyledAttributes.getDimensionPixelSize(index, e48.R);
                        break;
                    }
                    case 11: {
                        final b e49 = a.e;
                        e49.Q = obtainStyledAttributes.getDimensionPixelSize(index, e49.Q);
                        break;
                    }
                    case 10: {
                        final b e50 = a.e;
                        e50.v = q(obtainStyledAttributes, index, e50.v);
                        break;
                    }
                    case 9: {
                        final b e51 = a.e;
                        e51.w = q(obtainStyledAttributes, index, e51.w);
                        break;
                    }
                    case 8: {
                        final b e52 = a.e;
                        e52.K = obtainStyledAttributes.getDimensionPixelSize(index, e52.K);
                        break;
                    }
                    case 7: {
                        final b e53 = a.e;
                        e53.E = obtainStyledAttributes.getDimensionPixelOffset(index, e53.E);
                        break;
                    }
                    case 6: {
                        final b e54 = a.e;
                        e54.D = obtainStyledAttributes.getDimensionPixelOffset(index, e54.D);
                        break;
                    }
                    case 5: {
                        a.e.z = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 4: {
                        final b e55 = a.e;
                        e55.o = q(obtainStyledAttributes, index, e55.o);
                        break;
                    }
                    case 3: {
                        final b e56 = a.e;
                        e56.p = q(obtainStyledAttributes, index, e56.p);
                        break;
                    }
                    case 2: {
                        final b e57 = a.e;
                        e57.J = obtainStyledAttributes.getDimensionPixelSize(index, e57.J);
                        break;
                    }
                    case 1: {
                        final b e58 = a.e;
                        e58.q = q(obtainStyledAttributes, index, e58.q);
                        break;
                    }
                }
            }
            final b e59 = a.e;
            if (e59.k0 != null) {
                e59.j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return a;
    }
    
    public final a m(final int n) {
        if (!this.f.containsKey(n)) {
            this.f.put(n, new a());
        }
        return this.f.get(n);
    }
    
    public final a n(final int n) {
        if (this.f.containsKey(n)) {
            return this.f.get(n);
        }
        return null;
    }
    
    public final void o(final Context context, int i) {
        final XmlResourceParser xml = context.getResources().getXml(i);
        try {
            String name;
            a l;
            for (i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                if (i != 0) {
                    if (i == 2) {
                        name = ((XmlPullParser)xml).getName();
                        l = this.l(context, Xml.asAttributeSet((XmlPullParser)xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            l.e.a = true;
                        }
                        this.f.put(l.a, l);
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public final void p(final Context context, final XmlPullParser xmlPullParser) {
        try {
            int i = xmlPullParser.getEventType();
            a a = null;
            Label_0865: {
                Label_0798: {
                    Label_0733: {
                        Label_0668: {
                            Label_0601: {
                                while (i != 1) {
                                    if (i != 0) {
                                        final int n = -1;
                                        if (i != 2) {
                                            if (i == 3) {
                                                final String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                                                int n2 = 0;
                                                switch (lowerCase.hashCode()) {
                                                    default: {
                                                        n2 = n;
                                                        break;
                                                    }
                                                    case 2146106725: {
                                                        n2 = n;
                                                        if (lowerCase.equals("constraintset")) {
                                                            n2 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 426575017: {
                                                        n2 = n;
                                                        if (lowerCase.equals("constraintoverride")) {
                                                            n2 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -190376483: {
                                                        n2 = n;
                                                        if (lowerCase.equals("constraint")) {
                                                            n2 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -2075718416: {
                                                        n2 = n;
                                                        if (lowerCase.equals("guideline")) {
                                                            n2 = 3;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (n2 == 0) {
                                                    return;
                                                }
                                                if (n2 == 1 || n2 == 2 || n2 == 3) {
                                                    this.f.put(a.a, a);
                                                    a = null;
                                                }
                                            }
                                        }
                                        else {
                                            final String name = xmlPullParser.getName();
                                            int n3 = 0;
                                            switch (name.hashCode()) {
                                                default: {
                                                    n3 = n;
                                                    break;
                                                }
                                                case 1803088381: {
                                                    n3 = n;
                                                    if (name.equals("Constraint")) {
                                                        n3 = 0;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1791837707: {
                                                    n3 = n;
                                                    if (name.equals("CustomAttribute")) {
                                                        n3 = 8;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1331510167: {
                                                    n3 = n;
                                                    if (name.equals("Barrier")) {
                                                        n3 = 3;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 366511058: {
                                                    n3 = n;
                                                    if (name.equals("CustomMethod")) {
                                                        n3 = 9;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -71750448: {
                                                    n3 = n;
                                                    if (name.equals("Guideline")) {
                                                        n3 = 2;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1238332596: {
                                                    n3 = n;
                                                    if (name.equals("Transform")) {
                                                        n3 = 5;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1269513683: {
                                                    n3 = n;
                                                    if (name.equals("PropertySet")) {
                                                        n3 = 4;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1962203927: {
                                                    n3 = n;
                                                    if (name.equals("ConstraintOverride")) {
                                                        n3 = 1;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1984451626: {
                                                    n3 = n;
                                                    if (name.equals("Motion")) {
                                                        n3 = 7;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -2025855158: {
                                                    final boolean equals = name.equals("Layout");
                                                    n3 = n;
                                                    if (equals) {
                                                        n3 = 6;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            switch (n3) {
                                                case 8:
                                                case 9: {
                                                    if (a != null) {
                                                        fi6.d(context, xmlPullParser, a.g);
                                                        break;
                                                    }
                                                    break Label_0601;
                                                }
                                                case 7: {
                                                    if (a != null) {
                                                        a.d.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0668;
                                                }
                                                case 6: {
                                                    if (a != null) {
                                                        a.e.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0733;
                                                }
                                                case 5: {
                                                    if (a != null) {
                                                        a.f.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0798;
                                                }
                                                case 4: {
                                                    if (a != null) {
                                                        a.c.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0865;
                                                }
                                                case 3: {
                                                    a = this.l(context, Xml.asAttributeSet(xmlPullParser), false);
                                                    a.e.i0 = 1;
                                                    break;
                                                }
                                                case 2: {
                                                    a = this.l(context, Xml.asAttributeSet(xmlPullParser), false);
                                                    final b e = a.e;
                                                    e.a = true;
                                                    e.b = true;
                                                    break;
                                                }
                                                case 1: {
                                                    a = this.l(context, Xml.asAttributeSet(xmlPullParser), true);
                                                    break;
                                                }
                                                case 0: {
                                                    a = this.l(context, Xml.asAttributeSet(xmlPullParser), false);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        xmlPullParser.getName();
                                    }
                                    i = xmlPullParser.next();
                                }
                                return;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("XML parser error must be within a Constraint ");
                            sb.append(xmlPullParser.getLineNumber());
                            throw new RuntimeException(sb.toString());
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("XML parser error must be within a Constraint ");
                        sb2.append(xmlPullParser.getLineNumber());
                        throw new RuntimeException(sb2.toString());
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("XML parser error must be within a Constraint ");
                    sb3.append(xmlPullParser.getLineNumber());
                    throw new RuntimeException(sb3.toString());
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("XML parser error must be within a Constraint ");
                sb4.append(xmlPullParser.getLineNumber());
                throw new RuntimeException(sb4.toString());
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("XML parser error must be within a Constraint ");
            sb5.append(xmlPullParser.getLineNumber());
            throw new RuntimeException(sb5.toString());
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public final String u(final int n) {
        switch (n) {
            default: {
                return "undefined";
            }
            case 7: {
                return "end";
            }
            case 6: {
                return "start";
            }
            case 5: {
                return "baseline";
            }
            case 4: {
                return "bottom";
            }
            case 3: {
                return "top";
            }
            case 2: {
                return "right";
            }
            case 1: {
                return "left";
            }
        }
    }
    
    public static final class a
    {
        public int a;
        public String b;
        public final d c;
        public final c d;
        public final b e;
        public final e f;
        public HashMap<String, fi6> g;
        public a h;
        
        public a() {
            this.c = new d();
            this.d = new c();
            this.e = new b();
            this.f = new e();
            this.g = new HashMap<String, fi6>();
        }
        
        public final void a(final ConstraintLayout.a a) {
            final b e = this.e;
            a.e = e.i;
            a.f = e.j;
            a.g = e.k;
            a.h = e.l;
            a.i = e.m;
            a.j = e.n;
            a.k = e.o;
            a.l = e.p;
            a.m = e.q;
            a.n = e.r;
            a.o = e.s;
            a.s = e.t;
            a.t = e.u;
            a.u = e.v;
            a.v = e.w;
            a.leftMargin = e.G;
            a.rightMargin = e.H;
            a.topMargin = e.I;
            a.bottomMargin = e.J;
            a.A = e.S;
            a.B = e.R;
            a.x = e.O;
            a.z = e.Q;
            a.E = e.x;
            a.F = e.y;
            a.p = e.A;
            a.q = e.B;
            a.r = e.C;
            a.G = e.z;
            a.T = e.D;
            a.U = e.E;
            a.I = e.U;
            a.H = e.V;
            a.K = e.X;
            a.J = e.W;
            a.W = e.m0;
            a.X = e.n0;
            a.L = e.Y;
            a.M = e.Z;
            a.P = e.a0;
            a.Q = e.b0;
            a.N = e.c0;
            a.O = e.d0;
            a.R = e.e0;
            a.S = e.f0;
            a.V = e.F;
            a.c = e.g;
            a.a = e.e;
            a.b = e.f;
            a.width = e.c;
            a.height = e.d;
            final String l0 = e.l0;
            if (l0 != null) {
                a.Y = l0;
            }
            a.Z = e.p0;
            a.setMarginStart(e.L);
            a.setMarginEnd(this.e.K);
            a.a();
        }
        
        public final a b() {
            final a a = new a();
            a.e.a(this.e);
            a.d.a(this.d);
            a.c.a(this.c);
            a.f.a(this.f);
            a.a = this.a;
            a.h = this.h;
            return a;
        }
        
        public final void c(final int a, final ConstraintLayout.a a2) {
            this.a = a;
            final b e = this.e;
            e.i = a2.e;
            e.j = a2.f;
            e.k = a2.g;
            e.l = a2.h;
            e.m = a2.i;
            e.n = a2.j;
            e.o = a2.k;
            e.p = a2.l;
            e.q = a2.m;
            e.r = a2.n;
            e.s = a2.o;
            e.t = a2.s;
            e.u = a2.t;
            e.v = a2.u;
            e.w = a2.v;
            e.x = a2.E;
            e.y = a2.F;
            e.z = a2.G;
            e.A = a2.p;
            e.B = a2.q;
            e.C = a2.r;
            e.D = a2.T;
            e.E = a2.U;
            e.F = a2.V;
            e.g = a2.c;
            e.e = a2.a;
            e.f = a2.b;
            e.c = a2.width;
            e.d = a2.height;
            e.G = a2.leftMargin;
            e.H = a2.rightMargin;
            e.I = a2.topMargin;
            e.J = a2.bottomMargin;
            e.M = a2.D;
            e.U = a2.I;
            e.V = a2.H;
            e.X = a2.K;
            e.W = a2.J;
            e.m0 = a2.W;
            e.n0 = a2.X;
            e.Y = a2.L;
            e.Z = a2.M;
            e.a0 = a2.P;
            e.b0 = a2.Q;
            e.c0 = a2.N;
            e.d0 = a2.O;
            e.e0 = a2.R;
            e.f0 = a2.S;
            e.l0 = a2.Y;
            e.O = a2.x;
            e.Q = a2.z;
            e.N = a2.w;
            e.P = a2.y;
            e.S = a2.A;
            e.R = a2.B;
            e.T = a2.C;
            e.p0 = a2.Z;
            e.K = a2.getMarginEnd();
            this.e.L = a2.getMarginStart();
        }
        
        public final /* bridge */ Object clone() throws CloneNotSupportedException {
            return this.b();
        }
        
        public final void d(final int n, final c$a c$a) {
            this.c(n, (ConstraintLayout.a)c$a);
            this.c.d = c$a.r0;
            final e f = this.f;
            f.b = c$a.u0;
            f.c = c$a.v0;
            f.d = c$a.w0;
            f.e = c$a.x0;
            f.f = c$a.y0;
            f.g = c$a.z0;
            f.h = c$a.A0;
            f.j = c$a.B0;
            f.k = c$a.C0;
            f.l = c$a.D0;
            f.n = c$a.t0;
            f.m = c$a.s0;
        }
        
        public static final class a
        {
            public int[] a;
            public int[] b;
            public int c;
            public int[] d;
            public float[] e;
            public int f;
            public int[] g;
            public String[] h;
            public int i;
            public int[] j;
            public boolean[] k;
            public int l;
            
            public a() {
                this.a = new int[10];
                this.b = new int[10];
                this.c = 0;
                this.d = new int[10];
                this.e = new float[10];
                this.f = 0;
                this.g = new int[5];
                this.h = new String[5];
                this.i = 0;
                this.j = new int[4];
                this.k = new boolean[4];
                this.l = 0;
            }
            
            public final void a(final int n, final float n2) {
                final int f = this.f;
                final int[] d = this.d;
                if (f >= d.length) {
                    this.d = Arrays.copyOf(d, d.length * 2);
                    final float[] e = this.e;
                    this.e = Arrays.copyOf(e, e.length * 2);
                }
                final int[] d2 = this.d;
                final int f2 = this.f;
                d2[f2] = n;
                final float[] e2 = this.e;
                this.f = f2 + 1;
                e2[f2] = n2;
            }
            
            public final void b(final int n, final int n2) {
                final int c = this.c;
                final int[] a = this.a;
                if (c >= a.length) {
                    this.a = Arrays.copyOf(a, a.length * 2);
                    final int[] b = this.b;
                    this.b = Arrays.copyOf(b, b.length * 2);
                }
                final int[] a2 = this.a;
                final int c2 = this.c;
                a2[c2] = n;
                final int[] b2 = this.b;
                this.c = c2 + 1;
                b2[c2] = n2;
            }
            
            public final void c(final int n, final String s) {
                final int i = this.i;
                final int[] g = this.g;
                if (i >= g.length) {
                    this.g = Arrays.copyOf(g, g.length * 2);
                    final String[] h = this.h;
                    this.h = Arrays.copyOf(h, h.length * 2);
                }
                final int[] g2 = this.g;
                final int j = this.i;
                g2[j] = n;
                final String[] h2 = this.h;
                this.i = j + 1;
                h2[j] = s;
            }
            
            public final void d(final int n, final boolean b) {
                final int l = this.l;
                final int[] j = this.j;
                if (l >= j.length) {
                    this.j = Arrays.copyOf(j, j.length * 2);
                    final boolean[] k = this.k;
                    this.k = Arrays.copyOf(k, k.length * 2);
                }
                final int[] i = this.j;
                final int m = this.l;
                i[m] = n;
                final boolean[] k2 = this.k;
                this.l = m + 1;
                k2[m] = b;
            }
            
            public final void e(final androidx.constraintlayout.widget.b.a a) {
                final int n = 0;
                for (int i = 0; i < this.c; ++i) {
                    final int n2 = this.a[i];
                    final int d = this.b[i];
                    final int[] g = androidx.constraintlayout.widget.b.g;
                    if (n2 != 6) {
                        if (n2 != 7) {
                            if (n2 != 8) {
                                if (n2 != 27) {
                                    if (n2 != 28) {
                                        if (n2 != 41) {
                                            if (n2 != 42) {
                                                if (n2 != 61) {
                                                    if (n2 != 62) {
                                                        if (n2 != 72) {
                                                            if (n2 != 73) {
                                                                if (n2 != 2) {
                                                                    if (n2 != 31) {
                                                                        if (n2 != 34) {
                                                                            if (n2 != 38) {
                                                                                if (n2 != 64) {
                                                                                    if (n2 != 66) {
                                                                                        if (n2 != 76) {
                                                                                            if (n2 != 78) {
                                                                                                if (n2 != 97) {
                                                                                                    if (n2 != 93) {
                                                                                                        if (n2 != 94) {
                                                                                                            switch (n2) {
                                                                                                                default: {
                                                                                                                    switch (n2) {
                                                                                                                        default: {
                                                                                                                            switch (n2) {
                                                                                                                                default: {
                                                                                                                                    switch (n2) {
                                                                                                                                        default: {
                                                                                                                                            switch (n2) {
                                                                                                                                                default: {
                                                                                                                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                case 87: {
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                case 89: {
                                                                                                                                                    a.d.m = d;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                case 88: {
                                                                                                                                                    a.d.l = d;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        case 84: {
                                                                                                                                            a.d.j = d;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        case 83: {
                                                                                                                                            a.f.i = d;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        case 82: {
                                                                                                                                            a.d.c = d;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                case 59: {
                                                                                                                                    a.e.d0 = d;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                case 58: {
                                                                                                                                    a.e.c0 = d;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                case 57: {
                                                                                                                                    a.e.b0 = d;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                case 56: {
                                                                                                                                    a.e.a0 = d;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                case 55: {
                                                                                                                                    a.e.Z = d;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                case 54: {
                                                                                                                                    a.e.Y = d;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        case 24: {
                                                                                                                            a.e.G = d;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        case 23: {
                                                                                                                            a.e.c = d;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        case 22: {
                                                                                                                            a.c.b = d;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        case 21: {
                                                                                                                            a.e.d = d;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 18: {
                                                                                                                    a.e.f = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 17: {
                                                                                                                    a.e.e = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 16: {
                                                                                                                    a.e.O = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 15: {
                                                                                                                    a.e.S = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 14: {
                                                                                                                    a.e.P = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 13: {
                                                                                                                    a.e.N = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 12: {
                                                                                                                    a.e.R = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 11: {
                                                                                                                    a.e.Q = d;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            a.e.T = d;
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        a.e.M = d;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    a.e.p0 = d;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                a.c.c = d;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            a.d.e = d;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        a.d.f = d;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    a.d.b = d;
                                                                                }
                                                                            }
                                                                            else {
                                                                                a.a = d;
                                                                            }
                                                                        }
                                                                        else {
                                                                            a.e.I = d;
                                                                        }
                                                                    }
                                                                    else {
                                                                        a.e.L = d;
                                                                    }
                                                                }
                                                                else {
                                                                    a.e.J = d;
                                                                }
                                                            }
                                                            else {
                                                                a.e.h0 = d;
                                                            }
                                                        }
                                                        else {
                                                            a.e.g0 = d;
                                                        }
                                                    }
                                                    else {
                                                        a.e.B = d;
                                                    }
                                                }
                                                else {
                                                    a.e.A = d;
                                                }
                                            }
                                            else {
                                                a.e.X = d;
                                            }
                                        }
                                        else {
                                            a.e.W = d;
                                        }
                                    }
                                    else {
                                        a.e.H = d;
                                    }
                                }
                                else {
                                    a.e.F = d;
                                }
                            }
                            else {
                                a.e.K = d;
                            }
                        }
                        else {
                            a.e.E = d;
                        }
                    }
                    else {
                        a.e.D = d;
                    }
                }
                for (int j = 0; j < this.f; ++j) {
                    final int n3 = this.d[j];
                    final float n4 = this.e[j];
                    final int[] g2 = androidx.constraintlayout.widget.b.g;
                    if (n3 != 19) {
                        if (n3 != 20) {
                            if (n3 != 37) {
                                if (n3 != 60) {
                                    if (n3 != 63) {
                                        if (n3 != 79) {
                                            if (n3 != 85) {
                                                if (n3 != 87) {
                                                    if (n3 != 39) {
                                                        if (n3 != 40) {
                                                            switch (n3) {
                                                                default: {
                                                                    switch (n3) {
                                                                        default: {
                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                            continue;
                                                                        }
                                                                        case 70: {
                                                                            a.e.f0 = n4;
                                                                            continue;
                                                                        }
                                                                        case 69: {
                                                                            a.e.e0 = n4;
                                                                            continue;
                                                                        }
                                                                        case 68: {
                                                                            a.c.e = n4;
                                                                            continue;
                                                                        }
                                                                        case 67: {
                                                                            a.d.h = n4;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 53: {
                                                                    a.f.l = n4;
                                                                    break;
                                                                }
                                                                case 52: {
                                                                    a.f.k = n4;
                                                                    break;
                                                                }
                                                                case 51: {
                                                                    a.f.j = n4;
                                                                    break;
                                                                }
                                                                case 50: {
                                                                    a.f.h = n4;
                                                                    break;
                                                                }
                                                                case 49: {
                                                                    a.f.g = n4;
                                                                    break;
                                                                }
                                                                case 48: {
                                                                    a.f.f = n4;
                                                                    break;
                                                                }
                                                                case 47: {
                                                                    a.f.e = n4;
                                                                    break;
                                                                }
                                                                case 46: {
                                                                    a.f.d = n4;
                                                                    break;
                                                                }
                                                                case 45: {
                                                                    a.f.c = n4;
                                                                    break;
                                                                }
                                                                case 44: {
                                                                    final e f = a.f;
                                                                    f.n = n4;
                                                                    f.m = true;
                                                                    break;
                                                                }
                                                                case 43: {
                                                                    a.c.d = n4;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            a.e.U = n4;
                                                        }
                                                    }
                                                    else {
                                                        a.e.V = n4;
                                                    }
                                                }
                                            }
                                            else {
                                                a.d.i = n4;
                                            }
                                        }
                                        else {
                                            a.d.g = n4;
                                        }
                                    }
                                    else {
                                        a.e.C = n4;
                                    }
                                }
                                else {
                                    a.f.b = n4;
                                }
                            }
                            else {
                                a.e.y = n4;
                            }
                        }
                        else {
                            a.e.x = n4;
                        }
                    }
                    else {
                        a.e.g = n4;
                    }
                }
                int n5 = 0;
                int k;
                while (true) {
                    k = n;
                    if (n5 >= this.i) {
                        break;
                    }
                    final int n6 = this.g[n5];
                    final String z = this.h[n5];
                    final int[] g3 = androidx.constraintlayout.widget.b.g;
                    if (n6 != 5) {
                        if (n6 != 65) {
                            if (n6 != 74) {
                                if (n6 != 77) {
                                    if (n6 != 87) {
                                        if (n6 != 90) {
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                        }
                                        else {
                                            a.d.k = z;
                                        }
                                    }
                                }
                                else {
                                    a.e.l0 = z;
                                }
                            }
                            else {
                                final b e = a.e;
                                e.k0 = z;
                                e.j0 = null;
                            }
                        }
                        else {
                            a.d.d = z;
                        }
                    }
                    else {
                        a.e.z = z;
                    }
                    ++n5;
                }
                while (k < this.l) {
                    final int n7 = this.j[k];
                    final boolean b = this.k[k];
                    final int[] g4 = androidx.constraintlayout.widget.b.g;
                    if (n7 != 44) {
                        if (n7 != 75) {
                            if (n7 != 87) {
                                if (n7 != 80) {
                                    if (n7 != 81) {
                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                    }
                                    else {
                                        a.e.n0 = b;
                                    }
                                }
                                else {
                                    a.e.m0 = b;
                                }
                            }
                        }
                        else {
                            a.e.o0 = b;
                        }
                    }
                    else {
                        a.f.m = b;
                    }
                    ++k;
                }
            }
        }
    }
    
    public static final class b
    {
        public static SparseIntArray q0;
        public int A;
        public int B;
        public float C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public boolean a;
        public int a0;
        public boolean b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public float e0;
        public int f;
        public float f0;
        public float g;
        public int g0;
        public boolean h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int[] j0;
        public int k;
        public String k0;
        public int l;
        public String l0;
        public int m;
        public boolean m0;
        public int n;
        public boolean n0;
        public int o;
        public boolean o0;
        public int p;
        public int p0;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public float y;
        public String z;
        
        static {
            (b.q0 = new SparseIntArray()).append(43, 24);
            b.q0.append(44, 25);
            b.q0.append(46, 28);
            b.q0.append(47, 29);
            b.q0.append(52, 35);
            b.q0.append(51, 34);
            b.q0.append(24, 4);
            b.q0.append(23, 3);
            b.q0.append(19, 1);
            b.q0.append(61, 6);
            b.q0.append(62, 7);
            b.q0.append(31, 17);
            b.q0.append(32, 18);
            b.q0.append(33, 19);
            b.q0.append(15, 90);
            b.q0.append(0, 26);
            b.q0.append(48, 31);
            b.q0.append(49, 32);
            b.q0.append(30, 10);
            b.q0.append(29, 9);
            b.q0.append(66, 13);
            b.q0.append(69, 16);
            b.q0.append(67, 14);
            b.q0.append(64, 11);
            b.q0.append(68, 15);
            b.q0.append(65, 12);
            b.q0.append(55, 38);
            b.q0.append(41, 37);
            b.q0.append(40, 39);
            b.q0.append(54, 40);
            b.q0.append(39, 20);
            b.q0.append(53, 36);
            b.q0.append(28, 5);
            b.q0.append(42, 91);
            b.q0.append(50, 91);
            b.q0.append(45, 91);
            b.q0.append(22, 91);
            b.q0.append(18, 91);
            b.q0.append(3, 23);
            b.q0.append(5, 27);
            b.q0.append(7, 30);
            b.q0.append(8, 8);
            b.q0.append(4, 33);
            b.q0.append(6, 2);
            b.q0.append(1, 22);
            b.q0.append(2, 21);
            b.q0.append(56, 41);
            b.q0.append(34, 42);
            b.q0.append(17, 41);
            b.q0.append(16, 42);
            b.q0.append(71, 76);
            b.q0.append(25, 61);
            b.q0.append(27, 62);
            b.q0.append(26, 63);
            b.q0.append(60, 69);
            b.q0.append(38, 70);
            b.q0.append(12, 71);
            b.q0.append(10, 72);
            b.q0.append(11, 73);
            b.q0.append(13, 74);
            b.q0.append(9, 75);
        }
        
        public b() {
            this.a = false;
            this.b = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = true;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = 0.5f;
            this.y = 0.5f;
            this.z = null;
            this.A = -1;
            this.B = 0;
            this.C = 0.0f;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = Integer.MIN_VALUE;
            this.O = Integer.MIN_VALUE;
            this.P = Integer.MIN_VALUE;
            this.Q = Integer.MIN_VALUE;
            this.R = Integer.MIN_VALUE;
            this.S = Integer.MIN_VALUE;
            this.T = Integer.MIN_VALUE;
            this.U = -1.0f;
            this.V = -1.0f;
            this.W = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.a0 = 0;
            this.b0 = 0;
            this.c0 = 0;
            this.d0 = 0;
            this.e0 = 1.0f;
            this.f0 = 1.0f;
            this.g0 = -1;
            this.h0 = 0;
            this.i0 = -1;
            this.m0 = false;
            this.n0 = false;
            this.o0 = true;
            this.p0 = 0;
        }
        
        public final void a(final b b) {
            this.a = b.a;
            this.c = b.c;
            this.b = b.b;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = b.m;
            this.n = b.n;
            this.o = b.o;
            this.p = b.p;
            this.q = b.q;
            this.r = b.r;
            this.s = b.s;
            this.t = b.t;
            this.u = b.u;
            this.v = b.v;
            this.w = b.w;
            this.x = b.x;
            this.y = b.y;
            this.z = b.z;
            this.A = b.A;
            this.B = b.B;
            this.C = b.C;
            this.D = b.D;
            this.E = b.E;
            this.F = b.F;
            this.G = b.G;
            this.H = b.H;
            this.I = b.I;
            this.J = b.J;
            this.K = b.K;
            this.L = b.L;
            this.M = b.M;
            this.N = b.N;
            this.O = b.O;
            this.P = b.P;
            this.Q = b.Q;
            this.R = b.R;
            this.S = b.S;
            this.T = b.T;
            this.U = b.U;
            this.V = b.V;
            this.W = b.W;
            this.X = b.X;
            this.Y = b.Y;
            this.Z = b.Z;
            this.a0 = b.a0;
            this.b0 = b.b0;
            this.c0 = b.c0;
            this.d0 = b.d0;
            this.e0 = b.e0;
            this.f0 = b.f0;
            this.g0 = b.g0;
            this.h0 = b.h0;
            this.i0 = b.i0;
            this.l0 = b.l0;
            final int[] j0 = b.j0;
            if (j0 != null && b.k0 == null) {
                this.j0 = Arrays.copyOf(j0, j0.length);
            }
            else {
                this.j0 = null;
            }
            this.k0 = b.k0;
            this.m0 = b.m0;
            this.n0 = b.n0;
            this.o0 = b.o0;
            this.p0 = b.p0;
        }
        
        public final void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, as2.Z0);
            this.b = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                final int value = androidx.constraintlayout.widget.b.b.q0.get(index);
                switch (value) {
                    default: {
                        switch (value) {
                            default: {
                                switch (value) {
                                    default: {
                                        final StringBuilder j = fu8.j("Unknown attribute 0x");
                                        j.append(Integer.toHexString(index));
                                        j.append("   ");
                                        j.append(androidx.constraintlayout.widget.b.b.q0.get(index));
                                        Log.w("ConstraintSet", j.toString());
                                        continue;
                                    }
                                    case 91: {
                                        final StringBuilder k = fu8.j("unused attribute 0x");
                                        k.append(Integer.toHexString(index));
                                        k.append("   ");
                                        k.append(androidx.constraintlayout.widget.b.b.q0.get(index));
                                        Log.w("ConstraintSet", k.toString());
                                        continue;
                                    }
                                    case 90: {
                                        this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                        continue;
                                    }
                                    case 89: {
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    }
                                    case 88: {
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        continue;
                                    }
                                    case 87: {
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        continue;
                                    }
                                    case 86: {
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    }
                                    case 85: {
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    }
                                    case 84: {
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        continue;
                                    }
                                    case 83: {
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        continue;
                                    }
                                    case 82: {
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    }
                                    case 81: {
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    }
                                    case 80: {
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    }
                                    case 79: {
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    }
                                    case 78: {
                                        this.s = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.s);
                                        continue;
                                    }
                                    case 77: {
                                        this.r = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.r);
                                        continue;
                                    }
                                    case 76: {
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        continue;
                                    }
                                    case 75: {
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    }
                                    case 74: {
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    }
                                    case 73: {
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        continue;
                                    }
                                    case 72: {
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        continue;
                                    }
                                    case 71: {
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    }
                                    case 70: {
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    }
                                    case 69: {
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    }
                                }
                                break;
                            }
                            case 63: {
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            }
                            case 62: {
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            }
                            case 61: {
                                this.A = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.A);
                                continue;
                            }
                        }
                        break;
                    }
                    case 42: {
                        androidx.constraintlayout.widget.b.r(this, obtainStyledAttributes, index, 1);
                        break;
                    }
                    case 41: {
                        androidx.constraintlayout.widget.b.r(this, obtainStyledAttributes, index, 0);
                        break;
                    }
                    case 40: {
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    }
                    case 39: {
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    }
                    case 38: {
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    }
                    case 37: {
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    }
                    case 36: {
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    }
                    case 35: {
                        this.m = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.m);
                        break;
                    }
                    case 34: {
                        this.n = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.n);
                        break;
                    }
                    case 33: {
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    }
                    case 32: {
                        this.u = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.u);
                        break;
                    }
                    case 31: {
                        this.t = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.t);
                        break;
                    }
                    case 30: {
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    }
                    case 29: {
                        this.l = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.l);
                        break;
                    }
                    case 28: {
                        this.k = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.k);
                        break;
                    }
                    case 27: {
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    }
                    case 26: {
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    }
                    case 25: {
                        this.j = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.j);
                        break;
                    }
                    case 24: {
                        this.i = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.i);
                        break;
                    }
                    case 23: {
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    }
                    case 22: {
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    }
                    case 21: {
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    }
                    case 20: {
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    }
                    case 19: {
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    }
                    case 18: {
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    }
                    case 17: {
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    }
                    case 16: {
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    }
                    case 15: {
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    }
                    case 14: {
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    }
                    case 13: {
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    }
                    case 12: {
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    }
                    case 11: {
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    }
                    case 10: {
                        this.v = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.v);
                        break;
                    }
                    case 9: {
                        this.w = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.w);
                        break;
                    }
                    case 8: {
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    }
                    case 7: {
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    }
                    case 6: {
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    }
                    case 5: {
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 4: {
                        this.o = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.o);
                        break;
                    }
                    case 3: {
                        this.p = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.p);
                        break;
                    }
                    case 2: {
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    }
                    case 1: {
                        this.q = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.q);
                        break;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public static final class c
    {
        public static SparseIntArray n;
        public boolean a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;
        
        static {
            (c.n = new SparseIntArray()).append(3, 1);
            c.n.append(5, 2);
            c.n.append(9, 3);
            c.n.append(2, 4);
            c.n.append(1, 5);
            c.n.append(0, 6);
            c.n.append(4, 7);
            c.n.append(8, 8);
            c.n.append(7, 9);
            c.n.append(6, 10);
        }
        
        public c() {
            this.a = false;
            this.b = -1;
            this.c = 0;
            this.d = null;
            this.e = -1;
            this.f = 0;
            this.g = Float.NaN;
            this.h = Float.NaN;
            this.i = Float.NaN;
            this.j = -1;
            this.k = null;
            this.l = -3;
            this.m = -1;
        }
        
        public final void a(final c c) {
            this.a = c.a;
            this.b = c.b;
            this.d = c.d;
            this.e = c.e;
            this.f = c.f;
            this.h = c.h;
            this.g = c.g;
        }
        
        public final void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, as2.a1);
            this.a = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                switch (androidx.constraintlayout.widget.b.c.n.get(index)) {
                    case 10: {
                        final int type = obtainStyledAttributes.peekValue(index).type;
                        if (type == 1) {
                            if ((this.m = obtainStyledAttributes.getResourceId(index, -1)) != -1) {
                                this.l = -2;
                                break;
                            }
                            break;
                        }
                        else {
                            if (type != 3) {
                                this.l = obtainStyledAttributes.getInteger(index, this.m);
                                break;
                            }
                            final String string = obtainStyledAttributes.getString(index);
                            this.k = string;
                            if (string.indexOf("/") > 0) {
                                this.m = obtainStyledAttributes.getResourceId(index, -1);
                                this.l = -2;
                                break;
                            }
                            this.l = -1;
                            break;
                        }
                        break;
                    }
                    case 9: {
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    }
                    case 8: {
                        this.j = obtainStyledAttributes.getInteger(index, this.j);
                        break;
                    }
                    case 7: {
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    }
                    case 6: {
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    }
                    case 5: {
                        this.b = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.b);
                        break;
                    }
                    case 4: {
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    }
                    case 3: {
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        }
                        this.d = ip9.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                    case 2: {
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    }
                    case 1: {
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public static final class d
    {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;
        
        public d() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = 1.0f;
            this.e = Float.NaN;
        }
        
        public final void a(final d d) {
            this.a = d.a;
            this.b = d.b;
            this.d = d.d;
            this.e = d.e;
            this.c = d.c;
        }
        
        public final void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, as2.g1);
            this.a = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                }
                else if (index == 0) {
                    final int int1 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = int1;
                    final int[] g = androidx.constraintlayout.widget.b.g;
                    this.b = androidx.constraintlayout.widget.b.g[int1];
                }
                else if (index == 4) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                }
                else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public static final class e
    {
        public static SparseIntArray o;
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;
        
        static {
            (e.o = new SparseIntArray()).append(6, 1);
            e.o.append(7, 2);
            e.o.append(8, 3);
            e.o.append(4, 4);
            e.o.append(5, 5);
            e.o.append(0, 6);
            e.o.append(1, 7);
            e.o.append(2, 8);
            e.o.append(3, 9);
            e.o.append(9, 10);
            e.o.append(10, 11);
            e.o.append(11, 12);
        }
        
        public e() {
            this.a = false;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 1.0f;
            this.f = 1.0f;
            this.g = Float.NaN;
            this.h = Float.NaN;
            this.i = -1;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = false;
            this.n = 0.0f;
        }
        
        public final void a(final e e) {
            this.a = e.a;
            this.b = e.b;
            this.c = e.c;
            this.d = e.d;
            this.e = e.e;
            this.f = e.f;
            this.g = e.g;
            this.h = e.h;
            this.i = e.i;
            this.j = e.j;
            this.k = e.k;
            this.l = e.l;
            this.m = e.m;
            this.n = e.n;
        }
        
        public final void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, as2.j1);
            this.a = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                switch (androidx.constraintlayout.widget.b.e.o.get(index)) {
                    case 12: {
                        this.i = androidx.constraintlayout.widget.b.q(obtainStyledAttributes, index, this.i);
                        break;
                    }
                    case 11: {
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    }
                    case 10: {
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    }
                    case 9: {
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    }
                    case 8: {
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    }
                    case 7: {
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    }
                    case 6: {
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    }
                    case 5: {
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    }
                    case 4: {
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    }
                    case 3: {
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    }
                    case 2: {
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    }
                    case 1: {
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
