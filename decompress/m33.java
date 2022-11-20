// 
// Decompiled by Procyon v0.6.0
// 

public final class m33
{
    public final String a;
    public final String b;
    
    public m33(final String a, final String b) {
        czd.f((Object)a, "expandedUrl");
        czd.f((Object)b, "displayUrl");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m33)) {
            return false;
        }
        final m33 m33 = (m33)o;
        return czd.a((Object)this.a, (Object)m33.a) && czd.a((Object)this.b, (Object)m33.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return zh8.o("BusinessWebsiteInput(expandedUrl=", this.a, ", displayUrl=", this.b, ")");
    }
}
