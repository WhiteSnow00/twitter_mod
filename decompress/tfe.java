import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.math.BigInteger;
import java.io.Flushable;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tfe implements Closeable, Flushable
{
    public abstract void K(final BigInteger p0) throws IOException;
    
    public void L(final short n) throws IOException {
        this.p(n);
    }
    
    public final void N(final String s, final double n) throws IOException {
        this.i(s);
        this.k(n);
    }
    
    public final void P(final String s, final float n) throws IOException {
        this.i(s);
        this.m(n);
    }
    
    public final void T(final String s, final int n) throws IOException {
        this.i(s);
        this.p(n);
    }
    
    public final void W(final String s, final long n) throws IOException {
        this.i(s);
        this.q(n);
    }
    
    public abstract void Z(final Object p0) throws IOException;
    
    public final void a(final String s) throws JsonGenerationException {
        throw new JsonGenerationException(s);
    }
    
    public final void b(final String s) throws IOException {
        this.i(s);
        this.q0();
    }
    
    public abstract void c(final vi1 p0, final byte[] p1, final int p2) throws IOException;
    
    @Override
    public abstract void close() throws IOException;
    
    public abstract void d(final boolean p0) throws IOException;
    
    public final void e(final String s, final boolean b) throws IOException {
        this.i(s);
        this.d(b);
    }
    
    public abstract void f() throws IOException;
    
    @Override
    public abstract void flush() throws IOException;
    
    public abstract void h() throws IOException;
    
    public abstract void i(final String p0) throws IOException;
    
    public final void i0(final String s) throws IOException {
        this.i(s);
        this.r0();
    }
    
    public abstract void j() throws IOException;
    
    public abstract void k(final double p0) throws IOException;
    
    public abstract void m(final float p0) throws IOException;
    
    public abstract void m0(final String p0) throws IOException;
    
    public abstract void p(final int p0) throws IOException;
    
    public abstract void p0(final String p0) throws IOException;
    
    public abstract void q(final long p0) throws IOException;
    
    public abstract void q0() throws IOException;
    
    public abstract void r0() throws IOException;
    
    public abstract void s0(final String p0) throws IOException;
    
    public void u0(final String s, final String s2) throws IOException {
        this.i(s);
        this.s0(s2);
    }
    
    public abstract void z(final BigDecimal p0) throws IOException;
    
    public enum a
    {
        E0(true), 
        F0(true), 
        G0(true), 
        H0(true), 
        I0(true), 
        J0(false), 
        K0(false), 
        L0(false), 
        M0(false);
        
        public final boolean C0;
        public final int D0;
        
        public a(final boolean c0) {
            this.C0 = c0;
            this.D0 = 1 << this.ordinal();
        }
        
        public final boolean b(final int n) {
            return (n & this.D0) != 0x0;
        }
    }
}
