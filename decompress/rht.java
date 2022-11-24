import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rht implements tgt
{
    public final Set<Integer> a;
    
    public rht(final Set<Integer> a) {
        this.a = a;
    }
    
    public final void a(final int n) {
        if (this.a.contains(n)) {
            this.a.remove(n);
        }
        else {
            this.a.add(n);
        }
    }
}
