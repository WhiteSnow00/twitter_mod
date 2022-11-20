import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class um0 extends db
{
    public final z8h m0(final j9h j9h, final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get();
        z8h z8h = null;
        if (value == 116) {
            final nhx nhx = new nhx(byteBuffer.array(), byteBuffer.limit());
            nhx.m(12);
            final int g = nhx.g(12);
            final int d = nhx.d();
            nhx.m(44);
            nhx.n(nhx.g(12));
            nhx.m(16);
            final ArrayList list = new ArrayList();
            while (nhx.d() < d + g - 4) {
                nhx.m(48);
                final int g2 = nhx.g(8);
                nhx.m(4);
                final int n = nhx.d() + nhx.g(12);
                String s = null;
                String s2 = null;
                while (nhx.d() < n) {
                    final int g3 = nhx.g(8);
                    final int g4 = nhx.g(8);
                    final int n2 = nhx.d() + g4;
                    String s3;
                    String s4;
                    if (g3 == 2) {
                        final int g5 = nhx.g(16);
                        nhx.m(8);
                        s3 = s;
                        s4 = s2;
                        if (g5 == 3) {
                            while (true) {
                                s3 = s;
                                s4 = s2;
                                if (nhx.d() >= n2) {
                                    break;
                                }
                                final int g6 = nhx.g(8);
                                final Charset a = it3.a;
                                final byte[] array = new byte[g6];
                                nhx.i(array, g6);
                                final String s5 = new String(array, a);
                                final int g7 = nhx.g(8);
                                int n3 = 0;
                                while (true) {
                                    s = s5;
                                    if (n3 >= g7) {
                                        break;
                                    }
                                    nhx.n(nhx.g(8));
                                    ++n3;
                                }
                            }
                        }
                    }
                    else {
                        s3 = s;
                        s4 = s2;
                        if (g3 == 21) {
                            final Charset a2 = it3.a;
                            final byte[] array2 = new byte[g4];
                            nhx.i(array2, g4);
                            s4 = new String(array2, a2);
                            s3 = s;
                        }
                    }
                    nhx.k(n2 * 8);
                    s = s3;
                    s2 = s4;
                }
                nhx.k(n * 8);
                if (s != null && s2 != null) {
                    String concat;
                    if (s2.length() != 0) {
                        concat = s.concat(s2);
                    }
                    else {
                        concat = new String(s);
                    }
                    list.add(new tm0(g2, concat));
                }
            }
            if (list.isEmpty()) {
                z8h = z8h;
            }
            else {
                z8h = new z8h((List)list);
            }
        }
        return z8h;
    }
}
