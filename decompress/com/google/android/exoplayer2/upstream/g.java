// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.io.IOException;

public final class g implements a
{
    public static final g a;
    
    static {
        a = new g();
        final i71 n0 = i71.N0;
    }
    
    public final long a(final b b) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }
    
    public final int b(final byte[] array, final int n, final int n2) {
        throw new UnsupportedOperationException();
    }
    
    public final void close() {
    }
    
    public final Map d() {
        return Collections.emptyMap();
    }
    
    public final void g(final zxt zxt) {
    }
    
    public final Uri m() {
        return null;
    }
}
