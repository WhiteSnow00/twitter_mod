// 
// Decompiled by Procyon v0.6.0
// 

public final class aoj
{
    public final String a;
    public final String b;
    public final String c;
    
    public aoj(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aoj)) {
            return false;
        }
        final aoj aoj = (aoj)o;
        return e0e.a((Object)this.a, (Object)aoj.a) && e0e.a((Object)this.b, (Object)aoj.b) && e0e.a((Object)this.c, (Object)aoj.c);
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
        return m51.y(l58.k("OpenseaNFTTrait(displayType=", this.a, ", traitType=", this.b, ", value="), this.c, ")");
    }
}
