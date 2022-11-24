// 
// Decompiled by Procyon v0.6.0
// 

public final class n5e implements nuk
{
    public final int c;
    
    public n5e(final int c) {
        this.c = c;
    }
    
    public final boolean apply(final Object o) {
        final int c = this.c;
        final Integer n = (Integer)o;
        return n >= 0 && n < c;
    }
}
