import java.util.Iterator;
import java.io.IOException;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class i4e<T> implements Closeable, Iterable<T>
{
    public boolean C0;
    
    public static <T> i4e<T> j() {
        final i4e$a i4e$a = new i4e$a();
        final int a = w4j.a;
        return (i4e<T>)i4e$a;
    }
    
    @Override
    public final void close() throws IOException {
        this.i();
        this.C0 = true;
    }
    
    public abstract int getSize();
    
    public abstract void i() throws IOException;
    
    public final boolean isEmpty() {
        return this.getSize() == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return (Iterator<T>)new i4e$b(this);
    }
    
    public abstract T m(final int p0);
}
