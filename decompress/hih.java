import java.io.IOException;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hih extends ywj<Object>
{
    public final TypeConverter a;
    
    public hih(final TypeConverter a) {
        this.a = a;
    }
    
    public final Object parse(final tge tge) throws IOException {
        final n4j n4j = (n4j)this.a.parse(tge);
        Object j;
        if (n4j != null) {
            j = n4j.j();
        }
        else {
            j = null;
        }
        return j;
    }
}
