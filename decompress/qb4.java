import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.lang.ref.ReferenceQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qb4
{
    public final ReferenceQueue<Object> a;
    public final Set<rsy> b;
    
    public qb4() {
        this.a = new ReferenceQueue<Object>();
        this.b = Collections.synchronizedSet(new HashSet<rsy>());
    }
}
