import j$.util.function.Predicate$_CC;
import j$.util.function.Predicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zod implements Predicate
{
    public final int a;
    public final Object b;
    
    public zod(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Predicate and(final Predicate predicate) {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$and((Predicate)this, predicate);
            }
            case 0: {
                return Predicate$_CC.$default$and((Predicate)this, predicate);
            }
        }
    }
    
    public final Predicate negate() {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$negate((Predicate)this);
            }
            case 0: {
                return Predicate$_CC.$default$negate((Predicate)this);
            }
        }
    }
    
    public final Predicate or(final Predicate predicate) {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$or((Predicate)this, predicate);
            }
            case 0: {
                return Predicate$_CC.$default$or((Predicate)this, predicate);
            }
        }
    }
    
    public final boolean test(final Object o) {
        switch (this.a) {
            default: {
                final qsb qsb = (qsb)this.b;
                czd.f((Object)qsb, "$tmp0");
                return (boolean)qsb.invoke(o);
            }
            case 0: {
                return ((cua)o).g.contains(this.b);
            }
        }
    }
}
