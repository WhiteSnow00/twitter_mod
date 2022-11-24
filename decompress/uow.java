import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uow
{
    public final int a;
    public final String b;
    public final List<vo6> c;
    
    public uow(final int a, final String b, final List<vo6> c) {
        e0e.f((Object)b, "reason");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uow)) {
            return false;
        }
        final uow uow = (uow)o;
        return this.a == uow.a && e0e.a((Object)this.b, (Object)uow.b) && e0e.a((Object)this.c, (Object)uow.c);
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a * 31, 31);
        final List<vo6> c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return d + hashCode;
    }
    
    @Override
    public final String toString() {
        return ad.A(awg.f("ValidationError(code=", this.a, ", reason=", this.b, ", contextMap="), this.c, ")");
    }
}
