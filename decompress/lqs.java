import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import j$.util.DesugarTimeZone;
import kotlinx.serialization.encoding.Decoder;
import java.util.TimeZone;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqs implements KSerializer<TimeZone>
{
    public static final lqs a;
    
    static {
        a = new lqs();
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        final TimeZone timeZone = DesugarTimeZone.getTimeZone(decoder.y());
        zzd.e((Object)timeZone, "getTimeZone(decoder.decodeString())");
        return timeZone;
    }
    
    public final SerialDescriptor getDescriptor() {
        return ukg.n("TimeZone");
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final TimeZone timeZone = (TimeZone)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)timeZone, "value");
        final String id = timeZone.getID();
        zzd.e((Object)id, "value.id");
        encoder.l0(id);
    }
}
