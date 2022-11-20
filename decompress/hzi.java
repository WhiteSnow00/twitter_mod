import j$.util.function.Predicate$_CC;
import j$.util.function.Predicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzi implements Predicate
{
    public final boolean a;
    public final adw b;
    
    public hzi(final boolean a, final adw b) {
        this.a = a;
        this.b = b;
    }
    
    public final Predicate and(final Predicate predicate) {
        return Predicate$_CC.$default$and((Predicate)this, predicate);
    }
    
    public final Predicate negate() {
        return Predicate$_CC.$default$negate((Predicate)this);
    }
    
    public final Predicate or(final Predicate predicate) {
        return Predicate$_CC.$default$or((Predicate)this, predicate);
    }
    
    public final boolean test(final Object o) {
        final boolean a = this.a;
        final adw b = this.b;
        final jsj jsj = (jsj)o;
        return (a && nri.b(b.k())) || jsj.d != 6;
    }
}
