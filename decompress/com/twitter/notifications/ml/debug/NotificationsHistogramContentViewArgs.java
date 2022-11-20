// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.ml.debug;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\r\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/notifications/ml/debug/NotificationsHistogramContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "thing", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getThing", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.notifications.ml.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NotificationsHistogramContentViewArgs implements ContentViewArgs
{
    public static final NotificationsHistogramContentViewArgs.NotificationsHistogramContentViewArgs$Companion Companion;
    private final String thing;
    
    static {
        Companion = new NotificationsHistogramContentViewArgs.NotificationsHistogramContentViewArgs$Companion();
    }
    
    public NotificationsHistogramContentViewArgs() {
        this(null, 1, null);
    }
    
    public NotificationsHistogramContentViewArgs(final int n, final String thing, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.thing = "";
            }
            else {
                this.thing = thing;
            }
            return;
        }
        blz.a0(n, 0, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NotificationsHistogramContentViewArgs(final String thing) {
        czd.f((Object)thing, "thing");
        this.thing = thing;
    }
    
    public NotificationsHistogramContentViewArgs(String s, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        this(s);
    }
    
    public static NotificationsHistogramContentViewArgs copy$default(final NotificationsHistogramContentViewArgs notificationsHistogramContentViewArgs, String thing, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            thing = notificationsHistogramContentViewArgs.thing;
        }
        return notificationsHistogramContentViewArgs.copy(thing);
    }
    
    public static final void write$Self(final NotificationsHistogramContentViewArgs notificationsHistogramContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)notificationsHistogramContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        boolean b = false;
        Label_0050: {
            if (!xc6.z(serialDescriptor)) {
                if (czd.a((Object)notificationsHistogramContentViewArgs.thing, (Object)"")) {
                    b = false;
                    break Label_0050;
                }
            }
            b = true;
        }
        if (b) {
            xc6.S(serialDescriptor, 0, notificationsHistogramContentViewArgs.thing);
        }
    }
    
    public final String component1() {
        return this.thing;
    }
    
    public final NotificationsHistogramContentViewArgs copy(final String s) {
        czd.f((Object)s, "thing");
        return new NotificationsHistogramContentViewArgs(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof NotificationsHistogramContentViewArgs && czd.a((Object)this.thing, (Object)((NotificationsHistogramContentViewArgs)o).thing));
    }
    
    public final String getThing() {
        return this.thing;
    }
    
    @Override
    public int hashCode() {
        return this.thing.hashCode();
    }
    
    @Override
    public String toString() {
        return da8.j("NotificationsHistogramContentViewArgs(thing=", this.thing, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/notifications/ml/debug/NotificationsHistogramContentViewArgs.$serializer", "Leyb;", "Lcom/twitter/notifications/ml/debug/NotificationsHistogramContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lfzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.notifications.ml.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements eyb<NotificationsHistogramContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final tok descriptor2 = new tok("com.twitter.notifications.ml.debug.NotificationsHistogramContentViewArgs", (eyb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("thing", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)gkr.a };
        }
        
        public NotificationsHistogramContentViewArgs deserialize(final Decoder decoder) {
            czd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final vc6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            String m = null;
            int n = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    m = c.m(descriptor, 0);
                    n |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new NotificationsHistogramContentViewArgs(n, m, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final NotificationsHistogramContentViewArgs notificationsHistogramContentViewArgs) {
            czd.f((Object)encoder, "encoder");
            czd.f((Object)notificationsHistogramContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final xc6 c = encoder.c(descriptor);
            NotificationsHistogramContentViewArgs.write$Self(notificationsHistogramContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (NotificationsHistogramContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])wiy.K0;
        }
    }
}
