import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fow
{
    public final int a;
    public final String b;
    public final List<pn6> c;
    
    public fow(final int a, final String b, final List<pn6> c) {
        czd.f((Object)b, "reason");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fow)) {
            return false;
        }
        final fow fow = (fow)o;
        return this.a == fow.a && czd.a((Object)this.b, (Object)fow.b) && czd.a((Object)this.c, (Object)fow.c);
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a * 31, 31);
        final List<pn6> c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return f + hashCode;
    }
    
    @Override
    public final String toString() {
        return e1.z(fu8.k("ValidationError(code=", this.a, ", reason=", this.b, ", contextMap="), (List)this.c, ")");
    }
}
