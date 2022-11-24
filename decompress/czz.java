import java.lang.annotation.Annotation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czz implements k100
{
    public final int b;
    public final z000 c;
    
    public czz(final int b, final z000 c) {
        this.b = b;
        this.c = c;
    }
    
    public final Class<? extends Annotation> annotationType() {
        return (Class<? extends Annotation>)k100.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k100)) {
            return false;
        }
        final k100 k100 = (k100)o;
        return this.b == ((czz)k100).b && this.c.equals(((czz)k100).c);
    }
    
    @Override
    public final int hashCode() {
        return (this.b ^ 0xDE0D66) + (this.c.hashCode() ^ 0x79AD669E);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("@com.google.firebase.encoders.proto.Protobuf", "(tag=");
        j.append(this.b);
        j.append("intEncoding=");
        j.append(this.c);
        j.append(')');
        return j.toString();
    }
}
