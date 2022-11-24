// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.compose;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0013\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006%" }, d2 = { "Lcom/twitter/notifications/settings/compose/NotificationSettingsNewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "component3", "showFilters", "showPreferences", "syncSettings", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getShowFilters", "()Z", "getShowPreferences", "getSyncSettings", "<init>", "(ZZZ)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(IZZZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.notifications.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class NotificationSettingsNewArgs implements ContentViewArgs
{
    public static final int $stable = 0;
    public static final Companion Companion;
    private final boolean showFilters;
    private final boolean showPreferences;
    private final boolean syncSettings;
    
    static {
        Companion = new Companion();
    }
    
    public NotificationSettingsNewArgs(final int n, final boolean showFilters, final boolean showPreferences, final boolean syncSettings, final dmp dmp) {
        if (0x7 == (n & 0x7)) {
            this.showFilters = showFilters;
            this.showPreferences = showPreferences;
            this.syncSettings = syncSettings;
            return;
        }
        shw.V0(n, 7, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NotificationSettingsNewArgs(final boolean showFilters, final boolean showPreferences, final boolean syncSettings) {
        this.showFilters = showFilters;
        this.showPreferences = showPreferences;
        this.syncSettings = syncSettings;
    }
    
    public static NotificationSettingsNewArgs copy$default(final NotificationSettingsNewArgs notificationSettingsNewArgs, boolean showFilters, boolean showPreferences, boolean syncSettings, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            showFilters = notificationSettingsNewArgs.showFilters;
        }
        if ((n & 0x2) != 0x0) {
            showPreferences = notificationSettingsNewArgs.showPreferences;
        }
        if ((n & 0x4) != 0x0) {
            syncSettings = notificationSettingsNewArgs.syncSettings;
        }
        return notificationSettingsNewArgs.copy(showFilters, showPreferences, syncSettings);
    }
    
    public static final void write$Self(final NotificationSettingsNewArgs notificationSettingsNewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)notificationSettingsNewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.R(serialDescriptor, 0, notificationSettingsNewArgs.showFilters);
        ee6.R(serialDescriptor, 1, notificationSettingsNewArgs.showPreferences);
        ee6.R(serialDescriptor, 2, notificationSettingsNewArgs.syncSettings);
    }
    
    public final boolean component1() {
        return this.showFilters;
    }
    
    public final boolean component2() {
        return this.showPreferences;
    }
    
    public final boolean component3() {
        return this.syncSettings;
    }
    
    public final NotificationSettingsNewArgs copy(final boolean b, final boolean b2, final boolean b3) {
        return new NotificationSettingsNewArgs(b, b2, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationSettingsNewArgs)) {
            return false;
        }
        final NotificationSettingsNewArgs notificationSettingsNewArgs = (NotificationSettingsNewArgs)o;
        return this.showFilters == notificationSettingsNewArgs.showFilters && this.showPreferences == notificationSettingsNewArgs.showPreferences && this.syncSettings == notificationSettingsNewArgs.syncSettings;
    }
    
    public final boolean getShowFilters() {
        return this.showFilters;
    }
    
    public final boolean getShowPreferences() {
        return this.showPreferences;
    }
    
    public final boolean getSyncSettings() {
        return this.syncSettings;
    }
    
    @Override
    public int hashCode() {
        final int showFilters = this.showFilters ? 1 : 0;
        int n = 1;
        int n2 = showFilters;
        if (showFilters != 0) {
            n2 = 1;
        }
        int showPreferences;
        if ((showPreferences = (this.showPreferences ? 1 : 0)) != 0) {
            showPreferences = 1;
        }
        final int syncSettings = this.syncSettings ? 1 : 0;
        if (syncSettings == 0) {
            n = syncSettings;
        }
        return (n2 * 31 + showPreferences) * 31 + n;
    }
    
    @Override
    public String toString() {
        return xj0.B(a88.p("NotificationSettingsNewArgs(showFilters=", this.showFilters, ", showPreferences=", this.showPreferences, ", syncSettings="), this.syncSettings, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/notifications/settings/compose/NotificationSettingsNewArgs.$serializer", "Lezb;", "Lcom/twitter/notifications/settings/compose/NotificationSettingsNewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.notifications.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<NotificationSettingsNewArgs>
    {
        public static final int $stable;
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.notifications.settings.compose.NotificationSettingsNewArgs", (ezb)(INSTANCE = new $serializer()), 3);
            descriptor2.k("showFilters", false);
            descriptor2.k("showPreferences", false);
            descriptor2.k("syncSettings", false);
            descriptor = (SerialDescriptor)descriptor2;
            $stable = 8;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final p72 a = p72.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, (KSerializer)a, (KSerializer)a };
        }
        
        public NotificationSettingsNewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            int n = 0;
            boolean b = false;
            boolean b2 = false;
            boolean b3 = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                throw new UnknownFieldException(o);
                            }
                            b3 = c.B(descriptor, 2);
                            n |= 0x4;
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
            return new NotificationSettingsNewArgs(n, b, b2, b3, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final NotificationSettingsNewArgs notificationSettingsNewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)notificationSettingsNewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            NotificationSettingsNewArgs.write$Self(notificationSettingsNewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (NotificationSettingsNewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/settings/compose/NotificationSettingsNewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/notifications/settings/compose/NotificationSettingsNewArgs;", "serializer", "subsystem.tfa.notifications.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<NotificationSettingsNewArgs> serializer() {
            return (KSerializer<NotificationSettingsNewArgs>)$serializer.INSTANCE;
        }
    }
}
