import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class upk
{
    public static final rlp<upk> c;
    public final List<String> a;
    public String b;
    
    static {
        upk.c = new upk.upk$a();
    }
    
    public upk() {
        this(new ArrayList<String>(Arrays.asList("", "")), null);
    }
    
    public upk(final List<String> a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        final Iterator<String> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
