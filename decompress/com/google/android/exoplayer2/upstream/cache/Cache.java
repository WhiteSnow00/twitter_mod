// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream.cache;

import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;
import java.io.File;

public interface Cache
{
    File a(final String p0, final long p1, final long p2) throws CacheException;
    
    Set<String> b();
    
    rl6 c(final String p0);
    
    void d(final q73 p0);
    
    long e(final String p0, final long p1, final long p2);
    
    q73 f(final String p0, final long p1, final long p2) throws CacheException;
    
    long g(final String p0, final long p1, final long p2);
    
    long j();
    
    void m(final q73 p0);
    
    q73 n(final String p0, final long p1, final long p2) throws InterruptedException, CacheException;
    
    void o(final File p0, final long p1) throws CacheException;
    
    void p(final String p0);
    
    void q(final String p0, final sl6 p1) throws CacheException;
    
    NavigableSet<q73> r(final String p0, final a p1);
    
    public static class CacheException extends IOException
    {
        public CacheException(final String s) {
            super(s);
        }
        
        public CacheException(final String s, final Throwable t) {
            super(s, t);
        }
        
        public CacheException(final Throwable t) {
            super(t);
        }
    }
    
    public interface a
    {
        void a(final Cache p0, final q73 p1, final q73 p2);
        
        void c(final Cache p0, final q73 p1);
        
        void f(final Cache p0, final q73 p1);
    }
}
