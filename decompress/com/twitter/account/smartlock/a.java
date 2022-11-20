// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.account.smartlock;

public interface a
{
    void a(final c p0);
    
    void b();
    
    eaq<ynj<c>> c(final c p0);
    
    boolean d();
    
    eaq<ynj<c>> e(final c p0, final com.twitter.account.smartlock.b p1);
    
    eaq<ynj<c>> f(final com.twitter.account.smartlock.b p0);
    
    eaq<ynj<c>> g(final com.twitter.account.smartlock.b p0);
    
    public enum a
    {
        E0(100), 
        F0(101);
        
        public static final a[] G0;
        public final int D0;
        
        public a(final int d0) {
            this.D0 = d0;
        }
    }
    
    public interface b
    {
    }
    
    public static final class c
    {
        public final String a;
        public final String b;
        
        public c(final c.a$c$a a$c$a) {
            final String a = a$c$a.a;
            jee.k(a);
            this.a = a;
            final String b = a$c$a.b;
            jee.k(b);
            this.b = b;
        }
    }
}
