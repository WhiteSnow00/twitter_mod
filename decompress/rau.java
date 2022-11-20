import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rau extends ay1
{
    public rau(final x9t x9t, final long n, final long n2, final int n3, final int n4) {
        super((ay1$d)new ay1$b(), (ay1$f)new a(n3, x9t, n4), n, n + 1L, 0L, n2, 188L, 940);
    }
    
    public static final class a implements ay1$f
    {
        public final x9t a;
        public final rwj b;
        public final int c;
        public final int d;
        
        public a(final int c, final x9t a, final int d) {
            this.c = c;
            this.a = a;
            this.d = d;
            this.b = new rwj();
        }
        
        public final ay1$e a(final jna jna, final long n) throws IOException {
            final long position = jna.getPosition();
            final int n2 = (int)Math.min(this.d, jna.getLength() - position);
            this.b.A(n2);
            jna.n(this.b.a, 0, n2);
            final rwj b = this.b;
            final int c = b.c;
            long n3 = -1L;
            long n4 = -1L;
            long n5 = -9223372036854775807L;
            while (true) {
                final int c2 = b.c;
                int b2 = b.b;
                if (c2 - b2 < 188) {
                    break;
                }
                for (byte[] a = b.a; b2 < c && a[b2] != 71; ++b2) {}
                final int n6 = b2 + 188;
                if (n6 > c) {
                    break;
                }
                final long t = gmw.T(b, b2, this.c);
                long n7 = n4;
                long b3 = n5;
                if (t != -9223372036854775807L) {
                    b3 = this.a.b(t);
                    if (b3 > n) {
                        if (n5 == -9223372036854775807L) {
                            return ay1$e.a(b3, position);
                        }
                        return ay1$e.b(position + n4);
                    }
                    else {
                        if (100000L + b3 > n) {
                            return ay1$e.b(position + b2);
                        }
                        n7 = b2;
                    }
                }
                b.D(n6);
                n3 = n6;
                n4 = n7;
                n5 = b3;
            }
            ay1$e ay1$e;
            if (n5 != -9223372036854775807L) {
                ay1$e = ay1$e.c(n5, position + n3);
            }
            else {
                ay1$e = ay1$e.d;
            }
            return ay1$e;
        }
        
        public final void b() {
            final rwj b = this.b;
            final byte[] f = cnw.f;
            Objects.requireNonNull(b);
            b.B(f, f.length);
        }
    }
}
