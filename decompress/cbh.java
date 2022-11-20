import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbh
{
    public static String[] a(final fy9 fy9) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        final long c = c(fy9, allocate, 0L);
        if (c == 1179403647L) {
            final short d = d(fy9, allocate, 4L);
            boolean b = true;
            if (d != 1) {
                b = false;
            }
            if (d(fy9, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long n;
            if (b) {
                n = c(fy9, allocate, 28L);
            }
            else {
                e(fy9, allocate, 8, 32L);
                n = allocate.getLong();
            }
            long n2 = 44L;
            if (!b) {
                n2 = 56L;
            }
            final long n3 = b(fy9, allocate, n2);
            long n4;
            if (b) {
                n4 = 42L;
            }
            else {
                n4 = 54L;
            }
            final int b2 = b(fy9, allocate, n4);
            long n5 = n3;
            if (n3 == 65535L) {
                long n6;
                if (b) {
                    n6 = c(fy9, allocate, 32L);
                }
                else {
                    e(fy9, allocate, 8, 40L);
                    n6 = allocate.getLong();
                }
                long n7;
                if (b) {
                    n7 = c(fy9, allocate, n6 + 28L);
                }
                else {
                    n7 = c(fy9, allocate, n6 + 44L);
                }
                n5 = n7;
            }
            long n8 = 0L;
            long n9 = n;
            while (true) {
                while (n8 < n5) {
                    long n10;
                    if (b) {
                        n10 = c(fy9, allocate, n9 + 0L);
                    }
                    else {
                        n10 = c(fy9, allocate, 0L + n9);
                    }
                    if (n10 == 2L) {
                        long n11;
                        if (b) {
                            n11 = c(fy9, allocate, n9 + 4L);
                        }
                        else {
                            e(fy9, allocate, 8, n9 + 8L);
                            n11 = allocate.getLong();
                        }
                        if (n11 == 0L) {
                            throw new a("ELF file does not contain dynamic linking information");
                        }
                        long n12 = n11;
                        long n13 = 0L;
                        int n14 = 0;
                        while (true) {
                            long n15;
                            if (b) {
                                n15 = c(fy9, allocate, n12 + 0L);
                            }
                            else {
                                e(fy9, allocate, 8, n12 + 0L);
                                n15 = allocate.getLong();
                            }
                            int n16;
                            if (n15 == 1L) {
                                if (n14 == Integer.MAX_VALUE) {
                                    throw new a("malformed DT_NEEDED section");
                                }
                                n16 = n14 + 1;
                            }
                            else {
                                n16 = n14;
                                if (n15 == 5L) {
                                    if (b) {
                                        n13 = c(fy9, allocate, n12 + 4L);
                                    }
                                    else {
                                        e(fy9, allocate, 8, n12 + 8L);
                                        n13 = allocate.getLong();
                                    }
                                    n16 = n14;
                                }
                            }
                            long n17;
                            if (b) {
                                n17 = 8L;
                            }
                            else {
                                n17 = 16L;
                            }
                            n12 += n17;
                            if (n15 == 0L) {
                                if (n13 != 0L) {
                                    while (true) {
                                        for (int n18 = 0; n18 < n5; ++n18) {
                                            long n19;
                                            if (b) {
                                                n19 = c(fy9, allocate, n + 0L);
                                            }
                                            else {
                                                n19 = c(fy9, allocate, n + 0L);
                                            }
                                            if (n19 == 1L) {
                                                long n20;
                                                if (b) {
                                                    n20 = c(fy9, allocate, n + 8L);
                                                }
                                                else {
                                                    e(fy9, allocate, 8, 16L + n);
                                                    n20 = allocate.getLong();
                                                }
                                                long n21;
                                                if (b) {
                                                    n21 = c(fy9, allocate, 20L + n);
                                                }
                                                else {
                                                    e(fy9, allocate, 8, 40L + n);
                                                    n21 = allocate.getLong();
                                                }
                                                if (n20 <= n13 && n13 < n21 + n20) {
                                                    long n22;
                                                    if (b) {
                                                        n22 = c(fy9, allocate, n + 4L);
                                                    }
                                                    else {
                                                        e(fy9, allocate, 8, n + 8L);
                                                        n22 = allocate.getLong();
                                                    }
                                                    final long n23 = n13 - n20 + n22;
                                                    if (n23 == 0L) {
                                                        throw new a("did not find file offset of DT_STRTAB table");
                                                    }
                                                    final String[] array = new String[n16];
                                                    int n24 = 0;
                                                    while (true) {
                                                        final long n25 = 0L + n11;
                                                        long n26;
                                                        if (b) {
                                                            n26 = c(fy9, allocate, n25);
                                                        }
                                                        else {
                                                            e(fy9, allocate, 8, n25);
                                                            n26 = allocate.getLong();
                                                        }
                                                        if (n26 == 1L) {
                                                            long n27;
                                                            if (b) {
                                                                n27 = c(fy9, allocate, 4L + n11);
                                                            }
                                                            else {
                                                                e(fy9, allocate, 8, n11 + 8L);
                                                                n27 = allocate.getLong();
                                                            }
                                                            long n28 = n27 + n23;
                                                            final StringBuilder sb = new StringBuilder();
                                                            while (true) {
                                                                final short d2 = d(fy9, allocate, n28);
                                                                if (d2 == 0) {
                                                                    break;
                                                                }
                                                                sb.append((char)d2);
                                                                ++n28;
                                                            }
                                                            array[n24] = sb.toString();
                                                            if (n24 == Integer.MAX_VALUE) {
                                                                throw new a("malformed DT_NEEDED section");
                                                            }
                                                            ++n24;
                                                        }
                                                        long n29;
                                                        if (b) {
                                                            n29 = 8L;
                                                        }
                                                        else {
                                                            n29 = 16L;
                                                        }
                                                        n11 += n29;
                                                        if (n26 == 0L) {
                                                            if (n24 == n16) {
                                                                return array;
                                                            }
                                                            throw new a("malformed DT_NEEDED section");
                                                        }
                                                    }
                                                }
                                            }
                                            n += b2;
                                        }
                                        final long n23 = 0L;
                                        continue;
                                    }
                                }
                                throw new a("Dynamic section string-table not found");
                            }
                            else {
                                n14 = n16;
                            }
                        }
                    }
                    else {
                        n9 += b2;
                        ++n8;
                    }
                }
                long n11 = 0L;
                continue;
            }
        }
        final StringBuilder j = fu8.j("file is not ELF: 0x");
        j.append(Long.toHexString(c));
        throw new a(j.toString());
    }
    
    public static int b(final fy9 fy9, final ByteBuffer byteBuffer, final long n) throws IOException {
        e(fy9, byteBuffer, 2, n);
        return byteBuffer.getShort() & 0xFFFF;
    }
    
    public static long c(final fy9 fy9, final ByteBuffer byteBuffer, final long n) throws IOException {
        e(fy9, byteBuffer, 4, n);
        return (long)byteBuffer.getInt() & 0xFFFFFFFFL;
    }
    
    public static short d(final fy9 fy9, final ByteBuffer byteBuffer, final long n) throws IOException {
        e(fy9, byteBuffer, 1, n);
        return (short)(byteBuffer.get() & 0xFF);
    }
    
    public static void e(final fy9 fy9, final ByteBuffer byteBuffer, int e0, long n) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(e0);
        while (byteBuffer.remaining() > 0) {
            e0 = fy9.E0(byteBuffer, n);
            if (e0 == -1) {
                break;
            }
            n += e0;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a("ELF file truncated");
    }
    
    public static final class a extends RuntimeException
    {
        public a(final String s) {
            super(s);
        }
    }
}
