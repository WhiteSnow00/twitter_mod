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

public final class fel
{
    public static final byte[] a;
    public static final byte[] b;
    
    static {
        a = new byte[] { 112, 114, 111, 0 };
        b = new byte[] { 112, 114, 109, 0 };
    }
    
    public static byte[] a(final cv8[] array, final byte[] array2) throws IOException {
        final int length = array.length;
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            final cv8 cv8 = array[i];
            n3 += (cv8.g * 2 + 8 - 1 & 0xFFFFFFF8) / 8 + (cv8.e * 2 + (m0n.K0(c(cv8.a, cv8.b, array2)) + 16) + cv8.f);
            ++i;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
        if (Arrays.equals(array2, cgl.c)) {
            for (int length2 = array.length, j = n2; j < length2; ++j) {
                final cv8 cv9 = array[j];
                n(byteArrayOutputStream, cv9, c(cv9.a, cv9.b, array2));
                p(byteArrayOutputStream, cv9);
                m(byteArrayOutputStream, cv9);
                o(byteArrayOutputStream, cv9);
            }
        }
        else {
            for (final cv8 cv10 : array) {
                n(byteArrayOutputStream, cv10, c(cv10.a, cv10.b, array2));
            }
            for (int length4 = array.length, l = n; l < length4; ++l) {
                final cv8 cv11 = array[l];
                p(byteArrayOutputStream, cv11);
                m(byteArrayOutputStream, cv11);
                o(byteArrayOutputStream, cv11);
            }
        }
        if (byteArrayOutputStream.size() == n3) {
            return byteArrayOutputStream.toByteArray();
        }
        final StringBuilder g = w48.g("The bytes saved do not match expectation. actual=");
        g.append(byteArrayOutputStream.size());
        g.append(" expected=");
        g.append(n3);
        throw new IllegalStateException(g.toString());
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
        final String a = cgl.a(array);
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
        final StringBuilder g = w48.g(s);
        g.append(cgl.a(array));
        g.append(s2);
        return g.toString();
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
        throw new IllegalStateException(yk.y("Unexpected flag: ", n));
    }
    
    public static int[] e(final InputStream inputStream, final int n) throws IOException {
        final int[] array = new int[n];
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += m0n.q0(inputStream);
            array[i] = n2;
            ++i;
        }
        return array;
    }
    
    public static byte[] f(final InputStream inputStream, final byte[] array) throws IOException {
        if (Arrays.equals(array, m0n.m0(inputStream, array.length))) {
            return m0n.m0(inputStream, 4);
        }
        throw new IllegalStateException("Invalid magic");
    }
    
    public static cv8[] g(InputStream inputStream, byte[] array, final byte[] array2, final cv8[] array3) throws IOException {
        final byte[] f = cgl.f;
        if (Arrays.equals(array, f)) {
            if (Arrays.equals(cgl.a, array2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            if (Arrays.equals(array, f)) {
                final int r0 = m0n.r0(inputStream);
                array = m0n.n0(inputStream, (int)m0n.p0(inputStream, 4), (int)m0n.p0(inputStream, 4));
                if (inputStream.read() <= 0) {
                    inputStream = new ByteArrayInputStream(array);
                    try {
                        final cv8[] h = h(inputStream, r0, array3);
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
            if (Arrays.equals(array, cgl.g)) {
                final int q0 = m0n.q0(inputStream);
                array = m0n.n0(inputStream, (int)m0n.p0(inputStream, 4), (int)m0n.p0(inputStream, 4));
                if (inputStream.read() <= 0) {
                    inputStream = new ByteArrayInputStream(array);
                    try {
                        final cv8[] i = i(inputStream, array2, q0, array3);
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
    
    public static cv8[] h(final InputStream inputStream, final int n, final cv8[] array) throws IOException {
        final int available = inputStream.available();
        final int n2 = 0;
        if (available == 0) {
            return new cv8[0];
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
                final int q0 = m0n.q0(inputStream);
                array3[n3] = m0n.q0(inputStream);
                array2[n3] = m0n.o0(inputStream, q0);
                ++n3;
            }
            while (i < n) {
                final cv8 cv8 = array[i];
                if (!cv8.b.equals(array2[i])) {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
                final int e = array3[i];
                cv8.e = e;
                cv8.h = e(inputStream, e);
                ++i;
            }
            return array;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static cv8[] i(final InputStream inputStream, final byte[] array, final int n, final cv8[] array2) throws IOException {
        if (inputStream.available() == 0) {
            return new cv8[0];
        }
        if (n == array2.length) {
            for (int i = 0; i < n; ++i) {
                m0n.q0(inputStream);
                final String o0 = m0n.o0(inputStream, m0n.q0(inputStream));
                final long p4 = m0n.p0(inputStream, 4);
                final int q0 = m0n.q0(inputStream);
                final int length = array2.length;
                final cv8 cv8 = null;
                cv8 cv9;
                if (length <= 0) {
                    cv9 = cv8;
                }
                else {
                    int n2;
                    if ((n2 = o0.indexOf("!")) < 0) {
                        n2 = o0.indexOf(":");
                    }
                    String substring;
                    if (n2 > 0) {
                        substring = o0.substring(n2 + 1);
                    }
                    else {
                        substring = o0;
                    }
                    int n3 = 0;
                    while (true) {
                        cv9 = cv8;
                        if (n3 >= array2.length) {
                            break;
                        }
                        if (array2[n3].b.equals(substring)) {
                            cv9 = array2[n3];
                            break;
                        }
                        ++n3;
                    }
                }
                if (cv9 == null) {
                    throw new IllegalStateException(l7k.c("Missing profile key: ", o0));
                }
                cv9.d = p4;
                final int[] e = e(inputStream, q0);
                if (Arrays.equals(array, cgl.e)) {
                    cv9.e = q0;
                    cv9.h = e;
                }
            }
            return array2;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static cv8[] j(InputStream inputStream, byte[] n0, final String s) throws IOException {
        if (Arrays.equals((byte[])n0, cgl.b)) {
            final int r0 = m0n.r0(inputStream);
            n0 = m0n.n0(inputStream, (int)m0n.p0(inputStream, 4), (int)m0n.p0(inputStream, 4));
            if (inputStream.read() <= 0) {
                inputStream = new ByteArrayInputStream((byte[])n0);
                try {
                    final cv8[] k = k(inputStream, s, r0);
                    inputStream.close();
                    return k;
                }
                finally {
                    try {
                        inputStream.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)n0).addSuppressed(t);
                    }
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }
    
    public static cv8[] k(final InputStream inputStream, final String s, final int n) throws IOException {
        if (inputStream.available() == 0) {
            return new cv8[0];
        }
        final cv8[] array = new cv8[n];
        for (int i = 0; i < n; ++i) {
            final int q0 = m0n.q0(inputStream);
            final int q2 = m0n.q0(inputStream);
            array[i] = new cv8(s, m0n.o0(inputStream, q0), m0n.p0(inputStream, 4), q2, (int)m0n.p0(inputStream, 4), (int)m0n.p0(inputStream, 4), new int[q2], new TreeMap());
        }
        for (final cv8 cv8 : array) {
            final int n2 = inputStream.available() - cv8.f;
            int n3 = 0;
            while (inputStream.available() > n2) {
                final int n4 = n3 + m0n.q0(inputStream);
                cv8.i.put(n4, 1);
                int q3 = m0n.q0(inputStream);
                while (true) {
                    n3 = n4;
                    if (q3 <= 0) {
                        break;
                    }
                    m0n.q0(inputStream);
                    final int r0 = m0n.r0(inputStream);
                    if (r0 != 6) {
                        int k;
                        if ((k = r0) != 7) {
                            while (k > 0) {
                                m0n.r0(inputStream);
                                for (int l = m0n.r0(inputStream); l > 0; --l) {
                                    m0n.q0(inputStream);
                                }
                                --k;
                            }
                        }
                    }
                    --q3;
                }
            }
            if (inputStream.available() != n2) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cv8.h = e(inputStream, cv8.e);
            final BitSet value = BitSet.valueOf(m0n.m0(inputStream, (cv8.g * 2 + 8 - 1 & 0xFFFFFFF8) / 8));
            int n5 = 0;
            while (true) {
                final int g = cv8.g;
                if (n5 >= g) {
                    break;
                }
                int n6;
                if (value.get(d(2, n5, g))) {
                    n6 = 2;
                }
                else {
                    n6 = 0;
                }
                int n7 = n6;
                if (value.get(d(4, n5, g))) {
                    n7 = (n6 | 0x4);
                }
                if (n7 != 0) {
                    Integer value2;
                    if ((value2 = cv8.i.get(n5)) == null) {
                        value2 = 0;
                    }
                    cv8.i.put(n5, value2 | n7);
                }
                ++n5;
            }
        }
        return array;
    }
    
    public static boolean l(final OutputStream outputStream, byte[] array, final cv8[] array2) throws IOException {
        if (Arrays.equals(array, cgl.a)) {
            final ArrayList list = new ArrayList(3);
            final ArrayList list2 = new ArrayList<byte[]>(3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                m0n.O0((OutputStream)byteArrayOutputStream, array2.length);
                int i = 0;
                int n = 2;
                while (i < array2.length) {
                    final cv8 cv8 = array2[i];
                    m0n.N0((OutputStream)byteArrayOutputStream, cv8.c, 4);
                    m0n.N0((OutputStream)byteArrayOutputStream, cv8.d, 4);
                    m0n.N0((OutputStream)byteArrayOutputStream, (long)cv8.g, 4);
                    final String c = c(cv8.a, cv8.b, cgl.a);
                    final int k0 = m0n.K0(c);
                    m0n.O0((OutputStream)byteArrayOutputStream, k0);
                    n = n + 4 + 4 + 4 + 2 + k0 * 1;
                    m0n.M0((OutputStream)byteArrayOutputStream, c);
                    ++i;
                }
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (n == byteArray.length) {
                    final ptx ptx = new ptx(1, byteArray, false);
                    byteArrayOutputStream.close();
                    list.add(ptx);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    int j = 0;
                    int n2 = 0;
                    try {
                        while (j < array2.length) {
                            final cv8 cv9 = array2[j];
                            m0n.O0((OutputStream)byteArrayOutputStream, j);
                            m0n.O0((OutputStream)byteArrayOutputStream, cv9.e);
                            n2 = n2 + 2 + 2 + cv9.e * 2;
                            m(byteArrayOutputStream, cv9);
                            ++j;
                        }
                        final byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        if (n2 == byteArray2.length) {
                            final ptx ptx2 = new ptx(3, byteArray2, true);
                            byteArrayOutputStream.close();
                            list.add(ptx2);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            int l = 0;
                            int n3 = 0;
                            try {
                                while (l < array2.length) {
                                    final cv8 cv10 = array2[l];
                                    final Iterator iterator = cv10.i.entrySet().iterator();
                                    int n4 = 0;
                                    while (iterator.hasNext()) {
                                        n4 |= ((Map.Entry<K, Integer>)iterator.next()).getValue();
                                    }
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    try {
                                        o(byteArrayOutputStream2, cv10);
                                        final byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                        byteArrayOutputStream2.close();
                                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        try {
                                            p(byteArrayOutputStream2, cv10);
                                            final byte[] byteArray4 = byteArrayOutputStream2.toByteArray();
                                            byteArrayOutputStream2.close();
                                            m0n.O0((OutputStream)byteArrayOutputStream, l);
                                            final int n5 = byteArray3.length + 2 + byteArray4.length;
                                            m0n.N0((OutputStream)byteArrayOutputStream, (long)n5, 4);
                                            m0n.O0((OutputStream)byteArrayOutputStream, n4);
                                            byteArrayOutputStream.write(byteArray3);
                                            byteArrayOutputStream.write(byteArray4);
                                            n3 = n3 + 2 + 4 + n5;
                                            ++l;
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
                                    final ptx ptx3 = new ptx(4, byteArray5, true);
                                    byteArrayOutputStream.close();
                                    list.add(ptx3);
                                    final long n6 = 4;
                                    long n7 = n6 + n6 + 4L + list.size() * 16;
                                    m0n.N0(outputStream, (long)list.size(), 4);
                                    for (int n8 = 0; n8 < list.size(); ++n8) {
                                        final ptx ptx4 = list.get(n8);
                                        m0n.N0(outputStream, xpa.h(ptx4.a), 4);
                                        m0n.N0(outputStream, n7, 4);
                                        int n10;
                                        if (ptx4.c) {
                                            final byte[] b = ptx4.b;
                                            final long n9 = b.length;
                                            final byte[] m = m0n.M(b);
                                            list2.add(m);
                                            m0n.N0(outputStream, (long)m.length, 4);
                                            m0n.N0(outputStream, n9, 4);
                                            n10 = m.length;
                                        }
                                        else {
                                            list2.add(ptx4.b);
                                            m0n.N0(outputStream, (long)ptx4.b.length, 4);
                                            m0n.N0(outputStream, 0L, 4);
                                            n10 = ptx4.b.length;
                                        }
                                        n7 += n10;
                                    }
                                    for (int n11 = 0; n11 < list2.size(); ++n11) {
                                        outputStream.write((byte[])list2.get(n11));
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
        final byte[] b2 = cgl.b;
        if (Arrays.equals(array, b2)) {
            array = a(array2, b2);
            m0n.P0(outputStream, array2.length);
            m0n.N0(outputStream, (long)array.length, 4);
            array = m0n.M(array);
            m0n.N0(outputStream, (long)array.length, 4);
            outputStream.write(array);
        }
        else {
            if (Arrays.equals(array, cgl.d)) {
                m0n.P0(outputStream, array2.length);
                for (final cv8 cv11 : array2) {
                    final int size = cv11.i.size();
                    final String c2 = c(cv11.a, cv11.b, cgl.d);
                    m0n.O0(outputStream, m0n.K0(c2));
                    m0n.O0(outputStream, cv11.h.length);
                    m0n.N0(outputStream, (long)(size * 4), 4);
                    m0n.N0(outputStream, cv11.c, 4);
                    m0n.M0(outputStream, c2);
                    final Iterator iterator2 = cv11.i.keySet().iterator();
                    while (iterator2.hasNext()) {
                        m0n.O0(outputStream, (int)iterator2.next());
                        m0n.O0(outputStream, 0);
                    }
                    final int[] h = cv11.h;
                    for (int length2 = h.length, n13 = 0; n13 < length2; ++n13) {
                        m0n.O0(outputStream, h[n13]);
                    }
                }
                return true;
            }
            final byte[] c3 = cgl.c;
            if (Arrays.equals(array, c3)) {
                array = a(array2, c3);
                m0n.P0(outputStream, array2.length);
                m0n.N0(outputStream, (long)array.length, 4);
                array = m0n.M(array);
                m0n.N0(outputStream, (long)array.length, 4);
                outputStream.write(array);
            }
            else {
                if (Arrays.equals(array, cgl.e)) {
                    m0n.O0(outputStream, array2.length);
                    for (final cv8 cv12 : array2) {
                        final String c4 = c(cv12.a, cv12.b, cgl.e);
                        m0n.O0(outputStream, m0n.K0(c4));
                        m0n.O0(outputStream, cv12.i.size());
                        m0n.O0(outputStream, cv12.h.length);
                        m0n.N0(outputStream, cv12.c, 4);
                        m0n.M0(outputStream, c4);
                        final Iterator iterator3 = cv12.i.keySet().iterator();
                        while (iterator3.hasNext()) {
                            m0n.O0(outputStream, (int)iterator3.next());
                        }
                        final int[] h2 = cv12.h;
                        for (int length4 = h2.length, n15 = 0; n15 < length4; ++n15) {
                            m0n.O0(outputStream, h2[n15]);
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    
    public static void m(final OutputStream outputStream, final cv8 cv8) throws IOException {
        final int[] h = cv8.h;
        final int length = h.length;
        int i = 0;
        int intValue = 0;
        while (i < length) {
            final Integer value = h[i];
            m0n.O0(outputStream, value - intValue);
            intValue = value;
            ++i;
        }
    }
    
    public static void n(final OutputStream outputStream, final cv8 cv8, final String s) throws IOException {
        m0n.O0(outputStream, m0n.K0(s));
        m0n.O0(outputStream, cv8.e);
        m0n.N0(outputStream, (long)cv8.f, 4);
        m0n.N0(outputStream, cv8.c, 4);
        m0n.N0(outputStream, (long)cv8.g, 4);
        m0n.M0(outputStream, s);
    }
    
    public static void o(final OutputStream outputStream, final cv8 cv8) throws IOException {
        final byte[] array = new byte[(cv8.g * 2 + 8 - 1 & 0xFFFFFFF8) / 8];
        for (final Map.Entry<Integer, V> entry : cv8.i.entrySet()) {
            final int intValue = entry.getKey();
            final int intValue2 = (int)entry.getValue();
            if ((intValue2 & 0x2) != 0x0) {
                final int d = d(2, intValue, cv8.g);
                final int n = d / 8;
                array[n] |= (byte)(1 << d % 8);
            }
            if ((intValue2 & 0x4) != 0x0) {
                final int d2 = d(4, intValue, cv8.g);
                final int n2 = d2 / 8;
                array[n2] |= (byte)(1 << d2 % 8);
            }
        }
        outputStream.write(array);
    }
    
    public static void p(final OutputStream outputStream, final cv8 cv8) throws IOException {
        final Iterator iterator = cv8.i.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Integer, V> entry = (Map.Entry<Integer, V>)iterator.next();
            final int intValue = entry.getKey();
            if (((int)entry.getValue() & 0x1) == 0x0) {
                continue;
            }
            m0n.O0(outputStream, intValue - n);
            m0n.O0(outputStream, 0);
            n = intValue;
        }
    }
}
