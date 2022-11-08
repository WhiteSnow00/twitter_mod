// 
// Decompiled by Procyon v0.6.0
// 

public final class jap implements bau
{
    public final iap a;
    public final mwj b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    
    public jap(final iap a) {
        this.a = a;
        this.b = new mwj(32);
    }
    
    public final void a(final mwj mwj, int i) {
        if ((i & 0x1) != 0x0) {
            i = 1;
        }
        else {
            i = 0;
        }
        int n;
        if (i != 0) {
            n = mwj.b + mwj.t();
        }
        else {
            n = -1;
        }
        if (this.f) {
            if (i == 0) {
                return;
            }
            this.f = false;
            mwj.D(n);
            this.d = 0;
        }
        while (true) {
            final int c = mwj.c;
            i = mwj.b;
            if (c - i <= 0) {
                return;
            }
            final int d = this.d;
            if (d < 3) {
                if (d == 0) {
                    i = mwj.t();
                    mwj.D(mwj.b - 1);
                    if (i == 255) {
                        this.f = true;
                        return;
                    }
                }
                i = Math.min(mwj.c - mwj.b, 3 - this.d);
                mwj.d(this.b.a, this.d, i);
                i += this.d;
                if ((this.d = i) != 3) {
                    continue;
                }
                this.b.D(0);
                this.b.C(3);
                this.b.E(1);
                i = this.b.t();
                final int t = this.b.t();
                this.e = ((i & 0x80) != 0x0);
                i = ((i & 0xF) << 8 | t) + 3;
                this.c = i;
                final byte[] a = this.b.a;
                if (a.length >= i) {
                    continue;
                }
                i = Math.min(4098, Math.max(i, a.length * 2));
                this.b.a(i);
            }
            else {
                i = Math.min(c - i, this.c - d);
                mwj.d(this.b.a, this.d, i);
                i += this.d;
                this.d = i;
                final int c2 = this.c;
                if (i != c2) {
                    continue;
                }
                if (this.e) {
                    final byte[] a2 = this.b.a;
                    i = imw.a;
                    i = 0;
                    int n2 = -1;
                    while (i < c2) {
                        n2 = (imw.l[(n2 >>> 24 ^ (a2[i] & 0xFF)) & 0xFF] ^ n2 << 8);
                        ++i;
                    }
                    if (n2 != 0) {
                        this.f = true;
                        return;
                    }
                    this.b.C(this.c - 4);
                }
                else {
                    this.b.C(c2);
                }
                this.b.D(0);
                this.a.a(this.b);
                this.d = 0;
            }
        }
    }
    
    public final void b(final h9t h9t, final ooa ooa, final bau$d bau$d) {
        this.a.b(h9t, ooa, bau$d);
        this.f = true;
    }
    
    public final void c() {
        this.f = true;
    }
}
