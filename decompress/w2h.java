import j$.util.function.Predicate$_CC;
import j$.util.function.Predicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w2h implements Predicate
{
    public static final w2h b;
    public static final w2h c;
    public final int a;
    
    static {
        b = new w2h(0);
        c = new w2h(1);
    }
    
    public w2h(final int a) {
        this.a = a;
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
        final int a = this.a;
        final boolean b = false;
        boolean b2 = false;
        switch (a) {
            default: {
                boolean b3 = b;
                if (((ysj)o).d != 6) {
                    b3 = true;
                }
                return b3;
            }
            case 0: {
                if (((zwv)o).getName() == mba.W0) {
                    b2 = true;
                }
                return b2;
            }
        }
    }
}
