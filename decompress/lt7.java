// 
// Decompiled by Procyon v0.6.0
// 

public final class lt7
{
    public static final a Companion;
    public final String a;
    public final int b;
    
    static {
        Companion = new a();
    }
    
    public lt7(final String a, final int b) {
        czd.f((Object)a, "key");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lt7)) {
            return false;
        }
        final lt7 lt7 = (lt7)o;
        return czd.a((Object)this.a, (Object)lt7.a) && this.b == lt7.b;
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
