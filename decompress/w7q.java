// 
// Decompiled by Procyon v0.6.0
// 

public final class w7q
{
    public final String a;
    public final String b;
    
    public w7q(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w7q)) {
            return false;
        }
        final w7q w7q = (w7q)o;
        return czd.a((Object)this.a, (Object)w7q.a) && czd.a((Object)this.b, (Object)w7q.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return zh8.o("SignatureResult(signature=", this.a, ", address=", this.b, ")");
    }
}
