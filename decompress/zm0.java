import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zm0 extends fb
{
    public final x8h m0(final h9h h9h, final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get();
        x8h x8h = null;
        if (value == 116) {
            final rgx rgx = new rgx(byteBuffer.array(), byteBuffer.limit());
            rgx.m(12);
            final int g = rgx.g(12);
            final int d = rgx.d();
            rgx.m(44);
            rgx.n(rgx.g(12));
            rgx.m(16);
            final ArrayList list = new ArrayList();
            while (rgx.d() < d + g - 4) {
                rgx.m(48);
                final int g2 = rgx.g(8);
                rgx.m(4);
                final int n = rgx.d() + rgx.g(12);
                String s2;
                String s = s2 = null;
                while (rgx.d() < n) {
                    final int g3 = rgx.g(8);
                    final int g4 = rgx.g(8);
                    final int n2 = rgx.d() + g4;
                    String s3;
                    String s4;
                    if (g3 == 2) {
                        final int g5 = rgx.g(16);
                        rgx.m(8);
                        s3 = s;
                        s4 = s2;
                        if (g5 == 3) {
                            while (true) {
                                s3 = s;
                                s4 = s2;
                                if (rgx.d() >= n2) {
                                    break;
                                }
                                final int g6 = rgx.g(8);
                                final Charset a = au3.a;
                                final byte[] array = new byte[g6];
                                rgx.i(array, g6);
                                final String s5 = new String(array, a);
                                final int g7 = rgx.g(8);
                                int n3 = 0;
                                while (true) {
                                    s = s5;
                                    if (n3 >= g7) {
                                        break;
                                    }
                                    rgx.n(rgx.g(8));
                                    ++n3;
                                }
                            }
                        }
                    }
                    else {
                        s3 = s;
                        s4 = s2;
                        if (g3 == 21) {
                            final Charset a2 = au3.a;
                            final byte[] array2 = new byte[g4];
                            rgx.i(array2, g4);
                            s4 = new String(array2, a2);
                            s3 = s;
                        }
                    }
                    rgx.k(n2 * 8);
                    s = s3;
                    s2 = s4;
                }
                rgx.k(n * 8);
                if (s != null && s2 != null) {
                    String concat;
                    if (s2.length() != 0) {
                        concat = s.concat(s2);
                    }
                    else {
                        concat = new String(s);
                    }
                    list.add(new ym0(g2, concat));
                }
            }
            if (list.isEmpty()) {
                x8h = x8h;
            }
            else {
                x8h = new x8h((List)list);
            }
        }
        return x8h;
    }
}
