import java.util.Locale;
import java.util.Objects;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ln8 extends csc
{
    public final List<csc> b;
    
    public ln8() {
        super((dsc)null);
        this.b = (luh$a)luh.a(2);
    }
    
    public final void a() {
        final Iterator<Object> iterator = ((List<Object>)this.b).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public final asc b(final asc$b asc$b, final URI uri, final lsc lsc) {
        final Iterator<Object> iterator = ((List<Object>)this.b).iterator();
        if (iterator.hasNext()) {
            final csc csc = iterator.next();
            Objects.requireNonNull(csc);
            return csc.b(asc$b, uri, lsc);
        }
        throw new IllegalStateException(String.format(Locale.US, "No HttpOperationClients capable of handling a %s to %s", asc$b, uri));
    }
    
    public final void c(final String s) {
        final Iterator<Object> iterator = ((List<Object>)this.b).iterator();
        while (iterator.hasNext()) {
            iterator.next().c(s);
        }
    }
}
