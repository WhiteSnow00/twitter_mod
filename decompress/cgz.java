import java.io.IOException;
import com.google.android.gms.internal.measurement.zzkm;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgz
{
    public static int a(final byte[] array, int a, final zfz zfz) throws zzkm {
        final int j = j(array, a, zfz);
        a = zfz.a;
        if (a < 0) {
            throw zzkm.b();
        }
        if (a > array.length - j) {
            throw zzkm.d();
        }
        if (a == 0) {
            zfz.c = phz.E0;
            return j;
        }
        zfz.c = phz.q(array, j, a);
        return j + a;
    }
    
    public static int b(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int c(final opz opz, final byte[] array, int z, final int n, final int n2, final zfz zfz) throws IOException {
        final toz toz = (toz)opz;
        final Object r = ((clz)toz.e).r(4);
        z = toz.z(r, array, z, n, n2, zfz);
        toz.c(r);
        zfz.c = r;
        return z;
    }
    
    public static int d(final opz opz, final byte[] array, int k, int n, final zfz zfz) throws IOException {
        final int n2 = k + 1;
        final byte b = array[k];
        k = n2;
        int a = b;
        if (b < 0) {
            k = k(b, array, n2, zfz);
            a = zfz.a;
        }
        if (a >= 0 && a <= n - k) {
            final Object f = opz.f();
            n = a + k;
            opz.g(f, array, k, n, zfz);
            opz.c(f);
            zfz.c = f;
            return n;
        }
        throw zzkm.d();
    }
    
    public static int e(final opz opz, final int n, final byte[] array, int i, final int n2, final rlz rlz, final zfz zfz) throws IOException {
        i = d(opz, array, i, n2, zfz);
        rlz.add(zfz.c);
        while (i < n2) {
            final int j = j(array, i, zfz);
            if (n != zfz.a) {
                break;
            }
            i = d(opz, array, j, n2, zfz);
            rlz.add(zfz.c);
        }
        return i;
    }
    
    public static int f(final byte[] array, int i, final rlz rlz, final zfz zfz) throws IOException {
        final elz elz = (elz)rlz;
        i = j(array, i, zfz);
        final int n = zfz.a + i;
        while (i < n) {
            i = j(array, i, zfz);
            elz.j(zfz.a);
        }
        if (i == n) {
            return i;
        }
        throw zzkm.d();
    }
    
    public static int g(final byte[] array, int j, final zfz zfz) throws zzkm {
        j = j(array, j, zfz);
        final int a = zfz.a;
        if (a < 0) {
            throw zzkm.b();
        }
        if (a == 0) {
            zfz.c = "";
            return j;
        }
        zfz.c = new String(array, j, a, ulz.a);
        return j + a;
    }
    
    public static int h(final byte[] array, int a, final zfz zfz) throws zzkm {
        int j = j(array, a, zfz);
        a = zfz.a;
        if (a < 0) {
            throw zzkm.b();
        }
        if (a == 0) {
            zfz.c = "";
            return j;
        }
        final krz a2 = dsz.a;
        final int length = array.length;
        if ((j | a | length - j - a) >= 0) {
            final int n = j + a;
            final char[] array2 = new char[a];
            int n2 = 0;
            int i;
            while (true) {
                a = n2;
                i = j;
                if (j >= n) {
                    break;
                }
                final byte b = array[j];
                if (b >= 0) {
                    a = 1;
                }
                else {
                    a = 0;
                }
                if (a == 0) {
                    a = n2;
                    i = j;
                    break;
                }
                ++j;
                array2[n2] = (char)b;
                ++n2;
            }
        Label_0131:
            while (i < n) {
                final int n3 = i + 1;
                final byte b2 = array[i];
                if (b2 >= 0) {
                    final int n4 = a + 1;
                    array2[a] = (char)b2;
                    int n5 = n3;
                    a = n4;
                    int n6;
                    while (true) {
                        n6 = (a = a);
                        i = n5;
                        if (n5 >= n) {
                            continue Label_0131;
                        }
                        final byte b3 = array[n5];
                        if (b3 >= 0) {
                            a = 1;
                        }
                        else {
                            a = 0;
                        }
                        if (a == 0) {
                            break;
                        }
                        ++n5;
                        a = n6 + 1;
                        array2[n6] = (char)b3;
                    }
                    a = n6;
                    i = n5;
                }
                else if (b2 < -32) {
                    if (n3 >= n) {
                        throw zzkm.a();
                    }
                    final byte b4 = array[n3];
                    if (b2 < -62 || af8.V(b4)) {
                        throw zzkm.a();
                    }
                    array2[a] = (char)((b2 & 0x1F) << 6 | (b4 & 0x3F));
                    i = n3 + 1;
                    ++a;
                }
                else if (b2 < -16) {
                    if (n3 < n - 1) {
                        final int n7 = n3 + 1;
                        final byte b5 = array[n3];
                        final byte b6 = array[n7];
                        if (!af8.V(b5)) {
                            int n8;
                            if ((n8 = b2) == -32) {
                                if (b5 < -96) {
                                    throw zzkm.a();
                                }
                                n8 = -32;
                            }
                            int n9;
                            if ((n9 = n8) == -19) {
                                if (b5 >= -96) {
                                    throw zzkm.a();
                                }
                                n9 = -19;
                            }
                            if (!af8.V(b6)) {
                                array2[a] = (char)((n9 & 0xF) << 12 | (b5 & 0x3F) << 6 | (b6 & 0x3F));
                                i = n7 + 1;
                                ++a;
                                continue;
                            }
                        }
                        throw zzkm.a();
                    }
                    throw zzkm.a();
                }
                else {
                    if (n3 >= n - 2) {
                        throw zzkm.a();
                    }
                    final int n10 = n3 + 1;
                    i = n10 + 1;
                    final byte b7 = array[n3];
                    final byte b8 = array[n10];
                    final byte b9 = array[i];
                    if (af8.V(b7) || b7 + 112 + (b2 << 28) >> 30 != 0 || af8.V(b8) || af8.V(b9)) {
                        throw zzkm.a();
                    }
                    final int n11 = (b2 & 0x7) << 18 | (b7 & 0x3F) << 12 | (b8 & 0x3F) << 6 | (b9 & 0x3F);
                    array2[a] = (char)((n11 >>> 10) + 55232);
                    array2[a + 1] = (char)((n11 & 0x3FF) + 56320);
                    a += 2;
                    ++i;
                }
            }
            zfz.c = new String(array2, 0, a);
            return n;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", length, j, a));
    }
    
    public static int i(final int n, final byte[] array, int n2, int j, final zqz zqz, final zfz zfz) throws zzkm {
        if (n >>> 3 == 0) {
            throw new zzkm("Protocol message contained an invalid tag (zero).");
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = m(array, n2, zfz);
            zqz.c(n, (Object)zfz.b);
            return n2;
        }
        if (n3 == 1) {
            zqz.c(n, (Object)n(array, n2));
            return n2 + 8;
        }
        if (n3 != 2) {
            if (n3 != 3) {
                if (n3 == 5) {
                    zqz.c(n, (Object)b(array, n2));
                    return n2 + 4;
                }
                throw new zzkm("Protocol message contained an invalid tag (zero).");
            }
            else {
                final int n4 = (n & 0xFFFFFFF8) | 0x4;
                final zqz b = zqz.b();
                int a = 0;
                int n5;
                while (true) {
                    n5 = n2;
                    if (n2 >= j) {
                        break;
                    }
                    n2 = j(array, n2, zfz);
                    a = zfz.a;
                    if (a == n4) {
                        n5 = n2;
                        break;
                    }
                    n2 = i(a, array, n2, j, b, zfz);
                }
                if (n5 <= j && a == n4) {
                    zqz.c(n, (Object)b);
                    return n5;
                }
                throw zzkm.c();
            }
        }
        else {
            j = j(array, n2, zfz);
            n2 = zfz.a;
            if (n2 < 0) {
                throw zzkm.b();
            }
            if (n2 <= array.length - j) {
                if (n2 == 0) {
                    zqz.c(n, (Object)phz.E0);
                }
                else {
                    zqz.c(n, (Object)phz.q(array, j, n2));
                }
                return j + n2;
            }
            throw zzkm.d();
        }
    }
    
    public static int j(final byte[] array, int a, final zfz zfz) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            zfz.a = a;
            return n;
        }
        return k(a, array, n, zfz);
    }
    
    public static int k(int n, final byte[] array, int n2, final zfz zfz) {
        final int n3 = n & 0x7F;
        n = n2 + 1;
        n2 = array[n2];
        if (n2 >= 0) {
            zfz.a = (n3 | n2 << 7);
            return n;
        }
        n2 = (n3 | (n2 & 0x7F) << 7);
        final int n4 = n + 1;
        n = array[n];
        if (n >= 0) {
            zfz.a = (n2 | n << 14);
            return n4;
        }
        n = (n2 | (n & 0x7F) << 14);
        n2 = n4 + 1;
        final byte b = array[n4];
        if (b >= 0) {
            zfz.a = (n | b << 21);
            return n2;
        }
        final int n5 = n | (b & 0x7F) << 21;
        n = n2 + 1;
        final byte b2 = array[n2];
        if (b2 >= 0) {
            zfz.a = (n5 | b2 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        zfz.a = (n5 | (b2 & 0x7F) << 28);
        return n2;
    }
    
    public static int l(final int n, final byte[] array, int i, final int n2, final rlz rlz, final zfz zfz) {
        final elz elz = (elz)rlz;
        i = j(array, i, zfz);
        elz.j(zfz.a);
        while (i < n2) {
            final int j = j(array, i, zfz);
            if (n != zfz.a) {
                break;
            }
            i = j(array, j, zfz);
            elz.j(zfz.a);
        }
        return i;
    }
    
    public static int m(final byte[] array, int n, final zfz zfz) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b >= 0L) {
            zfz.b = b;
            return n2;
        }
        n = n2 + 1;
        byte b2 = array[n2];
        long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
        for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
        zfz.b = b3;
        return n;
    }
    
    public static long n(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
}
