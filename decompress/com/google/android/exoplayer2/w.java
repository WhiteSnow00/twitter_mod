// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.view.Surface;
import java.util.List;

public interface w
{
    r A0();
    
    int B();
    
    int C0();
    
    boolean D0();
    
    void E();
    
    void F0();
    
    i G();
    
    long H0();
    
    void I(final boolean p0);
    
    void I0();
    
    void J0();
    
    r K0();
    
    boolean L();
    
    long L0();
    
    List<q77> M();
    
    boolean M0();
    
    int N();
    
    boolean O(final int p0);
    
    boolean Q();
    
    int R();
    
    f0 S();
    
    @Deprecated
    cwt T();
    
    e0 U();
    
    jwt X();
    
    void Y();
    
    @Deprecated
    hwt Z();
    
    v a();
    
    int a0();
    
    void b();
    
    boolean c();
    
    void c0(final int p0, final long p1);
    
    void d(final float p0);
    
    w$a d0();
    
    boolean e0();
    
    @Deprecated
    void f0(final boolean p0);
    
    void g(final v p0);
    
    void g0();
    
    int h0();
    
    long i();
    
    r3x j0();
    
    long k();
    
    float k0();
    
    void l();
    
    py0 l0();
    
    boolean m0();
    
    int n();
    
    void p();
    
    void q(final Surface p0);
    
    int q0();
    
    boolean r();
    
    void release();
    
    long t();
    
    void u0(final int p0);
    
    boolean v();
    
    long v0();
    
    long w0();
    
    void x(final c p0);
    
    void x0(final c p0);
    
    void y(final int p0);
    
    long y0();
    
    boolean z0();
    
    public static final class b
    {
        public final l1b a;
        
        public b(final l1b a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a.equals((Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public interface c
    {
        void A(final int p0);
        
        void B0(final w p0, final b p1);
        
        void C(final i p0);
        
        void D(final r p0);
        
        void F(final int p0, final boolean p1);
        
        @Deprecated
        void G0(final boolean p0, final int p1);
        
        void K();
        
        void O0(final int p0);
        
        void Q0(final q p0, final int p1);
        
        @Deprecated
        void U0(final cwt p0, final hwt p1);
        
        void V(final int p0, final int p1);
        
        void W(final v p0);
        
        void a1(final boolean p0, final int p1);
        
        void b0(final PlaybackException p0);
        
        void e(final boolean p0);
        
        void f(final List<q77> p0);
        
        void h(final z8h p0);
        
        @Deprecated
        void i0(final int p0);
        
        void i1(final boolean p0);
        
        void j(final r3x p0);
        
        void m(final w$d p0, final w$d p1, final int p2);
        
        void n0(final boolean p0);
        
        void o(final int p0);
        
        @Deprecated
        void o0();
        
        void p0(final PlaybackException p0);
        
        @Deprecated
        void s(final boolean p0);
        
        void t0(final float p0);
        
        void u(final f0 p0);
        
        void w(final w$a p0);
        
        void z(final e0 p0, final int p1);
    }
}
