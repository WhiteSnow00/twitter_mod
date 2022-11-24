import android.content.res.Resources$Theme;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s9d
{
    public final HashMap<b, WeakReference<a>> a;
    
    public s9d() {
        this.a = new HashMap<b, WeakReference<a>>();
    }
    
    public static final class a
    {
        public final r9d a;
        public final int b;
        
        public a(final r9d a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e0e.a((Object)this.a, (Object)a.a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("ImageVectorEntry(imageVector=");
            f.append(this.a);
            f.append(", configFlags=");
            return gwl.x(f, this.b, ')');
        }
    }
    
    public static final class b
    {
        public final Resources$Theme a;
        public final int b;
        
        public b(final Resources$Theme a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return e0e.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("Key(theme=");
            f.append(this.a);
            f.append(", id=");
            return gwl.x(f, this.b, ')');
        }
    }
}
