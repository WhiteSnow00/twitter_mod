// 
// Decompiled by Procyon v0.6.0
// 

public final class bko implements seb
{
    public final float a;
    public final float b;
    public final long c;
    
    public bko(final float a, final float b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof bko;
        boolean b2 = true;
        if (b) {
            final bko bko = (bko)o;
            if (bko.a == this.a && bko.b == this.b && bko.c == this.c) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final int h = c0.h(this.b, c0.h(this.a, 0, 31), 31);
        final long c = this.c;
        return h + (int)(c ^ c >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("RotaryScrollEvent(verticalScrollPixels=");
        g.append(this.a);
        g.append(",horizontalScrollPixels=");
        g.append(this.b);
        g.append(",uptimeMillis=");
        g.append(this.c);
        g.append(')');
        return g.toString();
    }
}
