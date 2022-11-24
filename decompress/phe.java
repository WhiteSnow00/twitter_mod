import java.io.IOException;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phe implements TypeConverter<String>
{
    public final void a(final String s, final String s2, final yfe yfe) throws IOException {
        if (flr.g((CharSequence)s)) {
            yfe.u0(s2, s);
        }
    }
    
    public final Object parse(final qhe qhe) throws IOException {
        return qhe.P();
    }
    
    public final /* bridge */ void serialize(final Object o, final String s, final boolean b, final yfe yfe) throws IOException {
        this.a((String)o, s, yfe);
    }
}
