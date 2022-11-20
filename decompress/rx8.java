// 
// Decompiled by Procyon v0.6.0
// 

public final class rx8
{
    public final String a;
    public final boolean b;
    
    public rx8(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rx8)) {
            return false;
        }
        final rx8 rx8 = (rx8)o;
        return czd.a((Object)this.a, (Object)rx8.a) && this.b == rx8.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        return neg.h("DirectionalStringElement(content=", this.a, ", is_rtl=", this.b, ")");
    }
}
