import j$.util.function.Predicate$_CC;
import j$.util.function.Predicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vzi implements Predicate
{
    public static final vzi a;
    
    static {
        a = new vzi();
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
        return ((ysj)o).d == 6;
    }
}
