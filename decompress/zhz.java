import java.io.IOException;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhz implements srz
{
    public final vhz a;
    
    public zhz(final vhz a) {
        final Charset a2 = glz.a;
        this.a = a;
        a.X0 = this;
    }
    
    public final void a(final int n, final int n2) throws IOException {
        this.a.W0(n, n2 >> 31 ^ n2 + n2);
    }
    
    public final void b(final int n, final long n2) throws IOException {
        this.a.Y0(n, n2 >> 63 ^ n2 + n2);
    }
    
    public final void c(final int n, final int n2) throws IOException {
        this.a.W0(n, n2);
    }
    
    public final void d(final int n, final long n2) throws IOException {
        this.a.Y0(n, n2);
    }
    
    public final void e(final int n, final boolean b) throws IOException {
        this.a.M0(n, b);
    }
    
    public final void f(final int n, final bhz bhz) throws IOException {
        this.a.N0(n, bhz);
    }
    
    public final void g(final int n, final double n2) throws IOException {
        this.a.Q0(n, Double.doubleToRawLongBits(n2));
    }
    
    public final void h(final int n, final int n2) throws IOException {
        this.a.S0(n, n2);
    }
    
    public final void i(final int n, final int n2) throws IOException {
        this.a.O0(n, n2);
    }
    
    public final void j(final int n, final long n2) throws IOException {
        this.a.Q0(n, n2);
    }
    
    public final void k(final int n, final float n2) throws IOException {
        this.a.O0(n, Float.floatToRawIntBits(n2));
    }
    
    public final void l(final int n, final Object o, final apz apz) throws IOException {
        final vhz a = this.a;
        final xnz xnz = (xnz)o;
        a.V0(n, 3);
        apz.i(xnz, (srz)a.X0);
        a.V0(n, 4);
    }
    
    public final void m(final int n, final int n2) throws IOException {
        this.a.S0(n, n2);
    }
    
    public final void n(final int n, final long n2) throws IOException {
        this.a.Y0(n, n2);
    }
    
    public final void o(int n, final Object o, final apz apz) throws IOException {
        final vhz a = this.a;
        final xnz xnz = (xnz)o;
        final phz phz = (phz)a;
        phz.X0(n << 3 | 0x2);
        final ffz ffz = (ffz)xnz;
        if ((n = ffz.b()) == -1) {
            n = apz.g(ffz);
            ffz.h(n);
        }
        phz.X0(n);
        apz.i(xnz, (srz)((vhz)phz).X0);
    }
    
    public final void p(final int n, final int n2) throws IOException {
        this.a.O0(n, n2);
    }
    
    public final void q(final int n, final long n2) throws IOException {
        this.a.Q0(n, n2);
    }
}
