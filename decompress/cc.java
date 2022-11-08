import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cc<T> extends ozv<T>
{
    public int C0;
    public T D0;
    
    public cc() {
        this.C0 = 2;
    }
    
    public abstract T a();
    
    public final boolean hasNext() {
        final int c0 = this.C0;
        final boolean b = false;
        if (c0 == 4) {
            throw new IllegalStateException();
        }
        final int d = nb0.D(c0);
        if (d != 0) {
            boolean b2 = b;
            if (d != 2) {
                this.C0 = 4;
                this.D0 = this.a();
                b2 = b;
                if (this.C0 != 3) {
                    this.C0 = 1;
                    b2 = true;
                }
            }
            return b2;
        }
        return true;
    }
    
    public final T next() {
        if (this.hasNext()) {
            this.C0 = 2;
            final T d0 = this.D0;
            this.D0 = null;
            return d0;
        }
        throw new NoSuchElementException();
    }
}
