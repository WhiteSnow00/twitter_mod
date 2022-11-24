import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbu extends iy1
{
    public hbu(final tat tat, final long n, final long n2, final int n3, final int n4) {
        super((iy1$d)new iy1$b(), (iy1$f)new a(n3, tat, n4), n, n + 1L, 0L, n2, 188L, 940);
    }
    
    public static final class a implements iy1$f
    {
        public final tat a;
        public final gxj b;
        public final int c;
        public final int d;
        
        public a(final int c, final tat a, final int d) {
            this.c = c;
            this.a = a;
            this.d = d;
            this.b = new gxj();
        }
        
        public final iy1$e a(final roa roa, final long n) throws IOException {
            final long position = roa.getPosition();
            final int n2 = (int)Math.min(this.d, roa.getLength() - position);
            this.b.A(n2);
            roa.n(this.b.a, 0, n2);
            final gxj b = this.b;
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
                final long n7 = p4j.N(b, b2, this.c);
                long n8 = n4;
                long b3 = n5;
                if (n7 != -9223372036854775807L) {
                    b3 = this.a.b(n7);
                    if (b3 > n) {
                        if (n5 == -9223372036854775807L) {
                            return iy1$e.a(b3, position);
                        }
                        return iy1$e.b(position + n4);
                    }
                    else {
                        if (100000L + b3 > n) {
                            return iy1$e.b(position + b2);
                        }
                        n8 = b2;
                    }
                }
                b.D(n6);
                n3 = n6;
                n4 = n8;
                n5 = b3;
            }
            iy1$e iy1$e;
            if (n5 != -9223372036854775807L) {
                iy1$e = iy1$e.c(n5, position + n3);
            }
            else {
                iy1$e = iy1$e.d;
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
