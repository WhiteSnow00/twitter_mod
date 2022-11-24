import java.util.EnumSet;
import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gk6 implements a5j<Object>
{
    public final Type F0;
    
    public gk6(final Type f0) {
        this.F0 = f0;
    }
    
    public final Object l() {
        final Type f0 = this.F0;
        if (!(f0 instanceof ParameterizedType)) {
            final StringBuilder f2 = ehk.f("Invalid EnumSet type: ");
            f2.append(this.F0.toString());
            throw new JsonIOException(f2.toString());
        }
        final Type type = ((ParameterizedType)f0).getActualTypeArguments()[0];
        if (type instanceof Class) {
            return EnumSet.noneOf((Class<Enum>)type);
        }
        final StringBuilder f3 = ehk.f("Invalid EnumSet type: ");
        f3.append(this.F0.toString());
        throw new JsonIOException(f3.toString());
    }
}
