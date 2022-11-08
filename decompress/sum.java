import java.util.Objects;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sum extends foj<Comparable<?>> implements Serializable
{
    public static final sum C0;
    
    static {
        C0 = new sum();
    }
    
    @Override
    public final <S extends Comparable<?>> foj<S> b() {
        return (foj<S>)x9i.C0;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final Comparable comparable = (Comparable)o;
        final Comparable comparable2 = (Comparable)o2;
        Objects.requireNonNull(comparable);
        int compareTo;
        if (comparable == comparable2) {
            compareTo = 0;
        }
        else {
            compareTo = comparable2.compareTo(comparable);
        }
        return compareTo;
    }
    
    @Override
    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
