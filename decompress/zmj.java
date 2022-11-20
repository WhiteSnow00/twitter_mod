// 
// Decompiled by Procyon v0.6.0
// 

public final class zmj
{
    public final String a;
    public final String b;
    
    public zmj() {
        this(null, null);
    }
    
    public zmj(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zmj)) {
            return false;
        }
        final zmj zmj = (zmj)o;
        return czd.a((Object)this.a, (Object)zmj.a) && czd.a((Object)this.b, (Object)zmj.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return zh8.o("OpenbackDate(start=", this.a, ", end=", this.b, ")");
    }
}
