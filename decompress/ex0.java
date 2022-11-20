import java.util.Objects;
import java.lang.annotation.Annotation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ex0 implements tll
{
    public final int b;
    
    public ex0(final int b) {
        this.b = b;
    }
    
    public final Class<? extends Annotation> annotationType() {
        return (Class<? extends Annotation>)tll.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof tll)) {
            return false;
        }
        final tll tll = (tll)o;
        final int b2 = this.b;
        final ex0 ex0 = (ex0)tll;
        if (b2 == ex0.b) {
            final tll$a d0 = tll$a.D0;
            Objects.requireNonNull(ex0);
            if (d0.equals(d0)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final int hashCode() {
        return (this.b ^ 0xDE0D66) + (tll$a.D0.hashCode() ^ 0x79AD669E);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
        sb.append('(');
        sb.append("tag=");
        sb.append(this.b);
        sb.append("intEncoding=");
        sb.append(tll$a.D0);
        sb.append(')');
        return sb.toString();
    }
}
