import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.TreeMap;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rel
{
    public static final byte[] a;
    public static final byte[] b;
    
    static {
        a = new byte[] { 112, 114, 111, 0 };
        b = new byte[] { 112, 114, 109, 0 };
    }
    
    public static byte[] a(final nu8[] array, final byte[] array2) throws IOException {
        final int length = array.length;
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            final nu8 nu8 = array[i];
            n3 += (nu8.g * 2 + 8 - 1 & 0xFFFFFFF8) / 8 + (nu8.e * 2 + (wa2.R(c(nu8.a, nu8.b, array2)) + 16) + nu8.f);
            ++i;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
        if (Arrays.equals(array2, ogl.c)) {
            for (int length2 = array.length, j = n2; j < length2; ++j) {
                final nu8 nu9 = array[j];
                n(byteArrayOutputStream, nu9, c(nu9.a, nu9.b, array2));
                p(byteArrayOutputStream, nu9);
                m(byteArrayOutputStream, nu9);
                o(byteArrayOutputStream, nu9);
            }
        }
        else {
            for (final nu8 nu10 : array) {
                n(byteArrayOutputStream, nu10, c(nu10.a, nu10.b, array2));
            }
            for (int length4 = array.length, l = n; l < length4; ++l) {
                final nu8 nu11 = array[l];
                p(byteArrayOutputStream, nu11);
                m(byteArrayOutputStream, nu11);
                o(byteArrayOutputStream, nu11);
            }
        }
        if (byteArrayOutputStream.size() == n3) {
            return byteArrayOutputStream.toByteArray();
        }
        final StringBuilder m = fu8.j("The bytes saved do not match expectation. actual=");
        m.append(byteArrayOutputStream.size());
        m.append(" expected=");
        m.append(n3);
        throw new IllegalStateException(m.toString());
    }
    
    public static String b(final String s, final String s2) {
        if ("!".equals(s2)) {
            return s.replace(":", "!");
        }
        String replace = s;
        if (":".equals(s2)) {
            replace = s.replace("!", ":");
        }
        return replace;
    }
    
    public static String c(final String s, final String s2, final byte[] array) {
        final String a = ogl.a(array);
        if (s.length() <= 0) {
            return b(s2, a);
        }
        if (s2.equals("classes.dex")) {
            return s;
        }
        if (s2.contains("!") || s2.contains(":")) {
            return b(s2, a);
        }
        if (s2.endsWith(".apk")) {
            return s2;
        }
        final StringBuilder j = fu8.j(s);
        j.append(ogl.a(array));
        j.append(s2);
        return j.toString();
    }
    
    public static int d(final int n, final int n2, final int n3) {
        if (n == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (n == 2) {
            return n2;
        }
        if (n == 4) {
            return n2 + n3;
        }
        throw new IllegalStateException(udu.z("Unexpected flag: ", n));
    }
    
    public static int[] e(final InputStream inputStream, final int n) throws IOException {
        final int[] array = new int[n];
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += wa2.N(inputStream);
            array[i] = n2;
            ++i;
        }
        return array;
    }
    
    public static byte[] f(final InputStream inputStream, final byte[] array) throws IOException {
        if (Arrays.equals(array, wa2.J(inputStream, array.length))) {
            return wa2.J(inputStream, 4);
        }
        throw new IllegalStateException("Invalid magic");
    }
    
    public static nu8[] g(InputStream inputStream, byte[] array, final byte[] array2, final nu8[] array3) throws IOException {
        final byte[] f = ogl.f;
        if (Arrays.equals(array, f)) {
            if (Arrays.equals(ogl.a, array2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            if (Arrays.equals(array, f)) {
                final int o = wa2.O(inputStream);
                array = wa2.K(inputStream, (int)wa2.M(inputStream, 4), (int)wa2.M(inputStream, 4));
                if (inputStream.read() <= 0) {
                    inputStream = new ByteArrayInputStream(array);
                    try {
                        final nu8[] h = h(inputStream, o, array3);
                        inputStream.close();
                        return h;
                    }
                    finally {
                        try {
                            inputStream.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)(Object)array).addSuppressed(t);
                        }
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
        else {
            if (Arrays.equals(array, ogl.g)) {
                final int n = wa2.N(inputStream);
                array = wa2.K(inputStream, (int)wa2.M(inputStream, 4), (int)wa2.M(inputStream, 4));
                if (inputStream.read() <= 0) {
                    inputStream = new ByteArrayInputStream(array);
                    try {
                        final nu8[] i = i(inputStream, array2, n, array3);
                        inputStream.close();
                        return i;
                    }
                    finally {
                        try {
                            inputStream.close();
                        }
                        finally {
                            final Throwable t2;
                            ((Throwable)(Object)array).addSuppressed(t2);
                        }
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
    }
    
    public static nu8[] h(final InputStream inputStream, final int n, final nu8[] array) throws IOException {
        final int available = inputStream.available();
        final int n2 = 0;
        if (available == 0) {
            return new nu8[0];
        }
        if (n == array.length) {
            final String[] array2 = new String[n];
            final int[] array3 = new int[n];
            int n3 = 0;
            int i;
            while (true) {
                i = n2;
                if (n3 >= n) {
                    break;
                }
                final int n4 = wa2.N(inputStream);
                array3[n3] = wa2.N(inputStream);
                array2[n3] = wa2.L(inputStream, n4);
                ++n3;
            }
            while (i < n) {
                final nu8 nu8 = array[i];
                if (!nu8.b.equals(array2[i])) {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
                final int e = array3[i];
                nu8.e = e;
                nu8.h = e(inputStream, e);
                ++i;
            }
            return array;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static nu8[] i(final InputStream inputStream, final byte[] array, final int n, final nu8[] array2) throws IOException {
        if (inputStream.available() == 0) {
            return new nu8[0];
        }
        if (n == array2.length) {
            for (int i = 0; i < n; ++i) {
                wa2.N(inputStream);
                final String l = wa2.L(inputStream, wa2.N(inputStream));
                final long m = wa2.M(inputStream, 4);
                final int n2 = wa2.N(inputStream);
                final int length = array2.length;
                final nu8 nu8 = null;
                nu8 nu9;
                if (length <= 0) {
                    nu9 = nu8;
                }
                else {
                    int n3;
                    if ((n3 = l.indexOf("!")) < 0) {
                        n3 = l.indexOf(":");
                    }
                    String substring;
                    if (n3 > 0) {
                        substring = l.substring(n3 + 1);
                    }
                    else {
                        substring = l;
                    }
                    int n4 = 0;
                    while (true) {
                        nu9 = nu8;
                        if (n4 >= array2.length) {
                            break;
                        }
                        if (array2[n4].b.equals(substring)) {
                            nu9 = array2[n4];
                            break;
                        }
                        ++n4;
                    }
                }
                if (nu9 == null) {
                    throw new IllegalStateException(hmg.h("Missing profile key: ", l));
                }
                nu9.d = m;
                final int[] e = e(inputStream, n2);
                if (Arrays.equals(array, ogl.e)) {
                    nu9.e = n2;
                    nu9.h = e;
                }
            }
            return array2;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static nu8[] j(InputStream inputStream, byte[] k, final String s) throws IOException {
        if (Arrays.equals((byte[])k, ogl.b)) {
            final int o = wa2.O(inputStream);
            k = wa2.K(inputStream, (int)wa2.M(inputStream, 4), (int)wa2.M(inputStream, 4));
            if (inputStream.read() <= 0) {
                inputStream = new ByteArrayInputStream((byte[])k);
                try {
                    final nu8[] i = k(inputStream, s, o);
                    inputStream.close();
                    return i;
                }
                finally {
                    try {
                        inputStream.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)k).addSuppressed(t);
                    }
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }
    
    public static nu8[] k(final InputStream inputStream, final String s, final int n) throws IOException {
        if (inputStream.available() == 0) {
            return new nu8[0];
        }
        final nu8[] array = new nu8[n];
        for (int i = 0; i < n; ++i) {
            final int n2 = wa2.N(inputStream);
            final int n3 = wa2.N(inputStream);
            array[i] = new nu8(s, wa2.L(inputStream, n2), wa2.M(inputStream, 4), n3, (int)wa2.M(inputStream, 4), (int)wa2.M(inputStream, 4), new int[n3], new TreeMap());
        }
        for (final nu8 nu8 : array) {
            final int n4 = inputStream.available() - nu8.f;
            int n5 = 0;
            while (inputStream.available() > n4) {
                final int n6 = n5 + wa2.N(inputStream);
                nu8.i.put(n6, 1);
                int n7 = wa2.N(inputStream);
                while (true) {
                    n5 = n6;
                    if (n7 <= 0) {
                        break;
                    }
                    wa2.N(inputStream);
                    final int o = wa2.O(inputStream);
                    if (o != 6) {
                        int k;
                        if ((k = o) != 7) {
                            while (k > 0) {
                                wa2.O(inputStream);
                                for (int l = wa2.O(inputStream); l > 0; --l) {
                                    wa2.N(inputStream);
                                }
                                --k;
                            }
                        }
                    }
                    --n7;
                }
            }
            if (inputStream.available() != n4) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            nu8.h = e(inputStream, nu8.e);
            final BitSet value = BitSet.valueOf(wa2.J(inputStream, (nu8.g * 2 + 8 - 1 & 0xFFFFFFF8) / 8));
            int n8 = 0;
            while (true) {
                final int g = nu8.g;
                if (n8 >= g) {
                    break;
                }
                int n9;
                if (value.get(d(2, n8, g))) {
                    n9 = 2;
                }
                else {
                    n9 = 0;
                }
                int n10 = n9;
                if (value.get(d(4, n8, g))) {
                    n10 = (n9 | 0x4);
                }
                if (n10 != 0) {
                    Integer value2;
                    if ((value2 = nu8.i.get(n8)) == null) {
                        value2 = 0;
                    }
                    nu8.i.put(n8, value2 | n10);
                }
                ++n8;
            }
        }
        return array;
    }
    
    public static boolean l(final OutputStream outputStream, byte[] array, final nu8[] array2) throws IOException {
        if (Arrays.equals(array, ogl.a)) {
            final ArrayList list = new ArrayList(3);
            final ArrayList list2 = new ArrayList<byte[]>(3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                wa2.U((OutputStream)byteArrayOutputStream, array2.length);
                int i = 0;
                int n = 2;
                while (i < array2.length) {
                    final nu8 nu8 = array2[i];
                    wa2.T((OutputStream)byteArrayOutputStream, nu8.c, 4);
                    wa2.T((OutputStream)byteArrayOutputStream, nu8.d, 4);
                    wa2.T((OutputStream)byteArrayOutputStream, (long)nu8.g, 4);
                    final String c = c(nu8.a, nu8.b, ogl.a);
                    final int r = wa2.R(c);
                    wa2.U((OutputStream)byteArrayOutputStream, r);
                    n = n + 4 + 4 + 4 + 2 + r * 1;
                    wa2.S((OutputStream)byteArrayOutputStream, c);
                    ++i;
                }
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (n == byteArray.length) {
                    final fux fux = new fux(1, byteArray, false);
                    byteArrayOutputStream.close();
                    list.add(fux);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    int j = 0;
                    int n2 = 0;
                    try {
                        while (j < array2.length) {
                            final nu8 nu9 = array2[j];
                            wa2.U((OutputStream)byteArrayOutputStream, j);
                            wa2.U((OutputStream)byteArrayOutputStream, nu9.e);
                            n2 = n2 + 2 + 2 + nu9.e * 2;
                            m(byteArrayOutputStream, nu9);
                            ++j;
                        }
                        final byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        if (n2 == byteArray2.length) {
                            final fux fux2 = new fux(3, byteArray2, true);
                            byteArrayOutputStream.close();
                            list.add(fux2);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            int k = 0;
                            int n3 = 0;
                            try {
                                while (k < array2.length) {
                                    final nu8 nu10 = array2[k];
                                    final Iterator<Map.Entry<Integer, Integer>> iterator = nu10.i.entrySet().iterator();
                                    int n4 = 0;
                                    while (iterator.hasNext()) {
                                        n4 |= ((Map.Entry<K, Integer>)iterator.next()).getValue();
                                    }
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    try {
                                        o(byteArrayOutputStream2, nu10);
                                        final byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                        byteArrayOutputStream2.close();
                                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        try {
                                            p(byteArrayOutputStream2, nu10);
                                            final byte[] byteArray4 = byteArrayOutputStream2.toByteArray();
                                            byteArrayOutputStream2.close();
                                            wa2.U((OutputStream)byteArrayOutputStream, k);
                                            final int n5 = byteArray3.length + 2 + byteArray4.length;
                                            wa2.T((OutputStream)byteArrayOutputStream, (long)n5, 4);
                                            wa2.U((OutputStream)byteArrayOutputStream, n4);
                                            byteArrayOutputStream.write(byteArray3);
                                            byteArrayOutputStream.write(byteArray4);
                                            n3 = n3 + 2 + 4 + n5;
                                            ++k;
                                        }
                                        finally {
                                            try {
                                                byteArrayOutputStream2.close();
                                            }
                                            finally {
                                                final Throwable t;
                                                ((Throwable)outputStream).addSuppressed(t);
                                            }
                                        }
                                    }
                                    finally {
                                        try {
                                            byteArrayOutputStream2.close();
                                        }
                                        finally {
                                            ((Throwable)outputStream).addSuppressed((Throwable)list2);
                                        }
                                    }
                                    break;
                                }
                                final byte[] byteArray5 = byteArrayOutputStream.toByteArray();
                                if (n3 == byteArray5.length) {
                                    final fux fux3 = new fux(4, byteArray5, true);
                                    byteArrayOutputStream.close();
                                    list.add(fux3);
                                    final long n6 = 4;
                                    long n7 = n6 + n6 + 4L + list.size() * 16;
                                    wa2.T(outputStream, (long)list.size(), 4);
                                    for (int l = 0; l < list.size(); ++l) {
                                        final fux fux4 = list.get(l);
                                        wa2.T(outputStream, jxa.m(fux4.a), 4);
                                        wa2.T(outputStream, n7, 4);
                                        int n9;
                                        if (fux4.c) {
                                            final byte[] b = fux4.b;
                                            final long n8 = b.length;
                                            final byte[] m = wa2.j(b);
                                            list2.add(m);
                                            wa2.T(outputStream, (long)m.length, 4);
                                            wa2.T(outputStream, n8, 4);
                                            n9 = m.length;
                                        }
                                        else {
                                            list2.add(fux4.b);
                                            wa2.T(outputStream, (long)fux4.b.length, 4);
                                            wa2.T(outputStream, 0L, 4);
                                            n9 = fux4.b.length;
                                        }
                                        n7 += n9;
                                    }
                                    for (int n10 = 0; n10 < list2.size(); ++n10) {
                                        outputStream.write((byte[])list2.get(n10));
                                    }
                                    return true;
                                }
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Expected size ");
                                sb.append(n3);
                                sb.append(", does not match actual size ");
                                sb.append(byteArray5.length);
                                throw new IllegalStateException(sb.toString());
                            }
                            finally {
                                try {
                                    byteArrayOutputStream.close();
                                }
                                finally {
                                    final Throwable t2;
                                    ((Throwable)outputStream).addSuppressed(t2);
                                }
                            }
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected size ");
                        sb2.append(n2);
                        sb2.append(", does not match actual size ");
                        sb2.append(byteArray2.length);
                        throw new IllegalStateException(sb2.toString());
                    }
                    finally {
                        try {
                            byteArrayOutputStream.close();
                        }
                        finally {
                            final Throwable t3;
                            ((Throwable)outputStream).addSuppressed(t3);
                        }
                    }
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Expected size ");
                sb3.append(n);
                sb3.append(", does not match actual size ");
                sb3.append(byteArray.length);
                throw new IllegalStateException(sb3.toString());
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                finally {
                    final Throwable t4;
                    ((Throwable)outputStream).addSuppressed(t4);
                }
            }
        }
        final byte[] b2 = ogl.b;
        if (Arrays.equals(array, b2)) {
            array = a(array2, b2);
            wa2.V(outputStream, array2.length);
            wa2.T(outputStream, (long)array.length, 4);
            array = wa2.j(array);
            wa2.T(outputStream, (long)array.length, 4);
            outputStream.write(array);
        }
        else {
            if (Arrays.equals(array, ogl.d)) {
                wa2.V(outputStream, array2.length);
                for (final nu8 nu11 : array2) {
                    final int size = nu11.i.size();
                    final String c2 = c(nu11.a, nu11.b, ogl.d);
                    wa2.U(outputStream, wa2.R(c2));
                    wa2.U(outputStream, nu11.h.length);
                    wa2.T(outputStream, (long)(size * 4), 4);
                    wa2.T(outputStream, nu11.c, 4);
                    wa2.S(outputStream, c2);
                    final Iterator<Integer> iterator2 = nu11.i.keySet().iterator();
                    while (iterator2.hasNext()) {
                        wa2.U(outputStream, (int)iterator2.next());
                        wa2.U(outputStream, 0);
                    }
                    final int[] h = nu11.h;
                    for (int length2 = h.length, n12 = 0; n12 < length2; ++n12) {
                        wa2.U(outputStream, h[n12]);
                    }
                }
                return true;
            }
            final byte[] c3 = ogl.c;
            if (Arrays.equals(array, c3)) {
                array = a(array2, c3);
                wa2.V(outputStream, array2.length);
                wa2.T(outputStream, (long)array.length, 4);
                array = wa2.j(array);
                wa2.T(outputStream, (long)array.length, 4);
                outputStream.write(array);
            }
            else {
                if (Arrays.equals(array, ogl.e)) {
                    wa2.U(outputStream, array2.length);
                    for (final nu8 nu12 : array2) {
                        final String c4 = c(nu12.a, nu12.b, ogl.e);
                        wa2.U(outputStream, wa2.R(c4));
                        wa2.U(outputStream, nu12.i.size());
                        wa2.U(outputStream, nu12.h.length);
                        wa2.T(outputStream, nu12.c, 4);
                        wa2.S(outputStream, c4);
                        final Iterator<Integer> iterator3 = nu12.i.keySet().iterator();
                        while (iterator3.hasNext()) {
                            wa2.U(outputStream, (int)iterator3.next());
                        }
                        final int[] h2 = nu12.h;
                        for (int length4 = h2.length, n14 = 0; n14 < length4; ++n14) {
                            wa2.U(outputStream, h2[n14]);
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    
    public static void m(final OutputStream outputStream, final nu8 nu8) throws IOException {
        final int[] h = nu8.h;
        final int length = h.length;
        int i = 0;
        int intValue = 0;
        while (i < length) {
            final Integer value = h[i];
            wa2.U(outputStream, value - intValue);
            intValue = value;
            ++i;
        }
    }
    
    public static void n(final OutputStream outputStream, final nu8 nu8, final String s) throws IOException {
        wa2.U(outputStream, wa2.R(s));
        wa2.U(outputStream, nu8.e);
        wa2.T(outputStream, (long)nu8.f, 4);
        wa2.T(outputStream, nu8.c, 4);
        wa2.T(outputStream, (long)nu8.g, 4);
        wa2.S(outputStream, s);
    }
    
    public static void o(final OutputStream outputStream, final nu8 nu8) throws IOException {
        final byte[] array = new byte[(nu8.g * 2 + 8 - 1 & 0xFFFFFFF8) / 8];
        for (final Map.Entry<Integer, V> entry : nu8.i.entrySet()) {
            final int intValue = entry.getKey();
            final int intValue2 = (int)entry.getValue();
            if ((intValue2 & 0x2) != 0x0) {
                final int d = d(2, intValue, nu8.g);
                final int n = d / 8;
                array[n] |= (byte)(1 << d % 8);
            }
            if ((intValue2 & 0x4) != 0x0) {
                final int d2 = d(4, intValue, nu8.g);
                final int n2 = d2 / 8;
                array[n2] |= (byte)(1 << d2 % 8);
            }
        }
        outputStream.write(array);
    }
    
    public static void p(final OutputStream outputStream, final nu8 nu8) throws IOException {
        final Iterator<Map.Entry<Integer, Integer>> iterator = nu8.i.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Integer, V> entry = (Map.Entry<Integer, V>)iterator.next();
            final int intValue = entry.getKey();
            if (((int)entry.getValue() & 0x1) == 0x0) {
                continue;
            }
            wa2.U(outputStream, intValue - n);
            wa2.U(outputStream, 0);
            n = intValue;
        }
    }
}
