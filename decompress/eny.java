import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eny extends cqy
{
    public eny(final Iterator iterator) {
        super(iterator, 0);
    }
    
    public final /* bridge */ Object b(final Object o) {
        return ((Map.Entry)o).getValue();
    }
}
