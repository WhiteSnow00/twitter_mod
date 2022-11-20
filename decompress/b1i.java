// 
// Decompiled by Procyon v0.6.0
// 

public final class b1i implements jbx
{
    public final String a;
    public final String b;
    
    public b1i() {
        this.a = null;
        this.b = null;
    }
    
    public b1i(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public b1i(final String s, final String s2, final int n, final rf8 rf8) {
        this.a = null;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b1i)) {
            return false;
        }
        final b1i b1i = (b1i)o;
        return czd.a((Object)this.a, (Object)b1i.a) && czd.a((Object)this.b, (Object)b1i.b);
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
        return zh8.o("NFTCollectionViewState(name=", this.a, ", address=", this.b, ")");
    }
}
