import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonGenerationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wle extends fje
{
    public final wle d;
    public nm9 e;
    public wle f;
    public String g;
    public boolean h;
    
    public wle(final int b, final wle d, final nm9 e) {
        super.b = b;
        this.d = d;
        this.e = e;
        super.c = -1;
    }
    
    public final wle h() {
        final wle f = this.f;
        if (f == null) {
            final nm9 e = this.e;
            nm9 a;
            if (e == null) {
                a = null;
            }
            else {
                a = e.a();
            }
            return this.f = new wle(1, this, a);
        }
        f.j(1);
        return f;
    }
    
    public final wle i() {
        final wle f = this.f;
        if (f == null) {
            final nm9 e = this.e;
            nm9 a;
            if (e == null) {
                a = null;
            }
            else {
                a = e.a();
            }
            return this.f = new wle(2, this, a);
        }
        f.j(2);
        return f;
    }
    
    public final wle j(final int b) {
        super.b = b;
        super.c = -1;
        this.g = null;
        this.h = false;
        final nm9 e = this.e;
        if (e != null) {
            e.b = null;
            e.c = null;
            e.d = null;
        }
        return this;
    }
    
    public final int k(String h) throws JsonProcessingException {
        if (super.b != 2 || this.h) {
            return 4;
        }
        int n = 1;
        this.h = true;
        this.g = h;
        final nm9 e = this.e;
        if (e != null && e.b(h)) {
            final Object a = e.a;
            h = c0e.h("Duplicate field '", h, "'");
            if (a instanceof yfe) {
                final yfe yfe = (yfe)a;
            }
            throw new JsonGenerationException(h);
        }
        if (super.c < 0) {
            n = 0;
        }
        return n;
    }
    
    public final int l() {
        final int b = super.b;
        final int n = 0;
        int n2 = 0;
        if (b == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            ++super.c;
            return 2;
        }
        else {
            if (b == 1) {
                if (super.c++ >= 0) {
                    n2 = 1;
                }
                return n2;
            }
            int n3;
            if (++super.c == 0) {
                n3 = n;
            }
            else {
                n3 = 3;
            }
            return n3;
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        final int b = super.b;
        if (b == 2) {
            sb.append('{');
            if (this.g != null) {
                sb.append('\"');
                sb.append(this.g);
                sb.append('\"');
            }
            else {
                sb.append('?');
            }
            sb.append('}');
        }
        else if (b == 1) {
            sb.append('[');
            int c;
            if ((c = super.c) < 0) {
                c = 0;
            }
            sb.append(c);
            sb.append(']');
        }
        else {
            sb.append("/");
        }
        return sb.toString();
    }
}
