import java.lang.annotation.Annotation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyz implements k000
{
    public final int b;
    public final zzz c;
    
    public dyz(final int b, final zzz c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Class<? extends Annotation> annotationType() {
        return k000.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k000)) {
            return false;
        }
        final k000 k000 = (k000)o;
        return this.b == ((dyz)k000).b && this.c.equals(((dyz)k000).c);
    }
    
    @Override
    public final int hashCode() {
        return (this.b ^ 0xDE0D66) + (this.c.hashCode() ^ 0x79AD669E);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = shc.g("@com.google.firebase.encoders.proto.Protobuf", "(tag=");
        g.append(this.b);
        g.append("intEncoding=");
        g.append(this.c);
        g.append(')');
        return g.toString();
    }
}
