import java.io.IOException;
import com.bluelinelabs.logansquare.LoganSquare;
import com.bluelinelabs.logansquare.JsonMapper;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wih implements TypeConverter<Object>
{
    public JsonMapper<tih<Object>> a;
    public final Class b;
    public final gra c;
    
    public wih(final Class b, final gra c) {
        this.b = b;
        this.c = c;
    }
    
    public final Object parse(final qhe qhe) throws IOException {
        if (this.a == null) {
            this.a = (JsonMapper<tih<Object>>)LoganSquare.mapperFor(this.b);
        }
        return yih.b(this.a.parse(qhe));
    }
    
    public final void serialize(final Object o, final String s, final boolean b, final yfe yfe) throws IOException {
        if (this.c != null) {
            if (this.a == null) {
                this.a = (JsonMapper<tih<Object>>)LoganSquare.mapperFor(this.b);
            }
            if (b) {
                yfe.i(s);
            }
            this.a.serialize((Object)this.c.a(o), yfe, true);
            return;
        }
        throw new UnsupportedOperationException("This type converter does not support serialization.");
    }
}
