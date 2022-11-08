// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class d extends h
{
    public final /* synthetic */ h a;
    public final /* synthetic */ ThreadPoolExecutor b;
    
    public d(final h a, final ThreadPoolExecutor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        try {
            this.a.a(t);
        }
        finally {
            this.b.shutdown();
        }
    }
    
    @Override
    public final void b(final androidx.emoji2.text.h h) {
        try {
            this.a.b(h);
        }
        finally {
            this.b.shutdown();
        }
    }
}
