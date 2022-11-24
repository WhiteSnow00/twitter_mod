import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import j$.util.DesugarTimeZone;
import kotlinx.serialization.encoding.Decoder;
import java.util.TimeZone;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vrs implements KSerializer<TimeZone>
{
    public static final vrs a;
    
    static {
        a = new vrs();
    }
    
    public final Object deserialize(final Decoder decoder) {
        e0e.f((Object)decoder, "decoder");
        final TimeZone timeZone = DesugarTimeZone.getTimeZone(decoder.y());
        e0e.e((Object)timeZone, "getTimeZone(decoder.decodeString())");
        return timeZone;
    }
    
    public final SerialDescriptor getDescriptor() {
        return tqb.i("TimeZone");
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final TimeZone timeZone = (TimeZone)o;
        e0e.f((Object)encoder, "encoder");
        e0e.f((Object)timeZone, "value");
        final String id = timeZone.getID();
        e0e.e((Object)id, "value.id");
        encoder.l0(id);
    }
}
