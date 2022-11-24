// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.video;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import com.twitter.model.liveevent.LiveEventConfiguration$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.model.liveevent.LiveEventConfiguration;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BE\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b6\u00107B_\b\u0017\u0012\u0006\u00108\u001a\u00020\u001e\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b6\u0010;J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\rH\u00c6\u0003JU\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 H\u00d6\u0003R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b,\u0010%R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001b\u0010%R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0016\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104¨\u0006>" }, d2 = { "Lcom/twitter/android/av/video/BroadcastFullscreenContentViewArgs;", "Lcom/twitter/android/av/video/TwitterMediaPlayerArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lh1;", "component1", "Lsfv;", "component2", "", "component3", "", "component4", "Lcom/twitter/model/liveevent/LiveEventConfiguration;", "component5", "component6", "component7", "dataSource", "scribeAssociation", "fromDock", "watchComponent", "configuration", "fromEventsTimeline", "isInvited", "copy", "toString", "", "hashCode", "", "other", "equals", "Z", "getFromDock", "()Z", "Ljava/lang/String;", "getWatchComponent", "()Ljava/lang/String;", "Lcom/twitter/model/liveevent/LiveEventConfiguration;", "getConfiguration", "()Lcom/twitter/model/liveevent/LiveEventConfiguration;", "getFromEventsTimeline", "Lh1;", "getDataSource", "()Lh1;", "getDataSource$annotations", "()V", "Lsfv;", "getScribeAssociation", "()Lsfv;", "getScribeAssociation$annotations", "<init>", "(Lh1;Lsfv;ZLjava/lang/String;Lcom/twitter/model/liveevent/LiveEventConfiguration;ZZ)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILh1;Lsfv;ZLjava/lang/String;Lcom/twitter/model/liveevent/LiveEventConfiguration;ZZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class BroadcastFullscreenContentViewArgs extends TwitterMediaPlayerArgs
{
    public static final BroadcastFullscreenContentViewArgs.BroadcastFullscreenContentViewArgs$Companion Companion;
    private final LiveEventConfiguration configuration;
    private final h1 dataSource;
    private final boolean fromDock;
    private final boolean fromEventsTimeline;
    private final boolean isInvited;
    private final sfv scribeAssociation;
    private final String watchComponent;
    
    static {
        Companion = new BroadcastFullscreenContentViewArgs.BroadcastFullscreenContentViewArgs$Companion();
    }
    
    public BroadcastFullscreenContentViewArgs(final int n, @bmp(with = x1v.class) final h1 dataSource, @bmp(with = tfv.class) final sfv scribeAssociation, final boolean fromDock, final String watchComponent, final LiveEventConfiguration configuration, final boolean fromEventsTimeline, final boolean isInvited, final dmp dmp) {
        if (0x7F == (n & 0x7F)) {
            super(n, (dmp)null);
            this.dataSource = dataSource;
            this.scribeAssociation = scribeAssociation;
            this.fromDock = fromDock;
            this.watchComponent = watchComponent;
            this.configuration = configuration;
            this.fromEventsTimeline = fromEventsTimeline;
            this.isInvited = isInvited;
            return;
        }
        shw.V0(n, 127, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BroadcastFullscreenContentViewArgs(final h1 dataSource, final sfv scribeAssociation, final boolean fromDock, final String watchComponent, final LiveEventConfiguration configuration, final boolean fromEventsTimeline, final boolean isInvited) {
        e0e.f((Object)watchComponent, "watchComponent");
        super((wg8)null);
        this.dataSource = dataSource;
        this.scribeAssociation = scribeAssociation;
        this.fromDock = fromDock;
        this.watchComponent = watchComponent;
        this.configuration = configuration;
        this.fromEventsTimeline = fromEventsTimeline;
        this.isInvited = isInvited;
    }
    
    public static BroadcastFullscreenContentViewArgs copy$default(final BroadcastFullscreenContentViewArgs broadcastFullscreenContentViewArgs, h1 dataSource, sfv scribeAssociation, boolean fromDock, String watchComponent, LiveEventConfiguration configuration, boolean fromEventsTimeline, boolean isInvited, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            dataSource = broadcastFullscreenContentViewArgs.getDataSource();
        }
        if ((n & 0x2) != 0x0) {
            scribeAssociation = broadcastFullscreenContentViewArgs.getScribeAssociation();
        }
        if ((n & 0x4) != 0x0) {
            fromDock = broadcastFullscreenContentViewArgs.getFromDock();
        }
        if ((n & 0x8) != 0x0) {
            watchComponent = broadcastFullscreenContentViewArgs.watchComponent;
        }
        if ((n & 0x10) != 0x0) {
            configuration = broadcastFullscreenContentViewArgs.configuration;
        }
        if ((n & 0x20) != 0x0) {
            fromEventsTimeline = broadcastFullscreenContentViewArgs.fromEventsTimeline;
        }
        if ((n & 0x40) != 0x0) {
            isInvited = broadcastFullscreenContentViewArgs.isInvited;
        }
        return broadcastFullscreenContentViewArgs.copy(dataSource, scribeAssociation, fromDock, watchComponent, configuration, fromEventsTimeline, isInvited);
    }
    
    @bmp(with = x1v.class)
    public static void getDataSource$annotations() {
    }
    
    @bmp(with = tfv.class)
    public static void getScribeAssociation$annotations() {
    }
    
    public static final void write$Self(final BroadcastFullscreenContentViewArgs broadcastFullscreenContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)broadcastFullscreenContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        TwitterMediaPlayerArgs.write$Self((TwitterMediaPlayerArgs)broadcastFullscreenContentViewArgs, ee6, serialDescriptor);
        ee6.y(serialDescriptor, 0, (fmp)x1v.b, (Object)broadcastFullscreenContentViewArgs.getDataSource());
        ee6.y(serialDescriptor, 1, (fmp)tfv.b, (Object)broadcastFullscreenContentViewArgs.getScribeAssociation());
        ee6.R(serialDescriptor, 2, broadcastFullscreenContentViewArgs.getFromDock());
        ee6.S(serialDescriptor, 3, broadcastFullscreenContentViewArgs.watchComponent);
        ee6.y(serialDescriptor, 4, (fmp)LiveEventConfiguration$$serializer.INSTANCE, (Object)broadcastFullscreenContentViewArgs.configuration);
        ee6.R(serialDescriptor, 5, broadcastFullscreenContentViewArgs.fromEventsTimeline);
        ee6.R(serialDescriptor, 6, broadcastFullscreenContentViewArgs.isInvited);
    }
    
    public final h1 component1() {
        return this.getDataSource();
    }
    
    public final sfv component2() {
        return this.getScribeAssociation();
    }
    
    public final boolean component3() {
        return this.getFromDock();
    }
    
    public final String component4() {
        return this.watchComponent;
    }
    
    public final LiveEventConfiguration component5() {
        return this.configuration;
    }
    
    public final boolean component6() {
        return this.fromEventsTimeline;
    }
    
    public final boolean component7() {
        return this.isInvited;
    }
    
    public final BroadcastFullscreenContentViewArgs copy(final h1 h1, final sfv sfv, final boolean b, final String s, final LiveEventConfiguration liveEventConfiguration, final boolean b2, final boolean b3) {
        e0e.f((Object)s, "watchComponent");
        return new BroadcastFullscreenContentViewArgs(h1, sfv, b, s, liveEventConfiguration, b2, b3);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BroadcastFullscreenContentViewArgs)) {
            return false;
        }
        final BroadcastFullscreenContentViewArgs broadcastFullscreenContentViewArgs = (BroadcastFullscreenContentViewArgs)o;
        return e0e.a((Object)this.getDataSource(), (Object)broadcastFullscreenContentViewArgs.getDataSource()) && e0e.a((Object)this.getScribeAssociation(), (Object)broadcastFullscreenContentViewArgs.getScribeAssociation()) && this.getFromDock() == broadcastFullscreenContentViewArgs.getFromDock() && e0e.a((Object)this.watchComponent, (Object)broadcastFullscreenContentViewArgs.watchComponent) && e0e.a((Object)this.configuration, (Object)broadcastFullscreenContentViewArgs.configuration) && this.fromEventsTimeline == broadcastFullscreenContentViewArgs.fromEventsTimeline && this.isInvited == broadcastFullscreenContentViewArgs.isInvited;
    }
    
    public final LiveEventConfiguration getConfiguration() {
        return this.configuration;
    }
    
    public h1 getDataSource() {
        return this.dataSource;
    }
    
    public boolean getFromDock() {
        return this.fromDock;
    }
    
    public final boolean getFromEventsTimeline() {
        return this.fromEventsTimeline;
    }
    
    public sfv getScribeAssociation() {
        return this.scribeAssociation;
    }
    
    public final String getWatchComponent() {
        return this.watchComponent;
    }
    
    public int hashCode() {
        final h1 dataSource = this.getDataSource();
        final int n = 0;
        int hashCode;
        if (dataSource == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.getDataSource().hashCode();
        }
        int hashCode2;
        if (this.getScribeAssociation() == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = this.getScribeAssociation().hashCode();
        }
        final int fromDock = this.getFromDock() ? 1 : 0;
        final int n2 = 1;
        int n3 = fromDock;
        if (fromDock != 0) {
            n3 = 1;
        }
        final int d = brg.d(this.watchComponent, ((hashCode * 31 + hashCode2) * 31 + n3) * 31, 31);
        final LiveEventConfiguration configuration = this.configuration;
        int hashCode3;
        if (configuration == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = configuration.hashCode();
        }
        int fromEventsTimeline;
        if ((fromEventsTimeline = (this.fromEventsTimeline ? 1 : 0)) != 0) {
            fromEventsTimeline = 1;
        }
        int isInvited = this.isInvited ? 1 : 0;
        if (isInvited != 0) {
            isInvited = n2;
        }
        return ((d + hashCode3) * 31 + fromEventsTimeline) * 31 + isInvited;
    }
    
    public final boolean isInvited() {
        return this.isInvited;
    }
    
    public String toString() {
        final h1 dataSource = this.getDataSource();
        final sfv scribeAssociation = this.getScribeAssociation();
        final boolean fromDock = this.getFromDock();
        final String watchComponent = this.watchComponent;
        final LiveEventConfiguration configuration = this.configuration;
        final boolean fromEventsTimeline = this.fromEventsTimeline;
        final boolean isInvited = this.isInvited;
        final StringBuilder sb = new StringBuilder();
        sb.append("BroadcastFullscreenContentViewArgs(dataSource=");
        sb.append(dataSource);
        sb.append(", scribeAssociation=");
        sb.append(scribeAssociation);
        sb.append(", fromDock=");
        rh.y(sb, fromDock, ", watchComponent=", watchComponent, ", configuration=");
        sb.append(configuration);
        sb.append(", fromEventsTimeline=");
        sb.append(fromEventsTimeline);
        sb.append(", isInvited=");
        return xj0.B(sb, isInvited, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/android/av/video/BroadcastFullscreenContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/android/av/video/BroadcastFullscreenContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.media.av.player.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BroadcastFullscreenContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.android.av.video.BroadcastFullscreenContentViewArgs", (ezb)(INSTANCE = new $serializer()), 7);
            descriptor2.k("dataSource", false);
            descriptor2.k("scribeAssociation", false);
            descriptor2.k("fromDock", false);
            descriptor2.k("watchComponent", false);
            descriptor2.k("configuration", false);
            descriptor2.k("fromEventsTimeline", false);
            descriptor2.k("isInvited", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final KSerializer e = BuiltinSerializersKt.e((KSerializer)x1v.b);
            final KSerializer e2 = BuiltinSerializersKt.e((KSerializer)tfv.b);
            final p72 a = p72.a;
            return (KSerializer<?>[])new KSerializer[] { e, e2, (KSerializer)a, (KSerializer)dlr.a, BuiltinSerializersKt.e((KSerializer)LiveEventConfiguration$$serializer.INSTANCE), (KSerializer)a, (KSerializer)a };
        }
        
        public BroadcastFullscreenContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n2 = null;
            String m;
            Object n3 = m = null;
            int i = 1;
            int n4 = 0;
            boolean b = false;
            boolean b2 = false;
            boolean b3 = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                switch (o) {
                    default: {
                        throw new UnknownFieldException(o);
                    }
                    case 6: {
                        b3 = c.B(descriptor, 6);
                        n4 |= 0x40;
                        continue;
                    }
                    case 5: {
                        b2 = c.B(descriptor, 5);
                        n4 |= 0x20;
                        continue;
                    }
                    case 4: {
                        n = c.n(descriptor, 4, (DeserializationStrategy)LiveEventConfiguration$$serializer.INSTANCE, n);
                        n4 |= 0x10;
                        continue;
                    }
                    case 3: {
                        m = c.m(descriptor, 3);
                        n4 |= 0x8;
                        continue;
                    }
                    case 2: {
                        b = c.B(descriptor, 2);
                        n4 |= 0x4;
                        continue;
                    }
                    case 1: {
                        n2 = c.n(descriptor, 1, (DeserializationStrategy)tfv.b, n2);
                        n4 |= 0x2;
                        continue;
                    }
                    case 0: {
                        n3 = c.n(descriptor, 0, (DeserializationStrategy)x1v.b, n3);
                        n4 |= 0x1;
                        continue;
                    }
                    case -1: {
                        i = 0;
                        continue;
                    }
                }
            }
            c.d(descriptor);
            return new BroadcastFullscreenContentViewArgs(n4, (h1)n3, (sfv)n2, b, m, (LiveEventConfiguration)n, b2, b3, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BroadcastFullscreenContentViewArgs broadcastFullscreenContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)broadcastFullscreenContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BroadcastFullscreenContentViewArgs.write$Self(broadcastFullscreenContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BroadcastFullscreenContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
