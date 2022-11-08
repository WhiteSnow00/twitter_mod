import androidx.lifecycle.LiveData;

// 
// Decompiled by Procyon v0.6.0
// 

public class sth<T> extends LiveData<T>
{
    @Override
    public final void i(final T t) {
        super.i(t);
    }
    
    @Override
    public void k(final T e) {
        LiveData.a("setValue");
        ++super.g;
        super.e = e;
        this.c(null);
    }
}
