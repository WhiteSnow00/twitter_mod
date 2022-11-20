import java.io.IOException;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgj
{
    public final egj a;
    public final rwj b;
    public int c;
    public int d;
    public boolean e;
    
    public dgj() {
        this.a = new egj();
        this.b = new rwj(new byte[65025], 0);
        this.c = -1;
    }
    
    public final int a(final int n) {
        int n2 = 0;
        this.d = 0;
        int i;
        int n3;
        do {
            final int d = this.d;
            final egj a = this.a;
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
    
    public final boolean b(final jna jna) throws IOException {
        omy.k(jna != null);
        if (this.e) {
            this.e = false;
            this.b.A(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(jna, -1L) || !this.a.a(jna, true)) {
                    return false;
                }
                final egj a = this.a;
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
                    jna.k(d);
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
                final rwj b2 = this.b;
                b2.a(b2.c + a2);
                final rwj b3 = this.b;
                final byte[] a3 = b3.a;
                final int c2 = b3.c;
                boolean b4;
                try {
                    jna.readFully(a3, c2, a2);
                    b4 = true;
                }
                catch (final EOFException ex2) {
                    b4 = false;
                }
                if (!b4) {
                    return false;
                }
                final rwj b5 = this.b;
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
