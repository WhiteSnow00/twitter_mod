// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import android.net.Uri;

public interface HlsPlaylistTracker
{
    void b(final a p0);
    
    void c(final Uri p0) throws IOException;
    
    long d();
    
    d f();
    
    void g(final Uri p0);
    
    void h(final a p0);
    
    boolean j(final Uri p0);
    
    boolean k();
    
    boolean l(final Uri p0, final long p1);
    
    void m(final Uri p0, final j.a p1, final b p2);
    
    void n() throws IOException;
    
    c o(final Uri p0, final boolean p1);
    
    void stop();
    
    public interface a
    {
        void a();
        
        boolean b(final Uri p0, final h.c p1, final boolean p2);
    }
    
    public interface b
    {
    }
}
