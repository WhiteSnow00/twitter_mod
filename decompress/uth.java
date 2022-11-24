import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uth<V> implements wzr<List<V>>, Serializable
{
    public final int F0;
    
    public uth(final int f0) {
        iuk.y(f0, "expectedValuesPerKey");
        this.F0 = f0;
    }
    
    public final Object get() {
        return new ArrayList(this.F0);
    }
}
