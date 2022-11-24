import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxa
{
    public final String a;
    public final Map<Class<?>, Object> b;
    
    public lxa(final String a, final Map<Class<?>, Object> b) {
        this.a = a;
        this.b = b;
    }
    
    public lxa(final String a, final Map b, final lxa$a object) {
        this.a = a;
        this.b = b;
    }
    
    public static lxa b(final String s) {
        return new lxa(s, Collections.emptyMap());
    }
    
    public final <T extends Annotation> T a(final Class<T> clazz) {
        return (T)this.b.get(clazz);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof lxa)) {
            return false;
        }
        final lxa lxa = (lxa)o;
        if (!this.a.equals(lxa.a) || !this.b.equals(lxa.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("FieldDescriptor{name=");
        f.append(this.a);
        f.append(", properties=");
        f.append(this.b.values());
        f.append("}");
        return f.toString();
    }
}
