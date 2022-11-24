// 
// Decompiled by Procyon v0.6.0
// 

public final class omj
{
    public final String a;
    public final Integer b;
    public final boolean c;
    
    public omj(final String a, final Integer b, final boolean c) {
        e0e.f((Object)a, "text");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof omj)) {
            return false;
        }
        final omj omj = (omj)o;
        return e0e.a((Object)this.a, (Object)omj.a) && e0e.a((Object)this.b, (Object)omj.b) && this.c == omj.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final Integer b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("OpenClosedTextComponent(text=");
        sb.append(a);
        sb.append(", color=");
        sb.append(b);
        sb.append(", isBold=");
        return xj0.B(sb, c, ")");
    }
}
