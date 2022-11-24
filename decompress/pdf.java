// 
// Decompiled by Procyon v0.6.0
// 

public final class pdf
{
    public final int a;
    
    public pdf(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof pdf;
        boolean b2 = false;
        if (b) {
            if (a == ((pdf)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("LineIndex(value=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
