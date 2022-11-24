import java.lang.annotation.Annotation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cry implements zry
{
    public final int b;
    public final vry c;
    
    public cry(final int b, final vry c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Class<? extends Annotation> annotationType() {
        return zry.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zry)) {
            return false;
        }
        final zry zry = (zry)o;
        return this.b == ((cry)zry).b && this.c.equals(((cry)zry).c);
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
