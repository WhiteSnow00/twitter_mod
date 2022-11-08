import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvg implements KSerializer<kvg>
{
    public static final lvg b;
    
    static {
        b = new lvg();
    }
    
    public lvg() {
        this.a = (ate$a)ate.b((alp)new kvg$a());
    }
    
    public final Object deserialize(final Decoder decoder) {
        zzd.f((Object)decoder, "decoder");
        return this.a.deserialize(decoder);
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.a.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final kvg kvg = (kvg)o;
        zzd.f((Object)encoder, "encoder");
        zzd.f((Object)kvg, "value");
        this.a.serialize(encoder, (Object)kvg);
    }
}
