import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sa<T> implements xr0<T>
{
    public final T a;
    public final List<T> b;
    public T c;
    
    public sa(final T t) {
        this.a = t;
        this.b = new ArrayList();
        this.c = t;
    }
    
    public abstract void a();
    
    @Override
    public final T b() {
        return this.c;
    }
    
    @Override
    public final void clear() {
        this.b.clear();
        this.c = this.a;
        this.a();
    }
    
    @Override
    public final void h(final T c) {
        this.b.add(this.c);
        this.c = c;
    }
    
    @Override
    public final void j() {
        if (this.b.isEmpty() ^ true) {
            final ArrayList b = this.b;
            this.c = (T)b.remove(b.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
