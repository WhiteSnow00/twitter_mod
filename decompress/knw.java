import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knw
{
    public final int a;
    public final String b;
    public final List<jo6> c;
    
    public knw(final int a, final String b, final List<jo6> c) {
        zzd.f((Object)b, "reason");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof knw)) {
            return false;
        }
        final knw knw = (knw)o;
        return this.a == knw.a && zzd.a((Object)this.b, (Object)knw.b) && zzd.a((Object)this.c, (Object)knw.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a * 31, 31);
        final List<jo6> c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public final String toString() {
        return gp.A(t4a.k("ValidationError(code=", this.a, ", reason=", this.b, ", contextMap="), (List)this.c, ")");
    }
}
