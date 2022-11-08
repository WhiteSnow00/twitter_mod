import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j2b extends fy1
{
    public j2b(final p2b p2b, int n, final long n2, final long n3) {
        Objects.requireNonNull(p2b);
        final p4w p4w = new p4w((Object)p2b, 3);
        final a a = new a(p2b, n);
        final long c = p2b.c();
        final long j = p2b.j;
        n = p2b.d;
        long n4;
        long n5;
        if (n > 0) {
            n4 = (n + (long)p2b.c) / 2L;
            n5 = 1L;
        }
        else {
            n = p2b.a;
            long n6;
            if (n == p2b.b && n > 0) {
                n6 = n;
            }
            else {
                n6 = 4096L;
            }
            n4 = n6 * p2b.g * p2b.h / 8L;
            n5 = 64L;
        }
        super((fy1$d)p4w, (fy1$f)a, c, j, n2, n3, n4 + n5, Math.max(6, p2b.c));
    }
    
    public static final class a implements fy1$f
    {
        public final p2b a;
        public final int b;
        public final l2b$a c;
        
        public a(final p2b a, final int b) {
            this.a = a;
            this.b = b;
            this.c = new l2b$a();
        }
        
        public final fy1$e a(final koa koa, final long n) throws IOException {
            final long position = koa.getPosition();
            final long c = this.c(koa);
            final long h = koa.h();
            koa.i(Math.max(6, this.a.c));
            final long c2 = this.c(koa);
            final long h2 = koa.h();
            if (c <= n && c2 > n) {
                return fy1$e.b(h);
            }
            if (c2 <= n) {
                return fy1$e.c(c2, h2);
            }
            return fy1$e.a(c, position);
        }
        
        public final long c(final koa koa) throws IOException {
            while (koa.h() < koa.getLength() - 6L) {
                final p2b a = this.a;
                final int b = this.b;
                final l2b$a c = this.c;
                final long h = koa.h();
                final byte[] array = new byte[2];
                boolean a2 = false;
                int i = 0;
                koa.n(array, 0, 2);
                if (((array[0] & 0xFF) << 8 | (array[1] & 0xFF)) != b) {
                    koa.e();
                    koa.i((int)(h - koa.getPosition()));
                }
                else {
                    final mwj mwj = new mwj(16);
                    System.arraycopy(array, 0, mwj.a, 0, 2);
                    final byte[] a3 = mwj.a;
                    while (i < 14) {
                        final int j = koa.j(a3, 2 + i, 14 - i);
                        if (j == -1) {
                            break;
                        }
                        i += j;
                    }
                    mwj.C(i);
                    koa.e();
                    koa.i((int)(h - koa.getPosition()));
                    a2 = l2b.a(mwj, a, b, c);
                }
                if (a2) {
                    break;
                }
                koa.i(1);
            }
            if (koa.h() >= koa.getLength() - 6L) {
                koa.i((int)(koa.getLength() - koa.h()));
                return this.a.j;
            }
            return this.c.a;
        }
    }
}
