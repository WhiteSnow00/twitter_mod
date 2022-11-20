import java.util.Map;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class raz implements Comparator
{
    public static final raz D0;
    
    static {
        D0 = new raz();
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        return ((Map.Entry)o).getValue().compareTo(((Map.Entry)o2).getValue());
    }
}
