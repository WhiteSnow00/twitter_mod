import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonParseException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cie extends yie
{
    public final cie d;
    public cm9 e;
    public cie f;
    public String g;
    public int h;
    public int i;
    
    public cie(final cie d, final cm9 e, final int b, final int h, final int i) {
        this.d = d;
        this.e = e;
        super.b = b;
        this.h = h;
        this.i = i;
        super.c = -1;
    }
    
    public final cie h(final int n, final int n2) {
        cie f = this.f;
        if (f == null) {
            final cm9 e = this.e;
            cm9 a;
            if (e == null) {
                a = null;
            }
            else {
                a = e.a();
            }
            f = new cie(this, a, 1, n, n2);
            this.f = f;
        }
        else {
            f.j(1, n, n2);
        }
        return f;
    }
    
    public final cie i(final int n, final int n2) {
        final cie f = this.f;
        if (f == null) {
            final cm9 e = this.e;
            cm9 a;
            if (e == null) {
                a = null;
            }
            else {
                a = e.a();
            }
            return this.f = new cie(this, a, 2, n, n2);
        }
        f.j(2, n, n2);
        return f;
    }
    
    public final void j(final int b, final int h, final int i) {
        super.b = b;
        super.c = -1;
        this.h = h;
        this.i = i;
        this.g = null;
        final cm9 e = this.e;
        if (e != null) {
            e.b = null;
            e.c = null;
            e.d = null;
        }
    }
    
    public final void k(final String g) throws JsonProcessingException {
        this.g = g;
        final cm9 e = this.e;
        if (e != null && e.b(g)) {
            final Object a = e.a;
            khe khe;
            if (a instanceof khe) {
                khe = (khe)a;
            }
            else {
                khe = null;
            }
            throw new JsonParseException(khe, zi.y("Duplicate field '", g, "'"));
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        final int b = super.b;
        if (b != 0) {
            final int n = 0;
            int i = 0;
            if (b != 1) {
                sb.append('{');
                if (this.g != null) {
                    sb.append('\"');
                    final String g = this.g;
                    final int[] h = vt3.h;
                    final int length = h.length;
                    while (i < g.length()) {
                        final char char1 = g.charAt(i);
                        if (char1 < length && h[char1] != 0) {
                            sb.append('\\');
                            final int n2 = h[char1];
                            if (n2 < 0) {
                                sb.append('u');
                                sb.append('0');
                                sb.append('0');
                                final char[] a = vt3.a;
                                sb.append(a[char1 >> 4]);
                                sb.append(a[char1 & '\u000f']);
                            }
                            else {
                                sb.append((char)n2);
                            }
                        }
                        else {
                            sb.append(char1);
                        }
                        ++i;
                    }
                    sb.append('\"');
                }
                else {
                    sb.append('?');
                }
                sb.append('}');
            }
            else {
                sb.append('[');
                int c = super.c;
                if (c < 0) {
                    c = n;
                }
                sb.append(c);
                sb.append(']');
            }
        }
        else {
            sb.append("/");
        }
        return sb.toString();
    }
}
