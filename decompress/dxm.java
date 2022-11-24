// 
// Decompiled by Procyon v0.6.0
// 

public final class dxm
{
    public final String a;
    public final xor b;
    
    public dxm(final String a, final xor b) {
        e0e.f((Object)a, "revueAccountId");
        e0e.f((Object)b, "subscriptionStatus");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dxm)) {
            return false;
        }
        final dxm dxm = (dxm)o;
        return e0e.a((Object)this.a, (Object)dxm.a) && e0e.a((Object)this.b, (Object)dxm.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final xor b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("RevueSubscribeResult(revueAccountId=");
        sb.append(a);
        sb.append(", subscriptionStatus=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
