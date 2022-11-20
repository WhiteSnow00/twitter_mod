import android.os.LocaleList;
import android.os.Build$VERSION;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y4g
{
    public static final int b = 0;
    public final b5g a;
    
    static {
        a(new Locale[0]);
    }
    
    public y4g(final b5g a) {
        this.a = a;
    }
    
    public static y4g a(final Locale... array) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new y4g((b5g)new c5g((Object)a.a(array)));
        }
        return new y4g((b5g)new z4g(array));
    }
    
    public final Locale b(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof y4g && this.a.equals(((y4g)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public static final class a
    {
        public static LocaleList a(final Locale... array) {
            return new LocaleList(array);
        }
        
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }
        
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }
}
