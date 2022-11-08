import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class skg extends toy
{
    public skg(final Iterator iterator) {
        super(iterator, 1);
    }
    
    @Override
    public final Object a(final Object o) {
        return ((Map.Entry)o).getValue();
    }
}
