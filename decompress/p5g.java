import java.util.Locale;
import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p5g implements o5g
{
    public final LocaleList a;
    
    public p5g(final Object o) {
        this.a = (LocaleList)o;
    }
    
    public final Object a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals(((o5g)o).a());
    }
    
    public final Locale get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
