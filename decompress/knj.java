// 
// Decompiled by Procyon v0.6.0
// 

public final class knj
{
    public final String a;
    public final String b;
    public final String c;
    
    public knj(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof knj)) {
            return false;
        }
        final knj knj = (knj)o;
        return czd.a((Object)this.a, (Object)knj.a) && czd.a((Object)this.b, (Object)knj.b) && czd.a((Object)this.c, (Object)knj.c);
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
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return ed.B(tqf.q("OpenseaNFTTrait(displayType=", this.a, ", traitType=", this.b, ", value="), this.c, ")");
    }
}
