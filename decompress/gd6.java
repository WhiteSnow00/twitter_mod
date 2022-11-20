import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gd6 implements uaq<String, how>
{
    public final ick D0;
    public final c0a E0;
    public z7q F0;
    
    public gd6(final ick d0, final c0a e0) {
        this.F0 = z7q.E0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final sog E(final qsb qsb) {
        return gw8.c((uaq)this, qsb);
    }
    
    public final eaq R(final Object o) {
        final String s = (String)o;
        final z7q f0 = this.F0;
        eaq eaq;
        if (f0 == z7q.E0) {
            eaq = this.D0.a(s);
        }
        else if (f0 == z7q.F0) {
            eaq = this.E0.a(s);
        }
        else if (b0k.e.matcher(s).matches()) {
            eaq = this.D0.a(s);
        }
        else {
            eaq = this.E0.a(s);
        }
        return eaq;
    }
    
    public final void close() {
        h1e.a((Closeable)this.D0);
        h1e.a((Closeable)this.E0);
    }
    
    public final sog m1(final r8x r8x) {
        return gw8.d((uaq)this, r8x);
    }
    
    public final uaq n(final p4s p4s) {
        return gw8.l((uaq)this, p4s);
    }
    
    public final uaq o(final qsb qsb) {
        return gw8.h((uaq)this, qsb);
    }
    
    public final l6j x0(final l6j l6j, final vw0 vw0) {
        return gw8.i((uaq)this, l6j, vw0);
    }
}
