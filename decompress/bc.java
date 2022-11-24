import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bc<T> extends v0w<T>
{
    public int F0;
    public T G0;
    
    public bc() {
        this.F0 = 2;
    }
    
    public abstract T a();
    
    @Override
    public final boolean hasNext() {
        final int f0 = this.F0;
        final boolean b = false;
        if (f0 == 4) {
            throw new IllegalStateException();
        }
        final int g = lb0.G(f0);
        if (g != 0) {
            boolean b2 = b;
            if (g != 2) {
                this.F0 = 4;
                this.G0 = this.a();
                b2 = b;
                if (this.F0 != 3) {
                    this.F0 = 1;
                    b2 = true;
                }
            }
            return b2;
        }
        return true;
    }
    
    @Override
    public final T next() {
        if (this.hasNext()) {
            this.F0 = 2;
            final T g0 = this.G0;
            this.G0 = null;
            return g0;
        }
        throw new NoSuchElementException();
    }
}
