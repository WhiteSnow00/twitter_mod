import java.util.Iterator;
import java.io.IOException;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class p4e<T> implements Closeable, Iterable<T>
{
    public boolean F0;
    
    public static <T> p4e<T> j() {
        final p4e$a p4e$a = new p4e$a();
        final int a = o5j.a;
        return (p4e<T>)p4e$a;
    }
    
    @Override
    public final void close() throws IOException {
        this.i();
        this.F0 = true;
    }
    
    public abstract int getSize();
    
    public abstract void i() throws IOException;
    
    public final boolean isEmpty() {
        return this.getSize() == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return (Iterator<T>)new p4e$b(this);
    }
    
    public abstract T m(final int p0);
}
