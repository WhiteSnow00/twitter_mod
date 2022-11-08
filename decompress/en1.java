import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class en1 implements org
{
    public final long b;
    public final long c;
    public long d;
    
    public en1(final long c) {
        this.b = 0L;
        this.c = c;
        this.d = -1L;
    }
    
    public final void c() {
        final long d = this.d;
        if (d >= this.b && d <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }
    
    public final boolean next() {
        final long d = this.d + 1L;
        this.d = d;
        return d > this.c ^ true;
    }
}
