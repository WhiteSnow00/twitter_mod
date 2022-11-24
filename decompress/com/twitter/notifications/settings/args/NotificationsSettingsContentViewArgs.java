// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.args;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017" }, d2 = { "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "<init>", "()V", "", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILdmp;)V", "Companion", "EmailNotificationsSettingsContentViewArgs", "PushNotificationsSettingsContentViewArgs", "SMSNotificationsSettingsContentViewArgs", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$EmailNotificationsSettingsContentViewArgs;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$SMSNotificationsSettingsContentViewArgs;", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class NotificationsSettingsContentViewArgs implements ContentViewArgs
{
    private static final nxe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = jty.M(2, (ptb)NotificationsSettingsContentViewArgs$a.F0);
    }
    
    private NotificationsSettingsContentViewArgs() {
    }
    
    public NotificationsSettingsContentViewArgs(final int n, final dmp dmp) {
    }
    
    public NotificationsSettingsContentViewArgs(final wg8 wg8) {
        this();
    }
    
    public static final nxe access$get$cachedSerializer$delegate$cp() {
        return NotificationsSettingsContentViewArgs.$cachedSerializer$delegate;
    }
    
    public static final void write$Self(final NotificationsSettingsContentViewArgs notificationsSettingsContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)notificationsSettingsContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs;", "serializer", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<NotificationsSettingsContentViewArgs> serializer() {
            return (KSerializer<NotificationsSettingsContentViewArgs>)NotificationsSettingsContentViewArgs.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
    
    @bmp
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$EmailNotificationsSettingsContentViewArgs;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class EmailNotificationsSettingsContentViewArgs extends NotificationsSettingsContentViewArgs
    {
        private static final nxe<KSerializer<Object>> $cachedSerializer$delegate;
        public static final EmailNotificationsSettingsContentViewArgs INSTANCE;
        
        static {
            INSTANCE = new EmailNotificationsSettingsContentViewArgs();
            $cachedSerializer$delegate = jty.M(2, (ptb)NotificationsSettingsContentViewArgs$EmailNotificationsSettingsContentViewArgs$a.F0);
        }
        
        private EmailNotificationsSettingsContentViewArgs() {
            super(null);
        }
        
        private final nxe get$cachedSerializer$delegate() {
            return EmailNotificationsSettingsContentViewArgs.$cachedSerializer$delegate;
        }
        
        public final KSerializer<EmailNotificationsSettingsContentViewArgs> serializer() {
            return (KSerializer<EmailNotificationsSettingsContentViewArgs>)this.get$cachedSerializer$delegate().getValue();
        }
    }
    
    @bmp
    @Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB)\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016B;\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u001e" }, d2 = { "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "masterSwitchEnabled", "Z", "getMasterSwitchEnabled", "()Z", "recommendationsEnabled", "getRecommendationsEnabled", "topicsEnabled", "getTopicsEnabled", "automaticSaveEnabled", "getAutomaticSaveEnabled", "<init>", "(ZZZZ)V", "()V", "", "seen1", "Ldmp;", "serializationConstructorMarker", "(IZZZZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class PushNotificationsSettingsContentViewArgs extends NotificationsSettingsContentViewArgs
    {
        public static final Companion Companion;
        private final boolean automaticSaveEnabled;
        private final boolean masterSwitchEnabled;
        private final boolean recommendationsEnabled;
        private final boolean topicsEnabled;
        
        static {
            Companion = new Companion();
        }
        
        public PushNotificationsSettingsContentViewArgs() {
            this(false, false, false, false);
        }
        
        public PushNotificationsSettingsContentViewArgs(final int n, final boolean masterSwitchEnabled, final boolean recommendationsEnabled, final boolean topicsEnabled, final boolean automaticSaveEnabled, final dmp dmp) {
            if (0xF == (n & 0xF)) {
                super(n, null);
                this.masterSwitchEnabled = masterSwitchEnabled;
                this.recommendationsEnabled = recommendationsEnabled;
                this.topicsEnabled = topicsEnabled;
                this.automaticSaveEnabled = automaticSaveEnabled;
                return;
            }
            shw.V0(n, 15, $serializer.INSTANCE.getDescriptor());
            throw null;
        }
        
        private PushNotificationsSettingsContentViewArgs(final boolean masterSwitchEnabled, final boolean recommendationsEnabled, final boolean topicsEnabled, final boolean automaticSaveEnabled) {
            super(null);
            this.masterSwitchEnabled = masterSwitchEnabled;
            this.recommendationsEnabled = recommendationsEnabled;
            this.topicsEnabled = topicsEnabled;
            this.automaticSaveEnabled = automaticSaveEnabled;
        }
        
        public PushNotificationsSettingsContentViewArgs(final boolean b, final boolean b2, final boolean b3, final boolean b4, final wg8 wg8) {
            this(b, b2, b3, b4);
        }
        
        public static final void write$Self(final PushNotificationsSettingsContentViewArgs pushNotificationsSettingsContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
            e0e.f((Object)pushNotificationsSettingsContentViewArgs, "self");
            e0e.f((Object)ee6, "output");
            e0e.f((Object)serialDescriptor, "serialDesc");
            NotificationsSettingsContentViewArgs.write$Self(pushNotificationsSettingsContentViewArgs, ee6, serialDescriptor);
            ee6.R(serialDescriptor, 0, pushNotificationsSettingsContentViewArgs.masterSwitchEnabled);
            ee6.R(serialDescriptor, 1, pushNotificationsSettingsContentViewArgs.recommendationsEnabled);
            ee6.R(serialDescriptor, 2, pushNotificationsSettingsContentViewArgs.topicsEnabled);
            ee6.R(serialDescriptor, 3, pushNotificationsSettingsContentViewArgs.automaticSaveEnabled);
        }
        
        public final boolean getAutomaticSaveEnabled() {
            return this.automaticSaveEnabled;
        }
        
        public final boolean getMasterSwitchEnabled() {
            return this.masterSwitchEnabled;
        }
        
        public final boolean getRecommendationsEnabled() {
            return this.recommendationsEnabled;
        }
        
        public final boolean getTopicsEnabled() {
            return this.topicsEnabled;
        }
        
        @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs.PushNotificationsSettingsContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class $serializer implements ezb<PushNotificationsSettingsContentViewArgs>
        {
            public static final $serializer INSTANCE;
            public static final SerialDescriptor descriptor;
            
            static {
                final fpk descriptor2 = new fpk("com.twitter.notifications.settings.args.NotificationsSettingsContentViewArgs.PushNotificationsSettingsContentViewArgs", (ezb)(INSTANCE = new $serializer()), 4);
                descriptor2.k("masterSwitchEnabled", false);
                descriptor2.k("recommendationsEnabled", false);
                descriptor2.k("topicsEnabled", false);
                descriptor2.k("automaticSaveEnabled", false);
                descriptor = (SerialDescriptor)descriptor2;
            }
            
            private $serializer() {
            }
            
            public KSerializer<?>[] childSerializers() {
                final p72 a = p72.a;
                return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, (KSerializer)a, (KSerializer)a, (KSerializer)a };
            }
            
            public PushNotificationsSettingsContentViewArgs deserialize(final Decoder decoder) {
                e0e.f((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                final ce6 c = decoder.c(descriptor);
                c.p();
                int i = 1;
                int n = 0;
                boolean b = false;
                boolean b2 = false;
                boolean b3 = false;
                boolean b4 = false;
                while (i != 0) {
                    final int o = c.o(descriptor);
                    if (o != -1) {
                        if (o != 0) {
                            if (o != 1) {
                                if (o != 2) {
                                    if (o != 3) {
                                        throw new UnknownFieldException(o);
                                    }
                                    b4 = c.B(descriptor, 3);
                                    n |= 0x8;
                                }
                                else {
                                    b3 = c.B(descriptor, 2);
                                    n |= 0x4;
                                }
                            }
                            else {
                                b2 = c.B(descriptor, 1);
                                n |= 0x2;
                            }
                        }
                        else {
                            b = c.B(descriptor, 0);
                            n |= 0x1;
                        }
                    }
                    else {
                        i = 0;
                    }
                }
                c.d(descriptor);
                return new PushNotificationsSettingsContentViewArgs(n, b, b2, b3, b4, null);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public SerialDescriptor getDescriptor() {
                return $serializer.descriptor;
            }
            
            public void serialize(final Encoder encoder, final PushNotificationsSettingsContentViewArgs pushNotificationsSettingsContentViewArgs) {
                e0e.f((Object)encoder, "encoder");
                e0e.f((Object)pushNotificationsSettingsContentViewArgs, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final ee6 c = encoder.c(descriptor);
                PushNotificationsSettingsContentViewArgs.write$Self(pushNotificationsSettingsContentViewArgs, c, descriptor);
                c.d(descriptor);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object o) {
                this.serialize(encoder, (PushNotificationsSettingsContentViewArgs)o);
            }
            
            public KSerializer<?>[] typeParametersSerializers() {
                return (KSerializer<?>[])d4j.K0;
            }
        }
        
        @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs;", "serializer", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class Companion
        {
            public final KSerializer<PushNotificationsSettingsContentViewArgs> serializer() {
                return (KSerializer<PushNotificationsSettingsContentViewArgs>)$serializer.INSTANCE;
            }
        }
    }
    
    @bmp
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs$SMSNotificationsSettingsContentViewArgs;", "Lcom/twitter/notifications/settings/args/NotificationsSettingsContentViewArgs;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "subsystem.tfa.notifications.settings.api_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SMSNotificationsSettingsContentViewArgs extends NotificationsSettingsContentViewArgs
    {
        private static final nxe<KSerializer<Object>> $cachedSerializer$delegate;
        public static final SMSNotificationsSettingsContentViewArgs INSTANCE;
        
        static {
            INSTANCE = new SMSNotificationsSettingsContentViewArgs();
            $cachedSerializer$delegate = jty.M(2, (ptb)NotificationsSettingsContentViewArgs$SMSNotificationsSettingsContentViewArgs$a.F0);
        }
        
        private SMSNotificationsSettingsContentViewArgs() {
            super(null);
        }
        
        private final nxe get$cachedSerializer$delegate() {
            return SMSNotificationsSettingsContentViewArgs.$cachedSerializer$delegate;
        }
        
        public final KSerializer<SMSNotificationsSettingsContentViewArgs> serializer() {
            return (KSerializer<SMSNotificationsSettingsContentViewArgs>)this.get$cachedSerializer$delegate().getValue();
        }
    }
}
