import java.util.Locale;
import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x5g implements w5g
{
    public final LocaleList a;
    
    public x5g(final Object o) {
        this.a = (LocaleList)o;
    }
    
    @Override
    public final Object a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals(((w5g)o).a());
    }
    
    @Override
    public final Locale get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
