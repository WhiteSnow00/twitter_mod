import java.io.IOException;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgj
{
    public final sgj a;
    public final gxj b;
    public int c;
    public int d;
    public boolean e;
    
    public rgj() {
        this.a = new sgj();
        this.b = new gxj(new byte[65025], 0);
        this.c = -1;
    }
    
    public final int a(final int n) {
        int n2 = 0;
        this.d = 0;
        int i;
        int n3;
        do {
            final int d = this.d;
            final sgj a = this.a;
            n3 = n2;
            if (n + d >= a.c) {
                break;
            }
            final int[] f = a.f;
            this.d = d + 1;
            i = f[d + n];
            n3 = (n2 += i);
        } while (i == 255);
        return n3;
    }
    
    public final boolean b(final roa roa) throws IOException {
        omi.p(roa != null);
        if (this.e) {
            this.e = false;
            this.b.A(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(roa, -1L) || !this.a.a(roa, true)) {
                    return false;
                }
                final sgj a = this.a;
                int d = a.d;
                int c;
                if ((a.a & 0x1) == 0x1 && this.b.c == 0) {
                    d += this.a(0);
                    c = this.d + 0;
                }
                else {
                    c = 0;
                }
                boolean b;
                try {
                    roa.k(d);
                    b = true;
                }
                catch (final EOFException ex) {
                    b = false;
                }
                if (!b) {
                    return false;
                }
                this.c = c;
            }
            final int a2 = this.a(this.c);
            final int n = this.c + this.d;
            if (a2 > 0) {
                final gxj b2 = this.b;
                b2.a(b2.c + a2);
                final gxj b3 = this.b;
                final byte[] a3 = b3.a;
                final int c2 = b3.c;
                boolean b4;
                try {
                    roa.readFully(a3, c2, a2);
                    b4 = true;
                }
                catch (final EOFException ex2) {
                    b4 = false;
                }
                if (!b4) {
                    return false;
                }
                final gxj b5 = this.b;
                b5.C(b5.c + a2);
                this.e = (this.a.f[n - 1] != 255);
            }
            int c3;
            if ((c3 = n) == this.a.c) {
                c3 = -1;
            }
            this.c = c3;
        }
        return true;
    }
}
