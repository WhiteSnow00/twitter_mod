// 
// Decompiled by Procyon v0.6.0
// 

public final class ou7
{
    public static final a Companion;
    public final String a;
    public final int b;
    
    static {
        Companion = new a();
    }
    
    public ou7(final String a, final int b) {
        e0e.f((Object)a, "key");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ou7)) {
            return false;
        }
        final ou7 ou7 = (ou7)o;
        return e0e.a((Object)this.a, (Object)ou7.a) && this.b == ou7.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMReaction(key=");
        sb.append(a);
        sb.append(", count=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
