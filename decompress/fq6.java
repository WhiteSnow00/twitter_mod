// 
// Decompiled by Procyon v0.6.0
// 

public final class fq6
{
    public static final a Companion;
    public static final rlp<fq6> c;
    public final String a;
    public final spv b;
    
    static {
        Companion = new a();
        fq6.c = gq6.b;
    }
    
    public fq6(final String a, final spv b) {
        czd.f((Object)b, "icon");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fq6)) {
            return false;
        }
        final fq6 fq6 = (fq6)o;
        return czd.a((Object)this.a, (Object)fq6.a) && this.b == fq6.b;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final spv b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ConversationContext(description=");
        sb.append(a);
        sb.append(", icon=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
