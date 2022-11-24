import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsh implements fur
{
    public final List<v87> F0;
    
    public jsh(final List<v87> list) {
        this.F0 = Collections.unmodifiableList((List<? extends v87>)list);
    }
    
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
    
    public final List<v87> e(final long n) {
        Object o;
        if (n >= 0L) {
            o = this.F0;
        }
        else {
            o = Collections.emptyList();
        }
        return (List<v87>)o;
    }
    
    public final long f(final int n) {
        omi.m(n == 0);
        return 0L;
    }
    
    public final int g() {
        return 1;
    }
}
