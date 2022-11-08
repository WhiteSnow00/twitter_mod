import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class foj<T> implements Comparator<T>
{
    public static <T> foj<T> a(final Comparator<T> comparator) {
        Object o;
        if (comparator instanceof foj) {
            o = comparator;
        }
        else {
            o = new zy5((Comparator)comparator);
        }
        return (foj<T>)o;
    }
    
    public <S extends T> foj<S> b() {
        return (foj<S>)new uum(this);
    }
    
    @Override
    public abstract int compare(final T p0, final T p1);
}
