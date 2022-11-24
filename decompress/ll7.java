// 
// Decompiled by Procyon v0.6.0
// 

public final class ll7 implements kl7
{
    public final ql7 a;
    public final long b;
    
    public ll7(final ql7 a, final long b) {
        e0e.f((Object)a, "labelType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ll7)) {
            return false;
        }
        final ll7 ll7 = (ll7)o;
        return this.a == ll7.a && this.b == ll7.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return hashCode * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final ql7 a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMConversationLabelResultInfo(labelType=");
        sb.append(a);
        sb.append(", createdAt=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
