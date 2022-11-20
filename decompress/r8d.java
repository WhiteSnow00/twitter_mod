import android.content.res.Resources$Theme;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r8d
{
    public final HashMap<b, WeakReference<a>> a;
    
    public r8d() {
        this.a = new HashMap<b, WeakReference<a>>();
    }
    
    public static final class a
    {
        public final q8d a;
        public final int b;
        
        public a(final q8d a, final int b) {
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
            return czd.a((Object)this.a, (Object)a.a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder j = fu8.j("ImageVectorEntry(imageVector=");
            j.append(this.a);
            j.append(", configFlags=");
            return x70.C(j, this.b, ')');
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
            return czd.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder j = fu8.j("Key(theme=");
            j.append(this.a);
            j.append(", id=");
            return x70.C(j, this.b, ')');
        }
    }
}
