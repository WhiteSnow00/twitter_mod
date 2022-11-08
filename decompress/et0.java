import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class et0 implements a
{
    public ukq a;
    public float b;
    public ArrayList<ukq> c;
    public et0.et0$a d;
    public boolean e;
    
    public et0() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList<ukq>();
        this.e = false;
    }
    
    public et0(final wb7 wb7) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList<ukq>();
        this.e = false;
        this.d = (et0.et0$a)new vs0(this, wb7);
    }
    
    @Override
    public ukq a(final boolean[] array) {
        return this.h(array, null);
    }
    
    public final et0 b(final pdf pdf, final int n) {
        this.d.k(pdf.k(n, "ep"), 1.0f);
        this.d.k(pdf.k(n, "em"), -1.0f);
        return this;
    }
    
    public final et0 c(final ukq ukq, final ukq ukq2, final ukq ukq3, final ukq ukq4, final float n) {
        this.d.k(ukq, -1.0f);
        this.d.k(ukq2, 1.0f);
        this.d.k(ukq3, n);
        this.d.k(ukq4, -n);
        return this;
    }
    
    public final et0 d(final ukq ukq, final ukq ukq2, final ukq ukq3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.d.k(ukq, -1.0f);
            this.d.k(ukq2, 1.0f);
            this.d.k(ukq3, 1.0f);
        }
        else {
            this.d.k(ukq, 1.0f);
            this.d.k(ukq2, -1.0f);
            this.d.k(ukq3, -1.0f);
        }
        return this;
    }
    
    public final et0 e(final ukq ukq, final ukq ukq2, final ukq ukq3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.d.k(ukq, -1.0f);
            this.d.k(ukq2, 1.0f);
            this.d.k(ukq3, -1.0f);
        }
        else {
            this.d.k(ukq, 1.0f);
            this.d.k(ukq2, -1.0f);
            this.d.k(ukq3, 1.0f);
        }
        return this;
    }
    
    public final et0 f(final ukq ukq, final ukq ukq2, final ukq ukq3, final ukq ukq4, final float n) {
        this.d.k(ukq3, 0.5f);
        this.d.k(ukq4, 0.5f);
        this.d.k(ukq, -0.5f);
        this.d.k(ukq2, -0.5f);
        this.b = -n;
        return this;
    }
    
    public boolean g() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }
    
    public final ukq h(final boolean[] array, final ukq ukq) {
        final int f = this.d.f();
        ukq ukq2 = null;
        int i = 0;
        float n = 0.0f;
        while (i < f) {
            final float h = this.d.h(i);
            ukq ukq3 = ukq2;
            float n2 = n;
            Label_0153: {
                if (h < 0.0f) {
                    final ukq b = this.d.b(i);
                    if (array != null) {
                        ukq3 = ukq2;
                        n2 = n;
                        if (array[b.D0]) {
                            break Label_0153;
                        }
                    }
                    ukq3 = ukq2;
                    n2 = n;
                    if (b != ukq) {
                        final int k0 = b.K0;
                        if (k0 != 3) {
                            ukq3 = ukq2;
                            n2 = n;
                            if (k0 != 4) {
                                break Label_0153;
                            }
                        }
                        ukq3 = ukq2;
                        n2 = n;
                        if (h < n) {
                            n2 = h;
                            ukq3 = b;
                        }
                    }
                }
            }
            ++i;
            ukq2 = ukq3;
            n = n2;
        }
        return ukq2;
    }
    
    public final void i(final ukq a) {
        final ukq a2 = this.a;
        if (a2 != null) {
            this.d.k(a2, -1.0f);
            this.a.E0 = -1;
            this.a = null;
        }
        final float n = this.d.i(a, true) * -1.0f;
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        this.d.j(n);
    }
    
    public final void j(final pdf pdf, final ukq ukq, final boolean b) {
        if (ukq != null) {
            if (ukq.H0) {
                this.b += ukq.G0 * this.d.e(ukq);
                this.d.i(ukq, b);
                if (b) {
                    ukq.e(this);
                }
                if (this.d.f() == 0) {
                    this.e = true;
                    pdf.a = true;
                }
            }
        }
    }
    
    public void k(final pdf pdf, final et0 et0, final boolean b) {
        this.b += et0.b * this.d.d(et0, b);
        if (b) {
            et0.a.e(this);
        }
        if (this.a != null && this.d.f() == 0) {
            this.e = true;
            pdf.a = true;
        }
    }
    
    @Override
    public String toString() {
        String string;
        if (this.a == null) {
            string = "0";
        }
        else {
            final StringBuilder g = w48.g("");
            g.append(this.a);
            string = g.toString();
        }
        String s = l7k.c(string, " = ");
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder g2 = w48.g(s);
            g2.append(this.b);
            s = g2.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.d.f()) {
            final ukq b2 = this.d.b(i);
            if (b2 != null) {
                final float h = this.d.h(i);
                final float n2 = fcmpl(h, 0.0f);
                if (n2 != 0) {
                    final String string2 = b2.toString();
                    String s2 = null;
                    float n3 = 0.0f;
                    Label_0213: {
                        if (n == 0) {
                            s2 = s;
                            n3 = h;
                            if (h >= 0.0f) {
                                break Label_0213;
                            }
                            s2 = l7k.c(s, "- ");
                        }
                        else {
                            if (n2 > 0) {
                                s2 = l7k.c(s, " + ");
                                n3 = h;
                                break Label_0213;
                            }
                            s2 = l7k.c(s, " - ");
                        }
                        n3 = h * -1.0f;
                    }
                    if (n3 == 1.0f) {
                        s = l7k.c(s2, string2);
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s2);
                        sb.append(n3);
                        sb.append(" ");
                        sb.append(string2);
                        s = sb.toString();
                    }
                    n = 1;
                }
            }
            ++i;
        }
        String c = s;
        if (n == 0) {
            c = l7k.c(s, "0.0");
        }
        return c;
    }
}
