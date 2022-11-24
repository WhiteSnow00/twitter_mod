import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enl extends iy1
{
    public enl(final tat tat, final long n, final long n2) {
        super((iy1$d)new iy1$b(), (iy1$f)new a(tat), n, n + 1L, 0L, n2, 188L, 1000);
    }
    
    public static int g(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public static final class a implements iy1$f
    {
        public final tat a;
        public final gxj b;
        
        public a(final tat a) {
            this.a = a;
            this.b = new gxj();
        }
        
        public final iy1$e a(final roa roa, final long n) throws IOException {
            final long position = roa.getPosition();
            final int n2 = (int)Math.min(20000L, roa.getLength() - position);
            this.b.A(n2);
            roa.n(this.b.a, 0, n2);
            final gxj b = this.b;
            int b2 = -1;
            long n3 = -9223372036854775807L;
            int n4 = -1;
            iy1$e iy1$e;
            while (true) {
                final int c = b.c;
                final int b3 = b.b;
                if (c - b3 >= 4) {
                    if (enl.g(b.a, b3) != 442) {
                        b.E(1);
                    }
                    else {
                        b.E(4);
                        final long c2 = gnl.c(b);
                        int b4 = n4;
                        long b5 = n3;
                        if (c2 != -9223372036854775807L) {
                            b5 = this.a.b(c2);
                            if (b5 > n) {
                                if (n3 == -9223372036854775807L) {
                                    iy1$e = iy1$e.a(b5, position);
                                    break;
                                }
                                iy1$e = iy1$e.b(position + n4);
                                break;
                            }
                            else {
                                if (100000L + b5 > n) {
                                    iy1$e = iy1$e.b(position + b.b);
                                    break;
                                }
                                b4 = b.b;
                            }
                        }
                        final int c3 = b.c;
                        Label_0495: {
                            if (c3 - b.b < 10) {
                                b.D(c3);
                            }
                            else {
                                b.E(9);
                                final int n5 = b.t() & 0x7;
                                if (b.c - b.b < n5) {
                                    b.D(c3);
                                }
                                else {
                                    b.E(n5);
                                    final int c4 = b.c;
                                    final int b6 = b.b;
                                    if (c4 - b6 < 4) {
                                        b.D(c3);
                                    }
                                    else {
                                        if (enl.g(b.a, b6) == 443) {
                                            b.E(4);
                                            final int y = b.y();
                                            if (b.c - b.b < y) {
                                                b.D(c3);
                                                break Label_0495;
                                            }
                                            b.E(y);
                                        }
                                        while (true) {
                                            final int c5 = b.c;
                                            final int b7 = b.b;
                                            if (c5 - b7 < 4) {
                                                break;
                                            }
                                            final int g = enl.g(b.a, b7);
                                            if (g == 442) {
                                                break;
                                            }
                                            if (g == 441) {
                                                break;
                                            }
                                            if (g >>> 8 != 1) {
                                                break;
                                            }
                                            b.E(4);
                                            if (b.c - b.b < 2) {
                                                b.D(c3);
                                                break;
                                            }
                                            b.D(Math.min(b.c, b.b + b.y()));
                                        }
                                    }
                                }
                            }
                        }
                        b2 = b.b;
                        n4 = b4;
                        n3 = b5;
                    }
                }
                else {
                    if (n3 != -9223372036854775807L) {
                        iy1$e = iy1$e.c(n3, position + b2);
                        break;
                    }
                    iy1$e = iy1$e.d;
                    break;
                }
            }
            return iy1$e;
        }
        
        public final void b() {
            final gxj b = this.b;
            final byte[] f = rnw.f;
            Objects.requireNonNull(b);
            b.B(f, f.length);
        }
    }
}
