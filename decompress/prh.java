import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class prh implements psr
{
    public final List<m87> C0;
    
    public prh(final List<m87> list) {
        this.C0 = Collections.unmodifiableList((List<? extends m87>)list);
    }
    
    @Override
    public final int b(final long n) {
        int n2;
        if (n < 0L) {
            n2 = 0;
        }
        else {
            n2 = -1;
        }
        return n2;
    }
    
    @Override
    public final List<m87> e(final long n) {
        Object o;
        if (n >= 0L) {
            o = this.C0;
        }
        else {
            o = Collections.emptyList();
        }
        return (List<m87>)o;
    }
    
    @Override
    public final long f(final int n) {
        ri4.k(n == 0);
        return 0L;
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
