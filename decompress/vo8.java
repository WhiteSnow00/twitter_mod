// 
// Decompiled by Procyon v0.6.0
// 

public final class vo8 implements hr9
{
    public final int a;
    public final int b;
    
    public vo8(final int a, final int b) {
        this.a = a;
        this.b = b;
        if (a >= 0 && b >= 0) {
            return;
        }
        throw new IllegalArgumentException(k1b.f("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", a, " and ", b, " respectively.").toString());
    }
    
    @Override
    public final void a(final ix9 ix9) {
        zzd.f((Object)ix9, "buffer");
        final int a = this.a;
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= a) {
                break;
            }
            final int n4 = n2 + 1;
            final int b = ix9.b;
            if (b > (n2 = n4)) {
                final char c = ix9.c(b - n4 - 1);
                final char c2 = ix9.c(ix9.b - n4);
                final boolean b2 = Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
                n2 = n4;
                if (b2) {
                    n2 = n4 + 1;
                }
            }
            if ((n3 = n2) == ix9.b) {
                break;
            }
            ++n;
        }
        final int b3 = this.b;
        int n5 = 0;
        int n6 = 0;
        int n7;
        while (true) {
            n7 = n6;
            if (n5 >= b3) {
                break;
            }
            final int n8 = ++n6;
            if (ix9.c + n8 < ix9.e()) {
                final char c3 = ix9.c(ix9.c + n8 - 1);
                final char c4 = ix9.c(ix9.c + n8);
                final boolean b4 = Character.isHighSurrogate(c3) && Character.isLowSurrogate(c4);
                n6 = n8;
                if (b4) {
                    n6 = n8 + 1;
                }
            }
            n7 = n6;
            if (ix9.c + n6 == ix9.e()) {
                break;
            }
            ++n5;
        }
        final int c5 = ix9.c;
        ix9.b(c5, n7 + c5);
        final int b5 = ix9.b;
        ix9.b(b5 - n3, b5);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vo8)) {
            return false;
        }
        final int a = this.a;
        final vo8 vo8 = (vo8)o;
        return a == vo8.a && this.b == vo8.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        g.append(this.a);
        g.append(", lengthAfterCursor=");
        return y70.y(g, this.b, ')');
    }
}
