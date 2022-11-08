import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v63
{
    public final int a;
    public final int b;
    
    public v63(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof v63)) {
            return false;
        }
        final v63 v63 = (v63)o;
        if (this.a != v63.a || this.b != v63.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return (this.a + 31) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        String string = "";
        String string2;
        if (a == Integer.MAX_VALUE) {
            string2 = "";
        }
        else {
            string2 = Integer.toString(a);
        }
        final int b = this.b;
        if (b != Integer.MAX_VALUE) {
            string = Integer.toString(b);
        }
        return String.format(null, "%s-%s", string2, string);
    }
}
