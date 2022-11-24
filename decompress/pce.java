import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pce
{
    public final String a;
    
    public pce(final String a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public static pce c() {
        return new pce(String.valueOf(','));
    }
    
    public final <A extends Appendable> A a(final A a, final Iterator<?> iterator) throws IOException {
        if (iterator.hasNext()) {
            final CharSequence next = iterator.next();
            Objects.requireNonNull(next);
            CharSequence string;
            if (next instanceof CharSequence) {
                string = next;
            }
            else {
                string = next.toString();
            }
            a.append(string);
            while (iterator.hasNext()) {
                a.append(this.a);
                final CharSequence next2 = iterator.next();
                Objects.requireNonNull(next2);
                CharSequence string2;
                if (next2 instanceof CharSequence) {
                    string2 = next2;
                }
                else {
                    string2 = next2.toString();
                }
                a.append(string2);
            }
        }
        return a;
    }
    
    public final StringBuilder b(final StringBuilder sb, final Iterable<?> iterable) {
        final Iterator<?> iterator = iterable.iterator();
        try {
            this.a(sb, iterator);
            return sb;
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
