import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpz
{
    public static final Class a;
    public static final yqz b;
    public static final yqz c;
    public static final arz d;
    
    static {
        Class a2;
        try {
            Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            a2 = null;
        }
        a = a2;
        b = t(false);
        c = t(true);
        d = new arz();
    }
    
    public static int A(final int n, final List list, final opz opz) {
        final int size = list.size();
        int i = 0;
        if (size != 0) {
            int n2 = 0;
            while (i < size) {
                n2 += jiz.q1(n, (loz)list.get(i), opz);
                ++i;
            }
            return n2;
        }
        return 0;
    }
    
    public static int B(final List list) {
        final int size = list.size();
        int n = 0;
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n5;
        if (list instanceof elz) {
            final elz elz = (elz)list;
            int n3 = 0;
            int n4 = n2;
            while (true) {
                n5 = n3;
                if (n4 >= size) {
                    break;
                }
                n3 += jiz.r1(elz.g(n4));
                ++n4;
            }
        }
        else {
            int n6 = 0;
            while (true) {
                n5 = n6;
                if (n >= size) {
                    break;
                }
                n6 += jiz.r1((int)list.get(n));
                ++n;
            }
        }
        return n5;
    }
    
    public static int C(final int n, final List list) {
        if (list.size() == 0) {
            return 0;
        }
        return jiz.u1(n) * list.size() + D(list);
    }
    
    public static int D(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ymz) {
            final ymz ymz = (ymz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += jiz.Z0(ymz.g(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += jiz.Z0((long)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int E(int n, final Object o, final opz opz) {
        if (o instanceof dmz) {
            final dmz dmz = (dmz)o;
            n = jiz.Y0(n << 3);
            final int a = dmz.a();
            return jiz.Y0(a) + a + n;
        }
        final loz loz = (loz)o;
        n = jiz.Y0(n << 3);
        return jiz.s1(loz, opz) + n;
    }
    
    public static int F(int n, final List list, final opz opz) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        n = jiz.u1(n) * size;
        while (i < size) {
            final Object value = list.get(i);
            if (value instanceof dmz) {
                final int a = ((dmz)value).a();
                n += jiz.Y0(a) + a;
            }
            else {
                n += jiz.s1((loz)value, opz);
            }
            ++i;
        }
        return n;
    }
    
    public static int G(final List list) {
        final int size = list.size();
        int n = 0;
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n5;
        if (list instanceof elz) {
            final elz elz = (elz)list;
            int n3 = 0;
            int n4 = n2;
            while (true) {
                n5 = n3;
                if (n4 >= size) {
                    break;
                }
                final int g = elz.g(n4);
                n3 += jiz.Y0(g >> 31 ^ g + g);
                ++n4;
            }
        }
        else {
            int n6 = 0;
            while (true) {
                n5 = n6;
                if (n >= size) {
                    break;
                }
                final int intValue = (int)list.get(n);
                n6 += jiz.Y0(intValue >> 31 ^ intValue + intValue);
                ++n;
            }
        }
        return n5;
    }
    
    public static int H(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ymz) {
            final ymz ymz = (ymz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                final long g = ymz.g(n2);
                n3 += jiz.Z0(g >> 63 ^ g + g);
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                final long longValue = (long)list.get(n6);
                n5 += jiz.Z0(longValue >> 63 ^ longValue + longValue);
                ++n6;
            }
        }
        return n4;
    }
    
    public static int I(int n, final List list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = jiz.u1(n) * size;
        int n6;
        if (list instanceof imz) {
            final imz imz = (imz)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object r0 = imz.r0(n5);
                int n7;
                if (r0 instanceof phz) {
                    n7 = jiz.p1((phz)r0);
                }
                else {
                    n7 = jiz.t1((String)r0);
                }
                n += n7;
                ++n5;
            }
        }
        else {
            while (true) {
                n6 = n;
                if (n2 >= size) {
                    break;
                }
                final Object value = list.get(n2);
                int n8;
                if (value instanceof phz) {
                    n8 = jiz.p1((phz)value);
                }
                else {
                    n8 = jiz.t1((String)value);
                }
                n += n8;
                ++n2;
            }
        }
        return n6;
    }
    
    public static int J(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof elz) {
            final elz elz = (elz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += jiz.Y0(elz.g(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += jiz.Y0((int)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static int K(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ymz) {
            final ymz ymz = (ymz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += jiz.Z0(ymz.g(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += jiz.Z0((long)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void a(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).booleanValue();
                    ++n2;
                    ++i;
                }
                niz.a.m1(n2);
                for (i = n; i < list.size(); ++i) {
                    niz.a.a1((byte)(byte)(((boolean)list.get(i)) ? 1 : 0));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.b1(i, (boolean)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void b(final int n, final List list, final gsz gsz) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            for (int i = 0; i < list.size(); ++i) {
                niz.a.c1(n, (phz)list.get(i));
            }
        }
    }
    
    public static void c(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Double)list.get(k)).doubleValue();
                    i += 8;
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.g1(Double.doubleToRawLongBits(list.get(i)));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.f1(i, Double.doubleToRawLongBits((double)list.get(j)));
                    ++j;
                }
            }
        }
    }
    
    public static void d(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += jiz.r1((int)list.get(k));
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.i1((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.h1(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void e(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Integer)list.get(k)).intValue();
                    i += 4;
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.e1((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.d1(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void f(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Long)list.get(k)).longValue();
                    i += 8;
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.g1((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.f1(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void g(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).floatValue();
                    n2 += 4;
                    ++i;
                }
                niz.a.m1(n2);
                for (i = n; i < list.size(); ++i) {
                    niz.a.e1(Float.floatToRawIntBits(list.get(i)));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.d1(i, Float.floatToRawIntBits((float)list.get(j)));
                    ++j;
                }
            }
        }
    }
    
    public static void h(final int n, final List list, final gsz gsz, final opz opz) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                ((niz)gsz).l(n, list.get(i), opz);
            }
        }
    }
    
    public static void i(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += jiz.r1((int)list.get(k));
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.i1((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.h1(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void j(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += jiz.Z0((long)list.get(k));
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.o1((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.n1(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void k(final int n, final List list, final gsz gsz, final opz opz) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                ((niz)gsz).o(n, list.get(i), opz);
            }
        }
    }
    
    public static void l(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).intValue();
                    n2 += 4;
                    ++i;
                }
                niz.a.m1(n2);
                for (i = n; i < list.size(); ++i) {
                    niz.a.e1((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.d1(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void m(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Long)list.get(k)).longValue();
                    i += 8;
                    ++k;
                }
                niz.a.m1(i);
                for (i = n; i < list.size(); ++i) {
                    niz.a.g1((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.f1(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void n(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    final int intValue = list.get(i);
                    n2 += jiz.Y0(intValue >> 31 ^ intValue + intValue);
                    ++i;
                }
                niz.a.m1(n2);
                jiz a;
                int intValue2;
                for (i = n; i < list.size(); ++i) {
                    a = niz.a;
                    intValue2 = list.get(i);
                    a.m1(intValue2 >> 31 ^ intValue2 + intValue2);
                }
            }
            else {
                while (j < list.size()) {
                    final jiz a2 = niz.a;
                    final int intValue3 = list.get(j);
                    a2.l1(i, intValue3 >> 31 ^ intValue3 + intValue3);
                    ++j;
                }
            }
        }
    }
    
    public static void o(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    final long longValue = list.get(i);
                    n2 += jiz.Z0(longValue >> 63 ^ longValue + longValue);
                    ++i;
                }
                niz.a.m1(n2);
                jiz a;
                long longValue2;
                for (i = n; i < list.size(); ++i) {
                    a = niz.a;
                    longValue2 = list.get(i);
                    a.o1(longValue2 >> 63 ^ longValue2 + longValue2);
                }
            }
            else {
                while (j < list.size()) {
                    final jiz a2 = niz.a;
                    final long longValue3 = list.get(j);
                    a2.n1(i, longValue3 >> 63 ^ longValue3 + longValue3);
                    ++j;
                }
            }
        }
    }
    
    public static void p(final int n, final List list, final gsz gsz) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            final boolean b = list instanceof imz;
            int i = 0;
            final int n2 = 0;
            if (b) {
                final imz imz = (imz)list;
                for (int j = n2; j < list.size(); ++j) {
                    final Object r0 = imz.r0(j);
                    if (r0 instanceof String) {
                        niz.a.j1(n, (String)r0);
                    }
                    else {
                        niz.a.c1(n, (phz)r0);
                    }
                }
            }
            else {
                while (i < list.size()) {
                    niz.a.j1(n, (String)list.get(i));
                    ++i;
                }
            }
        }
    }
    
    public static void q(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += jiz.Y0((int)list.get(i));
                    ++i;
                }
                niz.a.m1(n2);
                for (i = n; i < list.size(); ++i) {
                    niz.a.m1((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.l1(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void r(int i, final List list, final gsz gsz, final boolean b) throws IOException {
        if (list != null && !list.isEmpty()) {
            final niz niz = (niz)gsz;
            Objects.requireNonNull(niz);
            int j = 0;
            final int n = 0;
            if (b) {
                niz.a.k1(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += jiz.Z0((long)list.get(i));
                    ++i;
                }
                niz.a.m1(n2);
                for (i = n; i < list.size(); ++i) {
                    niz.a.o1((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    niz.a.n1(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static boolean s(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static yqz t(final boolean b) {
        Class clazz;
        try {
            Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            clazz = null;
        }
        if (clazz == null) {
            return null;
        }
        try {
            return (yqz)clazz.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    public static int u(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        int n2 = jiz.u1(i) * size;
        for (i = n; i < list.size(); ++i) {
            n2 += jiz.p1((phz)list.get(i));
        }
        return n2;
    }
    
    public static int v(final List list) {
        final int size = list.size();
        int n = 0;
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n5;
        if (list instanceof elz) {
            final elz elz = (elz)list;
            int n3 = 0;
            int n4 = n2;
            while (true) {
                n5 = n3;
                if (n4 >= size) {
                    break;
                }
                n3 += jiz.r1(elz.g(n4));
                ++n4;
            }
        }
        else {
            int n6 = 0;
            while (true) {
                n5 = n6;
                if (n >= size) {
                    break;
                }
                n6 += jiz.r1((int)list.get(n));
                ++n;
            }
        }
        return n5;
    }
    
    public static int w(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (jiz.Y0(n << 3) + 4) * size;
    }
    
    public static int x(final List list) {
        return list.size() * 4;
    }
    
    public static int y(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (jiz.Y0(n << 3) + 8) * size;
    }
    
    public static int z(final List list) {
        return list.size() * 8;
    }
}
