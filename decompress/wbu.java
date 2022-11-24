import android.text.Layout$Alignment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wbu
{
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public String l;
    public int m;
    public int n;
    public Layout$Alignment o;
    public Layout$Alignment p;
    public int q;
    public igs r;
    public float s;
    
    public wbu() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.m = -1;
        this.n = -1;
        this.q = -1;
        this.s = Float.MAX_VALUE;
    }
    
    public final wbu a(final wbu wbu) {
        if (wbu != null) {
            if (!this.c && wbu.c) {
                this.b = wbu.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = wbu.h;
            }
            if (this.i == -1) {
                this.i = wbu.i;
            }
            if (this.a == null) {
                final String a = wbu.a;
                if (a != null) {
                    this.a = a;
                }
            }
            if (this.f == -1) {
                this.f = wbu.f;
            }
            if (this.g == -1) {
                this.g = wbu.g;
            }
            if (this.n == -1) {
                this.n = wbu.n;
            }
            if (this.o == null) {
                final Layout$Alignment o = wbu.o;
                if (o != null) {
                    this.o = o;
                }
            }
            if (this.p == null) {
                final Layout$Alignment p = wbu.p;
                if (p != null) {
                    this.p = p;
                }
            }
            if (this.q == -1) {
                this.q = wbu.q;
            }
            if (this.j == -1) {
                this.j = wbu.j;
                this.k = wbu.k;
            }
            if (this.r == null) {
                this.r = wbu.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = wbu.s;
            }
            if (!this.e && wbu.e) {
                this.d = wbu.d;
                this.e = true;
            }
            if (this.m == -1) {
                final int m = wbu.m;
                if (m != -1) {
                    this.m = m;
                }
            }
        }
        return this;
    }
    
    public final int b() {
        final int h = this.h;
        if (h == -1 && this.i == -1) {
            return -1;
        }
        int n = false ? 1 : 0;
        final boolean b = h == 1;
        if (this.i == 1) {
            n = 2;
        }
        return (b ? 1 : 0) | n;
    }
}
