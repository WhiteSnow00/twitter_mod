import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r0v implements KSerializer<i1>
{
    public static final r0v b;
    
    static {
        b = new r0v();
    }
    
    public r0v() {
        this.a = new zse();
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final i1 i1 = (i1)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)i1, "value");
        this.a.serialize(encoder, (Object)i1);
    }
}
