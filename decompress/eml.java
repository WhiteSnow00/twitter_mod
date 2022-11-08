import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eml extends fy1
{
    public eml(final h9t h9t, final long n, final long n2) {
        super((fy1$d)new fy1$b(), (fy1$f)new a(h9t), n, n + 1L, 0L, n2, 188L, 1000);
    }
    
    public static int g(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public static final class a implements fy1$f
    {
        public final h9t a;
        public final mwj b;
        
        public a(final h9t a) {
            this.a = a;
            this.b = new mwj();
        }
        
        public final fy1$e a(final koa koa, final long n) throws IOException {
            final long position = koa.getPosition();
            final int n2 = (int)Math.min(20000L, koa.getLength() - position);
            this.b.A(n2);
            koa.n(this.b.a, 0, n2);
            final mwj b = this.b;
            int b2 = -1;
            long n3 = -9223372036854775807L;
            int n4 = -1;
            fy1$e fy1$e;
            while (true) {
                final int c = b.c;
                final int b3 = b.b;
                if (c - b3 >= 4) {
                    if (eml.g(b.a, b3) != 442) {
                        b.E(1);
                    }
                    else {
                        b.E(4);
                        final long c2 = gml.c(b);
                        int b4 = n4;
                        long b5 = n3;
                        if (c2 != -9223372036854775807L) {
                            b5 = this.a.b(c2);
                            if (b5 > n) {
                                if (n3 == -9223372036854775807L) {
                                    fy1$e = fy1$e.a(b5, position);
                                    break;
                                }
                                fy1$e = fy1$e.b(position + n4);
                                break;
                            }
                            else {
                                if (100000L + b5 > n) {
                                    fy1$e = fy1$e.b(position + b.b);
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
                                        if (eml.g(b.a, b6) == 443) {
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
                                            final int g = eml.g(b.a, b7);
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
                        fy1$e = fy1$e.c(n3, position + b2);
                        break;
                    }
                    fy1$e = fy1$e.d;
                    break;
                }
            }
            return fy1$e;
        }
        
        public final void b() {
            final mwj b = this.b;
            final byte[] f = imw.f;
            Objects.requireNonNull(b);
            b.B(f, f.length);
        }
    }
}
