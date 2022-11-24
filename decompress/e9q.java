import android.net.Uri;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e9q implements z73
{
    public final String a;
    public final boolean b;
    
    public e9q(final String a) {
        Objects.requireNonNull(a);
        this.a = a;
        this.b = false;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final boolean b(final Uri uri) {
        return this.a.contains(uri.toString());
    }
    
    public final boolean c() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof e9q && this.a.equals(((e9q)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
